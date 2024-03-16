/*Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87} */

package Array;
 class FirstSecond{
	  public static int[] findTopTwoScores(int[] array){
	        
	        int firstHighest=Integer.MIN_VALUE;
	        int secondHighest=Integer.MIN_VALUE;
	        
	        for(int score : array){
	            
	            if(score > firstHighest){
	                
	                secondHighest=firstHighest;
	                firstHighest=score;
	                
	            }else if( score > secondHighest && score < firstHighest){
	                
	                secondHighest=score;
	            }
	            
	        }
	        
	        return new int []{firstHighest,secondHighest};
	  }
 }
public class Coding_Exercise_3 {
	
	private static int[] findTopTwoScores;

	public static void main(String arg[]){
		int myArray[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		  findTopTwoScores = FirstSecond.findTopTwoScores(myArray);
		  for(int score : findTopTwoScores) {
			  System.out.print(score+" ");
		  }
	}

}
