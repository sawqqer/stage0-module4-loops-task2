package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i < printToInclusive){
            if(i % 2 != 0) {
                System.out.println(i + '\n');
            }
            i++;
        }
    }
}
