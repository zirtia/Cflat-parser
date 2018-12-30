package com.zirtia.entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConstantTable implements Iterable<ConstantEntry> {
    protected Map<String, ConstantEntry> table;

    public ConstantTable() {
        table = new LinkedHashMap<String, ConstantEntry>();
    }

    public boolean isEmpty() {
        return table.isEmpty();
    }

    public ConstantEntry intern(String s) {
        ConstantEntry ent = table.get(s);
        if (ent == null) {
            ent = new ConstantEntry(s);
            table.put(s, ent);
        }
        return ent;
    }

    public Collection<ConstantEntry> entries() {
        return table.values();
    }

    public Iterator<ConstantEntry> iterator() {
        return table.values().iterator();
    }
}
