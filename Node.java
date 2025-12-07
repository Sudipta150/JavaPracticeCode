public class Node{
    
    private int data;
    Node nextRef;
    Node(int data){
        this.data =data;
        
    }
    public int getData(){
        return data;
    }
    
    public static void main(String args[]){
        Node head=  new Node(10);
        head.nextRef= new Node(20);
        head.nextRef.nextRef= new Node(30);
        traverseLinkedList(head);
    }
    
    public static void traverseLinkedList(Node head){
        Node current = head;
        while(current!= null){
        System.out.println(current.getData()); 
        current=current.nextRef;
        }
        
    }
}
