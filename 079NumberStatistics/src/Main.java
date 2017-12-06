import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	NumberStatistics stats= new NumberStatistics();
    	NumberStatistics even= new NumberStatistics();
    	NumberStatistics odd= new NumberStatistics();
    	System.out.println("Type numbers: ");
        Scanner reader = new Scanner(System.in);
     
        while(true) {
        	int num=reader.nextInt();
        	if (num!=-1 && num%2==0) {       	
        	stats.addNumber(num);
        	even.addNumber(num);}
        	else if (num!=-1 && num%2!=0) {       	
            	stats.addNumber(num);
            	odd.addNumber(num);}
        	else {       		
        		System.out.println("sum: " + stats.sum());
        		System.out.println("sum of even: " + even.sum());
        		System.out.println("sum of odd: " + odd.sum());
        	break;
        	
        	
        }
        
        //int number= reader.nextInt();
       // stats.addNumber(3);
        //stats.addNumber(5);
       // stats.addNumber(1);
        //stats.addNumber(2);
       // System.out.println("Amount: " + stats.amountOfNumbers());
       // System.out.println("sum: " + stats.sum());
       // System.out.println("average: " + stats.average());
        
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
}