package assignment4.initialisingtheobject;

public class employee {
    int eid;
    String name;
    float salary;

    employee(int eid,String name,float salary){
        this.eid=eid;
        this.name=name;
        this.salary=salary;
    }

    void displayinfo(){
        System.out.println("Eid="+eid+" Name="+name+" salary="+salary);
    }
}

class initialsingtheobjectthoughtcontructor{
    public static void main(String args[]){
        employee e1=new employee(12,"Disha",520000);
        employee e2=new employee(13,"Aadarsh",9000000);
        e1.displayinfo();
        e2.displayinfo();
    }
}