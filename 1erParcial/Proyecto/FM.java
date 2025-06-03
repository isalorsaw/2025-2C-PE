import javax.swing.JOptionPane;
public class FM
{
    //METODO: Que muestra letra x letra en la cadena recibida por parametro
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
    //FUNCION: Retorna el tamanio de la cadena recibida por parametro
    public static int tamanio(String c)
    {
        return c.length();
    }
    //FUNCION: Que valida y pide una cadena
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
    //METOODO: Que muestra un mensaje enviado por parametro.
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}