package mx.com.conversorMoneda.interfaz;
import mx.com.conversorMoneda.enums.*;
import java.math.*;

public interface ConversorMoneda
{
	BigDecimal convertirAMoneda(Moneda moneda,BigDecimal pesoMx);
	BigDecimal convertirAPesoMx(Moneda moneda,BigDecimal monedaSeleccionada);
}