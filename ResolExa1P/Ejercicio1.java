//Importacion de Librerias
import javax.swing.JOptionPane;
public class Ejercicio1
{//Inicio 
    public static void main(String args[])
    {//Inicio del Main
        
        //Declaracion
        int n1,n2,suma;
        
        //Asignacion
        n1=0;
        n2=0;
        suma=0;
        
        //Ingresando el Primer Numero
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        n1=Integer.parseInt(entrada);
        
        //Ingresando el Segundo Numero
        String entrada2=JOptionPane.showInputDialog("Ingrese el Segundo Numero");
        n2=Integer.parseInt(entrada2);
        
        //Proceso de Suma
        suma=n1+n2;
        
        //Mensaje de Salida
        String salida="La Suma de los dos numeros es:"+suma;
        JOptionPane.showMessageDialog(null,salida);
    }//Fin del Main
}//Fin