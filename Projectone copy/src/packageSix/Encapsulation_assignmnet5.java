package packageSix;

class name
{
	private char starting_letter='s';

	public char getStarting_letter() {
		return starting_letter;
	}

	public void setStarting_letter(char starting_letter) {
		this.starting_letter = starting_letter;
	}
	
}

public class Encapsulation_assignmnet5 
{

	public static void main(String[] args) {
		name n= new name();
		n.setStarting_letter('p');
		System.out.println(n.getStarting_letter());

	}

}
