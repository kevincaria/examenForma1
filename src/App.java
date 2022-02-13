
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numero que se debe formar: ");
        Integer requerido = read.nextInt();
        System.out.println("Cuantos numeros desea ingresar a la lista?");
        Integer dimension = read.nextInt();
        List <Integer> listaNumeros = new ArrayList<Integer>();
        for (Integer i = 0; i < dimension; i++) {
            System.out.println("Ingrese el numero de la posicion " + i);
            listaNumeros.add(read.nextInt());
        }
        boolean resultado = false;
        int suma;
        int posicion = 0;
        for (int j = 0; j < dimension; j++) {
            for (int i = 0; i < dimension; i++) {
                suma = 0;
                if (posicion != i) {
                    suma = listaNumeros.get(posicion) + listaNumeros.get(i);
                }
                if (suma == requerido) {
                    resultado = true;
                }
                if (dimension == i+1) {
                    posicion = posicion+1;
                }
            }
        }
        System.out.println("¿Se puede formar el numeros: " + requerido + " ? " + resultado);

    }
}
