class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
           
            sb.append(s.length());
             sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        int i=0;
        List<String> ans = new ArrayList<>();

        while(i<str.length()){
            int j = i;

            while(str.charAt(j)!='#')j++;

            int len = Integer.parseInt(str.substring(i,j));
            j++;

            ans.add(str.substring(j,j+len));
            i = j+len;
            
        }
        return ans;
    }
}
