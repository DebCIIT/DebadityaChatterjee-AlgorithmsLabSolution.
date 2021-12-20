package gl.dsa1;
import java.util.Scanner;

public class Transaction {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array.");  
		
		int size  = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the values of array:");  
				
		for(int i = 0; i <size; i++) 
			
			array[i] = sc.nextInt();
		
		System.out.println();// output of values
		System.out.println("Values of array:");
		for(int i = 0;i< size;i++) {
			System.out.print(array[i] + " " );
			
					}
		System.out.println();
		System.out.println();
		System.out.println("Enter the total no of targets that needs to be achieved."); 
		
		int targetNo  = sc.nextInt();
		
		
		while (targetNo != 0) {
		
		int flag = 0;
		
		long target;	
		
		System.out.println();
		System.out.println("Enter the target value:");
		target = sc.nextInt();
		
		
		long sum = 0;
		
		for ( int i = 0; i < size; i++) { 
			
			sum += array[i];
		
		if (sum >= target) {
			
			
	    	System.out.println("Target acheived after "+ (i + 1)  + " " +"transactions.");	
			
			flag = 1;
				
			break;
		}
		
		}

if (flag == 0) {
	System.out.println("Given Target is not achieved.");	
}

}
		sc.close();
} 


}
