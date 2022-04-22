package assignment4;

class animall{
    void eat(){
        System.out.println("I am eating ");
    }
}

class dogg extends animall{
    void voice(){
        System.out.println("I am barking ");
    }
}

class useSingleInheritance {
    public static void main(String args[]) {
        dog d = new dog();
        d.eat();
        d.voice();
    }
}
