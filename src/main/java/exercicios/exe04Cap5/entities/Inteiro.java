/*

 */
package exercicios.exe04Cap5.entities;

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
        System.out.println("Valor: " + this.valor);
    }

    public int soma(int v) {
        this.valor += v;
        return this.valor;
    }

    public int subtrai(int v) {
        this.valor -= v;
        return this.valor;
    }

    public int multiplicaPor(int v) {
        this.valor *= v;
        return this.valor;
    }

    public int dividePor(int divisor) {
        if (divisor == 0) {
            System.out.println("Erro: Divisão por zero");
            return this.valor;
        } else {
            this.valor /= divisor;
            return this.valor;
        }
    }

}
