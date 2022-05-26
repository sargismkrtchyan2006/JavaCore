package homework.arrayutil;

public class ArraySpace {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int end = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[start] == ' ') {
                start++;
            } else {
                break;
            }
        }
        for (int i = end; i > 0; i--) {
            if (spaceArray[end] == ' ') {
                end--;
            } else {
                break;
            }
        }
        int newlength = (end - start) + 1;
        char[] result = new char[newlength];
        int j = 0;
        for (int i = start; i <= end; i++) {
            result[j++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);
        }
    }


}
