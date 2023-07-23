package mx.com.conversorMoneda.modelo;
import mx.com.conversorMoneda.enums.*;
import java.math.*;

public class ConvertidorLibraEsterlina extends Convertidor
{
	@Override
	public BigDecimal convertirAMoneda(Moneda moneda,BigDecimal pesoMX)
	{
		moneda=Moneda.LIBRA_ESTERLINA;
		return super.convertirAMoneda(moneda, pesoMX);
	}
	
	@Override
	public BigDecimal convertirAPesoMx(Moneda moneda,BigDecimal monedaSeleccionada)
	{
		moneda=Moneda.LIBRA_ESTERLINA;
		return super.convertirAPesoMx(moneda, monedaSeleccionada);
	}
}