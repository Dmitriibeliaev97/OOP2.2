public class Hogwarts {
    private String student;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String student, int powerOfMagic, int transgression) {
        this.student = student;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return  student;
    }

    public static void comparisonOfStudents (Hogwarts studentA, Hogwarts studentB) {
        if (studentA.getPowerOfMagic() > studentB.getPowerOfMagic()) {
            System.out.println(studentA.getStudent() + " обладает бОльшей мощностью магии, чем " + studentB.getStudent());
        } else {
            System.out.println(studentB.getStudent() + " обладает бОльшей мощностью магии, чем " + studentA.getStudent());
        }

        if (studentA.getTransgression() > studentB.getTransgression()) {
            System.out.println(studentA.getStudent() + " обладает бОльшим расстоянием трансгрессии, чем " + studentB.getStudent());
        } else {
            System.out.println(studentB.getStudent() + " обладает бОльшим расстоянием трансгрессии, чем " + studentA.getStudent());
        }
    }
}
