public class HelloJava {
    public static void main(String[] args) {
    boolean eli = ConsultaPares(50);  
    System.out.println(eli);
        int cant = 50;
        for(int i=1;i<cant;i++)
            {
                
                for(int j=cant;j>i;j--){
                    System.out.print("*");
                }

                System.out.println("");
            }

    }

    public static boolean ConsultaPares(int numero) {
        if (numero%2 ==0){
            return true;
        }
        return false;  
    }


}
