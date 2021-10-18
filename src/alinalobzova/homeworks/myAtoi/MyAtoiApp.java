public class MyAtoiApp {
//this implementation doesn't handle corner cases
    static int atoi(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                result = result * 10 + c - '0';
            }
        }

        if (str.charAt(0) == '-') {
            result *= -1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(atoi("357")); // 357
        System.out.println(atoi("+735")); // 735
        System.out.println(atoi("-573")); // -573
        System.out.println(atoi("+0")); // 0
        System.out.println(atoi("10")); // 10
        System.out.println(atoi("-9")); // -9
    }
}