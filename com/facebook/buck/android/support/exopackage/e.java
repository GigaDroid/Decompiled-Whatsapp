package com.facebook.buck.android.support.exopackage;

import android.annotation.TargetApi;
import com.whatsapp.arj;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class e {
    private static final String[] z;

    static {
        String[] strArr = new String[17];
        String str = "\u007fm#\u001b a";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u007f{+\u0003-a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u007fq#\u00076";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u007fo/\u000f6";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u007fo/\u000f6";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "tD%";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007f{+\u0003-a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u007fm#\u001b a";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u007fo/\u000f6";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u007fq#\u00076";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u007fy+\u0000\u0001wS\u001a\u00161z";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u007fq#\u00076";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "bJ>\u001f\t{X>";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "vN22)wF/\u00191a";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "vN22)wF/\u00191a";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "vJ&\u0001,y\u00059\u000e6fN'Y\u0007sX/3 jh&\u00166ag%\u0016!wY";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007fm#\u001b a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private boolean a() {
        try {
            Class.forName(z[16]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private void a(DexClassLoader dexClassLoader, PathClassLoader pathClassLoader) {
        a(a((BaseDexClassLoader) pathClassLoader), b(a(a((BaseDexClassLoader) pathClassLoader)), a(a((BaseDexClassLoader) dexClassLoader))));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(dalvik.system.DexClassLoader r3, dalvik.system.PathClassLoader r4) {
        /*
        r2 = this;
        r0 = r2.a();	 Catch:{ NoSuchFieldException -> 0x0011, IllegalAccessException -> 0x001c }
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r2.a(r3, r4);	 Catch:{ NoSuchFieldException -> 0x0011, IllegalAccessException -> 0x001c }
        r0 = com.facebook.buck.android.support.exopackage.d.d;	 Catch:{ NoSuchFieldException -> 0x0011, IllegalAccessException -> 0x001c }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r2.c(r3, r4);	 Catch:{ NoSuchFieldException -> 0x0013, IllegalAccessException -> 0x001c }
    L_0x0010:
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldException -> 0x0013, IllegalAccessException -> 0x001c }
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldException -> 0x0015, IllegalAccessException -> 0x001c }
    L_0x0015:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x001c:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.buck.android.support.exopackage.e.b(dalvik.system.DexClassLoader, dalvik.system.PathClassLoader):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object c(java.lang.Object r7, java.lang.Object r8) {
        /*
        r6 = this;
        r1 = com.facebook.buck.android.support.exopackage.d.d;
        r0 = r7.getClass();
        r0 = r0.getComponentType();
        r2 = java.lang.reflect.Array.getLength(r7);
        r3 = r2 + 1;
        r4 = java.lang.reflect.Array.newInstance(r0, r3);
        r0 = 0;
    L_0x0015:
        if (r0 >= r3) goto L_0x0029;
    L_0x0017:
        if (r0 >= r2) goto L_0x0022;
    L_0x0019:
        r5 = java.lang.reflect.Array.get(r7, r0);	 Catch:{ RuntimeException -> 0x002a }
        java.lang.reflect.Array.set(r4, r0, r5);	 Catch:{ RuntimeException -> 0x002a }
        if (r1 == 0) goto L_0x0025;
    L_0x0022:
        java.lang.reflect.Array.set(r4, r0, r8);	 Catch:{ RuntimeException -> 0x002a }
    L_0x0025:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0029:
        return r4;
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.buck.android.support.exopackage.e.c(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private Object a(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private void a(Object obj, Class cls, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    private Object a(Object obj) {
        return a(obj, obj.getClass(), z[15]);
    }

    private void a(Object obj, Object obj2) {
        a(obj, obj.getClass(), z[14], obj2);
    }

    private e() {
    }

    @TargetApi(14)
    private Object a(BaseDexClassLoader baseDexClassLoader) {
        return a((Object) baseDexClassLoader, BaseDexClassLoader.class, z[13]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.ClassLoader r7, java.io.File r8, java.util.List r9) {
        /*
        r1 = com.facebook.buck.android.support.exopackage.d.d;
        r2 = new com.facebook.buck.android.support.exopackage.e;
        r2.<init>();
        r3 = r9.iterator();
    L_0x000b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x002d;
    L_0x0011:
        r0 = r3.next();
        r0 = (java.io.File) r0;
        r4 = new dalvik.system.DexClassLoader;
        r0 = r0.getAbsolutePath();
        r5 = r8.getAbsolutePath();
        r6 = 0;
        r4.<init>(r0, r5, r6, r7);
        r0 = r7;
        r0 = (dalvik.system.PathClassLoader) r0;
        r2.b(r4, r0);
        if (r1 == 0) goto L_0x000b;
    L_0x002d:
        r0 = com.facebook.buck.android.support.exopackage.c.a;	 Catch:{ RuntimeException -> 0x0037 }
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        if (r1 == 0) goto L_0x003b;
    L_0x0033:
        r0 = 0;
    L_0x0034:
        com.facebook.buck.android.support.exopackage.d.d = r0;
    L_0x0036:
        return;
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = 1;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.buck.android.support.exopackage.e.a(java.lang.ClassLoader, java.io.File, java.util.List):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object b(java.lang.Object r7, java.lang.Object r8) {
        /*
        r6 = this;
        r1 = com.facebook.buck.android.support.exopackage.d.d;
        r0 = r7.getClass();
        r0 = r0.getComponentType();
        r2 = java.lang.reflect.Array.getLength(r7);
        r3 = java.lang.reflect.Array.getLength(r8);
        r3 = r3 + r2;
        r4 = java.lang.reflect.Array.newInstance(r0, r3);
        r0 = 0;
    L_0x0018:
        if (r0 >= r3) goto L_0x0032;
    L_0x001a:
        if (r0 >= r2) goto L_0x0025;
    L_0x001c:
        r5 = java.lang.reflect.Array.get(r7, r0);	 Catch:{ RuntimeException -> 0x0033 }
        java.lang.reflect.Array.set(r4, r0, r5);	 Catch:{ RuntimeException -> 0x0033 }
        if (r1 == 0) goto L_0x002e;
    L_0x0025:
        r5 = r0 - r2;
        r5 = java.lang.reflect.Array.get(r8, r5);	 Catch:{ RuntimeException -> 0x0033 }
        java.lang.reflect.Array.set(r4, r0, r5);	 Catch:{ RuntimeException -> 0x0033 }
    L_0x002e:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0018;
    L_0x0032:
        return r4;
    L_0x0033:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.buck.android.support.exopackage.e.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private void c(DexClassLoader dexClassLoader, PathClassLoader pathClassLoader) {
        try {
            dexClassLoader.loadClass(z[6]);
        } catch (ClassNotFoundException e) {
        }
        a(pathClassLoader, PathClassLoader.class, z[2], c(a((Object) pathClassLoader, PathClassLoader.class, z[7]), a((Object) dexClassLoader, DexClassLoader.class, z[11])));
        a(pathClassLoader, PathClassLoader.class, z[0], b(a((Object) pathClassLoader, PathClassLoader.class, z[1]), a((Object) dexClassLoader, DexClassLoader.class, z[8])));
        a(pathClassLoader, PathClassLoader.class, z[10], b(a((Object) pathClassLoader, PathClassLoader.class, z[12]), a((Object) dexClassLoader, DexClassLoader.class, z[3])));
        a(pathClassLoader, PathClassLoader.class, z[5], b(a((Object) pathClassLoader, PathClassLoader.class, z[4]), a((Object) dexClassLoader, DexClassLoader.class, z[9])));
    }
}
