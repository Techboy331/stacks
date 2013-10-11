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
    
    //Emily: Return Multiple Items in Stack
   public int[] multiItem(int n){
	int[] multi = new int[n]; 
	for(int i=0; i<n; i++)
	    {	    
		multi[i]=stack[top-i];
	    }
	return multi; 
    }

    //Emily: Print multi item
    void print(int[] multi)
    {
	int n = multi.length;
	for(int i=0; i<n; i++)
	    {
		System.out.print(multi[i] + ",  "); 
	    }
	System.out.println();
	//mi=i we want to set mi to multi in the other function above
	//this function will use a for loop to print out each item in multi
	//this function is run in the main
    }

    public static void main(String[]args){
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	//int val = is.pop();
	//System.out.println(val);
	is.print(is.multiItem(2));
	
      
    }
}
 


