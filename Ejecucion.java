import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class Ejecucion
{
    private Calculadora calculadora;
    
    @BeforeTest
    public void init()
    {
        calculadora = new Calculadora ();
        
    }
    
    public void vacioDevuelveCero() throws Exception                
    {
        assertEquals(calculadora.calcular(""), 0);//se llama el calcular de la clase calculadora enviando un valor null y esperando que retorne 0
    }  								 		  // de igual manera con los casos a continuacion			
    
    public void unoDevuelveValor()throws Exception                 
    {
        assertEquals(calculadora.calcular("1"), 1);                   
    }
     
    public void dosDelimitadoComasSuma() throws Exception
    {
        assertEquals(calculadora.calcular("1,2"), 3);
        
    }
    
    public void dosDelimitadoLineasSuma()throws Exception
    {
        assertEquals(calculadora.calcular("3\n2"), 5);                  
    }
    
    public void tresDobleDeliminatoSuma()throws Exception
    {
        assertEquals(calculadora.calcular("1,2,3,5"),11);
    }
    
    @Test(expectedExceptions=Exception.class)
    public void negativosExcepcion() throws Exception
   	{
   		calculadora.calcular("-1");
   	}
    
    public void ignorarNumeros()throws Exception
    {
      assertEquals(calculadora.calcular("10,10,1000"),20);
    }    
    
    

}
