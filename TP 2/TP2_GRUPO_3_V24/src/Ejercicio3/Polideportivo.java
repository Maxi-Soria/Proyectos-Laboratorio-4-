package Ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva{

	public String Nombre;
	public double Superficie;
	public int TipoInstalacion;

	public Polideportivo()
	{
		this.Nombre = "";
		this.Superficie = 0;
		this.TipoInstalacion = 0;
	}
	
	public Polideportivo(String nombre, double superficie, int tipoInstalacion)
	{
		Nombre = nombre;
		Superficie = superficie;
		TipoInstalacion = tipoInstalacion;
	}
	
	public String getNombre()
	{
		return Nombre;
	}

	public void setNombre(String nombre)
	{
		Nombre = nombre;
	}

	@Override
	public double getSuperficieEdificio() 
	{
		return Superficie;
	}

	@Override
	public int getTipoDeInstalacion()
	{
		return TipoInstalacion;
	}

	@Override
	public String toString()
	{
		return "\n_________  POLIDEPORTIVO"+
				"\nNombre: " + Nombre + " \nSuperficie: " + Superficie + " \nTipoInstalacion: " + TipoInstalacion;			
	}
	
		
}
