package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String eachNumber ="";
        int sum=0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            for (int j = 1; j <=i ; j++) {
                eachNumber+="9";
            }
            sum+=Integer.parseInt(eachNumber);
            eachNumber="";
        }
        System.out.println(sum);
    }
}
