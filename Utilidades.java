
package cr.ac.ucr.if3001.lab2.util;

import java.text.DecimalFormat;
import java.util.Random;


public class Utilidades {
    
    private static  String s = "$###,###.###";
    private static String s2 = "###,###.##";
    private static DecimalFormat formato = new DecimalFormat(s);
    private static DecimalFormat formato2 = new DecimalFormat(s2);
    private static Random random = new Random();
    
    public static String getFormatoMoneda(double valor){
        return formato.format(valor);
    }
    public static String getFormato(long valor){
        return formato2.format(valor);
    }
    
    public static int getAleatorio(int cota){
        //cota delimitante
        return random.nextInt(cota)+1;
    }
    
    public static String getFormatoDouble(double valor){
        return formato2.format(valor);
    }

}
