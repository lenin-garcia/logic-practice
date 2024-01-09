package tabla_de_multiplicar;

import java.util.Scanner;

/*Ingresar un numero y mostrar la tabla de
* multiplicar
* */
public class CrearTabla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de la tabla que quiere obtener");
        int numero = sc.nextInt();
        int limite =10;

        if( numero > 0){
         for (int i = 1; i <= limite; ++i) {
             int result = i * numero;
             System.out.println(i + "x" + result + "=" + result );
         }
        }
    }

}
