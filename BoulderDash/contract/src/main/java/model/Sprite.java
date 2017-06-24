package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

	/** The image. */
	private Image image;

	/** The image name. */
	private String imageName;

	/** The console image. */
	private char consoleImage;

	/** The is image loaded. */
	private boolean imageLoaded;

	public static int LEVEL;

	public static int SPRITE_SIZE = 16;


	/**
	 * Instantiates a new sprite.
	 *
	 * @param consoleImage
	 *            the character identifing the element
	 */
	public Sprite(final char consoleImage) {

		this.setConsoleImage(consoleImage);
		try {
			this.loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// this.setImageName(imageName);
	}



	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public final Image getImage() {
		return this.image;
	}


	/**
	 * Loads image.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public final void loadImage() throws IOException {

		BufferedImage buffer;
		
		switch(getConsoleImage()){

		case 'C': 
		case 'c':
		case 'H':
		case 'h':
		buffer = ImageIO.read(new File("pics/charspritesheet.png"));
			break;
		
		default:
			buffer = ImageIO.read(new File("pics/spritesheet.png"));
			
			switch(getConsoleImage()){
			case 'W':
			case 'B':
				buffer = buffer.getSubimage(0*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);
				break;
			case 'M':
				buffer = buffer.getSubimage(1*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case '_':
				buffer = buffer.getSubimage(2*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case 'O':
				buffer = buffer.getSubimage(3*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case 'D':
				buffer = buffer.getSubimage(4*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case 'E':
				buffer = buffer.getSubimage(5*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case 'X':
				buffer = buffer.getSubimage(6*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);
				break;
			case 'A':
				buffer = buffer.getSubimage(7*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case 'S':
				buffer = buffer.getSubimage(8*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
			case 'P':
				buffer = buffer.getSubimage(1*SPRITE_SIZE,SPRITE_SIZE*4*(LEVEL-1) , SPRITE_SIZE, SPRITE_SIZE);			
				break;
				
			}
			setImage(buffer);
			setImageLoaded(true);
			break;
		}
	

		
	}

	/**
	 * Gets the console image.
	 *
	 * @return the consoleImage
	 */
	public final char getConsoleImage() {
		return this.consoleImage;
	}

	/**
	 * Sets the image.
	 *
	 * @param image
	 *            the new image
	 */
	public void setImage(final Image image) { //changed to public for debug
		this.image = image;
	}

	/**
	 * Sets the console image.
	 *
	 * @param consoleImage
	 *            the consoleImage to set
	 */
	private void setConsoleImage(final char consoleImage) {
		this.consoleImage = consoleImage;
	}

	public int getLevel() {
		return LEVEL;
	}

	public void setLevel(int level) {
		this.LEVEL = level;
	}

	/**
	 * Gets the image name.
	 *
	 * @return the imageName
	 */
	public final String getImageName() {
		return this.imageName;
	}

	/**
	 * Sets the image name.
	 *
	 * @param imageName
	 *            the imageName to set
	 */
	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Checks if is image loaded.
	 *
	 * @return true, if is image loaded
	 */
	public final boolean isImageLoaded() {
		return this.imageLoaded;
	}

	/**
	 * Sets the image loaded.
	 *
	 * @param isImageLoaded
	 *            the new image loaded
	 */
	public final void setImageLoaded(final boolean isImageLoaded) {
		this.imageLoaded = isImageLoaded;
	}
}
