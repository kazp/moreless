import java.util.Random;

public class Bubble {
  public static void main(String[] args) {
    Random r = new Random();
    int[] integers = new int[10];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = r.nextInt(100);
    }
    for(int i = integers.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            
            if( integers[j] > integers[j+1] ){
                int tmp = integers[j];
                integers[j] = integers[j+1];
                integers[j+1] = tmp;
            }
        }
    }
for (int i = 0; i < integers.length; i++) {
      System.out.print(integers[i] + ", ");
    }
  }
}

  
