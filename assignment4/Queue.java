
package assignment4;


public class Queue {
    public int queue[];
    public int front;
    public int rear;
    public int n;
    public int length;
    
    public Queue(int size){
        n = size;
        queue = new int[n];
        front = -1;
        rear = -1;
        length = 0;
        
    }
    
    public void enqueue(int item){
        if(rear == -1){
            front = 0;
            rear = 0;
            queue[rear] = item;
        }
        else if(rear + 1 >= n){
            System.out.println("Queue overflow");
        }
        else if(rear + 1 < n){
            queue[++rear] = item;
        }
        length++;
    }
    
    public int dequeue(){
        if(rear < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            length--;
            int temp = queue[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
            }
            return temp;
        }
    }
    
    public void display(){
        if(length == 0){
            System.out.println("Queue is empty.");
        }
        System.out.println("Present queue is : ");
        for(int i = front; i <= rear; i++){
            System.out.println(queue[i]);
        }
    }
}
