
import java.util.ArrayList;

class ParentResearch {
    ArrayList<Node> tree;
    private Person person;

    public ParentResearch(GenTree pd, Person person) {
        tree = pd.getData();
        this.person = person;
    }

    public ArrayList<Person> start() {

        var result = new ArrayList<Person>();

        for (Node node : tree) {
            if (person.getName().equals(node.person2.getName())
                    && node.relation == Relationship.parent) {
                result.add(node.person1);
            }
        }
        return result;
    }
}