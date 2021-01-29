import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(doThree(2,2,2,2));
        System.out.println(doFour(5,6));
        doFive(0);
        System.out.println(doSix(0));
        doSeven("Дима");
        doEight();

    }
    static void doTwo (){
        byte var1 = 1;
        short var2 = 200;
        int var3 = 50000;
        long var4 = 999999999;
        float var5= 99.99f;
        double var6= 9999.9999;
        char var7 = 'S';
        boolean var8 = true;
    }

    static float doThree (float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    static boolean doFour(int a, int b){

        if (10 <= (a + b) && (a + b)<= 20) {
            return true;
        } else return false;
    }

    static void doFive(int a){
        if (a >= 0) {
            System.out.println("Число: " + a + " - положительное");
        } else {
            System.out.println("Число: " + a + " - отрицательное!");
        }
    }
    static boolean doSix (int a){
        if (a < 0) {
            return true;
        } else return false;
    }

    static void doSeven (String name){
        System.out.println("Привет " + name + "!");
    }

    static void doEight(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер года: ");
        int a = scan.nextInt();
        if (!(a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0))) {
            System.out.println("Год " + a +" - не високосный");
        } else {
            System.out.println("Год " + a + " - високосный");
        }
    }
}
