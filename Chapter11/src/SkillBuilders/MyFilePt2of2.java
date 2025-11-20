package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFilePt2of2 {

	public static void main(String[] args) 
	{
		
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		textFile = new File("C:\\Users\\38329006\\git\\cs30p2\\Chapter11\\src\\SkillBuilders\\zzz.txt");
		
		if(textFile.exists())
		{
			System.out.println("zzz.txt already exists");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("zzz.txt file created");
			}
			catch(IOException e)
			{
				System.out.println("File could not be created");
				System.err.println("IOException" + e.getMessage());
			}
		}
		
		System.out.println("Would you like to (K)eep the file or (D)elete the file");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
		{
			if(textFile.delete())
			{
				System.out.println("File deleted");
			}
			
		}
		else
		{
			System.out.println("File kept");
		}

	}

}
