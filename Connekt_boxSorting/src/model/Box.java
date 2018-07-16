package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Box {
	
	String id = UUID.randomUUID().toString();
	 
	float height;
	float weight;
	
	public Box(final List<Coordinates> coordinatesList) {
		
		
		if (!validateCoordinates(coordinatesList))
		{
			// Log 
			// calculateHeight
			// calculateWidth
			// GenerateId
			
			LOGGER.info("must provide 4 sets of coordinates");
		}
	}
	
	private boolean validateCoordinates(List<Coordinates> coordinatesList) {
		
		if(coordinatesList.size()!=4) {
			return false;
		}
		
		return true;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
