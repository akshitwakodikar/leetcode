class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       
        int[] modulusCount = new int[k];
     
        Arrays.fill(modulusCount, 0);

        int currentMod = 0; 
        int subarrayCount = 0; 
        modulusCount[0] = 1; 

   
        for (int num : nums) {
           
            currentMod = ((currentMod + num % k) + k) % k;

            subarrayCount += modulusCount[currentMod];

         
            modulusCount[currentMod]++;
        }

        return subarrayCount;
    }
}