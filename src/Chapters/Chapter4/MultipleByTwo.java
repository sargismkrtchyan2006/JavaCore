package Chapters.Chapter4;

public class MultipleByTwo {
    public static void main(String[] args) {
        int i;
        int num = 45;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }
    }


}
