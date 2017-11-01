class LargestSeriesProductCalculator {
    String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber == null) {
            throw new IllegalArgumentException("String to search must be non-null.");
        }
        if (inputNumber.matches(".*\\D.*")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
        //throw new UnsupportedOperationException ("Delete this statement and write your own implementation.");
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits>inputNumber.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits<0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        long max=0;
        for (int i=0;i<=inputNumber.length()-numberOfDigits;i++){
            long multi=1;
            for (int j=0;j<numberOfDigits;j++){
                multi*=Integer.parseInt(inputNumber.substring(i+j,i+j+1));
            }
            if (multi>max){
                max=multi;
            }

        }
        return max;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
