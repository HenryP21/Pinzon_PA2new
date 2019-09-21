import java.util.Scanner;
public class decryptdata {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter 4 digit encrypted code: ");
		int encCode = scnr.nextInt(); /*The 4 digit encrypted code from earlier*/
		int decryptedCode; /*the new code achieved through decryption*/
		
		int en1 = 0; /*first digit of encrypted number*/
		int en2 = 0; /*2nd digit of encrypted number*/
		int en3 = 0; /*3rd digit of encrypted number*/
		int en4 = 0; /*4th digit of encrypted number*/
		
		/*calculations for new decrypted numbers*/
		en1 = (encCode/1000 %10 + 10 - 7)%10;
		en2 = (encCode/100 %10 + 10 - 7)%10;
		en3 = (encCode/10 %10 + 10 - 7)%10;
		en4 = (encCode%10 + 10 - 7)%10;
		
		scnr.close();
	    decryptedCode = en3*1000 + en4*100 + en1*10 + en2; /*reverse the digits that had been switched through encryption*/
		System.out.println("The decrypted integer is: " + decryptedCode);
		
		

	}

}
