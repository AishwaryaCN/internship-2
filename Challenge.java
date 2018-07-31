package Day4;
import java.io.File;
import java.util.Scanner;

public class Challenge{
	public static void main(String arg[] )throws Exception{
		File ftable= new File("D://marks.txt");
		Scanner s= new Scanner(ftable);
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		// Prompt the user to ask how many students are there
		System.out.print("How many students are there? ");
		int numberOfStudent = input.nextInt();
		
		String topStudentName = "";
		int topStudentScore = 0;
		
		String runnerStudentName = "";
		int runnerStudentScore = 0;
		
		// For (n) student..
		for (int i = 0; i < numberOfStudent; i++)
		{
			// Ask for name
			System.out.print("What is the student's name: ");
			
			
			
			String studentName = s.next();
			// Ask for score
			System.out.print("What is the student's score: ");
			int studentScore = s.nextInt();
			
			// Test if this student is the highest?
			// If the new student beat both of them, we have to update them
			if (studentScore > topStudentScore) {
				runnerStudentName = topStudentName;
				runnerStudentScore = topStudentScore;
				
				topStudentName = studentName;
				topStudentScore = studentScore;
			}
			// If the new student only replace the runner up
			// The top student is remained unchange
			else if (studentScore > runnerStudentScore) {
				runnerStudentName = studentName;
				runnerStudentScore = studentScore;
			}
		}
		
		// Display the result
		System.out.printf("The best student is %s, and the score is %2d.", 
				topStudentName, topStudentScore);
	}
}
