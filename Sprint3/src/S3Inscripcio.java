import java.util.Scanner;
public class S3Inscripcio {
    public static void main(String[] args) {

        int punts = 0;
        int germaEnCentre;
        int poblacio;
        int parestreballant;
        int discapacitat;
        int tipusfamilia;
        int escolaritzat;
        int proximitat = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre d'inscripció: ");
        int alumne = scanner.nextInt();

        System.out.print("Té colque germà en el centre (0: no / 1:si)?: ");
        germaEnCentre = scanner.nextInt();

        System.out.print("Viu en la mateixa població (0: no / 1:si)?: ");
        poblacio = scanner.nextInt();

        System.out.print("El pare o la mare traballa en la mateixa població (0: no / 1:si)?: ");
        parestreballant = scanner.nextInt();

        System.out.print("Té colque discapacitat igual o superior al 33% (0: no / 1:si)?: ");
        discapacitat = scanner.nextInt();

        System.out.print("Forma part d'una familia nombrosa o monoparental(0: no / 1:si)?: ");
        tipusfamilia = scanner.nextInt();

        System.out.print("Ha tengut el pare, mare, tutor legal o germà escolaritzat en el mateix centre(0: no / 1:si)?: ");
        escolaritzat = scanner.nextInt();

        if (poblacio == parestreballant) {
            proximitat = 30;
        } else if (poblacio == 1 || parestreballant == 0) {
            proximitat = 30;
        } else if (parestreballant == 1 || poblacio == 0) {
            proximitat = 20;
        }
        punts = germaEnCentre * 40 + discapacitat * 10 + tipusfamilia * 15 + escolaritzat * 5 + proximitat;
        System.out.println("L'alumne " + alumne + " té: " + punts + " punts");
    }
}