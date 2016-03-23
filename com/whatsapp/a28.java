package com.whatsapp;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;

public class a28 {
    public static boolean a;
    private static final boolean b;
    private static boolean c;
    private static final String[] z;

    static boolean a(int i) {
        return c(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r6) {
        /*
        r5 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r1 = a;
        r0 = b;	 Catch:{ NullPointerException -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        return r6;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = 0;
    L_0x0011:
        r3 = r6.length();
        if (r0 >= r3) goto L_0x0035;
    L_0x0017:
        r3 = r6.charAt(r0);
        r4 = r3 | r5;
        r4 = c(r4);	 Catch:{ NullPointerException -> 0x003a }
        if (r4 == 0) goto L_0x002e;
    L_0x0023:
        r4 = r3 | r5;
        r4 = java.lang.Character.toChars(r4);	 Catch:{ NullPointerException -> 0x003c }
        r2.append(r4);	 Catch:{ NullPointerException -> 0x003c }
        if (r1 == 0) goto L_0x0031;
    L_0x002e:
        r2.append(r3);	 Catch:{ NullPointerException -> 0x003c }
    L_0x0031:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0011;
    L_0x0035:
        r6 = r2.toString();
        goto L_0x0008;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.a(java.lang.String):java.lang.String");
    }

    public static CharSequence a(String str, Context context, Paint paint, float f) {
        SpannableStringBuilder a = a(str, context, paint, f, null);
        return a == null ? str : a;
    }

    public static SpannableStringBuilder b(String str, Context context, Paint paint) {
        return a(str, context, paint, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r5, int r6, int r7) {
        /*
        r0 = 0;
        r2 = a;
        if (r5 != 0) goto L_0x0012;
    L_0x0005:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x0010 }
        r1 = z;	 Catch:{ NullPointerException -> 0x0010 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0010 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0010 }
        throw r0;	 Catch:{ NullPointerException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = r5.length();
        if (r6 < 0) goto L_0x001c;
    L_0x0018:
        if (r7 > r1) goto L_0x001c;
    L_0x001a:
        if (r6 <= r7) goto L_0x0024;
    L_0x001c:
        r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ NullPointerException -> 0x0022 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0022 }
        throw r0;	 Catch:{ NullPointerException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r3 = new com.whatsapp.akl;
        r3.<init>(r5);
        r1 = r0;
    L_0x002a:
        if (r6 >= r7) goto L_0x003c;
    L_0x002c:
        r3.a(r6);
        r4 = com.whatsapp.er.a(r3);
        r4 = r3.a(r6, r4);
        r6 = r6 + r4;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x002a;
    L_0x003c:
        r3 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ NullPointerException -> 0x0045 }
        if (r3 == 0) goto L_0x0044;
    L_0x0040:
        if (r2 == 0) goto L_0x0049;
    L_0x0042:
        a = r0;
    L_0x0044:
        return r1;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = 1;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.a(java.lang.CharSequence, int, int):int");
    }

    private static boolean c(int i) {
        return i >= 126980 && i <= 129472;
    }

    public static CharSequence b(String str, Context context) {
        SpannableStringBuilder a = a(str, context);
        return a == null ? str : a;
    }

    public static CharSequence a(String str, Context context, Paint paint) {
        SpannableStringBuilder a = a(str, context, paint, null);
        return a == null ? str : a;
    }

    public static String b(int i) {
        try {
            if (b) {
                if (c(i)) {
                    return new String(Character.toChars(65535 & i));
                }
            }
            return new String(Character.toChars(i));
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public static CharSequence a(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = a;
        if (charSequence == null) {
            try {
                throw new NullPointerException(z[1]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            try {
                throw new IndexOutOfBoundsException();
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        w_ com_whatsapp_akl = new akl(charSequence);
        int i4 = 0;
        length = i;
        while (length < i2) {
            com_whatsapp_akl.a(length);
            length += com_whatsapp_akl.a(length, er.a(com_whatsapp_akl));
            i4++;
            if (i4 >= i3) {
                return charSequence.subSequence(i, length);
            }
        }
        if (!z) {
            return null;
        }
        WAAppCompatActivity.c++;
        return null;
    }

    public static String b(CharSequence charSequence) {
        return a(charSequence, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.CharSequence r10) {
        /*
        r1 = 0;
        r3 = a;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = new com.whatsapp.akl;
        r5.<init>(r10);
        r6 = r10.length();
        r2 = r1;
    L_0x0012:
        if (r2 >= r6) goto L_0x0041;
    L_0x0014:
        r5.a(r2);
        r7 = com.whatsapp.er.a(r5);
        r8 = r5.a(r2, r7);
        r0 = -1;
        if (r7 == r0) goto L_0x0034;
    L_0x0022:
        r0 = r1;
    L_0x0023:
        r9 = com.whatsapp.er.b(r7);
        if (r0 >= r9) goto L_0x0032;
    L_0x0029:
        r9 = 32;
        r4.append(r9);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0023;
    L_0x0032:
        if (r3 == 0) goto L_0x003d;
    L_0x0034:
        r0 = r2 + r8;
        r0 = r10.subSequence(r2, r0);	 Catch:{ NullPointerException -> 0x0046 }
        r4.append(r0);	 Catch:{ NullPointerException -> 0x0046 }
    L_0x003d:
        r0 = r2 + r8;
        if (r3 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r4.toString();
        return r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r2 = r0;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.a(java.lang.CharSequence):java.lang.String");
    }

    static boolean a() {
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r9 = 73;
        r7 = 56;
        r8 = 21;
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = " LgMtn\u0018{\u0018%?";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x0012:
        r2 = r2.toCharArray();
        r10 = r2.length;
        r11 = r10;
        r12 = r1;
        r10 = r2;
    L_0x001a:
        if (r11 > r12) goto L_0x005d;
    L_0x001c:
        r2 = new java.lang.String;
        r2.<init>(r10);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x0032;
            default: goto L_0x0028;
        };
    L_0x0028:
        r5[r3] = r2;
        r0 = " LgMtn\u0018{\u0018%?";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x0012;
    L_0x0032:
        r5[r3] = r2;
        z = r6;
        r6 = android.os.Build.MANUFACTURER;	 Catch:{ NullPointerException -> 0x0091 }
        r0 = "\u0000W{\u0014";
        r0 = r0.toCharArray();
        r2 = r0.length;
        r3 = r2;
        r5 = r1;
        r2 = r0;
    L_0x0043:
        if (r3 > r5) goto L_0x0077;
    L_0x0045:
        r0 = new java.lang.String;
        r0.<init>(r2);
        r0 = r0.intern();
        r0 = r6.startsWith(r0);	 Catch:{ NullPointerException -> 0x0091 }
        if (r0 == 0) goto L_0x0095;
    L_0x0054:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x0093 }
        r2 = 19;
        if (r0 >= r2) goto L_0x0095;
    L_0x005a:
        b = r4;
        return;
    L_0x005d:
        r13 = r10[r12];
        r2 = r12 % 5;
        switch(r2) {
            case 0: goto L_0x006d;
            case 1: goto L_0x0070;
            case 2: goto L_0x0072;
            case 3: goto L_0x0074;
            default: goto L_0x0064;
        };
    L_0x0064:
        r2 = r9;
    L_0x0065:
        r2 = r2 ^ r13;
        r2 = (char) r2;
        r10[r12] = r2;
        r2 = r12 + 1;
        r12 = r2;
        goto L_0x001a;
    L_0x006d:
        r2 = 83;
        goto L_0x0065;
    L_0x0070:
        r2 = r7;
        goto L_0x0065;
    L_0x0072:
        r2 = r8;
        goto L_0x0065;
    L_0x0074:
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x0065;
    L_0x0077:
        r10 = r2[r5];
        r0 = r5 % 5;
        switch(r0) {
            case 0: goto L_0x0087;
            case 1: goto L_0x008a;
            case 2: goto L_0x008c;
            case 3: goto L_0x008e;
            default: goto L_0x007e;
        };
    L_0x007e:
        r0 = r9;
    L_0x007f:
        r0 = r0 ^ r10;
        r0 = (char) r0;
        r2[r5] = r0;
        r0 = r5 + 1;
        r5 = r0;
        goto L_0x0043;
    L_0x0087:
        r0 = 83;
        goto L_0x007f;
    L_0x008a:
        r0 = r7;
        goto L_0x007f;
    L_0x008c:
        r0 = r8;
        goto L_0x007f;
    L_0x008e:
        r0 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x007f;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r4 = r1;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.<clinit>():void");
    }

    public static SpannableStringBuilder a(String str, Context context, Paint paint, float f, la laVar) {
        jq a;
        if (paint == null) {
            try {
                a = kj.a();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        a = new kc(paint, f);
        return a(str, context, a, laVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.CharSequence r9, boolean r10) {
        /*
        r1 = a;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = new com.whatsapp.akl;
        r3.<init>(r9);
        r4 = r9.length();
        r0 = 0;
    L_0x0011:
        if (r0 >= r4) goto L_0x006d;
    L_0x0013:
        r3.a(r0);
        r5 = com.whatsapp.er.a(r3);
        r6 = r3.a(r0, r5);
        r7 = -1;
        if (r5 == r7) goto L_0x0061;
    L_0x0021:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x0072 }
        r8 = 16;
        if (r7 < r8) goto L_0x0029;
    L_0x0027:
        if (r10 == 0) goto L_0x0030;
    L_0x0029:
        r7 = 9633; // 0x25a1 float:1.3499E-41 double:4.7593E-320;
        r2.append(r7);	 Catch:{ NullPointerException -> 0x0076 }
        if (r1 == 0) goto L_0x006a;
    L_0x0030:
        r5 = com.whatsapp.er.b(r5);	 Catch:{ NullPointerException -> 0x0076 }
        r7 = 1;
        if (r5 != r7) goto L_0x005a;
    L_0x0037:
        r3.a(r0);
        r5 = r3.a();
        r7 = com.whatsapp.ad7.a(r5);	 Catch:{ NullPointerException -> 0x0078 }
        if (r7 != 0) goto L_0x004a;
    L_0x0044:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x007a }
        r8 = 19;
        if (r7 < r8) goto L_0x0053;
    L_0x004a:
        r5 = java.lang.Character.toChars(r5);	 Catch:{ NullPointerException -> 0x007c }
        r2.append(r5);	 Catch:{ NullPointerException -> 0x007c }
        if (r1 == 0) goto L_0x0058;
    L_0x0053:
        r5 = 9633; // 0x25a1 float:1.3499E-41 double:4.7593E-320;
        r2.append(r5);	 Catch:{ NullPointerException -> 0x007c }
    L_0x0058:
        if (r1 == 0) goto L_0x006a;
    L_0x005a:
        r5 = 9633; // 0x25a1 float:1.3499E-41 double:4.7593E-320;
        r2.append(r5);	 Catch:{ NullPointerException -> 0x007e }
        if (r1 == 0) goto L_0x006a;
    L_0x0061:
        r5 = r0 + r6;
        r5 = r9.subSequence(r0, r5);	 Catch:{ NullPointerException -> 0x007e }
        r2.append(r5);	 Catch:{ NullPointerException -> 0x007e }
    L_0x006a:
        r0 = r0 + r6;
        if (r1 == 0) goto L_0x0011;
    L_0x006d:
        r0 = r2.toString();
        return r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.a(java.lang.CharSequence, boolean):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.text.Editable r10, android.content.Context r11, android.graphics.Paint r12) {
        /*
        r9 = 1;
        r3 = 0;
        r4 = a;
        r0 = c;	 Catch:{ NullPointerException -> 0x0009 }
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        return;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        c = r9;
        r1 = r10.toString();
        r0 = r1.length();
        r2 = android.text.style.ImageSpan.class;
        r0 = r10.getSpans(r3, r0, r2);
        r0 = (android.text.style.ImageSpan[]) r0;
        r5 = r0.length;
        r2 = r3;
    L_0x001f:
        if (r2 >= r5) goto L_0x002a;
    L_0x0021:
        r6 = r0[r2];
        r10.removeSpan(r6);
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x001f;
    L_0x002a:
        r0 = b;
        if (r0 == 0) goto L_0x00c9;
    L_0x002e:
        r5 = r1.length();
        r2 = r3;
        r0 = r3;
    L_0x0034:
        if (r2 >= r5) goto L_0x0056;
    L_0x0036:
        r6 = r1.codePointAt(r2);
        r7 = java.lang.Character.charCount(r6);
        if (r7 <= r9) goto L_0x0052;
    L_0x0040:
        r8 = c(r6);	 Catch:{ NullPointerException -> 0x00c3 }
        if (r8 == 0) goto L_0x0052;
    L_0x0046:
        r8 = r0 + r7;
        r6 = b(r6);
        r10.replace(r0, r8, r6);
        r6 = r7 + -1;
        r0 = r0 - r6;
    L_0x0052:
        r2 = r2 + r7;
        r0 = r0 + r7;
        if (r4 == 0) goto L_0x0034;
    L_0x0056:
        r0 = r10.toString();
    L_0x005a:
        r5 = new com.whatsapp.akl;
        r5.<init>(r0);
        r6 = r0.length();
        r2 = r3;
    L_0x0064:
        if (r2 >= r6) goto L_0x00bf;
    L_0x0066:
        r5.a(r2);
        r0 = com.whatsapp.er.a(r5);
        r7 = r5.a(r2, r0);
        r1 = -1;
        if (r0 == r1) goto L_0x00bb;
    L_0x0074:
        r8 = com.whatsapp._3.a(r11, r0);
        if (r8 == 0) goto L_0x00bb;
    L_0x007a:
        r0 = 0;
        if (r12 == 0) goto L_0x00c7;
    L_0x007d:
        r0 = r12.getFontMetricsInt();
        r1 = r0;
    L_0x0082:
        if (r1 == 0) goto L_0x009a;
    L_0x0084:
        r0 = r12.getTextSize();
        r9 = 1067869798; // 0x3fa66666 float:1.3 double:5.275977814E-315;
        r0 = r0 * r9;
        r9 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r9;
        r0 = (int) r0;
        r8.setBounds(r3, r3, r0, r0);
        r0 = new com.whatsapp.ao7;
        r0.<init>(r8, r1);
        if (r4 == 0) goto L_0x00b4;
    L_0x009a:
        r0 = com.whatsapp.a4d.a();
        r0 = r0.b(r11);
        r0 = (int) r0;
        r1 = com.whatsapp.a4d.a();
        r1 = r1.b(r11);
        r1 = (int) r1;
        r8.setBounds(r3, r3, r0, r1);
        r0 = new android.text.style.ImageSpan;
        r0.<init>(r8, r3);
    L_0x00b4:
        r1 = r2 + r7;
        r8 = 33;
        r10.setSpan(r0, r2, r1, r8);
    L_0x00bb:
        r0 = r2 + r7;
        if (r4 == 0) goto L_0x00c5;
    L_0x00bf:
        c = r3;
        goto L_0x0008;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r2 = r0;
        goto L_0x0064;
    L_0x00c7:
        r1 = r0;
        goto L_0x0082;
    L_0x00c9:
        r0 = r1;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.a(android.text.Editable, android.content.Context, android.graphics.Paint):void");
    }

    public static int c(CharSequence charSequence) {
        return a(charSequence, 0, charSequence.length());
    }

    public static SpannableStringBuilder a(String str, Context context) {
        return a(str, context, kj.a(), null);
    }

    public static int d(int i) {
        try {
            if (b) {
                return 1;
            }
            return Character.charCount(i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.SpannableStringBuilder a(java.lang.String r16, android.content.Context r17, com.whatsapp.jq r18, com.whatsapp.la r19) {
        /*
        r11 = a;
        if (r16 != 0) goto L_0x0006;
    L_0x0004:
        r2 = 0;
    L_0x0005:
        return r2;
    L_0x0006:
        r4 = 0;
        r9 = 0;
        r12 = new com.whatsapp.akl;
        r0 = r16;
        r12.<init>(r0);
        r3 = 0;
        r13 = r16.length();
        r2 = 0;
        r10 = r2;
        r2 = r4;
    L_0x0017:
        if (r10 >= r13) goto L_0x00c1;
    L_0x0019:
        r12.a(r10);
        r4 = com.whatsapp.er.a(r12);
        r14 = r12.a(r10, r4);
        r5 = -1;
        if (r4 == r5) goto L_0x0099;
    L_0x0027:
        if (r2 != 0) goto L_0x0030;
    L_0x0029:
        r2 = new android.text.SpannableStringBuilder;
        r0 = r16;
        r2.<init>(r0);
    L_0x0030:
        r0 = r17;
        r4 = com.whatsapp._3.a(r0, r4);
        if (r4 == 0) goto L_0x008e;
    L_0x0038:
        r0 = r18;
        r5 = r0.a(r4);
        if (r5 != 0) goto L_0x0050;
    L_0x0040:
        r5 = new android.text.style.ImageSpan;
        r0 = r18;
        r1 = r17;
        r4 = r0.a(r4, r1);
        r6 = 0;
        r5.<init>(r4, r6);
        if (r11 == 0) goto L_0x00cb;
    L_0x0050:
        r4 = r5 instanceof com.whatsapp.ao7;	 Catch:{ NullPointerException -> 0x0091 }
        if (r4 == 0) goto L_0x00c9;
    L_0x0054:
        r0 = r5;
        r0 = (com.whatsapp.ao7) r0;	 Catch:{ NullPointerException -> 0x0091 }
        r4 = r0;
        r4.a(r3);	 Catch:{ NullPointerException -> 0x0091 }
        r8 = r5;
    L_0x005c:
        r4 = b;
        if (r4 == 0) goto L_0x007a;
    L_0x0060:
        r4 = r3 + r14;
        r5 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r5 = java.lang.Character.toString(r5);
        r6 = 0;
        r7 = 1;
        r2.replace(r3, r4, r5, r6, r7);
        r4 = r3 + 1;
        r5 = 33;
        r2.setSpan(r8, r3, r4, r5);
        r4 = r14 + -1;
        r3 = r3 - r4;
        if (r11 == 0) goto L_0x0081;
    L_0x007a:
        r4 = r3 + r14;
        r5 = 33;
        r2.setSpan(r8, r3, r4, r5);	 Catch:{ NullPointerException -> 0x0093 }
    L_0x0081:
        if (r19 == 0) goto L_0x008c;
    L_0x0083:
        r4 = 1;
        r0 = r19;
        r4 = r0.a(r4, r10);	 Catch:{ NullPointerException -> 0x0095 }
        if (r4 == 0) goto L_0x0005;
    L_0x008c:
        if (r11 == 0) goto L_0x0097;
    L_0x008e:
        r2 = 0;
        goto L_0x0005;
    L_0x0091:
        r2 = move-exception;
        throw r2;
    L_0x0093:
        r2 = move-exception;
        throw r2;
    L_0x0095:
        r2 = move-exception;
        throw r2;
    L_0x0097:
        if (r11 == 0) goto L_0x00a5;
    L_0x0099:
        r9 = 1;
        if (r19 == 0) goto L_0x00a5;
    L_0x009c:
        r4 = 0;
        r0 = r19;
        r4 = r0.a(r4, r10);	 Catch:{ NullPointerException -> 0x00bf }
        if (r4 == 0) goto L_0x0005;
    L_0x00a5:
        r4 = r3;
        r3 = r2;
        r2 = r9;
        r5 = r4 + r14;
        r4 = r10 + r14;
        if (r11 == 0) goto L_0x00c3;
    L_0x00ae:
        r15 = r2;
        r2 = r3;
        r3 = r15;
    L_0x00b1:
        if (r2 == 0) goto L_0x0005;
    L_0x00b3:
        if (r3 != 0) goto L_0x0005;
    L_0x00b5:
        r3 = " ";
        r2.append(r3);	 Catch:{ NullPointerException -> 0x00bd }
        goto L_0x0005;
    L_0x00bd:
        r2 = move-exception;
        throw r2;
    L_0x00bf:
        r2 = move-exception;
        throw r2;
    L_0x00c1:
        r3 = r9;
        goto L_0x00b1;
    L_0x00c3:
        r10 = r4;
        r9 = r2;
        r2 = r3;
        r3 = r5;
        goto L_0x0017;
    L_0x00c9:
        r8 = r5;
        goto L_0x005c;
    L_0x00cb:
        r8 = r5;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a28.a(java.lang.String, android.content.Context, com.whatsapp.jq, com.whatsapp.la):android.text.SpannableStringBuilder");
    }

    public static SpannableStringBuilder a(String str, Context context, Paint paint, la laVar) {
        return a(str, context, paint, 1.0f, laVar);
    }

    public static SpannableStringBuilder b(String str, Context context, Paint paint, float f) {
        return a(str, context, paint, f, null);
    }
}
