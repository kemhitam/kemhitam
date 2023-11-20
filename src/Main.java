// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student khoo = new Student("Hassan", 55); //
        Student aqem = new Student("Husin");
        Scanner input = new Scanner(System.in);
        int credit;
        System.out.print("Please enter Husin total credit taken so far: ");
        credit = input.nextInt();
        while (credit < 0 || credit > 120) {
            System.out.println("Invalid Input. Please try again");
            System.out.print("Please enter Husin total credit taken so far: ");
            credit = input.nextInt();
        }
        aqem.setCredit(credit);
        khoo.setYear();
        aqem.setYear();

      //  System.out.print("INFO: \nName: " + khoo.getName() + "\nCredit: " + khoo.getCredit() + "\nYear: " + khoo.getYear());
       // System.out.print("\n\nName: " + aqem.getName() + "\nCredit: " + aqem.getCredit() + "\nYear: " + aqem.getYear());
        printOutput(khoo);
        System.out.println("\n");
        printOutput(aqem);
    }

    public static void printOutput(Student student_object) {
        System.out.print("INFO: \nName: " + student_object.getName() + "\nCredit: " + student_object.getCredit() + "\nYear: " + student_object.getYear());
    }
}