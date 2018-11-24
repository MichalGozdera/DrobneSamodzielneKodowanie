package locationSpoofing;

import org.apache.commons.lang3.RandomStringUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Random;
@XmlRootElement(name = "address")
public class Address {
    @XmlElement(name = "street")
    private String street;
    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "houseNumber")
    private int houseNumber;
    Random rand = new Random();

    public Address() {
        this.city = RandomStringUtils.randomAlphabetic(1, 10);
        this.street = RandomStringUtils.randomAlphabetic(1, 10);
        this.houseNumber =rand.nextInt(100);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
