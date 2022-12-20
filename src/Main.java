
public class Main {
    public static void main(String args[]) {
        System.out.print("Уникальные значения в массиве: ");
        int[] myArray = {7, 1, 7, 8, 1, 67, 6, 5, 6};
        for (int i = 0; i < myArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < myArray.length; j++) {
                if(myArray[i] == myArray[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print(myArray[i] + " ");
        }
    }
    }
