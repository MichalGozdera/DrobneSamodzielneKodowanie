public class TabliczkaMnozenia {
    public static void main (String args[])
    {
        int[][] tabliczka = new int[81][81];

        int suma=0;

                for (int i=1; i <tabliczka.length; i++)
        {
            for (int j = 1;j<tabliczka[i].length;j++)
            {
                tabliczka[i][j] = i*j;
                System.out.print(tabliczka[i][j] +"\t");
                if (i%j==0)
                {
                     suma++;
                    continue;
                }

            }
            if (suma ==2)
            {
            System.out.print(i + " jest liczbą pierwszą");
            }
            System.out.println();
            suma=0;
        }


}
}
