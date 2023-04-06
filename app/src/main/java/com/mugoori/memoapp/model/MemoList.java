package com.mugoori.memoapp.model;

import java.io.Serializable;
import java.util.List;

public class MemoList implements Serializable {

    private String result;
    private List<Memo> items;
    private int Count;


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Memo> getItems() {
        return items;
    }

    public void setItems(List<Memo> items) {
        this.items = items;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}
