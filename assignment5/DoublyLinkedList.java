
package assignment5;


public class DoublyLinkedList {
    public Node start;
    public Node end ;
    public int size;
    
    public DoublyLinkedList(){
        start = null;
        end = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return start == null;
    }
    
    public void insertHead(int value){
        Node nptr = new Node(value, null, null);
        
        if(start == null){
            start = nptr;
            end = start;
        }
        else{
            start.setBlink(nptr);
            nptr.setFlink(start);
            start = nptr;
        }
        size++;
    }
    
    public void insertEnd(int value){
        Node nptr = new Node(value, null, null);
        
        if(start == null){
            start = nptr;
            end = start;
        }
        else{
            nptr.setBlink(end);
            end.setFlink(nptr);
            end = nptr;
        }
        size++;
    }
    
    public void insertPosition(int value, int position){
        Node nptr = new Node(value, null, null);
        
        if(position == 1){
            insertHead(value);
            
        }
        Node ptr = start;
        for(int i = 2; i <= size; i++){
            if(i == position){
                Node tmp = ptr.getFlink();
                ptr.setFlink(nptr);
                nptr.setBlink(ptr);
                nptr.setFlink(tmp);
                tmp.setBlink(nptr);

            }
            ptr = ptr.getFlink();
        }
        size++;
    }
    
    public void deleteNode(int position){
        if(position == 1){
            if(size == 1){
                start = null;
                end = null;
                size = 0;
                
            }
            start = start.getFlink();
            start.setBlink(null);
            size--;
        }
        
        if(position == size){
            end = end.getBlink();
            end.setFlink(null);
	    size-- ;

        }
        
        Node ptr = start.getFlink();
        for(int i = 2; i <= size; i++ ){
            if(i == position){
                Node p = ptr.getBlink();
                Node n = ptr.getFlink();
                p.setFlink(n);
                n.setBlink(p);
                size-- ;
            }
            ptr = ptr.getFlink();
        }
    }
    
    public void display(){
        System.out.println("Doubly linked list is : ");
        if(size == 0){
            System.out.println("Empty list");
        }
        if(start.getFlink() == null){
            System.out.println(start.getData());
        }
        Node ptr = start;
        
        System.out.println(start.getData() + " ");
        ptr = start.getFlink();
        while(ptr.getFlink() != null){
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getFlink();

        }
        System.out.println(ptr.getData());
    }
}
