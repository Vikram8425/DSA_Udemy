/*2D Arrays
Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
sumDiagonalElements(myArray2D) # 15
*/
package Array;
class DiagonalElements {
	//My End
    public static int sumDiagonalElements(int[][] array) {
      int sum=0;
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[0].length;col++){
                if(row==col){
                    sum=sum+array[row][col];
                }
            }

        }
return sum;
  }
    
    	//Optimize Way
        public static int sumDiagonalElement(int[][] array) {
            int sum = 0; 
            int numRows = array.length;
     
            for (int i = 0; i < numRows; i++) {
                sum += array[i][i];
            }
     
            return sum;
        }
    
}
public class Coding_Exercise_2 {
	
	public static void main(String arg[]) {
		int myArray2D[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sumDiagonalElements = DiagonalElements.sumDiagonalElements(myArray2D);
		System.out.println(sumDiagonalElements);
		int sumDiagonalElement = DiagonalElements.sumDiagonalElement(myArray2D);
		System.out.println(sumDiagonalElement);
	}
}

