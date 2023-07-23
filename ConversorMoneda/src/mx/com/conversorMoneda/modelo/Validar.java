package mx.com.conversorMoneda.modelo;

public class Validar
{
	public boolean validarValor(String operacion)
	{
		boolean numero=operacion.matches("[+-]?\\d*(\\.\\d+)?");
		return numero;
	}
	
	public double convertirADecimal(String operacion)
	{
		double valDecimal=Double.parseDouble(operacion);
		return valDecimal;
	}
}