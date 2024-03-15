/*Middle Function
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]*/
package Array;

class Exercise_Slove{
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
 
        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];
 
        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
 
        return middleArray;
    }
}

// My Solution 
class Exercise{
    public static int[] middle(int [] array) {
       int arr[]=new int [array.length/2];
       int insert=0;
        try{
            for(int i=1;i<array.length-1;i++){   
                //System.out.print(array[i]);
                arr[insert]=array[i];
                insert++;
            }
           //  for(int i:arr){
           //      System.out.println(i);
           //  }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
       return arr;
   }

}
public class Coding_Exercise_1 {
	public static void main(String arg[]) {
		int  myArray[] = {1, 2, 3, 4};
		int[] middle = Exercise.middle(myArray);
		int[] middle2 = Exercise_Slove.middle(myArray);
		for(int mid:middle) {
			System.out.print(mid+" ");
		}
		System.out.println();
		for(int mid:middle2) {
			System.out.print(mid+" ");
		}
		
	}

}
