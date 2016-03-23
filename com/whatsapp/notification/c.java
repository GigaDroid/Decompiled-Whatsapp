package com.whatsapp.notification;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.a3b;
import com.whatsapp.a9q;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class c implements Runnable {
    private static final HashMap c;
    private static final String[] e;
    private static final String[] z;
    private final boolean a;
    private final boolean b;
    private final ao d;
    private final boolean f;
    private final boolean g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (getClass() == obj.getClass()) {
                    c cVar = (c) obj;
                    try {
                        if (this.f == cVar.f) {
                            if (this.b == cVar.b) {
                                try {
                                    if (this.a == cVar.a) {
                                        try {
                                            if (this.g == cVar.g) {
                                                try {
                                                    if (this.d.equals(cVar.d)) {
                                                        return true;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    throw e;
                                                }
                                            }
                                        } catch (NumberFormatException e2) {
                                            throw e2;
                                        }
                                    }
                                } catch (NumberFormatException e22) {
                                    throw e22;
                                }
                            }
                        }
                        return false;
                    } catch (NumberFormatException e222) {
                        throw e222;
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    }
                }
            } catch (NumberFormatException e22222) {
                throw e22222;
            }
        }
        return false;
    }

    private boolean a() {
        a3b a = a3b.a(App.z());
        a9q d = a.d();
        a9q g = a.g();
        int parseInt = Integer.parseInt(g.b());
        int parseInt2 = Integer.parseInt(d.b());
        CharSequence c = g.c();
        CharSequence c2 = d.c();
        CharSequence e = g.e();
        CharSequence e2 = d.e();
        CharSequence l = g.l();
        CharSequence l2 = d.l();
        if (parseInt == 0 && parseInt2 == 0) {
            try {
                if (TextUtils.isEmpty(c)) {
                    if (TextUtils.isEmpty(c2)) {
                        try {
                            if (TextUtils.equals(z[1], e)) {
                                try {
                                    if (TextUtils.equals(z[0], e2)) {
                                        try {
                                            if (TextUtils.equals("0", l)) {
                                                try {
                                                    if (TextUtils.equals("0", l2)) {
                                                        return true;
                                                    }
                                                } catch (NumberFormatException e3) {
                                                    throw e3;
                                                }
                                            }
                                        } catch (NumberFormatException e32) {
                                            throw e32;
                                        }
                                    }
                                } catch (NumberFormatException e322) {
                                    throw e322;
                                }
                            }
                        } catch (NumberFormatException e3222) {
                            throw e3222;
                        }
                    }
                }
            } catch (NumberFormatException e32222) {
                throw e32222;
            } catch (NumberFormatException e322222) {
                throw e322222;
            }
        }
        return false;
    }

    public static boolean a(Uri uri) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        Boolean bool = (Boolean) c.get(uri);
        if (bool != null) {
            try {
                return bool.booleanValue();
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            Cursor query = App.at.query(uri, e, z[38], null, z[37]);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        c.put(uri, Boolean.TRUE);
                        if (query == null) {
                            return true;
                        }
                        try {
                            query.close();
                            return true;
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e3) {
                    cursor = query;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = query;
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e2222) {
                    throw e2222;
                }
            }
        } catch (Exception e4) {
            cursor = null;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e22222) {
                    throw e22222;
                }
            }
            c.put(uri, Boolean.FALSE);
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        c.put(uri, Boolean.FALSE);
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r34 = this;
        r19 = com.whatsapp.notification.PopupNotification.p;
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0016 }
        r2 = com.whatsapp.App.t(r2);	 Catch:{ NumberFormatException -> 0x0016 }
        r3 = 3;
        if (r2 == r3) goto L_0x0018;
    L_0x000d:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0016 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0016 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0016 }
    L_0x0015:
        return;
    L_0x0016:
        r2 = move-exception;
        throw r2;
    L_0x0018:
        r2 = r34.a();	 Catch:{ NumberFormatException -> 0x0028 }
        if (r2 == 0) goto L_0x002a;
    L_0x001e:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0028 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0028 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0028 }
        goto L_0x0015;
    L_0x0028:
        r2 = move-exception;
        throw r2;
    L_0x002a:
        r2 = com.whatsapp.App.z();
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r4 = 0;
        r10 = r2.getSharedPreferences(r3, r4);
        r2 = com.whatsapp.App.z();
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r2 = r2.getSystemService(r3);
        r9 = r2;
        r9 = (android.telephony.TelephonyManager) r9;
        r2 = com.whatsapp.App.z();
        r20 = android.support.v4.app.NotificationManagerCompat.from(r2);
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r21 = new java.lang.StringBuilder;
        r21.<init>();
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r17 = com.whatsapp.qa.g();
        r11 = r17.iterator();
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x006c:
        r2 = r11.hasNext();
        if (r2 == 0) goto L_0x0b9c;
    L_0x0072:
        r2 = r11.next();
        r2 = (java.lang.String) r2;
        r7 = com.whatsapp.App.as;
        r8 = r7.b(r2);
        r2 = r8.d;
        if (r2 <= 0) goto L_0x0b96;
    L_0x0082:
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.a3b.a(r2);
        r7 = r8.p;
        r2 = r2.b(r7);
        r2 = r2.a();	 Catch:{ NumberFormatException -> 0x0141 }
        if (r2 == 0) goto L_0x00a5;
    L_0x0096:
        r2 = com.whatsapp.App.aK;	 Catch:{ NumberFormatException -> 0x0141 }
        r7 = r8.p;	 Catch:{ NumberFormatException -> 0x0141 }
        r2 = r2.b(r7);	 Catch:{ NumberFormatException -> 0x0141 }
        if (r2 != 0) goto L_0x00a5;
    L_0x00a0:
        r2 = r8.d;
        r5 = r5 + r2;
        r6 = r6 + 1;
    L_0x00a5:
        r2 = com.whatsapp.App.aK;
        r7 = r8.p;
        r7 = r2.v(r7);
        if (r7 == 0) goto L_0x0b92;
    L_0x00af:
        if (r3 == 0) goto L_0x00bb;
    L_0x00b1:
        r12 = r3.b;	 Catch:{ NumberFormatException -> 0x0143 }
        r0 = r7.b;	 Catch:{ NumberFormatException -> 0x0143 }
        r22 = r0;
        r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1));
        if (r2 >= 0) goto L_0x0b8e;
    L_0x00bb:
        r2 = r7;
        r3 = r8;
    L_0x00bd:
        r4 = r7.k;	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r15.append(r4);	 Catch:{ NumberFormatException -> 0x0145 }
        r12 = r7.k;	 Catch:{ NumberFormatException -> 0x0145 }
        r12 = r12.a;	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r4.append(r12);	 Catch:{ NumberFormatException -> 0x0145 }
        r7 = r7.k;	 Catch:{ NumberFormatException -> 0x0145 }
        r7 = r7.c;	 Catch:{ NumberFormatException -> 0x0145 }
        r4.append(r7);	 Catch:{ NumberFormatException -> 0x0145 }
        if (r19 == 0) goto L_0x0ba8;
    L_0x00d6:
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0145 }
        r4.<init>();	 Catch:{ NumberFormatException -> 0x0145 }
        r7 = z;	 Catch:{ NumberFormatException -> 0x0145 }
        r12 = 27;
        r7 = r7[r12];	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0145 }
        r7 = r8.p;	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0145 }
        r7 = " ";
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0145 }
        r7 = r8.d;	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r4.toString();	 Catch:{ NumberFormatException -> 0x0145 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ NumberFormatException -> 0x0145 }
        r4 = r5;
        r5 = r6;
    L_0x0101:
        if (r19 == 0) goto L_0x0ba2;
    L_0x0103:
        r11 = r2;
        r12 = r3;
        r13 = r4;
        r14 = r5;
    L_0x0107:
        r2 = r15.toString();
        r22 = com.whatsapp.ve.f(r2);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r3 = 0;
        r2 = r10.getString(r2, r3);
        r0 = r22;
        r2 = r0.equals(r2);	 Catch:{ NumberFormatException -> 0x013f }
        if (r2 == 0) goto L_0x0147;
    L_0x0121:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x013f }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x013f }
        r3 = z;	 Catch:{ NumberFormatException -> 0x013f }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x013f }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x013f }
        r0 = r22;
        r2 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x013f }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x013f }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x013f }
        goto L_0x0015;
    L_0x013f:
        r2 = move-exception;
        throw r2;
    L_0x0141:
        r2 = move-exception;
        throw r2;
    L_0x0143:
        r2 = move-exception;
        throw r2;
    L_0x0145:
        r2 = move-exception;
        throw r2;
    L_0x0147:
        if (r14 == 0) goto L_0x014b;
    L_0x0149:
        if (r12 != 0) goto L_0x0167;
    L_0x014b:
        r2 = 1;
        r0 = r20;
        r0.cancel(r2);	 Catch:{ NumberFormatException -> 0x0165 }
        r0 = r34;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0165 }
        if (r2 == 0) goto L_0x0015;
    L_0x0157:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0163 }
        com.whatsapp.appwidget.WidgetProvider.a(r2);	 Catch:{ NumberFormatException -> 0x0163 }
        com.whatsapp.App.at();	 Catch:{ NumberFormatException -> 0x0163 }
        goto L_0x0015;
    L_0x0163:
        r2 = move-exception;
        throw r2;
    L_0x0165:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0163 }
    L_0x0167:
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.a3b.a(r2);
        r3 = r12.p;
        r23 = r2.b(r3);
        r2 = r23.a();	 Catch:{ NumberFormatException -> 0x01ab }
        if (r2 != 0) goto L_0x01ad;
    L_0x017b:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x01ab }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x01ab }
        r3 = z;	 Catch:{ NumberFormatException -> 0x01ab }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x01ab }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x01ab }
        r3 = r12.p;	 Catch:{ NumberFormatException -> 0x01ab }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x01ab }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x01ab }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x01ab }
        r0 = r34;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x01ab }
        if (r2 == 0) goto L_0x0015;
    L_0x019d:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x01a9 }
        com.whatsapp.appwidget.WidgetProvider.a(r2);	 Catch:{ NumberFormatException -> 0x01a9 }
        com.whatsapp.App.at();	 Catch:{ NumberFormatException -> 0x01a9 }
        goto L_0x0015;
    L_0x01a9:
        r2 = move-exception;
        throw r2;
    L_0x01ab:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x01a9 }
    L_0x01ad:
        r24 = new java.lang.StringBuilder;
        r24.<init>();
        r2 = 1;
        if (r14 != r2) goto L_0x01f7;
    L_0x01b5:
        r2 = com.whatsapp.App.z();
        r2 = r12.a(r2);
        r2 = com.whatsapp.a28.b(r2);
        r3 = 1;
        if (r13 != r3) goto L_0x01d9;
    L_0x01c4:
        r3 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a43 }
        r4 = 0;
        r5 = 0;
        r3 = com.whatsapp.notification.d.a(r3, r11, r12, r4, r5);	 Catch:{ NumberFormatException -> 0x0a43 }
        r3 = com.whatsapp.a28.b(r3);	 Catch:{ NumberFormatException -> 0x0a43 }
        r0 = r24;
        r0.append(r3);	 Catch:{ NumberFormatException -> 0x0a43 }
        if (r19 == 0) goto L_0x0238;
    L_0x01d9:
        r3 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x0a45 }
        r4 = 2131296300; // 0x7f09002c float:1.8210513E38 double:1.053000283E-314;
        r3 = r3.a(r4, r13);	 Catch:{ NumberFormatException -> 0x0a45 }
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x0a45 }
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r13);	 Catch:{ NumberFormatException -> 0x0a45 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0a45 }
        r3 = java.lang.String.format(r3, r4);	 Catch:{ NumberFormatException -> 0x0a45 }
        r0 = r24;
        r0.append(r3);	 Catch:{ NumberFormatException -> 0x0a45 }
        if (r19 == 0) goto L_0x0238;
    L_0x01f7:
        r2 = com.whatsapp.App.z();
        r3 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;
        r2 = r2.getString(r3);
        r3 = com.whatsapp.App.az;
        r4 = 2131296301; // 0x7f09002d float:1.8210515E38 double:1.0530002834E-314;
        r3 = r3.a(r4, r13);
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r13);
        r4[r5] = r6;
        r3 = java.lang.String.format(r3, r4);
        r4 = com.whatsapp.App.az;
        r5 = 2131296302; // 0x7f09002e float:1.8210517E38 double:1.053000284E-314;
        r4 = r4.a(r5, r14);
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r5[r6] = r3;
        r3 = 1;
        r6 = java.lang.Integer.valueOf(r14);
        r5[r3] = r6;
        r3 = java.lang.String.format(r4, r5);
        r0 = r24;
        r0.append(r3);
    L_0x0238:
        r18 = r2;
        r0 = r34;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0a47 }
        if (r2 != 0) goto L_0x0246;
    L_0x0240:
        r0 = r34;
        r2 = r0.f;	 Catch:{ NumberFormatException -> 0x0a47 }
        if (r2 == 0) goto L_0x0015;
    L_0x0246:
        r25 = new android.support.v4.app.NotificationCompat$Builder;
        r2 = com.whatsapp.App.z();
        r0 = r25;
        r0.<init>(r2);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r0 = r25;
        r0.setCategory(r2);
        r2 = r12.c();
        if (r2 != 0) goto L_0x0272;
    L_0x0261:
        r2 = com.whatsapp.App.at;
        r2 = r12.a(r2);
        if (r2 == 0) goto L_0x0272;
    L_0x0269:
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0a4b }
        r0 = r25;
        r0.addPerson(r2);	 Catch:{ NumberFormatException -> 0x0a4b }
    L_0x0272:
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        r0 = r25;
        r0.setGroup(r2);
        r2 = 1;
        r0 = r25;
        r0.setGroupSummary(r2);
        r2 = 0;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0a4d }
        r4 = 16;
        if (r3 < r4) goto L_0x0b8b;
    L_0x028a:
        r3 = 1;
        if (r14 != r3) goto L_0x0b8b;
    L_0x028d:
        r3 = r11.c;	 Catch:{ NumberFormatException -> 0x0a4f }
        r4 = 1;
        if (r3 != r4) goto L_0x0b8b;
    L_0x0292:
        r3 = r11.Q;	 Catch:{ NumberFormatException -> 0x0a51 }
        if (r3 == 0) goto L_0x0b8b;
    L_0x0296:
        r2 = com.whatsapp.App.e(r11);
        r15 = r2;
    L_0x029b:
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 17104901; // 0x1050005 float:2.4428256E-38 double:8.450944E-317;
        r26 = r2.getDimensionPixelSize(r3);
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 17104902; // 0x1050006 float:2.442826E-38 double:8.4509445E-317;
        r27 = r2.getDimensionPixelSize(r3);
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0a53 }
        r3 = 11;
        if (r2 < r3) goto L_0x02ed;
    L_0x02bf:
        r2 = 1;
        if (r14 != r2) goto L_0x02ed;
    L_0x02c2:
        r0 = r26;
        r1 = r27;
        r2 = r12.a(r0, r1);
        if (r2 == 0) goto L_0x02de;
    L_0x02cc:
        r3 = z;	 Catch:{ NumberFormatException -> 0x0a55 }
        r4 = 29;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0a55 }
        r0 = r21;
        r0.append(r3);	 Catch:{ NumberFormatException -> 0x0a55 }
        r0 = r25;
        r0.setLargeIcon(r2);	 Catch:{ NumberFormatException -> 0x0a55 }
        if (r19 == 0) goto L_0x0b87;
    L_0x02de:
        r2 = java.lang.Math.min(r26, r27);
        r2 = r12.a(r2);
        r0 = r25;
        r0.setLargeIcon(r2);
        if (r19 == 0) goto L_0x0b87;
    L_0x02ed:
        r2 = 0;
        r16 = r2;
    L_0x02f0:
        r8 = com.whatsapp.notification.AndroidWear.b();
        r7 = 0;
        r2 = com.whatsapp.notification.AndroidWear.a();
        if (r2 == 0) goto L_0x0303;
    L_0x02fb:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r3 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r7 = r12.a(r2, r3);
    L_0x0303:
        r2 = com.whatsapp.App.z();
        r28 = com.whatsapp.vh.j(r2);
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0a57 }
        r3 = 16;
        if (r2 < r3) goto L_0x06b9;
    L_0x0311:
        r2 = 1;
        if (r13 <= r2) goto L_0x0574;
    L_0x0314:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r29 = new java.util.ArrayList;
        r29.<init>();
        r3 = r17.iterator();
    L_0x0322:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x034b;
    L_0x0328:
        r2 = r3.next();
        r2 = (java.lang.String) r2;
        r0 = r34;
        r4 = r0.d;
        r2 = r4.c(r2);
        r4 = r2.size();	 Catch:{ NumberFormatException -> 0x0a59 }
        if (r4 <= 0) goto L_0x0346;
    L_0x033c:
        r4 = 0;
        r4 = r2.get(r4);	 Catch:{ NumberFormatException -> 0x0a59 }
        r0 = r29;
        r0.add(r4);	 Catch:{ NumberFormatException -> 0x0a59 }
    L_0x0346:
        r5.addAll(r2);
        if (r19 == 0) goto L_0x0322;
    L_0x034b:
        r2 = new com.whatsapp.notification.k;
        r0 = r34;
        r2.<init>(r0);
        java.util.Collections.sort(r5, r2);
        r2 = r5.size();
        r3 = 1;
        if (r2 <= r3) goto L_0x03e7;
    L_0x035c:
        r6 = new android.support.v4.app.NotificationCompat$InboxStyle;
        r6.<init>();
        r2 = 0;
        r3 = r5.size();
        r3 = r3 + -7;
        r2 = java.lang.Math.max(r2, r3);
        r3 = r2;
    L_0x036d:
        r2 = r5.size();
        if (r3 >= r2) goto L_0x03c4;
    L_0x0373:
        r2 = r5.get(r3);
        r2 = (com.whatsapp.protocol.co) r2;
        r4 = com.whatsapp.App.as;
        r10 = r2.k;
        r10 = r10.c;
        r10 = r4.b(r10);
        r17 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a5b }
        r4 = 1;
        if (r14 <= r4) goto L_0x0a5d;
    L_0x038a:
        r4 = 1;
    L_0x038b:
        r30 = 0;
        r0 = r17;
        r1 = r30;
        r2 = com.whatsapp.notification.d.a(r0, r2, r10, r4, r1);
        r2 = com.whatsapp.a28.b(r2);
        r6.addLine(r2);
        r4 = z;
        r10 = 7;
        r4 = r4[r10];
        r0 = r21;
        r4 = r0.append(r4);
        r4 = r4.append(r3);
        r10 = "(";
        r4 = r4.append(r10);
        r2 = r2.length();
        r2 = r4.append(r2);
        r4 = ")";
        r2.append(r4);
        r2 = r3 + 1;
        if (r19 == 0) goto L_0x0b84;
    L_0x03c4:
        r0 = r24;
        r6.setSummaryText(r0);
        r0 = r25;
        r0.setStyle(r6);
        r2 = z;
        r3 = 31;
        r2 = r2[r3];
        r0 = r21;
        r2 = r0.append(r2);
        r3 = 8;
        r4 = r5.size();
        r3 = java.lang.Math.min(r3, r4);
        r2.append(r3);
    L_0x03e7:
        r2 = com.whatsapp.notification.AndroidWear.a();	 Catch:{ NumberFormatException -> 0x0a60 }
        if (r2 == 0) goto L_0x0572;
    L_0x03ed:
        r0 = r34;
        r2 = r0.f;	 Catch:{ NumberFormatException -> 0x0a60 }
        if (r2 == 0) goto L_0x03f6;
    L_0x03f3:
        r2 = 1;
        if (r14 > r2) goto L_0x0572;
    L_0x03f6:
        r2 = new com.whatsapp.notification.k;
        r0 = r34;
        r2.<init>(r0);
        r0 = r29;
        java.util.Collections.sort(r0, r2);
        r30 = new android.support.v4.app.NotificationCompat$Builder;
        r2 = com.whatsapp.App.z();
        r0 = r30;
        r0.<init>(r2);
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r0 = r30;
        r0.setGroup(r2);
        r2 = 2130839686; // 0x7f020886 float:1.728439E38 double:1.0527746856E-314;
        r0 = r30;
        r0.setSmallIcon(r2);
        r2 = 1;
        r0 = r30;
        r0.setOnlyAlertOnce(r2);
        r2 = 0;
        r3 = r2;
    L_0x0427:
        r2 = 0;
        r4 = r29.size();
        r4 = r4 + -7;
        r2 = java.lang.Math.max(r2, r4);
        if (r3 >= r2) goto L_0x0b80;
    L_0x0434:
        r0 = r29;
        r2 = r0.get(r3);
        r2 = (com.whatsapp.protocol.co) r2;
        r2 = r2.k;
        r2 = r2.c;
        r4 = 1;
        r0 = r20;
        r0.cancel(r2, r4);
        r2 = r3 + 1;
        if (r19 == 0) goto L_0x0b7d;
    L_0x044a:
        r17 = r2;
    L_0x044c:
        r2 = r29.size();
        r0 = r17;
        if (r0 >= r2) goto L_0x0572;
    L_0x0454:
        r0 = r29;
        r1 = r17;
        r2 = r0.get(r1);
        r10 = r2;
        r10 = (com.whatsapp.protocol.co) r10;
        r2 = com.whatsapp.App.as;
        r3 = r10.k;
        r3 = r3.c;
        r3 = r2.b(r3);
        r0 = r30;
        r1 = r16;
        r0.setLargeIcon(r1);
        r4 = r10.b;
        r0 = r30;
        r0.setWhen(r4);
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.notification.d.b(r2, r10, r3);
        r4 = r2.b();	 Catch:{ NumberFormatException -> 0x0a64 }
        r4 = com.whatsapp.a28.b(r4);	 Catch:{ NumberFormatException -> 0x0a64 }
        r0 = r30;
        r0.setContentTitle(r4);	 Catch:{ NumberFormatException -> 0x0a64 }
        r2 = r2.a();	 Catch:{ NumberFormatException -> 0x0a64 }
        r2 = com.whatsapp.a28.b(r2);	 Catch:{ NumberFormatException -> 0x0a64 }
        r0 = r30;
        r0.setContentText(r2);	 Catch:{ NumberFormatException -> 0x0a64 }
        if (r28 == 0) goto L_0x04ae;
    L_0x049b:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a64 }
        r4 = 0;
        r5 = 0;
        r6 = 1;
        if (r14 != r6) goto L_0x0a68;
    L_0x04a4:
        r6 = 1;
    L_0x04a5:
        r2 = com.whatsapp.notification.AndroidWear.a(r2, r3, r4, r5, r6, r7, r8);
        r0 = r30;
        r0.extend(r2);
    L_0x04ae:
        r5 = new android.support.v4.app.NotificationCompat$CarExtender$UnreadConversation$Builder;
        r2 = com.whatsapp.App.z();
        r2 = r3.a(r2);
        r5.<init>(r2);
        r0 = r34;
        r2 = r0.d;
        r4 = r3.p;
        r2 = r2.c(r4);
        r4 = new java.util.ArrayList;
        r4.<init>(r2);
        java.util.Collections.reverse(r4);
        r6 = r4.iterator();
    L_0x04d1:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x04f4;
    L_0x04d7:
        r2 = r6.next();
        r2 = (com.whatsapp.protocol.co) r2;
        r4 = r2.c;
        if (r4 != 0) goto L_0x04e7;
    L_0x04e1:
        r4 = r2.c();
        if (r19 == 0) goto L_0x0b7a;
    L_0x04e7:
        r4 = com.whatsapp.App.z();
        r2 = com.whatsapp.notification.d.a(r4, r2);
    L_0x04ef:
        r5.addMessage(r2);
        if (r19 == 0) goto L_0x04d1;
    L_0x04f4:
        r0 = r10.b;	 Catch:{ NumberFormatException -> 0x0a6b }
        r32 = r0;
        r0 = r32;
        r5.setLatestTimestamp(r0);	 Catch:{ NumberFormatException -> 0x0a6b }
        if (r28 == 0) goto L_0x051d;
    L_0x04ff:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6b }
        r2 = com.whatsapp.notification.AndroidWear.b(r2, r3);	 Catch:{ NumberFormatException -> 0x0a6b }
        r4 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6b }
        r4 = com.whatsapp.notification.AndroidWear.c(r4, r3);	 Catch:{ NumberFormatException -> 0x0a6b }
        r5.setReplyAction(r2, r4);	 Catch:{ NumberFormatException -> 0x0a6b }
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6b }
        r2 = com.whatsapp.notification.AndroidWear.e(r2, r3);	 Catch:{ NumberFormatException -> 0x0a6b }
        r5.setReadPendingIntent(r2);	 Catch:{ NumberFormatException -> 0x0a6b }
    L_0x051d:
        r2 = new android.support.v4.app.NotificationCompat$CarExtender;
        r2.<init>();
        r4 = com.whatsapp.App.z();
        r4 = r4.getResources();
        r6 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r4 = r4.getColor(r6);
        r2.setColor(r4);
        r4 = r5.build();
        r2.setUnreadConversation(r4);
        r0 = r26;
        r1 = r27;
        r4 = r3.b(r0, r1);
        r2.setLargeIcon(r4);
        r0 = r30;
        r0.extend(r2);
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.Conversation.a(r2, r3);
        r4 = com.whatsapp.App.z();
        r5 = 0;
        r6 = 0;
        r2 = android.app.PendingIntent.getActivity(r4, r5, r2, r6);
        r0 = r30;
        r0.setContentIntent(r2);
        r2 = r3.p;
        r3 = 1;
        r4 = r30.build();
        r0 = r20;
        r0.notify(r2, r3, r4);
        r2 = r17 + 1;
        if (r19 == 0) goto L_0x044a;
    L_0x0572:
        if (r19 == 0) goto L_0x06b9;
    L_0x0574:
        r10 = new android.support.v4.app.NotificationCompat$CarExtender$UnreadConversation$Builder;
        r2 = com.whatsapp.App.z();
        r2 = r12.a(r2);
        r10.<init>(r2);
        r2 = r24.toString();	 Catch:{ NumberFormatException -> 0x0a6d }
        r10.addMessage(r2);	 Catch:{ NumberFormatException -> 0x0a6d }
        r2 = r11.b;	 Catch:{ NumberFormatException -> 0x0a6d }
        r10.setLatestTimestamp(r2);	 Catch:{ NumberFormatException -> 0x0a6d }
        if (r28 == 0) goto L_0x05c4;
    L_0x058f:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6d }
        r2 = com.whatsapp.notification.AndroidWear.b(r2, r12);	 Catch:{ NumberFormatException -> 0x0a6d }
        r3 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6d }
        r3 = com.whatsapp.notification.AndroidWear.c(r3, r12);	 Catch:{ NumberFormatException -> 0x0a6d }
        r10.setReplyAction(r2, r3);	 Catch:{ NumberFormatException -> 0x0a6d }
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6d }
        r2 = com.whatsapp.notification.AndroidWear.e(r2, r12);	 Catch:{ NumberFormatException -> 0x0a6d }
        r10.setReadPendingIntent(r2);	 Catch:{ NumberFormatException -> 0x0a6d }
        r2 = com.whatsapp.notification.AndroidWear.a();	 Catch:{ NumberFormatException -> 0x0a6d }
        if (r2 == 0) goto L_0x05c4;
    L_0x05b3:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a6f }
        r4 = 1;
        r6 = 1;
        r3 = r12;
        r5 = r11;
        r2 = com.whatsapp.notification.AndroidWear.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ NumberFormatException -> 0x0a6f }
        r0 = r25;
        r0.extend(r2);	 Catch:{ NumberFormatException -> 0x0a6f }
    L_0x05c4:
        r2 = new android.support.v4.app.NotificationCompat$CarExtender;
        r2.<init>();
        r3 = com.whatsapp.App.z();
        r3 = r3.getResources();
        r4 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r3 = r3.getColor(r4);
        r2.setColor(r3);
        r3 = r10.build();
        r2.setUnreadConversation(r3);
        r0 = r26;
        r1 = r27;
        r3 = r12.b(r0, r1);
        r2.setLargeIcon(r3);
        r0 = r25;
        r0.extend(r2);
        r2 = 0;
        if (r15 == 0) goto L_0x0613;
    L_0x05f5:
        r2 = new android.support.v4.app.NotificationCompat$BigPictureStyle;
        r2.<init>();
        r0 = r24;
        r2.setSummaryText(r0);
        r2.bigPicture(r15);
        r0 = r25;
        r0.setStyle(r2);
        r2 = 1;
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r0 = r21;
        r0.append(r3);
    L_0x0613:
        if (r2 != 0) goto L_0x0651;
    L_0x0615:
        r2 = new android.support.v4.app.NotificationCompat$BigTextStyle;
        r2.<init>();
        r0 = r24;
        r2.bigText(r0);
        r3 = com.whatsapp.App.az;
        r4 = 2131296300; // 0x7f09002c float:1.8210513E38 double:1.053000283E-314;
        r3 = r3.a(r4, r13);
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r13);
        r4[r5] = r6;
        r3 = java.lang.String.format(r3, r4);
        r2.setSummaryText(r3);
        r0 = r25;
        r0.setStyle(r2);
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r0 = r21;
        r2 = r0.append(r2);
        r3 = r24.length();
        r2.append(r3);
    L_0x0651:
        r2 = r11.c;	 Catch:{ NumberFormatException -> 0x0a71 }
        r3 = 2;
        if (r2 == r3) goto L_0x065b;
    L_0x0656:
        r2 = r11.c;	 Catch:{ NumberFormatException -> 0x0a71 }
        r3 = 1;
        if (r2 != r3) goto L_0x06b9;
    L_0x065b:
        r2 = r11.Q;	 Catch:{ NumberFormatException -> 0x0a73 }
        if (r2 == 0) goto L_0x06b9;
    L_0x065f:
        r2 = r11.Q;
        r2 = (com.whatsapp.MediaData) r2;
        r3 = r2.transferred;	 Catch:{ NumberFormatException -> 0x0a75 }
        if (r3 == 0) goto L_0x06b9;
    L_0x0667:
        r3 = r2.file;	 Catch:{ NumberFormatException -> 0x0a75 }
        if (r3 == 0) goto L_0x06b9;
    L_0x066b:
        r2 = r2.file;	 Catch:{ NumberFormatException -> 0x0a77 }
        r2 = r2.exists();	 Catch:{ NumberFormatException -> 0x0a77 }
        if (r2 == 0) goto L_0x06b9;
    L_0x0673:
        r2 = com.whatsapp.Conversation.a(r12);
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r2.setAction(r3);
        r3 = z;
        r4 = 32;
        r3 = r3[r4];
        r4 = new com.whatsapp.a4p;
        r5 = r11.k;
        r4.<init>(r5);
        r2.putExtra(r3, r4);
        r3 = com.whatsapp.App.z();
        r4 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r4 = android.app.PendingIntent.getActivity(r3, r4, r2, r5);
        r2 = r11.c;	 Catch:{ NumberFormatException -> 0x0a79 }
        r3 = 1;
        if (r2 != r3) goto L_0x0a7b;
    L_0x06a0:
        r2 = 2130839684; // 0x7f020884 float:1.7284386E38 double:1.0527746847E-314;
        r3 = r2;
    L_0x06a4:
        r5 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a81 }
        r2 = r11.c;	 Catch:{ NumberFormatException -> 0x0a81 }
        r6 = 1;
        if (r2 != r6) goto L_0x0a83;
    L_0x06ad:
        r2 = 2131232225; // 0x7f0805e1 float:1.8080553E38 double:1.0529686257E-314;
    L_0x06b0:
        r2 = r5.getString(r2);
        r0 = r25;
        r0.addAction(r3, r2, r4);
    L_0x06b9:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r34;
        r4 = r0.d;
        r4 = r4.a;
        r4 = r2 - r4;
        r6 = 2130839686; // 0x7f020886 float:1.728439E38 double:1.0527746856E-314;
        r0 = r25;
        r0.setSmallIcon(r6);	 Catch:{ NumberFormatException -> 0x0a88 }
        r0 = r34;
        r6 = r0.f;	 Catch:{ NumberFormatException -> 0x0a88 }
        if (r6 != 0) goto L_0x06e0;
    L_0x06d3:
        r6 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a88 }
        r6 = com.whatsapp.notification.d.a(r6, r11, r12);	 Catch:{ NumberFormatException -> 0x0a88 }
        r0 = r25;
        r0.setTicker(r6);	 Catch:{ NumberFormatException -> 0x0a88 }
    L_0x06e0:
        r0 = r25;
        r0.setWhen(r2);	 Catch:{ NumberFormatException -> 0x0a8a }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x083e;
    L_0x06eb:
        r0 = r34;
        r2 = r0.g;	 Catch:{ NumberFormatException -> 0x0a8a }
        if (r2 != 0) goto L_0x083e;
    L_0x06f1:
        r2 = "0";
        r4 = com.whatsapp.Voip.d();
        if (r4 != 0) goto L_0x070a;
    L_0x06fa:
        r3 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a8c }
        r5 = r12.p;	 Catch:{ NumberFormatException -> 0x0a8c }
        r3 = com.whatsapp.notification.d.b(r3, r5);	 Catch:{ NumberFormatException -> 0x0a8c }
        if (r3 != 0) goto L_0x070a;
    L_0x0706:
        r2 = r23.l();
    L_0x070a:
        r3 = z;
        r5 = 12;
        r3 = r3[r5];
        r0 = r21;
        r3 = r0.append(r3);
        r3.append(r2);
        r3 = -1;
        r5 = r2.hashCode();	 Catch:{ NumberFormatException -> 0x0ab2 }
        switch(r5) {
            case 49: goto L_0x0a8e;
            case 50: goto L_0x0a9a;
            case 51: goto L_0x0aa6;
            default: goto L_0x0721;
        };
    L_0x0721:
        r2 = r3;
    L_0x0722:
        switch(r2) {
            case 0: goto L_0x0ab8;
            case 1: goto L_0x0ac0;
            case 2: goto L_0x0acd;
            default: goto L_0x0725;
        };
    L_0x0725:
        r2 = r9.getCallState();
        if (r2 != 0) goto L_0x07d7;
    L_0x072b:
        r3 = 0;
        r2 = de.greenrobot.event.h.b();
        r5 = com.whatsapp.ana.class;
        r2 = r2.b(r5);
        r2 = (com.whatsapp.ana) r2;
        r5 = com.whatsapp.Conversation.F();
        r2 = r2.a;	 Catch:{ NumberFormatException -> 0x0ae0 }
        if (r2 != 0) goto L_0x0ae8;
    L_0x0740:
        r2 = com.whatsapp.App.ay();	 Catch:{ NumberFormatException -> 0x0ae0 }
        if (r2 == 0) goto L_0x0ae8;
    L_0x0746:
        r2 = r5.a();	 Catch:{ NumberFormatException -> 0x0ae2 }
        if (r2 == 0) goto L_0x0ae8;
    L_0x074c:
        r2 = r5.b();	 Catch:{ NumberFormatException -> 0x0ae4 }
        r2 = r2.ae;	 Catch:{ NumberFormatException -> 0x0ae4 }
        r6 = r12.p;	 Catch:{ NumberFormatException -> 0x0ae4 }
        r2 = r2.equals(r6);	 Catch:{ NumberFormatException -> 0x0ae4 }
        if (r2 == 0) goto L_0x0ae8;
    L_0x075a:
        r2 = com.whatsapp.Conversation.bz;	 Catch:{ NumberFormatException -> 0x0ae6 }
        if (r2 == 0) goto L_0x0b77;
    L_0x075e:
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r0 = r21;
        r0.append(r2);
        r2 = z;
        r3 = 20;
        r2 = r2[r3];
    L_0x076f:
        if (r4 == 0) goto L_0x077c;
    L_0x0771:
        if (r2 == 0) goto L_0x077c;
    L_0x0773:
        r3 = "";
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x0b01 }
        if (r3 != 0) goto L_0x077c;
    L_0x077c:
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x07d7;
    L_0x0782:
        r2 = android.net.Uri.parse(r2);
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b03 }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b03 }
        r0 = r21;
        r3 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x0b03 }
        r3.append(r2);	 Catch:{ NumberFormatException -> 0x0b03 }
        if (r2 == 0) goto L_0x07d7;
    L_0x0797:
        r3 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0b03 }
        r4 = r12.p;	 Catch:{ NumberFormatException -> 0x0b03 }
        r3 = com.whatsapp.notification.d.b(r3, r4);	 Catch:{ NumberFormatException -> 0x0b03 }
        if (r3 != 0) goto L_0x07d7;
    L_0x07a3:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0b05 }
        r4 = 22;
        if (r3 >= r4) goto L_0x07bd;
    L_0x07a9:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0b07 }
        r4 = 21;
        if (r3 != r4) goto L_0x07d4;
    L_0x07af:
        r3 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ NumberFormatException -> 0x0b09 }
        r3 = r3.equals(r2);	 Catch:{ NumberFormatException -> 0x0b09 }
        if (r3 != 0) goto L_0x07bd;
    L_0x07b7:
        r3 = a(r2);	 Catch:{ NumberFormatException -> 0x0b0b }
        if (r3 == 0) goto L_0x07d4;
    L_0x07bd:
        r3 = r5.a();	 Catch:{ NumberFormatException -> 0x0b0d }
        if (r3 == 0) goto L_0x07cd;
    L_0x07c3:
        r3 = r5.b();	 Catch:{ NumberFormatException -> 0x0b0f }
        r3 = r3.M();	 Catch:{ NumberFormatException -> 0x0b0f }
        if (r3 != 0) goto L_0x07d7;
    L_0x07cd:
        r0 = r25;
        r0.setSound(r2);	 Catch:{ NumberFormatException -> 0x0b11 }
        if (r19 == 0) goto L_0x07d7;
    L_0x07d4:
        com.whatsapp.App.a(r2);	 Catch:{ NumberFormatException -> 0x0b13 }
    L_0x07d7:
        r2 = de.greenrobot.event.h.b();
        r3 = com.whatsapp.ana.class;
        r2 = r2.b(r3);
        r2 = (com.whatsapp.ana) r2;
        r3 = r2.a;	 Catch:{ NumberFormatException -> 0x0b15 }
        if (r3 != 0) goto L_0x07f1;
    L_0x07e7:
        r3 = com.whatsapp.notification.PopupNotification.f;	 Catch:{ NumberFormatException -> 0x0b15 }
        if (r3 == 0) goto L_0x082f;
    L_0x07eb:
        r3 = com.whatsapp.notification.PopupNotification.f;	 Catch:{ NumberFormatException -> 0x0b17 }
        r3 = r3 instanceof com.whatsapp.notification.PopupNotificationLocked;	 Catch:{ NumberFormatException -> 0x0b17 }
        if (r3 == 0) goto L_0x082f;
    L_0x07f1:
        r3 = r23.e();
        if (r3 == 0) goto L_0x0822;
    L_0x07f7:
        r4 = 16;
        r3 = java.lang.Integer.parseInt(r3, r4);	 Catch:{ NumberFormatException -> 0x0b19 }
    L_0x07fd:
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r3 = r3 | r4;
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        if (r3 == r4) goto L_0x0820;
    L_0x0804:
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        r0 = r25;
        r0.setLights(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x0b1f }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0b1f }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0b1f }
        r0 = r21;
        r4 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0b1f }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ NumberFormatException -> 0x0b1f }
        r4.append(r3);	 Catch:{ NumberFormatException -> 0x0b1f }
    L_0x0820:
        if (r19 == 0) goto L_0x082d;
    L_0x0822:
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b21 }
        r4 = 21;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b21 }
        r0 = r21;
        r0.append(r3);	 Catch:{ NumberFormatException -> 0x0b21 }
    L_0x082d:
        if (r19 == 0) goto L_0x083e;
    L_0x082f:
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b23 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b23 }
        r0 = r21;
        r3 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x0b23 }
        r3.append(r2);	 Catch:{ NumberFormatException -> 0x0b23 }
    L_0x083e:
        r2 = 1;
        if (r14 != r2) goto L_0x0b27;
    L_0x0841:
        r2 = com.whatsapp.Conversation.a(r12);	 Catch:{ NumberFormatException -> 0x0b25 }
    L_0x0845:
        r3 = com.whatsapp.App.z();
        r4 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2 = android.app.PendingIntent.getActivity(r3, r4, r2, r5);
        r0 = r25;
        r0.setContentIntent(r2);	 Catch:{ NumberFormatException -> 0x0b36 }
        r0 = r25;
        r1 = r18;
        r0.setContentTitle(r1);	 Catch:{ NumberFormatException -> 0x0b36 }
        r0 = r25;
        r1 = r24;
        r0.setContentText(r1);	 Catch:{ NumberFormatException -> 0x0b36 }
        r2 = com.whatsapp.App.am;	 Catch:{ NumberFormatException -> 0x0b36 }
        r3 = 3;
        if (r2 != r3) goto L_0x0879;
    L_0x0868:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0b36 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0b36 }
        r0 = r21;
        r2 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0b36 }
        r0 = r24;
        r2.append(r0);	 Catch:{ NumberFormatException -> 0x0b36 }
    L_0x0879:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0b38 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0b38 }
        r0 = r21;
        r2 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0b38 }
        r0 = r22;
        r2.append(r0);	 Catch:{ NumberFormatException -> 0x0b38 }
        r0 = r34;
        r2 = r0.d;	 Catch:{ NumberFormatException -> 0x0b38 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0b38 }
        r2.a = r4;	 Catch:{ NumberFormatException -> 0x0b38 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0b38 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0b38 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b38 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b38 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b38 }
        r3 = r21.toString();	 Catch:{ NumberFormatException -> 0x0b38 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b38 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0b38 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0b38 }
        r0 = r34;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0b38 }
        if (r2 != 0) goto L_0x08fb;
    L_0x08b7:
        r0 = r34;
        r2 = r0.g;	 Catch:{ NumberFormatException -> 0x0b38 }
        if (r2 != 0) goto L_0x08fb;
    L_0x08bd:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0b3a }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0b3a }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b3a }
        r4 = 18;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b3a }
        r0 = r34;
        r3 = r0.b;	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b3a }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b3a }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b3a }
        r0 = r34;
        r3 = r0.g;	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b3a }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0b3a }
        r4 = 34;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.append(r14);	 Catch:{ NumberFormatException -> 0x0b3a }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0b3a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0b3a }
    L_0x08fb:
        r2 = r23.b();
        r3 = java.lang.Integer.parseInt(r2);
        r2 = r9.getCallState();	 Catch:{ NumberFormatException -> 0x0b3c }
        if (r2 != 0) goto L_0x0b48;
    L_0x0909:
        r2 = com.whatsapp.Voip.d();	 Catch:{ NumberFormatException -> 0x0b3c }
        if (r2 != 0) goto L_0x0b48;
    L_0x090f:
        if (r3 == 0) goto L_0x0b48;
    L_0x0911:
        r0 = r34;
        r2 = r0.a;	 Catch:{ NumberFormatException -> 0x0b40 }
        if (r2 != 0) goto L_0x0b48;
    L_0x0917:
        r2 = r23.f();	 Catch:{ NumberFormatException -> 0x0b42 }
        if (r2 != 0) goto L_0x0b48;
    L_0x091d:
        if (r28 == 0) goto L_0x0b48;
    L_0x091f:
        r2 = 1;
    L_0x0920:
        if (r2 != 0) goto L_0x092e;
    L_0x0922:
        r0 = r34;
        r4 = r0.f;	 Catch:{ NumberFormatException -> 0x0b4b }
        if (r4 != 0) goto L_0x092e;
    L_0x0928:
        r4 = 1;
        r0 = r25;
        r0.setPriority(r4);	 Catch:{ NumberFormatException -> 0x0b4d }
    L_0x092e:
        r4 = new android.content.Intent;
        r5 = com.whatsapp.App.z();
        r6 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class;
        r4.<init>(r5, r6);
        r5 = z;
        r6 = 35;
        r5 = r5[r6];
        r0 = r22;
        r4.putExtra(r5, r0);
        r5 = com.whatsapp.App.z();
        r6 = 1;
        r7 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r4 = android.app.PendingIntent.getBroadcast(r5, r6, r4, r7);
        r0 = r25;
        r0.setDeleteIntent(r4);
        r4 = com.whatsapp.App.z();
        r4 = r4.getResources();
        r5 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r4 = r4.getColor(r5);
        r0 = r25;
        r0.setColor(r4);
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 21;
        if (r4 < r5) goto L_0x09d3;
    L_0x096e:
        r4 = new android.support.v4.app.NotificationCompat$Builder;
        r5 = com.whatsapp.App.z();
        r4.<init>(r5);
        r5 = z;	 Catch:{ NumberFormatException -> 0x0b4f }
        r6 = 30;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0b4f }
        r4.setCategory(r5);	 Catch:{ NumberFormatException -> 0x0b4f }
        r5 = 2130839686; // 0x7f020886 float:1.728439E38 double:1.0527746856E-314;
        r4.setSmallIcon(r5);	 Catch:{ NumberFormatException -> 0x0b4f }
        r5 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0b4f }
        r6 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;
        r5 = r5.getString(r6);	 Catch:{ NumberFormatException -> 0x0b4f }
        r4.setContentTitle(r5);	 Catch:{ NumberFormatException -> 0x0b4f }
        r5 = 1;
        if (r13 != r5) goto L_0x09b3;
    L_0x0997:
        r5 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x0b4f }
        r6 = 2131296300; // 0x7f09002c float:1.8210513E38 double:1.053000283E-314;
        r5 = r5.a(r6, r13);	 Catch:{ NumberFormatException -> 0x0b4f }
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0b4f }
        r7 = 0;
        r8 = java.lang.Integer.valueOf(r13);	 Catch:{ NumberFormatException -> 0x0b4f }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0b4f }
        r5 = java.lang.String.format(r5, r6);	 Catch:{ NumberFormatException -> 0x0b4f }
        r4.setContentText(r5);	 Catch:{ NumberFormatException -> 0x0b4f }
        if (r19 == 0) goto L_0x09b8;
    L_0x09b3:
        r0 = r24;
        r4.setContentText(r0);	 Catch:{ NumberFormatException -> 0x0b51 }
    L_0x09b8:
        r5 = com.whatsapp.App.z();
        r5 = r5.getResources();
        r6 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r5 = r5.getColor(r6);
        r4.setColor(r5);
        r4 = r4.getNotification();
        r0 = r25;
        r0.setPublicVersion(r4);
    L_0x09d3:
        r4 = r25.getNotification();
        r0 = r34;
        r5 = r0.f;	 Catch:{ NumberFormatException -> 0x0b53 }
        if (r5 == 0) goto L_0x09e6;
    L_0x09dd:
        r5 = 1;
        if (r13 != r5) goto L_0x09e6;
    L_0x09e0:
        r5 = 1;
        r0 = r20;
        r0.cancel(r5);	 Catch:{ NumberFormatException -> 0x0b55 }
    L_0x09e6:
        r5 = 1;
        r0 = r20;
        r0.notify(r5, r4);	 Catch:{ SecurityException -> 0x0b57 }
    L_0x09ec:
        r0 = r34;
        r4 = r0.f;	 Catch:{ NumberFormatException -> 0x0b6b }
        if (r4 != 0) goto L_0x0015;
    L_0x09f2:
        r4 = com.whatsapp.Conversation.F();
        r5 = r4.a();	 Catch:{ NumberFormatException -> 0x0b6d }
        if (r5 == 0) goto L_0x0a07;
    L_0x09fc:
        r4 = r4.b();	 Catch:{ NumberFormatException -> 0x0b6f }
        r5 = r12.p;	 Catch:{ NumberFormatException -> 0x0b6f }
        r4.e(r5);	 Catch:{ NumberFormatException -> 0x0b6f }
        if (r19 == 0) goto L_0x0a0a;
    L_0x0a07:
        com.whatsapp.Conversation.l();	 Catch:{ NumberFormatException -> 0x0b6f }
    L_0x0a0a:
        if (r2 == 0) goto L_0x0a1e;
    L_0x0a0c:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0b71 }
        r2 = r2.M();	 Catch:{ NumberFormatException -> 0x0b71 }
        r4 = new com.whatsapp.notification.f;	 Catch:{ NumberFormatException -> 0x0b71 }
        r5 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0b71 }
        r4.<init>(r5, r3);	 Catch:{ NumberFormatException -> 0x0b71 }
        r2.post(r4);	 Catch:{ NumberFormatException -> 0x0b71 }
    L_0x0a1e:
        r0 = r34;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0b73 }
        if (r2 == 0) goto L_0x0a2f;
    L_0x0a24:
        r2 = r12.c();	 Catch:{ NumberFormatException -> 0x0b75 }
        if (r2 == 0) goto L_0x0a2f;
    L_0x0a2a:
        r2 = r12.p;	 Catch:{ NumberFormatException -> 0x0b75 }
        com.whatsapp.notification.d.a(r2);	 Catch:{ NumberFormatException -> 0x0b75 }
    L_0x0a2f:
        r0 = r34;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0a41 }
        if (r2 == 0) goto L_0x0015;
    L_0x0a35:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x0a41 }
        com.whatsapp.appwidget.WidgetProvider.a(r2);	 Catch:{ NumberFormatException -> 0x0a41 }
        com.whatsapp.App.at();	 Catch:{ NumberFormatException -> 0x0a41 }
        goto L_0x0015;
    L_0x0a41:
        r2 = move-exception;
        throw r2;
    L_0x0a43:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a45 }
    L_0x0a45:
        r2 = move-exception;
        throw r2;
    L_0x0a47:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a49 }
    L_0x0a49:
        r2 = move-exception;
        throw r2;
    L_0x0a4b:
        r2 = move-exception;
        throw r2;
    L_0x0a4d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a4f }
    L_0x0a4f:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a51 }
    L_0x0a51:
        r2 = move-exception;
        throw r2;
    L_0x0a53:
        r2 = move-exception;
        throw r2;
    L_0x0a55:
        r2 = move-exception;
        throw r2;
    L_0x0a57:
        r2 = move-exception;
        throw r2;
    L_0x0a59:
        r2 = move-exception;
        throw r2;
    L_0x0a5b:
        r2 = move-exception;
        throw r2;
    L_0x0a5d:
        r4 = 0;
        goto L_0x038b;
    L_0x0a60:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a62 }
    L_0x0a62:
        r2 = move-exception;
        throw r2;
    L_0x0a64:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a66 }
    L_0x0a66:
        r2 = move-exception;
        throw r2;
    L_0x0a68:
        r6 = 0;
        goto L_0x04a5;
    L_0x0a6b:
        r2 = move-exception;
        throw r2;
    L_0x0a6d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a6f }
    L_0x0a6f:
        r2 = move-exception;
        throw r2;
    L_0x0a71:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a73 }
    L_0x0a73:
        r2 = move-exception;
        throw r2;
    L_0x0a75:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a77 }
    L_0x0a77:
        r2 = move-exception;
        throw r2;
    L_0x0a79:
        r2 = move-exception;
        throw r2;
    L_0x0a7b:
        r2 = 2130839683; // 0x7f020883 float:1.7284383E38 double:1.052774684E-314;
        r3 = r2;
        goto L_0x06a4;
    L_0x0a81:
        r2 = move-exception;
        throw r2;
    L_0x0a83:
        r2 = 2131231698; // 0x7f0803d2 float:1.8079484E38 double:1.0529683653E-314;
        goto L_0x06b0;
    L_0x0a88:
        r2 = move-exception;
        throw r2;
    L_0x0a8a:
        r2 = move-exception;
        throw r2;
    L_0x0a8c:
        r2 = move-exception;
        throw r2;
    L_0x0a8e:
        r5 = "1";
        r5 = r2.equals(r5);	 Catch:{ NumberFormatException -> 0x0ab2 }
        if (r5 == 0) goto L_0x0721;
    L_0x0a97:
        r3 = 0;
        if (r19 == 0) goto L_0x0721;
    L_0x0a9a:
        r5 = "2";
        r5 = r2.equals(r5);	 Catch:{ NumberFormatException -> 0x0ab4 }
        if (r5 == 0) goto L_0x0721;
    L_0x0aa3:
        r3 = 1;
        if (r19 == 0) goto L_0x0721;
    L_0x0aa6:
        r5 = "3";
        r2 = r2.equals(r5);	 Catch:{ NumberFormatException -> 0x0ab6 }
        if (r2 == 0) goto L_0x0721;
    L_0x0aaf:
        r2 = 2;
        goto L_0x0722;
    L_0x0ab2:
        r2 = move-exception;
        throw r2;
    L_0x0ab4:
        r2 = move-exception;
        throw r2;
    L_0x0ab6:
        r2 = move-exception;
        throw r2;
    L_0x0ab8:
        r2 = 2;
        r0 = r25;
        r0.setDefaults(r2);	 Catch:{ NumberFormatException -> 0x0adc }
        if (r19 == 0) goto L_0x0725;
    L_0x0ac0:
        r2 = 5;
        r2 = new long[r2];	 Catch:{ NumberFormatException -> 0x0ade }
        r2 = {0, 300, 200, 300, 200};	 Catch:{ NumberFormatException -> 0x0ade }
        r0 = r25;
        r0.setVibrate(r2);	 Catch:{ NumberFormatException -> 0x0ade }
        if (r19 == 0) goto L_0x0725;
    L_0x0acd:
        r2 = 5;
        r2 = new long[r2];	 Catch:{ NumberFormatException -> 0x0ada }
        r2 = {0, 750, 250, 750, 250};	 Catch:{ NumberFormatException -> 0x0ada }
        r0 = r25;
        r0.setVibrate(r2);	 Catch:{ NumberFormatException -> 0x0ada }
        goto L_0x0725;
    L_0x0ada:
        r2 = move-exception;
        throw r2;
    L_0x0adc:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0ade }
    L_0x0ade:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0ada }
    L_0x0ae0:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0ae2 }
    L_0x0ae2:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0ae4 }
    L_0x0ae4:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0ae6 }
    L_0x0ae6:
        r2 = move-exception;
        throw r2;
    L_0x0ae8:
        r2 = z;
        r3 = 25;
        r2 = r2[r3];
        r0 = r21;
        r0.append(r2);
        r2 = r23.c();
        if (r2 != 0) goto L_0x076f;
    L_0x0af9:
        r2 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        r2 = r2.toString();
        goto L_0x076f;
    L_0x0b01:
        r2 = move-exception;
        throw r2;
    L_0x0b03:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b05 }
    L_0x0b05:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b07 }
    L_0x0b07:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b09 }
    L_0x0b09:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b0b }
    L_0x0b0b:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b0d }
    L_0x0b0d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b0f }
    L_0x0b0f:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b11 }
    L_0x0b11:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b13 }
    L_0x0b13:
        r2 = move-exception;
        throw r2;
    L_0x0b15:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b17 }
    L_0x0b17:
        r2 = move-exception;
        throw r2;
    L_0x0b19:
        r3 = move-exception;
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        goto L_0x07fd;
    L_0x0b1f:
        r2 = move-exception;
        throw r2;
    L_0x0b21:
        r2 = move-exception;
        throw r2;
    L_0x0b23:
        r2 = move-exception;
        throw r2;
    L_0x0b25:
        r2 = move-exception;
        throw r2;
    L_0x0b27:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.App.z();
        r4 = com.whatsapp.Main.e();
        r2.<init>(r3, r4);
        goto L_0x0845;
    L_0x0b36:
        r2 = move-exception;
        throw r2;
    L_0x0b38:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b3a }
    L_0x0b3a:
        r2 = move-exception;
        throw r2;
    L_0x0b3c:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b3e }
    L_0x0b3e:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b40 }
    L_0x0b40:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b42 }
    L_0x0b42:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b44 }
    L_0x0b44:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b46 }
    L_0x0b46:
        r2 = move-exception;
        throw r2;
    L_0x0b48:
        r2 = 0;
        goto L_0x0920;
    L_0x0b4b:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b4d }
    L_0x0b4d:
        r2 = move-exception;
        throw r2;
    L_0x0b4f:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b51 }
    L_0x0b51:
        r2 = move-exception;
        throw r2;
    L_0x0b53:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b55 }
    L_0x0b55:
        r2 = move-exception;
        throw r2;
    L_0x0b57:
        r4 = move-exception;
        r5 = r4.toString();	 Catch:{ NumberFormatException -> 0x0b69 }
        r6 = z;	 Catch:{ NumberFormatException -> 0x0b69 }
        r7 = 36;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0b69 }
        r5 = r5.contains(r6);	 Catch:{ NumberFormatException -> 0x0b69 }
        if (r5 != 0) goto L_0x09ec;
    L_0x0b68:
        throw r4;	 Catch:{ NumberFormatException -> 0x0b69 }
    L_0x0b69:
        r2 = move-exception;
        throw r2;
    L_0x0b6b:
        r2 = move-exception;
        throw r2;
    L_0x0b6d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b6f }
    L_0x0b6f:
        r2 = move-exception;
        throw r2;
    L_0x0b71:
        r2 = move-exception;
        throw r2;
    L_0x0b73:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0b75 }
    L_0x0b75:
        r2 = move-exception;
        throw r2;
    L_0x0b77:
        r2 = r3;
        goto L_0x076f;
    L_0x0b7a:
        r2 = r4;
        goto L_0x04ef;
    L_0x0b7d:
        r3 = r2;
        goto L_0x0427;
    L_0x0b80:
        r17 = r3;
        goto L_0x044c;
    L_0x0b84:
        r3 = r2;
        goto L_0x036d;
    L_0x0b87:
        r16 = r2;
        goto L_0x02f0;
    L_0x0b8b:
        r15 = r2;
        goto L_0x029b;
    L_0x0b8e:
        r2 = r3;
        r3 = r4;
        goto L_0x00bd;
    L_0x0b92:
        r2 = r3;
        r3 = r4;
        goto L_0x00d6;
    L_0x0b96:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x0101;
    L_0x0b9c:
        r11 = r3;
        r12 = r4;
        r13 = r5;
        r14 = r6;
        goto L_0x0107;
    L_0x0ba2:
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x006c;
    L_0x0ba8:
        r4 = r5;
        r5 = r6;
        goto L_0x0101;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.c.run():void");
    }

    public int hashCode() {
        int i = 1;
        try {
            try {
                try {
                    int hashCode = ((this.a ? 1 : 0) + (((this.g ? 1 : 0) + (((this.b ? 1 : 0) + (this.d.hashCode() * 31)) * 31)) * 31)) * 31;
                    try {
                        if (!this.f) {
                            i = 0;
                        }
                        return hashCode + i;
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
    }

    public c(ao aoVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.d = aoVar;
        this.b = z;
        this.g = z2;
        this.a = z3;
        this.f = z4;
    }

    static {
        String[] strArr = new String[39];
        String str = "\u0000\u0000G?a\u0000";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 48;
                        break;
                    case at.g /*1*/:
                        i4 = 48;
                        break;
                    case at.i /*2*/:
                        i4 = 119;
                        break;
                    case at.o /*3*/:
                        i4 = 15;
                        break;
                    default:
                        i4 = 81;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "^_\u0003f7YS\u0016{8_^W|$@@\u0005j\"CU\u00135q^_\u0003/8^\u0010\u0001j#YV\u001ej5\u0010B\u0012h8CD\u0005n%Y_\u0019/\"DQ\u0003j";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "]C\u0010";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "WB\u0018z!o[\u0012v\u000e]U\u0004|0WU\u0004";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0010X\u0016|9\r";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "^_\u0003f7YS\u0016{8_^(g0CX";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0010\\\u001ea4\n";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0010A\u0002f4D\r";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "^_\u0003f7YS\u0016{8_^\u0004/5YC\u0016m=UT";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0010]\u0012|\"QW\u00122";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0010R\u001eh!YS\u0003z#U";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u0010F\u001em#QD\u00122";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "S_\u001a!&XQ\u0003|0@@Yf?DU\u0019{\u007fQS\u0003f>^\u001e'C\u0010i";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "]U\u0004|0WU\u0019`%YV\u001el0DY\u0018a~^_\u0003f7I";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    str = "@X\u0018a4";
                    i = 14;
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    strArr2 = strArr3;
                    str = "]U\u0004|0WU\u0019`%YV\u001el0DY\u0018a~CQ\u001ajq";
                    i = 15;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "]U\u0004|0WU\u0019`%YV\u001el0DY\u0018a~]E\u0003j5\u0010";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "]U\u0004|0WU\u0019`%YV\u001el0DY\u0018a~\u0010^\u0012xl";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0010D\u0018a4\rS\u0018a'UB\u0004n%Y_\u0019";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "Q^\u0013}>YTY}4C_\u0002}2U\nX 2_]Yx9QD\u0004n!@\u001fE>b\u0001\u0001A:`\b\u0006";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0010S\u0018c>B\r\u0019z=\\";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "S_\u001a!&XQ\u0003|0@@(\u007f#UV\u0012}4^S\u0012|";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "WB\u0018z!o[\u0012v\u000e]U\u0004|0WU\u0004";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u0010C\u0014}4U^(c>S[J";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u0010D\u0018a4\r^\u0018{8VY\u0014n%Y_\u0019";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u0010C\u0018z?T\r";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "]U\u0004|0WU\u0019`%YV\u001el0DY\u0018a~SE\u0005b\"W\u001f\u0019z=\\\u0010";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u0010R\u001eh%UH\u00035";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u0010\\\u0016}6UY\u0014`?";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "]C\u0010";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u0010Y\u0019m>H\n";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "[U\u000e";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u0010S\u0018c>B\r";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u0010S\u0018z?D\r";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "^_\u0003f7YS\u0016{8_^(g0CX";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "Q^\u0013}>YTY\u007f4B]\u001e|\"Y_\u0019!\u0004`t6[\u0014oq'_\u000e\u007f`$P\u0002dq#\\";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "DY\u0003c4o[\u0012v";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "YC(a>DY\u0011f2QD\u001e`?\r\u0001";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[1];
                    str = "oY\u0013";
                    i = 38;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    e = strArr3;
                    c = new HashMap();
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0000\u0000G?a\u0000";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
