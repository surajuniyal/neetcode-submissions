class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0)
        {
           return "!"; 
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strs)
        {
            if(s.equals("")){
                sb.append("₹");
            }
            sb.append(s);
            sb.append("€");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==1 && str.equals("!"))
        {
            return new ArrayList();
        }

        String[] arr = str.split("€");
        List<String> ls = new ArrayList<>();
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i].equals("₹"))
            {
                arr[i]="";
            }
            ls.add(arr[i]);
        }
        return ls;

    }
}
