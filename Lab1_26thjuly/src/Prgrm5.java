public class Prgrm5 {

    public static void main(String[] args) {
        char ch = 'G'; 

        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is NOT an Alphabet.");
        }
    }
}
