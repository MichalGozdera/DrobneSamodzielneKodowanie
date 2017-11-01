import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal>signals=new ArrayList<>();
        int[]sygnaly=new int[5];
        String s= Integer.toBinaryString(number);
        int index=4;
        for (int i=s.length()-1;i>=0;i--){
            if (index<0){
                break;
            }
            sygnaly[index]=Integer.parseInt(s.substring(i,i+1));
            index--;
        }

        if (sygnaly[4]==1){
            signals.add(Signal.WINK);
        }
        if (sygnaly[3]==1){
            signals.add(Signal.DOUBLE_BLINK);
        }
        if (sygnaly[2]==1){
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if (sygnaly[1]==1){
            signals.add(Signal.JUMP);
        }
        if (sygnaly[0]==1){
            Collections.reverse(signals);
            return signals;
        }
        else {
            return signals;
        }
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
