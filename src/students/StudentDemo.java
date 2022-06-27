package students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all students");
            System.out.println("please input 3 for print students count");
            System.out.println("please input 4 for deleted by index");
            System.out.println("please input 5 for print student by lesson");
            System.out.println("please input 6 for change student lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addstudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    deleteStudentByIndex();
                    break;
                case 5:
                    searchStudentByLessonName();
                    break;
                case 6:
                    ChangeStudentLesson();
                    break;
                default:
                    System.out.println("invalid command,please try again");
            }

        }
    }

    private static void searchStudentByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentbyLesson(lessonName);
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void ChangeStudentLesson() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            System.out.println("please input new lesson name");
            String lessonname = scanner.nextLine();
            if (lessonname != null && !lessonname.trim().equals("")) {
                student.setLesson(lessonname.trim());
                System.out.println("lesson changed for student" + student.getName());
            }

        } else {
            System.out.println("invalid index,please try again");
            ChangeStudentLesson();
        }
    }

    private static void addstudent() {
        System.out.println("please input student name");
        String name = scanner.nextLine();
        System.out.println("please input student surname");
        String surname = scanner.nextLine();
        System.out.println("please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("please input student phoneNumber");
        String phonenumber = scanner.nextLine();
        System.out.println("please input student city");
        String city = scanner.nextLine();
        System.out.println("please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phonenumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you,Student added");


    }

}






