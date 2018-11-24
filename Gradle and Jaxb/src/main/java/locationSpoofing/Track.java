package locationSpoofing;

import com.github.rkumsher.date.RandomDateUtils;

import javax.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


@XmlRootElement(name = "track")
public class Track {
    @XmlElement (name = "number")
    private int number;
    @XmlElement (name = "location")
    private ArrayList<Location> route;
    Random rand = new Random();

    private int generateDegree(int maximum) {

        return -maximum + rand.nextInt(maximum * 2);
    }

    private static int NUMBER = 1;


    public Track() {
        this.number = NUMBER++;
        this.route = new ArrayList<Location>();
        Location firstLocation = new Location();
        firstLocation.setPoint(firstPoint());
        firstLocation.setTime(RandomDateUtils.randomPastDate());
        route.add(firstLocation);
        continueRoute();
    }

    private Point firstPoint() {
        Point point = new Point();
        point.setAltitude(rand.nextInt(300) + 3.14f);
        point.setLatitude(generateDegree(90));
        point.setLongitude(generateDegree(180));
        return point;
    }

    private void continueRoute() {
        for (int i = 0; i < 100; i++) {
            Location previous = this.route.get(i);
            Location next = new Location();
            Long nextDateMilis = previous.getTime().getTime() + 5000;
            next.setTime(new Date(nextDateMilis));
            Point previusPoint = previous.getPoint();
            double newLongitude = previusPoint.getLongitude() + rand.nextFloat() * 0.02 - 0.01;
            double newLatitude = previusPoint.getLatitude() + rand.nextFloat() * 0.02 - 0.01;
            double newAltitude = previusPoint.getAltitude() + rand.nextFloat() * 0.02 - 0.01;
            Point nextPoint = new Point();
            nextPoint.setAltitude((float) newAltitude);
            nextPoint.setLongitude((float) newLongitude);
            nextPoint.setLatitude((float) newLatitude);
            next.setPoint(nextPoint);
            this.route.add(next);
        }
    }

    @Override
    public String toString() {
        return "Track no: "+number+"\n"+printRoute();
    }

    public String printRoute() {
        StringBuilder sb = new StringBuilder();
        for (Location location : this.route) {
            sb.append(location.toString());
            sb.append("\n");
        }
    return sb.toString();
    }


}
