public class PangramChecker {

    public boolean isPangram(String input) {
       input= input.toUpperCase().replaceAll("[^A-Z]",""); //wywalam wszystko co nie jest literą i zamieniam resztę na wielkie litery
        char[] literki=new char[26]; //tablica zliczająca wystąpienia liter
        int index=0;
        for (int i=0;i<input.length();i++){ //iteracja po długości słowa
index=input.charAt(i)-65; //indeks tablicy to reprezentacja litery w standardzie ASCII pomniejszona o 65 (A to 65 wg ASCII)- chodzi by dobrze to do tablicy wstawiać
literki[index]++;
        }
        for (int i:literki){
            if (i<1){
                return false; //jak znajdzie, że jakaś litera nie wystąpiła zwraca false.
            }

        }
        return true;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
