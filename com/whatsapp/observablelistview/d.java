package com.whatsapp.observablelistview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class d {
    private Set a;

    public void a() {
        int i = ObservableListView.j;
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            List list = null;
            for (b bVar : this.a) {
                if (bVar.a() || i != 0) {
                    if (list == null) {
                        list = new LinkedList();
                    }
                    list.add(bVar);
                    if (i != 0) {
                        break;
                    }
                }
            }
            List<b> list2 = list;
            if (list2 != null) {
                for (b bVar2 : list2) {
                    this.a.remove(bVar2);
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
    }

    public d() {
        this.a = new HashSet();
    }

    public void a(b bVar) {
        synchronized (this.a) {
            this.a.add(bVar);
        }
    }
}
