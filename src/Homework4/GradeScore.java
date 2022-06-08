package Homework4;

import java.util.Scanner;

public class GradeScore {
	
	int score;
	String grade;
	String result;
	
	public void AskUserForScore() {
		System.out.println("Please enter your score: ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		scan.close();
	}
	
	public void AssignGrade() {
		grade = (score >= 90)?"FB":score >= 80 ?"B":"S";
		result = (grade == "FB")?"Ai primit : FoarteBine":(grade == "B")?"Ai primit : Bine":"Ai primit : Suficient";
		System.out.println(result);
	}
}
