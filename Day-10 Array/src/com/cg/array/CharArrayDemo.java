package com.cg.array;

public class CharArrayDemo {

	public static void main(String[] args) {
		char arr[]= {'a', 'b','1','?','E',' '};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				System.out.println(arr[i]+" is a digit");
			}
			if(Character.isLetter(arr[i]))
			{
				
				if(Character.isUpperCase(arr[i]))
				{
					System.out.println(arr[i]+" is a Letter and UpperCase");
				}else
				{
					System.out.println(arr[i]+" is a Letter and LowerCase ");
				}
			}	
			
			if(Character.isWhitespace(arr[i]))
			{
				System.out.println(arr[i]+" is a Whitespace");
			}
			
				
		}

	}

}
