public class Main {
    public static void main(String[] args) {
        int startCheck = 100;
        int topUpCheck = 1100;
        int finishCheck;
        if (topUpCheck > 1000) {
            finishCheck = topUpCheck/100+topUpCheck+startCheck;
        } else {
          finishCheck = topUpCheck+startCheck;
        }
        System.out.println(finishCheck);
    }
}