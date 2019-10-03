/*Name: Shrey patel 
SID : 200392290
ENSE 374 
Lab2 Assignment */ 



import java.util.*;

public class DoubleListElement
{
	private ListElement data;
	private DoubleListElement next;
	private DoubleListElement head = null;
	public int t;
	
	public DoubleListElement()
	{
		this.data = new ListElement();
		this.next = null;
	}
	
	public DoubleListElement(ListElement newData)
	{
		data = new ListElement(newData.getData());
		next = null;
		head = null;
	}
	
	
	
	public void addElement(ListElement le)
	{
		DoubleListElement new_Element = new DoubleListElement(le);
		if(head == null)
		{
			head = new_Element;
		}
		else
		{
			DoubleListElement current = head;
			while(current.next != null)
			{
				current = current.next;
			}	
			
			current.next = new_Element;
		}
	}
	
	public int getElement(int ind, DoubleListElement it) 
	{	int x=0;
		
		DoubleListElement pointer=it.head;
			for(int i=0; i < ind; i++)
		{
			
			x =it.data.getData();
			pointer=pointer.next;
			
		}
		return x;
	}
	
	
	public DoubleListElement deleteElement(int index)
	{
		DoubleListElement temp;	
		if(index == 0)
		{
			temp = head;
			head = head.next;
			return temp;
		}
		
		DoubleListElement current = head;
		
		for(int i = 1; i < index; i++)
		{
			current = current.next;
		}		
		
		temp = current.next;
		current.next = current.next.next;
		return temp;
	}
	
	
	public void printLinkedListTail()
	{
		
		if(head == null)
		{
			System.out.print("List is empty.");
		}
		
		else
		{
			DoubleListElement current = head;	
			DoubleListElement reverseList = new DoubleListElement();
			
			while(current != null)
			{
				current = current.next;
			}	
			reverseList.printLinkedListHead();		
		}			
	}
	
	
	public void printLinkedListHead()
	{
		if(head == null)
		{
			System.out.print("List is empty.");
		}
		
		else 
		{
			DoubleListElement current = head;
			while(current != null)
			{
				System.out.print(current.data);
				if(current.next != null)
				{
					System.out.print(" -> ");
				}
				current = current.next;
			}		
		}
	}
	
	public void setData(int data)
	{
		this.data.setData(data);
	}
	
	public int getData()
	{
		return this.data.getData();
	}
	
	public DoubleListElement getNext()
	{
		return next;
	}
}