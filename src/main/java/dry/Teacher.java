package dry;

import java.sql.Array;
import java.util.ArrayList;

public class Teacher {

    float computeGrade( ArrayList<Integer> note){
        float grade=1;
        int sumGrade=0;
        for(int i=0;i<note.size();i++){
            sumGrade=sumGrade+note.get(i);
        }
        grade=sumGrade/note.size();
        return grade;

    }

}
