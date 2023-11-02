public class fatorial {
    public static void main(String[] args) throws Exception {
        int f = 0;
        imprimirFatorial imp = new imprimirFatorial();
        f = imp.SequenciaFatorial(5);
        System.out.printf("O Fatorial eh:  %d \n", f);
    }
}
