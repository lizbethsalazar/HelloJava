public class HelloJava {
    public static void main(String[] args) {
        int cant = 50;
        for(int i=1;i<cant;i++)
            {
                
                for(int j=cant;j>i;j--){
                    System.out.print("*");
                }

                System.out.println("");
            }

    }
}
