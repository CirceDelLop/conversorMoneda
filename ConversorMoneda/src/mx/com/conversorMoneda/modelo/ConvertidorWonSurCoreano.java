package mx.com.conversorMoneda.modelo;
import mx.com.conversorMoneda.enums.*;
import java.math.*;

public class ConvertidorWonSurCoreano extends Convertidor
{
	@Override
	public BigDecimal convertirAMoneda(Moneda moneda,BigDecimal pesoMX)
	{
		moneda=Moneda.WON_SURCOREANO;
		return super.convertirAMoneda(moneda, pesoMX);
	}
	
	@Override
	public BigDecimal convertirAPesoMx(Moneda moneda,BigDecimal monedaSeleccionada)
	{
		moneda=Moneda.WON_SURCOREANO;
		return super.convertirAPesoMx(moneda, monedaSeleccionada);
	}
}