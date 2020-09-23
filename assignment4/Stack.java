
package assignment4;


public class Stack {
    public int stack[];
    public int tos;
    
    public Stack(int size){
        stack = new int[size];
        tos = -1;
    }
    
    public void push(int item){
        if(tos == stack.length - 1)
            System.out.println("Stack overflow.");
        else{
            stack[++tos] = item;
        }
            
    }
    
    public int pop(){
        if(tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
    
    public void display(){
        if(tos == -1){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Present stack is : ");
            for(int i = 0; i <= tos; i++){
                System.out.println(stack[i]);
            }
        }
    }
}
