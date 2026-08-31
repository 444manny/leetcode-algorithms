public class binarySearch  {
    
    public static void main(String[] args){

    }

    
        public static int bSearch(int[] array, int target){
            int low = 0;
            int high = array.length -1;

            while(low<=high){
                int middlePosition = (low + high) / 2;
                int middleNumber = array[middlePosition];

                if(target == middleNumber){
                    return middlePosition;
                }
                if(target < middleNumber){
                    high = middlePosition -1;
                }
                else{
                    low = middlePosition + 1;
                }

            }
            return -1;
        
        }
}

