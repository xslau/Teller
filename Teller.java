import java.util.Scanner; 

public class Teller{

    private static final double Q_VALUE = 0.25;
    private static final double D_VALUE = 0.10;
    private static final double N_VALUE = 0.05;
    private static final double P_VALUE = 0.01;

    public static int qAMT; 
    public static int dAMT; 
    public static int nAMT; 
    public static int pAMT; 

    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("Welcome to the Teller!"); 

        System.out.println("\nEnter # of Quarters: "); 
        int qAMT = input.nextInt();

        System.out.println("\nEnter # of Dimes: "); 
        int dAMT = input.nextInt();

        System.out.println("\nEnter # of Nickels: "); 
        int nAMT = input.nextInt();

        System.out.println("\nEnter # of Pennies: "); 
        int pAMT = input.nextInt();

        double totalValue = calcQuarters(qAMT) + calcDimes(dAMT) + calcNickels(nAMT) + calcPenny(pAMT);

        System.out.println("Total Value: " + totalValue );

    }

    
    public static double calcQuarters(int amt){

        return Q_VALUE * amt; 
    }

    public static double calcDimes(int amt){

        return D_VALUE * amt; 
    }

    public static double calcNickels(int amt){

        return N_VALUE * amt; 
    }

    public static double calcPenny(int amt){

        return P_VALUE * amt; 
    }


    public int getQAMT() {

        return qAMT; 
    }

    public void setQAMT(int xQAMT){

        qAMT = xQAMT; 

    }

    public int getDAMT() {

        return dAMT; 
    }

    public void setDAMT(int xDAMT){

        dAMT = xDAMT; 
        
    }

    public int getNAMT() {

        return nAMT; 
    }

    public void setNAMT(int xNAMT){

        nAMT = xNAMT; 
        
    }

    public int getPAMT() {

        return pAMT; 
    }

    public void setPAMT(int xPAMT){

        pAMT = xPAMT; 
        
    }
}