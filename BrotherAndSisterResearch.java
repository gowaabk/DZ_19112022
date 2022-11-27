import java.util.ArrayList;

public class BrotherAndSisterResearch {
    ArrayList<Node> tree;
    private Person person;
    private Person parent;

    public BrotherAndSisterResearch(GenTree pd, Person person) {
        tree = pd.getData();
        this.person = person;
    }

    public ArrayList<Person> start() {

        for (Node node : tree) {
            if (person.getName().equals(node.person1.getName())
                    && node.relation == Relationship.child) {
                parent = node.person2;
                break;
            }
        }

        var result = new ArrayList<Person>();

        for (Node node : tree) {
            if (parent.getName().equals(node.person1.getName())
                    && node.relation == Relationship.parent && !node.person2.getName().equals(person.getName())) {
                result.add(node.person2);
            }
        }

        return result;
    }
}