package Mastery;

public class SimpleQueueTest2 {

	public static void main(String[] args) 
	{
		
		SimpleQueue sq = new SimpleQueue(3);
		
		sq.enqueue("Green cup");
		sq.enqueue("Blue cup");
		sq.enqueue("Purple cup");
		
		sq.makeEmpty();
		
		sq.enqueue("Red cup");
		sq.enqueue("Yellow cup");
		sq.enqueue("Orange cup");
		sq.dequeue();
		
		System.out.println("The queue of cups has " + sq.size() + " cups: " + sq.showContents());

	}

}

/*

The queue of cups has 2 cups: Yellow cup, Orange cup

*/
