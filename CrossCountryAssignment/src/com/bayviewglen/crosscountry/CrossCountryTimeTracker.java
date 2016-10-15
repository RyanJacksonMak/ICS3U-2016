
package com.bayviewglen.crosscountry;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CrossCountryTimeTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000"); 
		
		System.out.println("Please enter your first name: ");             //entering first name
		String scannerInput = scanner.nextLine();
		String runnerFirst1= scannerInput;                                //declare the input is renamed as runnerFIrst1
		System.out.println("Hello " + runnerFirst1 + "!");                //make it so that hello is added to runner
		System.out.println("Please enter your last name: ");			  //entering last name
		scannerInput = scanner.nextLine();
		String runnerLast1= scannerInput;
		String runnerName1 = runnerFirst1 + " "+runnerLast1;
		System.out.println("Hello " + runnerFirst1 + " "+runnerLast1 + "!");
		
		
		System.out.println("\nRunner One Summary");                       //Printing out subtitles to organize each section
		System.out.println("******************\n");
		
		//First Question
		
		System.out.println("Please enter your time to the first mile (Ex: mm:ss.sss)");
		scannerInput = scanner.nextLine();
		
		int r1Mile1Minutes  = 0;                                          //Splitting minutes and seconds by using Array
		double r1Mile1Seconds = 0.00;
		String[] stringArray = new String[1]; 
		stringArray = scannerInput.split(":");
	
		String[] scannerInputArray = scannerInput.split (":");  //Split ScannerInput by the colon and assign the two values into an String Array
		r1Mile1Minutes = Integer.parseInt(stringArray[0]); //String array has two slots, 0 contain the integers off the minutes
		r1Mile1Seconds = Double.parseDouble(stringArray[1]); //String array 1 contains the double of the seconds	
		
		//Second Question

		System.out.println("Please enter your time to the end of second mile (Ex: mm:ss.sss)");
		scannerInput = scanner.nextLine();
		
		int r1Mile2Minutes  = 0;
		double r1Mile2Seconds = 0.00;
		
		stringArray = new String[1]; 
		stringArray = scannerInput.split(":");
		
		String[] scannerInputArray1 = scannerInput.split (":");    //Splitting at the colon ":"
		r1Mile2Minutes = Integer.parseInt(stringArray[0]);         //returning the integer
		r1Mile2Seconds = Double.parseDouble(stringArray[1]);	   //returning the double
	
		//Third Question
		
		System.out.println("Please enter your time to complete 5 kms (Ex: mm:ss.sss)");
		scannerInput = scanner.nextLine();
		
		int r1TotalMinutes  = 0;
		double r1TotalSeconds = 0.00;
		
		stringArray = new String[1]; 
		stringArray = scannerInput.split(":");
		
		stringArray = scannerInput.split (":");
		r1TotalMinutes = Integer.parseInt(stringArray[0]);
		r1TotalSeconds = Double.parseDouble(stringArray[1]);	
		
		int r1Split1Minutes = r1Mile1Minutes;
		double r1Split1Seconds = r1Mile1Seconds;
		
        double timeATotalSeconds = r1Mile1Minutes * 60 + r1Mile1Seconds; //making the minutes into seconds by making the minutes*60 + the rest of the seconds
        double timeBTotalSeconds = r1Mile2Minutes * 60 + r1Mile2Seconds;  
        double differenceTotalSeconds = timeBTotalSeconds - timeATotalSeconds;
        
        
        int r1Split2Minutes = (int)differenceTotalSeconds / 60;
        double r1Split2Seconds = differenceTotalSeconds - r1Split2Minutes * 60;
        
        timeATotalSeconds = r1Mile2Minutes * 60 + r1Mile2Seconds;
        timeBTotalSeconds = r1TotalMinutes * 60 + r1TotalSeconds;
        differenceTotalSeconds = timeBTotalSeconds - timeATotalSeconds;
        
        int r1Split3Minutes = (int)differenceTotalSeconds / 60;
        double r1Split3Seconds = differenceTotalSeconds - r1Split3Minutes * 60;
        
        System.out.println("\n First Runner Summary");
        System.out.println("******************\n");
        System.out.println("Runner: " + runnerLast1 + ", " + runnerFirst1);
        System.out.println("First Split: " + r1Split1Minutes + ":" + formatter.format(r1Split1Seconds));
        System.out.println("Second Split: " + r1Split2Minutes + ":" + formatter.format(r1Split2Seconds));
        System.out.println("Third Split: " + r1Split3Minutes + ":" + formatter.format(r1Split3Seconds));
        System.out.println("Total: " + r1TotalMinutes + ":" + formatter.format(r1TotalSeconds));

        
        
        System.out.println("\nRunner Two Summary");
		System.out.println("******************\n");
		
		System.out.println("Please enter your first name: ");

		String scannerInput1 = scanner.nextLine();
		
		String runnerFirst2= scannerInput1;
		System.out.println("Hello " + runnerFirst2 + "!");
		System.out.println("Please enter your last name: ");
		scannerInput = scanner.nextLine();
		String runnerLast2= scannerInput;
		String runnerName2 = runnerFirst2 + " "+runnerLast2;
		System.out.println("Hello " + runnerFirst2 + " "+runnerLast2 + "!");
		
		//First Question
		
		System.out.println("Please enter your time to the first mile (Ex: mm:ss.sss)");
		scannerInput = scanner.nextLine();
		
		int r2Mile1Minutes  = 0;
		double r2Mile1Seconds = 0.00;
		String[] stringArray1 = new String[1]; 
		stringArray = scannerInput.split(":");
	
		String[] scannerInputArray2 = scannerInput.split (":");  
		r2Mile1Minutes = Integer.parseInt(stringArray[0]);
		r2Mile1Seconds = Double.parseDouble(stringArray[1]); 
		//Second Question

		System.out.println("Please enter your time to the end of second mile (Ex: mm:ss.sss)");
		scannerInput = scanner.nextLine();
		
		int r2Mile2Minutes  = 0;
		double r2Mile2Seconds = 0.00;
		
		stringArray = new String[1]; 
		stringArray = scannerInput.split(":");
		
		String[] scannerInputArray3 = scannerInput.split (":");
		r2Mile2Minutes = Integer.parseInt(stringArray[0]);
		r2Mile1Seconds = Double.parseDouble(stringArray[1]);	
		
		System.out.println("r2Mile2Minutes " +  r2Mile2Minutes);
		System.out.println("r2Mile2Seconds " +  r2Mile2Seconds);
		
		//Third Question
		
		System.out.println("Please enter your time to complete 5 kms (Ex: mm:ss.sss)");
		scannerInput = scanner.nextLine();
		
		int r2TotalMinutes  = 0;
		double r2TotalSeconds = 0.00;
		
		stringArray = new String[1]; 
		stringArray = scannerInput.split(":");
		
		stringArray = scannerInput.split (":");
		r2TotalMinutes = Integer.parseInt(stringArray[0]);
		r2TotalSeconds = Double.parseDouble(stringArray[1]);	
		
		int r2Split1Minutes = r2Mile1Minutes;
		double r2Split1Seconds = r2Mile1Seconds;
		
        double timeATotalSeconds2 = r2Mile1Minutes * 60 + r2Mile1Seconds;
        double timeBTotalSeconds2= r2Mile2Minutes * 60 + r2Mile2Seconds;
        double differenceTotalSeconds2 = timeBTotalSeconds2 - timeATotalSeconds2;
        
        
        int r2Split2Minutes = (int)differenceTotalSeconds / 60;
        double r2Split2Seconds = differenceTotalSeconds - r1Split2Minutes * 60;
        
        timeATotalSeconds = r2Mile2Minutes * 60 + r2Mile2Seconds;
        timeBTotalSeconds = r2TotalMinutes * 60 + r2TotalSeconds;
        differenceTotalSeconds2 = timeBTotalSeconds - timeATotalSeconds;
        
        int r2Split3Minutes = (int)differenceTotalSeconds / 60;
        double r2Split3Seconds = differenceTotalSeconds - r2Split3Minutes * 60;
        
        System.out.println("\n Second Runner Summary");
        System.out.println("******************\n");
        System.out.println("Runner: " + runnerLast2+ ", " + runnerFirst2);
        System.out.println("First Split: " + r2Split1Minutes + ":" + formatter.format(r2Split1Seconds));
        System.out.println("Second Split: " + r2Split2Minutes + ":" + formatter.format(r2Split2Seconds));
        System.out.println("Third Split: " + r2Split3Minutes + ":" + formatter.format(r2Split3Seconds));
        System.out.println("Total: " + r2TotalMinutes + ":" + formatter.format(r2TotalSeconds));

		
        System.out.println("\nRunner Three Summary");
     		System.out.println("******************\n");
     		
     		System.out.println("Please enter your first name: ");
     		String scannerInput2 = scanner.nextLine();
     		String runnerFirst3= scannerInput2;
     		System.out.println("Hello " + runnerFirst3 + "!");
     		System.out.println("Please enter your last name: ");
     		scannerInput = scanner.nextLine();
     		String runnerLast3= scannerInput;
     		String runnerName3 = runnerFirst3 + " "+runnerLast3;
     		System.out.println("Hello " + runnerFirst3 + " "+runnerLast3 + "!");
     		
     		
     		//First Question
     		
     		System.out.println("Please enter your time to the first mile (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r3Mile1Minutes  = 0;
     		double r3Mile1Seconds = 0.00;
     		String[] stringArray2 = new String[1]; 
     		stringArray = scannerInput.split(":");
     	
     		String[] scannerInputArray4 = scannerInput.split (":");  
     		r3Mile1Minutes = Integer.parseInt(stringArray[0]);
     		r3Mile1Seconds = Double.parseDouble(stringArray[1]); 
     		//Second Question

     		System.out.println("Please enter your time to the end of second mile (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r3Mile2Minutes  = 0;
     		double r3Mile2Seconds = 0.00;
     		stringArray = scannerInput.split(":");	
     		stringArray = new String[1]; 
     	
     		
     		String[] scannerInputArray5 = scannerInput.split (":");
     		r3Mile2Minutes = Integer.parseInt(stringArray[0]);
     		r3Mile2Seconds = Double.parseDouble(stringArray[1]);	
     		
     		System.out.println("r3Mile2Minutes " +  r3Mile2Minutes);
     		System.out.println("r3Mile2Seconds " +  r3Mile2Seconds);
     		
     		//Third Question
     		
     		System.out.println("Please enter your time to complete 5 kms (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r3TotalMinutes  = 0;
     		double r3TotalSeconds = 0.00;
     		
     		stringArray = new String[1]; 
     		stringArray = scannerInput.split(":");
     		
     		stringArray = scannerInput.split (":");
     		r3TotalMinutes = Integer.parseInt(stringArray[0]);
     		r3TotalSeconds = Double.parseDouble(stringArray[1]);	
     		
     		int r3Split1Minutes = r3Mile1Minutes;
     		double r3Split1Seconds = r3Mile1Seconds;
     		
             double timeATotalSeconds3 = r3Mile1Minutes * 60 + r2Mile1Seconds;
             double timeBTotalSeconds3= r3Mile2Minutes * 60 + r2Mile2Seconds;
             double differenceTotalSeconds3 = timeBTotalSeconds3 - timeATotalSeconds3;
             
             
             int r3Split2Minutes = (int)differenceTotalSeconds / 60;
             double r3Split2Seconds = differenceTotalSeconds - r3Split2Minutes * 60;
             
             timeATotalSeconds = r3Mile2Minutes * 60 + r3Mile2Seconds;
             timeBTotalSeconds = r3TotalMinutes * 60 + r3TotalSeconds;
             differenceTotalSeconds3 = timeBTotalSeconds - timeATotalSeconds;
             
             int r3Split3Minutes = (int)differenceTotalSeconds / 60;
             double r3Split3Seconds = differenceTotalSeconds - r3Split3Minutes * 60;
             
             System.out.println("\n Third Summary");
             System.out.println("******************\n");
             System.out.println("Runner: " + runnerLast3+ ", " + runnerFirst3);
             System.out.println("First Split: " + r3Split1Minutes + ":" + formatter.format(r3Split1Seconds));
             System.out.println("Second Split: " + r3Split2Minutes + ":" + formatter.format(r3Split2Seconds));
             System.out.println("Third Split: " + r3Split3Minutes + ":" + formatter.format(r3Split3Seconds));
             System.out.println("Total: " + r3TotalMinutes + ":" + formatter.format(r3TotalSeconds));

		
             System.out.println("\nRunner Four Summary");
     		System.out.println("******************\n");
     		
     		System.out.println("Please enter your first name: ");
     		String scannerInput3 = scanner.nextLine();
     		
     		String runnerFirst4= scannerInput3;
     		System.out.println("Hello " + runnerFirst4 + "!");
     		System.out.println("Please enter your last name: ");  		
     		scannerInput = scanner.nextLine();
     		String runnerLast4= scannerInput;
     		String runnerName4 = runnerFirst4 + " "+runnerLast4;
     		System.out.println("Hello " + runnerFirst4 + " "+runnerLast4 + "!");
     		
     		
     		//First Question
     		
     		System.out.println("Please enter your time to the first mile (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r4Mile1Minutes  = 0;
     		double r4Mile1Seconds = 0.00;
     		String[] stringArray3 = new String[1]; 
     		stringArray = scannerInput.split(":");
     	
     		String[] scannerInputArray6 = scannerInput.split (":");  
     		r4Mile1Minutes = Integer.parseInt(stringArray[0]);
     		r4Mile1Seconds = Double.parseDouble(stringArray[1]); 
     		//Second Question

     		System.out.println("Please enter your time to the end of second mile (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r4Mile2Minutes  = 0;
     		double r4Mile2Seconds = 0.00;
     		
     		stringArray = new String[1]; 
     		stringArray = scannerInput.split(":");
     		
     		String[] scannerInputArray7 = scannerInput.split (":");
     		r4Mile2Minutes = Integer.parseInt(stringArray[0]);
     		r4Mile1Seconds = Double.parseDouble(stringArray[1]);	
     		
     		System.out.println("r4Mile2Minutes " +  r4Mile2Minutes);
     		System.out.println("r4Mile2Seconds " +  r4Mile2Seconds);
     		
     		//Third Question
     		
     		System.out.println("Please enter your time to complete 5 kms (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r4TotalMinutes  = 0;
     		double r4TotalSeconds = 0.00;
     		
     		stringArray = new String[1]; 
     		stringArray = scannerInput.split(":");
     		
     		stringArray = scannerInput.split (":");
     		r4TotalMinutes = Integer.parseInt(stringArray[0]);
     		r4TotalSeconds = Double.parseDouble(stringArray[1]);	
     		
     		int r4Split1Minutes = r4Mile1Minutes;
     		double r4Split1Seconds = r4Mile1Seconds;
     		
             double timeATotalSeconds4 = r4Mile1Minutes * 60 + r4Mile1Seconds;
             double timeBTotalSeconds4= r4Mile2Minutes * 60 + r4Mile2Seconds;
             double differenceTotalSeconds4 = timeBTotalSeconds2 - timeATotalSeconds2;
             
             
             int r4Split2Minutes = (int)differenceTotalSeconds / 60;
             double r4Split2Seconds = differenceTotalSeconds - r4Split2Minutes * 60;
             
             timeATotalSeconds = r4Mile2Minutes * 60 + r4Mile2Seconds;
             timeBTotalSeconds = r4TotalMinutes * 60 + r4TotalSeconds;
             differenceTotalSeconds4 = timeBTotalSeconds - timeATotalSeconds;
             
             int r4Split3Minutes = (int)differenceTotalSeconds / 60;
             double r4Split3Seconds = differenceTotalSeconds - r4Split3Minutes * 60;
             
             System.out.println("\n Fourth Runner Summary");
             System.out.println("******************\n");
             System.out.println("Runner: " + runnerLast4+ ", " + runnerFirst4);
             System.out.println("First Split: " + r4Split1Minutes + ":" + formatter.format(r4Split1Seconds));
             System.out.println("Second Split: " + r4Split2Minutes + ":" + formatter.format(r4Split2Seconds));
             System.out.println("Third Split: " + r4Split3Minutes + ":" + formatter.format(r4Split3Seconds));
             System.out.println("Total: " + r4TotalMinutes + ":" + formatter.format(r4TotalSeconds));

             
             System.out.println("\nRunner Five Summary");
     		System.out.println("******************\n");
     		
     		System.out.println("Please enter your first name: ");

     		String scannerInput4 = scanner.nextLine();

     		String runnerFirst5= scannerInput4;
     		System.out.println("Hello " + runnerFirst5 + "!");	
     		System.out.println("Please enter your last name: ");     		
     		scannerInput = scanner.nextLine();   		
     		String runnerLast5= scannerInput;    		
     		String runnerName5 = runnerFirst5 + " "+runnerLast5;     		
     		System.out.println("Hello " + runnerFirst5 + " "+runnerLast5 + "!");    		
     		
     		//First Question
     		
     		System.out.println("Please enter your time to the first mile (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r5Mile1Minutes  = 0;
     		double r5Mile1Seconds = 0.00;
     		String[] stringArray4 = new String[1]; 
     		stringArray = scannerInput.split(":");
     	
     		String[] scannerInputArray8 = scannerInput.split (":");  
     		r5Mile1Minutes = Integer.parseInt(stringArray[0]);
     		r5Mile1Seconds = Double.parseDouble(stringArray[1]); 
     		//Second Question

     		System.out.println("Please enter your time to the end of second mile (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r5Mile2Minutes  = 0;
     		double r5Mile2Seconds = 0.00;
     		
     		stringArray = new String[1]; 
     		stringArray = scannerInput.split(":");
     		
     		String[] scannerInputArray9 = scannerInput.split (":");
     		r5Mile2Minutes = Integer.parseInt(stringArray[0]);
     		r5Mile1Seconds = Double.parseDouble(stringArray[1]);	
     		
     		System.out.println("r5Mile2Minutes " +  r5Mile2Minutes);
     		System.out.println("r5Mile2Seconds " +  r5Mile2Seconds);
     		
     		//Third Question
     		
     		System.out.println("Please enter your time to complete 5 kms (Ex: mm:ss.sss)");
     		scannerInput = scanner.nextLine();
     		
     		int r5TotalMinutes  = 0;
     		double r5TotalSeconds = 0.00;
     		
     		stringArray = new String[1]; 
     		stringArray = scannerInput.split(":");
     		
     		stringArray = scannerInput.split (":");
     		r5TotalMinutes = Integer.parseInt(stringArray[0]);
     		r5TotalSeconds = Double.parseDouble(stringArray[1]);	
     		
     		int r5Split1Minutes = r5Mile1Minutes;
     		double r5Split1Seconds = r5Mile1Seconds;
     		
             double timeATotalSeconds5 = r5Mile1Minutes * 60 + r5Mile1Seconds;
             double timeBTotalSeconds5= r5Mile2Minutes * 60 + r5Mile2Seconds;
             double differenceTotalSeconds5 = timeBTotalSeconds5 - timeATotalSeconds5;   
             
             int r5Split2Minutes = (int)differenceTotalSeconds / 60;
             double r5Split2Seconds = differenceTotalSeconds - r5Split2Minutes * 60;
             
             timeATotalSeconds = r5Mile2Minutes * 60 + r5Mile2Seconds;
             timeBTotalSeconds = r5TotalMinutes * 60 + r5TotalSeconds;
             differenceTotalSeconds5 = timeBTotalSeconds - timeATotalSeconds;
             
             int r5Split3Minutes = (int)differenceTotalSeconds / 60;
             double r5Split3Seconds = differenceTotalSeconds - r5Split3Minutes * 60;
             
             System.out.println("\n Fifth Runner Summary");
             System.out.println("******************\n");
             System.out.println("Runner: " + runnerLast5+ ", " + runnerFirst5);
             System.out.println("First Split: " + r5Split1Minutes + ":" + formatter.format(r5Split1Seconds));
             System.out.println("Second Split: " + r5Split2Minutes + ":" + formatter.format(r5Split2Seconds));
             System.out.println("Third Split: " + r5Split3Minutes + ":" + formatter.format(r5Split3Seconds));
             System.out.println("Total: " + r5TotalMinutes + ":" + formatter.format(r5TotalSeconds));
             
             System.out.println("\n\nCross Country Results");
             System.out.println("Name\t\t\tSplit One\t\tSplit Two\t\tSplit Three\t\tFinish Time");
             System.out.println("----\t\t\t---------\t\t---------\t\t-----------\t\t-----------");
             System.out.println(runnerLast1 + ", " + runnerFirst1 + "\t\t" + r1Split1Minutes + ":" + formatter.format(r1Split1Seconds) + "\t\t" + r1Split2Minutes + ":" + formatter.format(r1Split2Seconds) + "\t\t" + r1Split3Minutes + ":" + formatter.format(r1Split3Seconds) + "\t\t" + r1TotalMinutes + ":" + formatter.format(r1TotalSeconds));
             System.out.println(runnerLast2 + ", " + runnerFirst2 + "\t\t" + r2Split1Minutes + ":" + formatter.format(r2Split1Seconds) + "\t\t" + r2Split2Minutes + ":" + formatter.format(r2Split2Seconds) + "\t\t" + r2Split3Minutes + ":" + formatter.format(r2Split3Seconds) + "\t\t" + r2TotalMinutes + ":" + formatter.format(r2TotalSeconds));
             System.out.println(runnerLast3 + ", " + runnerFirst3 + "\t\t" + r3Split1Minutes + ":" + formatter.format(r3Split1Seconds) + "\t\t" + r3Split2Minutes + ":" + formatter.format(r3Split2Seconds) + "\t\t" + r3Split3Minutes + ":" + formatter.format(r3Split3Seconds) + "\t\t" + r3TotalMinutes + ":" + formatter.format(r3TotalSeconds));
             System.out.println(runnerLast4 + ", " + runnerFirst4 + "\t\t" + r4Split1Minutes + ":" + formatter.format(r4Split1Seconds) + "\t\t" + r4Split2Minutes + ":" + formatter.format(r4Split2Seconds) + "\t\t" + r4Split3Minutes + ":" + formatter.format(r4Split3Seconds) + "\t\t" + r4TotalMinutes + ":" + formatter.format(r4TotalSeconds));
             System.out.println(runnerLast5 + ", " + runnerFirst5 + "\t\t" + r5Split1Minutes + ":" + formatter.format(r5Split1Seconds) + "\t\t" + r5Split2Minutes + ":" + formatter.format(r5Split2Seconds) + "\t\t" + r5Split3Minutes + ":" + formatter.format(r5Split3Seconds) + "\t\t" + r5TotalMinutes + ":" + formatter.format(r5TotalSeconds));


		scanner.close();
	}

}