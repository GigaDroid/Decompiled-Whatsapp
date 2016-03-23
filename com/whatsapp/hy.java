package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class hy extends AsyncTask {
    final a5e a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList r15) {
        /*
        r14 = this;
        r13 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r12 = 1;
        r2 = 0;
        r3 = com.whatsapp.a5e.c;
        if (r15 == 0) goto L_0x010d;
    L_0x0008:
        r0 = r14.a;
        r1 = new com.amazon.device.home.GroupedListHeroWidget;
        r1.<init>();
        com.whatsapp.a5e.a(r0, r1);
        r0 = r14.a;
        r0 = com.whatsapp.a5e.a(r0);
        r1 = r15.size();
        r0.updateNumericBadge(r1);
        r4 = new java.util.ArrayList;
        r4.<init>();
        r1 = r2;
    L_0x0025:
        r0 = r15.size();
        if (r1 >= r0) goto L_0x00ce;
    L_0x002b:
        r0 = 49;
        if (r1 >= r0) goto L_0x00ce;
    L_0x002f:
        r5 = new com.amazon.device.home.GroupedListHeroWidget$ListEntry;
        r0 = r14.a;
        r0 = com.whatsapp.a5e.c(r0);
        r5.<init>(r0);
        r0 = com.amazon.device.home.GroupedListHeroWidget.VisualStyle.PEEKABLE;
        r5.setVisualStyle(r0);
        r0 = r15.get(r1);
        r0 = (com.whatsapp.protocol.co) r0;
        r6 = com.whatsapp.App.as;
        r7 = r0.k;
        r7 = r7.c;
        r6 = r6.b(r7);
        r7 = r14.a;
        r7 = com.whatsapp.a5e.c(r7);
        r7 = r6.a(r7);
        r8 = r14.a;
        r8 = com.whatsapp.a5e.c(r8);
        r8 = com.whatsapp.notification.d.a(r8, r0, r6, r2, r2);
        r8 = com.whatsapp.a28.b(r8);
        r9 = r14.a;
        r9 = com.whatsapp.a5e.c(r9);
        r10 = com.whatsapp.App.o(r0);
        r9 = com.whatsapp.util.cs.j(r9, r10);
        r10 = new com.amazon.device.home.HeroWidgetActivityStarterIntent;
        r11 = com.whatsapp.Conversation.class;
        r11 = r11.getCanonicalName();
        r0 = r0.k;
        r0 = r0.c;
        r10.<init>(r11, r0);
        r5.setContentIntent(r10);
        r0 = com.whatsapp.a28.b(r7);
        r5.setPrimaryText(r0);
        r0 = 29;
        r0 = com.whatsapp.a5e.b(r8, r0);
        r7 = 0;
        r7 = r0[r7];	 Catch:{ Exception -> 0x010e }
        r5.setSecondaryText(r7);	 Catch:{ Exception -> 0x010e }
        r7 = 1;
        r7 = r0[r7];	 Catch:{ Exception -> 0x010e }
        r7 = r7.length();	 Catch:{ Exception -> 0x010e }
        if (r7 <= r13) goto L_0x00b0;
    L_0x00a3:
        r7 = 1;
        r8 = 1;
        r8 = r0[r8];	 Catch:{ Exception -> 0x010e }
        r10 = 0;
        r11 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r8 = r8.substring(r10, r11);	 Catch:{ Exception -> 0x010e }
        r0[r7] = r8;	 Catch:{ Exception -> 0x010e }
    L_0x00b0:
        r0 = r0[r12];
        r5.setTertiaryText(r0);
        r5.setQuaternaryText(r9);
        r0 = r6.y();
        if (r0 == 0) goto L_0x00c7;
    L_0x00be:
        r0 = android.net.Uri.fromFile(r0);
        if (r0 == 0) goto L_0x00c7;
    L_0x00c4:
        r5.setPrimaryIcon(r0);	 Catch:{ Exception -> 0x0110 }
    L_0x00c7:
        r4.add(r5);	 Catch:{ Exception -> 0x0112 }
    L_0x00ca:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x0120;
    L_0x00ce:
        r0 = new com.amazon.device.home.GroupedListHeroWidget$Group;
        r0.<init>();
        r1 = r15.size();	 Catch:{ Exception -> 0x0117 }
        if (r1 == 0) goto L_0x00eb;
    L_0x00d9:
        r1 = r14.a;	 Catch:{ Exception -> 0x0117 }
        r1 = com.whatsapp.a5e.c(r1);	 Catch:{ Exception -> 0x0117 }
        r2 = 2131230804; // 0x7f080054 float:1.8077671E38 double:1.0529679236E-314;
        r1 = r1.getString(r2);	 Catch:{ Exception -> 0x0117 }
        r0.setGroupName(r1);	 Catch:{ Exception -> 0x0117 }
        if (r3 == 0) goto L_0x00f1;
    L_0x00eb:
        r1 = "";
        r0.setGroupName(r1);	 Catch:{ Exception -> 0x0119 }
    L_0x00f1:
        r0.setListEntries(r4);
        r1 = r14.a;	 Catch:{ Exception -> 0x011b }
        r1 = com.whatsapp.a5e.b(r1);	 Catch:{ Exception -> 0x011b }
        r2 = 0;
        r1.addGroup(r2, r0);	 Catch:{ Exception -> 0x011b }
    L_0x00fe:
        r0 = r14.a;
        r0 = com.whatsapp.a5e.a(r0);
        r1 = r14.a;
        r1 = com.whatsapp.a5e.b(r1);
        r0.updateWidget(r1);
    L_0x010d:
        return;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x00ca;
    L_0x0117:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        throw r0;
    L_0x011b:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x00fe;
    L_0x0120:
        r1 = r0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hy.a(java.util.ArrayList):void");
    }

    public void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    hy(a5e com_whatsapp_a5e) {
        this.a = com_whatsapp_a5e;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected ArrayList a(Void[] voidArr) {
        boolean z = a5e.c;
        ArrayList g = qa.g();
        List arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!isCancelled()) {
                l5 b = App.as.b(str);
                if (b.d > 0) {
                    Collection b2 = App.aK.b(str, Math.min(b.d, 100));
                    if (b2 != null) {
                        arrayList.addAll(b2);
                        continue;
                    } else {
                        continue;
                    }
                }
                if (z) {
                    WAAppCompatActivity.c++;
                    break;
                }
            }
            return null;
        }
        Collections.sort(arrayList, new al4(this));
        return arrayList;
    }
}
