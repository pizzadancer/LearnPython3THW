package practice_8;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int min, max;
		
		//read inputs
		for (int index = 0; index < array.length; index++){
			System.out.println("Enter an integer");
			array[index] = scan.nextInt();
		}
		
		max = array[0];
		min = array[0];
		
		//check for max/min
		for (int index = 0; index < array.length; index++){
			if (array[index] > max){
				max = array[index]; 
			}
			if (array[index] < min){
				min = array[index];
			}
		}//end loop
		
		System.out.println("min is " + min);
		System.out.println("max is " + max);
		
		
		
		
		
		
		
		
	}

}
