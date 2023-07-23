package mx.com.conversorMoneda.modelo;
import javax.swing.*;//Para usar JOptionPane=Cuadros de dialogo

public class RepetirConversion
{
	public boolean repetir()
	{
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null,"¿Desea hacer otra conversion?","Confirmacion",JOptionPane.YES_NO_OPTION);
        
        if(respuesta !=0)
        {
        	JOptionPane.showMessageDialog(null, "Programa terminado","Saliendo",JOptionPane.OK_OPTION);
            return false;
        }
        
        return true;
    }
}