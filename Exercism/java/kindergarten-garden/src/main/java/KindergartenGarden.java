import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KindergartenGarden {
    String[] studentArray = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
    String plants;

    public KindergartenGarden(String plants) {
        this.plants = plants;
    }

    public KindergartenGarden(String plants, String[] studentArray) {
        this.studentArray = studentArray;
        this.plants = plants;
    }

    public List<Plant> getPlantsOfStudent(String student) {
        String[] roslinki = plants.split("\n");
        List<String> studenci = Arrays.asList(studentArray);
        Collections.sort(studenci);
        List<Plant> precyzyjneRoslinki = new ArrayList<>();
        for (String s : roslinki) {
            precyzyjneRoslinki.add(Plant.getPlant(s.charAt(2 * studenci.indexOf(student))));
            precyzyjneRoslinki.add(Plant.getPlant(s.charAt(2 * studenci.indexOf(student) + 1)));
        }
        return precyzyjneRoslinki;
    }
}
