
import cokeman.Tracks;
import locationSpoofing.TrackGenerator;

import javax.xml.bind.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        createXML();
        parseXML();
    }

   private static void parseXML() {
        try (InputStream inputStream = ClassLoader.getSystemResourceAsStream("./tracks.xml")) {

            Source source = new StreamSource(inputStream);

            JAXBContext context = JAXBContext.newInstance(cokeman.Tracks.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            JAXBElement<cokeman.Tracks> tracks = unmarshaller.unmarshal(source, cokeman.Tracks.class);

           List<Tracks.Track> list = tracks.getValue().getTrack();
            for (Tracks.Track track:list) {
                for (Tracks.Track.Location locations: track.getLocation()) {
                    System.out.println(locations);
                }
            }

        } catch (IOException | JAXBException ex) {
            ex.printStackTrace(System.err);
        }
    }

    private static void createXML() {
        try {

            JAXBContext context = JAXBContext.newInstance(TrackGenerator.class);
            Marshaller marshaller = context.createMarshaller();

            TrackGenerator tg = new TrackGenerator();
            marshaller.marshal(tg, new File("./src/main/resources/tracks.xml"));
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);


        } catch (JAXBException ex) {
            ex.printStackTrace(System.err);
        }
    }

}
