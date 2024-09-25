package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        CorpoHumano c1 = new CorpoHumano(0, 0, 0, 0);
        
        // c1.massa = "2" -> Não vai funcionar e resultar num erro pois massa é de tipo float e não String  

        System.out.println("Insira o peso: ");
        c1.setMassa(scan.nextInt());

        System.out.println("Insira a altura");
        c1.setAltura(scan.nextDouble());
    
        System.out.println("IMC: " + c1.calcularIMC());
    }
}
