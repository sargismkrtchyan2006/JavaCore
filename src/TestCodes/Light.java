package TestCodes;

public class Light {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long distance;
        lightspeed = 186000;
        days = 1000;
        long seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("за" + days);
        System.out.print("днем свет пройдет около");
        System.out.println(distance + "миль");

    }


}
