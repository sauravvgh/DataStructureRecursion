public class BS {
    public static void main(String[] args) {
       int[] arr = {2,3,4,5,6,7,8,9};
       int target = 8;//in order to perform the BS,the given array needs to be in ascending order
        System.out.println("The index of the particular target element is: "+findBS( arr, target, 0, arr.length-1));
     }
    static int findBS(int[] arr, int target, int s, int e){
            if(s>e){ // if cases such as , s = e+1 start popping up...
                return -1;
            }
            int m = s + (e-s)/2;

            if(arr[m] == target){
                return m;
            }
            if(target<arr[m]){
               return findBS(arr, target, s, m-1);
            }
            else{
                return findBS(arr, target, m+1, e);
            }

    }


}
