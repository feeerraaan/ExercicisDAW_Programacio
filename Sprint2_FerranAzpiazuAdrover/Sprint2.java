public class Sprint2 {
    public static void main(String[] args) {
        int piscina1Llarg = 300;
        int piscina1Ample = 150;
        int piscina1Profunditat = 20;

        int piscina2Llarg = 300;
        int piscina2Ample = 80;
        int piscina2Profunditat = 35;

        int areapiscina1 = piscina1Llarg * piscina1Ample;
        int areapiscina2 = piscina2Llarg * piscina2Ample;
        System.out.println("L'Área de la piscina 1 és: " + areapiscina1 + " i l'àrea de la piscina 2 és: " + areapiscina2);

        int volumpiscina1 = piscina1Llarg * piscina1Ample * piscina1Profunditat;
        int volumpiscina2 = piscina2Llarg * piscina2Ample * piscina2Profunditat;
        System.out.println("El volum d'aigua que pot allotjar la piscina 1 és: " + volumpiscina1 + " i el volum d'aigua que pot allotjar la piscina 2 és:  " + volumpiscina1);

        int ampleconjunt = piscina1Ample + piscina2Ample;
        System.out.println("L'ample que omplirien les dues piscines juntes és: " + ampleconjunt + " i el llarg és: " + piscina1Llarg);

        int areaconjunt = ampleconjunt * piscina1Llarg;
        System.out.println("L'àrea conjunta de les dues piscines és: " + areaconjunt);

        int volumenconjunt = volumpiscina1 + volumpiscina2;
        System.out.println("El volum conjunt de les dues piscines és: " + volumenconjunt);

        int aux = piscina1Profunditat;
        piscina1Profunditat = piscina2Profunditat;
        piscina2Profunditat = aux;

        int nouvolumpiscina1 = piscina1Llarg * piscina1Ample * piscina1Profunditat;
        int nouvolumpiscina2 = piscina2Llarg * piscina2Ample * piscina2Profunditat;

        System.out.println("El nou valor de profunditat de la piscina 1 és: " + piscina1Profunditat + " i el seu nou volum és: " + nouvolumpiscina1);
        System.out.println("El nou valor de profunditat de la piscina 2 és; " + piscina2Profunditat + " i el seu nou volum és: " + nouvolumpiscina2);


    }
}
