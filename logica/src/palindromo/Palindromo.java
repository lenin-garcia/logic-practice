package palindromo;

import java.util.Locale;
import java.util.Scanner;

/*Mostrar si una palabra es palindromo o no
* Palindromo: palabras que se leen iguales al derecho y a la inversa
* */
public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra que queremos evaluar");
        String palabra = sc.nextLine();

        // Pasamos la palabra a minúscula antes de evaluar
        String palabraMinuscula = palabra.toLowerCase();

        //posiciones de la palabra
        int iniPosition = 0;
        int finPosition = palabraMinuscula.length() - 1;

        boolean esPalindromo = true;

        while (iniPosition < finPosition) {
            //obtenemos los caracteres
            char firstChar = palabraMinuscula.charAt(iniPosition);
            char lastChar = palabraMinuscula.charAt(finPosition);

            //Entrara cuando sean diferentes, y no sera necesario continuar la evaluacion
            if (firstChar != lastChar) {
                esPalindromo = false;
                break;
            }

            // Mover los índices hacia el centro de la palabra
            ++iniPosition;
            --finPosition;
        }

        if (esPalindromo) {
            System.out.println("Es un palíndromo!!");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

}
