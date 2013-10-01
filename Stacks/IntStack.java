public class IntStack{
    int[] stack;
    int top=0;

    public static void main(String[]args){
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	int val = is.pop;
	System.out.println(val);
    }

    public intStack(){ //param optional: size of stack
	stack = new stack[size];
    }
    boolean isEmpty(){
       return top == 0;
    }
    void push(int n){
	stack[top++]=n; //you can write that here
	//	top++;
    }
    int pop(){
	return stack[--top];//you can also write this
	//	top--;
    }
    int peek(){
	return stack[top-1];
    }   
}


}
