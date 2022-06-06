import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
    public static void main(String[] args) {
    int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
    System.out.println(randomNum);    
    boolean eli = ConsultaPares(randomNum);  
        if (eli==true){
            for(int i=1;i<=randomNum;i++)
                {                 
                    for(int j=randomNum;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
        }
        else {
            for(int i=1;i<=randomNum;i++)
                {
                    
                    for(int j=0;j<i;j++){
                        System.out.print("*");
                    }

                    System.out.println("");
                }
        }
    }

    public static boolean ConsultaPares(int numero) {
        return numero%2 ==0;  
    }


}
