package edu.StudentGradeCalculator;

import java.util.Scanner;

public class StudentMarks {

  private int numSubjects;
  private double[] marks;
  private String[] subjects;

  public StudentMarks(int numSubjects, Scanner scanner) {
    this.numSubjects = numSubjects;
    this.marks = new double[numSubjects];
    this.subjects = new String[numSubjects];
    studentsSubjects(scanner);
    takeInput(scanner);
  }

  public void studentsSubjects(Scanner scanner) {
    for (int i = 0; i < numSubjects; i++) {
      System.out.printf("Enter the name of the subject %d: ", i + 1);
      subjects[i] = scanner.nextLine();
    }
  }

  private void takeInput(Scanner scanner) {
    for (int i = 0; i < numSubjects; i++) {
      System.out.print("Enter marks obtained in subject " + subjects[i] + " (out of 100): ");
      double mark = scanner.nextDouble();
      while (mark < 0 || mark > 100) {
        System.out.println("Invalid input. Please enter marks between 0 and 100.");
        mark = scanner.nextDouble();
      }
      marks[i] = mark;
    }
  }

  public double calculateTotalMarks() {
    double total = 0;
    for (double mark : marks) {
      total += mark;
    }
    return total;
  }

  public double calculateAveragePercentage() {
    return calculateTotalMarks() / numSubjects;
  }
}