
    public class PowerCalculator {
        public static int pow(int base, int exponent) {
            // Base case: anything raised to the power of 0 is 1
            if (exponent == 0) {
                return 1;
            }
            // Recursive case: multiply base by the result of pow with exponent - 1
            return base * pow(base, exponent - 1);
        }
    
        public static void main(String[] args) {
            System.out.println(pow(3, 4)); // Output: 81
        }
    }
    


