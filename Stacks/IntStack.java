import java.util.Scanner;
/**
 * Int Stack - a program to manipulate a stack of integers
 * @author Shazy, Lila, Chris, Emily
 */
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
		IntStack is = new IntStack(10);
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		char run_again = 'Y';
		int peek_dep = 0;
		int push_num = 0;
		int pop_num = 0;

		//setting up the stack (this is the initial stack)
		is.push(4);
		is.push(5);
		is.push(6);

		//MENU loop by Shazy
		while (run_again == 'Y') {
			System.out.println("What would you like to do with this stack?");
			System.out.println("Reply with 'push' 'pop' 'peek' 'peek at depth' 'lowest' or 'size'");

			//to push something onto the stack
			if (choice == "push") {
			    System.out.println("What would you like to push? enter an integer.");
			    push_num = scan.nextInt();
			    is.push(push_num);
			}
			
			//to pop the top number off the stack
			else if (choice == "pop") {
			    System.out.println("You popped " + is.pop());
			}

			//to peek at the top number
			else if (choice == "peek") {
			    System.out.println("The top number is " + is.peek());
			}
			
			//to peek at a certain depth
			else if (choice == "peek at depth") {
			     System.out.println("How deep? enter an integer.");
			     peek_dep = scan.nextInt();
			     System.out.println("Peek " + is.peekD(peek_dep));
			}
			
			//to show the lowest number
			else if (choice == "lowest") {
			     System.out.println("Lowest number is: " + is.low());
			}

			//to show how big the stack is
			else if (choice == "size") {
			     System.out.println("Size of stack is: " + is.sizeS() + " integers.");
			}
			
			//ask if the user wants to do something else with the stack
			System.out.println("Want to do something else? y/n");
			//takes the capital first letter of the user input
			run_again = scan.next().toUpperCase().charAt(0);
		}
	}
}




