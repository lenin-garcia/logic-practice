package encontrar_frase;

import java.util.Scanner;

/*Dada una frase buscarla en un texto y mostrar las veces que esta dentro del texto*/
public class findPhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore " +
                "magna aliqua. Ut enim ad minim veniam, quis nostrud Lorem exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor Lorem in reprehenderit in voluptate Lorem velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
                "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem";

        System.out.println("ingrese la palabra que quiere buscar");
        String wordFind = scanner.nextLine();

        //dividimos nuestro mediante un separador(espacio en blanco) parrafo  para obtener cada palabra.
        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++){
            if ( parts[i].equals(wordFind)){
                ++count;
            }
        }
        System.out.println("La palabra: " + wordFind + " se encuentra " + count + " de veces");

    }

}
