
package exercicios.exe05Cap5.entities;
import exercicios.exe04Cap5.entities.Inteiro;


public class TestaInteiro {
    public static void main(String[] args) {
        Inteiro num1 = new Inteiro();
        num1.carregaValor(10);
        System.out.println("Valor atual: " + num1.devolveValor());
        num1.soma(5);
        System.out.println("Novo valor: " + num1.devolveValor());
        num1.subtrai(3);
        System.out.println("Novo valor: " + num1.devolveValor());
        num1.multiplicaPor(2);
        System.out.println("Novo valor: " + num1.devolveValor());
        num1.dividePor(4);
        System.out.println("Novo valor: " + num1.devolveValor());
        num1.dividePor(0);
        System.out.println("Novo valor: " + num1.devolveValor());
    }
}
