package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNum = 0;
        int secondNumber = 1;
        int thirdNumber=0;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(firstNum);
            thirdNumber=firstNum+secondNumber;
            firstNum=secondNumber;
            secondNumber=thirdNumber;
        }
    }
}
