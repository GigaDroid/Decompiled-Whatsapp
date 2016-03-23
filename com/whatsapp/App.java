package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.location.Location;
import android.media.AsyncPlayer;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.LruCache;
import android.support.v7.app.NotificationCompat.Builder;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.amazon.device.messaging.ADM;
import com.facebook.buck.android.support.exopackage.c;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.fieldstats.i;
import com.whatsapp.fieldstats.k;
import com.whatsapp.gdrive.SettingsGoogleDrive;
import com.whatsapp.jobqueue.a;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.a1;
import com.whatsapp.messaging.co;
import com.whatsapp.messaging.cz;
import com.whatsapp.protocol.ay;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.bb;
import com.whatsapp.protocol.bf;
import com.whatsapp.protocol.bz;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ct;
import com.whatsapp.protocol.cu;
import com.whatsapp.protocol.cx;
import com.whatsapp.util.Log;
import com.whatsapp.util.a6;
import com.whatsapp.util.ab;
import com.whatsapp.util.ag;
import com.whatsapp.util.ak;
import com.whatsapp.util.ao;
import com.whatsapp.util.b5;
import com.whatsapp.util.b7;
import com.whatsapp.util.bk;
import com.whatsapp.util.bq;
import com.whatsapp.util.c9;
import com.whatsapp.util.p;
import com.whatsapp.util.q;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.aw;
import org.whispersystems.jobqueue.h;
import org.whispersystems.jobqueue.o;

public final class App extends c implements com.whatsapp.messaging.c, o {
    private static final ArrayList A;
    public static boolean B;
    private static final Object C;
    static boolean D;
    public static boolean E;
    private static final Handler F;
    private static boolean G;
    static final Handler I;
    public static bk J;
    public static byte[] K;
    static final Handler L;
    private static MessageService M;
    private static File N;
    public static final c9 O;
    private static final boolean P;
    public static final c9 Q;
    static boolean S;
    public static long T;
    private static boolean U;
    public static long V;
    public static TelephonyManager W;
    private static final ab X;
    static Date Y;
    public static boolean Z;
    private static by a0;
    public static fs a1;
    public static final c9 a2;
    public static final File a3;
    public static long a4;
    public static File a5;
    private static final ArrayList a6;
    private static final HashMap a7;
    public static final rp aA;
    public static Handler aB;
    private static boolean aC;
    public static boolean aD;
    private static ReentrantLock aE;
    private static AsyncTask aF;
    public static int aG;
    public static boolean aI;
    static boolean aJ;
    public static ael aK;
    public static long aL;
    private static AtomicInteger aM;
    private static long aP;
    public static final Object aQ;
    private static a5e aR;
    static final Handler aT;
    public static long aU;
    public static boolean aX;
    private static final ArrayList aY;
    private static final Handler aZ;
    public static com.whatsapp.contact.o aa;
    public static final qm ab;
    public static boolean ac;
    public static ConnectivityManager ad;
    private static final ArrayList ae;
    private static final Handler af;
    private static AtomicInteger ag;
    private static boolean ah;
    private static Condition aj;
    public static b5 al;
    @js
    public static final int am;
    static boolean an;
    public static boolean ao;
    private static final Uri ap;
    static boolean aq;
    private static final Object ar;
    public static kl as;
    public static ContentResolver at;
    static boolean av;
    private static final ArrayList aw;
    private static boolean ax;
    public static Me ay;
    public static b1 az;
    private static final LinkedHashMap b;
    private static final String[] bb;
    private static boolean c;
    public static bk e;
    private static long f;
    public static final AsyncPlayer g;
    static int h;
    public static Handler i;
    @a1
    public static final int j;
    private static final HashMap k;
    private static boolean l;
    private static final ServiceConnection m;
    private static long n;
    public static LruCache o;
    public static App p;
    private static Handler q;
    static boolean r;
    private static boolean s;
    public static boolean t;
    public static boolean u;
    public static String v;
    public static ActivityManager w;
    private static boolean x;
    static int y;
    static boolean z;
    private final cz H;
    private WakeLock R;
    private final adn aH;
    private final AvailabilityTimeoutAlarmBroadcastReceiver aN;
    private final kd aO;
    public final DelayedRegistrationBroadcastReceiver aS;
    final Set aV;
    final Set aW;
    public h ai;
    public boolean ak;
    private final Application au;
    private final i1 d;

    class 43 extends BroadcastReceiver {
        private static final String[] z;
        final App a;

        static {
            String[] strArr = new String[2];
            String str = "w4|\u0019{w'gQky1bR4r%xW6s*mTus ,";
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
                            i3 = 22;
                            break;
                        case at.g /*1*/:
                            i3 = 68;
                            break;
                        case at.i /*2*/:
                            i3 = 12;
                            break;
                        case at.o /*3*/:
                            i3 = 54;
                            break;
                        default:
                            i3 = 25;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "u+a\u0018~y+kZ|84~Yzs7\u007f\u0018~w4|E";
                        obj = null;
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            boolean backgroundDataSetting = App.ad.getBackgroundDataSetting();
            Log.i(z[0] + backgroundDataSetting);
            if (!backgroundDataSetting) {
                App.d(context, true);
                App.a(context);
            }
            App.H(z[1]);
        }

        43(App app) {
            this.a = app;
        }
    }

    class 44 extends BroadcastReceiver {
        private static final String[] z;
        final App a;

        static {
            String[] strArr = new String[3];
            String str = "\u000b2B\u0013E8-\\\u001fA\t";
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
                            i3 = arj.Theme_switchStyle;
                            break;
                        case at.g /*1*/:
                            i3 = 93;
                            break;
                        case at.i /*2*/:
                            i3 = 48;
                            break;
                        case at.o /*3*/:
                            i3 = 112;
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
                        i = 2;
                        strArr2 = strArr3;
                        str = "\u0019<W\u0003";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u000e/Y\u0004I\u000e<\\5V\b3D";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        44(App app) {
            this.a = app;
        }

        public void onReceive(Context context, Intent intent) {
            Serializable serializableExtra = intent.getSerializableExtra(z[2]);
            App.a(intent.getStringExtra(z[1]), intent.getBooleanExtra(z[0], false), serializableExtra instanceof EnumSet ? (EnumSet) serializableExtra : null);
        }
    }

    class 45 extends BroadcastReceiver {
        private static final String[] z;
        final App a;

        static {
            String[] strArr = new String[2];
            String str = " ;1\u0002#(%&Y:,..X'n.9]:3.%\u0002 *\"1";
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
                            i3 = 65;
                            break;
                        case at.g /*1*/:
                            i3 = 75;
                            break;
                        case at.i /*2*/:
                            i3 = 65;
                            break;
                        case at.o /*3*/:
                            i3 = 45;
                            break;
                        default:
                            i3 = 83;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = " ;1\u0002#(%&Y:,..X'n.9]:3.%";
                        obj = null;
                }
            }
        }

        45(App app) {
            this.a = app;
        }

        public void onReceive(Context context, Intent intent) {
            Log.i(z[1]);
            if (App.aF() == null) {
                Log.i(z[0]);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            App.aF().A();
        }
    }

    class 46 extends BroadcastReceiver {
        private static final String[] z;
        final App a;

        static {
            String[] strArr = new String[2];
            String str = ":xr\tl>okUj)ivOq5zgRl\"'tCl2nkCz";
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
                            i3 = 91;
                            break;
                        case at.g /*1*/:
                            i3 = 8;
                            break;
                        case at.i /*2*/:
                            i3 = 2;
                            break;
                        case at.o /*3*/:
                            i3 = 38;
                            break;
                        default:
                            i3 = 30;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = ":xr\tl>okUj)ivOq5zgRl\"'vOs>gwR";
                        obj = null;
                }
            }
        }

        46(App app) {
            this.a = app;
        }

        public void onReceive(Context context, Intent intent) {
            Log.i(z[1]);
            if (App.t(App.z()) != 3) {
                long currentTimeMillis = System.currentTimeMillis();
                CharSequence string = context.getString(2131232194);
                CharSequence string2 = context.getString(2131232196);
                CharSequence string3 = context.getString(2131232195);
                Builder builder = new Builder(context);
                builder.setSmallIcon(2130839686);
                builder.setTicker(string);
                builder.setWhen(currentTimeMillis);
                builder.setDefaults(3);
                builder.setAutoCancel(true);
                builder.setContentTitle(string2);
                builder.setContentText(string3);
                builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, Main.class), 268435456));
                NotificationManagerCompat.from(App.z()).notify(1, builder.build());
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Log.i(z[0]);
        }
    }

    class 47 extends BroadcastReceiver {
        final App a;

        47(App app) {
            this.a = app;
        }

        public void onReceive(Context context, Intent intent) {
            App.Y = null;
            if (!this.a.F()) {
                NotificationManagerCompat.from(App.z()).cancel(11);
            }
        }
    }

    public class Me implements Serializable {
        private static final long serialVersionUID = -1952119322404952662L;
        public final String cc;
        public String jabber_id;
        public final String number;

        public Me(String str, String str2) {
            this.cc = str;
            this.number = str2;
            this.jabber_id = null;
        }
    }

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] m448z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }

    public static void a7() {
        boolean z = DialogToastActivity.f;
        Iterator it = aw.iterator();
        while (it.hasNext()) {
            ((a_) it.next()).b();
            if (z) {
                return;
            }
        }
    }

    public static void b(Collection collection) {
        boolean z = DialogToastActivity.f;
        String[] strArr = new String[collection.size()];
        int i = 0;
        for (l5 l5Var : collection) {
            int i2 = i + 1;
            strArr[i] = l5Var.p;
            if (z) {
                break;
            }
            i = i2;
        }
        a(strArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7, long r8, java.lang.String r10) {
        /*
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0090 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0090 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0090 }
        r2 = 615; // 0x267 float:8.62E-43 double:3.04E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r6);	 Catch:{ NumberFormatException -> 0x0090 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0090 }
        r2 = 614; // 0x266 float:8.6E-43 double:3.034E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0090 }
        r1 = com.whatsapp.wn.q;	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0090 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0090 }
        r2 = 616; // 0x268 float:8.63E-43 double:3.043E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r5);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0090 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = com.whatsapp.wn.q();	 Catch:{ NumberFormatException -> 0x0090 }
        if (r0 == 0) goto L_0x005b;
    L_0x003e:
        r0 = com.whatsapp.wn.q;	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = r0.equals(r6);	 Catch:{ NumberFormatException -> 0x0092 }
        if (r0 == 0) goto L_0x005b;
    L_0x0046:
        r0 = L;	 Catch:{ NumberFormatException -> 0x0092 }
        r1 = 5;
        r0.removeMessages(r1);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = L;	 Catch:{ NumberFormatException -> 0x0092 }
        r1 = 3;
        r0.removeMessages(r1);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = L;	 Catch:{ NumberFormatException -> 0x0092 }
        r1 = 4;
        r0.removeMessages(r1);	 Catch:{ NumberFormatException -> 0x0092 }
        com.whatsapp.wn.b(r5);	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x005b:
        if (r6 == 0) goto L_0x0070;
    L_0x005d:
        r0 = com.whatsapp.wn.q;	 Catch:{ NumberFormatException -> 0x0094 }
        r0 = r6.equals(r0);	 Catch:{ NumberFormatException -> 0x0094 }
        if (r0 != 0) goto L_0x0070;
    L_0x0065:
        if (r7 == 0) goto L_0x0070;
    L_0x0067:
        if (r5 == 0) goto L_0x0070;
    L_0x0069:
        com.whatsapp.wn.n(r7);	 Catch:{ NumberFormatException -> 0x009a }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x009a }
        if (r0 == 0) goto L_0x007b;
    L_0x0070:
        if (r6 != 0) goto L_0x007b;
    L_0x0072:
        if (r10 == 0) goto L_0x007b;
    L_0x0074:
        if (r7 == 0) goto L_0x007b;
    L_0x0076:
        if (r5 == 0) goto L_0x007b;
    L_0x0078:
        com.whatsapp.wn.d(r7, r10);	 Catch:{ NumberFormatException -> 0x00a2 }
    L_0x007b:
        if (r7 == 0) goto L_0x0086;
    L_0x007d:
        r0 = 0;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0086;
    L_0x0083:
        com.whatsapp.wn.a(r8, r7);	 Catch:{ NumberFormatException -> 0x00a4 }
    L_0x0086:
        r0 = bb;
        r1 = 617; // 0x269 float:8.65E-43 double:3.05E-321;
        r0 = r0[r1];
        c(r4, r3, r0);
        return;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, java.lang.String):void");
    }

    public static void a(String str, String str2, boolean z) {
        p.ai.a(new SendWebForwardJob(str, co.a(str, str2, z)));
    }

    public static void s(com.whatsapp.protocol.co coVar) {
        try {
            if (c) {
                String str;
                if (bb[0].equals(coVar.J)) {
                    str = bb[1];
                } else {
                    str = null;
                }
                coVar.J = str;
                M.b(co.a(coVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private static void Y() {
        try {
            if (c) {
                if (!(l || wn.a())) {
                    PowerManager powerManager = (PowerManager) z().getSystemService(bb[462]);
                    if (powerManager != null) {
                        WakeLock newWakeLock = powerManager.newWakeLock(1, bb[461]);
                        if (newWakeLock != null) {
                            try {
                                newWakeLock.acquire(3000);
                                Log.i(bb[463]);
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    }
                    M.j();
                }
            }
            qa.b();
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.co b(java.lang.String r7, byte[] r8, com.whatsapp.MediaData r9, byte r10, int r11, java.lang.String r12, android.net.Uri r13) {
        /*
        r4 = 0;
        r6 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new com.whatsapp.protocol.co;
        r1.<init>(r7, r8, r9);
        r2 = av();	 Catch:{ NumberFormatException -> 0x007a }
        r1.b = r2;	 Catch:{ NumberFormatException -> 0x007a }
        r2 = 1;
        r1.u = r2;	 Catch:{ NumberFormatException -> 0x007a }
        r1.c = r10;	 Catch:{ NumberFormatException -> 0x007a }
        r1.r = r11;	 Catch:{ NumberFormatException -> 0x007a }
        if (r12 == 0) goto L_0x002a;
    L_0x0019:
        r2 = r12.trim();	 Catch:{ NumberFormatException -> 0x007c }
        r1.a = r2;	 Catch:{ NumberFormatException -> 0x007c }
        r2 = r1.a;	 Catch:{ NumberFormatException -> 0x007c }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NumberFormatException -> 0x007c }
        if (r2 == 0) goto L_0x002a;
    L_0x0027:
        r2 = 0;
        r1.a = r2;	 Catch:{ NumberFormatException -> 0x007c }
    L_0x002a:
        r2 = r9.file;	 Catch:{ NumberFormatException -> 0x007e }
        if (r2 != 0) goto L_0x003a;
    L_0x002e:
        r2 = r13.toString();	 Catch:{ NumberFormatException -> 0x0080 }
        r1.A = r2;	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = 0;
        r1.z = r2;	 Catch:{ NumberFormatException -> 0x0080 }
        if (r0 == 0) goto L_0x004a;
    L_0x003a:
        r2 = r9.file;	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = r2.getName();	 Catch:{ NumberFormatException -> 0x0080 }
        r1.A = r2;	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = r9.file;	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = r2.length();	 Catch:{ NumberFormatException -> 0x0080 }
        r1.z = r2;	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x004a:
        r2 = 2;
        if (r10 == r2) goto L_0x0050;
    L_0x004d:
        r2 = 3;
        if (r10 != r2) goto L_0x0071;
    L_0x0050:
        r2 = r9.trimFrom;	 Catch:{ NumberFormatException -> 0x0082 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x005c;
    L_0x0056:
        r2 = r9.trimTo;	 Catch:{ NumberFormatException -> 0x0084 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0069;
    L_0x005c:
        r2 = r9.trimTo;	 Catch:{ NumberFormatException -> 0x0086 }
        r4 = r9.trimFrom;	 Catch:{ NumberFormatException -> 0x0086 }
        r2 = r2 - r4;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r4;
        r2 = (int) r2;	 Catch:{ NumberFormatException -> 0x0086 }
        r1.H = r2;	 Catch:{ NumberFormatException -> 0x0086 }
        if (r0 == 0) goto L_0x0071;
    L_0x0069:
        r0 = r9.file;	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = com.whatsapp.util.ag.c(r0);	 Catch:{ NumberFormatException -> 0x0086 }
        r1.H = r0;	 Catch:{ NumberFormatException -> 0x0086 }
    L_0x0071:
        r1.d = r6;
        r2 = r1.z;
        r9.fileSize = r2;
        r9.autodownloadRetryEnabled = r6;
        return r1;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(java.lang.String, byte[], com.whatsapp.MediaData, byte, int, java.lang.String, android.net.Uri):com.whatsapp.protocol.co");
    }

    private static void aE() {
        try {
            if (an() != null) {
                if (an().d()) {
                    return;
                }
            }
            Log.w(bb[261] + new Date().toString() + " " + System.currentTimeMillis());
            p.a(z(), z().getString(2131230921), 11);
            ac = true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void b() {
        Log.i(bb[145]);
        super.b();
    }

    public static void g(boolean z) {
        Log.i(bb[392] + z);
        Editor edit = z().getSharedPreferences(bb[393], 0).edit();
        synchronized (ar) {
            edit.putBoolean(bb[395], z);
            if (!edit.commit()) {
                Log.e(bb[394]);
            }
        }
    }

    public static void b(int i) {
        if (c) {
            Log.i(bb[460] + i);
            M.b(co.a(null, i, new as4(i), new wt(i)));
        }
    }

    public static void t(String str) {
        v = str;
        S = true;
        y(ad() + bb[36]);
    }

    public static void a(String str, byte[] bArr) {
        try {
            if (M != null) {
                M.a(str, bArr);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b(l5 l5Var) {
        List arrayList = new ArrayList(1);
        arrayList.add(l5Var);
        d(arrayList);
    }

    public static void a(String str, String str2, bb bbVar) {
        a(new a3i(str, str2, null, 17, bbVar));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(java.lang.String r8) {
        /*
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r8 != 0) goto L_0x0045;
    L_0x0004:
        r3 = 1;
    L_0x0005:
        r4 = new android.os.ConditionVariable;
        r4.<init>();
        r5 = new android.os.ConditionVariable;
        r5.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r0 = com.whatsapp.qa.g();
        r6 = r0.iterator();
    L_0x001c:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0033;
    L_0x0022:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r7 = aK;
        r7 = r7.m(r0);
        r1.put(r0, r7);
        if (r2 == 0) goto L_0x001c;
    L_0x0033:
        r0 = new com.whatsapp.oe;	 Catch:{ Exception -> 0x0047 }
        r0.<init>(r1, r3, r4, r5);	 Catch:{ Exception -> 0x0047 }
        com.whatsapp.util.bq.a(r0);	 Catch:{ Exception -> 0x0047 }
    L_0x003b:
        r0 = new com.whatsapp.w3;	 Catch:{ Exception -> 0x0078 }
        r2 = r8;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x0078 }
        com.whatsapp.util.bq.a(r0);	 Catch:{ Exception -> 0x0078 }
    L_0x0044:
        return;
    L_0x0045:
        r3 = 0;
        goto L_0x0005;
    L_0x0047:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = bb;
        r7 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r2 = r2.append(r3);
        r6 = bb;
        r7 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r5.open();
        goto L_0x003b;
    L_0x0078:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r5 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = bb;
        r3 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4.open();
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.d(java.lang.String):void");
    }

    public static String d(Context context) {
        return context.getSharedPreferences(bb[9], 0).getString(bb[10], null);
    }

    public static void a(Context context, String str, int i) {
        try {
            if (a0 != null) {
                a0.f(str);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            b(context, str, i);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void aP() {
        try {
            if (c) {
                M.b(co.d());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void aR() {
        a(z(), 2131232229, 0);
    }

    public static void a(String str, String str2, String str3, String str4, int i, byte[] bArr) {
        b(co.a(str, str2, str3, str4, i, bArr), str);
    }

    public static void b(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[212]);
                M.b(co.c(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static MessageService aF() {
        return M;
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e(bb[476] + e.toString());
            a(context, 2131230782, 0);
        }
    }

    public static void k(com.whatsapp.protocol.co coVar) {
        a(coVar, 4);
    }

    public static void x(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((tm) it.next()).c(str);
            if (z) {
                return;
            }
        }
    }

    public static void a(String str, String str2) {
        try {
            if (c) {
                M.b(co.r(str, str2));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void af() {
        /*
        r8 = this;
        r0 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = 4;
        r2 = new java.io.File[r2];	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r3 = 0;
        r4 = z();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r4 = r4.getFilesDir();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r4 = r4.getParentFile();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r3 = 1;
        r4 = z();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r4 = r4.getFilesDir();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r3 = 2;
        r4 = new java.io.File;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r5 = z();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r5 = r5.getFilesDir();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r6 = bb;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r7 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r3 = 3;
        r4 = z();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r5 = bb;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r6 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r4 = r4.getDatabasePath(r5);	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r4 = r4.getParentFile();	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r3 = r2.length;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
    L_0x004c:
        if (r0 >= r3) goto L_0x00c2;
    L_0x004e:
        r4 = r2[r0];	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5.<init>();	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r6 = bb;	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r7 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r6 = r4.getName();	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r6 = bb;	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r7 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r6 = r4.canWrite();	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r5 = r4.canWrite();	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        if (r5 != 0) goto L_0x00be;
    L_0x0086:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x00c3, NoSuchMethodError -> 0x00e7 }
        r6 = 9;
        if (r5 < r6) goto L_0x00be;
    L_0x008c:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r5.<init>();	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r6 = bb;	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r7 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r6 = r4.getName();	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r6 = bb;	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r7 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r6 = 1;
        r7 = 1;
        r4 = r4.setWritable(r6, r7);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
    L_0x00be:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x004c;
    L_0x00c2:
        return;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00e7 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c7, NoSuchMethodError -> 0x00e7 }
    L_0x00c7:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00c2;
    L_0x00e7:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r1 = bb;
        r2 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.af():void");
    }

    public static Me n(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(bb[234], 0);
        return new Me(sharedPreferences.getString(bb[235], null), sharedPreferences.getString(bb[233], null));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r7, java.util.List r8, int r9, boolean r10, boolean r11, android.os.ConditionVariable r12, android.os.ConditionVariable r13, int r14) {
        /*
        r0 = 3;
        if (r0 != r9) goto L_0x0028;
    L_0x0003:
        r0 = aM;	 Catch:{ Exception -> 0x0026 }
        r0 = r0.getAndIncrement();	 Catch:{ Exception -> 0x0026 }
    L_0x0009:
        r2 = new com.whatsapp.g2;
        r2.<init>(r12, r13, r9, r0);
        if (r7 != 0) goto L_0x001a;
    L_0x0010:
        if (r8 == 0) goto L_0x0022;
    L_0x0012:
        r0 = r8.size();	 Catch:{ Exception -> 0x002a }
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        if (r9 != 0) goto L_0x0022;
    L_0x001a:
        r0 = com.whatsapp.wn.q();	 Catch:{ Exception -> 0x002e }
        if (r0 != 0) goto L_0x0034;
    L_0x0020:
        if (r11 != 0) goto L_0x0034;
    L_0x0022:
        r2.a();	 Catch:{ Exception -> 0x0032 }
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = -1;
        goto L_0x0009;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = new com.whatsapp.f9;
        r1 = r8;
        r3 = r7;
        r4 = r9;
        r5 = r11;
        r6 = r14;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        if (r10 == 0) goto L_0x0047;
    L_0x0040:
        r0.run();	 Catch:{ Exception -> 0x006e }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ Exception -> 0x006e }
        if (r1 == 0) goto L_0x0025;
    L_0x0047:
        com.whatsapp.util.bq.a(r0);	 Catch:{ Exception -> 0x004b }
        goto L_0x0025;
    L_0x004b:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = bb;
        r4 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r2.a();
        goto L_0x0025;
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, java.util.List, int, boolean, boolean, android.os.ConditionVariable, android.os.ConditionVariable, int):void");
    }

    static void b(a34 com_whatsapp_a34) {
        try {
            if (!aY.contains(com_whatsapp_a34)) {
                aY.add(com_whatsapp_a34);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static String D(String str) {
        Matcher matcher = Pattern.compile(bb[136]).matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String group = matcher.group(1);
        return group + matcher.group(2);
    }

    public static boolean ay() {
        try {
            if (w == null) {
                return false;
            }
            try {
                List runningTasks = w.getRunningTasks(1);
                if (runningTasks != null) {
                    if (runningTasks.size() > 0) {
                        return ((RunningTaskInfo) runningTasks.get(0)).baseActivity.toString().contains(bb[147]);
                    }
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
            }
            try {
                return h == 1;
            } catch (NullPointerException e3) {
                throw e3;
            }
        } catch (NullPointerException e32) {
            throw e32;
        }
    }

    public static void a(@NonNull DialogToastActivity dialogToastActivity) {
        String externalStorageState = Environment.getExternalStorageState();
        try {
            if (!bb[382].equals(externalStorageState)) {
                if (!bb[383].equals(externalStorageState)) {
                    try {
                        int i;
                        if (V()) {
                            i = 2131231516;
                        } else {
                            i = 2131231517;
                        }
                        dialogToastActivity.a(i);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            try {
                if (VERSION.SDK_INT >= 23) {
                    if (h(z(), bb[381]) == -1) {
                        RequestPermissionActivity.a(dialogToastActivity, 2131231677, 2131231648);
                        return;
                    }
                }
                dialogToastActivity.a(2131231164);
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.c3 r4, int r5) {
        /*
        r0 = com.whatsapp.wn.q();	 Catch:{ NumberFormatException -> 0x0013 }
        if (r0 == 0) goto L_0x0012;
    L_0x0006:
        switch(r5) {
            case 0: goto L_0x0015;
            case 5: goto L_0x0015;
            case 8: goto L_0x0015;
            case 13: goto L_0x0015;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0038 }
        r1 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0038 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0038 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = new com.whatsapp._d;
        r1 = new com.whatsapp.sg;
        r1.<init>(r4, r5);
        r0.<init>(r1);
        r1 = com.whatsapp.wn.u();
        r2 = p;	 Catch:{ NumberFormatException -> 0x0038 }
        r2 = r2.ai;	 Catch:{ NumberFormatException -> 0x0038 }
        r3 = new com.whatsapp.jobqueue.job.SendWebForwardJob;	 Catch:{ NumberFormatException -> 0x0038 }
        r0 = com.whatsapp.messaging.co.a(r1, r4, r5, r0);	 Catch:{ NumberFormatException -> 0x0038 }
        r3.<init>(r1, r0);	 Catch:{ NumberFormatException -> 0x0038 }
        r2.a(r3);	 Catch:{ NumberFormatException -> 0x0038 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x0038 }
        if (r0 == 0) goto L_0x0012;
    L_0x0037:
        goto L_0x0009;
    L_0x0038:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.c3, int):void");
    }

    public static by an() {
        return a0;
    }

    public static void a(l5 l5Var) {
        try {
            if (!l5.e(l5Var.p)) {
                if (!l5Var.p.equals(bb[49])) {
                    try {
                        if (!a1.d(l5Var.p)) {
                            if (c) {
                                M.b(co.a(l5Var.p));
                                a1.a(l5Var.p, true);
                            }
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            }
        } catch (NumberFormatException e22) {
            throw e22;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static void b(aau com_whatsapp_aau) {
        try {
            if (!ae.contains(com_whatsapp_aau)) {
                ae.add(com_whatsapp_aau);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void v() {
        try {
            Intent intent;
            if (!a2() && j == 2) {
                intent = new Intent(z(), IncorrectAppReleaseVersionActivity.class);
                try {
                    intent.setFlags(268435456);
                    intent.putExtra(bb[488], 1);
                    z().startActivity(intent);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            if (a2() && j != 2) {
                intent = new Intent(z(), IncorrectAppReleaseVersionActivity.class);
                intent.setFlags(268435456);
                intent.putExtra(bb[489], 2);
                z().startActivity(intent);
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private static void o() {
        Throwable th;
        DataOutputStream dataOutputStream = null;
        DataOutputStream dataOutputStream2;
        try {
            dataOutputStream2 = new DataOutputStream(z().openFileOutput(bb[38], 0));
            try {
                dataOutputStream2.writeBoolean(U);
                if (dataOutputStream2 != null) {
                    try {
                        dataOutputStream2.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                try {
                    Log.w(bb[39]);
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    dataOutputStream = dataOutputStream2;
                    th = th3;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e4) {
                        } catch (NumberFormatException e5) {
                            throw e5;
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e6) {
            dataOutputStream2 = null;
            Log.w(bb[39]);
            if (dataOutputStream2 != null) {
                dataOutputStream2.close();
            }
        } catch (Throwable th4) {
            th = th4;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            throw th;
        }
    }

    private static void ax() {
        boolean z = DialogToastActivity.f;
        try {
            PackageManager packageManager = z().getPackageManager();
            if (packageManager != null) {
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(1152);
                if (installedApplications != null) {
                    StringBuilder stringBuilder = new StringBuilder(bb[236]);
                    Object arrayList = new ArrayList();
                    for (ApplicationInfo applicationInfo : installedApplications) {
                        arrayList.add(applicationInfo.packageName);
                        if (z) {
                            break;
                        }
                    }
                    Collections.sort(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        stringBuilder.append(" ").append((String) it.next());
                        if (z) {
                            return;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e(bb[237] + e.toString());
        }
    }

    public static void a(Collection collection, boolean z) {
        aK.a(collection, z, true);
    }

    public static int g(Context context) {
        return context.getSharedPreferences(bb[225], 0).getInt(bb[226], 6);
    }

    public void onEvent(x6 x6Var) {
        a((vr) de.greenrobot.event.h.b().b(vr.class), x6Var);
    }

    public static void m(com.whatsapp.protocol.co coVar) {
        boolean z = DialogToastActivity.f;
        auv.a();
        Log.i(bb[357]);
        Iterator it = ae.iterator();
        while (it.hasNext()) {
            ((aau) it.next()).c(coVar);
            if (z) {
                return;
            }
        }
    }

    public static void a(Context context, int i, int i2) {
        Toast makeText = Toast.makeText(context.getApplicationContext(), context.getString(i), i2);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    private static boolean j(boolean z) {
        boolean z2;
        vr vrVar = (vr) de.greenrobot.event.h.b().b(vr.class);
        if (vrVar != null) {
            try {
                if (vrVar.c()) {
                    z2 = true;
                    if (an && z) {
                        if (!E) {
                            try {
                                if (!aX && r0) {
                                    return true;
                                }
                            } catch (NumberFormatException e) {
                                try {
                                    throw e;
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            }
                        }
                    }
                    return false;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        z2 = false;
        try {
            try {
                if (E) {
                    return true;
                }
                return false;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    public void f() {
        aI = true;
        aG++;
        aU();
        aJ = false;
    }

    static boolean aK() {
        boolean z;
        ana com_whatsapp_ana = (ana) de.greenrobot.event.h.b().b(ana.class);
        if (com_whatsapp_ana != null) {
            try {
                if (com_whatsapp_ana.a) {
                    z = true;
                    return j(z);
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        z = false;
        return j(z);
    }

    long bd() {
        try {
            if (aP == -1) {
                aP = u();
            }
            return aP;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static Object al() {
        return C;
    }

    public static void b(com.whatsapp.protocol.co coVar, boolean z) {
        a(Collections.singleton(coVar), z);
    }

    static AtomicInteger ab() {
        return ag;
    }

    public static void c(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[64], 0).edit();
        try {
            edit.putString(bb[65], str);
            if (!edit.commit()) {
                Log.e(bb[63]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void c(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[465]);
                M.b(co.a(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean C(Context context) {
        return context.getSharedPreferences(bb[467], 0).getBoolean(bb[466], false);
    }

    public static Bitmap e(com.whatsapp.protocol.co coVar) {
        boolean z = DialogToastActivity.f;
        MediaData mediaData = (MediaData) coVar.Q;
        try {
            if (mediaData.transferred && mediaData.file != null) {
                if (mediaData.file.exists()) {
                    try {
                        Display defaultDisplay = ((WindowManager) z().getSystemService(bb[377])).getDefaultDisplay();
                        int width = defaultDisplay.getWidth();
                        int height = defaultDisplay.getHeight();
                        Options options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(mediaData.file.getAbsolutePath(), options);
                        width *= height;
                        height = options.outWidth * options.outHeight;
                        options.inSampleSize = 1;
                        if (width != 0) {
                            while (height > width) {
                                options.inSampleSize *= 2;
                                height /= 4;
                                if (z) {
                                    break;
                                }
                            }
                        }
                        options.inJustDecodeBounds = false;
                        return BitmapFactory.decodeFile(mediaData.file.getAbsolutePath(), options);
                    } catch (OutOfMemoryError e) {
                        throw e;
                    } catch (OutOfMemoryError e2) {
                        return null;
                    }
                }
            }
            return null;
        } catch (OutOfMemoryError e3) {
            throw e3;
        } catch (OutOfMemoryError e32) {
            throw e32;
        }
    }

    public static void a(b0 b0Var) {
        try {
            if (c) {
                M.b(co.a(b0Var));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a(String str, long j, Messenger messenger) {
        try {
            if (!c) {
                return false;
            }
            M.b(co.a(str, j, messenger));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int az() {
        try {
            if (ad == null) {
                return 0;
            }
            try {
                if (W == null) {
                    return 0;
                }
                NetworkInfo activeNetworkInfo = ad.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return 0;
                }
                try {
                    if (activeNetworkInfo.getType() == 1) {
                        return 1;
                    }
                    if (activeNetworkInfo.isRoaming()) {
                        return 3;
                    }
                    if (W.isNetworkRoaming()) {
                        return 3;
                    }
                    Object simCountryIso = W.getSimCountryIso();
                    try {
                        if (TextUtils.isEmpty(simCountryIso)) {
                            return 3;
                        }
                        Object simOperator = W.getSimOperator();
                        try {
                            if (TextUtils.isEmpty(simOperator)) {
                                return 3;
                            }
                            if (W.getPhoneType() != 2) {
                                CharSequence networkCountryIso = W.getNetworkCountryIso();
                                try {
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        return 3;
                                    }
                                    try {
                                        if (!simCountryIso.equals(networkCountryIso)) {
                                            return 3;
                                        }
                                        String networkOperator = W.getNetworkOperator();
                                        try {
                                            if (TextUtils.isEmpty(networkOperator)) {
                                                return 3;
                                            }
                                            try {
                                                if (!networkOperator.equals(simOperator)) {
                                                    if (!b7.a(networkOperator, simOperator)) {
                                                        return 3;
                                                    }
                                                }
                                            } catch (NumberFormatException e) {
                                                throw e;
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
                            return 2;
                        } catch (NumberFormatException e22222) {
                            throw e22222;
                        }
                    } catch (NumberFormatException e222222) {
                        throw e222222;
                    }
                } catch (NumberFormatException e2222222) {
                    throw e2222222;
                }
            } catch (NumberFormatException e22222222) {
                throw e22222222;
            }
        } catch (NumberFormatException e222222222) {
            throw e222222222;
        }
    }

    public static boolean i(Context context, @NonNull String str) {
        return context.getSharedPreferences(bb[346], 0).getBoolean(str, false);
    }

    private static void a(vr vrVar, x6 x6Var) {
        try {
            if (!c) {
                return;
            }
            if (!wn.q()) {
                return;
            }
            if (vrVar == null) {
                try {
                    Log.w(bb[356]);
                } catch (NumberFormatException e) {
                    throw e;
                }
            } else if (x6Var == null) {
                try {
                    Log.w(bb[355]);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } else {
                double b = vrVar.b();
                if (b != Double.NaN) {
                    azv a = wn.a((int) b, vrVar.d(), x6Var.a);
                    if (a != null) {
                        try {
                            M.b(co.a(a));
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    }
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static void a(com.whatsapp.protocol.co coVar, boolean z) {
        try {
            if (sx.a(coVar)) {
                Log.w(bb[252]);
                return;
            }
            boolean a = ag.a(coVar);
            if (a) {
                try {
                    if (!ag.b(coVar)) {
                        if (z) {
                            a(z(), 2131232023, 0);
                            return;
                        }
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            try {
                if (coVar.c == 9) {
                    if (ag.d(coVar.n) != -1) {
                        try {
                            if (!as.a(coVar.k.c, coVar.g, air.ALLOW)) {
                                if (z) {
                                    a(as.b(coVar.k.c), z());
                                    return;
                                }
                                return;
                            }
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    } else if (z) {
                        try {
                            a(z(), 2131232023, 0);
                            return;
                        } catch (NumberFormatException e222) {
                            throw e222;
                        }
                    } else {
                        return;
                    }
                }
                MediaData mediaData = (MediaData) coVar.Q;
                try {
                    if (!mediaData.autodownloadRetryEnabled) {
                        mediaData.autodownloadRetryEnabled = true;
                        aK.a(coVar, true, -1);
                    }
                    if (a) {
                        try {
                            tw.a().a(coVar);
                            if (!DialogToastActivity.f) {
                                return;
                            }
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    }
                    mediaData.uploader = new sx(coVar, false, true);
                    mediaData.uploader.d();
                } catch (NumberFormatException e22222) {
                    throw e22222;
                }
            } catch (NumberFormatException e222222) {
                throw e222222;
            } catch (NumberFormatException e2222222) {
                throw e2222222;
            }
        } catch (NumberFormatException e22222222) {
            throw e22222222;
        }
    }

    public static void a(com.whatsapp.protocol.co coVar, int i) {
        try {
            if (wn.q() && coVar != null) {
                List arrayList = new ArrayList(1);
                arrayList.add(coVar);
                a(i, arrayList, false, false, null, null);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void q(String str) {
        if (c) {
            Log.i(bb[222]);
            M.b(co.i(new a3i(str, null, null, 94, null)));
        }
    }

    public static long T() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            Log.w(bb[2]);
            return 0;
        }
    }

    private static void J(String str) {
        if (str == null) {
            try {
                auv.a(bb[270]);
                return;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        auv.a();
        synchronized (b) {
            b.remove(str);
        }
    }

    public static boolean K() {
        try {
            return am >= 2;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onEvent(ana com_whatsapp_ana) {
        try {
            if (j(com_whatsapp_ana.a)) {
                bq.a(new a3l(false), new Void[0]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    @Deprecated
    private static void c(String[] strArr) {
        boolean z = DialogToastActivity.f;
        if (c) {
            List arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                Object obj = strArr[i];
                try {
                    if (!p.aW.contains(obj)) {
                        arrayList.add(obj);
                        p.aW.add(obj);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            if (!arrayList.isEmpty()) {
                M.b(co.a(null, (String[]) arrayList.toArray(new String[arrayList.size()])));
            }
        }
    }

    public static void e(String str, String str2, String str3) {
        l5 d = qa.d(str);
        com.whatsapp.protocol.co coVar = new com.whatsapp.protocol.co(d.p, str3, null);
        coVar.b = av();
        coVar.u = 0;
        coVar.c = (byte) 4;
        coVar.A = str2;
        b(coVar, d);
        aK.a(coVar);
        bq.a(new u2(str));
    }

    public static void c(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[591], 0).edit();
        try {
            edit.putBoolean(bb[592], z);
            if (!edit.commit()) {
                Log.e(bb[590]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a5() {
        l = false;
        Y();
    }

    public static void P() {
        try {
            if (c) {
                Log.i(bb[207]);
                M.b(co.h());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static List b(List list) {
        return f(list);
    }

    public static void a(String str, List list, int i) {
        a(str, list, i, false, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.co r11, com.whatsapp.l5 r12) {
        /*
        r1 = 0;
        r10 = 5;
        r3 = 0;
        r2 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.c;	 Catch:{ IOException -> 0x0040 }
        if (r0 != r2) goto L_0x004c;
    L_0x000a:
        r0 = r11.Q;	 Catch:{ IOException -> 0x0040 }
        if (r0 == 0) goto L_0x004c;
    L_0x000e:
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r4 = r0.file;
        if (r4 == 0) goto L_0x004c;
    L_0x0016:
        r4 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r6 = r0.file;	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r6 = r6.getAbsolutePath();	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r4.<init>(r6);	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r6 = bb;	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r7 = 46;
        r6 = r6[r7];	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r7 = 1;
        r4 = r4.getAttributeInt(r6, r7);	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        if (r4 == r2) goto L_0x004c;
    L_0x002e:
        if (r4 == 0) goto L_0x004c;
    L_0x0030:
        r4 = z();	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r6 = r12.p;	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r0 = r0.file;	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
        com.whatsapp.util.ag.a(r4, r6, r0);	 Catch:{ IOException -> 0x022c, OutOfMemoryError -> 0x0042, c_ -> 0x0229, SecurityException -> 0x022f }
    L_0x003f:
        return;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
    L_0x0043:
        r4 = bb;
        r6 = 47;
        r4 = r4[r6];
        com.whatsapp.util.Log.b(r4, r0);
    L_0x004c:
        r0 = r11.Q;
        r0 = r0 instanceof com.whatsapp.MediaData;
        if (r0 == 0) goto L_0x0232;
    L_0x0052:
        r4 = new com.whatsapp.MediaData;
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r4.<init>(r0);
        r0 = r11.c;	 Catch:{ IOException -> 0x01b8 }
        if (r0 != r10) goto L_0x01ba;
    L_0x005f:
        r0 = r2;
    L_0x0060:
        r4.transferred = r0;
        r4.forward = r2;
        r3 = r4;
    L_0x0065:
        r6 = new com.whatsapp.protocol.co;
        r0 = r12.p;
        r4 = r11.e();
        r6.<init>(r0, r4, r3);
        r8 = av();	 Catch:{ IOException -> 0x01bd }
        r6.b = r8;	 Catch:{ IOException -> 0x01bd }
        r0 = r11.c;	 Catch:{ IOException -> 0x01bd }
        r0 = b(r0);	 Catch:{ IOException -> 0x01bd }
        if (r0 == 0) goto L_0x0083;
    L_0x007e:
        r0 = 1;
        r6.d = r0;	 Catch:{ IOException -> 0x01bd }
        if (r5 == 0) goto L_0x0086;
    L_0x0083:
        r0 = 0;
        r6.d = r0;	 Catch:{ IOException -> 0x01bf }
    L_0x0086:
        r0 = r11.u;	 Catch:{ IOException -> 0x01c1 }
        r6.u = r0;	 Catch:{ IOException -> 0x01c1 }
        r0 = r11.c;	 Catch:{ IOException -> 0x01c1 }
        r0 = b(r0);	 Catch:{ IOException -> 0x01c1 }
        if (r0 != 0) goto L_0x0096;
    L_0x0092:
        r0 = r11.q;	 Catch:{ IOException -> 0x01c1 }
        r6.q = r0;	 Catch:{ IOException -> 0x01c1 }
    L_0x0096:
        r0 = r11.c;	 Catch:{ IOException -> 0x01c3 }
        r6.c = r0;	 Catch:{ IOException -> 0x01c3 }
        r0 = r11.n;	 Catch:{ IOException -> 0x01c3 }
        r6.n = r0;	 Catch:{ IOException -> 0x01c3 }
        r8 = r11.z;	 Catch:{ IOException -> 0x01c3 }
        r6.z = r8;	 Catch:{ IOException -> 0x01c3 }
        r0 = r11.A;	 Catch:{ IOException -> 0x01c3 }
        r6.A = r0;	 Catch:{ IOException -> 0x01c3 }
        r0 = r11.H;	 Catch:{ IOException -> 0x01c3 }
        r6.H = r0;	 Catch:{ IOException -> 0x01c3 }
        r0 = r11.R;	 Catch:{ IOException -> 0x01c3 }
        r6.R = r0;	 Catch:{ IOException -> 0x01c3 }
        r0 = r11.c;	 Catch:{ IOException -> 0x01c3 }
        if (r0 != 0) goto L_0x00bc;
    L_0x00b2:
        r0 = r11.a;	 Catch:{ IOException -> 0x01c3 }
        r6.a = r0;	 Catch:{ IOException -> 0x01c3 }
        r0 = r11.Q;	 Catch:{ IOException -> 0x01c3 }
        r6.Q = r0;	 Catch:{ IOException -> 0x01c3 }
        if (r5 == 0) goto L_0x00c6;
    L_0x00bc:
        r0 = r11.c;	 Catch:{ IOException -> 0x01c5 }
        r4 = 9;
        if (r0 != r4) goto L_0x00c6;
    L_0x00c2:
        r0 = r11.a;	 Catch:{ IOException -> 0x01c7 }
        r6.a = r0;	 Catch:{ IOException -> 0x01c7 }
    L_0x00c6:
        r0 = r11.o;	 Catch:{ IOException -> 0x01c9 }
        r6.o = r0;	 Catch:{ IOException -> 0x01c9 }
        r8 = r11.m;	 Catch:{ IOException -> 0x01c9 }
        r6.m = r8;	 Catch:{ IOException -> 0x01c9 }
        r8 = r11.l;	 Catch:{ IOException -> 0x01c9 }
        r6.l = r8;	 Catch:{ IOException -> 0x01c9 }
        b(r6, r12);	 Catch:{ IOException -> 0x01c9 }
        r0 = r6.c;	 Catch:{ IOException -> 0x01c9 }
        if (r0 == r2) goto L_0x00e2;
    L_0x00d9:
        r0 = r6.c;	 Catch:{ IOException -> 0x01c9 }
        r4 = 3;
        if (r0 == r4) goto L_0x00e2;
    L_0x00de:
        r0 = r6.c;	 Catch:{ IOException -> 0x01cb }
        if (r0 != r10) goto L_0x00fa;
    L_0x00e2:
        r0 = r6.u;	 Catch:{ IOException -> 0x01cd }
        if (r0 != 0) goto L_0x00fa;
    L_0x00e6:
        r0 = r6.c();	 Catch:{ IOException -> 0x01cf }
        if (r0 == 0) goto L_0x00f8;
    L_0x00ec:
        r0 = r6.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01d1, StringIndexOutOfBoundsException -> 0x0223, IllegalArgumentException -> 0x0226 }
        r4 = 0;
        r0 = android.backport.util.Base64.decode(r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01d1, StringIndexOutOfBoundsException -> 0x0223, IllegalArgumentException -> 0x0226 }
        r6.a(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01d1, StringIndexOutOfBoundsException -> 0x0223, IllegalArgumentException -> 0x0226 }
    L_0x00f8:
        r6.u = r2;
    L_0x00fa:
        r0 = r11.c;	 Catch:{ IOException -> 0x01e4 }
        r0 = b(r0);	 Catch:{ IOException -> 0x01e4 }
        if (r0 == 0) goto L_0x0210;
    L_0x0102:
        if (r3 != 0) goto L_0x0122;
    L_0x0104:
        r0 = bb;	 Catch:{ IOException -> 0x01e8 }
        r1 = 48;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01e8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x01e8 }
        r0 = z();	 Catch:{ IOException -> 0x01e8 }
        r1 = z();	 Catch:{ IOException -> 0x01e8 }
        r2 = 2131231452; // 0x7f0802dc float:1.8078985E38 double:1.052968244E-314;
        r1 = r1.getString(r2);	 Catch:{ IOException -> 0x01e8 }
        r2 = 1;
        a(r0, r1, r2);	 Catch:{ IOException -> 0x01e8 }
        if (r5 == 0) goto L_0x0215;
    L_0x0122:
        r0 = r3.file;	 Catch:{ IOException -> 0x01ea }
        if (r0 != 0) goto L_0x0144;
    L_0x0126:
        r0 = bb;	 Catch:{ IOException -> 0x01ec }
        r1 = 42;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01ec }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x01ec }
        r0 = z();	 Catch:{ IOException -> 0x01ec }
        r1 = z();	 Catch:{ IOException -> 0x01ec }
        r2 = 2131231452; // 0x7f0802dc float:1.8078985E38 double:1.052968244E-314;
        r1 = r1.getString(r2);	 Catch:{ IOException -> 0x01ec }
        r2 = 1;
        a(r0, r1, r2);	 Catch:{ IOException -> 0x01ec }
        if (r5 == 0) goto L_0x0215;
    L_0x0144:
        r0 = r3.fileSize;	 Catch:{ IOException -> 0x01ee }
        r8 = 0;
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x019d;
    L_0x014c:
        r0 = r3.fileSize;	 Catch:{ IOException -> 0x01f0 }
        r2 = r3.file;	 Catch:{ IOException -> 0x01f0 }
        r8 = r2.length();	 Catch:{ IOException -> 0x01f0 }
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x019d;
    L_0x0158:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0 }
        r0.<init>();	 Catch:{ IOException -> 0x01f0 }
        r1 = bb;	 Catch:{ IOException -> 0x01f0 }
        r2 = 43;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01f0 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f0 }
        r8 = r3.fileSize;	 Catch:{ IOException -> 0x01f0 }
        r0 = r0.append(r8);	 Catch:{ IOException -> 0x01f0 }
        r1 = bb;	 Catch:{ IOException -> 0x01f0 }
        r2 = 44;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01f0 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f0 }
        r1 = r3.file;	 Catch:{ IOException -> 0x01f0 }
        r8 = r1.length();	 Catch:{ IOException -> 0x01f0 }
        r0 = r0.append(r8);	 Catch:{ IOException -> 0x01f0 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01f0 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01f0 }
        r0 = z();	 Catch:{ IOException -> 0x01f0 }
        r1 = z();	 Catch:{ IOException -> 0x01f0 }
        r2 = 2131231452; // 0x7f0802dc float:1.8078985E38 double:1.052968244E-314;
        r1 = r1.getString(r2);	 Catch:{ IOException -> 0x01f0 }
        r2 = 1;
        a(r0, r1, r2);	 Catch:{ IOException -> 0x01f0 }
        if (r5 == 0) goto L_0x0215;
    L_0x019d:
        r0 = com.whatsapp.util.ag.a(r6);
        if (r0 == 0) goto L_0x01f7;
    L_0x01a3:
        r0 = com.whatsapp.util.ag.b(r6);	 Catch:{ IOException -> 0x01b6 }
        if (r0 != 0) goto L_0x01f2;
    L_0x01a9:
        r0 = z();	 Catch:{ IOException -> 0x01b6 }
        r1 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;
        r2 = 0;
        a(r0, r1, r2);	 Catch:{ IOException -> 0x01b6 }
        goto L_0x003f;
    L_0x01b6:
        r0 = move-exception;
        throw r0;
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        r0 = r3;
        goto L_0x0060;
    L_0x01bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01bf }
    L_0x01bf:
        r0 = move-exception;
        throw r0;
    L_0x01c1:
        r0 = move-exception;
        throw r0;
    L_0x01c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c5 }
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01cf }
    L_0x01cf:
        r0 = move-exception;
        throw r0;
    L_0x01d1:
        r0 = move-exception;
        r4 = r0;
    L_0x01d3:
        r0 = r1;
        r0 = (byte[]) r0;
        r6.a(r0);
        r0 = bb;
        r1 = 45;
        r0 = r0[r1];
        com.whatsapp.util.Log.b(r0, r4);
        goto L_0x00f8;
    L_0x01e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01e6 }
    L_0x01e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01e8 }
    L_0x01e8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ea }
    L_0x01ea:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ec }
    L_0x01ec:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ee }
    L_0x01ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f0 }
    L_0x01f0:
        r0 = move-exception;
        throw r0;
    L_0x01f2:
        q(r6);	 Catch:{ IOException -> 0x021f }
        if (r5 == 0) goto L_0x020e;
    L_0x01f7:
        r0 = aK;	 Catch:{ IOException -> 0x021f }
        r1 = 1;
        r0.a(r6, r1);	 Catch:{ IOException -> 0x021f }
        r0 = new com.whatsapp.sx;	 Catch:{ IOException -> 0x021f }
        r1 = 0;
        r2 = 0;
        r0.<init>(r6, r1, r2);	 Catch:{ IOException -> 0x021f }
        r3.uploader = r0;	 Catch:{ IOException -> 0x021f }
        r0 = 1;
        r3.autodownloadRetryEnabled = r0;	 Catch:{ IOException -> 0x021f }
        r0 = r3.uploader;	 Catch:{ IOException -> 0x021f }
        r0.d();	 Catch:{ IOException -> 0x021f }
    L_0x020e:
        if (r5 == 0) goto L_0x0215;
    L_0x0210:
        r0 = aK;	 Catch:{ IOException -> 0x0221 }
        r0.a(r6);	 Catch:{ IOException -> 0x0221 }
    L_0x0215:
        r0 = new com.whatsapp.j8;
        r0.<init>(r12);
        com.whatsapp.util.bq.a(r0);
        goto L_0x003f;
    L_0x021f:
        r0 = move-exception;
        throw r0;
    L_0x0221:
        r0 = move-exception;
        throw r0;
    L_0x0223:
        r0 = move-exception;
        r4 = r0;
        goto L_0x01d3;
    L_0x0226:
        r0 = move-exception;
        r4 = r0;
        goto L_0x01d3;
    L_0x0229:
        r0 = move-exception;
        goto L_0x0043;
    L_0x022c:
        r0 = move-exception;
        goto L_0x0043;
    L_0x022f:
        r0 = move-exception;
        goto L_0x0043;
    L_0x0232:
        r3 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.co, com.whatsapp.l5):void");
    }

    public static void at() {
        try {
            if (a2()) {
                aR.a();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(boolean z) {
        aC = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(java.lang.String r4, boolean r5) {
        /*
        r0 = com.whatsapp.fieldstats.k.CHAT_DELETE;
        com.whatsapp.nf.a(r0);
        r0 = as;
        r0 = r0.f(r4);
        r1 = aK;	 Catch:{ NumberFormatException -> 0x0065 }
        r1.B(r4);	 Catch:{ NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x0064;
    L_0x0012:
        r1 = r0.c();	 Catch:{ NumberFormatException -> 0x0067 }
        if (r1 != 0) goto L_0x001e;
    L_0x0018:
        r1 = r0.m();	 Catch:{ NumberFormatException -> 0x0069 }
        if (r1 == 0) goto L_0x0023;
    L_0x001e:
        r1 = as;	 Catch:{ NumberFormatException -> 0x0069 }
        r1.a(r0);	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x0023:
        r1 = r0.c();	 Catch:{ NumberFormatException -> 0x006b }
        if (r1 == 0) goto L_0x0039;
    L_0x0029:
        r1 = z();	 Catch:{ NumberFormatException -> 0x006b }
        r1 = com.whatsapp.a3b.a(r1);	 Catch:{ NumberFormatException -> 0x006b }
        r1.h(r4);	 Catch:{ NumberFormatException -> 0x006b }
        r1 = com.whatsapp.j2.a;	 Catch:{ NumberFormatException -> 0x006b }
        r1.b(r4);	 Catch:{ NumberFormatException -> 0x006b }
    L_0x0039:
        r1 = 1;
        r2 = 1;
        a(r0, r1, r2);	 Catch:{ NumberFormatException -> 0x006d }
        r1 = 0;
        r2 = 0;
        a(r1, r2);	 Catch:{ NumberFormatException -> 0x006d }
        r1 = r0.l;	 Catch:{ NumberFormatException -> 0x006d }
        if (r1 == 0) goto L_0x0053;
    L_0x0047:
        r1 = r0.c();	 Catch:{ NumberFormatException -> 0x006f }
        if (r1 != 0) goto L_0x0053;
    L_0x004d:
        r1 = r0.m();	 Catch:{ NumberFormatException -> 0x0071 }
        if (r1 == 0) goto L_0x005b;
    L_0x0053:
        r1 = new com.whatsapp.wg;	 Catch:{ NumberFormatException -> 0x0071 }
        r1.<init>(r0);	 Catch:{ NumberFormatException -> 0x0071 }
        a(r1);	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x005b:
        if (r5 == 0) goto L_0x0064;
    L_0x005d:
        r0 = 2;
        r2 = 0;
        r1 = 0;
        a(r0, r4, r2, r1);	 Catch:{ NumberFormatException -> 0x0073 }
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(java.lang.String, boolean):void");
    }

    public void i() {
        boolean z = DialogToastActivity.f;
        Log.i(bb[277]);
        c = true;
        long j = z().getSharedPreferences(bb[278], 0).getLong(bb[279], 0);
        try {
            if (86400000 + j < System.currentTimeMillis() || System.currentTimeMillis() < j) {
                aX();
            }
            try {
                if (m(z())) {
                    k();
                }
                synchronized (k) {
                    Log.i(bb[280] + k.size());
                    for (Message b : k.values()) {
                        M.b(b);
                        if (z) {
                            break;
                        }
                    }
                    k.clear();
                }
                synchronized (aQ) {
                    if (aa != null) {
                        bq.a(new akw(this, aa));
                        aa = null;
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static void i(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((tm) it.next()).b(str);
            if (z) {
                return;
            }
        }
    }

    public static long ba() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }

    public void a(b3 b3Var) {
        boolean z = DialogToastActivity.f;
        try {
            if (b3Var.b == 0) {
                c(true);
                as();
                if (!z) {
                    return;
                }
            }
            if (b3Var.b == 2) {
                Intent intent = new Intent(null, null, z(), SpamWarningActivity.class);
                try {
                    intent.setFlags(268435456);
                    intent.putExtra(bb[389], b3Var.f);
                    intent.putExtra(bb[390], b3Var.a);
                    a(z(), true, System.currentTimeMillis() + ((long) (b3Var.a * 1000)));
                    z().startActivity(intent);
                    if (!z) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            Log.e(bb[388] + b3Var.b);
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void a(long j, long j2) {
        Log.i(bb[283] + j + bb[284] + j2 + bb[282] + DateUtils.formatDateTime(z(), System.currentTimeMillis(), 17) + bb[289] + DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis())) + bb[287] + android.text.format.DateFormat.getDateFormat(z()).format(new Date(System.currentTimeMillis())) + " " + android.text.format.DateFormat.getTimeFormat(z()).format(new Date(System.currentTimeMillis())) + bb[285] + DateUtils.formatDateTime(z(), b(av()), 17));
        V = j;
        aL = j2;
        T = aL - V;
        a4 = SystemClock.elapsedRealtime();
        z().getSharedPreferences(bb[286], 0).edit().putLong(bb[288], T).commit();
    }

    public App(Application application) {
        this.aN = new AvailabilityTimeoutAlarmBroadcastReceiver();
        this.aS = new DelayedRegistrationBroadcastReceiver();
        this.aW = new HashSet();
        this.aV = new HashSet();
        this.aO = new kd(this);
        this.H = new kq(this);
        this.au = application;
        this.aH = new adn(application, this);
        this.d = new i1(application, this);
    }

    public static boolean q() {
        try {
            if (h != 3) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void E() {
        SharedPreferences sharedPreferences = z().getSharedPreferences(bb[384], 0);
        if (sharedPreferences != null) {
            int i = sharedPreferences.getInt(bb[385], 0);
            try {
                Log.i(bb[386] + i);
                if (i == 1) {
                    Log.i(bb[387]);
                    a(com.whatsapp.contact.o.INTERACTIVE_FULL);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                bq.a(new jt());
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
    }

    public static void aL() {
        Log.i(bb[459]);
        c = false;
        MessageService.a(z());
    }

    static boolean n(String str) {
        Integer num = (Integer) wn.l.get(str);
        if (num == null) {
            try {
                wn.a(str, -1);
                return false;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        try {
            if (num.intValue() < 0) {
                return true;
            }
            a(str, num.intValue());
            return true;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean aO() {
        /*
        r0 = z();	 Catch:{ NumberFormatException -> 0x0028 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0028 }
        r2 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0028 }
        r0 = h(r0, r1);	 Catch:{ NumberFormatException -> 0x0028 }
        if (r0 != 0) goto L_0x002e;
    L_0x0010:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x002a }
        r1 = 23;
        if (r0 < r1) goto L_0x0026;
    L_0x0016:
        r0 = z();	 Catch:{ NumberFormatException -> 0x002c }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x002c }
        r2 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x002c }
        r0 = h(r0, r1);	 Catch:{ NumberFormatException -> 0x002c }
        if (r0 != 0) goto L_0x002e;
    L_0x0026:
        r0 = 1;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = 0;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aO():boolean");
    }

    public static void a(Context context, com.whatsapp.protocol.co coVar) {
        bq.a(new xo(context, coVar), new Void[0]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r6, boolean r7) {
        /*
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.fieldstats.k.CHATS_ALL_CLEAR;
        com.whatsapp.nf.a(r0);
        r4 = com.whatsapp.qa.g();
        r5 = r4.iterator();
    L_0x0011:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0026;
    L_0x0017:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r0 = com.whatsapp.qa.d(r0);
        a(r0, r6);
        if (r3 == 0) goto L_0x0011;
    L_0x0026:
        if (r7 == 0) goto L_0x002f;
    L_0x0028:
        r0 = aK;	 Catch:{ NumberFormatException -> 0x004d }
        r0.a(r4);	 Catch:{ NumberFormatException -> 0x004d }
        if (r3 == 0) goto L_0x0034;
    L_0x002f:
        r0 = aK;	 Catch:{ NumberFormatException -> 0x004d }
        r0.q();	 Catch:{ NumberFormatException -> 0x004d }
    L_0x0034:
        r0 = new com.whatsapp.aqa;
        r0.<init>();
        r6.runOnUiThread(r0);
        r3 = new com.whatsapp.protocol.bf;
        r0 = 0;
        r4 = 0;
        r3.<init>(r0, r1, r4);
        if (r7 != 0) goto L_0x004f;
    L_0x0046:
        r0 = r1;
    L_0x0047:
        r3.c = r0;
        a(r3, r2);
        return;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = r2;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.app.Activity, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r6) {
        /*
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        switch(r6) {
            case 0: goto L_0x002d;
            case 1: goto L_0x0012;
            case 2: goto L_0x001c;
            case 3: goto L_0x0025;
            default: goto L_0x0006;
        };
    L_0x0006:
        r0 = new java.lang.IllegalArgumentException;
        r1 = bb;
        r2 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0012:
        r0 = bb;
        r2 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r2 = r0[r2];
        r0 = 15;
        if (r3 == 0) goto L_0x0030;
    L_0x001c:
        r0 = bb;
        r2 = 326; // 0x146 float:4.57E-43 double:1.61E-321;
        r2 = r0[r2];
        r0 = 1;
        if (r3 == 0) goto L_0x0030;
    L_0x0025:
        r0 = bb;
        r2 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r0 = r0[r2];
        if (r3 == 0) goto L_0x002e;
    L_0x002d:
        return r1;
    L_0x002e:
        r2 = r0;
        r0 = r1;
    L_0x0030:
        r3 = z();
        r4 = bb;
        r5 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r4 = r4[r5];
        r1 = r3.getSharedPreferences(r4, r1);
        r1 = r1.getInt(r2, r0);
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.c(int):int");
    }

    public static void k() {
        try {
            if (c) {
                Log.i(bb[369]);
                M.b(co.f());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean f(com.whatsapp.protocol.co coVar) {
        try {
            if (C(coVar.k.c)) {
                if (coVar.b >= 1415214000000L) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean aA() {
        try {
            Class.forName(bb[363]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean a(String str, boolean z, boolean z2, boolean z3, EnumSet enumSet, File file, String str2) {
        return b(str, z, z2, z3, enumSet, file, str2);
    }

    public static void b(b0 b0Var) {
        try {
            if (c) {
                M.b(co.b(b0Var));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.whatsapp.l5 r8, android.app.Activity r9, com.whatsapp.fieldstats.cd r10, boolean r11) {
        /*
        r2 = 0;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        if (r10 != 0) goto L_0x005d;
    L_0x0007:
        r1 = r2;
    L_0x0008:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = bb;
        r7 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.append(r10);
        r6 = bb;
        r7 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.append(r11);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = bb;
        r6 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r0 = r0[r6];
        r0 = r9.getSystemService(r0);
        r0 = (android.telephony.TelephonyManager) r0;
        r0 = r0.getCallState();	 Catch:{ ActivityNotFoundException -> 0x0069 }
        if (r0 == 0) goto L_0x006b;
    L_0x0042:
        r0 = r3;
    L_0x0043:
        if (r0 == 0) goto L_0x006f;
    L_0x0045:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x006d }
        r2 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x006d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x006d }
        r0 = 2131230882; // 0x7f0800a2 float:1.807783E38 double:1.052967962E-314;
        r2 = 1;
        b(r9, r0, r2);	 Catch:{ ActivityNotFoundException -> 0x006d }
        r0 = com.whatsapp.fieldstats.v.CALL_CANCELED_CELLULAR_IN_PROGRESS;	 Catch:{ ActivityNotFoundException -> 0x006d }
        r2 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x006d }
        com.whatsapp.VoiceService.a(r0, r2, r1);	 Catch:{ ActivityNotFoundException -> 0x006d }
    L_0x005c:
        return r4;
    L_0x005d:
        r0 = new java.lang.Double;
        r1 = r10.getCode();
        r6 = (double) r1;
        r0.<init>(r6);
        r1 = r0;
        goto L_0x0008;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = r4;
        goto L_0x0043;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = az();	 Catch:{ ActivityNotFoundException -> 0x00ae }
        if (r0 != 0) goto L_0x00b2;
    L_0x0075:
        r0 = z(r9);	 Catch:{ ActivityNotFoundException -> 0x00ae }
        if (r0 == 0) goto L_0x0094;
    L_0x007b:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r2 = 426; // 0x1aa float:5.97E-43 double:2.105E-321;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r0 = 2131230881; // 0x7f0800a1 float:1.8077827E38 double:1.0529679617E-314;
        r2 = 1;
        b(r9, r0, r2);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r0 = com.whatsapp.fieldstats.v.CALL_CANCELED_AIRPLANE_MODE_ON;	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r2 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        com.whatsapp.VoiceService.a(r0, r2, r1);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        if (r5 == 0) goto L_0x005c;
    L_0x0094:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x00ac }
        r2 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x00ac }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x00ac }
        r0 = 2131232246; // 0x7f0805f6 float:1.8080596E38 double:1.052968636E-314;
        r2 = 1;
        b(r9, r0, r2);	 Catch:{ ActivityNotFoundException -> 0x00ac }
        r0 = com.whatsapp.fieldstats.v.CALL_CANCELED_NO_NETWORK;	 Catch:{ ActivityNotFoundException -> 0x00ac }
        r2 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x00ac }
        com.whatsapp.VoiceService.a(r0, r2, r1);	 Catch:{ ActivityNotFoundException -> 0x00ac }
        goto L_0x005c;
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ac }
    L_0x00b2:
        r0 = r8.m;	 Catch:{ ActivityNotFoundException -> 0x00eb }
        if (r0 == 0) goto L_0x00ef;
    L_0x00b6:
        r0 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x00eb }
        r0 = com.whatsapp.aup.a(r0);	 Catch:{ ActivityNotFoundException -> 0x00eb }
        if (r0 == 0) goto L_0x00ef;
    L_0x00be:
        r0 = bb;
        r1 = 423; // 0x1a7 float:5.93E-43 double:2.09E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131232239; // 0x7f0805ef float:1.8080582E38 double:1.0529686326E-314;
        r1 = new java.lang.Object[r3];
        r2 = r8.a(r9);
        r1[r4] = r2;
        r0 = r9.getString(r0, r1);
        r1 = a0;	 Catch:{ ActivityNotFoundException -> 0x00ed }
        if (r1 == 0) goto L_0x00e3;
    L_0x00da:
        r1 = a0;	 Catch:{ ActivityNotFoundException -> 0x00ed }
        r2 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x00ed }
        r1.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x00ed }
        if (r5 == 0) goto L_0x005c;
    L_0x00e3:
        r1 = 0;
        b(r9, r0, r1);	 Catch:{ ActivityNotFoundException -> 0x00e9 }
        goto L_0x005c;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00e9 }
    L_0x00ef:
        r0 = r8.m;
        if (r0 == 0) goto L_0x0238;
    L_0x00f3:
        r0 = as;
        r0.l(r8);
        r0 = com.whatsapp.arz.class;
        r0 = r8.a(r0);
        r0 = (com.whatsapp.arz) r0;
        r1 = c(r9);	 Catch:{ ActivityNotFoundException -> 0x016e }
        if (r1 != 0) goto L_0x0172;
    L_0x0106:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x016e }
        r1 = 23;
        if (r0 < r1) goto L_0x015c;
    L_0x010c:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RequestPermissionActivity.class;
        r0.<init>(r9, r1);
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 2130839701; // 0x7f020895 float:1.728442E38 double:1.052774693E-314;
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 2131231633; // 0x7f080391 float:1.8079353E38 double:1.052968333E-314;
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 2131231624; // 0x7f080388 float:1.8079334E38 double:1.0529683287E-314;
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 428; // 0x1ac float:6.0E-43 double:2.115E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r3 = 0;
        r6 = bb;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r7 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r6 = r6[r7];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2[r3] = r6;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r2 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x0170 }
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0170 }
        a(r9, r0);	 Catch:{ ActivityNotFoundException -> 0x0170 }
        if (r5 == 0) goto L_0x0163;
    L_0x015c:
        r0 = 2131230883; // 0x7f0800a3 float:1.8077831E38 double:1.0529679626E-314;
        r1 = 1;
        b(r9, r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0170 }
    L_0x0163:
        r0 = bb;
        r1 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        goto L_0x005c;
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = move-exception;
        throw r0;
    L_0x0172:
        r1 = com.whatsapp.Voip.d();	 Catch:{ ActivityNotFoundException -> 0x019c }
        if (r1 == 0) goto L_0x01af;
    L_0x0178:
        r0 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x019c }
        r1 = com.whatsapp.Voip.getPeerJid();	 Catch:{ ActivityNotFoundException -> 0x019c }
        r0 = r0.equals(r1);	 Catch:{ ActivityNotFoundException -> 0x019c }
        if (r0 == 0) goto L_0x019e;
    L_0x0184:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.VoipActivity.class;
        r0.<init>(r9, r1);
        r1 = bb;
        r2 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r1 = r1[r2];
        r2 = r8.p;
        r0.putExtra(r1, r2);
        r9.startActivity(r0);
        r4 = r3;
        goto L_0x005c;
    L_0x019c:
        r0 = move-exception;
        throw r0;
    L_0x019e:
        r0 = bb;
        r1 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131231103; // 0x7f08017f float:1.8078278E38 double:1.0529680713E-314;
        a(r9, r0, r4);
        goto L_0x005c;
    L_0x01af:
        r1 = com.whatsapp.arz.ALLOW;
        if (r0 != r1) goto L_0x01ef;
    L_0x01b3:
        r0 = new android.content.Intent;
        r1 = bb;
        r4 = 425; // 0x1a9 float:5.96E-43 double:2.1E-321;
        r1 = r1[r4];
        r4 = z();
        r5 = com.whatsapp.VoiceService.class;
        r0.<init>(r1, r2, r4, r5);
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r2 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r2 = r8.p;	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01ed }
        if (r10 == 0) goto L_0x01de;
    L_0x01d1:
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r2 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r2 = r10.getCode();	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01ed }
    L_0x01de:
        r1 = bb;
        r2 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r1 = r1[r2];
        r0.putExtra(r1, r11);
        r9.startService(r0);
        r4 = r3;
        goto L_0x005c;
    L_0x01ed:
        r0 = move-exception;
        throw r0;
    L_0x01ef:
        r1 = new android.content.Intent;
        r2 = com.whatsapp.VoipNotAllowedActivity.class;
        r1.<init>(r9, r2);
        r2 = bb;
        r6 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r2 = r2[r6];
        r6 = r8.p;
        r1.putExtra(r2, r6);
        r2 = com.whatsapp.arz.FORWARD;
        if (r0 != r2) goto L_0x0207;
    L_0x0205:
        if (r5 == 0) goto L_0x0276;
    L_0x0207:
        r2 = com.whatsapp.arz.UPGRADE;	 Catch:{ ActivityNotFoundException -> 0x0236 }
        if (r0 != r2) goto L_0x020d;
    L_0x020b:
        if (r5 == 0) goto L_0x020e;
    L_0x020d:
        r3 = 2;
    L_0x020e:
        r0 = bb;
        r2 = 427; // 0x1ab float:5.98E-43 double:2.11E-321;
        r0 = r0[r2];
        r1.putExtra(r0, r3);
        r9.startActivity(r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x005c;
    L_0x0236:
        r0 = move-exception;
        throw r0;
    L_0x0238:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2 = 424; // 0x1a8 float:5.94E-43 double:2.095E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r4 = bb;	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r5 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2 = r2.append(r4);	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r4 = r8.s();	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2 = r2.append(r4);	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0268 }
        r9.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0268 }
    L_0x0265:
        r4 = r3;
        goto L_0x005c;
    L_0x0268:
        r0 = move-exception;
        r0 = bb;
        r1 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        aR();
        goto L_0x0265;
    L_0x0276:
        r3 = r4;
        goto L_0x020e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.l5, android.app.Activity, com.whatsapp.fieldstats.cd, boolean):boolean");
    }

    void ah() {
        Closeable objectInputStream;
        ClassNotFoundException e;
        Throwable th;
        IOException e2;
        Log.i(bb[496]);
        Closeable closeable = null;
        try {
            if (new File(z().getFilesDir(), bb[495]).exists()) {
                objectInputStream = new ObjectInputStream(z().openFileInput(bb[497]));
                try {
                    ay = (Me) objectInputStream.readObject();
                    closeable = objectInputStream;
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    try {
                        Log.w(bb[498] + e.toString());
                        ao.a(objectInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        ao.a(objectInputStream);
                        throw th;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    Log.e(bb[499] + e2.toString());
                    ao.a(objectInputStream);
                }
            }
            ao.a(closeable);
        } catch (ClassNotFoundException e5) {
            ClassNotFoundException classNotFoundException = e5;
            objectInputStream = null;
            e = classNotFoundException;
            Log.w(bb[498] + e.toString());
            ao.a(objectInputStream);
        } catch (IOException e6) {
            IOException iOException = e6;
            objectInputStream = null;
            e2 = iOException;
            Log.e(bb[499] + e2.toString());
            ao.a(objectInputStream);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectInputStream = null;
            th = th4;
            ao.a(objectInputStream);
            throw th;
        }
    }

    public static void d(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[336], 0).edit();
        try {
            edit.putInt(bb[337], i);
            if (!edit.commit()) {
                Log.e(bb[338]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void w(String str) {
        J(str);
    }

    public static void b(l5 l5Var, boolean z) {
        try {
            l5Var.d = -1;
            a(new avg(l5Var));
            l(l5Var.p);
            if (z) {
                a(l5Var, false);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, int i) {
        try {
            if (!c) {
                return;
            }
            if (wn.q() && str != null) {
                M.b(co.a(str, i));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            try {
                throw e2;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
    }

    static void b(a_ a_Var) {
        try {
            if (!aw.contains(a_Var)) {
                aw.add(a_Var);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void s(String str) {
        a(str, 501);
    }

    private void ac() {
        Closeable closeable = null;
        boolean z = DialogToastActivity.f;
        File[] listFiles = new File(z().getFilesDir(), bb[520]).listFiles();
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file = listFiles[i];
            i++;
            if (z) {
                break;
            }
        }
        if (p(Environment.getExternalStorageState())) {
            int length2 = listFiles.length;
            length = 0;
            Closeable closeable2 = null;
            while (length < length2) {
                File file2 = listFiles[length];
                try {
                    if (!a3.exists()) {
                        a3.mkdirs();
                    }
                    try {
                        closeable2 = Channels.newChannel(new q(e, new File(a3, file2.getName())));
                        closeable = new FileInputStream(file2).getChannel();
                        ak.a((FileChannel) closeable, (WritableByteChannel) closeable2);
                        ao.a(closeable);
                        ao.a(closeable2);
                    } catch (IOException e) {
                        Log.w(bb[519] + e.toString());
                    } catch (Throwable th) {
                        ao.a(closeable);
                        ao.a(closeable2);
                    }
                    int i2 = length + 1;
                    if (!z) {
                        length = i2;
                    } else {
                        return;
                    }
                } catch (IOException e2) {
                    throw e2;
                }
            }
        }
    }

    public static void a8() {
        boolean z = DialogToastActivity.f;
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((tm) it.next()).a();
            if (z) {
                return;
            }
        }
    }

    public static String g(String str) {
        String w = p.w();
        if (w == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return parse.buildUpon().authority(w).path(parse.getHost()).appendEncodedPath(parse.getEncodedPath()).build().toString();
    }

    public static boolean a2() {
        return P;
    }

    public static void a(String str, String str2, String str3, String str4, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2) {
        b(co.a(str, str2, str3, str4, i, bArr, iArr, bArr2, bArr3, bArr4, i2), str);
    }

    public static void d(boolean z) {
        try {
            if (!c) {
                return;
            }
            if (wn.q()) {
                M.b(co.a(z));
                a(null, null, z, wn.q, wn.b, 0, null);
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void d(String str, int i) {
        if (i == 500 || i == 501 || i == 503) {
            try {
                n = System.currentTimeMillis() + 3600000;
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        if (i == 401 && str != null) {
            try {
                f(str);
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
    }

    static Condition am() {
        return aj;
    }

    public static List r(Context context) {
        boolean z = DialogToastActivity.f;
        Object string = context.getSharedPreferences(bb[379], 0).getString(bb[380], null);
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            List arrayList = new ArrayList(Arrays.asList(TextUtils.split(string, ",")));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    if (!str.endsWith(bb[378])) {
                        if (qm.i(str)) {
                            continue;
                        } else {
                            try {
                                if (l5.g(str)) {
                                    continue;
                                } else {
                                    it.remove();
                                    continue;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
            return arrayList;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static String e(int i) {
        switch (i) {
            case at.g /*1*/:
                return bb[31];
            case at.i /*2*/:
                try {
                    return bb[33];
                } catch (NumberFormatException e) {
                    throw e;
                }
            case at.o /*3*/:
                return bb[32];
            default:
                return bb[30];
        }
    }

    public static boolean b(@Nullable String str) {
        try {
            if (!bb[471].equals(str)) {
                if (!bb[473].equals(str)) {
                    return false;
                }
            }
            try {
                if (VERSION.SDK_INT < 23) {
                    return true;
                }
                try {
                    if (h(z(), bb[472]) != 0) {
                        return false;
                    }
                    return true;
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    static Application a(App app) {
        return app.au;
    }

    static void I() {
        as();
    }

    public static void a(@NonNull DialogToastActivity dialogToastActivity, com.whatsapp.protocol.co coVar) {
        if (a(new jm(dialogToastActivity))) {
            AsyncTask a = v.a(coVar, false, (Activity) dialogToastActivity);
            if (a != null) {
                try {
                    bq.a(a, new Void[0]);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean h(com.whatsapp.protocol.co r1) {
        /*
        r0 = r1.c;	 Catch:{ NumberFormatException -> 0x0016 }
        if (r0 != 0) goto L_0x001c;
    L_0x0004:
        r0 = r1.a;	 Catch:{ NumberFormatException -> 0x0018 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0018 }
        if (r0 == 0) goto L_0x0014;
    L_0x000c:
        r0 = r1.A;	 Catch:{ NumberFormatException -> 0x001a }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x001a }
        if (r0 != 0) goto L_0x001c;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r0 = 0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.h(com.whatsapp.protocol.co):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r6, com.whatsapp.protocol.co r7) {
        /*
        r0 = r7.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r0.file;	 Catch:{ NumberFormatException -> 0x0065 }
        if (r1 == 0) goto L_0x0010;
    L_0x0008:
        r1 = r0.file;	 Catch:{ NumberFormatException -> 0x0067 }
        r1 = r1.exists();	 Catch:{ NumberFormatException -> 0x0067 }
        if (r1 != 0) goto L_0x002a;
    L_0x0010:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0069 }
        r2 = 597; // 0x255 float:8.37E-43 double:2.95E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0069 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ NumberFormatException -> 0x0069 }
        r1 = V();	 Catch:{ NumberFormatException -> 0x0069 }
        if (r1 == 0) goto L_0x006b;
    L_0x001f:
        r1 = 2131231164; // 0x7f0801bc float:1.8078401E38 double:1.0529681015E-314;
    L_0x0022:
        r2 = 0;
        a(r6, r1, r2);	 Catch:{ NumberFormatException -> 0x006f }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x006f }
        if (r1 == 0) goto L_0x0064;
    L_0x002a:
        r2 = r6.getPackageManager();	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = r7.c;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = d(r1);	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = 0;
        r5 = z();	 Catch:{ NumberFormatException -> 0x0071 }
        r5 = h(r5);	 Catch:{ NumberFormatException -> 0x0071 }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r6.getString(r1, r3);	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = "";
        r1 = r7.n;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0071 }
        if (r1 == 0) goto L_0x0073;
    L_0x0051:
        r1 = r7.c;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = e(r1);	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x0057:
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r0 = a(r2, r3, r4, r1, r0);
        a(r6, r0);
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r1 = 2131231165; // 0x7f0801bd float:1.8078403E38 double:1.052968102E-314;
        goto L_0x0022;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r1 = r7.n;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(android.content.Context, com.whatsapp.protocol.co):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
        r14 = this;
        r6 = 0;
        r11 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r9 = B;
        aI = r11;
        B = r11;
        l = r11;
        ao = r11;
        aU = r6;
        aU();
        bc();
        com.whatsapp.qa.b();
        if (r9 == 0) goto L_0x0083;
    L_0x001c:
        r0 = O;
        r0.b();
        r0 = Q;
        r0 = r0.c();
        r10 = r0.iterator();
    L_0x002b:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x004d;
    L_0x0031:
        r0 = r10.next();
        r0 = (java.lang.Long) r0;
        r1 = z();
        r2 = com.whatsapp.fieldstats.c2.FAILED_COMMUNICATION;
        r3 = com.whatsapp.fieldstats.bg.FULL;
        r4 = android.os.SystemClock.elapsedRealtime();
        r12 = r0.longValue();
        r4 = r4 - r12;
        com.whatsapp.nf.a(r1, r2, r3, r4, r6);
        if (r8 == 0) goto L_0x002b;
    L_0x004d:
        r0 = Q;
        r0.b();
        r0 = a2;
        r0 = r0.c();
        r10 = r0.iterator();
    L_0x005c:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x007e;
    L_0x0062:
        r0 = r10.next();
        r0 = (java.lang.Long) r0;
        r1 = z();
        r2 = com.whatsapp.fieldstats.c2.FAILED_COMMUNICATION;
        r3 = com.whatsapp.fieldstats.bg.THUMB;
        r4 = android.os.SystemClock.elapsedRealtime();
        r12 = r0.longValue();
        r4 = r4 - r12;
        com.whatsapp.nf.a(r1, r2, r3, r4, r6);
        if (r8 == 0) goto L_0x005c;
    L_0x007e:
        r0 = a2;
        r0.b();
    L_0x0083:
        r0 = h;	 Catch:{ NumberFormatException -> 0x00ad }
        r1 = 2;
        if (r0 != r1) goto L_0x0096;
    L_0x0088:
        r0 = r14.aN;	 Catch:{ NumberFormatException -> 0x00af }
        r1 = z();	 Catch:{ NumberFormatException -> 0x00af }
        r0.a(r1);	 Catch:{ NumberFormatException -> 0x00af }
        r0 = 3;
        h = r0;	 Catch:{ NumberFormatException -> 0x00af }
        if (r8 == 0) goto L_0x00a0;
    L_0x0096:
        r0 = h;	 Catch:{ NumberFormatException -> 0x00b1 }
        r1 = 1;
        if (r0 != r1) goto L_0x00a0;
    L_0x009b:
        if (r9 == 0) goto L_0x00a0;
    L_0x009d:
        X();	 Catch:{ NumberFormatException -> 0x00b3 }
    L_0x00a0:
        r0 = de.greenrobot.event.h.b();
        r1 = new com.whatsapp.a47;
        r1.<init>(r11);
        r0.d(r1);
        return;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.h():void");
    }

    String w() {
        String string = z().getSharedPreferences(bb[479], 0).getString(bb[480], null);
        if (string == null) {
            return null;
        }
        String[] split = string.split(bb[481]);
        try {
            if (split.length != 2) {
                Log.w(bb[482] + string);
                a(z(), null, 0);
                return null;
            }
            try {
                if (Long.parseLong(split[1]) > System.currentTimeMillis()) {
                    return split[0];
                }
                a(z(), null, 0);
                return null;
            } catch (NumberFormatException e) {
                Log.w(bb[478] + split[1]);
                a(z(), null, 0);
                return null;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void t(com.whatsapp.protocol.co coVar) {
        try {
            if (c) {
                M.b(co.e(coVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3, String str4, long j) {
        b(co.a(str, str2, str3, str4, j), str);
    }

    public static boolean aZ() {
        return a59.m;
    }

    @NonNull
    public static String h(Context context) {
        return context.getSharedPreferences(bb[490], 0).getString(bb[491], "");
    }

    private static boolean a(Me me, String str) {
        Closeable objectOutputStream;
        Throwable e;
        Closeable closeable = null;
        try {
            objectOutputStream = new ObjectOutputStream(z().openFileOutput(str, 0));
            try {
                objectOutputStream.writeObject(me);
                ao.a(objectOutputStream);
                return true;
            } catch (FileNotFoundException e2) {
                e = e2;
                try {
                    Log.b(bb[4] + str, e);
                    ao.a(objectOutputStream);
                    return false;
                } catch (Throwable th) {
                    e = th;
                    closeable = objectOutputStream;
                    ao.a(closeable);
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                closeable = objectOutputStream;
                try {
                    Log.b(bb[3] + str, e);
                    ao.a(closeable);
                    return false;
                } catch (Throwable th2) {
                    e = th2;
                    ao.a(closeable);
                    throw e;
                }
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            objectOutputStream = null;
            Log.b(bb[4] + str, e);
            ao.a(objectOutputStream);
            return false;
        } catch (IOException e5) {
            e = e5;
            Log.b(bb[3] + str, e);
            ao.a(closeable);
            return false;
        }
    }

    public static boolean a(com.whatsapp.contact.o oVar, String str, int i, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        try {
            if (c) {
                if (B) {
                    M.b(co.a(oVar, str, i, z, arrayList, arrayList2));
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void r(com.whatsapp.protocol.co r5) {
        /*
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.c;
        r0 = b(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x000b:
        r0 = r5.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r2 = r5.q;	 Catch:{ NumberFormatException -> 0x0034 }
        if (r2 == 0) goto L_0x0021;
    L_0x0013:
        if (r0 == 0) goto L_0x0019;
    L_0x0015:
        r0 = r0.file;	 Catch:{ NumberFormatException -> 0x0038 }
        if (r0 != 0) goto L_0x0021;
    L_0x0019:
        r0 = 0;
        r2 = 0;
        a(r5, r0, r2);	 Catch:{ NumberFormatException -> 0x003a }
        if (r1 == 0) goto L_0x0025;
    L_0x0021:
        r0 = 1;
        a(r5, r0);	 Catch:{ NumberFormatException -> 0x003a }
    L_0x0025:
        if (r1 == 0) goto L_0x002d;
    L_0x0027:
        r0 = 0;
        r2 = 0;
        a(r5, r0, r2);	 Catch:{ NumberFormatException -> 0x003c }
    L_0x002d:
        r0 = aK;
        r1 = -1;
        r0.a(r5, r4, r1);
        return;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.r(com.whatsapp.protocol.co):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r14 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.a2c.a();
        r4 = java.lang.System.currentTimeMillis();
        r6 = android.os.SystemClock.uptimeMillis();
        super.a();	 Catch:{ NumberFormatException -> 0x001f }
        r2 = p;	 Catch:{ NumberFormatException -> 0x001f }
        if (r2 == 0) goto L_0x0021;
    L_0x0015:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x001f }
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x001f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x001f }
    L_0x001e:
        return;
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r2 = bb;
        r8 = 75;
        r2 = r2[r8];
        r8 = com.whatsapp.tp.a(r2);
        r8.b(r0);	 Catch:{ NumberFormatException -> 0x016d }
        r0 = com.whatsapp.hr.a();	 Catch:{ NumberFormatException -> 0x016d }
        s = r0;	 Catch:{ NumberFormatException -> 0x016d }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x016d }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x016d }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x016d }
        r2 = 98;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x016d }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x016d }
        r1 = s;	 Catch:{ NumberFormatException -> 0x016d }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x016d }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x016d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x016d }
        r0 = com.whatsapp.tb.IN_BACKGROUND;	 Catch:{ NumberFormatException -> 0x016d }
        r1 = s();	 Catch:{ NumberFormatException -> 0x016d }
        r8.a(r0, r1);	 Catch:{ NumberFormatException -> 0x016d }
        p = r14;	 Catch:{ NumberFormatException -> 0x016d }
        r0 = z();	 Catch:{ NumberFormatException -> 0x016d }
        com.whatsapp.util.bm.a(r0);	 Catch:{ NumberFormatException -> 0x016d }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x016d }
        r1 = 8;
        if (r0 >= r1) goto L_0x0077;
    L_0x0068:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x016d }
        r1 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x016d }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x016d }
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x016d }
        java.lang.System.setProperty(r0, r1);	 Catch:{ NumberFormatException -> 0x016d }
    L_0x0077:
        r0 = new com.whatsapp.rr;
        r0.<init>();
        org.whispersystems.a2.a(r0);
        r0 = de.greenrobot.event.h.b();
        r0.e(r14);
        r0 = de.greenrobot.event.h.b();
        r1 = new com.whatsapp.amm;
        r1.<init>();
        r0.d(r1);
        r0 = new com.whatsapp.BatteryReceiver;
        r0.<init>();
        r1 = z();
        r0.a(r1);
        r0 = new com.whatsapp.ConnectivityReceiver;
        r0.<init>();
        r1 = z();
        r0.a(r1);
        r0 = new com.whatsapp.ScreenLockReceiver;
        r0.<init>();
        r1 = z();
        r0.a(r1);
        r0 = de.greenrobot.event.h.b();
        r1 = new com.whatsapp.a47;
        r2 = 0;
        r1.<init>(r2);
        r0.d(r1);
        r0 = new com.whatsapp.tc;
        r0.<init>(r14);
        com.whatsapp.protocol.bu.a(r0);
        r0 = z();
        r1 = new android.content.Intent;
        r2 = bb;
        r9 = 82;
        r2 = r2[r9];
        r9 = 0;
        r10 = z();
        r11 = com.whatsapp.AlarmService.class;
        r1.<init>(r2, r9, r10, r11);
        r0.startService(r1);
        r0 = z();
        r1 = bb;
        r2 = 86;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.os.PowerManager) r0;
        r1 = 1;
        r2 = bb;	 Catch:{ NumberFormatException -> 0x016b }
        r9 = 80;
        r2 = r2[r9];	 Catch:{ NumberFormatException -> 0x016b }
        r1 = r0.newWakeLock(r1, r2);	 Catch:{ NumberFormatException -> 0x016b }
        r14.R = r1;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = r14.R;	 Catch:{ NumberFormatException -> 0x016b }
        r2 = 0;
        r1.setReferenceCounted(r2);	 Catch:{ NumberFormatException -> 0x016b }
        r1 = z();	 Catch:{ NumberFormatException -> 0x016b }
        r2 = 2131232074; // 0x7f08054a float:1.8080247E38 double:1.052968551E-314;
        r1 = r1.getString(r2);	 Catch:{ NumberFormatException -> 0x016b }
        v = r1;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = z();	 Catch:{ NumberFormatException -> 0x016b }
        com.whatsapp.util.Log.a(r1);	 Catch:{ NumberFormatException -> 0x016b }
        r1 = z();	 Catch:{ NumberFormatException -> 0x016b }
        com.whatsapp.vn.a(r1);	 Catch:{ NumberFormatException -> 0x016b }
        r1 = new java.io.File;	 Catch:{ NumberFormatException -> 0x016b }
        r2 = z();	 Catch:{ NumberFormatException -> 0x016b }
        r2 = r2.getFilesDir();	 Catch:{ NumberFormatException -> 0x016b }
        r9 = bb;	 Catch:{ NumberFormatException -> 0x016b }
        r10 = 71;
        r9 = r9[r10];	 Catch:{ NumberFormatException -> 0x016b }
        r1.<init>(r2, r9);	 Catch:{ NumberFormatException -> 0x016b }
        N = r1;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = new java.io.File;	 Catch:{ NumberFormatException -> 0x016b }
        r2 = z();	 Catch:{ NumberFormatException -> 0x016b }
        r2 = r2.getFilesDir();	 Catch:{ NumberFormatException -> 0x016b }
        r9 = bb;	 Catch:{ NumberFormatException -> 0x016b }
        r10 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r9 = r9[r10];	 Catch:{ NumberFormatException -> 0x016b }
        r1.<init>(r2, r9);	 Catch:{ NumberFormatException -> 0x016b }
        a5 = r1;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = z();	 Catch:{ NumberFormatException -> 0x016b }
        com.whatsapp.a4d.a(r1);	 Catch:{ NumberFormatException -> 0x016b }
        com.whatsapp.aqu.a();	 Catch:{ NumberFormatException -> 0x016b }
        r14.aN();	 Catch:{ NumberFormatException -> 0x016b }
        com.a.e();	 Catch:{ NumberFormatException -> 0x016b }
        r1 = z();	 Catch:{ NumberFormatException -> 0x016b }
        r1 = com.whatsapp.util.WhatsAppLibLoader.a(r1);	 Catch:{ NumberFormatException -> 0x016b }
        if (r1 != 0) goto L_0x016f;
    L_0x0166:
        r8.b();	 Catch:{ NumberFormatException -> 0x016b }
        goto L_0x001e;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r1 = z();	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = org.whispersystems.jobqueue.h.a(r1);	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = 83;
        r2 = r2[r9];	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = r1.a(r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = 16;
        r1 = r1.a(r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = 4;
        r2 = new org.whispersystems.jobqueue.requirements.a[r2];	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = 0;
        r10 = new com.whatsapp.jobqueue.requirement.c;	 Catch:{ NumberFormatException -> 0x03e4 }
        r10.<init>();	 Catch:{ NumberFormatException -> 0x03e4 }
        r2[r9] = r10;	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = 1;
        r10 = new com.whatsapp.jobqueue.requirement.b;	 Catch:{ NumberFormatException -> 0x03e4 }
        r10.<init>();	 Catch:{ NumberFormatException -> 0x03e4 }
        r2[r9] = r10;	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = 2;
        r10 = new com.whatsapp.jobqueue.requirement.d;	 Catch:{ NumberFormatException -> 0x03e4 }
        r10.<init>();	 Catch:{ NumberFormatException -> 0x03e4 }
        r2[r9] = r10;	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = 3;
        r10 = new com.whatsapp.jobqueue.requirement.a;	 Catch:{ NumberFormatException -> 0x03e4 }
        r10.<init>();	 Catch:{ NumberFormatException -> 0x03e4 }
        r2[r9] = r10;	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = r1.a(r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = new org.whispersystems.jobqueue.l;	 Catch:{ NumberFormatException -> 0x03e4 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = r1.a(r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = r1.a(r14);	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = r1.a();	 Catch:{ NumberFormatException -> 0x03e4 }
        r14.ai = r1;	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = new com.whatsapp.a2p;	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = java.lang.Runtime.getRuntime();	 Catch:{ NumberFormatException -> 0x03e4 }
        r10 = r2.maxMemory();	 Catch:{ NumberFormatException -> 0x03e4 }
        r12 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r10 = r10 / r12;
        r2 = (int) r10;	 Catch:{ NumberFormatException -> 0x03e4 }
        r1.<init>(r14, r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        o = r1;	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = new com.whatsapp.util.bk;	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = new java.io.File;	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = a3;	 Catch:{ NumberFormatException -> 0x03e4 }
        r10 = bb;	 Catch:{ NumberFormatException -> 0x03e4 }
        r11 = 99;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x03e4 }
        r2.<init>(r9, r10);	 Catch:{ NumberFormatException -> 0x03e4 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        e = r1;	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = new com.whatsapp.util.bk;	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = new java.io.File;	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = z();	 Catch:{ NumberFormatException -> 0x03e4 }
        r9 = r9.getFilesDir();	 Catch:{ NumberFormatException -> 0x03e4 }
        r10 = bb;	 Catch:{ NumberFormatException -> 0x03e4 }
        r11 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x03e4 }
        r2.<init>(r9, r10);	 Catch:{ NumberFormatException -> 0x03e4 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x03e4 }
        J = r1;	 Catch:{ NumberFormatException -> 0x03e4 }
        r1 = am;	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = 2;
        if (r1 != r2) goto L_0x020f;
    L_0x0207:
        r1 = j;	 Catch:{ NumberFormatException -> 0x03e4 }
        r2 = 1;
        if (r1 != r2) goto L_0x020f;
    L_0x020c:
        r14.ac();	 Catch:{ NumberFormatException -> 0x03e6 }
    L_0x020f:
        r1 = new com.whatsapp.b1;
        r2 = z();
        r2 = r2.getResources();
        r1.<init>(r2);
        az = r1;
        r1 = android.os.Environment.getExternalStorageState();
        r2 = bb;	 Catch:{ NumberFormatException -> 0x03e8 }
        r9 = 72;
        r2 = r2[r9];	 Catch:{ NumberFormatException -> 0x03e8 }
        r2 = r2.equals(r1);	 Catch:{ NumberFormatException -> 0x03e8 }
        if (r2 == 0) goto L_0x0236;
    L_0x022e:
        r2 = 0;
        E = r2;	 Catch:{ NumberFormatException -> 0x03e8 }
        r2 = 0;
        aX = r2;	 Catch:{ NumberFormatException -> 0x03e8 }
        if (r3 == 0) goto L_0x0273;
    L_0x0236:
        r2 = bb;	 Catch:{ NumberFormatException -> 0x03ea }
        r9 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r2 = r2[r9];	 Catch:{ NumberFormatException -> 0x03ea }
        r2 = r2.equals(r1);	 Catch:{ NumberFormatException -> 0x03ea }
        if (r2 == 0) goto L_0x0253;
    L_0x0242:
        r2 = 0;
        E = r2;	 Catch:{ NumberFormatException -> 0x03ec }
        r2 = 1;
        aX = r2;	 Catch:{ NumberFormatException -> 0x03ec }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x03ec }
        r9 = 93;
        r2 = r2[r9];	 Catch:{ NumberFormatException -> 0x03ec }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x03ec }
        if (r3 == 0) goto L_0x0273;
    L_0x0253:
        r2 = 1;
        E = r2;	 Catch:{ NumberFormatException -> 0x03ee }
        r2 = 0;
        aX = r2;	 Catch:{ NumberFormatException -> 0x03ee }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03ee }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x03ee }
        r9 = bb;	 Catch:{ NumberFormatException -> 0x03ee }
        r10 = 90;
        r9 = r9[r10];	 Catch:{ NumberFormatException -> 0x03ee }
        r2 = r2.append(r9);	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = r2.append(r1);	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x03ee }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x03ee }
    L_0x0273:
        r1 = am;	 Catch:{ NumberFormatException -> 0x040a }
        switch(r1) {
            case 0: goto L_0x03f0;
            case 1: goto L_0x03f6;
            case 2: goto L_0x03fc;
            case 3: goto L_0x0402;
            default: goto L_0x0278;
        };
    L_0x0278:
        r1 = 5;
        com.whatsapp.util.Log.a(r1);	 Catch:{ NumberFormatException -> 0x0412 }
    L_0x027c:
        r1 = z();
        r2 = bb;
        r9 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r2 = r2[r9];
        r9 = 0;
        r9 = r1.getSharedPreferences(r2, r9);
        r1 = bb;
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r1 = r1[r2];
        r2 = bb;
        r10 = 66;
        r2 = r2[r10];
        r1 = r9.getString(r1, r2);
        r1 = com.whatsapp.a2q.a(r1);
        if (r1 == 0) goto L_0x030b;
    L_0x02a1:
        r2 = bb;
        r10 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r2 = r2[r10];
        r2 = com.whatsapp.a2q.a(r2);
        if (r2 == 0) goto L_0x030b;
    L_0x02ad:
        r1 = r2.a(r1);	 Catch:{ NumberFormatException -> 0x0414 }
        y = r1;	 Catch:{ NumberFormatException -> 0x0414 }
        r1 = y;	 Catch:{ NumberFormatException -> 0x0414 }
        if (r1 == 0) goto L_0x030b;
    L_0x02b7:
        com.whatsapp.auc.h();
        r1 = r9.edit();
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0416 }
        r10 = 100;
        r2 = r2[r10];	 Catch:{ NumberFormatException -> 0x0416 }
        r10 = bb;	 Catch:{ NumberFormatException -> 0x0416 }
        r11 = 79;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x0416 }
        r2 = r1.putString(r2, r10);	 Catch:{ NumberFormatException -> 0x0416 }
        r2 = r2.commit();	 Catch:{ NumberFormatException -> 0x0416 }
        if (r2 != 0) goto L_0x02dd;
    L_0x02d4:
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0416 }
        r10 = 70;
        r2 = r2[r10];	 Catch:{ NumberFormatException -> 0x0416 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x0416 }
    L_0x02dd:
        r2 = z();
        r2 = t(r2);
        r10 = 3;
        if (r2 >= r10) goto L_0x02f0;
    L_0x02e8:
        r2 = z();	 Catch:{ NumberFormatException -> 0x0418 }
        r10 = 0;
        d(r2, r10);	 Catch:{ NumberFormatException -> 0x0418 }
    L_0x02f0:
        r2 = bb;
        r10 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r2 = r2[r10];
        r10 = java.lang.System.currentTimeMillis();
        r1.putLong(r2, r10);
        r2 = bb;
        r10 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r2 = r2[r10];
        r10 = 1;
        r1 = r1.putBoolean(r2, r10);
        r1.commit();
    L_0x030b:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x041a }
        r2 = 67;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x041a }
        r10 = T;	 Catch:{ NumberFormatException -> 0x041a }
        r10 = r9.getLong(r1, r10);	 Catch:{ NumberFormatException -> 0x041a }
        T = r10;	 Catch:{ NumberFormatException -> 0x041a }
        r1 = N;	 Catch:{ NumberFormatException -> 0x041a }
        r1 = r1.exists();	 Catch:{ NumberFormatException -> 0x041a }
        if (r1 == 0) goto L_0x032d;
    L_0x0321:
        r1 = y;	 Catch:{ NumberFormatException -> 0x041a }
        if (r1 != 0) goto L_0x041e;
    L_0x0325:
        r1 = 1;
    L_0x0326:
        G = r1;
        r1 = N;
        r1.delete();
    L_0x032d:
        r14.af();
        r1 = z();
        r2 = bb;
        r10 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r2 = r2[r10];
        r1 = r1.getSystemService(r2);
        r1 = (android.app.ActivityManager) r1;
        w = r1;
        r1 = z();
        r2 = bb;
        r10 = 74;
        r2 = r2[r10];
        r1 = r1.getSystemService(r2);
        r1 = (android.telephony.TelephonyManager) r1;
        W = r1;
        r1 = z();
        r2 = bb;
        r10 = 87;
        r2 = r2[r10];
        r1 = r1.getSystemService(r2);
        r1 = (android.net.ConnectivityManager) r1;
        ad = r1;
        r1 = z();
        r1 = r1.getContentResolver();
        at = r1;
        r1 = bb;
        r2 = 68;
        r1 = r1[r2];
        r1 = r14.o(r1);
        if (r1 != 0) goto L_0x037c;
    L_0x037c:
        r1 = w;
        r10 = r1.getRunningAppProcesses();
        r1 = 1;
        if (r10 == 0) goto L_0x03cd;
    L_0x0385:
        r11 = r10.iterator();
        r2 = r1;
    L_0x038a:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x09ad;
    L_0x0390:
        r1 = r11.next();
        r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1;
        r12 = android.os.Process.myPid();	 Catch:{ NumberFormatException -> 0x0421 }
        r13 = r1.pid;	 Catch:{ NumberFormatException -> 0x0421 }
        if (r12 != r13) goto L_0x09aa;
    L_0x039e:
        r12 = bb;	 Catch:{ NumberFormatException -> 0x0421 }
        r13 = 88;
        r12 = r12[r13];	 Catch:{ NumberFormatException -> 0x0421 }
        r13 = r1.processName;	 Catch:{ NumberFormatException -> 0x0421 }
        r12 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0421 }
        if (r12 != 0) goto L_0x09aa;
    L_0x03ac:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r12 = bb;
        r13 = 92;
        r12 = r12[r13];
        r2 = r2.append(r12);
        r1 = r1.processName;
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        if (r3 == 0) goto L_0x03cd;
    L_0x03cb:
        if (r3 == 0) goto L_0x09a7;
    L_0x03cd:
        if (r1 == 0) goto L_0x03d4;
    L_0x03cf:
        a(r10);	 Catch:{ NumberFormatException -> 0x0423 }
        if (r3 == 0) goto L_0x0425;
    L_0x03d4:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x03e2 }
        r1 = 81;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03e2 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x03e2 }
        r8.b();	 Catch:{ NumberFormatException -> 0x03e2 }
        goto L_0x001e;
    L_0x03e2:
        r0 = move-exception;
        throw r0;
    L_0x03e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e6 }
    L_0x03e6:
        r0 = move-exception;
        throw r0;
    L_0x03e8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ea }
    L_0x03ea:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ec }
    L_0x03ec:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ee }
    L_0x03ee:
        r0 = move-exception;
        throw r0;
    L_0x03f0:
        r1 = 3;
        com.whatsapp.util.Log.a(r1);	 Catch:{ NumberFormatException -> 0x040a }
        if (r3 == 0) goto L_0x027c;
    L_0x03f6:
        r1 = 4;
        com.whatsapp.util.Log.a(r1);	 Catch:{ NumberFormatException -> 0x040c }
        if (r3 == 0) goto L_0x027c;
    L_0x03fc:
        r1 = 4;
        com.whatsapp.util.Log.a(r1);	 Catch:{ NumberFormatException -> 0x040e }
        if (r3 == 0) goto L_0x027c;
    L_0x0402:
        r1 = 5;
        com.whatsapp.util.Log.a(r1);	 Catch:{ NumberFormatException -> 0x0410 }
        if (r3 == 0) goto L_0x027c;
    L_0x0408:
        goto L_0x0278;
    L_0x040a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x040c }
    L_0x040c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x040e }
    L_0x040e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0410 }
    L_0x0410:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0412 }
    L_0x0412:
        r0 = move-exception;
        throw r0;
    L_0x0414:
        r0 = move-exception;
        throw r0;
    L_0x0416:
        r0 = move-exception;
        throw r0;
    L_0x0418:
        r0 = move-exception;
        throw r0;
    L_0x041a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x041c }
    L_0x041c:
        r0 = move-exception;
        throw r0;
    L_0x041e:
        r1 = 0;
        goto L_0x0326;
    L_0x0421:
        r0 = move-exception;
        throw r0;
    L_0x0423:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e2 }
    L_0x0425:
        r14.aB();
        r1 = W;
        r1 = r1.getPhoneType();
        r2 = 1;
        if (r1 != r2) goto L_0x046c;
    L_0x0431:
        r1 = W;
        r1 = r1.getNetworkOperator();
        if (r1 == 0) goto L_0x046c;
    L_0x0439:
        r2 = r1.length();	 Catch:{ NumberFormatException -> 0x0944 }
        r3 = 5;
        if (r2 < r3) goto L_0x046c;
    L_0x0440:
        r2 = r1.length();	 Catch:{ NumberFormatException -> 0x0946 }
        r3 = 6;
        if (r2 > r3) goto L_0x046c;
    L_0x0447:
        r2 = 0;
        r3 = 3;
        r2 = r1.substring(r2, r3);
        r3 = 3;
        r1 = r1.substring(r3);
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0948 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NumberFormatException -> 0x0948 }
    L_0x045a:
        r3 = z();
        r10 = com.whatsapp.fieldstats.bn.MCC;
        com.whatsapp.fieldstats.i.a(r3, r10, r2);
        r2 = z();
        r3 = com.whatsapp.fieldstats.bn.MNC;
        com.whatsapp.fieldstats.i.a(r2, r3, r1);
    L_0x046c:
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.ax.ANDROID;	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.APP_VERSION;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0956 }
        r10 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r3 = r3[r10];	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.OS_VERSION;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = android.os.Build.VERSION.RELEASE;	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.DEVICE_NAME;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0956 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x0956 }
        r10 = android.os.Build.MANUFACTURER;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = r3.append(r10);	 Catch:{ NumberFormatException -> 0x0956 }
        r10 = "-";
        r3 = r3.append(r10);	 Catch:{ NumberFormatException -> 0x0956 }
        r10 = android.os.Build.MODEL;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = r3.append(r10);	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.MEM_CLASS;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r10 = com.whatsapp.memory.c.a(r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = (int) r10;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.YEAR_CLASS;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = com.whatsapp.qt.a(r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.DEVICE_MANUFACTURER;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.DEVICE_MODEL;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = android.os.Build.MODEL;	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.ANDROID_API_LEVEL;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = com.whatsapp.fieldstats.bn.OS_BUILD_NUMBER;	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = android.os.Build.DISPLAY;	 Catch:{ NumberFormatException -> 0x0956 }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0956 }
        r2 = z();	 Catch:{ NumberFormatException -> 0x0956 }
        r3 = com.whatsapp.fieldstats.bn.APP_IS_BETA_RELEASE;	 Catch:{ NumberFormatException -> 0x0956 }
        r1 = j;	 Catch:{ NumberFormatException -> 0x0956 }
        if (r1 == 0) goto L_0x051e;
    L_0x0519:
        r1 = j;	 Catch:{ NumberFormatException -> 0x0956 }
        r10 = 2;
        if (r1 != r10) goto L_0x0522;
    L_0x051e:
        r1 = am;	 Catch:{ NumberFormatException -> 0x0958 }
        if (r1 == 0) goto L_0x095c;
    L_0x0522:
        r1 = 1;
    L_0x0523:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ NumberFormatException -> 0x095f }
        com.whatsapp.fieldstats.i.a(r2, r3, r1);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = z();	 Catch:{ NumberFormatException -> 0x095f }
        r2 = com.whatsapp.fieldstats.bn.LANGUAGE_CODE;	 Catch:{ NumberFormatException -> 0x095f }
        r3 = com.whatsapp.aqu.g();	 Catch:{ NumberFormatException -> 0x095f }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = z();	 Catch:{ NumberFormatException -> 0x095f }
        r2 = com.whatsapp.fieldstats.bn.LOCATION_CODE;	 Catch:{ NumberFormatException -> 0x095f }
        r3 = com.whatsapp.aqu.c();	 Catch:{ NumberFormatException -> 0x095f }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = z();	 Catch:{ NumberFormatException -> 0x095f }
        r2 = com.whatsapp.fieldstats.bn.RECEIPTS_ENABLED;	 Catch:{ NumberFormatException -> 0x095f }
        r3 = n();	 Catch:{ NumberFormatException -> 0x095f }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ NumberFormatException -> 0x095f }
        com.whatsapp.fieldstats.i.a(r1, r2, r3);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x095f }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x095f }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x095f }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x095f }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x095f }
        r2 = android.os.Build.DISPLAY;	 Catch:{ NumberFormatException -> 0x095f }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x095f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = new com.whatsapp.ae1;	 Catch:{ NumberFormatException -> 0x095f }
        r1.<init>(r14);	 Catch:{ NumberFormatException -> 0x095f }
        com.whatsapp.util.bq.a(r1);	 Catch:{ NumberFormatException -> 0x095f }
        r1 = a5;	 Catch:{ NumberFormatException -> 0x095f }
        r1 = r1.exists();	 Catch:{ NumberFormatException -> 0x095f }
        if (r1 == 0) goto L_0x05c3;
    L_0x0581:
        r1 = G;	 Catch:{ NumberFormatException -> 0x095f }
        if (r1 != 0) goto L_0x05be;
    L_0x0585:
        r1 = y;	 Catch:{ NumberFormatException -> 0x0961 }
        if (r1 != 0) goto L_0x05be;
    L_0x0589:
        r2 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x0963 }
        r1 = new java.io.FileReader;	 Catch:{ IOException -> 0x0963 }
        r3 = a5;	 Catch:{ IOException -> 0x0963 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0963 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x0963 }
        r1 = r2.readLine();	 Catch:{ IOException -> 0x0963 }
        r2.close();	 Catch:{ IOException -> 0x0963 }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IOException -> 0x0963 }
        if (r2 == 0) goto L_0x05a8;
    L_0x05a2:
        r1 = bb;	 Catch:{ IOException -> 0x0963 }
        r2 = 73;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0963 }
    L_0x05a8:
        r2 = new com.whatsapp.fieldstats.a1;
        r2.<init>();
        r3 = bb;
        r10 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r3 = r3[r10];
        r2.a = r3;
        r2.b = r1;
        r1 = z();
        com.whatsapp.fieldstats.i.a(r1, r2);
    L_0x05be:
        r1 = a5;
        r1.delete();
    L_0x05c3:
        r1 = am;	 Catch:{ NumberFormatException -> 0x096a }
        r2 = 1;
        if (r1 < r2) goto L_0x05d0;
    L_0x05c8:
        r1 = new com.whatsapp.aqe;	 Catch:{ NumberFormatException -> 0x096a }
        r1.<init>(r14);	 Catch:{ NumberFormatException -> 0x096a }
        com.whatsapp.util.bq.a(r1);	 Catch:{ NumberFormatException -> 0x096a }
    L_0x05d0:
        r1 = new android.os.HandlerThread;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r10 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r3 = r3[r10];
        r2 = r2.append(r3);
        r3 = com.whatsapp.util.Log.f();
        r2 = r2.append(r3);
        r3 = 41;
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 10;
        r1.<init>(r2, r3);
        r1.start();	 Catch:{ NumberFormatException -> 0x096c }
        r2 = new android.os.Handler;	 Catch:{ NumberFormatException -> 0x096c }
        r1 = r1.getLooper();	 Catch:{ NumberFormatException -> 0x096c }
        r2.<init>(r1);	 Catch:{ NumberFormatException -> 0x096c }
        q = r2;	 Catch:{ NumberFormatException -> 0x096c }
        r1 = am;	 Catch:{ NumberFormatException -> 0x096c }
        r2 = 1;
        if (r1 == r2) goto L_0x0610;
    L_0x060b:
        r1 = am;	 Catch:{ NumberFormatException -> 0x096c }
        r2 = 2;
        if (r1 != r2) goto L_0x0613;
    L_0x0610:
        ax();	 Catch:{ NumberFormatException -> 0x096e }
    L_0x0613:
        bc();	 Catch:{ NumberFormatException -> 0x0970 }
        r1 = W;	 Catch:{ NumberFormatException -> 0x0970 }
        r2 = new com.whatsapp.ad0;	 Catch:{ NumberFormatException -> 0x0970 }
        r2.<init>(r14);	 Catch:{ NumberFormatException -> 0x0970 }
        r3 = 32;
        r1.listen(r2, r3);	 Catch:{ NumberFormatException -> 0x0970 }
        r14.ah();	 Catch:{ NumberFormatException -> 0x0970 }
        a4();	 Catch:{ NumberFormatException -> 0x0970 }
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0970 }
        if (r1 == 0) goto L_0x063c;
    L_0x062c:
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0970 }
        r1 = r1.jabber_id;	 Catch:{ NumberFormatException -> 0x0970 }
        if (r1 == 0) goto L_0x063c;
    L_0x0632:
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0972 }
        r1 = r1.jabber_id;	 Catch:{ NumberFormatException -> 0x0972 }
        r1 = com.whatsapp.ve.b(r1);	 Catch:{ NumberFormatException -> 0x0972 }
        K = r1;	 Catch:{ NumberFormatException -> 0x0972 }
    L_0x063c:
        r1 = z();
        r1 = r1.getFilesDir();
        com.whatsapp.amd.a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 77;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = z();
        r10 = ak();
        r2 = android.text.format.Formatter.formatFileSize(r2, r10);
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = z();
        B(r1);
        r1 = z();
        com.whatsapp.memory.dump.MemoryDumpUploadService.a(r1);
        r1 = new android.content.Intent;
        r2 = bb;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = bb;
        r3 = 91;
        r2 = r2[r3];
        r1 = r1.setPackage(r2);
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0974 }
        r3 = 97;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0974 }
        r10 = -1;
        r2 = r9.getLong(r2, r10);	 Catch:{ NumberFormatException -> 0x0974 }
        r10 = 0;
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x06c2;
    L_0x06a2:
        r2 = z();	 Catch:{ NumberFormatException -> 0x0974 }
        r3 = 0;
        r9 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r1 = android.app.PendingIntent.getBroadcast(r2, r3, r1, r9);	 Catch:{ NumberFormatException -> 0x0974 }
        if (r1 != 0) goto L_0x06c2;
    L_0x06af:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0976 }
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0976 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0976 }
        r1 = r14.aS;	 Catch:{ NumberFormatException -> 0x0976 }
        r2 = z();	 Catch:{ NumberFormatException -> 0x0976 }
        r3 = 0;
        r1.onReceive(r2, r3);	 Catch:{ NumberFormatException -> 0x0976 }
    L_0x06c2:
        r1 = bb;
        r2 = 96;
        r1 = r1[r2];
        r1 = com.whatsapp.tp.a(r1);
        r1.e();	 Catch:{ NumberFormatException -> 0x0978 }
        r2 = new com.whatsapp.ael;	 Catch:{ NumberFormatException -> 0x0978 }
        r3 = z();	 Catch:{ NumberFormatException -> 0x0978 }
        r2.<init>(r3);	 Catch:{ NumberFormatException -> 0x0978 }
        aK = r2;	 Catch:{ NumberFormatException -> 0x0978 }
        r2 = z();	 Catch:{ NumberFormatException -> 0x0978 }
        r2 = t(r2);	 Catch:{ NumberFormatException -> 0x0978 }
        r3 = 6;
        if (r2 != r3) goto L_0x06f2;
    L_0x06e5:
        r2 = z();	 Catch:{ NumberFormatException -> 0x0978 }
        r3 = r14.au;	 Catch:{ NumberFormatException -> 0x0978 }
        r3 = com.whatsapp.awc.a(r3);	 Catch:{ NumberFormatException -> 0x0978 }
        com.whatsapp.DeleteAccountConfirmation.a(r2, r3);	 Catch:{ NumberFormatException -> 0x0978 }
    L_0x06f2:
        com.whatsapp.qa.a();	 Catch:{ NumberFormatException -> 0x097a }
        r2 = aK;	 Catch:{ NumberFormatException -> 0x097a }
        r3 = new com.whatsapp.atw;	 Catch:{ NumberFormatException -> 0x097a }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x097a }
        r2.b(r3);	 Catch:{ NumberFormatException -> 0x097a }
        r2 = new com.whatsapp.kl;	 Catch:{ NumberFormatException -> 0x097a }
        r3 = z();	 Catch:{ NumberFormatException -> 0x097a }
        r2.<init>(r3);	 Catch:{ NumberFormatException -> 0x097a }
        as = r2;	 Catch:{ NumberFormatException -> 0x097a }
        r2 = new com.whatsapp.fs;	 Catch:{ NumberFormatException -> 0x097a }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x097a }
        a1 = r2;	 Catch:{ NumberFormatException -> 0x097a }
        r2 = ay;	 Catch:{ NumberFormatException -> 0x097a }
        if (r2 == 0) goto L_0x073c;
    L_0x0715:
        r2 = aK;	 Catch:{ NumberFormatException -> 0x097a }
        r2 = r2.c();	 Catch:{ NumberFormatException -> 0x097a }
        if (r2 == 0) goto L_0x073c;
    L_0x071d:
        r2 = bb;	 Catch:{ NumberFormatException -> 0x097c }
        r3 = 78;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x097c }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x097c }
        r2 = aK;	 Catch:{ NumberFormatException -> 0x097c }
        r2.m();	 Catch:{ NumberFormatException -> 0x097c }
        r2 = z();	 Catch:{ NumberFormatException -> 0x097c }
        e(r2);	 Catch:{ NumberFormatException -> 0x097c }
        r2 = z();	 Catch:{ NumberFormatException -> 0x097c }
        com.whatsapp.messaging.MessageService.b(r2);	 Catch:{ NumberFormatException -> 0x097c }
        x();	 Catch:{ NumberFormatException -> 0x097c }
    L_0x073c:
        r1.d();
        com.whatsapp.MediaTranscodeService.a();
        r1 = z();
        r2 = bb;
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r2 = r2[r3];
        r3 = 0;
        r1 = r1.getSharedPreferences(r2, r3);
        if (r1 == 0) goto L_0x0763;
    L_0x0753:
        r2 = bb;	 Catch:{ NumberFormatException -> 0x097e }
        r3 = 95;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x097e }
        r3 = 0;
        r1 = r1.getBoolean(r2, r3);	 Catch:{ NumberFormatException -> 0x097e }
        if (r1 != 0) goto L_0x0763;
    L_0x0760:
        j();	 Catch:{ NumberFormatException -> 0x0980 }
    L_0x0763:
        r1 = z();
        r1 = r1.getContentResolver();
        r2 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r3 = 1;
        r9 = aA;
        r1.registerContentObserver(r2, r3, r9);
        r14.aS();
        r1 = z();
        r1 = android.support.v4.app.NotificationManagerCompat.from(r1);
        r2 = 2;
        r1.cancel(r2);
        r14.a6();
        r1 = J;
        r1.d();
        r1 = ad;
        r1 = r1.getBackgroundDataSetting();
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0982 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0982 }
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0982 }
        r9 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r3 = r3[r9];	 Catch:{ NumberFormatException -> 0x0982 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0982 }
        r2 = r2.append(r1);	 Catch:{ NumberFormatException -> 0x0982 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0982 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0982 }
        if (r1 != 0) goto L_0x07b4;
    L_0x07ac:
        r1 = z();	 Catch:{ NumberFormatException -> 0x0982 }
        r2 = 1;
        d(r1, r2);	 Catch:{ NumberFormatException -> 0x0982 }
    L_0x07b4:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0984 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0984 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0984 }
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0984 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0984 }
        r2 = z();	 Catch:{ NumberFormatException -> 0x0984 }
        r2 = C(r2);	 Catch:{ NumberFormatException -> 0x0984 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0984 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0984 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0984 }
        r1 = j;	 Catch:{ NumberFormatException -> 0x0984 }
        r2 = 1;
        if (r1 != r2) goto L_0x0806;
    L_0x07db:
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0984 }
        if (r1 == 0) goto L_0x07e6;
    L_0x07df:
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0986 }
        r1 = r1.jabber_id;	 Catch:{ NumberFormatException -> 0x0986 }
        com.whatsapp.auc.b(r1);	 Catch:{ NumberFormatException -> 0x0986 }
    L_0x07e6:
        r1 = at;	 Catch:{ SettingNotFoundException -> 0x098a }
        if (r1 == 0) goto L_0x0806;
    L_0x07ea:
        r1 = at;	 Catch:{ SettingNotFoundException -> 0x098a }
        r2 = bb;	 Catch:{ SettingNotFoundException -> 0x098a }
        r3 = 94;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x098a }
        r1 = android.provider.Settings.Secure.getInt(r1, r2);	 Catch:{ SettingNotFoundException -> 0x098a }
        r2 = 1;
        if (r1 != r2) goto L_0x0806;
    L_0x07f9:
        r1 = z();	 Catch:{ NumberFormatException -> 0x0988 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0988 }
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0988 }
        com.whatsapp.auc.a(r1, r2);	 Catch:{ NumberFormatException -> 0x0988 }
    L_0x0806:
        r1 = new com.whatsapp.util.b5;
        r2 = z();
        r1.<init>(r2);
        al = r1;
        r1 = al;
        com.whatsapp.util.bq.a(r1);
        r1 = z();
        r2 = com.whatsapp.fieldstats.bn.LIBC_QEMU_PRESENT;
        r3 = com.whatsapp.ve.l();
        r3 = java.lang.Boolean.valueOf(r3);
        com.whatsapp.fieldstats.i.a(r1, r2, r3);
        r1 = z();
        r2 = com.whatsapp.fieldstats.bn.IS_ROOTED;
        r3 = com.whatsapp.ve.F();
        r3 = java.lang.Boolean.valueOf(r3);
        com.whatsapp.fieldstats.i.a(r1, r2, r3);
        r1 = z();
        r2 = com.whatsapp.fieldstats.bn.IS_USING_CUSTOM_ROM;
        r3 = com.whatsapp.ve.C();
        r3 = java.lang.Boolean.valueOf(r3);
        com.whatsapp.fieldstats.i.a(r1, r2, r3);
        r1 = z();
        s(r1);
        r1 = aI();
        if (r1 == 0) goto L_0x0872;
    L_0x0856:
        r1 = bb;
        r2 = 69;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = new android.os.Handler;
        r2 = android.os.Looper.getMainLooper();
        r1.<init>(r2);
        r2 = new com.whatsapp.alz;
        r2.<init>(r14);
        r10 = 2600; // 0xa28 float:3.643E-42 double:1.2846E-320;
        r1.postDelayed(r2, r10);
    L_0x0872:
        r1 = am;
        r2 = 3;
        if (r1 != r2) goto L_0x0893;
    L_0x0877:
        r2 = new android.util.DisplayMetrics;
        r2.<init>();
        r1 = z();
        r3 = bb;
        r9 = 76;
        r3 = r3[r9];
        r1 = r1.getSystemService(r3);
        r1 = (android.view.WindowManager) r1;
        r1 = r1.getDefaultDisplay();
        r1.getMetrics(r2);
    L_0x0893:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x098d }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x098d }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x098d }
        r3 = 89;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x098d }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x098d }
        r0 = r0.isScreenOn();	 Catch:{ NumberFormatException -> 0x098d }
        if (r0 == 0) goto L_0x098f;
    L_0x08a8:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x098d }
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x098d }
    L_0x08ae:
        r0 = r1.append(r0);	 Catch:{ NumberFormatException -> 0x0997 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0997 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0997 }
        r0 = be();	 Catch:{ NumberFormatException -> 0x0997 }
        if (r0 == 0) goto L_0x08c2;
    L_0x08bf:
        y();	 Catch:{ NumberFormatException -> 0x0997 }
    L_0x08c2:
        r0 = a2();	 Catch:{ NumberFormatException -> 0x0999 }
        if (r0 == 0) goto L_0x08d3;
    L_0x08c8:
        r0 = new com.whatsapp.a5e;	 Catch:{ NumberFormatException -> 0x0999 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0999 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0999 }
        aR = r0;	 Catch:{ NumberFormatException -> 0x0999 }
    L_0x08d3:
        r0 = new com.whatsapp.au_;	 Catch:{ NumberFormatException -> 0x099b }
        r0.<init>(r14);	 Catch:{ NumberFormatException -> 0x099b }
        com.whatsapp.util.bq.a(r0);	 Catch:{ NumberFormatException -> 0x099b }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x099b }
        r1 = 14;
        if (r0 < r1) goto L_0x08ed;
    L_0x08e1:
        r0 = z();	 Catch:{ NumberFormatException -> 0x099b }
        r1 = new com.whatsapp.z6;	 Catch:{ NumberFormatException -> 0x099b }
        r1.<init>(r14);	 Catch:{ NumberFormatException -> 0x099b }
        r0.registerActivityLifecycleCallbacks(r1);	 Catch:{ NumberFormatException -> 0x099b }
    L_0x08ed:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x099d }
        r1 = 23;
        if (r0 < r1) goto L_0x08fb;
    L_0x08f3:
        r0 = new com.whatsapp.a_w;	 Catch:{ NumberFormatException -> 0x099d }
        r0.<init>(r14);	 Catch:{ NumberFormatException -> 0x099d }
        com.whatsapp.util.bq.a(r0);	 Catch:{ NumberFormatException -> 0x099d }
    L_0x08fb:
        r0 = j;	 Catch:{ NumberFormatException -> 0x099f }
        r1 = 1;
        if (r0 == r1) goto L_0x0909;
    L_0x0900:
        r0 = j;	 Catch:{ NumberFormatException -> 0x09a1 }
        if (r0 != 0) goto L_0x0912;
    L_0x0904:
        r0 = am;	 Catch:{ NumberFormatException -> 0x09a3 }
        r1 = 2;
        if (r0 != r1) goto L_0x0912;
    L_0x0909:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x09a5 }
        r1 = 21;
        if (r0 >= r1) goto L_0x0912;
    L_0x090f:
        aq();	 Catch:{ NumberFormatException -> 0x09a5 }
    L_0x0912:
        r0 = z();
        com.whatsapp.gcm.experiment.d.a(r0);
        r0 = java.lang.System.currentTimeMillis();
        r0 = r0 - r4;
        r2 = android.os.SystemClock.uptimeMillis();
        r2 = r2 - r6;
        r4 = z();
        r5 = com.whatsapp.fieldstats.a.APP_LAUNCH_T;
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        com.whatsapp.fieldstats.i.a(r4, r5, r0);
        r0 = z();
        r1 = com.whatsapp.fieldstats.a.APP_LAUNCH_CPU_T;
        r2 = (double) r2;
        r2 = java.lang.Double.valueOf(r2);
        com.whatsapp.fieldstats.i.a(r0, r1, r2);
        r8.d();
        goto L_0x001e;
    L_0x0944:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0946 }
    L_0x0946:
        r0 = move-exception;
        throw r0;
    L_0x0948:
        r1 = move-exception;
        r2 = bb;
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r1);
        r2 = 0;
        r1 = 0;
        goto L_0x045a;
    L_0x0956:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0958 }
    L_0x0958:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x095a }
    L_0x095a:
        r0 = move-exception;
        throw r0;
    L_0x095c:
        r1 = 0;
        goto L_0x0523;
    L_0x095f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0961 }
    L_0x0961:
        r0 = move-exception;
        throw r0;
    L_0x0963:
        r1 = move-exception;
        r1 = r1.toString();
        goto L_0x05a8;
    L_0x096a:
        r0 = move-exception;
        throw r0;
    L_0x096c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x096e }
    L_0x096e:
        r0 = move-exception;
        throw r0;
    L_0x0970:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0972 }
    L_0x0972:
        r0 = move-exception;
        throw r0;
    L_0x0974:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0976 }
    L_0x0976:
        r0 = move-exception;
        throw r0;
    L_0x0978:
        r0 = move-exception;
        throw r0;
    L_0x097a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x097c }
    L_0x097c:
        r0 = move-exception;
        throw r0;
    L_0x097e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0980 }
    L_0x0980:
        r0 = move-exception;
        throw r0;
    L_0x0982:
        r0 = move-exception;
        throw r0;
    L_0x0984:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0986 }
    L_0x0986:
        r0 = move-exception;
        throw r0;
    L_0x0988:
        r1 = move-exception;
        throw r1;	 Catch:{ SettingNotFoundException -> 0x098a }
    L_0x098a:
        r1 = move-exception;
        goto L_0x0806;
    L_0x098d:
        r0 = move-exception;
        throw r0;
    L_0x098f:
        r0 = bb;
        r2 = 85;
        r0 = r0[r2];
        goto L_0x08ae;
    L_0x0997:
        r0 = move-exception;
        throw r0;
    L_0x0999:
        r0 = move-exception;
        throw r0;
    L_0x099b:
        r0 = move-exception;
        throw r0;
    L_0x099d:
        r0 = move-exception;
        throw r0;
    L_0x099f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09a1 }
    L_0x09a1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09a3 }
    L_0x09a3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09a5 }
    L_0x09a5:
        r0 = move-exception;
        throw r0;
    L_0x09a7:
        r2 = r1;
        goto L_0x038a;
    L_0x09aa:
        r1 = r2;
        goto L_0x03cb;
    L_0x09ad:
        r1 = r2;
        goto L_0x03cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a():void");
    }

    public static void b(com.whatsapp.protocol.co coVar, l5 l5Var) {
        boolean z = DialogToastActivity.f;
        if (l5Var.m()) {
            coVar.x = true;
            aoy c = qm.c(l5Var.p);
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : c.l()) {
                try {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(str);
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            coVar.e = l5Var.q;
            coVar.t = stringBuilder.toString();
        }
    }

    public static void a(int i, String str, String str2) {
        try {
            if (c && str != null) {
                M.b(co.a(i, str, str2));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean a(Me me) {
        Log.i(bb[414]);
        return a(me, bb[415]);
    }

    public static boolean p(Context context) {
        return context.getSharedPreferences(bb[133], 0).contains(bb[132]);
    }

    private static boolean m(Context context) {
        return context.getSharedPreferences(bb[345], 0).getBoolean(bb[344], false);
    }

    public static void a(List list) {
        boolean z = DialogToastActivity.f;
        if (list != null) {
            Log.i(bb[60] + Process.myPid() + " " + list.size());
            int i = 0;
            for (RunningAppProcessInfo runningAppProcessInfo : list) {
                try {
                    if (runningAppProcessInfo.processName != null) {
                        if (runningAppProcessInfo.processName.startsWith(bb[58])) {
                            Log.i(bb[62] + runningAppProcessInfo.processName + " " + runningAppProcessInfo.pid + " " + runningAppProcessInfo.importance);
                            i++;
                        }
                    }
                    try {
                        if (runningAppProcessInfo.pid == Process.myPid()) {
                            try {
                                Log.i(bb[59] + (runningAppProcessInfo.processName == null ? "?" : runningAppProcessInfo.processName) + " " + runningAppProcessInfo.importance + " " + runningAppProcessInfo.importanceReasonCode + " " + (runningAppProcessInfo.importanceReasonComponent == null ? "?" : runningAppProcessInfo.importanceReasonComponent.flattenToString()));
                                continue;
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                } catch (NumberFormatException e2222) {
                    throw e2222;
                }
            }
            if (i == 0) {
                Log.w(bb[61]);
                for (RunningAppProcessInfo runningAppProcessInfo2 : list) {
                    try {
                        if (runningAppProcessInfo2.processName != null) {
                            Log.w(runningAppProcessInfo2.processName + bb[57] + runningAppProcessInfo2.pid + ")");
                            continue;
                        }
                        if (z) {
                            return;
                        }
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
            }
        }
    }

    public static void d(String str, String str2, String str3) {
        b(co.d(str, str2, str3), str2);
    }

    public static void a(List list, String str) {
        try {
            if (wn.q() && list != null) {
                try {
                    if (list.size() != 0) {
                        bq.a(new ik(list, str));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void c(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[609], 0).edit();
        try {
            edit.putInt(bb[610], i);
            if (!edit.commit()) {
                Log.e(bb[608]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void n(com.whatsapp.protocol.co coVar) {
        a(coVar, 3);
    }

    public static void a(String str, String str2, String str3, byte[] bArr, int i) {
        b(co.a(str, str2, str3, bArr, i), str);
    }

    private static void a(String str, String str2, String str3, String str4, int i) {
        try {
            if (c) {
                if (!(wn.q() || str == null)) {
                    int b;
                    boolean z;
                    String v = wn.v();
                    String c = aqu.c();
                    String g = aqu.g();
                    boolean is24HourFormat = android.text.format.DateFormat.is24HourFormat(z());
                    vr vrVar = (vr) de.greenrobot.event.h.b().b(vr.class);
                    x6 x6Var = (x6) de.greenrobot.event.h.b().b(x6.class);
                    if (vrVar != null) {
                        try {
                            b = (int) vrVar.b();
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    b = 0;
                    if (vrVar != null) {
                        try {
                            if (vrVar.d()) {
                                z = true;
                                M.b(co.a(str, str2, str4, str3, v, i, b, z, x6Var.a, c, g, is24HourFormat));
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    z = false;
                    M.b(co.a(str, str2, str4, str3, v, i, b, z, x6Var.a, c, g, is24HourFormat));
                }
            }
            if (i == 0 || i == 1) {
                try {
                    wn.l(str2);
                    d(null);
                    z(null);
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static void b(Context context, String str, int i) {
        Toast makeText = Toast.makeText(context.getApplicationContext(), str, i);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static void a(Context context, String str, Location location) {
        a(context, str, location, xo.m);
    }

    public static void e(Context context, String str) {
        Log.e(str);
        Toast makeText = Toast.makeText(context.getApplicationContext(), context.getString(2131231126), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static boolean V() {
        boolean z = true;
        if (VERSION.SDK_INT >= 9) {
            try {
                z = Environment.isExternalStorageRemovable();
            } catch (Exception e) {
                Log.w(bb[626] + e.toString());
            }
        }
        return z;
    }

    public static void a(d_ d_Var) {
        try {
            if (c) {
                Log.i(bb[11] + d_Var.a + "/" + d_Var.b);
                M.b(co.a(d_Var));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onEvent(amm com_whatsapp_amm) {
        Log.i(bb[209] + new Date(System.currentTimeMillis()) + bb[210] + new Date(com_whatsapp_amm.a()));
    }

    public static void a(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[315], 0).edit();
        try {
            edit.putBoolean(bb[314], z);
            if (!edit.commit()) {
                Log.e(bb[313]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void e(String str) {
        if (c) {
            Log.i(bb[271]);
            M.b(co.h(new a3i(str, null, null, 61, null)));
        }
    }

    private static List f(List list) {
        return a(list, new ArrayList(list.size()), false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(android.content.Context r5) {
        /*
        r4 = 9;
        r2 = 1;
        r1 = 0;
        r0 = com.whatsapp.gcm.RegistrationIntentService.a(r5);	 Catch:{ NumberFormatException -> 0x0043 }
        if (r0 != 0) goto L_0x001b;
    L_0x000a:
        r0 = be();	 Catch:{ NumberFormatException -> 0x0045 }
        if (r0 == 0) goto L_0x0047;
    L_0x0010:
        r0 = new com.amazon.device.messaging.ADM;	 Catch:{ NumberFormatException -> 0x0045 }
        r0.<init>(r5);	 Catch:{ NumberFormatException -> 0x0045 }
        r0 = r0.getRegistrationId();	 Catch:{ NumberFormatException -> 0x0045 }
        if (r0 == 0) goto L_0x0047;
    L_0x001b:
        r0 = r2;
    L_0x001c:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0049 }
        if (r3 < r4) goto L_0x002a;
    L_0x0020:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x004b }
        if (r3 < r4) goto L_0x004f;
    L_0x0024:
        r3 = j(r5);	 Catch:{ NumberFormatException -> 0x004d }
        if (r3 != 0) goto L_0x004f;
    L_0x002a:
        r3 = r2;
    L_0x002b:
        r4 = com.whatsapp.a59.p;	 Catch:{ NumberFormatException -> 0x0051 }
        if (r4 != 0) goto L_0x005b;
    L_0x002f:
        if (r0 == 0) goto L_0x005b;
    L_0x0031:
        r0 = ad;	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = r0.getBackgroundDataSetting();	 Catch:{ NumberFormatException -> 0x0055 }
        if (r0 == 0) goto L_0x005b;
    L_0x0039:
        r0 = i(r5);	 Catch:{ NumberFormatException -> 0x0057 }
        r4 = 3;
        if (r0 >= r4) goto L_0x005b;
    L_0x0040:
        if (r3 == 0) goto L_0x005b;
    L_0x0042:
        return r2;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = r1;
        goto L_0x001c;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r3 = r1;
        goto L_0x002b;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r2 = r1;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.q(android.content.Context):boolean");
    }

    public static void a(byte[] bArr, byte[] bArr2, @Nullable Runnable runnable) {
        try {
            if (c) {
                Log.i(bb[509]);
                M.b(co.a(bArr, bArr2, runnable));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void G(String str) {
        try {
            this.R.release();
            if (!l5.e(str)) {
                boolean a = a1.a(str);
                try {
                    int i;
                    Handler handler = L;
                    if (a) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    handler.obtainMessage(4, i, 0, A(str)).sendToTarget();
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void l() {
        int a = awc.a(this.au).a();
        M().post(new _p(this, awc.a(this.au).f(), a, awc.a(this.au).g(), awc.a(this.au).i().b()));
    }

    public static void a(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[232], 0).edit();
        try {
            edit.putInt(bb[231], i);
            if (!edit.commit()) {
                Log.e(bb[230]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean a(com.whatsapp.protocol.co coVar) {
        try {
            if (coVar.d == 7) {
                if (coVar.k.c.contains("-")) {
                    return false;
                }
            }
            try {
                MediaData mediaData;
                switch (coVar.c) {
                    case at.g /*1*/:
                    case at.i /*2*/:
                    case Y.l /*9*/:
                        mediaData = (MediaData) coVar.Q;
                        if (mediaData != null) {
                            try {
                                if (!mediaData.autodownloadRetryEnabled) {
                                    Log.i(bb[149] + coVar.k.b + " " + coVar.c + bb[150]);
                                    return false;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        break;
                    case at.o /*3*/:
                        mediaData = (MediaData) coVar.Q;
                        if (mediaData != null) {
                            try {
                                if (!mediaData.autodownloadRetryEnabled) {
                                    Log.i(bb[153] + coVar.k.b + " " + coVar.c + bb[156]);
                                    return false;
                                }
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        }
                        break;
                    case at.m /*5*/:
                        if (coVar.m == 0.0d) {
                            try {
                                if (coVar.l == 0.0d) {
                                    Log.i(bb[152] + coVar.k.b);
                                    return false;
                                }
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        }
                        break;
                    case aF.v /*7*/:
                        Log.i(bb[154] + coVar.k.b);
                        return false;
                    case aF.u /*8*/:
                        Log.i(bb[157] + coVar.k.b);
                        return false;
                }
                try {
                    if (b(coVar.c)) {
                        if (ag.a(coVar)) {
                            Log.i(bb[151] + coVar.k.b + " " + coVar.c + bb[155]);
                            return false;
                        }
                    }
                    return true;
                } catch (NumberFormatException e222) {
                    throw e222;
                } catch (NumberFormatException e2222) {
                    throw e2222;
                }
            } catch (NumberFormatException e22222) {
                throw e22222;
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        } catch (NumberFormatException e22222222) {
            throw e22222222;
        }
    }

    public static void a(String str, List list, int i, boolean z, String str2) {
        try {
            if (wn.q() || z) {
                String str3;
                _d _dVar = new _d(new s8(str, list, i, z, str2));
                if (str == null) {
                    try {
                        str = wn.u();
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                if (7 == i || 8 == i) {
                    try {
                        str3 = bb[518];
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                str3 = "";
                p.ai.a(new SendWebForwardJob(str3 + str, co.a(str, list, i, str2, _dVar)));
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void b(tm tmVar) {
        try {
            if (!A.contains(tmVar)) {
                A.add(tmVar);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static boolean W() {
        return x;
    }

    public static void b(String str, String str2) {
        try {
            if (c) {
                Log.i(bb[28] + str + " " + str2);
                M.b(co.k(str, str2));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void c() {
        Log.w(bb[477]);
        super.c();
    }

    static void a(com.whatsapp.protocol.co coVar, int i, byte[] bArr, String str) {
        try {
            if (c) {
                M.b(co.a(coVar, i, bArr, str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void g(com.whatsapp.protocol.co coVar) {
        boolean z = DialogToastActivity.f;
        Log.i(bb[250]);
        auv.a();
        Iterator it = ae.iterator();
        while (it.hasNext()) {
            ((aau) it.next()).b(coVar);
            if (z) {
                return;
            }
        }
    }

    public static boolean b(@NonNull as8 com_whatsapp_as8) {
        String externalStorageState = Environment.getExternalStorageState();
        try {
            if (!bb[55].equals(externalStorageState)) {
                if (!bb[56].equals(externalStorageState)) {
                    com_whatsapp_as8.a(externalStorageState);
                    return false;
                }
            }
            try {
                if (VERSION.SDK_INT >= 23) {
                    if (h(z(), bb[54]) == -1) {
                        com_whatsapp_as8.b();
                        return false;
                    }
                }
                return true;
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static void q(com.whatsapp.protocol.co coVar) {
        boolean a = ag.a(coVar);
        if (a) {
            try {
                if (!ag.b(coVar)) {
                    a(z(), 2131232023, 0);
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        b(coVar, qa.d(coVar.k.c));
        aK.a(coVar, 1);
        bq.a(new ada(coVar));
        MediaData mediaData = (MediaData) coVar.Q;
        if (a) {
            try {
                tw.a().a(coVar);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        mediaData.uploader = new sx(coVar, false, false);
        mediaData.uploader.d();
    }

    static by ap() {
        return a0;
    }

    public static Me ag() {
        Closeable objectInputStream;
        ClassNotFoundException e;
        Throwable th;
        IOException e2;
        Me me = null;
        Log.i(bb[254]);
        try {
            Closeable closeable;
            if (new File(z().getFilesDir(), bb[255]).exists()) {
                objectInputStream = new ObjectInputStream(z().openFileInput(bb[256]));
                try {
                    me = (Me) objectInputStream.readObject();
                    closeable = objectInputStream;
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    try {
                        Log.w(bb[258] + e.toString());
                        ao.a(objectInputStream);
                        return me;
                    } catch (Throwable th2) {
                        th = th2;
                        ao.a(objectInputStream);
                        throw th;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    Log.e(bb[257] + e2.toString());
                    ao.a(objectInputStream);
                    return me;
                }
            }
            closeable = null;
            ao.a(closeable);
        } catch (ClassNotFoundException e5) {
            e = e5;
            objectInputStream = null;
            Log.w(bb[258] + e.toString());
            ao.a(objectInputStream);
            return me;
        } catch (IOException e6) {
            e2 = e6;
            objectInputStream = null;
            Log.e(bb[257] + e2.toString());
            ao.a(objectInputStream);
            return me;
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = null;
            ao.a(objectInputStream);
            throw th;
        }
        return me;
    }

    public static void c(String str) {
        try {
            if (wn.q()) {
                l5 f = as.f(str);
                if (f != null) {
                    try {
                        b(f);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private static void b(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                M.b(co.a(str, str2, str3, str4));
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    public static void a(aau com_whatsapp_aau) {
        ae.remove(com_whatsapp_aau);
    }

    private static void a(Message message, String str) {
        int a = co.a(message);
        try {
            if (co.e(a)) {
                if (str == null) {
                    auv.a(bb[52] + a);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                synchronized (b) {
                    boolean z;
                    if (b.containsKey(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    auv.a(z, bb[50] + str + bb[51]);
                    b.put(str, message);
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void aB() {
    }

    public static boolean p(@Nullable String str) {
        try {
            if (bb[7].equals(str)) {
                if (h(z(), bb[8]) == 0) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void c(String str, boolean z) {
        boolean z2 = DialogToastActivity.f;
        Iterator it = aw.iterator();
        while (it.hasNext()) {
            ((a_) it.next()).a(str, z);
            if (z2) {
                return;
            }
        }
    }

    private void aS() {
        bq.a(new alu(this), new Void[0]);
    }

    public static boolean a(int i, com.whatsapp.protocol.co coVar) {
        boolean z = false;
        if (i != 1) {
            try {
                if (coVar.z > ((long) a59.t) * 1048576) {
                    return false;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        int c = c(i);
        try {
            switch (coVar.c) {
                case v.m /*0*/:
                case at.g /*1*/:
                    if ((c & 1) == 0) {
                        return false;
                    }
                    return true;
                case at.i /*2*/:
                    if ((c & 2) != 0) {
                        return true;
                    }
                    try {
                        if (coVar.r == 1) {
                            if (coVar.z <= 524288 || i == 1) {
                                z = true;
                            }
                            return z;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    } catch (NumberFormatException e22) {
                        try {
                            throw e22;
                        } catch (NumberFormatException e222) {
                            throw e222;
                        }
                    }
                    break;
                case at.o /*3*/:
                    if ((c & 4) == 0) {
                        return false;
                    }
                    return true;
                case Y.l /*9*/:
                    if ((c & 8) == 0) {
                        return false;
                    }
                    return true;
            }
            return false;
        } catch (NumberFormatException e2222) {
            throw e2222;
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    public static void v(String str) {
        try {
            if (am == 3) {
                aZ.post(new awq(str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        r9 = this;
        r8 = 3;
        r7 = 1;
        r6 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        v();
        r0 = X;
        r0.c();
        aI = r6;
        B = r7;
        aD = r6;
        z = r6;
        aq = r6;
        r0 = r9.aV;
        r0.clear();
        r0 = r9.aW;
        r0.clear();
        r9.ak = r6;
        aU();
        r0 = ay;
        r0 = r0.jabber_id;
        r0 = D(r0);
        r1 = com.whatsapp.ve.d(r0);	 Catch:{ NumberFormatException -> 0x0149 }
        if (r1 != 0) goto L_0x003b;
    L_0x0034:
        r1 = com.whatsapp.ve.d();	 Catch:{ NumberFormatException -> 0x0149 }
        a(r1, r0);	 Catch:{ NumberFormatException -> 0x0149 }
    L_0x003b:
        r0 = Z;	 Catch:{ NumberFormatException -> 0x014b }
        if (r0 == 0) goto L_0x0045;
    L_0x003f:
        com.whatsapp.sx.j();	 Catch:{ NumberFormatException -> 0x014b }
        aM();	 Catch:{ NumberFormatException -> 0x014b }
    L_0x0045:
        a0();
        r4 = a6;
        monitor-enter(r4);
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x014d }
        r0.<init>();	 Catch:{ all -> 0x014d }
        r1 = bb;	 Catch:{ all -> 0x014d }
        r2 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x014d }
        r0 = r0.append(r1);	 Catch:{ all -> 0x014d }
        r1 = a6;	 Catch:{ all -> 0x014d }
        r1 = r1.size();	 Catch:{ all -> 0x014d }
        r0 = r0.append(r1);	 Catch:{ all -> 0x014d }
        r0 = r0.toString();	 Catch:{ all -> 0x014d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x014d }
        r0 = a6;	 Catch:{ all -> 0x014d }
        r5 = r0.iterator();	 Catch:{ all -> 0x014d }
    L_0x0071:
        r0 = r5.hasNext();	 Catch:{ all -> 0x014d }
        if (r0 == 0) goto L_0x0093;
    L_0x0077:
        r0 = r5.next();	 Catch:{ all -> 0x014d }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x014d }
        r1 = r0.second;	 Catch:{ all -> 0x014d }
        r1 = (android.os.Message) r1;	 Catch:{ all -> 0x014d }
        r2 = r0.first;	 Catch:{ all -> 0x014d }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x014d }
        a(r1, r2);	 Catch:{ all -> 0x014d }
        r1 = M;	 Catch:{ all -> 0x014d }
        r0 = r0.second;	 Catch:{ all -> 0x014d }
        r0 = (android.os.Message) r0;	 Catch:{ all -> 0x014d }
        r1.b(r0);	 Catch:{ all -> 0x014d }
        if (r3 == 0) goto L_0x0071;
    L_0x0093:
        r0 = a6;	 Catch:{ all -> 0x014d }
        r0.clear();	 Catch:{ all -> 0x014d }
        monitor-exit(r4);	 Catch:{ all -> 0x014d }
        r0 = h;
        if (r0 == r8) goto L_0x00b0;
    L_0x009d:
        r0 = com.whatsapp.Conversation.F();
        r1 = r0.a();	 Catch:{ NumberFormatException -> 0x0150 }
        if (r1 == 0) goto L_0x00b0;
    L_0x00a7:
        r0 = r0.b();	 Catch:{ NumberFormatException -> 0x0150 }
        r0 = r0.aI;	 Catch:{ NumberFormatException -> 0x0150 }
        a(r0);	 Catch:{ NumberFormatException -> 0x0150 }
    L_0x00b0:
        r0 = aj();	 Catch:{ NumberFormatException -> 0x0152 }
        r1 = q();	 Catch:{ NumberFormatException -> 0x0152 }
        if (r0 == r1) goto L_0x00cc;
    L_0x00ba:
        r0 = q();	 Catch:{ NumberFormatException -> 0x0154 }
        if (r0 == 0) goto L_0x00c5;
    L_0x00c0:
        X();	 Catch:{ NumberFormatException -> 0x0156 }
        if (r3 == 0) goto L_0x00cc;
    L_0x00c5:
        r0 = h;	 Catch:{ NumberFormatException -> 0x0158 }
        if (r0 != r8) goto L_0x00cc;
    L_0x00c9:
        a5();	 Catch:{ NumberFormatException -> 0x0158 }
    L_0x00cc:
        r9.r();
        r0 = com.whatsapp.awc.e;
        r1 = new com.whatsapp.az9;
        r1.<init>(r9);
        r0.execute(r1);
        r0 = z();
        r1 = bb;
        r2 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r1 = r1[r2];
        r0 = r0.getSharedPreferences(r1, r6);
        r1 = bb;	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 0;
        r1 = r0.getBoolean(r1, r2);	 Catch:{ NumberFormatException -> 0x015a }
        if (r1 == 0) goto L_0x0135;
    L_0x00f4:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x015a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x015a }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x015a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x015a }
        aX();	 Catch:{ NumberFormatException -> 0x015a }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x015a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x015a }
        r1 = as;	 Catch:{ NumberFormatException -> 0x015a }
        r1 = r1.h();	 Catch:{ NumberFormatException -> 0x015a }
        b(r1);	 Catch:{ NumberFormatException -> 0x015a }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x015a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x015a }
        r0 = r0.edit();	 Catch:{ NumberFormatException -> 0x015a }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x015a }
        r2 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x015a }
        r0 = r0.remove(r1);	 Catch:{ NumberFormatException -> 0x015a }
        r0.commit();	 Catch:{ NumberFormatException -> 0x015a }
    L_0x0135:
        r0 = z();
        com.whatsapp.vh.b(r0);
        r0 = de.greenrobot.event.h.b();
        r1 = new com.whatsapp.a47;
        r1.<init>(r7);
        r0.d(r1);
        return;
    L_0x0149:
        r0 = move-exception;
        throw r0;
    L_0x014b:
        r0 = move-exception;
        throw r0;
    L_0x014d:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x014d }
        throw r0;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0154 }
    L_0x0154:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0156 }
    L_0x0156:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0158 }
    L_0x0158:
        r0 = move-exception;
        throw r0;
    L_0x015a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.d():void");
    }

    private static void a(l5 l5Var, Activity activity) {
        try {
            if (l5Var.d > 0) {
                l5Var.d = 0;
                com.whatsapp.notification.ao.c().a(l5Var.p);
                as.m(l5Var);
                activity.runOnUiThread(new q4(l5Var));
                a(l5Var, true);
                WidgetProvider.a(z());
                at();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onEvent(vr vrVar) {
        a(vrVar, (x6) de.greenrobot.event.h.b().b(x6.class));
    }

    private static Intent a(PackageManager packageManager, String str, String str2, String str3, Uri uri) {
        boolean z = DialogToastActivity.f;
        Intent intent = new Intent(bb[183]);
        intent.setType(str3);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        ArrayList arrayList = new ArrayList();
        Intent intent2 = null;
        int i = 0;
        while (i < size) {
            int i2;
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivities.get(i);
            if (!resolveInfo.activityInfo.name.contains(bb[175])) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                Log.i(activityInfo.applicationInfo.packageName + bb[174] + activityInfo.name);
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                Intent intent3 = new Intent(bb[191]);
                try {
                    intent3.setType(str3);
                    intent3.setComponent(componentName);
                    if (!resolveInfo.activityInfo.packageName.contains(bb[187]) || z) {
                        intent3.putExtra(bb[180], str);
                        intent3.putExtra(bb[186], str);
                        intent3.putExtra(bb[188], str2);
                        intent3.putExtra(bb[184], uri);
                        arrayList.add(intent3);
                        if (resolveInfo.activityInfo.name.equals(bb[185])) {
                            intent = intent3;
                            i2 = i + 1;
                            if (z) {
                                break;
                            }
                            i = i2;
                            intent2 = intent;
                        }
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            intent = intent2;
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
            intent2 = intent;
        }
        intent = intent2;
        String replace = Build.MANUFACTURER.replace(' ', '_');
        replace = replace + "-" + Build.MODEL.replace(' ', '_');
        try {
            Log.i(bb[190] + replace);
            if (replace.equals(bb[189])) {
                Log.i(bb[178]);
                return intent;
            }
            Parcelable[] parcelableArr = new Parcelable[arrayList.size()];
            i2 = 0;
            while (i2 < parcelableArr.length) {
                parcelableArr[i2] = (Parcelable) arrayList.get(i2);
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
            intent = new Intent(bb[179]);
            intent.setType(str3);
            intent.putExtra(bb[176], str);
            intent.putExtra(bb[181], str2);
            intent.putExtra(bb[177], uri);
            intent = Intent.createChooser(intent, null);
            intent.putExtra(bb[182], parcelableArr);
            return intent;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void a(boolean z, String str, bb bbVar) {
        a(null, z, str, bbVar);
    }

    private static boolean J() {
        try {
            return n < System.currentTimeMillis();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean j(Context context) {
        return context.getSharedPreferences(bb[349], 0).getBoolean(bb[350], false);
    }

    public static boolean au() {
        boolean z;
        synchronized (ar) {
            z = z().getSharedPreferences(bb[244], 0).getBoolean(bb[245], true);
        }
        return z;
    }

    public static void b(Message message, String str) {
        int a = co.a(message);
        try {
            if (c) {
                a(message, str);
                M.b(message);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Log.i(bb[247] + a + bb[246] + str);
            synchronized (a6) {
                a6.add(new Pair(str, message));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        try {
            if (c) {
                Log.i(bb[354]);
                M.b(co.a(str, str2, str3, i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    void a(c3 c3Var) {
        awc.e.execute(new iq(this, c3Var));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r7, boolean r8, java.lang.String r9, com.whatsapp.protocol.bb r10) {
        /*
        r0 = c;	 Catch:{ NumberFormatException -> 0x002d }
        if (r0 == 0) goto L_0x002c;
    L_0x0004:
        r0 = com.whatsapp.aup.d();	 Catch:{ NumberFormatException -> 0x002d }
        if (r0 == 0) goto L_0x002c;
    L_0x000a:
        r3 = com.whatsapp.aup.f();
        if (r8 == 0) goto L_0x0017;
    L_0x0010:
        r3.put(r9, r9);	 Catch:{ NumberFormatException -> 0x002f }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x002f }
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        r3.remove(r9);	 Catch:{ NumberFormatException -> 0x002f }
    L_0x001a:
        r6 = M;
        r0 = new com.whatsapp.anv;
        r1 = r7;
        r2 = r9;
        r4 = r8;
        r5 = r10;
        r0.<init>(r1, r2, r3, r4, r5);
        r0 = com.whatsapp.messaging.co.a(r0);
        r6.b(r0);
    L_0x002c:
        return;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.app.Activity, boolean, java.lang.String, com.whatsapp.protocol.bb):void");
    }

    public static void aq() {
        bq.a(new arw());
    }

    static void a(a_ a_Var) {
        aw.remove(a_Var);
    }

    public static void e(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[455], 0).edit();
        try {
            edit.putInt(bb[454], i);
            if (!edit.commit()) {
                Log.e(bb[456]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Context context, String str, PlaceInfo placeInfo) {
        l5 d = qa.d(str);
        com.whatsapp.protocol.co coVar = new com.whatsapp.protocol.co(d.p, (byte[]) null, new MediaData());
        try {
            coVar.b = av();
            coVar.u = 1;
            coVar.c = (byte) 5;
            coVar.d = 1;
            coVar.m = placeInfo.lat;
            coVar.l = placeInfo.lon;
            coVar.q = placeInfo.url;
            coVar.A = placeInfo.name;
            if (placeInfo.address != null) {
                coVar.A += "\n" + placeInfo.address;
            }
            b(coVar, d);
            aK.a(coVar, 2);
            try {
                boolean z;
                bq.a(new e3(context.getContentResolver(), str));
                if (placeInfo.address == null) {
                    z = true;
                } else {
                    z = false;
                }
                bq.a(new xz(context, coVar, placeInfo, z), new Void[0]);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void a(Message message) {
        co.a(message, this.aH, Voip.b(), this.d, this.aO, this.H);
    }

    private static void y() {
        ADM adm = new ADM(z());
        try {
            if (adm.getRegistrationId() == null) {
                adm.startRegister();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static boolean p(com.whatsapp.protocol.co coVar) {
        l5 d = qa.d(coVar.k.c);
        try {
            l5 b = d.c() ? coVar.t != null ? as.b(coVar.t) : null : d;
            return a(coVar, d, b);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void ao() {
        Message q = co.q();
        try {
            if (!qm.d) {
                qm.d = true;
                if (c) {
                    Log.i(bb[41]);
                    M.b(q);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                Log.i(bb[40]);
                synchronized (a6) {
                    a6.add(new Pair(null, q));
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean a4() {
        try {
            if (r) {
                return true;
            }
            r = new Date().after(ar());
            return r;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static String A(String str) {
        String str2 = (String) a7.get(str);
        if (str2 != null) {
            return str2;
        }
        a7.put(str, str);
        return str;
    }

    static File t() {
        return N;
    }

    public static void b(String str, bb bbVar) {
        String str2 = null;
        auv.b();
        if (c) {
            String a;
            ArrayList c = aK.c(str, 5);
            l5 f = as.f(str);
            if (f != null) {
                try {
                    if (f.c()) {
                        a = f.a();
                        str2 = aK.i(str);
                        M.b(co.a(c, a, str2, bbVar));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            a = null;
            M.b(co.a(c, a, str2, bbVar));
        }
    }

    public static void a(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[409]);
                M.b(co.f(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(l5 l5Var, boolean z, boolean z2) {
        a(l5Var, z, z2, null, null);
    }

    public static void l(com.whatsapp.protocol.co coVar) {
        try {
            if (!coVar.b()) {
                if (coVar.d == 13) {
                    try {
                        if (f(coVar)) {
                            try {
                                a25.a(coVar);
                                if (!DialogToastActivity.f) {
                                    return;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            }
            try {
                if (!coVar.b()) {
                    M.b(co.c(coVar));
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static File B(String str) {
        File d = dg.d();
        if (str == null) {
            return d;
        }
        try {
            return new File(d, str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void a9() {
        PendingIntent broadcast = PendingIntent.getBroadcast(z(), 0, new Intent(bb[129]).setPackage(bb[130]), 536870912);
        if (broadcast != null) {
            ((AlarmManager) z().getSystemService(bb[131])).cancel(broadcast);
        }
    }

    static void a(com.whatsapp.protocol.co coVar, boolean z, long j) {
        try {
            L.removeMessages(0);
            L.removeMessages(1);
            L.removeMessages(2);
            if (!c) {
                return;
            }
            if (!p.aV.contains(coVar.k)) {
                p.aV.add(coVar.k);
                ExecutorService executorService = awc.e;
                App app = p;
                app.getClass();
                executorService.execute(new amf(app, coVar, z, j));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.l5 r6, boolean r7, boolean r8, com.whatsapp.protocol.c3 r9, java.lang.Integer r10) {
        /*
        r0 = 0;
        r5 = 0;
        r4 = -1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r6.d;	 Catch:{ NumberFormatException -> 0x008f }
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        if (r7 == 0) goto L_0x008e;
    L_0x000b:
        if (r10 != 0) goto L_0x0011;
    L_0x000d:
        r6.d = r5;
        if (r1 == 0) goto L_0x00d6;
    L_0x0011:
        r2 = aK;
        r3 = r6.p;
        r2 = r2.m(r3);
        if (r2 == 0) goto L_0x0023;
    L_0x001b:
        r2 = r2.k;	 Catch:{ NumberFormatException -> 0x0093 }
        r2 = r2.equals(r9);	 Catch:{ NumberFormatException -> 0x0093 }
        if (r2 != 0) goto L_0x002d;
    L_0x0023:
        r2 = r6.d;	 Catch:{ NumberFormatException -> 0x0095 }
        if (r2 != r4) goto L_0x0031;
    L_0x0027:
        r2 = r10.intValue();	 Catch:{ NumberFormatException -> 0x0095 }
        if (r2 != r4) goto L_0x0031;
    L_0x002d:
        r6.d = r5;
        if (r1 == 0) goto L_0x00d6;
    L_0x0031:
        r0 = r6.d;	 Catch:{ NumberFormatException -> 0x0097 }
        if (r0 <= 0) goto L_0x009d;
    L_0x0035:
        r0 = r10.intValue();	 Catch:{ NumberFormatException -> 0x0097 }
        if (r0 == r4) goto L_0x008e;
    L_0x003b:
        r0 = aK;
        r0 = r0.a(r9);
        if (r0 == 0) goto L_0x0056;
    L_0x0043:
        r2 = r6.d;	 Catch:{ NumberFormatException -> 0x0099 }
        r3 = r10.intValue();	 Catch:{ NumberFormatException -> 0x0099 }
        if (r2 < r3) goto L_0x0056;
    L_0x004b:
        r2 = r6.d;	 Catch:{ NumberFormatException -> 0x009b }
        r3 = r10.intValue();	 Catch:{ NumberFormatException -> 0x009b }
        r2 = r2 - r3;
        r6.d = r2;	 Catch:{ NumberFormatException -> 0x009b }
        if (r1 == 0) goto L_0x00d6;
    L_0x0056:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x009b }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x009b }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x009b }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.append(r9);	 Catch:{ NumberFormatException -> 0x009b }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x009b }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x009b }
        r1 = r6.d;	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x009b }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x009b }
        r2 = 21;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.append(r10);	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x009b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x009b }
    L_0x008e:
        return;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 22;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r1 = bb;
        r2 = 23;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.d;
        r0 = r0.append(r1);
        r1 = bb;
        r2 = 25;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r10);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x008e;
    L_0x00d6:
        r1 = r6.d;	 Catch:{ NumberFormatException -> 0x010c }
        if (r1 != 0) goto L_0x00e3;
    L_0x00da:
        r1 = com.whatsapp.notification.ao.c();	 Catch:{ NumberFormatException -> 0x010c }
        r2 = r6.p;	 Catch:{ NumberFormatException -> 0x010c }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x010c }
    L_0x00e3:
        r1 = com.whatsapp.notification.ao.c();	 Catch:{ NumberFormatException -> 0x010a }
        r2 = r6.p;	 Catch:{ NumberFormatException -> 0x010a }
        r1.b(r2, r0);	 Catch:{ NumberFormatException -> 0x010a }
        r1 = aK;	 Catch:{ NumberFormatException -> 0x010a }
        r2 = r6.p;	 Catch:{ NumberFormatException -> 0x010a }
        r1.a(r2, r0);	 Catch:{ NumberFormatException -> 0x010a }
        r0 = p;	 Catch:{ NumberFormatException -> 0x010a }
        r0 = r0.M();	 Catch:{ NumberFormatException -> 0x010a }
        r1 = new com.whatsapp.anl;	 Catch:{ NumberFormatException -> 0x010a }
        r1.<init>(r6);	 Catch:{ NumberFormatException -> 0x010a }
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0.postDelayed(r1, r2);	 Catch:{ NumberFormatException -> 0x010a }
        if (r8 == 0) goto L_0x008e;
    L_0x0105:
        r0 = 1;
        a(r6, r0);	 Catch:{ NumberFormatException -> 0x010a }
        goto L_0x008e;
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.l5, boolean, boolean, com.whatsapp.protocol.c3, java.lang.Integer):void");
    }

    public static void aT() {
        Log.i(bb[135]);
        new File(z().getFilesDir(), bb[134]).delete();
    }

    public static void a(String str, String str2, String[] strArr) {
        p.ai.a(new SendReadReceiptJob(str, str2, strArr));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String x(android.content.Context r4) {
        /*
        r0 = ay;	 Catch:{ NumberFormatException -> 0x0009 }
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = ay;	 Catch:{ NumberFormatException -> 0x0009 }
        r0 = r0.jabber_id;	 Catch:{ NumberFormatException -> 0x0009 }
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = bb;
        r1 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r0 = r0[r1];
        r1 = 0;
        r0 = r4.getSharedPreferences(r0, r1);
        r1 = bb;
        r2 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r1 = r1[r2];
        r2 = bb;
        r3 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;
        r2 = r2[r3];
        r0 = r0.getString(r1, r2);
        r0 = r0.toLowerCase();
        r1 = bb;
        r2 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        r1 = r1[r2];
        r2 = "-";
        r0 = r0.replaceAll(r1, r2);
        r1 = bb;
        r2 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r1 = r1[r2];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0008;
    L_0x0043:
        r0 = at;
        r1 = bb;
        r2 = 510; // 0x1fe float:7.15E-43 double:2.52E-321;
        r1 = r1[r2];
        r0 = android.provider.Settings.Secure.getString(r0, r1);
        if (r0 == 0) goto L_0x0058;
    L_0x0051:
        r1 = r0.length();	 Catch:{ NumberFormatException -> 0x0084 }
        r2 = 6;
        if (r1 >= r2) goto L_0x005e;
    L_0x0058:
        r0 = bb;
        r1 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r0[r1];
    L_0x005e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r0.length();
        r2 = r2 + -6;
        r3 = r0.length();
        r0 = r0.substring(r2, r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x0008;
    L_0x0084:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.x(android.content.Context):java.lang.String");
    }

    public static void c(boolean z) {
        try {
            if (U != z) {
                U = z;
                o();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void F(String str) {
        try {
            if (c) {
                M.b(co.e(str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean U() {
        try {
            if (bb[13].equals(Build.MANUFACTURER)) {
                if (bb[12].equals(Build.BRAND)) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(cx cxVar) {
        try {
            if (c) {
                Log.i(bb[227] + cxVar);
                M.b(co.a(cxVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Activity activity, boolean z, String str) {
        a(activity, z, str, null);
    }

    public static void d(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[450], 0).edit();
        try {
            edit.putBoolean(bb[452], z);
            if (!edit.commit()) {
                Log.e(bb[451]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void r() {
        try {
            if (c && !Voip.d()) {
                Context z = z();
                i.g(z);
                if (i.f(z)) {
                    Log.i(bb[5]);
                    M.b(co.a(i.k(z), new ali(this, z)));
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void l(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = aw.iterator();
        while (it.hasNext()) {
            ((a_) it.next()).e(str);
            if (z) {
                return;
            }
        }
    }

    public static void aM() {
        try {
            if (aF != null) {
                aF.cancel(true);
            }
            aF = new md();
            bq.a(aF, new Void[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.net.Uri r7) {
        /*
        r6 = 99;
        r0 = 0;
        r1 = ap;	 Catch:{ IOException -> 0x000c }
        r1 = r7.compareTo(r1);	 Catch:{ IOException -> 0x000c }
        if (r1 != 0) goto L_0x000e;
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r1 = bb;	 Catch:{ IOException -> 0x009d }
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        r1 = r1[r2];	 Catch:{ IOException -> 0x009d }
        r2 = r7.getScheme();	 Catch:{ IOException -> 0x009d }
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x009d }
        if (r1 != 0) goto L_0x002e;
    L_0x001e:
        r1 = r7.toString();	 Catch:{ IOException -> 0x009d }
        r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x009d }
        r2 = r2.toString();	 Catch:{ IOException -> 0x009d }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x009d }
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r2 = 0;
        r1 = at;	 Catch:{ FileNotFoundException -> 0x00c2, NullPointerException -> 0x0198, IllegalStateException -> 0x010d }
        r1 = r1.openInputStream(r7);	 Catch:{ FileNotFoundException -> 0x00c2, NullPointerException -> 0x0198, IllegalStateException -> 0x010d }
        if (r1 == 0) goto L_0x003a;
    L_0x0037:
        r1.close();	 Catch:{ IOException -> 0x00a1, NullPointerException -> 0x009f }
    L_0x003a:
        r1 = F;
        r1.removeMessages(r6);
        r1 = F;
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r1.sendEmptyMessageDelayed(r6, r2);
        r1 = g;
        r1.stop();
        r1 = com.whatsapp.Conversation.F();
        r2 = r1.a();	 Catch:{ IOException -> 0x0190 }
        if (r2 == 0) goto L_0x0060;
    L_0x0055:
        r1 = r1.b();	 Catch:{ IOException -> 0x0192 }
        r1 = r1.M();	 Catch:{ IOException -> 0x0192 }
        if (r1 == 0) goto L_0x0060;
    L_0x005f:
        r0 = 1;
    L_0x0060:
        if (r0 != 0) goto L_0x000b;
    L_0x0062:
        r0 = t;	 Catch:{ IOException -> 0x0194 }
        if (r0 == 0) goto L_0x008e;
    L_0x0066:
        r0 = z();
        r1 = bb;
        r2 = 601; // 0x259 float:8.42E-43 double:2.97E-321;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.media.AudioManager) r0;
        if (r0 == 0) goto L_0x007f;
    L_0x0078:
        r1 = 5;
        r0 = r0.getStreamVolume(r1);	 Catch:{ IOException -> 0x0196 }
        if (r0 <= 0) goto L_0x008a;
    L_0x007f:
        r0 = g;	 Catch:{ IOException -> 0x0196 }
        r1 = z();	 Catch:{ IOException -> 0x0196 }
        r2 = 0;
        r3 = 3;
        r0.play(r1, r7, r2, r3);	 Catch:{ IOException -> 0x0196 }
    L_0x008a:
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x009b }
        if (r0 == 0) goto L_0x000b;
    L_0x008e:
        r0 = g;	 Catch:{ IOException -> 0x009b }
        r1 = z();	 Catch:{ IOException -> 0x009b }
        r2 = 0;
        r3 = 5;
        r0.play(r1, r7, r2, r3);	 Catch:{ IOException -> 0x009b }
        goto L_0x000b;
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 604; // 0x25c float:8.46E-43 double:2.984E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x003a;
    L_0x00c2:
        r1 = move-exception;
    L_0x00c3:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r1.<init>();	 Catch:{ all -> 0x0167 }
        r3 = bb;	 Catch:{ all -> 0x0167 }
        r4 = 605; // 0x25d float:8.48E-43 double:2.99E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x0167 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0167 }
        r3 = r7.toString();	 Catch:{ all -> 0x0167 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0167 }
        r1 = r1.toString();	 Catch:{ all -> 0x0167 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x0167 }
        r7 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ all -> 0x0167 }
        if (r2 == 0) goto L_0x003a;
    L_0x00e5:
        r2.close();	 Catch:{ IOException -> 0x00ea, NullPointerException -> 0x010b }
        goto L_0x003a;
    L_0x00ea:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x003a;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r3.<init>();	 Catch:{ all -> 0x0167 }
        r4 = bb;	 Catch:{ all -> 0x0167 }
        r5 = 598; // 0x256 float:8.38E-43 double:2.955E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0167 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0167 }
        r4 = r7.toString();	 Catch:{ all -> 0x0167 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0167 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0167 }
        r1 = r1.toString();	 Catch:{ all -> 0x0167 }
        r1 = r3.append(r1);	 Catch:{ all -> 0x0167 }
        r1 = r1.toString();	 Catch:{ all -> 0x0167 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x0167 }
        r7 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ all -> 0x0167 }
        if (r2 == 0) goto L_0x003a;
    L_0x013f:
        r2.close();	 Catch:{ IOException -> 0x0144, NullPointerException -> 0x0165 }
        goto L_0x003a;
    L_0x0144:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 603; // 0x25b float:8.45E-43 double:2.98E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x003a;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = move-exception;
        if (r2 == 0) goto L_0x016d;
    L_0x016a:
        r2.close();	 Catch:{ IOException -> 0x0170, NullPointerException -> 0x016e }
    L_0x016d:
        throw r0;
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 602; // 0x25a float:8.44E-43 double:2.974E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x016d;
    L_0x0190:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0192 }
    L_0x0192:
        r0 = move-exception;
        throw r0;
    L_0x0194:
        r0 = move-exception;
        throw r0;
    L_0x0196:
        r0 = move-exception;
        throw r0;
    L_0x0198:
        r1 = move-exception;
        goto L_0x00c3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.net.Uri):void");
    }

    public static boolean aJ() {
        try {
            if (VERSION.SDK_INT >= 9) {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(z()) == 0) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static String A(Context context) {
        return context.getSharedPreferences(bb[493], 0).getString(bb[492], null);
    }

    public static void B(Context context) {
        try {
            if (!E) {
                ab abVar = new ab();
                try {
                    abVar.b(bb[143]);
                    if (!aX) {
                        dg.a();
                        ve.b();
                    }
                    try {
                        if (!aX) {
                            if (!ax) {
                                try {
                                    ax = true;
                                    Log.i(bb[144]);
                                    if (G) {
                                        try {
                                            if (am <= 2) {
                                                a(context, true, false, false, true, null);
                                            }
                                        } catch (NumberFormatException e) {
                                            throw e;
                                        }
                                    }
                                    e.d();
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            }
                        }
                        try {
                            if (!ah) {
                                ah = true;
                            }
                            try {
                                SettingsChat.b();
                                SettingsGoogleDrive.f();
                                if (aK()) {
                                    bq.a(new a3l(false), new Void[0]);
                                }
                                bq.a(new ars());
                                abVar.b();
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        } catch (NumberFormatException e222) {
                            throw e222;
                        }
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                } catch (NumberFormatException e222222) {
                    throw e222222;
                }
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    private static boolean m() {
        try {
            Class.forName(bb[319]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.lang.String r13, boolean r14, boolean r15, boolean r16, java.util.EnumSet r17, java.io.File r18, java.lang.String r19) {
        /*
        r11 = com.whatsapp.DialogToastActivity.f;
        r12 = new com.whatsapp.util.ab;
        r12.<init>();
        r2 = bb;
        r3 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r2 = r2[r3];
        r12.b(r2);
        r10 = 0;
        r2 = com.whatsapp.util.Log.a();
        if (r2 == 0) goto L_0x014f;
    L_0x0017:
        r4 = 0;
        r3 = 0;
        r9 = com.whatsapp.util.Log.b();	 Catch:{ Exception -> 0x0142, all -> 0x0137 }
        r2 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r4 = 0;
        r8 = com.whatsapp.util.a1.a(r9, r2, r4);	 Catch:{ Exception -> 0x0145, all -> 0x013b }
        if (r8 == 0) goto L_0x014d;
    L_0x0026:
        r2 = bb;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r12.a(r2);	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r2 = new com.whatsapp.mk;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = com.whatsapp.azx.g;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r3.<init>(r8);	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r4 = bb;	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r5 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r5 = r8.getName();	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r6 = 0;
        r2.a(r3, r4, r5, r6);	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        if (r18 == 0) goto L_0x005f;
    L_0x004d:
        r3 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r0 = r18;
        r3.<init>(r0);	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r5 = r18.getName();	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
        r6 = 0;
        r4 = r19;
        r2.a(r3, r4, r5, r6);	 Catch:{ Exception -> 0x00ec, all -> 0x011b }
    L_0x005f:
        r3 = bb;	 Catch:{ Exception -> 0x0119, all -> 0x011b }
        r4 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0119, all -> 0x011b }
        r2.a(r3, r13);	 Catch:{ Exception -> 0x0119, all -> 0x011b }
        if (r17 == 0) goto L_0x00aa;
    L_0x006a:
        r3 = r17.isEmpty();	 Catch:{ Exception -> 0x0119, all -> 0x011b }
        if (r3 != 0) goto L_0x00aa;
    L_0x0070:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r4.<init>();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r5 = r17.iterator();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x0079:
        r3 = r5.hasNext();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        if (r3 == 0) goto L_0x0094;
    L_0x007f:
        r3 = r5.next();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = (com.whatsapp.av3) r3;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = r3.getType();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = r4.append(r3);	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r6 = 44;
        r3.append(r6);	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        if (r11 == 0) goto L_0x0079;
    L_0x0094:
        r3 = r4.length();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = r3 + -1;
        r4.setLength(r3);	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r3 = bb;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r5 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r3 = r3[r5];	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r4 = r4.toString();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
        r2.a(r3, r4);	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x00aa:
        if (r15 == 0) goto L_0x00bb;
    L_0x00ac:
        r3 = bb;	 Catch:{ Exception -> 0x0124, all -> 0x011b }
        r4 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0124, all -> 0x011b }
        r4 = bb;	 Catch:{ Exception -> 0x0124, all -> 0x011b }
        r5 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0124, all -> 0x011b }
        r2.a(r3, r4);	 Catch:{ Exception -> 0x0124, all -> 0x011b }
    L_0x00bb:
        if (r16 == 0) goto L_0x00cc;
    L_0x00bd:
        r3 = bb;	 Catch:{ Exception -> 0x0126, all -> 0x011b }
        r4 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0126, all -> 0x011b }
        r4 = bb;	 Catch:{ Exception -> 0x0126, all -> 0x011b }
        r5 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0126, all -> 0x011b }
        r2.a(r3, r4);	 Catch:{ Exception -> 0x0126, all -> 0x011b }
    L_0x00cc:
        r3 = r2.b();	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x00d0:
        if (r14 == 0) goto L_0x00d5;
    L_0x00d2:
        com.whatsapp.util.Log.j();	 Catch:{ Exception -> 0x0128, all -> 0x011b }
    L_0x00d5:
        if (r8 == 0) goto L_0x014b;
    L_0x00d7:
        if (r8 == r9) goto L_0x014b;
    L_0x00d9:
        r8.delete();	 Catch:{ Exception -> 0x012f }
        r2 = r3;
    L_0x00dd:
        if (r11 == 0) goto L_0x00e8;
    L_0x00df:
        r3 = bb;	 Catch:{ Exception -> 0x0135 }
        r4 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0135 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ Exception -> 0x0135 }
    L_0x00e8:
        r12.b();
        return r2;
    L_0x00ec:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x00ee:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        r5 = r10;
    L_0x00f2:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x013e }
        r6.<init>();	 Catch:{ all -> 0x013e }
        r7 = bb;	 Catch:{ all -> 0x013e }
        r8 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x013e }
        r6 = r6.append(r7);	 Catch:{ all -> 0x013e }
        r2 = r2.toString();	 Catch:{ all -> 0x013e }
        r2 = r6.append(r2);	 Catch:{ all -> 0x013e }
        r2 = r2.toString();	 Catch:{ all -> 0x013e }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x013e }
        if (r3 == 0) goto L_0x0149;
    L_0x0112:
        if (r3 == r4) goto L_0x0149;
    L_0x0114:
        r3.delete();	 Catch:{ Exception -> 0x0131 }
        r2 = r5;
        goto L_0x00dd;
    L_0x0119:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x011b:
        r2 = move-exception;
    L_0x011c:
        if (r8 == 0) goto L_0x0123;
    L_0x011e:
        if (r8 == r9) goto L_0x0123;
    L_0x0120:
        r8.delete();	 Catch:{ Exception -> 0x0133 }
    L_0x0123:
        throw r2;
    L_0x0124:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x0126:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ee, all -> 0x011b }
    L_0x0128:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x012a, all -> 0x011b }
    L_0x012a:
        r2 = move-exception;
        r4 = r9;
        r5 = r3;
        r3 = r8;
        goto L_0x00f2;
    L_0x012f:
        r2 = move-exception;
        throw r2;
    L_0x0131:
        r2 = move-exception;
        throw r2;
    L_0x0133:
        r2 = move-exception;
        throw r2;
    L_0x0135:
        r2 = move-exception;
        throw r2;
    L_0x0137:
        r2 = move-exception;
        r8 = r3;
        r9 = r4;
        goto L_0x011c;
    L_0x013b:
        r2 = move-exception;
        r8 = r3;
        goto L_0x011c;
    L_0x013e:
        r2 = move-exception;
        r8 = r3;
        r9 = r4;
        goto L_0x011c;
    L_0x0142:
        r2 = move-exception;
        r5 = r10;
        goto L_0x00f2;
    L_0x0145:
        r2 = move-exception;
        r4 = r9;
        r5 = r10;
        goto L_0x00f2;
    L_0x0149:
        r2 = r5;
        goto L_0x00dd;
    L_0x014b:
        r2 = r3;
        goto L_0x00dd;
    L_0x014d:
        r3 = r10;
        goto L_0x00d0;
    L_0x014f:
        r2 = r10;
        goto L_0x00df;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(java.lang.String, boolean, boolean, boolean, java.util.EnumSet, java.io.File, java.lang.String):boolean");
    }

    private static void a(byte[] bArr, String str) {
        if (c) {
            M.b(co.a(Pair.create(bArr, new fi(bArr, str))));
        }
    }

    public void onEvent(b_ b_Var) {
        boolean z = DialogToastActivity.f;
        try {
            if (ai() && b_Var.c != null) {
                aK.a(qm.e(b_Var.b, null));
                Iterator it = qa.i().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Set l = qm.c(str).l();
                    try {
                        if (l.contains(b_Var.b)) {
                            if (!l.contains(as.e().p)) {
                                try {
                                    if (!l5.g(str)) {
                                        continue;
                                    }
                                } catch (NumberFormatException e) {
                                    throw e;
                                }
                            }
                            aK.a(qm.e(str, b_Var.b));
                            continue;
                        }
                        if (z) {
                            return;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static void I(String str) {
        try {
            if (!l5.e(str)) {
                try {
                    if (!as.d(str)) {
                        boolean a = a1.a(str);
                        try {
                            int i;
                            Handler handler = L;
                            if (a) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            handler.obtainMessage(1, i, 0, A(str)).sendToTarget();
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

    public static int h(Context context, String str) {
        try {
            if (VERSION.SDK_INT < 23) {
                return 0;
            }
            int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
            if (checkSelfPermission != 0) {
                return checkSelfPermission;
            }
            try {
                g(context, str);
                return checkSelfPermission;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static boolean N() {
        return c;
    }

    public Handler M() {
        return aZ;
    }

    public static void a(String str, c2 c2Var, int i) {
        List arrayList = new ArrayList(1);
        arrayList.add(c2Var);
        a(str, arrayList, i);
    }

    private static void f(boolean z) {
        try {
            Log.i(bb[224] + h + ' ' + z);
            if (h != 1) {
                if (h == 2) {
                    try {
                        p.aN.a(z());
                        h = 1;
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (NumberFormatException e) {
                        try {
                            throw e;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                }
                if (z) {
                    try {
                        h = 1;
                        if (!aI) {
                            X();
                        }
                        try {
                            if (!B) {
                                if (c) {
                                    bq.a(new a1(z()), new Void[0]);
                                }
                            }
                        } catch (NumberFormatException e22) {
                            throw e22;
                        } catch (NumberFormatException e222) {
                            throw e222;
                        }
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    }
                }
            }
        } catch (NumberFormatException e22222) {
            throw e22222;
        } catch (NumberFormatException e222222) {
            throw e222222;
        }
    }

    public static void a(String str, Collection collection, int i) {
        boolean z = DialogToastActivity.f;
        try {
            if (wn.q() && str != null && collection != null) {
                try {
                    if (collection.size() != 0) {
                        _d _dVar = new _d(new s6(str, collection, i));
                        List arrayList = new ArrayList(collection.size());
                        for (com.whatsapp.protocol.co coVar : collection) {
                            arrayList.add(coVar.k);
                            if (z) {
                                break;
                            }
                        }
                        String u = wn.u();
                        p.ai.a(new SendWebForwardJob(u, co.a(u, str, arrayList, i, _dVar)));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            try {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(com.whatsapp.protocol.co r6, com.whatsapp.l5 r7, com.whatsapp.l5 r8) {
        /*
        r1 = 0;
        r2 = 1;
        r0 = r6.c;	 Catch:{ NumberFormatException -> 0x000c }
        r3 = 2;
        if (r0 != r3) goto L_0x0010;
    L_0x0007:
        r0 = r6.r;	 Catch:{ NumberFormatException -> 0x000e }
        if (r0 != r2) goto L_0x0010;
    L_0x000b:
        return r2;
    L_0x000c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r6.c;	 Catch:{ NumberFormatException -> 0x0064 }
        r0 = b(r0);	 Catch:{ NumberFormatException -> 0x0064 }
        if (r0 == 0) goto L_0x0080;
    L_0x0018:
        r0 = r7.c();	 Catch:{ NumberFormatException -> 0x0064 }
        if (r0 == 0) goto L_0x0078;
    L_0x001e:
        r0 = as;
        r3 = r7.a();
        r3 = r0.b(r3);
        r0 = ay;	 Catch:{ NumberFormatException -> 0x0066 }
        if (r0 == 0) goto L_0x0068;
    L_0x002c:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0066 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0066 }
        r4 = ay;	 Catch:{ NumberFormatException -> 0x0066 }
        r4 = r4.jabber_id;	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0066 }
        r4 = bb;	 Catch:{ NumberFormatException -> 0x0066 }
        r5 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x0047:
        r4 = r7.p;	 Catch:{ NumberFormatException -> 0x006c }
        r4 = com.whatsapp.qm.f(r4);	 Catch:{ NumberFormatException -> 0x006c }
        if (r4 != 0) goto L_0x0061;
    L_0x004f:
        r4 = r3.l;	 Catch:{ NumberFormatException -> 0x006e }
        if (r4 != 0) goto L_0x0061;
    L_0x0053:
        r3 = r3.p;	 Catch:{ NumberFormatException -> 0x0070 }
        r0 = r0.equals(r3);	 Catch:{ NumberFormatException -> 0x0070 }
        if (r0 != 0) goto L_0x0061;
    L_0x005b:
        if (r8 == 0) goto L_0x0076;
    L_0x005d:
        r0 = r8.l;	 Catch:{ NumberFormatException -> 0x0074 }
        if (r0 == 0) goto L_0x0076;
    L_0x0061:
        r0 = r2;
    L_0x0062:
        r2 = r0;
        goto L_0x000b;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = "";
        goto L_0x0047;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = r1;
        goto L_0x0062;
    L_0x0078:
        r0 = r7.l;	 Catch:{ NumberFormatException -> 0x007e }
        if (r0 != 0) goto L_0x000b;
    L_0x007c:
        r2 = r1;
        goto L_0x000b;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r2 = r1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.co, com.whatsapp.l5, com.whatsapp.l5):boolean");
    }

    static void b(String[] strArr) {
        c(strArr);
    }

    static void aw() {
        aG();
    }

    public static boolean a(HashSet hashSet) {
        Throwable e;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2;
        try {
            objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(new File(z().getFilesDir(), bb[464])));
            try {
                objectOutputStream2.writeObject(hashSet);
                if (objectOutputStream2 == null) {
                    return true;
                }
                try {
                    objectOutputStream2.close();
                    return true;
                } catch (Throwable e2) {
                    Log.a(e2);
                    return true;
                } catch (NumberFormatException e3) {
                    throw e3;
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    Log.a(e);
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (Throwable e5) {
                            Log.a(e5);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    e5 = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable e22) {
                            Log.a(e22);
                        } catch (NumberFormatException e32) {
                            throw e32;
                        }
                    }
                    throw e5;
                }
            }
        } catch (IOException e6) {
            e5 = e6;
            objectOutputStream2 = null;
            Log.a(e5);
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            return false;
        } catch (Throwable th2) {
            e5 = th2;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw e5;
        }
    }

    static List b(List list, List list2, boolean z) {
        return a(list, list2, z);
    }

    public static void a(Context context, @NonNull String str) {
        Editor edit = context.getSharedPreferences(bb[15], 0).edit();
        try {
            edit.putBoolean(str, true);
            if (!edit.commit()) {
                Log.e(bb[14]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r1 = -1;
        r4 = 2;
        r5 = 3;
        r3 = 1;
        r2 = 0;
        r0 = 637; // 0x27d float:8.93E-43 double:3.147E-321;
        r6 = new java.lang.String[r0];
        r0 = "m\u0000\t";
        r7 = r2;
        r8 = r6;
        r9 = r6;
        r6 = r0;
        r0 = r1;
    L_0x0011:
        r6 = z(r6);
        r6 = z(r6);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0030;
            case 2: goto L_0x003a;
            case 3: goto L_0x0045;
            case 4: goto L_0x004e;
            case 5: goto L_0x0057;
            case 6: goto L_0x0060;
            case 7: goto L_0x006a;
            case 8: goto L_0x0075;
            case 9: goto L_0x0080;
            case 10: goto L_0x008b;
            case 11: goto L_0x0097;
            case 12: goto L_0x00a3;
            case 13: goto L_0x00af;
            case 14: goto L_0x00bb;
            case 15: goto L_0x00c7;
            case 16: goto L_0x00d3;
            case 17: goto L_0x00df;
            case 18: goto L_0x00eb;
            case 19: goto L_0x00f7;
            case 20: goto L_0x0103;
            case 21: goto L_0x010f;
            case 22: goto L_0x011b;
            case 23: goto L_0x0127;
            case 24: goto L_0x0133;
            case 25: goto L_0x013f;
            case 26: goto L_0x014b;
            case 27: goto L_0x0157;
            case 28: goto L_0x0163;
            case 29: goto L_0x016f;
            case 30: goto L_0x017b;
            case 31: goto L_0x0187;
            case 32: goto L_0x0193;
            case 33: goto L_0x019f;
            case 34: goto L_0x01ab;
            case 35: goto L_0x01b7;
            case 36: goto L_0x01c3;
            case 37: goto L_0x01cf;
            case 38: goto L_0x01db;
            case 39: goto L_0x01e7;
            case 40: goto L_0x01f3;
            case 41: goto L_0x01ff;
            case 42: goto L_0x020b;
            case 43: goto L_0x0217;
            case 44: goto L_0x0223;
            case 45: goto L_0x022f;
            case 46: goto L_0x023b;
            case 47: goto L_0x0247;
            case 48: goto L_0x0253;
            case 49: goto L_0x025f;
            case 50: goto L_0x026b;
            case 51: goto L_0x0277;
            case 52: goto L_0x0283;
            case 53: goto L_0x028f;
            case 54: goto L_0x029b;
            case 55: goto L_0x02a7;
            case 56: goto L_0x02b3;
            case 57: goto L_0x02bf;
            case 58: goto L_0x02cb;
            case 59: goto L_0x02d7;
            case 60: goto L_0x02e3;
            case 61: goto L_0x02ef;
            case 62: goto L_0x02fb;
            case 63: goto L_0x0307;
            case 64: goto L_0x0313;
            case 65: goto L_0x031f;
            case 66: goto L_0x032b;
            case 67: goto L_0x0337;
            case 68: goto L_0x0343;
            case 69: goto L_0x034f;
            case 70: goto L_0x035b;
            case 71: goto L_0x0367;
            case 72: goto L_0x0373;
            case 73: goto L_0x037f;
            case 74: goto L_0x038b;
            case 75: goto L_0x0397;
            case 76: goto L_0x03a3;
            case 77: goto L_0x03af;
            case 78: goto L_0x03bb;
            case 79: goto L_0x03c7;
            case 80: goto L_0x03d3;
            case 81: goto L_0x03df;
            case 82: goto L_0x03eb;
            case 83: goto L_0x03f7;
            case 84: goto L_0x0403;
            case 85: goto L_0x040f;
            case 86: goto L_0x041b;
            case 87: goto L_0x0427;
            case 88: goto L_0x0433;
            case 89: goto L_0x043f;
            case 90: goto L_0x044b;
            case 91: goto L_0x0457;
            case 92: goto L_0x0463;
            case 93: goto L_0x046f;
            case 94: goto L_0x047b;
            case 95: goto L_0x0487;
            case 96: goto L_0x0493;
            case 97: goto L_0x049f;
            case 98: goto L_0x04ab;
            case 99: goto L_0x04b7;
            case 100: goto L_0x04c3;
            case 101: goto L_0x04cf;
            case 102: goto L_0x04db;
            case 103: goto L_0x04e7;
            case 104: goto L_0x04f3;
            case 105: goto L_0x04ff;
            case 106: goto L_0x050b;
            case 107: goto L_0x0517;
            case 108: goto L_0x0523;
            case 109: goto L_0x052f;
            case 110: goto L_0x053b;
            case 111: goto L_0x0547;
            case 112: goto L_0x0553;
            case 113: goto L_0x055f;
            case 114: goto L_0x056b;
            case 115: goto L_0x0577;
            case 116: goto L_0x0583;
            case 117: goto L_0x058f;
            case 118: goto L_0x059b;
            case 119: goto L_0x05a7;
            case 120: goto L_0x05b3;
            case 121: goto L_0x05bf;
            case 122: goto L_0x05cb;
            case 123: goto L_0x05d7;
            case 124: goto L_0x05e3;
            case 125: goto L_0x05ef;
            case 126: goto L_0x05fb;
            case 127: goto L_0x0607;
            case 128: goto L_0x0613;
            case 129: goto L_0x061f;
            case 130: goto L_0x062b;
            case 131: goto L_0x0637;
            case 132: goto L_0x0643;
            case 133: goto L_0x064f;
            case 134: goto L_0x065b;
            case 135: goto L_0x0667;
            case 136: goto L_0x0673;
            case 137: goto L_0x067f;
            case 138: goto L_0x068b;
            case 139: goto L_0x0697;
            case 140: goto L_0x06a3;
            case 141: goto L_0x06af;
            case 142: goto L_0x06bb;
            case 143: goto L_0x06c7;
            case 144: goto L_0x06d3;
            case 145: goto L_0x06df;
            case 146: goto L_0x06eb;
            case 147: goto L_0x06f7;
            case 148: goto L_0x0703;
            case 149: goto L_0x070f;
            case 150: goto L_0x071b;
            case 151: goto L_0x0727;
            case 152: goto L_0x0733;
            case 153: goto L_0x073f;
            case 154: goto L_0x074b;
            case 155: goto L_0x0757;
            case 156: goto L_0x0763;
            case 157: goto L_0x076f;
            case 158: goto L_0x077b;
            case 159: goto L_0x0787;
            case 160: goto L_0x0793;
            case 161: goto L_0x079f;
            case 162: goto L_0x07ab;
            case 163: goto L_0x07b7;
            case 164: goto L_0x07c3;
            case 165: goto L_0x07cf;
            case 166: goto L_0x07db;
            case 167: goto L_0x07e7;
            case 168: goto L_0x07f3;
            case 169: goto L_0x07ff;
            case 170: goto L_0x080b;
            case 171: goto L_0x0817;
            case 172: goto L_0x0823;
            case 173: goto L_0x082f;
            case 174: goto L_0x083b;
            case 175: goto L_0x0847;
            case 176: goto L_0x0853;
            case 177: goto L_0x085f;
            case 178: goto L_0x086b;
            case 179: goto L_0x0877;
            case 180: goto L_0x0883;
            case 181: goto L_0x088f;
            case 182: goto L_0x089b;
            case 183: goto L_0x08a7;
            case 184: goto L_0x08b3;
            case 185: goto L_0x08bf;
            case 186: goto L_0x08cb;
            case 187: goto L_0x08d7;
            case 188: goto L_0x08e3;
            case 189: goto L_0x08ef;
            case 190: goto L_0x08fb;
            case 191: goto L_0x0907;
            case 192: goto L_0x0913;
            case 193: goto L_0x091f;
            case 194: goto L_0x092b;
            case 195: goto L_0x0937;
            case 196: goto L_0x0943;
            case 197: goto L_0x094f;
            case 198: goto L_0x095b;
            case 199: goto L_0x0967;
            case 200: goto L_0x0973;
            case 201: goto L_0x097f;
            case 202: goto L_0x098b;
            case 203: goto L_0x0997;
            case 204: goto L_0x09a3;
            case 205: goto L_0x09af;
            case 206: goto L_0x09bb;
            case 207: goto L_0x09c7;
            case 208: goto L_0x09d3;
            case 209: goto L_0x09df;
            case 210: goto L_0x09eb;
            case 211: goto L_0x09f7;
            case 212: goto L_0x0a03;
            case 213: goto L_0x0a0f;
            case 214: goto L_0x0a1b;
            case 215: goto L_0x0a27;
            case 216: goto L_0x0a33;
            case 217: goto L_0x0a3f;
            case 218: goto L_0x0a4b;
            case 219: goto L_0x0a57;
            case 220: goto L_0x0a63;
            case 221: goto L_0x0a6f;
            case 222: goto L_0x0a7b;
            case 223: goto L_0x0a87;
            case 224: goto L_0x0a93;
            case 225: goto L_0x0a9f;
            case 226: goto L_0x0aab;
            case 227: goto L_0x0ab7;
            case 228: goto L_0x0ac3;
            case 229: goto L_0x0acf;
            case 230: goto L_0x0adb;
            case 231: goto L_0x0ae7;
            case 232: goto L_0x0af3;
            case 233: goto L_0x0aff;
            case 234: goto L_0x0b0b;
            case 235: goto L_0x0b17;
            case 236: goto L_0x0b23;
            case 237: goto L_0x0b2f;
            case 238: goto L_0x0b3b;
            case 239: goto L_0x0b47;
            case 240: goto L_0x0b53;
            case 241: goto L_0x0b5f;
            case 242: goto L_0x0b6b;
            case 243: goto L_0x0b77;
            case 244: goto L_0x0b83;
            case 245: goto L_0x0b8f;
            case 246: goto L_0x0b9b;
            case 247: goto L_0x0ba7;
            case 248: goto L_0x0bb3;
            case 249: goto L_0x0bbf;
            case 250: goto L_0x0bcb;
            case 251: goto L_0x0bd7;
            case 252: goto L_0x0be3;
            case 253: goto L_0x0bef;
            case 254: goto L_0x0bfb;
            case 255: goto L_0x0c07;
            case 256: goto L_0x0c13;
            case 257: goto L_0x0c1f;
            case 258: goto L_0x0c2b;
            case 259: goto L_0x0c37;
            case 260: goto L_0x0c43;
            case 261: goto L_0x0c4f;
            case 262: goto L_0x0c5b;
            case 263: goto L_0x0c67;
            case 264: goto L_0x0c73;
            case 265: goto L_0x0c7f;
            case 266: goto L_0x0c8b;
            case 267: goto L_0x0c97;
            case 268: goto L_0x0ca3;
            case 269: goto L_0x0caf;
            case 270: goto L_0x0cbb;
            case 271: goto L_0x0cc7;
            case 272: goto L_0x0cd3;
            case 273: goto L_0x0cdf;
            case 274: goto L_0x0ceb;
            case 275: goto L_0x0cf7;
            case 276: goto L_0x0d03;
            case 277: goto L_0x0d0f;
            case 278: goto L_0x0d1b;
            case 279: goto L_0x0d27;
            case 280: goto L_0x0d33;
            case 281: goto L_0x0d3f;
            case 282: goto L_0x0d4b;
            case 283: goto L_0x0d57;
            case 284: goto L_0x0d63;
            case 285: goto L_0x0d6f;
            case 286: goto L_0x0d7b;
            case 287: goto L_0x0d87;
            case 288: goto L_0x0d93;
            case 289: goto L_0x0d9f;
            case 290: goto L_0x0dab;
            case 291: goto L_0x0db7;
            case 292: goto L_0x0dc3;
            case 293: goto L_0x0dcf;
            case 294: goto L_0x0ddb;
            case 295: goto L_0x0de7;
            case 296: goto L_0x0df3;
            case 297: goto L_0x0dff;
            case 298: goto L_0x0e0b;
            case 299: goto L_0x0e17;
            case 300: goto L_0x0e23;
            case 301: goto L_0x0e2f;
            case 302: goto L_0x0e3b;
            case 303: goto L_0x0e47;
            case 304: goto L_0x0e53;
            case 305: goto L_0x0e5f;
            case 306: goto L_0x0e6b;
            case 307: goto L_0x0e77;
            case 308: goto L_0x0e83;
            case 309: goto L_0x0e8f;
            case 310: goto L_0x0e9b;
            case 311: goto L_0x0ea7;
            case 312: goto L_0x0eb3;
            case 313: goto L_0x0ebf;
            case 314: goto L_0x0ecb;
            case 315: goto L_0x0ed7;
            case 316: goto L_0x0ee3;
            case 317: goto L_0x0eef;
            case 318: goto L_0x0efb;
            case 319: goto L_0x0f07;
            case 320: goto L_0x0f13;
            case 321: goto L_0x0f1f;
            case 322: goto L_0x0f2b;
            case 323: goto L_0x0f37;
            case 324: goto L_0x0f43;
            case 325: goto L_0x0f4f;
            case 326: goto L_0x0f5b;
            case 327: goto L_0x0f67;
            case 328: goto L_0x0f73;
            case 329: goto L_0x0f7f;
            case 330: goto L_0x0f8b;
            case 331: goto L_0x0f97;
            case 332: goto L_0x0fa3;
            case 333: goto L_0x0faf;
            case 334: goto L_0x0fbb;
            case 335: goto L_0x0fc7;
            case 336: goto L_0x0fd3;
            case 337: goto L_0x0fdf;
            case 338: goto L_0x0feb;
            case 339: goto L_0x0ff7;
            case 340: goto L_0x1003;
            case 341: goto L_0x100f;
            case 342: goto L_0x101b;
            case 343: goto L_0x1027;
            case 344: goto L_0x1033;
            case 345: goto L_0x103f;
            case 346: goto L_0x104b;
            case 347: goto L_0x1057;
            case 348: goto L_0x1063;
            case 349: goto L_0x106f;
            case 350: goto L_0x107b;
            case 351: goto L_0x1087;
            case 352: goto L_0x1093;
            case 353: goto L_0x109f;
            case 354: goto L_0x10ab;
            case 355: goto L_0x10b7;
            case 356: goto L_0x10c3;
            case 357: goto L_0x10cf;
            case 358: goto L_0x10db;
            case 359: goto L_0x10e7;
            case 360: goto L_0x10f3;
            case 361: goto L_0x10ff;
            case 362: goto L_0x110b;
            case 363: goto L_0x1117;
            case 364: goto L_0x1123;
            case 365: goto L_0x112f;
            case 366: goto L_0x113b;
            case 367: goto L_0x1147;
            case 368: goto L_0x1153;
            case 369: goto L_0x115f;
            case 370: goto L_0x116b;
            case 371: goto L_0x1177;
            case 372: goto L_0x1183;
            case 373: goto L_0x118f;
            case 374: goto L_0x119b;
            case 375: goto L_0x11a7;
            case 376: goto L_0x11b3;
            case 377: goto L_0x11bf;
            case 378: goto L_0x11cb;
            case 379: goto L_0x11d7;
            case 380: goto L_0x11e3;
            case 381: goto L_0x11ef;
            case 382: goto L_0x11fb;
            case 383: goto L_0x1207;
            case 384: goto L_0x1213;
            case 385: goto L_0x121f;
            case 386: goto L_0x122b;
            case 387: goto L_0x1237;
            case 388: goto L_0x1243;
            case 389: goto L_0x124f;
            case 390: goto L_0x125b;
            case 391: goto L_0x1267;
            case 392: goto L_0x1273;
            case 393: goto L_0x127f;
            case 394: goto L_0x128b;
            case 395: goto L_0x1297;
            case 396: goto L_0x12a3;
            case 397: goto L_0x12af;
            case 398: goto L_0x12bb;
            case 399: goto L_0x12c7;
            case 400: goto L_0x12d3;
            case 401: goto L_0x12df;
            case 402: goto L_0x12eb;
            case 403: goto L_0x12f7;
            case 404: goto L_0x1303;
            case 405: goto L_0x130f;
            case 406: goto L_0x131b;
            case 407: goto L_0x1327;
            case 408: goto L_0x1333;
            case 409: goto L_0x133f;
            case 410: goto L_0x134b;
            case 411: goto L_0x1357;
            case 412: goto L_0x1363;
            case 413: goto L_0x136f;
            case 414: goto L_0x137b;
            case 415: goto L_0x1387;
            case 416: goto L_0x1393;
            case 417: goto L_0x139f;
            case 418: goto L_0x13ab;
            case 419: goto L_0x13b7;
            case 420: goto L_0x13c3;
            case 421: goto L_0x13cf;
            case 422: goto L_0x13db;
            case 423: goto L_0x13e7;
            case 424: goto L_0x13f3;
            case 425: goto L_0x13ff;
            case 426: goto L_0x140b;
            case 427: goto L_0x1417;
            case 428: goto L_0x1423;
            case 429: goto L_0x142f;
            case 430: goto L_0x143b;
            case 431: goto L_0x1447;
            case 432: goto L_0x1453;
            case 433: goto L_0x145f;
            case 434: goto L_0x146b;
            case 435: goto L_0x1477;
            case 436: goto L_0x1483;
            case 437: goto L_0x148f;
            case 438: goto L_0x149b;
            case 439: goto L_0x14a7;
            case 440: goto L_0x14b3;
            case 441: goto L_0x14bf;
            case 442: goto L_0x14cb;
            case 443: goto L_0x14d7;
            case 444: goto L_0x14e3;
            case 445: goto L_0x14ef;
            case 446: goto L_0x14fb;
            case 447: goto L_0x1507;
            case 448: goto L_0x1513;
            case 449: goto L_0x151f;
            case 450: goto L_0x152b;
            case 451: goto L_0x1537;
            case 452: goto L_0x1543;
            case 453: goto L_0x154f;
            case 454: goto L_0x155b;
            case 455: goto L_0x1567;
            case 456: goto L_0x1573;
            case 457: goto L_0x157f;
            case 458: goto L_0x158b;
            case 459: goto L_0x1597;
            case 460: goto L_0x15a3;
            case 461: goto L_0x15af;
            case 462: goto L_0x15bb;
            case 463: goto L_0x15c7;
            case 464: goto L_0x15d3;
            case 465: goto L_0x15df;
            case 466: goto L_0x15eb;
            case 467: goto L_0x15f7;
            case 468: goto L_0x1603;
            case 469: goto L_0x160f;
            case 470: goto L_0x161b;
            case 471: goto L_0x1627;
            case 472: goto L_0x1633;
            case 473: goto L_0x163f;
            case 474: goto L_0x164b;
            case 475: goto L_0x1657;
            case 476: goto L_0x1663;
            case 477: goto L_0x166f;
            case 478: goto L_0x167b;
            case 479: goto L_0x1687;
            case 480: goto L_0x1693;
            case 481: goto L_0x169f;
            case 482: goto L_0x16ab;
            case 483: goto L_0x16b7;
            case 484: goto L_0x16c3;
            case 485: goto L_0x16cf;
            case 486: goto L_0x16db;
            case 487: goto L_0x16e7;
            case 488: goto L_0x16f3;
            case 489: goto L_0x16ff;
            case 490: goto L_0x170b;
            case 491: goto L_0x1717;
            case 492: goto L_0x1723;
            case 493: goto L_0x172f;
            case 494: goto L_0x173b;
            case 495: goto L_0x1747;
            case 496: goto L_0x1753;
            case 497: goto L_0x175f;
            case 498: goto L_0x176b;
            case 499: goto L_0x1777;
            case 500: goto L_0x1783;
            case 501: goto L_0x178f;
            case 502: goto L_0x179b;
            case 503: goto L_0x17a7;
            case 504: goto L_0x17b3;
            case 505: goto L_0x17bf;
            case 506: goto L_0x17cb;
            case 507: goto L_0x17d7;
            case 508: goto L_0x17e3;
            case 509: goto L_0x17ef;
            case 510: goto L_0x17fb;
            case 511: goto L_0x1807;
            case 512: goto L_0x1813;
            case 513: goto L_0x181f;
            case 514: goto L_0x182b;
            case 515: goto L_0x1837;
            case 516: goto L_0x1843;
            case 517: goto L_0x184f;
            case 518: goto L_0x185b;
            case 519: goto L_0x1867;
            case 520: goto L_0x1873;
            case 521: goto L_0x187f;
            case 522: goto L_0x188b;
            case 523: goto L_0x1897;
            case 524: goto L_0x18a3;
            case 525: goto L_0x18af;
            case 526: goto L_0x18bb;
            case 527: goto L_0x18c7;
            case 528: goto L_0x18d3;
            case 529: goto L_0x18df;
            case 530: goto L_0x18eb;
            case 531: goto L_0x18f7;
            case 532: goto L_0x1903;
            case 533: goto L_0x190f;
            case 534: goto L_0x191b;
            case 535: goto L_0x1927;
            case 536: goto L_0x1933;
            case 537: goto L_0x193f;
            case 538: goto L_0x194b;
            case 539: goto L_0x1957;
            case 540: goto L_0x1963;
            case 541: goto L_0x196f;
            case 542: goto L_0x197b;
            case 543: goto L_0x1987;
            case 544: goto L_0x1993;
            case 545: goto L_0x199f;
            case 546: goto L_0x19ab;
            case 547: goto L_0x19b7;
            case 548: goto L_0x19c3;
            case 549: goto L_0x19cf;
            case 550: goto L_0x19db;
            case 551: goto L_0x19e7;
            case 552: goto L_0x19f3;
            case 553: goto L_0x19ff;
            case 554: goto L_0x1a0b;
            case 555: goto L_0x1a17;
            case 556: goto L_0x1a23;
            case 557: goto L_0x1a2f;
            case 558: goto L_0x1a3b;
            case 559: goto L_0x1a47;
            case 560: goto L_0x1a53;
            case 561: goto L_0x1a5f;
            case 562: goto L_0x1a6b;
            case 563: goto L_0x1a77;
            case 564: goto L_0x1a83;
            case 565: goto L_0x1a8f;
            case 566: goto L_0x1a9b;
            case 567: goto L_0x1aa7;
            case 568: goto L_0x1ab3;
            case 569: goto L_0x1abf;
            case 570: goto L_0x1acb;
            case 571: goto L_0x1ad7;
            case 572: goto L_0x1ae3;
            case 573: goto L_0x1aef;
            case 574: goto L_0x1afb;
            case 575: goto L_0x1b07;
            case 576: goto L_0x1b13;
            case 577: goto L_0x1b1f;
            case 578: goto L_0x1b2b;
            case 579: goto L_0x1b37;
            case 580: goto L_0x1b43;
            case 581: goto L_0x1b4f;
            case 582: goto L_0x1b5b;
            case 583: goto L_0x1b67;
            case 584: goto L_0x1b73;
            case 585: goto L_0x1b7f;
            case 586: goto L_0x1b8b;
            case 587: goto L_0x1b97;
            case 588: goto L_0x1ba3;
            case 589: goto L_0x1baf;
            case 590: goto L_0x1bbb;
            case 591: goto L_0x1bc7;
            case 592: goto L_0x1bd3;
            case 593: goto L_0x1bdf;
            case 594: goto L_0x1beb;
            case 595: goto L_0x1bf7;
            case 596: goto L_0x1c03;
            case 597: goto L_0x1c0f;
            case 598: goto L_0x1c1b;
            case 599: goto L_0x1c27;
            case 600: goto L_0x1c33;
            case 601: goto L_0x1c3f;
            case 602: goto L_0x1c4b;
            case 603: goto L_0x1c57;
            case 604: goto L_0x1c63;
            case 605: goto L_0x1c6f;
            case 606: goto L_0x1c7b;
            case 607: goto L_0x1c87;
            case 608: goto L_0x1c93;
            case 609: goto L_0x1c9f;
            case 610: goto L_0x1cab;
            case 611: goto L_0x1cb7;
            case 612: goto L_0x1cc3;
            case 613: goto L_0x1ccf;
            case 614: goto L_0x1cdb;
            case 615: goto L_0x1ce7;
            case 616: goto L_0x1cf3;
            case 617: goto L_0x1cff;
            case 618: goto L_0x1d0b;
            case 619: goto L_0x1d17;
            case 620: goto L_0x1d23;
            case 621: goto L_0x1d2f;
            case 622: goto L_0x1d3b;
            case 623: goto L_0x1d47;
            case 624: goto L_0x1d53;
            case 625: goto L_0x1d5f;
            case 626: goto L_0x1d6b;
            case 627: goto L_0x1d77;
            case 628: goto L_0x1d83;
            case 629: goto L_0x1d8f;
            case 630: goto L_0x1d9b;
            case 631: goto L_0x1da7;
            case 632: goto L_0x1db3;
            case 633: goto L_0x1dbf;
            case 634: goto L_0x1dcb;
            case 635: goto L_0x1dd7;
            default: goto L_0x001c;
        };
    L_0x001c:
        r8[r7] = r6;
        r0 = "m\u0000\t";
        r6 = r0;
        r7 = r3;
        r8 = r9;
        r0 = r2;
        goto L_0x0011;
    L_0x0026:
        r8[r7] = r6;
        r0 = "\u007f\u0013\u001c\u001a[{\u001d\t\u0016Ep\u0004\u0011\u0000Cq\u0017\u001c\u0014R1\u0000\u000f\u0001XlJ\u0014\u001f[{\u0002\u001c\u001f\u001a\u007f\u0017\u001a";
        r6 = r0;
        r7 = r4;
        r8 = r9;
        r0 = r3;
        goto L_0x0011;
    L_0x0030:
        r8[r7] = r6;
        r0 = "\u007f\u0015\r\\D\u007f\u0013\u0018\\^q\u0000\u000f\u0001XlE";
        r6 = r0;
        r7 = r5;
        r8 = r9;
        r0 = r4;
        goto L_0x0011;
    L_0x003a:
        r8[r7] = r6;
        r6 = 4;
        r0 = "\u007f\u0015\r\\D\u007f\u0013\u0018\\Yq\u0011\u001b\u001cBp\u0001\u0018\u0001Eq\u0017]";
        r7 = r6;
        r8 = r9;
        r6 = r0;
        r0 = r5;
        goto L_0x0011;
    L_0x0045:
        r8[r7] = r6;
        r7 = 5;
        r6 = "\u007f\u0015\r\\D{\u000b\u00195^{\t\u0019 C\u007f\u0011\u000e";
        r0 = 4;
        r8 = r9;
        goto L_0x0011;
    L_0x004e:
        r8[r7] = r6;
        r7 = 6;
        r6 = "\u007f\u0015\r\\Cq\u0016\b\u0003S\u007f\u0011\u0018\\V}\u0006\u0018\u0003C>";
        r0 = 5;
        r8 = r9;
        goto L_0x0011;
    L_0x0057:
        r8[r7] = r6;
        r7 = 7;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 6;
        r8 = r9;
        goto L_0x0011;
    L_0x0060:
        r8[r7] = r6;
        r7 = 8;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]`L,)6h[=)6eP$1,dJ*/2p[";
        r0 = 7;
        r8 = r9;
        goto L_0x0011;
    L_0x006a:
        r8[r7] = r6;
        r7 = 9;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 8;
        r8 = r9;
        goto L_0x0011;
    L_0x0075:
        r8[r7] = r6;
        r7 = 10;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0010Xz\u0000";
        r0 = 9;
        r8 = r9;
        goto L_0x0011;
    L_0x0080:
        r8[r7] = r6;
        r7 = 11;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019 B|\u0016\u001e\u0001^|\u00001\u001cT\u007f\u0011\u0014\u001cYmJ";
        r0 = 10;
        r8 = r9;
        goto L_0x0011;
    L_0x008b:
        r8[r7] = r6;
        r7 = 12;
        r6 = "}\r\u000f\u001cZw\u0010\u0010";
        r0 = 11;
        r8 = r9;
        goto L_0x0011;
    L_0x0097:
        r8[r7] = r6;
        r7 = 13;
        r6 = "}\r\u000f\u001cZw\u0010\u0010";
        r0 = 12;
        r8 = r9;
        goto L_0x0011;
    L_0x00a3:
        r8[r7] = r6;
        r7 = 14;
        r6 = "\u007f\u0015\r\\D{\u0011P\u0003Rl\b\u0014\u0000Dw\n\u0013^E{\u0014\b\u0016Dj\u0000\u0019\\Q\u007f\f\u0011\u0016S";
        r0 = 13;
        r8 = r9;
        goto L_0x0011;
    L_0x00af:
        r8[r7] = r6;
        r7 = 15;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 14;
        r8 = r9;
        goto L_0x0011;
    L_0x00bb:
        r8[r7] = r6;
        r7 = 16;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0000Rj\u0011\u0014\u001dPmK.6cJ,34d";
        r0 = 15;
        r8 = r9;
        goto L_0x0011;
    L_0x00c7:
        r8[r7] = r6;
        r7 = 17;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0000Rj\u0011\u0014\u001dPmK<#gR,>2cW*3,s[1<:{M:.6cJ,34d";
        r0 = 16;
        r8 = r9;
        goto L_0x0011;
    L_0x00d3:
        r8[r7] = r6;
        r7 = 18;
        r6 = "n\u0004\u001e\u0018Vy\u0000";
        r0 = 17;
        r8 = r9;
        goto L_0x0011;
    L_0x00df:
        r8[r7] = r6;
        r7 = 19;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 18;
        r8 = r9;
        goto L_0x0011;
    L_0x00eb:
        r8[r7] = r6;
        r7 = 20;
        r6 = ">\t\u0012\u0010VrX";
        r0 = 19;
        r8 = r9;
        goto L_0x0011;
    L_0x00f7:
        r8[r7] = r6;
        r7 = 21;
        r6 = ">\u0017\u0018\u0002\n";
        r0 = 20;
        r8 = r9;
        goto L_0x0011;
    L_0x0103:
        r8[r7] = r6;
        r7 = 22;
        r6 = "\u007f\u0015\r\\D{\u0011>\u001cYh\u0000\u000f\u0000Vj\f\u0012\u001dd{\u0000\u0013\\FlJ\u0014\u001dA\u007f\t\u0014\u0017\u0017>";
        r0 = 21;
        r8 = r9;
        goto L_0x0011;
    L_0x010f:
        r8[r7] = r6;
        r7 = 23;
        r6 = ">\t\u0012\u0010VrX";
        r0 = 22;
        r8 = r9;
        goto L_0x0011;
    L_0x011b:
        r8[r7] = r6;
        r7 = 24;
        r6 = "\u007f\u0015\r\\D{\u0011>\u001cYh\u0000\u000f\u0000Vj\f\u0012\u001dd{\u0000\u0013\\FlJ\u0014\u001dA\u007f\t\u0014\u0017\u0017>";
        r0 = 23;
        r8 = r9;
        goto L_0x0011;
    L_0x0127:
        r8[r7] = r6;
        r7 = 25;
        r6 = ">\u0017\u0018\u0002\n";
        r0 = 24;
        r8 = r9;
        goto L_0x0011;
    L_0x0133:
        r8[r7] = r6;
        r7 = 26;
        r6 = "r\n\u001a\u001aYm:\n\u001aCv:\u0010\u0016Dm\u0004\u001a\u0016D";
        r0 = 25;
        r8 = r9;
        goto L_0x0011;
    L_0x013f:
        r8[r7] = r6;
        r7 = 27;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 26;
        r8 = r9;
        goto L_0x0011;
    L_0x014b:
        r8[r7] = r6;
        r7 = 28;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0000Rj\u0015\u000f\u001aA\u007f\u0006\u0004\u0000Rj\u0011\u0014\u001dPmE";
        r0 = 27;
        r8 = r9;
        goto L_0x0011;
    L_0x0157:
        r8[r7] = r6;
        r7 = 29;
        r6 = "h\n\u0014\u0003\u0018p\n\t\u001aQg&\u001c\u001f[S\f\u000e\u0000Rz";
        r0 = 28;
        r8 = r9;
        goto L_0x0011;
    L_0x0163:
        r8[r7] = r6;
        r7 = 30;
        r6 = "4JW";
        r0 = 29;
        r8 = r9;
        goto L_0x0011;
    L_0x016f:
        r8[r7] = r6;
        r7 = 31;
        r6 = "w\b\u001c\u0014R1O";
        r0 = 30;
        r8 = r9;
        goto L_0x0011;
    L_0x017b:
        r8[r7] = r6;
        r7 = 32;
        r6 = "h\f\u0019\u0016X1O";
        r0 = 31;
        r8 = r9;
        goto L_0x0011;
    L_0x0187:
        r8[r7] = r6;
        r7 = 33;
        r6 = "\u007f\u0010\u0019\u001aX1O";
        r0 = 32;
        r8 = r9;
        goto L_0x0011;
    L_0x0193:
        r8[r7] = r6;
        r7 = 34;
        r6 = "\u007f\f\u000f\u0003[\u007f\u000b\u0018,Zq\u0001\u0018,Xp";
        r0 = 33;
        r8 = r9;
        goto L_0x0011;
    L_0x019f:
        r8[r7] = r6;
        r7 = 35;
        r6 = "\u007f\f\u000f\u0003[\u007f\u000b\u0018,Zq\u0001\u0018,Xp";
        r0 = 34;
        r8 = r9;
        goto L_0x0011;
    L_0x01ab:
        r8[r7] = r6;
        r7 = 36;
        r6 = "^\u0016S\u0004_\u007f\u0011\u000e\u0012GnK\u0013\u0016C";
        r0 = 35;
        r8 = r9;
        goto L_0x0011;
    L_0x01b7:
        r8[r7] = r6;
        r7 = 37;
        r6 = "z\f\u001c\u001fXy1\u0012\u0012DjE@N\u0017p\u0010\u0011\u001f";
        r0 = 36;
        r8 = r9;
        goto L_0x0011;
    L_0x01c3:
        r8[r7] = r6;
        r7 = 38;
        r6 = "r\n\u001a\u001aYA\u0003\u001c\u001a[{\u0001";
        r0 = 37;
        r8 = r9;
        goto L_0x0011;
    L_0x01cf:
        r8[r7] = r6;
        r7 = 39;
        r6 = "\u007f\u0015\r\\Q\u007f\f\u0011\u0016S1\u0016\u001c\u0005R>\t\u0012\u0014^p:\u001b\u0012^r\u0000\u0019";
        r0 = 38;
        r8 = r9;
        goto L_0x0011;
    L_0x01db:
        r8[r7] = r6;
        r7 = 40;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0014Rj\u0002\u000f\u001cBn\u0016R\u001eD3\u000b\u0012\u0007\u001al\u0000\u001c\u0017N";
        r0 = 39;
        r8 = r9;
        goto L_0x0011;
    L_0x01e7:
        r8[r7] = r6;
        r7 = 41;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0014Rj\u0002\u000f\u001cBn\u0016";
        r0 = 40;
        r8 = r9;
        goto L_0x0011;
    L_0x01f3:
        r8[r7] = r6;
        r7 = 42;
        r6 = "k\u0016\u0018\u0001v}\u0011\u0014\u001cYX\n\u000f\u0004Vl\u00010\u0016Dm\u0004\u001a\u0016\u0018s\u0000\u0019\u001aVA\u0001\u001c\u0007V0\u0003\u0014\u001fR>\f\u000eSYk\t\u0011";
        r0 = 41;
        r8 = r9;
        goto L_0x0011;
    L_0x01ff:
        r8[r7] = r6;
        r7 = 43;
        r6 = "k\u0016\u0018\u0001v}\u0011\u0014\u001cYX\n\u000f\u0004Vl\u00010\u0016Dm\u0004\u001a\u0016\u0018q\u0017\u0014\u0014^p\u0004\u0011,Dw\u001f\u0018I";
        r0 = 42;
        r8 = r9;
        goto L_0x0011;
    L_0x020b:
        r8[r7] = r6;
        r7 = 44;
        r6 = ">\u0003\u0014\u001fRA\t\u0018\u001dPj\rG";
        r0 = 43;
        r8 = r9;
        goto L_0x0011;
    L_0x0217:
        r8[r7] = r6;
        r7 = 45;
        r6 = "k\u0016\u0018\u0001v}\u0011\u0014\u001cYX\n\u000f\u0004Vl\u00010\u0016Dm\u0004\u001a\u0016\u0018|\u0004\u000e\u0016\u0001*H\u0019\u0016Tq\u0001\u0018\\Rl\u0017\u0012\u0001";
        r0 = 44;
        r8 = r9;
        goto L_0x0011;
    L_0x0223:
        r8[r7] = r6;
        r7 = 46;
        r6 = "Q\u0017\u0014\u0016Yj\u0004\t\u001aXp";
        r0 = 45;
        r8 = r9;
        goto L_0x0011;
    L_0x022f:
        r8[r7] = r6;
        r7 = 47;
        r6 = "k\u0016\u0018\u0001v}\u0011\u0014\u001cYX\n\u000f\u0004Vl\u00010\u0016Dm\u0004\u001a\u0016";
        r0 = 46;
        r8 = r9;
        goto L_0x0011;
    L_0x023b:
        r8[r7] = r6;
        r7 = 48;
        r6 = "k\u0016\u0018\u0001v}\u0011\u0014\u001cYX\n\u000f\u0004Vl\u00010\u0016Dm\u0004\u001a\u0016\u0018s\u0000\u0019\u001aVA\u0001\u001c\u0007V>\f\u000eSYk\t\u0011";
        r0 = 47;
        r8 = r9;
        goto L_0x0011;
    L_0x0247:
        r8[r7] = r6;
        r7 = 49;
        r6 = "M\u0000\u000f\u0005Rl%\u000e]@v\u0004\t\u0000Vn\u0015S\u001dRj";
        r0 = 48;
        r8 = r9;
        goto L_0x0011;
    L_0x0253:
        r8[r7] = r6;
        r7 = 50;
        r6 = ">\u0011\u0015\u0016\u0017s\u0000\u000e\u0000Vy\u0000]";
        r0 = 49;
        r8 = r9;
        goto L_0x0011;
    L_0x025f:
        r8[r7] = r6;
        r7 = 51;
        r6 = ">\u0004\u0011\u0001R\u007f\u0001\u0004S^pE\b\u001dV}\u000e\u0018\u0017\u0017s\u0000\u000e\u0000Vy\u0000]\u001f^m\u0011";
        r0 = 50;
        r8 = r9;
        goto L_0x0011;
    L_0x026b:
        r8[r7] = r6;
        r7 = 52;
        r6 = "s\u0010\u000e\u0007\u0017v\u0004\u000b\u0016\u0017m\u0011\u001c\u001dM\u007fE\u0014\u0017\u0017x\n\u000fSZ{\u0016\u000e\u0012P{E\t\nG{E";
        r0 = 51;
        r8 = r9;
        goto L_0x0011;
    L_0x0277:
        r8[r7] = r6;
        r7 = 53;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019&Ym\u0010\u001f\u0000Tl\f\u001f\u0016{q\u0006\u001c\u0007^q\u000b\u000e\\";
        r0 = 52;
        r8 = r9;
        goto L_0x0011;
    L_0x0283:
        r8[r7] = r6;
        r7 = 54;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,rF18!y_)\" cQ7<4r";
        r0 = 53;
        r8 = r9;
        goto L_0x0011;
    L_0x028f:
        r8[r7] = r6;
        r7 = 55;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 54;
        r8 = r9;
        goto L_0x0011;
    L_0x029b:
        r8[r7] = r6;
        r7 = 56;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 55;
        r8 = r9;
        goto L_0x0011;
    L_0x02a7:
        r8[r7] = r6;
        r7 = 57;
        r6 = ">M";
        r0 = 56;
        r8 = r9;
        goto L_0x0011;
    L_0x02b3:
        r8[r7] = r6;
        r7 = 58;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 57;
        r8 = r9;
        goto L_0x0011;
    L_0x02bf:
        r8[r7] = r6;
        r7 = 59;
        r6 = "\u007f\u0015\r\\Gl\n\u001e\u0016Dm\u0000\u000e\\Gl\n\u001e\\D{\t\u001bS";
        r0 = 58;
        r8 = r9;
        goto L_0x0011;
    L_0x02cb:
        r8[r7] = r6;
        r7 = 60;
        r6 = "\u007f\u0015\r\\Gl\n\u001e\u0010Rm\u0016\u0018\u0000\u0018n\u0017\u0012\u0010\u0017";
        r0 = 59;
        r8 = r9;
        goto L_0x0011;
    L_0x02d7:
        r8[r7] = r6;
        r7 = 61;
        r6 = "\u007f\u0015\r\\Gl\n\u001e\u0016Dm\u0000\u000e\\Vr\t\r\u0001X}\u0016";
        r0 = 60;
        r8 = r9;
        goto L_0x0011;
    L_0x02e3:
        r8[r7] = r6;
        r7 = 62;
        r6 = "\u007f\u0015\r\\Gl\n\u001e\u0016Dm\u0000\u000e\\Gl\n\u001e\u001aYx\n]";
        r0 = 61;
        r8 = r9;
        goto L_0x0011;
    L_0x02ef:
        r8[r7] = r6;
        r7 = 63;
        r6 = "\u007f\u0015\r\\D{\u0011\u001b\u0012^r\u0017\u0018\u0012Dq\u000bR\u0015Vw\t\u0018\u0017";
        r0 = 62;
        r8 = r9;
        goto L_0x0011;
    L_0x02fb:
        r8[r7] = r6;
        r7 = 64;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 63;
        r8 = r9;
        goto L_0x0011;
    L_0x0307:
        r8[r7] = r6;
        r7 = 65;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0015Vw\t\b\u0001RA\u0017\u0018\u0012Dq\u000b";
        r0 = 64;
        r8 = r9;
        goto L_0x0011;
    L_0x0313:
        r8[r7] = r6;
        r7 = 66;
        r6 = ".KM]\u0007";
        r0 = 65;
        r8 = r9;
        goto L_0x0011;
    L_0x031f:
        r8[r7] = r6;
        r7 = 67;
        r6 = "}\t\u0014\u0016Yj:\u000e\u0016Eh\u0000\u000f,Cw\b\u0018,Sw\u0003\u001b";
        r0 = 66;
        r8 = r9;
        goto L_0x0011;
    L_0x032b:
        r8[r7] = r6;
        r7 = 68;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,gV*36hM1<'r";
        r0 = 67;
        r8 = r9;
        goto L_0x0011;
    L_0x0337:
        r8[r7] = r6;
        r7 = 69;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\t\u0012\u0014^p\u0003\u001c\u001a[{\u0001";
        r0 = 68;
        r8 = r9;
        goto L_0x0011;
    L_0x0343:
        r8[r7] = r6;
        r7 = 70;
        r6 = "h\u0000\u000f\u0000^q\u000b]\u0006Gz\u0004\t\u0016\u0017x\u0004\u0014\u001fRz";
        r0 = 69;
        r8 = r9;
        goto L_0x0011;
    L_0x034f:
        r8[r7] = r6;
        r7 = 71;
        r6 = "}\u0017\u001c\u0000_A\u0016\u0018\u001dCw\u000b\u0018\u001f";
        r0 = 70;
        r8 = r9;
        goto L_0x0011;
    L_0x035b:
        r8[r7] = r6;
        r7 = 72;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 71;
        r8 = r9;
        goto L_0x0011;
    L_0x0367:
        r8[r7] = r6;
        r7 = 73;
        r6 = "n\u0017\u0012\u0010Rm\u0016]\u0018^r\t\u0018\u0017";
        r0 = 72;
        r8 = r9;
        goto L_0x0011;
    L_0x0373:
        r8[r7] = r6;
        r7 = 74;
        r6 = "n\r\u0012\u001dR";
        r0 = 73;
        r8 = r9;
        goto L_0x0011;
    L_0x037f:
        r8[r7] = r6;
        r7 = 75;
        r6 = "_\u0015\r:Yw\u0011";
        r0 = 74;
        r8 = r9;
        goto L_0x0011;
    L_0x038b:
        r8[r7] = r6;
        r7 = 76;
        r6 = "i\f\u0013\u0017Xi";
        r0 = 75;
        r8 = r9;
        goto L_0x0011;
    L_0x0397:
        r8[r7] = r6;
        r7 = 77;
        r6 = "\u007f\u0015\r\\^p\u0011\u0018\u0001Y\u007f\t\u000e\u0007Xl\u0004\u001a\u0016\u0018\u007f\u0013\u001c\u001a[>";
        r0 = 76;
        r8 = r9;
        goto L_0x0011;
    L_0x03a3:
        r8[r7] = r6;
        r7 = 78;
        r6 = "\u007f\u0015\r\\Zm\u0002\u000e\u0007Xl\u0000\u0019\u0011\u0018v\u0000\u001c\u001fCv\u001c";
        r0 = 77;
        r8 = r9;
        goto L_0x0011;
    L_0x03af:
        r8[r7] = r6;
        r7 = 79;
        r6 = ",KLA\u0019+PM";
        r0 = 78;
        r8 = r9;
        goto L_0x0011;
    L_0x03bb:
        r8[r7] = r6;
        r7 = 80;
        r6 = "I\u0000\u001fStr\f\u0018\u001dC";
        r0 = 79;
        r8 = r9;
        goto L_0x0011;
    L_0x03c7:
        r8[r7] = r6;
        r7 = 81;
        r6 = "\u007f\u0015\r\\Xp\u0006\u000f\u0016Vj\u0000R\u001dXj:\u0010\u0012^p:\r\u0001X}\u0000\u000e\u0000\u0018m\u0011\u0012\u0003hv\u0000\u000f\u0016\u00190";
        r0 = 80;
        r8 = r9;
        goto L_0x0011;
    L_0x03d3:
        r8[r7] = r6;
        r7 = 82;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012Tj\f\u0012\u001d\u0019M )&g";
        r0 = 81;
        r8 = r9;
        goto L_0x0011;
    L_0x03df:
        r8[r7] = r6;
        r7 = 83;
        r6 = "I\r\u001c\u0007D_\u0015\r9X|(\u001c\u001dVy\u0000\u000f";
        r0 = 82;
        r8 = r9;
        goto L_0x0011;
    L_0x03eb:
        r8[r7] = r6;
        r7 = 84;
        r6 = "\u007f\u0015\r\\S{\u0013\u0014\u0010RA\f\u0013\u0015X1*.,uK,17hP001rLE";
        r0 = 83;
        r8 = r9;
        goto L_0x0011;
    L_0x03f7:
        r8[r7] = r6;
        r7 = 85;
        r6 = "q\u0003\u001b";
        r0 = 84;
        r8 = r9;
        goto L_0x0011;
    L_0x0403:
        r8[r7] = r6;
        r7 = 86;
        r6 = "n\n\n\u0016E";
        r0 = 85;
        r8 = r9;
        goto L_0x0011;
    L_0x040f:
        r8[r7] = r6;
        r7 = 87;
        r6 = "}\n\u0013\u001dR}\u0011\u0014\u0005^j\u001c";
        r0 = 86;
        r8 = r9;
        goto L_0x0011;
    L_0x041b:
        r8[r7] = r6;
        r7 = 88;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 87;
        r8 = r9;
        goto L_0x0011;
    L_0x0427:
        r8[r7] = r6;
        r7 = 89;
        r6 = "\u007f\u0015\r\\Xp\u0006\u000f\u0016Vj\u0000R\u0000Tl\u0000\u0018\u001d\u0018";
        r0 = 88;
        r8 = r9;
        goto L_0x0011;
    L_0x0433:
        r8[r7] = r6;
        r7 = 90;
        r6 = "s\u0000\u0019\u001aV1\u0010\u0013\u0012A\u007f\f\u0011\u0012Ur\u0000]";
        r0 = 89;
        r8 = r9;
        goto L_0x0011;
    L_0x043f:
        r8[r7] = r6;
        r7 = 91;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 90;
        r8 = r9;
        goto L_0x0011;
    L_0x044b:
        r8[r7] = r6;
        r7 = 92;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\u000b\u0012\u0007Z\u007f\f\u0013S";
        r0 = 91;
        r8 = r9;
        goto L_0x0011;
    L_0x0457:
        r8[r7] = r6;
        r7 = 93;
        r6 = "s\u0000\u0019\u001aV1\u0017\u0018\u0012S3\n\u0013\u001fN";
        r0 = 92;
        r8 = r9;
        goto L_0x0011;
    L_0x0463:
        r8[r7] = r6;
        r7 = 94;
        r6 = "w\u000b\u000e\u0007Vr\t\"\u001dXp:\u0010\u0012Eu\u0000\t,Vn\u0015\u000e";
        r0 = 93;
        r8 = r9;
        goto L_0x0011;
    L_0x046f:
        r8[r7] = r6;
        r7 = 95;
        r6 = "A\r\u001c\u0000hm\u0000\t,S{\u0003\u001c\u0006[j:\u000b\u0012[k\u0000\u000e";
        r0 = 94;
        r8 = r9;
        goto L_0x0011;
    L_0x047b:
        r8[r7] = r6;
        r7 = 96;
        r6 = "S\u0000\u000e\u0000Vy\u0000.\u0007Xl\u00004\u001d^j";
        r0 = 95;
        r8 = r9;
        goto L_0x0011;
    L_0x0487:
        r8[r7] = r6;
        r7 = 97;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0000C\u007f\u0017\t,Cw\b\u0018";
        r0 = 96;
        r8 = r9;
        goto L_0x0011;
    L_0x0493:
        r8[r7] = r6;
        r7 = 98;
        r6 = "\u007f\u0015\r\u001f^}\u0004\t\u001aXpE\u0011\u0012Bp\u0006\u0015\u0016S>\f\u0013SU\u007f\u0006\u0016\u0014Eq\u0010\u0013\u0017\r>";
        r0 = 97;
        r8 = r9;
        goto L_0x0011;
    L_0x049f:
        r8[r7] = r6;
        r7 = 99;
        r6 = "0\u0011\u000f\u0012Dv";
        r0 = 98;
        r8 = r9;
        goto L_0x0011;
    L_0x04ab:
        r8[r7] = r6;
        r7 = 100;
        r6 = "h\u0000\u000f\u0000^q\u000b";
        r0 = 99;
        r8 = r9;
        goto L_0x0011;
    L_0x04b7:
        r8[r7] = r6;
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 100;
        r8 = r9;
        goto L_0x0011;
    L_0x04c3:
        r8[r7] = r6;
        r7 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r6 = "\u007f\u0015\r\\Vr\t\u001e\u001cYj\u0004\u001e\u0007D1";
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x04cf:
        r8[r7] = r6;
        r7 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = "0\u0011\u000f\u0012Dv";
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x04db:
        r8[r7] = r6;
        r7 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\u0017\u0018\u0014Cq\n\u0011\u001cYyJ\u0010\u001aDm\u0000\u0019^Vr\u0004\u000f\u001e\u0018}\u0004\u0011\u001f\u001as\u0004\u0013\u0006Vr\t\u0004";
        r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x04e7:
        r8[r7] = r6;
        r7 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r6 = "}\t\u0014\u0016Yj:\u000b\u0016Em\f\u0012\u001dhk\u0015\u001a\u0001Vz\u0000\"\u0007^s\u0000\u000e\u0007Vs\u0015";
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x04f3:
        r8[r7] = r6;
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r6 = "\u007f\u0015\r\\D{\u0011\t\u001aYyJ\u001f\u0012Tu\u0002\u000f\u001cBp\u0001P\u0017Vj\u0004]";
        r0 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x04ff:
        r8[r7] = r6;
        r7 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r6 = "A\r\u001c\u0000hm\u0000\t,S{\u0003\u001c\u0006[j:\u000b\u0012[k\u0000\u000e";
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x050b:
        r8[r7] = r6;
        r7 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r6 = ",KLA\u0019+PM";
        r0 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0517:
        r8[r7] = r6;
        r7 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r6 = "\u007f\u0015\r\u001f^}\u0004\t\u001aXpE\u0012\u001dtl\u0000\u001c\u0007R>\u0006\u001c\u001f[{\u0001]\u0012Qj\u0000\u000fSVn\u0015\u0011\u001aT\u007f\u0011\u0014\u001cY>\u0004\u0011\u0001R\u007f\u0001\u0004SDj\u0004\u000f\u0007Rz";
        r0 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0523:
        r8[r7] = r6;
        r7 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r6 = "}\u0017\u001c\u0000_A\f\u0013,Aw\u0001\u0018\u001chm\u0000\u0013\u0007^p\u0000\u0011";
        r0 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x052f:
        r8[r7] = r6;
        r7 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r6 = "q\u000b";
        r0 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x053b:
        r8[r7] = r6;
        r7 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r6 = ",KLA\u0019+PM";
        r0 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0547:
        r8[r7] = r6;
        r7 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r6 = "h\u0000\u000f\u0000^q\u000b";
        r0 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0553:
        r8[r7] = r6;
        r7 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r6 = "H\f\u0019\u0016XJ\u0017\u001c\u001dD}\n\u0019\u001aYy \u000f\u0001Xl";
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x055f:
        r8[r7] = r6;
        r7 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x056b:
        r8[r7] = r6;
        r7 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r6 = "\u007f\u0006\t\u001aAw\u0011\u0004";
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0577:
        r8[r7] = r6;
        r7 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r6 = "}\t\u0014\u0016Yj:\u000b\u0016Em\f\u0012\u001dhk\u0015\u001a\u0001Vz\u0000\u0019";
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0583:
        r8[r7] = r6;
        r7 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012[\u007f\u0017\u0010]e[\"4 cL$):xP:)2|W+:,cQ*\"?xP\"\"'~S 2&c";
        r0 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x058f:
        r8[r7] = r6;
        r7 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r6 = ",KLA\u0019+PM";
        r0 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x059b:
        r8[r7] = r6;
        r7 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r6 = "v\u0011\t\u0003\u0019u\u0000\u0018\u0003vr\f\u000b\u0016";
        r0 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05a7:
        r8[r7] = r6;
        r7 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r6 = "{\u0017\u000f\u001cE>\u0015\u001c\u0001Dw\u000b\u001aSZ}\u0006R\u001eY}";
        r0 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05b3:
        r8[r7] = r6;
        r7 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r6 = "x\u0004\u0011\u0000R";
        r0 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05bf:
        r8[r7] = r6;
        r7 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r6 = "z\u0007\"\u0004Ew\u0011\u0018S\u001f";
        r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05cb:
        r8[r7] = r6;
        r7 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r6 = "x\u0004";
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05d7:
        r8[r7] = r6;
        r7 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r6 = "w\u0012";
        r0 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05e3:
        r8[r7] = r6;
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r6 = "v\u0000";
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05ef:
        r8[r7] = r6;
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r6 = "\u007f\u0017";
        r0 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x05fb:
        r8[r7] = r6;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = "K+>2bY-)SrF&8#cW*3";
        r0 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0607:
        r8[r7] = r6;
        r7 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012[\u007f\u0017\u0010]e[\"4 cL$):xP:/6cL<";
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0613:
        r8[r7] = r6;
        r7 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x061f:
        r8[r7] = r6;
        r7 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r6 = "\u007f\t\u001c\u0001Z";
        r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x062b:
        r8[r7] = r6;
        r7 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r6 = "w\u000b\r\u0006CA\u0000\u0013\u0007Rl:\u000e\u0016Yz";
        r0 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0637:
        r8[r7] = r6;
        r7 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0643:
        r8[r7] = r6;
        r7 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r6 = "s\u0000\"\u001c[z";
        r0 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x064f:
        r8[r7] = r6;
        r7 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r6 = "\u007f\u0015\r\\S{\t\u0018\u0007Rq\t\u0019\u001eR";
        r0 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x065b:
        r8[r7] = r6;
        r7 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r6 = "@M&B\u0000C\u0019O(\u0007)8\u0001@l.TO@\u0003(\\ \u000f\u0003EUL@\u0003+SJK\u000eC\u0019H(\u0006,VIF\u0001)] \u000f\u0001EULA\u0004*PK.K&>LA\u0003(8\u0001Jl.TO@\u0003+] \u000fkz\u001eN\u000e\u001eB\u0001WL\u001fB\u0001\u0006G\u001b(\u0018TW";
        r0 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0667:
        r8[r7] = r6;
        r7 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0673:
        r8[r7] = r6;
        r7 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x067f:
        r8[r7] = r6;
        r7 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]`L,)6h[=)6eP$1,dJ*/2p[";
        r0 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x068b:
        r8[r7] = r6;
        r7 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0697:
        r8[r7] = r6;
        r7 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,rF18!y_)\" cQ7<4r";
        r0 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06a3:
        r8[r7] = r6;
        r7 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,rF18!y_)\" cQ7<4r";
        r0 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06af:
        r8[r7] = r6;
        r7 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r6 = "\u007f\u0015\r\\^p\f\t";
        r0 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06bb:
        r8[r7] = r6;
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r6 = "\u007f\u0015\r\\^p\f\t\\@l\f\t\u0012Ur\u0000P\u001eRz\f\u001c";
        r0 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06c7:
        r8[r7] = r6;
        r7 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r6 = "\u007f\u0015\r\\C{\u0017\u0010\u001aY\u007f\u0011\u0018";
        r0 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06d3:
        r8[r7] = r6;
        r7 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r6 = "s\u0000";
        r0 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06df:
        r8[r7] = r6;
        r7 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06eb:
        r8[r7] = r6;
        r7 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[&2!sA$(7~Q";
        r0 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x06f7:
        r8[r7] = r6;
        r7 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r6 = "\u007f\u0015\r\\Bp\u0016\u0018\u001dC1\u0016\u0016\u001aG>";
        r0 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0703:
        r8[r7] = r6;
        r7 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r6 = ">\u0004\b\u0007Xl\u0000\t\u0001N>\u0001\u0014\u0000V|\t\u0018\u0017";
        r0 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x070f:
        r8[r7] = r6;
        r7 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r6 = "\u007f\u0015\r\\Bp\u0016\u0018\u001dC1\u0016\u0016\u001aG>";
        r0 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x071b:
        r8[r7] = r6;
        r7 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r6 = "\u007f\u0015\r\\Bp\u0016\u0018\u001dC1\u0016\u0016\u001aG1\t\u0012\u0010Vj\f\u0012\u001d\u0017";
        r0 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0727:
        r8[r7] = r6;
        r7 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r6 = "\u007f\u0015\r\\Bp\u0016\u0018\u001dC1\u0016\u0016\u001aG>";
        r0 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0733:
        r8[r7] = r6;
        r7 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r6 = "\u007f\u0015\r\\Bp\u0016\u0018\u001dC1\u0016\u0016\u001aG1\u0016\u0004\u0000C{\b]";
        r0 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x073f:
        r8[r7] = r6;
        r7 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r6 = ">\u000b\u0018\u0016S>\u0011\u000f\u0012Ym\u0006\u0012\u0017R";
        r0 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x074b:
        r8[r7] = r6;
        r7 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r6 = ">\u0004\b\u0007Xl\u0000\t\u0001N>\u0001\u0014\u0000V|\t\u0018\u0017";
        r0 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0757:
        r8[r7] = r6;
        r7 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r6 = "\u007f\u0015\r\\Bp\u0016\u0018\u001dC1\u0016\u0016\u001aG1\u0006\u001c\u001f[>";
        r0 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0763:
        r8[r7] = r6;
        r7 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r6 = "I\r\u001c\u0007D_\u0015\rSaw\u0001\u0018\u001c\u0017U\u0000\u0004\u0000";
        r0 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x076f:
        r8[r7] = r6;
        r7 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r6 = "I\r\u001c\u0007D_\u0015\rSvk\u0001\u0014\u001c\u0017U\u0000\u0004\u0000";
        r0 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x077b:
        r8[r7] = r6;
        r7 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r6 = "I\r\u001c\u0007D_\u0015\rSsq\u0006\b\u001eRp\u0011]8Rg\u0016";
        r0 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0787:
        r8[r7] = r6;
        r7 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r6 = "I\r\u001c\u0007D_\u0015\rS~s\u0004\u001a\u0016\u0017U\u0000\u0004\u0000";
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0793:
        r8[r7] = r6;
        r7 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r6 = "I\r\u001c\u0007D_\u0015\rSbp\u000e\u0013\u001c@pE6\u0016Nm";
        r0 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x079f:
        r8[r7] = r6;
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r6 = "k\u000b\u0016\u001dXi\u000b]\u001eRz\f\u001cSCg\u0015\u0018";
        r0 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07ab:
        r8[r7] = r6;
        r7 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0003Rl\b\u0014\u0000Dw\n\u0013]uL*<7t_6)";
        r0 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07b7:
        r8[r7] = r6;
        r7 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0003Rl\b\u0014\u0000Dw\n\u0013]uL*<7t_6)";
        r0 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07c3:
        r8[r7] = r6;
        r7 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK):z[:.6c";
        r0 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07cf:
        r8[r7] = r6;
        r7 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012[\u007f\u0017\u0010]tR,8=cA54=pA14>rQ0)";
        r0 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07db:
        r8[r7] = r6;
        r7 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012[\u007f\u0017\u0010]e[\"4 cL$):xP:)2|W+:,cQ*\"?xP\"\"'~S 2&c";
        r0 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07e7:
        r8[r7] = r6;
        r7 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012[\u007f\u0017\u0010]e[\"4 cL$):xP:/6cL<";
        r0 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07f3:
        r8[r7] = r6;
        r7 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0003Rl\b\u0014\u0000Dw\n\u0013]uL*<7t_6)";
        r0 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x07ff:
        r8[r7] = r6;
        r7 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001dRjK\u001e\u001cYpK?2tU\"/<bP!\"7vJ$\" rJ14=pA&52yY 9";
        r0 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x080b:
        r8[r7] = r6;
        r7 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S?xY:>!~J,>2{A +6yJ";
        r0 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0817:
        r8[r7] = r6;
        r7 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0003Rl\b\u0014\u0000Dw\n\u0013]uL*<7t_6)";
        r0 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0823:
        r8[r7] = r6;
        r7 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r6 = ">\u0019]";
        r0 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x082f:
        r8[r7] = r6;
        r7 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r6 = "s\b\u000e";
        r0 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x083b:
        r8[r7] = r6;
        r7 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V06(1}[&)";
        r0 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0847:
        r8[r7] = r6;
        r7 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V06)!r_(";
        r0 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0853:
        r8[r7] = r6;
        r7 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r6 = "\u007f\u0015\r\\G\u007f\u0006\u0016\u0012P{\u0001\u0014\u001dC{\u000b\t\u0000\u0018q\u0013\u0018\u0001Ew\u0001\u0018";
        r0 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x085f:
        r8[r7] = r6;
        r7 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK.6yZ";
        r0 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x086b:
        r8[r7] = r6;
        r7 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V06(1}[&)";
        r0 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0877:
        r8[r7] = r6;
        r7 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V018+c";
        r0 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0883:
        r8[r7] = r6;
        r7 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V0,3:cW$1,~P18=cM";
        r0 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x088f:
        r8[r7] = r6;
        r7 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK.6yZ";
        r0 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x089b:
        r8[r7] = r6;
        r7 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V06)!r_(";
        r0 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08a7:
        r8[r7] = r6;
        r7 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r6 = "}\n\u0010][y\u0000S\u001eRm\u0016\u001c\u0014R0\u0004\u001e\u0007^h\f\t\n\u0019}\n\u0010\u0003Xm\u0000S0Xs\u0015\u0012\u0000RS\u0000\u000e\u0000Vy\u0000<\u0010Cw\u0013\u0014\u0007N";
        r0 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08b3:
        r8[r7] = r6;
        r7 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r6 = "m\b\u000e,Uq\u0001\u0004";
        r0 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08bf:
        r8[r7] = r6;
        r7 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0014Z";
        r0 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08cb:
        r8[r7] = r6;
        r7 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V018+c";
        r0 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08d7:
        r8[r7] = r6;
        r7 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r6 = "R\"8^{KWNC\u0007";
        r0 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08e3:
        r8[r7] = r6;
        r7 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r6 = "\u007f\u0015\r\\G\u007f\u0006\u0016\u0012P{\u0001\u0014\u001dC{\u000b\t\u0000\u0018z\u0000\u000b\u001aT{E";
        r0 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08ef:
        r8[r7] = r6;
        r7 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK.6yZ";
        r0 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x08fb:
        r8[r7] = r6;
        r7 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019 Rj5\u000f\u001cQw\t\u0018#_q\u0011\u0012";
        r0 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0907:
        r8[r7] = r6;
        r7 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r6 = "\u007f\u0015\r\\Cq\u0016\b\u0003S\u007f\u0011\u0018\\V}\u0006\u0018\u0003C>";
        r0 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0913:
        r8[r7] = r6;
        r7 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0014Eq\u0010\r,P{\u000bO";
        r0 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x091f:
        r8[r7] = r6;
        r7 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r6 = "w\u0001\u0018\u001dCw\u0011\u0004,A{\u0017\u0014\u0015^}\u0004\t\u001aXp";
        r0 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x092b:
        r8[r7] = r6;
        r7 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0005^z\u0000\u0012";
        r0 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0937:
        r8[r7] = r6;
        r7 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r6 = "h\n\u0014\u0003";
        r0 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0943:
        r8[r7] = r6;
        r7 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r6 = "z\n\u001e\u0006Z{\u000b\t";
        r0 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x094f:
        r8[r7] = r6;
        r7 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0012Bz\f\u0012";
        r0 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x095b:
        r8[r7] = r6;
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0006Er";
        r0 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0967:
        r8[r7] = r6;
        r7 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u001fX}\u0004\t\u001aXp";
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x0973:
        r8[r7] = r6;
        r7 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u001aZ\u007f\u0002\u0018";
        r0 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r8 = r9;
        goto L_0x0011;
    L_0x097f:
        r8[r7] = r6;
        r7 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r6 = "{\b\r\u0007N>\u000f\u0014\u0017D>\t\u0014\u0000C>\f\u0013SE{\u0014\b\u0016Dj\u0000\u0019ST\u007f\u0015\u001c\u0011^r\f\t\n\u0017o\u0010\u0018\u0001N%E\u000e\u0018^n\u0015\u0014\u001dP";
        r0 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x098b:
        r8[r7] = r6;
        r7 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0005\u0005";
        r0 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0997:
        r8[r7] = r6;
        r7 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0011[w\u0016\t";
        r0 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09a3:
        r8[r7] = r6;
        r7 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r6 = "{\u000b\u001e\u0001Nn\u0011\"\u0010Xp\u0011\u001c\u0010C";
        r0 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09af:
        r8[r7] = r6;
        r7 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0014Rj\u0015\u000f\u001aA\u007f\u0006\u0004\u0000Rj\u0011\u0014\u001dPm";
        r0 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09bb:
        r8[r7] = r6;
        r7 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019!Rs\n\u000b\u0016vz\b\u0014\u001dD";
        r0 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09c7:
        r8[r7] = r6;
        r7 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r6 = "p\u0011\rSBn\u0001\u001c\u0007R>\u0015\u000f\u001cT{\u0016\u000e\u0016S%E\u0019\u0016Aw\u0006\u0018SCw\b\u0018I\u0017";
        r0 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09d3:
        r8[r7] = r6;
        r7 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r6 = ">\u000b\t\u0003\u0017j\f\u0010\u0016\r>";
        r0 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09df:
        r8[r7] = r6;
        r7 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00197^m\u0004\u001f\u001fRR\n\u001e\u0012Cw\n\u0013 _\u007f\u0017\u0014\u001dP1";
        r0 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09eb:
        r8[r7] = r6;
        r7 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00190E{\u0004\t\u0016pl\n\b\u0003tv\u0004\t";
        r0 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x09f7:
        r8[r7] = r6;
        r7 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r6 = ">\u0012@";
        r0 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a03:
        r8[r7] = r6;
        r7 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r6 = "\u007f\u0015\r\\G{\u0017\u0010\u001aDm\f\u0012\u001dD1";
        r0 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a0f:
        r8[r7] = r6;
        r7 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r6 = "\u007f\u0015\r\\Tv\u0000\u001e\u0018G{\u0017\u0010\u001aDm\f\u0012\u001dD1\u0000\u000f\u0001XlE";
        r0 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a1b:
        r8[r7] = r6;
        r7 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r6 = "R\n\u001a\u0000";
        r0 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a27:
        r8[r7] = r6;
        r7 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r6 = "\u007f\u0015\r\\G{\u0017\u0010\u001aDm\f\u0012\u001dD1";
        r0 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a33:
        r8[r7] = r6;
        r7 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r6 = ">M";
        r0 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a3f:
        r8[r7] = r6;
        r7 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r6 = "s\u0016\u001a\u0000Cq\u0017\u0018]S|";
        r0 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a4b:
        r8[r7] = r6;
        r7 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r6 = ">\u0016\u0018\u0007\u0017iX";
        r0 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a57:
        r8[r7] = r6;
        r7 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r6 = "\u007f\u0015\r\\Tv\u0000\u001e\u0018G{\u0017\u0010\u001aDm\f\u0012\u001dD1\u000b\u0012\u001eRj\r\u0012\u0017\u0017";
        r0 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a63:
        r8[r7] = r6;
        r7 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00196Yz\"\u000f\u001cBn";
        r0 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a6f:
        r8[r7] = r6;
        r7 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r6 = "m\u0000\u0013\u0017bp\u0004\u001e\u0018Rz(\u0018\u0000D\u007f\u0002\u0018\u0000\r>";
        r0 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a7b:
        r8[r7] = r6;
        r7 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u0014\u001dQq\u0017\u0018\u0014Eq\u0010\u0013\u0017\u0017";
        r0 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a87:
        r8[r7] = r6;
        r7 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a93:
        r8[r7] = r6;
        r7 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0000Zm:\u001e\u001cS{:\u0011\u0016Yy\u0011\u0015";
        r0 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0a9f:
        r8[r7] = r6;
        r7 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u001fX}\u0004\t\u001aXpJ";
        r0 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0aab:
        r8[r7] = r6;
        r7 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]v]&8 dA#4=rA)20vJ,2=";
        r0 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ab7:
        r8[r7] = r6;
        r7 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]v]&8 dA&22eM \"?x]$):xP";
        r0 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ac3:
        r8[r7] = r6;
        r7 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u0011\u001cPw\u000b\u001e\u001cBp\u0011\n\u001aCv\b\u000e\u0014D1\u0003\u001c\u001a[{\u0001";
        r0 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0acf:
        r8[r7] = r6;
        r7 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r6 = "r\n\u001a\u001aYm:\n\u001aCv:\u0010\u0016Dm\u0004\u001a\u0016D";
        r0 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0adb:
        r8[r7] = r6;
        r7 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ae7:
        r8[r7] = r6;
        r7 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r6 = "n\r";
        r0 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0af3:
        r8[r7] = r6;
        r7 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0aff:
        r8[r7] = r6;
        r7 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r6 = "}\u0006";
        r0 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b0b:
        r8[r7] = r6;
        r7 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r6 = "\u007f\u0015\r\\^p\u0016\t\u0012[r\u0000\u0019";
        r0 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b17:
        r8[r7] = r6;
        r7 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r6 = "\u007f\u0015\r\\^p\u0016\t\u0012[r\u0000\u0019S";
        r0 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b23:
        r8[r7] = r6;
        r7 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r6 = "\u007f\u0015\r\\[q\u0002\u0014\u001dQ\u007f\f\u0011\u0016S1\u0015\u0012\u0003Bn";
        r0 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b2f:
        r8[r7] = r6;
        r7 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r6 = "m\u0011\u000f\u001aYy\f\u0019";
        r0 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b3b:
        r8[r7] = r6;
        r7 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b47:
        r8[r7] = r6;
        r7 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r6 = "s\b\u000e,Vk\u0011\u0015\u001cEw\u0011\u0004,Xh\u0000\u000f\u0001^z\u0000";
        r0 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b53:
        r8[r7] = r6;
        r7 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\"\u001eZm:\u001c\u0006Cv\n\u000f\u001aCg:\u0012\u0005Rl\u0017\u0014\u0017R1\u0003\u001c\u001a[{\u0001";
        r0 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b5f:
        r8[r7] = r6;
        r7 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r6 = "s\b\u000e,Vk\u0011\u0015\u001cEw\u0011\u0004,Xh\u0000\u000f\u0001^z\u0000";
        r0 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b6b:
        r8[r7] = r6;
        r7 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b77:
        r8[r7] = r6;
        r7 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r6 = "p\u0000\u0018\u0017hj\n\"\u0014Rj:\r\u0001RA\u000e\u0018\nhz\f\u001a\u0016Dj";
        r0 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b83:
        r8[r7] = r6;
        r7 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r6 = ">\f\u0019I\u0017";
        r0 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b8f:
        r8[r7] = r6;
        r7 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019^Z{\u0016\u000e\u0012P{J\u001c\u0017S3\u0011\u0012^G{\u000b\u0019\u001aYyE\t\nG{_]";
        r0 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0b9b:
        r8[r7] = r6;
        r7 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r6 = "}\u0017\u001c\u0000_3\t\u0012\u0014\u0018x\u0004\u0014\u001fRz";
        r0 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ba7:
        r8[r7] = r6;
        r7 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r6 = "\u007f\u0015\r\\[q\u0002R\u0001X\u007f\b\u0014\u001dP1\u0016\u0016\u001aG";
        r0 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0bb3:
        r8[r7] = r6;
        r7 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r6 = "h\n\u0014\u0003\u0018p\n\t\u001aQg&\u001c\u001f[[\u000b\u0019\u0016S";
        r0 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0bbf:
        r8[r7] = r6;
        r7 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00194Rj6\u0018\u0001A{\u0017-\u0001Xn\u0016";
        r0 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0bcb:
        r8[r7] = r6;
        r7 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r6 = "\u007f\u0015\r\\E{\u0011\u000f\nZ{\u0001\u0014\u0012Bn\t\u0012\u0012S1\u0001\b\u0003[w\u0006\u001c\u0007R";
        r0 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0bd7:
        r8[r7] = r6;
        r7 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r6 = "\u007f\u0006\t\u001aAw\u0011\u0004";
        r0 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0be3:
        r8[r7] = r6;
        r7 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r6 = "\u007f\u0015\r\\P{\u0011\u0012\u001fSs\u0000";
        r0 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0bef:
        r8[r7] = r6;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r6 = "s\u0000\"\u001c[z";
        r0 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0bfb:
        r8[r7] = r6;
        r7 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r6 = "s\u0000\"\u001c[z";
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c07:
        r8[r7] = r6;
        r7 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\u0017\u0018\u0012SA\b\u0018\\^q:\u0018\u0001Eq\u0017";
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c13:
        r8[r7] = r6;
        r7 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\u0017\u0018\u0012SA\b\u0018\\D{\u0017\u0014\u0012[w\u001f\u001c\u0007^q\u000b\"\u0016El\n\u000f";
        r0 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c1f:
        r8[r7] = r6;
        r7 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r6 = "y\u0017\u0012\u0006Gm";
        r0 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c2b:
        r8[r7] = r6;
        r7 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00190[{\u0004\u000f7^l\u0011\u0004";
        r0 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c37:
        r8[r7] = r6;
        r7 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        r6 = "\u007f\u0015\r\\Sw\u0016\r\u001fVg\u0006\u0011\u001cTu\u0012\u000f\u001cYyJ\u0013\u001cCw\u0003\u0014\u0010Vj\f\u0012\u001d\u0017";
        r0 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c43:
        r8[r7] = r6;
        r7 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c4f:
        r8[r7] = r6;
        r7 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r6 = "\u007f\u0010\t\u001cSq\u0012\u0013\u001fX\u007f\u0001\"\u0010Rr\t\b\u001fVl:\u0010\u0012Du";
        r0 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c5b:
        r8[r7] = r6;
        r7 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r6 = "\u007f\u0010\t\u001cSq\u0012\u0013\u001fX\u007f\u0001\"\u0001X\u007f\b\u0014\u001dPA\b\u001c\u0000\\";
        r0 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c67:
        r8[r7] = r6;
        r7 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r6 = "\u007f\u0010\t\u001cSq\u0012\u0013\u001fX\u007f\u0001\"\u0004^x\f\"\u001eVm\u000e";
        r0 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c73:
        r8[r7] = r6;
        r7 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r6 = "p\u0000\t\u0004Xl\u000e\"\u0007Nn\u0000]\u001dXjE\u000b\u0012[w\u0001";
        r0 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c7f:
        r8[r7] = r6;
        r7 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r6 = "l\u0000\u001c\u0017hl\u0000\u001e\u0016^n\u0011\u000e,Rp\u0004\u001f\u001fRz";
        r0 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c8b:
        r8[r7] = r6;
        r7 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0c97:
        r8[r7] = r6;
        r7 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r6 = "\u007f\u0015\r\\Os\u0015\r\\D{\u000b\u0019\\Fl:\u0010\u0000PmE\u0019\u001aDn\u0004\t\u0010_>\u0000\u000f\u0001XlE";
        r0 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ca3:
        r8[r7] = r6;
        r7 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r6 = "s\u0000\u000e\u0000Vy\u0000]\u0012Tu\u0000\u0019S@w\u0011\u0015SYk\t\u0011S^z";
        r0 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0caf:
        r8[r7] = r6;
        r7 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00197Rr\u0000\t\u0016ul\n\u001c\u0017T\u007f\u0016\t?^m\u0011\u000e";
        r0 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0cbb:
        r8[r7] = r6;
        r7 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r6 = "}\u0006";
        r0 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0cc7:
        r8[r7] = r6;
        r7 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000f\u0016Ph\u0000\u000f\u001aQw\u0000\u0019\\Q\u007f\f\u0011\u0016S";
        r0 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0cd3:
        r8[r7] = r6;
        r7 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r6 = "n\r";
        r0 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0cdf:
        r8[r7] = r6;
        r7 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ceb:
        r8[r7] = r6;
        r7 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0000C\u007f\u0011\u0018";
        r0 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0cf7:
        r8[r7] = r6;
        r7 = 277; // 0x115 float:3.88E-43 double:1.37E-321;
        r6 = "f\b\r\u0003\u0018m\u0000\u000f\u0005^}\u0000R\u0001R\u007f\u0001\u0004";
        r0 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d03:
        r8[r7] = r6;
        r7 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 277; // 0x115 float:3.88E-43 double:1.37E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d0f:
        r8[r7] = r6;
        r7 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r6 = "y\u0017\u0012\u0006Gm:\u000e\u0016Eh\u0000\u000f,Gl\n\r\u0000hr\u0004\u000e\u0007hl\u0000\u001b\u0001Rm\r\"\u0007^s\u0000";
        r0 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d1b:
        r8[r7] = r6;
        r7 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r6 = "f\b\r\u0003\u0018m\u0000\u000f\u0005^}\u0000R\u0001R\u007f\u0001\u0004\\D{\u000b\u0019SCv\u0010\u0010\u0011\u0017l\u0000\f\u0006Rm\u0011\u000eI\u0017";
        r0 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d27:
        r8[r7] = r6;
        r7 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r6 = "^\u0016S\u0004_\u007f\u0011\u000e\u0012GnK\u0013\u0016C";
        r0 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d33:
        r8[r7] = r6;
        r7 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r6 = ">\u0006\b\u0001E{\u000b\t^Tr\f\u0018\u001dC$";
        r0 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d3f:
        r8[r7] = r6;
        r7 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r6 = "\u007f\u0015\r\\Cw\b\u0018SD{\u0017\u000b\u0016E$";
        r0 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d4b:
        r8[r7] = r6;
        r7 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r6 = ">\u0006\u0011\u001aRp\u0011G";
        r0 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d57:
        r8[r7] = r6;
        r7 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r6 = ">\u0006\b\u0001E{\u000b\t^D{\u0017\u000b\u0016E$";
        r0 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d63:
        r8[r7] = r6;
        r7 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d6f:
        r8[r7] = r6;
        r7 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r6 = ">\u0006\b\u0001E{\u000b\t^Tr\f\u0018\u001dC$";
        r0 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d7b:
        r8[r7] = r6;
        r7 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r6 = "}\t\u0014\u0016Yj:\u000e\u0016Eh\u0000\u000f,Cw\b\u0018,Sw\u0003\u001b";
        r0 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d87:
        r8[r7] = r6;
        r7 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r6 = ">\u0006\b\u0001E{\u000b\t^Tr\f\u0018\u001dC$";
        r0 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d93:
        r8[r7] = r6;
        r7 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r6 = "p\u0000\t\u0004Xl\u000eR\u001aYx\nR\u0012[r:\u0013\u0016Ci\n\u000f\u0018hm\u0011\u001c\u0007Rm:\b\u001d\\p\n\n\u001d";
        r0 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0d9f:
        r8[r7] = r6;
        r7 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r6 = "2E\u000e\u0006Uj\u001c\r\u0016\r>";
        r0 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0dab:
        r8[r7] = r6;
        r7 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r6 = "p\u0000\t\u0004Xl\u000eR\u001aYx\n";
        r0 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0db7:
        r8[r7] = r6;
        r7 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r6 = "p\u0000\t\u0004Xl\u000eR\u001aYx\nR\u0006Y\u007f\u0013\u001c\u001a[\u007f\u0007\u0011\u0016";
        r0 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0dc3:
        r8[r7] = r6;
        r7 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r6 = "2E\t\nG{_]";
        r0 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0dcf:
        r8[r7] = r6;
        r7 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r6 = "{\u000b\u001e";
        r0 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ddb:
        r8[r7] = r6;
        r7 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000f\u0016P}\n\u0019\u0016\u0018x\u0004\u0014\u001fRz";
        r0 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0de7:
        r8[r7] = r6;
        r7 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0010Xz\u0000";
        r0 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0df3:
        r8[r7] = r6;
        r7 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0dff:
        r8[r7] = r6;
        r7 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        r6 = "x\u0017\u0012\u001e";
        r0 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e0b:
        r8[r7] = r6;
        r7 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r6 = "x\f\u0011\u0016";
        r0 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e17:
        r8[r7] = r6;
        r7 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r6 = "j\u0004\u001a\u0000";
        r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e23:
        r8[r7] = r6;
        r7 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r6 = "j\u0017\b\u0016";
        r0 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e2f:
        r8[r7] = r6;
        r7 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r6 = "}\u0017\u001c\u0000_3\t\u0012\u0014\u0018i\r\u001c\u0007D\u007f\u0015\r\\Bn\t\u0012\u0012S";
        r0 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e3b:
        r8[r7] = r6;
        r7 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r6 = "x\n\u000f\u0010Rz";
        r0 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e47:
        r8[r7] = r6;
        r7 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r6 = "j\u0017\b\u0016";
        r0 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e53:
        r8[r7] = r6;
        r7 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r6 = "}\u0017\u001c\u0000_3\t\u0012\u0014\u0018x\u0004\u0014\u001fRz\u0010\r\u001fX\u007f\u0001]";
        r0 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e5f:
        r8[r7] = r6;
        r7 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r6 = "z\u0000\t\u0012^r\u0000\u0019";
        r0 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e6b:
        r8[r7] = r6;
        r7 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r6 = "}\u0017\u001c\u0000_3\t\u0012\u0014\u0018i\r\u001c\u0007D\u007f\u0015\r\\Eq\u0011\u001c\u0007R";
        r0 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e77:
        r8[r7] = r6;
        r7 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r6 = "}\u0017\u001c\u0000_3\t\u0012\u0014\u0018i\r\u001c\u0007D\u007f\u0015\r\\Yq:\u001b\u001a[{";
        r0 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e83:
        r8[r7] = r6;
        r7 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e8f:
        r8[r7] = r6;
        r7 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015S\u0012[\u007f\u0017\u0010]e[\"4 cL$):xP:/6cL<";
        r0 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0e9b:
        r8[r7] = r6;
        r7 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r6 = "\u007f\t\u001c\u0001Z";
        r0 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ea7:
        r8[r7] = r6;
        r7 = 313; // 0x139 float:4.39E-43 double:1.546E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u001c\u001f[}\n\u0013\u0007V}\u0011\u000e\\Q\u007f\f\u0011\u0016S";
        r0 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0eb3:
        r8[r7] = r6;
        r7 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r6 = "m\r\u0012\u0004h\u007f\t\u0011,Tq\u000b\t\u0012Tj\u0016";
        r0 = 313; // 0x139 float:4.39E-43 double:1.546E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ebf:
        r8[r7] = r6;
        r7 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ecb:
        r8[r7] = r6;
        r7 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00192Sz$\u0019\u001e^p\u0016";
        r0 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ed7:
        r8[r7] = r6;
        r7 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r6 = "l\u0000\u001c\u0017";
        r0 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ee3:
        r8[r7] = r6;
        r7 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r6 = "l\u0000\u001e\u0016^n\u0011";
        r0 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0eef:
        r8[r7] = r6;
        r7 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r6 = "}\n\u0010]Vs\u0004\u0007\u001cY0\u0001\u0018\u0005^}\u0000S\u001bXs\u0000S;Xs\u00000\u0012Y\u007f\u0002\u0018\u0001";
        r0 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0efb:
        r8[r7] = r6;
        r7 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r6 = "w\u000b\r\u0006CA\u0000\u0013\u0007Rl:\u000e\u0016Yz";
        r0 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f07:
        r8[r7] = r6;
        r7 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u0018\u001dC{\u0017P\u001aD3\u0016\u0018\u001dS1\u0003\u001c\u001a[{\u0001";
        r0 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f13:
        r8[r7] = r6;
        r7 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f1f:
        r8[r7] = r6;
        r7 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r6 = "p\u0000\t\u0004Xl\u000e\"\u0007Nn\u0000]\u001dXjE\u000b\u0012[w\u0001";
        r0 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f2b:
        r8[r7] = r6;
        r7 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f37:
        r8[r7] = r6;
        r7 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r6 = "\u007f\u0010\t\u001cSq\u0012\u0013\u001fX\u007f\u0001\"\u0004^x\f\"\u001eVm\u000e";
        r0 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f43:
        r8[r7] = r6;
        r7 = 326; // 0x146 float:4.57E-43 double:1.61E-321;
        r6 = "\u007f\u0010\t\u001cSq\u0012\u0013\u001fX\u007f\u0001\"\u0010Rr\t\b\u001fVl:\u0010\u0012Du";
        r0 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f4f:
        r8[r7] = r6;
        r7 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r6 = "\u007f\u0010\t\u001cSq\u0012\u0013\u001fX\u007f\u0001\"\u0001X\u007f\b\u0014\u001dPA\b\u001c\u0000\\";
        r0 = 326; // 0x146 float:4.57E-43 double:1.61E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f5b:
        r8[r7] = r6;
        r7 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r6 = "}\n\u0010\u0003[{\u0011\u0018\u0017\u0017}\n\u0013\u001dR}\u0011\u0018\u0017\u0017k\u0015\u001a\u0001Vz\u0000]\u0000Tl\f\r\u0007";
        r0 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f67:
        r8[r7] = r6;
        r7 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r6 = "}\t\u0014\u0016Yj:\u000b\u0016Em\f\u0012\u001dhk\u0015\u001a\u0001Vz\u0000\u0019";
        r0 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f73:
        r8[r7] = r6;
        r7 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r6 = "l\u0000\f\u0006Rm\u0011\u0014\u001dP>\u0016\u0018\u0001A{\u0017]\u0003Eq\u0015\u0018\u0001Cw\u0000\u000e";
        r0 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f7f:
        r8[r7] = r6;
        r7 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r6 = "\u007f\u0015\r\\_\u007f\u000b\u0019\u001fR}\n\u0013\u001dR}\u0011\u0018\u0017\u0018m\u0000\u0013\u0017\u001an\u0000\u0013\u0017^p\u0002P\u0001Ro\u0010\u0018\u0000Cm_]";
        r0 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f8b:
        r8[r7] = r6;
        r7 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r6 = "l\u0000\f\u0006Rm\u0011\u0014\u001dP>\u0006\u001c\u001f[\u007f\u0007\u0014\u001f^j\u001c]\u001cY>\u0004\u0011\u001f\u0017}\n\u0013\u0007V}\u0011\u000e";
        r0 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0f97:
        r8[r7] = r6;
        r7 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0fa3:
        r8[r7] = r6;
        r7 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r6 = "}\t\u0014\u0016Yj:\u000b\u0016Em\f\u0012\u001dhk\u0015\u001a\u0001Vz\u0000\u0019";
        r0 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0faf:
        r8[r7] = r6;
        r7 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r6 = "l\u0010\u0013\u001d^p\u0002]\u0010Xp\u000b\u0018\u0010C{\u0001]\u0006Gy\u0017\u001c\u0017R>\u0016\u001e\u0001^n\u0011";
        r0 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0fbb:
        r8[r7] = r6;
        r7 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0fc7:
        r8[r7] = r6;
        r7 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0000C\u007f\u0011\u0018";
        r0 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0fd3:
        r8[r7] = r6;
        r7 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000f\u0016Pm\u0011\u001c\u0007R1\u0003\u001c\u001a[{\u0001";
        r0 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0fdf:
        r8[r7] = r6;
        r7 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00196Y\u007f\u0007\u0011\u0016{q\u0006\u001c\u0007^q\u000b.\u001bVl\f\u0013\u0014\u0018";
        r0 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0feb:
        r8[r7] = r6;
        r7 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r6 = "m\u0000\u001e\u0006Ew\u0011\u0004,Yq\u0011\u0014\u0015^}\u0004\t\u001aXp\u0016";
        r0 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x0ff7:
        r8[r7] = r6;
        r7 = 341; // 0x155 float:4.78E-43 double:1.685E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1003:
        r8[r7] = r6;
        r7 = 342; // 0x156 float:4.79E-43 double:1.69E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 341; // 0x155 float:4.78E-43 double:1.685E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x100f:
        r8[r7] = r6;
        r7 = 343; // 0x157 float:4.8E-43 double:1.695E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0015Vw\t\b\u0001RA\u0017\u0018\u0012Dq\u000b";
        r0 = 342; // 0x156 float:4.79E-43 double:1.69E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x101b:
        r8[r7] = r6;
        r7 = 344; // 0x158 float:4.82E-43 double:1.7E-321;
        r6 = "l\u0000\u001b\u0001Rm\r\"\u0011Eq\u0004\u0019\u0010Vm\u0011\"\u001f^m\u0011\u000e";
        r0 = 343; // 0x157 float:4.8E-43 double:1.695E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1027:
        r8[r7] = r6;
        r7 = 345; // 0x159 float:4.83E-43 double:1.705E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 344; // 0x158 float:4.82E-43 double:1.7E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1033:
        r8[r7] = r6;
        r7 = 346; // 0x15a float:4.85E-43 double:1.71E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 345; // 0x159 float:4.83E-43 double:1.705E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x103f:
        r8[r7] = r6;
        r7 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 346; // 0x15a float:4.85E-43 double:1.71E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x104b:
        r8[r7] = r6;
        r7 = 348; // 0x15c float:4.88E-43 double:1.72E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0005Xw\u0006\u0018,Tq\u0001\u0018,[{\u000b\u001a\u0007_";
        r0 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1057:
        r8[r7] = r6;
        r7 = 349; // 0x15d float:4.89E-43 double:1.724E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 348; // 0x15c float:4.88E-43 double:1.72E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1063:
        r8[r7] = r6;
        r7 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r6 = "v\u0004\u000e,_\u007f\u0001\"\u0011V}\u000e\u001a\u0001Xk\u000b\u0019,S\u007f\u0011\u001c,Sw\u0016\u001c\u0011[{\u0001";
        r0 = 349; // 0x15d float:4.89E-43 double:1.724E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x106f:
        r8[r7] = r6;
        r7 = 351; // 0x15f float:4.92E-43 double:1.734E-321;
        r6 = "\u007f\u0015\r\\Qk\t\u0011\u0000Np\u0006\u0014\u0015Y{\u0000\u0019\u0016S1\u0003\b\u001f[m\u001c\u0013\u0010\u0018m\u001c\u0013\u0010";
        r0 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x107b:
        r8[r7] = r6;
        r7 = 352; // 0x160 float:4.93E-43 double:1.74E-321;
        r6 = "\u007f\u0015\r\\Qk\t\u0011\u0000Np\u0006\u0014\u0015Y{\u0000\u0019\u0016S1\u0003\b\u001f[m\u001c\u0013\u0010\u0018p\u0000\u000b\u0016Em\u001c\u0013\u0010Rz";
        r0 = 351; // 0x15f float:4.92E-43 double:1.734E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1087:
        r8[r7] = r6;
        r7 = 353; // 0x161 float:4.95E-43 double:1.744E-321;
        r6 = "^\u0016S\u0004_\u007f\u0011\u000e\u0012GnK\u0013\u0016C";
        r0 = 352; // 0x160 float:4.93E-43 double:1.74E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1093:
        r8[r7] = r6;
        r7 = 354; // 0x162 float:4.96E-43 double:1.75E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0001Rs\n\u000b\u0016V}\u0006\u0012\u0006Yj";
        r0 = 353; // 0x161 float:4.95E-43 double:1.744E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x109f:
        r8[r7] = r6;
        r7 = 355; // 0x163 float:4.97E-43 double:1.754E-321;
        r6 = "p\u0010\u0011\u001f\u0017n\n\n\u0016E>\u0016\u001c\u0005R>\b\u0012\u0017R>\u0000\u000b\u0016Yj^]\u0010Vp\u000b\u0012\u0007\u0017m\u0000\u0013\u0017\u0017i\u0000\u001fSU\u007f\u0011\t\u0016EgE\b\u0003S\u007f\u0011\u0018";
        r0 = 354; // 0x162 float:4.96E-43 double:1.75E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10ab:
        r8[r7] = r6;
        r7 = 356; // 0x164 float:4.99E-43 double:1.76E-321;
        r6 = "p\u0010\u0011\u001f\u0017|\u0004\t\u0007Rl\u001c]\u0010_\u007f\u000b\u001a\u0016\u0017{\u0013\u0018\u001dC%E\u001e\u0012Yp\n\tSD{\u000b\u0019S@{\u0007]\u0011Vj\u0011\u0018\u0001N>\u0010\r\u0017Vj\u0000";
        r0 = 355; // 0x163 float:4.97E-43 double:1.754E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10b7:
        r8[r7] = r6;
        r7 = 357; // 0x165 float:5.0E-43 double:1.764E-321;
        r6 = "h\n\u0014\u0003\u0018p\n\t\u001aQg&\u001c\u001f[M\u0011\u001c\u0001C{\u0001";
        r0 = 356; // 0x164 float:4.99E-43 double:1.76E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10c3:
        r8[r7] = r6;
        r7 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 357; // 0x165 float:5.0E-43 double:1.764E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10cf:
        r8[r7] = r6;
        r7 = 359; // 0x167 float:5.03E-43 double:1.774E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0000C\u007f\u0011\u0018";
        r0 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10db:
        r8[r7] = r6;
        r7 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r6 = "\u007f\u0015\r\\Bn\u0001\u001c\u0007R}\b\u001c\u001dSz\b\n\u001cEu\u0000\u000f\\S|:\u0014\u001d^j";
        r0 = 359; // 0x167 float:5.03E-43 double:1.774E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10e7:
        r8[r7] = r6;
        r7 = 361; // 0x169 float:5.06E-43 double:1.784E-321;
        r6 = "\u007f\u0015\r\\[q\u0002\r\u0001X}\u0000\u000e\u0000\u0018n\u0017\u0012\u0010^p\u0003\u0012S";
        r0 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10f3:
        r8[r7] = r6;
        r7 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r6 = "\u007f\u0015\r\\[q\u0002\r\u0001X}\u0000\u000e\u0000\u0018{\u0017\u000f\u001cE>";
        r0 = 361; // 0x169 float:5.06E-43 double:1.784E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x10ff:
        r8[r7] = r6;
        r7 = 363; // 0x16b float:5.09E-43 double:1.793E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Z\u007f\u0015\u000e]z\u007f\u0015<\u0010Cw\u0013\u0014\u0007N";
        r0 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x110b:
        r8[r7] = r6;
        r7 = 364; // 0x16c float:5.1E-43 double:1.8E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019?R\u007f\u0013\u00184Eq\u0010\r";
        r0 = 363; // 0x16b float:5.09E-43 double:1.793E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1117:
        r8[r7] = r6;
        r7 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        r6 = "\u007f\u0015\r\\E{\u0016\u0018\u0007\u001an\u0000\u000f\u001e^m\u0016\u0014\u001cY3\u0017\u0018\u0002B{\u0016\t\u0016S1\u0003\u001c\u001a[{\u0001";
        r0 = 364; // 0x16c float:5.1E-43 double:1.8E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1123:
        r8[r7] = r6;
        r7 = 366; // 0x16e float:5.13E-43 double:1.81E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x112f:
        r8[r7] = r6;
        r7 = 367; // 0x16f float:5.14E-43 double:1.813E-321;
        r6 = "\u007f\u0015\r\\Du\f\rSD{\u000b\u00194Rj\"\u000f\u001cBn,\u0013\u0015X";
        r0 = 366; // 0x16e float:5.13E-43 double:1.81E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x113b:
        r8[r7] = r6;
        r7 = 368; // 0x170 float:5.16E-43 double:1.82E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00194Rj\"\u000f\u001cBn,\u0013\u0015X";
        r0 = 367; // 0x16f float:5.14E-43 double:1.813E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1147:
        r8[r7] = r6;
        r7 = 369; // 0x171 float:5.17E-43 double:1.823E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00194Rj'\u000f\u001cVz\u0006\u001c\u0000CR\f\u000e\u0007D";
        r0 = 368; // 0x170 float:5.16E-43 double:1.82E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1153:
        r8[r7] = r6;
        r7 = 370; // 0x172 float:5.18E-43 double:1.83E-321;
        r6 = "\u007f\u0015\r\\Ds\u0016R\u001dX>\u0004\u001e\u0007^h\f\t\u001aRm";
        r0 = 369; // 0x171 float:5.17E-43 double:1.823E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x115f:
        r8[r7] = r6;
        r7 = 371; // 0x173 float:5.2E-43 double:1.833E-321;
        r6 = "m\b\u000e,Uq\u0001\u0004";
        r0 = 370; // 0x172 float:5.18E-43 double:1.83E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x116b:
        r8[r7] = r6;
        r7 = 372; // 0x174 float:5.21E-43 double:1.84E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK.6yZ12";
        r0 = 371; // 0x173 float:5.2E-43 double:1.833E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1177:
        r8[r7] = r6;
        r7 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r6 = "\u007f\u0015\r\\Ds\u0016]";
        r0 = 372; // 0x174 float:5.21E-43 double:1.84E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1183:
        r8[r7] = r6;
        r7 = 374; // 0x176 float:5.24E-43 double:1.85E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x118f:
        r8[r7] = r6;
        r7 = 375; // 0x177 float:5.25E-43 double:1.853E-321;
        r6 = "m\u001c\u0013\u0010\u0018v\u0004\u000e\u0010Bl\u0017\u0018\u001dCm\u001c\u0013\u0010\u0018j\u001c\r\u0016\n";
        r0 = 374; // 0x176 float:5.24E-43 double:1.85E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x119b:
        r8[r7] = r6;
        r7 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        r6 = "}\n\u0010]Vp\u0001\u000f\u001c^zK\u001e\u001cYj\u0004\u001e\u0007D";
        r0 = 375; // 0x177 float:5.25E-43 double:1.853E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11a7:
        r8[r7] = r6;
        r7 = 377; // 0x179 float:5.28E-43 double:1.863E-321;
        r6 = "i\f\u0013\u0017Xi";
        r0 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11b3:
        r8[r7] = r6;
        r7 = 378; // 0x17a float:5.3E-43 double:1.87E-321;
        r6 = "^\u0016S\u0004_\u007f\u0011\u000e\u0012GnK\u0013\u0016C";
        r0 = 377; // 0x179 float:5.28E-43 double:1.863E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11bf:
        r8[r7] = r6;
        r7 = 379; // 0x17b float:5.31E-43 double:1.873E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 378; // 0x17a float:5.3E-43 double:1.87E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11cb:
        r8[r7] = r6;
        r7 = 380; // 0x17c float:5.32E-43 double:1.877E-321;
        r6 = "z\f\u000f\u0016Tj:\u000e\u001bVl\u0000\"\u0010Xp\u0011\u001c\u0010Cm";
        r0 = 379; // 0x17b float:5.31E-43 double:1.873E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11d7:
        r8[r7] = r6;
        r7 = 381; // 0x17d float:5.34E-43 double:1.88E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,rF18!y_)\" cQ7<4r";
        r0 = 380; // 0x17c float:5.32E-43 double:1.877E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11e3:
        r8[r7] = r6;
        r7 = 382; // 0x17e float:5.35E-43 double:1.887E-321;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 381; // 0x17d float:5.34E-43 double:1.88E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11ef:
        r8[r7] = r6;
        r7 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 382; // 0x17e float:5.35E-43 double:1.887E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x11fb:
        r8[r7] = r6;
        r7 = 384; // 0x180 float:5.38E-43 double:1.897E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1207:
        r8[r7] = r6;
        r7 = 385; // 0x181 float:5.4E-43 double:1.9E-321;
        r6 = "m\u001c\u0013\u0010hp\u0000\u0018\u0017Rz";
        r0 = 384; // 0x180 float:5.38E-43 double:1.897E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1213:
        r8[r7] = r6;
        r7 = 386; // 0x182 float:5.41E-43 double:1.907E-321;
        r6 = "\u007f\u0015\r\\S|:\u0014\u001d^jJ\u000e\nY}:\u0013\u0016Rz\u0000\u0019S";
        r0 = 385; // 0x181 float:5.4E-43 double:1.9E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x121f:
        r8[r7] = r6;
        r7 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r6 = "\u007f\u0015\r\\S|:\u0014\u001d^jJ\u001b\u001cE}\u0000\u001b\u0006[r\u0016\u0004\u001dT";
        r0 = 386; // 0x182 float:5.41E-43 double:1.907E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x122b:
        r8[r7] = r6;
        r7 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r6 = "K\u000b\u0016\u001dXi\u000b]?Xy\f\u00135Vw\t\b\u0001R[\u001d\u001e\u0016Gj\f\u0012\u001d\u0017j\u001c\r\u0016\r>";
        r0 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1237:
        r8[r7] = r6;
        r7 = 389; // 0x185 float:5.45E-43 double:1.92E-321;
        r6 = "m\u0015\u001c\u001ehi\u0004\u000f\u001d^p\u0002\"\u0001R\u007f\u0016\u0012\u001dhu\u0000\u0004";
        r0 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1243:
        r8[r7] = r6;
        r7 = 390; // 0x186 float:5.47E-43 double:1.927E-321;
        r6 = "{\u001d\r\u001aEg:\u0014\u001dhm\u0000\u001e\u001cYz\u0016";
        r0 = 389; // 0x185 float:5.45E-43 double:1.92E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x124f:
        r8[r7] = r6;
        r7 = 391; // 0x187 float:5.48E-43 double:1.93E-321;
        r6 = "\u007f\u0010\u0019\u001aX";
        r0 = 390; // 0x186 float:5.47E-43 double:1.927E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x125b:
        r8[r7] = r6;
        r7 = 392; // 0x188 float:5.5E-43 double:1.937E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000e\u001bXk\t\u0019\u0014Rj\u0015\u000f\u0016\\{\u001c\u0019\u001aP{\u0016\t\\";
        r0 = 391; // 0x187 float:5.48E-43 double:1.93E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1267:
        r8[r7] = r6;
        r7 = 393; // 0x189 float:5.51E-43 double:1.94E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 392; // 0x188 float:5.5E-43 double:1.937E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1273:
        r8[r7] = r6;
        r7 = 394; // 0x18a float:5.52E-43 double:1.947E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000e\u001bXk\t\u0019\u0014Rj\u0015\u000f\u0016\\{\u001c\u0019\u001aP{\u0016\t\\Q\u007f\f\u0011\u0016S";
        r0 = 393; // 0x189 float:5.51E-43 double:1.94E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x127f:
        r8[r7] = r6;
        r7 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r6 = "p\u0000\u0018\u0017hj\n\"\u0014Rj:\r\u0001RA\u000e\u0018\nhz\f\u001a\u0016Dj";
        r0 = 394; // 0x18a float:5.52E-43 double:1.947E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x128b:
        r8[r7] = r6;
        r7 = 396; // 0x18c float:5.55E-43 double:1.956E-321;
        r6 = "m\u0015\u001c\u001eh|\u0004\u0013\u001dRz:\u0018\u000bGw\u0017\u0004,Cw\b\u0018\u0000C\u007f\b\r";
        r0 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1297:
        r8[r7] = r6;
        r7 = 397; // 0x18d float:5.56E-43 double:1.96E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 396; // 0x18c float:5.55E-43 double:1.956E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12a3:
        r8[r7] = r6;
        r7 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019!Rs\n\u000b\u0016g\u007f\u0017\t\u001aTw\u0015\u001c\u001dCm";
        r0 = 397; // 0x18d float:5.56E-43 double:1.96E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12af:
        r8[r7] = r6;
        r7 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u0014\u001dU\u007f\u0006\u0016\u0014Eq\u0010\u0013\u0017\u0017";
        r0 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12bb:
        r8[r7] = r6;
        r7 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r6 = "t\f\u0019SZk\u0016\tSYq\u0011]\u0011R>\u0000\u0010\u0003Cg";
        r0 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12c7:
        r8[r7] = r6;
        r7 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00194Rj5\u000f\u001cQw\t\u0018#_q\u0011\u0012SGv\n\t\u001chw\u0001G";
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12d3:
        r8[r7] = r6;
        r7 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r6 = ">\u0011\u0004\u0003R$";
        r0 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12df:
        r8[r7] = r6;
        r7 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r6 = "^\u0016S\u0004_\u007f\u0011\u000e\u0012GnK\u0013\u0016C";
        r0 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12eb:
        r8[r7] = r6;
        r7 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r6 = "t\f\u0019SZk\u0016\tSYq\u0011]\u0011R>\u000b\b\u001f[";
        r0 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x12f7:
        r8[r7] = r6;
        r7 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r6 = ">\u0011\u0004\u0003R$";
        r0 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1303:
        r8[r7] = r6;
        r7 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00194Rj5\u000f\u001cQw\t\u0018#_q\u0011\u0012[Z{\u0016\u000e\u0012P{:\u000e\u0016Eh\f\u001e\u0016hP*),E{\u0004\u0019\n\u001e>\u0015\u0015\u001cCq:\u0014\u0017\r";
        r0 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x130f:
        r8[r7] = r6;
        r7 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r6 = ">\u000f\u0014\u0017\r";
        r0 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x131b:
        r8[r7] = r6;
        r7 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r6 = ">\u000f\u0014\u0017\r";
        r0 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1327:
        r8[r7] = r6;
        r7 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019 Rj\"\u000f\u001cBn6\b\u0011]{\u0006\t";
        r0 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1333:
        r8[r7] = r6;
        r7 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r6 = "\u007f\u0015\r\\Os\u0015\r\\D{\u000b\u0019\\Fl:\u000e\u0016Yz:\u001e\u001cYhE\r\u0001R{\b\r\u0007\r";
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x133f:
        r8[r7] = r6;
        r7 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r6 = ">\u0017\u0018\u0010Rp\u0011\u000eSSw\u0016\r\u0012C}\r]\u0016El\n\u000fS";
        r0 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x134b:
        r8[r7] = r6;
        r7 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r6 = ">\u0006\u0015\u0012CmJ\u001f\u0016Qq\u0017\u0018SSw\u0016\r\u0012C}\r]\u0016El\n\u000fS";
        r0 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1357:
        r8[r7] = r6;
        r7 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r6 = "\u007f\u0015\r\\Os\u0015\r\\D{\u000b\u0019\\Fl:\u000e\u0016Yz:\u001e\u001cYhE\r\u0001R{\b\r\u0007\r";
        r0 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1363:
        r8[r7] = r6;
        r7 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        r6 = "\u007f\u0015\r\\D\u007f\u0013\u0018\u001c[z\b\u0018";
        r0 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x136f:
        r8[r7] = r6;
        r7 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r6 = "s\u0000\"\u001c[z";
        r0 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x137b:
        r8[r7] = r6;
        r7 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r6 = "\u007f\u0015\r\\[q\u0004\u0019\u001fXy\f\u0013\u0015Vw\t\u0018\u0017\u0018p\n\u0013\u0016";
        r0 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1387:
        r8[r7] = r6;
        r7 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r6 = "r\n\u001a\u001aYA\u0003\u001c\u001a[{\u0001";
        r0 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1393:
        r8[r7] = r6;
        r7 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r6 = "r\n\u001a\u001aYA\u0003\u001c\u001a[{\u0001";
        r0 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x139f:
        r8[r7] = r6;
        r7 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r6 = "\u007f\u0015\r\\Q\u007f\f\u0011\u0016S>\t\u0012\u0014^p:\u001b\u0012^r\u0000\u0019";
        r0 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13ab:
        r8[r7] = r6;
        r7 = 420; // 0x1a4 float:5.89E-43 double:2.075E-321;
        r6 = "f\b\r\u0003\u0018m\u0000\u000f\u0005^}\u0000R\u0011^p\u0001";
        r0 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13b7:
        r8[r7] = r6;
        r7 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r6 = "m\b\u001c\u001f[{\u0017\"\u0010Vr\t\"\u0011Cp";
        r0 = 420; // 0x1a4 float:5.89E-43 double:2.075E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13c3:
        r8[r7] = r6;
        r7 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r6 = "z\f\u001c\u001f\u0017z\f\u001c\u001fRlE\u001c\u0003G>\u000b\u0012\u0007\u0017x\n\b\u001dS";
        r0 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13cf:
        r8[r7] = r6;
        r7 = 423; // 0x1a7 float:5.93E-43 double:2.09E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0012^r\u0000\u0019,Tq\u000b\t\u0012Tj:\u001f\u001fX}\u000e\u0018\u0017";
        r0 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13db:
        r8[r7] = r6;
        r7 = 424; // 0x1a8 float:5.94E-43 double:2.095E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK9:vR";
        r0 = 423; // 0x1a7 float:5.93E-43 double:2.09E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13e7:
        r8[r7] = r6;
        r7 = 425; // 0x1a9 float:5.96E-43 double:2.1E-321;
        r6 = "m\u0011\u001c\u0001CA\u0006\u001c\u001f[";
        r0 = 424; // 0x1a8 float:5.94E-43 double:2.095E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13f3:
        r8[r7] = r6;
        r7 = 426; // 0x1aa float:5.97E-43 double:2.105E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0012^r\u0000\u0019,Vw\u0017\r\u001fVp\u0000\"\u001eXz\u0000\"\u001aDA\n\u0013";
        r0 = 425; // 0x1a9 float:5.96E-43 double:2.1E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x13ff:
        r8[r7] = r6;
        r7 = 427; // 0x1ab float:5.98E-43 double:2.11E-321;
        r6 = "l\u0000\u001c\u0000Xp";
        r0 = 426; // 0x1aa float:5.97E-43 double:2.105E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x140b:
        r8[r7] = r6;
        r7 = 428; // 0x1ac float:6.0E-43 double:2.115E-321;
        r6 = "n\u0000\u000f\u001e^m\u0016\u0014\u001cYm";
        r0 = 427; // 0x1ab float:5.98E-43 double:2.11E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1417:
        r8[r7] = r6;
        r7 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        r6 = "}\u0004\u0011\u001fhx\u0017\u0012\u001e";
        r0 = 428; // 0x1ac float:6.0E-43 double:2.115E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1423:
        r8[r7] = r6;
        r7 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r6 = "t\f\u0019";
        r0 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x142f:
        r8[r7] = r6;
        r7 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0001XsE";
        r0 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x143b:
        r8[r7] = r6;
        r7 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r6 = "n\u0000\u000f\u001ehz\u0000\u0013\u001aVr:\u0010\u0016Dm\u0004\u001a\u0016hw\u0001";
        r0 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1447:
        r8[r7] = r6;
        r7 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r6 = "s\u0000\u000e\u0000Vy\u0000\"\u001aS";
        r0 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1453:
        r8[r7] = r6;
        r7 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r6 = "t\f\u0019";
        r0 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x145f:
        r8[r7] = r6;
        r7 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0012^r\u0000\u0019,Yq:\u000f\u0016Tq\u0017\u0019,Vk\u0001\u0014\u001chn\u0000\u000f\u001e^m\u0016\u0014\u001cY";
        r0 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x146b:
        r8[r7] = r6;
        r7 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r6 = "z\u0017\u001c\u0004V|\t\u0018,^z";
        r0 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1477:
        r8[r7] = r6;
        r7 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0012^r\u0000\u0019,Yq:\u001e\u0016[r\u0010\u0011\u0012EA\u0006\u001c\u001f[A\f\u0013,Gl\n\u001a\u0001Rm\u0016";
        r0 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1483:
        r8[r7] = r6;
        r7 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0012^r\u0000\u0019,Yq\u0011\"\u0012[r\n\n\u0016S>";
        r0 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x148f:
        r8[r7] = r6;
        r7 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r6 = "t\f\u0019";
        r0 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x149b:
        r8[r7] = r6;
        r7 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r6 = "j\u0000\u0011I";
        r0 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14a7:
        r8[r7] = r6;
        r7 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r6 = "n\r\u0012\u001dR";
        r0 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14b3:
        r8[r7] = r6;
        r7 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ]\u0007EgE\t\u001c\u0017m\u0011\u001c\u0001C>\n\b\u0007Pq\f\u0013\u0014\u0017}\u0004\u0011\u001f\u0017x\u0017\u0012\u001e\u0017\u007f\u0006\t\u001aA{E\u000b\u001c^nE\u001e\u0012[r";
        r0 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14bf:
        r8[r7] = r6;
        r7 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[&2!sA$(7~Q";
        r0 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14cb:
        r8[r7] = r6;
        r7 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007xk\u0011\u001a\u001c^p\u0002>\u0012[rJ\u001b\u0012^r\u0000\u0019,Yq:\u0013\u0016Ci\n\u000f\u0018";
        r0 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14d7:
        r8[r7] = r6;
        r7 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r6 = ">\u0016\u0010\u0012[r\u0000\u000f1Cp_]";
        r0 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14e3:
        r8[r7] = r6;
        r7 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r6 = "t\f\u0019";
        r0 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14ef:
        r8[r7] = r6;
        r7 = 447; // 0x1bf float:6.26E-43 double:2.21E-321;
        r6 = "m\u0015\u001c\u001eh|\u0004\u0013\u001dRz";
        r0 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x14fb:
        r8[r7] = r6;
        r7 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 447; // 0x1bf float:6.26E-43 double:2.21E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1507:
        r8[r7] = r6;
        r7 = 449; // 0x1c1 float:6.29E-43 double:2.22E-321;
        r6 = "f\b\r\u0003\u0018m\u0000\u000f\u0005^}\u0000R\u0001Rm\u0000\t^E{\u0002\u0014\u0000C{\u0017\u0018\u0017\u0018k\u0015\u0019\u0012C{\u0015\u001c\u0001Vs\u0016";
        r0 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1513:
        r8[r7] = r6;
        r7 = 450; // 0x1c2 float:6.3E-43 double:2.223E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 449; // 0x1c1 float:6.29E-43 double:2.22E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x151f:
        r8[r7] = r6;
        r7 = 451; // 0x1c3 float:6.32E-43 double:2.23E-321;
        r6 = "\u007f\u0015\r\\D{\u0011P\u001bVmH\u0015\u0012S3\u0007\u0016\u0014YzH\u0012\u0015Q1\u0003\u001c\u001a[{\u0001";
        r0 = 450; // 0x1c2 float:6.3E-43 double:2.223E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x152b:
        r8[r7] = r6;
        r7 = 452; // 0x1c4 float:6.33E-43 double:2.233E-321;
        r6 = "v\u0004\u000e,_\u007f\u0001\"\u0011V}\u000e\u001a\u0001Xk\u000b\u0019,S\u007f\u0011\u001c,Sw\u0016\u001c\u0011[{\u0001";
        r0 = 451; // 0x1c3 float:6.32E-43 double:2.23E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1537:
        r8[r7] = r6;
        r7 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r6 = "\u007f\u0015\r\\Os\u0015\r\\D{\u000b\u0019\\Fl:\u0010\u0000PA\u0016\t\u0012Ck\u0016]\u001aYh\u0004\u0011\u001aS>\u0016\t\u0012Ck\u0016";
        r0 = 452; // 0x1c4 float:6.33E-43 double:2.233E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1543:
        r8[r7] = r6;
        r7 = 454; // 0x1c6 float:6.36E-43 double:2.243E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0005Xw\u0006\u0018,Tq\u0001\u0018,[{\u000b\u001a\u0007_";
        r0 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x154f:
        r8[r7] = r6;
        r7 = 455; // 0x1c7 float:6.38E-43 double:2.25E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 454; // 0x1c6 float:6.36E-43 double:2.243E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x155b:
        r8[r7] = r6;
        r7 = 456; // 0x1c8 float:6.39E-43 double:2.253E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000b\u001c^}\u0000\u001e\u001cS{\t\u0018\u001dPj\rR\u0015Vw\t\u0018\u0017";
        r0 = 455; // 0x1c7 float:6.38E-43 double:2.25E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1567:
        r8[r7] = r6;
        r7 = 457; // 0x1c9 float:6.4E-43 double:2.26E-321;
        r6 = "\u007f\u0015\r\\_\u007f\u000b\u0019\u001fRm\n\u001b\u0007@\u007f\u0017\u0018\u0016On\f\u000f\u0016S";
        r0 = 456; // 0x1c8 float:6.39E-43 double:2.253E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1573:
        r8[r7] = r6;
        r7 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r6 = "p\u0010\u0010\u0011RlE\u001b\u001cEs\u0004\tSYq\u0011]\u0005Vr\f\u0019I\u0017";
        r0 = 457; // 0x1c9 float:6.4E-43 double:2.26E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x157f:
        r8[r7] = r6;
        r7 = 459; // 0x1cb float:6.43E-43 double:2.27E-321;
        r6 = "f\b\r\u0003\u0018m\u0000\u000f\u0005^}\u0000R\u0000Cq\u0015";
        r0 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x158b:
        r8[r7] = r6;
        r7 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r6 = "\u007f\u0015\r\\Cq\u0016\b\u0003S\u007f\u0011\u0018\\Dj\u0004\u001a\u0016\u0017";
        r0 = 459; // 0x1cb float:6.43E-43 double:2.27E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1597:
        r8[r7] = r6;
        r7 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r6 = "m\u0000\u0013\u0017^p\u0004\u001e\u0007^h\u0000";
        r0 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15a3:
        r8[r7] = r6;
        r7 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r6 = "n\n\n\u0016E";
        r0 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15af:
        r8[r7] = r6;
        r7 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u001aY\u007f\u0006\t\u001aA{J\n\u001f";
        r0 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15bb:
        r8[r7] = r6;
        r7 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r6 = "w\u000b\u000b\u0012[w\u0001\"\u001dBs\u0007\u0018\u0001D";
        r0 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15c7:
        r8[r7] = r6;
        r7 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u00192Sz5\u001c\u0001Cw\u0006\u0014\u0003Vp\u0011\u000e";
        r0 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15d3:
        r8[r7] = r6;
        r7 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r6 = "m\r\u0012\u0004h\u007f\t\u0011,Tq\u000b\t\u0012Tj\u0016";
        r0 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15df:
        r8[r7] = r6;
        r7 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15eb:
        r8[r7] = r6;
        r7 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u0019\u001aE{\u0006\t\u0000_\u007f\u0017\u0018\u0010Xp\u0011\u001c\u0010CmJ\u001b\u0012^r\u0000\u0019";
        r0 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x15f7:
        r8[r7] = r6;
        r7 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r6 = "z\f\u000f\u0016Tj:\u000e\u001bVl\u0000\"\u0010Xp\u0011\u001c\u0010Cm";
        r0 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1603:
        r8[r7] = r6;
        r7 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x160f:
        r8[r7] = r6;
        r7 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x161b:
        r8[r7] = r6;
        r7 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,rF18!y_)\" cQ7<4r";
        r0 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1627:
        r8[r7] = r6;
        r7 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1633:
        r8[r7] = r6;
        r7 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r6 = ">M";
        r0 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x163f:
        r8[r7] = r6;
        r7 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r6 = "w\b\r\u001cDm\f\u001f\u001fR>\u000b\u001c\u001eR>\u0006\u0012\u0006YjE";
        r0 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x164b:
        r8[r7] = r6;
        r7 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007\u001a\u007f\u0006\t\u001aAw\u0011\u0004S";
        r0 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1657:
        r8[r7] = r6;
        r7 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r6 = "\u007f\u0015\r\\[q\u0012\u0010\u0016Zq\u0017\u0004";
        r0 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1663:
        r8[r7] = r6;
        r7 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r6 = "\u007f\u0015\r\\P{\u0011\"\u001eZm:\u001c\u0006Cv\n\u000f\u001aCg:\u0012\u0005Rl\u0017\u0014\u0017R1\u0007\u001c\u0017h{\u001d\r\u001aEgE";
        r0 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x166f:
        r8[r7] = r6;
        r7 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x167b:
        r8[r7] = r6;
        r7 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r6 = "s\b\u000e,Vk\u0011\u0015\u001cEw\u0011\u0004,Xh\u0000\u000f\u0001^z\u0000";
        r0 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1687:
        r8[r7] = r6;
        r7 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r6 = "B\u0019";
        r0 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1693:
        r8[r7] = r6;
        r7 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r6 = "\u007f\u0015\r\\P{\u0011\"\u001eZm:\u001c\u0006Cv\n\u000f\u001aCg:\u0012\u0005Rl\u0017\u0014\u0017R1\u0002\u001c\u0001U\u007f\u0002\u0018S";
        r0 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x169f:
        r8[r7] = r6;
        r7 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r6 = "\u007f\u0015\r\\Bp\u0017\u0018\u0014^m\u0011\u0018\u0001D{\u0017\u000b\u001aT{\u0016";
        r0 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16ab:
        r8[r7] = r6;
        r7 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\r\u0006Dv\u000b\u001c\u001eR1\u0003\u001c\u001a[{\u0001";
        r0 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16b7:
        r8[r7] = r6;
        r7 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16c3:
        r8[r7] = r6;
        r7 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r6 = "n\u0010\u000e\u001bhp\u0004\u0010\u0016";
        r0 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16cf:
        r8[r7] = r6;
        r7 = 487; // 0x1e7 float:6.82E-43 double:2.406E-321;
        r6 = "}\n\u0010]Vs\u0004\u0007\u001cY0\u0001\u0018\u0005^}\u0000S\u001eRm\u0016\u001c\u0014^p\u0002S2sS";
        r0 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16db:
        r8[r7] = r6;
        r7 = 488; // 0x1e8 float:6.84E-43 double:2.41E-321;
        r6 = "j\u001c\r\u0016";
        r0 = 487; // 0x1e7 float:6.82E-43 double:2.406E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16e7:
        r8[r7] = r6;
        r7 = 489; // 0x1e9 float:6.85E-43 double:2.416E-321;
        r6 = "j\u001c\r\u0016";
        r0 = 488; // 0x1e8 float:6.84E-43 double:2.41E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16f3:
        r8[r7] = r6;
        r7 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 489; // 0x1e9 float:6.85E-43 double:2.416E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x16ff:
        r8[r7] = r6;
        r7 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;
        r6 = "n\u0010\u000e\u001bhp\u0004\u0010\u0016";
        r0 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x170b:
        r8[r7] = r6;
        r7 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0019^z";
        r0 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1717:
        r8[r7] = r6;
        r7 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1723:
        r8[r7] = r6;
        r7 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r6 = "\u007f\u0015\r\\Rf\u0011\u000e\u001bVl\u0000\u0019\u0015^r\u0000R\u0015Xr\u0001\u0018\u0001\u0018}\u0017\u0018\u0012C{\u0001R\u0015Vr\u0016\u0018";
        r0 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x172f:
        r8[r7] = r6;
        r7 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;
        r6 = "s\u0000";
        r0 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x173b:
        r8[r7] = r6;
        r7 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r6 = "\u007f\u0015\r\\[q\u0004\u0019\u001eR";
        r0 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1747:
        r8[r7] = r6;
        r7 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r6 = "s\u0000";
        r0 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1753:
        r8[r7] = r6;
        r7 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\u0017\u0018\u0012SA\b\u0018\\D{\u0017\u0014\u0012[w\u001f\u001c\u0007^q\u000b\"\u0016El\n\u000f";
        r0 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x175f:
        r8[r7] = r6;
        r7 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\u0017\u0018\u0012SA\b\u0018\\^q:\u0018\u0001Eq\u0017";
        r0 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x176b:
        r8[r7] = r6;
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r6 = "\u007f\u0015\r\\Dj\n\u000f\u0016[\u007f\u0016\t\u0015Br\t\u000e\nY}\u0011\u0012\u0015^r\u0000R\u0016El\n\u000fS";
        r0 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1777:
        r8[r7] = r6;
        r7 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r6 = "x\u0010\u0011\u001fDg\u000b\u001e]S\u007f\u0011";
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1783:
        r8[r7] = r6;
        r7 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;
        r6 = "h\n\u0014\u0003\u0018p\u0010\u0011\u001fht\f\u0019";
        r0 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x178f:
        r8[r7] = r6;
        r7 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]`L,)6h[=)6eP$1,dJ*/2p[";
        r0 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x179b:
        r8[r7] = r6;
        r7 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,rF18!y_)\" cQ7<4r";
        r0 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17a7:
        r8[r7] = r6;
        r7 = 505; // 0x1f9 float:7.08E-43 double:2.495E-321;
        r6 = "s\n\b\u001dC{\u0001";
        r0 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17b3:
        r8[r7] = r6;
        r7 = 506; // 0x1fa float:7.09E-43 double:2.5E-321;
        r6 = "s\n\b\u001dC{\u0001\"\u0001X";
        r0 = 505; // 0x1f9 float:7.08E-43 double:2.495E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17bf:
        r8[r7] = r6;
        r7 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]`L,)6h[=)6eP$1,dJ*/2p[";
        r0 = 506; // 0x1fa float:7.09E-43 double:2.5E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17cb:
        r8[r7] = r6;
        r7 = 508; // 0x1fc float:7.12E-43 double:2.51E-321;
        r6 = "\u007f\u0015\r\\Sw\u0016\r\u001fVg\u0016\u0012\u0015Ci\u0004\u000f\u0016Rf\u0015\u0014\u0001RzJ\u0013\u001cCw\u0003\u0014\u0010Vj\f\u0012\u001d\u0017";
        r0 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17d7:
        r8[r7] = r6;
        r7 = 509; // 0x1fd float:7.13E-43 double:2.515E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0010E{\u0004\t\u0016Tw\u0015\u0015\u0016Eu\u0000\u0004";
        r0 = 508; // 0x1fc float:7.12E-43 double:2.51E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17e3:
        r8[r7] = r6;
        r7 = 510; // 0x1fe float:7.15E-43 double:2.52E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001\"\u001aS";
        r0 = 509; // 0x1fd float:7.13E-43 double:2.515E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17ef:
        r8[r7] = r6;
        r7 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;
        r6 = "/QMK\u0002+PLC\u0007.";
        r0 = 510; // 0x1fe float:7.15E-43 double:2.52E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x17fb:
        r8[r7] = r6;
        r7 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r6 = "/WNG\u0002(";
        r0 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1807:
        r8[r7] = r6;
        r7 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1813:
        r8[r7] = r6;
        r7 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        r6 = "B2";
        r0 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x181f:
        r8[r7] = r6;
        r7 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r6 = "n\u0010\u000e\u001bhp\u0004\u0010\u0016";
        r0 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x182b:
        r8[r7] = r6;
        r7 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r6 = "/QMK\u0002+PLC\u0007.";
        r0 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1837:
        r8[r7] = r6;
        r7 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r6 = "p\u0000\n^";
        r0 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1843:
        r8[r7] = r6;
        r7 = 518; // 0x206 float:7.26E-43 double:2.56E-321;
        r6 = "n\u0017\u0018\u0016Zn\u0011P";
        r0 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x184f:
        r8[r7] = r6;
        r7 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r6 = "\u007f\u0015\r\\Tl\u0000\u001c\u0007R1\t\u0012\u0014Qw\t\u0018\\Rl\u0017\u0012\u0001\u0017";
        r0 = 518; // 0x206 float:7.26E-43 double:2.56E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x185b:
        r8[r7] = r6;
        r7 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r6 = "R\n\u001a\u0000";
        r0 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1867:
        r8[r7] = r6;
        r7 = 521; // 0x209 float:7.3E-43 double:2.574E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000e\u001eD}\n\u0019\u0016[{\u000b\u001a\u0007_1\u0003\u001c\u001a[{\u0001";
        r0 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1873:
        r8[r7] = r6;
        r7 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0000Zm:\u001e\u001cS{:\u0011\u0016Yy\u0011\u0015";
        r0 = 521; // 0x209 float:7.3E-43 double:2.574E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x187f:
        r8[r7] = r6;
        r7 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x188b:
        r8[r7] = r6;
        r7 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r6 = "}\n\u0010]D{\u0006S\u0012Yz\u0017\u0012\u001aS0\u0004\r\u0003\u0019X\f\u0011\u0016cl\u0004\u0013\u0000Q{\u0017>\u001f^{\u000b\t";
        r0 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1897:
        r8[r7] = r6;
        r7 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r6 = "}\n\u0010]Ci\f\t\u0007RlK\u001c\u001dSl\n\u0014\u0017";
        r0 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18a3:
        r8[r7] = r6;
        r7 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r6 = "v\u0011\t\u0003D$JR\u0004@iK\n\u001bVj\u0016\u001c\u0003G0\u0006\u0012\u001e\u0018z\n\n\u001d[q\u0004\u0019\\";
        r0 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18af:
        r8[r7] = r6;
        r7 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Pq\n\u001a\u001fRo\u0010\u0014\u0010\\m\u0000\u001c\u0001Tv\u0007\u0012\u000b";
        r0 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18bb:
        r8[r7] = r6;
        r7 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r6 = "x\t\u0014\u0003Uq\u0004\u000f\u0017\u0019\u007f\u0015\r";
        r0 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18c7:
        r8[r7] = r6;
        r7 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r6 = "}\n\u0010]Cv\u0000\u0019\u0016TuK\u001c\u001dSl\n\u0014\u0017\u0019\u007f\u0015\r";
        r0 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18d3:
        r8[r7] = r6;
        r7 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u001f\u0005\u001aYyK\u001e\u001f^{\u000b\t]Vp\u0001\u000f\u001c^z";
        r0 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18df:
        r8[r7] = r6;
        r7 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r6 = "\u007f\u0015\r\\C{\t\u0011\\Xh\u0000\u000f\u0001^z\u0000";
        r0 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18eb:
        r8[r7] = r6;
        r7 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r6 = "}\n\u0010][yK\u000b\u0012[r\u0000S\u0003_q\u000b\u0018ATv\u0017\u0012\u001eR";
        r0 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x18f7:
        r8[r7] = r6;
        r7 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r6 = "}\n\u0010]Vp\u0001\u000f\u0016@m\r\b]Vp\u0001\u000f\u001c^zK\u000f\u0016Sz\f\t";
        r0 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1903:
        r8[r7] = r6;
        r7 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r6 = "}\n\u0010]Uk\b\r\u0007R}\rS\u0011Bs\u0015\u001a\u0012";
        r0 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x190f:
        r8[r7] = r6;
        r7 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V0 02~R";
        r0 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x191b:
        r8[r7] = r6;
        r7 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r6 = "v\u0011\t\u0003D$JR\u0004@iK\n\u001bVj\u0016\u001c\u0003G0\u0006\u0012\u001e\u0018z\n\n\u001d[q\u0004\u0019\\";
        r0 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1927:
        r8[r7] = r6;
        r7 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r6 = "}\n\u0010]Sl\n\r\u0011XfK\u001c\u001dSl\n\u0014\u0017";
        r0 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1933:
        r8[r7] = r6;
        r7 = 538; // 0x21a float:7.54E-43 double:2.66E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V0,3:cW$1,~P18=cM";
        r0 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x193f:
        r8[r7] = r6;
        r7 = 539; // 0x21b float:7.55E-43 double:2.663E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015";
        r0 = 538; // 0x21a float:7.54E-43 double:2.66E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x194b:
        r8[r7] = r6;
        r7 = 540; // 0x21c float:7.57E-43 double:2.67E-321;
        r6 = "q\u0017\u001a]Zq\u001f\u0014\u001f[\u007fK\u001b\u001aE{\u0003\u0012\u000b";
        r0 = 539; // 0x21b float:7.55E-43 double:2.663E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1957:
        r8[r7] = r6;
        r7 = 541; // 0x21d float:7.58E-43 double:2.673E-321;
        r6 = "}\n\u0010]Q\u007f\u0006\u0018\u0011Xq\u000eS\u001cE}\u0004";
        r0 = 540; // 0x21c float:7.57E-43 double:2.67E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1963:
        r8[r7] = r6;
        r7 = 542; // 0x21e float:7.6E-43 double:2.68E-321;
        r6 = "R\"8^{KWNC\u0007";
        r0 = 541; // 0x21d float:7.58E-43 double:2.673E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x196f:
        r8[r7] = r6;
        r7 = 543; // 0x21f float:7.61E-43 double:2.683E-321;
        r6 = "\u007f\u0015\r\\C{\t\u0011\\Yq\u000b\u0018";
        r0 = 542; // 0x21e float:7.6E-43 double:2.68E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x197b:
        r8[r7] = r6;
        r7 = 544; // 0x220 float:7.62E-43 double:2.69E-321;
        r6 = "\u007f\u0015\r\\C{\t\u0011\\Yq\u000b\u0018";
        r0 = 543; // 0x21f float:7.61E-43 double:2.683E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1987:
        r8[r7] = r6;
        r7 = 545; // 0x221 float:7.64E-43 double:2.693E-321;
        r6 = "}\n\u0010][y\u0000S\u001eRm\u0016\u001c\u0014R0\u0004\u001e\u0007^h\f\t\n\u0019}\n\u0010\u0003Xm\u0000S0Xs\u0015\u0012\u0000RS\u0000\u000e\u0000Vy\u0000<\u0010Cw\u0013\u0014\u0007N";
        r0 = 544; // 0x220 float:7.62E-43 double:2.69E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1993:
        r8[r7] = r6;
        r7 = 546; // 0x222 float:7.65E-43 double:2.7E-321;
        r6 = "s\n\u001f\u001a\u0019o\f\u000e\u0000\u0019n\t\b\u0001F";
        r0 = 545; // 0x221 float:7.64E-43 double:2.693E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x199f:
        r8[r7] = r6;
        r7 = 547; // 0x223 float:7.67E-43 double:2.703E-321;
        r6 = ">\u0019]";
        r0 = 546; // 0x222 float:7.65E-43 double:2.7E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19ab:
        r8[r7] = r6;
        r7 = 548; // 0x224 float:7.68E-43 double:2.707E-321;
        r6 = "}\n\u0010][w\u000b\u0016\u0016Sw\u000bS\u0012Yz\u0017\u0012\u001aS";
        r0 = 547; // 0x223 float:7.67E-43 double:2.703E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19b7:
        r8[r7] = r6;
        r7 = 549; // 0x225 float:7.7E-43 double:2.71E-321;
        r6 = "}\n\u0010]Zq\u0011\u0012\u0001Xr\u0004S\u0011[k\u0017S\u0000X}\f\u001c\u001fDv\u0004\u000f\u0016";
        r0 = 548; // 0x224 float:7.68E-43 double:2.707E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19c3:
        r8[r7] = r6;
        r7 = 550; // 0x226 float:7.71E-43 double:2.717E-321;
        r6 = "v\u0011\t\u0003D$JR\u0004_\u007f\u0011\u000e\u0012GnK\u001e\u001cZ1\u0001\u0011\\";
        r0 = 549; // 0x225 float:7.7E-43 double:2.71E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19cf:
        r8[r7] = r6;
        r7 = 551; // 0x227 float:7.72E-43 double:2.72E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Vn\u0015\u000e]Gr\u0010\u000e";
        r0 = 550; // 0x226 float:7.71E-43 double:2.717E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19db:
        r8[r7] = r6;
        r7 = 552; // 0x228 float:7.74E-43 double:2.727E-321;
        r6 = "}\n\u0010]Dn\u0017\u0014\u001dPn\u0004\u0019";
        r0 = 551; // 0x227 float:7.72E-43 double:2.72E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19e7:
        r8[r7] = r6;
        r7 = 553; // 0x229 float:7.75E-43 double:2.73E-321;
        r6 = "\u007f\u0015\r\\G\u007f\u0006\u0016\u0012P{\u0001\u0014\u001dC{\u000b\t\u0000\u0018z\u0000\u000b\u001aT{E";
        r0 = 552; // 0x228 float:7.74E-43 double:2.727E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19f3:
        r8[r7] = r6;
        r7 = 554; // 0x22a float:7.76E-43 double:2.737E-321;
        r6 = "}\n\u0010]Vp\u0001\u000f\u001c^zK\u001c\u0003GmK\t\u0012P";
        r0 = 553; // 0x229 float:7.75E-43 double:2.73E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x19ff:
        r8[r7] = r6;
        r7 = 555; // 0x22b float:7.78E-43 double:2.74E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Vn\u0015\u000e]Cl\u0004\u0013\u0000[\u007f\u0011\u0018";
        r0 = 554; // 0x22a float:7.76E-43 double:2.737E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a0b:
        r8[r7] = r6;
        r7 = 556; // 0x22c float:7.79E-43 double:2.747E-321;
        r6 = "|\t\b\u0016Cq\n\t\u001b";
        r0 = 555; // 0x22b float:7.78E-43 double:2.74E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a17:
        r8[r7] = r6;
        r7 = 557; // 0x22d float:7.8E-43 double:2.75E-321;
        r6 = "}\n\u0010]@q\u0017\u0011\u0017\u0019p\u0000\n\u0000G\u007f\u0015\u0018\u0001D";
        r0 = 556; // 0x22c float:7.79E-43 double:2.747E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a23:
        r8[r7] = r6;
        r7 = 558; // 0x22e float:7.82E-43 double:2.757E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK+:rI";
        r0 = 557; // 0x22d float:7.8E-43 double:2.75E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a2f:
        r8[r7] = r6;
        r7 = 559; // 0x22f float:7.83E-43 double:2.76E-321;
        r6 = "}\n\u0010]\\r\u001c\u0018]^s\u0000S\u001fVj\f\u0013";
        r0 = 558; // 0x22e float:7.82E-43 double:2.757E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a3b:
        r8[r7] = r6;
        r7 = 560; // 0x230 float:7.85E-43 double:2.767E-321;
        r6 = "}\n\u0010]_j\u0006S\u0000X}\f\u001c\u001fY{\u0011\n\u001cEuK\r\u001fBl\u000e";
        r0 = 559; // 0x22f float:7.83E-43 double:2.76E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a47:
        r8[r7] = r6;
        r7 = 561; // 0x231 float:7.86E-43 double:2.77E-321;
        r6 = "r\u0004S\u0017Eq\f\u0019]Fl";
        r0 = 560; // 0x230 float:7.85E-43 double:2.767E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a53:
        r8[r7] = r6;
        r7 = 562; // 0x232 float:7.88E-43 double:2.777E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Vn\u0015\u000e]Sq\u0006\u000e";
        r0 = 561; // 0x231 float:7.86E-43 double:2.77E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a5f:
        r8[r7] = r6;
        r7 = 563; // 0x233 float:7.89E-43 double:2.78E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V018+c";
        r0 = 562; // 0x232 float:7.88E-43 double:2.777E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a6b:
        r8[r7] = r6;
        r7 = 564; // 0x234 float:7.9E-43 double:2.787E-321;
        r6 = "r\u001c\u000e\u0016Dq\u0003\t]Vp\u0001\u001b\u0007G";
        r0 = 563; // 0x233 float:7.89E-43 double:2.78E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a77:
        r8[r7] = r6;
        r7 = 565; // 0x235 float:7.92E-43 double:2.79E-321;
        r6 = "}\rS\u0007R\u007f\b\t\u0012Du\u0016S\u0007Vm\u000e\u000e]G\u007f\f\u0019";
        r0 = 564; // 0x234 float:7.9E-43 double:2.787E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a83:
        r8[r7] = r6;
        r7 = 566; // 0x236 float:7.93E-43 double:2.796E-321;
        r6 = "v\u0011\t\u0003D$JR\u0004_\u007f\u0011\u000e\u0012GnK\u001e\u001cZ1\u0001\u0011\\";
        r0 = 565; // 0x235 float:7.92E-43 double:2.79E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a8f:
        r8[r7] = r6;
        r7 = 567; // 0x237 float:7.95E-43 double:2.8E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Vn\u0015\u000e]Z{\u0016\u000e\u0012Pw\u000b\u001a";
        r0 = 566; // 0x236 float:7.93E-43 double:2.796E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1a9b:
        r8[r7] = r6;
        r7 = 568; // 0x238 float:7.96E-43 double:2.806E-321;
        r6 = ">\u0019]";
        r0 = 567; // 0x237 float:7.95E-43 double:2.8E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1aa7:
        r8[r7] = r6;
        r7 = 569; // 0x239 float:7.97E-43 double:2.81E-321;
        r6 = "}\n\u0010]Q\u007f\u0006\u0018\u0011Xq\u000eS\u0018Vj\u0004\u0013\u0012";
        r0 = 568; // 0x238 float:7.96E-43 double:2.806E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1ab3:
        r8[r7] = r6;
        r7 = 570; // 0x23a float:7.99E-43 double:2.816E-321;
        r6 = "j\u0012S\u0012Yz\u0001\u0018\u0005\u0019\u007f\u0015\u0011\u0006Eu";
        r0 = 569; // 0x239 float:7.97E-43 double:2.81E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1abf:
        r8[r7] = r6;
        r7 = 571; // 0x23b float:8.0E-43 double:2.82E-321;
        r6 = "}\n\u0010]D{\u0006S\u0012Yz\u0017\u0012\u001aS0\u0004\r\u0003\u0019X\f\u0011\u0016dv\u0004\u000f\u0016tr\f\u0018\u001dC";
        r0 = 570; // 0x23a float:7.99E-43 double:2.816E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1acb:
        r8[r7] = r6;
        r7 = 572; // 0x23c float:8.02E-43 double:2.826E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V0 02~R";
        r0 = 571; // 0x23b float:8.0E-43 double:2.82E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1ad7:
        r8[r7] = r6;
        r7 = 573; // 0x23d float:8.03E-43 double:2.83E-321;
        r6 = "h\u000b\u0019]Vp\u0001\u000f\u001c^zH\u0019\u001aE1\b\u0010\u0000\u001am\b\u000e";
        r0 = 572; // 0x23c float:8.02E-43 double:2.826E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1ae3:
        r8[r7] = r6;
        r7 = 574; // 0x23e float:8.04E-43 double:2.836E-321;
        r6 = "t\u0015S\u001dVh\u0000\u000f]T\u007f\u0003\u0018";
        r0 = 573; // 0x23d float:8.03E-43 double:2.83E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1aef:
        r8[r7] = r6;
        r7 = 575; // 0x23f float:8.06E-43 double:2.84E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V018+c";
        r0 = 574; // 0x23e float:8.04E-43 double:2.836E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1afb:
        r8[r7] = r6;
        r7 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019\u007f\u0006\t\u001aXpK.6yZ";
        r0 = 575; // 0x23f float:8.06E-43 double:2.84E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b07:
        r8[r7] = r6;
        r7 = 577; // 0x241 float:8.09E-43 double:2.85E-321;
        r6 = "m\b\u000e,Uq\u0001\u0004";
        r0 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b13:
        r8[r7] = r6;
        r7 = 578; // 0x242 float:8.1E-43 double:2.856E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V018+c";
        r0 = 577; // 0x241 float:8.09E-43 double:2.85E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b1f:
        r8[r7] = r6;
        r7 = 579; // 0x243 float:8.11E-43 double:2.86E-321;
        r6 = "}\n\u0010]Cv\u0017\u0018\u0016U\u007f\u000b\u001c\u001dV0\u000b\u0012\u0007Rm";
        r0 = 578; // 0x242 float:8.1E-43 double:2.856E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b2b:
        r8[r7] = r6;
        r7 = 580; // 0x244 float:8.13E-43 double:2.866E-321;
        r6 = "}\n\u0010]D{\u0006S\u0012Yz\u0017\u0012\u001aS0\u0012\u0014\u0017P{\u0011\u001c\u0003G0\u0001\u0014\u001cC{\u000eS\u0000Z{\b\u0012";
        r0 = 579; // 0x243 float:8.11E-43 double:2.86E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b37:
        r8[r7] = r6;
        r7 = 581; // 0x245 float:8.14E-43 double:2.87E-321;
        r6 = "}\n\u0010]S\u007f\u0011\u001c\u0005^dK\u000e\u0007Vl\u0002\u001c\u0007R";
        r0 = 580; // 0x244 float:8.13E-43 double:2.866E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b43:
        r8[r7] = r6;
        r7 = 582; // 0x246 float:8.16E-43 double:2.875E-321;
        r6 = "\u007f\u0015\r\\C{\t\u0011S";
        r0 = 581; // 0x245 float:8.14E-43 double:2.87E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b4f:
        r8[r7] = r6;
        r7 = 583; // 0x247 float:8.17E-43 double:2.88E-321;
        r6 = "}\n\u0010]^z\u0000\u001c\u0000_q\u0012\u0018\u0001\u0019l\u0000\u001c\u0017^j\t\u001c\u0007RlK\r\u0001X";
        r0 = 582; // 0x246 float:8.16E-43 double:2.875E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b5b:
        r8[r7] = r6;
        r7 = 584; // 0x248 float:8.18E-43 double:2.885E-321;
        r6 = "\u0014o";
        r0 = 583; // 0x247 float:8.17E-43 double:2.88E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b67:
        r8[r7] = r6;
        r7 = 585; // 0x249 float:8.2E-43 double:2.89E-321;
        r6 = "}\n\u0010]Rh\u0000\u000f\u001dXj\u0000";
        r0 = 584; // 0x248 float:8.18E-43 double:2.885E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b73:
        r8[r7] = r6;
        r7 = 586; // 0x24a float:8.21E-43 double:2.895E-321;
        r6 = "}\n\u0010]C{\u000b\t\u001bUw\u0011S\u0019Br\f\u0018\u0007";
        r0 = 585; // 0x249 float:8.2E-43 double:2.89E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b7f:
        r8[r7] = r6;
        r7 = 587; // 0x24b float:8.23E-43 double:2.9E-321;
        r6 = "}\n\u0010]Pq\n\u001a\u001fR0\u0004\u0013\u0017Eq\f\u0019]Vn\u0015\u000e]Pq\n\u001a\u001fRh\n\u0014\u0010R";
        r0 = 586; // 0x24a float:8.21E-43 double:2.895E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b8b:
        r8[r7] = r6;
        r7 = 588; // 0x24c float:8.24E-43 double:2.905E-321;
        r6 = "j\u0000\u0005\u0007\u0018n\t\u001c\u001aY";
        r0 = 587; // 0x24b float:8.23E-43 double:2.9E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1b97:
        r8[r7] = r6;
        r7 = 589; // 0x24d float:8.25E-43 double:2.91E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u001aYj\u0000\u0013\u0007\u0019{\u001d\t\u0001V06(1}[&)";
        r0 = 588; // 0x24c float:8.24E-43 double:2.905E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1ba3:
        r8[r7] = r6;
        r7 = 590; // 0x24e float:8.27E-43 double:2.915E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000e\u001bXk\t\u0019\u0001Rx\u0017\u0018\u0000_|\u0017\u0012\u0012S}\u0004\u000e\u0007[w\u0016\t\u0000\u0018x\u0004\u0014\u001fRz";
        r0 = 589; // 0x24d float:8.25E-43 double:2.91E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1baf:
        r8[r7] = r6;
        r7 = 591; // 0x24f float:8.28E-43 double:2.92E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 590; // 0x24e float:8.27E-43 double:2.915E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1bbb:
        r8[r7] = r6;
        r7 = 592; // 0x250 float:8.3E-43 double:2.925E-321;
        r6 = "l\u0000\u001b\u0001Rm\r\"\u0011Eq\u0004\u0019\u0010Vm\u0011\"\u001f^m\u0011\u000e";
        r0 = 591; // 0x24f float:8.28E-43 double:2.92E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1bc7:
        r8[r7] = r6;
        r7 = 593; // 0x251 float:8.31E-43 double:2.93E-321;
        r6 = "m\u0000\u000f\u0005RlE\u001e\u001cYp\u0000\u001e\u0007^p\u0002";
        r0 = 592; // 0x250 float:8.3E-43 double:2.925E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1bd3:
        r8[r7] = r6;
        r7 = 594; // 0x252 float:8.32E-43 double:2.935E-321;
        r6 = "m\u0000\u000f\u0005RlE\u001e\u001cYp\u0000\u001e\u0007Rz";
        r0 = 593; // 0x251 float:8.31E-43 double:2.93E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1bdf:
        r8[r7] = r6;
        r7 = 595; // 0x253 float:8.34E-43 double:2.94E-321;
        r6 = "{\u001d\r\u001aEg:\u0014\u001dhm\u0000\u001e\u001cYz\u0016";
        r0 = 594; // 0x252 float:8.32E-43 double:2.935E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1beb:
        r8[r7] = r6;
        r7 = 596; // 0x254 float:8.35E-43 double:2.945E-321;
        r6 = "m\u0000\u000f\u0005RlE\u0019\u001aD}\n\u0013\u001dR}\u0011\u0018\u0017";
        r0 = 595; // 0x253 float:8.34E-43 double:2.94E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1bf7:
        r8[r7] = r6;
        r7 = 597; // 0x255 float:8.37E-43 double:2.95E-321;
        r6 = "\u007f\u0015\r\\Dv\u0004\u000f\u0016\u0018s\u0000\u0019\u001aV3\u0001\u0012\u0016D3\u000b\u0012\u0007\u001a{\u001d\u0014\u0000C";
        r0 = 596; // 0x254 float:8.35E-43 double:2.945E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c03:
        r8[r7] = r6;
        r7 = 598; // 0x256 float:8.38E-43 double:2.955E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007Ew\u000b\u001a\u0007Xp\u0000R\u001a[r\u0000\u001a\u0012[m\u0011\u001c\u0007R>";
        r0 = 597; // 0x255 float:8.37E-43 double:2.95E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c0f:
        r8[r7] = r6;
        r7 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        r6 = "x\f\u0011\u0016";
        r0 = 598; // 0x256 float:8.38E-43 double:2.955E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c1b:
        r8[r7] = r6;
        r7 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007Ew\u000b\u001a\u0007Xp\u0000R\u0010[q\u0016\u0018\u0000Cl\u0000\u001c\u001e\u0017";
        r0 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c27:
        r8[r7] = r6;
        r7 = 601; // 0x259 float:8.42E-43 double:2.97E-321;
        r6 = "\u007f\u0010\u0019\u001aX";
        r0 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c33:
        r8[r7] = r6;
        r7 = 602; // 0x25a float:8.44E-43 double:2.974E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007Ew\u000b\u001a\u0007Xp\u0000R\u0010[q\u0016\u0018\u0000Cl\u0000\u001c\u001e\u0017";
        r0 = 601; // 0x259 float:8.42E-43 double:2.97E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c3f:
        r8[r7] = r6;
        r7 = 603; // 0x25b float:8.45E-43 double:2.98E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007Ew\u000b\u001a\u0007Xp\u0000R\u0010[q\u0016\u0018\u0000Cl\u0000\u001c\u001e\u0017";
        r0 = 602; // 0x25a float:8.44E-43 double:2.974E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c4b:
        r8[r7] = r6;
        r7 = 604; // 0x25c float:8.46E-43 double:2.984E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007Ew\u000b\u001a\u0007Xp\u0000R\u0010[q\u0016\u0018\u0000Cl\u0000\u001c\u001e\u0017";
        r0 = 603; // 0x25b float:8.45E-43 double:2.98E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c57:
        r8[r7] = r6;
        r7 = 605; // 0x25d float:8.48E-43 double:2.99E-321;
        r6 = "\u007f\u0015\r\\Dj\u0004\u000f\u0007Ew\u000b\u001a\u0007Xp\u0000R\u0015^r\u0000\u0013\u001cCx\n\b\u001dS>";
        r0 = 604; // 0x25c float:8.46E-43 double:2.984E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c63:
        r8[r7] = r6;
        r7 = 606; // 0x25e float:8.49E-43 double:2.994E-321;
        r6 = "\u007f\u0015\r\\E{\b\u0012\u0005RN\u0017\u0012\u0014E{\u0016\u000e Gw\u000b\u0013\u0016E1\f\u001a\u001dXl\u0000]\u0017^\u007f\t\u0012\u0014cq\u0004\u000e\u0007\u0017#X]\u001dBr\t";
        r0 = 605; // 0x25d float:8.48E-43 double:2.99E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c6f:
        r8[r7] = r6;
        r7 = 607; // 0x25f float:8.5E-43 double:3.0E-321;
        r6 = "z\f\u001c\u001fXy1\u0012\u0012DjE@N\u0017p\u0010\u0011\u001f";
        r0 = 606; // 0x25e float:8.49E-43 double:2.994E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c7b:
        r8[r7] = r6;
        r7 = 608; // 0x260 float:8.52E-43 double:3.004E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000f\u0016P\u007f\u0006\u001e\u001cBp\u0011\u000e\u0007Vj\u0000R\u0015Vw\t\u0018\u0017";
        r0 = 607; // 0x25f float:8.5E-43 double:3.0E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c87:
        r8[r7] = r6;
        r7 = 609; // 0x261 float:8.53E-43 double:3.01E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 608; // 0x260 float:8.52E-43 double:3.004E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c93:
        r8[r7] = r6;
        r7 = 610; // 0x262 float:8.55E-43 double:3.014E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0012T}\n\b\u001dCA\u0016\t\u0012C{";
        r0 = 609; // 0x261 float:8.53E-43 double:3.01E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1c9f:
        r8[r7] = r6;
        r7 = 611; // 0x263 float:8.56E-43 double:3.02E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 610; // 0x262 float:8.55E-43 double:3.014E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1cab:
        r8[r7] = r6;
        r7 = 612; // 0x264 float:8.58E-43 double:3.024E-321;
        r6 = "l\u0000\u001a\u001aDj\u0017\u001c\u0007^q\u000b\"\u0019^z";
        r0 = 611; // 0x263 float:8.56E-43 double:3.02E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1cb7:
        r8[r7] = r6;
        r7 = 613; // 0x265 float:8.59E-43 double:3.03E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000f\u0016Pt\f\u0019\\Q\u007f\f\u0011\u0016S";
        r0 = 612; // 0x264 float:8.58E-43 double:3.024E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1cc3:
        r8[r7] = r6;
        r7 = 614; // 0x266 float:8.6E-43 double:3.034E-321;
        r6 = ">\t\u0012\u0010Vr_]";
        r0 = 613; // 0x265 float:8.59E-43 double:3.03E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1ccf:
        r8[r7] = r6;
        r7 = 615; // 0x267 float:8.62E-43 double:3.04E-321;
        r6 = "\u007f\u0015\r\\Os\u0015\r\\E{\u0006\u000b\\Fl:\t\u0016Es\f\u0013\u0012C{E\u000f\u0016Th_]";
        r0 = 614; // 0x266 float:8.6E-43 double:3.034E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1cdb:
        r8[r7] = r6;
        r7 = 616; // 0x268 float:8.63E-43 double:3.043E-321;
        r6 = ">\u0006\u0011\u0016Vl_]";
        r0 = 615; // 0x267 float:8.62E-43 double:3.04E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1ce7:
        r8[r7] = r6;
        r7 = 617; // 0x269 float:8.65E-43 double:3.05E-321;
        r6 = "i\u0000\u001f";
        r0 = 616; // 0x268 float:8.63E-43 double:3.043E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1cf3:
        r8[r7] = r6;
        r7 = 618; // 0x26a float:8.66E-43 double:3.053E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]e[$9,tQ+)2tJ6";
        r0 = 617; // 0x269 float:8.65E-43 double:3.05E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1cff:
        r8[r7] = r6;
        r7 = 619; // 0x26b float:8.67E-43 double:3.06E-321;
        r6 = "\u007f\u000b\u0019\u0001Xw\u0001S\u0003Rl\b\u0014\u0000Dw\n\u0013]`L,)6h]*3'v]1.";
        r0 = 618; // 0x26a float:8.66E-43 double:3.053E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d0b:
        r8[r7] = r6;
        r7 = 620; // 0x26c float:8.69E-43 double:3.063E-321;
        r6 = "\u007f\u0015\r\\_\u007f\u000b\u0019\u001fR}\t\u0012\u0010\\i\u0017\u0012\u001dP";
        r0 = 619; // 0x26b float:8.67E-43 double:3.06E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d17:
        r8[r7] = r6;
        r7 = 621; // 0x26d float:8.7E-43 double:3.07E-321;
        r6 = "\u007f\u0015\r\\E{\u0004\u0019\u001fVm\u0011\u001b\u0006[r\u0016\u0004\u001dTx\u0017\u0012\u001eQw\t\u0018\\^q\u0000\u000f\u0001XlE";
        r0 = 620; // 0x26c float:8.69E-43 double:3.063E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d23:
        r8[r7] = r6;
        r7 = 622; // 0x26e float:8.72E-43 double:3.073E-321;
        r6 = "\u007f\u0015\r\\E{\u0004\u0019\u001fVm\u0011\u001b\u0006[r\u0016\u0004\u001dTx\u0017\u0012\u001eQw\t\u0018\\^q\u0000\u000f\u0001XlE";
        r0 = 621; // 0x26d float:8.7E-43 double:3.07E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d2f:
        r8[r7] = r6;
        r7 = 623; // 0x26f float:8.73E-43 double:3.08E-321;
        r6 = "\u007f\u0015\r\\E{\u0004\u0019\u001fVm\u0011\u001b\u0006[r\u0016\u0004\u001dTx\u0017\u0012\u001eQw\t\u0018\\Q\u007f\f\u0011S";
        r0 = 622; // 0x26e float:8.72E-43 double:3.073E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d3b:
        r8[r7] = r6;
        r7 = 624; // 0x270 float:8.74E-43 double:3.083E-321;
        r6 = "\u007f\u0015\r\\E{\u0004\u0019\u001fVm\u0011\u001b\u0006[r\u0016\u0004\u001dTx\u0017\u0012\u001eQw\t\u0018\\^q\u0000\u000f\u0001XlE";
        r0 = 623; // 0x26f float:8.73E-43 double:3.08E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d47:
        r8[r7] = r6;
        r7 = 625; // 0x271 float:8.76E-43 double:3.09E-321;
        r6 = "x\u0010\u0011\u001fDg\u000b\u001e]S\u007f\u0011";
        r0 = 624; // 0x270 float:8.74E-43 double:3.083E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d53:
        r8[r7] = r6;
        r7 = 626; // 0x272 float:8.77E-43 double:3.093E-321;
        r6 = "\u007f\u0015\r\\Tv\u0000\u001e\u0018^x\u0017\u0018\u001eXh\u0004\u001f\u001fR1\u0000\u000f\u0001XlE";
        r0 = 625; // 0x271 float:8.76E-43 double:3.09E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d5f:
        r8[r7] = r6;
        r7 = 627; // 0x273 float:8.79E-43 double:3.1E-321;
        r6 = "\u007f\u0015\r\\D{\u000b\u0019\u0014Rj\u0011\u0012\u0000Dj\u0004\t\u0016";
        r0 = 626; // 0x272 float:8.77E-43 double:3.093E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d6b:
        r8[r7] = r6;
        r7 = 628; // 0x274 float:8.8E-43 double:3.103E-321;
        r6 = "m\u0015\u001c\u001eh|\u0004\u0013\u001dRz";
        r0 = 627; // 0x273 float:8.79E-43 double:3.1E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d77:
        r8[r7] = r6;
        r7 = 629; // 0x275 float:8.81E-43 double:3.11E-321;
        r6 = "m\u0015\u001c\u001eh|\u0004\u0013\u001dRz:\u0018\u000bGw\u0017\u0004,Cw\b\u0018\u0000C\u007f\b\r";
        r0 = 628; // 0x274 float:8.8E-43 double:3.103E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d83:
        r8[r7] = r6;
        r7 = 630; // 0x276 float:8.83E-43 double:3.113E-321;
        r6 = "}\n\u0010]@v\u0004\t\u0000Vn\u0015\"\u0003E{\u0003\u0018\u0001Rp\u0006\u0018\u0000";
        r0 = 629; // 0x275 float:8.81E-43 double:3.11E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d8f:
        r8[r7] = r6;
        r7 = 631; // 0x277 float:8.84E-43 double:3.12E-321;
        r6 = "\u007f\u0015\r\\D{\u0011\u000e\u0003Vs\u0007\u001c\u001dY{\u0001R\u0015Vw\t\u0018\u0017";
        r0 = 630; // 0x276 float:8.83E-43 double:3.113E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1d9b:
        r8[r7] = r6;
        r7 = 632; // 0x278 float:8.86E-43 double:3.122E-321;
        r6 = "w\u000b\u000b\u0012[w\u0001\"\u001dBs\u0007\u0018\u0001D";
        r0 = 631; // 0x277 float:8.84E-43 double:3.12E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1da7:
        r8[r7] = r6;
        r7 = 633; // 0x279 float:8.87E-43 double:3.127E-321;
        r6 = "I\r\u001c\u0007D_\u0015\r";
        r0 = 632; // 0x278 float:8.86E-43 double:3.122E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1db3:
        r8[r7] = r6;
        r7 = 634; // 0x27a float:8.88E-43 double:3.13E-321;
        r6 = "_\u0016\u0004\u001dTN\t\u001c\nRl";
        r0 = 633; // 0x279 float:8.87E-43 double:3.127E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1dbf:
        r8[r7] = r6;
        r7 = 635; // 0x27b float:8.9E-43 double:3.137E-321;
        r6 = "W\u000b\u000b\u0012[w\u0001]\u0011Bw\t\u0019SCg\u0015\u0018";
        r0 = 634; // 0x27a float:8.88E-43 double:3.13E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1dcb:
        r8[r7] = r6;
        r7 = 636; // 0x27c float:8.91E-43 double:3.14E-321;
        r6 = "W\u000b\u000b\u0012[w\u0001]\u0017^m\u0011\u000f\u001aUk\u0011\u0014\u001cY>\u0003\u0011\u0012Aq\u0017";
        r0 = 635; // 0x27b float:8.9E-43 double:3.137E-321;
        r8 = r9;
        goto L_0x0011;
    L_0x1dd7:
        r8[r7] = r6;
        bb = r9;
        r0 = new org.spongycastle.jce.provider.BouncyCastleProvider;
        r0.<init>();
        java.security.Security.insertProviderAt(r0, r3);
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        b = r0;
        r0 = new com.whatsapp.rp;
        r0.<init>();
        aA = r0;
        r0 = new android.os.Handler;
        r6 = android.os.Looper.getMainLooper();
        r0.<init>(r6);
        aZ = r0;
        S = r2;
        r0 = new java.io.File;
        r6 = android.os.Environment.getExternalStorageDirectory();
        r7 = bb;
        r8 = 633; // 0x279 float:8.87E-43 double:3.127E-321;
        r7 = r7[r8];
        r0.<init>(r6, r7);
        a3 = r0;
        r0 = "l\u0000\u0011\u0016Vm\u0000";
        r0 = z(r0);
        r6 = z(r0);
        r0 = r6.hashCode();	 Catch:{ NumberFormatException -> 0x1e6e }
        switch(r0) {
            case 3020272: goto L_0x1e7f;
            case 92909918: goto L_0x1e70;
            case 95458899: goto L_0x1e55;
            case 1090594823: goto L_0x1e8e;
            default: goto L_0x1e21;
        };
    L_0x1e21:
        r0 = r1;
    L_0x1e22:
        switch(r0) {
            case 0: goto L_0x1e31;
            case 1: goto L_0x1e9f;
            case 2: goto L_0x1ea2;
            case 3: goto L_0x1ea5;
            default: goto L_0x1e25;
        };
    L_0x1e25:
        r0 = new java.lang.IllegalStateException;
        r1 = bb;
        r2 = 635; // 0x27b float:8.9E-43 double:3.137E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x1e31:
        r0 = 3;
        am = r0;	 Catch:{ NumberFormatException -> 0x1e9d }
    L_0x1e34:
        r0 = "i\u0000\u001f\u0000^j\u0000";
        r0 = z(r0);
        r7 = z(r0);
        r0 = r7.hashCode();	 Catch:{ NumberFormatException -> 0x1eb6 }
        switch(r0) {
            case -1414265340: goto L_0x1ed3;
            case 3443508: goto L_0x1eb8;
            case 344200471: goto L_0x1ec5;
            case 1224335515: goto L_0x1ea8;
            default: goto L_0x1e46;
        };
    L_0x1e46:
        switch(r1) {
            case 0: goto L_0x1ee1;
            case 1: goto L_0x2035;
            case 2: goto L_0x2039;
            case 3: goto L_0x203d;
            default: goto L_0x1e49;
        };
    L_0x1e49:
        r0 = new java.lang.IllegalStateException;
        r1 = bb;
        r2 = 636; // 0x27c float:8.91E-43 double:3.14E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x1e55:
        r0 = "z\u0000\u001f\u0006P";
        r7 = r6;
        r6 = r0;
        r0 = r1;
    L_0x1e5b:
        r6 = z(r6);
        r6 = z(r6);
        switch(r0) {
            case 0: goto L_0x1e77;
            case 1: goto L_0x1e86;
            case 2: goto L_0x1e95;
            case 3: goto L_0x1eae;
            case 4: goto L_0x1ebd;
            case 5: goto L_0x1eca;
            case 6: goto L_0x1ed8;
            default: goto L_0x1e66;
        };
    L_0x1e66:
        r0 = r7.equals(r6);	 Catch:{ NumberFormatException -> 0x1e6e }
        if (r0 == 0) goto L_0x1e21;
    L_0x1e6c:
        r0 = r2;
        goto L_0x1e22;
    L_0x1e6e:
        r0 = move-exception;
        throw r0;
    L_0x1e70:
        r0 = "\u007f\t\r\u001bV";
        r7 = r6;
        r6 = r0;
        r0 = r2;
        goto L_0x1e5b;
    L_0x1e77:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1e21;
    L_0x1e7d:
        r0 = r3;
        goto L_0x1e22;
    L_0x1e7f:
        r0 = "|\u0000\t\u0012";
        r7 = r6;
        r6 = r0;
        r0 = r3;
        goto L_0x1e5b;
    L_0x1e86:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1e21;
    L_0x1e8c:
        r0 = r4;
        goto L_0x1e22;
    L_0x1e8e:
        r0 = "l\u0000\u0011\u0016Vm\u0000";
        r7 = r6;
        r6 = r0;
        r0 = r4;
        goto L_0x1e5b;
    L_0x1e95:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1e21;
    L_0x1e9b:
        r0 = r5;
        goto L_0x1e22;
    L_0x1e9d:
        r0 = move-exception;
        throw r0;
    L_0x1e9f:
        am = r4;
        goto L_0x1e34;
    L_0x1ea2:
        am = r3;
        goto L_0x1e34;
    L_0x1ea5:
        am = r2;
        goto L_0x1e34;
    L_0x1ea8:
        r0 = "i\u0000\u001f\u0000^j\u0000";
        r6 = r0;
        r0 = r5;
        goto L_0x1e5b;
    L_0x1eae:
        r0 = r7.equals(r6);	 Catch:{ NumberFormatException -> 0x1eb6 }
        if (r0 == 0) goto L_0x1e46;
    L_0x1eb4:
        r1 = r2;
        goto L_0x1e46;
    L_0x1eb6:
        r0 = move-exception;
        throw r0;
    L_0x1eb8:
        r6 = "n\t\u001c\n";
        r0 = 4;
        goto L_0x1e5b;
    L_0x1ebd:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1e46;
    L_0x1ec3:
        r1 = r3;
        goto L_0x1e46;
    L_0x1ec5:
        r6 = "\u007f\u0010\t\u001cZ\u007f\u0011\u0014\u001cY";
        r0 = 5;
        goto L_0x1e5b;
    L_0x1eca:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1e46;
    L_0x1ed0:
        r1 = r4;
        goto L_0x1e46;
    L_0x1ed3:
        r6 = "\u007f\b\u001c\tXp";
        r0 = 6;
        goto L_0x1e5b;
    L_0x1ed8:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1e46;
    L_0x1ede:
        r1 = r5;
        goto L_0x1e46;
    L_0x1ee1:
        r0 = 1;
        j = r0;	 Catch:{ NumberFormatException -> 0x2033 }
    L_0x1ee4:
        G = r2;
        y = r2;
        l = r2;
        r0 = new com.whatsapp.qm;
        r0.<init>();
        ab = r0;
        U = r2;
        r0 = 0;
        Y = r0;
        h = r5;
        aC = r2;
        u = r3;
        Z = r2;
        r0 = "";
        r0 = android.net.Uri.parse(r0);
        ap = r0;
        r0 = -1;
        aP = r0;
        an = r2;
        x = r2;
        r0 = 0;
        a0 = r0;
        ac = r2;
        r0 = new com.whatsapp.util.c9;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0.<init>(r4);
        O = r0;
        r0 = new com.whatsapp.util.c9;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0.<init>(r4);
        Q = r0;
        r0 = new com.whatsapp.util.c9;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0.<init>(r4);
        a2 = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        k = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        a6 = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        aQ = r0;
        aJ = r2;
        r0 = new com.whatsapp.a5j;
        r0.<init>();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);
        r0 = m();
        P = r0;
        D = r2;
        ax = r2;
        ah = r2;
        r0 = new com.whatsapp.util.ab;
        r0.<init>(r3);
        X = r0;
        aG = r2;
        aD = r2;
        ao = r2;
        r0 = 0;
        aU = r0;
        z = r2;
        aq = r2;
        r0 = new java.util.ArrayList;
        r0.<init>();
        A = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        aw = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        aY = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        ae = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        ar = r0;
        r0 = new com.whatsapp.azu;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        F = r0;
        r0 = new com.whatsapp.u;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        aB = r0;
        r0 = new com.whatsapp.azj;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        af = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        a7 = r0;
        r0 = new com.whatsapp.aog;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        L = r0;
        r0 = new java.util.concurrent.atomic.AtomicInteger;
        r0.<init>();
        aM = r0;
        r0 = new java.util.concurrent.atomic.AtomicInteger;
        r0.<init>();
        ag = r0;
        r0 = new java.util.concurrent.locks.ReentrantLock;
        r0.<init>();
        aE = r0;
        r0 = aE;
        r0 = r0.newCondition();
        aj = r0;
        r0 = 0;
        p = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        C = r0;
        r0 = new android.media.AsyncPlayer;
        r1 = bb;
        r2 = 634; // 0x27a float:8.88E-43 double:3.13E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        g = r0;
        r0 = new android.os.Handler;
        r1 = android.os.Looper.getMainLooper();
        r2 = new com.whatsapp.d;
        r2.<init>();
        r0.<init>(r1, r2);
        I = r0;
        r0 = new android.os.Handler;
        r1 = android.os.Looper.getMainLooper();
        r2 = new com.whatsapp.fw;
        r2.<init>();
        r0.<init>(r1, r2);
        aT = r0;
        r0 = new com.whatsapp.n;
        r0.<init>();
        m = r0;
        r0 = new com.whatsapp.al1;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        i = r0;
        r0 = 0;
        f = r0;
        return;
    L_0x2033:
        r0 = move-exception;
        throw r0;
    L_0x2035:
        j = r2;
        goto L_0x1ee4;
    L_0x2039:
        j = r5;
        goto L_0x1ee4;
    L_0x203d:
        j = r4;
        goto L_0x1ee4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.<clinit>():void");
    }

    public static boolean C(String str) {
        try {
            if (!qm.i(str)) {
                if (!n()) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean a1() {
        try {
            return !av;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(com.whatsapp.protocol.co coVar, int[] iArr) {
        M.b(co.a(coVar, iArr));
    }

    public static void a(boolean z, boolean z2) {
        b(z, z2, ac, false);
    }

    public static void c(long j) {
        aP = d(j);
    }

    public static void e(boolean z) {
        try {
            int i;
            nf.a(k.CHATS_ALL_ARCHIVE);
            aK.a(z);
            if (z) {
                i = 3;
            } else {
                i = 4;
            }
            a(i, null, 0, 0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void j(com.whatsapp.protocol.co coVar) {
        boolean z = DialogToastActivity.f;
        Log.i(bb[29]);
        auv.a();
        Iterator it = ae.iterator();
        while (it.hasNext()) {
            ((aau) it.next()).a(coVar);
            if (z) {
                return;
            }
        }
    }

    public static void a(Collection collection) {
        boolean z = DialogToastActivity.f;
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((tm) it.next()).a(collection);
            if (z) {
                return;
            }
        }
    }

    public void e(List list) {
        if (list != null) {
            Editor edit = z().getSharedPreferences(bb[470], 0).edit();
            try {
                edit.putString(bb[469], TextUtils.join(",", list));
                if (!edit.commit()) {
                    Log.e(bb[468]);
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    public static void a(by byVar, int i, int i2) {
        if (byVar == null) {
            byVar = an();
        }
        if (byVar != null) {
            try {
                byVar.a(i, i2);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        auv.a(bb[37]);
        a(z(), i2, 0);
    }

    public static void a(f4 f4Var) {
        try {
            if (c) {
                Log.i(bb[53] + f4Var.a);
                M.b(co.a(f4Var));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void g(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[398]);
                M.b(co.e(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static long ak() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static long o(com.whatsapp.protocol.co coVar) {
        return b(coVar.b);
    }

    public static int t(Context context) {
        return context.getSharedPreferences(bb[358], 0).getInt(bb[359], 0);
    }

    public static void a(int i, String str) {
        a(i, str, null);
    }

    public static void d(List list) {
        a(list, null);
    }

    public static void f(String str) {
        a(new aa9(str));
    }

    public static void e(Context context) {
        try {
            if (ay != null) {
                Log.i(bb[420]);
                context.bindService(new Intent(context, MessageService.class), m, 1);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static long av() {
        try {
            return V != 0 ? V + (SystemClock.elapsedRealtime() - a4) : System.currentTimeMillis() - T;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean D() {
        boolean z = DialogToastActivity.f;
        Account[] accounts = AccountManager.get(z()).getAccounts();
        int length = accounts.length;
        int i = 0;
        while (i < length) {
            Account account = accounts[i];
            try {
                if (!account.type.equals(bb[374])) {
                    if (ContentResolver.isSyncActive(account, bb[376])) {
                        try {
                            if (am >= 1 && !z) {
                                return true;
                            }
                            try {
                                Log.i(bb[375] + account.type);
                                return true;
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                }
                i++;
                if (z) {
                    break;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.ct r4) {
        /*
        r0 = r4.d;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x000e;
    L_0x0008:
        r0 = r4.d;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r1 = r4.b;
        r2 = r4.e;
        r3 = r4.c;
        b(r1, r2, r0, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.ct):void");
    }

    static boolean b(boolean z) {
        x = z;
        return z;
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, boolean z4, EnumSet enumSet, File file, String str) {
        NetworkInfo activeNetworkInfo = ad.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            try {
                if (activeNetworkInfo.isRoaming() && !z2) {
                    try {
                        Log.i(bb[249]);
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            }
        }
        try {
            bq.a(new mg(z4, x(context), z, z2, z3, enumSet, file, str));
        } catch (Throwable e3) {
            Log.b(bb[248], e3);
        }
    }

    static MessageService a(MessageService messageService) {
        M = messageService;
        return messageService;
    }

    private void a6() {
        z().registerReceiver(new 43(this), new IntentFilter(bb[171]));
        z().registerReceiver(new 44(this), new IntentFilter(bb[172]), bb[170], null);
        new HeadsetPlugBroadcastReceiver().a(z());
        new ShutdownBroadcastReceiver().a(z());
        this.aN.a(z());
        this.aN.c(z());
        z().registerReceiver(new 45(this), new IntentFilter(bb[167]), bb[173], null);
        z().registerReceiver(new 46(this), new IntentFilter(bb[169]), bb[164], null);
        z().registerReceiver(this.aS, new IntentFilter(bb[168]), bb[165], null);
        new WebSession$ReNotifyBroadcastReceiver().a(z());
        z().registerReceiver(new 47(this), new IntentFilter(bb[166]));
    }

    static void j() {
        PreferenceManager.setDefaultValues(z(), 2131099654, true);
        PreferenceManager.setDefaultValues(z(), 2131099655, true);
        PreferenceManager.setDefaultValues(z(), 2131099656, true);
        PreferenceManager.setDefaultValues(z(), 2131099657, true);
        PreferenceManager.setDefaultValues(z(), 2131099658, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, java.lang.String r5, long r6) {
        /*
        r0 = bb;
        r1 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r0 = r0[r1];
        r1 = 0;
        r0 = r4.getSharedPreferences(r0, r1);
        r0 = r0.edit();
        if (r5 == 0) goto L_0x0036;
    L_0x0011:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x004f }
        r2 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x004f }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x004f }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x004f }
        r2 = r2.append(r5);	 Catch:{ NumberFormatException -> 0x004f }
        r3 = "|";
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x004f }
        r2 = r2.append(r6);	 Catch:{ NumberFormatException -> 0x004f }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x004f }
        r0.putString(r1, r2);	 Catch:{ NumberFormatException -> 0x004f }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x004f }
        if (r1 == 0) goto L_0x003f;
    L_0x0036:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x004f }
        r2 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x004f }
        r0.remove(r1);	 Catch:{ NumberFormatException -> 0x004f }
    L_0x003f:
        r0 = r0.commit();	 Catch:{ NumberFormatException -> 0x0051 }
        if (r0 != 0) goto L_0x004e;
    L_0x0045:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0051 }
        r1 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0051 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0051 }
    L_0x004e:
        return;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.content.Context, java.lang.String, long):void");
    }

    private static void a(Context context, String str, Location location, int i) {
        l5 d = qa.d(str);
        com.whatsapp.protocol.co coVar = new com.whatsapp.protocol.co(d.p, (byte[]) null, new MediaData());
        try {
            coVar.b = av();
            coVar.u = 1;
            coVar.c = (byte) 5;
            coVar.d = 1;
            if (location != null) {
                coVar.m = location.getLatitude();
                coVar.l = location.getLongitude();
            }
            b(coVar, d);
            aK.a(coVar, 2);
            bq.a(new aa7(context.getContentResolver(), str));
            AsyncTask xoVar = new xo(context, coVar);
            xoVar.e = i;
            bq.a(xoVar, new Void[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static long d(long j) {
        Closeable objectOutputStream;
        IOException e;
        Throwable th;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(z().getFilesDir(), bb[501])));
            try {
                objectOutputStream.writeLong(j);
                ao.a(objectOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    Log.e(bb[500] + e.toString());
                    ao.a(objectOutputStream);
                    return j;
                } catch (Throwable th2) {
                    th = th2;
                    ao.a(objectOutputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            objectOutputStream = null;
            Log.e(bb[500] + e.toString());
            ao.a(objectOutputStream);
            return j;
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            ao.a(objectOutputStream);
            throw th;
        }
        return j;
    }

    private static void a(Context context, boolean z, long j) {
        Editor edit = context.getSharedPreferences(bb[630], 0).edit();
        try {
            edit.putBoolean(bb[628], z);
            edit.putLong(bb[629], j);
            if (!edit.commit()) {
                Log.e(bb[631]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean aC() {
        try {
            return pg.a(z()) > 0;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void bf() {
        f(false);
    }

    public static void aX() {
        try {
            if (c) {
                Log.i(bb[251]);
                M.b(co.i());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void i(boolean z) {
        u = z;
        b(co.c(z), null);
    }

    static boolean S() {
        return D();
    }

    private static void a0() {
        boolean z = DialogToastActivity.f;
        synchronized (b) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b);
            Log.i(bb[223] + linkedHashMap.size());
            b.clear();
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            b((Message) entry.getValue(), (String) entry.getKey());
            if (z) {
                return;
            }
        }
    }

    public static void b(String str, int i) {
        try {
            if (!l5.e(str)) {
                try {
                    if (qm.i(str)) {
                        a(as.b(str));
                    }
                    try {
                        if (!as.d(str)) {
                            boolean a = a1.a(str);
                            try {
                                int i2;
                                Handler handler = L;
                                if (a) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                handler.obtainMessage(0, i2, i, A(str)).sendToTarget();
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static HashSet Z() {
        ObjectInputStream objectInputStream;
        Throwable e;
        File file = new File(z().getFilesDir(), bb[632]);
        try {
            if (file.exists() && file.canRead()) {
                ObjectInputStream objectInputStream2 = null;
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        HashSet hashSet = (HashSet) objectInputStream.readObject();
                        if (objectInputStream == null) {
                            return hashSet;
                        }
                        try {
                            objectInputStream.close();
                            return hashSet;
                        } catch (Throwable e2) {
                            Log.a(e2);
                            return hashSet;
                        } catch (ClassNotFoundException e3) {
                            throw e3;
                        }
                    } catch (ClassNotFoundException e4) {
                        e = e4;
                        objectInputStream2 = objectInputStream;
                        try {
                            Log.a(e);
                            if (objectInputStream2 != null) {
                                try {
                                    objectInputStream2.close();
                                } catch (Throwable e5) {
                                    Log.a(e5);
                                }
                            }
                            return new HashSet();
                        } catch (Throwable th) {
                            e5 = th;
                            if (objectInputStream2 != null) {
                                try {
                                    objectInputStream2.close();
                                } catch (Throwable e22) {
                                    Log.a(e22);
                                } catch (ClassNotFoundException e32) {
                                    throw e32;
                                }
                            }
                            throw e5;
                        }
                    } catch (IOException e6) {
                        e5 = e6;
                        objectInputStream2 = objectInputStream;
                        Log.a(e5);
                        if (objectInputStream2 != null) {
                            objectInputStream2.close();
                        }
                        return new HashSet();
                    } catch (Throwable th2) {
                        e5 = th2;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            objectInputStream2.close();
                        }
                        throw e5;
                    }
                } catch (ClassNotFoundException e7) {
                    e5 = e7;
                    Log.a(e5);
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    return new HashSet();
                } catch (IOException e8) {
                    e5 = e8;
                    objectInputStream = null;
                    objectInputStream2 = objectInputStream;
                    Log.a(e5);
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    return new HashSet();
                }
            }
            return new HashSet();
        } catch (IOException e9) {
            throw e9;
        }
    }

    public void a(Object obj) {
        if (obj instanceof a) {
            ((a) obj).a(this);
        }
    }

    public static boolean Q() {
        try {
            if (ad == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = ad.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            try {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
                return false;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void aY() {
        an = true;
    }

    public void a(long j) {
        boolean z = DialogToastActivity.f;
        if (j >= 60000) {
            PendingIntent broadcast = PendingIntent.getBroadcast(z(), 0, new Intent(bb[311]).setPackage(bb[310]), 0);
            AlarmManager alarmManager = (AlarmManager) z().getSystemService(bb[312]);
            try {
                if (VERSION.SDK_INT >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, broadcast);
                    if (!z) {
                        return;
                    }
                }
                try {
                    if (VERSION.SDK_INT >= 19) {
                        try {
                            alarmManager.setExact(2, SystemClock.elapsedRealtime() + j, broadcast);
                            if (!z) {
                                return;
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    alarmManager.set(2, SystemClock.elapsedRealtime() + j, broadcast);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }

    static Handler aD() {
        return af;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean s(android.content.Context r6) {
        /*
        r0 = new java.io.File;
        r1 = r6.getFilesDir();
        r2 = bb;
        r3 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        r0 = r0.exists();
        if (r0 == 0) goto L_0x0038;
    L_0x0015:
        r1 = 0;
        r0 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0047, all -> 0x005d }
        r2 = z();	 Catch:{ IOException -> 0x0047, all -> 0x005d }
        r3 = bb;	 Catch:{ IOException -> 0x0047, all -> 0x005d }
        r4 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0047, all -> 0x005d }
        r2 = r2.openFileInput(r3);	 Catch:{ IOException -> 0x0047, all -> 0x005d }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0047, all -> 0x005d }
        r1 = r0.readBoolean();	 Catch:{ IOException -> 0x0071 }
        U = r1;	 Catch:{ IOException -> 0x0071 }
        if (r0 == 0) goto L_0x0034;
    L_0x0031:
        r0.close();	 Catch:{ IOException -> 0x0068 }
    L_0x0034:
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x0066 }
        if (r0 == 0) goto L_0x0044;
    L_0x0038:
        r0 = bb;	 Catch:{ IOException -> 0x0066 }
        r1 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0066 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0066 }
        r0 = 0;
        U = r0;	 Catch:{ IOException -> 0x0066 }
    L_0x0044:
        r0 = U;
        return r0;
    L_0x0047:
        r0 = move-exception;
        r0 = r1;
    L_0x0049:
        r1 = bb;	 Catch:{ all -> 0x006c }
        r2 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x006c }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x006c }
        r1 = 0;
        U = r1;	 Catch:{ all -> 0x006c }
        if (r0 == 0) goto L_0x0034;
    L_0x0057:
        r0.close();	 Catch:{ IOException -> 0x005b }
        goto L_0x0034;
    L_0x005b:
        r0 = move-exception;
        goto L_0x0034;
    L_0x005d:
        r0 = move-exception;
    L_0x005e:
        if (r1 == 0) goto L_0x0063;
    L_0x0060:
        r1.close();	 Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0064 }
    L_0x0063:
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        goto L_0x0034;
    L_0x006a:
        r1 = move-exception;
        goto L_0x0063;
    L_0x006c:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x005e;
    L_0x0071:
        r1 = move-exception;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.s(android.content.Context):boolean");
    }

    public static void c(String str, String str2, String str3) {
        b(str, str2, null, str3);
    }

    public static boolean a(String str, ay ayVar, com.whatsapp.protocol.b5 b5Var, cu cuVar) {
        return a(str, ayVar, b5Var, cuVar, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.l5 r13, android.content.Context r14) {
        /*
        r12 = 4;
        r11 = 3;
        r10 = 2;
        r9 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.c();	 Catch:{ NumberFormatException -> 0x0223 }
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r0 = r13.m();	 Catch:{ NumberFormatException -> 0x0223 }
        if (r0 == 0) goto L_0x01e5;
    L_0x0012:
        r0 = as;
        r2 = r13.p;
        r3 = com.whatsapp.air.ALLOW;
        r2 = r0.b(r2, r3);
        r3 = new java.util.ArrayList;
        r0 = r2.size();
        r3.<init>(r0);
        r4 = new java.util.ArrayList;
        r0 = r2.size();
        r4.<init>(r0);
        r5 = r2.iterator();
    L_0x0032:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x00c0;
    L_0x0038:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r6 = as;
        r0 = r6.b(r0);
        r6 = r0.q;	 Catch:{ NumberFormatException -> 0x0225 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ NumberFormatException -> 0x0225 }
        if (r6 == 0) goto L_0x0055;
    L_0x004c:
        r6 = r0.i();	 Catch:{ NumberFormatException -> 0x0227 }
        r4.add(r6);	 Catch:{ NumberFormatException -> 0x0227 }
        if (r1 == 0) goto L_0x00b0;
    L_0x0055:
        r6 = as;	 Catch:{ NumberFormatException -> 0x0229 }
        r7 = r13.p;	 Catch:{ NumberFormatException -> 0x0229 }
        r8 = r0.i();	 Catch:{ NumberFormatException -> 0x0229 }
        r6 = r6.b(r7, r8);	 Catch:{ NumberFormatException -> 0x0229 }
        if (r6 > r9) goto L_0x006c;
    L_0x0063:
        r6 = r0.i();	 Catch:{ NumberFormatException -> 0x022b }
        r3.add(r6);	 Catch:{ NumberFormatException -> 0x022b }
        if (r1 == 0) goto L_0x00b0;
    L_0x006c:
        r6 = as;	 Catch:{ NumberFormatException -> 0x022d }
        r7 = r13.p;	 Catch:{ NumberFormatException -> 0x022d }
        r8 = r0.a(r14);	 Catch:{ NumberFormatException -> 0x022d }
        r6 = r6.c(r7, r8);	 Catch:{ NumberFormatException -> 0x022d }
        if (r6 > r9) goto L_0x0083;
    L_0x007a:
        r6 = r0.a(r14);	 Catch:{ NumberFormatException -> 0x022f }
        r3.add(r6);	 Catch:{ NumberFormatException -> 0x022f }
        if (r1 == 0) goto L_0x00b0;
    L_0x0083:
        r6 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x022f }
        r6.<init>();	 Catch:{ NumberFormatException -> 0x022f }
        r7 = r0.a(r14);	 Catch:{ NumberFormatException -> 0x022f }
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x022f }
        r7 = bb;	 Catch:{ NumberFormatException -> 0x022f }
        r8 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x022f }
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x022f }
        r0 = r0.s();	 Catch:{ NumberFormatException -> 0x022f }
        r0 = r6.append(r0);	 Catch:{ NumberFormatException -> 0x022f }
        r6 = ")";
        r0 = r0.append(r6);	 Catch:{ NumberFormatException -> 0x022f }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x022f }
        r3.add(r0);	 Catch:{ NumberFormatException -> 0x022f }
    L_0x00b0:
        r0 = r3.size();	 Catch:{ NumberFormatException -> 0x0231 }
        if (r0 < r10) goto L_0x00be;
    L_0x00b6:
        r0 = r2.size();	 Catch:{ NumberFormatException -> 0x0233 }
        if (r0 < r12) goto L_0x00be;
    L_0x00bc:
        if (r1 == 0) goto L_0x00c0;
    L_0x00be:
        if (r1 == 0) goto L_0x0032;
    L_0x00c0:
        r4 = r4.iterator();
    L_0x00c4:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00ef;
    L_0x00ca:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = r3.size();	 Catch:{ NumberFormatException -> 0x0237 }
        r6 = r2.size();	 Catch:{ NumberFormatException -> 0x0237 }
        if (r5 != r6) goto L_0x00dc;
    L_0x00da:
        if (r1 == 0) goto L_0x00ef;
    L_0x00dc:
        r5 = r3.size();	 Catch:{ NumberFormatException -> 0x023b }
        if (r5 < r10) goto L_0x00ea;
    L_0x00e2:
        r5 = r2.size();	 Catch:{ NumberFormatException -> 0x023d }
        if (r5 < r12) goto L_0x00ea;
    L_0x00e8:
        if (r1 == 0) goto L_0x00ef;
    L_0x00ea:
        r3.add(r0);	 Catch:{ NumberFormatException -> 0x023f }
        if (r1 == 0) goto L_0x00c4;
    L_0x00ef:
        r0 = r2.size();
        r2 = r3.size();
        r0 = r0 - r2;
        if (r0 != 0) goto L_0x01be;
    L_0x00fa:
        r2 = r3.size();	 Catch:{ NumberFormatException -> 0x0241 }
        if (r2 != r9) goto L_0x011f;
    L_0x0100:
        r2 = 2131230887; // 0x7f0800a7 float:1.807784E38 double:1.0529679646E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x0243 }
        r5 = 0;
        r6 = r13.a(r14);	 Catch:{ NumberFormatException -> 0x0243 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0243 }
        r5 = 1;
        r6 = 0;
        r6 = r3.get(r6);	 Catch:{ NumberFormatException -> 0x0243 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0243 }
        r2 = r14.getString(r2, r4);	 Catch:{ NumberFormatException -> 0x0243 }
        r4 = 1;
        a(r14, r2, r4);	 Catch:{ NumberFormatException -> 0x0243 }
        if (r1 == 0) goto L_0x01e3;
    L_0x011f:
        r2 = r3.size();	 Catch:{ NumberFormatException -> 0x0245 }
        if (r2 != r10) goto L_0x014c;
    L_0x0125:
        r2 = 2131230888; // 0x7f0800a8 float:1.8077841E38 double:1.052967965E-314;
        r4 = 3;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x0247 }
        r5 = 0;
        r6 = r13.a(r14);	 Catch:{ NumberFormatException -> 0x0247 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0247 }
        r5 = 1;
        r6 = 0;
        r6 = r3.get(r6);	 Catch:{ NumberFormatException -> 0x0247 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0247 }
        r5 = 2;
        r6 = 1;
        r6 = r3.get(r6);	 Catch:{ NumberFormatException -> 0x0247 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0247 }
        r2 = r14.getString(r2, r4);	 Catch:{ NumberFormatException -> 0x0247 }
        r4 = 1;
        a(r14, r2, r4);	 Catch:{ NumberFormatException -> 0x0247 }
        if (r1 == 0) goto L_0x01e3;
    L_0x014c:
        r2 = r3.size();	 Catch:{ NumberFormatException -> 0x0249 }
        if (r2 != r11) goto L_0x0181;
    L_0x0152:
        r2 = 2131230889; // 0x7f0800a9 float:1.8077844E38 double:1.0529679656E-314;
        r4 = 4;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x024b }
        r5 = 0;
        r6 = r13.a(r14);	 Catch:{ NumberFormatException -> 0x024b }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x024b }
        r5 = 1;
        r6 = 0;
        r6 = r3.get(r6);	 Catch:{ NumberFormatException -> 0x024b }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x024b }
        r5 = 2;
        r6 = 1;
        r6 = r3.get(r6);	 Catch:{ NumberFormatException -> 0x024b }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x024b }
        r5 = 3;
        r6 = 2;
        r6 = r3.get(r6);	 Catch:{ NumberFormatException -> 0x024b }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x024b }
        r2 = r14.getString(r2, r4);	 Catch:{ NumberFormatException -> 0x024b }
        r4 = 1;
        a(r14, r2, r4);	 Catch:{ NumberFormatException -> 0x024b }
        if (r1 == 0) goto L_0x01e3;
    L_0x0181:
        r2 = 0;
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x024d }
        r4.<init>();	 Catch:{ NumberFormatException -> 0x024d }
        r5 = bb;	 Catch:{ NumberFormatException -> 0x024d }
        r6 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x024d }
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x024d }
        r5 = r3.size();	 Catch:{ NumberFormatException -> 0x024d }
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x024d }
        r4 = r4.toString();	 Catch:{ NumberFormatException -> 0x024d }
        com.whatsapp.auv.a(r2, r4);	 Catch:{ NumberFormatException -> 0x024d }
        r2 = 2131230887; // 0x7f0800a7 float:1.807784E38 double:1.0529679646E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x024d }
        r5 = 0;
        r6 = r13.a(r14);	 Catch:{ NumberFormatException -> 0x024d }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x024d }
        r5 = 1;
        r6 = com.whatsapp.qm.a(r3);	 Catch:{ NumberFormatException -> 0x024d }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x024d }
        r2 = r14.getString(r2, r4);	 Catch:{ NumberFormatException -> 0x024d }
        r4 = 1;
        a(r14, r2, r4);	 Catch:{ NumberFormatException -> 0x024d }
        if (r1 == 0) goto L_0x01e3;
    L_0x01be:
        r2 = az;	 Catch:{ NumberFormatException -> 0x024d }
        r4 = 2131296265; // 0x7f090009 float:1.8210442E38 double:1.0530002656E-314;
        r5 = 3;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x024d }
        r6 = 0;
        r7 = r13.a(r14);	 Catch:{ NumberFormatException -> 0x024d }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x024d }
        r6 = 1;
        r3 = com.whatsapp.qm.a(r3);	 Catch:{ NumberFormatException -> 0x024d }
        r5[r6] = r3;	 Catch:{ NumberFormatException -> 0x024d }
        r3 = 2;
        r6 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x024d }
        r5[r3] = r6;	 Catch:{ NumberFormatException -> 0x024d }
        r0 = r2.a(r4, r0, r5);	 Catch:{ NumberFormatException -> 0x024d }
        r2 = 1;
        a(r14, r0, r2);	 Catch:{ NumberFormatException -> 0x024d }
    L_0x01e3:
        if (r1 == 0) goto L_0x0222;
    L_0x01e5:
        r0 = as;
        r0.l(r13);
        r0 = com.whatsapp.air.class;
        r0 = r13.a(r0);
        r0 = (com.whatsapp.air) r0;
        r2 = com.whatsapp.air.UPGRADE;	 Catch:{ NumberFormatException -> 0x024f }
        if (r0 != r2) goto L_0x020d;
    L_0x01f6:
        r0 = 2131230886; // 0x7f0800a6 float:1.8077837E38 double:1.052967964E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ NumberFormatException -> 0x0251 }
        r3 = 0;
        r4 = r13.i();	 Catch:{ NumberFormatException -> 0x0251 }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x0251 }
        r0 = r14.getString(r0, r2);	 Catch:{ NumberFormatException -> 0x0251 }
        r2 = 1;
        a(r14, r0, r2);	 Catch:{ NumberFormatException -> 0x0251 }
        if (r1 == 0) goto L_0x0222;
    L_0x020d:
        r0 = 2131230885; // 0x7f0800a5 float:1.8077835E38 double:1.0529679636E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ NumberFormatException -> 0x0251 }
        r2 = 0;
        r3 = r13.i();	 Catch:{ NumberFormatException -> 0x0251 }
        r1[r2] = r3;	 Catch:{ NumberFormatException -> 0x0251 }
        r0 = r14.getString(r0, r1);	 Catch:{ NumberFormatException -> 0x0251 }
        r1 = 1;
        a(r14, r0, r1);	 Catch:{ NumberFormatException -> 0x0251 }
    L_0x0222:
        return;
    L_0x0223:
        r0 = move-exception;
        throw r0;
    L_0x0225:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x0227:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0229 }
    L_0x0229:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x022b }
    L_0x022b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x022d }
    L_0x022d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x022f }
    L_0x022f:
        r0 = move-exception;
        throw r0;
    L_0x0231:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0233 }
    L_0x0233:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0235 }
    L_0x0235:
        r0 = move-exception;
        throw r0;
    L_0x0237:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0239 }
    L_0x0239:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x023b }
    L_0x023b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x023d }
    L_0x023d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x023f }
    L_0x023f:
        r0 = move-exception;
        throw r0;
    L_0x0241:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0243 }
    L_0x0243:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0245 }
    L_0x0245:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0247 }
    L_0x0247:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0249 }
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x024d }
    L_0x024d:
        r0 = move-exception;
        throw r0;
    L_0x024f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0251 }
    L_0x0251:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.l5, android.content.Context):void");
    }

    public static void a(String str, bb bbVar) {
        e(new a3i(str, null, null, 16, bbVar));
    }

    public static void f(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[611], 0).edit();
        try {
            edit.putString(bb[612], str);
            if (!edit.commit()) {
                Log.e(bb[613]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void p() {
        /*
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = an();	 Catch:{ NumberFormatException -> 0x0073 }
        if (r0 == 0) goto L_0x0012;
    L_0x0008:
        r0 = an();	 Catch:{ NumberFormatException -> 0x0075 }
        r0 = r0.f();	 Catch:{ NumberFormatException -> 0x0075 }
        if (r0 != 0) goto L_0x0072;
    L_0x0012:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0077 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0077 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0077 }
        r3 = 508; // 0x1fc float:7.12E-43 double:2.51E-321;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0077 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0077 }
        r2 = new java.util.Date;	 Catch:{ NumberFormatException -> 0x0077 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0077 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0077 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0077 }
        r2 = " ";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0077 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0077 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0077 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0077 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0077 }
        r0 = j;	 Catch:{ NumberFormatException -> 0x0077 }
        r2 = 2;
        if (r0 != r2) goto L_0x0054;
    L_0x0049:
        r0 = a2();	 Catch:{ NumberFormatException -> 0x0077 }
        if (r0 == 0) goto L_0x0054;
    L_0x004f:
        r0 = 2131232043; // 0x7f08052b float:1.8080184E38 double:1.052968536E-314;
        if (r1 == 0) goto L_0x0060;
    L_0x0054:
        r0 = j;	 Catch:{ NumberFormatException -> 0x0079 }
        if (r0 != 0) goto L_0x005d;
    L_0x0058:
        r0 = 2131232045; // 0x7f08052d float:1.8080188E38 double:1.0529685368E-314;
        if (r1 == 0) goto L_0x0060;
    L_0x005d:
        r0 = 2131232042; // 0x7f08052a float:1.8080182E38 double:1.0529685353E-314;
    L_0x0060:
        r1 = z();
        r2 = z();
        r0 = r2.getString(r0);
        com.whatsapp.util.p.a(r1, r0);
        r0 = 1;
        ac = r0;
    L_0x0072:
        return;
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.p():void");
    }

    public static boolean y(Context context) {
        try {
            if (((AudioManager) context.getSystemService(bb[391])).getStreamVolume(3) != 0) {
                return true;
            }
            if (System.currentTimeMillis() - f > 2000) {
                f = System.currentTimeMillis();
                a(context, 2131231699, 0);
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(aw2 com_whatsapp_aw2) {
        try {
            if (!c) {
                return;
            }
            if (J()) {
                Log.w(bb[192]);
                M.b(co.a(com_whatsapp_aw2));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(String str, String str2, String str3, String[] strArr, int[] iArr, byte[][] bArr, int[] iArr2, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        b(co.a(str, str2, str3, strArr, iArr, bArr, iArr2, bArr2, bArr3, bArr4), str);
    }

    public static void b(ct ctVar) {
        try {
            if (c) {
                if (bb[318].equals(ctVar.a)) {
                    try {
                        if (bb[317].equals(ctVar.c)) {
                            try {
                                boolean z;
                                if (C(ctVar.e)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                try {
                                    M.b(co.a(ctVar, z));
                                    if (!DialogToastActivity.f) {
                                        return;
                                    }
                                } catch (NumberFormatException e) {
                                    throw e;
                                }
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
                M.b(co.c(ctVar));
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    private static void as() {
        try {
            if (an() == null || !an().b()) {
                Log.i(bb[238]);
                Intent intent = new Intent(z(), OverlayAlert.class);
                intent.putExtra(bb[239], 2131231414);
                intent.setFlags(268697600);
                z().startActivity(intent);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a(String str, ay ayVar, com.whatsapp.protocol.b5 b5Var, cu cuVar, bb bbVar) {
        try {
            if (!c) {
                return false;
            }
            M.b(co.a(str, ayVar, b5Var, cuVar, bbVar));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void g() {
        Log.i(bb[457]);
        p();
    }

    public static void a(String str) {
        try {
            if (c) {
                M.b(co.d(str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3) {
        b(co.i(str, str2, str3), str2);
    }

    public static void l(Context context) {
        d(context, 0);
        ay = null;
        context.startActivity(new Intent(context, EULA.class));
    }

    public static boolean b(Me me) {
        return a(me, bb[146]);
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, boolean z4, EnumSet enumSet) {
        a(context, z, z2, z3, z4, enumSet, null, null);
    }

    public static void a(Context context, String str, String str2) {
        Editor edit = context.getSharedPreferences(bb[275], 0).edit();
        try {
            edit.putInt(bb[276], 2);
            edit.putString(bb[272], str);
            edit.putString(bb[274], str2);
            if (!edit.commit()) {
                Log.e(bb[273]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static File a(String str, byte b, int i, boolean z) {
        return new File(dg.a(b, i, z), str);
    }

    private static int d(int i) {
        switch (i) {
            case at.g /*1*/:
                return 2131232020;
            case at.i /*2*/:
                return 2131232017;
            case at.o /*3*/:
                return 2131232021;
            case Y.l /*9*/:
                return 2131232018;
            default:
                return 2131232019;
        }
    }

    public void a(Configuration configuration) {
        super.a(configuration);
        aqu.b();
        aN();
        a4d.d();
        a6.a();
    }

    public static void a(byte[] bArr, byte[] bArr2, byte b, bz[] bzVarArr, bz bzVar) {
        if (c) {
            String str = ad() + bb[353];
            try {
                if (!p.aW.contains(str)) {
                    M.b(co.a(bArr, bArr2, b, bzVarArr, bzVar));
                    p.aW.add(str);
                    p.ak = true;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    public int o(String str) {
        return h(z(), str);
    }

    public static void aW() {
        try {
            if (c) {
                Log.i(bb[627]);
                M.b(co.c());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void k(String str) {
        b(str, true);
    }

    @Nullable
    static c2 E(String str) {
        String str2 = null;
        boolean z = true;
        l5 d = qa.d(str);
        if (d == null) {
            return null;
        }
        c2 c2Var = new c2();
        try {
            c2Var.m = aK.d(str);
            c2Var.v = aK.y(str);
            c2Var.n = str;
            c2Var.e = a3b.a(z()).c(str);
            c2Var.r = d.d;
            c2Var.o = aK.b(str);
            if (!TextUtils.isEmpty(d.q)) {
                str2 = d.q;
            }
            try {
                c2Var.u = str2;
                if (d.c()) {
                    c2Var.l = !qm.h(str);
                }
                try {
                    if (aK.k(str) == -1) {
                        z = false;
                    }
                    c2Var.p = z;
                    return c2Var;
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static void a(l5 l5Var, String str) {
        a(l5Var, str, null);
    }

    public static void a(String str, boolean z) {
        try {
            if ((wn.q() || z) && str != null) {
                try {
                    if (l5.e(str)) {
                        List arrayList = new ArrayList(qm.c(str).l());
                        _d _dVar = new _d(new sj(str, z));
                        String u = wn.u();
                        p.ai.a(new SendWebForwardJob(u, co.a(u, str, arrayList, _dVar)));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            try {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }

    public static void a(bf bfVar, int i) {
        try {
            if (wn.q()) {
                bfVar.f = i;
                _d _dVar = new _d(new s0(bfVar));
                String u = wn.u();
                p.ai.a(new SendWebForwardJob(u, co.a(u, bfVar, _dVar)));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b(String str, List list, int i) {
        a(str, list, -1, true, false, null, null, i);
    }

    public static long b(long j) {
        return (System.currentTimeMillis() + j) - av();
    }

    public static boolean i(com.whatsapp.protocol.co coVar) {
        return a(az(), coVar);
    }

    public static boolean z(Context context) {
        try {
            if (VERSION.SDK_INT >= 17) {
                try {
                    if (Global.getInt(context.getContentResolver(), bb[35], 0) == 0) {
                        return false;
                    }
                    return true;
                } catch (NumberFormatException e) {
                    throw e;
                }
            } else if (System.getInt(context.getContentResolver(), bb[34], 0) != 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private static boolean aj() {
        return aC;
    }

    public static void a3() {
        try {
            if (ay != null) {
                Log.i(bb[449]);
                K = ve.b(ay.jabber_id);
                a(ay.jabber_id, K);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(a34 com_whatsapp_a34) {
        aY.remove(com_whatsapp_a34);
    }

    public static boolean B() {
        return a59.q;
    }

    public static void a(String str, boolean z, Collection collection, int i) {
        boolean z2 = DialogToastActivity.f;
        try {
            if (wn.q() && str != null && collection != null) {
                try {
                    if (collection.size() != 0) {
                        _d _dVar = new _d(new sy(str, z, collection, i));
                        List arrayList = new ArrayList(collection.size());
                        for (com.whatsapp.protocol.co coVar : collection) {
                            arrayList.add(coVar.k);
                            if (z2) {
                                break;
                            }
                        }
                        String u = wn.u();
                        p.ai.a(new SendWebForwardJob(u, co.a(u, str, z, arrayList, i, _dVar)));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            try {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(java.util.List r6, java.util.List r7, boolean r8) {
        /*
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = r6.iterator();
    L_0x0007:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0065;
    L_0x000d:
        r0 = r4.next();
        r0 = (com.whatsapp.l5) r0;
        r1 = r0.p;	 Catch:{ NumberFormatException -> 0x0066 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0066 }
        if (r1 == 0) goto L_0x001d;
    L_0x001b:
        if (r3 == 0) goto L_0x0007;
    L_0x001d:
        r5 = new com.whatsapp.protocol.c2;
        r5.<init>();
        r1 = r0.p;	 Catch:{ NumberFormatException -> 0x0068 }
        r5.n = r1;	 Catch:{ NumberFormatException -> 0x0068 }
        r1 = r0.q;	 Catch:{ NumberFormatException -> 0x0068 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0068 }
        if (r1 == 0) goto L_0x006a;
    L_0x002e:
        r1 = r2;
    L_0x002f:
        r5.u = r1;	 Catch:{ NumberFormatException -> 0x006d }
        r1 = r0.b;	 Catch:{ NumberFormatException -> 0x006d }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x006d }
        if (r1 != 0) goto L_0x003d;
    L_0x0039:
        r1 = r0.l;	 Catch:{ NumberFormatException -> 0x006f }
        if (r1 != 0) goto L_0x0071;
    L_0x003d:
        r1 = r2;
    L_0x003e:
        r5.b = r1;	 Catch:{ NumberFormatException -> 0x0074 }
        r1 = r0.m;	 Catch:{ NumberFormatException -> 0x0074 }
        r5.o = r1;	 Catch:{ NumberFormatException -> 0x0074 }
        r1 = aK;	 Catch:{ NumberFormatException -> 0x0074 }
        r0 = r0.p;	 Catch:{ NumberFormatException -> 0x0074 }
        r0 = r1.F(r0);	 Catch:{ NumberFormatException -> 0x0074 }
        if (r0 == 0) goto L_0x0076;
    L_0x004e:
        r0 = 1;
    L_0x004f:
        r5.l = r0;	 Catch:{ NumberFormatException -> 0x0078 }
        if (r8 == 0) goto L_0x0060;
    L_0x0053:
        r0 = r5.l;	 Catch:{ NumberFormatException -> 0x007a }
        if (r0 != 0) goto L_0x0060;
    L_0x0057:
        r0 = r5.u;	 Catch:{ NumberFormatException -> 0x007c }
        if (r0 == 0) goto L_0x0063;
    L_0x005b:
        r7.add(r5);	 Catch:{ NumberFormatException -> 0x007e }
        if (r3 == 0) goto L_0x0063;
    L_0x0060:
        r7.add(r5);	 Catch:{ NumberFormatException -> 0x007e }
    L_0x0063:
        if (r3 == 0) goto L_0x0007;
    L_0x0065:
        return r7;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r1 = r0.q;
        goto L_0x002f;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r1 = r0.b;
        goto L_0x003e;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = 0;
        goto L_0x004f;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.util.List, java.util.List, boolean):java.util.List");
    }

    static void b(String str, String str2, String str3) {
        l5 f = as.f(str3);
        if (f != null) {
            try {
                if (f.m) {
                    f.m = false;
                    as.i(f);
                }
                try {
                    M.b(co.a(str2, true, str));
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        M.b(co.a(str2, false, str));
    }

    public static void a(l5 l5Var, boolean z) {
        if (l5Var != null) {
            try {
                if (wn.q()) {
                    _d _dVar = new _d(new sf(l5Var, z));
                    String u = wn.u();
                    p.ai.a(new SendWebForwardJob(u, co.a(u, l5Var.p, z, _dVar)));
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    public static void c(List list) {
        boolean z = DialogToastActivity.f;
        try {
            if (!c) {
                return;
            }
            if (wn.q() && list != null) {
                try {
                    if (list.size() != 0) {
                        for (l5 l5Var : list) {
                            l5Var.q = null;
                            if (z) {
                                break;
                            }
                        }
                        d(list);
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            try {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }

    static boolean be() {
        try {
            Class.forName(bb[487]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    static ReentrantLock C() {
        return aE;
    }

    public static void e(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[364]);
                M.b(co.d(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[298], 0).edit();
        try {
            edit.putString(bb[297], str);
            if (!edit.commit()) {
                Log.e(bb[296]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void c(com.whatsapp.protocol.co coVar) {
        aK.a(coVar, true, 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"NewApi"})
    private void aN() {
        /*
        r5 = this;
        r2 = 0;
        r1 = 1;
        r0 = com.whatsapp.aam.a;	 Catch:{ NumberFormatException -> 0x0059 }
        if (r0 == 0) goto L_0x0021;
    L_0x0006:
        r0 = z();	 Catch:{ NumberFormatException -> 0x005b }
        r0 = r0.getResources();	 Catch:{ NumberFormatException -> 0x005b }
        r0 = r0.getConfiguration();	 Catch:{ NumberFormatException -> 0x005b }
        r0 = r0.locale;	 Catch:{ NumberFormatException -> 0x005b }
        r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0);	 Catch:{ NumberFormatException -> 0x005b }
        if (r0 != r1) goto L_0x005d;
    L_0x001a:
        r0 = r1;
    L_0x001b:
        av = r0;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0058;
    L_0x0021:
        r0 = com.whatsapp.aqu.g();
        r3 = bb;	 Catch:{ NumberFormatException -> 0x005f }
        r4 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x005f }
        r3 = r3.equals(r0);	 Catch:{ NumberFormatException -> 0x005f }
        if (r3 != 0) goto L_0x0055;
    L_0x0031:
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0061 }
        r4 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0061 }
        r3 = r3.equals(r0);	 Catch:{ NumberFormatException -> 0x0061 }
        if (r3 != 0) goto L_0x0055;
    L_0x003d:
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0063 }
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0063 }
        r3 = r3.equals(r0);	 Catch:{ NumberFormatException -> 0x0063 }
        if (r3 != 0) goto L_0x0055;
    L_0x0049:
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0065 }
        r4 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0065 }
        r0 = r3.equals(r0);	 Catch:{ NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x0056;
    L_0x0055:
        r2 = r1;
    L_0x0056:
        av = r2;
    L_0x0058:
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = r2;
        goto L_0x001b;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aN():void");
    }

    public static void a(int i, String str, long j, int i2) {
        a(new bf(str, i, j), i2);
    }

    static void a(Context context) {
        MessageService.a(context, true);
        MessageService.a(context, true, false, false, null, null);
    }

    static void a(Runnable runnable) {
        q.post(runnable);
    }

    static void a(String str, com.whatsapp.protocol.co coVar) {
        Log.i(str + coVar.k.b + " " + ay.jabber_id + " " + coVar.k.c + " " + coVar.t);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long u() {
        /*
        r8 = this;
        r0 = -1;
        r3 = java.lang.Long.valueOf(r0);
        r4 = new java.io.File;
        r2 = z();
        r2 = r2.getFilesDir();
        r5 = bb;
        r6 = 625; // 0x271 float:8.76E-43 double:3.09E-321;
        r5 = r5[r6];
        r4.<init>(r2, r5);
        r2 = r4.exists();	 Catch:{ IOException -> 0x0020 }
        if (r2 != 0) goto L_0x0022;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r1 = 0;
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0061 }
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0061 }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0061 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0061 }
        r0 = r2.readLong();	 Catch:{ IOException -> 0x00d7, all -> 0x00d4 }
        r1 = java.lang.Long.valueOf(r0);	 Catch:{ IOException -> 0x00d7, all -> 0x00d4 }
        r0 = r1.longValue();	 Catch:{ IOException -> 0x00db, all -> 0x00d4 }
        if (r2 == 0) goto L_0x001f;
    L_0x003b:
        r2.close();	 Catch:{ NumberFormatException -> 0x003f }
        goto L_0x001f;
    L_0x003f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0041 }
    L_0x0041:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = bb;
        r5 = 622; // 0x26e float:8.72E-43 double:3.073E-321;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        goto L_0x001f;
    L_0x0061:
        r0 = move-exception;
        r2 = r3;
    L_0x0063:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r3.<init>();	 Catch:{ all -> 0x00ab }
        r4 = bb;	 Catch:{ all -> 0x00ab }
        r5 = 623; // 0x26f float:8.73E-43 double:3.08E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x00ab }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00ab }
        r0 = r0.toString();	 Catch:{ all -> 0x00ab }
        r0 = r3.append(r0);	 Catch:{ all -> 0x00ab }
        r0 = r0.toString();	 Catch:{ all -> 0x00ab }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x00ab }
        if (r1 == 0) goto L_0x0086;
    L_0x0083:
        r1.close();	 Catch:{ IOException -> 0x008b }
    L_0x0086:
        r0 = r2.longValue();
        goto L_0x001f;
    L_0x008b:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = bb;
        r4 = 621; // 0x26d float:8.7E-43 double:3.07E-321;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0086;
    L_0x00ab:
        r0 = move-exception;
    L_0x00ac:
        if (r1 == 0) goto L_0x00b1;
    L_0x00ae:
        r1.close();	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00b1:
        throw r0;
    L_0x00b2:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 624; // 0x270 float:8.74E-43 double:3.083E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x00b1;
    L_0x00d4:
        r0 = move-exception;
        r1 = r2;
        goto L_0x00ac;
    L_0x00d7:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        goto L_0x0063;
    L_0x00db:
        r0 = move-exception;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.u():long");
    }

    public static void d(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[208]);
                M.b(co.b(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        boolean z6;
        if (z2) {
            z6 = false;
        } else {
            z6 = wn.h();
            if (z6) {
                try {
                    wn.a(z, z3, z4);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        if (z2 || r1) {
            z5 = true;
        }
        a(z, z5, z3, z4);
    }

    private static long o(Context context) {
        return context.getSharedPreferences(bb[397], 0).getLong(bb[396], -1);
    }

    public static String a(byte b) {
        switch (b) {
            case at.g /*1*/:
                try {
                    return bb[161];
                } catch (NumberFormatException e) {
                    throw e;
                }
            case at.i /*2*/:
                return bb[159];
            case at.o /*3*/:
                return bb[158];
            case Y.l /*9*/:
                return bb[160];
            default:
                auv.a(false, bb[163]);
                return bb[162];
        }
    }

    static void O() {
        Y();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(android.app.Activity r19) {
        /*
        r4 = com.whatsapp.DialogToastActivity.f;
        r5 = r19.getPackageManager();
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = new java.util.HashSet;
        r7.<init>();
        r1 = new android.content.Intent;
        r2 = bb;
        r3 = 558; // 0x22e float:7.82E-43 double:2.757E-321;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = bb;
        r3 = 573; // 0x23d float:8.03E-43 double:2.83E-321;
        r2 = r2[r3];
        r1 = r1.setType(r2);
        r2 = bb;
        r3 = 577; // 0x241 float:8.09E-43 double:2.85E-321;
        r2 = r2[r3];
        r3 = 2131232144; // 0x7f080590 float:1.8080389E38 double:1.0529685857E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r9 = 0;
        r10 = bb;
        r11 = 550; // 0x226 float:7.71E-43 double:2.717E-321;
        r10 = r10[r11];
        r8[r9] = r10;
        r0 = r19;
        r3 = r0.getString(r3, r8);
        r1 = r1.putExtra(r2, r3);
        r2 = new android.content.Intent;
        r3 = bb;
        r8 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r3 = r3[r8];
        r2.<init>(r3);
        r3 = bb;
        r8 = 588; // 0x24c float:8.24E-43 double:2.905E-321;
        r3 = r3[r8];
        r2 = r2.setType(r3);
        r3 = bb;
        r8 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r3 = r3[r8];
        r8 = " ";
        r2 = r2.putExtra(r3, r8);
        r3 = bb;
        r8 = 578; // 0x242 float:8.1E-43 double:2.856E-321;
        r3 = r3[r8];
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = 2131232142; // 0x7f08058e float:1.8080385E38 double:1.0529685847E-314;
        r10 = 1;
        r10 = new java.lang.Object[r10];
        r11 = 0;
        r12 = bb;
        r13 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r12 = r12[r13];
        r10[r11] = r12;
        r0 = r19;
        r9 = r0.getString(r9, r10);
        r8 = r8.append(r9);
        r9 = bb;
        r10 = 584; // 0x248 float:8.18E-43 double:2.885E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r8 = r8.toString();
        r2 = r2.putExtra(r3, r8);
        r3 = bb;
        r8 = 589; // 0x24d float:8.25E-43 double:2.91E-321;
        r3 = r3[r8];
        r8 = 2131232143; // 0x7f08058f float:1.8080387E38 double:1.052968585E-314;
        r0 = r19;
        r8 = r0.getString(r8);
        r2 = r2.putExtra(r3, r8);
        r3 = 2;
        r8 = new android.content.Intent[r3];
        r3 = 0;
        r8[r3] = r1;
        r1 = 1;
        r8[r1] = r2;
        r2 = 0;
        r1 = 0;
        r3 = r1;
        r1 = r2;
    L_0x00bc:
        r2 = r8.length;
        if (r3 >= r2) goto L_0x046b;
    L_0x00bf:
        r9 = r8[r3];
        r2 = 0;
        r2 = r5.queryIntentActivities(r9, r2);
        if (r2 == 0) goto L_0x0358;
    L_0x00c8:
        r10 = r2.iterator();
        r2 = r1;
    L_0x00cd:
        r1 = r10.hasNext();
        if (r1 == 0) goto L_0x0359;
    L_0x00d3:
        r1 = r10.next();
        r1 = (android.content.pm.ResolveInfo) r1;
        r1 = r1.activityInfo;
        r11 = r1.name;
        r1 = r1.applicationInfo;
        r12 = r1.packageName;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r13 = bb;
        r14 = 582; // 0x246 float:8.16E-43 double:2.875E-321;
        r13 = r13[r14];
        r1 = r1.append(r13);
        r1 = r1.append(r3);
        r13 = bb;
        r14 = 568; // 0x238 float:7.96E-43 double:2.806E-321;
        r13 = r13[r14];
        r1 = r1.append(r13);
        r1 = r1.append(r12);
        r13 = bb;
        r14 = 547; // 0x223 float:7.67E-43 double:2.703E-321;
        r13 = r13[r14];
        r1 = r1.append(r13);
        r1 = r1.append(r11);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = bb;
        r13 = 556; // 0x22c float:7.79E-43 double:2.747E-321;
        r1 = r1[r13];
        r1 = r12.contains(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0123:
        r1 = bb;
        r13 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x012f:
        r1 = bb;
        r13 = 571; // 0x23b float:8.0E-43 double:2.82E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x013b:
        r1 = bb;
        r13 = 580; // 0x244 float:8.13E-43 double:2.866E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0147:
        r1 = bb;
        r13 = 579; // 0x243 float:8.11E-43 double:2.86E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0153:
        r1 = bb;
        r13 = 585; // 0x249 float:8.2E-43 double:2.89E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x015f:
        r1 = bb;
        r13 = 554; // 0x22a float:7.76E-43 double:2.737E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x016b:
        r1 = bb;
        r13 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0177:
        r1 = bb;
        r13 = 581; // 0x245 float:8.14E-43 double:2.87E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0183:
        r1 = bb;
        r13 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x018f:
        r1 = bb;
        r13 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x019b:
        r1 = bb;
        r13 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01a7:
        r1 = bb;
        r13 = 549; // 0x225 float:7.7E-43 double:2.71E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01b3:
        r1 = bb;
        r13 = 539; // 0x21b float:7.55E-43 double:2.663E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01bf:
        r1 = bb;
        r13 = 561; // 0x231 float:7.86E-43 double:2.77E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01cb:
        r1 = bb;
        r13 = 555; // 0x22b float:7.78E-43 double:2.74E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01d7:
        r1 = bb;
        r13 = 562; // 0x232 float:7.88E-43 double:2.777E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01e3:
        r1 = bb;
        r13 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01ef:
        r1 = bb;
        r13 = 557; // 0x22d float:7.8E-43 double:2.75E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x01fb:
        r1 = bb;
        r13 = 564; // 0x234 float:7.9E-43 double:2.787E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0207:
        r1 = bb;
        r13 = 559; // 0x22f float:7.83E-43 double:2.76E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0213:
        r1 = bb;
        r13 = 583; // 0x247 float:8.17E-43 double:2.88E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x021f:
        r1 = bb;
        r13 = 552; // 0x228 float:7.74E-43 double:2.727E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x022b:
        r1 = bb;
        r13 = 565; // 0x235 float:7.92E-43 double:2.79E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0237:
        r1 = bb;
        r13 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0243:
        r1 = bb;
        r13 = 574; // 0x23e float:8.04E-43 double:2.836E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x024f:
        r1 = bb;
        r13 = 540; // 0x21c float:7.57E-43 double:2.67E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x025b:
        r1 = bb;
        r13 = 548; // 0x224 float:7.68E-43 double:2.707E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0267:
        r1 = bb;
        r13 = 586; // 0x24a float:8.21E-43 double:2.895E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cd;
    L_0x0273:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0447 }
        r13 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r1 = r1[r13];	 Catch:{ NumberFormatException -> 0x0447 }
        r1 = r12.equals(r1);	 Catch:{ NumberFormatException -> 0x0447 }
        if (r1 == 0) goto L_0x0281;
    L_0x027f:
        if (r4 == 0) goto L_0x00cd;
    L_0x0281:
        r1 = r9.clone();
        r1 = (android.content.Intent) r1;
        r1.setClassName(r12, r11);	 Catch:{ NumberFormatException -> 0x0449 }
        r1.setPackage(r12);	 Catch:{ NumberFormatException -> 0x0449 }
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0449 }
        r14 = 546; // 0x222 float:7.65E-43 double:2.7E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0449 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0449 }
        if (r13 != 0) goto L_0x02f9;
    L_0x0299:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x044b }
        r14 = 560; // 0x230 float:7.85E-43 double:2.767E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x044b }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x044b }
        if (r13 != 0) goto L_0x02f9;
    L_0x02a5:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x044d }
        r14 = 541; // 0x21d float:7.58E-43 double:2.673E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x044d }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x044d }
        if (r13 != 0) goto L_0x02f9;
    L_0x02b1:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x044f }
        r14 = 551; // 0x227 float:7.72E-43 double:2.72E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x044f }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x044f }
        if (r13 != 0) goto L_0x02f9;
    L_0x02bd:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0451 }
        r14 = 587; // 0x24b float:8.23E-43 double:2.9E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0451 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0451 }
        if (r13 != 0) goto L_0x02f9;
    L_0x02c9:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0453 }
        r14 = 567; // 0x237 float:7.95E-43 double:2.8E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0453 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0453 }
        if (r13 != 0) goto L_0x02f9;
    L_0x02d5:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0455 }
        r14 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0455 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0455 }
        if (r13 != 0) goto L_0x02f9;
    L_0x02e1:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0457 }
        r14 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0457 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0457 }
        if (r13 != 0) goto L_0x02f9;
    L_0x02ed:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0459 }
        r14 = 570; // 0x23a float:7.99E-43 double:2.816E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0459 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0459 }
        if (r13 == 0) goto L_0x0323;
    L_0x02f9:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x045b }
        r14 = 572; // 0x23c float:8.02E-43 double:2.826E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x045b }
        r1.removeExtra(r13);	 Catch:{ NumberFormatException -> 0x045b }
        r13 = bb;	 Catch:{ NumberFormatException -> 0x045b }
        r14 = 575; // 0x23f float:8.06E-43 double:2.84E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x045b }
        r14 = 2131232144; // 0x7f080590 float:1.8080389E38 double:1.0529685857E-314;
        r15 = 1;
        r15 = new java.lang.Object[r15];	 Catch:{ NumberFormatException -> 0x045b }
        r16 = 0;
        r17 = bb;	 Catch:{ NumberFormatException -> 0x045b }
        r18 = 566; // 0x236 float:7.93E-43 double:2.796E-321;
        r17 = r17[r18];	 Catch:{ NumberFormatException -> 0x045b }
        r15[r16] = r17;	 Catch:{ NumberFormatException -> 0x045b }
        r0 = r19;
        r14 = r0.getString(r14, r15);	 Catch:{ NumberFormatException -> 0x045b }
        r1.putExtra(r13, r14);	 Catch:{ NumberFormatException -> 0x045b }
        if (r4 == 0) goto L_0x033e;
    L_0x0323:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x045d }
        r14 = 569; // 0x239 float:7.97E-43 double:2.81E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x045d }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x045d }
        if (r13 == 0) goto L_0x033e;
    L_0x032f:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x045d }
        r14 = 563; // 0x233 float:7.89E-43 double:2.78E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x045d }
        r14 = bb;	 Catch:{ NumberFormatException -> 0x045d }
        r15 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r14 = r14[r15];	 Catch:{ NumberFormatException -> 0x045d }
        r1.putExtra(r13, r14);	 Catch:{ NumberFormatException -> 0x045d }
    L_0x033e:
        r13 = r7.contains(r12);	 Catch:{ NumberFormatException -> 0x045f }
        if (r13 != 0) goto L_0x0472;
    L_0x0344:
        r6.add(r1);	 Catch:{ NumberFormatException -> 0x045f }
        r7.add(r12);	 Catch:{ NumberFormatException -> 0x045f }
        r12 = bb;	 Catch:{ NumberFormatException -> 0x045f }
        r13 = 545; // 0x221 float:7.64E-43 double:2.693E-321;
        r12 = r12[r13];	 Catch:{ NumberFormatException -> 0x045f }
        r11 = r11.equals(r12);	 Catch:{ NumberFormatException -> 0x045f }
        if (r11 == 0) goto L_0x0472;
    L_0x0356:
        if (r4 == 0) goto L_0x0475;
    L_0x0358:
        r2 = r1;
    L_0x0359:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x046e;
    L_0x035d:
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0461 }
        if (r1 != 0) goto L_0x0381;
    L_0x0363:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0461 }
        r3 = 544; // 0x220 float:7.62E-43 double:2.69E-321;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x0461 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ NumberFormatException -> 0x0461 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0461 }
        r3 = z();	 Catch:{ NumberFormatException -> 0x0461 }
        r5 = 2131231113; // 0x7f080189 float:1.8078298E38 double:1.0529680763E-314;
        r3 = r3.getString(r5);	 Catch:{ NumberFormatException -> 0x0461 }
        r5 = 0;
        a(r1, r3, r5);	 Catch:{ NumberFormatException -> 0x0461 }
        if (r4 == 0) goto L_0x0446;
    L_0x0381:
        r1 = android.os.Build.MANUFACTURER;
        r3 = 32;
        r5 = 95;
        r1 = r1.replace(r3, r5);
        r3 = android.os.Build.MODEL;
        r5 = 32;
        r7 = 95;
        r3 = r3.replace(r5, r7);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = r5.append(r1);
        r5 = "-";
        r1 = r1.append(r5);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0463 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x0463 }
        r5 = bb;	 Catch:{ NumberFormatException -> 0x0463 }
        r7 = 553; // 0x229 float:7.75E-43 double:2.73E-321;
        r5 = r5[r7];	 Catch:{ NumberFormatException -> 0x0463 }
        r3 = r3.append(r5);	 Catch:{ NumberFormatException -> 0x0463 }
        r3 = r3.append(r1);	 Catch:{ NumberFormatException -> 0x0463 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x0463 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ NumberFormatException -> 0x0463 }
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0463 }
        r5 = 542; // 0x21e float:7.6E-43 double:2.68E-321;
        r3 = r3[r5];	 Catch:{ NumberFormatException -> 0x0463 }
        r1 = r1.equals(r3);	 Catch:{ NumberFormatException -> 0x0463 }
        if (r1 == 0) goto L_0x0403;
    L_0x03d3:
        if (r2 != 0) goto L_0x03f3;
    L_0x03d5:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0467 }
        r3 = 543; // 0x21f float:7.61E-43 double:2.683E-321;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x0467 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ NumberFormatException -> 0x0467 }
        r1 = z();	 Catch:{ NumberFormatException -> 0x0467 }
        r3 = z();	 Catch:{ NumberFormatException -> 0x0467 }
        r5 = 2131231113; // 0x7f080189 float:1.8078298E38 double:1.0529680763E-314;
        r3 = r3.getString(r5);	 Catch:{ NumberFormatException -> 0x0467 }
        r5 = 0;
        a(r1, r3, r5);	 Catch:{ NumberFormatException -> 0x0467 }
        if (r4 == 0) goto L_0x0446;
    L_0x03f3:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0467 }
        r3 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x0467 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0467 }
        r0 = r19;
        r0.startActivity(r2);	 Catch:{ NumberFormatException -> 0x0467 }
        if (r4 == 0) goto L_0x0446;
    L_0x0403:
        r1 = r6.size();
        r1 = r1 + -1;
        r1 = r6.get(r1);
        r1 = (android.content.Intent) r1;
        r2 = 2131232145; // 0x7f080591 float:1.808039E38 double:1.052968586E-314;
        r0 = r19;
        r2 = r0.getString(r2);
        r2 = android.content.Intent.createChooser(r1, r2);
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0469 }
        r3 = 1;
        if (r1 <= r3) goto L_0x0441;
    L_0x0423:
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0469 }
        r1 = r1 + -1;
        r6.remove(r1);	 Catch:{ NumberFormatException -> 0x0469 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0469 }
        r3 = 538; // 0x21a float:7.54E-43 double:2.66E-321;
        r3 = r1[r3];	 Catch:{ NumberFormatException -> 0x0469 }
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0469 }
        r1 = new android.content.Intent[r1];	 Catch:{ NumberFormatException -> 0x0469 }
        r1 = r6.toArray(r1);	 Catch:{ NumberFormatException -> 0x0469 }
        r1 = (android.os.Parcelable[]) r1;	 Catch:{ NumberFormatException -> 0x0469 }
        r2.putExtra(r3, r1);	 Catch:{ NumberFormatException -> 0x0469 }
    L_0x0441:
        r0 = r19;
        r0.startActivity(r2);
    L_0x0446:
        return;
    L_0x0447:
        r1 = move-exception;
        throw r1;
    L_0x0449:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x044b }
    L_0x044b:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x044d }
    L_0x044d:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x044f }
    L_0x044f:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0451 }
    L_0x0451:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0453 }
    L_0x0453:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0455 }
    L_0x0455:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0457 }
    L_0x0457:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0459 }
    L_0x0459:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x045b }
    L_0x045b:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x045d }
    L_0x045d:
        r1 = move-exception;
        throw r1;
    L_0x045f:
        r1 = move-exception;
        throw r1;
    L_0x0461:
        r1 = move-exception;
        throw r1;
    L_0x0463:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0465 }
    L_0x0465:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0467 }
    L_0x0467:
        r1 = move-exception;
        throw r1;
    L_0x0469:
        r1 = move-exception;
        throw r1;
    L_0x046b:
        r2 = r1;
        goto L_0x035d;
    L_0x046e:
        r3 = r1;
        r1 = r2;
        goto L_0x00bc;
    L_0x0472:
        r1 = r2;
        goto L_0x0356;
    L_0x0475:
        r2 = r1;
        goto L_0x00cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(android.app.Activity):void");
    }

    public static void b(String str, String str2, String str3, byte[][] bArr, int[] iArr) {
        b(co.b(str, str2, str3, bArr, iArr), str);
    }

    public static void ae() {
        try {
            if (c) {
                M.b(co.m());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void d(String str, boolean z) {
        try {
            if (c) {
                M.b(co.a(str, z));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void a(com.whatsapp.contact.o oVar) {
        bq.a(new kz(oVar));
    }

    public static boolean n() {
        return z().getSharedPreferences(bb[268], 0).getBoolean(bb[267], true);
    }

    public static void a(a_g com_whatsapp_a_g) {
        try {
            if (c) {
                Log.i(bb[211] + com_whatsapp_a_g.b);
                M.b(co.a(com_whatsapp_a_g));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static boolean h(boolean z) {
        c = z;
        return z;
    }

    void R() {
        Log.w(bb[483]);
        z().stopService(new Intent(z(), MessageService.class));
    }

    public static int i(Context context) {
        return context.getSharedPreferences(bb[27], 0).getInt(bb[26], 0);
    }

    public static void a(String str, boolean z, EnumSet enumSet) {
        try {
            if (am <= 2) {
                Log.b(bb[128], new RuntimeException(str));
                a(z(), false, z, true, false, enumSet);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean aI() {
        return U;
    }

    public static long aH() {
        long S = aK.S();
        return S != -1 ? S : S;
    }

    public static void a(by byVar) {
        a0 = byVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File j(java.lang.String r3) {
        /*
        r1 = com.whatsapp.dg.b();
        r0 = 0;
        r2 = r1.exists();	 Catch:{ NumberFormatException -> 0x0038 }
        if (r2 == 0) goto L_0x001f;
    L_0x000b:
        r2 = r1.isFile();	 Catch:{ NumberFormatException -> 0x003a }
        if (r2 == 0) goto L_0x0018;
    L_0x0011:
        r1.delete();	 Catch:{ NumberFormatException -> 0x003c }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x003c }
        if (r2 == 0) goto L_0x001f;
    L_0x0018:
        r2 = r1.isDirectory();	 Catch:{ NumberFormatException -> 0x003c }
        if (r2 == 0) goto L_0x001f;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        if (r0 != 0) goto L_0x0030;
    L_0x0021:
        r0 = r1.mkdirs();
        if (r0 != 0) goto L_0x0030;
    L_0x0027:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x003e }
        r2 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x003e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x003e }
    L_0x0030:
        if (r3 == 0) goto L_0x0042;
    L_0x0032:
        r0 = new java.io.File;	 Catch:{ NumberFormatException -> 0x0040 }
        r0.<init>(r1, r3);	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0037:
        return r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = r1;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.j(java.lang.String):java.io.File");
    }

    public static void b(String str, String str2, String str3, int i) {
        a(str, str2, str3, null, i);
    }

    public static void b(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[322], 0).edit();
        try {
            edit.putBoolean(bb[320], z);
            if (!edit.commit()) {
                Log.e(bb[321]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a(String str, String str2, ay ayVar, com.whatsapp.protocol.b5 b5Var) {
        try {
            if (!c) {
                return false;
            }
            M.b(co.a(str, str2, ayVar, b5Var));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void f(a3i com_whatsapp_a3i) {
        try {
            if (c) {
                Log.i(bb[316]);
                M.b(co.g(com_whatsapp_a3i));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3, byte[][] bArr, int[] iArr) {
        b(co.a(str, str2, str3, bArr, iArr), str);
    }

    public static String f(Context context) {
        return context.getSharedPreferences(bb[342], 0).getString(bb[343], "");
    }

    public static boolean b(byte b) {
        return b == (byte) 1 || b == 2 || b == 3 || b == 9;
    }

    public static boolean c(Context context) {
        return context.checkCallingOrSelfPermission(bb[148]) == 0;
    }

    public static void H() {
        try {
            Log.i(bb[399] + h);
            if (h == 1) {
                h = 2;
                p.aN.b(z());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void m(String str) {
        Editor edit = z().getSharedPreferences(bb[485], 0).edit();
        try {
            edit.putString(bb[486], str);
            if (!edit.commit()) {
                Log.e(bb[484]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Activity activity) {
        boolean z = DialogToastActivity.f;
        ArrayList g = qa.g();
        ArrayList arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            l5 d = qa.d((String) it.next());
            if (d != null) {
                try {
                    a(d, activity);
                    if (d.c()) {
                        continue;
                    } else if (d.l == null) {
                        arrayList.add(d);
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            if (z) {
                break;
            }
        }
        as.b(arrayList);
        aK.J();
        activity.runOnUiThread(new ox());
        nf.a(k.CHATS_ALL_DELETE);
        a(2, null, 0, 0);
    }

    public static void a(String str, byte[] bArr, MediaData mediaData, byte b, int i, String str2, Uri uri) {
        q(b(str, bArr, mediaData, b, i, str2, uri));
    }

    public static boolean u(Context context) {
        try {
            if (h(context, bb[229]) != 0) {
                if (h(context, bb[228]) != 0) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void c(String str, int i) {
        try {
            this.R.acquire(30000);
            if (!l5.e(str)) {
                try {
                    if (qm.i(str)) {
                        a(as.b(str));
                    }
                    try {
                        if (!as.d(str)) {
                            boolean a = a1.a(str);
                            try {
                                int i2;
                                Handler handler = L;
                                if (a) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                handler.obtainMessage(3, i2, i, A(str)).sendToTarget();
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static void w(Context context) {
        bq.a(new avq(context));
    }

    public static boolean A() {
        try {
            if (!aJ()) {
                return false;
            }
            try {
                return ((ActivityManager) z().getSystemService(bb[253])).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public boolean F() {
        boolean z = true;
        try {
            if (Y == null) {
                Date date = new Date();
                if (date.before(new Date((as7.a.getTime() - 10368000000L) - 172800000))) {
                    try {
                        Y = date;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                z = date.after(new Date(as7.a.getTime() + 31536000000L));
                if (z) {
                    try {
                        Y = date;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            }
            return z;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void a(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    try {
                        if (c) {
                            M.b(co.a(strArr, new String[]{bb[195], bb[198], bb[199], bb[205], bb[206], bb[194], bb[202], bb[201], bb[200], bb[204], bb[196], bb[197]}));
                            return;
                        }
                        return;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        Log.w(bb[203]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void aG() {
        /*
        r0 = c;	 Catch:{ NumberFormatException -> 0x001e }
        if (r0 == 0) goto L_0x000e;
    L_0x0004:
        r0 = l;	 Catch:{ NumberFormatException -> 0x0020 }
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r0 = com.whatsapp.wn.a();	 Catch:{ NumberFormatException -> 0x0022 }
        if (r0 == 0) goto L_0x0018;
    L_0x000e:
        r0 = com.whatsapp.wn.a();	 Catch:{ NumberFormatException -> 0x0024 }
        if (r0 == 0) goto L_0x001d;
    L_0x0014:
        r0 = l;	 Catch:{ NumberFormatException -> 0x0026 }
        if (r0 != 0) goto L_0x001d;
    L_0x0018:
        r0 = M;	 Catch:{ NumberFormatException -> 0x0026 }
        r0.g();	 Catch:{ NumberFormatException -> 0x0026 }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aG():void");
    }

    public static void a(String str, long j) {
        boolean z = DialogToastActivity.f;
        try {
            auv.a();
            if (str == null) {
                Log.e(bb[502]);
                return;
            }
            Iterator it = ae.iterator();
            while (it.hasNext()) {
                ((aau) it.next()).a(str, j);
                if (z) {
                    return;
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static Handler aQ() {
        return aZ;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r4, int r5) {
        /*
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = c(r4);
        if (r0 != r5) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        switch(r4) {
            case 1: goto L_0x001a;
            case 2: goto L_0x0022;
            case 3: goto L_0x002a;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x0018 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0018 }
        r2 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0018 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0018 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r0 = bb;
        r2 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0032;
    L_0x0022:
        r0 = bb;
        r2 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0032;
    L_0x002a:
        r0 = bb;
        r2 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r0 = r0[r2];
        if (r1 != 0) goto L_0x000c;
    L_0x0032:
        r1 = z();
        r2 = bb;
        r3 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r2 = r2[r3];
        r3 = 0;
        r1 = r1.getSharedPreferences(r2, r3);
        r1 = r1.edit();
        r0 = r1.putInt(r0, r5);
        r0.commit();
        r0 = com.whatsapp.u1.a();
        r0.b();
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(int, int):void");
    }

    public static void b(Context context, int i, int i2) {
        try {
            if (a0 != null) {
                a0.a(i);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            a(context, i, i2);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void c(by byVar) {
        try {
            if (a0 == byVar) {
                a0 = null;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    @Nullable
    public static String ad() {
        try {
            return ay == null ? null : ay.jabber_id;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void c(String str, String str2) {
        try {
            if (c) {
                if (!O.b(str)) {
                    try {
                        Log.w(bb[367]);
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                Log.w(bb[368]);
                M.b(co.a(str, str2));
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void a(int i, List list, boolean z, boolean z2, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        a(null, list, i, z, z2, conditionVariable, conditionVariable2, 4);
    }

    static void z(String str) {
        boolean z;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        bq.a(new a90(str, z));
    }

    public static void a(String str, byte[] bArr, byte[] bArr2, Runnable runnable) {
        b(co.a(str, bArr, bArr2, runnable), null);
    }

    static void b(com.whatsapp.contact.o oVar) {
        a(oVar);
    }

    public static boolean a(l5[] l5VarArr) {
        try {
            if (!c) {
                return false;
            }
            M.b(co.a(l5VarArr));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(a_8 com_whatsapp_a_8) {
        try {
            if (c) {
                Log.i(bb[339] + com_whatsapp_a_8.b + "/" + com_whatsapp_a_8.d);
                M.b(co.a(com_whatsapp_a_8));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean b(Context context) {
        return context.getSharedPreferences(bb[448], 0).getBoolean(bb[447], false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(@android.support.annotation.NonNull android.content.Context r7, @android.support.annotation.NonNull android.net.Uri r8, @android.support.annotation.Nullable java.lang.String r9) {
        /*
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = new android.content.Intent;
        r0 = bb;
        r3 = 372; // 0x174 float:5.21E-43 double:1.84E-321;
        r0 = r0[r3];
        r2.<init>(r0);
        r2.setData(r8);
        r0 = r7.getPackageManager();
        r3 = r0.queryIntentActivities(r2, r6);
        r0 = r3.isEmpty();	 Catch:{ NumberFormatException -> 0x0090 }
        if (r0 != 0) goto L_0x0086;
    L_0x001f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0090 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = bb;	 Catch:{ NumberFormatException -> 0x0090 }
        r5 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = r3.size();	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0090 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = 19;
        if (r0 < r4) goto L_0x0063;
    L_0x0043:
        r0 = android.provider.Telephony.Sms.getDefaultSmsPackage(r7);
        r4 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        if (r4 != 0) goto L_0x0052;
    L_0x004d:
        r2.setPackage(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        if (r1 == 0) goto L_0x0061;
    L_0x0052:
        r0 = r3.get(r6);
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r4 = r0.packageName;
        r0 = r0.name;
        r2.setClassName(r4, r0);
    L_0x0061:
        if (r1 == 0) goto L_0x0072;
    L_0x0063:
        r0 = r3.get(r6);
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r3 = r0.packageName;
        r0 = r0.name;
        r2.setClassName(r3, r0);
    L_0x0072:
        r0 = android.text.TextUtils.isEmpty(r9);	 Catch:{ NumberFormatException -> 0x0094 }
        if (r0 != 0) goto L_0x0081;
    L_0x0078:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = 371; // 0x173 float:5.2E-43 double:1.833E-321;
        r0 = r0[r3];	 Catch:{ NumberFormatException -> 0x0094 }
        r2.putExtra(r0, r9);	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x0081:
        r7.startActivity(r2);	 Catch:{ NumberFormatException -> 0x0096 }
        if (r1 == 0) goto L_0x008f;
    L_0x0086:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = 370; // 0x172 float:5.18E-43 double:1.83E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0096 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x008f:
        return;
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.content.Context, android.net.Uri, java.lang.String):void");
    }

    public static void x() {
        boolean z = DialogToastActivity.f;
        try {
            if (ay != null) {
                if (as.a()) {
                    try {
                        zb.a();
                        E();
                        if (!z) {
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            try {
                if (ay != null) {
                    try {
                        Log.i(bb[360]);
                        zb.g();
                        if (!z) {
                            return;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                zb.a();
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    static void c(Activity activity) {
        try {
            Intent intent = new Intent(bb[17]);
            intent.setData(Uri.fromParts(bb[18], bb[19], null));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            activity.startActivity(new Intent(bb[16]));
        }
    }

    public static void g(Context context, @NonNull String str) {
        Editor edit = context.getSharedPreferences(bb[366], 0).edit();
        try {
            edit.remove(str);
            if (!edit.commit()) {
                Log.e(bb[365]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3, boolean z) {
        b(co.a(str, str2, str3, z), str);
    }

    public static void b(Runnable runnable) {
        M.b(co.a(runnable));
    }

    public static void a(String str, String str2, String str3, String str4) {
        try {
            byte[] c;
            if (bb[295].equals(str4)) {
                c = aw.c(awc.a(p.au).a());
            } else {
                c = null;
            }
            b(co.a(str, str2, str3, str4, c), str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean ai() {
        try {
            if (!aZ()) {
                return false;
            }
            if (z().getSharedPreferences(bb[341], 0).getBoolean(bb[340], false)) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a_() {
        f(true);
    }

    public static boolean h(@Nullable String str) {
        try {
            if (VERSION.SDK_INT < 23) {
                return bb[137].equals(str);
            }
            try {
                if (bb[140].equals(str)) {
                    if (h(z(), bb[141]) == 0) {
                        return true;
                    }
                }
                try {
                    if (bb[138].equals(str)) {
                        if (h(z(), bb[142]) == 0) {
                            try {
                                if (h(z(), bb[139]) == -1) {
                                    return true;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    }
                    return false;
                } catch (NumberFormatException e2) {
                    throw e2;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            } catch (NumberFormatException e222) {
                throw e222;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    public static void a(boolean z, boolean z2, boolean z3, boolean z4) {
        com.whatsapp.notification.ao.c().a(z, z2, z3, z4);
    }

    public static void a(l5 l5Var, String str, pi piVar) {
        com.whatsapp.protocol.co coVar = new com.whatsapp.protocol.co(l5Var.p, str, null);
        try {
            coVar.b = av();
            b(coVar, l5Var);
            if (piVar != null) {
                if (piVar.d()) {
                    coVar.a = piVar.j;
                    coVar.A = piVar.c;
                    coVar.Q = piVar.f;
                    coVar.q = piVar.n;
                }
            }
            aK.a(coVar);
            bq.a(new aww(l5Var));
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void bb() {
        try {
            Object obj = p.bd() < 0 ? 1 : null;
            try {
                if (ay == null) {
                    return;
                }
                if (t(z()) == 3) {
                    try {
                        if (p.bd() >= 0) {
                            try {
                                if (System.currentTimeMillis() - p.bd() < com.whatsapp.contact.i.b(z())) {
                                    return;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        try {
                            Log.i(bb[351]);
                            a(com.whatsapp.contact.o.BACKGROUND_FULL);
                            if (obj != null) {
                                Log.i(bb[352]);
                                PerformSyncManager.e(z());
                                PerformSyncManager.c(z());
                                k();
                                P();
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            } catch (NumberFormatException e222) {
                throw e222;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    public static void aV() {
        boolean z = DialogToastActivity.f;
        Iterator it = aY.iterator();
        while (it.hasNext()) {
            ((a34) it.next()).a();
            if (z) {
                return;
            }
        }
    }

    static void u(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((tm) it.next()).d(str);
            if (z) {
                return;
            }
        }
    }

    public static void a(tm tmVar) {
        A.remove(tmVar);
    }

    public static int k(Context context) {
        return context.getSharedPreferences(bb[347], 0).getInt(bb[348], 6);
    }

    public void e() {
        Log.i(bb[620]);
        aE();
    }

    public static void bc() {
        Object obj = null;
        boolean z = DialogToastActivity.f;
        NetworkInfo[] allNetworkInfo = ad.getAllNetworkInfo();
        StringBuilder stringBuilder = new StringBuilder(bb[292]);
        if (allNetworkInfo != null) {
            int length = allNetworkInfo.length;
            int i = 0;
            while (i < length) {
                NetworkInfo networkInfo = allNetworkInfo[i];
                if (networkInfo.getState() != State.UNKNOWN) {
                    stringBuilder.append("\n").append(networkInfo.toString()).append(bb[294]).append(networkInfo.getType()).append(bb[291]).append(networkInfo.getSubtype());
                    Log.i(stringBuilder.toString());
                    obj = 1;
                }
                i++;
                if (z) {
                    break;
                }
            }
            if (obj == null) {
                try {
                    Log.i(bb[290]);
                    if (!z) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return;
        }
        Log.e(bb[293]);
    }

    public static void a(Uri uri, Uri.Builder builder) {
        String w = p.w();
        if (w != null) {
            try {
                builder.authority(w).path(uri.getHost()).appendEncodedPath(uri.getEncodedPath());
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    private static void aU() {
        long j = -1;
        boolean z = DialogToastActivity.f;
        try {
            if (B) {
                v(bb[594]);
                a(z(), false, 0);
                if (!z) {
                    return;
                }
            }
            try {
                if (aI) {
                    try {
                        v(bb[593]);
                        SpamWarningActivity.c(true);
                        if (!z) {
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                v(bb[596]);
                SpamWarningActivity.c(false);
                if (b(z())) {
                    Intent intent = new Intent(null, null, z(), SpamWarningActivity.class);
                    intent.setFlags(268435456);
                    long o = o(z());
                    if (o != -1) {
                        o = (o - System.currentTimeMillis()) / 1000;
                    }
                    if (o > 0) {
                        j = o;
                    }
                    intent.putExtra(bb[595], (int) j);
                    z().startActivity(intent);
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    static void H(String str) {
        boolean z = DialogToastActivity.f;
        try {
            List<RunningAppProcessInfo> runningAppProcesses = w.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    try {
                        if (TextUtils.equals(runningAppProcessInfo.processName, str)) {
                            Log.i(bb[361] + runningAppProcessInfo.processName + ' ' + runningAppProcessInfo.pid);
                            if (!z) {
                                return;
                            }
                        }
                        if (z) {
                            return;
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
        } catch (Exception e22) {
            Log.w(bb[362] + e22);
        }
    }

    public static void a(by byVar, String str) {
        if (byVar != null) {
            try {
                byVar.f(str);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        a(z(), str, 0);
    }

    static void aa() {
        a(z(), 2131232181, 0);
    }

    public static boolean a(@NonNull as8 com_whatsapp_as8) {
        String externalStorageState = Environment.getExternalStorageState();
        try {
            if (bb[506].equals(externalStorageState)) {
                com_whatsapp_as8.b(externalStorageState);
                return false;
            }
            try {
                if (bb[505].equals(externalStorageState)) {
                    try {
                        if (h(z(), bb[507]) != -1) {
                            return true;
                        }
                        com_whatsapp_as8.a();
                        return false;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                com_whatsapp_as8.a(externalStorageState);
                return false;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private static void X() {
        l = true;
        aG();
    }

    public static void a(boolean z, com.whatsapp.protocol.b5 b5Var) {
        if (c) {
            Log.i(bb[193] + z);
            String u = M.u();
            M.a(u, co.a(u, z, new aok(z), b5Var)).get();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date ar() {
        /*
        r0 = -1;
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 == 0) goto L_0x0020;
    L_0x0005:
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = r1.number;	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 != 0) goto L_0x0020;
    L_0x000f:
        r1 = ay;	 Catch:{ NumberFormatException -> 0x0046 }
        r1 = r1.number;	 Catch:{ NumberFormatException -> 0x0046 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ NumberFormatException -> 0x0046 }
        r2 = r1.longValue();	 Catch:{ NumberFormatException -> 0x0046 }
        r4 = 14;
        r0 = r2 % r4;
        r0 = (int) r0;
    L_0x0020:
        r1 = am;	 Catch:{ NumberFormatException -> 0x0066 }
        if (r1 != 0) goto L_0x0035;
    L_0x0024:
        if (r0 < 0) goto L_0x0035;
    L_0x0026:
        r1 = 13;
        if (r0 > r1) goto L_0x0035;
    L_0x002a:
        r0 = r0 + -6;
        r0 = (long) r0;
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = r0 * r2;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0037;
    L_0x0035:
        r0 = 0;
    L_0x0037:
        r2 = new java.util.Date;
        r3 = com.whatsapp.as7.a;
        r4 = r3.getTime();
        r0 = r0 + r4;
        r2.<init>(r0);
        return r2;
    L_0x0044:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = ay;
        r2 = r2.number;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x0020;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.ar():java.util.Date");
    }

    public static uj r(String str) {
        uj i = wn.i(str);
        if (i == null) {
            return null;
        }
        try {
            if (wn.q()) {
                d(false);
            }
            String a = wn.a(i.b, i.d);
            if (a == null) {
                return null;
            }
            try {
                a(i.a, i.e, i.c, a, 0);
                return i;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static boolean d(com.whatsapp.protocol.co coVar) {
        return a(coVar);
    }

    public static void b(com.whatsapp.protocol.co coVar) {
        try {
            if (coVar.c != null) {
                coVar.Q = new MediaData();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void y(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((tm) it.next()).a(str);
            if (z) {
                return;
            }
        }
    }

    public static void k(boolean z) {
        if (c) {
            Log.i(bb[6] + z);
            M.b(co.a(null, z, new auk(z), new ain(z)));
        }
    }

    public static void b(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[523], 0).edit();
        try {
            edit.putInt(bb[522], i);
            if (!edit.commit()) {
                Log.e(bb[521]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r3, int r4, int r5) {
        /*
        r0 = 1;
        r1 = com.whatsapp.l5.e(r3);	 Catch:{ NumberFormatException -> 0x0008 }
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        if (r3 != 0) goto L_0x0020;
    L_0x000c:
        r1 = j;	 Catch:{ NumberFormatException -> 0x001e }
        if (r1 != r0) goto L_0x0007;
    L_0x0010:
        r0 = new java.lang.NullPointerException;	 Catch:{ NumberFormatException -> 0x001c }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x001c }
        r2 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x001c }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x001c }
        throw r0;	 Catch:{ NumberFormatException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001c }
    L_0x0020:
        r1 = r3.length();	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 == 0) goto L_0x0032;
    L_0x0026:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0044 }
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = r1.equals(r3);	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 == 0) goto L_0x0048;
    L_0x0032:
        r1 = j;	 Catch:{ NumberFormatException -> 0x0046 }
        if (r1 != r0) goto L_0x0007;
    L_0x0036:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0042 }
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0042 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0042 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0048:
        r1 = J();
        if (r1 == 0) goto L_0x0007;
    L_0x004e:
        r1 = 0;
        r2 = r5 & 1;
        if (r2 == 0) goto L_0x005c;
    L_0x0053:
        r2 = Q;	 Catch:{ NumberFormatException -> 0x00f9 }
        r2 = r2.b(r3);	 Catch:{ NumberFormatException -> 0x00f9 }
        if (r2 == 0) goto L_0x005c;
    L_0x005b:
        r1 = r0;
    L_0x005c:
        r2 = r5 & 2;
        if (r2 == 0) goto L_0x0101;
    L_0x0060:
        r2 = a2;	 Catch:{ NumberFormatException -> 0x00fb }
        r2 = r2.b(r3);	 Catch:{ NumberFormatException -> 0x00fb }
        if (r2 == 0) goto L_0x0101;
    L_0x0068:
        if (r0 == 0) goto L_0x0007;
    L_0x006a:
        r0 = c;	 Catch:{ NumberFormatException -> 0x00fd }
        if (r0 == 0) goto L_0x00b1;
    L_0x006e:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00ff }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x00ff }
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x00ff }
        r2 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r5);	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x00ff }
        r2 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00ff }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = M;	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = com.whatsapp.messaging.co.a(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x00ff }
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x00ff }
        if (r0 == 0) goto L_0x0007;
    L_0x00b1:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = bb;
        r2 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r1 = bb;
        r2 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r1 = k;
        monitor-enter(r1);
        r0 = k;	 Catch:{ all -> 0x00f6 }
        r2 = com.whatsapp.messaging.co.a(r3, r4, r5);	 Catch:{ all -> 0x00f6 }
        r0.put(r3, r2);	 Catch:{ all -> 0x00f6 }
        monitor-exit(r1);	 Catch:{ all -> 0x00f6 }
        goto L_0x0007;
    L_0x00f6:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f6 }
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = r1;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, int, int):void");
    }

    public static void d(Context context, String str) {
        a(context, str, (Location) null);
    }

    public static void L() {
        try {
            if (c) {
                Log.i(bb[260]);
                M.b(co.g(bb[259]));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean s() {
        return s;
    }

    public static void b(String str, String str2, String str3, boolean z) {
        b(co.b(str, str2, str3, z), str);
    }

    public static boolean v(Context context) {
        try {
            if (h(context, bb[618]) == 0) {
                if (h(context, bb[619]) == 0) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void b(by byVar) {
        if (byVar == null) {
            byVar = an();
        }
        if (byVar != null) {
            try {
                byVar.e();
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        auv.a(bb[607]);
        Log.w(bb[606]);
    }

    public static void f(String str, String str2, String str3) {
        b(co.e(str, str2, str3), str2);
    }

    public static Application z() {
        return p.au;
    }

    public static void G() {
        x = true;
    }
}
