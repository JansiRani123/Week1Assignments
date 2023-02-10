package week1.day2;

public class AssignmentFibo1 {
public static void main(String[] args) {
	   int i=0;
       int firstNum=0;
       int secondNum=1;
       int sum=0;
    	  
       for(i=0;i<=9;i++)
    		   
       {
    	  sum=firstNum+secondNum;
          firstNum=secondNum;
          secondNum=sum; 
          System.out.println("The given Number is in Fibonaci Series "+ sum);
          
       }
       
       
 

}
}
