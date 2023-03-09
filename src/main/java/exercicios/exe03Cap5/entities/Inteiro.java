/*
Construa a classe Inteiro que representa um número inteiro. Essa classe deve ter os seguintes atributos
e métodos:

– Atributos:
∗ int valor
Valor do inteiro representado.
– Métodos para interação com o usuário da classe:
∗ void carregaValor(int v)
Muda o valor representado por este objeto. O novo valor deve ser v.
∗ int devolveValor()
Devolve o valor representado por este objeto.
∗ int devolveValorAbsoluto()
Devolve o valor absoluto do valor representado por este objeto.
∗ void imprime()
Imprime algo que representa este objeto. Sugestão: imprima o seu valor.

> Inteiro i = new Inteiro();
> i.carregaValor(14);
> i.devolveValor()
14
> i.carregaValor(-473158);
> i.devolveValor()
-473158
> i.devolveValorAbsoluto()
473158
> i.imprime();
*/
package exercicios.exe03Cap5.entities;

public class Inteiro {

    private int valor;

    public void carregaValor(int v) {
        this.valor = v;
    }

    public int devolveValor() {
        return this.valor;
    }

    public int devolveValorAbsoluto() {
        return Math.abs(this.valor);
    }

    public void imprime() {
        System.out.println("Valor: " + valor);
    }

    public static void main(String[] args) {
        Inteiro i = new Inteiro();
        i.carregaValor(14);
        System.out.println(i.devolveValor());
        i.carregaValor(-473158);
        System.out.println(i.devolveValor());
        System.out.println(i.devolveValorAbsoluto());
        i.imprime();
    }
}
