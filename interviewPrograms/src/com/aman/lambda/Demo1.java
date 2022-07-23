package com.aman.lambda;

public class Demo1 {

	public static void main(String[] args) {

		int width = 10;
		
		// without Lambda Expression interface imp. using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing : "+ width);
			}
		};
		
		d.draw();
		
		// with Lambda expression
		Drawable d1 = () -> {
			System.out.println("Drawing(with Lambda) : "+ width);
		};
		
		d1.draw();
		
		
		
		
	}

}



interface Drawable{
	
	public void draw();
}
