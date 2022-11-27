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
}
