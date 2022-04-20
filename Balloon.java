package assignment4;

public class Balloon {

    protected double radious,surfacearea,amount;
    static float pie=22/7;

    public Balloon() {
        this.radious=0;
        this.amount=0;
        this.surfacearea=0;
    }

    public void addAir(float amount) {
        this.amount+=amount;
    }

    public double getVolume() {
        return this.amount;
    }

    public double getRadious() {
        this.radious=Math.cbrt((3*this.amount)/(4*this.pie));
        return this.radious;
    }

    public double getSurfaceArea() {
        return (4*this.pie*Math.pow(getRadious(),2));
    }
}

