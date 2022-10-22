import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node.next.next.next.next=new Node(15);
        
        Node node1=new Node(6);
        node1.next=new Node(7);
        node1.next.next=new Node(8);
        node1.next.next.next=new Node(19);
        node1.next.next.next.next=new Node(21);
        Node head=mergeLinkedList(node, node1);
        while(head!=null){
            System.out.print(head);
            head=head.next==null ? null : head.next;
        }
    }

    public static int missingNumber(int[] nums){
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            
        }
        int realsum=((n+1)*(n+2))/2;
        System.out.println(s);
        System.out.println(realsum);
        return realsum-s;
    }
    public static boolean isThereSum(int[] nums,int target){
        int n=nums.length;
        Map m=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=target-nums[i];
            if(m.containsKey(a)){
                return true;
            }
            else{
                m.put(nums[i], i);
            }
        }
        return false;
    }
    public static Node mergeLinkedList(Node n1,Node n2){
        
        if(n1==null){
            return n2;
        }
        if(n2==null) return n1;
        Node head=null;
        if(n1.value<=n2.value){
            head=n1;
            n1=n1.next;
        }
        else{
            head=n2;
            n2=n2.next;
        }
        Node merge=head;
        while(n1!=null && n2!=null){
            if(n1.value<=n2.value){
                merge.next=n1;
                n1=n1.next;
            }
            else{
                merge.next=n2;
                n2=n2.next;
            }
            merge=merge.next;
        }
        if(n1!=null){
            merge.next=n1;
        }
        else if(n2!=null){
            merge.next=n2;
        }
        return head;
    }
}
