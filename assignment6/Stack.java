
package assignment6;


public class Stack {
    public int size;
    public int stack[];
    public int top;
    
    public Stack(int size){
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
       return (top == size - 1); 
    }
    
    public void push(int item){
        if(this.isFull()){
            System.out.println("Stack is full. Increase size.");
            this.increaseSize();
        }
        else{
            stack[++top] = item;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        int item = stack[top--];
        return item;
    }

    public void increaseSize() {
        int newStack[] = new int[this.size * 2];
        for(int i = 0; i < size; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
        size = size * 2;
    }
    
    public static void main(String[] args) {
        Stack st = new Stack(2);
        
        for(int i = 1; i < 10; i++){
            st.push(i);
        }
        
        for(int i = 1; i < 4; i++){
            st.pop();
        }
    }
}
