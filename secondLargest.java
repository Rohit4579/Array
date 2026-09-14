
class secondLargest {
    public int maxSecond(int[] arr) {
        int largest;
        int second;

        if(arr[0] < arr[1]){
            largest = arr[1];
            second = arr[0];
        }else{
            largest = arr[0];
            second = arr[1];
        }
        
        for(int i = 2; i < arr.length; i++){

            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        secondLargest solution = new secondLargest();

        int[] arr = {1, 4, 5, 7, 8, 9};

        System.out.println(solution.maxSecond(arr));
    }
}