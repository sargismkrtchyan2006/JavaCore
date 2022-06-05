package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.convert(15));
        System.out.println(practiceHomework.calcage(9));
        System.out.println(practiceHomework.nextnumber(9));
        System.out.println(practiceHomework.isSameNum(6,6));
        System.out.println(practiceHomework.lessThanOrEqualToZero(9));
        System.out.println(practiceHomework.reverseboolean(true));
        int[]array1={2,6,9};
        int[]array2={6,9,4,7};
        System.out.println(practiceHomework.maxlength(array1,array2));
    }
}
