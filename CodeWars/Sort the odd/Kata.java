/**
 * You have an array of numbers.
 Your task is to sort ascending odd numbers but even numbers must be on their places.

 Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

 Example

 sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */

public class Kata {
    public static int[] sortArray(int[] array) {
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (i!=j&&array[i]%2==1&&array[j]%2==1&&array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
        return array;
    }
}