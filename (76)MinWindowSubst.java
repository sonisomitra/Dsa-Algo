class Solution {
    public String minWindow(String s, String t) {
    HashMap<Character,Integer> hmap = new HashMap<>();
    for(char c : t.toCharArray()){
        hmap.put(c,hmap.getOrDefault(c,0)+1);
    }
    HashMap<Character,Integer> window = new HashMap<>();
    int left = 0;
    int right = 0;
    int formed = 0;
    int req = hmap.size();
    int minL = Integer.MAX_VALUE;
    int bestLeft = 0;
    while(right<s.length()){
        char c = s.charAt(right);
        window.put(c,window.getOrDefault(c,0)+1);
        if(hmap.containsKey(c) && window.get(c).intValue() == hmap.get(c).intValue()){
            formed++;
        }
        while(left <= right && formed == req){
            int currL = right - left + 1;
        if(currL<minL){
            minL=currL;
            bestLeft = left;
        }
        char leftChar = s.charAt(left);
        window.put(leftChar,window.get(leftChar) - 1);
        if(hmap.containsKey(leftChar) && window.get(leftChar) < hmap.get(leftChar)){
            formed--;
        }
        left++;
        }
        right++;
    }
    if(minL == Integer.MAX_VALUE){
        return "";
    }
    return s.substring(bestLeft , bestLeft + minL);
    }
}
