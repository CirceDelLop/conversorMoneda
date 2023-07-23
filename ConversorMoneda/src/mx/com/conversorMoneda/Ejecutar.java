package mx.com.conversorMoneda;
import mx.com.conversorMoneda.enums.*;
import mx.com.conversorMoneda.modelo.*;
import java.math.*;

import javax.swing.*;

public class Ejecutar
{
	public static void main(String[] args) throws Exception
	{
        String convertirMoneda = "Convertir moneda";
        boolean ejecuta = true;
        RepetirConversion repetidor = new RepetirConversion();

        while(ejecuta)
        {
            String operacion = JOptionPane.showInputDialog(null, "Elige la operación",
                    "Conversion", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {convertirMoneda/*, conversionDeTemperatura*/}, "Elección").toString();

            if (operacion.equals(convertirMoneda)) 
            {
            	IniciarConvertirMoneda iniciarConvertirMoneda = new IniciarConvertirMoneda();
                String operacionMoneda = JOptionPane.showInputDialog(null, "Elige una moneda","Monedas",
                		JOptionPane.QUESTION_MESSAGE, null, new String[]
                {
                		Convertir.A_DOLAR.getDescripcion(),
                        Convertir.A_EURO.getDescripcion(),
                        Convertir.A_LIBRA_ESTERLINA.getDescripcion(),
                        Convertir.A_WON_SURCOREANO.getDescripcion(),
                        Convertir.A_YEN_JAPONES.getDescripcion(),
                        Convertir.DE_DOLAR.getDescripcion(),
                        Convertir.DE_EURO.getDescripcion(),
                        Convertir.DE_LIBRA_ESTERLINA.getDescripcion(),
                        Convertir.DE_WON_SURCOREANO.getDescripcion(),
                        Convertir.DE_YEN_JAPONES.getDescripcion()
                  },"Elija").toString();
                
                String valorString=JOptionPane.showInputDialog("Introduzca la cantidad de moneda a convertir");
                Validar validador=new Validar();
                
                if(!validador.validarValor(valorString))
                {
                    JOptionPane.showMessageDialog(null, "Valor no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    double valorInicial=validador.convertirADecimal(valorString);
                    BigDecimal valorConvertido=iniciarConvertirMoneda.elegirConversion(operacionMoneda,valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido,"Moneda convertida",JOptionPane.CLOSED_OPTION);
                }
            }
            /*else 
             *{
             *if(operacion.equals(conversionDeTemperatura))
             *{
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacaoTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] 
                        {
                                TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(),
                         },
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString))
                {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } 
                else
                {
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversao(operacaoTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }*/
            ejecuta = repetidor.repetir();
        }
    }
}