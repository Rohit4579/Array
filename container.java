
class container {
    public int maxArea(int[] height) {
        int max = 0;

        for(int i=0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                int w = j - i;
                int h = Math.min(height[i],height[j]);
                int area = h * w;

                if(area > max){
                    max = area;
                }
            }
        }
        return max;
          
    }
    public static void main(String[] args) {
        container solution = new container();

        int[] height = {1,4,5,7,8,9};

        System.out.println(solution.maxArea(height));

    
    }
}