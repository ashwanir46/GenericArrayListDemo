import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntractiveDemoToArrayList {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Student s1 = new Student("Vaibhav",101,100);
        Student s2 = new Student("Ashwani",102,90);
        Student s3 = new Student("Bhuvan",103,800);
        Student s4 = new Student("Ankit",104,70);
        Student s5 = new Student("Ramesh",105,60);
        Student s6 = new Student("Suresh",106,40);
        Student s7 = new Student("Ravi",107,50);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);

        Iterator<Student> iterator = studentList.iterator();
        double totalMarks = 0.0;
        while (iterator.hasNext()){
            Student element = iterator.next();
            totalMarks += element.getMarks();
            if(element.getName().charAt(0) == 'B'){
                iterator.remove();
            }
            if(element.getName().charAt(0) == 'H'){
                iterator.remove();
            }
        }
        System.out.println("Average = " + totalMarks / studentList.size());
    }
}
