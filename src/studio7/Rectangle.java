package studio7;

public class Rectangle {

	private int length;
	private int height;
	
public Rectangle (int initialLength, int initialHeight) {
	
	length = initialLength;
	height = initialHeight;
}

public int area () {
	int area = length * height;
	return area;
}

public int perimeter (){
	int perimeter = (2*length) + (2*height);
	return perimeter;
}

public boolean isSquare () {
	boolean square = false;
	if (length == height) {
		square = true;
	}
	return square;
}
	public static void main(String[] args) {
	
	Rectangle r1 = new Rectangle (4, 5);
	System.out.println(r1.area());
	System.out.println(r1.perimeter());
	System.out.println(r1.isSquare());
	
	Rectangle r2 = new Rectangle (4, 4);
	System.out.println(r2.area());
	System.out.println(r2.perimeter());
	System.out.println(r2.isSquare());
	
	
		
		
		

	}

}
