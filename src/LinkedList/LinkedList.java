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
}
