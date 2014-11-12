package practice_8;
import java.util.Scanner;
public class Practice_8_test {

	public static void main(String[] args) {
		
		int[] array;
		Scanner scan = new Scanner (System.in);
		
		//det size & create array
		System.out.println("What is the length of the array");
		int size = scan.nextInt();
		array = new int[size];
		
		//read inputs
		for (int index = 0; index < array.length; index ++){
			System.out.println("Enter an integer");
			array [index] = scan.nextInt();			
		}
		
		//write inputs
		for (int index = 0; index < array.length; index ++){
			System.out.println("Array [" + index + "] = " + array[index]);			
		}

	}

}
