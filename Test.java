/*Name: Shrey patel 
SID : 200392290
ENSE 374 
Lab2 Assignment */ 




import java.util.*;

public class Test
{
	public static void main(String[] args) 
	{
		System.out.print("Linked list");
		
		DoubleListElement list = new DoubleListElement();
		
		ListElement newElement = new ListElement(1);
		
		newElement.setData(1);
		list.addElement(newElement);
		
		
		list.addElement(newElement);
		newElement.setData(2);
		
		list.addElement(newElement);
		newElement.setData(3);
		
		list.addElement(newElement);
		newElement.setData(4);
		
		list.addElement(newElement);
		newElement.setData(5);

		for(int i=0; i<6; i++)
		{
			newElement.setData(i);
			list.addElement(newElement);
		}
		
		list.printLinkedListHead();
		
		int index = 3;
		DoubleListElement viewElement = new DoubleListElement();
		
		viewElement.t = list.getElement(index,list);
		
		int x = viewElement.t;
		
		System.out.print("Check element by index. Index " + index + " has data: " + x );
		
	
		DoubleListElement deleteElement = new DoubleListElement();
		
		deleteElement = list.deleteElement(index);
		
		int y = deleteElement.getData();
		
		System.out.print("Delete element by index. Index " + index + " has been deleted.");
		
		System.out.print("Print the linked list form the head to tail.");
		
		list.printLinkedListHead();
		
		System.out.print("Print the linked list form the tail to head.");
		
		list.printLinkedListTail();
		
	}
}