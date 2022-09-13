class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int low = 0;
        int high = numbers.length - 1;
        int arr[]=new int[2];
        
        while (low < high) {
            int sum = numbers[low] + numbers[high];
                          
            if (sum == target) {
                arr[0]=low+1;
                arr[1]=high+1;
                return  arr;
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        // In case there is no solution, return {-1, -1}.
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
        
        
        
        /* Brute Force Approach:- fails in time constraints.
       int answer[] = new int[2];
       
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1; j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    answer[0]=i+1;
                    answer[1]=j+1;
                }
            }
        }
        
        return answer;*/
    }