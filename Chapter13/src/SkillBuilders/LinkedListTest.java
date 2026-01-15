package SkillBuilders;

public class LinkedListTest {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.addAtFront("a");
		list.addAtFront("b");
		
		list.addAtEnd("c");
		list.addAtEnd("d");
		
		System.out.println(list);
		
		System.out.println("list has "
				+ list.size() + " items.");
		
	}

}
