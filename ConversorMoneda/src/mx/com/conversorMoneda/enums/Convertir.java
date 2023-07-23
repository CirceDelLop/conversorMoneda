package mx.com.conversorMoneda.enums;

public enum Convertir
{
	//Descripciones
	A_DOLAR("Peso mexicano a dolar estado unidense"),
	A_EURO("Peso mexicano a euro"),
	A_LIBRA_ESTERLINA("Peso mexicano a libra esterlina"),
	A_WON_SURCOREANO("Peso mexicano a won sur coreano"),
	A_YEN_JAPONES("Peso mexicano a yen japones"),
	DE_DOLAR("Dolar estado unidense a peso mexicano"),
	DE_EURO("Euro a peso mexicano"),
	DE_LIBRA_ESTERLINA("Libra esterlina a peso mexicano"),
	DE_WON_SURCOREANO("Won sur coreano a peso mexicano"),
	DE_YEN_JAPONES("Yen japones a peso mexicano");
	
	
	private String descripcion;
	
	Convertir(String descripcion)
	{
		this.descripcion=descripcion;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
}