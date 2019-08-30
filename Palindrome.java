import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{

    public static boolean isPalindrome(String word)
    {
        boolean is_palindrome = false;

        StringBuilder string_builder = new StringBuilder(word);
        String reversed_word = string_builder.reverse().toString();

        is_palindrome = word.equals(reversed_word);

        return is_palindrome;
    }

    public static void main(String[] args) {

        String word = null;

        if (args.length == 0) {

            BufferedReader reader = null;

            try {

                reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter a word << ");
                word = reader.readLine();

            } catch (IOException e) {

                return;

            }
        } else {

            word = args[0];

        }

        if (isPalindrome(word)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }

}
