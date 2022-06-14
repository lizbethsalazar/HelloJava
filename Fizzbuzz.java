public class Fizzbuzz {
    public static void main(String[] args) {
        for (int index = 0; index <=100; index++) {
            if (index%5 == 0 && index%3==0 ) {
                System.out.println("Fizzbuzz");
            }
            else{
                if (index%5==0) {
                    System.out.println("buzz");
                } else {
                    if (index%3==0) {
                        System.out.println("fizz");
                    } else {
                        System.out.println(index);
                    }
                }

            }
        }
    }
}
