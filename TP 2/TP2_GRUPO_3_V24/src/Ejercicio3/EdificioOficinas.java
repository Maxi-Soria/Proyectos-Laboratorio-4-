package Ejercicio3;

public class EdificioOficinas extends Edificio
{

	private int CantidadOficinas;
	public double Superficie;
	
	public EdificioOficinas()
	{
		CantidadOficinas = 0;
		Superficie = 0;
	}
	
	public EdificioOficinas(int cantidadOficinas, double superficie) {

		CantidadOficinas = cantidadOficinas;
		Superficie = superficie;
	}
	
	public int getCantidadOficinas()
	{
		return CantidadOficinas;
	}

	public void setCantidadOficinas(int cantidadOficinas) 
	{
		this.CantidadOficinas = cantidadOficinas;
	}

	public double getSuperficie() 
	{
		return Superficie;
	}

	public void setSuperficie(double superficie)
	{
		Superficie = superficie;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return Superficie;
	}

	@Override
	public String toString() {
		return "\n_________  EDIFIO OFICINAS"+
				"\ncantidadOficinas: " + CantidadOficinas + " \nSuperficie: " + Superficie;
	}
	
}
