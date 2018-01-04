import java.lang.Math;
class Nomer4{
	public static void main(String[] args){
System.out.println();

     for (int i=0; i<=11; i++){
     	for(int j=1; j<=5; j++){
         if(i%2==0){
   System.out.print(i*j +"\t");

     }else{
     	 System.out.print(Math.pow(i, j)+"\t");

     }
 }
    System.out.println();
 	}
	}
}