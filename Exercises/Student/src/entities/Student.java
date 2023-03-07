package entities;

public class Student {
    public String name;
    public double firstQuarter;
    public double secondQuarter;
    public double thirdQuarter;

    public void Verify() {
        double finalGrade = firstQuarter + secondQuarter + thirdQuarter;
        System.out.println("FINAL GRADE = " + String.format("%.2f\n", finalGrade));
        if (finalGrade >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING "+String.format("%.2f",60-finalGrade)+" POINTS");
        }
    }
}
