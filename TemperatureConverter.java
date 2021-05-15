import java.util.*;
class TemperatureConverter{


    public static void main (String[] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Choose type of conveion \n 1.Fahrenheit to Cerelsius \n 2.Celsius to Fahrenheit");
	 int num = sc.nextInt();
	   if(num==1){
	     System.out.println("Enter Fahrenheit temperature");	
	    }

	
	    else if(num==2){
	    	System.out.println("Enter Celsiuse temperature");
	    }
	    else{
	    	System.out.println("it's wrong input");
	    }	

	    float temperature =sc.nextFloat();
	    

	    TemperatureConverter tc = new TemperatureConverter();
	    System.out.println(tc.getConverter(temperature,num));

    }





		float getConverter(float temperature , int num){
			if(num==1){
			  float cerelsius = (float) (5/9.0f*(temperature-32));

			  return cerelsius;
			}
			else{

				float fahrenheit =(float)(((temperature*9)/5.0f)+32);
				return fahrenheit;
			}

		}


}