import java.util.ArrayList;
import java.util.List;

class LuhnValidator {

    boolean isValid(String candidate) {
        if (candidate == null || candidate.matches(".*[^0-9\\s].*")) {
            return false;
        }
        candidate = candidate.replaceAll("\\s","");
        if (candidate.length()<2){
            return false;
        }
        int suma=0;
        for (int i =candidate.length()-2;i>=0;i-=2){
            if(Integer.parseInt(candidate.substring(i,i+1))*2>9){
                suma+=(Integer.parseInt(candidate.substring(i,i+1))*2-9);
            }
            else {
                suma+=Integer.parseInt(candidate.substring(i,i+1))*2;
            }
        }
        for (int i=candidate.length()-1;i>=0;i-=2){
suma+=Integer.parseInt(candidate.substring(i,i+1));
        }
        if (suma%10==0){
            return true;
        }
        else{
            return false;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
