public class Examen1P
{
    public static void main(String args[])
    {
        String c=FM.pedirCadena("Ingrese una Cadena");
        char l=FM.pedirLetra("Ingrese una Letra para buscar en "+c);
        int cont=FM.contar(c,l);
        String salida=l+" esta "+cont+" veces en "+c;
        FM.mostrarMensaje(salida);
        boolean b=FM.siHayNumeros(c);
        salida=(b?" existen ":" no existen ");
        FM.mostrarMensaje("En "+c+" "+salida+" numeros");
    }
}