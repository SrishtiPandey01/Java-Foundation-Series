//package Java-Foundation-Series.Module07_Methods;

public class MultipleParameters {
    static void studentDetails(String name, int age, double marks) {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {
        studentDetails("Rahul", 20, 85.5);
    }

}
