
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        String respuesta ="si";
         
        Conversor c =new Conversor();
       // Scanner entrada = new Scanner(System.in);          

        
        //System.out.println("Ingrese el valor a convertir: ");
        //valor = entrada.nextDouble();        
        //System.out.println(c.getValor()); 

        
        //System.out.println("Ingrese primer caracter de moneda objetivo: ");
        //monedaresult = entrada.next().charAt(0);
        //System.out.println(c.getResultado());
        while(respuesta.toUpperCase().equalsIgnoreCase("SI")){
            c.solicitarDatos();
            c.setResultado(c.getResultado() );        
            c.convertir(c.getMonedalocal(), c.getValor(), c.getResultado());
            respuesta = JOptionPane.showInputDialog("¿Desea continuar? (Si/ No)");
             

        }
    } 
   

    
}
