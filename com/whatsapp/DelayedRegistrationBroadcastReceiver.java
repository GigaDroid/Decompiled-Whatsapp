package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.Calendar;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class DelayedRegistrationBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[28];
        String str = "J\u0019\"\u0018+L\u000e$\u00051W\u0012\u001a\u0002,Y\u000e1.,Q\u0011 ";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 124;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "[\u0013(_/P\u001d1\u00029H\f\u001a\u0001*]\u001a \u0003=V\u001f \u0002";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "[\u0013(_/P\u001d1\u00029H\f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Y\f5^9T\u001d7\u001cwJ\u0019\"\u00057W\u0010*\u001f?\u0017\u000f \u0005wY\u00107\u00149\\\u0005h\u0014 Q\u000f1\u0002wK\u0017,\u0001";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "H\u0014";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0018\u00120\u001ce";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "[\u001f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Y\f5^*]\u001b,\u0002,J\u001d1\u00187V\b$\u001a1V\u001b1\u001e7T\u0013+\u0016w[\u001fe";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Y\f5^*]\u001b1\u001e7T\u0013+\u0016wL\u0015(\u00147M\b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "J\u0019\"\u0018+L\u000e$\u00051W\u0012\u001a\u0002,Y\u000e1.,Q\u0011 ";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "N\u00197\u0018>Q\u001f$\u00051W\u0012eOe\u0018MwQ0J\u000feYo\\U";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "[\u0013(_/P\u001d1\u00029H\f\u001a\u0001*]\u001a \u0003=V\u001f \u0002";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0018\u000f,\u001ce";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "[\u0013(_/P\u001d1\u00029H\f\u001a\u0001*]\u001a \u0003=V\u001f \u0002";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "J\u0019\"\u0018+L\u000e$\u00051W\u0012\u001a\u0002,Y\u000e1.,Q\u0011 ";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Y\f5^+]\b7\u0014?Q\u000f1\u00039L\u0015*\u001f+L\u001d7\u0005,Q\u0011 ^=J\u000e*\u0003";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Y\u0012!\u00037Q\u0018k\u0001=J\u0011,\u0002+Q\u0013+_\n}=\u0001.\bp3\u000b4\u0007k(\u0004%\u001d";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0004\f \u00035Q\u000f6\u00187V\\!\u00146Q\u0019!O";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Y\u0010$\u00035";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "[\u0013(_/P\u001d1\u00029H\f\u001a\u0001*]\u001a \u0003=V\u001f \u0002";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "[\u0013(_/P\u001d1\u00029H\f";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "Y\f5^9T\u001d7\u001cwJ\u0019\"\u00057W\u0010*\u001f?\u0017\u001f$\u001f;]\u0010j\u0003=U\u00133\u0014uL\u0015(\u0014w]\u000e7\u001e*";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "[\u0013(_/P\u001d1\u00029H\fk\u00104Y\u000e(_\n};\f\"\fj=\u00118\u0017v#\u00110\u0013q2\u0002.\fw3\u001a=\u0017v;\u001a%\u0011u9\n$\f";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "J\u0019\"\u0018+L\u000e$\u00051W\u0012\u001a\u0002,Y\u000e1.,Q\u0011 ";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "[\u0013(_/P\u001d1\u00029H\fk\u00104Y\u000e(_\n};\f\"\fj=\u00118\u0017v#\u00110\u0013q2\u0002.\fw3\u001a=\u0017v;\u001a%\u0011u9\n$\f";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "[\u0013(_/P\u001d1\u00029H\f";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Y\u0010$\u00035";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "[\u0013(_/P\u001d1\u00029H\fk\u00104Y\u000e(_\n};\f\"\fj=\u00118\u0017v#\u00110\u0013q2\u0002.\fw3\u001a=\u0017v;\u001a%\u0011u9\n$\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    DelayedRegistrationBroadcastReceiver() {
    }

    private void a(Context context, long j) {
        Editor edit = context.getSharedPreferences(z[14], 0).edit();
        edit.putLong(z[15], j);
        if (!edit.commit()) {
            Log.w(z[16]);
        }
    }

    public void b(Context context) {
        boolean z = DialogToastActivity.f;
        long j = context.getSharedPreferences(z[2], 0).getLong(z[0], -1);
        if (j != -2) {
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(currentTimeMillis);
            instance.add(12, 720);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[1]).setPackage(z[3]), 536870912);
            if (broadcast != null && j == -1) {
                a(context, currentTimeMillis);
                b(context, instance.getTimeInMillis());
                if (!z) {
                    return;
                }
            }
            if (broadcast != null) {
                Log.i(z[4]);
                if (!z) {
                    return;
                }
            }
            a(context, currentTimeMillis);
            b(context, instance.getTimeInMillis());
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[9]);
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[12], 0);
        long j = sharedPreferences.getLong(z[10], -1);
        if (j > 0 && System.currentTimeMillis() - j > 43200000) {
            c(context);
            if (App.j == 1 && auq.a() <= 7 && App.t(App.z()) != 3) {
                String string = sharedPreferences.getString(z[7], "");
                Log.i(z[8] + string + z[6] + sharedPreferences.getString(z[5], "") + z[13] + App.W.getSimState() + " " + a(context));
                App.a(z[11], false, null);
            }
            a(context, -2);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        b(context, j + 43200000);
    }

    private void b(Context context, long j) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[25]).setPackage(z[26]), 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(z[27]);
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, broadcast);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        alarmManager.set(0, j, broadcast);
    }

    public void c(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[23]).setPackage(z[21]), 536870912);
        if (broadcast != null) {
            ((AlarmManager) context.getSystemService(z[19])).cancel(broadcast);
            Editor edit = context.getSharedPreferences(z[20], 0).edit();
            edit.remove(z[24]);
            if (!edit.commit()) {
                Log.w(z[22]);
            }
        }
    }

    private String a(@NonNull Context context) {
        return App.h(context, z[17]) == 0 ? App.W.getLine1Number() : z[18];
    }
}
