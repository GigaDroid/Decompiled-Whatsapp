package com.google;

import com.whatsapp.arj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aJ extends a3 {
    private static final int[] h;
    private static final int[][] j;
    private static final int[] l;
    private static final int[] n;
    private static final int[][] p;
    public static boolean q;
    private static final int[][] r;
    private final List i;
    private boolean k;
    private final List m;
    private final int[] o;

    static f6 b(List list) {
        boolean z = q;
        String c = dt.a(hC.a(list)).c();
        fI[] a = ((dA) list.get(0)).b().a();
        fI[] a2 = ((dA) list.get(list.size() - 1)).b().a();
        f6 f6Var = new f6(c, null, new fI[]{a[0], a[1], a2[0], a2[1]}, gg.RSS_EXPANDED);
        if (aK.a) {
            q = !z;
        }
        return f6Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.e4 a(com.google.d_ r8, int r9, boolean r10) {
        /*
        r7 = this;
        r6 = 1;
        r5 = 0;
        r1 = q;
        if (r10 == 0) goto L_0x0025;
    L_0x0006:
        r0 = r7.o;
        r0 = r0[r5];
        r0 = r0 + -1;
    L_0x000c:
        if (r0 < 0) goto L_0x0018;
    L_0x000e:
        r2 = r8.f(r0);	 Catch:{ aN -> 0x0059 }
        if (r2 != 0) goto L_0x0018;
    L_0x0014:
        r0 = r0 + -1;
        if (r1 == 0) goto L_0x000c;
    L_0x0018:
        r3 = r0 + 1;
        r0 = r7.o;
        r0 = r0[r5];
        r0 = r0 - r3;
        r2 = r7.o;
        r4 = r2[r6];
        if (r1 == 0) goto L_0x0039;
    L_0x0025:
        r0 = r7.o;
        r3 = r0[r5];
        r0 = r7.o;
        r0 = r0[r6];
        r0 = r0 + 1;
        r4 = r8.d(r0);
        r0 = r7.o;
        r0 = r0[r6];
        r0 = r4 - r0;
    L_0x0039:
        r1 = r7.d();
        r2 = r1.length;
        r2 = r2 + -1;
        java.lang.System.arraycopy(r1, r5, r1, r6, r2);
        r1[r5] = r0;
        r0 = j;	 Catch:{ aN -> 0x005b }
        r1 = com.google.a3.a(r1, r0);	 Catch:{ aN -> 0x005b }
        r0 = new com.google.e4;
        r2 = 2;
        r2 = new int[r2];
        r2[r5] = r3;
        r2[r6] = r4;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
    L_0x0058:
        return r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        r0 = 0;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aJ.a(com.google.d_, int, boolean):com.google.e4");
    }

    public void m103a() {
        this.i.clear();
        this.m.clear();
    }

    private void a(int i, boolean z) {
        boolean z2 = q;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (i2 < this.m.size()) {
            bK bKVar = (bK) this.m.get(i2);
            if (bKVar.b() > i) {
                z3 = bKVar.a(this.i);
                if (!z2) {
                    break;
                }
            }
            boolean a = bKVar.a(this.i);
            int i3 = i2 + 1;
            if (z2) {
                i2 = i3;
                z4 = a;
                break;
            }
            i2 = i3;
            z4 = a;
        }
        if (!z3 && !r2 && !a(this.i, this.m)) {
            this.m.add(i2, new bK(this.i, i, z));
            a(this.i, this.m);
        }
    }

    private void a(int i) {
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        Object obj4;
        Object obj5;
        int i3;
        int i4;
        Object obj6;
        Object obj7 = null;
        Object obj8 = 1;
        boolean z = q;
        int a = a(c());
        int a2 = a(f());
        int i5 = (a + a2) - i;
        if ((a & 1) == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        if ((a2 & 1) == 0) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (a <= 13) {
            obj3 = null;
        } else if (z) {
            obj3 = 1;
        } else {
            i2 = 1;
            obj4 = null;
            if (a2 > 13) {
                obj5 = null;
            } else if (z) {
                i3 = 1;
                if (i5 == 1) {
                    if (obj == null) {
                        obj5 = obj3;
                    } else if (obj2 == null) {
                        throw aN.a();
                    } else if (z) {
                        obj3 = obj4;
                        obj8 = obj7;
                        i4 = 1;
                        if (obj3 != null) {
                            if (obj7 == null) {
                                throw aN.a();
                            }
                            a3.b(c(), a());
                        }
                        if (obj7 != null) {
                            a3.a(c(), a());
                        }
                        if (obj8 != null) {
                            if (obj5 == null) {
                                throw aN.a();
                            }
                            a3.b(f(), a());
                        }
                        if (obj5 == null) {
                            a3.a(f(), e());
                        }
                    } else {
                        obj5 = 1;
                    }
                    if (obj2 != null) {
                        throw aN.a();
                    } else if (z) {
                        obj3 = obj4;
                        obj6 = obj7;
                        obj7 = obj5;
                        i3 = 1;
                        obj8 = obj6;
                        if (obj3 != null) {
                            if (obj7 == null) {
                                a3.b(c(), a());
                            } else {
                                throw aN.a();
                            }
                        }
                        if (obj7 != null) {
                            a3.a(c(), a());
                        }
                        if (obj8 != null) {
                            if (obj5 == null) {
                                a3.b(f(), a());
                            } else {
                                throw aN.a();
                            }
                        }
                        if (obj5 == null) {
                            a3.a(f(), e());
                        }
                    } else {
                        obj3 = obj5;
                        obj5 = 1;
                    }
                }
                if (i5 == -1) {
                    if (obj == null) {
                        obj7 = obj4;
                    } else if (obj2 == null) {
                        throw aN.a();
                    } else if (z) {
                        obj6 = obj7;
                        obj7 = obj3;
                        i2 = 1;
                        obj8 = obj6;
                        if (obj3 != null) {
                            if (obj7 == null) {
                                throw aN.a();
                            }
                            a3.b(c(), a());
                        }
                        if (obj7 != null) {
                            a3.a(c(), a());
                        }
                        if (obj8 != null) {
                            if (obj5 == null) {
                                throw aN.a();
                            }
                            a3.b(f(), a());
                        }
                        if (obj5 == null) {
                            a3.a(f(), e());
                        }
                    } else {
                        obj7 = 1;
                    }
                    if (obj2 != null) {
                        throw aN.a();
                    } else if (z) {
                        obj6 = obj3;
                        obj3 = obj7;
                        obj7 = obj6;
                        if (obj3 != null) {
                            if (obj7 == null) {
                                a3.b(c(), a());
                            } else {
                                throw aN.a();
                            }
                        }
                        if (obj7 != null) {
                            a3.a(c(), a());
                        }
                        if (obj8 != null) {
                            if (obj5 == null) {
                                a3.b(f(), a());
                            } else {
                                throw aN.a();
                            }
                        }
                        if (obj5 == null) {
                            a3.a(f(), e());
                        }
                    } else {
                        obj4 = obj7;
                        obj7 = 1;
                    }
                }
                if (i5 != 0) {
                    if (obj == null) {
                        obj8 = obj7;
                        obj7 = obj3;
                        obj3 = obj4;
                    } else if (obj2 != null) {
                        throw aN.a();
                    } else {
                        if (a >= a2) {
                            obj7 = obj4;
                        } else if (z) {
                            i3 = 1;
                            obj6 = obj7;
                            obj7 = obj3;
                            i2 = 1;
                            obj8 = obj6;
                            if (obj3 != null) {
                                if (obj7 == null) {
                                    throw aN.a();
                                }
                                a3.b(c(), a());
                            }
                            if (obj7 != null) {
                                a3.a(c(), a());
                            }
                            if (obj8 != null) {
                                if (obj5 == null) {
                                    throw aN.a();
                                }
                                a3.b(f(), a());
                            }
                            if (obj5 == null) {
                                a3.a(f(), e());
                            }
                        } else {
                            obj5 = 1;
                            obj7 = 1;
                        }
                        if (z) {
                            obj3 = obj7;
                            obj7 = 1;
                            if (obj3 != null) {
                                if (obj7 == null) {
                                    a3.b(c(), a());
                                } else {
                                    throw aN.a();
                                }
                            }
                            if (obj7 != null) {
                                a3.a(c(), a());
                            }
                            if (obj8 != null) {
                                if (obj5 == null) {
                                    a3.b(f(), a());
                                } else {
                                    throw aN.a();
                                }
                            }
                            if (obj5 == null) {
                                a3.a(f(), e());
                            }
                        }
                        obj3 = obj7;
                        obj7 = 1;
                    }
                    if (obj2 != null) {
                        throw aN.a();
                    }
                    if (obj3 != null) {
                        if (obj7 == null) {
                            throw aN.a();
                        }
                        a3.b(c(), a());
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            throw aN.a();
                        }
                        a3.b(f(), a());
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                }
                throw aN.a();
            } else {
                obj5 = 1;
            }
            if (a2 < 4) {
                obj7 = 1;
            }
            if (i5 == 1) {
                if (obj == null) {
                    obj5 = obj3;
                } else if (obj2 == null) {
                    throw aN.a();
                } else if (z) {
                    obj3 = obj4;
                    obj8 = obj7;
                    i4 = 1;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            a3.b(c(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            a3.b(f(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                } else {
                    obj5 = 1;
                }
                if (obj2 != null) {
                    throw aN.a();
                } else if (z) {
                    obj3 = obj4;
                    obj6 = obj7;
                    obj7 = obj5;
                    i3 = 1;
                    obj8 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            throw aN.a();
                        }
                        a3.b(c(), a());
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            throw aN.a();
                        }
                        a3.b(f(), a());
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                } else {
                    obj3 = obj5;
                    obj5 = 1;
                }
            }
            if (i5 == -1) {
                if (obj == null) {
                    obj7 = obj4;
                } else if (obj2 == null) {
                    throw aN.a();
                } else if (z) {
                    obj6 = obj7;
                    obj7 = obj3;
                    i2 = 1;
                    obj8 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            a3.b(c(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            a3.b(f(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                } else {
                    obj7 = 1;
                }
                if (obj2 != null) {
                    throw aN.a();
                } else if (z) {
                    obj6 = obj3;
                    obj3 = obj7;
                    obj7 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            throw aN.a();
                        }
                        a3.b(c(), a());
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            throw aN.a();
                        }
                        a3.b(f(), a());
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                } else {
                    obj4 = obj7;
                    obj7 = 1;
                }
            }
            if (i5 != 0) {
                throw aN.a();
            }
            if (obj == null) {
                obj8 = obj7;
                obj7 = obj3;
                obj3 = obj4;
            } else if (obj2 != null) {
                if (a >= a2) {
                    obj7 = obj4;
                } else if (z) {
                    i3 = 1;
                    obj6 = obj7;
                    obj7 = obj3;
                    i2 = 1;
                    obj8 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            a3.b(c(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            a3.b(f(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                } else {
                    obj5 = 1;
                    obj7 = 1;
                }
                if (z) {
                    obj3 = obj7;
                    obj7 = 1;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            throw aN.a();
                        }
                        a3.b(c(), a());
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            throw aN.a();
                        }
                        a3.b(f(), a());
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                }
                obj3 = obj7;
                obj7 = 1;
            } else {
                throw aN.a();
            }
            if (obj2 != null) {
                throw aN.a();
            }
            if (obj3 != null) {
                if (obj7 == null) {
                    a3.b(c(), a());
                } else {
                    throw aN.a();
                }
            }
            if (obj7 != null) {
                a3.a(c(), a());
            }
            if (obj8 != null) {
                if (obj5 == null) {
                    a3.b(f(), a());
                } else {
                    throw aN.a();
                }
            }
            if (obj5 == null) {
                a3.a(f(), e());
            }
        }
        obj4 = a < 4 ? 1 : null;
        if (a2 > 13) {
            obj5 = null;
        } else if (z) {
            i3 = 1;
            if (i5 == 1) {
                if (obj == null) {
                    obj5 = obj3;
                } else if (obj2 == null) {
                    throw aN.a();
                } else if (z) {
                    obj5 = 1;
                } else {
                    obj3 = obj4;
                    obj8 = obj7;
                    i4 = 1;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            throw aN.a();
                        }
                        a3.b(c(), a());
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            throw aN.a();
                        }
                        a3.b(f(), a());
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                }
                if (obj2 != null) {
                    throw aN.a();
                } else if (z) {
                    obj3 = obj5;
                    obj5 = 1;
                } else {
                    obj3 = obj4;
                    obj6 = obj7;
                    obj7 = obj5;
                    i3 = 1;
                    obj8 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            a3.b(c(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            a3.b(f(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                }
            }
            if (i5 == -1) {
                if (obj == null) {
                    obj7 = obj4;
                } else if (obj2 == null) {
                    throw aN.a();
                } else if (z) {
                    obj7 = 1;
                } else {
                    obj6 = obj7;
                    obj7 = obj3;
                    i2 = 1;
                    obj8 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            throw aN.a();
                        }
                        a3.b(c(), a());
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            throw aN.a();
                        }
                        a3.b(f(), a());
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                }
                if (obj2 != null) {
                    throw aN.a();
                } else if (z) {
                    obj4 = obj7;
                    obj7 = 1;
                } else {
                    obj6 = obj3;
                    obj3 = obj7;
                    obj7 = obj6;
                    if (obj3 != null) {
                        if (obj7 == null) {
                            a3.b(c(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj7 != null) {
                        a3.a(c(), a());
                    }
                    if (obj8 != null) {
                        if (obj5 == null) {
                            a3.b(f(), a());
                        } else {
                            throw aN.a();
                        }
                    }
                    if (obj5 == null) {
                        a3.a(f(), e());
                    }
                }
            }
            if (i5 != 0) {
                if (obj == null) {
                    obj8 = obj7;
                    obj7 = obj3;
                    obj3 = obj4;
                } else if (obj2 != null) {
                    throw aN.a();
                } else {
                    if (a >= a2) {
                        obj7 = obj4;
                    } else if (z) {
                        obj5 = 1;
                        obj7 = 1;
                    } else {
                        i3 = 1;
                        obj6 = obj7;
                        obj7 = obj3;
                        i2 = 1;
                        obj8 = obj6;
                        if (obj3 != null) {
                            if (obj7 == null) {
                                throw aN.a();
                            }
                            a3.b(c(), a());
                        }
                        if (obj7 != null) {
                            a3.a(c(), a());
                        }
                        if (obj8 != null) {
                            if (obj5 == null) {
                                throw aN.a();
                            }
                            a3.b(f(), a());
                        }
                        if (obj5 == null) {
                            a3.a(f(), e());
                        }
                    }
                    if (z) {
                        obj3 = obj7;
                        obj7 = 1;
                    } else {
                        obj3 = obj7;
                        obj7 = 1;
                        if (obj3 != null) {
                            if (obj7 == null) {
                                a3.b(c(), a());
                            } else {
                                throw aN.a();
                            }
                        }
                        if (obj7 != null) {
                            a3.a(c(), a());
                        }
                        if (obj8 != null) {
                            if (obj5 == null) {
                                a3.b(f(), a());
                            } else {
                                throw aN.a();
                            }
                        }
                        if (obj5 == null) {
                            a3.a(f(), e());
                        }
                    }
                }
                if (obj2 != null) {
                    throw aN.a();
                }
                if (obj3 != null) {
                    if (obj7 == null) {
                        throw aN.a();
                    }
                    a3.b(c(), a());
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        throw aN.a();
                    }
                    a3.b(f(), a());
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            }
            throw aN.a();
        } else {
            obj5 = 1;
        }
        if (a2 < 4) {
            obj7 = 1;
        }
        if (i5 == 1) {
            if (obj == null) {
                obj5 = obj3;
            } else if (obj2 == null) {
                throw aN.a();
            } else if (z) {
                obj3 = obj4;
                obj8 = obj7;
                i4 = 1;
                if (obj3 != null) {
                    if (obj7 == null) {
                        a3.b(c(), a());
                    } else {
                        throw aN.a();
                    }
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        a3.b(f(), a());
                    } else {
                        throw aN.a();
                    }
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            } else {
                obj5 = 1;
            }
            if (obj2 != null) {
                throw aN.a();
            } else if (z) {
                obj3 = obj4;
                obj6 = obj7;
                obj7 = obj5;
                i3 = 1;
                obj8 = obj6;
                if (obj3 != null) {
                    if (obj7 == null) {
                        throw aN.a();
                    }
                    a3.b(c(), a());
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        throw aN.a();
                    }
                    a3.b(f(), a());
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            } else {
                obj3 = obj5;
                obj5 = 1;
            }
        }
        if (i5 == -1) {
            if (obj == null) {
                obj7 = obj4;
            } else if (obj2 == null) {
                throw aN.a();
            } else if (z) {
                obj6 = obj7;
                obj7 = obj3;
                i2 = 1;
                obj8 = obj6;
                if (obj3 != null) {
                    if (obj7 == null) {
                        a3.b(c(), a());
                    } else {
                        throw aN.a();
                    }
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        a3.b(f(), a());
                    } else {
                        throw aN.a();
                    }
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            } else {
                obj7 = 1;
            }
            if (obj2 != null) {
                throw aN.a();
            } else if (z) {
                obj6 = obj3;
                obj3 = obj7;
                obj7 = obj6;
                if (obj3 != null) {
                    if (obj7 == null) {
                        throw aN.a();
                    }
                    a3.b(c(), a());
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        throw aN.a();
                    }
                    a3.b(f(), a());
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            } else {
                obj4 = obj7;
                obj7 = 1;
            }
        }
        if (i5 != 0) {
            throw aN.a();
        }
        if (obj == null) {
            obj8 = obj7;
            obj7 = obj3;
            obj3 = obj4;
        } else if (obj2 != null) {
            if (a >= a2) {
                obj7 = obj4;
            } else if (z) {
                i3 = 1;
                obj6 = obj7;
                obj7 = obj3;
                i2 = 1;
                obj8 = obj6;
                if (obj3 != null) {
                    if (obj7 == null) {
                        a3.b(c(), a());
                    } else {
                        throw aN.a();
                    }
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        a3.b(f(), a());
                    } else {
                        throw aN.a();
                    }
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            } else {
                obj5 = 1;
                obj7 = 1;
            }
            if (z) {
                obj3 = obj7;
                obj7 = 1;
                if (obj3 != null) {
                    if (obj7 == null) {
                        throw aN.a();
                    }
                    a3.b(c(), a());
                }
                if (obj7 != null) {
                    a3.a(c(), a());
                }
                if (obj8 != null) {
                    if (obj5 == null) {
                        throw aN.a();
                    }
                    a3.b(f(), a());
                }
                if (obj5 == null) {
                    a3.a(f(), e());
                }
            }
            obj3 = obj7;
            obj7 = 1;
        } else {
            throw aN.a();
        }
        if (obj2 != null) {
            throw aN.a();
        }
        if (obj3 != null) {
            if (obj7 == null) {
                a3.b(c(), a());
            } else {
                throw aN.a();
            }
        }
        if (obj7 != null) {
            a3.a(c(), a());
        }
        if (obj8 != null) {
            if (obj5 == null) {
                a3.b(f(), a());
            } else {
                throw aN.a();
            }
        }
        if (obj5 == null) {
            a3.a(f(), e());
        }
    }

    static {
        n = new int[]{7, 5, 4, 3, 1};
        l = new int[]{4, 20, 52, arj.Theme_editTextStyle, 204};
        h = new int[]{0, 348, 1388, 2948, 3988};
        j = new int[][]{new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
        r = new int[][]{new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, arj.Theme_spinnerStyle}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, arj.Theme_ratingBarStyle, arj.Theme_seekBarStyle, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{arj.Theme_switchStyle, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{arj.Theme_checkedTextViewStyle, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
        p = new int[][]{new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    }

    public aJ() {
        this.i = new ArrayList(11);
        this.m = new ArrayList();
        this.o = new int[2];
        this.k = false;
    }

    private static int a(d_ d_Var, int i) {
        if (d_Var.f(i)) {
            int c = d_Var.c(d_Var.d(i));
            if (!q) {
                return c;
            }
        }
        return d_Var.d(d_Var.c(i));
    }

    private boolean a() {
        boolean z = true;
        boolean z2 = q;
        dA dAVar = (dA) this.i.get(0);
        fx c = dAVar.c();
        fx d = dAVar.d();
        if (d == null) {
            return false;
        }
        int i = 2;
        int b = d.b();
        int i2 = 1;
        while (i2 < this.i.size()) {
            dAVar = (dA) this.i.get(i2);
            b += dAVar.c().b();
            i++;
            d = dAVar.d();
            if (d != null) {
                b += d.b();
                i++;
            }
            int i3 = i2 + 1;
            if (z2) {
                break;
            }
            i2 = i3;
        }
        if ((b % 211) + ((i - 4) * 211) != c.a()) {
            z = false;
        }
        return z;
    }

    private List a(List list, int i) {
        boolean z = q;
        while (i < this.m.size()) {
            bK bKVar = (bK) this.m.get(i);
            this.i.clear();
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                this.i.addAll(((bK) list.get(i2)).a());
                int i3 = i2 + 1;
                if (!z) {
                    i2 = i3;
                }
            }
            try {
                break;
                this.i.addAll(bKVar.a());
                if (a(this.i) || z) {
                    if (a()) {
                        try {
                            return this.i;
                        } catch (aN e) {
                            throw e;
                        }
                    }
                    List arrayList = new ArrayList();
                    arrayList.addAll(list);
                    arrayList.add(bKVar);
                    try {
                        return a(arrayList, i + 1);
                    } catch (aN e2) {
                    }
                }
                i++;
                if (z) {
                    break;
                }
            } catch (aN e3) {
                throw e3;
            } catch (aN e32) {
                throw e32;
            }
        }
        throw aN.a();
    }

    private static boolean a(Iterable iterable, Iterable iterable2) {
        boolean z = q;
        for (bK bKVar : iterable2) {
            boolean z2;
            boolean z3 = true;
            for (dA dAVar : iterable) {
                boolean z4;
                boolean z5 = false;
                for (dA equals : bKVar.a()) {
                    if (dAVar.equals(equals)) {
                        if (!z) {
                            z4 = true;
                            break;
                        }
                        z4 = true;
                    } else {
                        z4 = z5;
                    }
                    if (z) {
                        break;
                    }
                    z5 = z4;
                }
                z4 = z5;
                if (!z4) {
                    if (!z) {
                        z2 = false;
                        break;
                    }
                    z2 = false;
                } else {
                    z2 = z3;
                }
                if (z) {
                    break;
                }
                z3 = z2;
            }
            z2 = z3;
            if (!z2) {
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    List a(int i, d_ d_Var) {
        while (true) {
            try {
                this.i.add(a(d_Var, this.i, i));
            } catch (aN e) {
                if (this.i.isEmpty()) {
                    throw e;
                }
                try {
                    if (a()) {
                        return this.i;
                    }
                    try {
                        boolean z;
                        if (this.m.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        a(i, false);
                        if (z) {
                            List a = a(false);
                            if (a != null) {
                                return a;
                            }
                            a = a(true);
                            if (a != null) {
                                return a;
                            }
                        }
                        throw aN.a();
                    } catch (aN e2) {
                        throw e2;
                    }
                } catch (aN e22) {
                    throw e22;
                }
            } catch (aN e222) {
                throw e222;
            }
        }
    }

    private List a(boolean z) {
        List list = null;
        try {
            if (this.m.size() > 25) {
                this.m.clear();
            } else {
                try {
                    this.i.clear();
                    if (z) {
                        Collections.reverse(this.m);
                    }
                    try {
                        list = a(new ArrayList(), 0);
                    } catch (aN e) {
                    }
                    if (z) {
                        try {
                            Collections.reverse(this.m);
                        } catch (aN e2) {
                            throw e2;
                        }
                    }
                } catch (aN e22) {
                    throw e22;
                }
            }
            return list;
        } catch (aN e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.fx a(com.google.d_ r15, com.google.e4 r16, boolean r17, boolean r18) {
        /*
        r14 = this;
        r4 = q;
        r2 = r14.b();
        r0 = 0;
        r1 = 0;
        r2[r0] = r1;
        r0 = 1;
        r1 = 0;
        r2[r0] = r1;
        r0 = 2;
        r1 = 0;
        r2[r0] = r1;
        r0 = 3;
        r1 = 0;
        r2[r0] = r1;
        r0 = 4;
        r1 = 0;
        r2[r0] = r1;
        r0 = 5;
        r1 = 0;
        r2[r0] = r1;
        r0 = 6;
        r1 = 0;
        r2[r0] = r1;
        r0 = 7;
        r1 = 0;
        r2[r0] = r1;
        if (r18 == 0) goto L_0x003b;
    L_0x0028:
        r0 = r16.b();
        r1 = 0;
        r0 = r0[r1];
        com.google.aU.b(r15, r0, r2);
        if (r4 == 0) goto L_0x0059;
    L_0x0034:
        r0 = com.google.aK.a;
        if (r0 == 0) goto L_0x008a;
    L_0x0038:
        r0 = 0;
    L_0x0039:
        com.google.aK.a = r0;
    L_0x003b:
        r0 = r16.b();
        r1 = 1;
        r0 = r0[r1];
        com.google.aU.a(r15, r0, r2);
        r1 = 0;
        r0 = r2.length;
        r0 = r0 + -1;
    L_0x0049:
        if (r1 >= r0) goto L_0x0059;
    L_0x004b:
        r3 = r2[r1];
        r5 = r2[r0];
        r2[r1] = r5;
        r2[r0] = r3;
        r1 = r1 + 1;
        r0 = r0 + -1;
        if (r4 == 0) goto L_0x0049;
    L_0x0059:
        r3 = 17;
        r0 = a(r2);
        r0 = (float) r0;
        r1 = (float) r3;
        r5 = r0 / r1;
        r0 = r16.b();
        r1 = 1;
        r0 = r0[r1];
        r1 = r16.b();
        r6 = 0;
        r1 = r1[r6];
        r0 = r0 - r1;
        r0 = (float) r0;
        r1 = 1097859072; // 0x41700000 float:15.0 double:5.424144515E-315;
        r0 = r0 / r1;
        r1 = r5 - r0;
        r1 = java.lang.Math.abs(r1);
        r0 = r1 / r0;
        r1 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x008c;
    L_0x0085:
        r0 = com.google.aN.a();
        throw r0;
    L_0x008a:
        r0 = 1;
        goto L_0x0039;
    L_0x008c:
        r6 = r14.c();
        r7 = r14.f();
        r8 = r14.a();
        r9 = r14.e();
        r0 = 0;
    L_0x009d:
        r1 = r2.length;
        if (r0 >= r1) goto L_0x00ea;
    L_0x00a0:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = r2[r0];
        r10 = (float) r10;
        r1 = r1 * r10;
        r10 = r1 / r5;
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 + r10;
        r1 = (int) r1;
        r11 = 1;
        if (r1 >= r11) goto L_0x00be;
    L_0x00af:
        r1 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x00bb;
    L_0x00b6:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00bb:
        r1 = 1;
        if (r4 == 0) goto L_0x00d0;
    L_0x00be:
        r11 = 8;
        if (r1 <= r11) goto L_0x00d0;
    L_0x00c2:
        r1 = 1091253043; // 0x410b3333 float:8.7 double:5.391506395E-315;
        r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x00ce;
    L_0x00c9:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00ce:
        r1 = 8;
    L_0x00d0:
        r11 = r0 / 2;
        r12 = r0 & 1;
        if (r12 != 0) goto L_0x00df;
    L_0x00d6:
        r6[r11] = r1;
        r12 = (float) r1;
        r12 = r10 - r12;
        r8[r11] = r12;
        if (r4 == 0) goto L_0x00e6;
    L_0x00df:
        r7[r11] = r1;
        r1 = (float) r1;
        r1 = r10 - r1;
        r9[r11] = r1;
    L_0x00e6:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x009d;
    L_0x00ea:
        r14.a(r3);
        r0 = r16.c();
        r1 = r0 * 4;
        if (r17 == 0) goto L_0x0153;
    L_0x00f5:
        r0 = 0;
    L_0x00f6:
        r1 = r1 + r0;
        if (r18 == 0) goto L_0x0155;
    L_0x00f9:
        r0 = 0;
    L_0x00fa:
        r0 = r0 + r1;
        r5 = r0 + -1;
        r2 = 0;
        r1 = 0;
        r0 = r6.length;
        r0 = r0 + -1;
        r13 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r13;
    L_0x0106:
        if (r2 < 0) goto L_0x0121;
    L_0x0108:
        r3 = a(r16, r17, r18);
        if (r3 == 0) goto L_0x011a;
    L_0x010e:
        r3 = r;
        r3 = r3[r5];
        r8 = r2 * 2;
        r3 = r3[r8];
        r8 = r6[r2];
        r3 = r3 * r8;
        r0 = r0 + r3;
    L_0x011a:
        r3 = r6[r2];
        r1 = r1 + r3;
        r2 = r2 + -1;
        if (r4 == 0) goto L_0x0106;
    L_0x0121:
        r3 = 0;
        r2 = r7.length;
        r2 = r2 + -1;
        r13 = r2;
        r2 = r3;
        r3 = r13;
    L_0x0128:
        if (r3 < 0) goto L_0x0142;
    L_0x012a:
        r8 = a(r16, r17, r18);
        if (r8 == 0) goto L_0x013e;
    L_0x0130:
        r8 = r;
        r8 = r8[r5];
        r9 = r3 * 2;
        r9 = r9 + 1;
        r8 = r8[r9];
        r9 = r7[r3];
        r8 = r8 * r9;
        r2 = r2 + r8;
    L_0x013e:
        r3 = r3 + -1;
        if (r4 == 0) goto L_0x0128;
    L_0x0142:
        r0 = r0 + r2;
        r2 = r1 & 1;
        if (r2 != 0) goto L_0x014e;
    L_0x0147:
        r2 = 13;
        if (r1 > r2) goto L_0x014e;
    L_0x014b:
        r2 = 4;
        if (r1 >= r2) goto L_0x0157;
    L_0x014e:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0153:
        r0 = 2;
        goto L_0x00f6;
    L_0x0155:
        r0 = 1;
        goto L_0x00fa;
    L_0x0157:
        r1 = 13 - r1;
        r1 = r1 / 2;
        r2 = n;
        r2 = r2[r1];
        r3 = 9 - r2;
        r4 = 1;
        r2 = com.google.m.a(r6, r2, r4);
        r4 = 0;
        r3 = com.google.m.a(r7, r3, r4);
        r4 = l;
        r4 = r4[r1];
        r5 = h;
        r1 = r5[r1];
        r2 = r2 * r4;
        r2 = r2 + r3;
        r1 = r1 + r2;
        r2 = new com.google.fx;
        r2.<init>(r1, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aJ.a(com.google.d_, com.google.e4, boolean, boolean):com.google.fx");
    }

    private static void a(int[] iArr) {
        boolean z = q;
        int length = iArr.length;
        int i = 0;
        while (i < length / 2) {
            int i2 = iArr[i];
            iArr[i] = iArr[(length - i) - 1];
            iArr[(length - i) - 1] = i2;
            i++;
            if (z) {
                return;
            }
        }
    }

    private static void a(List list, List list2) {
        boolean z = q;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            bK bKVar = (bK) it.next();
            if (bKVar.a().size() != list.size() || z) {
                Object obj;
                Object obj2 = 1;
                for (dA dAVar : bKVar.a()) {
                    Object obj3;
                    Object obj4 = null;
                    for (dA equals : list) {
                        if (dAVar.equals(equals)) {
                            if (!z) {
                                int i = 1;
                                break;
                            }
                            obj3 = 1;
                        } else {
                            obj3 = obj4;
                        }
                        if (z) {
                            break;
                        }
                        obj4 = obj3;
                    }
                    obj3 = obj4;
                    if (obj3 == null) {
                        if (!z) {
                            obj = null;
                            break;
                        }
                        obj = null;
                    } else {
                        obj = obj2;
                    }
                    if (z) {
                        break;
                    }
                    obj2 = obj;
                }
                obj = obj2;
                if (obj != null) {
                    it.remove();
                }
                if (z) {
                    return;
                }
            }
        }
    }

    private static boolean a(e4 e4Var, boolean z, boolean z2) {
        return (e4Var.c() == 0 && z && z2) ? false : true;
    }

    dA a(d_ d_Var, List list, int i) {
        boolean z = q;
        try {
            boolean z2;
            if (list.size() % 2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                boolean z3;
                e4 a;
                if (this.k) {
                    if (z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                int i2 = -1;
                boolean z4 = true;
                do {
                    b(d_Var, list, i2);
                    a = a(d_Var, i, z3);
                    if (a == null) {
                        i2 = a(d_Var, this.o[0]);
                        if (!z) {
                            continue;
                        }
                    }
                    z4 = false;
                    continue;
                } while (z4);
                fx a2 = a(d_Var, a, z3, true);
                try {
                    if (list.isEmpty() || !((dA) list.get(list.size() - 1)).a()) {
                        fx a3;
                        try {
                            a3 = a(d_Var, a, z3, false);
                        } catch (aN e) {
                            a3 = null;
                        }
                        return new dA(a2, a3, a, true);
                    }
                    throw aN.a();
                } catch (aN e2) {
                    throw e2;
                } catch (aN e22) {
                    throw e22;
                }
            } catch (aN e222) {
                throw e222;
            } catch (aN e2222) {
                throw e2222;
            }
        } catch (aN e22222) {
            throw e22222;
        }
    }

    public f6 a(int i, d_ d_Var, Map map) {
        this.i.clear();
        this.k = false;
        try {
            return b(a(i, d_Var));
        } catch (aN e) {
            this.i.clear();
            this.k = true;
            return b(a(i, d_Var));
        }
    }

    private static boolean a(List list) {
        boolean z = q;
        int[][] iArr = p;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2;
            int[] iArr2 = iArr[i];
            if (list.size() <= iArr2.length || z) {
                int i3 = 0;
                boolean z2 = true;
                while (i3 < list.size()) {
                    if (((dA) list.get(i3)).b().c() != iArr2[i3]) {
                        if (!z) {
                            z2 = false;
                            break;
                        }
                        z2 = false;
                    }
                    i2 = i3 + 1;
                    if (z) {
                        break;
                    }
                    i3 = i2;
                }
                if (z2) {
                    return true;
                }
            }
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.google.d_ r12, java.util.List r13, int r14) {
        /*
        r11 = this;
        r5 = q;
        r6 = r11.d();
        r0 = 0;
        r1 = 0;
        r6[r0] = r1;
        r0 = 1;
        r1 = 0;
        r6[r0] = r1;
        r0 = 2;
        r1 = 0;
        r6[r0] = r1;
        r0 = 3;
        r1 = 0;
        r6[r0] = r1;
        r7 = r12.d();
        if (r14 < 0) goto L_0x001e;
    L_0x001c:
        if (r5 == 0) goto L_0x003e;
    L_0x001e:
        r0 = r13.isEmpty();
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r14 = 0;
        if (r5 == 0) goto L_0x003e;
    L_0x0027:
        r0 = r13.size();
        r0 = r0 + -1;
        r0 = r13.get(r0);
        r0 = (com.google.dA) r0;
        r0 = r0.b();
        r0 = r0.b();
        r1 = 1;
        r14 = r0[r1];
    L_0x003e:
        r0 = r13.size();
        r0 = r0 % 2;
        if (r0 == 0) goto L_0x0091;
    L_0x0046:
        r0 = 1;
    L_0x0047:
        r1 = r11.k;
        if (r1 == 0) goto L_0x004e;
    L_0x004b:
        if (r0 != 0) goto L_0x0093;
    L_0x004d:
        r0 = 1;
    L_0x004e:
        r1 = 0;
        r2 = r14;
    L_0x0050:
        if (r2 >= r7) goto L_0x0061;
    L_0x0052:
        r1 = r12.f(r2);
        if (r1 != 0) goto L_0x0095;
    L_0x0058:
        r1 = 1;
    L_0x0059:
        if (r1 != 0) goto L_0x005d;
    L_0x005b:
        if (r5 == 0) goto L_0x0061;
    L_0x005d:
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x0050;
    L_0x0061:
        r3 = 0;
        r4 = r2;
        r10 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r10;
    L_0x0067:
        if (r4 >= r7) goto L_0x00c8;
    L_0x0069:
        r8 = r12.f(r4);
        r8 = r8 ^ r3;
        if (r8 == 0) goto L_0x0078;
    L_0x0070:
        r8 = r6[r2];
        r8 = r8 + 1;
        r6[r2] = r8;
        if (r5 == 0) goto L_0x00c4;
    L_0x0078:
        r8 = 3;
        if (r2 != r8) goto L_0x00bc;
    L_0x007b:
        if (r0 == 0) goto L_0x0080;
    L_0x007d:
        a(r6);
    L_0x0080:
        r8 = com.google.a3.b(r6);
        if (r8 == 0) goto L_0x0097;
    L_0x0086:
        r0 = r11.o;
        r2 = 0;
        r0[r2] = r1;
        r0 = r11.o;
        r1 = 1;
        r0[r1] = r4;
        return;
    L_0x0091:
        r0 = 0;
        goto L_0x0047;
    L_0x0093:
        r0 = 0;
        goto L_0x004e;
    L_0x0095:
        r1 = 0;
        goto L_0x0059;
    L_0x0097:
        if (r0 == 0) goto L_0x009c;
    L_0x0099:
        a(r6);
    L_0x009c:
        r8 = 0;
        r8 = r6[r8];
        r9 = 1;
        r9 = r6[r9];
        r8 = r8 + r9;
        r1 = r1 + r8;
        r8 = 0;
        r9 = 2;
        r9 = r6[r9];
        r6[r8] = r9;
        r8 = 1;
        r9 = 3;
        r9 = r6[r9];
        r6[r8] = r9;
        r8 = 2;
        r9 = 0;
        r6[r8] = r9;
        r8 = 3;
        r9 = 0;
        r6[r8] = r9;
        r2 = r2 + -1;
        if (r5 == 0) goto L_0x00be;
    L_0x00bc:
        r2 = r2 + 1;
    L_0x00be:
        r8 = 1;
        r6[r2] = r8;
        if (r3 != 0) goto L_0x00cd;
    L_0x00c3:
        r3 = 1;
    L_0x00c4:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x0067;
    L_0x00c8:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00cd:
        r3 = 0;
        goto L_0x00c4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aJ.b(com.google.d_, java.util.List, int):void");
    }
}
