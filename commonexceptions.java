package assignment4;

public class commonexceptions {
    public static void main(String args[]){
        try{
            int a=50/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        String s=null;
        try {
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println(e);
        }

        try {
            String str = "abc";
            int i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        int a[]=new int[2];
        try{
            a[10]=40;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
