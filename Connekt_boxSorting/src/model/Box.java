package model;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Box implements Comparable<Box>{
	
	String id ;
	 
	float height;
	float weight;
	
    List<Coordinates> coordinatesList;
	
	private static final Logger LOGGER = Logger.getLogger(Box.class.getName());
	
	public Box(List<Coordinates> coordinatesList) {
		
		if (!validateCoordinates(coordinatesList))
		{
			
			LOGGER.info("must provide 4 sets of coordinates");
		}
		      id = UUID.randomUUID().toString();
		      this.coordinatesList=coordinatesList;
	}
	

	public List<Coordinates> getCoordinatesList() {
		return coordinatesList;
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
	
	public float getHighestY(List<Coordinates> list) {
		 
		float max=Integer.MIN_VALUE;
		
		for(Coordinates c: list) {
			
			if(c.getY()>(float)max)
			{
				max=c.getY();
			}
		
		}
	
		return max;
}



public int compare(Box box1, Box box2) {

	System.out.println("Inside the compare function...");
	float Box1HighestY = getHighestY(box1.getCoordinatesList());
	float Box2HighestY = getHighestY(box2.getCoordinatesList());

	//ascending order
	return Float.compare(Box1HighestY, Box2HighestY);
	
//	return 	(int) (Box1HighestY-Box2HighestY);
}




@Override
public int compareTo(Box b) {
	
	   LOGGER.info("Inside the compare function .. ");
      if(getHighestY(this.coordinatesList)>getHighestY(b.getCoordinatesList()))
      {
    	  return 1;
      }
      else if(getHighestY(this.coordinatesList)<getHighestY(b.getCoordinatesList()))
      {
    	  return -1;
      }
	return 0;
}
	


}

