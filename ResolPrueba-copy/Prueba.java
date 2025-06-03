import javax.swing.JOptionPane;
public class Prueba
{
    public static void main(String args[])
    {
        String c=pedirCadena("Ingrese una Cadena");
        int tam=tamanio(c);
        mostrarLetraXLetra(c);
        mostrarMensaje(c+" tiene "+tam+" caracteres");
    }
    public static void mostrarLetraXLetra(String c)
    {
        int i=0;
        while(i<c.length())
        {
            char l=c.charAt(i);
            //if(l=='A'||l=='E')
            mostrarMensaje(l+"");
            i++;
        }
    }
    public static int tamanio(String c)
    {
        return c.length();
    }
    public static String pedirCadena(String msg)
    {
        String cadena="";
        boolean seguir=true;
        do
        {
            try
            {
                cadena=JOptionPane.showInputDialog(msg);
                if(cadena.length()>0)seguir=false;
            }catch(Exception exp)
            {
                mostrarMensaje("Error");
            }
        }while(seguir);
        return cadena;
    }
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}