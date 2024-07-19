  package edu.Quiz_App;

  public class ProblemSet {
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;

    public ProblemSet() {
      this.question1 = "What is the Java Virtual Machine (JVM)?\n" +
          "A) To compile Java source code into bytecode\n" + //
          "B) To interpret and execute Java bytecode\n" + //
          "C) To manage memory allocation only\n" + //
          "D) To provide an integrated development environment (IDE)";
      this.question2 = "2. What are the main principles of Object-Oriented Programming (OOP) in Java?\n" +
          "A) Encapsulation\n" + //
          "B) Inheritance\n" + //
          "C) Compilation\n" + //
          "D) All Of the above\n";
      this.question3 = "3. What is the difference between == and .equals() in Java?\n"
          + "A) == checks for value equality, .equals() checks for reference equality\n" + //
          "B) == checks for reference equality, .equals() checks for value equality\n" + //
          "C) == checks for null values, .equals() checks for empty values\n" + //
          "D) == and .equals() are the same";
      this.question4 = "4. What is a Constructor in Java?\n" +
          "A) A method that is called automatically to initialize an object when it is created\n" + //
          "B) A static method that returns the current object\n" + //
          "C) A special variable that holds the address of the object\n" + //
          "D) A method that is used to delete an object";
      this.question5 = "5. What is the difference between an Array and an ArrayList in Java?\n" +
          "A) An array can grow dynamically, an ArrayList has a fixed size\n" + //
          "B) An array can hold elements of different types, an ArrayList can only hold elements of the same type\n" + //
          "C) An array has a fixed size, an ArrayList can grow and shrink dynamically\n" + //
          "D) An array provides more convenience methods for manipulating elements than an ArrayList";
      this.answer1 = "b";
      this.answer2 = "d";
      this.answer3 = "b";
      this.answer4 = "a";
      this.answer5 = "b";
    }

    public String getQuestion1() {
      return question1;
    }

    public String getQuestion2() {
      return question2;
    }

    public String getQuestion3() {
      return question3;
    }

    public String getQuestion4() {
      return question4;
    }

    public String getQuestion5() {
      return question5;
    }

    public String getAnswer1() {
      return answer1;
    }

    public String getAnswer2() {
      return answer2;
    }

    public String getAnswer3() {
      return answer3;
    }

    public String getAnswer4() {
      return answer4;
    }

    public String getAnswer5() {
      return answer5;
    }
  }
