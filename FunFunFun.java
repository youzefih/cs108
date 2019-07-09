import java.util.Arrays;

public class FunFunFun {
public String getIdentificationString() {
	return "Program 8b, Youssef Iraqi";
}
   public static void main(String[] args) {
     FunFunFun app = new FunFunFun();
      System.out.println(app.fastCountDown(3));
     app.gcd(1440,408,0);
      System.out.println( "T(4) = " + app.eTime(4) );
   }

   public String fastCountDown( int number ) {
       /*  returns whatever you input and everytime -2 until reaching 1 or 0 */
	   if(number==0 || number==1)
       {
           return String.valueOf(number) + " ";
       }
       else
       {
    	   	int value = number;
           number=number-2;
           return value +" " +fastCountDown(number);
       }
   }
   
	   
		  

   public int gcd(int p, int q,int l)
   {

      
      char[] spaces = new char[l];
      Arrays.fill(spaces, ' ');
      System.out.println( new String(spaces) + "gcd(" + p + "," + q + ")");
     
      l=l+3;//for adding space in each level
     
   if (q == 0)
   {
      char[] space = new char[l];
      Arrays.fill(space, ' ');
      System.out.println(new String(space) + "return "+p);
      return p;
     
   }
   else
   {
      int x=gcd(q, p % q,l);
      char[] spac = new char[l];
      Arrays.fill(spac, ' ');
      System.out.println(new String(spac) + "return "+x);
      return x;
   }    
   }

   public int eTime( int n ) {
	   
	   
	   int answer = (int) Math.pow(2,n);
	   answer = answer -1;
	
	   return answer;
	   
   }

}