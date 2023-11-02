public class imprimirFatorial {
    int SequenciaFatorial(int n){
        if(n == 0){
            return 1;
        }
        return(n*SequenciaFatorial(n-1));
    }
}
