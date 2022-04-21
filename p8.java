//method overloading
package assignment4;

public class p8 {
    void say(){
        System.out.println("I have no rupee");
    }
    void say(int n){
        System.out.println("I have "+n+"rupee");
    }

    void say(double n){
        System.out.println("I have "+n+"rupee");
    }

    public static void main(String args[]){
        p8 p=new p8();
        System.out.println("Method overloading");
        p.say();
        p.say(10);
        p.say(12.43);
    }
}
