package lab_4;

public class mate {
    protected boolean isPair(char char1, char char2) {
        if(char1 == '{' && char2 == '}')
            return true;
        if(char1 == '[' && char2 == ']')
            return true;
        if(char1 == '(' && char2 == ')')
            return true;
        return false;
    }

    public boolean areParenthesisBalanced(String str) {
        stack st = new stack();
        for(char x: str.toCharArray()) {
            if(x == '(' || x == '[' || x == '{') {
                st.push(x);
            }

            if(x == ')' || x == ']' || x == '}') {
                if(st.isEmpty()) {
                    return false;
              }
                else if(!isPair(st.pop(), x)) {
                    return false;
                }
            }

        }
        if(st.isEmpty()) {
            return true;
        }
        return false;
    }
}