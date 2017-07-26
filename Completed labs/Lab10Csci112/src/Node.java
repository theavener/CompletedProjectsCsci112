
public class Node<T> {
	private T element;
	
	public Node() {
		element = null;      //generally dont want to use null 
	}
	public Node(T ele) {
		element = ele;
	}
	public void setGener(T ele) {
		element = ele;
	}
	public T getGener() {
		return element;
	}
	public String toString() {
		return "The value is: " + element;
	}
}