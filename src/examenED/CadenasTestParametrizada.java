package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CadenasTestParametrizada {

	private String entrada;
	private String salidaEsperada;
	
	public CadenasTestParametrizada(String entrada,String salidaEsperada) {
		this.entrada=entrada;
		this.salidaEsperada=salidaEsperada;
	}
	
	
	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { 
			{ "A","" }, 
			{ "B","B"},
			{ "AA", "" },
			{ "AB", "B" },
			{ "BC", "BC" },
			{ "PATATA", "PTATA" },
			{ "AATATA", "TATA" },
			{ "BCDE", "BCDE" }
		});
	}
	
	
	@Test
	public void testQuitarAenPrimeras2Posiciones() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones(entrada);
		assertEquals(salidaEsperada,resultadoReal);
	}
	
	
	

}
