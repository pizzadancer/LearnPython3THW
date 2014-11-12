package practice_8;
import java.util.Arrays;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		
		int [] array = new int [10];
		Scanner scan = new Scanner(System.in);
		int min, max;
		int minPos, maxPos;
		//read inputs
		for (int index = 0; index < array.length; index ++){
			System.out.println("Enter an integer");
			array [index] = scan.nextInt();
		}
		min = array[0];
		max = array[0];
		
		minPos = 0;
		maxPos = 0;
		
		//min, max
		for (int index = 0; index < array.length; index++){
			if (array[index] > max){
				max = array[index];
				maxPos = index;
			}
			if (array[index] < min){
				min = array[index];
				minPos = index;
			}
		}
		System.out.println(Arrays.toString(array));
		array[maxPos] = min;
		array[minPos] = max;
		System.out.println(Arrays.toString(array));

	}

}
