package assignment4;

public interface polygon {
    void getarea();
    void getside();
}

class Rectange implements polygon{
    @Override
    public void getarea() {
        int length=5;
        int breadth=7;
        System.out.println("Area of rectange is "+length*breadth);
    }

    @Override
    public void getside() {
        System.out.println("The side of rectange is 4");
    }
}

class Square implements polygon{

    @Override
    public void getarea() {
        int side=5;
        System.out.println("Area of square is "+side*side);
    }

    @Override
    public void getside() {
        System.out.println("The no of side of square is 4");
    }
}

class Main{
    public static void main(String args[]){
        Rectange r1=new Rectange();
        r1.getarea();
        r1.getside();

        Square s1=new Square();
        s1.getarea();
        s1.getside();
    }
}