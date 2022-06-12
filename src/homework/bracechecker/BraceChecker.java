package homework.bracechecker;

public class BraceChecker {
    private String text;

    private final Stack stack = new Stack();
    private final Stack stackforindex = new Stack();

    public BraceChecker(String text) {
        this.text = text;

    }

    void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            int pop;
            char c = text.charAt(i);
            switch (c) {
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    stackforindex.push(i);
                    break;
                case ')':
                    pop = stack.pop();
                    stackforindex.pop();
                    if (pop == 0) {
                        System.err.println("error: closed " + c + "but not opened at " + i);
                    } else if (pop != '(') {
                        System.err.println("error: closed " + c + "but not opened" + (char) pop + " at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    stackforindex.pop();
                    if (pop == 0) {
                        System.err.println("error: closed " + c + "but not opened at " + i);
                    } else if (pop != '[') {
                        System.err.println("error: closed " + c + "but not opened" + (char) pop + " at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    stackforindex.pop();
                    if (pop == 0) {
                        System.err.println("error: closed " + c + "but not opened at " + i);
                    } else if (pop != '{') {
                        System.err.println("error: closed " + c + "but not opened" + (char) pop + " at " + i);
                    }
                    break;

            }

        }

        while (!stack.isempty()) {
            System.err.println("error: opened " + (char) stack.pop() + " but not closed at "+stackforindex.pop());
        }
    }
}