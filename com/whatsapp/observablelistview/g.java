package com.whatsapp.observablelistview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class g {
    private Set a;

    public void a(c cVar) {
        synchronized (this.a) {
            this.a.add(cVar);
        }
    }

    public void b() {
        int i = ObservableListView.j;
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            List list = null;
            for (c cVar : this.a) {
                if (cVar.a() || i != 0) {
                    if (list == null) {
                        list = new LinkedList();
                    }
                    list.add(cVar);
                    if (i != 0) {
                        break;
                    }
                }
            }
            List<c> list2 = list;
            if (list2 != null) {
                for (c cVar2 : list2) {
                    this.a.remove(cVar2);
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
    }

    public g() {
        this.a = new HashSet();
    }

    public void a() {
        int i = ObservableListView.j;
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            for (c b : this.a) {
                b.b();
                if (i != 0) {
                    break;
                }
            }
        }
    }
}
