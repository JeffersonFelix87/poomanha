import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {3,7};
      //  for (int i = 0; i < x.length; i++) {
      //      System.out.println(x[i]);
      //  }
        int[] vetora = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] vetorb = new int[10];
        System.arraycopy(vetora, 2, vetorb, 6, 4);
        for(int i=0; i<10; i++){
            System.out.println(vetorb[i]);
        }
        int vetorc[] =  new int[10];
        Arrays.fill(vetorc, 20);
        for(int y: vetorc){
            System.out.println(y);
        }
        int vetord[] = {12, 5, 8, 1, 3};
        Arrays.sort(vetord);
        for(int y: vetord){
            System.out.println(y);
        }
    }
}