package com.google;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class bA extends bs implements ci {
    public static boolean b;
    private int c;

    protected static int a(dJ dJVar) {
        return dJVar.getNumber();
    }

    x a() {
        return c3.a((ci) this);
    }

    public int hashCode() {
        return (a(getDescriptorForType().hashCode() + 779, a()) * 29) + getUnknownFields().hashCode();
    }

    protected int a(int i, Map map) {
        boolean z = b;
        for (Entry entry : map.entrySet()) {
            e0 e0Var = (e0) entry.getKey();
            Object value = entry.getValue();
            int e = (i * 37) + e0Var.e();
            if (e0Var.g() != fS.ENUM) {
                e = (e * 53) + value.hashCode();
                if (!z) {
                    i = e;
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            int i2 = e;
            if (e0Var.c()) {
                i2 = (i2 * 53) + a((List) value);
                if (!z) {
                    i = i2;
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            i = (i2 * 53) + a((dJ) value);
            continue;
            if (z) {
                break;
            }
        }
        return i;
    }

    protected static int a(List list) {
        boolean z = b;
        int i = 1;
        for (dJ a : list) {
            int a2 = a(a) + (i * 31);
            if (z) {
                return a2;
            }
            i = a2;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        if (getDescriptorForType() != ciVar.getDescriptorForType()) {
            return false;
        }
        if (a().equals(ciVar.a()) && getUnknownFields().equals(ciVar.getUnknownFields())) {
            return true;
        }
        return false;
    }

    public void writeTo(eb ebVar) {
        boolean z = b;
        boolean i = getDescriptorForType().f().i();
        for (Entry entry : a().entrySet()) {
            dH dHVar = (e0) entry.getKey();
            Object value = entry.getValue();
            if (i && dHVar.m() && dHVar.g() == fS.MESSAGE && !dHVar.c()) {
                ebVar.b(dHVar.e(), (ci) value);
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            iI.a(dHVar, value, ebVar);
            continue;
            if (z) {
                break;
            }
        }
        eV unknownFields = getUnknownFields();
        if (i) {
            unknownFields.a(ebVar);
            if (!z) {
                return;
            }
        }
        unknownFields.writeTo(ebVar);
    }

    public final String toString() {
        return eS.a((eY) this);
    }

    public bA() {
        this.c = -1;
    }

    public boolean isInitialized() {
        boolean z = b;
        for (e0 e0Var : getDescriptorForType().b()) {
            if (!e0Var.n() || b(e0Var)) {
                if (z) {
                    break;
                }
            }
            return false;
        }
        for (Entry entry : a().entrySet()) {
            e0 e0Var2 = (e0) entry.getKey();
            if (e0Var2.h() == fD.MESSAGE) {
                if (e0Var2.c()) {
                    for (ci isInitialized : (List) entry.getValue()) {
                        if (isInitialized.isInitialized()) {
                            if (z) {
                                break;
                            }
                        }
                        return false;
                    }
                    if (!z) {
                        continue;
                    }
                }
                if (!((ci) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
            if (z) {
                break;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getSerializedSize() {
        /*
        r8 = this;
        r4 = b;
        r0 = r8.c;
        r1 = -1;
        if (r0 == r1) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = 0;
        r1 = r8.getDescriptorForType();
        r1 = r1.f();
        r5 = r1.i();
        r1 = r8.a();
        r1 = r1.entrySet();
        r6 = r1.iterator();
        r3 = r0;
    L_0x0022:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x007c;
    L_0x0028:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.e0) r1;
        r2 = r0.getValue();
        if (r5 == 0) goto L_0x005c;
    L_0x003a:
        r0 = r1.m();
        if (r0 == 0) goto L_0x005c;
    L_0x0040:
        r0 = r1.g();
        r7 = com.google.fS.MESSAGE;
        if (r0 != r7) goto L_0x005c;
    L_0x0048:
        r0 = r1.c();
        if (r0 != 0) goto L_0x005c;
    L_0x004e:
        r7 = r1.e();
        r0 = r2;
        r0 = (com.google.ci) r0;
        r0 = com.google.eb.d(r7, r0);
        r3 = r3 + r0;
        if (r4 == 0) goto L_0x007a;
    L_0x005c:
        r0 = com.google.iI.c(r1, r2);
        r0 = r0 + r3;
    L_0x0061:
        if (r4 == 0) goto L_0x0078;
    L_0x0063:
        r1 = r8.getUnknownFields();
        if (r5 == 0) goto L_0x0070;
    L_0x0069:
        r2 = r1.f();
        r0 = r0 + r2;
        if (r4 == 0) goto L_0x0075;
    L_0x0070:
        r1 = r1.getSerializedSize();
        r0 = r0 + r1;
    L_0x0075:
        r8.c = r0;
        goto L_0x0007;
    L_0x0078:
        r3 = r0;
        goto L_0x0022;
    L_0x007a:
        r0 = r3;
        goto L_0x0061;
    L_0x007c:
        r0 = r3;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bA.getSerializedSize():int");
    }
}
