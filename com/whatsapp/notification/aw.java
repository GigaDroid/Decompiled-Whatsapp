package com.whatsapp.notification;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;
import com.whatsapp.Voip;
import com.whatsapp.aau;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class aw implements aau {
    private static aw a;
    private static final String[] z;
    private ConcurrentLinkedQueue b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void c() {
        /*
        r6 = this;
        r4 = 0;
        monitor-enter(r6);
        r0 = r6.b;	 Catch:{ all -> 0x0068 }
        if (r0 != 0) goto L_0x0064;
    L_0x0007:
        r0 = com.whatsapp.App.z();	 Catch:{ all -> 0x0068 }
        r1 = z;	 Catch:{ all -> 0x0068 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ all -> 0x0068 }
        r2 = 0;
        r0 = r0.getSharedPreferences(r1, r2);	 Catch:{ all -> 0x0068 }
        r1 = z;	 Catch:{ all -> 0x0068 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ all -> 0x0068 }
        r2 = 0;
        r0 = r0.getLong(r1, r2);	 Catch:{ all -> 0x0068 }
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0031;
    L_0x0024:
        r2 = com.whatsapp.App.aK;	 Catch:{ SecurityException -> 0x0066 }
        r3 = 0;
        r2 = r2.a(r0, r3);	 Catch:{ SecurityException -> 0x0066 }
        r6.b = r2;	 Catch:{ SecurityException -> 0x0066 }
        r2 = com.whatsapp.notification.PopupNotification.p;	 Catch:{ SecurityException -> 0x0066 }
        if (r2 == 0) goto L_0x0038;
    L_0x0031:
        r2 = new java.util.concurrent.ConcurrentLinkedQueue;	 Catch:{ SecurityException -> 0x0066 }
        r2.<init>();	 Catch:{ SecurityException -> 0x0066 }
        r6.b = r2;	 Catch:{ SecurityException -> 0x0066 }
    L_0x0038:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0068 }
        r2.<init>();	 Catch:{ all -> 0x0068 }
        r3 = z;	 Catch:{ all -> 0x0068 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ all -> 0x0068 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0068 }
        r3 = r6.b;	 Catch:{ all -> 0x0068 }
        r3 = r3.size();	 Catch:{ all -> 0x0068 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0068 }
        r3 = z;	 Catch:{ all -> 0x0068 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ all -> 0x0068 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0068 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0068 }
        r0 = r0.toString();	 Catch:{ all -> 0x0068 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0068 }
    L_0x0064:
        monitor-exit(r6);
        return;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.aw.c():void");
    }

    public void a(String str, long j) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r11, boolean r12) {
        /*
        r10 = this;
        r2 = com.whatsapp.notification.PopupNotification.p;
        r10.c();	 Catch:{ SecurityException -> 0x03ee }
        r0 = r10.b;	 Catch:{ SecurityException -> 0x03ee }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x03ee }
        if (r0 == 0) goto L_0x0035;
    L_0x000d:
        r0 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x03ee }
        r0.<init>();	 Catch:{ SecurityException -> 0x03ee }
        r1 = z;	 Catch:{ SecurityException -> 0x03ee }
        r3 = 9;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x03ee }
        r0 = r0.append(r1);	 Catch:{ SecurityException -> 0x03ee }
        r0 = r0.append(r12);	 Catch:{ SecurityException -> 0x03ee }
        r0 = r0.toString();	 Catch:{ SecurityException -> 0x03ee }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SecurityException -> 0x03ee }
        r0 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x03ee }
        r0 = android.support.v4.app.NotificationManagerCompat.from(r0);	 Catch:{ SecurityException -> 0x03ee }
        r1 = 7;
        r0.cancel(r1);	 Catch:{ SecurityException -> 0x03ee }
        if (r2 == 0) goto L_0x03ed;
    L_0x0035:
        r3 = new java.util.HashSet;
        r3.<init>();
        r4 = new java.util.ArrayList;
        r0 = r10.b;
        r0 = r0.size();
        r4.<init>(r0);
        r0 = r10.b;
        r1 = r0.iterator();
    L_0x004b:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x005c;
    L_0x0051:
        r0 = r1.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r4.add(r0);
        if (r2 == 0) goto L_0x004b;
    L_0x005c:
        r1 = r4.iterator();
    L_0x0060:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0075;
    L_0x0066:
        r0 = r1.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r0.k;
        r0 = r0.c;
        r3.add(r0);
        if (r2 == 0) goto L_0x0060;
    L_0x0075:
        r5 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = com.whatsapp.App.z();
        r5.<init>(r0);
        r0 = z;
        r1 = 19;
        r0 = r0[r1];
        r5.setCategory(r0);
        r0 = 1;
        r5.setPriority(r0);
        r0 = 2130839685; // 0x7f020885 float:1.7284388E38 double:1.052774685E-314;
        r5.setSmallIcon(r0);
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r0 = r0.getColor(r1);
        r5.setColor(r0);
        r0 = 1;
        r5.setAutoCancel(r0);
        r1 = r3.iterator();
    L_0x00ab:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00ce;
    L_0x00b1:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r6 = com.whatsapp.App.as;
        r0 = r6.b(r0);
        r6 = com.whatsapp.App.at;
        r0 = r0.a(r6);
        if (r0 == 0) goto L_0x00cc;
    L_0x00c5:
        r0 = r0.toString();	 Catch:{ SecurityException -> 0x03f0 }
        r5.addPerson(r0);	 Catch:{ SecurityException -> 0x03f0 }
    L_0x00cc:
        if (r2 == 0) goto L_0x00ab;
    L_0x00ce:
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.a3b.a(r0);
        r0 = r4.size();
        r0 = r0 + -1;
        r0 = r4.get(r0);
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r0.k;
        r0 = r0.c;
        r1 = r1.b(r0);
        r0 = com.whatsapp.App.z();
        r6 = z;
        r7 = 20;
        r6 = r6[r7];
        r7 = 0;
        r0.getSharedPreferences(r6, r7);
        if (r12 != 0) goto L_0x0143;
    L_0x00fa:
        r0 = 0;
        r6 = com.whatsapp.Voip.d();
        if (r6 == 0) goto L_0x03f2;
    L_0x0101:
        r0 = r1.c();
    L_0x0105:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x0141;
    L_0x010b:
        r0 = android.net.Uri.parse(r0);
        if (r0 == 0) goto L_0x0141;
    L_0x0111:
        r1 = com.whatsapp.Conversation.F();
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SecurityException -> 0x045c }
        r7 = 21;
        if (r6 < r7) goto L_0x013e;
    L_0x011b:
        r6 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ SecurityException -> 0x045c }
        r6 = r6.equals(r0);	 Catch:{ SecurityException -> 0x045c }
        if (r6 != 0) goto L_0x0129;
    L_0x0123:
        r6 = com.whatsapp.notification.c.a(r0);	 Catch:{ SecurityException -> 0x045e }
        if (r6 == 0) goto L_0x013e;
    L_0x0129:
        r6 = r1.a();	 Catch:{ SecurityException -> 0x0460 }
        if (r6 == 0) goto L_0x0139;
    L_0x012f:
        r1 = r1.b();	 Catch:{ SecurityException -> 0x0462 }
        r1 = r1.M();	 Catch:{ SecurityException -> 0x0462 }
        if (r1 != 0) goto L_0x0141;
    L_0x0139:
        r5.setSound(r0);	 Catch:{ SecurityException -> 0x0464 }
        if (r2 == 0) goto L_0x0141;
    L_0x013e:
        com.whatsapp.App.a(r0);	 Catch:{ SecurityException -> 0x0466 }
    L_0x0141:
        if (r2 == 0) goto L_0x0147;
    L_0x0143:
        r0 = 4;
        r5.setDefaults(r0);	 Catch:{ SecurityException -> 0x0468 }
    L_0x0147:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r6 = 12;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r1 = r4.size();
        r0 = r0.append(r1);
        r1 = z;
        r6 = 11;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r1 = r3.size();
        r0 = r0.append(r1);
        r1 = z;
        r6 = 16;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r3.size();
        r1 = 1;
        if (r0 != r1) goto L_0x02b7;
    L_0x018c:
        r0 = r3.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.as;
        r1 = r1.b(r0);
        r3 = r4.size();	 Catch:{ SecurityException -> 0x046a }
        r6 = 1;
        if (r3 != r6) goto L_0x01b3;
    L_0x01a3:
        r3 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x046a }
        r6 = 2131231462; // 0x7f0802e6 float:1.8079006E38 double:1.0529682487E-314;
        r3 = r3.getString(r6);	 Catch:{ SecurityException -> 0x046a }
        r5.setContentTitle(r3);	 Catch:{ SecurityException -> 0x046a }
        if (r2 == 0) goto L_0x01d5;
    L_0x01b3:
        r3 = com.whatsapp.App.az;	 Catch:{ SecurityException -> 0x046c }
        r6 = 2131296288; // 0x7f090020 float:1.8210488E38 double:1.053000277E-314;
        r7 = r4.size();	 Catch:{ SecurityException -> 0x046c }
        r3 = r3.a(r6, r7);	 Catch:{ SecurityException -> 0x046c }
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ SecurityException -> 0x046c }
        r7 = 0;
        r8 = r4.size();	 Catch:{ SecurityException -> 0x046c }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ SecurityException -> 0x046c }
        r6[r7] = r8;	 Catch:{ SecurityException -> 0x046c }
        r3 = java.lang.String.format(r3, r6);	 Catch:{ SecurityException -> 0x046c }
        r5.setContentTitle(r3);	 Catch:{ SecurityException -> 0x046c }
    L_0x01d5:
        r3 = com.whatsapp.App.z();
        r6 = 2131231464; // 0x7f0802e8 float:1.807901E38 double:1.0529682497E-314;
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r1.a(r11);
        r7[r8] = r9;
        r3 = r3.getString(r6, r7);
        r5.setTicker(r3);
        r3 = r1.a(r11);
        r5.setContentText(r3);
        r3 = com.whatsapp.App.z();
        r3 = com.whatsapp.vh.j(r3);
        r6 = new android.content.Intent;
        r7 = com.whatsapp.App.z();
        r8 = com.whatsapp.VoipActivity.class;
        r6.<init>(r7, r8);
        r7 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r6.setFlags(r7);
        r7 = z;
        r8 = 13;
        r7 = r7[r8];
        r6.putExtra(r7, r0);
        r0 = z;
        r7 = 15;
        r0 = r0[r7];
        r7 = 1;
        r6.putExtra(r0, r7);
        r0 = com.whatsapp.App.z();
        r7 = 0;
        r8 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r0, r7, r6, r8);
        r6 = com.whatsapp.Conversation.a(r1);
        r7 = z;
        r8 = 10;
        r7 = r7[r8];
        r8 = 1;
        r6.putExtra(r7, r8);
        r7 = com.whatsapp.App.z();
        r8 = 0;
        r9 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r6 = android.app.PendingIntent.getActivity(r7, r8, r6, r9);
        if (r3 == 0) goto L_0x0267;
    L_0x0245:
        r7 = 2130839427; // 0x7f020783 float:1.7283864E38 double:1.0527745577E-314;
        r8 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x046e }
        r9 = 2131231463; // 0x7f0802e7 float:1.8079008E38 double:1.052968249E-314;
        r8 = r8.getText(r9);	 Catch:{ SecurityException -> 0x046e }
        r5.addAction(r7, r8, r0);	 Catch:{ SecurityException -> 0x046e }
        r7 = 2130839440; // 0x7f020790 float:1.728389E38 double:1.052774564E-314;
        r8 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x046e }
        r9 = 2131231465; // 0x7f0802e9 float:1.8079012E38 double:1.05296825E-314;
        r8 = r8.getText(r9);	 Catch:{ SecurityException -> 0x046e }
        r5.addAction(r7, r8, r6);	 Catch:{ SecurityException -> 0x046e }
    L_0x0267:
        r7 = com.whatsapp.notification.AndroidWear.a();
        if (r7 == 0) goto L_0x02b5;
    L_0x026d:
        r7 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r8 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r1 = r1.a(r7, r8);
        if (r1 == 0) goto L_0x02b5;
    L_0x0277:
        r7 = new android.support.v4.app.NotificationCompat$WearableExtender;
        r7.<init>();
        r8 = 1;
        r8 = r7.setHintHideIcon(r8);	 Catch:{ SecurityException -> 0x0470 }
        r8.setBackground(r1);	 Catch:{ SecurityException -> 0x0470 }
        if (r3 == 0) goto L_0x02b2;
    L_0x0286:
        r1 = new android.support.v4.app.NotificationCompat$Action;	 Catch:{ SecurityException -> 0x0470 }
        r3 = 2130839495; // 0x7f0207c7 float:1.7284002E38 double:1.0527745913E-314;
        r8 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x0470 }
        r9 = 2131231463; // 0x7f0802e7 float:1.8079008E38 double:1.052968249E-314;
        r8 = r8.getText(r9);	 Catch:{ SecurityException -> 0x0470 }
        r1.<init>(r3, r8, r0);	 Catch:{ SecurityException -> 0x0470 }
        r7.addAction(r1);	 Catch:{ SecurityException -> 0x0470 }
        r0 = new android.support.v4.app.NotificationCompat$Action;	 Catch:{ SecurityException -> 0x0470 }
        r1 = 2130839497; // 0x7f0207c9 float:1.7284006E38 double:1.0527745923E-314;
        r3 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x0470 }
        r8 = 2131231465; // 0x7f0802e9 float:1.8079012E38 double:1.05296825E-314;
        r3 = r3.getText(r8);	 Catch:{ SecurityException -> 0x0470 }
        r0.<init>(r1, r3, r6);	 Catch:{ SecurityException -> 0x0470 }
        r7.addAction(r0);	 Catch:{ SecurityException -> 0x0470 }
    L_0x02b2:
        r5.extend(r7);
    L_0x02b5:
        if (r2 == 0) goto L_0x032e;
    L_0x02b7:
        r0 = com.whatsapp.App.az;
        r1 = 2131296288; // 0x7f090020 float:1.8210488E38 double:1.053000277E-314;
        r3 = r4.size();
        r0 = r0.a(r1, r3);
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r3 = 0;
        r6 = r4.size();
        r6 = java.lang.Integer.valueOf(r6);
        r1[r3] = r6;
        r0 = java.lang.String.format(r0, r1);
        r5.setContentTitle(r0);
        r3 = new java.util.HashSet;
        r3.<init>();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = com.whatsapp.aam.b();
        r0 = r4.size();
        r0 = r0 + -1;
        r1 = r0;
    L_0x02ee:
        if (r1 < 0) goto L_0x0327;
    L_0x02f0:
        r0 = r4.get(r1);
        r0 = (com.whatsapp.protocol.co) r0;
        r8 = r0.k;	 Catch:{ SecurityException -> 0x0472 }
        r8 = r8.c;	 Catch:{ SecurityException -> 0x0472 }
        r8 = r3.add(r8);	 Catch:{ SecurityException -> 0x0472 }
        if (r8 == 0) goto L_0x0323;
    L_0x0300:
        r8 = r6.length();	 Catch:{ SecurityException -> 0x0472 }
        if (r8 <= 0) goto L_0x030e;
    L_0x0306:
        r6.append(r7);	 Catch:{ SecurityException -> 0x0474 }
        r8 = 32;
        r6.append(r8);	 Catch:{ SecurityException -> 0x0474 }
    L_0x030e:
        r8 = com.whatsapp.App.as;
        r0 = r0.k;
        r0 = r0.c;
        r0 = r8.b(r0);
        r8 = com.whatsapp.App.z();
        r0 = r0.a(r8);
        r6.append(r0);
    L_0x0323:
        r0 = r1 + -1;
        if (r2 == 0) goto L_0x048a;
    L_0x0327:
        r0 = r6.toString();
        r5.setContentText(r0);
    L_0x032e:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x0399;
    L_0x0334:
        r0 = new android.support.v4.app.NotificationCompat$Builder;
        r1 = com.whatsapp.App.z();
        r0.<init>(r1);
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        r0.setCategory(r1);
        r1 = 1;
        r0.setPriority(r1);
        r1 = 2130839685; // 0x7f020885 float:1.7284388E38 double:1.052774685E-314;
        r0.setSmallIcon(r1);
        r1 = com.whatsapp.App.z();
        r2 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;
        r1 = r1.getString(r2);
        r0.setContentTitle(r1);
        r1 = com.whatsapp.App.az;
        r2 = 2131296288; // 0x7f090020 float:1.8210488E38 double:1.053000277E-314;
        r3 = r4.size();
        r1 = r1.a(r2, r3);
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
        r0.setContentText(r1);
        r1 = com.whatsapp.App.z();
        r1 = r1.getResources();
        r2 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r1 = r1.getColor(r2);
        r0.setColor(r1);
        r0 = r0.getNotification();
        r5.setPublicVersion(r0);
    L_0x0399:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.App.z();
        r2 = com.whatsapp.notification.MissedCallNotificationDismissedReceiver.class;
        r0.<init>(r1, r2);
        r1 = com.whatsapp.App.z();
        r2 = 7;
        r3 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r0 = android.app.PendingIntent.getBroadcast(r1, r2, r0, r3);
        r5.setDeleteIntent(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.App.z();
        r2 = com.whatsapp.Main.e();
        r0.<init>(r1, r2);
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r0.setAction(r1);
        r1 = com.whatsapp.App.z();
        r2 = 0;
        r3 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r1, r2, r0, r3);
        r5.setContentIntent(r0);
        r0 = r5.build();
        r1 = com.whatsapp.App.z();	 Catch:{ SecurityException -> 0x0476 }
        r1 = android.support.v4.app.NotificationManagerCompat.from(r1);	 Catch:{ SecurityException -> 0x0476 }
        r2 = 7;
        r1.notify(r2, r0);	 Catch:{ SecurityException -> 0x0476 }
    L_0x03e6:
        r0 = com.whatsapp.App.z();
        com.whatsapp.appwidget.WidgetProvider.a(r0);
    L_0x03ed:
        return;
    L_0x03ee:
        r0 = move-exception;
        throw r0;
    L_0x03f0:
        r0 = move-exception;
        throw r0;
    L_0x03f2:
        r6 = r1.d();
        r1 = -1;
        r7 = r6.hashCode();	 Catch:{ SecurityException -> 0x0450 }
        switch(r7) {
            case 48: goto L_0x0445;
            case 49: goto L_0x0421;
            case 50: goto L_0x042d;
            case 51: goto L_0x0439;
            default: goto L_0x03fe;
        };
    L_0x03fe:
        switch(r1) {
            case 0: goto L_0x0403;
            case 1: goto L_0x0409;
            case 2: goto L_0x0414;
            default: goto L_0x0401;
        };
    L_0x0401:
        goto L_0x0105;
    L_0x0403:
        r1 = 2;
        r5.setDefaults(r1);	 Catch:{ SecurityException -> 0x0458 }
        if (r2 == 0) goto L_0x0105;
    L_0x0409:
        r1 = 5;
        r1 = new long[r1];	 Catch:{ SecurityException -> 0x045a }
        r1 = {0, 300, 200, 300, 200};	 Catch:{ SecurityException -> 0x045a }
        r5.setVibrate(r1);	 Catch:{ SecurityException -> 0x045a }
        if (r2 == 0) goto L_0x0105;
    L_0x0414:
        r1 = 5;
        r1 = new long[r1];	 Catch:{ SecurityException -> 0x041f }
        r1 = {0, 750, 250, 750, 250};	 Catch:{ SecurityException -> 0x041f }
        r5.setVibrate(r1);	 Catch:{ SecurityException -> 0x041f }
        goto L_0x0105;
    L_0x041f:
        r0 = move-exception;
        throw r0;
    L_0x0421:
        r7 = "1";
        r7 = r6.equals(r7);	 Catch:{ SecurityException -> 0x0450 }
        if (r7 == 0) goto L_0x03fe;
    L_0x042a:
        r1 = 0;
        if (r2 == 0) goto L_0x03fe;
    L_0x042d:
        r7 = "2";
        r7 = r6.equals(r7);	 Catch:{ SecurityException -> 0x0452 }
        if (r7 == 0) goto L_0x03fe;
    L_0x0436:
        r1 = 1;
        if (r2 == 0) goto L_0x03fe;
    L_0x0439:
        r7 = "3";
        r7 = r6.equals(r7);	 Catch:{ SecurityException -> 0x0454 }
        if (r7 == 0) goto L_0x03fe;
    L_0x0442:
        r1 = 2;
        if (r2 == 0) goto L_0x03fe;
    L_0x0445:
        r7 = "0";
        r6 = r6.equals(r7);	 Catch:{ SecurityException -> 0x0456 }
        if (r6 == 0) goto L_0x03fe;
    L_0x044e:
        r1 = 3;
        goto L_0x03fe;
    L_0x0450:
        r0 = move-exception;
        throw r0;
    L_0x0452:
        r0 = move-exception;
        throw r0;
    L_0x0454:
        r0 = move-exception;
        throw r0;
    L_0x0456:
        r0 = move-exception;
        throw r0;
    L_0x0458:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x045a }
    L_0x045a:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x041f }
    L_0x045c:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x045e }
    L_0x045e:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0460 }
    L_0x0460:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0462 }
    L_0x0462:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0464 }
    L_0x0464:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0466 }
    L_0x0466:
        r0 = move-exception;
        throw r0;
    L_0x0468:
        r0 = move-exception;
        throw r0;
    L_0x046a:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x046c }
    L_0x046c:
        r0 = move-exception;
        throw r0;
    L_0x046e:
        r0 = move-exception;
        throw r0;
    L_0x0470:
        r0 = move-exception;
        throw r0;
    L_0x0472:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0474 }
    L_0x0474:
        r0 = move-exception;
        throw r0;
    L_0x0476:
        r0 = move-exception;
        r1 = r0.toString();	 Catch:{ SecurityException -> 0x0488 }
        r2 = z;	 Catch:{ SecurityException -> 0x0488 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x0488 }
        r1 = r1.contains(r2);	 Catch:{ SecurityException -> 0x0488 }
        if (r1 != 0) goto L_0x03e6;
    L_0x0487:
        throw r0;	 Catch:{ SecurityException -> 0x0488 }
    L_0x0488:
        r0 = move-exception;
        throw r0;
    L_0x048a:
        r1 = r0;
        goto L_0x02ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.aw.a(android.content.Context, boolean):void");
    }

    public aw() {
        App.b((aau) this);
    }

    public static aw a() {
        return a;
    }

    public void b(co coVar) {
    }

    public synchronized void b() {
        c();
        if (!this.b.isEmpty()) {
            Log.i(z[0] + this.b.size());
            App.z().getSharedPreferences(z[1], 0).edit().remove(z[2]).commit();
            this.b.clear();
            NotificationManagerCompat.from(App.z()).cancel(7);
            App.p.M().post(new h(this));
            WidgetProvider.a(App.z());
        }
    }

    static {
        String[] strArr = new String[21];
        String str = "\u0011=D\u0016E\u00187V\tL\u0012;C\fF\u00157V\u0011I\u0013:\u0018\u0006L\u00195EE";
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
                        i3 = 124;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001a=E\u0016T#9^\u0016S\u00190h\u0006A\u00108";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0011=D\u0016E\u00187V\tL\u0012;C\fF\u00157V\u0011I\u0013:\u0018\fN\u0015 \u0017\u0006O\t:C_";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001f;ZKW\u00145C\u0016A\f$h\u0015R\u00192R\u0017E\u00127R\u0016";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001a=E\u0016T#9^\u0016S\u00190h\u0006A\u00108";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\\ ^\bE\u000f V\bPF";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001a=E\u0016T#9^\u0016S\u00190h\u0006A\u00108";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001f;ZKW\u00145C\u0016A\f$h\u0015R\u00192R\u0017E\u00127R\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0011=D\u0016E\u00187V\tL\u0012;C\fF\u00157V\u0011I\u0013:\u0018\u0010P\u00185C\u0000\u0000\u001f5Y\u0006E\u0010t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001a&X\bc\u001d8[+O\b=Q\fC\u001d ^\nN";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\\7X\u000bT\u00197C\u0016\u001a";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0011=D\u0016E\u00187V\tL\u0012;C\fF\u00157V\u0011I\u0013:\u0018\u0010P\u00185C\u0000\u0000\u001f;B\u000bTF";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0016=S";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001d:S\u0017O\u00150\u0019\u0015E\u000e9^\u0016S\u0015;YKu,\u0010v1e#\u0015g5\u007f3\u0004d:s(\u0015c6";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001a&X\bc\u001d8[+O\b=Q\fC\u001d ^\nN";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\\%B\fE\bn";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001f5[\t";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001f;ZKW\u00145C\u0016A\f$\u0019\fN\b1Y\u0011\u000e\u001d7C\fO\u0012zt$l0\u0007";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001f5[\t";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001f;ZKW\u00145C\u0016A\f$h\u0015R\u00192R\u0017E\u00127R\u0016";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new aw();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001f;ZKW\u00145C\u0016A\f$h\u0015R\u00192R\u0017E\u00127R\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(co coVar) {
        a(App.z(), coVar, Voip.c(coVar));
    }

    public void c(co coVar) {
    }

    public void a(Context context, co coVar, boolean z) {
        c();
        if (this.b.isEmpty()) {
            App.z().getSharedPreferences(z[8], 0).edit().putLong(z[7], coVar.b).commit();
        }
        this.b.add(coVar);
        bq.a(new m(this, context, z), new Void[0]);
    }

    public ConcurrentLinkedQueue d() {
        c();
        return this.b;
    }
}
