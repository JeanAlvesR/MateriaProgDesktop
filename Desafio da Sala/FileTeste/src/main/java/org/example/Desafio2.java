package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Desafio2 {

    public static void recuperaDados(String path, HashMap<String, Long> conteudo){
        File f = new File(path);

        //Inicializei o eu HashMap
        if(conteudo.isEmpty()){
            conteudo.put("total", f.length()); //tamanho da pasta raiz
            conteudo.put("QtdPastas",1l); //a pasta raiz
            conteudo.put("QtdArq", 0l);
        }

        Arrays.asList(f.listFiles()).forEach( x ->{
            conteudo.put("total", conteudo.get("total") + x.length());
            if(x.isDirectory()){
                conteudo.put("QtdPastas", conteudo.get("QtdPastas")+1);
                recuperaDados(path.concat("\\").concat(x.getName()), conteudo);
            }else {
                conteudo.put("QtdArq", conteudo.get("QtdArq")+1);
            }
        });

    }


    public static void main(String[] args) {
        String path = "C:\\Users\\jeana\\OneDrive\\Documentos\\NetBeansProjects\\Teste";

        HashMap<String, Long> c = new HashMap<>();

        Desafio2.recuperaDados(path, c);

        System.out.println("total: " + c.get("total")+"\nQtd Pastas: "+c.get("QtdPastas")+"\nQtdArq: "+c.get("QtdArq"));
    }


}
