package Mastery;

public class SimpleStackTest2 {

	public static void main(String[] args) 
	{
		
        SimpleStack ss = new SimpleStack(3);
		
		ss.push("Green cup");
		ss.push("Blue cup");
		ss.push("Purple cup");
		
		ss.makeEmpty();
		
		ss.push("Red Cup");
		ss.push("Orange Cup");
		ss.push("Yellow Cup");
		ss.pop();
		
		System.out.println("The stack of cups has " + ss.size() + " cups: " + ss.showContents() + ". ");
		
	}

}

/*

The stack of cups has 2 cups: Red Cup, Orange Cup. 

*/
