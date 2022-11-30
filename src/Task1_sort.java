import java.util.Arrays;

public class Task1_sort {
    public static void main(String[] args) {
    // Реализовать алгоритм сортировки слиянием
        int[] unsort = {10, 6, 8, 5, 7, 3, 4, 11, 0, 2, 1, 9, -1, -88};
        int[] result = mergesort(unsort);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergesort(int[] unsort) {
        int[] bufNum1 = Arrays.copyOf(unsort, unsort.length);
        int[] bufNum2 = new int[unsort.length];
        int[] result = mergesortInner(bufNum1, bufNum2, 0, unsort.length);
        return result;
    }
    public static int[] mergesortInner(int[] bufNum1, int[] bufNum2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return bufNum1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(bufNum1, bufNum2, startIndex, middle);
        int[] sorted2 = mergesortInner(bufNum1, bufNum2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result;

        if (sorted1 == bufNum1){
            result = bufNum2;
        }
        else {
            result = bufNum1;
        }
        while (index1 < middle && index2 < endIndex) {
            if(sorted1[index1] < sorted2[index2]){
                result[destIndex++] = sorted1[index1++];
            }
            else {
                result[destIndex++] = sorted2[index2++];
            }
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
