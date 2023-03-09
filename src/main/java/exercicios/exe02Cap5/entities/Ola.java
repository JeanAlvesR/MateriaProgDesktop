/*
Escreva uma classe Olá com um único método cumprimenta que, a cada chamada, cumprimenta o
usuário de uma entre 3 maneiras diferentes. Dica: use um atributo para, dependendo de seu valor,
escolher qual das maneiras será usada; depois de imprimir a mensagem, altere o valor do atributo.

*/
package exercicios.exe02Cap5.entities;
import java.util.Random;

public class Ola {

    public String cumprimenta(){
        Random random = new Random();
        int i = random.nextInt(3);

        if(i == 0){
            return "Fala!";
        }
        else if(i == 1){
            return "Opa!";

        }
        else {
            return "Aobaaa!";
        }
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println((new Ola()).cumprimenta());
        }
    }
}
