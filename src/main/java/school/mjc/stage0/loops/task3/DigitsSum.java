package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        int absNum = Math.abs(t);
        String text = String.valueOf(absNum);
        int sum = 0;
        for (int i = text.length(); i >= 0; i--) {
            if(absNum>9){
                int eachDigit = absNum/(int)Math.pow(10,i);
                sum+=eachDigit;
                absNum-= eachDigit*(int)Math.pow(10,i);
            }else{
                sum+=absNum%10;
                break;
            }

        }
        System.out.println(sum);
    }
}
