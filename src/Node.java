public class Node {
    int value;
    Node next;
    public Node(int value){
        this.value=value;
    }
    @Override
    public String toString() {
        String s=(next==null) ? " null" : "";
        return value+" ->" +s;
    }
}
