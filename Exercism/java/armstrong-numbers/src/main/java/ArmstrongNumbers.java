class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numer = Integer.toString(numberToCheck);
		int result=0;
        for (int i = 0; i <numer.length() ; i++) {
            int temp=Integer.parseInt(numer.substring(i,i+1));
            result+=Math.pow(temp,numer.length());
        }
        return result==numberToCheck;
    }

}
