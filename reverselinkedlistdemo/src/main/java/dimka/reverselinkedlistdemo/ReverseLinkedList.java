package dimka.reverselinkedlistdemo;

/**
 * Reverse a linked list given the head node demo.
 *
 */
public class ReverseLinkedList 
{
    public static void main( String[] args )
    {
    	int[] VALUES = {3, 5, 2, 1, 8, 10, 12};
    	
    	Node headNode = LinkedListHelper.arrayToLinkedList(VALUES);
    	
    	LinkedListHelper.printLinkedList(headNode);
    	
    	headNode = reverseLinkedList(headNode);
    	
    	System.out.println();
    	LinkedListHelper.printLinkedList(headNode);
    	
    }

	public static Node reverseLinkedList(Node headNode) {
		
		Node previous = null;
    	Node current = headNode;
    	Node tempNext;
    	while(current != null) {
    		tempNext = current.getNext();
    		current.setNext(previous);
    		previous = current;
    		current = tempNext;
    		
    		if(current == null)
    			headNode = previous;
    	}
    	
    	return headNode;
	}

}
