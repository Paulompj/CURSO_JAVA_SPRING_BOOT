package Exercicios.Excecoes.Try_Catch;
public class Estudo {
    public static void main(String[] args) {
        int vet[] = {1, 2, 0, 4, 5};
        int soma = 0;
        for(int i = 0; i < vet.length; i += 1) {
            try {
                if((i+1)%2 != 0){
                    throw new DivisaoException();
                }
                soma += i + 1 / vet[i];
                System.out.println("OK");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Esse array nao existe");
            } catch (ArithmeticException e) {
                System.out.println("DIVISAO POR ZERO NAO PODE!!");
            } catch (DivisaoException x){
                System.out.println(x.getMessage());
            }
        }
    }
}
