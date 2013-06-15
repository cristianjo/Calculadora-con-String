
public class Calculadora 
{
    private final String delimitador =",|\n";
    public int calcular(String input) throws Exception
    {
        String[] numeros = input.split(delimitador);
        
        if (contenidoVacio (input))
        {
            return 0;  				// contenido vacio y devuelve 0
        }
        if (input.length() == 1)
        {
            return cadenaAEentero(input); // solo un valor y  devuelve el mismo
        }
        else
        {
             return obtenerSuma(numeros); // hay mas valores y los sumara por el metodo
        }
        
    }   
    private int obtenerSuma(String[] numeros) throws Exception//String numA, String numB)
    {
    	valorNoCorresponde(numeros);		// va al metodo y verifica si ningun valor es negativo para continuar
        return calculoDeValores(numeros);	//si no hay negativos envia a metodo calculoDeValores 
    }
    
    
    private int calculoDeValores (String [] numeros)
    {
    	int sum = 0;
    	 for (String corriente:numeros)
         {
             if(cadenaAEentero(corriente)> 1000) //pregunta si en la cadena hay algun numero mayor a 1000
             {
                 continue;						//
             }
             sum += cadenaAEentero(corriente);// sum += equivale a sum=sum +, en donde suma el String
         }
    	 return sum;
    }
    
    private void valorNoCorresponde(String[] numeros) throws Exception
    {
         for (String corriente:numeros)
        {
            if(cadenaAEentero(corriente)<0) // pregunta si un numero de la cadena es menor a 0
            {
                throw new Exception("ingreso un negativo"); // Indica el valor negativo
            }
        } 
    }        
    
    private boolean contenidoVacio(String input) // verificamos que no tenga calores la cadena
    {
        return input.isEmpty();
    }
    
    private int cadenaAEentero(String input)// pasa el String a enterio para utilizarlo en el if
    {
        return Integer.parseInt(input); 
    }
}
