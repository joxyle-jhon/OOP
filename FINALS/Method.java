public class Method
{
    static int find_min(int[] myarray) { 
        int min = 0;

        for(int i = 0; i < myarray.length; i++) {
            if (myarray[i] < min) {
                min = myarray[i];
            }
        } 
        return min;
    }

    static int find_max(int[] myarray) {
        int max = 0;
        for(int i = 0; i < myarray.length; i++) {
            if (myarray[i] > max) {
                max = myarray[i];
            }
        }
        return max;
}

public static void main(String args[]) {

    int [] arr = {12, 34, 64, 67, 90};
    
    int min = find_min(arr);
    int max = find_max(arr);

    System.out.println("The minimum is " + min + " the maximum is " + max );
    }   
}
