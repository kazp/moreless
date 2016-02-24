import java.util.Random;

public class Selection {
  public static void main(String[] args) {
    Random r = new Random();
    int[] integers = new int[10];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = r.nextInt(100);
    }
    for (int i = 0; i < integers.length; i++) {
        int min = integers[i];
        int imin = i; 
        for (int j = i+1; j < integers.length; j++) {
           
            if (integers[j] < min) {
                min = integers[j];
                imin = j;
            }
        }
       
        if (i != imin) {
            int temp = integers[i];
            integers[i] = integers[imin];
            integers[imin] = temp;
        }
    }
    
    for (int i = 0; i < integers.length; i++) {
      System.out.print(integers[i] + ", ");
    }
  }
}

  
