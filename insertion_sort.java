package HomaWork_2;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] array = {12, 22, 1, 32, 17, -12, 5, 0};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
	        int value = array[left];
	        int i = left - 1;
	    for(; i >= 0; i--) {
	        if (value < array[i]) {
			    array[i + 1] = array[i];} 
            else {
			    break;}
	        }
	    array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
