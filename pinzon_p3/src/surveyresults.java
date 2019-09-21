import java.util.Scanner;
public class surveyresults {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);	
String[] topics = {"politics", "environment", "stocks", "entertainment", "technology"}; /*1D array includes topics used in poll*/
int[][] responses = new int[5][11]; /*the responses for every topic*/
double avg; /*the average calculated*/
int lowestsum = 500; /*the total score cannot be larger than this number*/
int largestsum = 0; /*the total score can be larger than this number*/
int totalscore = 0;
char userInput;/*the character determining if another user will answewr the survey*/
int usernum = 0; /*the number of users that answer survey*/
String largeTopic = ""; /*the topic with the highest score*/
String lowTopic = ""; /*the topic with the lowest score*/

System.out.println("Rate each topic 1-10: ");

while(true) {
for(int i = 0; i < 5; ++i) { /*this loop prints out every topic and allows the user to rate the topic on screen*/
	System.out.println("Topic: " + topics[i]);
	System.out.print("Enter rating: ");
	int j = scnr.nextInt();
	responses[i][j]++;
}

System.out.println("Would another user like to take the survey? (y or n): ");
userInput = scnr.next().charAt(0);/*if the user answers 'n' then the survey stops running and the table is displayed*/
usernum++;
if(userInput != 'y') {
	
	break;
}
}




System.out.print("Topics   ");
System.out.print("1      ");
System.out.print("2       ");
System.out.print("3         ");
System.out.print("4        ");
System.out.print("5          ");
System.out.print("6        ");
System.out.print("7        ");
System.out.print("8       ");
System.out.print("9       ");
System.out.print("10   "); 
System.out.println("|Avg ratings");
System.out.println("-----------------------------------------------------"
+ "---------------------------------------------------");



for(int i = 0;i <5; ++i) {
	System.out.println(topics[i]); /*prints the topics in the array*/
	totalscore = 0; /*0 is the initial value of all ratings for all topics*/

	
	for(int j = 1; j <= 10; ++j) {
	System.out.print("        " + responses[i][j]); /*prints the columns showing the amount of times a rating is given to a certain topic*/
	totalscore += responses[i][j] * j; /*multiplies the amount of times a rating was given with the number of the rating itself*/
	
	
	}
	
	avg = (totalscore/usernum);
	System.out.printf("  |  %.2f\n", avg);
	
	if(largestsum< totalscore) { /*Gathers the largest total along with the topic containing said rating*/
		largestsum = totalscore;
		largeTopic = topics[i];
	}
	
	
		if(lowestsum>totalscore) { /*Gathers the lowest total along with the topic containing said rating*/
		lowestsum = totalscore;
		lowTopic = topics[i]; 
		}
	
	}
scnr.close();

System.out.println(largeTopic + " has the highest total score of " + largestsum);
System.out.println(lowTopic + " has the lowest total score of " + lowestsum);
	
	
	}	
}



		
		
		
	



