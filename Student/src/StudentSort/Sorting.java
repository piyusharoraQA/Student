package StudentSort;

import java.util.Comparator;

public class Sorting implements Comparator<Student> {

    public int compare(Student ob1, Student ob2) {
        if (ob1.getCgpa() > ob2.getCgpa()) {
            return -1;
        } else if (ob1.getCgpa() < ob2.getCgpa()) {
            return 1;
        } else {
            int nameComparison = ob1.getname().compareTo(ob2.getname());
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                if (ob1.getId() > ob2.getId()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }
}
