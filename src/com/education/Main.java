package com.education;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.add(new Data("Kustova","К.V.", "12а", 9));
		student.add(new Data("Kuchinckau","A.V.", "12", 10));
		student.add(new Data("Progevalckau","U.V.", "12d", 8));
		student.add(new Data("Petrov","I.I.", "12c", 5));
		student.add(new Data("Sokolov","A.V.", "12", 6));
		student.add(new Data("Sinigal","V.A.", "2d", 7));
		student.add(new Data("Savchenko","L.G.", "12а", 9));
		student.add(new Data("Demedenko","V.G.", "11а", 7));
		student.add(new Data("Soroko","A.V.", "12", 5));
		student.add(new Data("Urban","A.V.", "12", 6));
		
		System.out.printf(student.excellentStudents());
	}

}
