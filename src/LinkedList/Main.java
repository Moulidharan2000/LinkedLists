package LinkedList;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number to add the Data at Start : ");
		
		switch(scan.nextInt()) {
		case 1 :
			Operations.addDataAtStart();
			break;
		case 2 :
			Operations.addDataAtEnd();
			break;
		case 3 :
			Operations.insertData();
			break;
		case 4 :
			Operations.pop();
			break;
		case 5 :
			Operations.poplast();
			break;
		case 6 :
			Operations.search();
			break;
		case 7 :
			Operations.insertAtSpecificIndex();
			break;
		case 8:
            Operations.deleteAtIndexPosition();
            break;
		}
		scan.close();
	}
}
