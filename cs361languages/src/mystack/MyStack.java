/**
 * 
 */
package mystack;

/**
 * @author Haleigh Laffan 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		public MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
		
		public void setVal(T1 v) {
			val = v;
		}
		
		public T1 getVal() {
			return val;
		}
		
		public MyNode getNext() {
			return next;
		}
		
		public void setNext(MyNode<T1> n) {
			next = n;
		}
		
	}
	MyNode top;
	int size;
	

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
		top = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		return size;
	}

	public T pop(){
		// TODO To complete
		T val = null;
		if (isEmpty());
		else {
			val = (T) top.getVal();
			MyNode tmp = top;
			top = top.getNext();
			tmp.setNext(null);
			size--;
		}
		return val;
		
	}

	public void push(T v) {
		// TODO To complete
		MyNode node = new MyNode(v, top);
		top = node;
		size++;
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack = new MyStack<Integer>();
		
		// Push 1 and 2
		stack.push(1);
		stack.push(2);
		
		// Pop
		stack.pop();
		// Push 5
		stack.push(5);
		
		
		// TODO To complete
		// Create a stack of Person
		//MyStack<Person> person = new MyStack<Person>();
		// Push a person p1 with your name
		//person.push("haleigh");
		// Push a person p2 with my name
		//person.push("scharff");
	}

}
