public class dutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,1,1,1,1,2,0,1,0};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;


        while (mid<=high){
            if (arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid ++;
                low++;
            } else if
            (arr[mid]==2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else
                mid++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
