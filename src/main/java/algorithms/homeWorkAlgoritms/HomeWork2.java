package algorithms.homeWorkAlgoritms;

public class HomeWork2 {
    /**
     * First lesson
     * */
    //a) O(n^2)
    //б) O(n^2)
    //в) O(n*log n)
    //г) O(log n)

    /**
     * Second lesson
     */
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));

        String[] str2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(str2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLen);
    }

}
