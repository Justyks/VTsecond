package task7;

import java.util.Arrays;
import java.util.Random;

public class task7 {

        void sort(int arr[]) {
            int n = arr.length;
            for (int gap = n / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < n; i += 1) {
                    int temp = arr[i];
                    int j;
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = temp;
                }
            }
        }
    
        public static void main(String[] args) {
            
            Random random=new Random();
            int n = 5;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i]= random.nextInt(100);
            }
          
            System.out.println(Arrays.toString(array));
            task7 ob = new task7();
            ob.sort(array);
            System.out.println(Arrays.toString(array));
        }
    }

