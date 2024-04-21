package Ejercicio2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ProductoFresco extends Producto
{
	
	private Date FechaEmbasado;
	private String Pais;
	
	public ProductoFresco() 
	{
		super();
		this.FechaEmbasado = new Date();
		this.Pais = "";
	}
	
	public ProductoFresco(String FechaCaducidad, int lote, String fechaEmbasado2, String pais) 
	{
		super(FechaCaducidad, lote );
		
		try 
		{
			this.FechaEmbasado = new SimpleDateFormat("ddMMyyyy").parse(fechaEmbasado2);
        } 
		catch (ParseException e)
		{
            e.printStackTrace(); 
        }
		
		Pais = pais;
	}
	
	public Date getFechaEmbasado()
	{
		return FechaEmbasado;
	}
	
	public void setFechaEmbasado(Date fechaEmbasado) 
	{
		FechaEmbasado = fechaEmbasado;
	}
	
	public String getPais()
	{
		return Pais;
	}
	
	public void setPais(String pais) 
	{
		Pais = pais;
	}

	@Override
	public String toString() 
	{
		return  super.toString() + "\nFechaEmbasado: " + FechaEmbasado + "Pais: " + Pais;
	}
	
	
}
