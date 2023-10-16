public class OccurrenceChar {
    public static void main(String[] args) {
        String str = "welcome";
        int[] occur = new int[str.length()];
        int i, j;

        char string[] = str.toCharArray();

        for (i = 0; i < str.length(); i++) {
            occur[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    occur[i]++;
                }
            }
        }

        for (i = 0; i < occur.length; i++) {

            System.out.println(string[i] + " is occured for " + occur[i] + " times");
        }
    }
}