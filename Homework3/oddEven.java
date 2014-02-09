public class oddEven{
  public static void main(String[]args){

    int numero=0;
    numero=Integer.parseInt(args[0].toString());
    
    if(numero%2==1){
       System.out.printf("Numero es Impar");
    } 
    else{
        System.out.println("Numero es Par"); 
}
}
}