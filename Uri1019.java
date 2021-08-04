import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int horas, minutos, segundos, N, resto;
        
        N = teclado.nextInt();
        horas = N / 3600;
        resto = N % 3600;
        minutos = resto /60;
        segundos = resto % 60;

        System.out.println(horas+":"+minutos+":"+segundos);
        
    }
}