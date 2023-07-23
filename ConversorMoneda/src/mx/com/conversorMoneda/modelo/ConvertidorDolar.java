package mx.com.conversorMoneda.modelo;
import mx.com.conversorMoneda.enums.*;
import java.math.*;

public class ConvertidorDolar extends Convertidor
{
	@Override
	public BigDecimal convertirAMoneda(Moneda moneda,BigDecimal pesoMX)
	{
		moneda=Moneda.DOLAR;
		return super.convertirAMoneda(moneda, pesoMX);
	}
	
	@Override
	public BigDecimal convertirAPesoMx(Moneda moneda,BigDecimal monedaSeleccionada)
	{
		moneda=Moneda.DOLAR;
		return super.convertirAPesoMx(moneda, monedaSeleccionada);
	}
}