public class Prueba1P
{
    public static void main(String args[])
    {
        String c=FM.pedirCadena("Ingrese una Cadena");
        int tam=FM.tamanio(c);
        FM.mostrarLetraXLetra(c);
        FM.mostrarMensaje(c+" tiene "+tam+" caracteres");
    }
}