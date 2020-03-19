 public class Operation {
    static int res;
     static int calculate(int count1, int count2, char operation){

        switch (operation){
            case '+': res = count1 + count2; break;
            case '-': res = count1 - count2; break;
            case '*': res = count1 * count2; break;
            case '/': res = count1 / count2; break;
        }
        return res;
    }
}
