public class Ravenclaw extends Hogwarts{
   private int mind;
   private int wisdom;
   private int wit;
   private int fullOfCreativity;

    public Ravenclaw(String student, int powerOfMagic, int transgression, int mind, int wisdom, int wit, int fullOfCreativity) {
        super(student, powerOfMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public static int sumOfPointsRavenclaw (Ravenclaw student) {
        int sumOfPoints = student.getMind() + student.getWisdom() + student.getWit() + student.getFullOfCreativity();
        return sumOfPoints;
    }

    public static void comparisonOfRavenclaw(Ravenclaw studentA, Ravenclaw studentB) {
        if (Ravenclaw.sumOfPointsRavenclaw(studentA) > Ravenclaw.sumOfPointsRavenclaw(studentB)) {
            System.out.println(studentA + " лучший Гриффиндорец, чем " + studentB);
        } else {
            System.out.println(studentB + " лучший Гриффиндорец, чем " + studentA);
        }
    }
}
