package mx.com.conversorMoneda.modelo;
import mx.com.conversorMoneda.enums.*;
import java.math.*;

public class ConvertidorYenJapones extends Convertidor
{
	@Override
	public BigDecimal convertirAMoneda(Moneda moneda,BigDecimal pesoMX)
	{
		moneda=Moneda.YEN_JAPONES;
		return super.convertirAMoneda(moneda, pesoMX);
	}
	
	@Override
	public BigDecimal convertirAPesoMx(Moneda moneda,BigDecimal monedaSeleccionada)
	{
		moneda=Moneda.YEN_JAPONES;
		return super.convertirAPesoMx(moneda, monedaSeleccionada);
	}
}