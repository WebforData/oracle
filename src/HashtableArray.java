public class HashtableArray<T> {
    Hashtable[] arrayHash;
    int size;
    public HashtableArray(int size){
        this.size=size;
        arrayHash=new Hashtable[size];
        for (int i = 0; i < arrayHash.length; i++) {
            arrayHash[i]=new Hashtable();
        }
    }
    public int getHash(int key){
        System.out.println(key%size);
        return key%size;
    }
    public void put(int key,Object value){
        int hashIndex=getHash(key);// <size
        while(arrayHash[hashIndex].getValue()!=null){
            hashIndex=(int) (Math.random() * (size-1));
        }   
        arrayHash[hashIndex]= new Hashtable(key,value);
    }
    public T get(int key){
        int hashIndex=getHash(key);
        return (arrayHash[hashIndex]==null) ? null : (T) arrayHash[hashIndex].getValue();
    }
    @Override
    public String toString() {
        String s="{";
        for (int i = 0; i < arrayHash.length; i++) {
            s+=arrayHash[i]+",";
        }
        return s+"}";
    }
}
