public class Hashtable {
    int key;
    private Object value;
    private Hashtable next;
    public Hashtable(int key,Object value){
        this.key=key;
        this.value=value;
        next=null;
    }
    public Hashtable(){

    }
    public int getKey() {
        return key;
    }
    public Object getValue() {
        return value;
    }
    @Override
    public String toString() {
        return key +" : "+value+" ";
    }
}
