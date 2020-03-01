import java.util.*;
public class Gravitacija {
    
    
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();
        izpis(p, pospesek(p));

        
    
    
    }
    

    public static double pospesek(double visina) {
        
        //izračunamo vse spremenljivke vrednosti
        double r = visina + 6371000; //v kilometrih
        double konstanta = 6.674 * Math.pow(10, -11);
        double masa = 5.972 * Math.pow(10, 24);
        
        //izracunamo g
        double g = konstanta * (masa / (r * r));
        
        
        return g;
    }
    

    public static void izpis(double nadvisina, double pospesek){
        System.out.println(nadvisina + " " + pospesek);
    }

}