public class Gravitacija {
    
    public static void main(String[] args) { 
        
        
        System.out.println("OIS je zakon!....you massive cocksucker");
        
    }
    
    public static double pospesek(int visina) {
        
        //izračunamo vse spremenljivke vrednosti
        double r = visina + 6371000; //v kilometrih
        double konstanta = 6.674 * Math.pow(10, -11);
        double masa = 5.972 * Math.pow(10, 24);
        
        //izracunamo g
        double g = konstanta * (masa / (r * r));
        
        
        return g;
    }
    
}