package net.sduhsd.royr6099.pixlab;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName,
	 *         height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}
	
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}
	
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
				
				pixelObj.setRed(average);
				pixelObj.setGreen(average);
				pixelObj.setBlue(average);
			}
		}
	}
	
	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (1.0 * pixelObj.getBlue() / pixelObj.getGreen() < 1) {
					int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
					
					pixelObj.setRed(average);
					pixelObj.setGreen(average);
					pixelObj.setBlue(average);
				}
				//pixelObj.setGreen((int) Math.min(255, pixelObj.getGreen() * 1.2));
				//pixelObj.setRed((int) Math.min(255, pixelObj.getRed() * 1.8));
				//pixelObj.setBlue(Math.min(255, pixelObj.getBlue() * 2));
			}
		}
	}
	
	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	
	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from right to left
	 */
	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}
	
	public void mirrorHorizotal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int col = 0; col < width; col++) {
			int height = pixels.length;
			for (int row = 0; row < height / 2; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}
	
	public void mirrorHorizotalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int col = 0; col < width; col++) {
			int height = pixels.length;
			for (int row = 0; row < height / 2; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				topPixel.setColor(bottomPixel.getColor());
			}
		}
	}
	
	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		
		Pixel topRight = null;
		Pixel bottomLeft = null;
		
		int width = pixels[0].length;
		int height = pixels.length;
		
		int max = Math.min(width, height);
		
		for (int row = 0; row < max; row++) {
			for (int col = 0; col < row; col++) {
				topRight = pixels[col][row];
				bottomLeft = pixels[row][col];
				
				topRight.setColor(bottomLeft.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {
				count++;
				
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		
		System.out.println("The inner loop ran " + count + " times.");
	}
	
	public void mirrorArms() {
		int mirrorPoint = 190;
		
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 158; row < mirrorPoint; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 100; col < 170; col++) {				
				topPixel = pixels[row][col];
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				
				bottomPixel.setColor(topPixel.getColor());
			}
		}
		
		// loop through the rows
		for (int row = 158; row < mirrorPoint; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 239; col < 305; col++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];

				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}
	
	public void mirrorGull() {
		Pixel[][] pixels = this.getPixels2D();
		
		Pixel originalPixel = null;
		Pixel newPixel = null;
		
		int width = pixels[0].length;
		int height = pixels.length;
		
		for (int row = 230; row < 330; row++) {
			for (int col = 230; col < 350; col++) {				
				originalPixel = pixels[row][col];
				newPixel = pixels[row + 15][col + 120];
				
				newPixel.setColor(originalPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in
	 * the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	
	public void copy(Picture fromPic, int originRow, int originCol, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] rawFromPixels = fromPic.getPixels2D();
		
		Pixel[][] fromPixels = new Pixel[endRow - startRow + 1][endCol - startCol + 1];
		for (int row = startRow; row <= endRow; row++) {
			for (int col = startCol; col <= endCol; col++) {
				fromPixels[row - startRow][col - startCol] = rawFromPixels[row][col];
			}
		}
		
		for (int fromRow = 0, toRow = originRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = originCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}
	
	public void myCollage() {
		Picture gull = new Picture("seagull.jpg");
		
		Picture bike = new Picture("redMotorcycle.jpg");
		bike.negate();
		bike = bike.scale(0.25, 0.75);
		
		Picture koala = new Picture("koala.jpg");
		koala.grayscale();
		koala = koala.scale(0.2, 0.2);
		
		this.copy(gull, 10, 10, 230, 230, 330, 350);
		this.copy(bike, 10, 400);
		this.copy(koala, 10, 200);
		
		this.mirrorHorizotal();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel[][] pixels = this.getPixels2D();
		
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		
		Color rightColor = null;
		
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
		
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		
		Color topColor = null;
		
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < pixels.length - 1; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[row + 1][col];
				
				topColor = topPixel.getColor();
				
				if (!topColor.equals(Color.BLACK)) {
					if (bottomPixel.colorDistance(topColor) > edgeDist)
						topPixel.setColor(Color.BLACK);
					else
						topPixel.setColor(Color.WHITE);
				}
			}
		}
	}
	
	public void myEdgeDetection(int edgeDist, int blockSize) {
		Pixel[][] pixels = this.getPixels2D();
				
		Pixel topLeft = null;
		Pixel topRight = null;
		
		Pixel botLeft = null;
		Pixel botRight = null;
				
		Color c;
		
		for (int rowBlock = 0; rowBlock < pixels.length / blockSize; rowBlock++) {
			for (int colBlock = 0; colBlock < (pixels[0].length) / blockSize; colBlock++) {
				topLeft = pixels[rowBlock * blockSize][colBlock * blockSize];
				topRight = pixels[rowBlock * blockSize][(colBlock + 1) * blockSize - 1];
				
				botLeft = pixels[(rowBlock + 1) * blockSize - 1][colBlock * blockSize];
				botRight = pixels[(rowBlock + 1) * blockSize - 1][(colBlock + 1) * blockSize - 1];
				
				Pixel[] comparbois = {topLeft, topRight, botLeft, botRight};
				
				double dist = 0;
				for (Pixel o : comparbois) {
					for (Pixel t : comparbois) { 
						dist = Math.max(dist, o.colorDistance(t.getColor()));
					}
				}
				
				
				if (dist > edgeDist)
					c = Color.BLACK;
				else
					c = Color.WHITE;
				
				for (int row = rowBlock * blockSize; row < (rowBlock + 1) * blockSize; row++) {
					for (int col = colBlock * blockSize; col < (colBlock + 1) * blockSize; col++) {
						pixels[row][col].setColor(c);
					}
				}
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
