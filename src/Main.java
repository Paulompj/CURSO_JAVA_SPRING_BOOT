import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       double x=32.45678;
        System.out.println(x);
        System.out.printf("%.2f\n",x);
        System.out.printf("%.4f\n",x);



    }

}
