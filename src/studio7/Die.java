package studio7;

public class Die {

	
private int n;

	
public Die (int max) {

n = max; 

}
	
	public int Roll () {
		int side = (int) (Math.random()*n)+1;
		return side;
	}


	public static void main(String[] args) {

		Die sixDie = new Die (7000);
	
	System.out.println("You rolled a " + sixDie.Roll());
		
		
	}

}
