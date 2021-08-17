package dimka.reverselinkedlistdemo;

public class LinkedListHelper {

	public static void printLinkedList(Node headNode) {
		Node current = headNode;
		
    	System.out.print("[");
    	while(current != null) {
    		System.out.print(current.getNumber());
    		String append = current.getNext() != null ? "," : "]";
    		System.out.print(append);
    		
    		current = current.getNext();
    	}
	}
	
	public static Node arrayToLinkedList(int[] values) {
    	Node headNode = new Node(values[0]);
    	
    	Node current = headNode;
    	for(int valuesIndex = 1; valuesIndex < values.length; valuesIndex++) {
    		
    		current.setNext(new Node(values[valuesIndex]));
    		current = current.getNext();
    	}
    	
    	return headNode;
	}
}
