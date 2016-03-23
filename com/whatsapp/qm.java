package com.whatsapp;

import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.bt;
import com.whatsapp.protocol.co;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class qm implements bt {
    private static final ConcurrentHashMap a;
    public static boolean b;
    private static Handler c;
    public static boolean d;
    private static ConcurrentHashMap e;
    private static final String[] z;

    public void a(ct ctVar, String str, String str2, int i) {
        boolean z = DialogToastActivity.f;
        Log.i(z[52] + ctVar + "/" + str + "/" + str2 + "/" + (((long) i) * 1000));
        String str3 = ctVar.e;
        l5 c = App.as.c(str3);
        if (c != null) {
            try {
                if (!c.a(App.z()).equals(str)) {
                    Log.i(z[51]);
                    App.as.a(str3, str2, str);
                    a(3, b(ctVar, str3, str, str2, ((long) i) * 1000));
                    if (!z) {
                        return;
                    }
                }
                Log.i(z[50]);
                App.b(ctVar);
                if (!z) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        Log.i(z[53]);
        aoy com_whatsapp_aoy = new aoy(str3);
        qa.a(str3, str, ((long) i) * 1000);
        com_whatsapp_aoy.a(str3.substring(0, str3.indexOf("-")) + z[54], true, false);
        a.put(str3, com_whatsapp_aoy);
        a(0, a(ctVar, str3, str, str2, ((long) i) * 1000));
        App.c(str3, null);
    }

    public void a(ct ctVar) {
    }

    public static co a(String str, String str2, Vector vector, int i) {
        co coVar = new co(str, str2, null);
        coVar.b = App.av();
        coVar.d = 6;
        coVar.z = (long) i;
        coVar.Q = vector;
        return coVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r8, java.util.Vector r9, java.lang.String r10) {
        /*
        r7 = this;
        r6 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 66;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = "/";
        r0 = r0.append(r1);
        r1 = r9.toArray();
        r1 = java.util.Arrays.deepToString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r3 = r8.e;
        r4 = c(r3);
        r5 = r9.iterator();
    L_0x003a:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x005c;
    L_0x0040:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r1 = r4.a(r0);
        if (r1 != 0) goto L_0x0066;
    L_0x004c:
        r0 = r4.a(r0, r6, r6);
        if (r2 == 0) goto L_0x0055;
    L_0x0052:
        r1 = 0;
        r0.d = r1;	 Catch:{ NullPointerException -> 0x0064 }
    L_0x0055:
        r1 = com.whatsapp.App.aK;
        r1.a(r3, r0);
        if (r2 == 0) goto L_0x003a;
    L_0x005c:
        com.whatsapp.App.b(r8);
        r0 = 4;
        a(r0, r3);
        return;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = r1;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(com.whatsapp.protocol.ct, java.util.Vector, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
        r9 = this;
        r2 = 1;
        r0 = 0;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 23;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r10);
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r11);
        r3 = z;
        r4 = 20;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r12);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r3 = r10.e;
        r1 = com.whatsapp.App.as;
        r4 = r1.c(r3);
        r5 = c(r3);
        r6 = r5.a(r11);
        r5.b(r11);	 Catch:{ NullPointerException -> 0x00b4 }
        if (r6 == 0) goto L_0x00b8;
    L_0x004d:
        r1 = r6.d;	 Catch:{ NullPointerException -> 0x00b6 }
        if (r1 == 0) goto L_0x00b8;
    L_0x0051:
        r1 = r2;
    L_0x0052:
        r7 = 0;
        r5.a(r12, r1, r7);	 Catch:{ NullPointerException -> 0x00ba }
        if (r4 == 0) goto L_0x0060;
    L_0x0058:
        r1 = r5.f();	 Catch:{ NullPointerException -> 0x00bc }
        if (r1 == 0) goto L_0x0060;
    L_0x005e:
        if (r6 != 0) goto L_0x00a7;
    L_0x0060:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00c0 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00c0 }
        r7 = z;	 Catch:{ NullPointerException -> 0x00c0 }
        r8 = 21;
        r7 = r7[r8];	 Catch:{ NullPointerException -> 0x00c0 }
        r7 = r1.append(r7);	 Catch:{ NullPointerException -> 0x00c0 }
        if (r4 != 0) goto L_0x00c2;
    L_0x0071:
        r1 = r2;
    L_0x0072:
        r1 = r7.append(r1);	 Catch:{ NullPointerException -> 0x00c4 }
        r7 = "/";
        r7 = r1.append(r7);	 Catch:{ NullPointerException -> 0x00c4 }
        r1 = r5.f();	 Catch:{ NullPointerException -> 0x00c4 }
        if (r1 != 0) goto L_0x00c6;
    L_0x0083:
        r1 = r2;
    L_0x0084:
        r1 = r7.append(r1);	 Catch:{ NullPointerException -> 0x00c8 }
        r5 = "/";
        r5 = r1.append(r5);	 Catch:{ NullPointerException -> 0x00c8 }
        if (r6 != 0) goto L_0x00ca;
    L_0x0091:
        r1 = r2;
    L_0x0092:
        r1 = r5.append(r1);	 Catch:{ NullPointerException -> 0x00cc }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00cc }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00cc }
        r1 = 0;
        com.whatsapp.App.c(r3, r1);	 Catch:{ NullPointerException -> 0x00cc }
        if (r4 != 0) goto L_0x00ce;
    L_0x00a3:
        r1 = 2;
        com.whatsapp.App.a(r3, r0, r1);
    L_0x00a7:
        r0 = r10.e;
        r0 = a(r0, r11, r12);
        a(r2, r0);
        com.whatsapp.App.b(r10);
        return;
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r1 = r0;
        goto L_0x0052;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r1 = r0;
        goto L_0x0072;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r1 = r0;
        goto L_0x0084;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r1 = r0;
        goto L_0x0092;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = r4.o;
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(com.whatsapp.protocol.ct, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static boolean f(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = c(str).d().iterator();
        while (it.hasNext()) {
            adl com_whatsapp_adl = (adl) it.next();
            if (!com_whatsapp_adl.a()) {
                l5 f = App.as.f(com_whatsapp_adl.e);
                if (f != null) {
                    try {
                        if (f.l != null) {
                            return true;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                continue;
            }
            if (z) {
                break;
            }
        }
        return false;
    }

    public void c() {
        e.clear();
    }

    public static boolean a() {
        return App.z().getSharedPreferences(z[65], 0).getBoolean(z[64], true);
    }

    public void b(String str, String str2, long j, String str3, long j2, String str4, String str5, long j3, Hashtable hashtable) {
        Log.i(z[47] + str + z[41] + str2 + z[46] + j + z[45] + str4 + z[43] + str3 + z[42] + j2 + z[40] + str5 + z[48] + j3);
        Log.i(z[44] + Arrays.deepToString(Collections.list(hashtable.keys()).toArray()) + "/" + Arrays.deepToString(hashtable.values().toArray()));
        a(str, str2, j, str3, j2, j3, hashtable);
    }

    public static boolean a(co coVar) {
        try {
            if (coVar.d == 6) {
                if (coVar.z == 1) {
                    if (!coVar.t.contains(App.ad())) {
                        return true;
                    }
                }
                try {
                    if (coVar.z == 4) {
                        try {
                            if (coVar.H == 1) {
                                return true;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
                try {
                    if (coVar.z == 12) {
                        try {
                            if (coVar.H == 1) {
                                return true;
                            }
                        } catch (NullPointerException e22) {
                            try {
                                throw e22;
                            } catch (NullPointerException e222) {
                                try {
                                    throw e222;
                                } catch (NullPointerException e2222) {
                                    Log.e(z[9] + Log.a(coVar));
                                    throw e2222;
                                }
                            }
                        }
                    }
                } catch (NullPointerException e22222) {
                    throw e22222;
                }
            }
            return false;
        } catch (NullPointerException e222222) {
            throw e222222;
        } catch (NullPointerException e2222222) {
            throw e2222222;
        }
    }

    public void a(@NonNull String str, @NonNull Hashtable hashtable, @NonNull Hashtable hashtable2) {
        try {
            Log.i(z[58] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2.size() > 0) {
                a(36, (Object) hashtable2);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.co b(com.whatsapp.protocol.ct r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
        r1 = 0;
        if (r4 == 0) goto L_0x000c;
    L_0x0003:
        r0 = new com.whatsapp.ax9;
        r0.<init>(r4);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0015;
    L_0x000c:
        r2 = new com.whatsapp.protocol.co;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r5, r0, r1);
        r0 = r2;
    L_0x0015:
        r0.b(r6);
        r1 = 6;
        r0.d = r1;
        r2 = 1;
        r0.z = r2;
        r0.t = r7;
        r0.b = r8;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.b(com.whatsapp.protocol.ct, java.lang.String, java.lang.String, java.lang.String, long):com.whatsapp.protocol.co");
    }

    public static String a(ArrayList arrayList) {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        char b = aam.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(b);
                    stringBuilder.append(' ');
                }
                stringBuilder.append(str);
                if (z) {
                    break;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return stringBuilder.toString();
    }

    public static boolean h(String str) {
        return c(str).f();
    }

    public void b(ct ctVar) {
    }

    public static void a(int i, Object obj) {
        c.obtainMessage(i, obj).sendToTarget();
    }

    public void c(@NonNull String str, @NonNull Hashtable hashtable, @NonNull Hashtable hashtable2) {
        try {
            Log.i(z[56] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2.size() > 0) {
                a(38, (Object) hashtable2);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, long r20, long r22, java.util.Hashtable r24) {
        /*
        r14 = this;
        r11 = com.whatsapp.DialogToastActivity.f;
        r4 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x00d3 }
        r4 = r4.t(r15);	 Catch:{ NullPointerException -> 0x00d3 }
        if (r4 != 0) goto L_0x00d5;
    L_0x000a:
        r4 = 1;
        r10 = r4;
    L_0x000c:
        if (r10 == 0) goto L_0x004c;
    L_0x000e:
        r12 = 0;
        r4 = 0;
        r5 = r15;
        r6 = r19;
        r7 = r16;
        r8 = r20;
        r4 = a(r4, r5, r6, r7, r8);	 Catch:{ NullPointerException -> 0x00d9 }
        a(r12, r4);	 Catch:{ NullPointerException -> 0x00d9 }
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x00d9 }
        r0 = r16;
        r4 = r4.d(r0);	 Catch:{ NullPointerException -> 0x00d9 }
        if (r4 != 0) goto L_0x0055;
    L_0x0028:
        r5 = new com.whatsapp.protocol.co;
        r4 = 0;
        r4 = (byte[]) r4;
        r6 = 0;
        r5.<init>(r15, r4, r6);
        r4 = 6;
        r5.d = r4;	 Catch:{ NullPointerException -> 0x00db }
        r6 = 4;
        r5.z = r6;	 Catch:{ NullPointerException -> 0x00db }
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x00db }
        r4 = r4.e();	 Catch:{ NullPointerException -> 0x00db }
        r4 = r4.p;	 Catch:{ NullPointerException -> 0x00db }
        r5.t = r4;	 Catch:{ NullPointerException -> 0x00db }
        r0 = r20;
        r5.b = r0;	 Catch:{ NullPointerException -> 0x00db }
        r4 = 1;
        a(r4, r5);	 Catch:{ NullPointerException -> 0x00db }
        if (r11 == 0) goto L_0x0055;
    L_0x004c:
        r4 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x00db }
        r0 = r19;
        r1 = r17;
        r4.a(r15, r0, r1);	 Catch:{ NullPointerException -> 0x00db }
    L_0x0055:
        r5 = c(r15);
        if (r10 != 0) goto L_0x00dd;
    L_0x005b:
        r4 = 1;
    L_0x005c:
        r0 = r24;
        r4 = r5.a(r0, r4);	 Catch:{ NullPointerException -> 0x00e0 }
        if (r4 == 0) goto L_0x0069;
    L_0x0064:
        r4 = e;	 Catch:{ NullPointerException -> 0x00e0 }
        r4.remove(r15);	 Catch:{ NullPointerException -> 0x00e0 }
    L_0x0069:
        r4 = com.whatsapp.App.as;
        r4 = r4.b(r15);
        r5 = r4.q;	 Catch:{ NullPointerException -> 0x00e2 }
        r0 = r19;
        r5 = android.text.TextUtils.equals(r5, r0);	 Catch:{ NullPointerException -> 0x00e2 }
        if (r5 == 0) goto L_0x008f;
    L_0x0079:
        r5 = r4.j;	 Catch:{ NullPointerException -> 0x00e4 }
        r6 = java.lang.Long.toString(r17);	 Catch:{ NullPointerException -> 0x00e4 }
        r5 = android.text.TextUtils.equals(r5, r6);	 Catch:{ NullPointerException -> 0x00e4 }
        if (r5 == 0) goto L_0x008f;
    L_0x0085:
        r5 = r4.g;	 Catch:{ NullPointerException -> 0x00e6 }
        r0 = r16;
        r5 = android.text.TextUtils.equals(r5, r0);	 Catch:{ NullPointerException -> 0x00e6 }
        if (r5 != 0) goto L_0x00a2;
    L_0x008f:
        r0 = r19;
        r4.q = r0;	 Catch:{ NullPointerException -> 0x00e6 }
        r5 = java.lang.Long.toString(r17);	 Catch:{ NullPointerException -> 0x00e6 }
        r4.j = r5;	 Catch:{ NullPointerException -> 0x00e6 }
        r0 = r16;
        r4.g = r0;	 Catch:{ NullPointerException -> 0x00e6 }
        r5 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x00e6 }
        r5.h(r4);	 Catch:{ NullPointerException -> 0x00e6 }
    L_0x00a2:
        r4 = a;	 Catch:{ NullPointerException -> 0x00e8 }
        r4 = r4.containsKey(r15);	 Catch:{ NullPointerException -> 0x00e8 }
        if (r4 != 0) goto L_0x00af;
    L_0x00aa:
        r4 = 0;
        r5 = 2;
        com.whatsapp.App.a(r15, r4, r5);	 Catch:{ NullPointerException -> 0x00e8 }
    L_0x00af:
        r4 = 0;
        r4 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00bc;
    L_0x00b5:
        r4 = com.whatsapp.j2.a;	 Catch:{ NullPointerException -> 0x00ea }
        r4.b(r15);	 Catch:{ NullPointerException -> 0x00ea }
        if (r11 == 0) goto L_0x00d2;
    L_0x00bc:
        r4 = -1;
        r4 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00cb;
    L_0x00c2:
        r4 = com.whatsapp.j2.a;	 Catch:{ NullPointerException -> 0x00ee }
        r6 = 0;
        r4.a(r15, r6);	 Catch:{ NullPointerException -> 0x00ee }
        if (r11 == 0) goto L_0x00d2;
    L_0x00cb:
        r4 = com.whatsapp.j2.a;	 Catch:{ NullPointerException -> 0x00ee }
        r0 = r22;
        r4.a(r15, r0);	 Catch:{ NullPointerException -> 0x00ee }
    L_0x00d2:
        return;
    L_0x00d3:
        r4 = move-exception;
        throw r4;
    L_0x00d5:
        r4 = 0;
        r10 = r4;
        goto L_0x000c;
    L_0x00d9:
        r4 = move-exception;
        throw r4;
    L_0x00db:
        r4 = move-exception;
        throw r4;
    L_0x00dd:
        r4 = 0;
        goto L_0x005c;
    L_0x00e0:
        r4 = move-exception;
        throw r4;
    L_0x00e2:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x00e4 }
    L_0x00e4:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x00e6 }
    L_0x00e6:
        r4 = move-exception;
        throw r4;
    L_0x00e8:
        r4 = move-exception;
        throw r4;
    L_0x00ea:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x00ec }
    L_0x00ec:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x00ee }
    L_0x00ee:
        r4 = move-exception;
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(java.lang.String, java.lang.String, long, java.lang.String, long, long, java.util.Hashtable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.co a(com.whatsapp.protocol.ct r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
        r1 = 0;
        if (r4 == 0) goto L_0x000c;
    L_0x0003:
        r0 = new com.whatsapp.ax9;
        r0.<init>(r4);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0015;
    L_0x000c:
        r2 = new com.whatsapp.protocol.co;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r5, r0, r1);
        r0 = r2;
    L_0x0015:
        r0.b(r6);
        r1 = 6;
        r0.d = r1;
        r2 = 11;
        r0.z = r2;
        r0.t = r7;
        r0.b = r8;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(com.whatsapp.protocol.ct, java.lang.String, java.lang.String, java.lang.String, long):com.whatsapp.protocol.co");
    }

    public static void b() {
        Log.i(z[6]);
        d = false;
        a(true);
    }

    public void d(@NonNull String str, @NonNull Hashtable hashtable, @NonNull Hashtable hashtable2) {
        try {
            Log.i(z[63] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2.size() > 0) {
                a(37, (Object) hashtable2);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void b(@NonNull Vector vector) {
        boolean z = DialogToastActivity.f;
        Log.i(z[31] + Arrays.deepToString(vector.toArray()));
        String str = App.as.e().p;
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            e.remove(str2);
            try {
                c(str2).b(str);
                j2.a.b(str2);
                if (App.aK.t(str2)) {
                    a(1, a(5, null, str2, str));
                    continue;
                }
                if (z) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r10, java.util.Vector r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
        r9 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 29;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r10);
        r2 = z;
        r3 = 27;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r11.toArray();
        r2 = java.util.Arrays.deepToString(r2);
        r0 = r0.append(r2);
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = r10.e;
        r0 = e;
        r0.remove(r2);
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r3 = r0.p;
        r0 = com.whatsapp.awc.e;
        r4 = new com.whatsapp.r2;
        r4.<init>(r9, r3, r2);
        r0.submit(r4);
        r0 = com.whatsapp.App.as;
        r6 = r0.c(r2);
        if (r12 == 0) goto L_0x0067;
    L_0x0061:
        r0 = r12.equals(r3);	 Catch:{ NullPointerException -> 0x013a }
        if (r0 == 0) goto L_0x0087;
    L_0x0067:
        r0 = r11.size();	 Catch:{ NullPointerException -> 0x013c }
        r4 = 1;
        if (r0 != r4) goto L_0x0087;
    L_0x006e:
        r0 = 0;
        r0 = r11.get(r0);	 Catch:{ NullPointerException -> 0x013e }
        r0 = r0.equals(r3);	 Catch:{ NullPointerException -> 0x013e }
        if (r0 == 0) goto L_0x0087;
    L_0x0079:
        r0 = z;	 Catch:{ NullPointerException -> 0x0140 }
        r4 = 24;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x0140 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0140 }
        com.whatsapp.App.b(r10);	 Catch:{ NullPointerException -> 0x0140 }
        if (r1 == 0) goto L_0x0115;
    L_0x0087:
        if (r6 == 0) goto L_0x0093;
    L_0x0089:
        r0 = c(r2);	 Catch:{ NullPointerException -> 0x0144 }
        r0 = r0.f();	 Catch:{ NullPointerException -> 0x0144 }
        if (r0 != 0) goto L_0x00ac;
    L_0x0093:
        r0 = z;	 Catch:{ NullPointerException -> 0x0146 }
        r4 = 26;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0146 }
        r0 = 0;
        com.whatsapp.App.c(r2, r0);	 Catch:{ NullPointerException -> 0x0146 }
        if (r6 != 0) goto L_0x0148;
    L_0x00a2:
        r0 = 0;
    L_0x00a3:
        r4 = 2;
        com.whatsapp.App.a(r2, r0, r4);
        com.whatsapp.App.b(r10);
        if (r1 == 0) goto L_0x0115;
    L_0x00ac:
        r5 = c(r2);
        r5.k();
        r4 = new java.util.Vector;
        r0 = r11.size();
        r4.<init>(r0);
        r7 = r11.iterator();
    L_0x00c0:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00e4;
    L_0x00c6:
        r0 = r7.next();
        r0 = (java.lang.String) r0;
        r8 = r5.b(r0);	 Catch:{ NullPointerException -> 0x014c }
        if (r8 == 0) goto L_0x00d5;
    L_0x00d2:
        r4.add(r0);	 Catch:{ NullPointerException -> 0x014c }
    L_0x00d5:
        r0 = r3.equals(r0);	 Catch:{ NullPointerException -> 0x014e }
        if (r0 == 0) goto L_0x00e2;
    L_0x00db:
        r0 = com.whatsapp.j2.a;	 Catch:{ NullPointerException -> 0x014e }
        r8 = r6.p;	 Catch:{ NullPointerException -> 0x014e }
        r0.b(r8);	 Catch:{ NullPointerException -> 0x014e }
    L_0x00e2:
        if (r1 == 0) goto L_0x00c0;
    L_0x00e4:
        r0 = 0;
        if (r12 == 0) goto L_0x00fa;
    L_0x00e7:
        r1 = r4.contains(r12);	 Catch:{ NullPointerException -> 0x0150 }
        if (r1 == 0) goto L_0x00fa;
    L_0x00ed:
        r4.remove(r12);
        r0 = 1;
        r1 = 5;
        r1 = a(r1, r10, r2, r12);
        a(r0, r1);
        r0 = 1;
    L_0x00fa:
        r1 = r4.isEmpty();	 Catch:{ NullPointerException -> 0x0152 }
        if (r1 != 0) goto L_0x0110;
    L_0x0100:
        if (r12 != 0) goto L_0x0156;
    L_0x0102:
        r0 = 13;
    L_0x0104:
        r7 = 1;
        r5 = 0;
        r1 = r10;
        r3 = r12;
        r0 = a(r0, r1, r2, r3, r4, r5);
        a(r7, r0);
        r0 = 1;
    L_0x0110:
        if (r0 != 0) goto L_0x0115;
    L_0x0112:
        com.whatsapp.App.b(r10);	 Catch:{ NullPointerException -> 0x0159 }
    L_0x0115:
        if (r6 == 0) goto L_0x0139;
    L_0x0117:
        r0 = android.text.TextUtils.isEmpty(r13);	 Catch:{ NullPointerException -> 0x015b }
        if (r0 != 0) goto L_0x0139;
    L_0x011d:
        r0 = r6.q;	 Catch:{ NullPointerException -> 0x015d }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NullPointerException -> 0x015d }
        if (r0 == 0) goto L_0x0139;
    L_0x0125:
        r0 = z;	 Catch:{ NullPointerException -> 0x015d }
        r1 = 25;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x015d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x015d }
        r0 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x015d }
        r1 = 0;
        r0.a(r2, r1, r13);	 Catch:{ NullPointerException -> 0x015d }
        r0 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x015d }
        r0.c(r2, r13);	 Catch:{ NullPointerException -> 0x015d }
    L_0x0139:
        return;
    L_0x013a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0140 }
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = r6.o;
        goto L_0x00a3;
    L_0x014c:
        r0 = move-exception;
        throw r0;
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0154 }
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = 14;
        goto L_0x0104;
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(com.whatsapp.protocol.ct, java.util.Vector, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void m456a() {
        Log.i(z[1]);
        App.c(App.z(), false);
    }

    @NonNull
    public static aoy c(@NonNull String str) {
        aoy com_whatsapp_aoy;
        synchronized (a) {
            com_whatsapp_aoy = (aoy) a.get(str);
        }
        if (com_whatsapp_aoy == null) {
            com_whatsapp_aoy = new aoy(str);
            com_whatsapp_aoy.i();
            synchronized (a) {
                if (a.get(str) == null) {
                    a.put(str, com_whatsapp_aoy);
                }
            }
        }
        return com_whatsapp_aoy;
    }

    public static boolean i(String str) {
        return str.contains("-");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.util.Vector r7) {
        /*
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = 0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r7.iterator();
        r1 = r0;
    L_0x000d:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0037;
    L_0x0013:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.App.as;
        r5 = r5.d(r0);
        if (r5 == 0) goto L_0x0024;
    L_0x0021:
        r1 = 1;
        if (r2 == 0) goto L_0x0098;
    L_0x0024:
        r5 = com.whatsapp.App.as;
        r0 = r5.b(r0);
        r5 = r3.contains(r0);	 Catch:{ NullPointerException -> 0x008d }
        if (r5 != 0) goto L_0x0098;
    L_0x0030:
        r3.add(r0);	 Catch:{ NullPointerException -> 0x008d }
        r0 = r1;
    L_0x0034:
        if (r2 == 0) goto L_0x0095;
    L_0x0036:
        r1 = r0;
    L_0x0037:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r3 = r3.iterator();
    L_0x0045:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x006f;
    L_0x004b:
        r0 = r3.next();
        r0 = (com.whatsapp.l5) r0;
        r6 = com.whatsapp.App.z();
        r6 = r0.a(r6);
        if (r6 == 0) goto L_0x006d;
    L_0x005b:
        r0 = r0.s();	 Catch:{ NullPointerException -> 0x008f }
        r0 = r6.equals(r0);	 Catch:{ NullPointerException -> 0x008f }
        if (r0 == 0) goto L_0x006a;
    L_0x0065:
        r5.add(r6);	 Catch:{ NullPointerException -> 0x0091 }
        if (r2 == 0) goto L_0x006d;
    L_0x006a:
        r4.add(r6);	 Catch:{ NullPointerException -> 0x0091 }
    L_0x006d:
        if (r2 == 0) goto L_0x0045;
    L_0x006f:
        java.util.Collections.sort(r4);	 Catch:{ NullPointerException -> 0x0093 }
        java.util.Collections.sort(r5);	 Catch:{ NullPointerException -> 0x0093 }
        r4.addAll(r5);	 Catch:{ NullPointerException -> 0x0093 }
        if (r1 == 0) goto L_0x0088;
    L_0x007a:
        r0 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x0093 }
        r1 = 2131232301; // 0x7f08062d float:1.8080707E38 double:1.052968663E-314;
        r0 = r0.getString(r1);	 Catch:{ NullPointerException -> 0x0093 }
        r4.add(r0);	 Catch:{ NullPointerException -> 0x0093 }
    L_0x0088:
        r0 = a(r4);
        return r0;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r1 = r0;
        goto L_0x000d;
    L_0x0098:
        r0 = r1;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(java.util.Vector):java.lang.String");
    }

    public static String c(co coVar) {
        try {
            if (!i(coVar.k.c)) {
                return coVar.k.c;
            }
            if (coVar.k.a) {
                try {
                    if (coVar.d == 6) {
                        try {
                            if (coVar.z == 10) {
                                return (String) coVar.Q;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            return coVar.t;
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public static void d(String str, String str2) {
        c(str).a(str2, false, false);
        e.remove(str);
        a(1, a(4, null, str, str2));
    }

    public void m458a(@NonNull Vector vector) {
        boolean z = DialogToastActivity.f;
        Log.i(z[0] + Arrays.deepToString(vector.toArray()));
        Iterator it = qa.g().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (i(str) && !vector.contains(str)) {
                    c(str).b(App.as.e().p);
                    App.aK.d(str, App.as.e().p);
                    if (App.as.c(str) == null) {
                        App.as.g(new l5(str));
                    }
                    auy I = App.aK.I(str);
                    try {
                        if (I.b == null) {
                            continue;
                        } else if (I.a != null) {
                            App.as.a(str, null, I.b, I.a.longValue());
                            continue;
                        } else {
                            continue;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                }
                if (z) {
                    break;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        }
        try {
            d = false;
            a(false);
            if (b) {
                b = false;
                App.L();
            }
            App.aB.sendEmptyMessage(0);
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public static boolean c(String str, String str2) {
        adl a = a(str, str2);
        if (a != null) {
            try {
                if (a.d) {
                    return true;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return false;
    }

    public static void a(boolean z) {
        Log.i(z[5] + z);
        Editor edit = App.z().getSharedPreferences(z[2], 0).edit();
        try {
            edit.putBoolean(z[3], z);
            if (!edit.commit()) {
                Log.e(z[4]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static adl a(String str, String str2) {
        return c(str).a(str2);
    }

    public void a(String str, String str2, long j, String str3, long j2, String str4, String str5, long j3, Hashtable hashtable) {
        Log.i(z[16] + str + z[14] + str2 + z[11] + j + z[12] + str4 + z[10] + str3 + z[18] + j2 + z[15] + str5 + z[17] + j3);
        Log.i(z[13] + Arrays.deepToString(Collections.list(hashtable.keys()).toArray()) + "/" + Arrays.deepToString(hashtable.values().toArray()));
        a(str, str2, j, str3, j2, j3, hashtable);
        App.O.a(str);
    }

    public static void b(String str, String str2) {
        c(str).b(str2);
        e.remove(str);
        a(1, a(7, null, str, str2));
    }

    public static void a(String str, Vector vector) {
        boolean z = DialogToastActivity.f;
        aoy c = c(str);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            c.a((String) it.next(), false, true);
            if (z) {
                return;
            }
        }
    }

    static {
        String[] strArr = new String[71];
        String str = ".\u0006_)!$\u0013Bs>'\u0004Q.% \u0017Y,0=\u001d^;6;\u001bE,\"f";
        boolean z = true;
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = 116;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "*\u001b]r&!\u0015D/09\u0004o,#,\u0012U.4'\u0017U/";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "'\u0011U8\u000e=\u001bo;4=+W.><\u0004C";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ".\u0006_)!$\u0013Bs\",\u0000C4><\u0018T;4=\u0013B3$9\u0007\u001f:0 \u0018U8";
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ".\u0006_)!$\u0013Bs\",\u0000C4><\u0018T;4=\u0013B3$9\u0007\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".\u0006_)!$\u0013Bs6;\u001bE,\u00020\u001aS\u001a0 \u0018U8\u001e; Y14&\u0001D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\t\u0000U1!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ".\u0006_)!$\u0013Bs>''U(\u0002<\u0016Z92=[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ".\u0006_)!$\u0013Bs8$\u0004_.%(\u001aD1\".[^)=%T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "f\u0007E>;,\u0017Df";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "f\u0017B90=\u001d_2k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "f\u0007E>;,\u0017D|>>\u001aU.k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9=^:>f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "f\u0017B90=\u001bBf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "f\u0000I,4s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9=^:>f\u0013Z55s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "f\u0018_?0=\u001d_2k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "f\u0007E>;,\u0017D\u0003% \u0019Uf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ".\u0006_)!$\u0013Bs6,\u0000`=#=\u001dS5!(\u001aD/\u0002=\u0015D)\"\u0004\u0011C/0.\u0011\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "f\u001aU+; \u0010\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9!C9#\n\u001cQ26,\u0010~)<+\u0011Bs\",\u001aT;4=\u0013B3$9\u001d^:>f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "f\u001b\\8; \u0010\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9!C9#\n\u001cQ26,\u0010~)<+\u0011Bs";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9&U1>?\u0011e/4;\u0007\u001f14i\u0018U=' \u001aW";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9&U1>?\u0011e/4;\u0007\u001f/$+\u001eU?%*\u001cQ26,\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9&U1>?\u0011e/4;\u0007\u001f.48\u0001U.(.\u0006_)! \u001aV3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "#\u001dT/k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "f\u0006U1>?\u0011T\u000330N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9&U1>?\u0011e/4;\u0007\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ".\u0006_)!$\u0013Bs>'0U1>=\u0011w.><\u0004`=#=\u001dS5!(\u001aD/~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ".\u0006_)!$\u0013Bs>'8U=',3B3$9[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0016;\u001bE,~*\u001cQ26,\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0016;\u001bE,~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0016;\u001bE,~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0016;\u001bE,q&\u0018T,0;\u0000Y?89\u0015^(\"s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0016;\u001bE,~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "i\u0019U?#,\u0015D3#s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "i\u001aE13,\u0006S40'\u0013Uf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0016;\u001bE,~i\u001aU+k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "f\u0000I,4s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "f\u0017B90=\u001bBf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "f\u0007E>;,\u0017D\u0003% \u0019Uf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "f\u0007E>;,\u0017Df";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9=^:>\u000f\u0006_1\u001d \u0007Ds";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "f\u0007E>;,\u0017D|>>\u001aU.k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "f\u0017B90=\u001d_2k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9=^:>\u000f\u0006_1\u001d \u0007Ds6#\u001dTf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    str = "f\u0018_?0=\u001d_2k";
                    z = true;
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    strArr2 = strArr3;
                    str = ".\u0006_)!$\u0013Bs>'3B3$90U04=\u0011\u001f";
                    z = true;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0002<\u0016Z92=[T55i\u001a_(q*\u001cQ26,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0002<\u0016Z92=[S40'\u0013U8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0002<\u0016Z92=[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9:U+\u0002<\u0016Z92=[^9&i\u0013B3$9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\t\u0007\u001e+9(\u0000C=!9Z^9%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\t\u0000U1!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = ".\u0006_)!$\u0013Bs>'$B3<&\u0000U\u001b#&\u0001@\f0;\u0000Y?89\u0015^(\"f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = ".\u0006_)!$\u0013Bs>'3B3$9$B3<&\u0000U\t\",\u0006Cs";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = ".\u0006_)!$\u0013Bs>'5T8\u0016;\u001bE,\u0001(\u0006D52 \u0004Q2%:[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = ".\u0006_)!$\u0013Bs>'3B3$95T8\u0004:\u0011B/~;\u0011A)4;\rW.><\u0004Y27&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = ".\u0006_)!$\u0013Bs>'3B3$95T8\u0004:\u0011B/~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "(\u0010]5?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = ".\u0006_)!$\u0013Bs6,\u0000`=#=\u001dS5!(\u001aD\u000f%(\u0000E/\u001c,\u0007C=6,[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = ".\u0006_)!$\u0013Bs>'&U1>?\u0011w.><\u0004`=#=\u001dS5!(\u001aD/~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "'\u0011U8\u000e=\u001bo;4=+W.><\u0004C";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "*\u001b]r&!\u0015D/09\u0004o,#,\u0012U.4'\u0017U/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = ".\u0006_)!$\u0013Bs>'3B3$90U1>=\u0011e/4;\u0007\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "f\u0006U?89\u001dU2%:N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = ".\u0006_)!$\u0013Bs>'$Q.% \u0017Y,0=\u001d^;\u001d \u0007Ds; \u0010\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "f\u001aQ14s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = ".\u0006_)!$\u0013Bs>'3B3$97B90=\u0011Ts";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = false;
                    d = false;
                    a = new ConcurrentHashMap();
                    e = new ConcurrentHashMap();
                    c = new am7();
                    return;
                default:
                    strArr2[i] = str;
                    str = ".\u0006_)!$\u0013Bs>'$Q.% \u0017Y,0=\u001d^;\u001d \u0007Ds>'$Q.% \u0017Y,0=\u001d^;\u001d \u0007D/\u0012&\u0019@04=\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public void b(ct ctVar, Vector vector, String str) {
        boolean z;
        boolean z2 = DialogToastActivity.f;
        Log.i(z[57] + ctVar + "/" + Arrays.deepToString(vector.toArray()));
        Object obj = ctVar.e;
        aoy c = c((String) obj);
        Iterator it = vector.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            adl a;
            String str2 = (String) it.next();
            adl a2 = c.a(str2);
            if (a2 == null) {
                a = c.a(str2, true, false);
                if (!z2) {
                    a2 = a;
                    if (a2.a()) {
                        z = z3;
                    } else {
                        z = true;
                    }
                    App.aK.a((String) obj, a2);
                    if (z2) {
                        break;
                    }
                    z3 = z;
                }
            } else {
                a = a2;
            }
            try {
                a.d = true;
                a2 = a;
                if (a2.a()) {
                    z = z3;
                } else {
                    z = true;
                }
                App.aK.a((String) obj, a2);
                if (z2) {
                    break;
                }
                z3 = z;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        z = z3;
        if (z) {
            try {
                a(1, a(15, ctVar, obj, ctVar.d, vector, null));
                if (!z2) {
                    return;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        App.b(ctVar);
        a(4, obj);
    }

    private static co a(String str, String str2, String str3) {
        co coVar = new co(str, (byte[]) null, null);
        coVar.d = 6;
        coVar.z = 10;
        coVar.t = str2;
        coVar.Q = str3;
        coVar.b = App.av();
        return coVar;
    }

    public static co a(String str) {
        co coVar = new co(str, (byte[]) null, null);
        coVar.b = App.av();
        coVar.d = 6;
        coVar.z = 19;
        return coVar;
    }

    public void a(Vector vector, Hashtable hashtable) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.co a(int r4, com.whatsapp.protocol.ct r5, java.lang.String r6, java.lang.String r7) {
        /*
        r1 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x003c;
    L_0x0033:
        r0 = new com.whatsapp.ax9;
        r0.<init>(r5);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0045;
    L_0x003c:
        r2 = new com.whatsapp.protocol.co;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r6, r0, r1);
        r0 = r2;
    L_0x0045:
        r1 = 6;
        r0.d = r1;	 Catch:{ NullPointerException -> 0x006a }
        r2 = (long) r4;	 Catch:{ NullPointerException -> 0x006a }
        r0.z = r2;	 Catch:{ NullPointerException -> 0x006a }
        r0.t = r7;	 Catch:{ NullPointerException -> 0x006a }
        r2 = com.whatsapp.App.av();	 Catch:{ NullPointerException -> 0x006a }
        r0.b = r2;	 Catch:{ NullPointerException -> 0x006a }
        r1 = 4;
        if (r4 != r1) goto L_0x0069;
    L_0x0056:
        if (r7 == 0) goto L_0x0069;
    L_0x0058:
        r1 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x006e }
        r1 = r1.e();	 Catch:{ NullPointerException -> 0x006e }
        r1 = r1.p;	 Catch:{ NullPointerException -> 0x006e }
        r1 = r7.equals(r1);	 Catch:{ NullPointerException -> 0x006e }
        if (r1 == 0) goto L_0x0069;
    L_0x0066:
        r1 = 1;
        r0.H = r1;	 Catch:{ NullPointerException -> 0x006e }
    L_0x0069:
        return r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(int, com.whatsapp.protocol.ct, java.lang.String, java.lang.String):com.whatsapp.protocol.co");
    }

    public static boolean g(String str) {
        return str.endsWith(z[7]);
    }

    public void a(String str, String str2, String[] strArr) {
        Log.i(z[68] + str + z[69] + str2 + z[67] + Arrays.deepToString(strArr));
        if (!qa.c(str)) {
            Vector vector = new Vector(strArr.length);
            vector.addAll(Arrays.asList(strArr));
            co coVar = new co(str, str2, null);
            coVar.b = App.av();
            coVar.d = 6;
            coVar.z = 9;
            coVar.Q = vector;
            coVar.t = App.as.e().p;
            App.aK.a(coVar);
            a(str, vector);
        }
        try {
            if (App.as.f(str) == null) {
                qa.a(str, str2, System.currentTimeMillis());
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean d(String str) {
        return c(str).m();
    }

    public static co e(String str, String str2) {
        co coVar = new co(str, (byte[]) null, null);
        coVar.b = App.av();
        coVar.d = 6;
        coVar.z = 18;
        coVar.t = str2;
        return coVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.co a(int r4, @android.support.annotation.Nullable com.whatsapp.protocol.ct r5, java.lang.String r6, @android.support.annotation.Nullable java.lang.String r7, @android.support.annotation.NonNull java.util.Vector r8, @android.support.annotation.Nullable com.whatsapp.aoy r9) {
        /*
        r1 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r6);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r7);
        r2 = "/";
        r0 = r0.append(r2);
        r2 = r8.toArray();
        r2 = java.util.Arrays.deepToString(r2);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x005a;
    L_0x0051:
        r0 = new com.whatsapp.ax9;
        r0.<init>(r5, r9);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0063;
    L_0x005a:
        r2 = new com.whatsapp.protocol.co;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r6, r0, r1);
        r0 = r2;
    L_0x0063:
        r2 = 6;
        r0.d = r2;	 Catch:{ NullPointerException -> 0x008f }
        r2 = (long) r4;	 Catch:{ NullPointerException -> 0x008f }
        r0.z = r2;	 Catch:{ NullPointerException -> 0x008f }
        r2 = android.text.TextUtils.isEmpty(r7);	 Catch:{ NullPointerException -> 0x008f }
        if (r2 == 0) goto L_0x0091;
    L_0x006f:
        r0.t = r1;	 Catch:{ NullPointerException -> 0x0093 }
        r0.Q = r8;	 Catch:{ NullPointerException -> 0x0093 }
        r2 = com.whatsapp.App.av();	 Catch:{ NullPointerException -> 0x0093 }
        r0.b = r2;	 Catch:{ NullPointerException -> 0x0093 }
        r1 = 12;
        if (r4 != r1) goto L_0x008e;
    L_0x007d:
        r1 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0095 }
        r1 = r1.e();	 Catch:{ NullPointerException -> 0x0095 }
        r1 = r1.p;	 Catch:{ NullPointerException -> 0x0095 }
        r1 = r8.contains(r1);	 Catch:{ NullPointerException -> 0x0095 }
        if (r1 == 0) goto L_0x008e;
    L_0x008b:
        r1 = 1;
        r0.H = r1;	 Catch:{ NullPointerException -> 0x0095 }
    L_0x008e:
        return r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r1 = r7;
        goto L_0x006f;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(int, com.whatsapp.protocol.ct, java.lang.String, java.lang.String, java.util.Vector, com.whatsapp.aoy):com.whatsapp.protocol.co");
    }

    public static String j(String str) {
        return App.ad() + "-" + str + z[55];
    }

    public void a(ct ctVar, String str) {
        boolean z = DialogToastActivity.f;
        Log.i(z[49] + ctVar);
        if (a.containsKey(ctVar.e)) {
            aoy c = c(ctVar.e);
            c.b(App.as.e().p);
            for (adl com_whatsapp_adl : c.c()) {
                com_whatsapp_adl.d = false;
                if (z) {
                    break;
                }
            }
            try {
                a(1, a(17, ctVar, ctVar.e, ctVar.d));
                if (!z) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        App.b(ctVar);
    }

    public void m457a(String str) {
        Log.i(z[8] + str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r7) {
        /*
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = e;
        r0 = r0.get(r7);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = 0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1 = c(r7);
        r1 = r1.c();
        r4 = r1.iterator();
        r1 = r0;
    L_0x0020:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004e;
    L_0x0026:
        r0 = r4.next();
        r0 = (com.whatsapp.adl) r0;
        r5 = com.whatsapp.App.as;
        r6 = r0.e;
        r5 = r5.d(r6);
        if (r5 == 0) goto L_0x0039;
    L_0x0036:
        r1 = 1;
        if (r2 == 0) goto L_0x00b1;
    L_0x0039:
        r5 = com.whatsapp.App.as;
        r0 = r0.e;
        r0 = r5.b(r0);
        r5 = r3.contains(r0);	 Catch:{ NullPointerException -> 0x00a6 }
        if (r5 != 0) goto L_0x00b1;
    L_0x0047:
        r3.add(r0);	 Catch:{ NullPointerException -> 0x00a6 }
        r0 = r1;
    L_0x004b:
        if (r2 == 0) goto L_0x00ae;
    L_0x004d:
        r1 = r0;
    L_0x004e:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r3 = r3.iterator();
    L_0x005c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0082;
    L_0x0062:
        r0 = r3.next();
        r0 = (com.whatsapp.l5) r0;
        r6 = r0.i();
        if (r6 == 0) goto L_0x0080;
    L_0x006e:
        r0 = r0.s();	 Catch:{ NullPointerException -> 0x00a8 }
        r0 = r6.equals(r0);	 Catch:{ NullPointerException -> 0x00a8 }
        if (r0 == 0) goto L_0x007d;
    L_0x0078:
        r5.add(r6);	 Catch:{ NullPointerException -> 0x00aa }
        if (r2 == 0) goto L_0x0080;
    L_0x007d:
        r4.add(r6);	 Catch:{ NullPointerException -> 0x00aa }
    L_0x0080:
        if (r2 == 0) goto L_0x005c;
    L_0x0082:
        java.util.Collections.sort(r4);	 Catch:{ NullPointerException -> 0x00ac }
        java.util.Collections.sort(r5);	 Catch:{ NullPointerException -> 0x00ac }
        r4.addAll(r5);	 Catch:{ NullPointerException -> 0x00ac }
        if (r1 == 0) goto L_0x009b;
    L_0x008d:
        r0 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x00ac }
        r1 = 2131232301; // 0x7f08062d float:1.8080707E38 double:1.052968663E-314;
        r0 = r0.getString(r1);	 Catch:{ NullPointerException -> 0x00ac }
        r4.add(r0);	 Catch:{ NullPointerException -> 0x00ac }
    L_0x009b:
        r0 = a(r4);
        r1 = e;
        r1.put(r7, r0);
        goto L_0x000c;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r1 = r0;
        goto L_0x0020;
    L_0x00b1:
        r0 = r1;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.b(java.lang.String):java.lang.String");
    }

    public void b(@NonNull String str, @NonNull Hashtable hashtable, @NonNull Hashtable hashtable2) {
        try {
            Log.i(z[30] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2.size() > 0) {
                a(39, (Object) hashtable2);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(String str, String str2, long j, String str3, long j2, String str4, String str5, Hashtable hashtable, Hashtable hashtable2) {
        try {
            Log.i(z[70] + str + "/" + str2 + "/" + j + "/" + str3 + "/" + str4 + "/" + j2 + "/" + str5 + "/" + Arrays.deepToString(hashtable.keySet().toArray()));
            if (hashtable2 == null) {
                return;
            }
            if (hashtable2.size() > 0) {
                a(36, (Object) hashtable2);
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.c2 b(com.whatsapp.protocol.co r9) {
        /*
        r1 = 6;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.d;	 Catch:{ NullPointerException -> 0x0009 }
        if (r0 == r1) goto L_0x000b;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r1 = new com.whatsapp.protocol.c2;
        r1.<init>();
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r0.b;	 Catch:{ NullPointerException -> 0x01b9 }
        r1.i = r0;	 Catch:{ NullPointerException -> 0x01b9 }
        r4 = r9.b;	 Catch:{ NullPointerException -> 0x01b9 }
        r1.m = r4;	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01b9 }
        r1.s = r0;	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r0.a;	 Catch:{ NullPointerException -> 0x01b9 }
        r1.o = r0;	 Catch:{ NullPointerException -> 0x01b9 }
        r4 = r9.z;	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = (int) r4;
        switch(r0) {
            case 1: goto L_0x0046;
            case 2: goto L_0x002c;
            case 3: goto L_0x002c;
            case 4: goto L_0x0056;
            case 5: goto L_0x00be;
            case 6: goto L_0x00fe;
            case 7: goto L_0x008a;
            case 8: goto L_0x002c;
            case 9: goto L_0x0126;
            case 10: goto L_0x010e;
            case 11: goto L_0x002e;
            case 12: goto L_0x007b;
            case 13: goto L_0x00d1;
            case 14: goto L_0x00af;
            case 15: goto L_0x00e0;
            case 16: goto L_0x00ef;
            case 17: goto L_0x003d;
            case 18: goto L_0x013a;
            case 19: goto L_0x016c;
            default: goto L_0x002c;
        };
    L_0x002c:
        r0 = 0;
        goto L_0x0008;
    L_0x002e:
        r0 = 1;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01bb }
        r0 = r9.c();	 Catch:{ NullPointerException -> 0x01bb }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01bb }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01bb }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01bb }
        if (r2 == 0) goto L_0x01b6;
    L_0x003d:
        r0 = 2;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01bd }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01bd }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01bd }
        if (r2 == 0) goto L_0x01b6;
    L_0x0046:
        r0 = 10;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01bf }
        r0 = r9.c();	 Catch:{ NullPointerException -> 0x01bf }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01bf }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01bf }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01bf }
        if (r2 == 0) goto L_0x01b6;
    L_0x0056:
        r0 = r1.s;	 Catch:{ NullPointerException -> 0x01c1 }
        r0 = com.whatsapp.l5.g(r0);	 Catch:{ NullPointerException -> 0x01c1 }
        if (r0 == 0) goto L_0x0068;
    L_0x005e:
        r0 = 12;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01c3 }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01c3 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01c3 }
        if (r2 == 0) goto L_0x01b6;
    L_0x0068:
        r0 = 3;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01c5 }
        r0 = new java.util.Vector;	 Catch:{ NullPointerException -> 0x01c5 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x01c5 }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01c5 }
        r0 = r1.q;	 Catch:{ NullPointerException -> 0x01c5 }
        r3 = r9.t;	 Catch:{ NullPointerException -> 0x01c5 }
        r0.add(r3);	 Catch:{ NullPointerException -> 0x01c5 }
        if (r2 == 0) goto L_0x01b6;
    L_0x007b:
        r0 = 3;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01c7 }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01c7 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01c7 }
        r0 = r9.Q;	 Catch:{ NullPointerException -> 0x01c7 }
        r0 = (java.util.Vector) r0;	 Catch:{ NullPointerException -> 0x01c7 }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01c7 }
        if (r2 == 0) goto L_0x01b6;
    L_0x008a:
        r0 = r1.s;	 Catch:{ NullPointerException -> 0x01c9 }
        r0 = com.whatsapp.l5.g(r0);	 Catch:{ NullPointerException -> 0x01c9 }
        if (r0 == 0) goto L_0x009c;
    L_0x0092:
        r0 = 13;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01cb }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01cb }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01cb }
        if (r2 == 0) goto L_0x01b6;
    L_0x009c:
        r0 = 4;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01cd }
        r0 = new java.util.Vector;	 Catch:{ NullPointerException -> 0x01cd }
        r0.<init>();	 Catch:{ NullPointerException -> 0x01cd }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01cd }
        r0 = r1.q;	 Catch:{ NullPointerException -> 0x01cd }
        r3 = r9.t;	 Catch:{ NullPointerException -> 0x01cd }
        r0.add(r3);	 Catch:{ NullPointerException -> 0x01cd }
        if (r2 == 0) goto L_0x01b6;
    L_0x00af:
        r0 = 4;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01cf }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01cf }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01cf }
        r0 = r9.Q;	 Catch:{ NullPointerException -> 0x01cf }
        r0 = (java.util.Vector) r0;	 Catch:{ NullPointerException -> 0x01cf }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01cf }
        if (r2 == 0) goto L_0x01b6;
    L_0x00be:
        r0 = 7;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01d1 }
        r0 = new java.util.Vector;	 Catch:{ NullPointerException -> 0x01d1 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x01d1 }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01d1 }
        r0 = r1.q;	 Catch:{ NullPointerException -> 0x01d1 }
        r3 = r9.t;	 Catch:{ NullPointerException -> 0x01d1 }
        r0.add(r3);	 Catch:{ NullPointerException -> 0x01d1 }
        if (r2 == 0) goto L_0x01b6;
    L_0x00d1:
        r0 = 7;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01d3 }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01d3 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01d3 }
        r0 = r9.Q;	 Catch:{ NullPointerException -> 0x01d3 }
        r0 = (java.util.Vector) r0;	 Catch:{ NullPointerException -> 0x01d3 }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01d3 }
        if (r2 == 0) goto L_0x01b6;
    L_0x00e0:
        r0 = 5;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01d5 }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01d5 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01d5 }
        r0 = r9.Q;	 Catch:{ NullPointerException -> 0x01d5 }
        r0 = (java.util.Vector) r0;	 Catch:{ NullPointerException -> 0x01d5 }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01d5 }
        if (r2 == 0) goto L_0x01b6;
    L_0x00ef:
        r0 = 6;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01d7 }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01d7 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01d7 }
        r0 = r9.Q;	 Catch:{ NullPointerException -> 0x01d7 }
        r0 = (java.util.Vector) r0;	 Catch:{ NullPointerException -> 0x01d7 }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01d7 }
        if (r2 == 0) goto L_0x01b6;
    L_0x00fe:
        r0 = 8;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01d9 }
        r0 = r9.c();	 Catch:{ NullPointerException -> 0x01d9 }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01d9 }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01d9 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01d9 }
        if (r2 == 0) goto L_0x01b6;
    L_0x010e:
        r0 = 9;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01db }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01db }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01db }
        r0 = new java.util.Vector;	 Catch:{ NullPointerException -> 0x01db }
        r0.<init>();	 Catch:{ NullPointerException -> 0x01db }
        r1.q = r0;	 Catch:{ NullPointerException -> 0x01db }
        r0 = r1.q;	 Catch:{ NullPointerException -> 0x01db }
        r3 = r9.Q;	 Catch:{ NullPointerException -> 0x01db }
        r0.add(r3);	 Catch:{ NullPointerException -> 0x01db }
        if (r2 == 0) goto L_0x01b6;
    L_0x0126:
        r0 = 11;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01dd }
        r0 = r9.Q;	 Catch:{ NullPointerException -> 0x01dd }
        r0 = (java.util.Vector) r0;	 Catch:{ NullPointerException -> 0x01dd }
        r0 = r0.size();	 Catch:{ NullPointerException -> 0x01dd }
        r1.r = r0;	 Catch:{ NullPointerException -> 0x01dd }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01dd }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01dd }
        if (r2 == 0) goto L_0x01b6;
    L_0x013a:
        r0 = 0;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01df }
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01df }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01df }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01df }
        r3 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x01df }
        r4 = r9.t;	 Catch:{ NullPointerException -> 0x01df }
        r5 = 2131231358; // 0x7f08027e float:1.8078795E38 double:1.0529681973E-314;
        r0 = 1;
        r6 = new java.lang.Object[r0];	 Catch:{ NullPointerException -> 0x01df }
        r7 = 0;
        r8 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x01df }
        r0 = r9.t;	 Catch:{ NullPointerException -> 0x01df }
        if (r0 != 0) goto L_0x01e1;
    L_0x0156:
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01df }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01df }
    L_0x015a:
        r0 = r8.b(r0);	 Catch:{ NullPointerException -> 0x01e5 }
        r0 = r0.k();	 Catch:{ NullPointerException -> 0x01e5 }
        r6[r7] = r0;	 Catch:{ NullPointerException -> 0x01e5 }
        r0 = com.whatsapp.util.a6.a(r3, r4, r5, r6);	 Catch:{ NullPointerException -> 0x01e5 }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01e5 }
        if (r2 == 0) goto L_0x01b6;
    L_0x016c:
        r0 = 0;
        r1.c = r0;	 Catch:{ NullPointerException -> 0x01e7 }
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01e7 }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01e7 }
        r1.n = r0;	 Catch:{ NullPointerException -> 0x01e7 }
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01e7 }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01e7 }
        r0 = com.whatsapp.l5.g(r0);	 Catch:{ NullPointerException -> 0x01e7 }
        if (r0 == 0) goto L_0x018e;
    L_0x017f:
        r0 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x01e9 }
        r3 = 2131230847; // 0x7f08007f float:1.8077758E38 double:1.052967945E-314;
        r0 = r0.getString(r3);	 Catch:{ NullPointerException -> 0x01e9 }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01e9 }
        if (r2 == 0) goto L_0x01b6;
    L_0x018e:
        r0 = r9.k;	 Catch:{ NullPointerException -> 0x01eb }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01eb }
        r0 = i(r0);	 Catch:{ NullPointerException -> 0x01eb }
        if (r0 == 0) goto L_0x01a7;
    L_0x0198:
        r0 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x01ed }
        r3 = 2131231289; // 0x7f080239 float:1.8078655E38 double:1.052968163E-314;
        r0 = r0.getString(r3);	 Catch:{ NullPointerException -> 0x01ed }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01ed }
        if (r2 == 0) goto L_0x01b6;
    L_0x01a7:
        r0 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x01ed }
        r3 = 2131230909; // 0x7f0800bd float:1.8077884E38 double:1.0529679755E-314;
        r0 = r0.getString(r3);	 Catch:{ NullPointerException -> 0x01ed }
        r1.u = r0;	 Catch:{ NullPointerException -> 0x01ed }
        if (r2 != 0) goto L_0x002c;
    L_0x01b6:
        r0 = r1;
        goto L_0x0008;
    L_0x01b9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01bb }
    L_0x01bb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01bd }
    L_0x01bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01bf }
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c3 }
    L_0x01c3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c5 }
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01cf }
    L_0x01cf:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d1 }
    L_0x01d1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d3 }
    L_0x01d3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d5 }
    L_0x01d5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d7 }
    L_0x01d7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d9 }
    L_0x01d9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01db }
    L_0x01db:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01dd }
    L_0x01dd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01df }
    L_0x01df:
        r0 = move-exception;
        throw r0;
    L_0x01e1:
        r0 = r9.t;
        goto L_0x015a;
    L_0x01e5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01e7 }
    L_0x01e7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01eb }
    L_0x01eb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01ed }
    L_0x01ed:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.b(com.whatsapp.protocol.co):com.whatsapp.protocol.c2");
    }

    public static co e(String str) {
        co coVar = new co(str, (byte[]) null, null);
        coVar.b = App.av();
        coVar.d = 6;
        coVar.z = 8;
        return coVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, java.lang.String r25, long r26, java.lang.String r28, java.lang.String r29, java.util.Hashtable r30, java.lang.String r31) {
        /*
        r17 = this;
        r13 = com.whatsapp.DialogToastActivity.f;
        r4 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x024c }
        r4.<init>();	 Catch:{ NullPointerException -> 0x024c }
        r5 = z;	 Catch:{ NullPointerException -> 0x024c }
        r6 = 36;
        r5 = r5[r6];	 Catch:{ NullPointerException -> 0x024c }
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r18;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r22;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r23;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r25;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r28;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r26;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r0 = r29;
        r4 = r4.append(r0);	 Catch:{ NullPointerException -> 0x024c }
        r4 = r4.toString();	 Catch:{ NullPointerException -> 0x024c }
        com.whatsapp.util.Log.i(r4);	 Catch:{ NullPointerException -> 0x024c }
        r4 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x024c }
        r4.<init>();	 Catch:{ NullPointerException -> 0x024c }
        r5 = z;	 Catch:{ NullPointerException -> 0x024c }
        r6 = 34;
        r5 = r5[r6];	 Catch:{ NullPointerException -> 0x024c }
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r5 = r30.keys();	 Catch:{ NullPointerException -> 0x024c }
        r5 = java.util.Collections.list(r5);	 Catch:{ NullPointerException -> 0x024c }
        r5 = r5.toArray();	 Catch:{ NullPointerException -> 0x024c }
        r5 = java.util.Arrays.deepToString(r5);	 Catch:{ NullPointerException -> 0x024c }
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r5 = r30.values();	 Catch:{ NullPointerException -> 0x024c }
        r5 = r5.toArray();	 Catch:{ NullPointerException -> 0x024c }
        r5 = java.util.Arrays.deepToString(r5);	 Catch:{ NullPointerException -> 0x024c }
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x024c }
        r4 = r4.toString();	 Catch:{ NullPointerException -> 0x024c }
        com.whatsapp.util.Log.i(r4);	 Catch:{ NullPointerException -> 0x024c }
        r4 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x024c }
        r0 = r19;
        r4 = r4.t(r0);	 Catch:{ NullPointerException -> 0x024c }
        if (r4 != 0) goto L_0x024e;
    L_0x00b7:
        r4 = 1;
        r10 = r4;
    L_0x00b9:
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0252 }
        r0 = r22;
        r4 = r4.d(r0);	 Catch:{ NullPointerException -> 0x0252 }
        if (r4 == 0) goto L_0x0256;
    L_0x00c3:
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0254 }
        r0 = r18;
        r5 = r0.d;	 Catch:{ NullPointerException -> 0x0254 }
        r4 = r4.d(r5);	 Catch:{ NullPointerException -> 0x0254 }
        if (r4 == 0) goto L_0x0256;
    L_0x00cf:
        r4 = 1;
        r11 = r4;
    L_0x00d1:
        r0 = r18;
        r4 = r0.d;	 Catch:{ NullPointerException -> 0x025a }
        r0 = r30;
        r4 = r0.containsKey(r4);	 Catch:{ NullPointerException -> 0x025a }
        if (r4 != 0) goto L_0x025c;
    L_0x00dd:
        r4 = 1;
        r12 = r4;
    L_0x00df:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 39;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r10);
        r5 = z;
        r6 = 37;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r11);
        r5 = z;
        r6 = 38;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        if (r11 == 0) goto L_0x0149;
    L_0x0117:
        r14 = j(r25);
        r4 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x0260 }
        r4 = r4.t(r14);	 Catch:{ NullPointerException -> 0x0260 }
        if (r4 == 0) goto L_0x0147;
    L_0x0123:
        r4 = a;	 Catch:{ NullPointerException -> 0x0260 }
        r4.remove(r14);	 Catch:{ NullPointerException -> 0x0260 }
        r4 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x0260 }
        r0 = r19;
        r4.e(r14, r0);	 Catch:{ NullPointerException -> 0x0260 }
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0260 }
        r5 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0260 }
        r5 = r5.b(r14);	 Catch:{ NullPointerException -> 0x0260 }
        r6 = r19;
        r7 = r25;
        r8 = r26;
        r4.a(r5, r6, r7, r8);	 Catch:{ NullPointerException -> 0x0260 }
        r0 = r19;
        r1 = r25;
        com.whatsapp.qa.a(r14, r0, r1);	 Catch:{ NullPointerException -> 0x0260 }
    L_0x0147:
        if (r13 == 0) goto L_0x0193;
    L_0x0149:
        r4 = com.whatsapp.App.as;
        r0 = r19;
        r4 = r4.f(r0);
        if (r4 != 0) goto L_0x015e;
    L_0x0153:
        r0 = r19;
        r1 = r25;
        r2 = r26;
        com.whatsapp.qa.a(r0, r1, r2);	 Catch:{ NullPointerException -> 0x0262 }
        if (r13 == 0) goto L_0x0193;
    L_0x015e:
        r5 = r4.o;	 Catch:{ NullPointerException -> 0x0264 }
        r6 = 2;
        r0 = r19;
        com.whatsapp.App.a(r0, r5, r6);	 Catch:{ NullPointerException -> 0x0264 }
        r5 = com.whatsapp.App.z();	 Catch:{ NullPointerException -> 0x0264 }
        r4 = r4.a(r5);	 Catch:{ NullPointerException -> 0x0264 }
        r0 = r25;
        r4 = r4.equals(r0);	 Catch:{ NullPointerException -> 0x0264 }
        if (r4 != 0) goto L_0x0193;
    L_0x0176:
        r4 = z;	 Catch:{ NullPointerException -> 0x0264 }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ NullPointerException -> 0x0264 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ NullPointerException -> 0x0264 }
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0264 }
        r0 = r19;
        r1 = r28;
        r2 = r25;
        r4.a(r0, r1, r2);	 Catch:{ NullPointerException -> 0x0264 }
        r4 = com.whatsapp.App.aK;	 Catch:{ NullPointerException -> 0x0264 }
        r0 = r19;
        r1 = r25;
        r4.c(r0, r1);	 Catch:{ NullPointerException -> 0x0264 }
    L_0x0193:
        r4 = c(r19);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 35;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = new java.util.ArrayList;
        r7 = r4.l();
        r6.<init>(r7);
        r6 = r6.toArray();
        r6 = java.util.Arrays.deepToString(r6);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r14 = r4.f();
        r5 = 0;
        r0 = r30;
        r4.a(r0, r5);	 Catch:{ NullPointerException -> 0x0266 }
        r4 = e;	 Catch:{ NullPointerException -> 0x0266 }
        r0 = r19;
        r4.remove(r0);	 Catch:{ NullPointerException -> 0x0266 }
        if (r10 == 0) goto L_0x01e7;
    L_0x01d5:
        r15 = 0;
        r4 = r18;
        r5 = r19;
        r6 = r25;
        r7 = r22;
        r8 = r26;
        r4 = a(r4, r5, r6, r7, r8);	 Catch:{ NullPointerException -> 0x0266 }
        a(r15, r4);	 Catch:{ NullPointerException -> 0x0266 }
    L_0x01e7:
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x0268 }
        r4 = r4.e();	 Catch:{ NullPointerException -> 0x0268 }
        r4 = r4.p;	 Catch:{ NullPointerException -> 0x0268 }
        r0 = r30;
        r4 = r0.containsKey(r4);	 Catch:{ NullPointerException -> 0x0268 }
        if (r4 == 0) goto L_0x0246;
    L_0x01f7:
        if (r11 != 0) goto L_0x0246;
    L_0x01f9:
        if (r14 != 0) goto L_0x0246;
    L_0x01fb:
        if (r12 != 0) goto L_0x0246;
    L_0x01fd:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 33;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = com.whatsapp.App.as;
        r5 = r5.e();
        r5 = r5.p;
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r8 = new java.util.Vector;
        r4 = 1;
        r8.<init>(r4);
        r4 = com.whatsapp.App.as;	 Catch:{ NullPointerException -> 0x026e }
        r4 = r4.e();	 Catch:{ NullPointerException -> 0x026e }
        r4 = r4.p;	 Catch:{ NullPointerException -> 0x026e }
        r8.add(r4);	 Catch:{ NullPointerException -> 0x026e }
        if (r10 == 0) goto L_0x0270;
    L_0x0232:
        r5 = 0;
    L_0x0233:
        r11 = 1;
        r4 = 12;
        r0 = r18;
        r7 = r0.d;	 Catch:{ NullPointerException -> 0x0273 }
        r9 = 0;
        r6 = r19;
        r4 = a(r4, r5, r6, r7, r8, r9);	 Catch:{ NullPointerException -> 0x0273 }
        a(r11, r4);	 Catch:{ NullPointerException -> 0x0273 }
        if (r13 == 0) goto L_0x024b;
    L_0x0246:
        if (r10 != 0) goto L_0x024b;
    L_0x0248:
        com.whatsapp.App.b(r18);	 Catch:{ NullPointerException -> 0x0275 }
    L_0x024b:
        return;
    L_0x024c:
        r4 = move-exception;
        throw r4;
    L_0x024e:
        r4 = 0;
        r10 = r4;
        goto L_0x00b9;
    L_0x0252:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x0254 }
    L_0x0254:
        r4 = move-exception;
        throw r4;
    L_0x0256:
        r4 = 0;
        r11 = r4;
        goto L_0x00d1;
    L_0x025a:
        r4 = move-exception;
        throw r4;
    L_0x025c:
        r4 = 0;
        r12 = r4;
        goto L_0x00df;
    L_0x0260:
        r4 = move-exception;
        throw r4;
    L_0x0262:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x0264 }
    L_0x0264:
        r4 = move-exception;
        throw r4;
    L_0x0266:
        r4 = move-exception;
        throw r4;
    L_0x0268:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x026a }
    L_0x026a:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x026c }
    L_0x026c:
        r4 = move-exception;
        throw r4;
    L_0x026e:
        r4 = move-exception;
        throw r4;
    L_0x0270:
        r5 = r18;
        goto L_0x0233;
    L_0x0273:
        r4 = move-exception;
        throw r4;	 Catch:{ NullPointerException -> 0x0275 }
    L_0x0275:
        r4 = move-exception;
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(com.whatsapp.protocol.ct, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, java.lang.String, java.util.Hashtable, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r12, java.util.Hashtable r13, java.lang.String r14) {
        /*
        r11 = this;
        r10 = 1;
        r3 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 60;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = "/";
        r0 = r0.append(r1);
        r1 = r13.values();
        r1 = r1.toArray();
        r1 = java.util.Arrays.deepToString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = r12.e;
        r0 = e;
        r0.remove(r2);
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r0 = r0.p;
        r1 = com.whatsapp.App.as;
        r1 = r1.c(r2);
        r5 = c(r2);
        if (r1 == 0) goto L_0x005c;
    L_0x0050:
        r4 = r5.f();	 Catch:{ NullPointerException -> 0x00d1 }
        if (r4 != 0) goto L_0x0075;
    L_0x0056:
        r0 = r13.containsKey(r0);	 Catch:{ NullPointerException -> 0x00d3 }
        if (r0 != 0) goto L_0x0075;
    L_0x005c:
        r0 = z;	 Catch:{ NullPointerException -> 0x00d5 }
        r4 = 59;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x00d5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x00d5 }
        r0 = 0;
        com.whatsapp.App.c(r2, r0);	 Catch:{ NullPointerException -> 0x00d5 }
        if (r1 != 0) goto L_0x00d7;
    L_0x006b:
        r0 = r3;
    L_0x006c:
        r1 = 2;
        com.whatsapp.App.a(r2, r0, r1);
        com.whatsapp.App.b(r12);
        if (r6 == 0) goto L_0x00d0;
    L_0x0075:
        r4 = new java.util.Vector;
        r4.<init>();
        r0 = r13.entrySet();
        r7 = r0.iterator();
    L_0x0082:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00ac;
    L_0x0088:
        r0 = r7.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r4.add(r1);
        r8 = z;
        r9 = 61;
        r8 = r8[r9];
        r0 = r8.equals(r0);
        r5.a(r1, r0, r3);
        if (r6 == 0) goto L_0x0082;
    L_0x00ac:
        r0 = r12.d;
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x00da;
    L_0x00b4:
        r1 = r5.d();
        r6 = r1.size();
        if (r6 != r10) goto L_0x00da;
    L_0x00be:
        r0 = r1.get(r3);
        r0 = (com.whatsapp.adl) r0;
        r3 = r0.e;
    L_0x00c6:
        r0 = 12;
        r1 = r12;
        r0 = a(r0, r1, r2, r3, r4, r5);
        a(r10, r0);
    L_0x00d0:
        return;
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = r1.o;
        goto L_0x006c;
    L_0x00da:
        r3 = r0;
        goto L_0x00c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qm.a(com.whatsapp.protocol.ct, java.util.Hashtable, java.lang.String):void");
    }
}
