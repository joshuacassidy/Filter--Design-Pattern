import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Single", "student"));
        persons.add(new Person("Harvey", "Married", "student"));
        persons.add(new Person("Henry", "Single", "student"));
        persons.add(new Person("Thomas", "Single", "lecturer"));

        Criteria student = new CriteriaStudent();
        Criteria lecturer = new CriteriaLecturer();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, student);
        Criteria singleOrFemale = new OrCriteria(single, lecturer);
        Criteria singleXORFemale = new XorCriteria(single, lecturer);

        System.out.println("students: ");
        printPersons(student.meetCriteria(persons));

        System.out.println("\nlecturers: ");
        printPersons(lecturer.meetCriteria(persons));

        System.out.println("\nSingle students: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or lecturer: ");
        printPersons(singleOrFemale.meetCriteria(persons));

        System.out.println("\nSingle XOr lecturer: ");
        printPersons(singleXORFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Occupation : " + person.getOccupation() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }

}
