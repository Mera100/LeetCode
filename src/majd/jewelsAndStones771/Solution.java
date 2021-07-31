package majd.jewelsAndStones771;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int foundJewels = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int x = 0; x < stones.length(); x++) {
                if (jewels.charAt(i) == stones.charAt(x)) {
                    foundJewels++;
                }
            }
        }
        return foundJewels;
    }
}