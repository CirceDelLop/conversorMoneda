package mx.com.conversorMoneda.modelo;
import mx.com.conversorMoneda.enums.*;
import java.math.BigDecimal;

public class IniciarConvertirMoneda
{
	private static final String A_DOLAR="Peso mexicano a dolar estado unidense";
	private static final String A_EURO="Peso mexicano a euro";
	private static final String A_LIBRA_ESTERLINA="Peso mexicano a libra esterlina";
	private static final String A_WON_SURCOREANO="Peso mexicano a won sur coreano";
	private static final String A_YEN_JAPONES="Peso mexicano a yen japones";
	private static final String DE_DOLAR="Dolar estado unidense a peso mexicano";
	private static final String DE_EURO="Euro a peso mexicano";
	private static final String DE_LIBRA_ESTERLINA="Libra esterlina a peso mexicano";
	private static final String DE_WON_SURCOREANO="Won sur coreano a peso mexicano";
	private static final String DE_YEN_JAPONES="Yen japones a peso mexicano";
	private Convertidor aDolar=new ConvertidorDolar();
	private Convertidor aEuro=new ConvertidorEuro();
	private Convertidor aLibraEsterlina=new ConvertidorLibraEsterlina();
	private Convertidor aWonSurCoreano=new ConvertidorWonSurCoreano();
	private Convertidor aYenJapones=new ConvertidorYenJapones();
	private Moneda moneda;
	
	public BigDecimal elegirConversion(String tipoCambio,double valInicio) throws Exception
	{
		switch(tipoCambio)
		{
			//Convertir de peso mexicano a la moneda elegida por el usuario
			case A_DOLAR->
			{
				return aDolar.convertirAMoneda(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case A_EURO->
			{
				return aEuro.convertirAMoneda(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case A_LIBRA_ESTERLINA->
			{
				return aLibraEsterlina.convertirAMoneda(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case A_WON_SURCOREANO->//Corregir
			{
				return aWonSurCoreano.convertirAMoneda(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case A_YEN_JAPONES->
			{
				return aYenJapones.convertirAMoneda(moneda,BigDecimal.valueOf(valInicio));
			}
			
			//Convertir de la moneda elegida por el usuario a peso mexicano
			case DE_DOLAR->//corregir
			{
				return aDolar.convertirAPesoMx(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case DE_EURO->
			{
				return aEuro.convertirAPesoMx(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case DE_LIBRA_ESTERLINA->
			{
				return aLibraEsterlina.convertirAPesoMx(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case DE_WON_SURCOREANO->
			{
				return aWonSurCoreano.convertirAPesoMx(moneda,BigDecimal.valueOf(valInicio));
			}
			
			case DE_YEN_JAPONES->
			{
				return aYenJapones.convertirAPesoMx(moneda,BigDecimal.valueOf(valInicio));
			}
			
			default->throw new Exception("Opcion no valida");
		}
	}
}