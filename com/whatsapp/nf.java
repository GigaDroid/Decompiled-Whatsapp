package com.whatsapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.whatsapp.contact.j;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.fieldstats.a3;
import com.whatsapp.fieldstats.a4;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.a_;
import com.whatsapp.fieldstats.af;
import com.whatsapp.fieldstats.b1;
import com.whatsapp.fieldstats.b3;
import com.whatsapp.fieldstats.ba;
import com.whatsapp.fieldstats.bg;
import com.whatsapp.fieldstats.bh;
import com.whatsapp.fieldstats.bn;
import com.whatsapp.fieldstats.bo;
import com.whatsapp.fieldstats.br;
import com.whatsapp.fieldstats.bw;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.c2;
import com.whatsapp.fieldstats.c5;
import com.whatsapp.fieldstats.i;
import com.whatsapp.fieldstats.k;
import com.whatsapp.fieldstats.x;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.io.File;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class nf {
    public static Events$Call a;
    private static final String[] z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle a(java.lang.Object r12) {
        /*
        r5 = com.whatsapp.DialogToastActivity.f;
        r6 = new android.os.Bundle;
        r6.<init>();
        r2 = r12.getClass();
        r7 = r2.getDeclaredFields();
        r8 = r7.length;
        r2 = 0;
        r4 = r2;
    L_0x0012:
        if (r4 >= r8) goto L_0x0064;
    L_0x0014:
        r2 = r7[r4];
        r9 = r2.getName();
        r3 = r2.get(r12);	 Catch:{ IllegalAccessException -> 0x006f }
        if (r3 == 0) goto L_0x0060;
    L_0x0020:
        r2 = r3 instanceof java.lang.Double;	 Catch:{ IllegalAccessException -> 0x0065 }
        if (r2 == 0) goto L_0x0031;
    L_0x0024:
        r0 = r3;
        r0 = (java.lang.Double) r0;	 Catch:{ IllegalAccessException -> 0x0067 }
        r2 = r0;
        r10 = r2.doubleValue();	 Catch:{ IllegalAccessException -> 0x0067 }
        r6.putDouble(r9, r10);	 Catch:{ IllegalAccessException -> 0x0067 }
        if (r5 == 0) goto L_0x0060;
    L_0x0031:
        r2 = r3 instanceof java.lang.String;	 Catch:{ IllegalAccessException -> 0x0069 }
        if (r2 == 0) goto L_0x003c;
    L_0x0035:
        r3 = (java.lang.String) r3;	 Catch:{ IllegalAccessException -> 0x006b }
        r6.putString(r9, r3);	 Catch:{ IllegalAccessException -> 0x006b }
        if (r5 == 0) goto L_0x0060;
    L_0x003c:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalAccessException -> 0x006d }
        r2.<init>();	 Catch:{ IllegalAccessException -> 0x006d }
        r3 = z;	 Catch:{ IllegalAccessException -> 0x006d }
        r10 = 10;
        r3 = r3[r10];	 Catch:{ IllegalAccessException -> 0x006d }
        r2 = r2.append(r3);	 Catch:{ IllegalAccessException -> 0x006d }
        r2 = r2.append(r9);	 Catch:{ IllegalAccessException -> 0x006d }
        r3 = z;	 Catch:{ IllegalAccessException -> 0x006d }
        r9 = 11;
        r3 = r3[r9];	 Catch:{ IllegalAccessException -> 0x006d }
        r2 = r2.append(r3);	 Catch:{ IllegalAccessException -> 0x006d }
        r2 = r2.toString();	 Catch:{ IllegalAccessException -> 0x006d }
        com.whatsapp.auv.a(r2);	 Catch:{ IllegalAccessException -> 0x006d }
    L_0x0060:
        r2 = r4 + 1;
        if (r5 == 0) goto L_0x0076;
    L_0x0064:
        return r6;
    L_0x0065:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalAccessException -> 0x0067 }
    L_0x0067:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalAccessException -> 0x0069 }
    L_0x0069:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalAccessException -> 0x006b }
    L_0x006b:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalAccessException -> 0x006d }
    L_0x006d:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalAccessException -> 0x006f }
    L_0x006f:
        r2 = move-exception;
        r3 = new java.lang.IllegalArgumentException;
        r3.<init>(r2);
        throw r3;
    L_0x0076:
        r4 = r2;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nf.a(java.lang.Object):android.os.Bundle");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.fieldstats.Events$Call a(com.whatsapp.fieldstats.Events$Call r6, java.lang.String r7, java.lang.Double r8, java.lang.Double r9, java.lang.Integer r10, com.whatsapp.fieldstats.ce r11, java.lang.String r12, java.lang.String r13) {
        /*
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = a(r7);
        r6.peerUserId = r0;
        r0 = new java.lang.Double;
        r1 = com.whatsapp.VoiceService.b();
        r4 = (double) r1;
        r0.<init>(r4);
        r6.callNetwork = r0;
        r0 = com.whatsapp.App.ad;
        if (r0 == 0) goto L_0x002c;
    L_0x0018:
        r0 = com.whatsapp.App.ad;
        r0 = r0.getActiveNetworkInfo();
        if (r0 == 0) goto L_0x002c;
    L_0x0020:
        r1 = new java.lang.Double;	 Catch:{ Throwable -> 0x012c }
        r0 = r0.getSubtype();	 Catch:{ Throwable -> 0x012c }
        r4 = (double) r0;	 Catch:{ Throwable -> 0x012c }
        r1.<init>(r4);	 Catch:{ Throwable -> 0x012c }
        r6.callNetworkSubtype = r1;	 Catch:{ Throwable -> 0x012c }
    L_0x002c:
        r0 = com.whatsapp.App.B;	 Catch:{ Throwable -> 0x012e }
        if (r0 == 0) goto L_0x0040;
    L_0x0030:
        r0 = new java.lang.Double;	 Catch:{ Throwable -> 0x012e }
        r1 = com.whatsapp.fieldstats.ci.CONNECTED;	 Catch:{ Throwable -> 0x012e }
        r1 = r1.getCode();	 Catch:{ Throwable -> 0x012e }
        r4 = (double) r1;	 Catch:{ Throwable -> 0x012e }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x012e }
        r6.xmppStatus = r0;	 Catch:{ Throwable -> 0x012e }
        if (r2 == 0) goto L_0x0062;
    L_0x0040:
        r0 = com.whatsapp.App.aI;	 Catch:{ Throwable -> 0x0130 }
        if (r0 == 0) goto L_0x0054;
    L_0x0044:
        r0 = new java.lang.Double;	 Catch:{ Throwable -> 0x0132 }
        r1 = com.whatsapp.fieldstats.ci.CONNECTING;	 Catch:{ Throwable -> 0x0132 }
        r1 = r1.getCode();	 Catch:{ Throwable -> 0x0132 }
        r4 = (double) r1;	 Catch:{ Throwable -> 0x0132 }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x0132 }
        r6.xmppStatus = r0;	 Catch:{ Throwable -> 0x0132 }
        if (r2 == 0) goto L_0x0062;
    L_0x0054:
        r0 = new java.lang.Double;	 Catch:{ Throwable -> 0x0134 }
        r1 = com.whatsapp.fieldstats.ci.DISCONNECTED;	 Catch:{ Throwable -> 0x0134 }
        r1 = r1.getCode();	 Catch:{ Throwable -> 0x0134 }
        r4 = (double) r1;	 Catch:{ Throwable -> 0x0134 }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x0134 }
        r6.xmppStatus = r0;	 Catch:{ Throwable -> 0x0134 }
    L_0x0062:
        r0 = com.whatsapp.Voip.h();	 Catch:{ Throwable -> 0x0136 }
        if (r0 == 0) goto L_0x0138;
    L_0x0068:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x006a:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ Throwable -> 0x013c }
        r6.builtinAecAvailable = r0;	 Catch:{ Throwable -> 0x013c }
        r0 = com.whatsapp.Voip.j();	 Catch:{ Throwable -> 0x013c }
        if (r0 == 0) goto L_0x013e;
    L_0x0076:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x0078:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ Throwable -> 0x0142 }
        r6.builtinAgcAvailable = r0;	 Catch:{ Throwable -> 0x0142 }
        r0 = com.whatsapp.Voip.e();	 Catch:{ Throwable -> 0x0142 }
        if (r0 == 0) goto L_0x0144;
    L_0x0084:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x0086:
        r0 = java.lang.Double.valueOf(r0);
        r6.builtinNsAvailable = r0;
        r0 = com.whatsapp.App.z();
        r1 = z;
        r3 = 5;
        r1 = r1[r3];
        r3 = 0;
        r0 = r0.getSharedPreferences(r1, r3);
        if (r0 == 0) goto L_0x00b4;
    L_0x009c:
        r1 = z;	 Catch:{ Throwable -> 0x0148 }
        r3 = 3;
        r1 = r1[r3];	 Catch:{ Throwable -> 0x0148 }
        r3 = 0;
        r1 = r0.getString(r1, r3);	 Catch:{ Throwable -> 0x0148 }
        r6.builtinAecImplementor = r1;	 Catch:{ Throwable -> 0x0148 }
        r1 = z;	 Catch:{ Throwable -> 0x0148 }
        r3 = 4;
        r1 = r1[r3];	 Catch:{ Throwable -> 0x0148 }
        r3 = 0;
        r0 = r0.getString(r1, r3);	 Catch:{ Throwable -> 0x0148 }
        r6.builtinAecUuid = r0;	 Catch:{ Throwable -> 0x0148 }
    L_0x00b4:
        r6.callOfferElapsedT = r8;	 Catch:{ Throwable -> 0x014a }
        r6.callFromUi = r9;	 Catch:{ Throwable -> 0x014a }
        if (r11 != 0) goto L_0x014c;
    L_0x00ba:
        r0 = 0;
    L_0x00bb:
        r6.callWakeupSource = r0;
        r6.callPeerPlatform = r12;
        r6.callPeerAppVersion = r13;
        r0 = com.whatsapp.App.a1;
        r0 = r0.e(r7);
        r4 = 0;
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x00dd;
    L_0x00cd:
        r3 = new java.lang.Double;	 Catch:{ Throwable -> 0x0158 }
        r4 = com.whatsapp.fieldstats.ci.UNKNOWN;	 Catch:{ Throwable -> 0x0158 }
        r4 = r4.getCode();	 Catch:{ Throwable -> 0x0158 }
        r4 = (double) r4;	 Catch:{ Throwable -> 0x0158 }
        r3.<init>(r4);	 Catch:{ Throwable -> 0x0158 }
        r6.peerXmppStatus = r3;	 Catch:{ Throwable -> 0x0158 }
        if (r2 == 0) goto L_0x0101;
    L_0x00dd:
        r4 = 1;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x00f3;
    L_0x00e3:
        r0 = new java.lang.Double;	 Catch:{ Throwable -> 0x015c }
        r1 = com.whatsapp.fieldstats.ci.CONNECTED;	 Catch:{ Throwable -> 0x015c }
        r1 = r1.getCode();	 Catch:{ Throwable -> 0x015c }
        r4 = (double) r1;	 Catch:{ Throwable -> 0x015c }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x015c }
        r6.peerXmppStatus = r0;	 Catch:{ Throwable -> 0x015c }
        if (r2 == 0) goto L_0x0101;
    L_0x00f3:
        r0 = new java.lang.Double;	 Catch:{ Throwable -> 0x015e }
        r1 = com.whatsapp.fieldstats.ci.DISCONNECTED;	 Catch:{ Throwable -> 0x015e }
        r1 = r1.getCode();	 Catch:{ Throwable -> 0x015e }
        r2 = (double) r1;	 Catch:{ Throwable -> 0x015e }
        r0.<init>(r2);	 Catch:{ Throwable -> 0x015e }
        r6.peerXmppStatus = r0;	 Catch:{ Throwable -> 0x015e }
    L_0x0101:
        if (r10 == 0) goto L_0x010d;
    L_0x0103:
        r0 = r10.doubleValue();	 Catch:{ Throwable -> 0x0160 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ Throwable -> 0x0160 }
        r6.callAndroidAudioMode = r0;	 Catch:{ Throwable -> 0x0160 }
    L_0x010d:
        r0 = com.whatsapp.a59.p;	 Catch:{ Throwable -> 0x0162 }
        if (r0 == 0) goto L_0x0164;
    L_0x0111:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x0113:
        r0 = java.lang.Double.valueOf(r0);
        r6.longConnect = r0;
        r0 = new java.lang.Double;	 Catch:{ Throwable -> 0x0167 }
        r1 = java.lang.Runtime.getRuntime();	 Catch:{ Throwable -> 0x0167 }
        r1 = r1.availableProcessors();	 Catch:{ Throwable -> 0x0167 }
        r2 = (double) r1;	 Catch:{ Throwable -> 0x0167 }
        r0.<init>(r2);	 Catch:{ Throwable -> 0x0167 }
        r6.numberOfProcessors = r0;	 Catch:{ Throwable -> 0x0167 }
    L_0x0129:
        a = r6;
        return r6;
    L_0x012c:
        r0 = move-exception;
        throw r0;
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0130 }
    L_0x0130:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0132 }
    L_0x0132:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0134 }
    L_0x0134:
        r0 = move-exception;
        throw r0;
    L_0x0136:
        r0 = move-exception;
        throw r0;
    L_0x0138:
        r0 = 0;
        goto L_0x006a;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r0 = 0;
        goto L_0x0078;
    L_0x0142:
        r0 = move-exception;
        throw r0;
    L_0x0144:
        r0 = 0;
        goto L_0x0086;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = move-exception;
        throw r0;
    L_0x014c:
        r0 = new java.lang.Double;
        r1 = r11.getCode();
        r4 = (double) r1;
        r0.<init>(r4);
        goto L_0x00bb;
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x015c }
    L_0x015c:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x015e }
    L_0x015e:
        r0 = move-exception;
        throw r0;
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = 0;
        goto L_0x0113;
    L_0x0167:
        r0 = move-exception;
        r0 = 0;
        r6.numberOfProcessors = r0;
        goto L_0x0129;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nf.a(com.whatsapp.fieldstats.Events$Call, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Integer, com.whatsapp.fieldstats.ce, java.lang.String, java.lang.String):com.whatsapp.fieldstats.Events$Call");
    }

    public static void a(Context context, c2 c2Var, bg bgVar, long j, long j2) {
        av baVar = new ba();
        baVar.a = Double.valueOf((double) c2Var.getCode());
        baVar.d = Double.valueOf((double) bgVar.getCode());
        baVar.c = Double.valueOf((double) j2);
        baVar.b = Double.valueOf((double) j);
        i.a(context, baVar);
    }

    private static int a(j jVar) {
        try {
            if (jVar == j.NETWORK_UNAVAILABLE) {
                return c5.NETWORK_UNAVAILABLE.getCode();
            }
            try {
                if (jVar == j.IN_PROGRESS) {
                    return c5.IN_PROGRESS.getCode();
                }
                try {
                    if (jVar == j.UP_TO_DATE) {
                        return c5.UP_TO_DATE.getCode();
                    }
                    try {
                        if (jVar == j.FAILED) {
                            return c5.FAILED.getCode();
                        }
                        try {
                            if (jVar == j.DELAYED) {
                                return c5.DELAYED.getCode();
                            }
                            return 0;
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            } catch (NumberFormatException e222) {
                throw e222;
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static void a(Context context, boolean z, j jVar, long j) {
        double d;
        av a4Var = new a4();
        if (z) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        a4Var.d = Double.valueOf(d);
        int a = a(jVar);
        if (a != 0) {
            try {
                a4Var.c = Double.valueOf((double) a);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        a4Var.b = Double.valueOf((double) j);
        i.a(context, a4Var);
    }

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            int type = networkInfo.getType();
            int subtype = networkInfo.getSubtype();
            if (type == 0) {
                switch (subtype) {
                    case at.g /*1*/:
                        return x.CELLULAR_GPRS.getCode();
                    case at.i /*2*/:
                        try {
                            return x.CELLULAR_EDGE.getCode();
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    case at.o /*3*/:
                        return x.CELLULAR_UMTS.getCode();
                    case at.p /*4*/:
                        return x.CELLULAR_CDMA.getCode();
                    case at.m /*5*/:
                    case Y.f /*6*/:
                    case Y.p /*12*/:
                        return x.CELLULAR_EVDO.getCode();
                    case aF.v /*7*/:
                        return x.CELLULAR_1XRTT.getCode();
                    case aF.u /*8*/:
                        return x.CELLULAR_HSDPA.getCode();
                    case Y.l /*9*/:
                        return x.CELLULAR_HSUPA.getCode();
                    case Y.t /*10*/:
                        return x.CELLULAR_HSPA.getCode();
                    case Y.j /*11*/:
                        return x.CELLULAR_IDEN.getCode();
                    case Y.q /*13*/:
                        return x.CELLULAR_LTE.getCode();
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        return x.CELLULAR_EHRPD.getCode();
                    case arj.Toolbar_titleMarginTop /*15*/:
                        return x.CELLULAR_HSPAP.getCode();
                    default:
                        return x.CELLULAR_UNKNOWN.getCode();
                }
            } else if (type == 1) {
                try {
                    return x.WIFI_UNKNOWN.getCode();
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
        return -1;
    }

    private static String b(String str) {
        if (str == null) {
            try {
                Log.w(z[9]);
                return null;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        int indexOf = str.indexOf(64);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    public static void a(Object obj, Bundle bundle) {
        boolean z = DialogToastActivity.f;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            try {
                field.set(obj, bundle.get(field.getName()));
                i++;
                if (z) {
                    return;
                }
            } catch (Throwable e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static void d() {
        try {
            if (!Voip.d()) {
                if (i.j(App.z().getApplicationContext())) {
                    App.p.r();
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static void a(Context context, a_ a_Var, long j) {
        av bwVar = new bw();
        bwVar.a = Double.valueOf((double) a_Var.getCode());
        bwVar.b = Double.valueOf((double) j);
        i.a(context, bwVar);
    }

    public static void a(Context context) {
        boolean z = true;
        int az = App.az();
        try {
            try {
                i.a(context, bn.NETWORK_IS_WIFI, Boolean.valueOf(az == 1));
                bn bnVar = bn.NETWORK_IS_ROAMING;
                if (az != 3) {
                    z = false;
                }
                i.a(context, bnVar, Boolean.valueOf(z));
                int a = a();
                try {
                    Integer num;
                    bn bnVar2 = bn.NETWORK_RADIO_TYPE;
                    if (a == -1) {
                        num = null;
                    } else {
                        num = Integer.valueOf(a);
                    }
                    i.a(context, bnVar2, num);
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void a(k kVar) {
        a(kVar, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long[] a(java.io.File r13) {
        /*
        r12 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = 2;
        r0 = new long[r0];
        r0 = {0, 0};
        if (r13 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r4 = r13.listFiles();
        if (r4 == 0) goto L_0x0051;
    L_0x0013:
        r5 = r4.length;
        r1 = r2;
    L_0x0015:
        if (r1 >= r5) goto L_0x004f;
    L_0x0017:
        r6 = r4[r1];
        r7 = r6.isFile();	 Catch:{ NumberFormatException -> 0x006d }
        if (r7 == 0) goto L_0x0033;
    L_0x001f:
        r7 = 0;
        r8 = r0[r7];	 Catch:{ NumberFormatException -> 0x006f }
        r10 = r6.length();	 Catch:{ NumberFormatException -> 0x006f }
        r8 = r8 + r10;
        r0[r7] = r8;	 Catch:{ NumberFormatException -> 0x006f }
        r7 = 1;
        r8 = r0[r7];	 Catch:{ NumberFormatException -> 0x006f }
        r10 = 1;
        r8 = r8 + r10;
        r0[r7] = r8;	 Catch:{ NumberFormatException -> 0x006f }
        if (r3 == 0) goto L_0x004b;
    L_0x0033:
        r7 = r6.isDirectory();	 Catch:{ NumberFormatException -> 0x006f }
        if (r7 == 0) goto L_0x004b;
    L_0x0039:
        r6 = a(r6);
        r8 = r0[r2];
        r10 = r6[r2];
        r8 = r8 + r10;
        r0[r2] = r8;
        r8 = r0[r12];
        r6 = r6[r12];
        r6 = r6 + r8;
        r0[r12] = r6;
    L_0x004b:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0015;
    L_0x004f:
        if (r3 == 0) goto L_0x000c;
    L_0x0051:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x006b }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x006b }
        r2 = z;	 Catch:{ NumberFormatException -> 0x006b }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x006b }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x006b }
        r1 = r1.append(r13);	 Catch:{ NumberFormatException -> 0x006b }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x006b }
        com.whatsapp.util.Log.w(r1);	 Catch:{ NumberFormatException -> 0x006b }
        goto L_0x000c;
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nf.a(java.io.File):long[]");
    }

    private static Double a(String str) {
        String b = b(str);
        if (b == null) {
            return null;
        }
        try {
            return new Double(Double.parseDouble(b));
        } catch (NumberFormatException e) {
            Log.e(z[7] + str);
            return null;
        }
    }

    public static int a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) App.z().getSystemService(z[8]);
        if (connectivityManager != null) {
            return a(connectivityManager.getActiveNetworkInfo());
        }
        return -1;
    }

    public static void a(Context context, Events$Call events$Call, boolean z) {
        if (events$Call != null) {
            bq.a(new no(context, events$Call, z));
        }
    }

    public static void a(Context context, br brVar, br brVar2, a3 a3Var, String str, int i, boolean z, String str2, int i2, long j) {
        av boVar = new bo();
        try {
            double d;
            boVar.b = Double.valueOf((double) brVar.getCode());
            boVar.c = Double.valueOf((double) brVar2.getCode());
            boVar.d = Double.valueOf((double) a3Var.getCode());
            boVar.g = str;
            boVar.i = Double.valueOf((double) i);
            if (z) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            boVar.f = Double.valueOf(d);
            boVar.e = str2;
            boVar.a = Double.valueOf((double) i2);
            boVar.h = Double.valueOf((double) j);
            i.a(context, boVar);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(k kVar, c cVar) {
        av b3Var = new b3();
        try {
            b3Var.a = Double.valueOf((double) kVar.getCode());
            if (cVar != null) {
                b3Var.b = Double.valueOf((double) cVar.getCode());
            }
            i.a(App.z(), b3Var);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Context context, br brVar, br brVar2, a5 a5Var, b1 b1Var, String str, boolean z, String str2, int i, int i2, int i3, long j) {
        av a7Var = new a7();
        try {
            double d;
            a7Var.a = Double.valueOf((double) brVar.getCode());
            a7Var.k = Double.valueOf((double) brVar2.getCode());
            a7Var.f = Double.valueOf((double) a5Var.getCode());
            a7Var.b = Double.valueOf((double) b1Var.getCode());
            a7Var.g = str;
            if (z) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            a7Var.e = Double.valueOf(d);
            a7Var.d = str2;
            a7Var.j = Double.valueOf((double) i);
            a7Var.i = Double.valueOf((double) i2);
            a7Var.h = Double.valueOf((double) i3);
            a7Var.c = Double.valueOf((double) j);
            i.a(context, a7Var);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void c() {
        File a = dg.a((byte) 0, 0, false);
        try {
            if (a.exists() && a.isDirectory()) {
                try {
                    long[] a2 = a(a);
                    i.a(App.z(), bn.MEDIA_FOLDER_SIZE, Double.valueOf((double) a2[0]));
                    i.a(App.z(), bn.MEDIA_FOLDER_FILE_COUNT, Double.valueOf((double) a2[1]));
                    a = dg.a((byte) 3, 0, false);
                    if (a.exists() && a.isDirectory()) {
                        a2 = a(a);
                        i.a(App.z(), bn.VIDEO_FOLDER_SIZE, Double.valueOf((double) a2[0]));
                        i.a(App.z(), bn.VIDEO_FOLDER_FILE_COUNT, Double.valueOf((double) a2[1]));
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    }
                    Log.e(z[1]);
                } catch (StackOverflowError e) {
                    throw e;
                } catch (OutOfMemoryError e2) {
                    Log.e(z[2]);
                } catch (StackOverflowError e3) {
                    throw e3;
                } catch (StackOverflowError e4) {
                    Log.e(z[0]);
                }
            }
        } catch (StackOverflowError e32) {
            throw e32;
        } catch (StackOverflowError e322) {
            throw e322;
        }
    }

    public static void a(Context context, boolean z, int i, long j) {
        int code;
        av afVar = new af();
        if (z) {
            try {
                code = bh.OK.getCode();
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        code = bh.ERROR_UNKNOWN.getCode();
        afVar.c = Double.valueOf((double) code);
        afVar.a = Double.valueOf((double) i);
        afVar.b = Double.valueOf((double) j);
        i.a(context, afVar);
    }

    static {
        String[] strArr = new String[12];
        String str = "+\u0004cs\b>\u0019gk\u0004(\u0001vz\u001e>Bso\b,\u0019c2\u0001(\to~A+\u0002j{\t?@`v\t!\tuk\r9\u001e)z\u001e?\u0002t0\u001f9\fet\u0003;\bty\u0000\"\u001a";
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
                        i3 = 77;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "+\u0004cs\b>\u0019gk\u0004(\u0001vz\u001e>Bso\b,\u0019c2\u0001(\to~A+\u0002j{\t?@`v\t!\tuk\r9\u001e)z\u001e?\u0002t0\u00038\u0019iy\u0001(\u0000im\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ",\be@\u0005 \u001djz\u0001(\u0003rp\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ",\be@\u00198\u0004b";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ".\u0002k1\u001b%\frl\r=\u001dYo\u001e(\u000bcm\t#\u000ecl";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = " \bbv\r+\u0002j{\t?\u001eoe\tm\u0001ol\u0018(\t@v\u0000(\u001e&v\u001fm\u0003ss\u0000m\u000bimL+\u0002j{\t?M";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = ";\u0002ooC=\u0005iq\t#\u0018k}\t?Bcm\u001e\"\u001f&y\r$\u0001c{L9\u0002&o\r?\u001ec?";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ".\u0002hq\t.\u0019oi\u00059\u0014";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ";\u0002ooC=\u0005iq\t#\u0018k}\t?Blv\bb\u0003ss\u0000";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "8\u0003cg\u001c(\u000erz\bm\u0000cr\u000e(\u001f&";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "m\u0004h?\n$\bj{\u001f9\frlL(\u001bcq\u0018aMiq\u00004MBp\u0019/\u0001c?\u0003?MUk\u001e$\u0003a?\u0001(\u0000dz\u001e>Mgm\tm\u001eso\u001c\"\u001frz\b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "+\u0004cs\b>\u0019gk\u0004(\u0001vz\u001e>Bso\b,\u0019c2\u0001(\to~A+\u0002j{\t?@`v\t!\tuk\r9\u001e)z\u001e?\u0002t0\u001a$\tcpA+\u0002j{\t?@bp\t>@hp\u0018`\b~v\u001f9";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
        r0 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r9 = com.whatsapp.qa.g();
        r1 = r0;
        r2 = r0;
        r3 = r0;
        r4 = r0;
        r5 = r0;
        r6 = r0;
        r7 = r0;
    L_0x000e:
        r0 = r9.size();
        if (r1 >= r0) goto L_0x0050;
    L_0x0014:
        r0 = r9.get(r1);
        r0 = (java.lang.String) r0;
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        if (r8 == 0) goto L_0x004c;
    L_0x001e:
        r10 = com.whatsapp.App.aK;
        r10 = r10.b(r0);
        r11 = com.whatsapp.qm.i(r0);	 Catch:{ NumberFormatException -> 0x009f }
        if (r11 == 0) goto L_0x0034;
    L_0x002a:
        if (r10 == 0) goto L_0x0030;
    L_0x002c:
        r3 = r3 + 1;
        if (r8 == 0) goto L_0x004c;
    L_0x0030:
        r6 = r6 + 1;
        if (r8 == 0) goto L_0x004c;
    L_0x0034:
        r0 = com.whatsapp.l5.e(r0);	 Catch:{ NumberFormatException -> 0x00a7 }
        if (r0 == 0) goto L_0x0044;
    L_0x003a:
        if (r10 == 0) goto L_0x0040;
    L_0x003c:
        r2 = r2 + 1;
        if (r8 == 0) goto L_0x004c;
    L_0x0040:
        r5 = r5 + 1;
        if (r8 == 0) goto L_0x004c;
    L_0x0044:
        if (r10 == 0) goto L_0x004a;
    L_0x0046:
        r4 = r4 + 1;
        if (r8 == 0) goto L_0x004c;
    L_0x004a:
        r7 = r7 + 1;
    L_0x004c:
        r0 = r1 + 1;
        if (r8 == 0) goto L_0x00b3;
    L_0x0050:
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.INDIVIDUAL_CHAT_COUNT;
        r7 = java.lang.Integer.valueOf(r7);
        com.whatsapp.fieldstats.i.a(r0, r1, r7);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.GROUP_CHAT_COUNT;
        r6 = java.lang.Integer.valueOf(r6);
        com.whatsapp.fieldstats.i.a(r0, r1, r6);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.BROADCAST_CHAT_COUNT;
        r5 = java.lang.Integer.valueOf(r5);
        com.whatsapp.fieldstats.i.a(r0, r1, r5);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.INDIVIDUAL_ARCHIVED_CHAT_COUNT;
        r4 = java.lang.Integer.valueOf(r4);
        com.whatsapp.fieldstats.i.a(r0, r1, r4);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.GROUP_ARCHIVED_CHAT_COUNT;
        r3 = java.lang.Integer.valueOf(r3);
        com.whatsapp.fieldstats.i.a(r0, r1, r3);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.BROADCAST_ARCHIVED_CHAT_COUNT;
        r2 = java.lang.Integer.valueOf(r2);
        com.whatsapp.fieldstats.i.a(r0, r1, r2);
        return;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r1 = r0;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nf.b():void");
    }
}
