package edu.StudentGradeCalculator;  

public class GradeCalculator {  
    public static String calculateGrade(double averagePercentage) {  
        if (averagePercentage >= 90) {  
            return "A+";  
        } else if (averagePercentage >= 80) {  
            return "A";  
        } else if (averagePercentage >= 70) {  
            return "B";  
        } else if (averagePercentage >= 60) {  
            return "C";  
        } else if (averagePercentage >= 50) {  
            return "D";  
        } else {  
            return "F";  
        }  
    }  
}