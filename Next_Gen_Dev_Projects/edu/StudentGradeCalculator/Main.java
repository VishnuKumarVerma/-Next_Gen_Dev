package edu.StudentGradeCalculator;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the number of subjects: ");
      int numSubjects = scanner.nextInt();
      scanner.nextLine();

      StudentMarks studentMarks = new StudentMarks(numSubjects, scanner);
      double totalMarks = studentMarks.calculateTotalMarks();
      double averagePercentage = studentMarks.calculateAveragePercentage();
      String grade = GradeCalculator.calculateGrade(averagePercentage);

      System.out.println("\n--- Results ---");
      System.out.printf("Total Marks: %.2f out of %.2f%n", totalMarks, (double) numSubjects * 100);
      System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
      System.out.println("Grade: " + grade);
    }
  }
}