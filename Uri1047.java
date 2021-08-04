import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int horai, mini, horaf, minf , totalh, totalm;
                
        horai = teclado.nextInt();
        mini = teclado.nextInt();
        horaf = teclado.nextInt();
        minf = teclado.nextInt();
        totalh = 0;
        totalm = 0;
        
        if (horai < horaf){
            totalh = ((horaf*60 + minf) - (horai*60 + mini))/60;
            totalm = ((horaf*60 + minf) - (horai*60 + mini)) % 60;
        }
        else if (horai == horaf && minf == mini){
            totalh = 24;
            totalm = 0;
        }
        else if (horai == horaf && minf > mini){
            totalh = 0;
            totalm = minf - mini;
        }
         else if (horai == horaf && mini > minf){
            totalh = 23;
            totalm = 60 - mini + minf;
        }
        else if (horai > horaf){
            totalh = (1440 -(horai*60 + mini) + (horaf*60 + minf))/60;
            totalm = (1440 -(horai*60 + mini) + (horaf*60 + minf)) % 60;
        }
        System.out.println("O JOGO DUROU "+totalh+" HORA(S) E "+totalm+" MINUTO(S)");
    }
}