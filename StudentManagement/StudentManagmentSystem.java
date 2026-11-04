import java.util.Scanner;

class StudentManagementSystem {

    Student[] students = new Student[5];

    static Scanner sc = new Scanner(System.in);

    // ADD STUDENT
    public void addStudent(Student s) {

        int pos = isSlotAvailable();

        if (pos != -1) {
            students[pos] = s;
            System.out.println("Student Added");
        } else {
            System.out.println("Admission is Closed");
        }
    }

    // REMOVE STUDENT
    public void removeStudent(int sid) {

        int index = 0;

        for (Student s : students) {

            if (s != null) {

                if (s.getId() == sid) {

                    students[index] = null;

                    System.out.println("Student Removed");
                    return;
                }
            }

            index++;
        }

        System.out.println("No Student Found!");
    }

    // SEARCH STUDENT
    public void searchStudent(int sid) {

        int index = 0;

        for (Student s : students) {

            if (s != null) {

                if (s.getId() == sid) {

                    System.out.println("Student Found!");
                    s.details();
                    return;
                }
            }

            index++;
        }

        System.out.println("No Student Found!");
    }

    // UPDATE STUDENT
    public void updateStudent(int sid) {

        int index = 0;

        for (Student s : students) {

            if (s != null) {

                if (s.getId() == sid) {

                    System.out.println("\nSet The Info");

                    System.out.println("1. Name");
                    System.out.println("2. Contact");
                    System.out.println("3. Address");

                    System.out.println("Enter the input:");

                    int input = sc.nextInt();

                    switch (input) {

                        case 1:

                            sc.nextLine();

                            System.out.print("Enter new Name: ");

                            students[index].setName(
                                sc.nextLine()
                            );

                            System.out.println("Name Updated");
                            return;

                        case 2:

                            System.out.print("Enter new Contact: ");

                            students[index].setContact(
                                sc.nextLong()
                            );

                            System.out.println("Contact Updated");
                            return;

                        case 3:

                            System.out.println("1. State");
                            System.out.println("2. City");

                            int user_sc = sc.nextInt();

                            if (user_sc == 1) {

                                sc.nextLine();

                                System.out.print("Enter new State: ");

                                students[index].getAddress()
                                    .setState(sc.nextLine());

                                System.out.println("State Updated");
                                return;

                            } else if (user_sc == 2) {

                                sc.nextLine();

                                System.out.print("Enter new City: ");

                                students[index].getAddress()
                                    .setCity(sc.nextLine());

                                System.out.println("City Updated");
                                return;
                            }
                    }
                }
            }

            index++;
        }

        System.out.println("Student Not Found!");
    }

    // DISPLAY STUDENTS
    public void displayStudent() {

        boolean flag = false;

        for (int i = 0; i < students.length; i++) {

            if (students[i] != null) {

                students[i].details();

                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No Students Present");
        }
    }

    // CHECK AVAILABLE SLOT
    public int isSlotAvailable() {

        int index = 0;

        for (Student s : students) {

            if (s == null) {
                return index;
            }

            index++;
        }

        return -1;
    }
}
