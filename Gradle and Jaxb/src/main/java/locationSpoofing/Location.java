package locationSpoofing;

import com.github.rkumsher.date.RandomDateUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Random;
@XmlRootElement(name = "location")
public class Location {

    private Point point;
    @XmlElement (name = "address")
    private Address address;
    @XmlElement (name = "locationNo")
    private int locationNo;
    private Date time;
    private static int NUMBER = 1;

    public Location() {
        this.locationNo=NUMBER++;
        this.address=new Address();
    }
    @XmlElement(name = "point")
    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }



    @XmlElement (name = "time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Location{" +
                "point=" + point +
                ", address=" + address +
                ", locationNo=" + locationNo +
                ", time=" + time +
                '}';
    }
}
