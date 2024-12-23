public class PrintN {
    public static void main(String[] args) {
        int n = 5; 
        printN(n);
    }

    private static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
    
}
