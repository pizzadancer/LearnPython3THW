package practice_8;
import java.util.Arrays;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int [10];
		int evenCount = 0;
		
		
		//read inputs
		for (int index = 0; index < array.length; index++){
			System.out.println("Enter an integer");
			array[index] = scan.nextInt();
		}
		System.out.println(Arrays.toString(array));
		//how many even numbers in array?
		for (int index = 0; index < array.length; index++){
			if (array[index] % 2 == 0){
				evenCount++;
			}
		}
		
		//is the array even?
		if(evenCount % 2 == 0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
