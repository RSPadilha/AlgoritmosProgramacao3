public class List <T> {
	private Node<T> head, tail;
	private int count = 0;
	//Constructors
	public List(){}
	public List(T data){
		head = new Node<T>(data);
		tail = head;
	}

	public void append(T data){
		Node<T> actual = new Node<T>(data);
		if(head == null){
			head = actual;
			tail = head;
			count++;
		}else if(head == tail){
			head.setNext(actual);
			tail = actual;
			tail.setPrevious(head);
			count++;
		}else{
			Node<T> iter = head;
			while(iter.getNext() != null){
				iter = iter.getNext();
			}
			iter.setNext(actual);
			tail = actual;
			tail.setPrevious(iter);
			count++;
		}
	}

	public String percorreInvertido(){
		String retorno = "";
		Node<T> iter = tail;
		while(iter != null){
			retorno += iter.getData() + "\n";
			iter = iter.getPrevious();
		}
		return retorno;
	}

	public void insert(int index, T data){
		Node<T> actual = new Node<>(data);
		Node<T> iter = head;
		for(int i = 1; i < index; i++){
			if(index > count){
				append(data);
				return;
			}
			iter = iter.getNext();
		}
		if(iter == head){
			head.setPrevious(actual);
			actual.setNext(head);
			head = actual;
			count++;
		}else if(iter == tail){
			append(data);
		}else{
			actual.setPrevious(iter.getPrevious());
			actual.setNext(iter);
			actual.getPrevious().setNext(actual);
			actual.getNext().setPrevious(actual);
			count++;
		}
	}

	public void remove(int index){
		Node<T> iter = head;
		for(int i = 1; i < index && i < count; i++){
			iter = iter.getNext();
		}
		if(iter == head){
			head = head.getNext();
			if(head!=null){
				head.setPrevious(null);
			}
			count--;
		}else if(iter == tail){
			tail.getPrevious().setNext(null);
			tail = tail.getPrevious();
			count--;
		}else{
			iter.getPrevious().setNext(iter.getNext());
			iter.getNext().setPrevious(iter.getPrevious());
			count--;
		}
	}

	public int getSize(){
		return count;
	}

	public boolean has(T data){
		Node<T> iter = head;
		while(iter.getData()!= data && iter.getNext() != null){
			iter = iter.getNext();
		}
		if(iter.getData() == data){
			return true;
		}
		else{
			return false;
		}
	}

	public void print(){
		Node<T> iter = head;
		while(iter != null){
			System.out.println(iter.getData());
			iter = iter.getNext();
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		Node<T> iter = head;
		while(iter != null){
			retorno += iter.getData() + "\n";
			iter = iter.getNext();
		}
		return retorno;
	}

}