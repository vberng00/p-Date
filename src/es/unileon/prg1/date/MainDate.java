package es.unileon.prg1.date;

import java.util.Scanner;

public class MainDate {
	
	private static Scanner teclado;
	

	public static void main(String[] args) throws Exception {
		teclado=new Scanner (System.in);
		try{
			Date dia;
			int day; 
			int month;
			int year = 2017;

			System.out.println("Introduzca el dia");
			day = teclado.nextInt();
			System.out.println("Introduzca el mes");
			month = teclado.nextInt();
			System.out.println("Introduzca el año");
			year = teclado.nextInt();
			dia = new Date(day,month,year);
				
				System.out.println(dia.toString());
				System.out.println(dia+ " pertenece al mes " +dia.getMoonth());
				System.out.println(dia+ " esta en la estación: "+dia.getSeason());
				System.out.println("Desde " +dia+ " quedan estos meses para acabar el año:\n" +dia.getMonthsLeft()); 
				System.out.println("Para acabar el mes quedan estas fechas:\n" +dia.getDaysLeft());
				System.out.println("Meses con los mismos dias que "+dia+" son:\n"+dia.getMonthsSameDate());
				System.out.println("Si el año comienza en Lunes, el "+dia+" es " +dia.getDayWeek());
				System.out.println(dia+" es el dia numero "+dia.getFirstDayYear());
				System.out.println("Numero de intentos para acertar la fecha "+dia+" :\n"+dia.numRandomTimesEqualDate1());
			}
		catch(DateException e){

			System.out.println(e.getMessage());
		}
	}
}
