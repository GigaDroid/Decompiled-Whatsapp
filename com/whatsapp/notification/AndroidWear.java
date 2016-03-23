package com.whatsapp.notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.Action.Builder;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.support.v4.app.RemoteInput;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.Wearable;
import com.whatsapp.App;
import com.whatsapp.auv;
import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.i;
import com.whatsapp.l5;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.vh;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public final class AndroidWear extends IntentService {
    private static GoogleApiClient a;
    private static final String[] z;

    private static Action d(Context context, l5 l5Var) {
        RemoteInput c = c(context, l5Var);
        return new Builder(2130839498, c.getLabel(), b(context, l5Var)).addRemoteInput(c).build();
    }

    private static Notification c() {
        return new WearableExtender().setHintShowBackgroundOnly(true).extend(new NotificationCompat.Builder(App.z())).build();
    }

    public static RemoteInput c(Context context, l5 l5Var) {
        CharSequence string = context.getString(2131231830, new Object[]{l5Var.a(context)});
        return new RemoteInput.Builder(z[0]).setLabel(string).setChoices(context.getResources().getStringArray(2131689472)).build();
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            if (vh.j(this)) {
                Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                if (resultsFromIntent != null) {
                    l5 a = App.as.a(intent.getData());
                    String charSequence = resultsFromIntent.getCharSequence(z[3]).toString();
                    App.p.M().post(new b(this, a, charSequence));
                    a(charSequence);
                    if (PopupNotification.p == 0) {
                        return;
                    }
                }
                if (z[4].equals(intent.getAction())) {
                    App.p.M().post(new w(this, App.as.a(intent.getData())));
                    return;
                }
                return;
            }
            Log.i(z[2]);
        }
    }

    static {
        String[] strArr = new String[8];
        String str = "D\u0013^s4L\u0019ev>D\u000few4L\u001e_^2K\rOu";
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
                        i3 = 37;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
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
                    str = "D\u0013^s4L\u0019Md:WRNn(P\r^`/@RTn/\u0005\u001cVm4R\u0018^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "D\u0013^s4L\u0019ev>D\u000few4L\u001e_^2K\rOu";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "h<hJ\u0004w8{E";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "d\u0013^s4L\u0019md:W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "D\u0013^s4L\u0019Md:WRJ`2W\u0018^b3@\u001eQ.=D\u0014Vd?";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "h<hJ\u0004w8{E";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "/w";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean b() {
        auv.b();
        try {
            if (!a() || !App.aJ()) {
                return false;
            }
            d();
            if (a == null || !a.isConnected()) {
                return false;
            }
            boolean z;
            if (((GetConnectedNodesResult) Wearable.NodeApi.getConnectedNodes(a).await()).getNodes().size() > 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.b(z[6], e3);
            return true;
        }
    }

    private static Notification a(Context context, l5 l5Var) {
        CharSequence charSequence = "";
        Cursor a = App.aK.a(l5Var.p, 20, null);
        if (a != null) {
            try {
                if (a.moveToLast()) {
                    String concat;
                    if (App.aK.O(l5Var.p)) {
                        concat = TextUtils.concat(new CharSequence[]{charSequence, "\u2026"});
                    }
                    do {
                        if (d.a(context, App.aK.a(a, l5Var.p), l5Var, false, true) != "") {
                            if (concat != "") {
                                concat = TextUtils.concat(new CharSequence[]{concat, z[1]});
                            }
                            concat = TextUtils.concat(new CharSequence[]{concat, r2});
                        }
                    } while (a.moveToPrevious());
                } else {
                    a.close();
                }
                a.close();
            } catch (Throwable th) {
                a.close();
            }
        }
        return new NotificationCompat.Builder(App.z()).setStyle(new BigTextStyle().bigText(charSequence)).extend(new WearableExtender().setStartScrollBottom(true)).build();
    }

    public static WearableExtender a(Context context, l5 l5Var, boolean z, co coVar, boolean z2, Bitmap bitmap, boolean z3) {
        WearableExtender wearableExtender = new WearableExtender();
        if (z && coVar != null && coVar.c == 1 && coVar.Q != null) {
            wearableExtender.addPage(c());
        }
        if (!App.a2() && z3) {
            wearableExtender.addPage(a(context, l5Var));
        }
        wearableExtender.addAction(d(context, l5Var));
        if (z2) {
            wearableExtender.setBackground(bitmap);
        }
        return wearableExtender;
    }

    private static void d() {
        if (a == null) {
            a = new GoogleApiClient.Builder(App.z()).addApi(Wearable.API).build();
            a.connect();
        }
    }

    private static void a(String str) {
        int i = PopupNotification.p;
        String[] stringArray = App.z().getResources().getStringArray(2131689472);
        if (str.equals(stringArray[0])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_SMILEEMOJI, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[1])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_YES, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[2])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_NO, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[3])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_ONMYWAY, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[4])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_OK, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[5])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_SEEYOUSOON, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[6])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_HAHA, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[7])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_LOL, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[8])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_NICE, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[9])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_SORRYCANTTALK, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[10])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_SADEMOJI, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        if (str.equals(stringArray[11])) {
            i.a(App.z(), a.ANDROID_WEAR_RESPONSE_THANKS, Integer.valueOf(1));
            if (i == 0) {
                return;
            }
        }
        i.a(App.z(), a.ANDROID_WEAR_RESPONSE_VOICE, Integer.valueOf(1));
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 18;
    }

    public AndroidWear() {
        super(z[5]);
    }

    public static PendingIntent e(Context context, l5 l5Var) {
        return PendingIntent.getService(context, 0, new Intent(z[7], l5Var.q(), context, AndroidWear.class), 0);
    }

    public static PendingIntent b(Context context, l5 l5Var) {
        return PendingIntent.getService(context, 0, new Intent(null, l5Var.q(), context, AndroidWear.class), 0);
    }
}
