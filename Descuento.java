import java.util.Scanner;
public class Descuento {
    public static void main(String[] args) {
        final int Descuento1 = 25;
        final int Descuento2 = 50;
        float importeDescontado;
        float importeFinal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de piezas: ");
        int numPiezas = scanner.nextInt();
        System.out.print("Ingrese el importe inicial: ");
        float importeInicial = scanner.nextFloat();

        if(numPiezas<= 3){
            importeDescontado = (importeInicial * Descuento1) / 100;
        } else{
            importeDescontado = (importeInicial * Descuento2) / 100;
        }

        importeFinal = importeInicial - importeDescontado;
        System.out.println("L'import final es: " + importeFinal);
    }
}