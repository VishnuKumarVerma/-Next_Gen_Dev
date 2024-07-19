# Student Grade Calculator  

## Overview  

The **Student Grade Calculator** is a Java application that allows users to input the marks obtained in various subjects. It calculates the total marks, average percentage, and the corresponding grade based on the average. This project aims to simplify the process of grade calculation for students and educators, thereby enhancing learning through practical applications.  

---  

## Features  

- **Input for Multiple Subjects**: Easily enter marks for various subjects.  
- **Automatic Calculation of Total Marks**: No manual calculations required!  
- **Computation of Average Percentage**: Get an overview of performance.  
- **Grade Assignment**: Automatically assigns grades based on average percentage.  
- **User-Friendly Console Interface**: Intuitive and straightforward input and output.  

---  

## Technologies Used  

- **Java**: The core programming language used for the development of the application.  
- **Scanner**: A utility for taking user input from the console.  

---  

## Project Structure

edu/
└── StudentGradeCalculator/
├── GradeCalculator.java # Contains the logic to calculate grades based on average percentage
├── Main.java # Entry point of the application
└── StudentMarks.java # Handles student marks input and calculations

---  

## Class Descriptions  

### 1. `GradeCalculator`  

- **Purpose**: Contains logic for grade calculation based on the average percentage.  
- **Method**:  
  - `calculateGrade(double averagePercentage)`: Returns the corresponding grade for the given average percentage.  

### 2. `Main`  

- **Purpose**: Serves as the entry point of the application.  
- **Methods**:  
  - `main(String[] args)`: Executes the program, gathers user input, performs calculations, and displays the results.  

### 3. `StudentMarks`  

- **Purpose**: Manages and processes the marks and subjects for a student.  
- **Constructor**:  
  - `StudentMarks(int numSubjects, Scanner scanner)`: Initializes the subjects and marks by taking input from the user.  
- **Methods**:  
  - `studentsSubjects(Scanner scanner)`: Prompts the user to enter the names of subjects.  
  - `takeInput(Scanner scanner)`: Collects the marks for each subject while ensuring valid input.  
  - `calculateTotalMarks()`: Calculates and returns the total marks obtained.  
  - `calculateAveragePercentage()`: Calculates and returns the average percentage based on total marks.  

---  

## Usage Instructions  

1. **Compile and run** the program using a Java IDE (like IntelliJ or Eclipse) or through the command line.  
2. When prompted, **enter the number of subjects**.  
3. **Input the names of the subjects** as requested.  
4. Provide the **marks obtained** for each subject, ensuring they are within the range of 0 to 100.  
5. Once all inputs are complete, the program will display:  
   - Total Marks  
   - Average Percentage  
   - Grade  

---  

## Example Input and Output  

### Input

Enter the number of subjects: 3
Enter the name of the subject 1: Mathematics
Enter the name of the subject 2: Science
Enter the name of the subject 3: English
Enter marks obtained in subject Mathematics (out of 100): 85
Enter marks obtained in subject Science (out of 100): 78
Enter marks obtained in subject English (out of 100): 92

### Output

--- Results ---
Total Marks: 255.00 out of 300.00
Average Percentage: 85.00%
Grade: A

---  

## Conclusion  

The **Student Grade Calculator** project exemplifies practical applications of object-oriented principles in Java. It showcases important programming concepts such as data encapsulation through the use of classes, methods for performing calculations, and effective user input validation.

---  
