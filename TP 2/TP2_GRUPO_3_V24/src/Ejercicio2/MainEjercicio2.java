package Ejercicio2;

public class MainEjercicio2 {
	
	public static void main(String[] args)
	{
		
		ProductoCongelado productoCongelado = new ProductoCongelado("15042025",111111,-5);
		ProductoFresco productoFresco = new ProductoFresco("15042025",333333,"10042025","Argentina");
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("23052027",22222,"ProArg");

		//productoCongelado.setFechaCaducidad("15042025");
		//productoCongelado.setNumeroLote(111111);
		//productoCongelado.setTempCongelacionRecomendada(-5);
	
		System.out.println(productoCongelado.toString());
		System.out.println(productoFresco.toString());
		System.out.println(productoRefrigerado.toString());
			
	}
}
