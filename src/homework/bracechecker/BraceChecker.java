package homework.bracechecker;

public class BraceChecker {
    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }

    void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                    char pop = (char) stack.pop();
                    if (pop != '(') {
                        System.out.println("error: " + i + "closed " + text.charAt(i) + "but opened " + "pop ");
                    }
                    break;
                case ']':
                    char pop1 = (char) stack.pop();
                    if (pop1 != '[') {
                        System.out.println("error: " + i + "closed " + text.charAt(i) + "but opened " + "pop1 ");
                    }
                    break;
                case '}':
                    char pop2 = (char) stack.pop();
                    if (pop2 != '{') {
                        System.out.println("error: " + i + "closed " + text.charAt(i) + "but opened " + "pop2 ");
                    }
                    break;
            }

        }

    }
}
