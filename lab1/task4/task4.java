package task4;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
		Random random = new Random();

		int n = 3;
		int[] myArray = new int[n];
        boolean flagNoPrime=true;

		for (int i = 0; i < n; i++) {
			myArray[i]= random.nextInt(100);
			System.out.print(myArray[i] + ", ");
		}
		System.out.println();
        
		for (int i = 0; i < myArray.length; i++) {
			boolean flag = true;
           
			for (int j = 2; j < myArray[i]; j++) {
				if (myArray[i] % j == 0) {
					flag = false;
                   
				}
			}
			if (flag == true) {
				System.out.println(i + ") " + myArray[i]);
                flagNoPrime=false;
			}
		}
        if(flagNoPrime==true){
            {
                System.out.println("No prime");
            }
        }
	}
}