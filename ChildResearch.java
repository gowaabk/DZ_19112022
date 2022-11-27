import java.util.ArrayList;

public class ChildResearch {
    ArrayList<Node> tree;
    private Person person;

    public ChildResearch(GenTree pd, Person person) {
        tree = pd.getData();
        this.person = person;
    }

    public ArrayList<Person> start() {

        var result = new ArrayList<Person>();

        for (Node node : tree) {
            if (person.getName().equals(node.person2.getName())
                    && node.relation == Relationship.child) {
                result.add(node.person1);
            }
        }

        return result;
    }
}