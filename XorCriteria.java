import java.util.ArrayList;
import java.util.List;

public class XorCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public XorCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        List<Person> xor = new ArrayList<>();
        for (Person person : otherCriteriaItems) {
            if((firstCriteriaItems.contains(person) || otherCriteriaItems.contains(person)) && !(firstCriteriaItems.contains(person) && otherCriteriaItems.contains(person))) {
                xor.add(person);
            }
        }

        for (Person person : firstCriteriaItems) {
            if((firstCriteriaItems.contains(person) || otherCriteriaItems.contains(person)) && !(firstCriteriaItems.contains(person) && otherCriteriaItems.contains(person))) {
                xor.add(person);
            }
        }

        return xor;
    }

}
