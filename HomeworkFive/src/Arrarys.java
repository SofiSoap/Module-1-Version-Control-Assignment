import java.util.Scanner;


public class Arrarys {

	public static void main(String[] args) {

		//make array
		int size = 100;
		
		int [] array = new int [size] ;
		
		//assign value
		for(int i = 0 ; i < array.length ; i++) {
			
			array[i] = (int)((Math.random())* 100) ; //USE MATH.RANDOM *n100-------------------------------------------------------------------
		}
		
		printArray(array);
		
		//Sort Array and Take in sorted array
		int[] sortedArray = new int[size];
		sortedArray = sortArray(array);
		
		//Print sorted array
		printSortedArray(sortedArray);
		
		//Search for number
		searchForNumber(sortedArray);
		
		//Find How many numbers
		findHowManyNumbers(sortedArray);
		
		//Find Average
		findAverage(sortedArray);
		
		//Display Max and Min
		displayMaxMin(sortedArray);
		
		
	}//END OF MAIN--------------------------------------------------------------------------------
	
	public static void printArray (int array[]) {
		System.out.println(" ");
		System.out.println("Here is the original array: ");
		
		for(int i = 0 ; i < array.length ; i++) {
			
			System.out.println(array[i]);
		}
		
	}//END OF PRINTARRAY--------------------------------------------------------------------------------
	
	public static int[] sortArray(int array[]) {
		
		System.out.println(" ");
		 int n = array.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (array[j] > array[j+1])
	                {
	                    // swap 
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	        
	        int[] results = array;
	        return results;
	        
	       
	}//END OF SORTARRAY--------------------------------------------------------------------------------
	
	public static void printSortedArray(int[] sortedArray) {
		
		System.out.println(" ");
		System.out.println("Here is the sorted array:");
		
		for(int i = 0 ; i < sortedArray.length ; i++) {
		System.out.println(sortedArray[i]);
		}
		
	}//END OF PRINTSORTEDARRAY--------------------------------------------------------------------------------
	
	public static void searchForNumber(int array[]) {
		
		System.out.println(" ");
		int number = -1;
		
		//ask user to  enter number to search for
		Scanner searchForNumber = new Scanner(System.in);
		
		do {
		System.out.println("Please enter the number you want to seach for in the array (between 0 and 100:");
		number = searchForNumber.nextInt();
		}while (number > 100 || number < 0);
		
		if (number <= 100 && number>= 0) {
		for (int i = 0; i< array.length; i++) {
			
			if(number == array[i]) {
				System.out.println("Your number was Found");
			}
			
			
		}
		}
		
		}//END OF SEARCH FOR NUMBER--------------------------------------------------------------------------------
	
	public static void findHowManyNumbers(int[] sortedArray) {
		System.out.println(" ");
		
     for(int i=1; i < sortedArray.length; i++){

         if(sortedArray[i] > 0 && sortedArray[i] == 1){
          System.out.printf("%d occurs %d time\n",i, sortedArray[i]);
          }
         else if(sortedArray[i] >=2){
             System.out.printf("%d occurs %d times\n",i, sortedArray[i]);
         }
     }
	}//END--------------------------------------------------------------------------------
	
	public static void findAverage(int array[]) {
		
		System.out.println(" ");
		
		int average = 0, sum =0;
		
		for (int i = 0; i< array.length; i++) {
			
			  sum+=array[i];
		}
		
		average = sum / array.length;
		
		System.out.println("The average of the array is: " );
		System.out.println( average);
		
	}//end--------------------------------------------------------------------------------
	
	public static void displayMaxMin(int[] sortedArray) {
		
		System.out.println(" ");
		
		System.out.println("The maximum value in the array is:");
		System.out.println(sortedArray[0]);
		
		System.out.println(" ");
		
		System.out.println("The maximum value in the array is:");
		System.out.println(sortedArray[99]);
		
	}

}
