//Reverse Equation
public class ReveseEquation {
    public static void main(String[] args) {
        String equation = "20+3-9";
        String reversedEquation = reverseEquation(equation);
        System.out.println("Original Equation: " + equation);
        System.out.println("Reversed Equation: " + reversedEquation);
    }

    public static String reverseEquation(String equation) {
        StringBuilder reversed = new StringBuilder();
        int i = equation.length() - 1;
        while (i >= 0) {
            if (Character.isDigit(equation.charAt(i))) {
                int j = i;
                while (i >= 0 && Character.isDigit(equation.charAt(i))) {
                    i--;
                }
                reversed.append(equation.substring(i + 1, j + 1));
            } else {
                reversed.append(equation.charAt(i));
                i--;
            }
        }
        return reversed.toString();
    }
}
