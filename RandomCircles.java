package week2;

import acm.util.RandomGenerator;
import java.awt.color.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class RandomCircles extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int totalCircles = 10;
	private static final int minRadius = 5;
	private static final int maxRadius = 50;
	
	public void run() {
		for(int i=0; i<totalCircles; i++ ) {
			addCircles();
		}
	}
	
	private void addCircles() {
		double radius = rgen.nextDouble(minRadius, maxRadius);
		double x = rgen.nextDouble(0, getWidth() - radius*2);
		double y = rgen.nextDouble(0, getHeight() - radius*2);
		GOval circle = new GOval(x, y, radius*2, radius*2);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
	
}

