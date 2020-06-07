import java.util.ArrayList;

public class LargestSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(-2);
        number.add(1);
        number.add(-3);
        number.add(4);
        number.add(-1);
        number.add(2);
        number.add(1);
        number.add(-5);
        number.add(4);


        int prevSum = 0;
        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i : number) {
            prevSum += i;
//            currentSum = prevSum + number.get(i+1);

            max = Math.max(prevSum, max);

//            if (prevSum < 0) {
//                prevSum = 0;
//            }
        }

        System.out.println(max);
    }
}
