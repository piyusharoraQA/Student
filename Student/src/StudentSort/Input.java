package StudentSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the number of students : ");
        int n = in.nextInt();

        List<Student> sList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id,name,cgpa);
            sList.add(st);

        }

        Collections.sort(sList, new Sorting());
        for (Student st : sList) {
            System.out.println(st.getname());
//            System.out.println(st.getId());
//            System.out.println(st.getCgpa());
        }

        in.close();
    }
}
