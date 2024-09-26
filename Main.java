import java.util.Arrays;
import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {

            int[] list = {23, 5, 12, 2, 43, -2, -55};

            Scanner inp = new Scanner(System.in);

            System.out.println("Lutfen Bir Sayi Giriniz :");
            int number = inp.nextInt();


            Integer min = null;
            Integer max = null;

            for (int i : list) {
                if (i < number) {
                    if (min == null || i > min) {
                        min = i;
                    }
                }
                if (i > number) {
                    if (max == null || i < max) {
                        max = i;
                    }
                }
            }

            if (min != null) {
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
            } else {
                System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
            }

            if (max != null) {
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
            } else {
                System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
            }
        }
    }