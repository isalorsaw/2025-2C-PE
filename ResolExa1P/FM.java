import javax.swing.JOptionPane;
public class FM
{
    public static boolean siHayNumeros(String c)
    {
        for(int i=0;i<c.length();i++)
        {
            char le=c.charAt(i);
            if(le=='0'||le=='1'||le=='2'||le=='3'||le=='4'||le=='5'||le=='6'||le=='7'||le=='8'||le=='9')
            return true;
        }
        return false;
    }
    public static int contar(String c, char l)
    {
        int cont=0;
        for(int i=0;i<c.length();i++)
        {
            char le=c.charAt(i);
            if(le==l)cont++;
        }
        return cont;
    }
    public static char pedirLetra(String msg)
    {
        boolean seguir=true;
        String c="";
        do
        {
            c=pedirCadena(msg);
            if(c.length()==1)seguir=false;
        }while(seguir);
        return c.charAt(0);
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