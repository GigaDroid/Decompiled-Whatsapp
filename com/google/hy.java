package com.google;

import java.math.BigInteger;

public final class hy extends hH {
    private static final Class[] b;
    private Object c;

    public String i() {
        if (j()) {
            return a().toString();
        }
        return d() ? h().toString() : (String) this.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b(java.lang.Object r5) {
        /*
        r4 = this;
        r2 = 1;
        r1 = 0;
        r3 = com.google.hH.a;
        r0 = r5 instanceof java.lang.Character;
        if (r0 == 0) goto L_0x0017;
    L_0x0008:
        r0 = r5;
        r0 = (java.lang.Character) r0;
        r0 = r0.charValue();
        r0 = java.lang.String.valueOf(r0);
        r4.c = r0;
        if (r3 == 0) goto L_0x0027;
    L_0x0017:
        r0 = r5 instanceof java.lang.Number;
        if (r0 != 0) goto L_0x0021;
    L_0x001b:
        r0 = a(r5);
        if (r0 == 0) goto L_0x0030;
    L_0x0021:
        r0 = r2;
    L_0x0022:
        com.google.ba.a(r0);
        r4.c = r5;
    L_0x0027:
        r0 = com.google.aX.a;
        if (r0 == 0) goto L_0x002f;
    L_0x002b:
        if (r3 == 0) goto L_0x0032;
    L_0x002d:
        com.google.hH.a = r1;
    L_0x002f:
        return;
    L_0x0030:
        r0 = r1;
        goto L_0x0022;
    L_0x0032:
        r1 = r2;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.hy.b(java.lang.Object):void");
    }

    public boolean j() {
        return this.c instanceof Number;
    }

    public int hashCode() {
        if (this.c == null) {
            return 31;
        }
        long longValue;
        if (a(this)) {
            longValue = a().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        } else if (!(this.c instanceof Number)) {
            return this.c.hashCode();
        } else {
            longValue = Double.doubleToLongBits(a().doubleValue());
            return (int) (longValue ^ (longValue >>> 32));
        }
    }

    public boolean g() {
        return d() ? h().booleanValue() : Boolean.parseBoolean(i());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hy hyVar = (hy) obj;
        if (this.c == null) {
            if (hyVar.c != null) {
                return false;
            }
            return true;
        } else if (a(this) && a(hyVar)) {
            if (a().longValue() != hyVar.a().longValue()) {
                return false;
            }
            return true;
        } else if (!(this.c instanceof Number) || !(hyVar.c instanceof Number)) {
            return this.c.equals(hyVar.c);
        } else {
            double doubleValue = a().doubleValue();
            double doubleValue2 = hyVar.a().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                z = true;
            }
            return z;
        }
    }

    public Number a() {
        return this.c instanceof String ? new w((String) this.c) : (Number) this.c;
    }

    static {
        b = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    }

    public hy(Number number) {
        b(number);
    }

    private static boolean a(Object obj) {
        boolean z = hH.a;
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        Class[] clsArr = b;
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            if (!clsArr[i].isAssignableFrom(cls)) {
                i++;
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    Boolean h() {
        return (Boolean) this.c;
    }

    public hy(String str) {
        b(str);
    }

    public boolean d() {
        return this.c instanceof Boolean;
    }

    private static boolean a(hy hyVar) {
        if (!(hyVar.c instanceof Number)) {
            return false;
        }
        Number number = (Number) hyVar.c;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
