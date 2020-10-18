package dry;

import java.util.ArrayList;
import java.util.Arrays;

public class DryApp {
    public static void main(String[] args) {
        Student student=new Student("Alex",new ArrayList<Integer>(Arrays.asList(10,10,8)));
        System.out.println(student.computeGrade());

        Student student2=new Student("Marian",new ArrayList<Integer>(Arrays.asList(10,10,10)));
        System.out.println(student2.computeGrade());

    }


}
