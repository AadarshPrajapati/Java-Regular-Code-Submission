package assignment4;

public class contructoroverloading {
    private int marks,id;
    private String name;
    contructoroverloading(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    contructoroverloading(int id,String name){
        this.id=id;
        this.name=name;
    }

    contructoroverloading(int id){
        this.id=id;
    }

    void display(){
        System.out.println(id+" "+name+" "+marks);
    }
}

class useConstructorOverloading{
    public static void main(String args[]){
        contructoroverloading c1=new contructoroverloading(1234,"diss",12);
        contructoroverloading c2=new contructoroverloading(1235,"shiv");
        contructoroverloading c3=new contructoroverloading(1236);
        c1.display();
        c2.display();
        c3.display();
    }
}