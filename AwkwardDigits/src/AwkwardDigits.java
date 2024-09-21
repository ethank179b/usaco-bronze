import java.util.*;

public class AwkwardDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the incorrect base-2 and base-3 representations
        String base2 = sc.nextLine();
        String base3 = sc.nextLine();

        // Generate all possible correct values for base-2 and base-3 by fixing one digit
        Set<Integer> base2Candidates = generateCandidates(base2, 2);
        Set<Integer> base3Candidates = generateCandidates(base3, 3);

        // Find the common value between the two sets
        for (int n : base2Candidates) {
            if (base3Candidates.contains(n)) {
                System.out.println(n);
                break;
            }
        }

        sc.close();
    }

    // Helper function to generate all possible values by fixing one digit
    private static Set<Integer> generateCandidates(String number, int base) {
        Set<Integer> candidates = new HashSet<>();

        // Convert each digit and generate possible correct versions
        for (int i = 0; i < number.length(); i++) {
            char[] digits = number.toCharArray();
            char original = digits[i];

            // Try every possible digit in the current base except the original
            for (char newDigit = '0'; newDigit < '0' + base; newDigit++) {
                if (newDigit != original) {
                    digits[i] = newDigit; // Modify the digit
                    candidates.add(Integer.parseInt(new String(digits), base)); // Convert to decimal and add to set
                }
            }
        }

        return candidates;
    }
}
