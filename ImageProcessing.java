package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	public void run() {
		GImage original = new GImage("Candle.gif");
		GImage rotated = roatateLeft(original);
		double x0 = getWidth() / 2 - original.getWidth() -5;
		double y0 = (getHeight() - rotated.getHeight()) / 2;
		double x1 = getWidth() / 2 + 5;
		double y1 = (getHeight() - rotated.getHeight()) / 2;
		add(original, x0, y0);
		add(rotated, x1, y1);
	}
	
private GImage roatateLeft(GImage image) {
	int [] [] oldPixels = image.getPixelArray();
	int width = oldPixels[0] .length;
	int height = oldPixels.length;
	int [] [] newPixels = new int [width] [height];
	for (int i = 0; i <height; i++) {
		int j = 0;
		newPixels[width - j -1] [i] = oldPixels [i][j];
	}


	return new GImage(newPixels);
}
}
