import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int inicio, fim , total;
                
        inicio = teclado.nextInt();
        fim = teclado.nextInt();
        total = 0;

        if (inicio < fim){
            total = fim - inicio;
        }
        else if (inicio == fim){
            total = 24;
        }
        else if (inicio > fim){
            total = (24 - inicio + fim);
        }
        System.out.println("O JOGO DUROU "+total+" HORA(S)");
    }
}