package SkillBuilders;

import java.io.File;
import java.util.Scanner;

public class MyFilePt1of2 {

	public static void main(String[] args) 
	{
		File textFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;

		//Obtain file name from user
		System.out.println("Enter file name: ");
		fileName = input.nextLine();
		
		textFile = new File(fileName);
		
		if(textFile.exists())
		{
			System.out.println("File does exist.");
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
	}

}
