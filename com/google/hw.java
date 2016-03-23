package com.google;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class hw implements Externalizable {
    private static final long serialVersionUID = 1;
    private List a;

    public static hk d() {
        return new hk();
    }

    public void writeExternal(ObjectOutput objectOutput) {
        int i = e2.F;
        int c = c();
        objectOutput.writeInt(c);
        int i2 = 0;
        while (i2 < c) {
            ((ho) this.a.get(i2)).writeExternal(objectOutput);
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public hw() {
        this.a = new ArrayList();
    }

    public void readExternal(ObjectInput objectInput) {
        int i = e2.F;
        int readInt = objectInput.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            ho hoVar = new ho();
            hoVar.readExternal(objectInput);
            this.a.add(hoVar);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public hw b() {
        this.a.clear();
        return this;
    }

    public List a() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public hw a(ho hoVar) {
        if (hoVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.a.add(hoVar);
        return this;
    }
}
