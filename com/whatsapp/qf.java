package com.whatsapp;

import java.util.Iterator;
import java.util.LinkedList;

public class qf {
    private LinkedList a;
    private int b;

    public void a() {
        synchronized (this) {
            this.a.clear();
            this.b = 0;
        }
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                this.a.addFirst(bArr);
            }
        }
    }

    public qf() {
        this.b = 0;
        this.a = new LinkedList();
    }

    public byte[] a(int i) {
        byte[] bArr;
        boolean z = DialogToastActivity.f;
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                bArr = (byte[]) it.next();
                if (bArr.length < i) {
                    if (z) {
                        break;
                    }
                }
                it.remove();
                break;
            }
            this.b += i;
            bArr = new byte[i];
        }
        return bArr;
    }
}
