public class whileValue{
  
   public static void main (String[]args){
       int i=0;
       int valorActual=0;
       valorActual=Integer.parseInt(args[0].toString());
        
       while(i<valorActual){
         
          System.out.println("El valor actual es:"+i);
          i++; 
                  
        }


       }
}