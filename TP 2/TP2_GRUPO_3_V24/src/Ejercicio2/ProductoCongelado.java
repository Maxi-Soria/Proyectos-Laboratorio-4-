package Ejercicio2;


public class ProductoCongelado extends Producto
{

	private float tempCongelacionRecomendada;

	public ProductoCongelado()
	{
		super();
		this.tempCongelacionRecomendada = 0;
	}
	
	public ProductoCongelado(String fechacaducidad, int numeroLote, float tempCong)
	{
		super(fechacaducidad, numeroLote);
		tempCongelacionRecomendada = tempCong;
	}
	
	public float getTempCongelacionRecomendada()
	{
		return tempCongelacionRecomendada;
	}

	public void setTempCongelacionRecomendada(float tempCongelacionRecomendada)
	{
		this.tempCongelacionRecomendada = tempCongelacionRecomendada;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "\ntempCongelacionRecomendada: " + tempCongelacionRecomendada;
	}
	
	
}
