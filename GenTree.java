import java.util.ArrayList;

class GenTree {
    private ArrayList<Node> arrayTree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return arrayTree;
    }

    public void append(Person parent, Person child) {

        arrayTree.add(new Node(parent, Relationship.parent, child));
        arrayTree.add(new Node(child, Relationship.child, parent));
    }
}
