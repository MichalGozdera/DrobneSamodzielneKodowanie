import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainRobotMaster {

    public static boolean flag = false;
    public static Map<String, List<String>> map = new HashMap<String, List<String>>();

    public static void main(String[] args) {

        connectWithMark();
    }

    private static String connectWithMark() {
        String ip = "192.168.1.5";
        int port = 5000;
        try {
            java.net.Socket socket = new java.net.Socket(ip, port);
            OutputStreamWriter out = new OutputStreamWriter(
                    socket.getOutputStream());
            InputStreamReader in = new InputStreamReader(
                    socket.getInputStream());
            Listener listener = new Listener();
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<String> future = executorService.submit(listener);
            String result = null;
            PrintWriter pw = new PrintWriter(out, true);
            pw.printf("0;");
            System.out.print(getString(in, "0;") + "\t");
            while (true) {

//                Scanner reader = new Scanner(System.in);
//                String msg = reader.nextLine();
//                msg = msg.concat(";");

                // send

                pw = new PrintWriter(out, true);

                String command = null;
                //String command = "1;";
                // pw.printf(command);
                // receive the reply

                //  System.out.print(getString(in, command) + "\t");
                // command = "2;";
                //   pw.printf(command);
                //    System.out.print(getString(in, command) + "\t");
                // command = "3;";
                //  pw.printf(command);
                //     System.out.print(getString(in, command) + "\t");
                if (flag == true) {
                    flag = false;
                    result = future.get();
                    if (result == null) {
                        pw.printf("ja spierdalam");
                        System.exit(0);
                    }
                    pw.printf(result);
                    System.out.print(getString(in, result) + "\t");
                    future = executorService.submit(listener);
                }
                System.out.println();

                Thread.sleep(1000);
            }
            // socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getString(InputStreamReader in, String command) throws IOException {
        BufferedReader br = new BufferedReader(in);
        char[] buffer = new char[300];
        int count = br.read(buffer, 0, 300);
        command = command.substring(0, command.length() - 1);
        String reply = new String(buffer, 0, count);
        if (reply.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        if (reply.endsWith(";")) {
            reply = reply.substring(0, reply.length() - 1);
            parseInitialMessage(reply, command);
            return reply;
        }
        return null;
    }

    public static void parseInitialMessage(String msg, String command) {
        if (command.equals("0")) {
            String[] allKeys=msg.split("@");
            for(String string:allKeys){
                String[] initialConfigMap = string.split("#");
                List<String> nestedList=new ArrayList<>();
                nestedList.add(initialConfigMap[1]);
                nestedList.add("");
                map.put(initialConfigMap[0], nestedList);
                System.out.println(map);
            }
        } else {
            List<String> nestedList = map.get(command);
            String value = null;
            nestedList.set(1,msg);
            System.out.println(map);
        }
    }

}