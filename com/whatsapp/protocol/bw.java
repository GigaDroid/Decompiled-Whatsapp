package com.whatsapp.protocol;

import com.whatsapp.arj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class bw implements bl {
    private static final String[] z;
    private final cm a;
    private final Hashtable b;
    private final bo c;

    static {
        String[] strArr = new String[9];
        String str = "1U\t3kg[\u00102.(RE4o)S\u0000}.1U\t3kz";
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
                        i3 = 71;
                        break;
                    case at.g /*1*/:
                        i3 = 52;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "1U\t3kg[\u00102.(RE4o)S\u0000}.1U\t3kz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "1U\t3kg[\u00102.(RE4o)S\u0000}.1U\t3kz";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "+]\u00162.3[\nfb(Z\u0002}.$[\u0010(zz";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "2Z\u0000>~\"W\u0011#jgQ\n .0F\f2g)SE |(YE5z5Q\u0004+";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0003[\u0010$b\"\u0014\u0007?z\"\u0014\u0001/m3]\n(o5ME2a,Q\u000bfa2@E)hgF\u0004(i\"";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "1U\t3kg[\u00102.(RE4o)S\u0000}.1U\t3kz";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "*[\u0017#.3\\\u0004(.(Z\u0000f}(A\u0017%kg[\u0003fg)Z\u00004.#U\u0011'.![\u0017f`(P\u0000}.$[\u0010(z\u0011U\t3k4\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ".Z\u0013'b.PE2a,Q\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(cw cwVar) {
        a(cwVar, 1);
    }

    public bw(bo boVar, cm cmVar, String[] strArr, String[] strArr2) {
        int i = 0;
        boolean z = co.s;
        this.c = boVar;
        this.a = cmVar;
        this.b = new Hashtable((((strArr.length + strArr2.length) * 4) / 3) + 1);
        int i2 = 0;
        while (i2 < strArr.length) {
            try {
                if (strArr[i2] != null) {
                    this.b.put(strArr[i2], new Integer(i2));
                }
                i2++;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (i < strArr2.length) {
            try {
                if (strArr2[i] != null) {
                    this.b.put(strArr2[i], new Integer(i + 256));
                }
                i++;
                if (z) {
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    private static void b(OutputStream outputStream, int i) {
        boolean z = co.s;
        if (i == 0) {
            try {
                outputStream.write(0);
                if (!z) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        if (i < 256) {
            try {
                outputStream.write(248);
                e(outputStream, i);
                if (!z) {
                    return;
                }
            } catch (IllegalArgumentException e22) {
                try {
                    throw e22;
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
        }
        if (i < 65536) {
            try {
                outputStream.write(249);
                f(outputStream, i);
                if (!z) {
                    return;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        throw new IOException(z[4] + i);
    }

    private static int b(int i) {
        switch (i) {
            case arj.Theme_actionDropDownStyle /*45*/:
            case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                return (i - 45) + 10;
            case arj.Theme_homeAsUpIndicator /*48*/:
            case arj.Theme_actionButtonStyle /*49*/:
            case arj.Theme_buttonBarStyle /*50*/:
            case arj.Theme_buttonBarButtonStyle /*51*/:
            case arj.Theme_selectableItemBackground /*52*/:
            case arj.Theme_selectableItemBackgroundBorderless /*53*/:
            case arj.Theme_borderlessButtonStyle /*54*/:
            case arj.Theme_dividerVertical /*55*/:
            case arj.Theme_dividerHorizontal /*56*/:
            case arj.Theme_activityChooserViewStyle /*57*/:
                return i - 48;
            default:
                return -1;
        }
    }

    private void a(OutputStream outputStream, cw cwVar) {
        int i = 0;
        boolean z = co.s;
        try {
            int i2;
            if (cwVar.d != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            try {
                if (cwVar.a != null) {
                    i2++;
                }
                try {
                    int i3;
                    if (cwVar.f != null) {
                        i3 = i2 + 1;
                    } else {
                        i3 = i2;
                    }
                    if (i3 > 1) {
                        try {
                            throw new IOException(z[8] + i3);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    try {
                        if (cwVar.b == null) {
                            i2 = 0;
                        } else {
                            i2 = cwVar.b.length * 2;
                        }
                        try {
                            b(outputStream, (i2 + 1) + i3);
                            a(outputStream, cwVar.c, false);
                            a(outputStream, cwVar.b);
                            if (cwVar.a != null) {
                                a(outputStream, cwVar.a, false);
                                if (!z) {
                                    return;
                                }
                            }
                            try {
                                if (cwVar.f != null) {
                                    try {
                                        a(outputStream, cwVar.f, cwVar.e);
                                        if (!z) {
                                            return;
                                        }
                                    } catch (IllegalArgumentException e2) {
                                        throw e2;
                                    }
                                }
                                if (cwVar.d != null) {
                                    b(outputStream, cwVar.d.length);
                                    while (i < cwVar.d.length) {
                                        a(outputStream, cwVar.d[i]);
                                        i++;
                                        if (z) {
                                            return;
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        } catch (IllegalArgumentException e2222) {
                            throw e2222;
                        }
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.OutputStream r5, java.io.InputStream r6, int r7) {
        /*
        r4 = 0;
        r0 = com.whatsapp.protocol.co.s;
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        if (r7 < r1) goto L_0x0011;
    L_0x0007:
        r1 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r5.write(r1);	 Catch:{ IllegalArgumentException -> 0x0046 }
        a(r5, r7);	 Catch:{ IllegalArgumentException -> 0x0046 }
        if (r0 == 0) goto L_0x0027;
    L_0x0011:
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r7 < r1) goto L_0x001f;
    L_0x0015:
        r1 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r5.write(r1);	 Catch:{ IllegalArgumentException -> 0x004a }
        d(r5, r7);	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r1 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r5.write(r1);	 Catch:{ IllegalArgumentException -> 0x004a }
        e(r5, r7);	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x0027:
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1 = new byte[r1];
    L_0x002b:
        if (r7 <= 0) goto L_0x0052;
    L_0x002d:
        r2 = r1.length;
        r2 = java.lang.Math.min(r2, r7);
        r2 = r6.read(r1, r4, r2);
        r3 = -1;
        if (r2 != r3) goto L_0x004c;
    L_0x0039:
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r5.write(r1, r4, r2);
        r7 = r7 - r2;
        if (r0 == 0) goto L_0x002b;
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bw.a(java.io.OutputStream, java.io.InputStream, int):void");
    }

    private static int a(int i) {
        switch (i) {
            case arj.Theme_homeAsUpIndicator /*48*/:
            case arj.Theme_actionButtonStyle /*49*/:
            case arj.Theme_buttonBarStyle /*50*/:
            case arj.Theme_buttonBarButtonStyle /*51*/:
            case arj.Theme_selectableItemBackground /*52*/:
            case arj.Theme_selectableItemBackgroundBorderless /*53*/:
            case arj.Theme_borderlessButtonStyle /*54*/:
            case arj.Theme_dividerVertical /*55*/:
            case arj.Theme_dividerHorizontal /*56*/:
            case arj.Theme_activityChooserViewStyle /*57*/:
                return i - 48;
            case arj.Theme_textAppearanceSearchResultTitle /*65*/:
            case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
            case arj.Theme_textColorSearchUrl /*67*/:
            case arj.Theme_searchViewStyle /*68*/:
            case arj.Theme_listPreferredItemHeight /*69*/:
            case arj.Theme_listPreferredItemHeightSmall /*70*/:
                return (i - 65) + 10;
            default:
                return -1;
        }
    }

    public void a(cw cwVar, int i) {
        Object obj;
        Object obj2 = 1;
        if ((i & 1) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if ((i & 2) == 0) {
            obj2 = null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        if (obj2 == null) {
            try {
                byteArrayOutputStream.write(0);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a(byteArrayOutputStream, cwVar);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        if (obj2 != null) {
            try {
                byte[] b = this.a.b(toByteArray, 0, toByteArray.length, new byte[]{b7.e});
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        b = toByteArray;
        try {
            this.c.a(b, 0, b.length);
            if (obj != null) {
                this.c.a();
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void a(OutputStream outputStream, ce[] ceVarArr) {
        boolean z = co.s;
        if (ceVarArr != null) {
            int i = 0;
            while (i < ceVarArr.length) {
                a(outputStream, ceVarArr[i].a, false);
                a(outputStream, ceVarArr[i].b, true);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    private static void c(OutputStream outputStream, int i) {
        if (i < 0 || i > 255) {
            try {
                throw new IOException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        outputStream.write((byte) i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(int r9, byte[] r10) {
        /*
        r0 = 0;
        r3 = com.whatsapp.protocol.co.s;
        r4 = r10.length;
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r4 < r1) goto L_0x0009;
    L_0x0008:
        return r0;
    L_0x0009:
        r1 = r4 + 1;
        r1 = r1 / 2;
        r1 = new byte[r1];
        r2 = 0;
    L_0x0010:
        if (r2 >= r4) goto L_0x002f;
    L_0x0012:
        r5 = r10[r2];
        r5 = a(r9, r5);
        r6 = -1;
        if (r5 == r6) goto L_0x0008;
    L_0x001b:
        r6 = r2 / 2;
        r7 = r1[r6];
        r8 = r2 % 2;
        r8 = 1 - r8;
        r8 = r8 * 4;
        r5 = r5 << r8;
        r5 = (byte) r5;
        r5 = r5 | r7;
        r5 = (byte) r5;
        r1[r6] = r5;
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0010;
    L_0x002f:
        r0 = r4 % 2;
        r2 = 1;
        if (r0 != r2) goto L_0x003e;
    L_0x0034:
        r0 = r1.length;	 Catch:{ IllegalArgumentException -> 0x0040 }
        r0 = r0 + -1;
        r2 = r1[r0];	 Catch:{ IllegalArgumentException -> 0x0040 }
        r2 = r2 | 15;
        r2 = (byte) r2;	 Catch:{ IllegalArgumentException -> 0x0040 }
        r1[r0] = r2;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x003e:
        r0 = r1;
        goto L_0x0008;
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bw.a(int, byte[]):byte[]");
    }

    private static void a(OutputStream outputStream, int i) {
        if (i < 0) {
            try {
                throw new IOException(z[3] + i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        outputStream.write((2130706432 & i) >> 24);
        outputStream.write((16711680 & i) >> 16);
        outputStream.write((65280 & i) >> 8);
        outputStream.write(i & 255);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.OutputStream r5, java.lang.String r6, boolean r7) {
        /*
        r4 = this;
        r1 = com.whatsapp.protocol.co.s;
        r0 = r4.b;
        r0 = r0.get(r6);
        r0 = (java.lang.Integer) r0;
        if (r0 != 0) goto L_0x002e;
    L_0x000c:
        r2 = 64;
        r2 = r6.indexOf(r2);
        r3 = 1;
        if (r2 >= r3) goto L_0x001e;
    L_0x0015:
        r3 = com.whatsapp.protocol.b7.a(r6);	 Catch:{ IllegalArgumentException -> 0x0051 }
        a(r5, r3, r7);	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r1 == 0) goto L_0x002c;
    L_0x001e:
        r3 = 0;
        r3 = r6.substring(r3, r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        r2 = r2 + 1;
        r2 = r6.substring(r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        r4.a(r5, r3, r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x002c:
        if (r1 == 0) goto L_0x006b;
    L_0x002e:
        r0 = r0.intValue();
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 >= r2) goto L_0x003b;
    L_0x0036:
        c(r5, r0);	 Catch:{ IllegalArgumentException -> 0x0053 }
        if (r1 == 0) goto L_0x006b;
    L_0x003b:
        r0 = r0 + -256;
        r2 = r0 / 256;
        r3 = r0 % 256;
        switch(r2) {
            case 0: goto L_0x0055;
            case 1: goto L_0x0059;
            case 2: goto L_0x005d;
            case 3: goto L_0x0061;
            default: goto L_0x0044;
        };
    L_0x0044:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004f }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004f }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004f }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        if (r1 == 0) goto L_0x0065;
    L_0x0059:
        r0 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        if (r1 == 0) goto L_0x0065;
    L_0x005d:
        r0 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        if (r1 == 0) goto L_0x0065;
    L_0x0061:
        r0 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        if (r1 != 0) goto L_0x0044;
    L_0x0065:
        c(r5, r0);
        c(r5, r3);
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bw.a(java.io.OutputStream, java.lang.String, boolean):void");
    }

    private static int a(int i, int i2) {
        switch (i) {
            case 251:
                return a(i2);
            case 255:
                try {
                    return b(i2);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            default:
                return -1;
        }
    }

    public byte[] b(cw cwVar) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        a(byteArrayOutputStream, cwVar);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.OutputStream r3, java.lang.String r4, java.lang.String r5) {
        /*
        r2 = this;
        r1 = 0;
        r0 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r3.write(r0);	 Catch:{ IllegalArgumentException -> 0x0018 }
        if (r4 == 0) goto L_0x0010;
    L_0x0008:
        r0 = 1;
        r2.a(r3, r4, r0);	 Catch:{ IllegalArgumentException -> 0x001a }
        r0 = com.whatsapp.protocol.co.s;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        c(r3, r0);	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x0014:
        r2.a(r3, r5, r1);
        return;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bw.a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    private static void f(OutputStream outputStream, int i) {
        if (i < 0 || i >= 65536) {
            try {
                throw new IOException(z[0] + i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        outputStream.write((65280 & i) >> 8);
        outputStream.write(i & 255);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.OutputStream r5, byte[] r6, boolean r7) {
        /*
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r4 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r1 = com.whatsapp.protocol.co.s;
        r2 = r6.length;
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        if (r2 < r0) goto L_0x0015;
    L_0x000b:
        r0 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r5.write(r0);	 Catch:{ IllegalArgumentException -> 0x0058 }
        a(r5, r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r1 == 0) goto L_0x0054;
    L_0x0015:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 < r0) goto L_0x0023;
    L_0x0019:
        r0 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r5.write(r0);	 Catch:{ IllegalArgumentException -> 0x005a }
        d(r5, r2);	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r1 == 0) goto L_0x0054;
    L_0x0023:
        r0 = 0;
        if (r7 == 0) goto L_0x003e;
    L_0x0026:
        r0 = a(r3, r6);
        if (r0 == 0) goto L_0x0033;
    L_0x002c:
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r5.write(r3);	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r1 == 0) goto L_0x003e;
    L_0x0033:
        r0 = a(r4, r6);
        if (r0 == 0) goto L_0x003e;
    L_0x0039:
        r3 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r5.write(r3);	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x003e:
        if (r0 == 0) goto L_0x004c;
    L_0x0040:
        r3 = r2 & 1;
        r3 = r3 << 7;
        r4 = r0.length;
        r3 = r3 | r4;
        r5.write(r3);
        if (r1 == 0) goto L_0x0062;
    L_0x004b:
        r6 = r0;
    L_0x004c:
        r0 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r5.write(r0);	 Catch:{ IllegalArgumentException -> 0x0060 }
        e(r5, r2);	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0054:
        r5.write(r6);
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r6 = r0;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bw.a(java.io.OutputStream, byte[], boolean):void");
    }

    private static void d(OutputStream outputStream, int i) {
        if (i < 0 || i >= 1048576) {
            try {
                throw new IOException(z[7] + i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        outputStream.write((983040 & i) >> 16);
        outputStream.write((65280 & i) >> 8);
        outputStream.write(i & 255);
    }

    public void a() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        b(byteArrayOutputStream, 1);
        byteArrayOutputStream.write(2);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        this.c.a(toByteArray, 0, toByteArray.length);
        this.c.a();
    }

    private static void e(OutputStream outputStream, int i) {
        if (i < 0 || i >= 256) {
            try {
                throw new IOException(z[2] + i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        outputStream.write(i & 255);
    }
}
