/*
Crie uma classe Conversor5 que inclua também a escala Kelvin (K). Esta classe deve conter conversores
entre as três escalas de temperatura (Celsius, Fahrenheit e Kelvin), totalizando seis funções. A relação
entre as três escalas é dada por:

F − 32
------
   9
   =
   C
   -
   5
   =
K − 273
-------
   5


*/

package exercicios.exe01.entities;

public class Conversor5 {
    
    //Conversao de celsius
    public double celsiusToFahrenheit(double c){
        return (c/5)*9 + 32;
    }
 
    public double celsiusToKelvin(double c){
        return c + 273;
    }
    
    //Conversao de Fahrenheit
    public double fahrenheitToCelsius(double f){
        return (f - 32) / 9 * 5;
    }   
    
    public double fahrenheitToKelvin(double f){
        return (f - 32) / 9 * 5 + 273;
    }
    
    //Conversao de Kelvin
    public double kelvinToCelsius(double k){
        return k - 273;
    }
    
    public double kelvinToFahrenheit(double k){
        return (k - 273) / 5 * 9 + 32;
    }
    
    public static void main(String[] args) {
        Conversor5 c = new Conversor5();
        System.out.println("Convertendo Celsius -> 10 e 10");
        System.out.println(c.celsiusToFahrenheit(10.00)+" Fahrenheits");
        System.out.println(c.celsiusToKelvin(10.00)+" Kelvin");
        System.out.println("\nConvertendo Fahrenheit -> 50 e 273");
        System.out.println(c.fahrenheitToCelsius(50.00)+" Celsius");
        System.out.println(c.fahrenheitToKelvin(273) +" Kelvin");
        System.out.println("\nConvertendo Kelvin -> 283 e 407");
        System.out.println(c.kelvinToCelsius(283)+" Celsius");
        System.out.println(c.kelvinToFahrenheit(407)+" Fahrenheit");
        
    }
}
