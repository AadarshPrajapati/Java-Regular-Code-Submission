package assignment4;

class animal{
    void eat(){
        System.out.println("I am eating ");
    }
}

class dog extends animal{
    void voice(){
        System.out.println("I am barking ");
    }
}

class babydog extends dog{
    void weep(){
        System.out.println("Baby Dog is Weeping");
    }
}

class useMultipleInheritence {
    public static void main(String args[]) {
        babydog d = new babydog();
        d.eat();
        d.voice();
        d.weep();
    }
}
