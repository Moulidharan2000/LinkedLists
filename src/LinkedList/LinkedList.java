package LinkedList;

public class LinkedList {
	Node head, tail;
	
	public Node push(int data) {
		
		Node newNode = new Node(data);
	   
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			this.tail.next = newNode;
		}
	}
	public void insertData(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}
		public void print() {
			if(head == null) {
				System.out.println("LinkedList is Empty");
			}
			else {
				Node temp = head;
				while(temp!=null) {
					System.out.println(temp.key + " " );
					temp = temp.next;
		}
	}

  }
		public void pop() {
			
			Node temp = head;
			head = temp.next;
		}
		
		public void poplast() {
			if(head == null) {
				System.out.println("No Elements to Delete...");
			}
				else if(head.next == null) {
					head = null;
				}
				else {
					Node temp = head;
					
					while(temp.next.next != null) {
						temp = temp.next;
					}
					temp.next = null;
				}
		}
		public void search(int searchData)
	    {
	        if(head.key == searchData)
	            System.out.println(searchData + " is found in LinkedList");
	        else
	        {
	            Node temp=head;

	            boolean isFound=false;

	            while(temp!=null)
	            {
	                if(temp.key == searchData)
	                {
	                    isFound = true;
	                    break;
	                }

	                temp=temp.next;
	            }
	            System.out.println("                      ");
	            if(isFound == true)
	                System.out.println(searchData+ " is found in LinkedList");
	            else
	                System.out.println(searchData+ " is not found in LinkedList");
	        }
	    }
}
