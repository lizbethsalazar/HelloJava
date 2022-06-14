import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
    public static void main(String[] args) {

        try (Scanner opcion = new Scanner(System.in)) {
            System.out.println("Ingrese la opcion:");  
            int a= opcion.nextInt(); 
            int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
            System.out.println(randomNum);  

            switch (a){

                case 1:
                    for(int i=1;i<=randomNum;i++)
                    {
                        for(int j=0;j<i;j++){
                            System.out.print("*");
                        }

                        System.out.println("");
                    }
                break;

                case 2:
                for(int i=1;i<=randomNum;i++)
                {                 
                    for(int j=randomNum;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

                case 3:
                    for(int i=1;i<=randomNum;i++)
                    {
                        for(int j=0;j<i;j++){
                            System.out.print("*");
                        }

                        System.out.println("");
                    }
                    for(int i=1;i<randomNum;i++)
                        {                 
                            for(int j=randomNum;j>i;j--){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                break;
            
                case 4:
                    //randomNum = randomNum/2;
                    for(int i=1;i<=randomNum;i++)
                    {
                        for(int j=randomNum;j>i;j--){
                            System.out.print(" ");
                        }
                        for(int j=1;j<i;j++){
                            System.out.print("*");
                        }
                        for(int j=0;j<i;j++){
                            System.out.print("*");
                        }

                        System.out.println("");
                    }
                    for(int i=1;i<randomNum;i++)
                        {    
                        for(int j=0;j<i;j++){
                            System.out.print(" ");
                        }                 
                        for(int j=randomNum;j>i;j--){
                            System.out.print("*");
                        }
                        for(int j=randomNum-1;j>i;j--){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                break;
    
            }
        }
    }

}
