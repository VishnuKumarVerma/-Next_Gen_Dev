package edu.Quiz_App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizData {

  public void displayQuestions() {
    try (Scanner userInput = new Scanner(System.in)) {
      List<String> questions = new ArrayList<>();
      List<String> answers = new ArrayList<>();
      List<String> markedOptionList = new ArrayList<>();
      ProblemSet data = new ProblemSet();
      Timer timer = new Timer();

      questions.add(data.getQuestion1());
      questions.add(data.getQuestion2());
      questions.add(data.getQuestion3());
      questions.add(data.getQuestion4());
      questions.add(data.getQuestion5());

      answers.add(data.getAnswer1());
      answers.add(data.getAnswer2());
      answers.add(data.getAnswer3());
      answers.add(data.getAnswer4());
      answers.add(data.getAnswer5());

      final int[] command = { -1 };
      int index = 0;
      String markedOption = "";
      boolean finalQuestionReached = false;

      while (command[0] != 0 && index < questions.size() && !finalQuestionReached) {
        if (index == questions.size() - 1) {
          finalQuestionReached = true;
        }
        timer.schedule(new TimerTask() {
          @Override
          public void run() {
            System.out.println("Time's up! Press Enter for next question.");
            command[0] = 1; // Automatically move to the next question
          }
        }, 10000); // 2 minutes in milliseconds

        if (finalQuestionReached) {
          timer.cancel();
        }

        System.out.println(questions.get(index));
        System.out.println("Enter options from 'a','b','c','d'");
        markedOption = userInput.nextLine();
        markedOptionList.add(markedOption);
        index++;
      }

      int marks = 0;
      for (int i = 0; i < 5; i++) {
        if (answers.get(i).equals(markedOptionList.get(i))) {
          marks++;
        }
      }

      System.out.println("Your Total Marks is: " + marks);
    }
  }
}