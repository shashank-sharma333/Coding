class Solution {
    public int[] countBits(int n) {
       int resultArray[] = new int[n + 1];
		for (int counter = 0; counter <= n; counter++) {
			int count = 0;
			int number = counter;
			while (number != 0) {
				/*
				 * int result=n<<1; if(result==1) { count++; } n=n>>1;
				 */
				if ((number & 1) > 0) {
					count++;
				}
				number = number >> 1;
			}
			resultArray[counter] = count;
		}
		return resultArray;
	}
    /* int resultArray[]=new int[n];
     for(int counter=0;counter<n;counter++)   
     {
        int count=0;
        while(counter!=0)
      {
        /*  int result=n<<1;
          if(result==1)
          {
              count++;
          }
          n=n>>1;*/
		//	n = n >> 1;
            
  /*      count++;
      }
          resultArray[counter]=count;
    }
        return resultArray;
    }*/
}
    