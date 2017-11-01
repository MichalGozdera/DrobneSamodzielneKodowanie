class Triangle {
double side1;
double side2;
double side3;
    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1>(side2+side3)||side2>(side1+side3)||side3>(side1+side2)||side1<=0||side2<=0||side3<=0) {
            throw new TriangleException();
        }
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isEquilateral() {
        if (side1==side2&&side2==side3){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isIsosceles() {
        if (side1==side2||side2==side3||side1==side3){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isScalene() {
        if (side1!=side2&&side2!=side3&&side1!=side3){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
