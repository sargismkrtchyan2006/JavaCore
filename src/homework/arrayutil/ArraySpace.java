package homework.arrayutil;

public class ArraySpace {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start=0;
        int end= spaceArray.length-1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != 0&&spaceArray[i]!=spaceArray.length-1) {
                System.out.print(spaceArray[i]);
            }
        }
    }


}
