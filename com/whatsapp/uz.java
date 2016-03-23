package com.whatsapp;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

public class uz extends Observable {
    public void b(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((c_) it.next()).a(str);
            if (z) {
                return;
            }
        }
    }

    public void c(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((c_) it.next()).b(str);
            if (z) {
                return;
            }
        }
    }

    public void a(String str, ArrayList arrayList) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((c_) it.next()).a(str, arrayList);
            if (z) {
                return;
            }
        }
    }

    public void a(String str, boolean z) {
        boolean z2 = DialogToastActivity.f;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((c_) it.next()).a(str, z);
            if (z2) {
                return;
            }
        }
    }

    public void a(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((c_) it.next()).c(str);
            if (z) {
                return;
            }
        }
    }
}
