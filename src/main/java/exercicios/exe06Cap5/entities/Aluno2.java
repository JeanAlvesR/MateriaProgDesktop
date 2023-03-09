/*


*/
package exercicios.exe06Cap5.entities;

public class Aluno2 {
    
    private double nota1, nota2, nota3, nota4;
    
    public void recebeNota1(double nota) {
        nota1 = nota;
    }
    
    public void recebeNota2(double nota) {
        nota2 = nota;
    }
    
    public void recebeNota3(double nota) {
        nota3 = nota;
    }
    
    public void recebeNota4(double nota) {
        nota4 = nota;
    }
    
    public void imprimeMedia() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.printf("Média: %.1f -> %s.%n", media, (media >= 6.0) ? "aprovado" : "reprovado");
    }
}
