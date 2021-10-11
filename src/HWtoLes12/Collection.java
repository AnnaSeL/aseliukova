package HWtoLes12;

import java.util.Arrays;
import java.util.LinkedList;

public class Collection implements CustomCollection{
    LinkedList<String> collection = new LinkedList<>();

    @Override
    public boolean add(String str) {
        collection.add(str);
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        collection.addAll(Arrays.asList(strArr));
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        LinkedList<String> collection2 = new LinkedList<>();
        for (int i = 0; i < strColl.size(); i++) {
            collection2.add(strColl.get(i));
        }
        collection.addAll(collection2);
        return true;
    }

    @Override
    public boolean delete(int index) {
        if(index >= 0 && index < collection.size()){
        collection.remove(index);
        return true;
        }
        return false;
    }

    @Override
    public boolean delete(String str) {
        for (int i = 0; i < collection.size(); i++) {
            if (str == collection.get(i)) {
                collection.remove(str);
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        return collection.get(index);
    }

    @Override
    public boolean contains(String str) {
        if(collection.contains(str)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean clear() {
        collection.clear();
        return true;
    }

    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public boolean equals(Collection coll) {
        if(coll.size() == collection.size()) {
            for (int i = 0; i < coll.size(); i++) {
                if (collection.get(i) != coll.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
