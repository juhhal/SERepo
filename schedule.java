import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class sechedule {
    public static void main(String[] args) throws Exception {
        PCB BigQ[];
        PCB P1[];
        PCB P2[];
        PCB P3[];
        PCB P4[];
        PCB P5[];
        int NP1 = 0;
        int NP2 = 0;
        int NP3 = 0;
        int NP4 = 0;
        int NP5 = 0;
        int NOP = 0;//# of prosses in Queues
        int priority;
        int arrivalTime;
        int CPUburst;
        String ScheOrder = "";

        public static void constructure(PCB[]) {
            for (int i = 0; i < NOP; i++){
                if(priority == 1 || priority == 2 || priority == 3 || priority == 4 || priority == 5) {
                    if(priority == 1){
                        BigQ[NOP]= new PCB((i+1), priority, arrivalTime, CPUburst);
                        NP1++;
                    }
                    else if(priority == 2){
                        BigQ[NOP]= new PCB((i+1), priority, arrivalTime, CPUburst);
                        NP2++;
                    }
                    else if(priority == 3){
                        BigQ[NOP]= new PCB((i+1), priority, arrivalTime, CPUburst);
                        NP3++;
                    }
                    else if(priority == 4){
                        BigQ[NOP]= new PCB((i+1), priority, arrivalTime, CPUburst);
                        NP4++;
                    }
                    else if(priority == 5){
                        BigQ[NOP]= new PCB((i+1), priority, arrivalTime, CPUburst);
                        NP5++;
                    }
                    else {
                        System.out.println("enter valid peiority number 1 or 2" );
                    }

                }
            Print();
        }
    }//end constructure()
    
    public static void Print(PCB[]) {
        try {
            File FF = new File ("Reprot.txt");
            FileOutputStream OSF = new FileOutputStream(FF);
            PrintStream write = new PrintStream(OSF);
            System.out.println("Report of detailed information about each process in the system:");
            write.print("Report of detailed information about each process in the system:");
            write.print("\n");
      
            if(NOP > 0){
                System.out.println("Scheduling order of the processes:");
                write.print("Scheduling order of the processes:");
                write.print("\n");
                System.out.println(" [" + ScheOrder.substring(0, ScheOrder.length()-1) + "] ");
                write.print(" [" + ScheOrder.substring(0, ScheOrder.length()-1) + "] "); //They Need it?
                write.print("\n");
            }
            
            for (int i = 0; i < NOP; i++) {
                //Display processes along with all details
                System.out.printf("Processes " + " Priority " + " Arrival time" + " CPU burst " + " Start time " + " Termination time " + " TurnAround time" + " Waiting time " + " Response time\n");
                write.print("Processes " + " Priority " + " Arrival time" + " CPU burst " + " Start time " + " Termination time " + " TurnAround time" "Waiting time " + " Response time\n");
                System.out.print("-----------------------------------------------------------------------------------------------------------------------" +"\n");
                write.print("-----------------------------------------------------------------------------------------------------------------------" +"\n");

                if(PCB.length > 0) {
                    if(PCB[i]!=null) {
                        System.out.printf("    %s ", PCB[i].getProcessID());
                        write.printf("    %s ",PCB[i].getProcessID() );
                        System.out.printf("        %d ", PCB[i].getPriority());
                        write.printf("        %d ", PCB[i].getPriority());
                        System.out.printf("           %d", PCB[i].getArrivalTime());
                        write.printf("           %d", PCB[i].getArrivalTime());
                        System.out.printf("       %d", PCB[i].getCPUburst());
                        write.printf("       %d", PCB[i].getCPUburst());
                        System.out.printf("              %d", PCB[i].getStartTime());
                        write.printf("              %d", PCB[i].getStartTime());
                        System.out.printf("              %d", PCB[i].getTerminationTime());
                        write.printf("              %d", PCB[i].getTerminationTime());
                        System.out.printf("              %d", PCB[i].getTurnAroundTime());
                        write.printf("              %d", PCB[i].getTurnAroundTime());
                        System.out.printf("              %d", PCB[i].getWaitingTime());
                        write.printf("              %d", PCB[i].getWaitingTime());
                        System.out.printf("              %d", PCB[i].getResponsetime());
                        write.printf("              %d", PCB[i].getResponsetime());
                        System.out.print("\n" + "-----------------------------------------------------------------------------------------------------------------------" +"\n");
                        write.print("\n" + "-----------------------------------------------------------------------------------------------------------------------" +"\n");
                    }//end inner if
                }//end outter if
                else {
                    System.out.print("The Queues are EMPTY" +"\n");
                    write.print ("The Queues are EMPTY" +"\n");   
                }
            write.close();
        }catch(IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        }//end try
    }//end Print()
}//end sechdule class
