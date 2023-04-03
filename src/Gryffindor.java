public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String student, int powerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(student, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static int sumOfPointsGryffindor (Gryffindor student) {
        int sumOfPoints = student.getNobility() + student.getHonor() + student.getBravery();
        return sumOfPoints;
    }
    public static void comparisonOfGryffindor(Gryffindor studentA, Gryffindor studentB) {
        if (Gryffindor.sumOfPointsGryffindor(studentA) >Gryffindor.sumOfPointsGryffindor(studentB)) {
            System.out.println(studentA + " лучший Гриффиндорец, чем " + studentB);
        } else {
            System.out.println(studentB + " лучший Гриффиндорец, чем " + studentA);
        }
    }
}
