import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.print("Введите число для рассчета: ");
        int num = iScaner.nextInt();
        int res = sumNums(num);
        System.out.format("Сумма чисел от 1 до %d = %d \n", num,res);
        int res2 = multiplyNums(num);
        System.out.format("Произведение чисел от 1 до %d = %d", num, res2);
        iScaner.close();
    }
    public static int sumNums (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
    public static int multiplyNums(int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
