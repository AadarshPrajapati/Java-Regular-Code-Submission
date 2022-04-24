package assignment4;

public class car {
    private String color;
    private int maxrpm;

    public void setmaxrpm(int maxrpm){
        this.maxrpm=maxrpm;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public void displaydetail(){
        System.out.println("car color is :"+color+" max rpm is :"+maxrpm);
    }
    public static void main(String args[]){
        car ferrari=new car();
        ferrari.setcolor("Red");
        ferrari.setmaxrpm(359);
        ferrari.displaydetail();

        bmw x1=new bmw();
        x1.bmw_demo();
    }
}

