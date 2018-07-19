package Sorter;

import java.util.ArrayList;
import java.util.List;

import model.Box;
import model.Coordinates;

public class mergeSortTest {
	
static List<Box> boxList;
	
public static Box[] converToArray(List<Box> boxList) {
	
	Box[] array=new Box[boxList.size()];
	int i=0;
	for(Box b:boxList ) {
		
		array[i++]=b;
	}
	
	return array;
	
}
	

	public static void main(String[] args) {
	
	boxList=new ArrayList<Box>();
	//creating boxes
	List<Coordinates> coordList1=new ArrayList<Coordinates>();
	Coordinates cord1=new Coordinates(11.2f,3.3f);
	Coordinates cord2=new Coordinates(12.34f,5.53f);
	Coordinates cord3=new Coordinates(12.9f,4.81f);
	Coordinates cord4=new Coordinates(11.82f,4.35f);
	
	coordList1.add(cord1);
	coordList1.add(cord2);
	coordList1.add(cord3);
	coordList1.add(cord4);
	Box box1=new Box(coordList1);
	boxList.add(box1);
	
	//second box
	List<Coordinates> coordList2=new ArrayList<Coordinates>();
	Coordinates cord5=new Coordinates(2.9f,3.39f);
	Coordinates cord6=new Coordinates(2.52f,12.63f);
	Coordinates cord7=new Coordinates(3.48f,2.79f);
	Coordinates cord8=new Coordinates(2.98f,2.19f);
	
	coordList2.add(cord5);
	coordList2.add(cord6);
	coordList2.add(cord7);
	coordList2.add(cord8);
	Box box2=new Box(coordList2);
	boxList.add(box2);
	
	//third box
	
	List<Coordinates> coordList3=new ArrayList<Coordinates>();
	Coordinates cord9=new Coordinates(5.5f,1.71f);
	Coordinates cord10=new Coordinates(6.26f,3.31f);
	Coordinates cord11=new Coordinates(5.75f,0.51f);
	Coordinates cord12=new Coordinates(5.02f,0.85f);
	
	coordList3.add(cord9);
	coordList3.add(cord10);
	coordList3.add(cord11);
	coordList3.add(cord12);
	Box box3=new Box(coordList3);
	boxList.add(box3);
	
	System.out.println("Order before sorting :");
	
	for(Box b : boxList) {
		System.out.println(b.getHighestY(b.getCoordinatesList()) + " : " +b.getId());
	}
	
	Box[] boxArray=converToArray(boxList);
	
	
	MergeSort sort=new MergeSort(boxArray);
	sort.sort();
	
	for(Box b :sort.getSortedItems()) {
		System.out.println(b.getId());
	}
  }
	
	

}
