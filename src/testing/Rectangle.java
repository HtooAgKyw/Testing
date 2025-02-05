package testing;

//Rectangle class
class Rectangle {
	private int length;
	private int width;

	/*
	 * public Rectangle() { this.length = 0; this.width = 0; }
	 */

	Rectangle() {
		// TODO Auto-generated constructor stub
		length = 0;
		width = 0;
	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

//	public Rectangle(int length, int width) {
//		this.length = length;
//		this.width = width;
//	}

	public int calculateArea() {
		return length * width;
	}

	public void display() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + calculateArea());
	}
}
