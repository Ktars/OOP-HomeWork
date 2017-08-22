package HW.Lesson3;

import HW.Lesson3.Exeptions.FullGroup;
import HW.Lesson3.Exeptions.NameIsNotFound;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Group implements Voenkom, SortService {

    private Student[] group;

    public Group() {
        super();
        this.group = new Student[10];
    }

    public Student[] getGroup() {
        return group;
    }

    public void addStudent(Student student) {
        try {
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = student;
                    return;
                }
            }
            throw new FullGroup();

        } catch (FullGroup e) {
            e.printMessage();
        }
    }

    public Student addStudentNew() {
        Student studentNew = new Student();

        for (; ; ) {
            try {
                studentNew.setName(String.valueOf(JOptionPane.showInputDialog("Input double number")));
                studentNew.setSurname(String.valueOf(JOptionPane.showInputDialog("Input double number")));
                studentNew.setAge(Integer.valueOf(JOptionPane.showInputDialog("Input double number")));
                studentNew.setUniversity(String.valueOf(JOptionPane.showInputDialog("Input double number")));
                studentNew.setStudBook(Integer.valueOf(JOptionPane.showInputDialog("Input double number")));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Canceled");
                break;
            }
        }
        return studentNew;
    }

    public void removeStudent(int studentNumber) {
        if (group[studentNumber - 1] == null && studentNumber - 1 <= 0 && studentNumber >= group.length) {
            System.err.println("Incorrect student number");
        } else {
            group[studentNumber - 1] = null;
        }
    }

    public String searchStudentByName(String name) {
        try {
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    continue;
                }
                if (group[i].getName() == null) {
                    continue;
                }
                if (group[i].getName().equals(name)) {

                    return group[i].toString();
                }
            }
            throw new NameIsNotFound();
        } catch (NameIsNotFound e) {
            e.printMessage();
            return "0";
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(group);
    }

    @Override
    public void sort(int i) {
        Sort groupSort = new Sort();
        switch (i) {
            case 1:
                System.out.println("Sort by name:  \n");
                groupSort.sortByName();
                break;
            case 2:
                System.out.println("Sort by surname:  \n");
                groupSort.sortBySurname();
                break;
            case 3:
                System.out.println("Sort by age:  \n");
                groupSort.sortByAge();
                break;
            case 4:
                System.out.println("Sort by university:  \n");
                groupSort.sortByUniversity();
                break;
            default:
                System.out.println("Not valid number!");
        }
    }

    private class Sort {

        private void sortByName() {
            Arrays.sort(group, (a, b) ->
                    SortService.checkNull(a, b) != SortService.NOT_NULL ?
                            SortService.checkNull(a, b) : a.getName().compareTo(b.getName())
            );
        }

        private void sortBySurname() {
            Arrays.sort(group, (Student o1, Student o2) ->
                    SortService.checkNull(o1, o2) != SortService.NOT_NULL ?
                            SortService.checkNull(o1, o2) : o1.getSurname().compareTo(o2.getSurname())
            );
        }

        private void sortByAge() {
            Arrays.sort(group, (Student o1, Student o2) ->
                    SortService.checkNull(o1, o2) != SortService.NOT_NULL ?
                            SortService.checkNull(o1, o2) : o1.getAge() - o2.getAge()
            );
        }

        private void sortByUniversity() {
            Arrays.sort(group, (Student o1, Student o2) ->
                    SortService.checkNull(o1, o2) != SortService.NOT_NULL ?
                            SortService.checkNull(o1, o2) : o1.getUniversity().compareTo(o2.getUniversity())
            );
        }
    }

    @Override
    public Student[] recruits() {

        Group recruits = new Group();
        for (Student student : this.group) {
            if (student == null)
                continue;

            if (student.getAge() >= 18)
                recruits.addStudent(student);
        }
        return recruits.getGroup();
    }

    public void saveToFile() {

        try (PrintWriter groupfile = new PrintWriter("Group.txt")) {

            groupfile.println(Arrays.toString(this.group));

        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
    }
}




