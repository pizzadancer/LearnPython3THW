package practice_8;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rand = new Random ();
		
		System.out.println("How many n's would you like?");
		int n = scan.nextInt();
		int[]array = new int[n*n];
		int count = 0;
		int days = 0;
		double [] dayArr = new double[n];
		double total = 0.0;
		
		for (; days < n; days++){
			System.out.println("Day " + days);
			for (int index = 0; index < n; index ++){
				array [count]= rand.nextInt((80-60) + 1) + 60;
				System.out.println(array[count]);
				total += array[count];
				count++;
			}
			System.out.println(total);
			if (days < 1){
				dayArr[days] = total;
			}else{
				dayArr[days] = total - dayArr[days-1];
			}
			
		}
		System.out.println("Total days " + (n));
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(dayArr));
		
		
//		double total = 0.0;
//		for (int x = 0; x< array.length;x++){
//			total += array[x];
//		}
//		System.out.println("Total: " + total);
//		System.out.println("Average: " + total/array.length);
	

		
	}

}
