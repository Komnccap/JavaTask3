import java.util.ArrayList;
import java.util.Random;

public class Task3_FindNums {
    public static void main(String[] args) {
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее число из этого списка.
        Random randNum = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        int minValue = 101, midlValue = 0, maxValue = 0, count = 0, count2 = 0;
        while (count != 10){
            int num = randNum.nextInt(1, 10);
            nums.add(num);
            count++;
        }
        System.out.println("Числа в списке");
        System.out.println(nums.toString());

        while (count2 != nums.size()){
            if(nums.get(count2) > maxValue) {
                maxValue = nums.get(count2);
                count2++;
            } else if (nums.get(count2) < minValue) {
                minValue = nums.get(count2);
                count2++;
            } else if (nums.get(count2) < maxValue && nums.get(count2) > minValue ) {
                midlValue = nums.get(count2);
                count2++;
            } else {
                count2++;
            }
        }
        System.out.printf("максимальное значение = %d ",maxValue);
        System.out.printf("Среднее значение = %d ", midlValue);
        System.out.printf("Минимальное значение = %d ",minValue);
    }
}
