public class MoveHyphens {
    
    public static String moveHyphensToFront(String input) {
        // Count the number of hyphens in the input string
        int hyphenCount = 0;
        for (char c : input.toCharArray()) {
            if (c == '-') {
                hyphenCount++;
            }
        }
        
        // Create a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();
        
        // Add all the hyphens at the beginning
        for (int i = 0; i < hyphenCount; i++) {
            result.append('-');
        }
        
        for (char c : input.toCharArray()) {
            if (c != '-') {
                result.append(c);
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        // Test case
        String input = "hello-world-";
        String output = moveHyphensToFront(input);
        System.out.println(output);
    }
}
