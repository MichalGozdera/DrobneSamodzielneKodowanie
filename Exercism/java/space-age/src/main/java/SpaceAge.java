class SpaceAge {
double seconds;
    SpaceAge(double seconds) {
        this.seconds=seconds;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double getSeconds() {
        return seconds;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onEarth() {
        return seconds/31557600;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMercury() {
        return onEarth()/0.2408467;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onVenus() {
return  onEarth()/0.61519726;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMars() {
        return onEarth()/1.8808158;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onJupiter() {
        return onEarth()/11.862615;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onSaturn() {
        return onEarth()/29.447498;
      //  throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onUranus() {
        return onEarth()/84.016846;
     //   throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onNeptune() {
        return onEarth()/164.79132;
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
