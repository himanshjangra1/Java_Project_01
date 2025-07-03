package com.company;
import java.util.Scanner;
public class First_Student_Grade_calci{
    public static void main(String[] args) {

//      Asking user about the number of students -->

        Scanner NumberOfStudents = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int NumOfStudents = NumberOfStudents.nextInt();
        NumberOfStudents.nextLine();

//      Creating an Array for Name,Marks,Total,Average,Grade -->

        String[] NameOfStudents = new String[NumOfStudents];
        int[][] MarksOfStudents = new int[NumOfStudents][5];
        int[] TotalOfMarks = new int[NumOfStudents];
        double[] AverageOfMarks = new double[NumOfStudents];
        char[] GradeOfStudent = new char[NumOfStudents];

//      Using Loop for Student i from 0 to n-1 -->

//      1. Asking user about Students Name -->
        for(int i = 0; i < NumOfStudents; i++){
            System.out.println("--- Student" + (i +1) + "---"); // Here i+1 is used because array starts from 0 and humans wont starts from 0. so to remove that confusion we start it from n+1 which means internally it starts from 0 but we get that it is starting from 1.
            System.out.print("Enter the Name of Student: ");
            NameOfStudents[i] = NumberOfStudents.nextLine();

//          2.Asking for the marks of subjects from j = 0 to j = 5(Because we are calculating marks for max 5 sub) -->
            TotalOfMarks[i] = 0;
            for(int j = 0; j < 5; j++){
                System.out.print("Enter the Marks for Subject" + (j + 1) + ":");
                int MarksOfSubject = NumberOfStudents.nextInt();
                while (MarksOfSubject < 0 || MarksOfSubject > 100){
                    System.out.print("Invalid! Enter marks between 0 to 100: ");
                    MarksOfSubject = NumberOfStudents.nextInt();
                }
                MarksOfStudents[i][j] = MarksOfSubject;
                TotalOfMarks[i] += MarksOfSubject;
            }
            NumberOfStudents.nextLine();
            AverageOfMarks[i] = TotalOfMarks[i]/5.0;

//          Now Assigning Grades using if-else statement -->

        if(AverageOfMarks[i] >= 90) GradeOfStudent[i] = 'A';
        else if (AverageOfMarks[i] >=75) GradeOfStudent[i] = 'B';
        else if (AverageOfMarks[i] >= 60) GradeOfStudent[i] = 'C';
        else GradeOfStudent[i] = 'D';
        }

//      Showing the Report Card of the Students -->

        System.out.println("\n --- Student Report Card ---");
        for (int i = 0; i < NumOfStudents; i ++){
            System.out.println("\n Name: " +NameOfStudents[i]);
            System.out.println("Total Marks: " + TotalOfMarks[i]);
            System.out.printf("Average: %.2f\n",AverageOfMarks[i]); // println does not support formatting with % instead we use printf.
            System.out.println("Grade: " +GradeOfStudent[i]);
        }

        System.out.println("--- Thanks For Using My Grade System And Feel Free To Share Any Changes Or Have Any Suggestions 😊❤️");

    }
}