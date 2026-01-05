package SkillBuilders;

public class Stack2Test {

	public static void main(String[] args) 
	{
		Stack2 s2 = new Stack2(3);
		
		s2.push("Red");
		s2.push("5");
		
		System.out.println(s2.top());
	}

}
