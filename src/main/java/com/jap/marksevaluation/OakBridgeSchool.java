package com.jap.marksevaluation;

public class OakBridgeSchool {
    public static void main(String[] args) {
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        String[] studentName = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo",};
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        int[] result = oakBridgeSchool.calculateTotalMarks(math, science, english);
        System.out.print("The total marks : ");
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("The average marks of each student : ");

        int[] averageMarksOfEachStudent = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(result, 3);
        for (int j : averageMarksOfEachStudent) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("The average science mark of each student : ");
        int averageScienceMark = oakBridgeSchool.calculateAverageScienceMarks(science);

        System.out.print(averageScienceMark);
// calcualte the average english marks
        System.out.println();
        System.out.print("The average English mark of each student : ");
        int averageEnglishMark = oakBridgeSchool.calculateAverageEnglishMarks(english);

        System.out.print(averageEnglishMark);
// calculate the average math marks
        System.out.println();
        System.out.print("The average math mark of each student : ");
        int averageMathMark = oakBridgeSchool.calculateAverageMathMarks(math);
        System.out.print(averageMathMark);
    }

    /**
     * It takes in three arrays of integers, and returns an array of integers
     *
     * @param math    an array of integers representing the marks in Maths
     * @param science [23, 35, 14, 56, 78, 98, 12, 34, 56, 78]
     * @param english an array of marks for English
     * @return The total marks of the students in the three subjects.
     */
    public int[] calculateTotalMarks(int[] math, int[] science, int[] english) {
        int[] total = new int[10];
        if (math.length == 0 || science.length == 0 || english.length == 0) {
            return null;
        } else {
            for (int i = 0; i < total.length; i++) {
                total[i] = math[i] + science[i] + english[i];
            }
            return total;
        }
    }

    /**
     * It takes an array of total marks for each student and the number of subjects and returns an array of average marks
     * for each student
     *
     * @param totalMarks   An array of integers containing the total marks of each student.
     * @param noOfSubjects The number of subjects for which the marks are given.
     * @return The average marks of each student.
     */
    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
        int[] e = new int[totalMarks.length];
        System.arraycopy(totalMarks, 0, e, 0, totalMarks.length);

        int[] avg = new int[10];
        if (totalMarks.length == 0 || noOfSubjects == 0) {
            return null;
        } else {
            for (int i = 0; i < 10; i++) {
                avg[i] = e[i] / noOfSubjects;
            }
            return avg;
        }
    }

    /**
     * It takes an array of integers as input and returns the average of the integers in the array
     *
     * @param science an array of integers
     * @return The average of the science marks.
     */
    public int calculateAverageScienceMarks(int[] science) {
        int sum = 0;
        int totalSum = 0;
        int f = science.length;
        if (f == 0) {
            return -1;
        } else {
            for (int j : science) {
                sum = sum + j;
            }
            totalSum += sum / 10;
            return totalSum;
        }
    }

    /**
     * It takes an array of integers as input and returns the average of the integers in the array
     *
     * @param english an array of integers that represent the marks of the students in English.
     * @return The average of the English marks.
     */
    public int calculateAverageEnglishMarks(int[] english) {
        int sum = 0;
        int totalSum = 0;
        int f = english.length;
        if (f == 0) {
            return -1;
        } else {
            for (int j : english) {
                sum = sum + j;
            }
            totalSum += sum / 10;
            return totalSum;
        }
    }

    /**
     * It takes an array of integers as an argument and returns the average of the integers in the array
     *
     * @param math an array of integers
     * @return The average of the math marks.
     */
    public int calculateAverageMathMarks(int[] math) {
        int sum = 0;
        int totalSum = 0;
        int f = math.length;
        if (f == 0) {
            return -1;
        } else {
            for (int j : math) {
                sum = sum + j;
            }
            totalSum += sum / 10;
            return totalSum;
        }
    }
}