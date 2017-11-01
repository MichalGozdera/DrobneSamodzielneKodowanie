class RaindropConverter {

    String convert(int number) {
        StringBuilder rain=new StringBuilder();
        if (number%3==0)
            rain.append("Pling");
        if (number%5==0)
            rain.append("Plang");
        if (number%7==0)
            rain.append("Plong");
        if (rain.length()<1)
            rain.append(number);
        return rain.toString();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
