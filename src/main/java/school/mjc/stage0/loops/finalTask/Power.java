package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int degreeOfNumber = 1;
        for (int i = 1; i <= power; i++) {
            degreeOfNumber *= numberToPrint;

        }
        System.out.println(degreeOfNumber);


    }

    public static void main(String[] args) {

        new Power().printPower(10, 4);
    }
}
