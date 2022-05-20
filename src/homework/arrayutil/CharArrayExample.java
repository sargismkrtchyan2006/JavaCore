package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {

//        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
//        char c = 'o';
//        int count = 0;
//        int i;
//        for (i = 0; i < chars.length; i++) {
//            if (chars[i] == c) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
              char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char first;
        char seconds;
        first = (char) (chars2.length / 2);
        seconds = (char) (chars2.length / 2 - 1);


        System.out.println(chars2[first] + " " + chars2[seconds]);

//        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
//
//
//        if (chars3[chars3.length-1] == 'y' && chars3[chars3.length-2] == 'l') {
//
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//
//        }
//        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] != ' '){
//                System.out.print(text[i ]);
//            }
//        }
//        char[] bobarray = {'b', 'a', 'b', 'o', 'l', 'a'};
//        for (int i = 0; i < bobarray.length; i++) {
//            if (bobarray[i]=='b'&&bobarray[i+2]=='b'){
//                System.out.println(true);
//                break;
//            }else{
//                System.out.println(false);
//                break;
//            }
//        }
    }
}