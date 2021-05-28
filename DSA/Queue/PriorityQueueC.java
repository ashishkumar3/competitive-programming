import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueC {
    
    public static void main(String[] args) {
        
        PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());

        Student s1 = new Student("Ashish", 6.8);
        Student s2 = new Student("Nilesh", 9.2);
        Student s3 = new Student("Shubham", 8.9);
        Student s4 = new Student("Pratyaksh", 6.5);
        Student s5 = new Student("Jagrit", 6.6);

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);

        System.out.println(pq); 

        while(!pq.isEmpty())
            System.out.println(pq.poll().getName());
    }
}

class Student {
    public String name;
    public double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.cgpa > s2.cgpa) {
            return 1;
        } else if(s2.cgpa > s1.cgpa) {
            return -1;
        }

        return 0;
    }
}
