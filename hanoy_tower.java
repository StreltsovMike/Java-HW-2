package HomaWork_2;

import java.util.Arrays;

public class hanoy_tower {
    public static void main(String[] args) {
        int[] tower1 = {1, 2, 3, 4, 5, 6};
        int[] tower2 = new int[tower1.length];
        int[] tower3 = new int[tower1.length];
        int count = 0;
        printTowers(tower1, tower2, tower3, count);
        movementCycle(tower1, tower2, tower3, count);
    }
    
    public static void printTowers(int[] tower1, int[] tower2, int[] tower3, int count){
        System.out.printf("%d цикл:\n", count);
        System.out.println(Arrays.toString(tower1));
        System.out.println(Arrays.toString(tower2));
        System.out.println(Arrays.toString(tower3));
    }

    public static void movementCycle(int[] tower1, int[] tower2, int[] tower3, int count) {
        tower2[0] = tower1[tower1.length - (count + 1)];     //перемещение верхнего кольца с 1й на 2ю башню
        tower1[tower1.length - (count + 1)] = 0;

        for (int j = 0; j < count; j++) {                    //перемещение всех колец с 3й на 2ю башню
            tower2[j + 1] = tower3[j];
            tower3[j] = 0;
        }
        for (int j = 0; j < count + 1; j++) {                //перемещение всех колец со 2й на 3ю башню
            tower3[j] = tower2[j];
            tower2[j] = 0;
        }
        count ++;
        
        printTowers(tower1, tower2, tower3, count);

        if(count < tower1.length){  
            movementCycle(tower1, tower2, tower3, count);
        }
    }
} 


