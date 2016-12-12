package factorial;

public class Factorial {

    public static void calcular() {
        int j = 8;
        int f;

        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            bucle(f, j);
        }
        
        System.out.println(f);
    }

    public static void bucle(int f, int j) {
        for (int i = j; i >= 1; i--) {
            f = f * i;
        }
    }

    public static void main(String[] args) {
        //Hacemos click derecho Format
        //Hacemos el Rename
        //Creo dos metodos uno para la formula y el otro para el bucle

        calcular();

    }

}
