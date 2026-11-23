package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    List<T> list;
    int maxSize;
    public FixedList(int maxSize){
        this.maxSize = maxSize;
        list = new ArrayList<>(maxSize);
    }
    public void add(T item){
        if(list.size() < maxSize)
            list.add(item);

    }

    public List<T> getItems() {
        return list;
    }
}
