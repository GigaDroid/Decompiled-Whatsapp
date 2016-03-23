package com.whatsapp;

import com.whatsapp.fieldstats.ap;
import com.whatsapp.fieldstats.l;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.b1;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.az;
import org.whispersystems.bH;
import org.whispersystems.j;

final class dt implements Runnable {
    private static final String[] z;
    private final co a;
    final adn b;
    private final ana c;
    private final l5 d;

    static {
        String[] strArr = new String[24];
        String str = "^p\u0016,S\u0004<(&W\f#\u000e1Q\u00119\u0015-y\u0001m";
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
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 67;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "^p\u0017&C\u00161\u001d&\u001e\u00175\u0017,D\u0000\u000f\b&C\n%\b UX";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "^p\t&B\u00135\b\u0011U\u00029\t7B\u0004$\u0013,^,4G";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "^p\t&B\u00135\b\u0011U\u00029\t7B\u0004$\u0013,^,4G";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "^p\u0016,S\u0004<(&W\f#\u000e1Q\u00119\u0015-y\u0001m";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "^p\u0017&C\u00161\u001d&\u001e\u00175\u000e1I&?\u000f-DX";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u00175\u001d*C\u0011\"\u001b7Y\n>Z*TE\"\u001f U\f&\u001f'\u0010\u00129\u000e+\u0010\b5\t0Q\u00025Z'Y\u0001p\u0014,DE=\u001b7S\rp\u0016,S\u0004<Ac]\u0000#\t\"W\u0000~\u0011&IX";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0004(\u0015/_\u0011<Z1U\u00065\u00135U\u0001p\u001bc]\u0000#\t\"W\u0000kZ.U\u0016#\u001b$UK;\u001f:\r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "^p\u0017&C\u00161\u001d&\u001e\u00175\u0017,D\u0000\u000f\b&C\n%\b UX";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "^p\u0017&C\u00161\u001d&\u001e\u00175\u0017,D\u0000\u000f\b&C\n%\b UX";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u00175\u0019&Y\u00135\u001ecQE\"\u001f$Y\u0016$\b\"D\f?\u0014cY\u0001p\r*D\rp\u0017&C\u00161\u001d&\u000bE=\u001f0C\u00047\u001fm[\u0000)G";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "^p\u0017&C\u00161\u001d&\u001e\u00175\u0017,D\u0000\u000f\b&C\n%\b UX";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "^p\u0016,S\u0004<(&W\f#\u000e1Q\u00119\u0015-y\u0001m";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "^p\t&B\u00135\b\u0011U\u00029\t7B\u0004$\u0013,^,4G";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0004(\u0015/_\u0011<";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0004(\u0015/_\u0011<";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0004(\u0015/_\u0011<";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0004(\u0015/_\u0011<";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0004(\u0015/_\u0011<Z'_\u0000#\u0014dDE;\u0014,GE8\u00154\u0010\u0011?Z+Q\u000b4\u0016&\u0010\u00118\u001fcS\f \u0012&B\u00115\u00027\u0010\u00135\b0Y\n>Z1U\u00065\u00135U\u0001jZ.U\u0016#\u001b$UK;\u001f:\r";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "E&G";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u00175\u0019&Y\u0015$Z0U\u000b4\u0013-WE8\u001b0\u0010\u00075\u001f-\u0010\u00019\t\"R\t5\u001ecV\n\"Z\"\u0010\u0013aZ&^\u0006\"\u00033D\u00004Z.U\u0016#\u001b$U";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0004(\u0015/_\u0011<Z6^\u00175\u0019,W\u000b9\u0000&TE3\u00133X\u0000\"\u000e&H\u0011p\u000e:@\u0000kZ.U\u0016#\u001b$UK;\u001f:\r";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "E$\u00033UX";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015\"\u001fc[\u0000)\tcQ\t\"\u001f\"T\u001cp\t&^\u0011p\u0015-\u0010\u00118\u00130\u0010\u0006?\u0014-U\u0006$\u0013,^^p\u0014,DE#\u001f-T\f>\u001dcQ\u0011p\u000e+Y\u0016p\u000e*]\u0000kZ.U\u0016#\u001b$UK;\u001f:\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private j a() {
        try {
            String str;
            if (qm.i(this.a.k.c) || co.a(this.a.k.c)) {
                str = this.a.t;
            } else {
                str = this.a.k.c;
            }
            try {
                return awc.e(str);
            } catch (IllegalArgumentException e) {
                adn.c(this.b).M().post(new u6(this));
                return null;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public dt(adn com_whatsapp_adn, co coVar, ana com_whatsapp_ana, l5 l5Var) {
        this.b = com_whatsapp_adn;
        this.a = coVar;
        this.c = com_whatsapp_ana;
        this.d = l5Var;
    }

    private void a(ap apVar, j jVar, az azVar, az azVar2, co coVar) {
        try {
            if (coVar.B != null) {
                a(apVar, jVar, azVar, coVar, coVar.B);
            }
            try {
                if (coVar.E != null) {
                    a(apVar, jVar, azVar2, coVar, coVar.E);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static co a(dt dtVar) {
        return dtVar.a;
    }

    private boolean a(j jVar, ap apVar) {
        try {
            boolean z;
            apVar.g = Double.valueOf(1.0d);
            co coVar = this.a;
            ana com_whatsapp_ana = this.c;
            l5 l5Var = this.d;
            if (this.a.E == null) {
                z = true;
            } else {
                z = false;
            }
            az a = a(apVar, jVar, coVar, com_whatsapp_ana, l5Var, z);
            az a2 = a(apVar, jVar, this.a, this.c, this.d, true);
            if (!(a == null || a2 == null)) {
                a(apVar, jVar, a, a2, this.a);
            }
        } catch (bH e) {
            throw e;
        } catch (Throwable e2) {
            Log.c(z[18], e2);
            App.l(this.a);
            return false;
        } catch (Throwable e22) {
            Log.c(z[15], e22);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.LEGACY_MESSAGE.getCode());
            App.l(this.a);
        } catch (Throwable e222) {
            Log.c(z[16], e222);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.INVALID_VERSION.getCode());
            App.l(this.a);
        } catch (bH e3) {
            throw e3;
        } catch (Throwable e2222) {
            Log.c(z[17], e2222);
            this.a.a(true);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.INVALID_MESSAGE.getCode());
            App.l(this.a);
        }
        return true;
    }

    private az a(ap apVar, j jVar, co coVar, ana com_whatsapp_ana, l5 l5Var, boolean z) {
        int d = coVar.d();
        if (d == 1) {
            if (z) {
                apVar.f = Double.valueOf(1.0d);
                return new ad6(this, coVar, com_whatsapp_ana, l5Var);
            }
            try {
                throw new IllegalStateException(z[21]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (d == 2) {
            try {
                apVar.f = Double.valueOf(2.0d);
                return new qy(this, coVar, com_whatsapp_ana, l5Var, jVar, apVar, z);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            Log.w(z[19] + coVar.k + z[20] + d);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.UNKNOWN_CIPHERTEXT_VERSION.getCode());
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.a;
        r2 = r2.k;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.a;
        r2 = r2.C;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.a;
        r2 = r2.t;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r6.a;
        r1 = r1.K;
        if (r1 == 0) goto L_0x0158;
    L_0x0049:
        r1 = r6.a;
        r1 = r1.K;
        r1 = org.whispersystems.aw.a(r1);
        r2 = r6.b;
        r2 = com.whatsapp.adn.b(r2);
        r2 = r2.a();
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = r4.t;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.append(r2);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x01b6 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        if (r1 == r2) goto L_0x0158;
    L_0x00a8:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = r4.t;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.append(r2);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x01b8 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r6.b;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = com.whatsapp.adn.c(r3);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        r3 = r3.ak;	 Catch:{ IllegalArgumentException -> 0x01b8 }
        if (r3 != 0) goto L_0x0110;
    L_0x00fc:
        r3 = r6.b;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = com.whatsapp.adn.b(r3);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3.a();	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = r6.b;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = com.whatsapp.adn.c(r3);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3.l();	 Catch:{ IllegalArgumentException -> 0x01ba }
        if (r0 == 0) goto L_0x0158;
    L_0x0110:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = r4.t;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r1 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x01ba }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x01ba }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x01ba }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x01ba }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x01ba }
    L_0x0158:
        r1 = new com.whatsapp.fieldstats.ap;
        r1.<init>();
        r2 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = r2.C;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = (double) r2;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x01bc }
        r1.c = r2;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = r2.k;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = com.whatsapp.qm.i(r2);	 Catch:{ IllegalArgumentException -> 0x01bc }
        if (r2 == 0) goto L_0x0183;
    L_0x0174:
        r2 = com.whatsapp.fieldstats.ad.GROUP;	 Catch:{ IllegalArgumentException -> 0x01be }
        r2 = r2.getCode();	 Catch:{ IllegalArgumentException -> 0x01be }
        r2 = (double) r2;	 Catch:{ IllegalArgumentException -> 0x01be }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x01be }
        r1.d = r2;	 Catch:{ IllegalArgumentException -> 0x01be }
        if (r0 == 0) goto L_0x01a9;
    L_0x0183:
        r2 = r6.a;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r2 = r2.t;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r2 = com.whatsapp.l5.e(r2);	 Catch:{ IllegalArgumentException -> 0x01c0 }
        if (r2 == 0) goto L_0x019c;
    L_0x018d:
        r2 = com.whatsapp.fieldstats.ad.LIST;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r2.getCode();	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = (double) r2;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r1.d = r2;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        if (r0 == 0) goto L_0x01a9;
    L_0x019c:
        r0 = com.whatsapp.fieldstats.ad.INDIVIDUAL;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r0.getCode();	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = (double) r0;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r1.d = r0;	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01a9:
        r0 = r6.a();
        if (r0 == 0) goto L_0x01b5;
    L_0x01af:
        r0 = r6.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x01c4 }
        if (r0 != 0) goto L_0x01c6;
    L_0x01b5:
        return;
    L_0x01b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b8 }
    L_0x01b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01ba }
    L_0x01ba:
        r0 = move-exception;
        throw r0;
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01be }
    L_0x01be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c0 }
    L_0x01c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01c2:
        r0 = move-exception;
        throw r0;
    L_0x01c4:
        r0 = move-exception;
        throw r0;
    L_0x01c6:
        r0 = com.whatsapp.App.z();
        com.whatsapp.fieldstats.i.a(r0, r1);
        r0 = r6.b;
        r0 = com.whatsapp.adn.c(r0);
        r0 = r0.M();
        r1 = new com.whatsapp.u6;
        r1.<init>(r6);
        r0.post(r1);
        goto L_0x01b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dt.run():void");
    }

    private void a(ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        boolean z = DialogToastActivity.f;
        try {
            if (b1Var.b == 0) {
                apVar.a = Double.valueOf((double) l.MESSAGE.getCode());
                adn.c(this.b, apVar, jVar, azVar, coVar, b1Var);
                if (!z) {
                    return;
                }
            }
            try {
                if (b1Var.b == 1) {
                    try {
                        apVar.a = Double.valueOf((double) l.PREKEY_MESSAGE.getCode());
                        adn.b(this.b, apVar, jVar, azVar, coVar, b1Var);
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
            try {
                if (b1Var.b == 2) {
                    try {
                        apVar.a = Double.valueOf((double) l.SENDER_KEY_MESSAGE.getCode());
                        adn.a(this.b, apVar, jVar, azVar, coVar, b1Var);
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                Log.w(z[22] + coVar.k + z[23] + b1Var.b);
                apVar.g = Double.valueOf(0.0d);
                apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.UNKNOWN_CIPHERTEXT_TYPE.getCode());
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }
}
