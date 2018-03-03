import java.io.*;
import java.net.*;

public class Provider {
    ServerSocket providerSocket;
    Socket connection = null;
    BufferedReader br;
    OutputStreamWriter out;
    String message;

    Provider() {
    }

    void run() {
        try {
            //1. creating a server socket
            providerSocket = new ServerSocket(5000, 10);
            //2. Wait for connection
            System.out.println("Waiting for connection");
            connection = providerSocket.accept();
            out = new OutputStreamWriter(
                    connection.getOutputStream());
            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("Connection received from " + connection.getInetAddress().getHostName());
            //3. get Input and Output streams

            sendMessage("Connection successful");
            //4. The two parts communicate via the input and output streams
            do {

                char[] buffer = new char[300];
                int count = br.read(buffer, 0, 300);
                message = new String(buffer, 0, count);
                System.out.println("client>" + message);
                sendMessage(message);
                if (message.equals("bye"))
                    sendMessage("bye");

            } while (!message.equals("bye"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //4: Closing connection
            try {
                br.close();
                out.close();
                providerSocket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    void sendMessage(String msg) {
        PrintWriter pw = new PrintWriter(out, true);
        pw.printf(msg+"serwer;");
        System.out.println("server>" + msg);

    }

    public static void main(String args[]) {
        Provider server = new Provider();
        while (true) {
            server.run();
        }
    }
}