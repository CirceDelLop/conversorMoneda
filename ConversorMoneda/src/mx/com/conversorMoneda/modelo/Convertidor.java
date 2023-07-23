package mx.com.conversorMoneda.modelo;
import mx.com.conversorMoneda.enums.*;
import mx.com.conversorMoneda.interfaz.ConversorMoneda;
import java.math.*;

public class Convertidor implements ConversorMoneda
{
	public BigDecimal convertirAMoneda(Moneda moneda,BigDecimal pesoMx)
	{
		return pesoMx.divide(moneda.getValorPesosMx(),2,RoundingMode.HALF_UP);
	}
	
	public BigDecimal convertirAPesoMx(Moneda moneda,BigDecimal monedaSeleccionada)
	{
		return monedaSeleccionada.multiply(moneda.getValorPesosMx());
	}
}