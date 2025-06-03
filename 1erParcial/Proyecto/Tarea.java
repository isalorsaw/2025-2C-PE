public class Tarea
{
    public static void main(String args[])
    {
        String c="";
        String menu="Opciones\n1.Ingrese una Cadena\n2.Contar Vocales\n"+
        "3.Mostrar Primera Letra\n4.Mostrar Ultima Letra\n5.Mostrar Cadena Invertida\n"+
        "6.Buscar Letra mostrar si existe (Llamar a PedirLetra)\n"+
        "7.Mostrar letra de enmedio (Si existiera)\n"+
        "8.Contar cuantas veces esta la letra (Primero: Pedir Letra)"+
        "15.Mostrar letras repetidas en la cadena";
        
        int opcion=FM.pedirNumero(menu);
        
        if(opcion==1)c=pedirCadena("Ingrese una Cadena");
        else if(opcion==2)
        {
            int c=FM.contarVocales(c);
        }
    }
}