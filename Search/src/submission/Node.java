package submission;

public class Node {
	  private int  num; // Entry in bag
	  private Node next; // Link to next node

		public Node(int i)
		{
			this(i, null);	
		} // end constructor
		
		public Node(int i, Node nextNode)
		{
			num = i;
			next = nextNode;	
		} // end constructor
}
