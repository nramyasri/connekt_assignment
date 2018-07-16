import java.lang.*;
import java.io.*;
import java.util.*;


class learningTest{
  
  
  public static void main(String args[]) {
    
    
    String output= reverseString("Hello World",1);
    System.out.println(output);
    
  }
  
  
  public static String reverseString(String input, int num){
    
    
    String[] arr= input.split(" ");
    
    StringBuilder newString= new StringBuilder();
    
    for(int i=0;i<arr.length;i++){
      
      
           
      
           if((i)==num-1){
        	   System.out.println(arr[i]);
             
            // String str = arr[i+1];
             StringBuilder str2= new StringBuilder();
             
              char[] try1 = arr[i].toCharArray();
 
            for (int k = try1.length-1; k>=0; k--)
               str2.append(try1[k]);
             
            System.out.println(str2);
              newString.append(str2);
              
              newString.append(" ");
             
             
             
             
           }
      
           else {
      newString.append(arr[i]);
          
      
           newString.append(" ");
           }
    }
    
    return newString.toString().trim();
    
  } 
  
  
}