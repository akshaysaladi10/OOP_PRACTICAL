public class Prgrm6 {

    public static void main(String[] args) {
        char ch = 'e';  

        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            
            char lowerCh = Character.toLowerCase(ch);

            
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println(ch + " is not a valid Alphabet character.");
        }
    }
}