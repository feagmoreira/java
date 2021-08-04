import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int dinheiro, cem, cinq, vint, dez, cinc, dois, um, resto;
        
        dinheiro = teclado.nextInt();
        cem = dinheiro / 100;
        resto = dinheiro % 100;
        cinq = resto / 50;
        resto = resto % 50;
        vint = resto / 20;
        resto = resto % 20;
        dez = resto / 10;
        resto = resto % 10;
        cinc = resto / 5;
        resto = resto % 5;
        dois = resto / 2;
        um = resto % 2;
        
        System.out.println(dinheiro);
        System.out.println(cem+" nota(s) de R$ 100,00");
        System.out.println(cinq+" nota(s) de R$ 50,00");
        System.out.println(vint+" nota(s) de R$ 20,00");
        System.out.println(dez+" nota(s) de R$ 10,00");
        System.out.println(cinc+" nota(s) de R$ 5,00");
        System.out.println(dois+" nota(s) de R$ 2,00");
        System.out.println(um+" nota(s) de R$ 1,00");

    }
}