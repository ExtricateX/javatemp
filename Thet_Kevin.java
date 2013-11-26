package p3;


//Temps.java
//
//This program reads in a sequence of hourly temperature
//readings (beginning with midnight) and prints the maximum
//temperature (along with the hour, on a 24-hour clock, it
//occurred) and the minimum temperature (along with the hour
//it occurred).
//************************************************************
import java.util.Scanner;
public class Thet_Kevin
{
//--------------------------------------------------
//Reads in a sequence of temperatures and finds the
//maximum and minimum read in.
//--------------------------------------------------
public static void main (String[] args)
{
final int HOURS_PER_DAY = 24;
int temp; // a temperature reading
Scanner scan = new Scanner(System.in);
//print program heading
System.out.println ();
System.out.println ("Temperature Readings for 24 Hour Period");
System.out.println ();
int maxTemp = -1000;
int timeOfMax = 0;
int minTemp= 10000;
int timeOfMin =0;
for (int hour = 0; hour < HOURS_PER_DAY; hour++)
{
System.out.print ("Enter the temperature reading at " + hour +
" hours: ");
temp = scan.nextInt();
if(temp>maxTemp){
  maxTemp=temp;
  timeOfMax=hour;
}
if(temp<minTemp){
  minTemp=temp;
  timeOfMin=hour;
}

}
System.out.println("Max temp is: "+maxTemp);
System.out.println("The time of max temperature is: "+timeOfMax+"hours.");
System.out.println("Min temp is: "+minTemp);
System.out.println("The time of min temperature is: "+timeOfMin+"hours.");
//Print the results
scan.close();
}
}
