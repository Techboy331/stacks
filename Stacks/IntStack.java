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
		IntStack is = new IntStack(10);
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		char run_again = 'Y';
		int peek_dep = 1;

		//setting up the stack (initial stack)
		is.push(4);
		is.push(5);
		is.push(6);

		//MENU loop by Shazy
		while (run_again == 'Y') {
			System.out.println("What would you like to do with this stack?");
			System.out.println("Reply with 'push' 'pop' 'peek' 'peek at depth' 'lowest' or 'size'");

			if (choice == "push") {

			}

			else if (choice == "pop") {

			}

			else if (choice == "peek") {

			}

			else if (choice == "peek at depth") {
				System.out.println("How deep? enter an integer.");
				peek_dep = scan.nextInt();
				System.out.println("Peek " + is.peekD(peek_dep));
			}

			else if (choice == "lowest") {
				System.out.println("Lowest number is: " + is.low());
			}

			else if (choice == "size") {
				System.out.println("Size of stack is: " + is.sizeS() + " integers.");
			}

			System.out.println("Want to do something else? y/n");
			//takes the capital first letter of the user input
			run_again = scan.next().toUpperCase().charAt(0);
		}
	}
}




