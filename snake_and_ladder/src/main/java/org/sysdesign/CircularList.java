package org.sysdesign;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class CircularList<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private ListIterator<E> it;

    public CircularList(Collection<E> items) {
        list.addAll(items);
        it = list.listIterator();
    }

    public E current() {
        if (list.isEmpty()) return null;
        if (!it.hasNext()) it = list.listIterator(); // wrap
        return it.next();
    }

    public void removeCurrent() {
        it.remove(); // removes last returned element
        if (list.isEmpty()) return;

        // ensure iterator stays valid
        if (!it.hasNext()) it = list.listIterator();
    }

    public int size() {
        return list.size();
    }

    public LinkedList<E> getList() {
        return list;
    }
}
