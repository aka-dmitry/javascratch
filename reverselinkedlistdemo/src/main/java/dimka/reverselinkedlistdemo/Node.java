package dimka.reverselinkedlistdemo;

public class Node {

	private int number;
	private Node next;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	Node(){
		this(0, null);
	}
	
	Node(int number){
		this(number, null);
	}
	
	Node(int number, Node next){
		this.number = number;
		this.next = next;
	}
}
