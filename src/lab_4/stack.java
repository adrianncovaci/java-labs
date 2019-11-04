package lab_4;

public class stack {
    char items[] = new char[100];
    int top = -1;

    void push(char x) {
        if(top == 99) {
            return;
        }

        items[++top] = x;
    }

    char pop() {
        if (top == -1) {
            return '\0';
        }
        else {
        char element = items[top];
        top -= 1;
        return element;
       }
    }

    boolean isEmpty() {
        return (top == -1) ? true:false; 
    }
}
