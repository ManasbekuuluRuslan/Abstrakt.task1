public class Main {
    public static void main(String[] args) {
     Person employee = new Employee("Ruslan","M",0);
     Person employee1 = new Employee("Matmusa","M",1);
    Person []p={employee,employee1};
        for (Person a:p) {
            a.work();

        }

    }
}