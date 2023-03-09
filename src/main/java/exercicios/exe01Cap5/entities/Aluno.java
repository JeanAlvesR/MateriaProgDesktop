/*Neste exercício, construiremos uma classe que calcula a média aritmética de 4 notas e diz se o dono das
notas foi aprovado, está de recuperação ou foi reprovado.

Para isso, crie uma classe Aluno com métodos que carreguem as 4 notas em variáveis p1, p2, p3, p4 e
um método responsável por calcular a média aritmética das notas e dar o “veredito”.*/
package exercicios.exe01Cap5.entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {

    private double p1;
    private double p2;
    private double p3;
    private double p4;

    public Aluno() {
        p1 = 0.0;
        p2 = 0.0;
        p3 = 0.0;
        p4 = 0.0;

    }

    public void setP1(double p1) {
        if (p1 < 0.0) {
            this.p1 = 0.0;
        } else if (p1 > 10.0) {
            this.p1 = 10.0;
        } else {
            this.p1 = p1;
        }
    }

    public void setP2(double p2) {
        if (p2 < 0.0) {
            this.p2 = 0.0;
        } else if (p2 > 10.0) {
            this.p2 = 10.0;
        } else {
            this.p2 = p2;
        }
    }

    public void setP3(double p3) {
        if (p3 < 0.0) {
            this.p3 = 0.0;
        } else if (p3 > 10.0) {
            this.p3 = 10.0;
        } else {
            this.p3 = p3;
        }
    }

    public void setP4(double p4) {

        if (p4 < 0.0) {
            this.p4 = 0.0;
        } else if (p4 > 10.0) {
            this.p4 = 10.0;
        } else {
            this.p4 = p4;
        }
    }

    public String calMedia(){
        double media = (p1 + p2 + p3 + p4)/4;
        if(media < 4){
            return "Média: "+media+" -> Reprovado";
        }
        else if(media <6 && media>=4){
            return "Média: "+media+" -> Recuperação";
        }
        else{
            return "Média: "+media+" -> Aprovado";
        }
        
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Aluno> alunos = new ArrayList();
        Aluno aluno;
        System.out.println("Quantos alunos gostaria de cadastrar?");
        int i = scanner.nextInt();
        
        for (int j = 0; j < i; j++) {
            System.out.println("Notas aluno "+(j+1)+":");
            aluno = new Aluno();
            aluno.setP1(scanner.nextDouble());
            aluno.setP2(scanner.nextDouble());
            aluno.setP3(scanner.nextDouble());
            aluno.setP4(scanner.nextDouble());

            alunos.add(aluno);
        }
        System.out.println("\n");
        alunos.forEach(a -> System.out.println(a.calMedia()));
        
    }

}

  
