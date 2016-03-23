package com.google;

public abstract class e8 {
    private static e8 a;

    public abstract hX a(hX hXVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16);

    public abstract hX a(hX hXVar, int i, int i2, gU gUVar);

    public static e8 a() {
        return a;
    }

    static {
        a = new et();
    }

    protected static void a(hX hXVar, float[] fArr) {
        int i;
        boolean z = d_.a;
        int c = hXVar.c();
        int g = hXVar.g();
        int i2 = 0;
        Object obj = 1;
        while (i2 < fArr.length && r2 != null) {
            int i3 = (int) fArr[i2];
            int i4 = (int) fArr[i2 + 1];
            if (i3 >= -1 && i3 <= c && i4 >= -1 && i4 <= g) {
                if (i3 == -1) {
                    fArr[i2] = 0.0f;
                    if (!z) {
                        i = 1;
                        if (i4 == -1) {
                            fArr[i2 + 1] = 0.0f;
                            if (z) {
                                i = 1;
                                i2 += 2;
                                if (z) {
                                    break;
                                }
                            }
                            obj = 1;
                        }
                        if (i4 == g) {
                            fArr[i2 + 1] = (float) (g - 1);
                            obj = 1;
                        }
                        i2 += 2;
                        if (z) {
                            break;
                        }
                    }
                    obj = 1;
                } else {
                    obj = null;
                }
                if (i3 == c) {
                    fArr[i2] = (float) (c - 1);
                    obj = 1;
                }
                if (i4 == -1) {
                    fArr[i2 + 1] = 0.0f;
                    if (z) {
                        i = 1;
                        i2 += 2;
                        if (z) {
                            break;
                        }
                    }
                    obj = 1;
                }
                if (i4 == g) {
                    fArr[i2 + 1] = (float) (g - 1);
                    obj = 1;
                }
                i2 += 2;
                if (z) {
                    break;
                }
            }
            throw aN.a();
        }
        i = fArr.length - 2;
        Object obj2 = 1;
        while (i >= 0 && r0 != null) {
            i3 = (int) fArr[i];
            i4 = (int) fArr[i + 1];
            if (i3 < -1 || i3 > c || i4 < -1 || i4 > g) {
                throw aN.a();
            }
            if (i3 == -1) {
                fArr[i] = 0.0f;
                if (z) {
                    obj2 = 1;
                } else {
                    i2 = 1;
                    if (i4 == -1) {
                        fArr[i + 1] = 0.0f;
                        if (z) {
                            i2 = 1;
                            i -= 2;
                            if (z) {
                                return;
                            }
                        }
                        obj2 = 1;
                    }
                    if (i4 == g) {
                        fArr[i + 1] = (float) (g - 1);
                        obj2 = 1;
                    }
                    i -= 2;
                    if (z) {
                        return;
                    }
                }
            }
            obj2 = null;
            if (i3 == c) {
                fArr[i] = (float) (c - 1);
                obj2 = 1;
            }
            if (i4 == -1) {
                fArr[i + 1] = 0.0f;
                if (z) {
                    i2 = 1;
                    i -= 2;
                    if (z) {
                        return;
                    }
                }
                obj2 = 1;
            }
            if (i4 == g) {
                fArr[i + 1] = (float) (g - 1);
                obj2 = 1;
            }
            i -= 2;
            if (z) {
                return;
            }
        }
    }
}
