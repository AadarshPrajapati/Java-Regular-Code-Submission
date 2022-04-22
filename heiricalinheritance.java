package assignment4;

class animals {
    void eat(){
        System.out.println("I am eating ");
    }
}
 class dogs extends animals{
    void bark(){
        System.out.println("Dog is barking ");
    }
 }

 class cats extends animals{
    void meow(){
        System.out.println("meow...");
    }
 }

 class useHeiricalinheritance {
     public static void main(String args[]) {
         cats c = new cats();
         c.eat();
         c.meow();
         //c.bark() will show error
     }
 }