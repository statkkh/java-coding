// import java.util.ArrayList;
import java.util.Scanner;

public class Ex0402 {

    public static void main(String[] args) {
        System.out.println("스택에 넣을 숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        ArrayStack stack = new ArrayStack(number);

        while(true){
            System.out.println(String.format("현재 수 : %d / %d", stack.size(), stack.capacity()));
            System.out.println("1.push 2.pop 3.peek 4.clear 5.dump");
            int num = sc.nextInt();
            if(num == 0) break;
        }
        sc.close();
    }
}

class ArrayStack{
    private int top;
    private int capacity;
    private Object stack[];

    public ArrayStack(int max){
        this.top = -1;
        this.capacity = max;
        stack = new Object[max];
    }

    public void push(Object obj){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            stack[++top] = obj;
        }
    } 

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;    
        }

        Object obj = stack[top];
        stack[top] = null;
        --top;

        return obj;
    }

    public void clear(){
        this.top = -1;
        stack = new Object[this.capacity];
        // if()
    } 


    public boolean isEmpty(){

        return (this.top == - 1);
    }    

    public boolean isFull(){
        return (this.top >= this.capacity - 1);
    }

    public  int size(){
        return this.top +1;
    }

    public int capacity() {
        return this.capacity;
    }
    public void dump(){

        for(Object obj : stack ){
            if(obj != null){
                System.out.println(String.format("%s ", obj));
            }
        }
    }
}
