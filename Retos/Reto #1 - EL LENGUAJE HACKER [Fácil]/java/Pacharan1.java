import java.util.Scanner;


public class Pacharan1 {

    public static void main(String[] args) {
        char[] letra = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};
        String[] leet = {"4", "|3", "[", ")", "3", "|=", "&", "#", "1", ",_|", ">|", "1", "/\\/\\", "^/",
            "0", "|*", "(_,)", "I2", "5", "7", "(_)", "\\/", "\\/\\/", "><", "j", "2", "o", "L", "R", "E", "A",
            "S", "b", "T", "B", "g", " "};

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase a traducir en lenguaje hacker");
        String frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < letra.length; j++) {
                if (frase.charAt(i) == letra[j]) {
                    System.out.print(leet[j]);
                }
            }
        }
        System.out.println();

    }
}
