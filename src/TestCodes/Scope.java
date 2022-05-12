package TestCodes;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        int y;
        if (x == 10) {
            y = 20;
            System.out.println("x и y;" + x + "" + y);
            x = y * 2;
        }
        y = 100;
        System.out.println("x равно" + x);


    }


}
