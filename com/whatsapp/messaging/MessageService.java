package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.App;
import com.whatsapp.Voip;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.nf;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class MessageService extends Service {
    private static final String[] J;
    private static final String a;
    private static final AtomicBoolean l;
    private static CountDownLatch r;
    private static final String w;
    private static final String y;
    private Handler A;
    private final Map B;
    private final a2 C;
    private boolean D;
    private long E;
    private final av F;
    private int G;
    private ah H;
    private final Object I;
    private boolean b;
    private long c;
    private final BroadcastReceiver d;
    private a8 e;
    private HandlerThread f;
    private final av g;
    private final av h;
    private boolean i;
    private final Object j;
    private final BroadcastReceiver k;
    private final n m;
    private final Map n;
    private c o;
    private final Handler p;
    private String q;
    private boolean s;
    private final a5 t;
    private AtomicInteger u;
    private final BroadcastReceiver v;
    private final Random x;
    private byte[] z;

    class 1 extends BroadcastReceiver {
        private static final String[] z;
        final MessageService a;

        static {
            String[] strArr = new String[4];
            String str = "{\u007fxk-su2w'n?\u007fv,t?_V\fTT_M\u000bLXH@\u001dYY]W\u0005_";
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
                            i3 = 26;
                            break;
                        case at.g /*1*/:
                            i3 = 17;
                            break;
                        case at.i /*2*/:
                            i3 = 28;
                            break;
                        case at.o /*3*/:
                            i3 = 25;
                            break;
                        default:
                            i3 = 66;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "o\u007fww-m\u007f<p,ntrmbht\u007f|+ltx9+t1\u007fv,tt\u007fm+lxh`bht\u007f|+ltn9";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "|puu'~1hvbj~ombyyyz)Tthn-hzOm#nt<k7t\u007f}{.\u007f+<";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "|puu'~1hvbj~ombyyyz)Tthn-hzOm#nt<k7t\u007f}{.\u007f+<";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        1(MessageService messageService) {
            this.a = messageService;
        }

        public void onReceive(Context context, Intent intent) {
            int i = co.a;
            if (z[0].equals(intent.getAction())) {
                if (!MessageService.i(this.a).post(new a4(this))) {
                    Log.w(z[1] + intent);
                }
                if (i == 0) {
                    return;
                }
            }
            if (MessageService.e().equals(intent.getAction())) {
                if (!MessageService.i(this.a).post(new p(this))) {
                    Log.w(z[3] + intent);
                }
                if (i == 0) {
                    return;
                }
            }
            Log.w(z[2] + intent);
        }
    }

    class 3 extends BroadcastReceiver {
        private static final String[] z;
        final MessageService a;

        static {
            String[] strArr = new String[3];
            String str = "]\u0013\u0010\u0005}V\u001b\u0012\u0003;F\u001bO\u0019=B\u0011\u0015\u0001\u007fQ\u0017\r\u0010 \u0005\u0017\u0007\u001b=W\u0017\u000e\u0012rA\u000b\u0005U&J^\u000e\u0000>I^\u0013\u0010<A\u0017\u000e\u0012rF\u0016\u0001\u001b<@\u0012";
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
                            i3 = 126;
                            break;
                        case at.i /*2*/:
                            i3 = 96;
                            break;
                        case at.o /*3*/:
                            i3 = 117;
                            break;
                        default:
                            i3 = 82;
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
                        str = "]\u0013\u0010\u0005}V\u001b\u0012\u0003;F\u001bO\u0019=B\u0011\u0015\u0001\u007fQ\u0017\r\u0010 \n\n\t\u00187J\u000b\u0014";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "P\u0010\u000b\u001b=R\u0010@\u001c<Q\u001b\u000e\u0001rW\u001b\u0003\u0010;S\u001b\u0004U;K^\f\u001a5J\u000b\u0014U @\u001d\u0005\u001c$@\f@";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        3(MessageService messageService) {
            this.a = messageService;
        }

        public void onReceive(Context context, Intent intent) {
            int i = co.a;
            if (MessageService.m().equals(intent.getAction())) {
                Log.i(z[2]);
                if (!App.q(this.a)) {
                    MessageService.e(this.a);
                    MessageService.g(this.a);
                    if (i == 0) {
                        return;
                    }
                }
                if (Voip.d()) {
                    MessageService.c(this.a);
                    MessageService.b(this.a).b();
                    if (i == 0) {
                        return;
                    }
                }
                if (MessageService.b(this.a) != null) {
                    MessageService.b(this.a).a(false);
                    if (i == 0) {
                        return;
                    }
                }
                Log.i(z[0]);
                if (i == 0) {
                    return;
                }
            }
            Log.w(z[1] + intent);
        }
    }

    class 4 extends BroadcastReceiver {
        private static final String[] z;
        final MessageService a;

        static {
            String[] strArr = new String[2];
            String str = "I\u00078z\u0016B\u000f:|PR\u000fgiUX\u000f&~\u0014A\u0003&m\\CG<cTT\u0018glPC\u000fs*JT\u0004,cWV) kW_\u000f$$WX\u0006w7";
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
                            i3 = 49;
                            break;
                        case at.g /*1*/:
                            i3 = arj.Theme_ratingBarStyle;
                            break;
                        case at.i /*2*/:
                            i3 = 72;
                            break;
                        case at.o /*3*/:
                            i3 = 10;
                            break;
                        default:
                            i3 = 57;
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
                        str = "D\u0004#dVF\u0004hcWE\u000f&~\u0019C\u000f+oPG\u000f,*P_J+fPT\u0004<*IX\u0004/oK\u0011\u0018-i\\X\u001c-x\u0019";
                        obj = null;
                }
            }
        }

        4(MessageService messageService) {
            this.a = messageService;
        }

        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            if (MessageService.h().equals(intent.getAction())) {
                StringBuilder append = new StringBuilder().append(z[0]);
                if (MessageService.b(this.a) == null) {
                    z = true;
                }
                Log.i(append.append(z).toString());
                if (MessageService.b(this.a) != null) {
                    MessageService.b(this.a).b();
                    if (co.a == 0) {
                        return;
                    }
                }
                return;
            }
            Log.w(z[1] + intent);
        }
    }

    private void n() {
        synchronized (this.I) {
            boolean z;
            av avVar = this.g;
            if (App.q((Context) this)) {
                z = false;
            } else {
                z = true;
            }
            avVar.a(z);
        }
    }

    private void a(int i) {
        try {
            if (i != this.G) {
                try {
                    Log.i(J[28] + this.G + J[27] + i);
                    if (this.e != null) {
                        this.e.a(true);
                    }
                    this.G = i;
                    nf.a((Context) this);
                } catch (NullPointerException e) {
                    throw e;
                }
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public void A() {
        try {
            if (this.e != null) {
                this.e.e();
                if (co.a == 0) {
                    return;
                }
            }
            Log.i(J[48]);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public Future a(ct ctVar, Message message) {
        if (ctVar == null) {
            try {
                throw new NullPointerException(J[1]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        b7 rVar = new r();
        a(ctVar, rVar);
        b(message);
        return rVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t() {
        /*
        r14 = this;
        r13 = 1;
        r12 = 0;
        r1 = com.whatsapp.messaging.co.a;
        r0 = r14.i;	 Catch:{ NullPointerException -> 0x0012 }
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = J;	 Catch:{ NullPointerException -> 0x0012 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0012 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r0 = J;
        r2 = 8;
        r0 = r0[r2];
        r0 = r14.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r2 = android.os.SystemClock.elapsedRealtime();
        r4 = new android.content.Intent;
        r5 = com.whatsapp.messaging.MessageService.class;
        r4.<init>(r14, r5);
        r5 = J;
        r6 = 9;
        r5 = r5[r6];
        r4 = r4.setAction(r5);
        r5 = J;
        r6 = 7;
        r5 = r5[r6];
        r4 = r4.putExtra(r5, r13);
        r6 = r14.y();
        r8 = 0;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 != 0) goto L_0x0057;
    L_0x0048:
        r0 = J;	 Catch:{ NullPointerException -> 0x0055 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0055 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0055 }
        r14.startService(r4);	 Catch:{ NullPointerException -> 0x0055 }
        goto L_0x0011;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r8 = 2;
        r8 = r6 / r8;
        r5 = r14.x;
        r10 = r5.nextLong();
        r6 = r10 % r6;
        r6 = r6 + r8;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r8 = J;
        r9 = 12;
        r8 = r8[r9];
        r5 = r5.append(r8);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r4 = android.app.PendingIntent.getService(r14, r12, r4, r12);
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x00a7 }
        r8 = 23;
        if (r5 < r8) goto L_0x0090;
    L_0x0088:
        r5 = 2;
        r8 = r2 + r6;
        r0.setExactAndAllowWhileIdle(r5, r8, r4);	 Catch:{ NullPointerException -> 0x00a9 }
        if (r1 == 0) goto L_0x00a3;
    L_0x0090:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x00ab }
        r8 = 19;
        if (r5 < r8) goto L_0x009e;
    L_0x0096:
        r5 = 2;
        r8 = r2 + r6;
        r0.setExact(r5, r8, r4);	 Catch:{ NullPointerException -> 0x00ad }
        if (r1 == 0) goto L_0x00a3;
    L_0x009e:
        r1 = 2;
        r2 = r2 + r6;
        r0.set(r1, r2, r4);	 Catch:{ NullPointerException -> 0x00ad }
    L_0x00a3:
        r14.i = r13;
        goto L_0x0011;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.t():void");
    }

    static void a(MessageService messageService, boolean z) {
        messageService.b(z);
    }

    private void a(boolean z) {
        this.D = z;
    }

    static void h(MessageService messageService) {
        messageService.f();
    }

    private void B() {
        try {
            if (!this.D) {
                Log.i(J[39]);
                a(true);
                this.H = new ah(this, this.C);
                this.H.start();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void b(Context context) {
        context.startService(new Intent(context, MessageService.class).setAction(J[35]));
    }

    private void s() {
        int i = co.a;
        synchronized (this.n) {
            for (Entry value : this.n.entrySet()) {
                ((b7) value.getValue()).b();
                if (i != 0) {
                    break;
                }
            }
            this.n.clear();
        }
    }

    private void a(Message message) {
        try {
            if (co.a(message) == 67) {
                l();
            }
            this.o.a(message);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(a8 a8Var) {
        this.e = a8Var;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(J[15])).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            try {
                this.G = activeNetworkInfo.getType();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.f = new HandlerThread(J[17]);
        this.f.start();
        this.A = new Handler(this.f.getLooper());
        registerReceiver(this.d, new IntentFilter(y), null, this.A);
        if (registerReceiver(this.d, new IntentFilter(J[16]), null, this.A) == null) {
            try {
                this.A.post(new ca(this));
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        try {
            a(true, false, null, null);
            if (this.o != null) {
                this.o.i();
            }
            nf.a((Context) this);
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public MessageService() {
        int i = co.a;
        this.m = new n(this);
        this.t = new a5(this);
        this.C = new a2(this, Looper.getMainLooper());
        this.u = new AtomicInteger();
        this.b = false;
        this.G = -1;
        this.j = new Object();
        this.c = 0;
        this.E = 10000;
        this.x = new Random();
        this.I = new Object();
        this.g = new av(3, J[30], true);
        this.h = new av(3, J[31], false);
        this.F = new av(3, J[29], true);
        this.n = new HashMap();
        this.B = new HashMap();
        this.s = false;
        this.d = new 1(this);
        this.p = new Handler(new al(this));
        this.k = new 3(this);
        this.v = new 4(this);
        if (WAAppCompatActivity.c != 0) {
            co.a = i + 1;
        }
    }

    private boolean w() {
        boolean z = false;
        synchronized (this.k) {
            if (PendingIntent.getBroadcast(this, 0, a(), 1610612736) != null) {
                z = true;
            }
            Log.i(J[20] + z);
        }
        return z;
    }

    private long y() {
        long j = 172800000;
        synchronized (this.j) {
            if (this.c > 172800000) {
            } else {
                this.E += this.c;
                this.c = this.E - this.c;
                j = this.E - this.c;
            }
        }
        return j;
    }

    static void a(MessageService messageService, a8 a8Var) {
        messageService.a(a8Var);
    }

    private void r() {
        Log.i(J[13]);
        AlarmManager alarmManager = (AlarmManager) getSystemService(J[14]);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(a), 536870912);
        if (broadcast != null) {
            try {
                alarmManager.cancel(broadcast);
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r11, int r12, int r13) {
        /*
        r10 = this;
        r9 = 1;
        r8 = 0;
        r1 = com.whatsapp.messaging.co.a;
        r0 = com.whatsapp.App.U();	 Catch:{ NullPointerException -> 0x0014 }
        if (r0 == 0) goto L_0x0016;
    L_0x000a:
        r0 = J;	 Catch:{ NullPointerException -> 0x0014 }
        r1 = 65;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0014 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NullPointerException -> 0x0014 }
    L_0x0013:
        return r9;
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        if (r11 == 0) goto L_0x00bf;
    L_0x0018:
        r0 = r11.getAction();	 Catch:{ NullPointerException -> 0x00bd }
    L_0x001c:
        if (r0 != 0) goto L_0x0023;
    L_0x001e:
        r10.B();	 Catch:{ NullPointerException -> 0x00c2 }
        if (r1 == 0) goto L_0x0013;
    L_0x0023:
        r2 = J;	 Catch:{ NullPointerException -> 0x00c4 }
        r3 = 71;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c4 }
        r2 = r0.equals(r2);	 Catch:{ NullPointerException -> 0x00c4 }
        if (r2 == 0) goto L_0x003a;
    L_0x002f:
        r10.c();	 Catch:{ NullPointerException -> 0x00c6 }
        r2 = 1;
        r10.s = r2;	 Catch:{ NullPointerException -> 0x00c6 }
        r10.stopSelf();	 Catch:{ NullPointerException -> 0x00c6 }
        if (r1 == 0) goto L_0x0013;
    L_0x003a:
        r2 = J;	 Catch:{ NullPointerException -> 0x00c8 }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c8 }
        r2 = r0.equals(r2);	 Catch:{ NullPointerException -> 0x00c8 }
        if (r2 == 0) goto L_0x004e;
    L_0x0046:
        r2 = 0;
        r10.s = r2;	 Catch:{ NullPointerException -> 0x00ca }
        r10.B();	 Catch:{ NullPointerException -> 0x00ca }
        if (r1 == 0) goto L_0x0013;
    L_0x004e:
        r2 = J;	 Catch:{ NullPointerException -> 0x00ca }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00ca }
        r2 = r0.equals(r2);	 Catch:{ NullPointerException -> 0x00ca }
        if (r2 == 0) goto L_0x009b;
    L_0x005a:
        r10.i = r8;
        r10.B();
        r2 = J;
        r3 = 73;
        r2 = r2[r3];
        r2 = r11.getBooleanExtra(r2, r8);
        r3 = J;
        r4 = 66;
        r3 = r3[r4];
        r3 = r11.getBooleanExtra(r3, r8);
        r4 = J;
        r5 = 70;
        r4 = r4[r5];
        r4 = r11.getBooleanExtra(r4, r8);
        r5 = J;
        r6 = 72;
        r5 = r5[r6];
        r5 = r11.getStringExtra(r5);
        r6 = J;
        r7 = 74;
        r6 = r6[r7];
        r6 = r11.getStringArrayExtra(r6);
        if (r2 == 0) goto L_0x0096;
    L_0x0093:
        r10.q();	 Catch:{ NullPointerException -> 0x00cc }
    L_0x0096:
        r10.a(r3, r4, r5, r6);	 Catch:{ NullPointerException -> 0x00ce }
        if (r1 == 0) goto L_0x0013;
    L_0x009b:
        r1 = J;	 Catch:{ NullPointerException -> 0x00ce }
        r2 = 75;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00ce }
        r0 = r0.equals(r1);	 Catch:{ NullPointerException -> 0x00ce }
        if (r0 == 0) goto L_0x0013;
    L_0x00a7:
        r10.B();
        r0 = J;
        r1 = 69;
        r0 = r0[r1];
        r0 = r11.getBooleanExtra(r0, r8);
        if (r0 == 0) goto L_0x0013;
    L_0x00b6:
        r10.d();	 Catch:{ NullPointerException -> 0x00bb }
        goto L_0x0013;
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = 0;
        goto L_0x001c;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.onStartCommand(android.content.Intent, int, int):int");
    }

    private void x() {
        synchronized (this.k) {
            Log.i(J[46]);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, a(), 1610612736);
            if (broadcast != null) {
                ((AlarmManager) getSystemService(J[47])).cancel(broadcast);
                broadcast.cancel();
            }
        }
    }

    static Handler i(MessageService messageService) {
        return messageService.A;
    }

    static void a(MessageService messageService, b3 b3Var) {
        messageService.a(b3Var);
    }

    static void g(MessageService messageService) {
        messageService.d();
    }

    static void e(MessageService messageService) {
        messageService.x();
    }

    private void o() {
        this.o.e();
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, String str, String[] strArr) {
        context.startService(new Intent(context, MessageService.class).setAction(J[40]).putExtra(J[45], z).putExtra(J[42], z2).putExtra(J[43], z3).putExtra(J[44], str).putExtra(J[41], strArr));
    }

    public String u() {
        return "0" + Integer.toHexString(this.u.getAndIncrement());
    }

    static void a(MessageService messageService, Message message) {
        messageService.a(message);
    }

    static void d(MessageService messageService) {
        messageService.p();
    }

    static void a(MessageService messageService, String str) {
        messageService.a(str);
    }

    static void c(MessageService messageService, boolean z) {
        messageService.c(z);
    }

    static void c(MessageService messageService) {
        messageService.l();
    }

    static void b(MessageService messageService, boolean z) {
        messageService.d(z);
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            Log.i(J[26]);
            if (this.D) {
                c();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(ct ctVar) {
        Log.i(J[49] + ctVar);
        synchronized (this.B) {
            b7 b7Var = (b7) this.B.remove(ctVar);
        }
        if (b7Var != null) {
            try {
                b7Var.a();
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    private void p() {
        this.o.f();
    }

    private void f() {
        this.o.g();
    }

    static void f(MessageService messageService) {
        messageService.o();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r10 = this;
        r8 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r1 = com.whatsapp.messaging.co.a;
        r2 = r10.k;
        monitor-enter(r2);
        r0 = J;	 Catch:{ all -> 0x005e }
        r3 = 3;
        r0 = r0[r3];	 Catch:{ all -> 0x005e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x005e }
        r0 = J;	 Catch:{ all -> 0x005e }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ all -> 0x005e }
        r0 = r10.getSystemService(r0);	 Catch:{ all -> 0x005e }
        r0 = (android.app.AlarmManager) r0;	 Catch:{ all -> 0x005e }
        r3 = 0;
        r4 = r10.a();	 Catch:{ all -> 0x005e }
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.app.PendingIntent.getBroadcast(r10, r3, r4, r5);	 Catch:{ all -> 0x005e }
        r0.cancel(r3);	 Catch:{ NullPointerException -> 0x0056 }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x0056 }
        r5 = 23;
        if (r4 < r5) goto L_0x003a;
    L_0x002f:
        r4 = 2;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NullPointerException -> 0x0056 }
        r6 = r6 + r8;
        r0.setExactAndAllowWhileIdle(r4, r6, r3);	 Catch:{ NullPointerException -> 0x0056 }
        if (r1 == 0) goto L_0x0054;
    L_0x003a:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x0058 }
        r5 = 19;
        if (r4 < r5) goto L_0x004b;
    L_0x0040:
        r4 = 2;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NullPointerException -> 0x005a }
        r6 = r6 + r8;
        r0.setExact(r4, r6, r3);	 Catch:{ NullPointerException -> 0x005a }
        if (r1 == 0) goto L_0x0054;
    L_0x004b:
        r1 = 2;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NullPointerException -> 0x005c }
        r4 = r4 + r8;
        r0.set(r1, r4, r3);	 Catch:{ NullPointerException -> 0x005c }
    L_0x0054:
        monitor-exit(r2);	 Catch:{ all -> 0x005e }
        return;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x005e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.i():void");
    }

    static String e() {
        return y;
    }

    static void a(MessageService messageService, ct ctVar) {
        messageService.a(ctVar);
    }

    private Intent a() {
        return new Intent(w).setPackage(J[22]);
    }

    public void a(String str, byte[] bArr, c cVar) {
        try {
            this.q = str;
            this.z = bArr;
            this.o = cVar;
            a(true, false, null, null);
            if (this.e != null) {
                cVar.i();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(String str, byte[] bArr) {
        this.q = str;
        this.z = bArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(boolean r4) {
        /*
        r3 = this;
        r1 = r3.I;
        monitor-enter(r1);
        r0 = r3.F;	 Catch:{ all -> 0x004e }
        r2 = 1;
        r0.a(r2);	 Catch:{ all -> 0x004e }
        r0 = r3.o;	 Catch:{ all -> 0x004e }
        r0.h();	 Catch:{ all -> 0x004e }
        r3.s();	 Catch:{ all -> 0x004e }
        r3.z();	 Catch:{ all -> 0x004e }
        r0 = r3.u;	 Catch:{ all -> 0x004e }
        r2 = 0;
        r0.set(r2);	 Catch:{ all -> 0x004e }
        r3.r();	 Catch:{ all -> 0x004e }
        r3.x();	 Catch:{ all -> 0x004e }
        if (r4 == 0) goto L_0x0046;
    L_0x0022:
        r0 = J;	 Catch:{ all -> 0x004e }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ all -> 0x004e }
        r0 = r3.getSystemService(r0);	 Catch:{ all -> 0x004e }
        r0 = (android.net.ConnectivityManager) r0;	 Catch:{ all -> 0x004e }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ all -> 0x004e }
        if (r0 == 0) goto L_0x0040;
    L_0x0033:
        r0 = r0.isConnected();	 Catch:{ NullPointerException -> 0x0048 }
        if (r0 == 0) goto L_0x0040;
    L_0x0039:
        r3.t();	 Catch:{ NullPointerException -> 0x004a }
        r0 = com.whatsapp.messaging.co.a;	 Catch:{ NullPointerException -> 0x004a }
        if (r0 == 0) goto L_0x0046;
    L_0x0040:
        r0 = r3.g;	 Catch:{ NullPointerException -> 0x004c }
        r2 = 1;
        r0.a(r2);	 Catch:{ NullPointerException -> 0x004c }
    L_0x0046:
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        return;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.d(boolean):void");
    }

    public Future a(String str, Message message) {
        if (str == null) {
            try {
                throw new NullPointerException(J[38]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        b7 rVar = new r();
        a(str, rVar);
        b(message);
        return rVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r13) {
        /*
        r12 = this;
        r3 = 1;
        r10 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r1 = 0;
        r5 = com.whatsapp.messaging.co.a;
        r0 = J;
        r2 = 58;
        r0 = r0[r2];
        r0 = r12.getSystemService(r0);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.getActiveNetworkInfo();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = J;
        r6 = 59;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r2 = r2.append(r0);
        r4 = J;
        r6 = 60;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r2 = r2.append(r13);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.App.bc();
        if (r0 != 0) goto L_0x0054;
    L_0x0044:
        r2 = r12.p;	 Catch:{ NullPointerException -> 0x00ce }
        r4 = r12.p;	 Catch:{ NullPointerException -> 0x00ce }
        r6 = 0;
        r7 = -1;
        r8 = 0;
        r4 = android.os.Message.obtain(r4, r6, r7, r8);	 Catch:{ NullPointerException -> 0x00ce }
        r2.sendMessage(r4);	 Catch:{ NullPointerException -> 0x00ce }
        if (r5 == 0) goto L_0x0120;
    L_0x0054:
        r2 = r0.getState();	 Catch:{ NullPointerException -> 0x00d0 }
        r4 = android.net.NetworkInfo.State.CONNECTED;	 Catch:{ NullPointerException -> 0x00d0 }
        if (r2 != r4) goto L_0x00d2;
    L_0x005c:
        r4 = r3;
    L_0x005d:
        if (r4 == 0) goto L_0x011d;
    L_0x005f:
        r2 = com.whatsapp.messaging.CaptivePortalActivity.a(r0);
    L_0x0063:
        r6 = r12.p;	 Catch:{ NullPointerException -> 0x00d4 }
        r7 = r12.p;	 Catch:{ NullPointerException -> 0x00d4 }
        r8 = 0;
        r9 = r0.getType();	 Catch:{ NullPointerException -> 0x00d4 }
        if (r4 == 0) goto L_0x00d8;
    L_0x006e:
        if (r2 != 0) goto L_0x00d8;
    L_0x0070:
        r0 = r3;
    L_0x0071:
        r0 = android.os.Message.obtain(r7, r8, r9, r0);	 Catch:{ NullPointerException -> 0x00da }
        r6.sendMessage(r0);	 Catch:{ NullPointerException -> 0x00da }
        if (r4 == 0) goto L_0x00e6;
    L_0x007a:
        if (r2 == 0) goto L_0x00e6;
    L_0x007c:
        if (r13 != 0) goto L_0x0111;
    L_0x007e:
        r0 = new android.content.Intent;
        r2 = y;
        r0.<init>(r2);
        r2 = r12.getApplicationContext();
        r1 = android.app.PendingIntent.getBroadcast(r2, r1, r0, r1);
        r0 = J;
        r2 = 57;
        r0 = r0[r2];
        r0 = r12.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x00de }
        r3 = 23;
        if (r2 < r3) goto L_0x00aa;
    L_0x009f:
        r2 = 2;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NullPointerException -> 0x00e0 }
        r6 = r6 + r10;
        r0.setExactAndAllowWhileIdle(r2, r6, r1);	 Catch:{ NullPointerException -> 0x00e0 }
        if (r5 == 0) goto L_0x00c4;
    L_0x00aa:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x00e2 }
        r3 = 19;
        if (r2 < r3) goto L_0x00bb;
    L_0x00b0:
        r2 = 2;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NullPointerException -> 0x00e4 }
        r6 = r6 + r10;
        r0.setExact(r2, r6, r1);	 Catch:{ NullPointerException -> 0x00e4 }
        if (r5 == 0) goto L_0x00c4;
    L_0x00bb:
        r2 = 2;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NullPointerException -> 0x00e4 }
        r4 = r4 + r10;
        r0.set(r2, r4, r1);	 Catch:{ NullPointerException -> 0x00e4 }
    L_0x00c4:
        r0 = J;
        r1 = 61;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x00cd:
        return;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r4 = r1;
        goto L_0x005d;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = r1;
        goto L_0x0071;
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = new android.content.Intent;
        r3 = y;
        r0.<init>(r3);
        r3 = r12.getApplicationContext();
        r4 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r1 = android.app.PendingIntent.getBroadcast(r3, r1, r0, r4);
        if (r1 == 0) goto L_0x0111;
    L_0x00f9:
        r0 = J;
        r3 = 62;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = J;
        r3 = 56;
        r0 = r0[r3];
        r0 = r12.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r0.cancel(r1);
    L_0x0111:
        r0 = r2;
    L_0x0112:
        r1 = l;
        r1.set(r0);
        r0 = r;
        r0.countDown();
        goto L_0x00cd;
    L_0x011d:
        r2 = r1;
        goto L_0x0063;
    L_0x0120:
        r0 = r1;
        goto L_0x0112;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.b(boolean):void");
    }

    private void c() {
        try {
            Log.i(J[51]);
            if (this.D) {
                a(false);
                synchronized (this.I) {
                    if (!this.F.a()) {
                        this.o.h();
                    }
                    this.F.a(true);
                }
                try {
                    if (this.e != null) {
                        unregisterReceiver(this.d);
                        this.f.quit();
                        try {
                            this.f.join();
                        } catch (InterruptedException e) {
                            Log.w(J[50]);
                            Thread.currentThread().interrupt();
                        }
                        try {
                            this.f = null;
                            this.A = null;
                            r = new CountDownLatch(1);
                            l.set(false);
                            this.e.d();
                            this.e = null;
                            if (co.a == 0) {
                                return;
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    }
                    this.H.quit();
                } catch (NullPointerException e3) {
                    throw e3;
                }
            }
        } catch (InterruptedException e22) {
            throw e22;
        }
    }

    private void a(String str) {
        synchronized (this.n) {
            b7 b7Var = (b7) this.n.remove(str);
        }
        if (b7Var != null) {
            try {
                b7Var.a();
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    public void j() {
        App.v(J[23]);
        this.e.a();
    }

    private void a(String str, b7 b7Var) {
        synchronized (this.n) {
            this.n.put(str, b7Var);
        }
    }

    static a8 b(MessageService messageService) {
        return messageService.e;
    }

    static void a(MessageService messageService, int i) {
        messageService.a(i);
    }

    public IBinder onBind(Intent intent) {
        return this.m;
    }

    static boolean v() {
        Log.i(J[63]);
        r.await();
        boolean z = l.get();
        Log.i(J[64] + z);
        return z;
    }

    private void a(b3 b3Var) {
        synchronized (this.I) {
            this.o.a(b3Var);
            this.F.a(true);
            s();
            z();
            this.u.set(0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r6) {
        /*
        r5 = this;
        r0 = com.whatsapp.messaging.co.a;
        r1 = r5.b;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 == r6) goto L_0x0031;
    L_0x0006:
        if (r6 == 0) goto L_0x001a;
    L_0x0008:
        r1 = J;	 Catch:{ NullPointerException -> 0x003f }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x003f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x003f }
        r1 = 1;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5.a(r1, r2, r3, r4);	 Catch:{ NullPointerException -> 0x003f }
        if (r0 == 0) goto L_0x002d;
    L_0x001a:
        r1 = J;	 Catch:{ NullPointerException -> 0x0041 }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0041 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r5.e;	 Catch:{ NullPointerException -> 0x0041 }
        if (r1 == 0) goto L_0x002d;
    L_0x0027:
        r1 = r5.e;	 Catch:{ NullPointerException -> 0x0041 }
        r2 = 1;
        r1.a(r2);	 Catch:{ NullPointerException -> 0x0041 }
    L_0x002d:
        r5.b = r6;	 Catch:{ NullPointerException -> 0x0043 }
        if (r0 == 0) goto L_0x003a;
    L_0x0031:
        if (r6 == 0) goto L_0x003a;
    L_0x0033:
        r0 = 0;
        r1 = 1;
        r2 = 0;
        r3 = 0;
        r5.a(r0, r1, r2, r3);	 Catch:{ NullPointerException -> 0x0045 }
    L_0x003a:
        return;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.c(boolean):void");
    }

    static String m() {
        return w;
    }

    private void q() {
        synchronized (this.j) {
            Log.i(J[4]);
            this.c = 0;
            this.E = 10000;
        }
    }

    static {
        String[] strArr = new String[76];
        String str = "a\u0005eBpa\u001ebZ|v\u0013";
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
                        i4 = 2;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 11;
                        break;
                    case at.o /*3*/:
                        i4 = 44;
                        break;
                    default:
                        i4 = 21;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "c\u0006j^x";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$@ze\u0005~X8v\u0003fIg-\u0019\u007fMgv";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Nta\u0001TCsdEyIfg\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Oyk\u000feX8r\u0003eKppG\u007fExg\u0018$_ac\u0018\u007f";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "c\u0006j^x";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "d\u0005yOp";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "c\u0006j^x";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%~PA%EbPA>";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$^pa\u0005eBpa\u001e$Exo\u000foEtv\u000f";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$^pa\u0005eBpa\u001e$Myp\u000fjHl/\u001anBqk\u0004l";
                    i = 10;
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    strArr2 = strArr3;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$^pa\u0005eBpa\u001e$";
                    i = 11;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Oyk\u000feX8r\u0003eKppG\u007fExg\u0018$_am\u001a";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "c\u0006j^x";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "a\u0005eBpa\u001ebZ|v\u0013";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "c\u0004o^zk\u000e%BpvDhC{lDHc[L/Hx\\T#_uJA\"JbRG";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "O\u000fx_te\u000fXIgt\u0003hI5A\u0005eBpa\u001ebZ|v\u0013+dtl\u000egIg";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$@ze\u0005~X8v\u0003fIg-\u0018n_pv";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "O\u000fx_te\u000fXIgt\u0003hI:q\u000feHMo\u001a{\u00175v\u0013{I(";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$@ze\u0005~X8v\u0003fIg-\u0002j_(";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    str = "q\u000fx_|m\u0004+Mvv\u0003}I";
                    i = 20;
                    i2 = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    strArr2 = strArr3;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a";
                    i = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "q\u000fx_|m\u0004+E{c\t\u007fEcg";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "n\u0005eKJa\u0005eBpa\u001e";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%\u007fPV5Hc[L/Hx\\M$TxLR/";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Hpq\u001eyCl";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\"\u0004n[(";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Bpv\u001dd^~-\u0019|Eaa\u0002+CyfW";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "o\u000fx_te\u000fT_pp\u001cbOp-\u0006dKrg\u000eTJyc\r$H|q\tdB{g\t\u007fIq";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "o\u000fx_te\u000fT_pp\u001cbOp-\u0006dKrg\u000eTJyc\r$A`q\u001eT^pa\u0005eBpa\u001e";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "o\u000fx_te\u000fT_pp\u001cbOp-\u0006dKrg\u000eTJyc\r$A`q\u001eTErl\u0005yIJl\u000f\u007f[zp\u0001TC{a\u000f";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%\\pp\u0007b_fk\u0005e\u0002WP%JhVC9_";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Ogg\u000b\u007fI";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%\\pp\u0007b_fk\u0005e\u0002WP%JhVC9_";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%\u007fAC8_";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Bpv\u001dd^~-\u000ed[{";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Bpv\u001dd^~-\u001f{";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "o\u000fx_te\u000fXIgt\u0003hI:q\u000feH\\sP+Eq\"\u0003x\f{w\u0006g";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$_ac\u0018\u007f";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%~PA%EbPA>";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "d\u000bg@wc\t`s|r\u0019";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "p\u000fxIa";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "a\u0002nO~]\tdB{g\t\u007fEzl";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "k\u001aTMqf\u0018n_f";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "d\u0005yOp";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$@ze\u0005~X8v\u0003fIg-\tjBvg\u0006";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "c\u0006j^x";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "r\u0003eK5v\u0003fIzw\u001e+Erl\u0005yIq9JeC5q\u000feH|l\r+O}c\u0004eIy\"\u000b}M|n\u000bi@p\"\u0013nX";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "p\u000fhI|t\u000fo\fta\u00010\ffv\u000beVtI\u000fr\u0011";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "k\u0004\u007fIgp\u001f{XpfJ|D|n\u000f+[tk\u001ebBr\"\u0005e\fvm\u0004eIvv\u0003}Ea{JcM{f\u0006n^5v\u0002yItfJ\u007fC5g\u0012bX";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$_am\u001a";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%\u007fAM:TbZ]8N\u007fAC8_";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$^pa\u0005eBpa\u001e$Bzv5oEfa\u0005eBpa\u001enH:a\u0002nO~]\tdB{g\t\u007fEck\u001er";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Bpv\u001dd^~-\u0003lBzp\u000f+\u0004";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$^pa\u0005eBpa\u001e$Bpv\u001dd^~]\u001feMcc\u0003gMwn\u000f";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "c\u0006j^x";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "c\u0006j^x";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "a\u0005eBpa\u001ebZ|v\u0013";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Bpv\u001dd^~-\u000bhX|t\u000f+";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\"\u0003x~pv\u0018r\u0011";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "a\u0005eBpa\u001ebZ|v\u0013+^pv\u0018r\ftn\u000byA5q\u000f\u007f\fsm\u0018+\u001a%2Z;Af\"\fyCx\"\u0004d[";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "a\u0005eBpa\u001ebZ|v\u0013+^pv\u0018r\ftn\u000byA5a\u000beOpn\u000fo";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "c\u001djEak\u0004l\fvc\u001a\u007fEcgJ|EskJxXtv\u001fx";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "a\u000b{X|t\u000f+[|d\u0003+_ac\u001e~_5k\u0019+";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "z\u0007{\\:q\u000fyZ|a\u000f$Y{q\u001f{\\zp\u001enH";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "d\u0005yOp";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%\u007fAC8_";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%~PA%EbPA>";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "n\u0005eKJa\u0005eBpa\u001e";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "a\u0002nO~]\tdB{g\t\u007fEzl";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%\u007fAM:TbZ]8N\u007fAC8_";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "k\u001aTMqf\u0018n_f";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "p\u000fxIa";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "d\u000bg@wc\t`s|r\u0019";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "a\u0005f\u0002bj\u000b\u007f_tr\u001a%apq\u0019jKpQ\u000fyZ|a\u000f%\u007fPV5Hc[L/Hx\\M$TxLR/";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    J = strArr3;
                    StringBuilder append = new StringBuilder().append(MessageService.class.getCanonicalName());
                    str = ",)Db[G)_eCK>RsGG>YuJC)_eZL";
                    i = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i4 = 2;
                                    break;
                                case at.g /*1*/:
                                    i4 = arj.Theme_ratingBarStyle;
                                    break;
                                case at.i /*2*/:
                                    i4 = 11;
                                    break;
                                case at.o /*3*/:
                                    i4 = 44;
                                    break;
                                default:
                                    i4 = 21;
                                    break;
                            }
                            cArr2[i5] = (char) (i4 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case v.m /*0*/:
                                w = append.append(str).toString();
                                append = new StringBuilder().append(MessageService.class.getCanonicalName());
                                str = ",)GePL>T|\\L-N~JC)_eZL";
                                i = 1;
                                break;
                            case at.g /*1*/:
                                a = append.append(str).toString();
                                l = new AtomicBoolean();
                                r = new CountDownLatch(1);
                                return;
                            default:
                                y = append.append(str).toString();
                                append = new StringBuilder().append(MessageService.class.getCanonicalName());
                                str = ",&DkZW>TmVV#Db";
                                i = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "o\u000fx_te\u000fXIgt\u0003hI:q\u000feHTa\u0001jNyg'n_fc\rn\u00165q\u001ejBoc!nU5k\u0019+B`n\u0006";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public void b(Message message) {
        Log.i(J[19] + co.a(message));
        boolean e = co.e(message);
        if (e) {
            try {
                this.e.a(Message.obtain(message));
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        try {
            if (co.c(message)) {
                l();
                q();
                a(true, false, null, null);
            }
            if (!e) {
                try {
                    this.e.a(Message.obtain(message));
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r9, boolean r10, java.lang.String r11, java.lang.String[] r12) {
        /*
        r8 = this;
        r4 = 0;
        r0 = 1;
        r1 = com.whatsapp.messaging.co.a;
        r7 = r8.I;
        monitor-enter(r7);
        r2 = r8.t;	 Catch:{ all -> 0x003a }
        r6 = r2.a(r12);	 Catch:{ all -> 0x003a }
        r2 = r8.F;	 Catch:{ NullPointerException -> 0x0036 }
        r2 = r2.a();	 Catch:{ NullPointerException -> 0x0036 }
        if (r2 != 0) goto L_0x0041;
    L_0x0015:
        if (r10 == 0) goto L_0x0025;
    L_0x0017:
        r0 = J;	 Catch:{ NullPointerException -> 0x0038 }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0038 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0038 }
        r0 = r8.e;	 Catch:{ NullPointerException -> 0x0038 }
        r0.b();	 Catch:{ NullPointerException -> 0x0038 }
    L_0x0025:
        r0 = com.whatsapp.App.q(r8);	 Catch:{ NullPointerException -> 0x003d }
        if (r0 == 0) goto L_0x0034;
    L_0x002b:
        r0 = r8.w();	 Catch:{ NullPointerException -> 0x003d }
        if (r0 != 0) goto L_0x0034;
    L_0x0031:
        r8.i();	 Catch:{ NullPointerException -> 0x003f }
    L_0x0034:
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
    L_0x0035:
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x0041:
        if (r9 == 0) goto L_0x0051;
    L_0x0043:
        r2 = r8.g;	 Catch:{ NullPointerException -> 0x005b }
        r3 = 1;
        r2.a(r3);	 Catch:{ NullPointerException -> 0x005b }
        r2 = r8.h;	 Catch:{ NullPointerException -> 0x005b }
        r3 = 1;
        r2.a(r3);	 Catch:{ NullPointerException -> 0x005b }
        if (r1 == 0) goto L_0x005f;
    L_0x0051:
        r2 = r8.g;	 Catch:{ NullPointerException -> 0x005d }
        r2 = r2.a();	 Catch:{ NullPointerException -> 0x005d }
        if (r2 != 0) goto L_0x005f;
    L_0x0059:
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
        goto L_0x0035;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x005f:
        r2 = r8.b;	 Catch:{ NullPointerException -> 0x00bd }
        if (r2 == 0) goto L_0x0068;
    L_0x0063:
        r2 = r8.G;	 Catch:{ NullPointerException -> 0x00bd }
        r3 = -1;
        if (r2 != r3) goto L_0x00c5;
    L_0x0068:
        r2 = r8.g;	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.a();	 Catch:{ NullPointerException -> 0x00bf }
        if (r2 == 0) goto L_0x00b1;
    L_0x0070:
        r2 = r8.h;	 Catch:{ NullPointerException -> 0x00c1 }
        r2 = r2.a();	 Catch:{ NullPointerException -> 0x00c1 }
        if (r2 == 0) goto L_0x00b1;
    L_0x0078:
        r2 = r8.h;	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = 0;
        r2.a(r3);	 Catch:{ NullPointerException -> 0x00c3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00c3 }
        r2.<init>();	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = J;	 Catch:{ NullPointerException -> 0x00c3 }
        r5 = 54;
        r3 = r3[r5];	 Catch:{ NullPointerException -> 0x00c3 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = r8.b;	 Catch:{ NullPointerException -> 0x00c3 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = 44;
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = r8.G;	 Catch:{ NullPointerException -> 0x00c3 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = 41;
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00c3 }
        r2 = r2.toString();	 Catch:{ NullPointerException -> 0x00c3 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NullPointerException -> 0x00c3 }
        com.whatsapp.App.bc();	 Catch:{ NullPointerException -> 0x00c3 }
        if (r1 == 0) goto L_0x00c5;
    L_0x00b1:
        r0 = J;	 Catch:{ all -> 0x003a }
        r1 = 55;
        r0 = r0[r1];	 Catch:{ all -> 0x003a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x003a }
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
        goto L_0x0035;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x00c5:
        r1 = r8.D;	 Catch:{ all -> 0x003a }
        if (r1 != 0) goto L_0x00cc;
    L_0x00c9:
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
        goto L_0x0035;
    L_0x00cc:
        r1 = r8.o;	 Catch:{ NullPointerException -> 0x00db }
        if (r1 == 0) goto L_0x00d8;
    L_0x00d0:
        r1 = r8.e;	 Catch:{ NullPointerException -> 0x00db }
        if (r1 == 0) goto L_0x00d8;
    L_0x00d4:
        r1 = r8.s;	 Catch:{ NullPointerException -> 0x00dd }
        if (r1 == 0) goto L_0x00df;
    L_0x00d8:
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
        goto L_0x0035;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x00df:
        r1 = com.whatsapp.App.q();	 Catch:{ NullPointerException -> 0x00fe }
        if (r1 != 0) goto L_0x00eb;
    L_0x00e5:
        r1 = com.whatsapp.wn.a();	 Catch:{ NullPointerException -> 0x00fe }
        if (r1 == 0) goto L_0x00ec;
    L_0x00eb:
        r4 = r0;
    L_0x00ec:
        com.whatsapp.App.a(r4);	 Catch:{ all -> 0x003a }
        r0 = r8.e;	 Catch:{ all -> 0x003a }
        r1 = r8.q;	 Catch:{ all -> 0x003a }
        r2 = r8.z;	 Catch:{ all -> 0x003a }
        r5 = com.whatsapp.App.u;	 Catch:{ all -> 0x003a }
        r3 = r11;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x003a }
        monitor-exit(r7);	 Catch:{ all -> 0x003a }
        goto L_0x0035;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.a(boolean, boolean, java.lang.String, java.lang.String[]):void");
    }

    public static void a(Context context) {
        context.startService(new Intent(context, MessageService.class).setAction(J[52]));
    }

    private void z() {
        int i = co.a;
        synchronized (this.B) {
            for (Entry value : this.B.entrySet()) {
                ((b7) value.getValue()).b();
                if (i != 0) {
                    break;
                }
            }
            this.B.clear();
        }
    }

    private void k() {
        Log.i(J[5]);
        AlarmManager alarmManager = (AlarmManager) getSystemService(J[6]);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(a), 0);
        alarmManager.cancel(broadcast);
        alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + 15000, 240000, broadcast);
    }

    private void d() {
        n();
    }

    public static void a(Context context, boolean z) {
        context.startService(new Intent(context, MessageService.class).setAction(J[25]).putExtra(J[24], z));
    }

    private void a(ct ctVar, b7 b7Var) {
        synchronized (this.B) {
            this.B.put(ctVar, b7Var);
        }
    }

    static void a(MessageService messageService) {
        messageService.b();
    }

    public void g() {
        App.v(J[21]);
        this.e.c();
        l();
        q();
        a(true, false, null, null);
        this.e.b();
    }

    public void onCreate() {
        super.onCreate();
        Log.i(J[33]);
        registerReceiver(this.v, new IntentFilter(a), J[32], null);
        registerReceiver(this.k, new IntentFilter(w), J[34], null);
    }

    private void b() {
        synchronized (this.I) {
            this.F.a(false);
            this.o.d();
            if (App.q((Context) this)) {
                i();
            }
            q();
            n();
            k();
        }
    }

    static String h() {
        return a;
    }

    private void l() {
        synchronized (this.k) {
            Log.i(J[18]);
            if (w()) {
                i();
            }
        }
    }
}
