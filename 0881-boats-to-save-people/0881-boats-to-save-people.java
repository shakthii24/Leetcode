class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        
        int boats = 0;
        while(i <= j){
            int maxWeight = people[i] + people[j];
            if(maxWeight <= limit){
                boats += 1;
                i++;
                j--;
            }else{
                boats += 1;
                j--;
            }
        }
        return boats;
    }
}