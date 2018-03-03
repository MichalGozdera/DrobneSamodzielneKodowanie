import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainRobotMaster {

    public static boolean flag = false;

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
            //Listener listener = new Listener();
            //ExecutorService executorService = Executors.newSingleThreadExecutor();
           //// Future<String> future = executorService.submit(listener);
            System.out.println(getString(in, " ;") + "\t");
            String result = null;
            while (true) {

//                Scanner reader = new Scanner(System.in);
//                String msg = reader.nextLine();
//                msg = msg.concat(";");

                // send

                PrintWriter pw = new PrintWriter(out, true);


                String command = "1;";
                pw.printf(command);
                // receive the reply

                System.out.print(getString(in, command) + "\t");
                command = "2;";
                pw.printf(command);
                System.out.print(getString(in, command) + "\t");
                command = "3;";
                pw.printf(command);
                System.out.print(getString(in, command) + "\t");
//                if (flag == true) {
//                    flag = false;
//                    result=future.get();
//                    pw.printf(result);
//                    System.out.print(getString(in, command) + "\t");
//                    future = executorService.submit(listener);
//                }
                System.out.println();

                Thread.sleep(1000);
            }
            // socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
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
            reply = command + "\t" + reply;
            return reply;
        }
        return null;
    }

}