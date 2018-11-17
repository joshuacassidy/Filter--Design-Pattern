
public class Person {

    private String name;
    private String marriedStatus;
    private String occupation;

    public Person(String name, String marriedStatus, String occupation) {
        this.name = name;
        this.marriedStatus = marriedStatus;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaritalStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", marriedStatus='" + marriedStatus + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
