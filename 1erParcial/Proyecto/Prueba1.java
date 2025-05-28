import javax.swing.JOptionPane;
public class Prueba1
{
    public static void main(String args[])
    {
        String cadena=pedirCadena("Ingrese una Cadena");
        char pl=primLetra(cadena);
        char ul=ultLetra(cadena);
        String inv=invertir(cadena);
        int cv=contarVocales(cadena);
        String salida="La cadena es: "+cadena+
        "\nPrimera Letra es: "+pl+
        "\nUltima Letra es: "+ul+
        "\nLa cadena invertida es: "+inv+
        "\nHay "+cv+" vocales";
        mostrarMensaje(salida);
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