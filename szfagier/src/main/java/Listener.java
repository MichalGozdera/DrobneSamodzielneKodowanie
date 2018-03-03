import javax.swing.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Listener implements Callable<String> {

//    @Override
//    public void run() {
//       long sec = System.currentTimeMillis();
//        String serverAddress = JOptionPane.showInputDialog(
//                "dawaj cośtam");
//
//        MainRobotMaster.flag=true;
//
//    }

    @Override
    public String call() throws Exception {
        long sec = System.currentTimeMillis();
        String serverAddress = JOptionPane.showInputDialog(
                "dawaj cośtam");
        MainRobotMaster.flag = true;
        return serverAddress;
    }
}
