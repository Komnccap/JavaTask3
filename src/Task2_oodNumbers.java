import java.util.ArrayList;
import java.util.Random;

public class Task2_oodNumbers {
    public static void main(String[] args) {
    // Удалить нечётные числа из произвольного списка целых чисел.

        Random randNum = new Random();
        int count = 0, count2 = 0;
        ArrayList<Integer> nonSort = new ArrayList<>(), Sort = new ArrayList<>();
        System.out.println("Список до удаления нечётных чисел");
        while (count != 10){
            int num = randNum.nextInt(100);
            nonSort.add(num);
            count++;
        }
        System.out.println(nonSort.toString());
        System.out.println("Список после удаления нечётных чисел");
        while (count2 != nonSort.size()){
            if(nonSort.get(count2) % 2 == 0){
                Sort.add(nonSort.get(count2));
                count2++;
            }
            else {
                count2++;
            }
        }
        System.out.println(Sort.toString());

    }
}
