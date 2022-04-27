package assignment4.initialisingtheobject;

public class student1 {
    int id;
    String name;

    void insert(int i,String n) {
     id=i;
     name=n;
    }

    void displayinfo(){
        System.out.println("Name is "+name+" and roll is "+id);
    }
}

class initialsingtheobjectthroughtmethod {
    public static void main(String args[]) {
        student1 s1 = new student1();
        student1 s2 = new student1();
        s1.insert(12, "Disha");
        s2.insert(14, "Me");
        s1.displayinfo();
        s2.displayinfo();
    }
}