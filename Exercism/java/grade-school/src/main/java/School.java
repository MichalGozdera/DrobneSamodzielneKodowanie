import java.util.*;

public class School {
    private Map<Integer, List<String>> studenci;

    public School() {
        this.studenci = new HashMap<>();
    }

    public int numberOfStudents() {
        return studenci.size();
    }


    public void add(String person, int grade) {
        List<String> students;
        if (studenci.containsKey(grade)) {
            students = studenci.get(grade);
        } else {
            students = new ArrayList<>();
        }
        students.add(person);
        studenci.put(grade, students);
    }



    public List<String> grade(int i) {
        List<String> students;
        if (studenci.containsKey(i)){
            students=studenci.get(i);
        }
        else {
            students=new ArrayList<>();
        }
           return students;
    }

    public Map studentsByGradeAlphabetical() {
       for (Integer i:studenci.keySet()){
           Collections.sort(studenci.get(i));
       }
       return studenci;
    }
}
