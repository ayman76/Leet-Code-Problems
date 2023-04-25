public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            // System.out.println(prefix + " =>"  + strs[i].indexOf(prefix) +"=>"  + strs[i] );
            while(strs[i].indexOf(prefix) != 0){
                // System.out.println(prefix + " =>"  + strs[i].indexOf(prefix) +"=>"  + strs[i] );
                prefix = prefix.substring(0, prefix.length() -1);
            }
            // System.out.println(prefix);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String [] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    
}
