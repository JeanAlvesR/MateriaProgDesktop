package org.example;

import java.io.File;

public class Desafio {

    public int recuperaDados(String path){
        File f = new File(path);
        int qtdpasta = 1;
        for (File x: f.listFiles()) {
            if (x.isDirectory()){
                qtdpasta += recuperaDados(path.concat("\\").concat(x.getName()));
            }
        }
        return qtdpasta;

    }

    public long tamanhoTotal(String path){
        File f = new File(path);
        long total = f.length();
        for (File x: f.listFiles()) {
            total += x.length();
            if (x.isDirectory()){
                total+=tamanhoTotal(path.concat("\\").concat(x.getName()));
            }
        }
        return total;
    }

    public int qtdArq(String path){
        File f = new File(path);
        int qtd = 0;
        for (File x: f.listFiles()) {
           if (x.isFile()){
               qtd+=1;
           }
           else{
               qtd+= qtdArq(path.concat("\\").concat(x.getName()));
           }
        }
        return qtd;
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\jeana\\OneDrive\\Documentos\\NetBeansProjects\\Teste";

        System.out.println(new Desafio().recuperaDados(path));
        System.out.println(new Desafio().tamanhoTotal(path));
        System.out.println(new Desafio().qtdArq(path));



    }
}
