public class CharacterOccurance {
    public static void main(String[] args) {
        String str = "JyotiPrajapati";
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        System.out.println("Character count in the string:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " = " + count[i]);
            }
        }
    }
}