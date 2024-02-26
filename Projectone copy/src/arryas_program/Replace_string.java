package arryas_program;

public class Replace_string 
{

	public static void main(String[] args) {
		String name= "Samlee";
		System.out.println(name.replaceAll("a", ""));
		System.out.println(name.replaceAll("a", "A"));// here we are replacing a with A
		String quote="I love my country";
		System.out.println(quote.replaceAll(" ", ""));//here we are replacing space
		String a="country123";
		System.out.println(a.replaceAll("[a-z]", ""));// here we are replacing alpahabets
		String a1="My Name Is Samlee";
		System.out.println(a1.replaceAll("[a-z]",""));// here we are printing only first letter
		System.out.println(a1.replaceAll("[ a-z ]", ""));//here we are printing only first letter without space
		
		
	}

}
