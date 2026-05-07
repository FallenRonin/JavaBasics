package solution.week02;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] grades = null;
        int gradesCount = 0;

        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter subject name:");
        String subject = scanner.nextLine();
        System.out.println("Enter grades count:");
        gradesCount = scanner.nextInt();
        if (gradesCount <= 0) {
            System.out.println("Grades count must be above 0");
            return;
        }
        grades = initGrades(gradesCount, scanner);
        System.out.println("Results for student " + name + " by subject " + subject);
        printGrades(grades);
        System.out.println("Average grade is: " + getAverage(grades));
        System.out.println("Max grade is: " + getMax(grades));
        System.out.println("Min grade is: " + getMin(grades));
        System.out.println("Excellent grades count is: " + getExcellentGradesCount(grades));
        System.out.println("Below average grades count is: " + getLowGradesCount(grades));
        System.out.println("Overall result is: " + getResultGrade(grades));
        System.out.println("Average grade excluding minimal grade is: " + getAverageWithoutMin(grades));
    }


    private static int[] initGrades(int gradesCount, Scanner scanner) {
        int[] gradesArray = new int[gradesCount];
        for (int i = 0; i < gradesCount; i++) {
            System.out.println("Enter grade № " + (i + 1));
            gradesArray[i] = scanner.nextInt();
        }
        return gradesArray;
    }

    private static void printGrades(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static double getAverage(int[] grades) {
        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum / grades.length;
    }

    private static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getExcellentGradesCount(int[] grades) {
        int counter = 0;
        for (int i : grades) {
            if (i == 5) {
                counter++;
            }
        }
        return counter;
    }

    private static int getLowGradesCount(int[] grades) {
        int counter = 0;
        for (int i : grades) {
            if (i < 3) {
                counter++;
            }
        }
        return counter;
    }

    private static String getResultGrade(int[] grades) {
        double average = getAverage(grades);
        if (average < 3) {
            return "Bad";
        } else if (average < 4.5) {
            return "Normal";
        } else {
            return "Excellent";
        }
    }

    private static double getAverageWithoutMin(int[] grades) {
        if (grades.length <= 1) {
            return 0;
        }
        int min = getMin(grades);
        int[] newGradesArray = new int[grades.length - 1];
        boolean gradeRemoved = false;
        for (int i = 0; i <= grades.length - 1; i++) {
            if (grades[i] == min && !gradeRemoved) {
                gradeRemoved = true;
            } else if (!gradeRemoved) {
                newGradesArray[i] = grades[i];
            } else {
                newGradesArray[i - 1] = grades[i];
            }
        }
        return getAverage(newGradesArray);
    }
}
