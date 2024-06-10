package Main;

public class Main {

    public Main(){}

    public int smallest(int[] a){
        int smallest = a[0];
        for (int i = 0; i < a.length;i++){
            if(smallest > a[i]){
                smallest = a[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {

         int [] numbers = {10,30,-20,-28,3,4,-200};

         Main bAlgorithmen = new Main();
         bAlgorithmen.smallest(numbers);
         System.out.println(bAlgorithmen.smallest(numbers));

    }
}