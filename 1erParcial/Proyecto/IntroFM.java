import javax.swing.JOptionPane;
public class IntroFM
{
    public static void main(String args[])
    {
        int n1=pedirEntero("Ingrese el Primer Numero");
        int n2=pedirEntero("Ingrese el Segundo Numero");
        int suma=n1+n2;
        mostrarMensaje("La Suma de "+n1+" y "+n2+" es "+suma);
    }
    //Metodo
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    //Funcion
    public static int pedirEntero(String msg)
    {
        int numero=0;
        boolean seguir=true;
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(msg);
                numero=Integer.parseInt(entrada);
                seguir=false;
            }catch(Exception exp)
            {
                mostrarMensaje("Error");
            }
        }while(seguir);
        return numero;
    }
}