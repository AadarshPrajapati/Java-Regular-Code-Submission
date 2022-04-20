package assignment4;

public class BalloonTester {

    public static void main(String[] args) {
        Balloon B=new Balloon();
        System.out.println("Adding 100cm3 of air in balloon");
        B.addAir(100);
        System.out.println("Volume is "+B.getVolume()+" cm3");
        System.out.println("Surface area is "+B.getSurfaceArea()+" cm2");
        System.out.println("radious is "+B.getRadious()+" cm");
        System.out.println();
        System.out.println("After Adding 100cm3 more of air in balloon");
        B.addAir(100);
        System.out.println("Volume is "+B.getVolume()+" cm3");
        System.out.println("Surface area is "+B.getSurfaceArea()+" cm2");
        System.out.println("radious is "+B.getRadious()+" cm");


    }

}

