package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting values of the variables
        obj.setName("Aesha");
        obj.setAge(19);
        obj.setRollNo(1);
        //Display values of the variables
        System.out.println("Student name is : " + obj.getName());
        System.out.println("Student Age is : " + obj.getAge());
        System.out.println("Student Roll number is : " + obj.getRollNo());

    }
}
