package assignment4;

public class inheritence {
    void salary(){
        int sal=4000;
        System.out.println("Salary is "+sal);
    }
}

class hacker extends inheritence{
    void bonus(){
        int bon=1000;
        System.out.println("bonus is "+bon);
    }
    public static void main(String args[]){
        hacker h=new hacker();
        h.salary();
        h.bonus();
    }
}
