import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] digitos = new int[9];
        Random random = new Random();
        for (int i = 0; i <9 ; i++) {
            int geraCpf = random.nextInt(digitos.length);
            System.out.print(geraCpf);
        }

    }
}