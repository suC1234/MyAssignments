package week1.day2;

public class Lengthoflastword {

	public static void main(String[] args) {
		String s="luffy is still joyboy";
		String[] split = s.split("");
		System.out.println("Output:"+ split[split.length-1].length());
	}

}
