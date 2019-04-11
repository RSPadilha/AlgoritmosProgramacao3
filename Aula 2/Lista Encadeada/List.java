public class List <T> {
	private Node<T> head, tail;
	private int size = 0;
	//Constructors
	public List(){}
	public List(T data) {
		head = new Node<T>(data);
		tail = head;
	}

	public void append(T data){
		Node<T> actual = new Node<T>(data);
		if(head == null){
			head = actual;
			tail = head;
			size++;
		}else if(head == tail){
			head.setNext(actual);
			tail = actual;
			tail.setPrevious(head);
			size++;
		}else{
			Node<T> iter = head;
			while(iter.getNext() != null){
				iter = iter.getNext();
			}
			iter.setNext(actual);
			tail = actual;
			tail.setPrevious(iter);
			size++;
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
		if(index > size){
			append(data);
			return;
		}
		for(int i = 1; i < index; i++){
			iter = iter.getNext();
		}
		if(iter == head){
			head.setPrevious(actual);
			actual.setNext(head);
			head = actual;
			size++;
			// TODO make sure to not lose the tail(not losing atm)
		// }else if(iter == tail){
		// 	append(data);

		}else{
			actual.setPrevious(iter.getPrevious());
			actual.setNext(iter);
			actual.getPrevious().setNext(actual);
			actual.getNext().setPrevious(actual);
			size++;
		}
	}

	public void remove(int index){
		Node<T> iter = head;
		for(int i = 1; i < index && i < size; i++){
			iter = iter.getNext();
		}
		if(iter == head){
			head = head.getNext();
			if(head!=null){
				head.setPrevious(null);
			}
			size--;
		}else if(iter == tail){
			tail = tail.getPrevious();
			tail.setNext(null);
			// tail.getPrevious().setNext(null);
			// tail = tail.getPrevious();
			size--;
		}else{
			iter.getPrevious().setNext(iter.getNext());
			iter.getNext().setPrevious(iter.getPrevious());
			size--;
		}
	}

	public int getSize(){
		return size;
	}

	public boolean has(T data){
		Node<T> iter = head;
		// comparar equals pra string e == pra outros
		while(iter != null) {

		}
		while(!iter.getData().equals(data) && iter.getNext() != null){
			iter = iter.getNext();
		}
		if(iter.getData().equals(data)){
			return true;
		}	else{
			return false;
		}
	}

	public void getIndex(T value) {
		Node<T> iter = head;
		int count = 1;
		boolean found = false;
		while(iter != null) {
			if (iter.getData().equals(value)) {
				System.out.println("Found on index: " +count);
				found = true;
			}
			iter = iter.getNext();
			count++;
		}
		if(found == false) {
			System.out.println("Value not found");
		}
	}

	// Can use this one or the toString. Little difference
	public void print(){
		Node<T> iter = head;
		while(iter != null){
			System.out.println(iter.getData());
			iter = iter.getNext();
		}
	}

	@Override
	public String toString() {
		String listing = "################ Start of the list ################\n";
		Node<T> iter = head;
		int index = 1;
		while(iter != null){
			listing += index +"- "+ iter.getData() + "\n";
			iter = iter.getNext();
			index++;
		}
		listing += "################  End of the list  ################";
		return listing;
	}

	private Node searchByIndex(int index) {
		Node<T> iter = head;
		int count = 1;
		while(count < index) {
			iter.getNext();
			count++;
		}
		return iter;
	}

}