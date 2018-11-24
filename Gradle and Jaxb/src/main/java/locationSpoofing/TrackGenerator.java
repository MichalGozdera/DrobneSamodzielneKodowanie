

package locationSpoofing;


import com.github.rkumsher.date.RandomDateUtils;
import org.apache.commons.lang3.RandomStringUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Random;
@XmlRootElement(name = "tracks")
public class TrackGenerator {
    ArrayList<Track> tracks = new ArrayList<>();

    public TrackGenerator() {
        for (int i = 0; i <15 ; i++) {
            Track track = new Track();
            tracks.add(track);
        }
    }
    @XmlElement(name = "track")
    public ArrayList<Track> getTracks() {
        return tracks;
    }

}
