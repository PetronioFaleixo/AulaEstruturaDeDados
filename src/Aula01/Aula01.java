package Aula01;
import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int [8];
        for (int i = 0; i < 8 ; i++) {
            System.out.println("Informe o valor no vetor " + i);
            num[i] = ler.nextInt();
            System.out.println(num[i]);
        }
        int countMaior30 = 0;
        int somaMaior30 = 0;
        int somaTotal = 0;

        for (int i = 0; i < 8; i++) {
            somaTotal += num[i];

            if (num[i] > 30) {
                countMaior30++;
                somaMaior30 += num[i];
            }
        }

    }
    public  class Ordenacao {

    }
}


