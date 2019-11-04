package es.unileon.prg1.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date (int day, int month, int year)throws DateException{
		if (isDayOfMonthRight(day,month)){
			this.day=day;
			this.month=month;
			this.year=year;
		}
		else{
			throw new DateException("Fecha no valida ("+day+ ","+month+","+year+")");
				
		}
	}
	
	public void setDay(int day)throws DateException{
		if(this.isDayOfMonthRight(day,this.month)==true){
			this.day=day;
		}
		else{
			throw new DateException("Dia " + day + " no valido" + " Valores posibles entre 1 y 31.");
		}
	}
	public void setMonth(int month)throws DateException{
		if(isDayOfMonthRight(this.day,month)==true){
			this.month=month;
		}
		else{
			throw new DateException("Mes " + month + " no valido" + " Valores posibles entre 1 y 12.");
		}	
		}
	boolean isSameIf(Date another){
			if ( (this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear()) ){
				return true;
			}
			return false;
		}

	boolean isSameDate(Date another){
		boolean True;
			True= ((this.year==another.getYear())&&(this.month==another.getMonth()) &&(this.day==another.getDay()));
			return True;	
	}
	
	public int getDay(){
		return this.day;
	}

	boolean isSameDayIf(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}

	boolean isSameDay(Date another){
		boolean True;
			True= (this.day==another.getDay());
			return True;	
	}

	public int getMonth(){
		return this.month;
	}

	boolean isSameMonthIf(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date another){
		boolean True;
			True= (this.month==another.getMonth());
			return True;	
	}


	public int getYear(){
		return this.year;
	}

	boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	boolean isSameYear(Date another){
		boolean True;
			True= (this.year==another.getYear());
			return True;	
	}
	
	private boolean isDayOfMonthRight(int day,int month){
		boolean resultado=false;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:{
				if (day>=1&&day<=31){
					resultado = true;
				}
				break;
			}
			case 2:{
				if (day>=1&&day<=28){
					resultado=true;
				}
				break;
			}
			default:{
				if (day>=1&&day<=30){
					resultado=true;
				}
			}
		}
		return resultado;
	}

	
		public String toString() {
			return this.day + "/" + this.month + "/" + this.year;
		}
		public String getMoonth(){
			StringBuffer month= new StringBuffer();

			switch (this.month){
				case 1: month.append("Enero");
					break;
				case 2: month.append("Febrero");
					break;
				case 3: month.append("Marzo");
					break;
				case 4: month.append("Abril");
					break;
				case 5: month.append("Mayo");
					break;
				case 6: month.append("Junio");
					break;
				case 7: month.append("Julio");
					break;
				case 8: month.append("Agosto");
					break;
				case 9: month.append("Septiembre");
					break;
				case 10: month.append("Octubre");
					break;
				case 11: month.append("Noviembre");
					break;
				case 12: month.append("Diciembre");
					break;
			}
			return month.toString();
		 }

		public String getSeason(){
		StringBuffer season= new StringBuffer();
			switch (this.month){
				case 1:
				case 2: season.append("Invierno");
					break;
				case 4:
				case 5:	season.append("Primavera");
					break;
				case 7:
				case 8: season.append("Verano");
					break;
				case 10:
				case 11: season.append("Otoño");
					break;
				
				case 3: if(day >20){
						season.append("Primavera");
					}
					else{ season.append("Invierno");
					}
					break;
				case 6: if(day>20){
						season.append("Verano");
					}
					else{ season.append("Primavera");
					}
					break;
				case 9: if(day>22){ 
						season.append("Otono");
					}
					else{ season.append("Verano");
					}
					break;
				case 12: if(day>20){
						season.append("Invierno");
					}
					else{ season.append("Otono");
					}
					break;
			}
			return season.toString();
		}

	 public String getMonthsLeft(){
			StringBuffer months= new StringBuffer();
			int i, sumames=0;
				for(i=this.month;i<=12;i++){
					months.append(getMonth()+ "\n");
					this.month= this.month +1;
					sumames=sumames+ 1;
				}
				this.month=this.month-sumames;
				return months.toString();
				
	}
	public String randomDate(){
			StringBuffer dateR= new StringBuffer();
					
			dateR.append((int)Math.floor(Math.random()*(31)+1)+"/");
			dateR.append((int)Math.floor(Math.random()*(12)+1)+"/");
			dateR.append((int)Math.floor(Math.random()*(2118)+1));
			return dateR.toString();		
			}

	public String getDaysLeft(){
			int sumadias=0;
			StringBuffer daysLeft= new StringBuffer();
			
				do{
					
					daysLeft.append(this.day + "/" + this.month + "/" + this.year+"\n");
					this.day= this.day + 1;	
					sumadias=sumadias+1;
				}while(isDayOfMonthRight(day,this.month)==true);
			this.day=this.day-sumadias;
			return daysLeft.toString();
		}

	public	String getMonthsSameDate(){
				StringBuffer sameNumbersDays= new StringBuffer();

			switch (this.month){

				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				sameNumbersDays.append("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre.");
				break;

				case 2:
				sameNumbersDays.append("Febrero.");
				break;

				case 4:
				case 6:
				case 9:
				case 11:
				sameNumbersDays.append("Abril, Junio, Septiembre, Noviembre.");
				break;
			}

			return sameNumbersDays.toString();
		}

public String getFirstDayYear(){
			int m31= 31;
			int m30= 30;
			StringBuffer firstDayYear = new StringBuffer();
			switch (this.month){
				case 1: firstDayYear.append(m31*0 + m30*0 + this.day);
					break;
				case 2: firstDayYear.append(m31*1 + m30*0 + this.day);
					break;
				case 3: firstDayYear.append(m31*1 + m30*0 + 28 + this.day);
					break;
				case 4: firstDayYear.append(m31*2 + m30*0 + 28 + this.day);
					break;
				case 5: firstDayYear.append(m31*2 + m30*1 + 28 + this.day);
					break;
				case 6: firstDayYear.append(m31*3 + m30*1 + 28 + this.day);
					break;
				case 7: firstDayYear.append(m31*3 + m30*2 + 28 + this.day);
					break;
				case 8: firstDayYear.append(m31*4 + m30*2 + 28 + this.day);
					break;
				case 9: firstDayYear.append(m31*5 + m30*2 + 28 + this.day);
					break;
				case 10: firstDayYear.append(m31*5 + m30*3 + 28 + this.day);
					break;
				case 11: firstDayYear.append(m31*6 + m30*3 + 28 + this.day);
					break;
				case 12: firstDayYear.append(m31*6 + m30*4 + 28 + this.day);
					break;
			}
			return firstDayYear.toString();
		}

		public String numRandomTimesEqualDate1(){
			int times=0;
			int ndia= 0, nmes=0;
			StringBuffer numTimes= new StringBuffer();
			do{
				 ndia = (int)(Math.floor(Math.random()*(31)+1));
				 nmes = (int)(Math.floor(Math.random()*(12)+1));
				
				times= times+1;
				
				}while (this.day != ndia && this.month!= nmes);
				numTimes.append(times);
			return numTimes.toString();
		}
		public String numRandomTimesEqualDate2(){
			int time=0;
			int ndia=0,nmes=0;
			StringBuffer numTime= new StringBuffer();
				while(this.day !=ndia && this.month != nmes){
					ndia = (int)(Math.floor(Math.random()*(31)+1));
				 	nmes = (int)(Math.floor(Math.random()*(12)+1));
				
					time= time+1;	
				}
					numTime.append(time);
				return numTime.toString();
		}

		public String getDayWeek(){
					StringBuffer dayWeek = new StringBuffer();
						int dia=Integer.parseInt(getFirstDayYear());
						if(dia%7 == 0){
							dayWeek.append("Lunes");
						}
						else if(dia%7== 1){
							dayWeek.append("Martes");
						}
						else if(dia%7==2){
							dayWeek.append("Miercoles");
						}
						else if(dia%7==3){
							dayWeek.append("Jueves");
						}
						else if(dia%7==4){
							dayWeek.append("Viernes");
						}
				 		else if(dia%7==5){
							dayWeek.append("Sabado");
						}
						else if(dia%7==6){
							dayWeek.append("Domingo");
						}
						return dayWeek.toString();
				}	
}
