package com.whatsapp.gdrive;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.l;
import de.greenrobot.event.h;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class cy implements bi {
    private static final String[] z;
    private final Object a;
    private boolean b;
    private BroadcastReceiver c;
    private BroadcastReceiver d;
    private final Context e;
    private final NotificationManagerCompat f;
    private final AtomicReference g;
    private int h;
    private boolean i;
    private BroadcastReceiver j;
    private long k;
    private boolean l;
    private String m;
    private BroadcastReceiver n;
    private int o;
    private long p;

    static {
        String[] strArr = new String[44];
        String str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001e\\U\"\u0000\n\u0010D0\u0011\u000f\u0010U?\u0004\u0018\\I=\u0004\fQE";
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
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 61;
                        break;
                    case at.o /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001e\\U\"\u0000\n\u0010S5\u0006\u000fOD|\u0010\u0000PO$\u000b\u001aXD";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012M\"\u0002\u001dIO#\u0000COE\"\u0011\u0001OE|\u0000\u001cOO#J";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "E\b\\I=\u0000\n\u0007\u0000";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0003\u000fTL4\u0001";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "E\u001aRT0\tT\u001d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u000bSD~";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0016\u001b^C4\u0016\u001d";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0000\u0000Y";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0000\u0000\\B=\u00001OE\"\u0011\u0001OE\u000e\n\u0018XR\u000e\u0006\u000bQL$\t\u000fO";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001e\\U\"\u0000\n\u0010W8\u0003\u0007\u0010U?\u0004\u0018\\I=\u0004\fQE";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0000\u0000\\B=\u00001OE\"\u0011\u0001OE\u000e\n\u0018XR\u000e\u0006\u000bQL$\t\u000fO";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0000\u001cOO#J";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0000\u001cOO#J\u001bSE)\u0015\u000b^T4\u0001C[R4\u0014\u001bXN2\u001cA";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0000\u001cOO#J\bOE \u0010\u000bSC(X";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "J\u001dHC2\u0000\u001dN\r3\u0004\rVU!H\b\\I=H\rRU?\u0011S";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "J\u001dUO&H\u0000RT8\u0003\u0007^A%\f\u0001S\u001d";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0000\u001cOO#J\f\\C:\u0010\u001e\u0010U\"\u0000\u001c\u0010I?\f\u001aTA%\u0000\n\u0012T#\u0010\u000b";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u000fHS4\u0001C[O#H\n\\T0H\rRN?\u0000\rII>\u000b";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0000\u0000\\B=\u00001_A2\u000e\u001bM\u007f>\u0013\u000bO\u007f2\u0000\u0002QU=\u0004\u001c";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0000\u0000\\B=\u00001_A2\u000e\u001bM\u007f>\u0013\u000bO\u007f2\u0000\u0002QU=\u0004\u001c";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u000fHS4\u0001CJI7\fCHN0\u0013\u000fTL0\u0007\u0002X";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0000\u0000\\B=\u00001_A2\u000e\u001bM\u007f>\u0013\u000bO\u007f=\n\u0019bB0\u0011\u001aXR(";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u000fHS4\u0001C[O#H\u0002RW|\u0007\u000fIT4\u0017\u0017";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0000\u0000\\B=\u00001_A2\u000e\u001bM\u007f>\u0013\u000bO\u007f=\n\u0019bB0\u0011\u001aXR(";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\f\u0000YE%\u0000\u001cPI?\u0004\u001aX";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0010\u0000XX!\u0000\rIE5E\u0018\\L$\u0000N[O#E\u001eOO6\u0017\u000bNSq\u0007\u000fO\u0000\"\u0011\u0017QE";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012M4\u0001\u0007\\\r#\u0000\u001dIO#\u0000CXR#\n\u001c\u0012";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012D4\u0016\u001aOO(";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u000fHS4\u0001C[O#H\u001dYC0\u0017\n\u0010U?\b\u0001HN%\u0000\n";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0000\u0000\\B=\u00001OE\"\u0011\u0001OE\u000e\n\u0018XR\u000e\t\u0001J\u007f3\u0004\u001aIE#\u001c";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001e\\U\"\u0000\n\u0010F>\u0017C_A%\u0011\u000bOY";
                    obj = 31;
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    strArr2 = strArr3;
                    str = "\u0000\u0000\\B=\u00001OE\"\u0011\u0001OE\u000e\n\u0018XR\u000e\t\u0001J\u007f3\u0004\u001aIE#\u001c";
                    obj = 32;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "E\fDT4\u0016N[A8\t\u000bY\t\u007f";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001eOO6\u0017\u000bNSq";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "E\fDT4\u0016N\u0015";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001e\\U\"\u0000\n\u0010S5\u0006\u000fOD|\b\u0007NS8\u000b\t";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u001cRG#\u0000\u001dN\u0000";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "EF";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "@G";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u000fHS4\u0001C[O#H\u001dYC0\u0017\n\u0010M8\u0016\u001dTN6";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012R4\u0016\u001aRR4H\u001eOE!H\u001dIA#\u0011";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0016\rOU3H\u001dIA#\u0011";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002\nOI'\u0000CSO%\f\bTC0\u0011\u0007RN|\b\u000fSA6\u0000\u001c\u0012B0\u0006\u0005HP|\u0015\u001cXP|\u0016\u001a\\R%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void d(long j, long j2) {
        try {
            if (((Integer) this.g.getAndSet(Integer.valueOf(28))).intValue() != 28) {
                try {
                    int i;
                    Log.i(z[11]);
                    if (this.d == null) {
                        this.d = new GoogleDriveNotificationManager$4(this);
                        this.e.registerReceiver(this.d, new IntentFilter(z[12]));
                    }
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.e, 0, new Intent(z[10]), 0);
                    Action action = null;
                    if (App.az() == 2) {
                        action = new Action(2130839443, this.e.getString(2131231210), broadcast);
                    }
                    String string = this.e.getString(2131231221);
                    String string2 = this.e.getString(2131231216);
                    if (j2 > 0) {
                        try {
                            i = (int) ((100 * j) / j2);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    i = -1;
                    a(string, string2, 3, i, false, true, action);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void b(@fk int i) {
        Log.i(z[3] + fn.a(i));
    }

    public void d() {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(21))).intValue() != 21) {
                        Log.i(z[43]);
                        a(this.e.getString(2131231193), this.e.getString(2131231927), 2, -1, true, false, null);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void b(boolean z) {
    }

    public void k(long j, long j2) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(19))).intValue() != 19) {
                        try {
                            int i;
                            Log.i(z[30]);
                            if (j2 > 0) {
                                i = (int) ((100 * j) / j2);
                            } else {
                                i = -1;
                            }
                            a(this.e.getString(2131231194), this.e.getString(2131232321), 3, i, false, false, null);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void c() {
        String string = this.e.getString(2131231222);
        try {
            if (((Integer) this.g.getAndSet(Integer.valueOf(24))).intValue() != 24) {
                Log.i(z[42]);
            }
            a(string, this.e.getString(2131231217), 2, -1, true, false, null);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static NotificationManagerCompat b(cy cyVar) {
        return cyVar.f;
    }

    public void g() {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(11))).intValue() != 11) {
                        Log.i(z[1]);
                        a(this.e.getString(2131231193), this.e.getString(2131231183), 2, -1, true, false, null);
                        return;
                    }
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            h();
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void i() {
        try {
            Log.i(z[29]);
            if (this.d != null) {
                try {
                    this.e.unregisterReceiver(this.d);
                } catch (IllegalArgumentException e) {
                }
            }
            try {
                if (this.c != null) {
                    try {
                        this.e.unregisterReceiver(this.c);
                    } catch (IllegalArgumentException e2) {
                    }
                }
                try {
                    if (this.j != null) {
                        try {
                            this.e.unregisterReceiver(this.j);
                        } catch (IllegalArgumentException e3) {
                        }
                    }
                    h.b().c(this.a);
                } catch (IllegalStateException e4) {
                    throw e4;
                }
            } catch (IllegalStateException e42) {
                throw e42;
            }
        } catch (IllegalStateException e422) {
            throw e422;
        }
    }

    public void g(long j, long j2) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(18))).intValue() != 18) {
                        try {
                            int i;
                            Log.i(z[24]);
                            if (this.c == null) {
                                this.c = new GoogleDriveNotificationManager$3(this);
                                this.e.registerReceiver(this.c, new IntentFilter(z[25]));
                            }
                            Action action = new Action(2130839443, this.e.getString(2131231210), PendingIntent.getBroadcast(this.e, 0, new Intent(z[23]), 0));
                            if (j2 > 0) {
                                try {
                                    i = (int) ((100 * j) / j2);
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                            i = -1;
                            a(this.e.getString(2131231194), this.e.getString(2131231214), 3, i, false, false, action);
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void l(long j, long j2) {
        try {
            if (((Integer) this.g.getAndSet(Integer.valueOf(30))).intValue() != 30) {
                try {
                    int i;
                    Log.i(z[32]);
                    if (this.j == null) {
                        this.j = new GoogleDriveNotificationManager$5(this);
                        this.e.registerReceiver(this.j, new IntentFilter(z[33]));
                    }
                    Action action = new Action(2130839443, this.e.getString(2131231210), PendingIntent.getBroadcast(this.e, 0, new Intent(z[31]), 0));
                    String string = this.e.getString(2131231221);
                    String string2 = this.e.getString(2131231214);
                    if (j2 > 0) {
                        try {
                            i = (int) ((100 * j) / j2);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    i = -1;
                    a(string, string2, 3, i, false, true, action);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void a(@fk int i) {
        if (i != 10) {
            try {
                if (((Integer) this.g.getAndSet(Integer.valueOf(27))).intValue() != 27) {
                    Log.i(z[28] + fn.a(i));
                    a(this.e.getString(2131231219), this.e.getString(2131232319), 1, -1, false, true, null);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    static Context a(cy cyVar) {
        return cyVar.e;
    }

    public void b() {
        this.g.getAndSet(Integer.valueOf(13));
    }

    public void f() {
        this.f.cancel(8);
    }

    static AtomicReference c(cy cyVar) {
        return cyVar.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r11, long r12, long r14) {
        /*
        r10 = this;
        r6 = 0;
        r2 = 33;
        r5 = 0;
        r3 = 1;
        r0 = r10.g;	 Catch:{ IllegalStateException -> 0x005d }
        r1 = 33;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ IllegalStateException -> 0x005d }
        r0 = r0.getAndSet(r1);	 Catch:{ IllegalStateException -> 0x005d }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalStateException -> 0x005d }
        r0 = r0.intValue();	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == r2) goto L_0x0055;
    L_0x001a:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x005f }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x005f }
        r1 = z;	 Catch:{ IllegalStateException -> 0x005f }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x005f }
        r1 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x005f }
        if (r11 == 0) goto L_0x0061;
    L_0x002a:
        r0 = z;	 Catch:{ IllegalStateException -> 0x005f }
        r2 = 8;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x005f }
    L_0x0030:
        r0 = r1.append(r0);
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r14);
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x0055:
        r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0069;
    L_0x0059:
        r10.h();	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x005c:
        return;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        goto L_0x0030;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = r10.e;
        r1 = 2131231220; // 0x7f0801f4 float:1.8078515E38 double:1.052968129E-314;
        r1 = r0.getString(r1);
        r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0098;
    L_0x0076:
        r0 = r10.e;
        r2 = 2131231212; // 0x7f0801ec float:1.8078499E38 double:1.052968125E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];
        r6 = r10.e;
        r8 = r14 - r12;
        r6 = com.whatsapp.util.l.a(r6, r8);
        r4[r5] = r6;
        r6 = r10.e;
        r6 = com.whatsapp.util.l.a(r6, r12);
        r4[r3] = r6;
        r2 = r0.getString(r2, r4);
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        if (r0 == 0) goto L_0x00ab;
    L_0x0098:
        r0 = r10.e;
        r2 = 2131231211; // 0x7f0801eb float:1.8078497E38 double:1.0529681247E-314;
        r4 = new java.lang.Object[r3];
        r6 = r10.e;
        r6 = com.whatsapp.util.l.a(r6, r14);
        r4[r5] = r6;
        r2 = r0.getString(r2, r4);
    L_0x00ab:
        r4 = -1;
        r7 = 0;
        r0 = r10;
        r6 = r3;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.cy.a(boolean, long, long):void");
    }

    private Builder k() {
        Builder builder = new Builder(App.z());
        try {
            builder.setSmallIcon(2130839686);
            builder.setContentIntent(PendingIntent.getActivity(App.z(), 0, new Intent(App.z(), SettingsGoogleDrive.class), 0));
            builder.setColor(this.e.getResources().getColor(2131624053));
            if (VERSION.SDK_INT >= 21) {
                builder.setVisibility(1);
            }
            return builder;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void j() {
        try {
            if (!this.l) {
                h();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void b(long j, long j2) {
        try {
            if (((Integer) this.g.getAndSet(Integer.valueOf(31))).intValue() != 31) {
                int i;
                Log.i(z[2]);
                this.f.cancel(8);
                String string = this.e.getString(2131231221);
                String string2 = this.e.getString(2131232321);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(string, string2, 3, i, false, true, null);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public cy(@NonNull Context context) {
        this.g = new AtomicReference(Integer.valueOf(10));
        this.a = new a5(this);
        this.e = context;
        this.f = NotificationManagerCompat.from(App.z());
    }

    public void a(boolean z) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(long r10, long r12, long r14) {
        /*
        r9 = this;
        r6 = 26;
        monitor-enter(r9);
        r0 = r9.e;	 Catch:{ all -> 0x002d }
        r1 = 2131231222; // 0x7f0801f6 float:1.8078519E38 double:1.05296813E-314;
        r1 = r0.getString(r1);	 Catch:{ all -> 0x002d }
        r0 = r9.g;	 Catch:{ IllegalStateException -> 0x0029 }
        r0 = r0.get();	 Catch:{ IllegalStateException -> 0x0029 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalStateException -> 0x0029 }
        r0 = r0.intValue();	 Catch:{ IllegalStateException -> 0x0029 }
        if (r0 != r6) goto L_0x0030;
    L_0x001a:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x002b }
        r4 = r9.p;	 Catch:{ IllegalStateException -> 0x002b }
        r2 = r2 - r4;
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0030;
    L_0x0027:
        monitor-exit(r9);
        return;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x0030:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0102 }
        r9.p = r2;	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r9.g;	 Catch:{ IllegalStateException -> 0x0102 }
        r2 = 26;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.getAndSet(r2);	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.intValue();	 Catch:{ IllegalStateException -> 0x0102 }
        if (r0 == r6) goto L_0x0087;
    L_0x004a:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0102 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0102 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0102 }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.append(r10);	 Catch:{ IllegalStateException -> 0x0102 }
        r2 = "/";
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.append(r14);	 Catch:{ IllegalStateException -> 0x0102 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0102 }
        r3 = 36;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.append(r12);	 Catch:{ IllegalStateException -> 0x0102 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0102 }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0102 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0102 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0102 }
    L_0x0087:
        r2 = 0;
        r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0106;
    L_0x008d:
        r2 = 100;
        r2 = r2 * r10;
        r2 = r2 / r14;
        r0 = (int) r2;
    L_0x0092:
        r9.o = r0;	 Catch:{ all -> 0x002d }
        r2 = 0;
        r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c5;
    L_0x009a:
        r0 = r9.e;	 Catch:{ all -> 0x002d }
        r2 = 2131232322; // 0x7f080642 float:1.808075E38 double:1.0529686736E-314;
        r3 = 3;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x002d }
        r4 = 0;
        r5 = r9.e;	 Catch:{ all -> 0x002d }
        r5 = com.whatsapp.util.l.a(r5, r10);	 Catch:{ all -> 0x002d }
        r3[r4] = r5;	 Catch:{ all -> 0x002d }
        r4 = 1;
        r5 = r9.e;	 Catch:{ all -> 0x002d }
        r5 = com.whatsapp.util.l.a(r5, r14);	 Catch:{ all -> 0x002d }
        r3[r4] = r5;	 Catch:{ all -> 0x002d }
        r4 = 2;
        r5 = r9.o;	 Catch:{ all -> 0x002d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x002d }
        r3[r4] = r5;	 Catch:{ all -> 0x002d }
        r2 = r0.getString(r2, r3);	 Catch:{ all -> 0x002d }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x00ec;
    L_0x00c5:
        r0 = r9.e;	 Catch:{ all -> 0x002d }
        r2 = 2131231213; // 0x7f0801ed float:1.80785E38 double:1.0529681257E-314;
        r3 = 3;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x002d }
        r4 = 0;
        r5 = r9.e;	 Catch:{ all -> 0x002d }
        r5 = com.whatsapp.util.l.a(r5, r10);	 Catch:{ all -> 0x002d }
        r3[r4] = r5;	 Catch:{ all -> 0x002d }
        r4 = 1;
        r5 = r9.e;	 Catch:{ all -> 0x002d }
        r5 = com.whatsapp.util.l.a(r5, r14);	 Catch:{ all -> 0x002d }
        r3[r4] = r5;	 Catch:{ all -> 0x002d }
        r4 = 2;
        r5 = r9.o;	 Catch:{ all -> 0x002d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x002d }
        r3[r4] = r5;	 Catch:{ all -> 0x002d }
        r2 = r0.getString(r2, r3);	 Catch:{ all -> 0x002d }
    L_0x00ec:
        r0 = r9.m;	 Catch:{ IllegalStateException -> 0x0100 }
        r0 = r2.equals(r0);	 Catch:{ IllegalStateException -> 0x0100 }
        if (r0 != 0) goto L_0x0027;
    L_0x00f4:
        r3 = 3;
        r4 = r9.o;	 Catch:{ IllegalStateException -> 0x0100 }
        r5 = 1;
        r6 = 0;
        r7 = 0;
        r0 = r9;
        r0.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IllegalStateException -> 0x0100 }
        goto L_0x0027;
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x0106:
        r0 = -1;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.cy.a(long, long, long):void");
    }

    public void f(int i) {
        String string = this.e.getString(2131231222);
        try {
            if (((Integer) this.g.get()).intValue() == 25) {
                if (System.currentTimeMillis() - this.k < 500) {
                    return;
                }
            }
            this.k = System.currentTimeMillis();
            boolean z;
            if (((Integer) this.g.getAndSet(Integer.valueOf(25))).intValue() != 25) {
                z = true;
            } else {
                z = false;
            }
            if (i > 0 || r0) {
                a(string, this.e.getString(2131231218, new Object[]{Integer.valueOf(i)}), 2, i, true, false, null);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void c(long j, long j2) {
    }

    public void i(long j, long j2) {
        try {
            if (this.b) {
                int i;
                if (((Integer) this.g.get()).intValue() != 14) {
                    i = 1;
                } else {
                    i = 0;
                }
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(14))).intValue() == 14) {
                        if (System.currentTimeMillis() - this.p < 500) {
                            return;
                        }
                    }
                    try {
                        this.p = System.currentTimeMillis();
                        int i2 = j2 > 0 ? (int) ((100 * j) / j2) : 0;
                        try {
                            if (i2 - this.h > 0 || r1 != 0) {
                                Log.i(z[38] + j + '/' + j2 + z[39] + i2 + z[40]);
                                this.h = i2;
                                String string = this.e.getString(2131231193);
                                String string2 = this.e.getString(2131231947, new Object[]{l.a(this.e, j), l.a(this.e, j2), Integer.valueOf(i2)});
                                try {
                                    if (!string2.equals(this.m)) {
                                        a(string, string2, 3, i2, true, false, null);
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    public void e() {
    }

    public void j(long j, long j2) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(16))).intValue() != 16) {
                        try {
                            int i;
                            Log.i(z[22]);
                            if (this.n == null) {
                                this.n = new GoogleDriveNotificationManager$2(this);
                                this.e.registerReceiver(this.n, new IntentFilter(z[20]));
                            }
                            PendingIntent broadcast = PendingIntent.getBroadcast(this.e, 0, new Intent(z[21]), 0);
                            Action action = null;
                            if (App.az() == 2) {
                                action = new Action(2130839443, this.e.getString(2131231210), broadcast);
                            }
                            if (j2 > 0) {
                                try {
                                    i = (int) ((100 * j) / j2);
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                            i = -1;
                            a(this.e.getString(2131231194), this.e.getString(2131232316), 3, i, false, false, action);
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(@com.whatsapp.gdrive.fk int r9) {
        /*
        r8 = this;
        r5 = 0;
        r7 = 15;
        r1 = 2;
        r3 = 1;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = 10;
        if (r9 != r0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r8.g;	 Catch:{ IllegalStateException -> 0x00cf }
        r4 = 15;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IllegalStateException -> 0x00cf }
        r0 = r0.getAndSet(r4);	 Catch:{ IllegalStateException -> 0x00cf }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalStateException -> 0x00cf }
        r0 = r0.intValue();	 Catch:{ IllegalStateException -> 0x00cf }
        if (r0 == r7) goto L_0x000b;
    L_0x0020:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r6 = 13;
        r4 = r4[r6];
        r0 = r0.append(r4);
        r4 = com.whatsapp.gdrive.fn.a(r9);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r8.b;
        if (r0 == 0) goto L_0x004d;
    L_0x0042:
        r0 = z;
        r4 = 18;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        if (r2 == 0) goto L_0x00de;
    L_0x004d:
        r4 = com.whatsapp.gdrive.GoogleDriveService.Y();
        switch(r4) {
            case 0: goto L_0x00d1;
            case 1: goto L_0x00d1;
            case 2: goto L_0x00d4;
            case 3: goto L_0x00d6;
            case 4: goto L_0x00d1;
            default: goto L_0x0054;
        };
    L_0x0054:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r6 = 14;
        r2 = r2[r6];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
    L_0x006f:
        r1 = com.whatsapp.gdrive.GoogleDriveService.L();
        r2 = r1 + 1;
        r0 = r2 % r0;
        if (r0 != 0) goto L_0x00dc;
    L_0x0079:
        r0 = r3;
    L_0x007a:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = z;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r4 = com.whatsapp.gdrive.fn.b(r4);
        r2 = r2.append(r4);
        r4 = z;
        r6 = 16;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r1 = r2.append(r1);
        r2 = z;
        r4 = 17;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
    L_0x00b2:
        if (r0 == 0) goto L_0x000b;
    L_0x00b4:
        r0 = r8.e;
        r1 = 2131231185; // 0x7f0801d1 float:1.8078444E38 double:1.052968112E-314;
        r1 = r0.getString(r1);
        r0 = r8.e;
        r2 = 2131231182; // 0x7f0801ce float:1.8078438E38 double:1.0529681104E-314;
        r2 = r0.getString(r2);
        r4 = -1;
        r7 = 0;
        r0 = r8;
        r6 = r3;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        goto L_0x000b;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = 5;
        if (r2 == 0) goto L_0x006f;
    L_0x00d4:
        if (r2 == 0) goto L_0x00d8;
    L_0x00d6:
        if (r2 != 0) goto L_0x0054;
    L_0x00d8:
        r0 = r1;
        goto L_0x006f;
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        r0 = r5;
        goto L_0x007a;
    L_0x00de:
        r0 = r3;
        goto L_0x00b2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.cy.d(int):void");
    }

    static int d(cy cyVar) {
        return cyVar.o;
    }

    public void a() {
        this.f.cancel(8);
    }

    public void e(long j, long j2) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(17))).intValue() != 17) {
                        try {
                            int i;
                            Log.i(z[19]);
                            if (j2 > 0) {
                                i = (int) ((100 * j) / j2);
                            } else {
                                i = -1;
                            }
                            a(this.e.getString(2131231194), this.e.getString(2131231215), 3, i, false, false, null);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void h() {
        this.f.cancel(8);
    }

    public void c(boolean z) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(23))).intValue() != 23) {
                        try {
                            int i;
                            Log.i(z[9]);
                            this.h = 0;
                            Context context = this.e;
                            if (z) {
                                i = 2131231186;
                            } else {
                                i = 2131231185;
                            }
                            a(context.getString(i), this.e.getString(2131231182), 1, -1, false, true, null);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void c(int i) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(22))).intValue() == 22) {
                        if (System.currentTimeMillis() - this.p < 500) {
                            return;
                        }
                    }
                    this.p = System.currentTimeMillis();
                    if (i % 10 == 0) {
                        a(this.e.getString(2131231193), this.e.getString(2131231928, new Object[]{Integer.valueOf(i)}), 2, i, true, false, null);
                    } else {
                        a(this.e.getString(2131231193), this.e.getString(2131231928, new Object[]{Integer.valueOf(i)}), 2, i, true, false, null);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull java.lang.String r8, @android.support.annotation.NonNull java.lang.String r9, @com.whatsapp.gdrive.ah int r10, int r11, boolean r12, boolean r13, @android.support.annotation.Nullable android.support.v4.app.NotificationCompat.Action r14) {
        /*
        r7 = this;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        if (r12 != 0) goto L_0x0011;
    L_0x0006:
        r3 = com.whatsapp.gdrive.SettingsGoogleDrive.k();	 Catch:{ IllegalStateException -> 0x0044 }
        if (r3 == 0) goto L_0x0011;
    L_0x000c:
        r7.h();	 Catch:{ IllegalStateException -> 0x0046 }
        if (r2 == 0) goto L_0x00a6;
    L_0x0011:
        r7.m = r9;	 Catch:{ IllegalStateException -> 0x0048 }
        r3 = r7.i;	 Catch:{ IllegalStateException -> 0x0048 }
        if (r3 == 0) goto L_0x001e;
    L_0x0017:
        r3 = r7.f;	 Catch:{ IllegalStateException -> 0x004a }
        r4 = 8;
        r3.cancel(r4);	 Catch:{ IllegalStateException -> 0x004a }
    L_0x001e:
        r3 = r7.k();
        switch(r10) {
            case 1: goto L_0x004c;
            case 2: goto L_0x005c;
            case 3: goto L_0x0054;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0042 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0042 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0042 }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r1.append(r10);	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0042 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0042 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r3.setProgress(r4, r5, r6);	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r2 == 0) goto L_0x0064;
    L_0x0054:
        r4 = 100;
        r5 = 0;
        r3.setProgress(r4, r11, r5);	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r2 == 0) goto L_0x0064;
    L_0x005c:
        r4 = 100;
        r5 = 1;
        r3.setProgress(r4, r11, r5);	 Catch:{ IllegalStateException -> 0x00ab }
        if (r2 != 0) goto L_0x0025;
    L_0x0064:
        r3.setAutoCancel(r13);	 Catch:{ IllegalStateException -> 0x00ad }
        r3.setOngoing(r12);	 Catch:{ IllegalStateException -> 0x00ad }
        r3.setContentTitle(r8);	 Catch:{ IllegalStateException -> 0x00ad }
        r3.setContentText(r9);	 Catch:{ IllegalStateException -> 0x00ad }
        r7.l = r12;	 Catch:{ IllegalStateException -> 0x00ad }
        if (r14 == 0) goto L_0x00af;
    L_0x0074:
        r7.i = r0;	 Catch:{ IllegalStateException -> 0x00b1 }
        if (r14 == 0) goto L_0x007b;
    L_0x0078:
        r3.addAction(r14);	 Catch:{ IllegalStateException -> 0x00b1 }
    L_0x007b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 2;
        if (r10 != r1) goto L_0x008e;
    L_0x0083:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b3 }
        r4 = 26;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x00b3 }
        r0.append(r1);	 Catch:{ IllegalStateException -> 0x00b3 }
        if (r2 == 0) goto L_0x0097;
    L_0x008e:
        r0 = r0.append(r11);	 Catch:{ IllegalStateException -> 0x00b5 }
        r1 = 37;
        r0.append(r1);	 Catch:{ IllegalStateException -> 0x00b5 }
    L_0x0097:
        r1 = r7.f;
        monitor-enter(r1);
        r0 = r7.f;	 Catch:{ all -> 0x00b7 }
        r2 = 8;
        r3 = r3.build();	 Catch:{ all -> 0x00b7 }
        r0.notify(r2, r3);	 Catch:{ all -> 0x00b7 }
        monitor-exit(r1);	 Catch:{ all -> 0x00b7 }
    L_0x00a6:
        return;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0042 }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = r1;
        goto L_0x0074;
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00b7 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.cy.a(java.lang.String, java.lang.String, int, int, boolean, boolean, android.support.v4.app.NotificationCompat$Action):void");
    }

    public void e(int i) {
        try {
            if (this.b) {
                boolean z;
                if (((Integer) this.g.get()).intValue() != 12) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(12))).intValue() == 12) {
                        if (System.currentTimeMillis() - this.p < 500) {
                            return;
                        }
                    }
                    this.p = System.currentTimeMillis();
                    String string = this.e.getString(2131231193);
                    if (i >= 0 || r2) {
                        a(string, this.e.getString(2131231184, new Object[]{Integer.valueOf(i)}), 2, -1, true, false, null);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void d(boolean z) {
        this.b = z;
    }

    public void f(long j, long j2) {
        try {
            if (this.b) {
                try {
                    if (((Integer) this.g.getAndSet(Integer.valueOf(20))).intValue() != 20) {
                        try {
                            int i;
                            Log.i(z[41]);
                            if (j2 > 0) {
                                i = (int) ((100 * j) / j2);
                            } else {
                                i = -1;
                            }
                            a(this.e.getString(2131231194), this.e.getString(2131232320), 3, i, false, false, null);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void h(long j, long j2) {
        try {
            if (((Integer) this.g.getAndSet(Integer.valueOf(29))).intValue() != 29) {
                int i;
                Log.i(z[0]);
                String string = this.e.getString(2131231221);
                String string2 = this.e.getString(2131231215);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(string, string2, 3, i, false, true, null);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void a(long j, long j2) {
        try {
            if (((Integer) this.g.getAndSet(Integer.valueOf(32))).intValue() != 32) {
                int i;
                Log.i(z[37]);
                String string = this.e.getString(2131231221);
                String string2 = this.e.getString(2131232320);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(string, string2, 3, i, false, true, null);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
