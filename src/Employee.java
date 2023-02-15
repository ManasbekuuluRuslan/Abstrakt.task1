public class Employee extends Person{
    private int id;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void work() {
        if(1==id){
            System.out.println("Jumushchu ishteyt");
        } else
            System.out.println("Jumushchu ishtebeyt");
        }


}
