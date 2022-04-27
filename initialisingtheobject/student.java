package assignment4.initialisingtheobject;

public class student {
    int roll;
    String name;
}

class teststudentthroughtreferenceobj{
    public static void main(String args[]){
        student s=new student();
        s.roll=123;
        s.name="Ft Aadarsh";
        System.out.println("Name is "+s.name+" and roll is "+s.roll);
    }
}
