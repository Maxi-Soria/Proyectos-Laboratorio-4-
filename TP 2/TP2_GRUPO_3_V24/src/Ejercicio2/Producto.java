package Ejercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public abstract class Producto
{
	
	private Date fechaCaducidad;
	private int numeroLote;
	
	public Producto() 
	{
		this.fechaCaducidad = new Date();
		this.numeroLote = 0;
	}
	
	public Producto(String fechaCaducidad, int numeroLote)
	{
        try
        {
            this.fechaCaducidad = new SimpleDateFormat("ddMMyyyy").parse(fechaCaducidad);
        } 
        catch (ParseException e)
        {
            e.printStackTrace(); 
        }
        this.numeroLote = numeroLote;
    }

	public Date getFechaCaducidad()
	{
		return fechaCaducidad;
	}
	
	public void setFechaCaducidad(String fechaCaducidad)
	{
		 try
		 {
	         this.fechaCaducidad = new SimpleDateFormat("ddMMyyyy").parse(fechaCaducidad);
	     }
		 catch (ParseException e)
		 {
	         e.printStackTrace();	        
	     }
	}
	
	public int getNumeroLote()
	{
		return numeroLote;
	}
	
	public void setNumeroLote(int numeroLote)
	{
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString()
	{
		return   "\n_________________________________________________" + " \nFecha de caducidad: " + fechaCaducidad + "\nNumero de Lote: " + numeroLote;
	}
	
}
