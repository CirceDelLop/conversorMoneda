package mx.com.conversorMoneda.enums;
import java.math.BigDecimal;

public enum Moneda
{
	//Valor en pesos mexicanos (21/07/23 6:35pm)
	DOLAR(BigDecimal.valueOf(16.75)),
	EURO(BigDecimal.valueOf(18.92)),
	LIBRA_ESTERLINA(BigDecimal.valueOf(21.85)),
	WON_SURCOREANO(BigDecimal.valueOf(0.0130)),
	YEN_JAPONES(BigDecimal.valueOf(0.120));
	
	private BigDecimal valorPesosMx;
	
	Moneda(BigDecimal valorEnPesosMx)
	{
		this.valorPesosMx=valorEnPesosMx;
	}
	
	public BigDecimal getValorPesosMx()
	{
		return valorPesosMx;
	}
}