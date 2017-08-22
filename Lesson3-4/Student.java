package HW.Lesson3;

public class Student extends Human {
    private String university;
    private int studBook;

    public Student(String name, String surname, int age, String university, int studBook) {
        super(name, surname, age);
        this.university = university;
        this.studBook = studBook;
    }

    public Student() {
        super();
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getStudBook() {
        return studBook;
    }

    public void setStudBook(int studBook) {
        this.studBook = studBook;
    }

    @Override
    public String toString() {
        return super.toString()+"| University- " + university + "| StudBook- " + studBook+"\n";
    }
}
