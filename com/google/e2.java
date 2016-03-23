package com.google;

import android.text.TextUtils;
import com.whatsapp.arj;
import com.whatsapp.i7;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class e2 {
    private static final Pattern A;
    private static final Logger B;
    static final String C;
    private static final Map D;
    private static final Pattern E;
    public static int F;
    static final Pattern H;
    static final Pattern I;
    private static final String[] J;
    private static final Pattern a;
    private static final Map b;
    private static final Pattern c;
    private static final Pattern f;
    static final Pattern g;
    private static final Map h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final String l;
    private static final String n;
    private static final Pattern p;
    private static final Pattern r;
    private static final Map s;
    private static final Pattern t;
    private static final String u;
    private static e2 v;
    static final Pattern w;
    private static final Pattern z;
    private final Set G;
    private final Map d;
    private final Set e;
    private Map m;
    private aa o;
    private final Map q;
    private final Set x;
    private String y;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 110;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 43);
        }
        return toCharArray;
    }

    public String e(ae aeVar) {
        int n = aeVar.n();
        List list = (List) this.m.get(Integer.valueOf(n));
        if (list == null) {
            B.log(Level.WARNING, J[15] + n + J[14] + b(aeVar));
            return null;
        }
        try {
            return list.size() == 1 ? (String) list.get(0) : a(aeVar, list);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private bw a(String str, ho hoVar) {
        ha X = hoVar.X();
        try {
            if (X.e()) {
                if (a(str, X)) {
                    try {
                        if (a(str, hoVar.w())) {
                            return bw.PREMIUM_RATE;
                        }
                        try {
                            if (a(str, hoVar.J())) {
                                return bw.TOLL_FREE;
                            }
                            try {
                                if (a(str, hoVar.x())) {
                                    return bw.SHARED_COST;
                                }
                                try {
                                    if (a(str, hoVar.T())) {
                                        return bw.VOIP;
                                    }
                                    try {
                                        if (a(str, hoVar.F())) {
                                            return bw.PERSONAL_NUMBER;
                                        }
                                        try {
                                            if (a(str, hoVar.j())) {
                                                return bw.PAGER;
                                            }
                                            try {
                                                if (a(str, hoVar.ab())) {
                                                    return bw.UAN;
                                                }
                                                try {
                                                    if (a(str, hoVar.b())) {
                                                        return bw.VOICEMAIL;
                                                    }
                                                    if (a(str, hoVar.ae())) {
                                                        try {
                                                            if (hoVar.A()) {
                                                                return bw.FIXED_LINE_OR_MOBILE;
                                                            }
                                                            try {
                                                                if (a(str, hoVar.u())) {
                                                                    return bw.FIXED_LINE_OR_MOBILE;
                                                                }
                                                                return bw.FIXED_LINE;
                                                            } catch (RuntimeException e) {
                                                                throw e;
                                                            }
                                                        } catch (RuntimeException e2) {
                                                            throw e2;
                                                        }
                                                    }
                                                    try {
                                                        if (!hoVar.A()) {
                                                            if (a(str, hoVar.u())) {
                                                                return bw.MOBILE;
                                                            }
                                                        }
                                                        return bw.UNKNOWN;
                                                    } catch (RuntimeException e22) {
                                                        throw e22;
                                                    } catch (RuntimeException e222) {
                                                        throw e222;
                                                    }
                                                } catch (RuntimeException e2222) {
                                                    throw e2222;
                                                }
                                            } catch (RuntimeException e22222) {
                                                throw e22222;
                                            }
                                        } catch (RuntimeException e222222) {
                                            throw e222222;
                                        }
                                    } catch (RuntimeException e2222222) {
                                        throw e2222222;
                                    }
                                } catch (RuntimeException e22222222) {
                                    throw e22222222;
                                }
                            } catch (RuntimeException e222222222) {
                                throw e222222222;
                            }
                        } catch (RuntimeException e2222222222) {
                            throw e2222222222;
                        }
                    } catch (RuntimeException e22222222222) {
                        throw e22222222222;
                    }
                }
            }
            return bw.UNKNOWN;
        } catch (RuntimeException e222222222222) {
            throw e222222222222;
        } catch (RuntimeException e2222222222222) {
            throw e2222222222222;
        }
    }

    public String a(ae aeVar, e5 e5Var) {
        try {
            if (aeVar.u() == 0 && aeVar.i()) {
                String q = aeVar.q();
                try {
                    if (q.length() > 0) {
                        return q;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(20);
            a(aeVar, e5Var, stringBuilder);
            return stringBuilder.toString();
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    int a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        int i = F;
        try {
            if (stringBuilder.length() != 0) {
                if (stringBuilder.charAt(0) != '0') {
                    int length = stringBuilder.length();
                    int i2 = 1;
                    while (i2 <= 3 && i2 <= length) {
                        int parseInt = Integer.parseInt(stringBuilder.substring(0, i2));
                        try {
                            if (this.m.containsKey(Integer.valueOf(parseInt))) {
                                stringBuilder2.append(stringBuilder.substring(i2));
                                return parseInt;
                            }
                            parseInt = i2 + 1;
                            if (i != 0) {
                                break;
                            }
                            i2 = parseInt;
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    return 0;
                }
            }
            return 0;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r6, com.google.b5 r7, com.google.e5 r8, java.lang.String r9) {
        /*
        r5 = this;
        r2 = F;
        r0 = r7.e();
        r1 = r5.o;
        r3 = r7.i();
        r1 = r1.a(r3);
        r3 = r1.matcher(r6);
        r1 = "";
        r1 = com.google.e5.NATIONAL;	 Catch:{ RuntimeException -> 0x0092 }
        if (r8 != r1) goto L_0x004b;
    L_0x001b:
        if (r9 == 0) goto L_0x004b;
    L_0x001d:
        r1 = r9.length();	 Catch:{ RuntimeException -> 0x0096 }
        if (r1 <= 0) goto L_0x004b;
    L_0x0023:
        r1 = r7.d();	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1.length();	 Catch:{ RuntimeException -> 0x0096 }
        if (r1 <= 0) goto L_0x004b;
    L_0x002d:
        r1 = r7.d();
        r4 = f;
        r1 = r4.matcher(r1);
        r1 = r1.replaceFirst(r9);
        r4 = z;
        r0 = r4.matcher(r0);
        r0 = r0.replaceFirst(r1);
        r1 = r3.replaceAll(r0);
        if (r2 == 0) goto L_0x009c;
    L_0x004b:
        r1 = r7.k();
        r4 = com.google.e5.NATIONAL;	 Catch:{ RuntimeException -> 0x0098 }
        if (r8 != r4) goto L_0x006b;
    L_0x0053:
        if (r1 == 0) goto L_0x006b;
    L_0x0055:
        r4 = r1.length();	 Catch:{ RuntimeException -> 0x009a }
        if (r4 <= 0) goto L_0x006b;
    L_0x005b:
        r4 = z;
        r4 = r4.matcher(r0);
        r1 = r4.replaceFirst(r1);
        r1 = r3.replaceAll(r1);
        if (r2 == 0) goto L_0x009c;
    L_0x006b:
        r0 = r3.replaceAll(r0);
    L_0x006f:
        r1 = com.google.e5.RFC3966;
        if (r8 != r1) goto L_0x0091;
    L_0x0073:
        r1 = p;
        r1 = r1.matcher(r0);
        r2 = r1.lookingAt();
        if (r2 == 0) goto L_0x0086;
    L_0x007f:
        r0 = "";
        r0 = r1.replaceFirst(r0);
    L_0x0086:
        r0 = r1.reset(r0);
        r1 = "-";
        r0 = r0.replaceAll(r1);
    L_0x0091:
        return r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = r1;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, com.google.b5, com.google.e5, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int a(java.lang.String r8, com.google.ho r9, java.lang.StringBuilder r10, boolean r11, com.google.ae r12) {
        /*
        r7 = this;
        r1 = 0;
        r0 = r8.length();	 Catch:{ RuntimeException -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r1;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r2 = new java.lang.StringBuilder;
        r2.<init>(r8);
        r0 = J;
        r3 = 25;
        r0 = r0[r3];
        if (r9 == 0) goto L_0x001c;
    L_0x0018:
        r0 = r9.a();
    L_0x001c:
        r0 = r7.a(r2, r0);
        if (r11 == 0) goto L_0x0025;
    L_0x0022:
        r12.a(r0);	 Catch:{ RuntimeException -> 0x0040 }
    L_0x0025:
        r3 = com.google.aw.FROM_DEFAULT_COUNTRY;	 Catch:{ RuntimeException -> 0x0042 }
        if (r0 == r3) goto L_0x005e;
    L_0x0029:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x003e }
        r1 = 2;
        if (r0 > r1) goto L_0x0044;
    L_0x0030:
        r0 = new com.google.ao;	 Catch:{ RuntimeException -> 0x003e }
        r1 = com.google.dk.TOO_SHORT_AFTER_IDD;	 Catch:{ RuntimeException -> 0x003e }
        r2 = J;	 Catch:{ RuntimeException -> 0x003e }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x003e }
        r0.<init>(r1, r2);	 Catch:{ RuntimeException -> 0x003e }
        throw r0;	 Catch:{ RuntimeException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0044:
        r0 = r7.a(r2, r10);
        if (r0 == 0) goto L_0x0050;
    L_0x004a:
        r12.a(r0);	 Catch:{ RuntimeException -> 0x004e }
        goto L_0x0008;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = new com.google.ao;
        r1 = com.google.dk.INVALID_COUNTRY_CODE;
        r2 = J;
        r3 = 24;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        throw r0;
    L_0x005e:
        if (r9 == 0) goto L_0x00d2;
    L_0x0060:
        r0 = r9.L();
        r3 = java.lang.String.valueOf(r0);
        r4 = r2.toString();
        r5 = r4.startsWith(r3);
        if (r5 == 0) goto L_0x00d2;
    L_0x0072:
        r5 = new java.lang.StringBuilder;
        r3 = r3.length();
        r3 = r4.substring(r3);
        r5.<init>(r3);
        r3 = r9.X();
        r4 = r7.o;
        r6 = r3.g();
        r4 = r4.a(r6);
        r6 = 0;
        r7.a(r5, r9, r6);
        r6 = r7.o;
        r3 = r3.f();
        r3 = r6.a(r3);
        r6 = r4.matcher(r2);	 Catch:{ RuntimeException -> 0x00ca }
        r6 = r6.matches();	 Catch:{ RuntimeException -> 0x00ca }
        if (r6 != 0) goto L_0x00af;
    L_0x00a5:
        r4 = r4.matcher(r5);	 Catch:{ RuntimeException -> 0x00cc }
        r4 = r4.matches();	 Catch:{ RuntimeException -> 0x00cc }
        if (r4 != 0) goto L_0x00bb;
    L_0x00af:
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x00ce }
        r2 = r7.a(r3, r2);	 Catch:{ RuntimeException -> 0x00ce }
        r3 = com.google.dz.TOO_LONG;	 Catch:{ RuntimeException -> 0x00ce }
        if (r2 != r3) goto L_0x00d2;
    L_0x00bb:
        r10.append(r5);	 Catch:{ RuntimeException -> 0x00d0 }
        if (r11 == 0) goto L_0x00c5;
    L_0x00c0:
        r1 = com.google.aw.FROM_NUMBER_WITHOUT_PLUS_SIGN;	 Catch:{ RuntimeException -> 0x00d0 }
        r12.a(r1);	 Catch:{ RuntimeException -> 0x00d0 }
    L_0x00c5:
        r12.a(r0);
        goto L_0x0008;
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r12.a(r1);
        r0 = r1;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, com.google.ho, java.lang.StringBuilder, boolean, com.google.ae):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.google.ae r7, java.lang.String r8) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r2 = r7.n();
        r3 = r6.a(r2, r8);
        if (r3 == 0) goto L_0x001e;
    L_0x000c:
        r4 = J;	 Catch:{ RuntimeException -> 0x0020 }
        r5 = 31;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0020 }
        r4 = r4.equals(r8);	 Catch:{ RuntimeException -> 0x0020 }
        if (r4 != 0) goto L_0x0024;
    L_0x0018:
        r4 = r6.k(r8);	 Catch:{ RuntimeException -> 0x0022 }
        if (r2 == r4) goto L_0x0024;
    L_0x001e:
        r0 = r1;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r2 = r3.X();
        r4 = r6.b(r7);
        r2 = r2.e();
        if (r2 != 0) goto L_0x003f;
    L_0x0032:
        r2 = r4.length();
        r3 = 2;
        if (r2 <= r3) goto L_0x003d;
    L_0x0039:
        r3 = 16;
        if (r2 <= r3) goto L_0x001f;
    L_0x003d:
        r0 = r1;
        goto L_0x001f;
    L_0x003f:
        r2 = r6.a(r4, r3);	 Catch:{ RuntimeException -> 0x0049 }
        r3 = com.google.bw.UNKNOWN;	 Catch:{ RuntimeException -> 0x0049 }
        if (r2 != r3) goto L_0x001f;
    L_0x0047:
        r0 = r1;
        goto L_0x001f;
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(com.google.ae, java.lang.String):boolean");
    }

    public d5 b(ae aeVar, ae aeVar2) {
        ae aeVar3 = new ae();
        aeVar3.a(aeVar);
        ae aeVar4 = new ae();
        try {
            aeVar4.a(aeVar2);
            aeVar3.v();
            aeVar3.l();
            aeVar3.s();
            aeVar4.v();
            aeVar4.l();
            aeVar4.s();
            if (aeVar3.o()) {
                if (aeVar3.r().length() == 0) {
                    aeVar3.d();
                }
            }
            try {
                if (aeVar4.o()) {
                    if (aeVar4.r().length() == 0) {
                        aeVar4.d();
                    }
                }
                try {
                    if (aeVar3.o()) {
                        if (aeVar4.o()) {
                            try {
                                if (!aeVar3.r().equals(aeVar4.r())) {
                                    return d5.NO_MATCH;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                    }
                    int n = aeVar3.n();
                    int n2 = aeVar4.n();
                    if (n == 0 || n2 == 0) {
                        try {
                            aeVar3.a(n2);
                            if (aeVar3.b(aeVar4)) {
                                return d5.NSN_MATCH;
                            }
                            try {
                                if (a(aeVar3, aeVar4)) {
                                    return d5.SHORT_NSN_MATCH;
                                }
                                return d5.NO_MATCH;
                            } catch (RuntimeException e2) {
                                throw e2;
                            }
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    }
                    try {
                        if (aeVar3.b(aeVar4)) {
                            return d5.EXACT_MATCH;
                        }
                        if (n == n2) {
                            try {
                                if (a(aeVar3, aeVar4)) {
                                    return d5.SHORT_NSN_MATCH;
                                }
                            } catch (RuntimeException e222) {
                                throw e222;
                            }
                        }
                        return d5.NO_MATCH;
                    } catch (RuntimeException e2222) {
                        throw e2222;
                    }
                } catch (RuntimeException e22222) {
                    throw e22222;
                } catch (RuntimeException e222222) {
                    throw e222222;
                }
            } catch (RuntimeException e2222222) {
                throw e2222222;
            } catch (RuntimeException e22222222) {
                throw e22222222;
            }
        } catch (RuntimeException e222222222) {
            throw e222222222;
        } catch (RuntimeException e2222222222) {
            throw e2222222222;
        }
    }

    private static String c(String str) {
        return J[11] + str + J[7] + J[8] + J[10] + J[12] + J[5] + J[6] + J[9];
    }

    public boolean c(ae aeVar) {
        try {
            return a(aeVar) == dz.IS_POSSIBLE;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r2, java.lang.String r3) {
        /*
        r1 = this;
        r0 = r1.i(r3);	 Catch:{ RuntimeException -> 0x001c }
        if (r0 != 0) goto L_0x0024;
    L_0x0006:
        if (r2 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x0020 }
        if (r0 == 0) goto L_0x001a;
    L_0x000e:
        r0 = g;	 Catch:{ RuntimeException -> 0x0022 }
        r0 = r0.matcher(r2);	 Catch:{ RuntimeException -> 0x0022 }
        r0 = r0.lookingAt();	 Catch:{ RuntimeException -> 0x0022 }
        if (r0 != 0) goto L_0x0024;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = 1;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, java.lang.String):boolean");
    }

    public void a(ae aeVar, e5 e5Var, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int n = aeVar.n();
        String b = b(aeVar);
        try {
            if (e5Var == e5.E164) {
                stringBuilder.append(b);
                a(n, e5.E164, stringBuilder);
                return;
            }
            try {
                if (c(n)) {
                    ho a = a(n, b(n));
                    stringBuilder.append(a(b, a, e5Var));
                    a(aeVar, a, e5Var, stringBuilder);
                    a(n, e5Var, stringBuilder);
                    return;
                }
                stringBuilder.append(b);
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public void a(String str, String str2, ae aeVar) {
        a(str, str2, false, true, aeVar);
    }

    void a(String str, String str2, int i) {
        int i2 = F;
        boolean equals = J[21].equals(str2);
        try {
            i7 b = u0.b(str2);
            if (b == null) {
                try {
                    throw new RuntimeException(J[18] + str2);
                } catch (IOException e) {
                    throw e;
                }
            }
            ho hoVar = new ho();
            hoVar.a(b.d);
            hoVar.b(b.c);
            hoVar.g(b.a);
            if (b.j != null) {
                int i3 = 0;
                while (i3 < b.j.length) {
                    b5 b5Var = new b5();
                    try {
                        b5Var.d(b.j[i3]);
                        b5Var.a(b.l[i3]);
                        if (b.k != null) {
                            if (i3 < b.k.length) {
                                try {
                                    if (!(b.k[i3] == null || b.k[i3].equals(J[20]))) {
                                        String[] split = TextUtils.split(b.k[i3], "#");
                                        int length = split.length;
                                        int i4 = 0;
                                        while (i4 < length) {
                                            b5Var.c(split[i4]);
                                            i4++;
                                            if (i2 != 0) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw e2;
                                }
                            }
                        }
                        hoVar.a(b5Var);
                        hoVar.b(b5Var);
                        i3++;
                        if (i2 != 0) {
                            break;
                        }
                    } catch (IOException e22) {
                        throw e22;
                    } catch (IOException e222) {
                        throw e222;
                    }
                }
            }
            if (equals) {
                try {
                    this.d.put(Integer.valueOf(i), hoVar);
                    if (i2 == 0) {
                        return;
                    }
                } catch (IOException e2222) {
                    throw e2222;
                }
            }
            this.q.put(str2, hoVar);
        } catch (IOException e3) {
            throw new RuntimeException(J[19] + str2);
        }
    }

    private String a(ae aeVar, List list) {
        int i = F;
        String b = b(aeVar);
        for (String str : list) {
            ho e = e(str);
            try {
                if (!e.g()) {
                    try {
                        if (a(b, e) != bw.UNKNOWN) {
                            return str;
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } else if (this.o.a(e.h()).matcher(b).lookingAt()) {
                    return str;
                }
                if (i != 0) {
                    break;
                }
            } catch (RuntimeException e22) {
                throw e22;
            } catch (RuntimeException e222) {
                throw e222;
            }
        }
        return null;
    }

    static boolean b(String str) {
        try {
            if (str.length() < 2) {
                return false;
            }
            return i.matcher(str).matches();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private boolean a(ae aeVar, ae aeVar2) {
        String valueOf = String.valueOf(aeVar.u());
        String valueOf2 = String.valueOf(aeVar2.u());
        try {
            if (!valueOf.endsWith(valueOf2)) {
                if (!valueOf2.endsWith(valueOf)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public static String g(String str) {
        return a(str, false).toString();
    }

    private int k(String str) {
        ho e = e(str);
        if (e != null) {
            return e.L();
        }
        try {
            throw new IllegalArgumentException(J[17] + str);
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public d5 b(ae aeVar, String str) {
        try {
            return b(aeVar, b(str, J[2]));
        } catch (ao e) {
            if (e.a() == dk.INVALID_COUNTRY_CODE) {
                String b = b(aeVar.n());
                try {
                    if (b.equals(J[3])) {
                        ae aeVar2 = new ae();
                        a(str, null, false, false, aeVar2);
                        return b(aeVar, aeVar2);
                    }
                    d5 b2 = b(aeVar, b(str, b));
                    if (b2 == d5.EXACT_MATCH) {
                        return d5.NSN_MATCH;
                    }
                    return b2;
                } catch (ao e2) {
                    return d5.NOT_A_NUMBER;
                }
            }
            return d5.NOT_A_NUMBER;
        }
    }

    public ae b(String str, String str2) {
        ae aeVar = new ae();
        a(str, str2, aeVar);
        return aeVar;
    }

    aw a(StringBuilder stringBuilder, String str) {
        try {
            if (stringBuilder.length() == 0) {
                return aw.FROM_DEFAULT_COUNTRY;
            }
            Matcher matcher = g.matcher(stringBuilder);
            try {
                if (matcher.lookingAt()) {
                    stringBuilder.delete(0, matcher.end());
                    a(stringBuilder);
                    return aw.FROM_NUMBER_WITH_PLUS_SIGN;
                }
                Pattern a = this.o.a(str);
                try {
                    a(stringBuilder);
                    return a(a, stringBuilder) ? aw.FROM_NUMBER_WITH_IDD : aw.FROM_DEFAULT_COUNTRY;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private boolean c(int i) {
        return this.m.containsKey(Integer.valueOf(i));
    }

    static String a(String str) {
        try {
            return c.matcher(str).matches() ? a(str, s, true) : g(str);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.StringBuilder a(java.lang.String r8, boolean r9) {
        /*
        r1 = F;
        r2 = new java.lang.StringBuilder;
        r0 = r8.length();
        r2.<init>(r0);
        r3 = r8.toCharArray();
        r4 = r3.length;
        r0 = 0;
    L_0x0011:
        if (r0 >= r4) goto L_0x002c;
    L_0x0013:
        r5 = r3[r0];
        r6 = 10;
        r6 = java.lang.Character.digit(r5, r6);
        r7 = -1;
        if (r6 == r7) goto L_0x0023;
    L_0x001e:
        r2.append(r6);	 Catch:{ RuntimeException -> 0x002d }
        if (r1 == 0) goto L_0x0028;
    L_0x0023:
        if (r9 == 0) goto L_0x0028;
    L_0x0025:
        r2.append(r5);	 Catch:{ RuntimeException -> 0x002f }
    L_0x0028:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0011;
    L_0x002c:
        return r2;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, boolean):java.lang.StringBuilder");
    }

    public String b(int i) {
        List list = (List) this.m.get(Integer.valueOf(i));
        if (list != null) {
            return (String) list.get(0);
        }
        try {
            return J[23];
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private String a(String str, ho hoVar, e5 e5Var, String str2) {
        try {
            List M;
            b5 a;
            if (hoVar.M().size() != 0) {
                if (e5Var != e5.NATIONAL) {
                    M = hoVar.M();
                    a = a(M, str);
                    return a != null ? str : a(str, a, e5Var, str2);
                }
            }
            M = hoVar.r();
            a = a(M, str);
            if (a != null) {
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    boolean a(StringBuilder stringBuilder, ho hoVar, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String z = hoVar.z();
        if (length == 0) {
            return false;
        }
        try {
            if (z.length() == 0) {
                return false;
            }
            Matcher matcher = this.o.a(z).matcher(stringBuilder);
            if (!matcher.lookingAt()) {
                return false;
            }
            Pattern a = this.o.a(hoVar.X().g());
            boolean matches = a.matcher(stringBuilder).matches();
            int groupCount = matcher.groupCount();
            String c = hoVar.c();
            if (c != null) {
                try {
                    if (c.length() != 0) {
                        if (matcher.group(groupCount) != null) {
                            StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
                            try {
                                stringBuilder3.replace(0, length, matcher.replaceFirst(c));
                                if (matches) {
                                    if (!a.matcher(stringBuilder3.toString()).matches()) {
                                        return false;
                                    }
                                }
                                if (stringBuilder2 != null && groupCount > 1) {
                                    try {
                                        stringBuilder2.append(matcher.group(1));
                                    } catch (RuntimeException e) {
                                        throw e;
                                    }
                                }
                                stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
                                return true;
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (RuntimeException e22) {
                                throw e22;
                            }
                        }
                    }
                } catch (RuntimeException e222) {
                    throw e222;
                } catch (RuntimeException e2222) {
                    try {
                        throw e2222;
                    } catch (RuntimeException e22222) {
                        throw e22222;
                    }
                }
            }
            if (matches) {
                try {
                    if (!a.matcher(stringBuilder.substring(matcher.end())).matches()) {
                        return false;
                    }
                } catch (RuntimeException e222222) {
                    throw e222222;
                }
            }
            if (stringBuilder2 != null && groupCount > 0) {
                try {
                    if (matcher.group(groupCount) != null) {
                        stringBuilder2.append(matcher.group(1));
                    }
                } catch (RuntimeException e2222222) {
                    throw e2222222;
                }
            }
            stringBuilder.delete(0, matcher.end());
            return true;
        } catch (RuntimeException e22222222) {
            throw e22222222;
        }
    }

    String a(String str, b5 b5Var, e5 e5Var) {
        return a(str, b5Var, e5Var, null);
    }

    public void b(String str, String str2, ae aeVar) {
        a(str, str2, true, true, aeVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r5, java.util.Map r6, boolean r7) {
        /*
        r2 = F;
        r3 = new java.lang.StringBuilder;
        r0 = r5.length();
        r3.<init>(r0);
        r0 = 0;
        r1 = r0;
    L_0x000d:
        r0 = r5.length();
        if (r1 >= r0) goto L_0x0035;
    L_0x0013:
        r4 = r5.charAt(r1);
        r0 = java.lang.Character.toUpperCase(r4);
        r0 = java.lang.Character.valueOf(r0);
        r0 = r6.get(r0);
        r0 = (java.lang.Character) r0;
        if (r0 == 0) goto L_0x002c;
    L_0x0027:
        r3.append(r0);	 Catch:{ RuntimeException -> 0x003a }
        if (r2 == 0) goto L_0x0031;
    L_0x002c:
        if (r7 != 0) goto L_0x0031;
    L_0x002e:
        r3.append(r4);	 Catch:{ RuntimeException -> 0x003c }
    L_0x0031:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x003e;
    L_0x0035:
        r0 = r3.toString();
        return r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r1 = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, java.util.Map, boolean):java.lang.String");
    }

    static String l(String str) {
        Matcher matcher = k.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String substring = str.substring(matcher.start());
        Matcher matcher2 = w.matcher(substring);
        if (matcher2.find()) {
            substring = substring.substring(0, matcher2.start());
            B.log(Level.FINER, J[13] + substring);
        }
        matcher2 = I.matcher(substring);
        return matcher2.find() ? substring.substring(0, matcher2.start()) : substring;
    }

    String b(StringBuilder stringBuilder) {
        int i = F;
        Matcher matcher = A.matcher(stringBuilder);
        try {
            if (matcher.find() && b(stringBuilder.substring(0, matcher.start()))) {
                int i2 = 1;
                int groupCount = matcher.groupCount();
                while (i2 <= groupCount) {
                    if (matcher.group(i2) == null) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    String group = matcher.group(i2);
                    stringBuilder.delete(matcher.start(), stringBuilder.length());
                    return group;
                }
            }
            return "";
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void a(ae aeVar, ho hoVar, e5 e5Var, StringBuilder stringBuilder) {
        int i = F;
        try {
            if (!aeVar.o()) {
                return;
            }
            if (aeVar.r().length() > 0) {
                try {
                    if (e5Var == e5.RFC3966) {
                        try {
                            stringBuilder.append(J[0]).append(aeVar.r());
                            if (i == 0) {
                                return;
                            }
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
                try {
                    if (hoVar.ad()) {
                        try {
                            stringBuilder.append(hoVar.U()).append(aeVar.r());
                            if (i == 0) {
                                return;
                            }
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    }
                    stringBuilder.append(J[1]).append(aeVar.r());
                } catch (RuntimeException e222) {
                    throw e222;
                }
            }
        } catch (RuntimeException e2222) {
            throw e2222;
        } catch (RuntimeException e22222) {
            throw e22222;
        }
    }

    public int d(String str) {
        try {
            if (i(str)) {
                return k(str);
            }
            Logger logger = B;
            Level level = Level.WARNING;
            StringBuilder append = new StringBuilder().append(J[34]);
            if (str == null) {
                str = J[32];
            }
            logger.log(level, append.append(str).append(J[33]).toString());
            return 0;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    ho a(int i) {
        synchronized (this.d) {
            if (this.m.containsKey(Integer.valueOf(i))) {
                try {
                    if (!this.d.containsKey(Integer.valueOf(i))) {
                        a(this.y, J[40], i);
                    }
                    return (ho) this.d.get(Integer.valueOf(i));
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, com.google.ae r15) {
        /*
        r10 = this;
        r9 = 48;
        r8 = 2;
        r6 = F;
        if (r11 != 0) goto L_0x0017;
    L_0x0007:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x0015 }
        r1 = com.google.dk.NOT_A_NUMBER;	 Catch:{ ao -> 0x0015 }
        r2 = J;	 Catch:{ ao -> 0x0015 }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ ao -> 0x0015 }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x0015 }
        throw r0;	 Catch:{ ao -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = r11.length();	 Catch:{ ao -> 0x002d }
        r1 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r0 <= r1) goto L_0x002f;
    L_0x001f:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x002d }
        r1 = com.google.dk.TOO_LONG;	 Catch:{ ao -> 0x002d }
        r2 = J;	 Catch:{ ao -> 0x002d }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ ao -> 0x002d }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x002d }
        throw r0;	 Catch:{ ao -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r10.a(r11, r7);	 Catch:{ ao -> 0x004f }
        r0 = r7.toString();	 Catch:{ ao -> 0x004f }
        r0 = b(r0);	 Catch:{ ao -> 0x004f }
        if (r0 != 0) goto L_0x0051;
    L_0x0041:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x004f }
        r1 = com.google.dk.NOT_A_NUMBER;	 Catch:{ ao -> 0x004f }
        r2 = J;	 Catch:{ ao -> 0x004f }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ ao -> 0x004f }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x004f }
        throw r0;	 Catch:{ ao -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        if (r14 == 0) goto L_0x006f;
    L_0x0053:
        r0 = r7.toString();	 Catch:{ ao -> 0x006d }
        r0 = r10.a(r0, r12);	 Catch:{ ao -> 0x006d }
        if (r0 != 0) goto L_0x006f;
    L_0x005d:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x006b }
        r1 = com.google.dk.INVALID_COUNTRY_CODE;	 Catch:{ ao -> 0x006b }
        r2 = J;	 Catch:{ ao -> 0x006b }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ ao -> 0x006b }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x006b }
        throw r0;	 Catch:{ ao -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ ao -> 0x006b }
    L_0x006f:
        if (r13 == 0) goto L_0x0074;
    L_0x0071:
        r15.b(r11);	 Catch:{ ao -> 0x00d3 }
    L_0x0074:
        r0 = r10.b(r7);
        r1 = r0.length();	 Catch:{ ao -> 0x00d5 }
        if (r1 <= 0) goto L_0x0081;
    L_0x007e:
        r15.a(r0);	 Catch:{ ao -> 0x00d5 }
    L_0x0081:
        r2 = r10.e(r12);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = r7.toString();	 Catch:{ ao -> 0x00d7 }
        r0 = r10;
        r4 = r13;
        r5 = r15;
        r0 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ ao -> 0x00d7 }
    L_0x0095:
        if (r0 == 0) goto L_0x0182;
    L_0x0097:
        r1 = r10.b(r0);
        r4 = r1.equals(r12);
        if (r4 != 0) goto L_0x017f;
    L_0x00a1:
        r0 = r10.a(r0, r1);
    L_0x00a5:
        if (r6 == 0) goto L_0x00bd;
    L_0x00a7:
        a(r7);	 Catch:{ ao -> 0x0121 }
        r3.append(r7);	 Catch:{ ao -> 0x0121 }
        if (r12 == 0) goto L_0x00b8;
    L_0x00af:
        r1 = r0.L();
        r15.a(r1);	 Catch:{ ao -> 0x0123 }
        if (r6 == 0) goto L_0x00bd;
    L_0x00b8:
        if (r13 == 0) goto L_0x00bd;
    L_0x00ba:
        r15.l();	 Catch:{ ao -> 0x0125 }
    L_0x00bd:
        r1 = r3.length();	 Catch:{ ao -> 0x00d1 }
        if (r1 >= r8) goto L_0x0127;
    L_0x00c3:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x00d1 }
        r1 = com.google.dk.TOO_SHORT_NSN;	 Catch:{ ao -> 0x00d1 }
        r2 = J;	 Catch:{ ao -> 0x00d1 }
        r3 = 44;
        r2 = r2[r3];	 Catch:{ ao -> 0x00d1 }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x00d1 }
        throw r0;	 Catch:{ ao -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        r1 = g;
        r4 = r7.toString();
        r1 = r1.matcher(r4);
        r4 = r0.a();	 Catch:{ ao -> 0x0111 }
        r5 = com.google.dk.INVALID_COUNTRY_CODE;	 Catch:{ ao -> 0x0111 }
        if (r4 != r5) goto L_0x0113;
    L_0x00ea:
        r4 = r1.lookingAt();	 Catch:{ ao -> 0x0111 }
        if (r4 == 0) goto L_0x0113;
    L_0x00f0:
        r0 = r1.end();
        r1 = r7.substring(r0);
        r0 = r10;
        r4 = r13;
        r5 = r15;
        r0 = r0.a(r1, r2, r3, r4, r5);
        if (r0 != 0) goto L_0x0095;
    L_0x0101:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x010f }
        r1 = com.google.dk.INVALID_COUNTRY_CODE;	 Catch:{ ao -> 0x010f }
        r2 = J;	 Catch:{ ao -> 0x010f }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ ao -> 0x010f }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x010f }
        throw r0;	 Catch:{ ao -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r0 = move-exception;
        throw r0;
    L_0x0113:
        r1 = new com.google.ao;
        r2 = r0.a();
        r0 = r0.getMessage();
        r1.<init>(r2, r0);
        throw r1;
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ ao -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        throw r0;
    L_0x0127:
        if (r0 == 0) goto L_0x013a;
    L_0x0129:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r10.a(r3, r0, r1);	 Catch:{ ao -> 0x0150 }
        if (r13 == 0) goto L_0x013a;
    L_0x0133:
        r0 = r1.toString();	 Catch:{ ao -> 0x0150 }
        r15.c(r0);	 Catch:{ ao -> 0x0150 }
    L_0x013a:
        r0 = r3.length();
        if (r0 >= r8) goto L_0x0152;
    L_0x0140:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x014e }
        r1 = com.google.dk.TOO_SHORT_NSN;	 Catch:{ ao -> 0x014e }
        r2 = J;	 Catch:{ ao -> 0x014e }
        r3 = 42;
        r2 = r2[r3];	 Catch:{ ao -> 0x014e }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x014e }
        throw r0;	 Catch:{ ao -> 0x014e }
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r1 = 16;
        if (r0 <= r1) goto L_0x0166;
    L_0x0156:
        r0 = new com.google.ao;	 Catch:{ ao -> 0x0164 }
        r1 = com.google.dk.TOO_LONG;	 Catch:{ ao -> 0x0164 }
        r2 = J;	 Catch:{ ao -> 0x0164 }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ ao -> 0x0164 }
        r0.<init>(r1, r2);	 Catch:{ ao -> 0x0164 }
        throw r0;	 Catch:{ ao -> 0x0164 }
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ ao -> 0x017d }
        if (r0 != r9) goto L_0x0171;
    L_0x016d:
        r0 = 1;
        r15.a(r0);	 Catch:{ ao -> 0x017d }
    L_0x0171:
        r0 = r3.toString();
        r0 = java.lang.Long.parseLong(r0);
        r15.a(r0);
        return;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r0 = r2;
        goto L_0x00a5;
    L_0x0182:
        r0 = r2;
        goto L_0x00a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, java.lang.String, boolean, boolean, com.google.ae):void");
    }

    private boolean a(Pattern pattern, StringBuilder stringBuilder) {
        Matcher matcher = pattern.matcher(stringBuilder);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = a.matcher(stringBuilder.substring(end));
        if (matcher2.find()) {
            try {
                if (g(matcher2.group(1)).equals("0")) {
                    return false;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        stringBuilder.delete(0, end);
        return true;
    }

    private boolean i(String str) {
        if (str != null) {
            try {
                if (this.x.contains(str)) {
                    return true;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    ho e(String str) {
        try {
            if (!i(str)) {
                return null;
            }
            synchronized (this.q) {
                if (!this.q.containsKey(str)) {
                    a(this.y, str, 0);
                }
            }
            return (ho) this.q.get(str);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private ho a(int i, String str) {
        try {
            if (J[27].equals(str)) {
                return a(i);
            }
            return e(str);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static synchronized e2 a(String str, Map map) {
        e2 e2Var;
        synchronized (e2.class) {
            try {
                if (v == null) {
                    v = new e2();
                    v.m = map;
                    v.f(str);
                }
                e2Var = v;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return e2Var;
    }

    public d2 h(String str) {
        return new d2(str);
    }

    public ae c(String str, String str2) {
        ae aeVar = new ae();
        b(str, str2, aeVar);
        return aeVar;
    }

    private void a(int i, e5 e5Var, StringBuilder stringBuilder) {
        try {
            switch (ez.c[e5Var.ordinal()]) {
                case at.g /*1*/:
                    stringBuilder.insert(0, i).insert(0, '+');
                case at.i /*2*/:
                    stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
                case at.o /*3*/:
                    stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, J[16]);
                default:
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    b5 a(List list, String str) {
        int i = F;
        for (b5 b5Var : list) {
            int g = b5Var.g();
            if (g != 0) {
                try {
                    if (!this.o.a(b5Var.a(g - 1)).matcher(str).lookingAt()) {
                        continue;
                        if (i != 0) {
                            break;
                        }
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            try {
                if (!this.o.a(b5Var.i()).matcher(str).matches()) {
                    if (i != 0) {
                        break;
                    }
                }
                return b5Var;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        return null;
    }

    public static synchronized e2 a() {
        e2 a;
        synchronized (e2.class) {
            try {
                if (v == null) {
                    a = a(J[22], bo.a());
                } else {
                    a = v;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return a;
    }

    private e2() {
        this.y = J[4];
        this.m = null;
        this.x = new HashSet(320);
        this.G = new HashSet(35);
        this.q = Collections.synchronizedMap(new HashMap());
        this.d = Collections.synchronizedMap(new HashMap());
        this.e = new HashSet();
        this.o = new aa(100);
    }

    static boolean j(String str) {
        return t.matcher(str).matches();
    }

    static void a(StringBuilder stringBuilder) {
        stringBuilder.replace(0, stringBuilder.length(), a(stringBuilder.toString()));
    }

    public String b(ae aeVar) {
        try {
            String str;
            if (aeVar.g()) {
                str = "0";
            } else {
                str = "";
            }
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(aeVar.u());
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static {
        Object obj = -1;
        String[] strArr = new String[50];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "6y\u0016\u0015\u0016";
        char c = '\uffff';
        while (true) {
            str = z(z(str));
            switch (c) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "WF";
                    c = '\u0001';
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "WF";
                    c = '\u0002';
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\"\u007f\u0001\f\u0004js\u0001\u0006Gh3\u0007P\u0013c3\u001e\tDcy\u0000\u0014Foy\u001c\u0012\u0004i}\u001a\u0000\u0004]t\u0001\u000fNCi\u0003\u0003N\u007fQ\u000b\u0015Ji}\u001a\u0000{\u007fs\u001a\u000e";
                    c = '\u0003';
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "V1N<\u0000%";
                    c = '\u0004';
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Ql\u0015/Op";
                    c = '\u0005';
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "P`\u0007\u000f_q}\u0000\u0004Sb`\uff27\uff2f\uff7f$";
                    c = '\u0006';
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "V&2O\uff25P#5A\u008bQhBLv'";
                    c = '\u0007';
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "v-BTV$?";
                    c = '\b';
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "%@\u001e\u001aeia\u0015P\u0007:aG";
                    c = '\t';
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "6y\u0016\u0015\u0016%@\u001e\u001aeia\u0015P\u0007:aG\u001dp-\u00bc2\u0015\u0007P6F^\u0011h#\u0016\u0015\u00032&\u000b\u000fXd4Q[D\u030c#\u0012\u0092\u0002$#\u0000^W\uff48#\uff36\uff35\uff652`5";
                    c = '\n';
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ".#\u0012";
                    c = '\u000b';
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "^h\u001c\b[}y\nA_\u007f}\u0007\rBc{N\u0002Cln\u000f\u0002_hn\u001d[\u000b";
                    c = '\f';
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "$<\b\u000eY-r\u001b\fIhnN";
                    c = '\r';
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "@u\u001d\u0012Bc{A\bE{}\u0002\bO-\u007f\u0001\u0014Eyn\u0017>Hbx\u000bA\u0003";
                    c = '\u000e';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "yy\u0002[";
                    c = '\u000f';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Dr\u0018\u0000GdxN\u0013Nju\u0001\u000f\u000bns\n\u0004\u0011-";
                    c = '\u0010';
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "hq\u001e\u0015R-q\u000b\u0015Ji}\u001a\u0000\u0011-";
                    c = '\u0011';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "hq\u001e\u0015R-q\u000b\u0015Ji}\u001a\u0000\u0011-";
                    c = '\u0012';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "C3/";
                    c = '\u0013';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "=,_";
                    c = '\u0014';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\"\u007f\u0001\f\u0004js\u0001\u0006Gh3\u0007P\u0013c3\u001e\tDcy\u0000\u0014Foy\u001c\u0012\u0004i}\u001a\u0000\u0004]t\u0001\u000fNCi\u0003\u0003N\u007fQ\u000b\u0015Ji}\u001a\u0000{\u007fs\u001a\u000e";
                    c = '\u0015';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "WF";
                    c = '\u0016';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "Ns\u001b\u000f_\u007feN\u0002Jap\u0007\u000fL-\u007f\u0001\u0005N-o\u001b\u0011[au\u000b\u0005\u000bz}\u001dAEbhN\u0013Nns\t\u000fB~y\nO";
                    c = '\u0017';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Cs\u0000,Jy\u007f\u0006";
                    c = '\u0018';
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "]t\u0001\u000fN-r\u001b\fIhnN\tJi<\u000f\u000f\u000bDX*M\u000boi\u001aAJkh\u000b\u0013\u000byt\u0007\u0012\u000bz}\u001dAEbhN\rDc{N\u0004Ebi\t\t\u000bysN\u0003N-}N\u0017Bl~\u0002\u0004\u000b}t\u0001\u000fN-r\u001b\fIhn@";
                    c = '\u0019';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "=,_";
                    c = '\u001a';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "=,_";
                    c = '\u001b';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "=,_";
                    c = '\u001c';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "dr\u0018\u0000GdxN\fNy}\n\u0000_l<F\u0002Dxr\u001a\u0013R-\u007f\u000f\rGdr\tAHbx\u000bA\\loN\fJ}l\u000b\u0005\u000bysN\u0015Ch<\u0000\u000eE {\u000b\u000e\u000bhr\u001a\b_t<\u000f\u0012\u000bzy\u0002\r\u000bloN\u0012[h\u007f\u0007\u0007Bn<\u001c\u0004Lds\u0000IX$5";
                    c = '\u001d';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "=,_";
                    c = '\u001e';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    str = "ci\u0002\r";
                    c = '\u001f';
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    strArr2 = strArr3;
                    str = "$<\u001e\u0013D{u\n\u0004O#";
                    c = ' ';
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "Dr\u0018\u0000GdxN\u000eY-q\u0007\u0012Xdr\tAYh{\u0007\u000eE-\u007f\u0001\u0005N-4";
                    c = '!';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "6l\u0006\u000eEh1\r\u000eEyy\u0016\u0015\u0016";
                    c = '\"';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "yy\u0002[";
                    c = '#';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "yy\u0002[";
                    c = '$';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "6l\u0006\u000eEh1\r\u000eEyy\u0016\u0015\u0016";
                    c = '%';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "6u\u001d\u0014I0";
                    c = '&';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "=,_";
                    c = '\'';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "Yt\u000bAXyn\u0007\u000fL-o\u001b\u0011[au\u000b\u0005\u000bz}\u001dA_bsN\rDc{N\u0015D-l\u000f\u0013Xh2";
                    c = '(';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "Yt\u000bAXyn\u0007\u000fL-o\u001b\u0011[au\u000b\u0005\u000bdoN\u0015Db<\u001d\tD\u007fhN\u0015D-~\u000bAJ-l\u0006\u000eEh<\u0000\u0014Foy\u001cO";
                    c = ')';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "Ns\u001b\rO-r\u0001\u0015\u000bdr\u001a\u0004Y}n\u000b\u0015\u000bci\u0003\u0003N\u007foN\u0000Myy\u001cA[ai\u001dLXd{\u0000O";
                    c = '*';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "Yt\u000bAXyn\u0007\u000fL-o\u001b\u0011[au\u000b\u0005\u000bdoN\u0015Db<\u001d\tD\u007fhN\u0015D-~\u000bAJ-l\u0006\u000eEh<\u0000\u0014Foy\u001cO";
                    c = '+';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    str = "Yt\u000bAXyn\u0007\u000fL-o\u001b\u0011[au\u000b\u0005\u000bdoN\u0015Db<\u0002\u000eEj<\u001a\u000e\u000boyN\u0000\u000b}t\u0001\u000fN-r\u001b\fIhn@";
                    c = ',';
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "@u\u001d\u0012Bc{N\u000eY-u\u0000\u0017Jau\nAOhz\u000f\u0014Gy<\u001c\u0004Lds\u0000O";
                    c = '-';
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "Yt\u000bA[es\u0000\u0004\u000bci\u0003\u0003N\u007f<\u001d\u0014[}p\u0007\u0004O-k\u000f\u0012\u000bci\u0002\r\u0005";
                    c = '.';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "Yt\u000bAXyn\u0007\u000fL-o\u001b\u0011[au\u000b\u0005\u000biu\nAEbhN\u0012NhqN\u0015D-~\u000bAJ-l\u0006\u000eEh<\u0000\u0014Foy\u001cO";
                    c = '/';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "Nt\u000b\u0002@dr\tABk<\u0000\u0014Foy\u001cAB~<\u001e\u000eX~u\f\rN-k\u0007\u0015C-u\u0000\u0002D`l\u0002\u0004_h<\u0003\u0004_lx\u000f\u0015J#";
                    c = '0';
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    J = strArr3;
                    B = Logger.getLogger(e2.class.getName());
                    Map hashMap = new HashMap();
                    hashMap.put(Character.valueOf('0'), Character.valueOf('0'));
                    hashMap.put(Character.valueOf('1'), Character.valueOf('1'));
                    hashMap.put(Character.valueOf('2'), Character.valueOf('2'));
                    hashMap.put(Character.valueOf('3'), Character.valueOf('3'));
                    hashMap.put(Character.valueOf('4'), Character.valueOf('4'));
                    hashMap.put(Character.valueOf('5'), Character.valueOf('5'));
                    hashMap.put(Character.valueOf('6'), Character.valueOf('6'));
                    hashMap.put(Character.valueOf('7'), Character.valueOf('7'));
                    hashMap.put(Character.valueOf('8'), Character.valueOf('8'));
                    hashMap.put(Character.valueOf('9'), Character.valueOf('9'));
                    Map hashMap2 = new HashMap(40);
                    hashMap2.put(Character.valueOf('A'), Character.valueOf('2'));
                    hashMap2.put(Character.valueOf('B'), Character.valueOf('2'));
                    hashMap2.put(Character.valueOf('C'), Character.valueOf('2'));
                    hashMap2.put(Character.valueOf('D'), Character.valueOf('3'));
                    hashMap2.put(Character.valueOf('E'), Character.valueOf('3'));
                    hashMap2.put(Character.valueOf('F'), Character.valueOf('3'));
                    hashMap2.put(Character.valueOf('G'), Character.valueOf('4'));
                    hashMap2.put(Character.valueOf('H'), Character.valueOf('4'));
                    hashMap2.put(Character.valueOf('I'), Character.valueOf('4'));
                    hashMap2.put(Character.valueOf('J'), Character.valueOf('5'));
                    hashMap2.put(Character.valueOf('K'), Character.valueOf('5'));
                    hashMap2.put(Character.valueOf('L'), Character.valueOf('5'));
                    hashMap2.put(Character.valueOf('M'), Character.valueOf('6'));
                    hashMap2.put(Character.valueOf('N'), Character.valueOf('6'));
                    hashMap2.put(Character.valueOf('O'), Character.valueOf('6'));
                    hashMap2.put(Character.valueOf('P'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('Q'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('R'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('S'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('T'), Character.valueOf('8'));
                    hashMap2.put(Character.valueOf('U'), Character.valueOf('8'));
                    hashMap2.put(Character.valueOf('V'), Character.valueOf('8'));
                    hashMap2.put(Character.valueOf('W'), Character.valueOf('9'));
                    hashMap2.put(Character.valueOf('X'), Character.valueOf('9'));
                    hashMap2.put(Character.valueOf('Y'), Character.valueOf('9'));
                    hashMap2.put(Character.valueOf('Z'), Character.valueOf('9'));
                    D = Collections.unmodifiableMap(hashMap2);
                    hashMap2 = new HashMap(100);
                    hashMap2.putAll(D);
                    hashMap2.putAll(hashMap);
                    s = Collections.unmodifiableMap(hashMap2);
                    hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    hashMap2.put(Character.valueOf('+'), Character.valueOf('+'));
                    hashMap2.put(Character.valueOf('*'), Character.valueOf('*'));
                    h = Collections.unmodifiableMap(hashMap2);
                    Map hashMap3 = new HashMap();
                    for (Character charValue : D.keySet()) {
                        c = charValue.charValue();
                        hashMap3.put(Character.valueOf(Character.toLowerCase(c)), Character.valueOf(c));
                        hashMap3.put(Character.valueOf(c), Character.valueOf(c));
                    }
                    hashMap3.putAll(hashMap);
                    hashMap3.put(Character.valueOf('-'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\uff0d'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2010'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2011'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2012'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2013'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2014'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2015'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2212'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('/'), Character.valueOf('/'));
                    hashMap3.put(Character.valueOf('\uff0f'), Character.valueOf('/'));
                    hashMap3.put(Character.valueOf(' '), Character.valueOf(' '));
                    hashMap3.put(Character.valueOf('\u3000'), Character.valueOf(' '));
                    hashMap3.put(Character.valueOf('\u2060'), Character.valueOf(' '));
                    hashMap3.put(Character.valueOf('.'), Character.valueOf('.'));
                    hashMap3.put(Character.valueOf('\uff0e'), Character.valueOf('.'));
                    b = Collections.unmodifiableMap(hashMap3);
                    String str2 = "V@\n<\u0000%#T:U\u205e\u2220\uff30<pQx3J\u00022";
                    Object obj2 = -1;
                    while (true) {
                        str2 = z(z(str2));
                        StringBuilder stringBuilder;
                        switch (obj2) {
                            case v.m /*0*/:
                                g = Pattern.compile(str2);
                                str2 = "V1\u0016\u2071\u0006\u2018\u220e\u3092\uff6c\u0006\uff02<\u00ce\u00cc\u2020\u206d\u301cFH\uff23\uff04\uff27\uff53OwV@3NU\u205e\u2220\uff30<\u0000";
                                obj2 = 1;
                                break;
                            case at.g /*1*/:
                                p = Pattern.compile(str2);
                                str2 = "%@\u001e\u001aeiaG";
                                obj2 = 2;
                                break;
                            case at.i /*2*/:
                                a = Pattern.compile(str2);
                                str2 = "V7\uff65=[vR\n\u001cv";
                                obj2 = 3;
                                break;
                            case at.o /*3*/:
                                k = Pattern.compile(str2);
                                str2 = "V@2Nv-6\u0016";
                                obj2 = 4;
                                break;
                            case at.p /*4*/:
                                I = Pattern.compile(str2);
                                str2 = "VG21PCaHGw]g\"\u001cv+:5?\bPAEE";
                                obj2 = 5;
                                break;
                            case at.m /*5*/:
                                w = Pattern.compile(str2);
                                str2 = "%#TO\u00012G/Lql1\u0014<\u0002v/\u0013O\u0001";
                                obj2 = 6;
                                break;
                            case Y.f /*6*/:
                                c = Pattern.compile(str2);
                                stringBuilder = new StringBuilder();
                                str2 = "Ql\u0015/Opg\\\u001cWV7\uff65<\u0001&4Q[p d\u207eL\u203e\u221f\u30e0\uff63L\uff24-\u00bc\u00c3\u206a\u204b\u300d4G\uff69\uff22\uff36\uff21@=pQAA\u001f\u2078\u2231\uff42D<\u0001Ql\u0015/Op5\u0015R\u0007pGC\u0019\u203b \u2009\u227c\u309d\uff26 \uff13N\u00c1\u0086\u2006\u207c\u306eI\u0002\uff05\uff15\uff55\uff5c\u0005QG2<\u0004s\u204f\u2252\uff3f\u0001";
                                obj2 = -1;
                                while (true) {
                                    str2 = z(z(str2));
                                    switch (obj2) {
                                        case v.m /*0*/:
                                            stringBuilder = stringBuilder.append(str2);
                                            str2 = "P6";
                                            obj2 = 1;
                                            break;
                                        case at.g /*1*/:
                                            n = stringBuilder.append(str2).toString();
                                            str2 = "u\uff44M\uff62U\uff53";
                                            obj2 = 7;
                                            continue;
                                        default:
                                            stringBuilder = stringBuilder.append(str2).append(u);
                                            str2 = "Ql\u0015/Op";
                                            obj2 = null;
                                            break;
                                    }
                                }
                            case aF.v /*7*/:
                                l = c("," + str2);
                                C = c(str2);
                                stringBuilder = new StringBuilder();
                                str2 = "%#T";
                                obj2 = -1;
                                while (true) {
                                    str2 = z(z(str2));
                                    switch (obj2) {
                                        case v.m /*0*/:
                                            A = Pattern.compile(stringBuilder.append(str2).toString(), 66);
                                            stringBuilder = new StringBuilder().append(n);
                                            str2 = "%#T";
                                            obj2 = 1;
                                            break;
                                        case at.g /*1*/:
                                            stringBuilder = stringBuilder.append(str2).append(l);
                                            str2 = "$#";
                                            obj2 = 2;
                                            break;
                                        case at.i /*2*/:
                                            i = Pattern.compile(stringBuilder.append(str2).toString(), 66);
                                            String str3 = "%@*J\u0002";
                                            while (true) {
                                                str3 = z(z(str3));
                                                switch (obj) {
                                                    case v.m /*0*/:
                                                        z = Pattern.compile(str3);
                                                        str3 = "Q8 1";
                                                        obj = 1;
                                                        break;
                                                    case at.g /*1*/:
                                                        r = Pattern.compile(str3);
                                                        str3 = "Q8(&";
                                                        obj = 2;
                                                        break;
                                                    case at.i /*2*/:
                                                        E = Pattern.compile(str3);
                                                        str3 = "Q8-\"";
                                                        obj = 3;
                                                        break;
                                                    case at.o /*3*/:
                                                        f = Pattern.compile(str3);
                                                        str3 = "Q4Q=\u000f<@G^";
                                                        obj = 4;
                                                        break;
                                                    case at.p /*4*/:
                                                        t = Pattern.compile(str3);
                                                        v = null;
                                                        return;
                                                    default:
                                                        H = Pattern.compile(str3);
                                                        str3 = "%@J=O$";
                                                        obj = null;
                                                        break;
                                                }
                                            }
                                        default:
                                            stringBuilder = stringBuilder.append(str2).append(l);
                                            str2 = "$8";
                                            obj2 = null;
                                            break;
                                    }
                                }
                            default:
                                j = Pattern.compile(str2);
                                stringBuilder = new StringBuilder();
                                StringBuilder stringBuilder2 = stringBuilder;
                                String arrays = Arrays.toString(D.keySet().toArray());
                                str2 = "V0N=pQA3";
                                obj2 = -1;
                                while (true) {
                                    str2 = z(z(str2));
                                    switch (obj2) {
                                        case v.m /*0*/:
                                            u = stringBuilder2.append(arrays.replaceAll(str2, "")).toString();
                                            str2 = "V7\uff65<\u0000";
                                            obj2 = null;
                                            break;
                                        default:
                                            stringBuilder = stringBuilder2.append(arrays.replaceAll(str2, ""));
                                            stringBuilder2 = stringBuilder;
                                            arrays = Arrays.toString(D.keySet().toArray()).toLowerCase();
                                            str2 = "V0N=pQA3";
                                            obj2 = null;
                                    }
                                }
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "-y\u0016\u0015\u0005-";
                    i = 1;
                    strArr2 = strArr3;
                    c = '\u0000';
                    break;
            }
        }
    }

    public dz a(ae aeVar) {
        String b = b(aeVar);
        int n = aeVar.n();
        try {
            if (!c(n)) {
                return dz.INVALID_COUNTRY_CODE;
            }
            ha X = a(n, b(n)).X();
            if (X.e()) {
                return a(this.o.a(X.f()), b);
            }
            B.log(Level.FINER, J[49]);
            int length = b.length();
            if (length < 2) {
                try {
                    return dz.TOO_SHORT;
                } catch (RuntimeException e) {
                    throw e;
                }
            } else if (length <= 16) {
                return dz.IS_POSSIBLE;
            } else {
                try {
                    return dz.TOO_LONG;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private dz a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.matches()) {
                return dz.IS_POSSIBLE;
            }
            try {
                if (matcher.lookingAt()) {
                    return dz.TOO_LONG;
                }
                return dz.TOO_SHORT;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private boolean a(String str, ha haVar) {
        Matcher matcher = this.o.a(haVar.f()).matcher(str);
        Matcher matcher2 = this.o.a(haVar.g()).matcher(str);
        try {
            if (matcher.matches()) {
                if (matcher2.matches()) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(java.lang.String r8) {
        /*
        r7 = this;
        r6 = 1;
        r2 = F;
        r7.y = r8;
        r0 = r7.m;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x000f:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0015:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getValue();
        r1 = (java.util.List) r1;
        r4 = r1.size();	 Catch:{ RuntimeException -> 0x0077 }
        if (r4 != r6) goto L_0x0043;
    L_0x0027:
        r4 = J;	 Catch:{ RuntimeException -> 0x0079 }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0079 }
        r5 = 0;
        r5 = r1.get(r5);	 Catch:{ RuntimeException -> 0x0079 }
        r4 = r4.equals(r5);	 Catch:{ RuntimeException -> 0x0079 }
        if (r4 == 0) goto L_0x0043;
    L_0x0038:
        r4 = r7.e;	 Catch:{ RuntimeException -> 0x007b }
        r0 = r0.getKey();	 Catch:{ RuntimeException -> 0x007b }
        r4.add(r0);	 Catch:{ RuntimeException -> 0x007b }
        if (r2 == 0) goto L_0x0048;
    L_0x0043:
        r0 = r7.x;	 Catch:{ RuntimeException -> 0x007b }
        r0.addAll(r1);	 Catch:{ RuntimeException -> 0x007b }
    L_0x0048:
        if (r2 == 0) goto L_0x000f;
    L_0x004a:
        r0 = r7.x;	 Catch:{ RuntimeException -> 0x007d }
        r1 = J;	 Catch:{ RuntimeException -> 0x007d }
        r2 = 29;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x007d }
        r0 = r0.remove(r1);	 Catch:{ RuntimeException -> 0x007d }
        if (r0 == 0) goto L_0x0065;
    L_0x0058:
        r0 = B;	 Catch:{ RuntimeException -> 0x007d }
        r1 = java.util.logging.Level.WARNING;	 Catch:{ RuntimeException -> 0x007d }
        r2 = J;	 Catch:{ RuntimeException -> 0x007d }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x007d }
        r0.log(r1, r2);	 Catch:{ RuntimeException -> 0x007d }
    L_0x0065:
        r1 = r7.G;
        r0 = r7.m;
        r2 = java.lang.Integer.valueOf(r6);
        r0 = r0.get(r2);
        r0 = (java.util.Collection) r0;
        r1.addAll(r0);
        return;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.f(java.lang.String):void");
    }

    private String a(String str, ho hoVar, e5 e5Var) {
        return a(str, hoVar, e5Var, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r6, java.lang.StringBuilder r7) {
        /*
        r5 = this;
        r0 = F;
        r1 = J;
        r2 = 35;
        r1 = r1[r2];
        r1 = r6.indexOf(r1);
        if (r1 <= 0) goto L_0x0057;
    L_0x000e:
        r2 = J;
        r3 = 38;
        r2 = r2[r3];
        r2 = r2.length();
        r2 = r2 + r1;
        r3 = r6.charAt(r2);
        r4 = 43;
        if (r3 != r4) goto L_0x0039;
    L_0x0021:
        r3 = 59;
        r3 = r6.indexOf(r3, r2);
        if (r3 <= 0) goto L_0x0032;
    L_0x0029:
        r3 = r6.substring(r2, r3);	 Catch:{ RuntimeException -> 0x0072 }
        r7.append(r3);	 Catch:{ RuntimeException -> 0x0072 }
        if (r0 == 0) goto L_0x0039;
    L_0x0032:
        r2 = r6.substring(r2);	 Catch:{ RuntimeException -> 0x0072 }
        r7.append(r2);	 Catch:{ RuntimeException -> 0x0072 }
    L_0x0039:
        r2 = J;	 Catch:{ RuntimeException -> 0x0074 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0074 }
        r2 = r6.indexOf(r2);	 Catch:{ RuntimeException -> 0x0074 }
        r3 = J;	 Catch:{ RuntimeException -> 0x0074 }
        r4 = 36;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0074 }
        r3 = r3.length();	 Catch:{ RuntimeException -> 0x0074 }
        r2 = r2 + r3;
        r1 = r6.substring(r2, r1);	 Catch:{ RuntimeException -> 0x0074 }
        r7.append(r1);	 Catch:{ RuntimeException -> 0x0074 }
        if (r0 == 0) goto L_0x005e;
    L_0x0057:
        r0 = l(r6);	 Catch:{ RuntimeException -> 0x0074 }
        r7.append(r0);	 Catch:{ RuntimeException -> 0x0074 }
    L_0x005e:
        r0 = J;
        r1 = 39;
        r0 = r0[r1];
        r0 = r7.indexOf(r0);
        if (r0 <= 0) goto L_0x0071;
    L_0x006a:
        r1 = r7.length();	 Catch:{ RuntimeException -> 0x0076 }
        r7.delete(r0, r1);	 Catch:{ RuntimeException -> 0x0076 }
    L_0x0071:
        return;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e2.a(java.lang.String, java.lang.StringBuilder):void");
    }

    public boolean d(ae aeVar) {
        return a(aeVar, e(aeVar));
    }
}
