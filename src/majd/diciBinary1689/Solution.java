package majd.diciBinary1689;

public class Solution {

    public static int minPartitions(String n) {
        int highestDigit = 0;
        for (int i = 0; i < n.length(); i++) {
            int currentDigit = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (currentDigit > highestDigit) {
                highestDigit = currentDigit;
            }
        }
        return highestDigit;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("123"));
        System.out.println(minPartitions("1235"));
        System.out.println(minPartitions("125935567"));
    }
}
