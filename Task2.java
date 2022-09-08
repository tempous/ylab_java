import java.util.*;

    /*
    Task2

        [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
    */

public class Task2 {
    static int[] twoSum(int[] numbers, int sum)
    {
        int left = 0, right = numbers.length - 1;
        while (left < right)
        {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == sum)
                return new int[] { numbers[left], numbers[right] };
            if (currentSum < sum)
                left++;
            else
                right--;
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] sourceArray = new int[] { 3, 4, 2, 7 };
        int sum = 10;
        System.out.println(Arrays.toString(twoSum(sourceArray, sum)));
    }
}