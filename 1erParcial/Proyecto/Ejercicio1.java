/*
Este programa pedira 2 numeros enteros y mostrar la suma de ellos.
*/
//Importar librerias
import javax.swing.JOptionPane;
public class Ejercicio1
{
    public static void main(String args[])
    {
        //Variables 
        int numero1,numero2,suma;//Declaracion de variables
        numero1=0;
        numero2=0;
        suma=0; //Inicializando las variables.
        //int numero1=0,numero2=0,suma=0; (Declaracion e inicializacion de variables)
        
        //Entradas
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Entero");
        numero1=Integer.parseInt(entrada);
        
        String entrada2=JOptionPane.showInputDialog("Ingrese el 2do Entero");
        numero2=Integer.parseInt(entrada2);
        
        //Proceso
        suma=numero1+numero2;
        
        //Salida
        //String salida="La Suma de los dos numeros es: "+suma;
        String salida=numero1+"+"+numero2+"="+suma;
        JOptionPane.showMessageDialog(null,salida);
    }
}