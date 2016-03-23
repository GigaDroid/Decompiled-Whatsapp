package com.google;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.v;
import org.whispersystems.at;

public final class eI extends AbstractMap implements Serializable {
    private static final Comparator a;
    static final boolean c;
    private static final String[] z;
    final hM b;
    private dm d;
    int e;
    int f;
    hM g;
    Comparator h;
    private eL i;

    public int size() {
        return this.e;
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            try {
                throw new NullPointerException(z[0]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        hM a = a(obj, true);
        Object obj3 = a.h;
        a.h = obj2;
        return obj3;
    }

    public eI(Comparator comparator) {
        this.e = 0;
        this.f = 0;
        this.b = new hM();
        if (comparator == null) {
            comparator = a;
        }
        this.h = comparator;
    }

    public Object get(Object obj) {
        hM a = a(obj);
        if (a == null) {
            return null;
        }
        try {
            return a.h;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Object remove(Object obj) {
        hM b = b(obj);
        if (b == null) {
            return null;
        }
        try {
            return b.h;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(com.google.hM r7, boolean r8) {
        /*
        r6 = this;
        r2 = 0;
        r5 = 0;
        r0 = com.google.ak.i;
        if (r8 == 0) goto L_0x0012;
    L_0x0006:
        r1 = r7.g;	 Catch:{ NullPointerException -> 0x004d }
        r3 = r7.c;	 Catch:{ NullPointerException -> 0x004d }
        r1.c = r3;	 Catch:{ NullPointerException -> 0x004d }
        r1 = r7.c;	 Catch:{ NullPointerException -> 0x004d }
        r3 = r7.g;	 Catch:{ NullPointerException -> 0x004d }
        r1.g = r3;	 Catch:{ NullPointerException -> 0x004d }
    L_0x0012:
        r1 = r7.b;
        r3 = r7.d;
        r4 = r7.a;
        if (r1 == 0) goto L_0x0056;
    L_0x001a:
        if (r3 == 0) goto L_0x0056;
    L_0x001c:
        r0 = r1.f;	 Catch:{ NullPointerException -> 0x004f }
        r4 = r3.f;	 Catch:{ NullPointerException -> 0x004f }
        if (r0 <= r4) goto L_0x0051;
    L_0x0022:
        r0 = r1.b();	 Catch:{ NullPointerException -> 0x004f }
    L_0x0026:
        r6.a(r0, r2);
        r3 = r7.b;
        if (r3 == 0) goto L_0x0084;
    L_0x002d:
        r1 = r3.f;
        r0.b = r3;
        r3.a = r0;
        r7.b = r5;
    L_0x0035:
        r3 = r7.d;
        if (r3 == 0) goto L_0x0041;
    L_0x0039:
        r2 = r3.f;
        r0.d = r3;
        r3.a = r0;
        r7.d = r5;
    L_0x0041:
        r1 = java.lang.Math.max(r1, r2);
        r1 = r1 + 1;
        r0.f = r1;
        r6.a(r7, r0);
    L_0x004c:
        return;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = r3.a();
        goto L_0x0026;
    L_0x0056:
        if (r1 == 0) goto L_0x0060;
    L_0x0058:
        r6.a(r7, r1);	 Catch:{ NullPointerException -> 0x007e }
        r1 = 0;
        r7.b = r1;	 Catch:{ NullPointerException -> 0x007e }
        if (r0 == 0) goto L_0x006e;
    L_0x0060:
        if (r3 == 0) goto L_0x006a;
    L_0x0062:
        r6.a(r7, r3);	 Catch:{ NullPointerException -> 0x0082 }
        r1 = 0;
        r7.d = r1;	 Catch:{ NullPointerException -> 0x0082 }
        if (r0 == 0) goto L_0x006e;
    L_0x006a:
        r0 = 0;
        r6.a(r7, r0);	 Catch:{ NullPointerException -> 0x0082 }
    L_0x006e:
        r6.b(r4, r2);
        r0 = r6.e;
        r0 = r0 + -1;
        r6.e = r0;
        r0 = r6.f;
        r0 = r0 + 1;
        r6.f = r0;
        goto L_0x004c;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r1 = r2;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eI.a(com.google.hM, boolean):void");
    }

    public eI() {
        this(a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.Object r2, java.lang.Object r3) {
        /*
        r1 = this;
        if (r2 == r3) goto L_0x000a;
    L_0x0002:
        if (r2 == 0) goto L_0x000e;
    L_0x0004:
        r0 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = 1;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = 0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eI.a(java.lang.Object, java.lang.Object):boolean");
    }

    private void b(hM hMVar) {
        int i = 0;
        hM hMVar2 = hMVar.b;
        hM hMVar3 = hMVar.d;
        hM hMVar4 = hMVar2.b;
        hM hMVar5 = hMVar2.d;
        try {
            hMVar.b = hMVar5;
            if (hMVar5 != null) {
                hMVar5.a = hMVar;
            }
            try {
                int i2;
                a(hMVar, hMVar2);
                hMVar2.d = hMVar;
                hMVar.a = hMVar2;
                int i3 = hMVar3 != null ? hMVar3.f : 0;
                if (hMVar5 != null) {
                    try {
                        i2 = hMVar5.f;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                i2 = 0;
                try {
                    hMVar.f = Math.max(i3, i2) + 1;
                    i2 = hMVar.f;
                    if (hMVar4 != null) {
                        i = hMVar4.f;
                    }
                    hMVar2.f = Math.max(i2, i) + 1;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public boolean containsKey(Object obj) {
        try {
            return a(obj) != null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    hM a(Object obj) {
        hM hMVar = null;
        if (obj != null) {
            try {
                hMVar = a(obj, false);
            } catch (ClassCastException e) {
                throw e;
            } catch (ClassCastException e2) {
            }
        }
        return hMVar;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    hM a(Entry entry) {
        Object obj;
        hM a = a(entry.getKey());
        if (a != null) {
            try {
                if (a(a.h, entry.getValue())) {
                    obj = 1;
                    return obj == null ? a : null;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public void clear() {
        this.g = null;
        this.e = 0;
        this.f++;
        hM hMVar = this.b;
        hMVar.g = hMVar;
        hMVar.c = hMVar;
    }

    public Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        set = new eL(this);
        this.i = set;
        return set;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.hM a(java.lang.Object r10, boolean r11) {
        /*
        r9 = this;
        r2 = 0;
        r8 = 1;
        r6 = com.google.ak.i;
        r7 = r9.h;
        r5 = r9.g;
        r3 = 0;
        if (r5 == 0) goto L_0x0035;
    L_0x000b:
        r1 = a;	 Catch:{ NullPointerException -> 0x001f }
        if (r7 != r1) goto L_0x0021;
    L_0x000f:
        r0 = r10;
        r0 = (java.lang.Comparable) r0;	 Catch:{ NullPointerException -> 0x001f }
        r1 = r0;
    L_0x0013:
        if (r1 == 0) goto L_0x0023;
    L_0x0015:
        r3 = r5.e;
        r3 = r1.compareTo(r3);
    L_0x001b:
        if (r3 != 0) goto L_0x002a;
    L_0x001d:
        r2 = r5;
    L_0x001e:
        return r2;
    L_0x001f:
        r1 = move-exception;
        throw r1;
    L_0x0021:
        r1 = r2;
        goto L_0x0013;
    L_0x0023:
        r3 = r5.e;
        r3 = r7.compare(r10, r3);
        goto L_0x001b;
    L_0x002a:
        if (r3 >= 0) goto L_0x006b;
    L_0x002c:
        r4 = r5.b;	 Catch:{ NullPointerException -> 0x0069 }
    L_0x002e:
        if (r4 != 0) goto L_0x0032;
    L_0x0030:
        if (r6 == 0) goto L_0x0035;
    L_0x0032:
        if (r6 == 0) goto L_0x009d;
    L_0x0034:
        r5 = r4;
    L_0x0035:
        if (r11 == 0) goto L_0x001e;
    L_0x0037:
        r2 = r9.b;
        if (r5 != 0) goto L_0x007b;
    L_0x003b:
        r1 = a;	 Catch:{ NullPointerException -> 0x006e }
        if (r7 != r1) goto L_0x0070;
    L_0x003f:
        r1 = r10 instanceof java.lang.Comparable;	 Catch:{ NullPointerException -> 0x0067 }
        if (r1 != 0) goto L_0x0070;
    L_0x0043:
        r1 = new java.lang.ClassCastException;	 Catch:{ NullPointerException -> 0x0067 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0067 }
        r2.<init>();	 Catch:{ NullPointerException -> 0x0067 }
        r3 = r10.getClass();	 Catch:{ NullPointerException -> 0x0067 }
        r3 = r3.getName();	 Catch:{ NullPointerException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x0067 }
        r3 = z;	 Catch:{ NullPointerException -> 0x0067 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x0067 }
        r2 = r2.toString();	 Catch:{ NullPointerException -> 0x0067 }
        r1.<init>(r2);	 Catch:{ NullPointerException -> 0x0067 }
        throw r1;	 Catch:{ NullPointerException -> 0x0067 }
    L_0x0067:
        r1 = move-exception;
        throw r1;
    L_0x0069:
        r1 = move-exception;
        throw r1;
    L_0x006b:
        r4 = r5.d;
        goto L_0x002e;
    L_0x006e:
        r1 = move-exception;
        throw r1;	 Catch:{ NullPointerException -> 0x0067 }
    L_0x0070:
        r1 = new com.google.hM;
        r4 = r2.g;
        r1.<init>(r5, r10, r2, r4);
        r9.g = r1;
        if (r6 == 0) goto L_0x008d;
    L_0x007b:
        r1 = new com.google.hM;
        r4 = r2.g;
        r1.<init>(r5, r10, r2, r4);
        if (r3 >= 0) goto L_0x0088;
    L_0x0084:
        r5.b = r1;	 Catch:{ NullPointerException -> 0x009b }
        if (r6 == 0) goto L_0x008a;
    L_0x0088:
        r5.d = r1;	 Catch:{ NullPointerException -> 0x009b }
    L_0x008a:
        r9.b(r5, r8);
    L_0x008d:
        r2 = r9.e;
        r2 = r2 + 1;
        r9.e = r2;
        r2 = r9.f;
        r2 = r2 + 1;
        r9.f = r2;
        r2 = r1;
        goto L_0x001e;
    L_0x009b:
        r1 = move-exception;
        throw r1;
    L_0x009d:
        r5 = r4;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eI.a(java.lang.Object, boolean):com.google.hM");
    }

    hM b(Object obj) {
        hM a = a(obj);
        if (a != null) {
            try {
                a(a, true);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return a;
    }

    public Set keySet() {
        Set set = this.d;
        if (set != null) {
            return set;
        }
        set = new dm(this);
        this.d = set;
        return set;
    }

    private void a(hM hMVar) {
        int i = 0;
        hM hMVar2 = hMVar.b;
        hM hMVar3 = hMVar.d;
        hM hMVar4 = hMVar3.b;
        hM hMVar5 = hMVar3.d;
        try {
            hMVar.d = hMVar4;
            if (hMVar4 != null) {
                hMVar4.a = hMVar;
            }
            try {
                int i2;
                a(hMVar, hMVar3);
                hMVar3.b = hMVar;
                hMVar.a = hMVar3;
                int i3 = hMVar2 != null ? hMVar2.f : 0;
                if (hMVar4 != null) {
                    try {
                        i2 = hMVar4.f;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                i2 = 0;
                try {
                    hMVar.f = Math.max(i3, i2) + 1;
                    i2 = hMVar.f;
                    if (hMVar5 != null) {
                        i = hMVar5.f;
                    }
                    hMVar3.f = Math.max(i2, i) + 1;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    private void a(hM hMVar, hM hMVar2) {
        boolean z = ak.i;
        hM hMVar3 = hMVar.a;
        try {
            hMVar.a = null;
            if (hMVar2 != null) {
                hMVar2.a = hMVar3;
            }
            if (hMVar3 != null) {
                try {
                    if (hMVar3.b == hMVar) {
                        hMVar3.b = hMVar2;
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        if (!c) {
                            try {
                                if (hMVar3.d != hMVar) {
                                    throw new AssertionError();
                                }
                            } catch (NullPointerException e) {
                                throw e;
                            }
                        }
                        try {
                            hMVar3.d = hMVar2;
                            if (!z) {
                                return;
                            }
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                } catch (NullPointerException e222) {
                    throw e222;
                } catch (NullPointerException e2222) {
                    throw e2222;
                }
            }
            this.g = hMVar2;
        } catch (NullPointerException e22222) {
            throw e22222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.google.hM r12, boolean r13) {
        /*
        r11 = this;
        r10 = 1;
        r9 = -1;
        r1 = 0;
        r5 = com.google.ak.i;
    L_0x0005:
        if (r12 == 0) goto L_0x00d4;
    L_0x0007:
        r6 = r12.b;
        r7 = r12.d;
        if (r6 == 0) goto L_0x0042;
    L_0x000d:
        r0 = r6.f;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x000f:
        if (r7 == 0) goto L_0x0046;
    L_0x0011:
        r2 = r7.f;	 Catch:{ NullPointerException -> 0x0044 }
        r4 = r2;
    L_0x0014:
        r8 = r0 - r4;
        r2 = -2;
        if (r8 != r2) goto L_0x0060;
    L_0x0019:
        r3 = r7.b;
        r2 = r7.d;
        if (r2 == 0) goto L_0x004a;
    L_0x001f:
        r2 = r2.f;	 Catch:{ NullPointerException -> 0x0048 }
    L_0x0021:
        if (r3 == 0) goto L_0x004e;
    L_0x0023:
        r3 = r3.f;	 Catch:{ NullPointerException -> 0x004c }
    L_0x0025:
        r2 = r3 - r2;
        if (r2 == r9) goto L_0x002d;
    L_0x0029:
        if (r2 != 0) goto L_0x0032;
    L_0x002b:
        if (r13 != 0) goto L_0x0032;
    L_0x002d:
        r11.a(r12);	 Catch:{ NullPointerException -> 0x0050 }
        if (r5 == 0) goto L_0x005a;
    L_0x0032:
        r3 = c;	 Catch:{ NullPointerException -> 0x0052 }
        if (r3 != 0) goto L_0x0054;
    L_0x0036:
        if (r2 == r10) goto L_0x0054;
    L_0x0038:
        r0 = new java.lang.AssertionError;	 Catch:{ NullPointerException -> 0x003e }
        r0.<init>();	 Catch:{ NullPointerException -> 0x003e }
        throw r0;	 Catch:{ NullPointerException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = r1;
        goto L_0x000f;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r4 = r1;
        goto L_0x0014;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r2 = r1;
        goto L_0x0021;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r3 = r1;
        goto L_0x0025;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003e }
    L_0x0054:
        r11.b(r7);
        r11.a(r12);
    L_0x005a:
        if (r13 == 0) goto L_0x005e;
    L_0x005c:
        if (r5 == 0) goto L_0x00d4;
    L_0x005e:
        if (r5 == 0) goto L_0x00d0;
    L_0x0060:
        r2 = 2;
        if (r8 != r2) goto L_0x00a2;
    L_0x0063:
        r3 = r6.b;
        r2 = r6.d;
        if (r2 == 0) goto L_0x008c;
    L_0x0069:
        r2 = r2.f;	 Catch:{ NullPointerException -> 0x008a }
    L_0x006b:
        if (r3 == 0) goto L_0x0090;
    L_0x006d:
        r3 = r3.f;	 Catch:{ NullPointerException -> 0x008e }
    L_0x006f:
        r2 = r3 - r2;
        if (r2 == r10) goto L_0x0077;
    L_0x0073:
        if (r2 != 0) goto L_0x007c;
    L_0x0075:
        if (r13 != 0) goto L_0x007c;
    L_0x0077:
        r11.b(r12);	 Catch:{ NullPointerException -> 0x0092 }
        if (r5 == 0) goto L_0x009c;
    L_0x007c:
        r3 = c;	 Catch:{ NullPointerException -> 0x0094 }
        if (r3 != 0) goto L_0x0096;
    L_0x0080:
        if (r2 == r9) goto L_0x0096;
    L_0x0082:
        r0 = new java.lang.AssertionError;	 Catch:{ NullPointerException -> 0x0088 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0088 }
        throw r0;	 Catch:{ NullPointerException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r2 = r1;
        goto L_0x006b;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r3 = r1;
        goto L_0x006f;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0088 }
    L_0x0096:
        r11.a(r6);
        r11.b(r12);
    L_0x009c:
        if (r13 == 0) goto L_0x00a0;
    L_0x009e:
        if (r5 == 0) goto L_0x00d4;
    L_0x00a0:
        if (r5 == 0) goto L_0x00d0;
    L_0x00a2:
        if (r8 != 0) goto L_0x00ac;
    L_0x00a4:
        r2 = r0 + 1;
        r12.f = r2;	 Catch:{ NullPointerException -> 0x00bc }
        if (r13 == 0) goto L_0x00d0;
    L_0x00aa:
        if (r5 == 0) goto L_0x00d4;
    L_0x00ac:
        r2 = c;	 Catch:{ NullPointerException -> 0x00c0 }
        if (r2 != 0) goto L_0x00c4;
    L_0x00b0:
        if (r8 == r9) goto L_0x00c4;
    L_0x00b2:
        if (r8 == r10) goto L_0x00c4;
    L_0x00b4:
        r0 = new java.lang.AssertionError;	 Catch:{ NullPointerException -> 0x00ba }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00ba }
        throw r0;	 Catch:{ NullPointerException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ba }
    L_0x00c4:
        r0 = java.lang.Math.max(r0, r4);	 Catch:{ NullPointerException -> 0x00d5 }
        r0 = r0 + 1;
        r12.f = r0;	 Catch:{ NullPointerException -> 0x00d5 }
        if (r13 != 0) goto L_0x00d0;
    L_0x00ce:
        if (r5 == 0) goto L_0x00d4;
    L_0x00d0:
        r12 = r12.a;
        if (r5 == 0) goto L_0x0005;
    L_0x00d4:
        return;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eI.b(com.google.hM, boolean):void");
    }

    static {
        int i;
        int i2;
        boolean z = true;
        String[] strArr = new String[2];
        char[] toCharArray = "o}0a\t98'4Xh".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 24;
                    break;
                case at.i /*2*/:
                    i2 = 73;
                    break;
                case at.o /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "$q:aZkli\u0002[ih(3Uft,".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 24;
                    break;
                case at.i /*2*/:
                    i2 = 73;
                    break;
                case at.o /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        try {
            if (eI.class.desiredAssertionStatus()) {
                z = false;
            }
            c = z;
            a = new ex();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
