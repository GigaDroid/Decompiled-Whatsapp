package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Looper;
import android.support.v7.app.AlertDialog.Builder;
import com.whatsapp.App.Me;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class aqq {
    protected static ue c;
    private static final AtomicReference e;
    private static final String[] z;
    private final as8 a;
    private final AtomicBoolean b;
    protected boolean d;
    private final as8 f;
    private final Activity g;
    private final aws h;

    protected abstract void a();

    protected abstract void a(int i);

    protected abstract void c(boolean z);

    protected void a(boolean z) {
        a(z, false);
    }

    protected void a(boolean z, boolean z2) {
        String str;
        StringBuilder append = new StringBuilder().append(z[3]).append(this.d).append(z[1]).append(z).append(z[5]);
        if (z2) {
            str = z[7];
        } else {
            str = z[2];
        }
        Log.i(append.append(str).toString());
        if (!(z2 || this.g.isFinishing() || (this.d && !z))) {
            this.g.showDialog(100);
        }
        Me n = App.n(this.g);
        n.jabber_id = App.A(App.z());
        if (n.jabber_id == null) {
            Log.e(z[4]);
            App.d(this.g, 1);
            this.g.startActivity(new Intent(this.g, RegisterPhone.class));
            this.g.finish();
            return;
        }
        int a;
        App.ay = n;
        App.u = false;
        Log.i(z[6]);
        App.e(this.g.getApplication());
        App.a3();
        MessageService.b(App.z());
        if (z) {
            a = App.aK.a(App.aK.a(new a_r(this, z, z2), new _q(this)));
        } else {
            a = 0;
        }
        if (a == 0) {
            bq.a(new px(this, z, this.d, z2), new Object[0]);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.h.sendEmptyMessageDelayed(1, 32000);
    }

    protected Dialog b(int i) {
        switch (i) {
            case arj.Theme_buttonStyle /*100*/:
                Log.i(z[16]);
                c = new ue(this.g);
                c.setTitle(this.g.getString(2131231496));
                c.setMessage(this.g.getString(2131231495));
                c.setIndeterminate(false);
                c.setCancelable(false);
                c.setProgressStyle(1);
                return c;
            case arj.Theme_buttonStyleSmall /*101*/:
                Log.i(z[8]);
                return new Builder(this.g).setTitle(2131230798).setMessage(this.g.getString(2131231489)).setPositiveButton(2131231580, new np(this)).create();
            case arj.Theme_checkedTextViewStyle /*103*/:
                Log.i(z[14]);
                return new Builder(this.g).setTitle(2131231476).setMessage(this.g.getString(2131231485)).setPositiveButton(2131232298, new gl(this)).setNegativeButton(2131231549, new avw(this)).setCancelable(false).create();
            case arj.Theme_editTextStyle /*104*/:
                Log.i(z[12]);
                Dialog ueVar = new ue(this.g);
                ueVar.setTitle(this.g.getString(2131231814));
                ueVar.setMessage(this.g.getString(2131231813));
                ueVar.setIndeterminate(true);
                ueVar.setCancelable(false);
                return ueVar;
            case arj.Theme_radioButtonStyle /*105*/:
                Log.i(z[11]);
                return new Builder(this.g).setTitle(2131231478).setMessage(this.g.getString(2131231492) + " " + this.g.getString(2131231486)).setPositiveButton(2131231497, new avd(this)).setNegativeButton(2131231487, new aey(this)).setCancelable(false).create();
            case arj.Theme_ratingBarStyle /*106*/:
                return new Builder(this.g).setTitle(2131231484).setMessage(this.g.getString(2131231491)).setPositiveButton(2131231487, new ava(this)).setNegativeButton(2131231497, new _i(this)).setCancelable(false).create();
            case arj.Theme_seekBarStyle /*107*/:
                int i2;
                Log.i(z[10]);
                StringBuilder append = new StringBuilder().append(this.g.getString(2131231492)).append(" ");
                Activity activity = this.g;
                if (App.V()) {
                    i2 = 2131231493;
                } else {
                    i2 = 2131231494;
                }
                return new Builder(this.g).setTitle(2131230798).setMessage(append.append(activity.getString(i2)).toString()).setPositiveButton(2131231838, new am6(this)).setNegativeButton(2131232028, new axu(this)).setCancelable(false).create();
            case arj.Theme_spinnerStyle /*108*/:
                Log.i(z[13]);
                return new Builder(this.g).setTitle(2131230798).setMessage(this.g.getString(2131231490)).setPositiveButton(2131231580, null).create();
            case 200:
                Log.i(z[9]);
                return a(200, 2131231500);
            case 201:
                Log.i(z[15]);
                return a(201, 2131231501);
            default:
                return null;
        }
    }

    static {
        String[] strArr = new String[17];
        String str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0002[\f\u000f1\u0004\\\u0006\u0015!\u001eN\f\u001f1\u0004\\\u001aH:\u0016K\u0002\u0012(\u0011A\u0005\u0002+\u0011G\u001c\t<W";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 40;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
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
                    str = "\u0011I\u0005\u0014=";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0007Z\f\u00179\u0005M\u0004\u0014?\u0004\\\u0006\u0015=WA\u001a\u0015=\u0010F\b\n=J";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0005M\u000e\u000e+\u0003M\u001b\t9\u001aMF\n=\u0004[\b\u0000=\u0004\\\u0006\u0015=\u0001M\u001b\u000e>\u001eM\rH5\u001e[\u001a\u000e6\u0010\u0005\u0019\u0006*\u0016E\u001aG:\u0018]\u0007\u0004=W\\\u0006G*\u0012O\u0019\u000f7\u0019M";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "W[\u0002\u000e(\u0013A\b\u000b7\u0010\u0015";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0007Z\f\u00179\u0005M\u0004\u0014?\u0004\\\u0006\u0015=X[\f\u0013u\u0014G\u0007\t=\u0014\\\u0000\b6XX\b\u0014+\u001e^\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0003Z\u001c\u0002";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u0004\u0014?\u0004\\\u0006\u0015=\u0012Z\u001b\b*";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\n\u00066\u0019G\u001dJ;\u0018F\u0007\u0002;\u0003";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u001b\u0002+\u0003G\u001b\u0002>\u0005G\u0004\u00059\u0014C\u001c\u0017<\u0002M\u001d\b=\u0005Z\u0006\u0015;\u0016Z\r\t7\u0003N\u0006\u00126\u0013I\u001a\f*\u0012\\\u001b\u001e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u001b\u0002+\u0003G\u001b\u0002<\u0002M\u001d\b=\u0005Z\u0006\u0015";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u000e\u00157\u0002X\u001a\u001e6\u0014";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u0004\u0014?\u0004\\\u0006\u0015=\u0019G\u001d\u0015=\u0004\\\u0006\u0015=\u0013";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u001b\u0002+\u0003G\u001b\u0002";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u0002\u0002!\u0004M\u001b\u00111\u0014M\u001c\t9\u0001I\u0000\u000b9\u0015D\f";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0001M\u001b\u000e>\u000eE\u001a\u0000+\u0003G\u001b\u0002w\u0013A\b\u000b7\u0010\u0007\u001a\u0002,\u0002X";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    e = new AtomicReference(null);
                    c = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "WZ\f\u0014,\u0018Z\f\u0001*\u0018E\u000b\u0006;\u001c]\u0019Z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static AtomicBoolean c(aqq com_whatsapp_aqq) {
        return com_whatsapp_aqq.b;
    }

    public aqq(Activity activity) {
        this.b = new AtomicBoolean(false);
        this.a = new kw(this);
        this.f = new rc(this);
        this.d = false;
        this.g = activity;
        this.h = new aws(Looper.getMainLooper(), new WeakReference(activity), null);
    }

    static AtomicReference c() {
        return e;
    }

    public final boolean b(boolean z) {
        return App.b(z ? this.a : this.f);
    }

    static aws a(aqq com_whatsapp_aqq) {
        return com_whatsapp_aqq.h;
    }

    private Dialog a(int i, int i2) {
        return new Builder(this.g).setMessage(i2).setCancelable(false).setPositiveButton(2131231838, new fm(this, i)).setNegativeButton(2131231487, new cs(this, i)).create();
    }

    static Activity b(aqq com_whatsapp_aqq) {
        return com_whatsapp_aqq.g;
    }

    protected void d(boolean z) {
        this.d = z;
    }

    protected void b() {
        int F = App.aK.F();
        Log.i(z[0] + F);
        if (F > 0) {
            this.g.showDialog(arj.Theme_checkedTextViewStyle);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        a(false, true);
    }
}
