package Mastery;

public class SimpleLinkedListTest1 {

	public static void main(String[] args) 
	{
		SimpleLinkedList sll = new SimpleLinkedList();
		
		sll.addAtFront("Green cup");
		sll.addAtFront("Blue cup");
		
		System.out.println("The list of cups has " + sll.size() + " cups: " + sll.toString() + ". ");
		
	}

}
/*

The list of cups has 2 cups: Blue cup, Green cup. 

*/