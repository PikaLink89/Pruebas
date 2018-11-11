import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import javax.xml.crypto.Data;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@RunWith(Parameterized.class)

public class CalculadoraTest {
	
	private int a;
	private int b;
	private int esperado;
	private int suma;
	private int resta;
	private int multiplicacion;
	
	public CalculadoraTest(int a, int b, int esperado) {
		Calculadora c = new Calculadora(a, b);
		this.suma = c.suma();
		this.resta = c.resta();
		this.multiplicacion = c.multiplica();
		this.esperado = esperado;
		
	}
	
	@Parameters
	public static Collection<Object[]> data() { 
		
		Object[][] data = new Object[][]{
			{2,2,4},
			{3,3,6},
			{4,2,6}
			};
		   
		return Arrays.asList(data);
		
	}  

@Test
	public void testSuma() {
		
		
		assertEquals(esperado, suma);
		
	}
	

@Test
public void testResta() {
	
	
	assertEquals(esperado, resta);
	
}	

@Test
public void testMultiplicacion() {
	
	
	assertEquals(esperado, multiplicacion);
	
}	



	
	/*
	
	
	
//	@Parameterized.Parameters
	
	
	@After
	public void testresta() {
		System.out.println("Primero");
		Calculadora prueba = new Calculadora(3, 2);
		//resultado esperado
		int res = 1;
		assertEquals(res, prueba.resta(), 0.01);
		
	}
	@Before
	public void testresta2() {
		System.out.println("Segundo");
		Calculadora prueba2 = new Calculadora (4,2);
		
		assertTrue(prueba2.resta2());
	}
	
	@Test
	
	 public void testDivide2() {
		System.out.println("Tercero");
		Calculadora prueba3 = new Calculadora (2,2);
		assertNotNull(prueba3.divide2());
		
	}
	
	
*/
	
}
