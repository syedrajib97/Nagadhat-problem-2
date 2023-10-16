public class PatternMatching {
    public static void main(String[] args) {
        String text = "tadadattaetadadadafa";
        String pattern = "dada";

        int[] occurrences = findOccurrences(text, pattern);

        System.out.println("The pattern \"" + pattern + "\" appears at positions:");
        for (int position : occurrences) {
            System.out.println(position);
        }2
        System.out.println("Total occurrences: " + occurrences.length);
    }

    public static int[] findOccurrences(String text, String pattern) {
        int[] occurrences = new int[0];

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                occurrences = appendToArray(occurrences, i);
            }
        }

        return occurrences;
    }

    public static int[] appendToArray(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = value;
        return newArray;
    }
}
