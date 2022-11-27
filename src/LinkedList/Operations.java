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
}