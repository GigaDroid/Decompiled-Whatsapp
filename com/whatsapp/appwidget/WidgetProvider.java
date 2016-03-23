package com.whatsapp.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.RemoteViews;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.notification.an;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class WidgetProvider extends AppWidgetProvider {
    public static boolean a;
    private static Handler b;
    private static ArrayList c;
    private static Runnable d;
    private static final String[] z;
    private h e;

    static {
        String[] strArr = new String[11];
        String str = "\n\\;n>\u0001M\u001cS!\u001c";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = 79;
                        break;
                    case at.o /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0018W+H4\u0010]aS5\r\\!Nu\u0018Z;S4\u0017\u0017\u0019s\u001e.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018W+H4\u0010]a[+\tN&^<\u001cMa[8\rP Tu8i\u001fm\u0012=~\nn\u0004,i\u000b{\u000f<";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000eP+]>\rI=U-\u0010]*Ht\u001e\\;{+\tn&^<\u001cM\u0006^(Y_.S7\u001c]";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0018I?m2\u001d^*N\u0012\u001dJ";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0018I?m2\u001d^*N\u0016\u0010W\u0018S?\rQ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000eP+]>\rI=U-\u0010]*Ht\u0016W.J+\u000eP+]>\rV?N2\u0016W<Y3\u0018W(_?Y";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0018I?m2\u001d^*N\u0016\u0010W\u0007_2\u001eQ;";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000eP+]>\rI=U-\u0010]*Ht\fI+[/\u001c\u0019";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\fI+[/\u001cf8S?\u001e\\;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0018I?m2\u001d^*N\u0012\u001d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        boolean z = a;
        try {
            Log.i(z[9] + iArr.length);
            if (this.e != null) {
                this.e.a();
                a().removeCallbacks(this.e);
            }
            this.e = new h(context, appWidgetManager, iArr);
            a().post(this.e);
            super.onUpdate(context, appWidgetManager, iArr);
            if (z) {
                WAAppCompatActivity.c++;
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static boolean b(int i, int i2) {
        return a(i, i2);
    }

    private static boolean a(int i, int i2) {
        return i > 100 && i2 > 100;
    }

    private static Handler a() {
        if (b == null) {
            HandlerThread handlerThread = new HandlerThread(z[10], 10);
            handlerThread.start();
            b = new Handler(handlerThread.getLooper());
        }
        return b;
    }

    static ArrayList a(ArrayList arrayList) {
        c = arrayList;
        return arrayList;
    }

    public static void a(Context context) {
        if (context.getResources().getBoolean(2131361796)) {
            int[] appWidgetIds;
            try {
                appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, WidgetProvider.class));
            } catch (RuntimeException e) {
                Log.e(z[4] + e.toString());
                appWidgetIds = null;
            }
            if (appWidgetIds != null) {
                try {
                    if (appWidgetIds.length > 0) {
                        Intent intent = new Intent(context, WidgetProvider.class);
                        intent.setAction(z[3]);
                        intent.putExtra(z[5], appWidgetIds);
                        context.sendBroadcast(intent);
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        }
        an a = an.a(context);
        try {
            if (an.a(a)) {
                if (d == null) {
                    d = new c(a, null);
                }
                a().removeCallbacks(d);
                a().post(d);
            }
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public static ArrayList b() {
        return c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.widget.RemoteViews b(android.content.Context r10, int r11, int r12, int r13) {
        /*
        r9 = 2131755992; // 0x7f1003d8 float:1.9142879E38 double:1.053227401E-314;
        r8 = 2131755991; // 0x7f1003d7 float:1.9142877E38 double:1.0532274005E-314;
        r7 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r6 = 1;
        r5 = 0;
        r2 = a;
        r0 = a(r12, r13);
        if (r0 == 0) goto L_0x00af;
    L_0x0012:
        r1 = new android.widget.RemoteViews;
        r0 = r10.getPackageName();
        r3 = 2130903301; // 0x7f030105 float:1.7413416E38 double:1.0528061156E-314;
        r1.<init>(r0, r3);
        r0 = "";
        r3 = c;	 Catch:{ RuntimeException -> 0x0102 }
        if (r3 == 0) goto L_0x005f;
    L_0x0025:
        r0 = c;	 Catch:{ RuntimeException -> 0x0102 }
        r0 = r0.size();	 Catch:{ RuntimeException -> 0x0102 }
        if (r0 <= 0) goto L_0x0053;
    L_0x002d:
        r0 = com.whatsapp.App.az;
        r3 = 2131296319; // 0x7f09003f float:1.8210551E38 double:1.0530002923E-314;
        r4 = c;
        r4 = r4.size();
        r0 = r0.a(r3, r4);
        r3 = new java.lang.Object[r6];
        r4 = c;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r5] = r4;
        r0 = java.lang.String.format(r0, r3);
        r1.setViewVisibility(r8, r5);
        if (r2 == 0) goto L_0x005f;
    L_0x0053:
        r0 = 2131231568; // 0x7f080350 float:1.807922E38 double:1.052968301E-314;
        r0 = r10.getString(r0);
        r3 = 8;
        r1.setViewVisibility(r8, r3);
    L_0x005f:
        r1.setTextViewText(r8, r0);
        r0 = new android.content.Intent;
        r3 = com.whatsapp.appwidget.WidgetService.class;
        r0.<init>(r10, r3);
        r3 = z;
        r3 = r3[r6];
        r0.putExtra(r3, r11);
        r3 = r0.toUri(r6);
        r3 = android.net.Uri.parse(r3);
        r0.setData(r3);
        r1.setRemoteAdapter(r11, r9, r0);
        r0 = new android.content.Intent;
        r3 = com.whatsapp.Conversation.class;
        r0.<init>(r10, r3);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r0.setAction(r3);
        r0 = android.app.PendingIntent.getActivity(r10, r5, r0, r7);
        r1.setPendingIntentTemplate(r9, r0);
        r0 = new android.content.Intent;
        r3 = com.whatsapp.Main.e();
        r0.<init>(r10, r3);
        r0 = android.app.PendingIntent.getActivity(r10, r5, r0, r7);
        r3 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r1.setOnClickPendingIntent(r3, r0);
        r0 = 2131755906; // 0x7f100382 float:1.9142704E38 double:1.0532273585E-314;
        r1.setEmptyView(r9, r0);
        if (r2 == 0) goto L_0x0104;
    L_0x00af:
        r1 = new android.widget.RemoteViews;
        r0 = r10.getPackageName();
        r3 = 2130903303; // 0x7f030107 float:1.741342E38 double:1.0528061166E-314;
        r1.<init>(r0, r3);
        r0 = c;
        if (r0 == 0) goto L_0x00ed;
    L_0x00bf:
        r0 = c;
        r3 = r0.size();
        r0 = 2131755385; // 0x7f100179 float:1.9141648E38 double:1.053227101E-314;
        r4 = java.lang.Integer.toString(r3);
        r1.setTextViewText(r0, r4);
        r0 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r4 = 100;
        if (r12 >= r4) goto L_0x00e3;
    L_0x00d5:
        r4 = 99;
        if (r3 <= r4) goto L_0x00dd;
    L_0x00d9:
        r0 = 1096810496; // 0x41600000 float:14.0 double:5.41896386E-315;
        if (r2 == 0) goto L_0x00e3;
    L_0x00dd:
        r2 = 9;
        if (r3 <= r2) goto L_0x00e3;
    L_0x00e1:
        r0 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
    L_0x00e3:
        r2 = 2131755385; // 0x7f100179 float:1.9141648E38 double:1.053227101E-314;
        r3 = z;
        r3 = r3[r5];
        r1.setFloat(r2, r3, r0);
    L_0x00ed:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.Main.e();
        r0.<init>(r10, r2);
        r0 = android.app.PendingIntent.getActivity(r10, r5, r0, r7);
        r2 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r1.setOnClickPendingIntent(r2, r0);
        r0 = r1;
    L_0x0101:
        return r0;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = r1;
        goto L_0x0101;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.b(android.content.Context, int, int, int):android.widget.RemoteViews");
    }

    static RemoteViews a(Context context, int i, int i2, int i3) {
        return b(context, i, i2, i3);
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        int i2 = Integer.MAX_VALUE;
        if (VERSION.SDK_INT >= 16) {
            int i3;
            if (bundle != null) {
                int i4 = bundle.getInt(z[6]);
                i3 = bundle.getInt(z[8]);
                try {
                    Log.i(z[7] + i4 + "x" + i3);
                    if (i4 == 0 || i3 == 0) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i2 = i4;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            i3 = Integer.MAX_VALUE;
            appWidgetManager.updateAppWidget(i, b(context, i, i2, i3));
        }
    }
}
