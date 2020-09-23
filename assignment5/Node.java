
package assignment5;


public class Node{
    
    public int data;
    public Node blink, flink;
    
    public Node(){
        blink = null;
        flink = null;
        data = 0;
    }
    
    public Node(int data, Node blink, Node flink){
        this.blink = blink;
        this.flink = flink;
        this.data = data;
    }
    
    public void setBlink(Node blink){
        this.blink = blink;
    }
    
    public void setFlink(Node flink){
        this.flink = flink;
    }
    
    public Node getBlink(){
        return blink;
    }
    
    public Node getFlink(){
        return flink;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public int getData(){
        return data;
    }
}