/*Pedir 5 enteros y mostrar cuantos y cuales fueron pares e impares*/
import javax.swing.JOptionPane;
public class Ciclos
{
    public static void main(String args[])
    {
        //Variables
        int num=0,par=0,imp=0;
        String parr="",impp="";
        
        int desde=0;
        while(desde<5)
        {
            String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            num=Integer.parseInt(entrada);
            
            if(num%2==0)
            {
                 par=par+1; 
                 parr=parr+" "+num;
            }
            else 
            {
                 imp=imp+1; 
                 impp=impp+" "+num;
            }
            
            desde++;
        }
        
        String salida="Resumen\nSe ingreso "+par+" pares y "+imp+" impares \nLos pares fueron: "+
        parr+"\nLos Impares fueron: "+impp;
        JOptionPane.showMessageDialog(null,salida);
    }
}
