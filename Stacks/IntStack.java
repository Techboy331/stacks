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
    int peekt(){
	return stack[top-1];
    }   
    
    //Lila Lowest Position In Stack
    int peekb(){
	if(top!=0){
	    return stack[0];
	}
	return 0;
    }
   
    //Lila Lowest Number In Stack
    int low(){
	int lowest = 0;
	for(int i = stack.length-1; i>0; i--) {	   
	    if(stack[i-1] < stack[i])
		lowest = stack[i-1];

	       }
	return lowest;
	}


    

    int peekD(int n){ //Chris, this returns a specific number in the stack
	return stack[top-n];
    }

    public static void main(String[]args){
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	int val = is.pop();
	//System.out.println(val);
	//	System.out.println(is.peekD(1));
	

	//test for lowest:
	int peekb = is.peekb();
	//	System.out.println(peekb);

	//test for lowest
	int low = is.low();
	System.out.println(low);
    }
}
 


