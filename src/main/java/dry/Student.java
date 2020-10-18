package dry;

import java.util.ArrayList;

public class Student {
    ArrayList<Integer> note;
    String nume;

    public Student(String nume,ArrayList<Integer>note){
        this.nume=nume;
        this.note=note;
    }


    float computeGrade(){
        float grade=1;
        float sumGrade=0;
        for(int i=0;i<this.note.size();i++){
            sumGrade=sumGrade+this.note.get(i);
        }
        grade=sumGrade/this.note.size();
        return grade;

    }
}
