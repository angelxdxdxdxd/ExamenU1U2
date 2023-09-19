/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Videojuego 1");
        String vid1 = lectura.nextLine();
        System.out.println("Precio");
        double p1 = lectura.nextDouble();
        lectura.nextLine();
        
        System.out.println("Videojuego 2");
        String vid2 = lectura.nextLine();
        System.out.println("Precio");
        double p2 = lectura.nextDouble ();
        lectura.nextLine();
        
        System.out.println("Videojuego 3");
        String vid3 = lectura.nextLine();
        System.out.println("Precio");
        double p3 = lectura.nextDouble();
        lectura.nextLine();
        
        double d1 = p1*30/100;
        double pr1 = p1-d1;
        
        double d2 = p2*65/100;
        double pr2 = p2-d2;
        
        double d3 = p3*15/100;
        double pr3 = p3-d3;
        
        System.out.println("El precio final del " + vid1 + " es: " + pr1);
        System.out.println("El precio final del " + vid2 + " es: " + pr2);
        System.out.println("El precio final del " + vid3 + " es: " + pr3);
    }
    
}
