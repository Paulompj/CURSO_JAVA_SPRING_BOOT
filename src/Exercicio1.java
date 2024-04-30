import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        String product1="Computer";
        String product2="Office Desk";
        int age=30;
        int code=5290;
        char gender='f';
        double prince1=2100.0;
        double prince2=650.50;
        double measure=53.234567;
        System.out.println("Products:");
        System.out.printf("%s, which price is R$%.2f",product1,prince1);
        System.out.printf("%s, which price is R$%.2f",product2,prince2);
        System.out.println("\n");
        System.out.printf("Record: 30 years old, code %d and gender: %s",code,gender);
        System.out.println("\n");
        System.out.printf("Measue with eight decimal places:%.10f\n",measure);
        System.out.printf("Rouded (three decimal places):%.3f\n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point:%f\n",measure);




    }
}
