import java.util.ArrayList;

public class PlusOne {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int i = 0;
        while (i < a.size() - 1 && a.get(i) == 0) {
            a.remove(i);
        } // removes 0s from the beginning of the array.

        int carry = 1;
        int sum;

        for (i = a.size() - 1; i >= 0; i--) {
            sum = a.get(i) + carry;
            a.set(i, sum/10); //sets the last digit of the sum
            carry = sum%10; //sets carry to the remainder of the sum.

            if (carry == 0) {
                break;
            }
        }

        if (carry != 0) {
            a.set(0, carry);
        }

        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(9);
        number.add(9);
        number.add(9);

        System.out.println(plusOne(number));
    }
}