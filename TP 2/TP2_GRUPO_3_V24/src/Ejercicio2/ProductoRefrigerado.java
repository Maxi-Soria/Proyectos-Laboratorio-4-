package Ejercicio2;


public class ProductoRefrigerado extends Producto
{

	private String Codigo_Supervision;

	public ProductoRefrigerado()
	{
		super();
		this.Codigo_Supervision = "";
	}
	
	public ProductoRefrigerado(String fechacaducidad, int numeroLote, String codigo_Supervision) 
	{
		super(fechacaducidad,numeroLote);
		Codigo_Supervision = codigo_Supervision;
	}

	public String getCodigo_Supervision()
	{
		return Codigo_Supervision;
	}

	public void setCodigo_Supervision(String codigo_Supervision)
	{
		Codigo_Supervision = codigo_Supervision;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nCodigo_Supervision: " + Codigo_Supervision;
	}
	
	
}
