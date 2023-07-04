import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    Map <String,String> dict= new TreeMap<String,String>();

    public void themTu(String key, String value){
        dict.put(key,value);
        // them cap key - value vao dict
    }

    public void xoaTu(String key){
        dict.remove(key);
        // xoa di cap key - value 
    }

    public String traTu(String key){
        return dict.get(key);
        // tra ve value tuong ung voi key
    }

    public void in(){
        Set<String> keyset= this.dict.keySet();
        // keySet(): lay ra toan bo tu khoa, cho vao set
        for (String string : keyset) {
            System.out.println(string+":  "+dict.get(string));
        }
    }

    public int soLuongTu(){
        return this.dict.size();
    }

    public void xoaTatCa(){
        this.dict.clear();
    }

}
