package com.whatsapp;

import android.database.Observable;
import android.support.annotation.Nullable;
import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class cn extends Observable {
    public void a(co coVar, int i) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).b(coVar, i);
            if (z) {
                return;
            }
        }
    }

    public void a(Collection collection, Map map) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a(collection, map);
            if (z) {
                return;
            }
        }
    }

    public void b(co coVar, int i) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a(coVar, i);
            if (z) {
                return;
            }
        }
    }

    cn(aa aaVar) {
        this();
    }

    public void a(String str) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a(str);
            if (z) {
                return;
            }
        }
    }

    public void b(co coVar) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a(coVar);
            if (z) {
                return;
            }
        }
    }

    public void a(co coVar, boolean z) {
        boolean z2 = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a(coVar, z);
            if (z2) {
                return;
            }
        }
    }

    public void a(co coVar) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).c(coVar);
            if (z) {
                return;
            }
        }
    }

    public void a() {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a();
            if (z) {
                return;
            }
        }
    }

    public void a(Collection collection, @Nullable String str, Map map, boolean z) {
        boolean z2 = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).a(collection, str, map, z);
            if (z2) {
                return;
            }
        }
    }

    private cn() {
    }

    public void c(co coVar) {
        boolean z = l5.s;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((akc) it.next()).b(coVar);
            if (z) {
                return;
            }
        }
    }
}
