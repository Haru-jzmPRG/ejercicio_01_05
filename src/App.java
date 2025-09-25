public class App {
    // Códigos ANSI para colores de texto
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String BLANCO = "\u001B[37m";
    
    // Códigos ANSI para colores de fondo
    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String FONDO_VERDE = "\u001B[42m";
    public static final String FONDO_AMARILLO = "\u001B[43m";
    public static final String FONDO_AZUL = "\u001B[44m";
    public static final String FONDO_PURPURA = "\u001B[45m";
    public static final String FONDO_CYAN = "\u001B[46m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static void main(String[] args) throws Exception {
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","Lunes","Martes","Miércoles","Jueves","Viernes\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","═══════════","════════════","═══════════════","════════════","═══════\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","SI","PROG","SI","IPE","BD\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","SI","PROG","SI","IPE","BD\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","LM","PROG","IPE","PROG","SI\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","LM","BD","DIG","PROG","ED\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","BD","BD","PROG","PROG","ED\n");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s","BD","SOS","PROG","LM","ED\n");
        
    }
}
