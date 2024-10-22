import java.util.Scanner;
public class Sprint3Piscines {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double llarg = 300.3;

        System.out.println("introdueix l'amplada de la piscina 2: ");
        double ample1 =scanner.nextDouble();
        System.out.println("Introdueix la profunditat de la piscina 1: ");
        double profunditat1 = scanner.nextDouble();
        System.out.println("Introdueix l'amplada de la piscina 2: ");
        double ample2= scanner.nextDouble();
        System.out.println("Introdueix la profunditat de la piscina 2: ");
        double profunditat2 = scanner.nextDouble();

        double area1=  (int)llarg*ample1;
        double area2=  (int)llarg*ample2;
        System.out.print("L'àrea de la piscina 1: " + area1 + " i l'àrea de la piscina 2 és: " + area2);

        double volum1= (int)area1*profunditat1;
        double volum2= (int)area2*profunditat2;

        double ampletotal= ample2+ample1;

        double areatotal =(ample2+ample1)+llarg;

        double volumtotal= volum1+volum2;

        double intercanviprofunditat = profunditat1;
        profunditat1 = profunditat2;
        profunditat2 = intercanviprofunditat;

        double nouvolum1 = area1*profunditat2;
        double nouvolum2 = area2*profunditat2;



    }
}