import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        str = str.toLowerCase(); // for easy vowel check

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else {
                special++;
            }
        }

        // Output
        System.out.println(vowels + " " + consonants + " " + digits + " " + special);

        sc.close();
    }
}
