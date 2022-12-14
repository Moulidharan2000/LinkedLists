package LinkedList;

public class Operations {
	
	public static void addDataAtStart() {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);
		linkedlist.print();
	}
	
	public static void addDataAtEnd() {
		LinkedList linkedlist = new LinkedList();
		linkedlist.append(56);
		linkedlist.append(30);
		linkedlist.append(70);
		linkedlist.print();
	}
	
	public static void insertData() {
		LinkedList linkedlist = new LinkedList();
		Node secondNode = linkedlist.push(70);
		Node firstNode = linkedlist.push(56);
		Node newNode = new Node(30);
		System.out.println("\nBefore");
		linkedlist.print();
		linkedlist.insertData(firstNode,  newNode);
		System.out.println("\nAfter");
		linkedlist.print();
	}	
	
	public static void pop() {
		LinkedList linkedlist = new LinkedList();
		Node firstNode = linkedlist.push(70);
		Node secondNode = linkedlist.push(30);
		Node newNode = linkedlist.push(56);
		System.out.println("Before");
		linkedlist.print();
		linkedlist.pop();
		System.out.println("After Deleting First Element : ");
		linkedlist.print();
		}
		
	public static void poplast() {
		LinkedList linkedlist = new LinkedList();
		Node firstNode = linkedlist.push(70);
		Node secondNode = linkedlist.push(30);
		Node newNode = linkedlist.push(56);
		System.out.println("Before");
		linkedlist.print();
		linkedlist.poplast();
		System.out.println("After Deleting the Last Element : ");
		linkedlist.print();
		}
		
	public static void search() {
		LinkedList linkedlist = new LinkedList();
		Node firstNode = linkedlist.push(70);
		Node secondNode= linkedlist.push(30);
	    Node newNode=linkedlist.push(56);
	    System.out.println("Before");
	    linkedlist.print();
	    linkedlist.search(30);
	}

	public static void insertAtSpecificIndex() {
		 LinkedList linkedList = new LinkedList();
		 Node firstNode = linkedList.push(70);
		 Node secondNode = linkedList.push(30);
		 Node newNode = linkedList.push(56);
		 System.out.println("Before : ");
		 linkedList.print();
		 linkedList.insertAtSpecificIndex(2, 40);
	     System.out.println("After adding element at Specific position : ");
	     linkedList.print();
		
	}
	 public static void deleteAtIndexPosition(){
		 LinkedList linkedList = new LinkedList();
		 Node firstNode = linkedList.push(70);
		 Node secondNode = linkedList.push(30);
		 Node newNode = linkedList.push(56);
		 linkedList.insertAtSpecificIndex(2, 40);
		 System.out.println("Befor :");
		 linkedList.print();
		 linkedList.size();
		 System.out.println("After Deleting The Value :");
		 linkedList.deleteAtIndexPosition(40);
		 linkedList.print();
		 linkedList.size();
}

}