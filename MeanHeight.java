import java.util.Scanner;

public class MeanHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Create and Initialise an array that stores the height of 11 players
		double[] arr=new double[11];		

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextDouble();		
		}
		//Initial total sum to 0
		double total=0.0;
		
		//find the sum of heights of all 11 players
		for(int i=0;i<arr.length;i++){
			total+=arr[i];
		}
		
		double mean=total/11;
		//Display the mean
		System.out.println(mean);
			
	}
}
