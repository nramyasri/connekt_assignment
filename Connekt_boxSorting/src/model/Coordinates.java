package model;

import java.util.logging.Logger;


public class Coordinates {
	
	private static final Logger LOGGER = Logger.getLogger(Coordinates.class.getName());
	
	float x;
	float y;
	
	
	
	public Coordinates(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public void showCoordinates() {
		LOGGER.info("X:" +x);
		LOGGER.info("Y:" +y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	

}
