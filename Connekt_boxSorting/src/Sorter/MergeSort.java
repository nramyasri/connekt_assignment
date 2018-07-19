package Sorter;

import java.util.List;

import model.Box;
import model.Coordinates;

public class MergeSort implements Comparable<Box> {

	Box[] boxes,aux;
	
	public MergeSort(Box[] items)
    {
        this.boxes = items;

        /* We have to make aux a distinct array from items */
        this.aux = new Box[items.length];
    }
	
	
	
	 public void sort()
	    {
		    System.out.println("Inside the merge sort method");
	        this.sort(0, this.boxes.length - 1);
	    }
	
	
	 private void sort(int low, int high)
	    {
	        if (low >= high)
	        {
	           
	            return;
	        }

	        /* Compute the midpoint */
	        int mid = low + ((high - low) / 2);

	        /* Sort the first half */
	        this.sort(low, mid);

	        /* Sort the second half */
	        this.sort(mid + 1, high);

	        /* Merge the 2 halves */
	        this.merge(low, mid, high);
	    }
	 
	 private void merge(int low, int mid, int high)
	    {
	        int i = low;        // Index value in main array

	        int j = low;        // Index to the first half of the aux array
	        int k = mid + 1;    // Index to the second half of the aux array

	        /* Update the aux Array */
	        for (int x = low; x <= high; x++)
	        {
	            this.aux[x] = this.boxes[x];
	        }

	        while (j <= mid || k <= high)
	        {
	            if (j > mid)
	            {
	                /* The first half is already finished, lets just go through the second half */
	                this.boxes[i] = this.aux[k++];
	            }
	            else if (k > high)
	            {
	                /* The second half is already finished, lets just go through the first half */
	                this.boxes[i] = this.aux[j++];
	            }
	            else if (this.aux[j].compareTo(this.aux[k]) > 0)
	            {
	                /* If aux[j] is > aux[k] */
	                this.boxes[i] = this.aux[k++];
	            }
	            else
	            {
	                /* If aux[j] is <= aux[k] */
	                this.boxes[i] = this.aux[j++];
	            }

	            i++;    // Increment the position we're at in the main array
	        }
	    }
	
	 public Box[] getSortedItems()
	    {
	        return this.boxes;
	    }
	
	 
	 public int compareTo(Box b1,Box b2) {
		
		  
	      if(getHighestY(b1.getCoordinatesList())>getHighestY(b2.getCoordinatesList()))
	      {
	    	  return 1;
	      }
	      else if(getHighestY(b1.getCoordinatesList())<getHighestY(b2.getCoordinatesList()))
	      {
	    	  return -1;
	      }
		return 0;
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



	
	public int compareTo(Box o) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	
}
