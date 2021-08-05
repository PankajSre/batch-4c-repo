public class User {
   public static void main(String[] args){
     System.out.println("Hello from User");
	 System.out.println("Is Number Prime ? :"+ isPrime(11));
   }
   
   public static int isPrime(int num){
	   for(int i=2;i<num/2;i++){
		   
		   if(num%i==0)
			   return false;
		       break;
	   }
	   return true;
   }
}