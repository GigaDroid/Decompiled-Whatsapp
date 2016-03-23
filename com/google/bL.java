package com.google;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.v;
import org.whispersystems.at;

public abstract class bL extends bA implements Serializable {
    protected static boolean d = false;
    private static final long serialVersionUID = 1;
    private static final String[] z;

    protected abstract bJ internalGetFieldAccessorTable();

    public boolean isInitialized() {
        boolean z = bA.b;
        for (e0 e0Var : getDescriptorForType().b()) {
            try {
                if (e0Var.n()) {
                    if (!b(e0Var)) {
                        return false;
                    }
                }
                try {
                    if (e0Var.h() == fD.MESSAGE) {
                        if (e0Var.c()) {
                            for (ci isInitialized : (List) a(e0Var)) {
                                try {
                                    if (isInitialized.isInitialized()) {
                                        if (z) {
                                            break;
                                        }
                                    }
                                    return false;
                                } catch (UnsupportedOperationException e) {
                                    throw e;
                                }
                            }
                            if (!z) {
                                continue;
                            }
                        }
                        try {
                            if (!b(e0Var)) {
                                continue;
                            } else if (!((ci) a(e0Var)).isInitialized()) {
                                return false;
                            }
                        } catch (UnsupportedOperationException e2) {
                            throw e2;
                        } catch (UnsupportedOperationException e22) {
                            throw e22;
                        }
                    }
                    if (z) {
                        break;
                    }
                } catch (UnsupportedOperationException e222) {
                    throw e222;
                }
            } catch (UnsupportedOperationException e2222) {
                throw e2222;
            } catch (UnsupportedOperationException e22222) {
                throw e22222;
            }
        }
        return true;
    }

    protected abstract fl newBuilderForType(ec ecVar);

    protected void b() {
    }

    static Object b(Method method, Object obj, Object[] objArr) {
        return a(method, obj, objArr);
    }

    public int a(e0 e0Var) {
        return bJ.a(internalGetFieldAccessorTable(), e0Var).a(this);
    }

    public fn getDescriptorForType() {
        return bJ.a(internalGetFieldAccessorTable());
    }

    public Object a(e0 e0Var, int i) {
        return bJ.a(internalGetFieldAccessorTable(), e0Var).a(this, i);
    }

    protected bL() {
    }

    static Method a(Class cls, String str, Class[] clsArr) {
        return b(cls, str, clsArr);
    }

    protected bL(cJ cJVar) {
    }

    private static Method b(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable e) {
            throw new RuntimeException(z[4] + cls.getName() + z[2] + str + z[3], e);
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[7];
        char[] toCharArray = "q}m\u001b'Ap|\u00063\u0004vp\u00002Tga\f9\u0004g`\u00118S}(\u0001.\u0004tm\r2Vr|\u00063\u0004rk\u00002W`g\u0011wIv|\u000b8@=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "g|}\u000f3J4|C\"Wv()6Rr(\u00112B\u007fm\u0000#M|fC#K3a\u000e'Hve\u00069P3x\u00118P|k\f;\u0004~m\u0010$EtmC%Aud\u00064Pzg\ry".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u00063e\n$Wzf\u0004wIv|\u000b8@3*".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0006=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "cvf\u0006%Egm\u0007wIv{\u00106Cv(\u0000;E`{Cu".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "p{a\u0010wM`(\u0010\"Tcg\u00102@3|\fwFv(\f!Aaz\n3@vfC5]3{\u00165G\u007fi\u0010$A`&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "p{a\u0010wM`(\u0010\"Tcg\u00102@3|\fwFv(\f!Aaz\n3@vfC5]3{\u00165G\u007fi\u0010$A`&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
        d = false;
    }

    static void a() {
        d = true;
    }

    protected Object writeReplace() {
        return new el(this);
    }

    static Map a(bL bLVar) {
        return bLVar.c();
    }

    public static gL a(ci ciVar, int i, Class cls, ci ciVar2) {
        return new gL(new er(ciVar, i), cls, ciVar2, null);
    }

    protected boolean a(ad adVar, c6 c6Var, h hVar, int i) {
        return c6Var.a(i, adVar);
    }

    public static gL a(Class cls, ci ciVar) {
        return new gL(null, cls, ciVar, null);
    }

    public Map m128a() {
        return Collections.unmodifiableMap(c());
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException(z[1], e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException(z[0], e2);
            }
        } catch (IllegalAccessException e4) {
            throw e4;
        } catch (IllegalAccessException e42) {
            throw e42;
        }
    }

    private Map c() {
        boolean z = bA.b;
        Map treeMap = new TreeMap();
        for (e0 e0Var : bJ.a(internalGetFieldAccessorTable()).b()) {
            if (e0Var.c()) {
                List list = (List) a(e0Var);
                try {
                    if (!list.isEmpty()) {
                        treeMap.put(e0Var, list);
                    }
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
            try {
                if (b(e0Var)) {
                    treeMap.put(e0Var, a(e0Var));
                    continue;
                } else {
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
        return treeMap;
    }

    public Object m127a(e0 e0Var) {
        return bJ.a(internalGetFieldAccessorTable(), e0Var).b(this);
    }

    public boolean b(e0 e0Var) {
        return bJ.a(internalGetFieldAccessorTable(), e0Var).c(this);
    }

    public eV getUnknownFields() {
        throw new UnsupportedOperationException(z[6]);
    }

    public T getParserForType() {
        throw new UnsupportedOperationException(z[5]);
    }
}
