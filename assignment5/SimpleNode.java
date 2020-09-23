package assignment5;


public class SimpleNode {
    public int number;
    public SimpleNode link;
    
    public SimpleNode(){
        link = null;
        number = 0;
    }
    
    public SimpleNode(int number, SimpleNode link){
        this.number = number;
        this.link = link;
    }
    
}

class LinkedList{
    public SimpleNode head;
    public SimpleNode tail;
    public int size;
    
    SimpleNode newNode = new SimpleNode(5, null);
    SimpleNode pred = new SimpleNode();
    SimpleNode p = new SimpleNode();

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insert(int newNum){
        size++;
       
        if((newNode.number < head.number) || (head == null)){
            newNode.link = head;
            head = newNode;
        }
        else{
            pred = head;
            p = head.link;
            while(p.number < newNode.number){
                pred = p;
                p = p.link;
            }
            newNode.link = pred.link;
            pred.link = newNode;
        }
    }
    
    public void delete(int pos) {
       while(p.number < newNode.number){
                pred = p;
                p = p.link;
            }
    }
    
    public void display(){
        if(size == 0){
            System.out.println("Empty linked list.");
        }
        else{
            while(p.number < newNode.number){
                pred = p;
                p = p.link;
                System.out.println(p.number);
            }
        }
    }

    
    
}
