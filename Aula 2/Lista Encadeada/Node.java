public class Node<T> {
	private Node<T> previous, next;
	private T data;

	public Node(T data){
		this.data = data;
	}

	public void setNext(Node<T> next){
		this.next = next;
	}

	public Node<T> getNext(){
		return next;
	}

	public void setPrevious(Node<T> previous){
		this.previous = previous;
	}

	public Node<T> getPrevious(){
		return previous;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData(){
		return data;
	}
}