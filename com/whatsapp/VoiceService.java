package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.Ringtone;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.hx;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.Voip.DebugTapType;
import com.whatsapp.Voip.DefaultCryptoCallback;
import com.whatsapp.Voip.EventCallback;
import com.whatsapp.Voip.RecordingInfo;
import com.whatsapp.Voip.SignalingCallback;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.fieldstats.ao;
import com.whatsapp.fieldstats.b;
import com.whatsapp.fieldstats.bv;
import com.whatsapp.fieldstats.ce;
import com.whatsapp.jobqueue.job.GetPreKeyJob;
import com.whatsapp.messaging.an;
import com.whatsapp.proto.E2E;
import com.whatsapp.proto.E2E.Message.Builder;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.b1;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.co;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import com.whatsapp.util.b3;
import com.whatsapp.util.cv;
import de.greenrobot.event.h;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.ag;
import org.whispersystems.ar;
import org.whispersystems.at;
import org.whispersystems.av;
import org.whispersystems.bF;
import org.whispersystems.bH;
import org.whispersystems.bX;
import org.whispersystems.i;
import org.whispersystems.j;
import org.whispersystems.r;
import org.whispersystems.y;

public class VoiceService extends Service implements an {
    private static int I;
    private static final Object ae;
    private static int as;
    private static final ThreadPoolExecutor au;
    private static final String[] bb;
    private static final SecureRandom f;
    private static AtomicInteger u;
    private boolean A;
    private boolean B;
    private int C;
    private Double D;
    private boolean E;
    private boolean F;
    private WakeLock G;
    private Double H;
    private Boolean J;
    private short K;
    private pm L;
    private BroadcastReceiver M;
    private BluetoothAdapter N;
    private byte[] O;
    private final Object P;
    private RecordingInfo[] Q;
    private Handler R;
    private boolean S;
    private boolean T;
    private final dp U;
    private boolean V;
    private boolean W;
    private PhoneStateListener X;
    private Ringtone Y;
    private Events$Call Z;
    private boolean a;
    public boolean aA;
    private WakeLock aB;
    private a7 aC;
    private Handler aD;
    private long aE;
    private BluetoothConnectionReceiver aF;
    private Integer aG;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private b3 ad;
    private Integer af;
    private Object ag;
    private Handler ah;
    private Set ai;
    private vl aj;
    private boolean ak;
    private byte[] al;
    private ce am;
    private long[] an;
    private BroadcastReceiver ao;
    private VoiceServiceEventCallback ap;
    public boolean aq;
    private Handler ar;
    private boolean at;
    private boolean av;
    private ScheduledExecutorService aw;
    private SoundPool ax;
    private cv ay;
    private BluetoothHeadset az;
    private boolean b;
    private String c;
    private Double d;
    private boolean e;
    private List g;
    private Object h;
    private Boolean i;
    private Double j;
    private boolean k;
    private Integer l;
    private BluetoothScoReceiver m;
    private Integer n;
    private VoipOptions o;
    private String p;
    private int q;
    private int r;
    private boolean s;
    private Object t;
    private long v;
    private BroadcastReceiver w;
    private Uri x;
    private int y;
    private Message z;

    class 4 extends BroadcastReceiver {
        private static final String[] z;
        final VoiceService a;

        static {
            String[] strArr = new String[2];
            String str = "F\u0006\u0005\u0014:{E\u001e\u0002\u007fw\u0000\u001e\u001f85\u0011\u0002\u00031p\u0001W\u001e9s";
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
                            i3 = 21;
                            break;
                        case at.g /*1*/:
                            i3 = arj.Theme_buttonStyleSmall;
                            break;
                        case at.i /*2*/:
                            i3 = 119;
                            break;
                        case at.o /*3*/:
                            i3 = 113;
                            break;
                        default:
                            i3 = 95;
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
                        str = "t\u000b\u0013\u00030|\u0001Y\u00181a\u0000\u0019\u0005qt\u0006\u0003\u00180{K$2\rP 9.\u0010S#";
                        obj = null;
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(z[1])) {
                this.a.M();
                Log.i(z[0]);
            }
        }

        4(VoiceService voiceService) {
            this.a = voiceService;
        }
    }

    class 5 extends BroadcastReceiver {
        private static final String[] z;
        final VoiceService a;

        static {
            String[] strArr = new String[2];
            String str = " I!\u0014\u000e";
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
                            i3 = 83;
                            break;
                        case at.g /*1*/:
                            i3 = 61;
                            break;
                        case at.i /*2*/:
                            i3 = 64;
                            break;
                        case at.o /*3*/:
                            i3 = 96;
                            break;
                        default:
                            i3 = arj.Theme_seekBarStyle;
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
                        str = "%R)\u0010D2H$\t\u0004\fO/\u0015\u001f6\u0012(\u0005\n7N%\u0014!&N40\u0007&Z%\u0004\"=";
                        obj = null;
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getIntExtra(z[0], 0) > 0) {
                VoiceService.a(this.a, true);
                Log.i(z[1]);
            }
            VoiceService.g(this.a);
            if (VoiceService.a(this.a) != null) {
                VoiceService.a(this.a).b();
            }
        }

        5(VoiceService voiceService) {
            this.a = voiceService;
        }
    }

    class 6 extends BroadcastReceiver {
        private static final String[] z;
        final VoiceService a;

        static {
            String[] strArr = new String[2];
            String str = "3N\u001fWg0O\u001aH+.s\u0013D-,W\u0013Uh\"D\u0018B:$U\u0013\u0007  @\u0012T=5\u0001\u0018H<,G\u001fD)1H\u0019Ih2I\u0013Ih0R\u0013Uh0O\u001aH+.\u0001\u0002O-eR\u0015U- OVN&es3d\r\fw3c\u0017\u0006`:kh6U\u0017S-";
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
                            i3 = 69;
                            break;
                        case at.g /*1*/:
                            i3 = 33;
                            break;
                        case at.i /*2*/:
                            i3 = 118;
                            break;
                        case at.o /*3*/:
                            i3 = 39;
                            break;
                        default:
                            i3 = 72;
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
                        str = "$O\u0012U',EXN&1D\u0018Sf$B\u0002N'+\u000f#t\r\u0017~&u\r\u0016d8s";
                        obj = null;
                }
            }
        }

        6(VoiceService voiceService) {
            this.a = voiceService;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(z[1])) {
                CallInfo callInfo = Voip.getCallInfo();
                if (callInfo != null && callInfo.getCallState() == CallState.RECEIVED_CALL && VERSION.SDK_INT >= 21) {
                    if (VoiceService.a(this.a) == null || !VoiceService.a(this.a).g()) {
                        Log.i(z[0]);
                        VoiceService.d(this.a, true);
                    }
                }
            }
        }
    }

    @TargetApi(11)
    final class BluetoothConnectionReceiver extends BroadcastReceiver {
        private static final String[] z;
        final VoiceService a;

        static {
            String[] strArr = new String[6];
            String str = "\b\rzT\u000f\u0000\u00070D\f\u001c\u0006jI\u000f\u001d\u000b0N\u0005\b\u0007mC\u0014G\u0013lI\u0006\u0000\u000f{\b\u0001\n\u0017wI\u000eG Qh., Jo/'<Mr!=&Ae((-Yc$";
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
                            i3 = arj.Theme_radioButtonStyle;
                            break;
                        case at.g /*1*/:
                            i3 = 99;
                            break;
                        case at.i /*2*/:
                            i3 = 30;
                            break;
                        case at.o /*3*/:
                            i3 = 38;
                            break;
                        default:
                            i3 = 96;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u001f\fwVO\b\u0016zO\u000f6\u0011qS\u0014\fL|J\u0015\f\u0017qI\u0014\u0001 qH\u000e\f\u0000jO\u000f\u00071{E\u0005\u0000\u0015{T@\n\u0016lT\u0005\u0007\u0017>U\u0014\b\u0017{\u0006";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "ECnT\u0005\u001f\nqS\u0013I\u0010jG\u0014\fC";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\b\rzT\u000f\u0000\u00070D\f\u001c\u0006jI\u000f\u001d\u000b0V\u0012\u0006\u0005wJ\u0005G\u0006fR\u0012\bMMr!=&";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\b\u0016zO\u000f";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\b\rzT\u000f\u0000\u00070D\f\u001c\u0006jI\u000f\u001d\u000b0V\u0012\u0006\u0005wJ\u0005G\u0006fR\u0012\bMNt%?*Qs360Jg4,";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private BluetoothConnectionReceiver(VoiceService voiceService) {
            this.a = voiceService;
        }

        BluetoothConnectionReceiver(VoiceService voiceService, oj ojVar) {
            this(voiceService);
        }

        public void onReceive(Context context, Intent intent) {
            if (z[0].equals(intent.getAction())) {
                int intExtra = intent.getIntExtra(z[4], 0);
                int intExtra2 = intent.getIntExtra(z[1], 0);
                if (intExtra != intExtra2) {
                    if ((intExtra2 == 2 || VoiceService.R(this.a)) && (intExtra == 3 || intExtra == 0)) {
                        AudioManager audioManager = (AudioManager) this.a.getSystemService(z[5]);
                        audioManager.stopBluetoothSco();
                        audioManager.setBluetoothScoOn(false);
                    }
                    Log.i(z[2] + intExtra + z[3] + intExtra2);
                    VoiceService.J(this.a);
                }
            }
        }
    }

    @TargetApi(8)
    final class BluetoothScoReceiver extends BroadcastReceiver {
        private static final String[] z;
        final VoiceService a;
        private boolean b;

        static {
            String[] strArr = new String[9];
            String str = "Ey0~\u000eRc=gNld6{UV9;bTVb6aU[E:asVu<gWVdy]b|6:aO]s:zDW6=kWZu<.";
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
                            i3 = 51;
                            break;
                        case at.g /*1*/:
                            i3 = 22;
                            break;
                        case at.i /*2*/:
                            i3 = 89;
                            break;
                        case at.o /*3*/:
                            i3 = 14;
                            break;
                        default:
                            i3 = 33;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u001f60}\u0001{w7jRud<k\u001b\u0013";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u001f6=kWZu<.B_w*}\u001b";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "Rx=|NZrwcDW\u007f8 rpY\u0006Otw_\u0016QrgW\rK~p^\u0018@fvR";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "Ey0~\u000eRc=gNld6{UV9;bTVb6aU[E:asVu<gWVdy]b|6\u0016`";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "Ey0~\u000eVx=QBRz5.CVu8{RV6\u001bbTVb6aU[6\nMn\u0013z0`J\u0013\u007f*.UFd7kE\u0013r6yO\u001d";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "Ey0~\u000eRc=gNld6{UV9;bTVb6aU[E:asVu<gWVdy]b|6\u0016hG\u001f60}t@s+ZTAx0`F|p?LMFs-aNG~\nMn\t6";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "kZ0`J\u0013Q8zDDw ";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "Rx=|NZrwcDW\u007f8 DKb+o\u000f`U\u0016Q`fR\u0010A~`B\u0018Zd";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        BluetoothScoReceiver(VoiceService voiceService, oj ojVar) {
            this(voiceService);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r12, android.content.Intent r13) {
            /*
            r11 = this;
            r3 = 1;
            r2 = 0;
            r4 = com.whatsapp.DialogToastActivity.f;
            r0 = z;
            r1 = 4;
            r0 = r0[r1];
            r1 = r13.getAction();
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0125;
        L_0x0013:
            r0 = z;
            r0 = r0[r3];
            r1 = -1;
            r5 = r13.getIntExtra(r0, r1);
            r0 = r11.a;
            r6 = com.whatsapp.VoiceService.R(r0);
            if (r5 != r3) goto L_0x00c3;
        L_0x0024:
            r0 = z;
            r1 = 5;
            r0 = r0[r1];
            com.whatsapp.util.Log.i(r0);
            r0 = r11.a;
            com.whatsapp.VoiceService.b(r0, r3);
            r11.b = r2;
            r0 = r11.a;
            r0 = com.whatsapp.VoiceService.k(r0);
            if (r0 == 0) goto L_0x0120;
        L_0x003b:
            r0 = android.os.Build.VERSION.SDK_INT;
            r1 = 11;
            if (r0 < r1) goto L_0x0120;
        L_0x0041:
            r0 = r11.a;
            r0 = com.whatsapp.VoiceService.k(r0);
            r0 = r0.getConnectedDevices();
            r7 = r0.iterator();
        L_0x004f:
            r0 = r7.hasNext();
            if (r0 == 0) goto L_0x00c1;
        L_0x0055:
            r0 = r7.next();
            r0 = (android.bluetooth.BluetoothDevice) r0;
            r1 = r11.a;
            r1 = com.whatsapp.VoiceService.k(r1);
            r1 = r1.isAudioConnected(r0);
            if (r1 == 0) goto L_0x00bf;
        L_0x0067:
            r1 = r0.getBluetoothClass();
            r1 = r1.getDeviceClass();
            r8 = new java.lang.StringBuilder;
            r8.<init>();
            r9 = z;
            r9 = r9[r2];
            r8 = r8.append(r9);
            r9 = r0.getName();
            r8 = r8.append(r9);
            r9 = z;
            r10 = 3;
            r9 = r9[r10];
            r8 = r8.append(r9);
            r8 = r8.append(r1);
            r8 = r8.toString();
            com.whatsapp.util.Log.i(r8);
            r8 = 1032; // 0x408 float:1.446E-42 double:5.1E-321;
            if (r1 == r8) goto L_0x00a4;
        L_0x009c:
            r8 = 1056; // 0x420 float:1.48E-42 double:5.217E-321;
            if (r1 == r8) goto L_0x00a4;
        L_0x00a0:
            r8 = 1028; // 0x404 float:1.44E-42 double:5.08E-321;
            if (r1 != r8) goto L_0x0126;
        L_0x00a4:
            r1 = r3;
        L_0x00a5:
            r11.b = r1;
            r1 = z;
            r8 = 8;
            r1 = r1[r8];
            r0 = r0.getName();
            r0 = r1.equals(r0);
            if (r0 == 0) goto L_0x00b9;
        L_0x00b7:
            r11.b = r2;
        L_0x00b9:
            r0 = r11.b;
            if (r0 == 0) goto L_0x00bf;
        L_0x00bd:
            if (r4 == 0) goto L_0x00c1;
        L_0x00bf:
            if (r4 == 0) goto L_0x004f;
        L_0x00c1:
            if (r4 == 0) goto L_0x0120;
        L_0x00c3:
            if (r5 != 0) goto L_0x0120;
        L_0x00c5:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = z;
            r3 = 7;
            r1 = r1[r3];
            r0 = r0.append(r1);
            r1 = r11.a;
            r1 = com.whatsapp.VoiceService.h(r1);
            r0 = r0.append(r1);
            r1 = z;
            r3 = 2;
            r1 = r1[r3];
            r0 = r0.append(r1);
            r1 = r11.b;
            r0 = r0.append(r1);
            r0 = r0.toString();
            com.whatsapp.util.Log.i(r0);
            r0 = r11.a;
            com.whatsapp.VoiceService.b(r0, r2);
            if (r6 == 0) goto L_0x011e;
        L_0x00fa:
            r0 = r11.a;
            r0 = com.whatsapp.VoiceService.h(r0);
            if (r0 != 0) goto L_0x011e;
        L_0x0102:
            r0 = r11.b;
            if (r0 == 0) goto L_0x011e;
        L_0x0106:
            r0 = r11.a;
            r0 = r0.i();
            if (r0 == 0) goto L_0x011e;
        L_0x010e:
            r0 = z;
            r1 = 6;
            r0 = r0[r1];
            com.whatsapp.util.Log.i(r0);
            r0 = r11.a;
            r1 = com.whatsapp.vl.SCO_LINK_DOWN;
            r3 = 0;
            r0.b(r1, r3);
        L_0x011e:
            r11.b = r2;
        L_0x0120:
            r0 = r11.a;
            com.whatsapp.VoiceService.J(r0);
        L_0x0125:
            return;
        L_0x0126:
            r1 = r2;
            goto L_0x00a5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.BluetoothScoReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }

        private BluetoothScoReceiver(VoiceService voiceService) {
            this.a = voiceService;
            this.b = false;
        }
    }

    public class DefaultSignalingCallback implements SignalingCallback {
        private static final String[] z;
        private VoiceService service;

        static {
            String[] strArr = new String[8];
            String str = "=\u00140<";
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
                            i3 = 82;
                            break;
                        case at.g /*1*/:
                            i3 = 100;
                            break;
                        case at.i /*2*/:
                            i3 = 69;
                            break;
                        case at.o /*3*/:
                            i3 = 79;
                            break;
                        default:
                            i3 = 65;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "=\u00140<";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "&\u000b6";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "0\u001166";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "7\n&";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "&\u000b6";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "7\n&";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "|\u0017 !%\u001d\u0002#*3r";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void sendRelayElection(String str, String str2, byte[] bArr, int i) {
            App.a(co.a(str2, true).b, str2, str, bArr, i);
        }

        public void sendRelayLatencies(String str, String str2, byte[][] bArr, int[] iArr) {
            App.a(co.a(str2, true).b, str2, str, bArr, iArr);
        }

        public void sendOffer(String str, String str2, boolean z, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            byte[] bArr5;
            byte[] bArr6;
            b1 a;
            if (App.as.a(str2, it.ALLOW)) {
                bArr5 = null;
                bArr6 = null;
            } else {
                bArr6 = bArr3;
                bArr5 = bArr2;
            }
            c3 a2 = co.a(str2, true);
            String[] strArr = new String[]{z[2], z[0]};
            int[] iArr2 = new int[]{8000, 16000};
            if (bArr4 != null) {
                try {
                    a = VoiceService.a(awc.a(App.z()), str2, bArr4);
                } catch (InterruptedException e) {
                    Log.e(getClass().getName() + z[1] + e);
                    VoiceService.G(this.service);
                    return;
                } catch (bX e2) {
                    synchronized (VoiceService.F(this.service)) {
                    }
                    VoiceService.a(this.service, com.whatsapp.messaging.co.a(a2.b, str2, str, strArr, iArr2, bArr, iArr, bArr5, bArr6, bArr4));
                    App.p.ai.a(new GetPreKeyJob(str2, null));
                    return;
                }
            }
            a = null;
            App.a(a2.b, str2, str, strArr, iArr2, bArr, iArr, bArr5, bArr6, b1.a(a));
        }

        public void sendTransport(String str, String str2, byte[][] bArr, int[] iArr) {
            App.b(co.a(str2, true).b, str2, str, bArr, iArr);
        }

        public DefaultSignalingCallback(VoiceService voiceService) {
            this.service = voiceService;
        }

        public void sendAccept(String str, String str2, String str3, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2) {
            App.a(co.a(str2, true).b, str2, str, str3, i, bArr, iArr, bArr2, bArr3, bArr4, i2);
        }

        public void sendPreAccept(String str, String str2, String str3, int i, byte[] bArr) {
            App.a(co.a(str2, true).b, str2, str, str3, i, bArr);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void sendReject(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            /*
            r7 = this;
            r6 = 0;
            r2 = 0;
            r0 = 1;
            r0 = com.whatsapp.protocol.co.a(r9, r0);
            r0 = r0.b;
            com.whatsapp.App.a(r0, r9, r8, r10);
            r0 = z;
            r1 = 4;
            r0 = r0[r1];
            r0 = r0.equals(r10);
            if (r0 != 0) goto L_0x002d;
        L_0x0017:
            r0 = z;
            r1 = 6;
            r0 = r0[r1];
            r0 = r0.equals(r10);
            if (r0 != 0) goto L_0x002d;
        L_0x0022:
            r0 = z;
            r1 = 5;
            r0 = r0[r1];
            r0 = r0.equals(r10);
            if (r0 == 0) goto L_0x0073;
        L_0x002d:
            r0 = new com.whatsapp.protocol.c3;
            r1 = com.whatsapp.Voip.a(r8);
            r0.<init>(r9, r6, r1);
            r1 = com.whatsapp.App.aK;
            r0 = r1.a(r0);
            if (r0 == 0) goto L_0x0073;
        L_0x003e:
            r1 = com.whatsapp.App.p;
            r1 = r1.M();
            r3 = new com.whatsapp.ai8;
            r3.<init>(r7, r0);
            r1.post(r3);
            r0 = com.whatsapp.fieldstats.v.BUSY;
            r1 = z;
            r3 = 3;
            r1 = r1[r3];
            r1 = r1.equals(r10);
            if (r1 == 0) goto L_0x005f;
        L_0x0059:
            r0 = com.whatsapp.fieldstats.v.CALL_REJECTED_TOS;
            r1 = com.whatsapp.DialogToastActivity.f;
            if (r1 == 0) goto L_0x006c;
        L_0x005f:
            r1 = z;
            r3 = 7;
            r1 = r1[r3];
            r1 = r1.equals(r10);
            if (r1 == 0) goto L_0x006c;
        L_0x006a:
            r0 = com.whatsapp.fieldstats.v.CALL_REJECTED_E2E;
        L_0x006c:
            r1 = r9;
            r3 = r2;
            r4 = r2;
            r5 = r2;
            com.whatsapp.VoiceService.a(r0, r1, r2, r3, r4, r5, r6);
        L_0x0073:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.DefaultSignalingCallback.sendReject(java.lang.String, java.lang.String, java.lang.String):void");
        }

        public void sendTerminate(String str, String str2, String str3) {
            VoiceService.a(this.service, str2, str, true);
            c3 a = co.a(str2, true);
            CallInfo callInfo = Voip.getCallInfo();
            App.a(a.b, str2, str, str3, callInfo != null ? callInfo.getCallDuration() : 0);
        }
    }

    public class VoiceServiceEventCallback implements EventCallback {
        private static final String[] z;
        protected qf bufferQueue;
        final VoiceService this$0;

        static {
            String[] strArr = new String[70];
            String str = "f5Hd\u000f\u001d5Jm\u0013(\u0004Lk\u00065 Ll";
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
                            i3 = 92;
                            break;
                        case at.g /*1*/:
                            i3 = 86;
                            break;
                        case at.i /*2*/:
                            i3 = 41;
                            break;
                        case at.o /*3*/:
                            i3 = 8;
                            break;
                        default:
                            i3 = 99;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = ")8Ji\u000f07Kd\u0006";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "(9Z";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        str = ">#Zq";
                        obj = 3;
                        strArr2 = strArr3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "f5Hd\u000f\u000e3Cm\u0000(\u0004Lk\u00065 LlK";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "f&\u001bx-91F|\n=\"@g\r\u000f#Jk\u0006/%";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "f7\\l\n3\u0005]z\u0006=;z|\u0002.\"Ll";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        str = "f%F}\r8\u0006Fz\u0017\u001f$Li\u001792\t\u007f\n(>\tm\r;?GmC(/YmC";
                        obj = 7;
                        i = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        strArr2 = strArr3;
                        str = "f5Hd\u000f\u001d5Jm\u0013(\u0010Ha\u000f92";
                        obj = 8;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "f5Hd\u000f\u00130Om\u0011\u00127Jc\u00068vLz\u00113$\u0013(";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "f>Hf\u000703hk\u00009&]N\u00025:Ll";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "f$Ld\u0002%\u001aH|\u000625P[\u000622oi\n03M";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "f5Hd\u000f\u00130Om\u0011\u000e3Jm\n,\"{m\u00009?_m\u0007";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "f7\\l\n3\u001fGa\u0017\u0019$[g\u0011";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "f&\u001bx7.7G{\u00133$]K\u001197]m%=?Em\u0007";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "f;Ll\n=\u0005]z\u0006=;z|\u0002.\"lz\u00113$";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "f$Q\\\n13F}\u0017";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "f%F}\r8\u0006Fz\u0017\u001f$Li\u00179\u0010Ha\u000f92";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "f;Ll\n=\u0005]z\u0006=;lz\u00113$";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "f;@{\u001058NZ\u000607PA\r:9";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "f&\u001bx7.7G{\u00133$]Z\u0006/\"Hz\u0017\u000f#Jk\u0006/%";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "f%Lf\u0007\u00130Om\u0011\u001a7@d\u00068";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "f\u0018F[\u00021&Ea\r;\u0004H|\u0006/\u0010Fz\")2@g195Fz\u0007";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "f5Hd\u000f\b3[e\n27]m195La\u001592";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "f\"[i\r/&Fz\u0017\u001f7Gl098MN\u00025:Ll";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "f5Hd\u000f\u001d5Jm\u0013(\u0005Lf\u0017";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextAppearance /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "f>Hf\u000703fn\u00059$oi\n03M";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextColor /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "f5Hd\u000f\u000e3Z}\u000e92";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeStyle /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "f&\u001bx7.7G{\u00133$]E\u00068?HK\u001197]m%=?Em\u0007";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "f$Q\\\u0011=0Oa\u0000\u000f\"Hz\u001792";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeBackground /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "f$Q\\\u0011=0Oa\u0000\u000f\"Hg\u0013,3M";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSplitBackground /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "pv]g\u0017=:\tl\u0002(7\t}\u0010=1L2C";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseDrawable /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "*9@xL.3](09$_m\u0011|$Ln\u000f9.@~\u0006|7Ml\u0011|\r";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCutDrawable /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "pvYg\u0011(l";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCopyDrawable /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "f5Hd\u000f\u00198Ma\r;v\u0001l\u0016.7]a\f2k";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePasteDrawable /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "+3\ti\u00119vGg\u0017|?G(\u0002|7J|\n*3\tk\u00020:";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSelectAllDrawable /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "\u0001z\ta\u0013f";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeShareDrawable /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "?7G(\r3\"\tn\n22\te\u0006/%Ho\u0006|";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeFindDrawable /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "(9F(\u000151\t~\u00020#L(\u00053$\tk\u00020:oa\u000602z|\u0002(x[p73\"Hd!%\"L{C";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeWebSearchDrawable /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "(9F(\u000151\t~\u00020#L(\u00053$\tk\u00020:oa\u000602z|\u0002(x]p73\"Hd!%\"L{C";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePopupWindowStyle /*39*/:
                        strArr2[i] = str;
                        str = "*9@xL\u001d#Ma\f\u00117Gi\u00049$\tX1\u0013\u0006lZ7\u0005\tf]7\f\u0003}W0\u001d\u001byD&\u0003\u0004h\\&|k\t";
                        obj = 40;
                        i = 41;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        strArr2 = strArr3;
                        str = "f5Hd\u000f\u00198Ma\r;";
                        obj = 41;
                        break;
                    case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "|\u0014P|\u0006u";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogTheme /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "pvDa\u00044\"\tj\u0006|![g\r;z\tl\f|8F|C.3Jg\u00118x";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogPreferredPadding /*43*/:
                        strArr2[i] = str;
                        i = 45;
                        str = "=8Mz\f52\u0007e\u00068?H&\u0013.9Ym\u0011(/\u0007G6\b\u0006|\\<\u000f\u0017dX/\u0019\t{I7\u0019";
                        obj = 44;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listDividerAlertDialog /*44*/:
                        strArr2[i] = str;
                        i = 46;
                        str = "pvDa\u00044\"\tj\u0006|![g\r;z\tl\f|8F|C.3Jg\u00118x";
                        obj = 45;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionDropDownStyle /*45*/:
                        strArr2[i] = str;
                        i = 47;
                        str = "=#Ma\f";
                        obj = 46;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                        strArr2[i] = str;
                        i = 48;
                        str = "=8Mz\f52\u0007e\u00068?H&\u0013.9Ym\u0011(/\u0007G6\b\u0006|\\<\u001a\u0004hE&\u000f\tyM1\u0003\u0014|N%\u0019\u0004";
                        obj = 47;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_spinnerDropDownItemStyle /*47*/:
                        strArr2[i] = str;
                        i = 49;
                        str = "?7Ed</5[m\u00062\tYz\u0006/3G|\u00068";
                        obj = 48;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_homeAsUpIndicator /*48*/:
                        strArr2[i] = str;
                        i = 50;
                        str = "pvyZ,\f\u0013{\\:\u0003\u0019|\\3\t\u0002vN1\u001d\u001bl[<\f\u0013{W!\t\u0010oM1|k\t";
                        obj = 49;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionButtonStyle /*49*/:
                        strArr2[i] = str;
                        i = 51;
                        str = "f5Hd\u000f\u00158]m\u0011.#Y|\u00068";
                        obj = 50;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarStyle /*50*/:
                        strArr2[i] = str;
                        i = 52;
                        str = "f&\u001bx-91F|\n=\"@g\r\u001a7@d\u00068";
                        obj = 51;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarButtonStyle /*51*/:
                        strArr2[i] = str;
                        i = 53;
                        str = "f5Hd\u000f\u00130Om\u0011\u001d5Bm\u0007\u000b?]`19:Hq*20F";
                        obj = 52;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackground /*52*/:
                        strArr2[i] = str;
                        i = 54;
                        str = "f5Hd\u000f\u000f\"H|\u0006\u001f>Hf\u000492\u0001";
                        obj = 53;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                        strArr2[i] = str;
                        i = 55;
                        str = "\t\u0018bF,\u000b\u0018\tk\u00020:\t{\u0017=\"L(";
                        obj = 54;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_borderlessButtonStyle /*54*/:
                        strArr2[i] = str;
                        i = 56;
                        str = ".3Oz\u0006/>vf\f(?Oa\u0000=\"@g\r";
                        obj = 55;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dividerVertical /*55*/:
                        strArr2[i] = str;
                        i = 57;
                        str = "pv";
                        obj = 56;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dividerHorizontal /*56*/:
                        strArr2[i] = str;
                        i = 58;
                        str = "f$Ld\u0002%\u0013Em\u0000(?Ff098MN\u00025:Ll";
                        obj = 57;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_activityChooserViewStyle /*57*/:
                        strArr2[i] = str;
                        i = 59;
                        str = "f\"Q\\\n13F}\u0017";
                        obj = 58;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_toolbarStyle /*58*/:
                        strArr2[i] = str;
                        i = 60;
                        str = "f%Lf\u0007\u001d5Jm\u0013(\u0010Ha\u000f92";
                        obj = 59;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                        strArr2[i] = str;
                        i = 61;
                        str = "f$Ld\u0002%\u0014@f\u0007/\u0010Ha\u000f92";
                        obj = 60;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_popupMenuStyle /*60*/:
                        strArr2[i] = str;
                        i = 62;
                        str = "+3\ti\u00119vGg\u0017|?G(\u0002|7J|\n*3\tk\u00020:";
                        obj = 61;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_popupWindowStyle /*61*/:
                        strArr2[i] = str;
                        i = 63;
                        str = "f5Hd\u000f\u00130Om\u0011\u000f3G|";
                        obj = 62;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_editTextColor /*62*/:
                        strArr2[i] = str;
                        i = 64;
                        str = "f5Hd\u000f\u00130Om\u0011\u000e3Jm\n*3M";
                        obj = 63;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_editTextBackground /*63*/:
                        strArr2[i] = str;
                        i = 65;
                        str = "f!@d\u000f\u001f$Li\u00179\u0005F}\r8\u0006Fz\u0017";
                        obj = 64;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_imageButtonStyle /*64*/:
                        strArr2[i] = str;
                        i = 66;
                        str = "f7\\l\n3\u0012[a\u00159${m\u0010(7[|";
                        obj = 65;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                        strArr2[i] = str;
                        i = 67;
                        str = "f?Gk\f1&H|\n>:L[\u0011(&bm\u001a\u0019.J`\u000221L";
                        obj = 66;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                        strArr2[i] = str;
                        i = 68;
                        str = "f3[z\f.\u0011H|\u000b9$@f\u0004\u00149Z| =8Ma\u0007=\"L{";
                        obj = 67;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textColorSearchUrl /*67*/:
                        strArr2[i] = str;
                        i = 69;
                        str = "f$Ld\u0002%\u0015[m\u0002(3z}\u0000?3Z{";
                        obj = 68;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_searchViewStyle /*68*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "f&\u001bx7.7G{\u00133$][\u0017=$]N\u00025:Ll";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void p2pNegotiationSuccess() {
            Log.i(getClass().getName() + z[6]);
        }

        public void rtcpPacketReceived() {
        }

        public void relayBindsFailed() {
            Log.w(getClass().getName() + z[61]);
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                Log.e(z[62]);
            } else {
                VoiceService.a(this.this$0, callInfo);
            }
        }

        public void sendAcceptFailed() {
            Log.i(getClass().getName() + z[60]);
            this.this$0.M();
        }

        public void relayElectionSendFailed() {
            Log.i(getClass().getName() + z[58]);
        }

        public VoiceServiceEventCallback(VoiceService voiceService) {
            this.this$0 = voiceService;
            this.bufferQueue = new qf();
        }

        public void willCreateSoundPort() {
            Log.i(getClass().getName() + z[65]);
        }

        public void audioStreamStarted() {
            Log.i(getClass().getName() + z[7]);
            VoiceService.e(this.this$0).sendEmptyMessage(2);
        }

        public void p2pTransportCreateFailed() {
            Log.i(getClass().getName() + z[15]);
            VoiceService.G(this.this$0);
        }

        public void callOfferReceived() {
            Log.i(getClass().getName() + z[64]);
        }

        public void callRejectReceived(String str) {
            boolean z = DialogToastActivity.f;
            Log.i(getClass().getName() + z[5] + str + ')');
            String peerJid = Voip.getPeerJid();
            if (z[4].equals(str)) {
                VoiceService.e(this.this$0, true);
                VoiceService.E(this.this$0).removeCallbacksAndMessages(null);
                VoiceService.E(this.this$0).sendEmptyMessageDelayed(3, 30000);
                if (!z) {
                    return;
                }
            }
            if (z[2].equals(str) || z[3].equals(str)) {
                this.this$0.b(vl.CALL_REJECTED, null);
                if (peerJid != null) {
                    VoiceService.a(this.this$0, peerJid, 0, null);
                    if (!z) {
                        return;
                    }
                }
                return;
            }
            this.this$0.b(vl.CALL_REJECTED, null);
        }

        public void reportEcho(int i, int i2) {
            VoiceService.a(this.this$0, i);
            VoiceService.b(this.this$0, i2);
        }

        public void callOfferAckedWithRelayInfo() {
            Log.i(getClass().getName() + z[53]);
            VoiceService.E(this.this$0).removeMessages(2);
            VoiceService.h(this.this$0, true);
        }

        public void audioInitError() {
            Log.i(getClass().getName() + z[14]);
            VoiceService.G(this.this$0);
        }

        public void p2pNegotaitionFailed() {
            Log.i(getClass().getName() + z[52]);
        }

        public void callTerminateReceived() {
            Log.i(getClass().getName() + z[24]);
        }

        public void rxTimeout() {
            Log.i(getClass().getName() + z[17]);
            this.this$0.b(vl.RX_TIMEOUT, null);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callStateChanged(com.whatsapp.Voip.CallState r13, com.whatsapp.Voip.CallInfo r14) {
            /*
            r12 = this;
            r10 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
            r8 = 4;
            r6 = 0;
            r7 = 0;
            r0 = com.whatsapp.DialogToastActivity.f;
            r1 = r14.getCallState();
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = r12.getClass();
            r3 = r3.getName();
            r2 = r2.append(r3);
            r3 = z;
            r4 = 54;
            r3 = r3[r4];
            r2 = r2.append(r3);
            r2 = r2.append(r13);
            r3 = z;
            r4 = 57;
            r3 = r3[r4];
            r2 = r2.append(r3);
            r2 = r2.append(r1);
            r3 = 41;
            r2 = r2.append(r3);
            r2 = r2.toString();
            com.whatsapp.util.Log.i(r2);
            if (r1 != r13) goto L_0x0048;
        L_0x0047:
            return;
        L_0x0048:
            r2 = r12.this$0;
            com.whatsapp.VoiceService.a(r2, r1);
            r2 = com.whatsapp.Voip.CallState.ACTIVE;
            if (r1 != r2) goto L_0x005c;
        L_0x0051:
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r2.removeCallbacksAndMessages(r7);
            if (r0 == 0) goto L_0x00ed;
        L_0x005c:
            r2 = com.whatsapp.Voip.CallState.ACCEPT_RECEIVED;
            if (r1 == r2) goto L_0x0064;
        L_0x0060:
            r2 = com.whatsapp.Voip.CallState.ACCEPT_SENT;
            if (r1 != r2) goto L_0x0079;
        L_0x0064:
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r2.removeCallbacksAndMessages(r7);
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r3 = 1;
            r2.sendEmptyMessageDelayed(r3, r10);
            if (r0 == 0) goto L_0x00ed;
        L_0x0079:
            r2 = com.whatsapp.Voip.CallState.RECEIVED_CALL;
            if (r1 != r2) goto L_0x009d;
        L_0x007d:
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r2.removeCallbacksAndMessages(r7);
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r2.sendEmptyMessageDelayed(r8, r10);
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r4 = 45000; // 0xafc8 float:6.3058E-41 double:2.2233E-319;
            r2.sendEmptyMessageDelayed(r6, r4);
            if (r0 == 0) goto L_0x00ed;
        L_0x009d:
            r2 = com.whatsapp.Voip.CallState.CALLING;
            if (r1 != r2) goto L_0x00c4;
        L_0x00a1:
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r2.removeCallbacksAndMessages(r7);
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r4 = 90000; // 0x15f90 float:1.26117E-40 double:4.4466E-319;
            r2.sendEmptyMessageDelayed(r6, r4);
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r3 = 2;
            r4 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
            r2.sendEmptyMessageDelayed(r3, r4);
            if (r0 == 0) goto L_0x00ed;
        L_0x00c4:
            r2 = com.whatsapp.Voip.CallState.NONE;
            if (r1 != r2) goto L_0x00d3;
        L_0x00c8:
            r2 = r12.this$0;
            r2 = com.whatsapp.VoiceService.E(r2);
            r2.removeCallbacksAndMessages(r7);
            if (r0 == 0) goto L_0x00ed;
        L_0x00d3:
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = z;
            r4 = 55;
            r3 = r3[r4];
            r2 = r2.append(r3);
            r2 = r2.append(r1);
            r2 = r2.toString();
            com.whatsapp.auv.a(r2);
        L_0x00ed:
            r2 = com.whatsapp.axh.a;
            r3 = r1.ordinal();
            r2 = r2[r3];
            switch(r2) {
                case 1: goto L_0x010f;
                case 2: goto L_0x0130;
                default: goto L_0x00f8;
            };
        L_0x00f8:
            r0 = r12.this$0;
            r0 = com.whatsapp.VoiceService.e(r0);
            r2 = r13.ordinal();
            r1 = r1.ordinal();
            r0 = android.os.Message.obtain(r0, r8, r2, r1, r14);
            r0.sendToTarget();
            goto L_0x0047;
        L_0x010f:
            r2 = android.os.Build.VERSION.SDK_INT;
            r3 = 16;
            if (r2 < r3) goto L_0x0129;
        L_0x0115:
            r2 = r12.this$0;
            r3 = new android.content.Intent;
            r4 = z;
            r5 = 56;
            r4 = r4[r5];
            r5 = r12.this$0;
            r6 = com.whatsapp.VoiceService.class;
            r3.<init>(r4, r7, r5, r6);
            r2.startService(r3);
        L_0x0129:
            r2 = r12.this$0;
            com.whatsapp.VoiceService.t(r2);
            if (r0 == 0) goto L_0x00f8;
        L_0x0130:
            r0 = r12.this$0;
            com.whatsapp.VoiceService.a(r0, r7);
            r0 = r12.this$0;
            com.whatsapp.VoiceService.b(r0, r7);
            goto L_0x00f8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.VoiceServiceEventCallback.callStateChanged(com.whatsapp.Voip$CallState, com.whatsapp.Voip$CallInfo):void");
        }

        public void callResumed() {
            Log.i(getClass().getName() + z[28]);
        }

        public void p2pTransportRestartSuccess() {
            Log.i(getClass().getName() + z[21]);
        }

        public void incompatibleSrtpKeyExchange() {
            Log.i(getClass().getName() + z[67]);
        }

        public void handleAcceptFailed() {
            Log.i(getClass().getName() + z[11]);
            VoiceService.G(this.this$0);
        }

        public void callInterrupted() {
            Log.i(getClass().getName() + z[51]);
        }

        public void p2pTransportStartFailed() {
            Log.i(getClass().getName() + z[1]);
            VoiceService.G(this.this$0);
        }

        public void audioDriverRestart() {
            Log.i(getClass().getName() + z[66]);
        }

        public void callAcceptSent() {
            Log.i(getClass().getName() + z[26]);
        }

        public void rxTrafficStopped() {
            Log.i(getClass().getName() + z[31]);
            VoiceService.f(this.this$0, true);
        }

        public void callOfferSent() {
            Log.i(getClass().getName() + z[63]);
        }

        public void handleOfferFailed() {
            Log.i(getClass().getName() + z[27]);
            VoiceService.G(this.this$0);
        }

        public void relayLatencySendFailed() {
            Log.i(getClass().getName() + z[12]);
        }

        public void soundPortCreated(int i) {
            Log.i(getClass().getName() + z[8] + i);
            if (VoiceService.T(this.this$0) != null) {
                if (VoiceService.s(this.this$0) == null && VoiceService.T(this.this$0).aec != null && VoiceService.T(this.this$0).aec.builtinEnabled != null && VoiceService.T(this.this$0).aec.builtinEnabled.shortValue() == (short) 2) {
                    VoiceService.b(this.this$0, Voip.d(VoiceService.v()));
                }
                if (VoiceService.S(this.this$0) == null && VoiceService.T(this.this$0).agc != null && VoiceService.T(this.this$0).agc.builtinEnabled != null && VoiceService.T(this.this$0).agc.builtinEnabled.booleanValue()) {
                    VoiceService.c(this.this$0, Voip.c(VoiceService.v()));
                }
                if (VoiceService.I(this.this$0) == null && VoiceService.T(this.this$0).noiseSuppression != null && VoiceService.T(this.this$0).noiseSuppression.builtinEnabled != null && VoiceService.T(this.this$0).noiseSuppression.builtinEnabled.booleanValue()) {
                    VoiceService.a(this.this$0, Voip.h(VoiceService.v()));
                }
            }
        }

        public void errorGatheringHostCandidates() {
            Log.i(getClass().getName() + z[68]);
        }

        public void transportCandSendFailed() {
            Log.i(getClass().getName() + z[25]);
        }

        public void callAcceptReceived() {
            Log.i(getClass().getName() + z[0]);
        }

        public void callAcceptFailed() {
            Log.i(getClass().getName() + z[9]);
            VoiceService.G(this.this$0);
        }

        public void txTimeout() {
            Log.i(getClass().getName() + z[59]);
            this.this$0.b(vl.TX_TIMEOUT, null);
        }

        public void mediaStreamStartError() {
            Log.i(getClass().getName() + z[16]);
            VoiceService.G(this.this$0);
        }

        public void callOfferReceiptReceived() {
            Log.i(getClass().getName() + z[13]);
        }

        public void sendOfferFailed() {
            Log.i(getClass().getName() + z[22]);
        }

        public void missingRelayInfo() {
            Log.i(getClass().getName() + z[20]);
        }

        public void p2pTransportMediaCreateFailed() {
            Log.i(getClass().getName() + z[29]);
            VoiceService.G(this.this$0);
        }

        public void relayCreateSuccess() {
            Log.i(getClass().getName() + z[69]);
        }

        public void callCaptureEnded(DebugTapType debugTapType, RecordingInfo[] recordingInfoArr) {
            VoiceService.g().execute(new q3(this, recordingInfoArr, debugTapType));
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callEnding() {
            /*
            r18 = this;
            r10 = com.whatsapp.DialogToastActivity.f;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = r18.getClass();
            r3 = r3.getName();
            r2 = r2.append(r3);
            r3 = z;
            r4 = 42;
            r3 = r3[r4];
            r2 = r2.append(r3);
            r2 = r2.toString();
            com.whatsapp.util.Log.i(r2);
            com.whatsapp.Voip.checkStreamStatistics();
            r11 = com.whatsapp.Voip.getCallInfo();
            if (r11 != 0) goto L_0x0039;
        L_0x002d:
            r2 = z;	 Catch:{ Throwable -> 0x0037 }
            r3 = 36;
            r2 = r2[r3];	 Catch:{ Throwable -> 0x0037 }
            com.whatsapp.util.Log.e(r2);	 Catch:{ Throwable -> 0x0037 }
        L_0x0036:
            return;
        L_0x0037:
            r2 = move-exception;
            throw r2;
        L_0x0039:
            r12 = new com.whatsapp.protocol.c3;
            r2 = r11.getPeerId();
            r3 = r11.isCaller();
            r4 = r11.getCallId();
            r4 = com.whatsapp.Voip.a(r4);
            r12.<init>(r2, r3, r4);
            r2 = com.whatsapp.App.aK;
            r13 = r2.a(r12);
            r2 = 0;
            r4 = r11.getCallDuration();
            r14 = java.lang.Math.max(r2, r4);
            r0 = r18;
            r0 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r16 = r0;
            r2 = com.whatsapp.Voip.getCallFieldStats();	 Catch:{ Throwable -> 0x049f }
            r3 = r11.getPeerId();	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r4 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r4 = com.whatsapp.VoiceService.c(r4);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r5 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r5 = com.whatsapp.VoiceService.x(r5);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r6 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r6 = com.whatsapp.VoiceService.f(r6);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r7 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r7 = com.whatsapp.VoiceService.l(r7);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r8 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r8 = com.whatsapp.VoiceService.m(r8);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r9 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r9 = com.whatsapp.VoiceService.v(r9);	 Catch:{ Throwable -> 0x049f }
            r2 = com.whatsapp.nf.a(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Throwable -> 0x049f }
            r0 = r16;
            com.whatsapp.VoiceService.a(r0, r2);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x049f }
            r3 = 0;
            r2.callHistEchoLikelihood = r3;	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r3 = com.whatsapp.VoiceService.N(r3);	 Catch:{ Throwable -> 0x049f }
            com.whatsapp.VoiceService.b(r2, r3);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r4 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x049f }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x049f }
            r2 = com.whatsapp.VoiceService.r(r2);	 Catch:{ Throwable -> 0x049f }
            if (r2 == 0) goto L_0x04a1;
        L_0x00d1:
            r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        L_0x00d3:
            r2 = java.lang.Double.valueOf(r2);
            r4.callerHungupBeforeConnected = r2;
            r2 = 0;
            r0 = r18;
            r4 = r0.this$0;
            r4 = com.whatsapp.VoiceService.N(r4);
            r4 = r4.txTotalBytes;
            if (r4 == 0) goto L_0x012d;
        L_0x00e7:
            r0 = r18;
            r4 = r0.this$0;
            r4 = com.whatsapp.VoiceService.N(r4);
            r4 = r4.txTotalBytes;
            r4 = r4.longValue();
            r6 = 0;
            r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r6 < 0) goto L_0x0109;
        L_0x00fb:
            r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r6 > 0) goto L_0x0109;
        L_0x0102:
            r6 = 2;
            com.whatsapp.amd.b(r4, r6);
            r2 = r2 + r4;
            if (r10 == 0) goto L_0x012d;
        L_0x0109:
            r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04a5 }
            r6.<init>();	 Catch:{ Throwable -> 0x04a5 }
            r7 = z;	 Catch:{ Throwable -> 0x04a5 }
            r8 = 40;
            r7 = r7[r8];	 Catch:{ Throwable -> 0x04a5 }
            r6 = r6.append(r7);	 Catch:{ Throwable -> 0x04a5 }
            r4 = r6.append(r4);	 Catch:{ Throwable -> 0x04a5 }
            r5 = z;	 Catch:{ Throwable -> 0x04a5 }
            r6 = 46;
            r5 = r5[r6];	 Catch:{ Throwable -> 0x04a5 }
            r4 = r4.append(r5);	 Catch:{ Throwable -> 0x04a5 }
            r4 = r4.toString();	 Catch:{ Throwable -> 0x04a5 }
            com.whatsapp.util.Log.e(r4);	 Catch:{ Throwable -> 0x04a5 }
        L_0x012d:
            r0 = r18;
            r4 = r0.this$0;
            r4 = com.whatsapp.VoiceService.N(r4);
            r4 = r4.rxTotalBytes;
            if (r4 == 0) goto L_0x04e3;
        L_0x0139:
            r0 = r18;
            r4 = r0.this$0;
            r4 = com.whatsapp.VoiceService.N(r4);
            r4 = r4.rxTotalBytes;
            r4 = r4.longValue();
            r6 = 0;
            r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r6 < 0) goto L_0x015b;
        L_0x014d:
            r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r6 > 0) goto L_0x015b;
        L_0x0154:
            r6 = 2;
            com.whatsapp.amd.a(r4, r6);
            r2 = r2 + r4;
            if (r10 == 0) goto L_0x04e3;
        L_0x015b:
            r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04a7 }
            r6.<init>();	 Catch:{ Throwable -> 0x04a7 }
            r7 = z;	 Catch:{ Throwable -> 0x04a7 }
            r8 = 39;
            r7 = r7[r8];	 Catch:{ Throwable -> 0x04a7 }
            r6 = r6.append(r7);	 Catch:{ Throwable -> 0x04a7 }
            r4 = r6.append(r4);	 Catch:{ Throwable -> 0x04a7 }
            r5 = z;	 Catch:{ Throwable -> 0x04a7 }
            r6 = 44;
            r5 = r5[r6];	 Catch:{ Throwable -> 0x04a7 }
            r4 = r4.append(r5);	 Catch:{ Throwable -> 0x04a7 }
            r4 = r4.toString();	 Catch:{ Throwable -> 0x04a7 }
            com.whatsapp.util.Log.e(r4);	 Catch:{ Throwable -> 0x04a7 }
            r4 = r2;
        L_0x0180:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04a9 }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04a9 }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04a9 }
            r3 = com.whatsapp.VoiceService.A(r3);	 Catch:{ Throwable -> 0x04a9 }
            r2.endCallAfterConfirmation = r3;	 Catch:{ Throwable -> 0x04a9 }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04a9 }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04a9 }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04a9 }
            r3 = com.whatsapp.VoiceService.C(r3);	 Catch:{ Throwable -> 0x04a9 }
            r2.presentEndCallConfirmation = r3;	 Catch:{ Throwable -> 0x04a9 }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04a9 }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04a9 }
            r2 = r2.callAecMode;	 Catch:{ Throwable -> 0x04a9 }
            r2 = r2.doubleValue();	 Catch:{ Throwable -> 0x04a9 }
            r6 = com.whatsapp.fieldstats.ao.BUILTIN;	 Catch:{ Throwable -> 0x04a9 }
            r6 = r6.getCode();	 Catch:{ Throwable -> 0x04a9 }
            r6 = (double) r6;	 Catch:{ Throwable -> 0x04a9 }
            r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
            if (r2 == 0) goto L_0x01cb;
        L_0x01bd:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04a9 }
            r2 = com.whatsapp.VoiceService.s(r2);	 Catch:{ Throwable -> 0x04a9 }
            r2 = com.whatsapp.Voip.a(r2);	 Catch:{ Throwable -> 0x04a9 }
            if (r2 == 0) goto L_0x04ad;
        L_0x01cb:
            r2 = 1;
        L_0x01cc:
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04b0 }
            r6 = com.whatsapp.VoiceService.N(r3);	 Catch:{ Throwable -> 0x04b0 }
            if (r2 == 0) goto L_0x04b2;
        L_0x01d6:
            r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        L_0x01d8:
            r2 = java.lang.Double.valueOf(r2);
            r6.builtinAecEnabled = r2;
            r2 = android.os.Build.VERSION.SDK_INT;
            r3 = 17;
            if (r2 < r3) goto L_0x0258;
        L_0x01e4:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04b6 }
            r3 = z;	 Catch:{ Throwable -> 0x04b6 }
            r6 = 47;
            r3 = r3[r6];	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.getSystemService(r3);	 Catch:{ Throwable -> 0x04b6 }
            r2 = (android.media.AudioManager) r2;	 Catch:{ Throwable -> 0x04b6 }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04b6 }
            r3 = com.whatsapp.VoiceService.N(r3);	 Catch:{ Throwable -> 0x04b6 }
            r6 = z;	 Catch:{ Throwable -> 0x04b6 }
            r7 = 45;
            r6 = r6[r7];	 Catch:{ Throwable -> 0x04b6 }
            r6 = r2.getProperty(r6);	 Catch:{ Throwable -> 0x04b6 }
            r3.nativeSamplingRate = r6;	 Catch:{ Throwable -> 0x04b6 }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04b6 }
            r3 = com.whatsapp.VoiceService.N(r3);	 Catch:{ Throwable -> 0x04b6 }
            r6 = z;	 Catch:{ Throwable -> 0x04b6 }
            r7 = 48;
            r6 = r6[r7];	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.getProperty(r6);	 Catch:{ Throwable -> 0x04b6 }
            r3.nativeSamplesPerFrame = r2;	 Catch:{ Throwable -> 0x04b6 }
            r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04b6 }
            r2.<init>();	 Catch:{ Throwable -> 0x04b6 }
            r3 = z;	 Catch:{ Throwable -> 0x04b6 }
            r6 = 41;
            r3 = r3[r6];	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04b6 }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04b6 }
            r3 = com.whatsapp.VoiceService.N(r3);	 Catch:{ Throwable -> 0x04b6 }
            r3 = r3.nativeSamplingRate;	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04b6 }
            r3 = z;	 Catch:{ Throwable -> 0x04b6 }
            r6 = 50;
            r3 = r3[r6];	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04b6 }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04b6 }
            r3 = com.whatsapp.VoiceService.N(r3);	 Catch:{ Throwable -> 0x04b6 }
            r3 = r3.nativeSamplesPerFrame;	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04b6 }
            r2 = r2.toString();	 Catch:{ Throwable -> 0x04b6 }
            com.whatsapp.util.Log.i(r2);	 Catch:{ Throwable -> 0x04b6 }
        L_0x0258:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04bc }
            r2 = com.whatsapp.VoiceService.l(r2);	 Catch:{ Throwable -> 0x04bc }
            r3 = com.whatsapp.fieldstats.ce.GCM_PUSH;	 Catch:{ Throwable -> 0x04bc }
            if (r2 != r3) goto L_0x0285;
        L_0x0264:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04be }
            r2 = com.whatsapp.VoiceService.y(r2);	 Catch:{ Throwable -> 0x04be }
            if (r2 == 0) goto L_0x0285;
        L_0x026e:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04be }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04be }
            r0 = r18;
            r3 = r0.this$0;	 Catch:{ Throwable -> 0x04be }
            r6 = com.whatsapp.VoiceService.p(r3);	 Catch:{ Throwable -> 0x04be }
            r6 = (double) r6;	 Catch:{ Throwable -> 0x04be }
            r3 = java.lang.Double.valueOf(r6);	 Catch:{ Throwable -> 0x04be }
            r2.pushToCallOfferDelay = r3;	 Catch:{ Throwable -> 0x04be }
        L_0x0285:
            r2 = r11.isCaller();	 Catch:{ Throwable -> 0x04c0 }
            if (r2 == 0) goto L_0x029e;
        L_0x028b:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04c0 }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04c0 }
            r3 = com.whatsapp.VoiceService.e();	 Catch:{ Throwable -> 0x04c0 }
            r6 = (double) r3;	 Catch:{ Throwable -> 0x04c0 }
            r3 = java.lang.Double.valueOf(r6);	 Catch:{ Throwable -> 0x04c0 }
            r2.callOfferAckTimout = r3;	 Catch:{ Throwable -> 0x04c0 }
        L_0x029e:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04c2 }
            r2 = com.whatsapp.VoiceService.i(r2);	 Catch:{ Throwable -> 0x04c2 }
            if (r2 == 0) goto L_0x037c;
        L_0x02a8:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04c2 }
            r2 = com.whatsapp.VoiceService.i(r2);	 Catch:{ Throwable -> 0x04c2 }
            r2 = r2.length;	 Catch:{ Throwable -> 0x04c2 }
            r3 = 6;
            if (r2 != r3) goto L_0x037c;
        L_0x02b4:
            r0 = r18;
            r2 = r0.this$0;
            r2 = com.whatsapp.VoiceService.i(r2);
            r3 = 0;
            r2 = r2[r3];
            r2 = (long) r2;
            r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r2 = r2 & r6;
            r6 = 24;
            r2 = r2 << r6;
            r0 = r18;
            r6 = r0.this$0;
            r6 = com.whatsapp.VoiceService.i(r6);
            r7 = 1;
            r6 = r6[r7];
            r6 = (long) r6;
            r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r6 = r6 & r8;
            r8 = 16;
            r6 = r6 << r8;
            r2 = r2 | r6;
            r0 = r18;
            r6 = r0.this$0;
            r6 = com.whatsapp.VoiceService.i(r6);
            r7 = 2;
            r6 = r6[r7];
            r6 = (long) r6;
            r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r6 = r6 & r8;
            r8 = 8;
            r6 = r6 << r8;
            r2 = r2 | r6;
            r0 = r18;
            r6 = r0.this$0;
            r6 = com.whatsapp.VoiceService.i(r6);
            r7 = 3;
            r6 = r6[r7];
            r6 = (long) r6;
            r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r6 = r6 & r8;
            r2 = r2 | r6;
            r0 = r18;
            r6 = r0.this$0;
            r6 = com.whatsapp.VoiceService.i(r6);
            r7 = 4;
            r6 = r6[r7];
            r6 = (long) r6;
            r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r6 = r6 & r8;
            r8 = 8;
            r6 = r6 << r8;
            r0 = r18;
            r8 = r0.this$0;
            r8 = com.whatsapp.VoiceService.i(r8);
            r9 = 5;
            r8 = r8[r9];
            r8 = (long) r8;
            r16 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r8 = r8 & r16;
            r6 = r6 | r8;
            r8 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04c4 }
            r8.<init>();	 Catch:{ Throwable -> 0x04c4 }
            r9 = z;	 Catch:{ Throwable -> 0x04c4 }
            r16 = 33;
            r9 = r9[r16];	 Catch:{ Throwable -> 0x04c4 }
            r8 = r8.append(r9);	 Catch:{ Throwable -> 0x04c4 }
            r0 = r18;
            r9 = r0.this$0;	 Catch:{ Throwable -> 0x04c4 }
            r9 = com.whatsapp.VoiceService.i(r9);	 Catch:{ Throwable -> 0x04c4 }
            r9 = java.util.Arrays.toString(r9);	 Catch:{ Throwable -> 0x04c4 }
            r8 = r8.append(r9);	 Catch:{ Throwable -> 0x04c4 }
            r9 = z;	 Catch:{ Throwable -> 0x04c4 }
            r16 = 37;
            r9 = r9[r16];	 Catch:{ Throwable -> 0x04c4 }
            r8 = r8.append(r9);	 Catch:{ Throwable -> 0x04c4 }
            r8 = r8.append(r2);	 Catch:{ Throwable -> 0x04c4 }
            r9 = z;	 Catch:{ Throwable -> 0x04c4 }
            r16 = 34;
            r9 = r9[r16];	 Catch:{ Throwable -> 0x04c4 }
            r8 = r8.append(r9);	 Catch:{ Throwable -> 0x04c4 }
            r6 = r8.append(r6);	 Catch:{ Throwable -> 0x04c4 }
            r6 = r6.toString();	 Catch:{ Throwable -> 0x04c4 }
            com.whatsapp.util.Log.i(r6);	 Catch:{ Throwable -> 0x04c4 }
            r0 = r18;
            r6 = r0.this$0;	 Catch:{ Throwable -> 0x04c4 }
            r6 = com.whatsapp.VoiceService.N(r6);	 Catch:{ Throwable -> 0x04c4 }
            r6 = r6.callSelfIpv4;	 Catch:{ Throwable -> 0x04c4 }
            if (r6 != 0) goto L_0x037c;
        L_0x036d:
            r0 = r18;
            r6 = r0.this$0;	 Catch:{ Throwable -> 0x04c4 }
            r6 = com.whatsapp.VoiceService.N(r6);	 Catch:{ Throwable -> 0x04c4 }
            r2 = (double) r2;	 Catch:{ Throwable -> 0x04c4 }
            r2 = java.lang.Double.valueOf(r2);	 Catch:{ Throwable -> 0x04c4 }
            r6.callSelfIpv4 = r2;	 Catch:{ Throwable -> 0x04c4 }
        L_0x037c:
            r2 = r11.isCaller();	 Catch:{ Throwable -> 0x04c6 }
            if (r2 == 0) goto L_0x03bd;
        L_0x0382:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04c8 }
            r6 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04c8 }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04c8 }
            r2 = com.whatsapp.VoiceService.j(r2);	 Catch:{ Throwable -> 0x04c8 }
            if (r2 == 0) goto L_0x04ca;
        L_0x0394:
            r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        L_0x0396:
            r2 = java.lang.Double.valueOf(r2);	 Catch:{ Throwable -> 0x04ce }
            r6.smallCallButton = r2;	 Catch:{ Throwable -> 0x04ce }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04ce }
            r2 = com.whatsapp.VoiceService.u(r2);	 Catch:{ Throwable -> 0x04ce }
            r3 = com.whatsapp.vl.CALL_OFFER_ACK_CORRUPT;	 Catch:{ Throwable -> 0x04ce }
            if (r2 != r3) goto L_0x03bd;
        L_0x03a8:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04ce }
            r2 = com.whatsapp.VoiceService.N(r2);	 Catch:{ Throwable -> 0x04ce }
            r3 = com.whatsapp.fieldstats.v.CALL_OFFER_ACK_CORRUPT;	 Catch:{ Throwable -> 0x04ce }
            r3 = r3.getCode();	 Catch:{ Throwable -> 0x04ce }
            r6 = (double) r3;	 Catch:{ Throwable -> 0x04ce }
            r3 = java.lang.Double.valueOf(r6);	 Catch:{ Throwable -> 0x04ce }
            r2.callResult = r3;	 Catch:{ Throwable -> 0x04ce }
        L_0x03bd:
            if (r13 == 0) goto L_0x043d;
        L_0x03bf:
            r2 = (int) r14;
            r2 = r2 / 1000;
            r13.H = r2;	 Catch:{ Throwable -> 0x04d0 }
            r2 = r11.isEndedByMe();	 Catch:{ Throwable -> 0x04d0 }
            if (r2 == 0) goto L_0x04d2;
        L_0x03ca:
            r2 = 1;
        L_0x03cc:
            r13.z = r2;	 Catch:{ Throwable -> 0x04d6 }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04d6 }
            r2 = com.whatsapp.VoiceService.y(r2);	 Catch:{ Throwable -> 0x04d6 }
            if (r2 == 0) goto L_0x04d8;
        L_0x03d8:
            r2 = z;	 Catch:{ Throwable -> 0x04d6 }
            r3 = 49;
            r2 = r2[r3];	 Catch:{ Throwable -> 0x04d6 }
        L_0x03de:
            r13.q = r2;	 Catch:{ Throwable -> 0x04db }
            r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04db }
            r2.<init>();	 Catch:{ Throwable -> 0x04db }
            r3 = "";
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r4);	 Catch:{ Throwable -> 0x04db }
            r2 = r2.toString();	 Catch:{ Throwable -> 0x04db }
            r13.A = r2;	 Catch:{ Throwable -> 0x04db }
            r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04db }
            r2.<init>();	 Catch:{ Throwable -> 0x04db }
            r3 = r18.getClass();	 Catch:{ Throwable -> 0x04db }
            r3 = r3.getName();	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r3 = z;	 Catch:{ Throwable -> 0x04db }
            r6 = 35;
            r3 = r3[r6];	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r3 = r13.H;	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r3 = z;	 Catch:{ Throwable -> 0x04db }
            r6 = 32;
            r3 = r3[r6];	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r4);	 Catch:{ Throwable -> 0x04db }
            r3 = z;	 Catch:{ Throwable -> 0x04db }
            r4 = 43;
            r3 = r3[r4];	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r2 = r2.toString();	 Catch:{ Throwable -> 0x04db }
            com.whatsapp.util.Log.i(r2);	 Catch:{ Throwable -> 0x04db }
            r2 = com.whatsapp.App.aK;	 Catch:{ Throwable -> 0x04db }
            r2.c(r13);	 Catch:{ Throwable -> 0x04db }
            if (r10 == 0) goto L_0x0457;
        L_0x043d:
            r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x04db }
            r2.<init>();	 Catch:{ Throwable -> 0x04db }
            r3 = z;	 Catch:{ Throwable -> 0x04db }
            r4 = 38;
            r3 = r3[r4];	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r3);	 Catch:{ Throwable -> 0x04db }
            r2 = r2.append(r12);	 Catch:{ Throwable -> 0x04db }
            r2 = r2.toString();	 Catch:{ Throwable -> 0x04db }
            com.whatsapp.util.Log.e(r2);	 Catch:{ Throwable -> 0x04db }
        L_0x0457:
            r2 = com.whatsapp.App.K();	 Catch:{ Throwable -> 0x04dd }
            if (r2 == 0) goto L_0x0461;
        L_0x045d:
            r2 = 0;
            com.whatsapp.dg.a(r2);	 Catch:{ Throwable -> 0x04dd }
        L_0x0461:
            r2 = com.whatsapp.VoiceService.g();	 Catch:{ Throwable -> 0x04df }
            r3 = new com.whatsapp.so;	 Catch:{ Throwable -> 0x04df }
            r0 = r18;
            r3.<init>(r0);	 Catch:{ Throwable -> 0x04df }
            r2.execute(r3);	 Catch:{ Throwable -> 0x04df }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04df }
            com.whatsapp.VoiceService.H(r2);	 Catch:{ Throwable -> 0x04df }
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x04df }
            r2 = com.whatsapp.VoiceService.o(r2);	 Catch:{ Throwable -> 0x04df }
            if (r2 == 0) goto L_0x0036;
        L_0x0480:
            r2 = r11.isCaller();	 Catch:{ Throwable -> 0x04e1 }
            if (r2 != 0) goto L_0x048e;
        L_0x0486:
            r2 = r11.getCallState();	 Catch:{ Throwable -> 0x049d }
            r3 = com.whatsapp.Voip.CallState.ACCEPT_SENT;	 Catch:{ Throwable -> 0x049d }
            if (r2 != r3) goto L_0x0036;
        L_0x048e:
            r0 = r18;
            r2 = r0.this$0;	 Catch:{ Throwable -> 0x049d }
            r3 = r11.getPeerId();	 Catch:{ Throwable -> 0x049d }
            r4 = 6;
            r5 = 0;
            com.whatsapp.VoiceService.a(r2, r3, r4, r5);	 Catch:{ Throwable -> 0x049d }
            goto L_0x0036;
        L_0x049d:
            r2 = move-exception;
            throw r2;
        L_0x049f:
            r2 = move-exception;
            throw r2;
        L_0x04a1:
            r2 = 0;
            goto L_0x00d3;
        L_0x04a5:
            r2 = move-exception;
            throw r2;
        L_0x04a7:
            r2 = move-exception;
            throw r2;
        L_0x04a9:
            r2 = move-exception;
            throw r2;	 Catch:{ Throwable -> 0x04ab }
        L_0x04ab:
            r2 = move-exception;
            throw r2;
        L_0x04ad:
            r2 = 0;
            goto L_0x01cc;
        L_0x04b0:
            r2 = move-exception;
            throw r2;
        L_0x04b2:
            r2 = 0;
            goto L_0x01d8;
        L_0x04b6:
            r2 = move-exception;
            com.whatsapp.util.Log.a(r2);
            goto L_0x0258;
        L_0x04bc:
            r2 = move-exception;
            throw r2;	 Catch:{ Throwable -> 0x04be }
        L_0x04be:
            r2 = move-exception;
            throw r2;
        L_0x04c0:
            r2 = move-exception;
            throw r2;
        L_0x04c2:
            r2 = move-exception;
            throw r2;
        L_0x04c4:
            r2 = move-exception;
            throw r2;
        L_0x04c6:
            r2 = move-exception;
            throw r2;	 Catch:{ Throwable -> 0x04c8 }
        L_0x04c8:
            r2 = move-exception;
            throw r2;
        L_0x04ca:
            r2 = 0;
            goto L_0x0396;
        L_0x04ce:
            r2 = move-exception;
            throw r2;
        L_0x04d0:
            r2 = move-exception;
            throw r2;
        L_0x04d2:
            r2 = 0;
            goto L_0x03cc;
        L_0x04d6:
            r2 = move-exception;
            throw r2;
        L_0x04d8:
            r2 = 0;
            goto L_0x03de;
        L_0x04db:
            r2 = move-exception;
            throw r2;
        L_0x04dd:
            r2 = move-exception;
            throw r2;
        L_0x04df:
            r2 = move-exception;
            throw r2;	 Catch:{ Throwable -> 0x04e1 }
        L_0x04e1:
            r2 = move-exception;
            throw r2;	 Catch:{ Throwable -> 0x049d }
        L_0x04e3:
            r4 = r2;
            goto L_0x0180;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.VoiceServiceEventCallback.callEnding():void");
        }

        public void rxTrafficStarted() {
            Log.i(getClass().getName() + z[30]);
            VoiceService.f(this.this$0, false);
        }

        public void callCaptureBufferFilled(DebugTapType debugTapType, byte[] bArr, int i, RecordingInfo[] recordingInfoArr) {
            if (bArr != null && bArr.length > 0 && i > 0 && recordingInfoArr != null) {
                VoiceService.g().execute(new gz(this, recordingInfoArr, debugTapType, bArr, i));
            }
        }

        public void mediaStreamError() {
            Log.i(getClass().getName() + z[19]);
            VoiceService.G(this.this$0);
        }

        public void soundPortCreateFailed() {
            Log.i(getClass().getName() + z[18]);
            VoiceService.G(this.this$0);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callOfferNacked(int r5) {
            /*
            r4 = this;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = r4.getClass();
            r2 = r2.getName();
            r0 = r0.append(r2);
            r2 = z;
            r3 = 10;
            r2 = r2[r3];
            r0 = r0.append(r2);
            r0 = r0.append(r5);
            r0 = r0.toString();
            com.whatsapp.util.Log.i(r0);
            r2 = com.whatsapp.Voip.getPeerJid();
            if (r2 == 0) goto L_0x0038;
        L_0x002e:
            switch(r5) {
                case 401: goto L_0x003e;
                case 405: goto L_0x0041;
                default: goto L_0x0031;
            };
        L_0x0031:
            r0 = 0;
        L_0x0032:
            r1 = r4.this$0;
            r3 = 0;
            com.whatsapp.VoiceService.a(r1, r2, r0, r3);
        L_0x0038:
            r0 = r4.this$0;
            com.whatsapp.VoiceService.G(r0);
            return;
        L_0x003e:
            r0 = 3;
            if (r1 == 0) goto L_0x0032;
        L_0x0041:
            r0 = 4;
            if (r1 == 0) goto L_0x0032;
        L_0x0044:
            goto L_0x0031;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.VoiceServiceEventCallback.callOfferNacked(int):void");
        }

        public void NoSamplingRatesForAudioRecord() {
            Log.i(getClass().getName() + z[23]);
            VoiceService.G(this.this$0);
        }

        public byte[] getByteBuffer(int i) {
            return this.bufferQueue.a(i);
        }
    }

    public void k() {
        try {
            boolean z;
            if (this.aC != a7.BLUETOOTH) {
                z = true;
            } else {
                z = false;
            }
            b(z);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static void a(VoiceService voiceService, CallState callState, CallInfo callInfo) {
        voiceService.a(callState, callInfo);
    }

    static Ringtone a(VoiceService voiceService, Ringtone ringtone) {
        voiceService.Y = ringtone;
        return ringtone;
    }

    static ThreadPoolExecutor g() {
        return au;
    }

    public String a(boolean z) {
        String peerJid = Voip.getPeerJid();
        if (peerJid == null) {
            try {
                Log.w(bb[42]);
                return null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        l5 b = App.as.b(peerJid);
        if (!z) {
            return b.a((Context) this);
        }
        try {
            return b.i();
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void p() {
        this.R.removeMessages(0);
        this.R.sendEmptyMessage(0);
    }

    static Integer d(VoiceService voiceService) {
        return voiceService.af;
    }

    public boolean i() {
        try {
            if (VERSION.SDK_INT < 8) {
                return false;
            }
            if (this.N == null || !this.N.isEnabled()) {
                return false;
            }
            AudioManager audioManager = (AudioManager) getSystemService(bb[180]);
            if (!audioManager.isBluetoothScoAvailableOffCall()) {
                return false;
            }
            try {
                if (VERSION.SDK_INT >= 11) {
                    boolean z;
                    if (this.az != null) {
                        if (!this.az.getConnectedDevices().isEmpty()) {
                            z = true;
                            return z;
                        }
                    }
                    z = false;
                    return z;
                }
                try {
                    if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e22) {
                throw e22;
            } catch (Exception e222) {
                try {
                    throw e222;
                } catch (Exception e2222) {
                    throw e2222;
                }
            }
        } catch (Exception e22222) {
            throw e22222;
        } catch (Throwable e3) {
            Log.a(e3);
            return false;
        }
    }

    private void C() {
        boolean z = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            Voip.muteCall(this.B);
            String peerId = callInfo.getPeerId();
            try {
                String str = co.a(peerId, true).b;
                String callId = callInfo.getCallId();
                if (this.B) {
                    z = false;
                }
                App.a(str, peerId, callId, z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static void d(VoiceService voiceService, boolean z) {
        voiceService.d(z);
    }

    static boolean w(VoiceService voiceService) {
        return voiceService.W;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r13, int r14, int r15) {
        /*
        r12 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r13 != 0) goto L_0x001a;
    L_0x0004:
        r0 = bb;	 Catch:{ Throwable -> 0x0016 }
        r1 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x0016 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x0016 }
        r0 = r12.F;	 Catch:{ Throwable -> 0x0016 }
        if (r0 != 0) goto L_0x0014;
    L_0x0011:
        r12.stopSelf();	 Catch:{ Throwable -> 0x0018 }
    L_0x0014:
        r0 = 2;
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r3 = r13.getAction();
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x006a }
        r0.<init>();	 Catch:{ Throwable -> 0x006a }
        r1 = bb;	 Catch:{ Throwable -> 0x006a }
        r4 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x006a }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x006a }
        r0 = r0.append(r13);	 Catch:{ Throwable -> 0x006a }
        r1 = bb;	 Catch:{ Throwable -> 0x006a }
        r4 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x006a }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x006a }
        r0 = r0.append(r14);	 Catch:{ Throwable -> 0x006a }
        r1 = bb;	 Catch:{ Throwable -> 0x006a }
        r4 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x006a }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x006a }
        r0 = r0.append(r15);	 Catch:{ Throwable -> 0x006a }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x006a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Throwable -> 0x006a }
        if (r3 != 0) goto L_0x006c;
    L_0x0056:
        r0 = bb;	 Catch:{ Throwable -> 0x006a }
        r1 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x006a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x006a }
        r0 = bb;	 Catch:{ Throwable -> 0x006a }
        r1 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x006a }
        com.whatsapp.auv.a(r0);	 Catch:{ Throwable -> 0x006a }
        r0 = 2;
        goto L_0x0015;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r0 = r12.F;	 Catch:{ Throwable -> 0x00a0 }
        if (r0 != 0) goto L_0x00a8;
    L_0x0070:
        r0 = bb;	 Catch:{ Throwable -> 0x00a0 }
        r1 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x00a0 }
        r0 = r0.equals(r3);	 Catch:{ Throwable -> 0x00a0 }
        if (r0 != 0) goto L_0x00a8;
    L_0x007c:
        r0 = bb;	 Catch:{ Throwable -> 0x00a2 }
        r1 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x00a2 }
        r0 = r0.equals(r3);	 Catch:{ Throwable -> 0x00a2 }
        if (r0 != 0) goto L_0x00a8;
    L_0x0088:
        r0 = bb;	 Catch:{ Throwable -> 0x00a4 }
        r1 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x00a4 }
        r0 = r0.equals(r3);	 Catch:{ Throwable -> 0x00a4 }
        if (r0 != 0) goto L_0x00a8;
    L_0x0094:
        r0 = bb;	 Catch:{ Throwable -> 0x00a6 }
        r1 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x00a6 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x00a6 }
        r0 = 2;
        goto L_0x0015;
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = r12.e;	 Catch:{ Throwable -> 0x00bd }
        if (r0 == 0) goto L_0x00bf;
    L_0x00ac:
        r0 = bb;	 Catch:{ Throwable -> 0x00bd }
        r1 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x00bd }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x00bd }
        r0 = r12.g;	 Catch:{ Throwable -> 0x00bd }
        r0.add(r13);	 Catch:{ Throwable -> 0x00bd }
        r0 = 2;
        goto L_0x0015;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r4 = android.os.SystemClock.elapsedRealtime();
        r0 = -1;
        r1 = r3.hashCode();	 Catch:{ Throwable -> 0x0165 }
        switch(r1) {
            case -1573659621: goto L_0x011a;
            case 1281366991: goto L_0x0156;
            case 1331833598: goto L_0x0138;
            case 1444513451: goto L_0x0129;
            case 2138982608: goto L_0x0147;
            default: goto L_0x00cb;
        };
    L_0x00cb:
        switch(r0) {
            case 0: goto L_0x016f;
            case 1: goto L_0x02a5;
            case 2: goto L_0x036a;
            case 3: goto L_0x037c;
            case 4: goto L_0x0397;
            default: goto L_0x00ce;
        };
    L_0x00ce:
        r0 = bb;	 Catch:{ Throwable -> 0x03dc }
        r1 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x03dc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x03dc }
    L_0x00d7:
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r4;
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x03de }
        r2.<init>();	 Catch:{ Throwable -> 0x03de }
        r4 = bb;	 Catch:{ Throwable -> 0x03de }
        r5 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x03de }
        r2 = r2.append(r4);	 Catch:{ Throwable -> 0x03de }
        r2 = r2.append(r3);	 Catch:{ Throwable -> 0x03de }
        r3 = bb;	 Catch:{ Throwable -> 0x03de }
        r4 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r3 = r3[r4];	 Catch:{ Throwable -> 0x03de }
        r2 = r2.append(r3);	 Catch:{ Throwable -> 0x03de }
        r0 = r2.append(r0);	 Catch:{ Throwable -> 0x03de }
        r1 = bb;	 Catch:{ Throwable -> 0x03de }
        r2 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r1 = r1[r2];	 Catch:{ Throwable -> 0x03de }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x03de }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x03de }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Throwable -> 0x03de }
        r0 = com.whatsapp.Voip.d();	 Catch:{ Throwable -> 0x03de }
        if (r0 != 0) goto L_0x0117;
    L_0x0114:
        r12.l();	 Catch:{ Throwable -> 0x03de }
    L_0x0117:
        r0 = 2;
        goto L_0x0015;
    L_0x011a:
        r1 = bb;	 Catch:{ Throwable -> 0x0165 }
        r6 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r1 = r1[r6];	 Catch:{ Throwable -> 0x0165 }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x0165 }
        if (r1 == 0) goto L_0x00cb;
    L_0x0126:
        r0 = 0;
        if (r2 == 0) goto L_0x00cb;
    L_0x0129:
        r1 = bb;	 Catch:{ Throwable -> 0x0167 }
        r6 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r1 = r1[r6];	 Catch:{ Throwable -> 0x0167 }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x0167 }
        if (r1 == 0) goto L_0x00cb;
    L_0x0135:
        r0 = 1;
        if (r2 == 0) goto L_0x00cb;
    L_0x0138:
        r1 = bb;	 Catch:{ Throwable -> 0x0169 }
        r6 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r1 = r1[r6];	 Catch:{ Throwable -> 0x0169 }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x0169 }
        if (r1 == 0) goto L_0x00cb;
    L_0x0144:
        r0 = 2;
        if (r2 == 0) goto L_0x00cb;
    L_0x0147:
        r1 = bb;	 Catch:{ Throwable -> 0x016b }
        r6 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r1 = r1[r6];	 Catch:{ Throwable -> 0x016b }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x016b }
        if (r1 == 0) goto L_0x00cb;
    L_0x0153:
        r0 = 3;
        if (r2 == 0) goto L_0x00cb;
    L_0x0156:
        r1 = bb;	 Catch:{ Throwable -> 0x016d }
        r6 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r1 = r1[r6];	 Catch:{ Throwable -> 0x016d }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x016d }
        if (r1 == 0) goto L_0x00cb;
    L_0x0162:
        r0 = 4;
        goto L_0x00cb;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r0 = move-exception;
        throw r0;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = bb;
        r1 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r0 = r0[r1];
        r1 = r13.getStringExtra(r0);
        r0 = bb;
        r6 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r0 = r0[r6];
        r6 = -1;
        r0 = r13.getIntExtra(r0, r6);
        r6 = (double) r0;
        r8 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x03a9;
    L_0x018b:
        r0 = 0;
    L_0x018c:
        r12.d = r0;
        r0 = bb;
        r6 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r0 = r0[r6];
        r6 = 0;
        r0 = r13.getBooleanExtra(r0, r6);
        r12.at = r0;
        r0 = bb;
        r6 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r0 = r0[r6];
        r0 = r12.getSystemService(r0);
        r0 = (android.telephony.TelephonyManager) r0;
        r0 = r0.getCallState();	 Catch:{ Throwable -> 0x03af }
        if (r0 == 0) goto L_0x03b1;
    L_0x01ad:
        r0 = 1;
    L_0x01ae:
        r12.W = r0;	 Catch:{ Throwable -> 0x03b4 }
        r0 = r12.W;	 Catch:{ Throwable -> 0x03b4 }
        if (r0 == 0) goto L_0x01cd;
    L_0x01b4:
        r0 = bb;	 Catch:{ Throwable -> 0x03b4 }
        r6 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r0 = r0[r6];	 Catch:{ Throwable -> 0x03b4 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x03b4 }
        r0 = 2131230882; // 0x7f0800a2 float:1.807783E38 double:1.052967962E-314;
        r6 = 1;
        com.whatsapp.App.b(r12, r0, r6);	 Catch:{ Throwable -> 0x03b4 }
        r0 = com.whatsapp.fieldstats.v.CALL_CANCELED_CELLULAR_IN_PROGRESS;	 Catch:{ Throwable -> 0x03b4 }
        r6 = r12.d;	 Catch:{ Throwable -> 0x03b4 }
        a(r0, r1, r6);	 Catch:{ Throwable -> 0x03b4 }
        if (r2 == 0) goto L_0x00d7;
    L_0x01cd:
        r0 = com.whatsapp.App.az();	 Catch:{ Throwable -> 0x03b6 }
        if (r0 != 0) goto L_0x020b;
    L_0x01d3:
        r0 = com.whatsapp.App.z(r12);	 Catch:{ Throwable -> 0x03b8 }
        if (r0 == 0) goto L_0x01f2;
    L_0x01d9:
        r0 = bb;	 Catch:{ Throwable -> 0x03ba }
        r6 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r0 = r0[r6];	 Catch:{ Throwable -> 0x03ba }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x03ba }
        r0 = 2131230881; // 0x7f0800a1 float:1.8077827E38 double:1.0529679617E-314;
        r6 = 1;
        com.whatsapp.App.b(r12, r0, r6);	 Catch:{ Throwable -> 0x03ba }
        r0 = com.whatsapp.fieldstats.v.CALL_CANCELED_AIRPLANE_MODE_ON;	 Catch:{ Throwable -> 0x03ba }
        r6 = r12.d;	 Catch:{ Throwable -> 0x03ba }
        a(r0, r1, r6);	 Catch:{ Throwable -> 0x03ba }
        if (r2 == 0) goto L_0x00d7;
    L_0x01f2:
        r0 = bb;	 Catch:{ Throwable -> 0x03bc }
        r6 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r0 = r0[r6];	 Catch:{ Throwable -> 0x03bc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x03bc }
        r0 = 2131232246; // 0x7f0805f6 float:1.8080596E38 double:1.052968636E-314;
        r6 = 1;
        com.whatsapp.App.b(r12, r0, r6);	 Catch:{ Throwable -> 0x03bc }
        r0 = com.whatsapp.fieldstats.v.CALL_CANCELED_NO_NETWORK;	 Catch:{ Throwable -> 0x03bc }
        r6 = r12.d;	 Catch:{ Throwable -> 0x03bc }
        a(r0, r1, r6);	 Catch:{ Throwable -> 0x03bc }
        if (r2 == 0) goto L_0x00d7;
    L_0x020b:
        r0 = com.whatsapp.App.z();	 Catch:{ Throwable -> 0x03be }
        r0 = com.whatsapp.vh.j(r0);	 Catch:{ Throwable -> 0x03be }
        if (r0 != 0) goto L_0x0217;
    L_0x0215:
        if (r2 == 0) goto L_0x00d7;
    L_0x0217:
        r0 = 1;
        r0 = com.whatsapp.protocol.co.a(r1, r0);
        r0 = r0.b;
        r6 = new com.whatsapp.protocol.co;
        r7 = new com.whatsapp.protocol.c3;
        r8 = 1;
        r9 = com.whatsapp.Voip.a(r0);
        r7.<init>(r1, r8, r9);
        r6.<init>(r7);
        r8 = com.whatsapp.App.av();
        r6.b = r8;
        r7 = 8;
        r6.c = r7;
        r7 = 0;
        r6.H = r7;
        r7 = 6;
        r6.d = r7;
        r7 = com.whatsapp.App.aK;
        r7.a(r6);
        com.whatsapp.amd.a(r6);
        r6 = 1;
        r12.c(r6);
        r6 = android.os.SystemClock.elapsedRealtime();
        com.whatsapp.Voip.startCall(r0, r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8 = bb;
        r9 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r8 = r8[r9];
        r0 = r0.append(r8);
        r8 = android.os.SystemClock.elapsedRealtime();
        r6 = r8 - r6;
        r0 = r0.append(r6);
        r6 = bb;
        r7 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r12.L();
        r0 = new android.content.Intent;
        r6 = com.whatsapp.VoipActivity.class;
        r0.<init>(r12, r6);
        r6 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.setFlags(r6);
        r6 = bb;
        r7 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r6 = r6[r7];
        r0.putExtra(r6, r1);
        r1 = bb;
        r6 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r1 = r1[r6];
        r6 = 1;
        r0.putExtra(r1, r6);
        r12.startActivity(r0);
        r0 = 0;
        r12.d(r0);
        if (r2 == 0) goto L_0x00d7;
    L_0x02a5:
        r0 = u;
        r0.getAndIncrement();
        r0 = bb;
        r1 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r0 = r0[r1];
        r0 = r13.getParcelableExtra(r0);
        r0 = (android.os.Message) r0;
        r1 = bb;
        r6 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r1 = r1[r6];
        r1 = r13.getParcelableExtra(r1);
        r0.obj = r1;
        r6 = com.whatsapp.messaging.co.d(r0);
        r1 = 58;
        if (r6 != r1) goto L_0x0333;
    L_0x02ca:
        r12.w();
        r7 = com.whatsapp.messaging.g.a(r0);
        r1 = com.whatsapp.App.z();
        r8 = bb;
        r9 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r8 = r8[r9];
        r1 = r1.getSystemService(r8);
        r1 = (android.telephony.TelephonyManager) r1;
        if (r7 == 0) goto L_0x0331;
    L_0x02e3:
        r8 = r7.c;	 Catch:{ Throwable -> 0x03c2 }
        if (r8 == 0) goto L_0x0331;
    L_0x02e7:
        r8 = r7.c;	 Catch:{ Throwable -> 0x03c4 }
        r8 = r8.miscellaneous;	 Catch:{ Throwable -> 0x03c4 }
        if (r8 == 0) goto L_0x0331;
    L_0x02ed:
        r8 = r7.c;	 Catch:{ Throwable -> 0x03c6 }
        r8 = r8.miscellaneous;	 Catch:{ Throwable -> 0x03c6 }
        r8 = r8.androidRingFaster;	 Catch:{ Throwable -> 0x03c6 }
        if (r8 == 0) goto L_0x0331;
    L_0x02f5:
        r8 = r7.c;	 Catch:{ Throwable -> 0x03c8 }
        r8 = r8.miscellaneous;	 Catch:{ Throwable -> 0x03c8 }
        r8 = r8.androidRingFaster;	 Catch:{ Throwable -> 0x03c8 }
        r8 = r8.booleanValue();	 Catch:{ Throwable -> 0x03c8 }
        if (r8 == 0) goto L_0x0331;
    L_0x0301:
        r8 = r7.a;	 Catch:{ Throwable -> 0x03ca }
        r8 = r8 * 1000;
        r8 = (long) r8;	 Catch:{ Throwable -> 0x03ca }
        r10 = r12.o;	 Catch:{ Throwable -> 0x03ca }
        r10 = r12.a(r10);	 Catch:{ Throwable -> 0x03ca }
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 >= 0) goto L_0x0331;
    L_0x0310:
        r1 = r1.getCallState();	 Catch:{ Throwable -> 0x03cc }
        if (r1 != 0) goto L_0x0331;
    L_0x0316:
        r1 = com.whatsapp.Voip.d();	 Catch:{ Throwable -> 0x03ce }
        if (r1 != 0) goto L_0x0331;
    L_0x031c:
        r1 = bb;	 Catch:{ Throwable -> 0x03d0 }
        r8 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r1 = r1[r8];	 Catch:{ Throwable -> 0x03d0 }
        r1 = r12.getSystemService(r1);	 Catch:{ Throwable -> 0x03d0 }
        r1 = (android.media.AudioManager) r1;	 Catch:{ Throwable -> 0x03d0 }
        r8 = 1;
        r1.setMode(r8);	 Catch:{ Throwable -> 0x03d0 }
        r1 = r7.d;	 Catch:{ Throwable -> 0x03d0 }
        r12.b(r1);	 Catch:{ Throwable -> 0x03d0 }
    L_0x0331:
        if (r2 == 0) goto L_0x035e;
    L_0x0333:
        r1 = 67;
        if (r6 != r1) goto L_0x035e;
    L_0x0337:
        r1 = com.whatsapp.messaging.g.b(r0);
        if (r1 == 0) goto L_0x035e;
    L_0x033d:
        r6 = r12.ai;	 Catch:{ Throwable -> 0x03d6 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x03d6 }
        r7.<init>();	 Catch:{ Throwable -> 0x03d6 }
        r8 = r1.d;	 Catch:{ Throwable -> 0x03d6 }
        r7 = r7.append(r8);	 Catch:{ Throwable -> 0x03d6 }
        r8 = "-";
        r7 = r7.append(r8);	 Catch:{ Throwable -> 0x03d6 }
        r1 = r1.b;	 Catch:{ Throwable -> 0x03d6 }
        r1 = r7.append(r1);	 Catch:{ Throwable -> 0x03d6 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x03d6 }
        r6.add(r1);	 Catch:{ Throwable -> 0x03d6 }
    L_0x035e:
        r1 = r12.aw;	 Catch:{ Throwable -> 0x03d8 }
        r6 = new com.whatsapp.hi;	 Catch:{ Throwable -> 0x03d8 }
        r6.<init>(r12, r0);	 Catch:{ Throwable -> 0x03d8 }
        r1.execute(r6);	 Catch:{ Throwable -> 0x03d8 }
        if (r2 == 0) goto L_0x00d7;
    L_0x036a:
        r12.E();	 Catch:{ Throwable -> 0x03d8 }
        r0 = com.whatsapp.App.z();	 Catch:{ Throwable -> 0x03d8 }
        r0 = android.support.v4.app.NotificationManagerCompat.from(r0);	 Catch:{ Throwable -> 0x03d8 }
        r1 = 10;
        r0.cancel(r1);	 Catch:{ Throwable -> 0x03d8 }
        if (r2 == 0) goto L_0x00d7;
    L_0x037c:
        r0 = bb;
        r1 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r0 = r0[r1];
        r1 = r13.getStringExtra(r0);
        r0 = bb;	 Catch:{ Throwable -> 0x03da }
        r6 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r0 = r0[r6];	 Catch:{ Throwable -> 0x03da }
        r0 = r13.getSerializableExtra(r0);	 Catch:{ Throwable -> 0x03da }
        r0 = (com.whatsapp.vl) r0;	 Catch:{ Throwable -> 0x03da }
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x03da }
        if (r2 == 0) goto L_0x00d7;
    L_0x0397:
        r0 = bb;	 Catch:{ Throwable -> 0x03dc }
        r1 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r0 = r0[r1];	 Catch:{ Throwable -> 0x03dc }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ Throwable -> 0x03dc }
        r12.d(r0);	 Catch:{ Throwable -> 0x03dc }
        if (r2 == 0) goto L_0x00d7;
    L_0x03a7:
        goto L_0x00ce;
    L_0x03a9:
        r0 = java.lang.Double.valueOf(r6);
        goto L_0x018c;
    L_0x03af:
        r0 = move-exception;
        throw r0;
    L_0x03b1:
        r0 = 0;
        goto L_0x01ae;
    L_0x03b4:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03b6 }
    L_0x03b6:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03b8 }
    L_0x03b8:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03ba }
    L_0x03ba:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03bc }
    L_0x03bc:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03be }
    L_0x03be:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03c0 }
    L_0x03c0:
        r0 = move-exception;
        throw r0;
    L_0x03c2:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03c4 }
    L_0x03c4:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03c6 }
    L_0x03c6:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03c8 }
    L_0x03c8:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03ca }
    L_0x03ca:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03cc }
    L_0x03cc:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03ce }
    L_0x03ce:
        r0 = move-exception;
        throw r0;
    L_0x03d0:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);
        goto L_0x0331;
    L_0x03d6:
        r0 = move-exception;
        throw r0;
    L_0x03d8:
        r0 = move-exception;
        throw r0;
    L_0x03da:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x03dc }
    L_0x03dc:
        r0 = move-exception;
        throw r0;
    L_0x03de:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void c(String str, String str2) {
        Log.i(bb[181]);
    }

    static Object b(VoiceService voiceService, Object obj) {
        voiceService.ag = obj;
        return obj;
    }

    private void H() {
        auv.a();
        try {
            if (this.G != null) {
                Log.i(bb[143]);
                this.G.release();
                this.G = null;
            }
        } catch (Throwable e) {
            Log.a(e);
            this.G = null;
        }
    }

    public void f(String str, String str2) {
        Log.i(bb[255]);
    }

    static Object F(VoiceService voiceService) {
        return voiceService.P;
    }

    static Message a(VoiceService voiceService, Message message) {
        voiceService.z = message;
        return message;
    }

    public void a(pm pmVar) {
        try {
            this.L = pmVar;
            if (pmVar != null) {
                b(Voip.getCurrentCallState());
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            try {
                if (Voip.getCurrentCallState() == CallState.RECEIVED_CALL) {
                    o();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void a(String str, String str2, String str3, int i, byte[][] bArr, byte[][] bArr2, byte[] bArr3, VoipOptions voipOptions, boolean z, boolean z2) {
        try {
            Log.i(bb[257]);
            if (voipOptions != null) {
                if (voipOptions.miscellaneous != null) {
                    this.l = voipOptions.miscellaneous.callOfferAckTimeout;
                }
            }
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null && voipOptions != null) {
                if (callInfo.getCallId().equals(str3)) {
                    b(voipOptions);
                    AudioManager audioManager = (AudioManager) App.z().getSystemService(bb[259]);
                    try {
                        if (this.aG != null) {
                            if (this.aG.intValue() != audioManager.getMode()) {
                                b(callInfo.getCallState());
                            }
                        }
                        try {
                            this.al = bArr3;
                            this.T = z2;
                            if (z2) {
                                Log.i(bb[256]);
                            }
                            try {
                                if (this.J == null) {
                                    this.J = Boolean.valueOf(z);
                                }
                                try {
                                    if (voipOptions.miscellaneous != null) {
                                        if (voipOptions.miscellaneous.androidShowCallConnectedToast != null) {
                                            this.aq = voipOptions.miscellaneous.androidShowCallConnectedToast.booleanValue();
                                        }
                                        try {
                                            if (voipOptions.miscellaneous.androidShowCallConnectingToast != null) {
                                                this.aA = voipOptions.miscellaneous.androidShowCallConnectingToast.booleanValue();
                                            }
                                            try {
                                                if (voipOptions.miscellaneous.callerEndCallThreshold != null) {
                                                    this.af = voipOptions.miscellaneous.callerEndCallThreshold;
                                                }
                                                try {
                                                    if (callInfo.getCallState() == CallState.CALLING && voipOptions.miscellaneous.callerTimeout != null) {
                                                        int intValue = voipOptions.miscellaneous.callerTimeout.intValue() * 1000;
                                                        int elapsedTimeSinceCallStarts = intValue - Voip.getElapsedTimeSinceCallStarts();
                                                        if (elapsedTimeSinceCallStarts > 0 && elapsedTimeSinceCallStarts < 120000) {
                                                            try {
                                                                this.ar.removeCallbacksAndMessages(null);
                                                                this.ar.sendEmptyMessageDelayed(0, (long) elapsedTimeSinceCallStarts);
                                                                Log.i(bb[260] + intValue + bb[258] + elapsedTimeSinceCallStarts);
                                                            } catch (IllegalArgumentException e) {
                                                                throw e;
                                                            }
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    throw e2;
                                                }
                                            } catch (IllegalArgumentException e22) {
                                                throw e22;
                                            }
                                        } catch (IllegalArgumentException e222) {
                                            throw e222;
                                        }
                                    }
                                } catch (IllegalArgumentException e2222) {
                                    throw e2222;
                                } catch (IllegalArgumentException e22222) {
                                    throw e22222;
                                }
                            } catch (IllegalArgumentException e222222) {
                                throw e222222;
                            }
                        } catch (IllegalArgumentException e2222222) {
                            throw e2222222;
                        }
                    } catch (IllegalArgumentException e22222222) {
                        throw e22222222;
                    } catch (IllegalArgumentException e222222222) {
                        throw e222222222;
                    }
                }
                try {
                    int i2;
                    if (this.ac) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    Voip.nativeHandleCallOfferAck(str, str2, str3, i, bArr, bArr2, voipOptions, J(), (int) y(), i2);
                } catch (IllegalArgumentException e2222222222) {
                    throw e2222222222;
                }
            }
        } catch (IllegalArgumentException e22222222222) {
            throw e22222222222;
        } catch (IllegalArgumentException e222222222222) {
            throw e222222222222;
        }
    }

    private void G() {
        auv.a();
        try {
            if (this.aB != null) {
                Log.i(bb[261]);
                this.aB.release();
                this.aB = null;
            }
        } catch (Throwable e) {
            Log.a(e);
            this.aB = null;
        }
    }

    static boolean f(VoiceService voiceService, boolean z) {
        voiceService.V = z;
        return z;
    }

    static Handler M(VoiceService voiceService) {
        return voiceService.ah;
    }

    public static void a(com.whatsapp.fieldstats.v vVar, String str, Double d, ce ceVar, String str2, String str3, boolean z) {
        Events$Call events$Call = new Events$Call();
        events$Call.callNetwork = Double.valueOf((double) b());
        events$Call.callResult = Double.valueOf((double) vVar.getCode());
        events$Call.callSide = Double.valueOf((double) bv.CALLEE.getCode());
        nf.a(App.z(), nf.a(events$Call, str, d, null, null, ceVar, str2, str3), z);
    }

    static void q(VoiceService voiceService) {
        voiceService.s();
    }

    static Double c(VoiceService voiceService) {
        return voiceService.H;
    }

    static void a(VoiceService voiceService, String str, int i, String str2) {
        voiceService.a(str, i, str2);
    }

    static Double A(VoiceService voiceService) {
        return voiceService.j;
    }

    static long p(VoiceService voiceService) {
        return voiceService.aE;
    }

    public boolean A() {
        return this.E;
    }

    private void z() {
        G();
        H();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        r5 = this;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = bb;
        r3 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5.M();	 Catch:{ Exception -> 0x0107 }
        r0 = bb;	 Catch:{ Exception -> 0x0107 }
        r2 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0107 }
        r0 = r5.getSystemService(r0);	 Catch:{ Exception -> 0x0107 }
        r0 = (android.media.AudioManager) r0;	 Catch:{ Exception -> 0x0107 }
        r2 = 0;
        r0.setMode(r2);	 Catch:{ Exception -> 0x0107 }
    L_0x0030:
        r5.O();	 Catch:{ Exception -> 0x010d }
        r0 = r5.ax;	 Catch:{ Exception -> 0x010d }
        if (r0 == 0) goto L_0x003f;
    L_0x0037:
        r0 = r5.ax;	 Catch:{ Exception -> 0x010d }
        r0.release();	 Catch:{ Exception -> 0x010d }
        r0 = 0;
        r5.ax = r0;	 Catch:{ Exception -> 0x010d }
    L_0x003f:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x010f }
        r2 = 11;
        if (r0 < r2) goto L_0x0055;
    L_0x0045:
        r0 = r5.N;	 Catch:{ Exception -> 0x0111 }
        if (r0 == 0) goto L_0x0055;
    L_0x0049:
        r0 = r5.az;	 Catch:{ Exception -> 0x0113 }
        if (r0 == 0) goto L_0x0055;
    L_0x004d:
        r0 = r5.N;	 Catch:{ Exception -> 0x0113 }
        r2 = 1;
        r3 = r5.az;	 Catch:{ Exception -> 0x0113 }
        r0.closeProfileProxy(r2, r3);	 Catch:{ Exception -> 0x0113 }
    L_0x0055:
        r5.z();	 Catch:{ Exception -> 0x0115 }
        com.whatsapp.Voip.nativeUnregisterEventCallback();	 Catch:{ Exception -> 0x0115 }
        com.whatsapp.Voip.i();	 Catch:{ Exception -> 0x0115 }
        r0 = de.greenrobot.event.h.b();	 Catch:{ Exception -> 0x0115 }
        r0.c(r5);	 Catch:{ Exception -> 0x0115 }
        r0 = r5.aw;	 Catch:{ Exception -> 0x0115 }
        if (r0 == 0) goto L_0x0071;
    L_0x0069:
        r0 = r5.aw;	 Catch:{ Exception -> 0x0115 }
        r0.shutdown();	 Catch:{ Exception -> 0x0115 }
        r0 = 0;
        r5.aw = r0;	 Catch:{ Exception -> 0x0115 }
    L_0x0071:
        r0 = bb;
        r2 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r0 = r0[r2];
        r0 = r5.getSharedPreferences(r0, r4);
        if (r0 == 0) goto L_0x00c1;
    L_0x007d:
        r2 = r5.l;	 Catch:{ Exception -> 0x0117 }
        if (r2 == 0) goto L_0x0089;
    L_0x0081:
        r2 = r5.l;	 Catch:{ Exception -> 0x0119 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x0119 }
        if (r2 != 0) goto L_0x00a8;
    L_0x0089:
        r2 = bb;	 Catch:{ Exception -> 0x011b }
        r3 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x011b }
        r2 = r0.contains(r2);	 Catch:{ Exception -> 0x011b }
        if (r2 == 0) goto L_0x00c1;
    L_0x0095:
        r2 = r0.edit();	 Catch:{ Exception -> 0x011d }
        r3 = bb;	 Catch:{ Exception -> 0x011d }
        r4 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r3 = r3[r4];	 Catch:{ Exception -> 0x011d }
        r2 = r2.remove(r3);	 Catch:{ Exception -> 0x011d }
        r2.commit();	 Catch:{ Exception -> 0x011d }
        if (r1 == 0) goto L_0x00c1;
    L_0x00a8:
        r0 = r0.edit();	 Catch:{ Exception -> 0x011d }
        r2 = bb;	 Catch:{ Exception -> 0x011d }
        r3 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x011d }
        r3 = r5.l;	 Catch:{ Exception -> 0x011d }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x011d }
        r3 = r3 * 1000;
        r0 = r0.putInt(r2, r3);	 Catch:{ Exception -> 0x011d }
        r0.commit();	 Catch:{ Exception -> 0x011d }
    L_0x00c1:
        super.onDestroy();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = bb;
        r3 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r5.g;
        r2 = r2.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r5.g;
        r2 = r0.iterator();
    L_0x00ea:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0101;
    L_0x00f0:
        r0 = r2.next();
        r0 = (android.content.Intent) r0;
        r3 = com.whatsapp.App.p;
        r3 = com.whatsapp.App.z();
        r3.startService(r0);
        if (r1 == 0) goto L_0x00ea;
    L_0x0101:
        r0 = r5.g;
        r0.clear();
        return;
    L_0x0107:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x0030;
    L_0x010d:
        r0 = move-exception;
        throw r0;
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;
    L_0x0115:
        r0 = move-exception;
        throw r0;
    L_0x0117:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.onDestroy():void");
    }

    @NonNull
    public static byte[] a(@NonNull byte[] bArr) {
        try {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(bb[95]);
            }
            byte[] b = ag.a(3).b(bArr, bb[93].getBytes(), 92);
            try {
                if (b.length == 92) {
                    return b;
                }
                throw new IllegalStateException(bb[94]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static void H(VoiceService voiceService) {
        voiceService.O();
    }

    static boolean a(VoiceService voiceService, boolean z) {
        voiceService.ak = z;
        return z;
    }

    static Double c(VoiceService voiceService, Double d) {
        voiceService.j = d;
        return d;
    }

    static int O(VoiceService voiceService) {
        return voiceService.r;
    }

    private void a(CallState callState) {
        try {
            Log.i(bb[252]);
            auv.a();
            if (this.F) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    if (!(this.ax == null || callState == CallState.NONE)) {
                        if (callState != CallState.RECEIVED_CALL) {
                            try {
                                this.ax.play(this.q, 1.0f, 1.0f, 0, 0, 1.0f);
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                    }
                    this.F = false;
                    this.aa = false;
                    this.B = false;
                    this.b = false;
                    this.E = false;
                    this.V = false;
                    this.s = false;
                    this.J = null;
                    this.Z = null;
                    this.Q = null;
                    this.o = null;
                    this.aG = null;
                    this.af = Integer.valueOf(1500);
                    this.aq = true;
                    this.aA = true;
                    this.n = null;
                    this.x = null;
                    this.am = null;
                    this.aE = 0;
                    this.c = null;
                    this.p = null;
                    this.T = true;
                    this.k = false;
                    this.D = null;
                    this.j = null;
                    this.i = null;
                    this.C = -1;
                    this.r = -1;
                    this.a = false;
                    this.v = 0;
                    this.ac = false;
                    this.A = false;
                    this.S = false;
                    this.al = null;
                    this.K = (short) 0;
                    this.y = 0;
                    this.at = false;
                    this.aj = null;
                    this.O = null;
                    as = 0;
                    try {
                        ((TelephonyManager) getSystemService(bb[251])).listen(this.X, 0);
                        unregisterReceiver(this.w);
                        unregisterReceiver(this.ao);
                        if (VERSION.SDK_INT >= 11) {
                            unregisterReceiver(this.aF);
                        }
                        try {
                            if (VERSION.SDK_INT >= 8) {
                                unregisterReceiver(this.m);
                            }
                            try {
                                if (VERSION.SDK_INT >= 21) {
                                    unregisterReceiver(this.M);
                                }
                                this.ay.a(null);
                                K();
                                z();
                                x();
                                M();
                                AudioManager audioManager = (AudioManager) getSystemService(bb[250]);
                                try {
                                    audioManager.setSpeakerphoneOn(false);
                                    audioManager.setMicrophoneMute(false);
                                    if (this.ab) {
                                        b(false);
                                    }
                                    try {
                                        audioManager.setMode(0);
                                    } catch (Throwable e2) {
                                        Log.a(e2);
                                    }
                                    try {
                                        if (VERSION.SDK_INT >= 8) {
                                            audioManager.abandonAudioFocus((OnAudioFocusChangeListener) ae);
                                        }
                                        this.ah.removeCallbacksAndMessages(null);
                                        this.ar.removeCallbacksAndMessages(null);
                                        this.R.removeCallbacksAndMessages(null);
                                        stopForeground(true);
                                        l();
                                        Log.i(bb[249] + (SystemClock.elapsedRealtime() - elapsedRealtime) + bb[253]);
                                    } catch (Exception e3) {
                                        throw e3;
                                    }
                                } catch (Exception e32) {
                                    throw e32;
                                }
                            } catch (Exception e322) {
                                throw e322;
                            }
                        } catch (Exception e3222) {
                            throw e3222;
                        }
                    } catch (Exception e32222) {
                        throw e32222;
                    }
                } catch (Exception e322222) {
                    throw e322222;
                } catch (Exception e3222222) {
                    throw e3222222;
                }
            }
        } catch (Exception e32222222) {
            throw e32222222;
        }
    }

    public void g(String str, String str2) {
        Log.i(bb[206]);
    }

    static int K(VoiceService voiceService) {
        return voiceService.C;
    }

    static boolean e(VoiceService voiceService, boolean z) {
        voiceService.E = z;
        return z;
    }

    public void onCreate() {
        try {
            Log.i(bb[122] + this);
            super.onCreate();
            h.b().e(this);
            Voip.nativeRegisterEventCallback(this.ap);
            if (Voip.d == null) {
                Voip.a(new DefaultCryptoCallback());
            }
            try {
                Voip.a(new DefaultSignalingCallback(this));
                this.ay = new cv(this);
                this.N = BluetoothAdapter.getDefaultAdapter();
                if (VERSION.SDK_INT >= 11 && this.N != null) {
                    try {
                        this.N.getProfileProxy(this, new rq(this), 1);
                    } catch (Throwable e) {
                        Log.a(e);
                    }
                }
                this.X = new si(this);
                this.w = new 4(this);
                this.ao = new 5(this);
                this.M = new 6(this);
                this.m = new BluetoothScoReceiver(this, null);
                this.aF = new BluetoothConnectionReceiver(this, null);
                this.ah = new Handler(new bn(this));
                this.ar = new Handler(new a91(this));
                this.aD = new Handler(new att(this));
                this.R = new Handler(new ki(this));
                this.ad = new lm(this);
                this.aw = Executors.newSingleThreadScheduledExecutor(new i9(this));
                this.ai = Collections.synchronizedSet(new HashSet());
                this.g = new ArrayList();
                Log.i(bb[121]);
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    static Object a(VoiceService voiceService, Object obj) {
        voiceService.t = obj;
        return obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D() {
        /*
        r5 = this;
        r0 = 1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.W;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.Voip.getCallInfo();
        if (r1 == 0) goto L_0x0055;
    L_0x0023:
        r2 = r1.getPeerId();
        r3 = r1.getCallState();	 Catch:{ IllegalArgumentException -> 0x0056 }
        r4 = com.whatsapp.Voip.CallState.CALLING;	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r3 != r4) goto L_0x003d;
    L_0x002f:
        r3 = r5.W;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r3 == 0) goto L_0x003d;
    L_0x0033:
        r3 = com.whatsapp.vl.CELLULAR_CALL_STARTS;	 Catch:{ IllegalArgumentException -> 0x005a }
        r4 = 0;
        r5.b(r3, r4);	 Catch:{ IllegalArgumentException -> 0x005a }
        r3 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r3 == 0) goto L_0x0050;
    L_0x003d:
        if (r2 == 0) goto L_0x0050;
    L_0x003f:
        r3 = com.whatsapp.protocol.co.a(r2, r0);
        r3 = r3.b;	 Catch:{ IllegalArgumentException -> 0x005c }
        r1 = r1.getCallId();	 Catch:{ IllegalArgumentException -> 0x005c }
        r4 = r5.W;	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r4 != 0) goto L_0x005e;
    L_0x004d:
        com.whatsapp.App.b(r3, r2, r1, r0);
    L_0x0050:
        r0 = r5.W;
        com.whatsapp.Voip.setAudioStreamPause(r0);
    L_0x0055:
        return;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = 0;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.D():void");
    }

    static boolean j(VoiceService voiceService) {
        return voiceService.at;
    }

    static void a(VoiceService voiceService, String str, String str2, boolean z) {
        voiceService.a(str, str2, z);
    }

    public boolean a(CallInfo callInfo) {
        try {
            if (this.V && callInfo != null) {
                try {
                    if (callInfo.getCallState() == CallState.ACTIVE) {
                        try {
                            if (!callInfo.isPeerInterrupted()) {
                                return true;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            return false;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static a7 L(VoiceService voiceService) {
        return voiceService.aC;
    }

    private void o() {
        this.R.removeMessages(1);
        this.R.sendEmptyMessageDelayed(1, 500);
    }

    private void L() {
        Voip.setNetworkMedium(b());
    }

    public boolean F() {
        try {
            return this.aC == a7.SPEAKER;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void s() {
        try {
            Log.i(bb[196]);
            auv.a();
            this.aa = true;
            if (this.aB != null) {
                if (VERSION.SDK_INT >= 21) {
                    return;
                }
            }
            if (this.L != null) {
                this.L.d();
                Window window = this.L.c().getWindow();
                View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
                if (childAt.getVisibility() == 0) {
                    LayoutParams attributes = window.getAttributes();
                    try {
                        attributes.flags |= 1024;
                        attributes.screenBrightness = 0.1f;
                        if (VERSION.SDK_INT >= 11) {
                            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                        }
                        childAt.setVisibility(4);
                        window.setAttributes(attributes);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r20, java.lang.String r21, long r22, int r24, java.lang.String[] r25, int[] r26, byte[][] r27, int[] r28, byte[][] r29, byte[][] r30, byte[] r31, byte[] r32, byte[] r33, byte[] r34, com.whatsapp.protocol.VoipOptions r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39) {
        /*
        r19 = this;
        r11 = com.whatsapp.DialogToastActivity.f;
        r0 = r20;
        r3 = r0.e;
        r0 = r20;
        r12 = r0.b;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = bb;
        r5 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r4 = bb;
        r5 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r21;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r13 = new com.whatsapp.protocol.co;
        r2 = new com.whatsapp.protocol.c3;
        r4 = 0;
        r5 = com.whatsapp.Voip.a(r21);
        r2.<init>(r3, r4, r5);
        r13.<init>(r2);
        r0 = r22;
        r13.b = r0;
        r2 = 8;
        r13.c = r2;
        r2 = 0;
        r13.H = r2;
        r2 = 6;
        r13.d = r2;
        r2 = com.whatsapp.App.aK;
        r2.a(r13);
        r0 = r21;
        com.whatsapp.App.d(r3, r12, r0);
        com.whatsapp.amd.a(r13);
        r0 = r24;
        r2 = r0 * 1000;
        r0 = (double) r2;
        r16 = r0;
        if (r24 != 0) goto L_0x006b;
    L_0x0067:
        r5 = com.whatsapp.fieldstats.ce.ONLINE;
        if (r11 == 0) goto L_0x0075;
    L_0x006b:
        r2 = com.whatsapp.App.ao;	 Catch:{ Exception -> 0x028f }
        if (r2 == 0) goto L_0x0073;
    L_0x006f:
        r5 = com.whatsapp.fieldstats.ce.GCM_PUSH;
        if (r11 == 0) goto L_0x0075;
    L_0x0073:
        r5 = com.whatsapp.fieldstats.ce.UNKNOWN;
    L_0x0075:
        if (r35 == 0) goto L_0x0087;
    L_0x0077:
        r0 = r35;
        r2 = r0.miscellaneous;	 Catch:{ Exception -> 0x0291 }
        if (r2 == 0) goto L_0x0087;
    L_0x007d:
        r0 = r35;
        r2 = r0.miscellaneous;	 Catch:{ Exception -> 0x0293 }
        r2 = r2.callOfferAckTimeout;	 Catch:{ Exception -> 0x0293 }
        r0 = r19;
        r0.l = r2;	 Catch:{ Exception -> 0x0293 }
    L_0x0087:
        if (r35 == 0) goto L_0x00b0;
    L_0x0089:
        r0 = r35;
        r2 = r0.miscellaneous;	 Catch:{ Exception -> 0x0295 }
        if (r2 == 0) goto L_0x00b0;
    L_0x008f:
        r2 = bb;	 Catch:{ Exception -> 0x0297 }
        r4 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0297 }
        r0 = r35;
        r4 = r0.miscellaneous;	 Catch:{ Exception -> 0x0297 }
        r4 = r4.testKey;	 Catch:{ Exception -> 0x0297 }
        r2 = r2.equals(r4);	 Catch:{ Exception -> 0x0297 }
        if (r2 == 0) goto L_0x00b0;
    L_0x00a1:
        r2 = "0";
        r0 = r35;
        r4 = r0.miscellaneous;	 Catch:{ Exception -> 0x0299 }
        r4 = r4.testValue;	 Catch:{ Exception -> 0x0299 }
        r2 = r2.equals(r4);	 Catch:{ Exception -> 0x0299 }
        if (r2 != 0) goto L_0x029d;
    L_0x00b0:
        r2 = 1;
        r10 = r2;
    L_0x00b2:
        r2 = bb;
        r4 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r2 = r2[r4];
        r2 = com.whatsapp.tp.a(r2);
        r0 = r16;
        r6 = (long) r0;
        r2.c(r6);
        r14 = 0;
        if (r33 == 0) goto L_0x00d5;
    L_0x00c5:
        r2 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x02a1 }
        r2 = com.whatsapp.awc.a(r2);	 Catch:{ Exception -> 0x02a1 }
        r4 = com.whatsapp.protocol.b1.a(r33);	 Catch:{ Exception -> 0x02a1 }
        r14 = a(r2, r3, r4);	 Catch:{ Exception -> 0x02a1 }
    L_0x00d5:
        r2 = com.whatsapp.App.z();
        r4 = bb;
        r6 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r4 = r4[r6];
        r2 = r2.getSystemService(r4);
        r9 = r2;
        r9 = (android.telephony.TelephonyManager) r9;
        r0 = r19;
        r1 = r35;
        r6 = r0.a(r1);	 Catch:{ Exception -> 0x02f9 }
        r6 = (double) r6;
        r2 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x012c;
    L_0x00f3:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02fb }
        r2.<init>();	 Catch:{ Exception -> 0x02fb }
        r4 = bb;	 Catch:{ Exception -> 0x02fb }
        r6 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r4 = r4[r6];	 Catch:{ Exception -> 0x02fb }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x02fb }
        r0 = r24;
        r2 = r2.append(r0);	 Catch:{ Exception -> 0x02fb }
        r2 = r2.toString();	 Catch:{ Exception -> 0x02fb }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x02fb }
        r0 = r19;
        r2 = r0.R;	 Catch:{ Exception -> 0x02fb }
        r4 = 5;
        r2 = android.os.Message.obtain(r2, r4, r13);	 Catch:{ Exception -> 0x02fb }
        r2.sendToTarget();	 Catch:{ Exception -> 0x02fb }
        r2 = com.whatsapp.fieldstats.v.MISSED;	 Catch:{ Exception -> 0x02fb }
        r4 = java.lang.Double.valueOf(r16);	 Catch:{ Exception -> 0x02fb }
        r6 = r38;
        r7 = r38;
        r8 = r37;
        a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x02fb }
        if (r11 == 0) goto L_0x028e;
    L_0x012c:
        r2 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x02fd }
        r2 = com.whatsapp.vh.j(r2);	 Catch:{ Exception -> 0x02fd }
        if (r2 != 0) goto L_0x0152;
    L_0x0136:
        r2 = bb;	 Catch:{ Exception -> 0x02ff }
        r4 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r2 = r2[r4];	 Catch:{ Exception -> 0x02ff }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x02ff }
        r2 = com.whatsapp.Voip.a;	 Catch:{ Exception -> 0x02ff }
        if (r2 == 0) goto L_0x028e;
    L_0x0143:
        r2 = com.whatsapp.Voip.a;	 Catch:{ Exception -> 0x0301 }
        r4 = bb;	 Catch:{ Exception -> 0x0301 }
        r6 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r4 = r4[r6];	 Catch:{ Exception -> 0x0301 }
        r0 = r21;
        r2.sendReject(r0, r3, r4);	 Catch:{ Exception -> 0x0301 }
        if (r11 == 0) goto L_0x028e;
    L_0x0152:
        r2 = r9.getCallState();	 Catch:{ Exception -> 0x0303 }
        if (r2 == 0) goto L_0x0174;
    L_0x0158:
        r2 = bb;	 Catch:{ Exception -> 0x0305 }
        r4 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0305 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0305 }
        r2 = com.whatsapp.Voip.a;	 Catch:{ Exception -> 0x0305 }
        if (r2 == 0) goto L_0x028e;
    L_0x0165:
        r2 = com.whatsapp.Voip.a;	 Catch:{ Exception -> 0x0307 }
        r4 = bb;	 Catch:{ Exception -> 0x0307 }
        r6 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r4 = r4[r6];	 Catch:{ Exception -> 0x0307 }
        r0 = r21;
        r2.sendReject(r0, r3, r4);	 Catch:{ Exception -> 0x0307 }
        if (r11 == 0) goto L_0x028e;
    L_0x0174:
        if (r10 == 0) goto L_0x01d3;
    L_0x0176:
        r0 = r19;
        r2 = r0.ai;	 Catch:{ Exception -> 0x030b }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x030b }
        r4.<init>();	 Catch:{ Exception -> 0x030b }
        r4 = r4.append(r3);	 Catch:{ Exception -> 0x030b }
        r6 = "-";
        r4 = r4.append(r6);	 Catch:{ Exception -> 0x030b }
        r0 = r21;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x030b }
        r4 = r4.toString();	 Catch:{ Exception -> 0x030b }
        r2 = r2.contains(r4);	 Catch:{ Exception -> 0x030b }
        if (r2 == 0) goto L_0x01d3;
    L_0x019a:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x030d }
        r2.<init>();	 Catch:{ Exception -> 0x030d }
        r4 = bb;	 Catch:{ Exception -> 0x030d }
        r6 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r4 = r4[r6];	 Catch:{ Exception -> 0x030d }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x030d }
        r0 = r21;
        r2 = r2.append(r0);	 Catch:{ Exception -> 0x030d }
        r2 = r2.toString();	 Catch:{ Exception -> 0x030d }
        com.whatsapp.util.Log.w(r2);	 Catch:{ Exception -> 0x030d }
        r0 = r19;
        r2 = r0.R;	 Catch:{ Exception -> 0x030d }
        r4 = 5;
        r2 = android.os.Message.obtain(r2, r4, r13);	 Catch:{ Exception -> 0x030d }
        r2.sendToTarget();	 Catch:{ Exception -> 0x030d }
        r2 = com.whatsapp.fieldstats.v.MISSED;	 Catch:{ Exception -> 0x030d }
        r4 = java.lang.Double.valueOf(r16);	 Catch:{ Exception -> 0x030d }
        r6 = r38;
        r7 = r38;
        r8 = r37;
        a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x030d }
        if (r11 == 0) goto L_0x028e;
    L_0x01d3:
        r2 = com.whatsapp.Voip.d();	 Catch:{ Exception -> 0x030f }
        if (r2 != 0) goto L_0x024e;
    L_0x01d9:
        r0 = r19;
        r1 = r35;
        r0.b(r1);	 Catch:{ Exception -> 0x0311 }
        r0 = r34;
        r1 = r19;
        r1.al = r0;	 Catch:{ Exception -> 0x0311 }
        r0 = r19;
        r0.am = r5;	 Catch:{ Exception -> 0x0311 }
        r2 = com.whatsapp.fieldstats.ce.GCM_PUSH;	 Catch:{ Exception -> 0x0311 }
        if (r5 != r2) goto L_0x0229;
    L_0x01ee:
        r4 = com.whatsapp.App.aU;	 Catch:{ Exception -> 0x0313 }
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x0229;
    L_0x01f6:
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x0313 }
        r6 = com.whatsapp.App.aU;	 Catch:{ Exception -> 0x0313 }
        r4 = r4 - r6;
        r0 = r19;
        r0.aE = r4;	 Catch:{ Exception -> 0x0313 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0313 }
        r2.<init>();	 Catch:{ Exception -> 0x0313 }
        r4 = bb;	 Catch:{ Exception -> 0x0313 }
        r5 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0313 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0313 }
        r0 = r19;
        r4 = r0.aE;	 Catch:{ Exception -> 0x0313 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0313 }
        r4 = bb;	 Catch:{ Exception -> 0x0313 }
        r5 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0313 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0313 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0313 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0313 }
    L_0x0229:
        r2 = java.lang.Double.valueOf(r16);	 Catch:{ Exception -> 0x0315 }
        r0 = r19;
        r0.H = r2;	 Catch:{ Exception -> 0x0315 }
        r0 = r38;
        r1 = r19;
        r1.c = r0;	 Catch:{ Exception -> 0x0315 }
        r0 = r39;
        r1 = r19;
        r1.p = r0;	 Catch:{ Exception -> 0x0315 }
        r0 = r37;
        r1 = r19;
        r1.T = r0;	 Catch:{ Exception -> 0x0315 }
        if (r37 == 0) goto L_0x024e;
    L_0x0245:
        r2 = bb;	 Catch:{ Exception -> 0x0315 }
        r4 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0315 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0315 }
    L_0x024e:
        r0 = r19;
        r2 = r0.A;	 Catch:{ Exception -> 0x0317 }
        if (r2 == 0) goto L_0x0319;
    L_0x0254:
        r18 = 2;
    L_0x0256:
        r16 = r19.J();	 Catch:{ Exception -> 0x031d }
        r2 = r19.y();	 Catch:{ Exception -> 0x031d }
        r0 = (int) r2;	 Catch:{ Exception -> 0x031d }
        r17 = r0;
        r4 = r12;
        r5 = r21;
        r6 = r25;
        r7 = r26;
        r8 = r27;
        r9 = r28;
        r10 = r29;
        r11 = r30;
        r12 = r31;
        r13 = r32;
        r15 = r35;
        com.whatsapp.Voip.nativeHandleCallOffer(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ Exception -> 0x031d }
        r19.L();	 Catch:{ Exception -> 0x031d }
        r0 = r19;
        r2 = r0.J;	 Catch:{ Exception -> 0x031d }
        if (r2 != 0) goto L_0x028a;
    L_0x0282:
        r2 = java.lang.Boolean.valueOf(r36);	 Catch:{ Exception -> 0x031d }
        r0 = r19;
        r0.J = r2;	 Catch:{ Exception -> 0x031d }
    L_0x028a:
        r0 = r19;
        r0.O = r14;
    L_0x028e:
        return;
    L_0x028f:
        r2 = move-exception;
        throw r2;
    L_0x0291:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0293 }
    L_0x0293:
        r2 = move-exception;
        throw r2;
    L_0x0295:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0297 }
    L_0x0297:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0299 }
    L_0x0299:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x029b }
    L_0x029b:
        r2 = move-exception;
        throw r2;
    L_0x029d:
        r2 = 0;
        r10 = r2;
        goto L_0x00b2;
    L_0x02a1:
        r2 = move-exception;
        r2.printStackTrace();
        r2 = bb;
        r4 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r2 = r2[r4];
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.Voip.getCallInfo();
        if (r2 == 0) goto L_0x02e1;
    L_0x02b4:
        r4 = r2.getCallState();	 Catch:{ Exception -> 0x02f5 }
        r6 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ Exception -> 0x02f5 }
        if (r4 != r6) goto L_0x02e1;
    L_0x02bc:
        r4 = r2.getCallId();	 Catch:{ Exception -> 0x02f7 }
        r0 = r21;
        r4 = r4.equals(r0);	 Catch:{ Exception -> 0x02f7 }
        if (r4 == 0) goto L_0x02e1;
    L_0x02c8:
        r2 = r2.getPeerId();	 Catch:{ Exception -> 0x02f7 }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x02f7 }
        if (r2 == 0) goto L_0x02e1;
    L_0x02d2:
        r2 = bb;
        r4 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r2 = r2[r4];
        com.whatsapp.util.Log.i(r2);
        r0 = r19;
        r14 = r0.O;
        if (r11 == 0) goto L_0x00d5;
    L_0x02e1:
        r2 = com.whatsapp.Voip.a;	 Catch:{ Exception -> 0x02f3 }
        if (r2 == 0) goto L_0x00d5;
    L_0x02e5:
        r2 = com.whatsapp.Voip.a;	 Catch:{ Exception -> 0x02f3 }
        r4 = bb;	 Catch:{ Exception -> 0x02f3 }
        r5 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r4 = r4[r5];	 Catch:{ Exception -> 0x02f3 }
        r0 = r21;
        r2.sendReject(r0, r3, r4);	 Catch:{ Exception -> 0x02f3 }
        goto L_0x028e;
    L_0x02f3:
        r2 = move-exception;
        throw r2;
    L_0x02f5:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x02f7 }
    L_0x02f7:
        r2 = move-exception;
        throw r2;
    L_0x02f9:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x02fb }
    L_0x02fb:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x02fd }
    L_0x02fd:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x02ff }
    L_0x02ff:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0301 }
    L_0x0301:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0303 }
    L_0x0303:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0305 }
    L_0x0305:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0307 }
    L_0x0307:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0309 }
    L_0x0309:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x030b }
    L_0x030b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x030d }
    L_0x030d:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x030f }
    L_0x030f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0311 }
    L_0x0311:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0313 }
    L_0x0313:
        r2 = move-exception;
        throw r2;
    L_0x0315:
        r2 = move-exception;
        throw r2;
    L_0x0317:
        r2 = move-exception;
        throw r2;
    L_0x0319:
        r18 = 0;
        goto L_0x0256;
    L_0x031d:
        r2 = move-exception;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(com.whatsapp.protocol.ct, java.lang.String, long, int, java.lang.String[], int[], byte[][], int[], byte[][], byte[][], byte[], byte[], byte[], byte[], com.whatsapp.protocol.VoipOptions, boolean, boolean, java.lang.String, java.lang.String):void");
    }

    static RecordingInfo[] Q(VoiceService voiceService) {
        return voiceService.Q;
    }

    private int a() {
        try {
            if (VERSION.SDK_INT >= 21) {
                return 32;
            }
            try {
                return PowerManager.class.getDeclaredField(bb[183]).getInt(null);
            } catch (NoSuchFieldException e) {
                Log.w(bb[185]);
                return -1;
            } catch (IllegalAccessException e2) {
                Log.w(bb[184]);
                return -1;
            }
        } catch (NoSuchFieldException e3) {
            throw e3;
        }
    }

    public void n() {
        AudioManager audioManager = (AudioManager) getSystemService(bb[110]);
        try {
            boolean z;
            if (this.aC != a7.SPEAKER) {
                z = true;
            } else {
                z = false;
            }
            Log.i(bb[111] + z);
            audioManager.setSpeakerphoneOn(z);
            d();
            Voip.setSpeakerOn(z);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static void a(VoiceService voiceService, CallState callState) {
        voiceService.b(callState);
    }

    static pm a(VoiceService voiceService) {
        return voiceService.L;
    }

    static boolean h(VoiceService voiceService, boolean z) {
        voiceService.a = z;
        return z;
    }

    public void h(String str, String str2) {
        Log.i(bb[254]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.Voip.CallInfo r6) {
        /*
        r5 = this;
        r4 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = com.whatsapp.App.az();
        if (r2 != 0) goto L_0x0018;
    L_0x0009:
        r0 = com.whatsapp.vl.RELAY_BIND_FAILED;	 Catch:{ IllegalArgumentException -> 0x0016 }
        r1 = 2131232246; // 0x7f0805f6 float:1.8080596E38 double:1.052968636E-314;
        r1 = r5.getString(r1);	 Catch:{ IllegalArgumentException -> 0x0016 }
        r5.b(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0016 }
    L_0x0015:
        return;
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = r6.isCaller();	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = r6.getCallState();	 Catch:{ IllegalArgumentException -> 0x0074 }
        r3 = com.whatsapp.Voip.CallState.ACCEPT_SENT;	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r0 != r3) goto L_0x006b;
    L_0x0026:
        r0 = r6.isCaller();	 Catch:{ IllegalArgumentException -> 0x0076 }
        if (r0 == 0) goto L_0x0030;
    L_0x002c:
        r0 = r5.ac;	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r0 != 0) goto L_0x003a;
    L_0x0030:
        r0 = r6.isCaller();	 Catch:{ IllegalArgumentException -> 0x007a }
        if (r0 != 0) goto L_0x004e;
    L_0x0036:
        r0 = r5.A;	 Catch:{ IllegalArgumentException -> 0x007c }
        if (r0 == 0) goto L_0x004e;
    L_0x003a:
        if (r2 != r4) goto L_0x0045;
    L_0x003c:
        r0 = 2131232266; // 0x7f08060a float:1.8080636E38 double:1.052968646E-314;
        r0 = r5.getString(r0);
        if (r1 == 0) goto L_0x0060;
    L_0x0045:
        r0 = 2131232263; // 0x7f080607 float:1.808063E38 double:1.0529686445E-314;
        r0 = r5.getString(r0);
        if (r1 == 0) goto L_0x0060;
    L_0x004e:
        if (r2 != r4) goto L_0x0059;
    L_0x0050:
        r0 = 2131232245; // 0x7f0805f5 float:1.8080594E38 double:1.0529686356E-314;
        r0 = r5.getString(r0);
        if (r1 == 0) goto L_0x0060;
    L_0x0059:
        r0 = 2131232244; // 0x7f0805f4 float:1.8080592E38 double:1.052968635E-314;
        r0 = r5.getString(r0);
    L_0x0060:
        com.whatsapp.auv.a(r0);
        r1 = r6.getPeerId();
        r2 = 5;
        r5.a(r1, r2, r0);
    L_0x006b:
        r0 = com.whatsapp.vl.RELAY_BIND_FAILED;
        r1 = 0;
        r5.b(r0, r1);
        goto L_0x0015;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b(com.whatsapp.Voip$CallInfo):void");
    }

    private void j() {
        try {
            if (App.K()) {
                au.execute(new arc(this));
            }
            if (App.am >= 3) {
                Voip.saveCallMetrics(new File(dg.h(), Voip.e.format(new Date(System.currentTimeMillis())) + bb[271]).getAbsolutePath().replace(bb[269], bb[270]));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static Handler e(VoiceService voiceService) {
        return voiceService.R;
    }

    static void n(VoiceService voiceService) {
        voiceService.l();
    }

    static ce l(VoiceService voiceService) {
        return voiceService.am;
    }

    public void a(String str, String str2, String str3) {
        Log.i(bb[179]);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (str3 != null) {
                try {
                    if (!callInfo.getCallId().equals(str3)) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            b(vl.CALL_OFFER_ACK_CORRUPT, getString(2131232246));
        }
    }

    private boolean J() {
        return getSharedPreferences(bb[201], 0).getBoolean(bb[202], false);
    }

    static Double x(VoiceService voiceService) {
        return voiceService.d;
    }

    private long a(VoipOptions voipOptions) {
        long intValue;
        if (voipOptions != null) {
            try {
                if (voipOptions.miscellaneous != null) {
                    if (voipOptions.miscellaneous.callerTimeout != null) {
                        intValue = (long) (voipOptions.miscellaneous.callerTimeout.intValue() * 1000);
                        Log.i(bb[162] + intValue);
                        return intValue;
                    }
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        intValue = 90000;
        Log.i(bb[162] + intValue);
        return intValue;
    }

    static long z(VoiceService voiceService) {
        return voiceService.v;
    }

    @NonNull
    public static b1 a(@NonNull awc com_whatsapp_awc, @NonNull String str, @NonNull byte[] bArr) {
        j e = awc.e(str);
        Builder newBuilder = E2E.Message.newBuilder();
        newBuilder.getCallBuilder().setCallKey(hx.a(bArr));
        int nextInt = f.nextInt(255) + 1;
        Object b = newBuilder.build().b();
        Object obj = new byte[(b.length + nextInt)];
        System.arraycopy(b, 0, obj, 0, b.length);
        Arrays.fill(obj, b.length, obj.length, (byte) nextInt);
        try {
            return (b1) awc.e.submit(new h8(com_whatsapp_awc, e, new i(com_whatsapp_awc, com_whatsapp_awc, com_whatsapp_awc.i(), com_whatsapp_awc, e), obj)).get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof bX) {
                throw ((bX) cause);
            }
            throw new AssertionError(cause);
        } catch (ExecutionException e22) {
            throw e22;
        }
    }

    static boolean h(VoiceService voiceService) {
        return voiceService.av;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I() {
        /*
        r5 = this;
        r0 = r5.o;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r0 == 0) goto L_0x003e;
    L_0x0004:
        r0 = r5.o;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0 = r0.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r0 == 0) goto L_0x003e;
    L_0x000a:
        r0 = r5.o;	 Catch:{ IllegalArgumentException -> 0x003a }
        r0 = r0.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x003a }
        r0 = r0.createStreamOnOffer;	 Catch:{ IllegalArgumentException -> 0x003a }
        if (r0 == 0) goto L_0x003e;
    L_0x0012:
        r0 = r5.o;	 Catch:{ IllegalArgumentException -> 0x003c }
        r0 = r0.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x003c }
        r0 = r0.createStreamOnOffer;	 Catch:{ IllegalArgumentException -> 0x003c }
        r0 = r0.booleanValue();	 Catch:{ IllegalArgumentException -> 0x003c }
        if (r0 == 0) goto L_0x003e;
    L_0x001e:
        r0 = r5.aw;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = new com.whatsapp.awr;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r2 = 100;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.schedule(r1, r2, r4);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0 = r5.aC;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = com.whatsapp.a7.SPEAKER;	 Catch:{ IllegalArgumentException -> 0x0044 }
        if (r0 != r1) goto L_0x0035;
    L_0x0032:
        r5.n();	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0035:
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = com.whatsapp.Voip.CallState.ACCEPT_SENT;
        r5.b(r0);
        goto L_0x001e;
    L_0x0044:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.I():void");
    }

    public void b(String str, String str2) {
        Log.i(bb[163]);
    }

    public void b(ct ctVar, String str, long j, byte[][] bArr, int[] iArr) {
        Log.i(bb[177]);
        Voip.nativeHandleCallTransport(ctVar.e, ctVar.b, str, bArr, iArr);
        App.b(ctVar);
    }

    public void onEvent(a_3 com_whatsapp_a_3) {
        L();
    }

    static void B(VoiceService voiceService) {
        voiceService.D();
    }

    static Events$Call a(VoiceService voiceService, Events$Call events$Call) {
        voiceService.Z = events$Call;
        return events$Call;
    }

    static void j(VoiceService voiceService, boolean z) {
        voiceService.c(z);
    }

    public void f() {
        try {
            boolean z;
            if (this.B) {
                z = false;
            } else {
                z = true;
            }
            try {
                this.B = z;
                Log.i(bb[247] + this.B);
                if (Voip.getCurrentCallState() == CallState.ACTIVE) {
                    C();
                }
                try {
                    if (this.L != null) {
                        this.L.b();
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void a(String str, int i, String str2) {
        try {
            if (!this.S) {
                this.S = true;
                App.p.M().post(new v6(this, str, i, str2));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void a(Events$Call events$Call) {
        if (events$Call != null) {
            try {
                if (events$Call.callAecMode == null) {
                    return;
                }
                if (events$Call.callEchoLikelihoodBeforeEc != null) {
                    try {
                        if (events$Call.callT != null && events$Call.callT.intValue() >= 10000) {
                            float y = y();
                            float floatValue = events$Call.callEchoLikelihoodBeforeEc.floatValue();
                            if (floatValue < 0.0f || floatValue > 100.0f) {
                                try {
                                    Log.e(bb[16] + floatValue);
                                    return;
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                            try {
                                boolean z;
                                if (events$Call.callAecMode.intValue() != ao.NONE.getCode()) {
                                    if (events$Call.callAecMode.intValue() != ao.SOFTWARE.getCode()) {
                                        return;
                                    }
                                }
                                float f = (y >= 0.0f || DialogToastActivity.f) ? (0.5f * y) + (0.5f * floatValue) : floatValue;
                                if (f < 0.0f || f > 100.0f) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                auv.a(z, bb[17]);
                                getSharedPreferences(bb[22], 0).edit().putFloat(bb[18], f).commit();
                                Log.i(bb[21] + y + bb[19] + floatValue + bb[20] + f);
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
    }

    static int a(VoiceService voiceService, int i) {
        voiceService.C = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r8, java.lang.String r9, long r10, java.lang.String r12, byte[] r13) {
        /*
        r7 = this;
        r4 = 4;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r8.e;
        r1 = r8.b;
        com.whatsapp.App.f(r0, r1, r9);
        r2 = bb;
        r2 = r2[r4];
        r2 = r2.equals(r12);
        if (r2 == 0) goto L_0x0088;
    L_0x002b:
        r2 = r8.e;
        r2 = com.whatsapp.awc.e(r2);
        if (r13 == 0) goto L_0x0061;
    L_0x0033:
        r3 = r13.length;	 Catch:{ IllegalArgumentException -> 0x008c }
        if (r3 != r4) goto L_0x0061;
    L_0x0036:
        r3 = org.whispersystems.aw.a(r13);
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = bb;	 Catch:{ IllegalArgumentException -> 0x008e }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x008e }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = com.whatsapp.awc.e;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = new com.whatsapp.pl;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5.<init>(r7, r2, r3, r8);	 Catch:{ IllegalArgumentException -> 0x008e }
        r4.submit(r5);	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r3 == 0) goto L_0x0088;
    L_0x0061:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008e }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = bb;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = java.util.Arrays.toString(r13);	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x008e }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = com.whatsapp.awc.e;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = new com.whatsapp.a32;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4.<init>(r7, r2, r8);	 Catch:{ IllegalArgumentException -> 0x008e }
        r3.submit(r4);	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x0088:
        com.whatsapp.Voip.nativeHandleCallOfferReject(r0, r1, r9, r12);
        return;
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(com.whatsapp.protocol.ct, java.lang.String, long, java.lang.String, byte[]):void");
    }

    public boolean m() {
        return this.aa;
    }

    public void a(String str) {
        Intent intent = new Intent(App.z(), VoipActivity.class);
        intent.putExtra(bb[248], str);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    public void a(ct ctVar, String str, long j, String str2, long j2) {
        long j3 = 0;
        Object obj = ctVar.e;
        String str3 = ctVar.b;
        Log.i(bb[115] + obj + bb[118] + str + bb[117] + j2 + bb[113]);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            try {
                if (TextUtils.equals(callInfo.getCallId(), str)) {
                    if (TextUtils.equals(callInfo.getPeerId(), obj)) {
                        try {
                            this.R.removeMessages(1);
                            if (callInfo.getCallState() == CallState.ACTIVE) {
                                try {
                                    if (!callInfo.isCaller() && j2 <= 0) {
                                        try {
                                            this.k = true;
                                            Log.i(bb[116]);
                                        } catch (IllegalArgumentException e) {
                                            throw e;
                                        }
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        if (callInfo != null) {
            try {
                j3 = callInfo.getCallDuration();
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
        this.s = bb[114].equals(str2);
        Voip.nativeHandleCallTerminate(obj, str3, str, str2);
        App.b(new c5(ctVar, j3));
    }

    public void a(vl vlVar) {
        a(vlVar, null);
    }

    public void e(String str, String str2) {
        Log.i(bb[119]);
    }

    static byte[] i(VoiceService voiceService) {
        return voiceService.al;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r3 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        com.whatsapp.auv.a();
        r0 = bb;
        r2 = 43;
        r0 = r0[r2];
        r0 = r3.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r2 = r0.isBluetoothScoOn();	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r2 == 0) goto L_0x001d;
    L_0x0017:
        r2 = com.whatsapp.a7.BLUETOOTH;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.aC = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r1 == 0) goto L_0x003d;
    L_0x001d:
        r2 = r0.isSpeakerphoneOn();	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r2 == 0) goto L_0x002d;
    L_0x0023:
        r2 = r3.ak;	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r2 != 0) goto L_0x002d;
    L_0x0027:
        r2 = com.whatsapp.a7.SPEAKER;	 Catch:{ IllegalArgumentException -> 0x007b }
        r3.aC = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r1 == 0) goto L_0x003d;
    L_0x002d:
        r0 = r0.isWiredHeadsetOn();	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r0 == 0) goto L_0x0039;
    L_0x0033:
        r0 = com.whatsapp.a7.HEADSET;	 Catch:{ IllegalArgumentException -> 0x007f }
        r3.aC = r0;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 == 0) goto L_0x003d;
    L_0x0039:
        r0 = com.whatsapp.a7.EARPIECE;	 Catch:{ IllegalArgumentException -> 0x007f }
        r3.aC = r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x003d:
        r0 = r3.aw;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1 = new com.whatsapp.avo;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0.execute(r1);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = 0;
        r3.ak = r0;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r2 = 44;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1 = r3.aC;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0081 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r3.L;	 Catch:{ IllegalArgumentException -> 0x0081 }
        if (r0 == 0) goto L_0x006f;
    L_0x006a:
        r0 = r3.L;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0.b();	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x006f:
        r3.r();
        return;
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.d():void");
    }

    public void a(ct ctVar, String str, long j, String str2, int i, byte[] bArr) {
        Log.i(bb[197]);
        Voip.nativeHandleCallOfferPreAccept(ctVar.e, ctVar.b, str, str2, i, bArr);
        App.b(ctVar);
    }

    public void onEvent(ji jiVar) {
        if (jiVar != null) {
            try {
                a(jiVar.a, Voip.getCurrentCallId(), false);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r14) {
        /*
        r13 = this;
        r12 = 3;
        r11 = 2;
        r10 = 0;
        r2 = 1;
        r3 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0088 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = android.os.Build.DEVICE;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = android.os.Build.VERSION.RELEASE;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = android.os.Build.DISPLAY;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0088 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0088 }
        com.whatsapp.auv.a();	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0 = r13.F;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r0 == 0) goto L_0x008a;
    L_0x0087:
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r6 = android.os.SystemClock.elapsedRealtime();
        r0 = bb;
        r1 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r0 = r0[r1];
        r0 = r13.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r13.aa = r3;
        r13.B = r3;
        r13.b = r3;
        r13.E = r3;
        r13.V = r3;
        r13.s = r3;
        r1 = com.whatsapp.Voip.DebugTapType.values();
        r1 = r1.length;
        r1 = new com.whatsapp.Voip.RecordingInfo[r1];
        r13.Q = r1;
        r1 = bb;
        r4 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r1 = r1[r4];
        r1 = r13.getSystemService(r1);
        r1 = (android.telephony.TelephonyManager) r1;
        r4 = r1.getCallState();	 Catch:{ IllegalArgumentException -> 0x020d }
        if (r4 == 0) goto L_0x020f;
    L_0x00c1:
        r4 = r2;
    L_0x00c2:
        r13.W = r4;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4 = r13.X;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r8 = 32;
        r1.listen(r4, r8);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r1 = r13.w;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4 = new android.content.IntentFilter;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r8 = bb;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r9 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4.<init>(r8);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r13.registerReceiver(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r1 = r13.ao;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4 = new android.content.IntentFilter;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r8 = bb;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r9 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4.<init>(r8);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r13.registerReceiver(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4 = 11;
        if (r1 < r4) goto L_0x0101;
    L_0x00f1:
        r1 = r13.aF;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4 = new android.content.IntentFilter;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r8 = bb;	 Catch:{ IllegalArgumentException -> 0x0212 }
        r9 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0212 }
        r4.<init>(r8);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r13.registerReceiver(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0212 }
    L_0x0101:
        r1 = android.os.Build.VERSION.SDK_INT;
        r4 = 8;
        if (r1 < r4) goto L_0x012a;
    L_0x0107:
        r1 = r13.m;
        r4 = new android.content.IntentFilter;
        r8 = bb;
        r9 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r8 = r8[r9];
        r4.<init>(r8);
        r1 = r13.registerReceiver(r1, r4);
        if (r1 == 0) goto L_0x012a;
    L_0x011a:
        r4 = bb;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r8 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r4 = r4[r8];	 Catch:{ IllegalArgumentException -> 0x0214 }
        r8 = -1;
        r1 = r1.getIntExtra(r4, r8);	 Catch:{ IllegalArgumentException -> 0x0214 }
        if (r2 != r1) goto L_0x0216;
    L_0x0127:
        r1 = r2;
    L_0x0128:
        r13.ab = r1;
    L_0x012a:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0219 }
        r4 = 21;
        if (r1 < r4) goto L_0x0140;
    L_0x0130:
        r1 = r13.M;	 Catch:{ IllegalArgumentException -> 0x0219 }
        r4 = new android.content.IntentFilter;	 Catch:{ IllegalArgumentException -> 0x0219 }
        r8 = bb;	 Catch:{ IllegalArgumentException -> 0x0219 }
        r9 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0219 }
        r4.<init>(r8);	 Catch:{ IllegalArgumentException -> 0x0219 }
        r13.registerReceiver(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0219 }
    L_0x0140:
        r13.L();	 Catch:{ IllegalArgumentException -> 0x021b }
        r1 = 0;
        r13.ak = r1;	 Catch:{ IllegalArgumentException -> 0x021b }
        r13.w();	 Catch:{ IllegalArgumentException -> 0x021b }
        r1 = 0;
        r0.setMicrophoneMute(r1);	 Catch:{ IllegalArgumentException -> 0x021b }
        if (r14 != 0) goto L_0x021f;
    L_0x014f:
        r1 = r0.isWiredHeadsetOn();	 Catch:{ IllegalArgumentException -> 0x021d }
        if (r1 != 0) goto L_0x021f;
    L_0x0155:
        r1 = r2;
    L_0x0156:
        r0.setSpeakerphoneOn(r1);	 Catch:{ IllegalArgumentException -> 0x0222 }
        r1 = r13.i();	 Catch:{ IllegalArgumentException -> 0x0222 }
        if (r1 == 0) goto L_0x0163;
    L_0x015f:
        r1 = 1;
        r13.b(r1);	 Catch:{ IllegalArgumentException -> 0x0222 }
    L_0x0163:
        r13.d();
        r1 = android.os.Build.VERSION.SDK_INT;
        r4 = 8;
        if (r1 < r4) goto L_0x018e;
    L_0x016c:
        r1 = ae;
        r1 = (android.media.AudioManager.OnAudioFocusChangeListener) r1;
        r1 = r0.requestAudioFocus(r1, r3, r11);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r8 = bb;
        r9 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r8 = r8[r9];
        r4 = r4.append(r8);
        r1 = r4.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
    L_0x018e:
        if (r14 != 0) goto L_0x019c;
    L_0x0190:
        r1 = com.whatsapp.Voip.getPeerJid();	 Catch:{ IllegalArgumentException -> 0x0224 }
        r13.b(r1);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r1 = 0;
        r13.d = r1;	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r5 == 0) goto L_0x01b0;
    L_0x019c:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r4 = 11;
        if (r1 < r4) goto L_0x01a8;
    L_0x01a2:
        r1 = 3;
        r0.setMode(r1);	 Catch:{ IllegalArgumentException -> 0x0228 }
        if (r5 == 0) goto L_0x01ac;
    L_0x01a8:
        r1 = 2;
        r0.setMode(r1);	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x01ac:
        r13.H = r10;
        r13.am = r10;
    L_0x01b0:
        r0 = r13.ah;	 Catch:{ IllegalArgumentException -> 0x022a }
        r1 = 0;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.sendEmptyMessageDelayed(r1, r4);	 Catch:{ IllegalArgumentException -> 0x022a }
        r0 = r13.ax;	 Catch:{ IllegalArgumentException -> 0x022a }
        if (r0 == 0) goto L_0x01c1;
    L_0x01bc:
        r0 = r13.ax;	 Catch:{ IllegalArgumentException -> 0x022a }
        r0.release();	 Catch:{ IllegalArgumentException -> 0x022a }
    L_0x01c1:
        r0 = new android.media.SoundPool;
        r0.<init>(r2, r3, r3);
        r13.ax = r0;
        r0 = r13.ax;
        r1 = r13.getApplicationContext();
        r3 = 2131165185; // 0x7f070001 float:1.794458E38 double:1.0529355035E-314;
        r0 = r0.load(r1, r3, r2);
        r13.q = r0;
        r0 = r13.R;
        r0.sendEmptyMessage(r12);
        r13.F = r2;
        r0 = android.os.SystemClock.elapsedRealtime();
        r13.v = r0;
        r0 = r13.v;
        r0 = r0 - r6;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r1 = bb;
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0087;
    L_0x020d:
        r0 = move-exception;
        throw r0;
    L_0x020f:
        r4 = r3;
        goto L_0x00c2;
    L_0x0212:
        r0 = move-exception;
        throw r0;
    L_0x0214:
        r0 = move-exception;
        throw r0;
    L_0x0216:
        r1 = r3;
        goto L_0x0128;
    L_0x0219:
        r0 = move-exception;
        throw r0;
    L_0x021b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x021d }
    L_0x021d:
        r0 = move-exception;
        throw r0;
    L_0x021f:
        r1 = r3;
        goto L_0x0156;
    L_0x0222:
        r0 = move-exception;
        throw r0;
    L_0x0224:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
    L_0x0226:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x0228:
        r0 = move-exception;
        throw r0;
    L_0x022a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.c(boolean):void");
    }

    public boolean u() {
        return this.B;
    }

    public boolean c() {
        try {
            return this.aC == a7.BLUETOOTH;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int b(VoiceService voiceService, int i) {
        voiceService.r = i;
        return i;
    }

    private void K() {
        try {
            Log.i(bb[120]);
            auv.a();
            this.aa = false;
            if (this.aB != null) {
                if (VERSION.SDK_INT >= 21) {
                    return;
                }
            }
            if (this.L != null) {
                this.L.f();
                Window window = this.L.c().getWindow();
                View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
                if (childAt.getVisibility() == 4) {
                    LayoutParams attributes = window.getAttributes();
                    try {
                        attributes.flags &= -1025;
                        attributes.screenBrightness = -1.0f;
                        if (VERSION.SDK_INT >= 11) {
                            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
                        }
                        childAt.setVisibility(0);
                        window.setAttributes(attributes);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static String m(VoiceService voiceService) {
        return voiceService.c;
    }

    @NonNull
    public static byte[] a(@NonNull awc com_whatsapp_awc, @NonNull String str, @NonNull b1 b1Var) {
        Throwable e;
        j e2 = awc.e(str);
        try {
            if (b1Var.a != 2) {
                throw new IllegalArgumentException(bb[87] + b1Var.a);
            }
            try {
                byte[] bArr = (byte[]) awc.e.submit(new gp(b1Var, new i(com_whatsapp_awc, com_whatsapp_awc, com_whatsapp_awc.i(), com_whatsapp_awc, e2))).get();
                if (bArr != null) {
                    try {
                        if (bArr.length != 0) {
                            int i = bArr[bArr.length - 1] & 255;
                            if (i == 0) {
                                try {
                                    throw new IllegalStateException(bb[86]);
                                } catch (ExecutionException e3) {
                                    throw e3;
                                }
                            }
                            try {
                                if (i >= bArr.length) {
                                    throw new IllegalStateException(bb[90]);
                                }
                                byte[] bArr2 = new byte[(bArr.length - i)];
                                System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                                try {
                                    return a(E2E.Message.parseFrom(bArr2).getCall().getCallKey().h());
                                } catch (Throwable e4) {
                                    throw new IllegalStateException(bb[88], e4);
                                }
                            } catch (ExecutionException e32) {
                                throw e32;
                            }
                        }
                    } catch (ExecutionException e322) {
                        throw e322;
                    } catch (ExecutionException e3222) {
                        throw e3222;
                    }
                }
                throw new IllegalStateException(bb[89]);
            } catch (ExecutionException e32222) {
                e4 = e32222.getCause();
                if (e4 instanceof bF) {
                    throw ((bF) e4);
                } else if (e4 instanceof bH) {
                    throw ((bH) e4);
                } else if (e4 instanceof ar) {
                    throw ((ar) e4);
                } else if (e4 instanceof bX) {
                    throw ((bX) e4);
                } else if (e4 instanceof r) {
                    throw ((r) e4);
                } else if (e4 instanceof y) {
                    throw ((y) e4);
                } else if (e4 instanceof av) {
                    throw ((av) e4);
                } else if (e4 instanceof org.whispersystems.b1) {
                    throw ((org.whispersystems.b1) e4);
                } else if (e4 instanceof RuntimeException) {
                    throw ((RuntimeException) e4);
                } else if (e4 instanceof Error) {
                    throw ((Error) e4);
                } else {
                    throw new AssertionError(e4);
                }
            } catch (ExecutionException e322222) {
                throw e322222;
            } catch (ExecutionException e3222222) {
                throw e3222222;
            } catch (ExecutionException e32222222) {
                throw e32222222;
            } catch (ExecutionException e322222222) {
                throw e322222222;
            } catch (ExecutionException e3222222222) {
                throw e3222222222;
            } catch (ExecutionException e32222222222) {
                throw e32222222222;
            } catch (ExecutionException e322222222222) {
                throw e322222222222;
            } catch (ExecutionException e3222222222222) {
                throw e3222222222222;
            } catch (ExecutionException e32222222222222) {
                throw e32222222222222;
            } catch (ExecutionException e322222222222222) {
                throw e322222222222222;
            }
        } catch (ExecutionException e3222222222222222) {
            throw e3222222222222222;
        }
    }

    static void P(VoiceService voiceService) {
        voiceService.K();
    }

    static boolean y(VoiceService voiceService) {
        return voiceService.F;
    }

    public void d(String str, String str2) {
        Log.i(bb[161]);
    }

    static void g(VoiceService voiceService) {
        voiceService.d();
    }

    private void l() {
        this.aD.removeMessages(0);
        this.aD.sendEmptyMessageDelayed(0, 15000);
    }

    static void c(VoiceService voiceService, boolean z) {
        voiceService.b(z);
    }

    public void a(ct ctVar, String str, long j, byte[] bArr, int i) {
        Log.i(bb[182]);
        Voip.nativeHandleCallRelayElection(ctVar.e, ctVar.b, str, bArr, i);
        App.b(ctVar);
    }

    static Object S(VoiceService voiceService) {
        return voiceService.h;
    }

    static void a(VoiceService voiceService, CallInfo callInfo) {
        voiceService.b(callInfo);
    }

    public void E() {
        Log.i(bb[186]);
        this.aw.execute(new a(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.Voip.CallState r8, com.whatsapp.Voip.CallInfo r9) {
        /*
        r7 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        com.whatsapp.auv.a();	 Catch:{ IllegalArgumentException -> 0x000e }
        if (r9 == 0) goto L_0x000d;
    L_0x0007:
        r0 = r9.getCallState();	 Catch:{ IllegalArgumentException -> 0x0010 }
        if (r8 != r0) goto L_0x0012;
    L_0x000d:
        return;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r2 = r9.getCallState();
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r3 = bb;	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r4 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = r0.append(r8);	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r3 = bb;	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r4 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r3 = bb;	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r4 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x01a7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x01a7 }
        r0 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ IllegalArgumentException -> 0x01a7 }
        if (r2 != r0) goto L_0x006b;
    L_0x004c:
        r0 = r7.i;	 Catch:{ IllegalArgumentException -> 0x01a9 }
        if (r0 == 0) goto L_0x0066;
    L_0x0050:
        r0 = r7.i;	 Catch:{ IllegalArgumentException -> 0x01ab }
        r0 = r0.booleanValue();	 Catch:{ IllegalArgumentException -> 0x01ab }
        if (r0 == 0) goto L_0x0066;
    L_0x0058:
        r0 = r7.R;	 Catch:{ IllegalArgumentException -> 0x01ad }
        r3 = 1;
        r0.removeMessages(r3);	 Catch:{ IllegalArgumentException -> 0x01ad }
        r0 = r7.R;	 Catch:{ IllegalArgumentException -> 0x01ad }
        r3 = 1;
        r0.sendEmptyMessage(r3);	 Catch:{ IllegalArgumentException -> 0x01ad }
        if (r1 == 0) goto L_0x00b4;
    L_0x0066:
        r7.o();	 Catch:{ IllegalArgumentException -> 0x01af }
        if (r1 == 0) goto L_0x00b4;
    L_0x006b:
        r0 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x01b1 }
        if (r2 != r0) goto L_0x0077;
    L_0x006f:
        r0 = r7.R;	 Catch:{ IllegalArgumentException -> 0x01b3 }
        r3 = 1;
        r0.removeMessages(r3);	 Catch:{ IllegalArgumentException -> 0x01b3 }
        if (r1 == 0) goto L_0x00b4;
    L_0x0077:
        r0 = com.whatsapp.Voip.CallState.ACTIVE;	 Catch:{ IllegalArgumentException -> 0x01b5 }
        if (r2 != r0) goto L_0x00b4;
    L_0x007b:
        r0 = r7.y;	 Catch:{ IllegalArgumentException -> 0x01b7 }
        r3 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        if (r0 < r3) goto L_0x00b4;
    L_0x0081:
        r0 = r7.y;	 Catch:{ IllegalArgumentException -> 0x01b9 }
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 > r3) goto L_0x00b4;
    L_0x0087:
        r0 = r7.y;	 Catch:{ IllegalArgumentException -> 0x01bb }
        if (r0 == 0) goto L_0x00b4;
    L_0x008b:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x01bb }
        r3 = bb;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r4 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01bb }
        r3 = r7.y;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x01bb }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0 = r7.K;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r3 = r7.y;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0 = r0 + r3;
        r0 = (short) r0;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r7.K = r0;	 Catch:{ IllegalArgumentException -> 0x01bb }
        r0 = r7.K;	 Catch:{ IllegalArgumentException -> 0x01bb }
        com.whatsapp.Voip.adjustAudioLevel(r0);	 Catch:{ IllegalArgumentException -> 0x01bb }
    L_0x00b4:
        r0 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x01bd }
        if (r2 == r0) goto L_0x00bb;
    L_0x00b8:
        r7.d();	 Catch:{ IllegalArgumentException -> 0x01bd }
    L_0x00bb:
        r0 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ IllegalArgumentException -> 0x01bf }
        if (r2 == r0) goto L_0x00c2;
    L_0x00bf:
        r7.M();	 Catch:{ IllegalArgumentException -> 0x01bf }
    L_0x00c2:
        r0 = 0;
        r3 = r7.L;
        if (r3 == 0) goto L_0x00d2;
    L_0x00c7:
        r0 = r7.L;
        r0 = r0.g();
        r3 = r7.L;
        r3.a(r8, r9);
    L_0x00d2:
        r3 = new com.whatsapp.protocol.c3;
        r4 = r9.getPeerId();
        r5 = r9.isCaller();
        r6 = r9.getCallId();
        r6 = com.whatsapp.Voip.a(r6);
        r3.<init>(r4, r5, r6);
        r4 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x01c1 }
        if (r2 != r4) goto L_0x0175;
    L_0x00eb:
        r2 = r7.Z;	 Catch:{ IllegalArgumentException -> 0x01c3 }
        if (r2 == 0) goto L_0x0134;
    L_0x00ef:
        r2 = com.whatsapp.App.am;	 Catch:{ IllegalArgumentException -> 0x01c5 }
        r4 = 2;
        if (r2 == r4) goto L_0x00fe;
    L_0x00f4:
        r2 = java.lang.Boolean.TRUE;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r4 = r7.J;	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r2 = r2.equals(r4);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        if (r2 == 0) goto L_0x0127;
    L_0x00fe:
        r2 = com.whatsapp.Voip.CallState.ACTIVE;	 Catch:{ IllegalArgumentException -> 0x01c9 }
        if (r8 != r2) goto L_0x0127;
    L_0x0102:
        if (r0 == 0) goto L_0x0127;
    L_0x0104:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.CallRatingActivity.class;
        r0.<init>(r7, r2);
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.setFlags(r2);	 Catch:{ IllegalArgumentException -> 0x01cb }
        r2 = com.whatsapp.CallRatingActivity.n;	 Catch:{ IllegalArgumentException -> 0x01cb }
        r4 = r7.Z;	 Catch:{ IllegalArgumentException -> 0x01cb }
        r4 = com.whatsapp.nf.a(r4);	 Catch:{ IllegalArgumentException -> 0x01cb }
        r0.putExtra(r2, r4);	 Catch:{ IllegalArgumentException -> 0x01cb }
        r2 = com.whatsapp.CallRatingActivity.m;	 Catch:{ IllegalArgumentException -> 0x01cb }
        r4 = r7.T;	 Catch:{ IllegalArgumentException -> 0x01cb }
        r0.putExtra(r2, r4);	 Catch:{ IllegalArgumentException -> 0x01cb }
        r7.startActivity(r0);	 Catch:{ IllegalArgumentException -> 0x01cb }
        if (r1 == 0) goto L_0x013d;
    L_0x0127:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x01cd }
        r2 = r7.Z;	 Catch:{ IllegalArgumentException -> 0x01cd }
        r4 = r7.T;	 Catch:{ IllegalArgumentException -> 0x01cd }
        com.whatsapp.nf.a(r0, r2, r4);	 Catch:{ IllegalArgumentException -> 0x01cd }
        if (r1 == 0) goto L_0x013d;
    L_0x0134:
        r0 = bb;	 Catch:{ IllegalArgumentException -> 0x01cd }
        r2 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x01cd }
        com.whatsapp.auv.a(r0);	 Catch:{ IllegalArgumentException -> 0x01cd }
    L_0x013d:
        r7.a(r8);
        com.whatsapp.Voip.c();
        r0 = com.whatsapp.App.aK;
        r0 = r0.a(r3);
        if (r0 == 0) goto L_0x0159;
    L_0x014b:
        com.whatsapp.App.g(r0);	 Catch:{ IllegalArgumentException -> 0x01cf }
        r2 = com.whatsapp.Voip.b(r0);	 Catch:{ IllegalArgumentException -> 0x01cf }
        if (r2 == 0) goto L_0x0173;
    L_0x0154:
        com.whatsapp.App.j(r0);	 Catch:{ IllegalArgumentException -> 0x01d1 }
        if (r1 == 0) goto L_0x0173;
    L_0x0159:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01d1 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x01d1 }
        r2 = bb;	 Catch:{ IllegalArgumentException -> 0x01d1 }
        r4 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x01d1 }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x01d1 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01d1 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x01d1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x01d1 }
    L_0x0173:
        if (r1 == 0) goto L_0x000d;
    L_0x0175:
        com.whatsapp.Voip.a();	 Catch:{ IllegalArgumentException -> 0x01d3 }
        r0 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x01d3 }
        if (r8 != r0) goto L_0x000d;
    L_0x017c:
        r0 = com.whatsapp.App.aK;
        r0 = r0.a(r3);
        if (r0 == 0) goto L_0x0189;
    L_0x0184:
        com.whatsapp.App.m(r0);	 Catch:{ IllegalArgumentException -> 0x01a5 }
        if (r1 == 0) goto L_0x000d;
    L_0x0189:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r2 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x01a5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x01a5 }
        goto L_0x000d;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a9 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01af }
    L_0x01af:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b3 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b5 }
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b9 }
    L_0x01b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01bb }
    L_0x01bb:
        r0 = move-exception;
        throw r0;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r0 = move-exception;
        throw r0;
    L_0x01c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c3 }
    L_0x01c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c5 }
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01d1 }
    L_0x01d1:
        r0 = move-exception;
        throw r0;
    L_0x01d3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(com.whatsapp.Voip$CallState, com.whatsapp.Voip$CallInfo):void");
    }

    public void t() {
        try {
            Log.i(bb[14]);
            if (VERSION.SDK_INT < 23) {
                if (!App.c((Context) this)) {
                    Log.w(bb[15]);
                    b(vl.OTHER_REASON, getString(2131230883));
                    return;
                }
            }
            M();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private float y() {
        return getSharedPreferences(bb[203], 0).getFloat(bb[204], -1.0f);
    }

    static Uri U(VoiceService voiceService) {
        return voiceService.x;
    }

    public void a(ct ctVar, String str, long j, byte[][] bArr, int[] iArr) {
        Log.i(bb[207]);
        Voip.nativeHandleCallRelayLatency(ctVar.e, ctVar.b, str, bArr, iArr);
        App.b(ctVar);
    }

    public static int e() {
        return App.z().getSharedPreferences(bb[195], 0).getInt(bb[194], 20000);
    }

    @TargetApi(8)
    private void b(boolean z) {
        Log.i(bb[165] + z + bb[164] + this.ab);
        AudioManager audioManager = (AudioManager) getSystemService(bb[166]);
        if (z) {
            try {
                this.av = false;
                audioManager.startBluetoothSco();
                if (this.ab) {
                    audioManager.setBluetoothScoOn(true);
                    p();
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        try {
            this.av = true;
            audioManager.stopBluetoothSco();
            if (!this.ab) {
                audioManager.setBluetoothScoOn(false);
                p();
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static VoipOptions T(VoiceService voiceService) {
        return voiceService.o;
    }

    static Handler E(VoiceService voiceService) {
        return voiceService.ar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.support.v4.app.NotificationCompat.Builder r9, com.whatsapp.Voip.CallInfo r10) {
        /*
        r8 = this;
        r6 = 0;
        r4 = 1;
        r0 = bb;
        r1 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r0 = r0[r1];
        r9.setCategory(r0);
        r9.setPriority(r4);
        r0 = 2130839686; // 0x7f020886 float:1.728439E38 double:1.0527746856E-314;
        r9.setSmallIcon(r0);
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r0 = r0.getColor(r1);
        r9.setColor(r0);
        r2 = r10.getCallActiveTime();
        r0 = r10.isCaller();
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x005b;
    L_0x0033:
        r0 = 2131231583; // 0x7f08035f float:1.8079251E38 double:1.0529683085E-314;
    L_0x0036:
        r0 = r8.getText(r0);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r9.setContentText(r0);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x004c;
    L_0x0041:
        r0 = 1;
        r9.setUsesChronometer(r0);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r9.setWhen(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r0 == 0) goto L_0x0057;
    L_0x004c:
        r0 = 0;
        r9.setUsesChronometer(r0);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalArgumentException -> 0x0067 }
        r9.setWhen(r0);	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0057:
        r9.setOngoing(r4);
        return;
    L_0x005b:
        if (r0 == 0) goto L_0x0061;
    L_0x005d:
        r0 = 2131231587; // 0x7f080363 float:1.807926E38 double:1.0529683105E-314;
        goto L_0x0036;
    L_0x0061:
        r0 = 2131231362; // 0x7f080282 float:1.8078803E38 double:1.0529681993E-314;
        goto L_0x0036;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(android.support.v4.app.NotificationCompat$Builder, com.whatsapp.Voip$CallInfo):void");
    }

    static vl u(VoiceService voiceService) {
        return voiceService.aj;
    }

    private void h() {
        b(vl.OTHER_REASON, null);
    }

    static Double b(VoiceService voiceService, Double d) {
        voiceService.d = d;
        return d;
    }

    public void M() {
        if (this.an != null) {
            ((Vibrator) getSystemService(bb[91])).cancel();
            this.an = null;
        }
        try {
            if (this.Y != null) {
                Log.i(bb[92]);
                this.Y.stop();
                this.Y = null;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static AtomicInteger q() {
        return u;
    }

    static boolean g(VoiceService voiceService, boolean z) {
        voiceService.e = z;
        return z;
    }

    static boolean b(VoiceService voiceService, boolean z) {
        voiceService.ab = z;
        return z;
    }

    static void G(VoiceService voiceService) {
        voiceService.h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r11) {
        /*
        r10 = this;
        r3 = 2;
        r2 = 0;
        r4 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = bb;	 Catch:{ Exception -> 0x001a }
        r1 = 76;
        r0 = r0[r1];	 Catch:{ Exception -> 0x001a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x001a }
        if (r11 != 0) goto L_0x001c;
    L_0x0010:
        r0 = bb;	 Catch:{ Exception -> 0x001a }
        r1 = 82;
        r0 = r0[r1];	 Catch:{ Exception -> 0x001a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x001a }
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r0 = bb;
        r1 = 77;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r1 = r0.getRingerMode();	 Catch:{ Exception -> 0x00fe }
        switch(r1) {
            case 0: goto L_0x00e6;
            case 1: goto L_0x00f1;
            case 2: goto L_0x00db;
            default: goto L_0x002f;
        };
    L_0x002f:
        r1 = r10.Y;
        if (r1 != 0) goto L_0x0019;
    L_0x0033:
        r1 = r10.getBaseContext();
        r1 = com.whatsapp.a3b.a(r1);
        r6 = r1.b(r11);
        r7 = r6.g();
        r1 = android.text.TextUtils.isEmpty(r7);	 Catch:{ Exception -> 0x0102 }
        if (r1 != 0) goto L_0x0071;
    L_0x0049:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0102 }
        r1.<init>();	 Catch:{ Exception -> 0x0102 }
        r8 = bb;	 Catch:{ Exception -> 0x0102 }
        r9 = 72;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0102 }
        r1 = r1.append(r8);	 Catch:{ Exception -> 0x0102 }
        r1 = r1.append(r7);	 Catch:{ Exception -> 0x0102 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x0102 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x0102 }
        r1 = android.net.Uri.parse(r7);	 Catch:{ Exception -> 0x0102 }
        r10.x = r1;	 Catch:{ Exception -> 0x0102 }
        r1 = r10.x;	 Catch:{ Exception -> 0x0102 }
        r1 = android.media.RingtoneManager.getRingtone(r10, r1);	 Catch:{ Exception -> 0x0102 }
        r10.Y = r1;	 Catch:{ Exception -> 0x0102 }
    L_0x0071:
        r1 = r10.Y;
        if (r1 == 0) goto L_0x0112;
    L_0x0075:
        r0.setMode(r4);
        r1 = r10.Y;	 Catch:{ Exception -> 0x0104 }
        r1.play();	 Catch:{ Exception -> 0x0104 }
    L_0x007d:
        r1 = r0.getRingerMode();	 Catch:{ Exception -> 0x0135 }
        if (r1 == r3) goto L_0x0089;
    L_0x0083:
        r0 = r0.getRingerMode();	 Catch:{ Exception -> 0x0135 }
        if (r0 != r4) goto L_0x0019;
    L_0x0089:
        r1 = r6.d();
        r0 = "0";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0019;
    L_0x0096:
        r0 = -1;
        r6 = r1.hashCode();	 Catch:{ Exception -> 0x015b }
        switch(r6) {
            case 49: goto L_0x0137;
            case 50: goto L_0x0143;
            case 51: goto L_0x014f;
            default: goto L_0x009e;
        };
    L_0x009e:
        switch(r0) {
            case 0: goto L_0x0161;
            case 1: goto L_0x0174;
            case 2: goto L_0x0187;
            default: goto L_0x00a1;
        };
    L_0x00a1:
        r0 = bb;	 Catch:{ Exception -> 0x01a0 }
        r3 = 79;
        r0 = r0[r3];	 Catch:{ Exception -> 0x01a0 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x01a0 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a0 }
        r0.<init>();	 Catch:{ Exception -> 0x01a0 }
        r3 = bb;	 Catch:{ Exception -> 0x01a0 }
        r4 = 84;
        r3 = r3[r4];	 Catch:{ Exception -> 0x01a0 }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x01a0 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01a0 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01a0 }
        com.whatsapp.auv.a(r0);	 Catch:{ Exception -> 0x01a0 }
    L_0x00c4:
        r0 = r10.an;
        if (r0 == 0) goto L_0x0019;
    L_0x00c8:
        r0 = bb;
        r1 = 85;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.os.Vibrator) r0;
        r1 = r10.an;
        r0.vibrate(r1, r2);
        goto L_0x0019;
    L_0x00db:
        r1 = bb;	 Catch:{ Exception -> 0x00fe }
        r6 = 75;
        r1 = r1[r6];	 Catch:{ Exception -> 0x00fe }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x00fe }
        if (r5 == 0) goto L_0x002f;
    L_0x00e6:
        r1 = bb;	 Catch:{ Exception -> 0x0100 }
        r6 = 83;
        r1 = r1[r6];	 Catch:{ Exception -> 0x0100 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x0100 }
        if (r5 == 0) goto L_0x002f;
    L_0x00f1:
        r1 = bb;	 Catch:{ Exception -> 0x00fc }
        r6 = 80;
        r1 = r1[r6];	 Catch:{ Exception -> 0x00fc }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x00fc }
        goto L_0x002f;
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00fc }
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);
        r1 = r10.Y;	 Catch:{ Exception -> 0x0130 }
        r1.stop();	 Catch:{ Exception -> 0x0130 }
    L_0x010d:
        r1 = 0;
        r10.Y = r1;	 Catch:{ Exception -> 0x012e }
        if (r5 == 0) goto L_0x007d;
    L_0x0112:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x012e }
        r1.<init>();	 Catch:{ Exception -> 0x012e }
        r8 = bb;	 Catch:{ Exception -> 0x012e }
        r9 = 81;
        r8 = r8[r9];	 Catch:{ Exception -> 0x012e }
        r1 = r1.append(r8);	 Catch:{ Exception -> 0x012e }
        r1 = r1.append(r7);	 Catch:{ Exception -> 0x012e }
        r1 = r1.toString();	 Catch:{ Exception -> 0x012e }
        com.whatsapp.util.Log.e(r1);	 Catch:{ Exception -> 0x012e }
        goto L_0x007d;
    L_0x012e:
        r0 = move-exception;
        throw r0;
    L_0x0130:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);
        goto L_0x010d;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r6 = "1";
        r6 = r1.equals(r6);	 Catch:{ Exception -> 0x015b }
        if (r6 == 0) goto L_0x009e;
    L_0x0140:
        if (r5 == 0) goto L_0x01a5;
    L_0x0142:
        r0 = r2;
    L_0x0143:
        r6 = "2";
        r6 = r1.equals(r6);	 Catch:{ Exception -> 0x015d }
        if (r6 == 0) goto L_0x009e;
    L_0x014c:
        if (r5 == 0) goto L_0x01a2;
    L_0x014e:
        r0 = r4;
    L_0x014f:
        r4 = "3";
        r4 = r1.equals(r4);	 Catch:{ Exception -> 0x015f }
        if (r4 == 0) goto L_0x009e;
    L_0x0158:
        r0 = r3;
        goto L_0x009e;
    L_0x015b:
        r0 = move-exception;
        throw r0;
    L_0x015d:
        r0 = move-exception;
        throw r0;
    L_0x015f:
        r0 = move-exception;
        throw r0;
    L_0x0161:
        r0 = 3;
        r0 = new long[r0];	 Catch:{ Exception -> 0x019c }
        r0 = {0, 750, 1500};	 Catch:{ Exception -> 0x019c }
        r10.an = r0;	 Catch:{ Exception -> 0x019c }
        r0 = bb;	 Catch:{ Exception -> 0x019c }
        r3 = 78;
        r0 = r0[r3];	 Catch:{ Exception -> 0x019c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x019c }
        if (r5 == 0) goto L_0x00c4;
    L_0x0174:
        r0 = 3;
        r0 = new long[r0];	 Catch:{ Exception -> 0x019e }
        r0 = {0, 300, 200};	 Catch:{ Exception -> 0x019e }
        r10.an = r0;	 Catch:{ Exception -> 0x019e }
        r0 = bb;	 Catch:{ Exception -> 0x019e }
        r3 = 73;
        r0 = r0[r3];	 Catch:{ Exception -> 0x019e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x019e }
        if (r5 == 0) goto L_0x00c4;
    L_0x0187:
        r0 = 3;
        r0 = new long[r0];	 Catch:{ Exception -> 0x01a0 }
        r0 = {0, 750, 250};	 Catch:{ Exception -> 0x01a0 }
        r10.an = r0;	 Catch:{ Exception -> 0x01a0 }
        r0 = bb;	 Catch:{ Exception -> 0x01a0 }
        r3 = 74;
        r0 = r0[r3];	 Catch:{ Exception -> 0x01a0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x01a0 }
        if (r5 == 0) goto L_0x00c4;
    L_0x019a:
        goto L_0x00a1;
    L_0x019c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x019e }
    L_0x019e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a0 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;
    L_0x01a2:
        r0 = r4;
        goto L_0x009e;
    L_0x01a5:
        r0 = r2;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b(java.lang.String):void");
    }

    static String v(VoiceService voiceService) {
        return voiceService.p;
    }

    private void O() {
        Voip.b(this.ag);
        this.ag = null;
        Voip.d(this.h);
        this.h = null;
        Voip.c(this.t);
        this.t = null;
    }

    public void a(vl vlVar, String str) {
        Log.i(bb[37]);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                auv.a();
                if (str == null) {
                    if (callInfo.isCaller()) {
                        try {
                            if (callInfo.getCallState() == CallState.CALLING) {
                                try {
                                    if (!this.a && SystemClock.elapsedRealtime() - this.v > 10000) {
                                        str = getString(2131232246);
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                }
                if (str != null) {
                    try {
                        if (this.L != null) {
                            this.L.e(str);
                            if (this.J != null) {
                                Log.i(bb[39] + str + bb[41]);
                                this.J = Boolean.valueOf(false);
                            }
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
                this.aj = vlVar;
                this.aw.execute(new m6(this, vlVar));
                Log.i(bb[40] + (SystemClock.elapsedRealtime() - elapsedRealtime) + bb[38]);
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
    }

    public void a(String str, String str2, String str3, boolean z) {
        try {
            Log.i(bb[205]);
            Voip.nativeHandleCallOfferReceipt(str, str2, str3);
            if (str3 == null) {
                return;
            }
            if (str3.equals(Voip.getCurrentCallId())) {
                this.A = z;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onEvent(a47 com_whatsapp_a47) {
        try {
            if (com_whatsapp_a47.a) {
                this.aw.execute(new ams(this));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void r() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            try {
                Object obj;
                if (!callInfo.isCaller()) {
                    if (callInfo.getCallState() == CallState.RECEIVED_CALL) {
                        obj = null;
                        if (this.aC == a7.EARPIECE && r0 != null) {
                            B();
                            this.ay.a(this.ad);
                            Log.i(bb[167]);
                            if (!DialogToastActivity.f) {
                                return;
                            }
                        }
                        G();
                        this.ay.a(null);
                        Log.i(bb[168]);
                    }
                }
                obj = 1;
                try {
                    try {
                        B();
                        this.ay.a(this.ad);
                        Log.i(bb[167]);
                        if (DialogToastActivity.f) {
                            return;
                        }
                        G();
                        this.ay.a(null);
                        Log.i(bb[168]);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.whatsapp.protocol.ct r4, java.lang.String r5, long r6, boolean r8) {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r1 = bb;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0 = r0.append(r8);	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0036 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r8 == 0) goto L_0x0029;
    L_0x001c:
        r0 = r3.ap;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0.callResumed();	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0 = 0;
        com.whatsapp.Voip.setPeerAudioStreamPause(r0);	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r0 == 0) goto L_0x0032;
    L_0x0029:
        r0 = r3.ap;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0.callInterrupted();	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0 = 1;
        com.whatsapp.Voip.setPeerAudioStreamPause(r0);	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0032:
        com.whatsapp.App.b(r4);
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b(com.whatsapp.protocol.ct, java.lang.String, long, boolean):void");
    }

    static int v() {
        return I;
    }

    private void x() {
        try {
            PowerManager powerManager = (PowerManager) getSystemService(bb[71]);
            if (!powerManager.isScreenOn()) {
                WakeLock newWakeLock = powerManager.newWakeLock(268435466, bb[70]);
                if (newWakeLock != null) {
                    newWakeLock.acquire();
                    newWakeLock.release();
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (Throwable e2) {
            Log.a(e2);
        }
    }

    static void J(VoiceService voiceService) {
        voiceService.p();
    }

    static BluetoothHeadset a(VoiceService voiceService, BluetoothHeadset bluetoothHeadset) {
        voiceService.az = bluetoothHeadset;
        return bluetoothHeadset;
    }

    public boolean N() {
        return this.b;
    }

    static Double d(VoiceService voiceService, Double d) {
        voiceService.D = d;
        return d;
    }

    static boolean r(VoiceService voiceService) {
        return voiceService.k;
    }

    public VoiceService() {
        this.U = new dp(this);
        this.ap = new VoiceServiceEventCallback(this);
        this.af = Integer.valueOf(1500);
        this.aq = true;
        this.aA = true;
        this.C = -1;
        this.r = -1;
        this.T = true;
        this.P = new Object();
    }

    static Object I(VoiceService voiceService) {
        return voiceService.t;
    }

    public void b(String str, String str2, String str3) {
        Log.i(bb[272]);
    }

    private void w() {
        try {
            auv.a();
            if (this.G == null) {
                try {
                    PowerManager powerManager = (PowerManager) getSystemService(bb[11]);
                    if (powerManager != null) {
                        this.G = powerManager.newWakeLock(1, bb[12]);
                        if (this.G != null) {
                            this.G.acquire();
                            Log.i(bb[13]);
                        }
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                } catch (Throwable e3) {
                    Log.a(e3);
                    this.G = null;
                }
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.Voip.CallState r5) {
        /*
        r4 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = bb;
        r2 = 45;
        r0 = r0[r2];
        r0 = r4.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r2 = com.whatsapp.axh.a;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r3 = r5.ordinal();	 Catch:{ IllegalArgumentException -> 0x0079 }
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0079 }
        switch(r2) {
            case 1: goto L_0x001a;
            case 2: goto L_0x0053;
            case 3: goto L_0x001a;
            case 4: goto L_0x001a;
            case 5: goto L_0x001a;
            case 6: goto L_0x0064;
            default: goto L_0x0019;
        };
    L_0x0019:
        return;
    L_0x001a:
        r2 = r4.aG;	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r2 == 0) goto L_0x0024;
    L_0x001e:
        r2 = r4.aG;	 Catch:{ IllegalArgumentException -> 0x007d }
        r4.n = r2;	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r1 == 0) goto L_0x003a;
    L_0x0024:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x007f }
        r3 = 11;
        if (r2 < r3) goto L_0x0033;
    L_0x002a:
        r2 = 3;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r4.n = r2;	 Catch:{ IllegalArgumentException -> 0x0081 }
        if (r1 == 0) goto L_0x003a;
    L_0x0033:
        r2 = 2;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r4.n = r2;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x003a:
        r2 = r4.n;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0083 }
        r0.setMode(r2);	 Catch:{ IllegalArgumentException -> 0x0083 }
        r2 = r4.L;	 Catch:{ IllegalArgumentException -> 0x0083 }
        if (r2 == 0) goto L_0x0019;
    L_0x0047:
        r2 = r4.L;	 Catch:{ IllegalArgumentException -> 0x0085 }
        r2 = r2.c();	 Catch:{ IllegalArgumentException -> 0x0085 }
        r3 = 0;
        r2.setVolumeControlStream(r3);	 Catch:{ IllegalArgumentException -> 0x0085 }
        if (r1 == 0) goto L_0x0019;
    L_0x0053:
        r2 = r4.L;	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r2 == 0) goto L_0x0019;
    L_0x0057:
        r2 = r4.L;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r2 = r2.c();	 Catch:{ IllegalArgumentException -> 0x0089 }
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r2.setVolumeControlStream(r3);	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r1 == 0) goto L_0x0019;
    L_0x0064:
        r1 = 1;
        r0.setMode(r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r4.L;	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0019;
    L_0x006c:
        r0 = r4.L;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = 2;
        r0.setVolumeControlStream(r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0019;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b(com.whatsapp.Voip$CallState):void");
    }

    public static void a(com.whatsapp.fieldstats.v vVar, String str, Double d) {
    }

    private void a(String str, String str2, boolean z) {
        Bundle bundle;
        byte[] bArr = null;
        if (str2 != null) {
            try {
                Log.i(bb[23] + str + bb[24] + str2 + bb[26] + z + bb[36] + this.z + bb[33] + this);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        synchronized (this.P) {
            if (this.z != null) {
                try {
                    if (!(this.z.obj == null || str == null || str2 == null)) {
                        Bundle bundle2 = (Bundle) this.z.obj;
                        try {
                            if (str.equals(bundle2.getString(bb[31])) && str2.equals(bundle2.getString(bb[28]))) {
                                this.z = null;
                                if (!DialogToastActivity.f) {
                                    bundle = bundle2;
                                }
                            }
                            bundle = null;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            }
            bundle = null;
        }
        if (bundle != null) {
            try {
                if (Voip.a != null) {
                    if (!z) {
                        bArr = bundle.getByteArray(bb[34]);
                    }
                    Voip.a.sendOffer(bundle.getString(bb[25]), bundle.getString(bb[30]), false, (byte[][]) bundle.getSerializable(bb[32]), bundle.getIntArray(bb[35]), bundle.getByteArray(bb[29]), bundle.getByteArray(bb[27]), bArr);
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] a(int[] r14, int r15) {
        /*
        r9 = com.whatsapp.DialogToastActivity.f;
        r10 = new java.util.ArrayList;
        r0 = r14.length;
        r10.<init>(r0);
        r0 = com.whatsapp.App.p;	 Catch:{ Throwable -> 0x002c }
        r1 = bb;	 Catch:{ Throwable -> 0x002c }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ Throwable -> 0x002c }
        r0 = r0.o(r1);	 Catch:{ Throwable -> 0x002c }
        if (r0 == 0) goto L_0x003c;
    L_0x0016:
        r0 = as;	 Catch:{ Throwable -> 0x002c }
        r1 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;
        if (r0 < r1) goto L_0x0032;
    L_0x001c:
        r0 = as;	 Catch:{ Throwable -> 0x002e }
        r1 = 640000; // 0x9c400 float:8.96831E-40 double:3.16202E-318;
        if (r0 > r1) goto L_0x0032;
    L_0x0023:
        r0 = 1;
        r0 = new int[r0];	 Catch:{ Throwable -> 0x0030 }
        r1 = 0;
        r2 = as;	 Catch:{ Throwable -> 0x0030 }
        r0[r1] = r2;	 Catch:{ Throwable -> 0x0030 }
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = 1;
        r0 = new int[r0];
        r1 = 0;
        r2 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        r0[r1] = r2;
        goto L_0x002b;
    L_0x003c:
        r11 = new java.util.ArrayList;
        r0 = r14.length;
        r11.<init>(r0);
        r1 = 0;
        r0 = as;	 Catch:{ Throwable -> 0x0226 }
        r2 = -1;
        if (r0 != r2) goto L_0x0386;
    L_0x0048:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0226 }
        r2 = 17;
        if (r0 < r2) goto L_0x0231;
    L_0x004e:
        r0 = com.whatsapp.App.z();	 Catch:{ Throwable -> 0x0228 }
        r2 = bb;	 Catch:{ Throwable -> 0x0228 }
        r3 = 64;
        r2 = r2[r3];	 Catch:{ Throwable -> 0x0228 }
        r0 = r0.getSystemService(r2);	 Catch:{ Throwable -> 0x0228 }
        r0 = (android.media.AudioManager) r0;	 Catch:{ Throwable -> 0x0228 }
        r2 = bb;	 Catch:{ Throwable -> 0x0228 }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ Throwable -> 0x0228 }
        r0 = r0.getProperty(r2);	 Catch:{ Throwable -> 0x0228 }
        if (r0 == 0) goto L_0x0383;
    L_0x006a:
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x0228 }
        r0 = r0.intValue();	 Catch:{ Throwable -> 0x0228 }
    L_0x0072:
        if (r0 <= 0) goto L_0x00a5;
    L_0x0074:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x024b }
        r1.<init>();	 Catch:{ Throwable -> 0x024b }
        r2 = bb;	 Catch:{ Throwable -> 0x024b }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ Throwable -> 0x024b }
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x024b }
        r2 = as;	 Catch:{ Throwable -> 0x024b }
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x024b }
        r2 = bb;	 Catch:{ Throwable -> 0x024b }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ Throwable -> 0x024b }
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x024b }
        r1 = r1.append(r0);	 Catch:{ Throwable -> 0x024b }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x024b }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Throwable -> 0x024b }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x024b }
        r11.add(r0);	 Catch:{ Throwable -> 0x024b }
    L_0x00a5:
        r1 = r14.length;
        r0 = 0;
    L_0x00a7:
        if (r0 >= r1) goto L_0x00c0;
    L_0x00a9:
        r2 = r14[r0];
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ Throwable -> 0x024d }
        r3 = r11.contains(r3);	 Catch:{ Throwable -> 0x024d }
        if (r3 != 0) goto L_0x00bc;
    L_0x00b5:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Throwable -> 0x024d }
        r11.add(r2);	 Catch:{ Throwable -> 0x024d }
    L_0x00bc:
        r0 = r0 + 1;
        if (r9 == 0) goto L_0x00a7;
    L_0x00c0:
        r0 = 4;
        r1 = new int[r0];
        r1 = {0, 1, 4, 5};
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x024f }
        r3 = 11;
        if (r0 < r3) goto L_0x00d9;
    L_0x00d1:
        r0 = 7;
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x024f }
        r2.add(r0);	 Catch:{ Throwable -> 0x024f }
    L_0x00d9:
        r3 = r1.length;
        r0 = 0;
    L_0x00db:
        if (r0 >= r3) goto L_0x00ea;
    L_0x00dd:
        r4 = r1[r0];
        r4 = java.lang.Integer.valueOf(r4);
        r2.add(r4);
        r0 = r0 + 1;
        if (r9 == 0) goto L_0x00db;
    L_0x00ea:
        r12 = r2.iterator();
    L_0x00ee:
        r0 = r12.hasNext();
        if (r0 == 0) goto L_0x01fc;
    L_0x00f4:
        r0 = r12.next();
        r6 = r0;
        r6 = (java.lang.Integer) r6;
        r13 = r11.iterator();
    L_0x00ff:
        r0 = r13.hasNext();
        if (r0 == 0) goto L_0x01f2;
    L_0x0105:
        r0 = r13.next();
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        r8 = 0;
        r1 = 0;
        r0 = 16;
        r3 = 2;
        r7 = android.media.AudioRecord.getMinBufferSize(r2, r0, r3);	 Catch:{ IllegalArgumentException -> 0x036e, all -> 0x035d }
        r0 = -2;
        if (r7 == r0) goto L_0x0380;
    L_0x011b:
        r0 = new android.media.AudioRecord;	 Catch:{ IllegalArgumentException -> 0x0372, all -> 0x0362 }
        r1 = r6.intValue();	 Catch:{ IllegalArgumentException -> 0x0372, all -> 0x0362 }
        r3 = 16;
        r4 = 2;
        r5 = r7 * 2;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0372, all -> 0x0362 }
        r1 = r0.getState();	 Catch:{ IllegalArgumentException -> 0x0372, all -> 0x0362 }
        r3 = 1;
        if (r1 != r3) goto L_0x037d;
    L_0x0130:
        r3 = 1;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0257, all -> 0x02d7 }
        r4 = 16;
        if (r1 < r4) goto L_0x015e;
    L_0x0137:
        r1 = r0.getAudioSessionId();	 Catch:{ Throwable -> 0x0251 }
        I = r1;	 Catch:{ Throwable -> 0x0251 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0251 }
        r1.<init>();	 Catch:{ Throwable -> 0x0251 }
        r4 = bb;	 Catch:{ Throwable -> 0x0251 }
        r5 = 49;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x0251 }
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x0251 }
        r4 = I;	 Catch:{ Throwable -> 0x0251 }
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x0251 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0251 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Throwable -> 0x0251 }
        r1 = I;	 Catch:{ Throwable -> 0x0251 }
        com.whatsapp.Voip.i(r1);	 Catch:{ Throwable -> 0x0251 }
    L_0x015e:
        r0.release();	 Catch:{ Throwable -> 0x02ce }
        if (r9 == 0) goto L_0x0183;
    L_0x0163:
        r1 = r3;
    L_0x0164:
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0377 }
        r3.<init>();	 Catch:{ Throwable -> 0x0377 }
        r4 = bb;	 Catch:{ Throwable -> 0x0377 }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x0377 }
        r3 = r3.append(r4);	 Catch:{ Throwable -> 0x0377 }
        r0 = r0.getState();	 Catch:{ Throwable -> 0x0377 }
        r0 = r3.append(r0);	 Catch:{ Throwable -> 0x0377 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0377 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x0377 }
        r3 = r1;
    L_0x0183:
        if (r9 == 0) goto L_0x019f;
    L_0x0185:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x02d5 }
        r0.<init>();	 Catch:{ Throwable -> 0x02d5 }
        r1 = bb;	 Catch:{ Throwable -> 0x02d5 }
        r4 = 52;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x02d5 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x02d5 }
        r0 = r0.append(r2);	 Catch:{ Throwable -> 0x02d5 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x02d5 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Throwable -> 0x02d5 }
    L_0x019f:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0330 }
        r0.<init>();	 Catch:{ Throwable -> 0x0330 }
        r1 = bb;	 Catch:{ Throwable -> 0x0330 }
        r4 = 61;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x0330 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0330 }
        r1 = r0.append(r2);	 Catch:{ Throwable -> 0x0330 }
        if (r3 == 0) goto L_0x0332;
    L_0x01b4:
        r0 = bb;	 Catch:{ Throwable -> 0x0330 }
        r4 = 53;
        r0 = r0[r4];	 Catch:{ Throwable -> 0x0330 }
    L_0x01ba:
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x033a }
        r1 = bb;	 Catch:{ Throwable -> 0x033a }
        r4 = 66;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x033a }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x033a }
        r1 = r7 * 2;
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x033a }
        r1 = bb;	 Catch:{ Throwable -> 0x033a }
        r4 = 55;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x033a }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x033a }
        r0 = r0.append(r6);	 Catch:{ Throwable -> 0x033a }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x033a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Throwable -> 0x033a }
        if (r3 == 0) goto L_0x02ca;
    L_0x01e5:
        r0 = java.lang.Integer.valueOf(r2);	 Catch:{ Throwable -> 0x033a }
        r10.add(r0);	 Catch:{ Throwable -> 0x033a }
        r0 = r10.size();	 Catch:{ Throwable -> 0x033a }
        if (r0 < r15) goto L_0x02ca;
    L_0x01f2:
        r0 = r10.isEmpty();	 Catch:{ Throwable -> 0x0357 }
        if (r0 != 0) goto L_0x01fa;
    L_0x01f8:
        if (r9 == 0) goto L_0x01fc;
    L_0x01fa:
        if (r9 == 0) goto L_0x00ee;
    L_0x01fc:
        java.util.Collections.sort(r10);
        r0 = r10.size();
        r2 = new int[r0];
        r0 = 0;
        r1 = r0;
    L_0x0207:
        r0 = r2.length;
        if (r1 >= r0) goto L_0x021a;
    L_0x020a:
        r0 = r10.get(r1);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r2[r1] = r0;
        r0 = r1 + 1;
        if (r9 == 0) goto L_0x037a;
    L_0x021a:
        r0 = r10.isEmpty();	 Catch:{ Throwable -> 0x035b }
        if (r0 == 0) goto L_0x0223;
    L_0x0220:
        r0 = -1;
        I = r0;	 Catch:{ Throwable -> 0x035b }
    L_0x0223:
        r0 = r2;
        goto L_0x002b;
    L_0x0226:
        r0 = move-exception;
        throw r0;
    L_0x0228:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        if (r9 == 0) goto L_0x0072;
    L_0x0231:
        r0 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        if (r9 == 0) goto L_0x0072;
    L_0x0236:
        r1 = as;	 Catch:{ Throwable -> 0x0247 }
        r2 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;
        if (r1 < r2) goto L_0x0072;
    L_0x023c:
        r1 = as;	 Catch:{ Throwable -> 0x0249 }
        r2 = 640000; // 0x9c400 float:8.96831E-40 double:3.16202E-318;
        if (r1 > r2) goto L_0x0072;
    L_0x0243:
        r0 = as;
        goto L_0x0072;
    L_0x0247:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0249 }
    L_0x0249:
        r0 = move-exception;
        throw r0;
    L_0x024b:
        r0 = move-exception;
        throw r0;
    L_0x024d:
        r0 = move-exception;
        throw r0;
    L_0x024f:
        r0 = move-exception;
        throw r0;
    L_0x0251:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IllegalArgumentException -> 0x0257, all -> 0x02d7 }
        goto L_0x015e;
    L_0x0257:
        r0 = move-exception;
        r1 = r7;
    L_0x0259:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x036a }
        r4.<init>();	 Catch:{ all -> 0x036a }
        r5 = bb;	 Catch:{ all -> 0x036a }
        r7 = 56;
        r5 = r5[r7];	 Catch:{ all -> 0x036a }
        r4 = r4.append(r5);	 Catch:{ all -> 0x036a }
        r0 = r0.toString();	 Catch:{ all -> 0x036a }
        r0 = r4.append(r0);	 Catch:{ all -> 0x036a }
        r0 = r0.toString();	 Catch:{ all -> 0x036a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x036a }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = bb;
        r5 = 62;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r0.append(r2);
        if (r3 == 0) goto L_0x033e;
    L_0x028c:
        r0 = bb;
        r5 = 50;
        r0 = r0[r5];
    L_0x0292:
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x0346 }
        r4 = bb;	 Catch:{ Throwable -> 0x0346 }
        r5 = 57;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x0346 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0346 }
        r1 = r1 * 2;
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0346 }
        r1 = bb;	 Catch:{ Throwable -> 0x0346 }
        r4 = 51;
        r1 = r1[r4];	 Catch:{ Throwable -> 0x0346 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0346 }
        r0 = r0.append(r6);	 Catch:{ Throwable -> 0x0346 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0346 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Throwable -> 0x0346 }
        if (r3 == 0) goto L_0x02ca;
    L_0x02bd:
        r0 = java.lang.Integer.valueOf(r2);	 Catch:{ Throwable -> 0x0346 }
        r10.add(r0);	 Catch:{ Throwable -> 0x0346 }
        r0 = r10.size();	 Catch:{ Throwable -> 0x0346 }
        if (r0 >= r15) goto L_0x01f2;
    L_0x02ca:
        if (r9 == 0) goto L_0x00ff;
    L_0x02cc:
        goto L_0x01f2;
    L_0x02ce:
        r0 = move-exception;
        r1 = r3;
    L_0x02d0:
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02d1, all -> 0x0366 }
    L_0x02d1:
        r0 = move-exception;
        r3 = r1;
        r1 = r7;
        goto L_0x0259;
    L_0x02d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0257, all -> 0x02d7 }
    L_0x02d7:
        r0 = move-exception;
    L_0x02d8:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x034a }
        r1.<init>();	 Catch:{ Throwable -> 0x034a }
        r4 = bb;	 Catch:{ Throwable -> 0x034a }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x034a }
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x034a }
        r4 = r1.append(r2);	 Catch:{ Throwable -> 0x034a }
        if (r3 == 0) goto L_0x034c;
    L_0x02ed:
        r1 = bb;	 Catch:{ Throwable -> 0x034a }
        r5 = 59;
        r1 = r1[r5];	 Catch:{ Throwable -> 0x034a }
    L_0x02f3:
        r1 = r4.append(r1);	 Catch:{ Throwable -> 0x0353 }
        r4 = bb;	 Catch:{ Throwable -> 0x0353 }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x0353 }
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x0353 }
        r4 = r7 * 2;
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x0353 }
        r4 = bb;	 Catch:{ Throwable -> 0x0353 }
        r5 = 54;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x0353 }
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x0353 }
        r1 = r1.append(r6);	 Catch:{ Throwable -> 0x0353 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0353 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Throwable -> 0x0353 }
        if (r3 == 0) goto L_0x032d;
    L_0x031e:
        r1 = java.lang.Integer.valueOf(r2);	 Catch:{ Throwable -> 0x0355 }
        r10.add(r1);	 Catch:{ Throwable -> 0x0355 }
        r1 = r10.size();	 Catch:{ Throwable -> 0x0355 }
        if (r1 < r15) goto L_0x032d;
    L_0x032b:
        if (r9 == 0) goto L_0x01f2;
    L_0x032d:
        throw r0;	 Catch:{ Throwable -> 0x032e }
    L_0x032e:
        r0 = move-exception;
        throw r0;
    L_0x0330:
        r0 = move-exception;
        throw r0;
    L_0x0332:
        r0 = bb;
        r4 = 68;
        r0 = r0[r4];
        goto L_0x01ba;
    L_0x033a:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x033c }
    L_0x033c:
        r0 = move-exception;
        throw r0;
    L_0x033e:
        r0 = bb;
        r5 = 69;
        r0 = r0[r5];
        goto L_0x0292;
    L_0x0346:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0348 }
    L_0x0348:
        r0 = move-exception;
        throw r0;
    L_0x034a:
        r0 = move-exception;
        throw r0;
    L_0x034c:
        r1 = bb;
        r5 = 63;
        r1 = r1[r5];
        goto L_0x02f3;
    L_0x0353:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0355 }
    L_0x0355:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x032e }
    L_0x0357:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0359 }
    L_0x0359:
        r0 = move-exception;
        throw r0;
    L_0x035b:
        r0 = move-exception;
        throw r0;
    L_0x035d:
        r0 = move-exception;
        r7 = r1;
        r3 = r8;
        goto L_0x02d8;
    L_0x0362:
        r0 = move-exception;
        r3 = r8;
        goto L_0x02d8;
    L_0x0366:
        r0 = move-exception;
        r3 = r1;
        goto L_0x02d8;
    L_0x036a:
        r0 = move-exception;
        r7 = r1;
        goto L_0x02d8;
    L_0x036e:
        r0 = move-exception;
        r3 = r8;
        goto L_0x0259;
    L_0x0372:
        r0 = move-exception;
        r1 = r7;
        r3 = r8;
        goto L_0x0259;
    L_0x0377:
        r0 = move-exception;
        goto L_0x02d0;
    L_0x037a:
        r1 = r0;
        goto L_0x0207;
    L_0x037d:
        r1 = r8;
        goto L_0x0164;
    L_0x0380:
        r3 = r8;
        goto L_0x0185;
    L_0x0383:
        r0 = r1;
        goto L_0x0072;
    L_0x0386:
        r0 = r1;
        goto L_0x0236;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(int[], int):int[]");
    }

    static BluetoothHeadset k(VoiceService voiceService) {
        return voiceService.az;
    }

    public static int b() {
        int code;
        boolean z = DialogToastActivity.f;
        int az = App.az();
        if (az == 0) {
            code = b.NONE.getCode();
            if (!z) {
                return code;
            }
        }
        if (az == 1) {
            code = b.WIFI.getCode();
            if (!z) {
                return code;
            }
        }
        return b.CELLULAR.getCode();
    }

    static Object c(VoiceService voiceService, Object obj) {
        voiceService.h = obj;
        return obj;
    }

    static boolean o(VoiceService voiceService) {
        return voiceService.s;
    }

    static Integer f(VoiceService voiceService) {
        return voiceService.n;
    }

    static Double a(VoiceService voiceService, Double d) {
        voiceService.H = d;
        return d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(boolean r7) {
        /*
        r6 = this;
        r1 = 0;
        r0 = bb;	 Catch:{ Throwable -> 0x007e }
        r2 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r0 = r0[r2];	 Catch:{ Throwable -> 0x007e }
        r0 = r6.getSystemService(r0);	 Catch:{ Throwable -> 0x007e }
        r0 = (android.media.AudioManager) r0;	 Catch:{ Throwable -> 0x007e }
        r2 = 0;
        r2 = r0.getStreamMaxVolume(r2);	 Catch:{ Throwable -> 0x007e }
        r3 = 0;
        r3 = r0.getStreamVolume(r3);	 Catch:{ Throwable -> 0x007e }
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x007c }
        r0.<init>();	 Catch:{ Throwable -> 0x007c }
        r4 = bb;	 Catch:{ Throwable -> 0x007c }
        r5 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x007c }
        r4 = r0.append(r4);	 Catch:{ Throwable -> 0x007c }
        if (r7 == 0) goto L_0x0084;
    L_0x0028:
        r0 = bb;	 Catch:{ Throwable -> 0x007c }
        r5 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r0 = r0[r5];	 Catch:{ Throwable -> 0x007c }
    L_0x002e:
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x008b }
        r4 = bb;	 Catch:{ Throwable -> 0x008b }
        r5 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x008b }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x008b }
        r0 = r0.append(r3);	 Catch:{ Throwable -> 0x008b }
        r4 = bb;	 Catch:{ Throwable -> 0x008b }
        r5 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r4 = r4[r5];	 Catch:{ Throwable -> 0x008b }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x008b }
        r0 = r0.append(r2);	 Catch:{ Throwable -> 0x008b }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x008b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Throwable -> 0x008b }
        if (r7 == 0) goto L_0x0093;
    L_0x0057:
        if (r3 != r2) goto L_0x0093;
    L_0x0059:
        r0 = r6.K;	 Catch:{ Throwable -> 0x008d }
        r2 = r6.y;	 Catch:{ Throwable -> 0x008d }
        r2 = r2 + 192;
        if (r0 < r2) goto L_0x006e;
    L_0x0061:
        r0 = bb;	 Catch:{ Throwable -> 0x008f }
        r2 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r0 = r0[r2];	 Catch:{ Throwable -> 0x008f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Throwable -> 0x008f }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ Throwable -> 0x008f }
        if (r0 == 0) goto L_0x007a;
    L_0x006e:
        r0 = r6.K;	 Catch:{ Throwable -> 0x0091 }
        r0 = r0 + 32;
        r0 = (short) r0;	 Catch:{ Throwable -> 0x0091 }
        r6.K = r0;	 Catch:{ Throwable -> 0x0091 }
        r0 = r6.K;	 Catch:{ Throwable -> 0x0091 }
        com.whatsapp.Voip.adjustAudioLevel(r0);	 Catch:{ Throwable -> 0x0091 }
    L_0x007a:
        r0 = r1;
    L_0x007b:
        return r0;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = r1;
        goto L_0x007b;
    L_0x0084:
        r0 = bb;	 Catch:{ Throwable -> 0x007e }
        r5 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r0 = r0[r5];	 Catch:{ Throwable -> 0x007e }
        goto L_0x002e;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x007e }
    L_0x0093:
        if (r7 != 0) goto L_0x00ab;
    L_0x0095:
        r0 = r6.K;	 Catch:{ Throwable -> 0x00a9 }
        r2 = r6.y;	 Catch:{ Throwable -> 0x00a9 }
        if (r0 <= r2) goto L_0x00ab;
    L_0x009b:
        r0 = r6.K;	 Catch:{ Throwable -> 0x007e }
        r0 = r0 + -32;
        r0 = (short) r0;	 Catch:{ Throwable -> 0x007e }
        r6.K = r0;	 Catch:{ Throwable -> 0x007e }
        r0 = r6.K;	 Catch:{ Throwable -> 0x007e }
        com.whatsapp.Voip.adjustAudioLevel(r0);	 Catch:{ Throwable -> 0x007e }
        r0 = 1;
        goto L_0x007b;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x007e }
    L_0x00ab:
        r0 = r1;
        goto L_0x007b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.e(boolean):boolean");
    }

    static void b(VoiceService voiceService, Events$Call events$Call) {
        voiceService.a(events$Call);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.VoipOptions r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = 0;
        r3.o = r4;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r4 != 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r2 == 0) goto L_0x0039;
    L_0x000d:
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.androidAudioModeInCall;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3.aG = r2;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.androidRingFaster;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3.i = r2;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.audioSamplingRate;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r2 == 0) goto L_0x0029;
    L_0x001f:
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.audioSamplingRate;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0065 }
        as = r2;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0029:
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r2.audioLevelAdjust;	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r2 == 0) goto L_0x0039;
    L_0x002f:
        r2 = r4.miscellaneous;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r2.audioLevelAdjust;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0067 }
        r3.y = r2;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0039:
        r2 = r4.client;	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r2 == 0) goto L_0x0006;
    L_0x003d:
        r2 = r4.client;	 Catch:{ IllegalArgumentException -> 0x006b }
        r2 = r2.b;	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r2 == 0) goto L_0x006f;
    L_0x0043:
        r2 = r4.client;	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = r2.b;	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = r2.booleanValue();	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r2 == 0) goto L_0x006f;
    L_0x004d:
        r2 = r0;
    L_0x004e:
        r3.ac = r2;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r2 = r4.client;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r2 = r2.a;	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r2 == 0) goto L_0x0075;
    L_0x0056:
        r2 = r4.client;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r2.a;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r2.booleanValue();	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r2 == 0) goto L_0x0075;
    L_0x0060:
        r3.A = r0;
        goto L_0x0006;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r2 = r1;
        goto L_0x004e;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = r1;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b(com.whatsapp.protocol.VoipOptions):void");
    }

    public void a(ct ctVar, String str, long j, boolean z) {
        try {
            Log.i(bb[112]);
            App.b(ctVar);
            if (str == null) {
                return;
            }
            if (str.equals(Voip.getCurrentCallId())) {
                boolean z2;
                if (z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.b = z2;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            try {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    private void B() {
        try {
            auv.a();
            if (this.aB == null) {
                try {
                    int a = a();
                    PowerManager powerManager = (PowerManager) getSystemService(bb[2]);
                    try {
                        if (this.aB == null && a != -1 && powerManager != null) {
                            try {
                                this.aB = powerManager.newWakeLock(a, bb[1]);
                                if (this.aB != null) {
                                    this.aB.acquire();
                                    Log.i(bb[0]);
                                }
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e22) {
                        throw e22;
                    }
                } catch (Exception e222) {
                    throw e222;
                } catch (Throwable e3) {
                    Log.a(e3);
                    this.aB = null;
                }
            }
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    static void t(VoiceService voiceService) {
        voiceService.j();
    }

    public IBinder onBind(Intent intent) {
        Log.i(bb[142] + intent);
        return this.U;
    }

    public void a(ct ctVar, String str, long j, String str2, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2, String str3, String str4) {
        Log.i(bb[3]);
        String str5 = ctVar.e;
        String str6 = ctVar.b;
        try {
            App.a(str5, str6, str);
            Voip.nativeHandleCallOfferAccept(str5, str6, str, str2, i, bArr, iArr, bArr2, bArr3, bArr4, i2);
            if (str == null) {
                return;
            }
            if (str.equals(Voip.getCurrentCallId())) {
                this.c = str3;
                this.p = str4;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void c(String str, String str2, String str3) {
        Log.i(bb[8]);
        Voip.nativeHandleCallAcceptReceipt(str, str2, str3);
    }

    public void b(vl vlVar, String str) {
        Intent intent = new Intent(bb[200], null, this, VoiceService.class);
        try {
            intent.putExtra(bb[198], vlVar);
            if (str != null) {
                intent.putExtra(bb[199], str);
            }
            startService(intent);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static void D(VoiceService voiceService) {
        voiceService.C();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(boolean r18) {
        /*
        r17 = this;
        r11 = com.whatsapp.DialogToastActivity.f;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 99;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r18;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r12 = com.whatsapp.Voip.getCallInfo();
        if (r12 != 0) goto L_0x0030;
    L_0x0024:
        r2 = bb;	 Catch:{ Exception -> 0x002e }
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x002e }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x002e }
    L_0x002d:
        return;
    L_0x002e:
        r2 = move-exception;
        throw r2;
    L_0x0030:
        r14 = r12.getCallActiveTime();
        r9 = r12.isCaller();
        r13 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = r17;
        r13.<init>(r0);
        r2 = com.whatsapp.App.as;
        r3 = r12.getPeerId();
        r4 = r2.f(r3);
        r16 = new android.support.v4.app.NotificationCompat$Builder;
        r2 = com.whatsapp.App.z();
        r0 = r16;
        r0.<init>(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x00bf;
    L_0x005a:
        r2 = r17.getResources();
        r3 = 17104901; // 0x1050005 float:2.4428256E-38 double:8.450944E-317;
        r2 = r2.getDimensionPixelSize(r3);
        r3 = r17.getResources();
        r5 = 17104902; // 0x1050006 float:2.442826E-38 double:8.4509445E-317;
        r3 = r3.getDimensionPixelSize(r5);
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x024a }
        r6 = 21;
        if (r5 < r6) goto L_0x024c;
    L_0x0076:
        r6 = -1;
    L_0x0077:
        r8 = 0;
        r5 = java.lang.Math.min(r2, r3);
        if (r5 <= 0) goto L_0x00b6;
    L_0x007e:
        if (r4 == 0) goto L_0x00bf;
    L_0x0080:
        r2 = (float) r6;
        r2 = r4.a(r5, r2);
        if (r2 == 0) goto L_0x008e;
    L_0x0087:
        r13.setLargeIcon(r2);
        r2 = 1;
        if (r11 == 0) goto L_0x00ab;
    L_0x008d:
        r8 = r2;
    L_0x008e:
        r2 = r4.a;	 Catch:{ Exception -> 0x024f }
        if (r2 == 0) goto L_0x028b;
    L_0x0092:
        r2 = bb;	 Catch:{ Exception -> 0x0251 }
        r3 = 96;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0251 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0251 }
        r2 = new com.whatsapp.aar;	 Catch:{ Exception -> 0x0251 }
        r3 = r17;
        r7 = r18;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x0251 }
        r3 = 0;
        r3 = new java.lang.Void[r3];	 Catch:{ Exception -> 0x0251 }
        com.whatsapp.util.bq.a(r2, r3);	 Catch:{ Exception -> 0x0251 }
        r2 = r8;
    L_0x00ab:
        if (r2 != 0) goto L_0x00b4;
    L_0x00ad:
        r2 = r4.a(r5);	 Catch:{ Exception -> 0x0253 }
        r13.setLargeIcon(r2);	 Catch:{ Exception -> 0x0253 }
    L_0x00b4:
        if (r11 == 0) goto L_0x00bf;
    L_0x00b6:
        r2 = bb;	 Catch:{ Exception -> 0x0255 }
        r3 = 100;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0255 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ Exception -> 0x0255 }
    L_0x00bf:
        r0 = r17;
        r0.a(r13, r12);	 Catch:{ Exception -> 0x0257 }
        r0 = r17;
        r2 = r0.o;	 Catch:{ Exception -> 0x0257 }
        if (r2 == 0) goto L_0x025d;
    L_0x00ca:
        r0 = r17;
        r2 = r0.o;	 Catch:{ Exception -> 0x0257 }
        r2 = r2.miscellaneous;	 Catch:{ Exception -> 0x0257 }
        if (r2 == 0) goto L_0x025d;
    L_0x00d2:
        r2 = bb;	 Catch:{ Exception -> 0x0259 }
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0259 }
        r0 = r17;
        r3 = r0.o;	 Catch:{ Exception -> 0x0259 }
        r3 = r3.miscellaneous;	 Catch:{ Exception -> 0x0259 }
        r3 = r3.testKey;	 Catch:{ Exception -> 0x0259 }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x0259 }
        if (r2 == 0) goto L_0x025d;
    L_0x00e6:
        r2 = 1;
    L_0x00e7:
        if (r2 != 0) goto L_0x00ff;
    L_0x00e9:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0260 }
        r3 = 21;
        if (r2 < r3) goto L_0x00ff;
    L_0x00ef:
        if (r18 == 0) goto L_0x00ff;
    L_0x00f1:
        r2 = r12.getCallState();	 Catch:{ Exception -> 0x0264 }
        r3 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ Exception -> 0x0264 }
        if (r2 != r3) goto L_0x00ff;
    L_0x00f9:
        r2 = 0;
        r2 = new long[r2];	 Catch:{ Exception -> 0x0266 }
        r13.setVibrate(r2);	 Catch:{ Exception -> 0x0266 }
    L_0x00ff:
        if (r4 != 0) goto L_0x026a;
    L_0x0101:
        r2 = r12.getPeerId();	 Catch:{ Exception -> 0x0268 }
        r2 = com.whatsapp.l5.h(r2);	 Catch:{ Exception -> 0x0268 }
    L_0x0109:
        r13.setContentTitle(r2);	 Catch:{ Exception -> 0x0276 }
        if (r9 != 0) goto L_0x0114;
    L_0x010e:
        r2 = 0;
        r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x014d;
    L_0x0114:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.VoiceService.class;
        r0 = r17;
        r2.<init>(r0, r3);
        r3 = bb;
        r5 = 98;
        r3 = r3[r5];
        r2.setAction(r3);
        r3 = bb;
        r5 = 97;
        r3 = r3[r5];
        r5 = com.whatsapp.vl.USER_END_CALL;
        r2.putExtra(r3, r5);
        r3 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r17;
        r2 = android.app.PendingIntent.getService(r0, r3, r2, r5);
        r3 = 2130839436; // 0x7f02078c float:1.7283883E38 double:1.052774562E-314;
        r5 = 2131231351; // 0x7f080277 float:1.807878E38 double:1.052968194E-314;
        r0 = r17;
        r5 = r0.getText(r5);
        r13.addAction(r3, r5, r2);
        r10 = 0;
        r9 = 0;
        if (r11 == 0) goto L_0x01ae;
    L_0x014d:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.VoiceService.class;
        r0 = r17;
        r2.<init>(r0, r3);
        r3 = bb;
        r5 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r3 = r3[r5];
        r2.setAction(r3);
        r3 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r17;
        r10 = android.app.PendingIntent.getService(r0, r3, r2, r5);
        r2 = 2130839436; // 0x7f02078c float:1.7283883E38 double:1.052774562E-314;
        r3 = 2131231816; // 0x7f080448 float:1.8079724E38 double:1.0529684236E-314;
        r0 = r17;
        r3 = r0.getText(r3);
        r13.addAction(r2, r3, r10);
        r2 = new android.content.Intent;
        r3 = com.whatsapp.VoipActivity.class;
        r0 = r17;
        r2.<init>(r0, r3);
        r3 = bb;
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r3 = r3[r5];
        r2.setAction(r3);
        r3 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r17;
        r9 = android.app.PendingIntent.getActivity(r0, r3, r2, r5);
        r2 = 2130839427; // 0x7f020783 float:1.7283864E38 double:1.0527745577E-314;
        r3 = 2131230815; // 0x7f08005f float:1.8077693E38 double:1.052967929E-314;
        r0 = r17;
        r3 = r0.getText(r3);
        r13.addAction(r2, r3, r9);
        r2 = bb;
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r2 = r2[r3];
        r13.setGroup(r2);
        r2 = 1;
        r13.setGroupSummary(r2);
    L_0x01ae:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.VoipActivity.class;
        r0 = r17;
        r2.<init>(r0, r3);
        r3 = bb;
        r5 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r3 = r3[r5];
        r5 = r12.getPeerId();
        r2.putExtra(r3, r5);
        r3 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r17;
        r2 = android.app.PendingIntent.getActivity(r0, r3, r2, r5);
        r13.setContentIntent(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 21;
        if (r2 < r3) goto L_0x01f7;
    L_0x01d6:
        r2 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = r17;
        r2.<init>(r0);
        r0 = r17;
        r0.a(r2, r12);
        r3 = com.whatsapp.App.z();
        r5 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;
        r3 = r3.getString(r5);
        r2.setContentTitle(r3);
        r2 = r2.build();
        r13.setPublicVersion(r2);
    L_0x01f7:
        r3 = r13.build();
        r6 = 0;
        r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x022b;
    L_0x0201:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0278 }
        r5 = 16;
        if (r2 < r5) goto L_0x022b;
    L_0x0207:
        r2 = r3.bigContentView;	 Catch:{ Exception -> 0x027a }
        if (r2 == 0) goto L_0x022b;
    L_0x020b:
        r2 = bb;	 Catch:{ Exception -> 0x027c }
        r5 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r2 = r2[r5];	 Catch:{ Exception -> 0x027c }
        r2 = java.lang.Class.forName(r2);	 Catch:{ Exception -> 0x027c }
        r5 = bb;	 Catch:{ Exception -> 0x027c }
        r6 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r5 = r5[r6];	 Catch:{ Exception -> 0x027c }
        r2 = r2.getDeclaredField(r5);	 Catch:{ Exception -> 0x027c }
        r5 = 0;
        r2 = r2.getInt(r5);	 Catch:{ Exception -> 0x027c }
        r5 = r3.bigContentView;	 Catch:{ Exception -> 0x027c }
        r6 = 8;
        r5.setViewVisibility(r2, r6);	 Catch:{ Exception -> 0x027c }
    L_0x022b:
        r2 = 2131755058; // 0x7f100032 float:1.9140985E38 double:1.0532269395E-314;
        r0 = r17;
        r0.startForeground(r2, r3);	 Catch:{ Exception -> 0x0287 }
        if (r4 == 0) goto L_0x002d;
    L_0x0235:
        if (r10 == 0) goto L_0x002d;
    L_0x0237:
        if (r9 == 0) goto L_0x002d;
    L_0x0239:
        r5 = new com.whatsapp.a2n;	 Catch:{ Exception -> 0x0248 }
        r6 = r17;
        r7 = r16;
        r8 = r4;
        r5.<init>(r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x0248 }
        com.whatsapp.util.bq.a(r5);	 Catch:{ Exception -> 0x0248 }
        goto L_0x002d;
    L_0x0248:
        r2 = move-exception;
        throw r2;
    L_0x024a:
        r2 = move-exception;
        throw r2;
    L_0x024c:
        r6 = 0;
        goto L_0x0077;
    L_0x024f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0251 }
    L_0x0251:
        r2 = move-exception;
        throw r2;
    L_0x0253:
        r2 = move-exception;
        throw r2;
    L_0x0255:
        r2 = move-exception;
        throw r2;
    L_0x0257:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0259 }
    L_0x0259:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x025b }
    L_0x025b:
        r2 = move-exception;
        throw r2;
    L_0x025d:
        r2 = 0;
        goto L_0x00e7;
    L_0x0260:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0262 }
    L_0x0262:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0264 }
    L_0x0264:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0266 }
    L_0x0266:
        r2 = move-exception;
        throw r2;
    L_0x0268:
        r2 = move-exception;
        throw r2;
    L_0x026a:
        r0 = r17;
        r2 = r4.a(r0);
        r2 = com.whatsapp.a28.b(r2);
        goto L_0x0109;
    L_0x0276:
        r2 = move-exception;
        throw r2;
    L_0x0278:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x027a }
    L_0x027a:
        r2 = move-exception;
        throw r2;
    L_0x027c:
        r2 = move-exception;
        r5 = bb;
        r6 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r2);
        goto L_0x022b;
    L_0x0287:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0289 }
    L_0x0289:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0248 }
    L_0x028b:
        r2 = r8;
        goto L_0x00ab;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.d(boolean):void");
    }

    static boolean i(VoiceService voiceService, boolean z) {
        voiceService.W = z;
        return z;
    }

    static Events$Call N(VoiceService voiceService) {
        return voiceService.Z;
    }

    static Ringtone b(VoiceService voiceService) {
        return voiceService.Y;
    }

    public void a(String str, String str2) {
        Log.i(bb[178]);
    }

    public void i(String str, String str2) {
        Log.i(bb[10]);
    }

    static boolean R(VoiceService voiceService) {
        return voiceService.ab;
    }

    static {
        String[] strArr = new String[273];
        String str = " \u0019h8#%\u0013s>e5\u0013.)o'\u0003h:i\u0006\u0004n0e;\u001fu1[7\u001dd\u0004c5\u001d!)o'\u0003h:i2";
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
                        i4 = 86;
                        break;
                    case at.g /*1*/:
                        i4 = 118;
                        break;
                    case at.i /*2*/:
                        i4 = 1;
                        break;
                    case at.o /*3*/:
                        i4 = 72;
                        break;
                    default:
                        i4 = 12;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "&\u0019v-~";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+o3\u0006u";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "3\u0018b";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[s-f3\u0015uh~3\u0017r'blV";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = " \u0019h8,5\u0017m$,$\u0013k-o\"\u0013ehh#\u0013!<cv\u00133-,2\u0013b:u&\u0002h'bv\u0010`!`#\u0004ds,$\u0013l'x3$d/e%\u0002s)x?\u0019o\u0001hk";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = " \u0019h8,5\u0017m$,$\u0013k-o\"\u0013ehh#\u0013!<cv\u00133-,2\u0013b:u&\u0002h'bv\u0010`!`#\u0004ds,?\u0018w)`?\u0012!:i;\u0019u-,$\u0013f!\u007f\"\u0004`<e9\u0018!!hmVs-a9\u0002d\u001ai1\u001fr<~7\u0002h'b\u001f\u0012<";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+o3\u0006ue~3\u0015d!|\"";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u001fo<i$\u0004t8x?\u0019ohi8\u0012<";
                    i = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0002s)b%\u0006n:x{\u0017b#";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "&\u0019v-~";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    str = "\u0001\u001e`<\u007f\u0017\u0006qhZ9\u001fb-_3\u0004w!o3";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    strArr2 = strArr3;
                    str = " \u0019h8#%\u0013s>e5\u0013.)o'\u0003h:i\u0006\u0017s<e7\u001aV)g3:n+gv\u0017b9y?\u0004d,";
                    i = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = " \u0019h8#5\u0017m$#7\u0015b-|\"";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = " \u0019h8#%\u0013s>e5\u0013.)o5\u0013q<#0\u0017h$i2)o'S$\u0013b'~2)`=h?\u0019^8i$\u001bh;\u007f?\u0019o";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = " \u0019h8##\u0006e)x3>h;x9\u0004h+m:3b cv\u0001s'b1Vo-{v3b clV";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "3\u0015i',%\u001en=`2Vc-,?\u0018!<d3Vs)b1\u0013!'jvF!<cvG1x";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "&\u0004d.S>\u001fr<S3\u0015i'";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "zVo-{\u0013\u0015i'6v";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "zVt8h7\u0002d,6v";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = " \u0019h8##\u0006e)x3>h;x9\u0004h+m:3b cv\u001eh;x\u0013\u0015i'6v";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "5\u0019lf{>\u0017u;m&\u0006^8~3\u0010d:i8\u0015d;";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = " \u0019h8#%\u0013o,\\3\u0018e!b15`$`\u0019\u0010g-~v\u001ch,1";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "v\u0015`$`\u001f\u0012<";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "5\u0017m$!?\u0012";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "v\u0015`$`\u0002\u0013s%e8\u0017u-hk";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "%\u0004u8";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "5\u0017m$!?\u0012";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "&Dq";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "<\u001fe";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "<\u001fe";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "3\u0018e8c?\u0018u;";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "zVu e%V<h";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "3Dd";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "3\u0018e8c?\u0018u\u0018~?\u0019s!x?\u0013r";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "v\u0006d&h?\u0018f\u000bm:\u001aN.j3\u0004<";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = " \u0019h8#5\u0017m$#3\u0018e";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "v\u001br";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = " \u0019h8#5\u0017m$#3\u0018eho7\u001amhj7\u001fm-hv\u0001h<dv\u0002d0xv";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = " \u0019h8#5\u0017m$#3\u0018ehi:\u0017q;i2V";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "zVe',8\u0019uh\u007f>\u0019vhy%\u0013sh~7\u0002h&kv\u0005b:i3\u0018!)j\"\u0013sho7\u001amhi8\u0012rf";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = " \u0019h8#1\u0013u\u0018i3\u0004E!\u007f&\u001a`1B7\u001bdg|3\u0013s\u0017f?\u0012^!\u007f\t\u0018t$`v\u0015`$`v\u001bt;xv\u001e`>iv\u0014d-bv\u0010h&e%\u001ed,";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "7\u0003e!c";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = " \u0019h8#7\u0003e!c\t\u0004n=x3Yt8h7\u0002d\ty2\u001fn\u001ac#\u0002dr,";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "7\u0003e!c";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "7\u0018e:c?\u0012/%i2\u001f`f|$\u0019q-~\"\u000f/\u0007Y\u0002&T\u001cS\u00057L\u0018@\u0013)S\tX\u0013";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u007fV;h";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iy\u0005`%|:\u001fo/,$\u0017u-,";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iyVs-o9\u0004e-~v\u0005d;\u007f?\u0019ohe2V";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "v\u0001n:g%";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "zV`=h?\u0019!;c#\u0004b-,";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iyVb)bv\u0018n<,0\u001fo,,;\u001fohn#\u0010g-~v\u0005h2iv\u0010n:,$\u0017u-,";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "v\u0001n:g%";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "zV`=h?\u0019!;c#\u0004b-,";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "zV`=h?\u0019!;c#\u0004b-,";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iyV";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "zVc=j0\u0013sh\u007f?\fdh";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "7\u0018e:c?\u0012/8i$\u001bh;\u007f?\u0019of^\u00135N\u001aH\t7T\fE\u0019";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "v\u0001n:g%";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iyVS-o9\u0004e-~v\u0005u)x3V";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iy\u0005`%|:\u001fo/,$\u0017u-,";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = " \u0019h8#0\u001fo,M \u0017h$m4\u001ad\ty2\u001fn\u001bm;\u0006m!b1$`<iy\u0005`%|:\u001fo/,$\u0017u-,";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "v\u0012n-\u007f8Quh{9\u0004j";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "7\u0003e!c";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "%\u0017l8`?\u0018fh~7\u0002dh\u007f3\u0004w-~v\u0005d<x?\u0018f`";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "zVc=j0\u0013sh\u007f?\fdh";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "zVc=j0\u0013sh\u007f?\fdh";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "v\u0012n-\u007f8Quh{9\u0004j";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "v\u0012n-\u007f8Quh{9\u0004j";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\u0000\u0019h+i\u0005\u0013s>e5\u0013!-b2Vb)`:";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "&\u0019v-~";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    str = " \u0019h8#$\u001fo/x9\u0018dg,";
                    i = 71;
                    i2 = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    strArr2 = strArr3;
                    str = " \u0019h8#$\u001fo/x9\u0018dgz?\u0014s)x3YR\u0000C\u0004\"";
                    i = 72;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = " \u0019h8#$\u001fo/x9\u0018dgz?\u0014s)x3YM\u0007B\u0011";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = " \u0019h8#$\u001fo/x9\u0018dg~?\u0018f-~\t\u001bn,iy\u0018n:a7\u001a";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = " \u0019h8#$\u001fo/x9\u0018dg|:\u0017x";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "7\u0003e!c";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = " \u0019h8#$\u001fo/x9\u0018dgz?\u0014s)x3YE\rJ\u0017#M\u001c";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = " \u0019h8#$\u001fo/x9\u0018dgz?\u0014s)x3YT\u0006G\u00189V\u0006";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = " \u0019h8#$\u001fo/x9\u0018dg~?\u0018f-~\t\u001bn,iy\u0000h*~7\u0002d";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = " \u0019h8#$\u001fo/x9\u0018dgb9[s!b1\u0002n&iv\u0010n=b2Vg'~v";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = " \u0019h8#$\u001fo/x9\u0018dg|:\u0017xgi$\u0004n:#&\u0013d:S<\u001fe\u0017e%)o=`:Vb)`:Vl=\u007f\"Vi)z3Vc-i8Vg!b?\u0005i-h";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = " \u0019h8#$\u001fo/x9\u0018dg~?\u0018f-~\t\u001bn,iy\u0005h$i8\u0002";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "#\u0018j&c!\u0018!>e4\u0004`<iv\u0006s-j3\u0004d&o3V";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = " \u001fc:m\"\u0019s";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "4\u0017eh|7\u0012e!b1Vw)`#\u0013";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "?\u0018w)`?\u0012!+e&\u001ed:x3\u000euhz3\u0004r!c8M!+e&\u001ed:x3\u000eu\u001ei$\u0005h'bk";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "&\u001a`!b\"\u0013y<,2\u0019d;,8\u0019uh~3\u0006s-\u007f3\u0018uhmv\u0000`$e2Vq:c\"\u0019b'`v\u0014t.j3\u0004";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "!\u0004n&kv\u0006m)e8\u0002d0xv\u001ad&k\"\u001e";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "&\u0017e,e8\u0011!!\u007fv\u0011s-m\"\u0013shx>\u0017ohc$Vd9y7\u001a!<cv\u0013o<e$\u0013!8m2\u0012d,,&\u001a`!b\"\u0013y<";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = " \u001fc:m\"\u0019s";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = " \u0019h8#$\u001fo/x9\u0018dg\u007f\"\u0019q";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "\u0001\u001e`<\u007f\u0017\u0006qhZ9?QhG3\u000fr";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "%\u0006m!xv\u0014x<iv\u0015n=b\"\u0005!,cv\u0018n<,;\u0017u+d";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "5\u0017m$G3\u000f!;d9\u0003m,,4\u0013!{>v\u0014x<i%";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = " \u0019h8#%\u0013s>e5\u0013.&c\"\u001fg!o7\u0002h'by\u0018d-h{\u0002i=a4";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "3\u0018e\u0017o7\u001am\u0017~3\u0017r'b";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = ">\u0017o/y&)b)`:";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = " \u0019h8#%\u0002`:x\u0010\u0019s-k$\u0019t&h\u0005\u0013s>e5\u0013! i7\u0012r\u001d|vK!";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = " \u0019h8#%\u0013s>e5\u0013.&c\"\u001fg!o7\u0002h'by\u0002i=a4[r!v3[h;!f";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_buttonStyleSmall;
                    str = "5\u0019lf{>\u0017u;m&\u0006/!b\"\u0013o<\"7\u0015u!c8X@\u000bO\u0013&U\u0017O\u0017:M";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkboxStyle;
                    str = "\"\u001fl-";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkedTextViewStyle;
                    str = "2\u0019!&c\"Vb:i7\u0002dhb9\u0002h.e5\u0017u!c8Z!?iv\u0017s-,8\u0019uhe8V`hm5\u0002h>iv\u0015`$`";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_editTextStyle;
                    str = "2\u001fr)n:\u0013I-m2\u0005T8";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_radioButtonStyle;
                    str = "5\u0019lfm8\u0012s'e2Xh&x3\u0004o)`x$%!h";
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_ratingBarStyle;
                    str = "$\u0013k-o\")b)`:";
                    i = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_seekBarStyle;
                    str = "5\u0017m$S8\u0019u!j?\u0015`<e9\u0018^/~9\u0003q";
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_spinnerStyle;
                    str = "<\u001fe";
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_switchStyle;
                    str = " \u0019h8#%\u0013s>e5\u0013.&c\"\u001fg!o7\u0002h'by\u0002h%i{\u0003hek9\u0018d";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "7\u0003e!c";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = " \u0019h8#7\u0003e!c\t\u0004n=x3Yu'c1\u001ad\u001b|3\u0017j-~\u0006\u001en&iv\u0015i)b1\u001fo/,%\u0006d)g3\u0004!;x7\u0002dhx9V";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u001bt<i";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = ";\u0005";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "$\u0013m)u\t\u0014h&h\t\u0010`!`3\u0012";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0002d:a?\u0018`<iv\u0010s'av";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "5\u0017m$,9\u0018m1,5\u0019o&i5\u0002d,,9\u0018!+m:\u001ad- v\u0015`$`3\u0004! y8\u0011!=|v\u0002i-,5\u0017m$,4\u0013g'~3Vu iv\u0015`$`v\u0015n&b3\u0015uf";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "zVq-i$Qrho7\u001amhh#\u0004`<e9\u0018!";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "zVb)`:Vh,,";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u001bt<i{\u0017b#";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = " \u0019h8#3\u0017sej7\u0004";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = " \u0019h8#%\u0013s>e5\u0013.+~3\u0017u-h";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = " \u0019h8#%\u0013s>e5\u0013.+~3\u0017u-,";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "7\u0018e:c?\u0012/!b\"\u0013o<\"7\u0015u!c8XT\u001bI\u0004)Q\u001aI\u00053O\u001c";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x7\u0004u";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "v4t!`2L!";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "7\u0018e:c?\u0012/!b\"\u0013o<\"7\u0015u!c8XI\rM\u0012%D\u001cS\u0006:T\u000f";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "v\u001br";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "dX0z\"cC1";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "v2d>e5\u0013;h";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "v7q86v";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "7\u0018e:c?\u0012/%i2\u001f`f_\u00159^\tY\u0012?N\u0017_\u00027U\rS\u0015>@\u0006K\u00132";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "7\u0018e:c?\u0012/!b\"\u0013o<\"7\u0015u!c8XR\u000b^\u00133O\u0017C\u00100";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "7\u0003e!c";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "&\u001en&i";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = " \u0019h8#2\u0013w!o3)h&j9VL\tB\u00030@\u000bX\u0003$D\u001a6v";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "7\u0018e:c?\u0012/*`#\u0013u'c\"\u001e/ i7\u0012r-xx\u0006s'j?\u001adfm5\u0002h'bx5N\u0006B\u00135U\u0001C\u0018)R\u001cM\u00023^\u000bD\u00178F\rH";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "v9Rr,";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "7\u0018e:c?\u0012/%i2\u001f`fi.\u0002s)\"\u00055N\u0017M\u00032H\u0007S\u0005\"@\u001cI";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "$\u0013r=`\"Vn.,7\u0003e!cv\u0010n+y%Vg'~v\u0000n!o3Vb)`:L!";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "v;N\fI\u001aL!";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x7\u0004uhi:\u0017q;i2V";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    i2 = 142;
                    str = " \u0019h8#%\u0013s>e5\u0013.*e8\u0012!!b\"\u0013o<1";
                    i = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i2] = str;
                    i2 = 143;
                    str = " \u0019h8#%\u0013s>e5\u0013.:i:\u0013`;i\u0006\u0017s<e7\u001aV)g3:n+g";
                    i = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i2] = str;
                    i2 = 144;
                    str = "zVb)`:Vh,,";
                    i = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i2] = str;
                    i2 = 145;
                    str = "4\u0003r1";
                    i = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i2] = str;
                    i2 = 146;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Vg:c;V";
                    i = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i2] = str;
                    i2 = 147;
                    str = "5\u001ed+g\u0002\u0013s%e8\u0017u-h\u0015\u0017m$\u007f";
                    i = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i2] = str;
                    i2 = 148;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yq=\u007f>\"n\u000bm:\u001aN.j3\u0004E-`7\u000f!";
                    i = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i2] = str;
                    i2 = 149;
                    str = ";\u0005";
                    i = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i2] = str;
                    i2 = 150;
                    str = "\"\u0019r";
                    i = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i2] = str;
                    i2 = 151;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Ye=|:\u001fb)x3\u0012!=\u007f3)b)o>\u0013e\u0017id\u0013^-t\"\u0013o,i2)j-u%";
                    i = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i2] = str;
                    i2 = 152;
                    str = "3\u0018b";
                    i = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i2] = str;
                    i2 = 153;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yg)e:\u0013e\u0017x9)e-o$\u000fq<S3Dd\u0017g3\u000f";
                    i = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i2] = str;
                    i2 = 154;
                    str = "&\u001en&i";
                    i = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i2] = str;
                    i2 = 155;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yh/b9\u0004d,!8\u0019oez9\u001fqee8[q:c1\u0004d;\u007f";
                    i = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i2] = str;
                    i2 = 156;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yh/b9\u0004d,!\"\u0019nec:\u0012.";
                    i = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i2] = str;
                    i2 = 157;
                    str = " \u0019h8S5\u0017m$S9\u0010g-~";
                    i = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i2] = str;
                    i2 = 158;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yh/b9\u0004dem:\u0004d)h/[u-~;\u001fo)x3\u0012.h";
                    i = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i2] = str;
                    i2 = 159;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yt8`9\u0017e\u000ee3\u001ae\u001bx7\u0002H%a3\u0012h)x3\u001ax\tj\"\u0013s\u000bm:\u001a";
                    i = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i2] = str;
                    i2 = 160;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Yh/b9\u0004d,!\"\u0019reb9\u0002,)o5\u0013q<i2";
                    i = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i2] = str;
                    i2 = 161;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0002d:a?\u0018`<i{\u0017b#";
                    i = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i2] = str;
                    i2 = 162;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$Vf-x\u0005\u0002`$i\u0019\u0010g-~\u0002\u001es-\u007f>\u0019m,6v";
                    i = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i2] = str;
                    i2 = 163;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0004d$m/[m)x3\u0018b1!7\u0015j";
                    i = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i2] = str;
                    i2 = 164;
                    str = "zVc$y3\u0002n'x>VR\u000bCv\u0015n&b3\u0015u-hv";
                    i = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i2] = str;
                    i2 = 165;
                    str = " \u0019h8#7\u0003e!c\t\u0004n=x3Yb m8\u0011d\n`#\u0013u'c\"\u001eR<m\"\u0013!+d7\u0018f!b1Vc$y3\u0002n'x>Vr<m\"\u0013!<cv";
                    i = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i2] = str;
                    i2 = 166;
                    str = "7\u0003e!c";
                    i = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i2] = str;
                    i2 = 167;
                    str = " \u0019h8#7\u0012k=\u007f\"&s't?\u001bh<u\u0005\u0013o;c$L!'b";
                    i = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i2] = str;
                    i2 = 168;
                    str = " \u0019h8#7\u0012k=\u007f\"&s't?\u001bh<u\u0005\u0013o;c$L!'j0";
                    i = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i2] = str;
                    i2 = 169;
                    str = "7\u0003e!c";
                    i = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i2] = str;
                    i2 = 170;
                    str = "zVl)tv\u0000n$y;\u0013!";
                    i = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i2] = str;
                    i2 = 171;
                    str = " \u0019h8#7\u0003e!c\t\u0004n=x3Y`,f#\u0005u\u001ec?\u0006R<m5\u001d@=h?\u0019M-z3\u001a!&c{\u0019qd,7\u0003h,cv\u001ad>i:Vh;,gO3";
                    i = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i2] = str;
                    i2 = 172;
                    str = " \u0019h8#7\u0003e!c\t\u0004n=x3Y`,f#\u0005u\u001ec?\u0006R<m5\u001d@=h?\u0019M-z3\u001a!,e$\u0013b<e9\u0018!";
                    i = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i2] = str;
                    i2 = 173;
                    str = "v#Q";
                    i = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i2] = str;
                    i2 = 174;
                    str = "zVw'`#\u001bdh";
                    i = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i2] = str;
                    i2 = 175;
                    str = "\u00129V\u0006";
                    i = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i2] = str;
                    i2 = 176;
                    str = " \u0019h8#5\u0013m$y:\u0017seo7\u001amee8[q:c1\u0004d;\u007f{\u0015i)b1\u0013er,";
                    i = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i2] = str;
                    i2 = 177;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0002s)b%\u0006n:x";
                    i = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i2] = str;
                    i2 = 178;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[s-f3\u0015uem5\u001d";
                    i = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i2] = str;
                    i2 = 179;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+g{\u0015n:~#\u0006u";
                    i = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i2] = str;
                    i2 = 180;
                    str = "7\u0003e!c";
                    i = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i2] = str;
                    i2 = 181;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+o3\u0006uem5\u001d";
                    i = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i2] = str;
                    i2 = 182;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0004d$m/[d$i5\u0002h'b";
                    i = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i2] = str;
                    i2 = 183;
                    str = "\u0006$N\u0010E\u001b?U\u0011S\u00055S\rI\u0018)N\u000eJ\t!@\u0003I\t:N\u000bG";
                    i = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i2] = str;
                    i2 = 184;
                    str = "#\u0018`*`3Vu',7\u0015b-\u007f%VQ\u001aC\u000e?L\u0001X\u000f)R\u000b^\u00133O\u0017C\u00100^\u001fM\u001d3^\u0004C\u0015=!.e3\u001aehe8VQ'{3\u0004L)b7\u0011d:";
                    i = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i2] = str;
                    i2 = 185;
                    str = "8\u0019!\u0018^\u0019.H\u0005E\u0002/^\u001bO\u00043D\u0006S\u00190G\u0017[\u0017=D\u0017@\u00195Jhj?\u0013m,,?\u0018!\u0018c!\u0013s\u0005m8\u0017f-~";
                    i = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i2] = str;
                    i2 = 186;
                    str = " \u0019h8#5\u0017m$#$\u0013k-o\"";
                    i = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i2] = str;
                    i2 = 187;
                    str = " \u0019h8#%\u0013s>e5\u0013.,i%\u0002s'uv";
                    i = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i2] = str;
                    i2 = 188;
                    str = "5\u0017m$S9\u0010g-~\t\u0017b#S\"\u001fl-c#\u0002";
                    i = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i2] = str;
                    i2 = 189;
                    str = "5\u0017m$S9\u0010g-~\t\u0017b#S\"\u001fl-c#\u0002";
                    i = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i2] = str;
                    i2 = 190;
                    str = " \u0019h8#%\u0013s>e5\u0013.,i%\u0002s'u3\u0012!8i8\u0012h&k\u001f\u0018u-b\"\u0005;h";
                    i = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i2] = str;
                    i2 = 191;
                    str = "5\u0017m$S9\u0010g-~\t\u0017b#S\"\u001fl-c#\u0002";
                    i = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i2] = str;
                    i2 = 192;
                    str = "7\u0003e!c";
                    i = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i2] = str;
                    i2 = 193;
                    str = "5\u0019lf{>\u0017u;m&\u0006^8~3\u0010d:i8\u0015d;";
                    i = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i2] = str;
                    i2 = 194;
                    str = "5\u0017m$S9\u0010g-~\t\u0017b#S\"\u001fl-c#\u0002";
                    i = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i2] = str;
                    i2 = 195;
                    str = "5\u0019lf{>\u0017u;m&\u0006^8~3\u0010d:i8\u0015d;";
                    i = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i2] = str;
                    i2 = 196;
                    str = " \u0019h8#3\u0017seb3\u0017s";
                    i = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i2] = str;
                    i2 = 197;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[q:i{\u0017b+i&\u0002";
                    i = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i2] = str;
                    i2 = 198;
                    str = "3\u0018e\u0017o7\u001am\u0017~3\u0017r'b";
                    i = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i2] = str;
                    i2 = 199;
                    str = "3\u0018e\u0017o7\u001am\u0017\u007f\"\u0004h&k";
                    i = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i2] = str;
                    i2 = 200;
                    str = ">\u0017o/y&)b)`:";
                    i = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i2] = str;
                    i2 = 201;
                    str = "5\u0019lf{>\u0017u;m&\u0006^8~3\u0010d:i8\u0015d;";
                    i = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i2] = str;
                    i2 = 202;
                    str = " \u0019h8S:\u0019v\u0017h7\u0002`\u0017y%\u0017f-";
                    i = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i2] = str;
                    i2 = 203;
                    str = "5\u0019lf{>\u0017u;m&\u0006^8~3\u0010d:i8\u0015d;";
                    i = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i2] = str;
                    i2 = 204;
                    str = "&\u0004d.S>\u001fr<S3\u0015i'";
                    i = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i2] = str;
                    i2 = 205;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[s-o3\u001fq<";
                    i = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i2] = str;
                    i2 = 206;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[q:i{\u0017b+i&\u0002,)o=";
                    i = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i2] = str;
                    i2 = 207;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0004d$m/[m)x3\u0018b1";
                    i = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i2] = str;
                    i2 = 208;
                    str = "7\u0003e!c";
                    i = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i2] = str;
                    i2 = 209;
                    str = "$\u0013b-e \u0013^%i%\u0005`/i";
                    i = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i2] = str;
                    i2 = 210;
                    str = "$\u0013b-e \u0013^%i%\u0005`/i";
                    i = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i2] = str;
                    i2 = 211;
                    str = "5\u0017m$S0\u0004n%";
                    i = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i2] = str;
                    i2 = 212;
                    str = "<\u001fe";
                    i = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i2] = str;
                    i2 = 213;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Vh&x3\u0018uu";
                    i = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i2] = str;
                    i2 = 214;
                    str = "v\u0013m)|%\u0013eh";
                    i = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i2] = str;
                    i2 = 215;
                    str = "&\u001en&i";
                    i = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i2] = str;
                    i2 = 216;
                    str = "$\u0013g:i%\u001e^&c\"\u001fg!o7\u0002h'b";
                    i = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i2] = str;
                    i2 = 217;
                    str = "3\u000eu:m\t\u0004d+i?\u0000d\u0017a3\u0005r)k3";
                    i = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i2] = str;
                    i2 = 218;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Yo=`:[h&x3\u0018u";
                    i = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i2] = str;
                    i2 = 219;
                    str = "v\u001br";
                    i = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i2] = str;
                    i2 = 220;
                    str = "8\u0013v\u000bm:\u001a";
                    i = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i2] = str;
                    i2 = 221;
                    str = "%\u0002`:x\t\u0015`$`";
                    i = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i2] = str;
                    i2 = 222;
                    str = "v\u0010m)k%K";
                    i = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i2] = str;
                    i2 = 223;
                    str = "$\u0013k-o\")b)`:";
                    i = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i2] = str;
                    i2 = 224;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Yo=`:[`+x?\u0019o";
                    i = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i2] = str;
                    i2 = 225;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Yt&g8\u0019v&!7\u0015u!c8";
                    i = 224;
                    strArr2 = strArr3;
                    break;
                case 224:
                    strArr2[i2] = str;
                    i2 = 226;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2VW'e5\u0013R-~ \u001fb-,?\u0005!;x9\u0006q!b1Z!:i%\u0002`:xv\u0002i-,%\u0013s>e5\u0013!?e\"\u001e!<d3Vr)a3Vh&x3\u0018uh`7\u0002d:\"";
                    i = 225;
                    strArr2 = strArr3;
                    break;
                case 225:
                    strArr2[i2] = str;
                    i2 = 227;
                    str = "3\u0018e\u0017o7\u001am\u0017\u007f\"\u0004h&k";
                    i = 226;
                    strArr2 = strArr3;
                    break;
                case 226:
                    strArr2[i2] = str;
                    i2 = 228;
                    str = "&\u001en&i";
                    i = 227;
                    strArr2 = strArr3;
                    break;
                case 227:
                    strArr2[i2] = str;
                    i2 = 229;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x7\u0004u\u0017o7\u001amgj7\u001fm-h\t\u0018n\u0017o3\u001am=`7\u0004^+m:\u001a^!b\t\u0006s'k$\u0013r;";
                    i = 228;
                    strArr2 = strArr3;
                    break;
                case 228:
                    strArr2[i2] = str;
                    i2 = 230;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Yo'x{\u0005u)~\"\u0013e";
                    i = 229;
                    strArr2 = strArr3;
                    break;
                case 229:
                    strArr2[i2] = str;
                    i2 = 231;
                    str = "%\u0002`:x\t\u0015`$`";
                    i = 230;
                    strArr2 = strArr3;
                    break;
                case 230:
                    strArr2[i2] = str;
                    i2 = 232;
                    str = "3\u0018e\u0017o7\u001am\u0017~3\u0017r'b";
                    i = 231;
                    strArr2 = strArr3;
                    break;
                case 231:
                    strArr2[i2] = str;
                    i2 = 233;
                    str = " \u0019h8#8\u0017u!z3)r<m$\u0002^+m:\u001a!-`7\u0006r-hv";
                    i = 232;
                    strArr2 = strArr3;
                    break;
                case 232:
                    strArr2[i2] = str;
                    i2 = 234;
                    str = ">\u0013`,\u007f#\u0006";
                    i = 233;
                    strArr2 = strArr3;
                    break;
                case 233:
                    strArr2[i2] = str;
                    i2 = 235;
                    str = "%\u001b`$`3\u0004^+m:\u001a^*x8";
                    i = 234;
                    strArr2 = strArr3;
                    break;
                case 234:
                    strArr2[i2] = str;
                    i2 = 236;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x7\u0004u\u0017o7\u001amgj7\u001fm-h\t\u0018n\u0017b3\u0002v'~=";
                    i = 235;
                    strArr2 = strArr3;
                    break;
                case 235:
                    strArr2[i2] = str;
                    i2 = 237;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Y";
                    i = 236;
                    strArr2 = strArr3;
                    break;
                case 236:
                    strArr2[i2] = str;
                    i2 = 238;
                    str = "v\u001br";
                    i = 237;
                    strArr2 = strArr3;
                    break;
                case 237:
                    strArr2[i2] = str;
                    i2 = 239;
                    str = "<\u001fe";
                    i = 238;
                    strArr2 = strArr3;
                    break;
                case 238:
                    strArr2[i2] = str;
                    i2 = 240;
                    str = ">\u0017o/y&)b)`:";
                    i = 239;
                    strArr2 = strArr3;
                    break;
                case 239:
                    strArr2[i2] = str;
                    i2 = 241;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x7\u0004u\u0017o7\u001amgj7\u001fm-h\t\u0017h:|:\u0017o-S;\u0019e-S?\u0005^'b";
                    i = 240;
                    strArr2 = strArr3;
                    break;
                case 240:
                    strArr2[i2] = str;
                    i2 = 242;
                    str = " \u0019h8#%\u0013s>e5\u0013.+a2Yo=`:[`+x?\u0019o";
                    i = 241;
                    strArr2 = strArr3;
                    break;
                case 241:
                    strArr2[i2] = str;
                    i2 = 243;
                    str = "3\u000eu:m\t\u0004d+i?\u0000d\u0017a3\u0005r)k3)n*f";
                    i = 242;
                    strArr2 = strArr3;
                    break;
                case 242:
                    strArr2[i2] = str;
                    i2 = 244;
                    str = "v\u0005u)~\"?eu";
                    i = 243;
                    strArr2 = strArr3;
                    break;
                case 243:
                    strArr2[i2] = str;
                    i2 = 245;
                    str = ">\u0017o/y&)b)`:";
                    i = 244;
                    strArr2 = strArr3;
                    break;
                case 244:
                    strArr2[i2] = str;
                    i2 = 246;
                    str = "5\u0017m$";
                    i = 245;
                    strArr2 = strArr3;
                    break;
                case 245:
                    strArr2[i2] = str;
                    i2 = 247;
                    str = " \u0019h8#\"\u0019f/`3;t<i\u0005\u0002`<y%Vb m8\u0011h&kv\u001bt<i2Vr<m\"\u0013!<cv";
                    i = 246;
                    strArr2 = strArr3;
                    break;
                case 246:
                    strArr2[i2] = str;
                    i2 = 248;
                    str = "%\u001en?O7\u001am\u000em?\u001ad,A3\u0005r)k3";
                    i = 247;
                    strArr2 = strArr3;
                    break;
                case 247:
                    strArr2[i2] = str;
                    i2 = 249;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x9\u0006!-`7\u0006r-hv";
                    i = 248;
                    strArr2 = strArr3;
                    break;
                case 248:
                    strArr2[i2] = str;
                    i2 = 250;
                    str = "7\u0003e!c";
                    i = 249;
                    strArr2 = strArr3;
                    break;
                case 249:
                    strArr2[i2] = str;
                    i2 = 251;
                    str = "&\u001en&i";
                    i = 250;
                    strArr2 = strArr3;
                    break;
                case 250:
                    strArr2[i2] = str;
                    i2 = 252;
                    str = " \u0019h8#%\u0013s>e5\u0013.;x9\u0006";
                    i = 251;
                    strArr2 = strArr3;
                    break;
                case 251:
                    strArr2[i2] = str;
                    i2 = 253;
                    str = "v\u001br";
                    i = 252;
                    strArr2 = strArr3;
                    break;
                case 252:
                    strArr2[i2] = str;
                    i2 = 254;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0004d$m/[d$i5\u0002h'b{\u0017b#";
                    i = 253;
                    strArr2 = strArr3;
                    break;
                case 253:
                    strArr2[i2] = str;
                    i2 = 255;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u001fo<i$\u0004t8x?\u0019oem5\u001d";
                    i = 254;
                    strArr2 = strArr3;
                    break;
                case 254:
                    strArr2[i2] = str;
                    i2 = 256;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+gy\u0003q$c7\u0012G!i:\u0012R<m\"?l%i2\u001f`<i:\u000f@.x3\u0004B)`:";
                    i = 255;
                    strArr2 = strArr3;
                    break;
                case 255:
                    strArr2[i2] = str;
                    i2 = 257;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+g";
                    i = 256;
                    strArr2 = strArr3;
                    break;
                case 256:
                    strArr2[i2] = str;
                    i2 = 258;
                    str = "zVs-a7\u001fo!b1V";
                    i = 257;
                    strArr2 = strArr3;
                    break;
                case 257:
                    strArr2[i2] = str;
                    i2 = 259;
                    str = "7\u0003e!c";
                    i = 258;
                    strArr2 = strArr3;
                    break;
                case 258:
                    strArr2[i2] = str;
                    i2 = 260;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[`+gv\u0015i)b1\u0013!<d3Vb)`:\u0013shx?\u001bd'y\"Vu',";
                    i = 259;
                    strArr2 = strArr3;
                    break;
                case 259:
                    strArr2[i2] = str;
                    i2 = 261;
                    str = " \u0019h8#%\u0013s>e5\u0013.:i:\u0013`;i\u0006\u0004n0e;\u001fu1[7\u001dd\u0004c5\u001d";
                    i = 260;
                    strArr2 = strArr3;
                    break;
                case 260:
                    strArr2[i2] = str;
                    i2 = 262;
                    str = " \u0019h8#5\u0017m$_\"\u0017u-O>\u0017o/i2Vg:c;V";
                    i = 261;
                    strArr2 = strArr3;
                    break;
                case 261:
                    strArr2[i2] = str;
                    i2 = 263;
                    str = "5\u0017m$J?\u0013m,_\"\u0017uho7\u0018!&c\"Vc-,8\u0003m$,!\u001ed&,5\u0017m$,%\u0002`<iv\u0015i)b1\u0013ehx9VO\u0007B\u0013X";
                    i = 262;
                    strArr2 = strArr3;
                    break;
                case 262:
                    strArr2[i2] = str;
                    i2 = 264;
                    str = "v\u0002nh";
                    i = 263;
                    strArr2 = strArr3;
                    break;
                case 263:
                    strArr2[i2] = str;
                    i2 = 265;
                    str = "v\u001fohY\u001fVL)e8Vu ~3\u0017ef";
                    i = 264;
                    strArr2 = strArr3;
                    break;
                case 264:
                    strArr2[i2] = str;
                    i2 = 266;
                    str = " \u0019h8# \u0019h8M#\u0012h'@3\u0000d$N7\u0005dh";
                    i = 265;
                    strArr2 = strArr3;
                    break;
                case 265:
                    strArr2[i2] = str;
                    i2 = 267;
                    str = "5\u0017ohb9\u0002!.e8\u0012!%i%\u0005`/iv";
                    i = 266;
                    strArr2 = strArr3;
                    break;
                case 266:
                    strArr2[i2] = str;
                    i2 = 268;
                    str = "5\u0017ohb9\u0002!.e8\u0012!%i%\u0005`/iv";
                    i = 267;
                    strArr2 = strArr3;
                    break;
                case 267:
                    strArr2[i2] = str;
                    i2 = 269;
                    str = "y\u0013l=`7\u0002d,#";
                    i = 268;
                    strArr2 = strArr3;
                    break;
                case 268:
                    strArr2[i2] = str;
                    i2 = 270;
                    str = "y\u0005e+m$\u0012";
                    i = 269;
                    strArr2 = strArr3;
                    break;
                case 269:
                    strArr2[i2] = str;
                    i2 = 271;
                    str = "x\u0015r>";
                    i = 270;
                    strArr2 = strArr3;
                    break;
                case 270:
                    strArr2[i2] = str;
                    i2 = 272;
                    str = " \u0019h8#$\u0013b-e \u0013^%i%\u0005`/iy\u0015`$`{\u0019g.i$[s-f3\u0015ue~3\u0015d!|\"";
                    i = 271;
                    strArr2 = strArr3;
                    break;
                case 271:
                    strArr2[i2] = str;
                    bb = strArr3;
                    try {
                        f = new SecureRandom();
                        I = -1;
                        if (VERSION.SDK_INT >= 8) {
                            ae = new oj();
                        } else {
                            ae = null;
                        }
                        as = 0;
                        u = new AtomicInteger();
                        au = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i2] = str;
                    str = "\u0001\u001e`<\u007f\u0017\u0006qhZ9\u001fb-_3\u0004w!o3VQ:c.\u001fl!x/";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static Double C(VoiceService voiceService) {
        return voiceService.D;
    }

    static Object s(VoiceService voiceService) {
        return voiceService.ag;
    }
}
