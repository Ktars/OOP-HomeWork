package HW.Lesson3;

import java.util.Arrays;

public class Voenkomat {

    public Voenkomat() {
        super();
    }

    public void getRecruits(Voenkom voenkom) {
        System.out.println("Recruits list: \n" + Arrays.toString(voenkom.recruits()));
    }
}

