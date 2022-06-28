package Homework9;

import java.util.Scanner;

public class Qualification extends Teacher {
	
	
	
	public Qualification() {
		
		System.out.println("Please enter a course: ");
		Scanner scan = new Scanner(System.in);
		setCourse(scan.next());
		System.out.println("Please enter experience years: ");
		setExpYears(scan.nextInt());
		System.out.println("Please enter schedule: ");
		setSchedule(scan.next());
		scan.close();
		
	}
	
	
	public void Check() {
		System.out.println(course);
		System.out.println(expYears);
		System.out.println(schedule);
		
		if (course == "Java" && expYears >= 3 && schedule == "Afternoon") {
			
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}
	

}
