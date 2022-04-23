import java.util.List;
import java.util.Map;


public class jsonObject {

    List<Map<Map, List<Map>>> list;
    Map<Map, List> listMap;

    public List<Map<Map, List<Map>>> getList() {
        return list;
    }

    public void setList(List<Map<Map, List<Map>>> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "jsonObject{" +
                "list=" + list +
                ", listMap=" + listMap +
                '}';
    }

    public Map<Map, List> getListMap() {
        return listMap;
    }

    public void setListMap(Map<Map, List> listMap) {
        this.listMap = listMap;
    }
}
