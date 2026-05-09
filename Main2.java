import java.util.HashMap;
import java.util.Map;
class Main2 {
    public static HashMap<Character,Integer> counter(String a){
         HashMap<Character,Integer> map1=new HashMap<>();
        for(Character x:a.toCharArray()){
            if(map1.containsKey(x))
                map1.put(x,map1.get(x)+1);
            else
                map1.put(x,1);
        }
        return(map1);
    }
    public boolean isAnagram(String s,String t){
        
        HashMap<Character,Integer> map1=counter(s),map2=counter(t);
        return(map1.equals(map2));
        
    }
}
