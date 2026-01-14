
package Mastery;

public class SimpleQueueTest1 {

	public static void main(String[] args) 
	{
		
		SimpleQueue sq = new SimpleQueue(3);
		
		sq.enqueue("Green cup");
		sq.enqueue("Blue cup");
		sq.enqueue("Purple Cup");
		
		System.out.println("The queue of cups has " + sq.size() + " cups: " + sq.showContents() + ". ");

	}

}

/*

The queue of cups has 3 cups: Green cup, Blue cup, Purple Cup.

*/