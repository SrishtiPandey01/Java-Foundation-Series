//package Java-Foundation-Series.Module07_Methods;

public class InstanceMethod {
    void display() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();

        obj.display();
    }

}
