import java.util.ArrayList;
import java.util.List;

public class CriteriaLecturer implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> students = new ArrayList<>();
        for(Person person: people) {
            if(person.getOccupation().equalsIgnoreCase("lecturer")) {
                students.add(person);
            }
        }
        return students;
    }
}
