import java.util.Arrays;
import java.util.Stack;

public class Main {
    static Gryffindor[] gryffindors = new Gryffindor[3];
    static Hufflepuff[] hufflepuffs = new Hufflepuff[3];
    static Ravenclaw[] ravenclaws = new Ravenclaw[3];
    static Slytherin[] slytherins = new Slytherin[3];
    public static void main(String[] args) {
        gryffindors[0] = new Gryffindor("Гарри Поттер", 5, 4, 8, 6, 9);
        gryffindors[1] = new Gryffindor("Гермиона Грейнджер", 7, 8, 7, 5, 4);
        gryffindors[2] = new Gryffindor("Рон Уизли", 2, 3, 9, 4, 2);

        hufflepuffs[0] = new Hufflepuff("Захария Смит", 4, 6, 8, 3, 5);
        hufflepuffs[1] = new Hufflepuff("Седрик Диггори", 6, 7, 5, 2, 7);
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", 3, 5, 9, 6, 3);

        ravenclaws[0] = new Ravenclaw("Чжоу Чанг", 2, 8, 3, 5, 4, 8);
        ravenclaws[1] = new Ravenclaw("Падма Патил", 8, 7, 6, 2, 3, 5);
        ravenclaws[2] = new Ravenclaw("Маркус Белби", 3, 2, 6, 7, 8, 2);

        slytherins[0] = new Slytherin("Драко Малфой", 8, 3, 7, 2, 3, 4, 8);
        slytherins[1] = new Slytherin("Грэхэм Монтегю", 3, 6, 2, 6, 5, 6, 3);
        slytherins[2] = new Slytherin("Грегори Гойл", 6, 4, 5, 5, 2, 6, 5);

        System.out.println("Факультет Гриффиндор:");
        studentOfGryffindor();
        Gryffindor.comparisonOfGryffindor(gryffindors [0], gryffindors [1]);
        System.out.println();

        System.out.println("Факультет Пуффендуй:");
        studentOfHufflepuff();
        Hufflepuff.comparisonOfHufflepuff(hufflepuffs[0], hufflepuffs[1]);
        System.out.println();

        System.out.println("Факультет Когтевран:");
        studentOfRavenclaw();
        Ravenclaw.comparisonOfRavenclaw(ravenclaws[0], ravenclaws[1]);
        System.out.println();

        System.out.println("Факультет Слизерин:");
        studentOfSlytherin();
        Slytherin.comparisonOfSlytherin(slytherins[0], slytherins[1]);
        System.out.println();

        Hogwarts.comparisonOfStudents(gryffindors[1], slytherins [1]);
        System.out.println();

        }

    public static void studentOfGryffindor () {
        for (Gryffindor gryffindor: gryffindors) {
                System.out.println("У " + gryffindor.getStudent() + " благородство = "
                        + gryffindor.getNobility() + " баллов, честь = "
                        + gryffindor.getHonor() + " баллов, храбрость = "
                        + gryffindor.getBravery() + " баллов");
            int sumOfPointsGryffindor = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
            System.out.println("Сумма баллов свойств факультета = " + sumOfPointsGryffindor);
        }
    }
    public static void studentOfHufflepuff () {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("У " + hufflepuff.getStudent() + " сила магии = "
                    + hufflepuff.getPowerOfMagic() + ", транcгрессия = "
                    + hufflepuff.getTransgression() + " трудолюбие = "
                    + hufflepuff.getHardworking() + " баллов, верность = "
                    + hufflepuff.getLoyalty() + " баллов, честность = "
                    + hufflepuff.getHonesty() + " баллов");
            int sumOfPointsHufflepuff = hufflepuff.getHardworking() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
            System.out.println("Сумма баллов свойств факультета = " + sumOfPointsHufflepuff);
        }
    }
    public static void studentOfRavenclaw () {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("У " + ravenclaw.getStudent() + " сила магии = "
                    + ravenclaw.getPowerOfMagic() + ", транcгрессия = "
                    + ravenclaw.getTransgression() + " ум = "
                    + ravenclaw.getMind() + " баллов, мудрость = "
                    + ravenclaw.getWisdom() + " баллов, остроумность = "
                    + ravenclaw.getWit() + " баллов, творчество = "
                    + ravenclaw.getFullOfCreativity() + " баллов");
            int sumOfPointsRavenclow = ravenclaw.getMind() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getFullOfCreativity();
            System.out.println("Сумма баллов свойств факультета = " + sumOfPointsRavenclow);
        }
    }
    public static void studentOfSlytherin () {
        for (Slytherin slytherin : slytherins) {
            System.out.println("У " + slytherin.getStudent() + " сила магии = "
                    + slytherin.getPowerOfMagic() + ", транcгрессия = "
                    + slytherin.getTransgression() + " хитрость = "
                    + slytherin.getCunning() + " баллов, решительность = "
                    + slytherin.getDetermination() + " баллов, амбициозность = "
                    + slytherin.getAmbition() + " баллов, находчивость  = "
                    + slytherin.getResourcefulness() + " баллов, жажда власти = "
                    + slytherin.getLustForPower() + " баллов");
            int sumOfPointsSlytherin = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
            System.out.println("Сумма баллов свойств факультета = " + sumOfPointsSlytherin);
        }
    }


}