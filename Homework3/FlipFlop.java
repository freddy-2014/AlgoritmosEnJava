public class FlipFlop{

  public static void main(String[]args){
        int numeroActual=0;
      //  System.out.println(args[0]);
        numeroActual=Integer.parseInt(args[0].toString());
        
         for(int i=0;i<=numeroActual;i++){
            //System.out.println(i);
             
             if(i>0){
              if(i%3==0&&i%5==0){
                System.out.println("FlipFlop:"+i);
               } 
              else if(i%3==0){
                System.out.println("Flip:"+i);
               }
              else if(i%5==0){
                System.out.println("Flop:"+i);
               }
               else {
               System.out.println(i);
          
               }
          
              }
              else
                 System.out.println("0");
              } 
        }
}