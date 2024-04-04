public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        System.out.println("Duplicate Characters:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1 && Character.isLetterOrDigit((char) i)) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
    public static void main(String[] args) {
        String inputString = "programming";
        findDuplicateCharacters(inputString);
    }
}
