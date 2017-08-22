package HW.Lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Bob","Ags",19,"KPI",23424);
        Student student2 = new Student("Mike","Bsds",18,"NAU",23424);
        Student student3 = new Student("Charlie","Xss",17,"KNU",23424);
        Student student4 = new Student("Maks","Nur",20,"KPI",23424);
        Student student5 = new Student("Sam","Igs",21,"NAU",23424);
        Student student6 = new Student("Jared","Dpss",18,"KPI",23424);
        Student student7 = new Student("Tomas","Dpss",22,"KNU",23424);
        Student student8 = new Student("Mike","Dpss",17,"NAU",23424);
        Student student9 = new Student("Benedict","Dpss",18,"KNU",23424);
//        Student student10 = new Student("Kit","Dpss",18,"KPI",23424);


        Group groupOne = new Group();

//        Student student11 = groupOne.addStudentNew();

        groupOne.addStudent(student1);
        groupOne.addStudent(student2);
        groupOne.addStudent(student3);
        groupOne.addStudent(student4);
        groupOne.addStudent(student5);
        groupOne.addStudent(student6);
        groupOne.addStudent(student7);
        groupOne.addStudent(student8);
        groupOne.addStudent(student9);
//        groupOne.addStudent(student10);
//        groupOne.addStudent(student11);

        System.out.println(groupOne.searchStudentByName("Bob"));

        groupOne.sort(3);
        System.out.println(groupOne.toString());

        groupOne.sort(2);
        System.out.println(groupOne.toString());

        Voenkomat Voen1 = new Voenkomat();

        Voen1.getRecruits(groupOne);

        groupOne.saveToFile();
    }
}
