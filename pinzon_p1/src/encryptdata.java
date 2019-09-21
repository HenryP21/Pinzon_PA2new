import java.util.Scanner;
public class encryptdata {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int code; /* 4 digit code entered by use*/
		int encryptedCode; /*the new code achieved through encryption*/
		
		System.out.println("Enter 4 digit integer: ");
		code = scnr.nextInt();
		int n1 = 0; /*1st integer number*/
		int n2 = 0; /*2nd integer number*/
		int n3 = 0; /*3rd integer number*/
		int n4 = 0; /*4th integer number*/

		
		/*calculations for new encrypted numbers*/
		n1 = (code/1000 %10 + 7)%10; 
		n2 = (code/100 %10 + 7)%10; 
		n3 = (code/10 %10 + 7)%10; 
		n4 = (code%10 + 7)%10; 
				
		
		scnr.close();
	    encryptedCode = n3*1000 + n4*100 + n1*10 + n2; /* The switching between 1st and 3rd digits, and the 2nd with 4th*/
	    System.out.println("The encrypted integer is: " + encryptedCode);
	
	}

}



