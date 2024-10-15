public class Sprint2 {
    public static void main(String[] args) {

       //Variables Piscina1
        int piscina1Llarg = 300;
        int piscina1Ample = 150;
        int piscina1Profunditat = 20;

        //Variables Piscina2
        int piscina2Llarg = 300;
        int piscina2Ample = 80;
        int piscina2Profunditat = 35;

        //Calcular Arees piscina 1 i piscina 2
        int areapiscina1 = piscina1Llarg * piscina1Ample;
        int areapiscina2 = piscina2Llarg * piscina2Ample;
        System.out.println("L'Área de la piscina 1 és: " + areapiscina1 + " i l'àrea de la piscina 2 és: " + areapiscina2);

        //Calcular volum piscina 1 i piscina 2
        int volumpiscina1 = piscina1Llarg * piscina1Ample * piscina1Profunditat;
        int volumpiscina2 = piscina2Llarg * piscina2Ample * piscina2Profunditat;
        System.out.println("El volum d'aigua que pot allotjar la piscina 1 és: " + volumpiscina1 + " i el volum d'aigua que pot allotjar la piscina 2 és:  " + volumpiscina1);

        //Calcular l'ample conjunt de la piscina 1 i piscina 2
        int ampleconjunt = piscina1Ample + piscina2Ample;
        System.out.println("L'ample que omplirien les dues piscines juntes és: " + ampleconjunt + " i el llarg és: " + piscina1Llarg);

        //Calcular l'area conjunt de la piscina 1 i piscina 2
        int areaconjunt = ampleconjunt * piscina1Llarg;
        System.out.println("L'àrea conjunta de les dues piscines és: " + areaconjunt);

        //Calcular el volum conjunt de la piscina 1 i piscina 2
        int volumenconjunt = volumpiscina1 + volumpiscina2;
        System.out.println("El volum conjunt de les dues piscines és: " + volumenconjunt);

        //Intercanviar la profunditat de la piscina 1 y 2
        int aux = piscina1Profunditat;
        piscina1Profunditat = piscina2Profunditat;
        piscina2Profunditat = aux;

        //Calcular el nou volum de les piscines una vegada intercanviat els valors
        int nouvolumpiscina1 = piscina1Llarg * piscina1Ample * piscina1Profunditat;
        int nouvolumpiscina2 = piscina2Llarg * piscina2Ample * piscina2Profunditat;

        System.out.println("El nou valor de profunditat de la piscina 1 és: " + piscina1Profunditat + " i el seu nou volum és: " + nouvolumpiscina1);
        System.out.println("El nou valor de profunditat de la piscina 2 és; " + piscina2Profunditat + " i el seu nou volum és: " + nouvolumpiscina2);


    }
}
