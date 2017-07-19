package findSubsequenceInDict392 ;

import java.util.*;

public class Solution {
    public static void main (String[] args){
        Solution s1 = new Solution();
        Set<String> dict = new HashSet<String> ();
        String[] content = {"mace", "mapreduce","reduces", "mareduces"};

        for (String word: content){
            dict.add(word);
        }
        String t = "mapreducsces" ;
        System.out.println( s1.isSubsequence(dict, t) );

    }
    public String isSubsequence(Set<String> dict, String t) {
        ArrayDeque<String> q = new ArrayDeque<String>();
        q.add(t);
        while ( !q.isEmpty()){
            String popstr = q.pop() ;
            if(!dict.contains( popstr)){
                //doesn't contain popstr, then delete each char in order
                for(int i=0; i<popstr.length() ; i++){
                    q.add(popstr.substring(0,i) + popstr.substring(i+1)) ;//without character on i
                }
            }else{
                return popstr;
            }

        }

        return "";
    }

}