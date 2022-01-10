
public class BilPangkatDua {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        System.out.println(bilanganPangkat(a,b));
    }

    // function manual bilangan pangkat
    public static double bilanganPangkat(double a, double b){
        double temp = 1;

        // 2 -> a pangkat 3 -> b = 2 x 2 x 2
        for(int i = 1; i <= b; i++){
            // temp = 1
            // temp = 1 * 2 = 2
            // temp = 2 * 2 = 4
            // temp = 4 * 2 = 8
            temp = temp * a;
        }

        return temp;
    }
}
