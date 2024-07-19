package edu.Quiz_App;

import java.util.Scanner;

public class MainSystem {
  public static void main(String[] args) {
    Guidelines guidelines = new Guidelines();
    guidelines.generalGuidelines();

    try (Scanner userInput = new Scanner(System.in)) {

      QuizData quizData = new QuizData();
      quizData.displayQuestions();
    }
  }
}
