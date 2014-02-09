public class productToNumber{
   public static void main(String[]args){

      int numero=Integer.parseInt(args[0].toString());
      int fac=1;

      for(int i=1;i<=numero;i++){
          fac=fac*i; 
           System.out.print(i);
           System.out.print("x");
       }
      System.out.println("");
      System.out.println(fac);

   }
}