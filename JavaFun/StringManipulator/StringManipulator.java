public class StringManipulator{
    public String trimAndConcat(String s1, String s2){
        String res=s1.trim()+s2.trim();
        return res;
    }

    public Integer getIndexOrNull(String s1, char c1){
        if(s1.indexOf(c1)>=0){
            return s1.indexOf(c1);
        }else{
            return null;
        }
    }

    public Integer getIndexOrNull(String s1, String s2){
        if(s1.indexOf(s2)>=0){
            return s1.indexOf(s2);
        } else{
            return null;
        }
    }

    public String concatSubstring(String s1, int int1, int int2, String s2){
        return s1.substring(int1,int2).concat(s2);
    }
}