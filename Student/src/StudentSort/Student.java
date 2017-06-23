package StudentSort;

public class Student {

    public int id;
    public String name;
    public double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
