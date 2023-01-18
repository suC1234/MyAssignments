package week1.day2;

public class Reverseprocess {
	
	public static void main(String[] args) {
		
		String name = "Susitharan";
		char[] nameArray=name.toCharArray();
		for (int i=nameArray.length-1;i>=0;i--) 
		{
			System.out.print(nameArray[i] + ",");
		}
		System.out.println("Check string contains the word or not");
		if(name.contains("ah"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
	}

}
