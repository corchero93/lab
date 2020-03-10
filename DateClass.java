package Ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar; //Tenemos que importarlo para poder obtner el calendario
import java.util.Date; // Lo importamos para poder sacar la fecha
import java.util.GregorianCalendar;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha=new Date();
		System.out.println(fecha.getDate()); // Te saca el dia en el que estamos.
		System.out.println(fecha.getYear()	+1900); // Esta suma es para que salga el año exacto
		
		Calendar calendario = Calendar.getInstance();
		int anio =calendario.get(Calendar.YEAR); //Esto sirve para sacar el año sin necesidad de hacerla suma 1900 
		System.out.println(anio);
		SimpleDateFormat fec= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss E");// Sirve para sacar la fecha exacta
		System.out.println(fec.format(fecha));
	}
}
