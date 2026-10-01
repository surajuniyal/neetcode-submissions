class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs)
        {
            sb.append(s.length()+"#"+s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str.length()== 0)
            {
                return result;
            }
        int i = 0 ;
        while(i<str.length())
        {
            int indexOfhash = str.indexOf('#',i);
            
            int length = Integer.parseInt(str.substring(i,indexOfhash));

            i = indexOfhash + 1;

            result.add(str.substring(i,i+length));

            i = i+length;
        }
        return result;
    }
}
