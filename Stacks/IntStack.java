public class IntStack{
    int[] stack;
    int top=0;

    public IntStack(int n){ //param optional: size of stack
	stack = new int[n];
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
    
    //Lila: Lowest Number In Stack
    int low(){
	if(top!=0){
	    return stack[0];
	}
	return 0;
    }
    
    //Shazy: Size of Stack
    int sizeS(){
	int size = top+1;
	return size;
    }  
    
    //Chris: this returns a specific number in the stack
    int peekD(int n){
	return stack[top-n];
    }

    public static void main(String[]args){
	Scanner scan = new Scanner(system.in);
	IntStack is = new IntStack(10);

	//setting up the stack (intial stack)
	is.push(4);
	is.push(5);
	is.push(6);
	
	//MENU, NOT DONE SORRY -shazy
	//System.out.println("What would you like to do with this stack?");
	//System.out.println("Reply with 'push' 'pop' 'peek' 'peek at depth' 'lowest' or 'size'");
	//next time I will work on replying to these options

	//peek at depth:
	System.out.println("Peek " + is.peekD(1));
	
	//test for lowest:
	int low = is.low();
	System.out.println("Lowest number is: " + low);

	//test for size:
	int sizestack = is.sizeS();
	System.out.println("Size of stack is: " + sizestack);
    }
}
 


