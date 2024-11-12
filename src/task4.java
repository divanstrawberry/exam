import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int[] array = new int[7];
        int euro=0;
        int summa=0;
        for (int i=0;i < array.length;i++){
            System.out.println("Введите расходы за "+ (i+1) +" день: ");
            int num = console.nextInt();
            array[i]=num;
            summa +=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма: "+summa);
        euro = (int)(summa *100); {
            System.out.println("в евро: " + euro);
        }
    }
}
