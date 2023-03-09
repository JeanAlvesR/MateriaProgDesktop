
package exercicios.exe06Cap5.entities;

public class TestaAluno2 {
    
    public static void main(String[] args) {
        Aluno2 aluno = new Aluno2();
        aluno.recebeNota1(5.0);
        aluno.recebeNota2(7.0);
        aluno.recebeNota3(9.0);
        aluno.recebeNota4(7.0);
        aluno.imprimeMedia();
    }
}
