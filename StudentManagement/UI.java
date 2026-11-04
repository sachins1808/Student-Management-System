/*to run this javac *.java and java UI  */

import java.util.Scanner;

public class UI {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        StudentManagementSystem sm =
            new StudentManagementSystem();

        boolean flag = true;

        do {

            System.out.println("\nStudent Management System");
            System.out.println("--------------------------------");

            System.out.println(
                "1. Add Student\n" +
                "2. Remove Student\n" +
                "3. Update Student\n" +
                "4. Search Student\n" +
                "5. Display Student\n" +
                "6. Exit"
            );

            System.out.print("Select Option: ");

            int input = sc.nextInt();

            switch (input) {

                case 1:

                    System.out.print("Enter student Id: ");
                    int sid = sc.nextInt();

                    System.out.print("Enter student Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter student Contact: ");
                    long contact = sc.nextLong();

                    sc.nextLine();

                    System.out.print("Enter student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student State: ");
                    String state = sc.nextLine();

                    System.out.print("Enter student City: ");
                    String city = sc.nextLine();

                    Student s = new Student(
                        name,
                        age,
                        sid,
                        contact,
                        new Address(state, city)
                    );

                    sm.addStudent(s);

                    break;

                case 2:

                    System.out.print("Enter Id: ");
                    sm.removeStudent(sc.nextInt());

                    break;

                case 3:

                    System.out.print("Enter Id: ");
                    sm.updateStudent(sc.nextInt());

                    break;

                case 4:

                    System.out.print("Enter Id: ");
                    sm.searchStudent(sc.nextInt());

                    break;

                case 5:

                    sm.displayStudent();

                    break;

                case 6:

                    flag = false;

                    break;

                default:

                    System.out.println("Invalid Option!");

            }

        } while (flag);

        System.out.println("Thank You!");

        sc.close();
    }
}
