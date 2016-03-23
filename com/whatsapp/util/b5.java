package com.whatsapp.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class b5 implements Future, Runnable {
    private static final String[] c;
    private static final String[] d;
    private static final String[] z;
    private final CountDownLatch a;
    private final AtomicReference b;
    private final Context e;

    public av a(long j, TimeUnit timeUnit) {
        try {
            if (this.a.await(j, timeUnit)) {
                return (av) this.b.get();
            }
            throw new TimeoutException();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public av a() {
        this.a.await();
        return (av) this.b.get();
    }

    private static Set a(Context context, String[] strArr, String str) {
        int i = Log.h;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        Set hashSet = new HashSet();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            CharSequence charSequence = strArr[i2];
            try {
                CharSequence loadLabel;
                try {
                    loadLabel = packageManager.getApplicationInfo(charSequence, 0).loadLabel(packageManager);
                } catch (Exception e) {
                    Log.e(z[2] + e);
                    loadLabel = charSequence;
                }
                Log.w(str + ' ' + charSequence);
                hashSet.add(new d(loadLabel, charSequence));
            } catch (NameNotFoundException e2) {
            } catch (RuntimeException e3) {
                Log.e(str + ' ' + e3.getMessage());
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            }
        }
        try {
            break;
            if (hashSet.isEmpty()) {
                return null;
            }
            return hashSet;
        } catch (Exception e4) {
            throw e4;
        }
    }

    public Object get(long j, TimeUnit timeUnit) {
        return a(j, timeUnit);
    }

    public void run() {
        Set set = null;
        Set a = a(this.e, d, z[0]);
        Set a2 = a(this.e, c, z[1]);
        try {
            AtomicReference atomicReference = this.b;
            a = a != null ? Collections.unmodifiableSet(a) : null;
            if (a2 != null) {
                set = Collections.unmodifiableSet(a2);
            }
            atomicReference.set(new av(a, set));
            this.a.countDown();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean isDone() {
        try {
            return this.a.getCount() == 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "$R6\f>&Yr\u0015>'Kr\n68L:\u0013";
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
                        i4 = 84;
                        break;
                    case at.g /*1*/:
                        i4 = 32;
                        break;
                    case at.i /*2*/:
                        i4 = 95;
                        break;
                    case at.o /*3*/:
                        i4 = 97;
                        break;
                    default:
                        i4 = 95;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "1X<\u0004/ I0\u000f\u007f0U-\b13\u0000+\u0000,?\r4\b38E-A15M:A3;O4\u0014/n\u0000";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    String[] strArr4 = new String[46];
                    i2 = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "6I%O, A<\t66A1\u0000q\u0000A,\n\u0014=L3\u0004-";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "7Nq\u000209\u000e>\u000f;&O6\u0005q;P;\u0000q A,\n25N";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "7O2O>&R0\u000fq A,\n\u00125N>\u0006:&";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    str = "7O2O>&R0\u000fq A,\n\u00125N>\u0006:&f-\u0004:";
                    i = 5;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = "7O2O=&I8\t+zT>\u001247L:\u000011Rq\u0000< I)\b+-";
                    i = 6;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "7O2O<;O3O+5S4\n68L:\u0013";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "7O2O:8N(\u0000-1\u000e\u001e\u0002+=V: /$S\u001e\u0005,";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "7O2O:'T-\u000e13Sq\u000010R0\b;zT>\u001249A1\u000081R";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "7O2O85Uq\u00060zL>\u001417H:\u0013:,\u000e8\u000e(=D8\u0004+zT>\u001249A1\u000081R:\u0019";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "7O2O6>I1\u001275Nq\n=5T+\u0004--D0\u0002+;R";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "7O2O6>I1\u001275Nq\n=5T+\u0004--D0\u0002+;R\u0000\u00041";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "7O2O6;B6\u0015q9O=\b31C>\u0013:";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "7O2O55M:\u0012q\u0007M>\u0013+\u0000A,\n\u00125N>\u0006:&";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "7O2O55M:\u0012q\u0007M>\u0013+\u0000A,\n\u00125N>\u0006:&l6\u0015:";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "7O2O55M:\u0012q\u0007M>\u0013+\u0000A,\n\u00125N>\u0006:&p-\u000e";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "7O2O35T:\u0005-;I;O5!I<\u0004;1F:\u000f;1R";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "7O2O35T:\u0005-;I;O5!I<\u0004;1F:\u000f;1Rq\u0003: A";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "7O2O35T:\u0005-;I;O5!I<\u0004;1F:\u000f;1Rq\u00113!S";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "7O2O35T:\u0005-;I;O*8T6\f> E5\u001467E";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "7O2O35T:\u0005-;I;O*8T6\f> E5\u001467Eq\u00130;T";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "7O2O3;O4\u000e* \u000e%\u0000/$E-";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "7O2O2;B0O+5S4O4=L3\u0004-";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "7O2O11T.\b1zA0\u00154=L3\u0004-";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "7O2O11T.\b1zM0\u000368E8\u0014>&D";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "7O2O-1C7\b30\u000e>\u0005)5N<\u0004; A,\n4=L3\u0004-";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "7O2O-1C7\b30\u000e>\u0005)5N<\u0004; A,\n4=L3\u0004-2R0\u00180";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "7O2O-1C7\b30\u000e>\u0005)5N<\u0004; A,\n4=L3\u0004-$R0";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "7O2O-1C7\b30\u000e<\r:5N:\u0013";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "7O2O-<Y+\t2zH:\u00196'Eq\u0015>'K";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "7O2O,5N;O+5S4\f>:A8\u0004-";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "7O2O, A\u0000\u0003:1R,O>!T0>+5S4";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "7O2O,-M>\u000f+1Cq\f0:I+\u000e-";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "7O2O+5S4O4=L3\u0004-";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "7O2O+:Iq5>'k6\r31R";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "7O2O%0W0\u00134'\u000e>\u000f;&O6\u0005q O0\r=;X";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "7O2O%;M*\u0015q#A+\u000270O8";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "7O2O%;M*\u0015q#A+\u000270O8\r6 E";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "3P<O2-W:\u0003q<I1\u0004+zN:\u0015q\u0000A,\n\u00125N>\u0006:&";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "=M0\u00033=F:O21M0\u0013&6O0\u0012+1Rq\r6 E";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = ">Pq\u00020zA/\r6;\u000e,\b2$L:\u0015>'K4\b38E-";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = ">Pq\u00020zA/\r6;\u000e,\b2$L:\u0015>'K4\b38E-\u0007-1E";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = ">Pq\u001225P7\u000eq%U6\u00024 A,\n4=L3\u0004-";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "9O=\bq=N9\u000e3=F:O+5S4\f>:A8\u0004-";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "9O=\bq=N9\u000e3=F:O+5S4\f>:A8\u0004-$R0";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = ":E+O31P:\u000f8zB>\u0015+1R&\u000507T0\u0013";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = ":E+O31P:\u000f8zS*\u0011:&B0\u0019,'";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    d = strArr3;
                    strArr = new String[11];
                    str = "7O2O>3I3\u0004,;F+\u0013:'O*\u0013<1";
                    i = 48;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    str = "7O2O>:T6\u00176&U,";
                    i = 49;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    str = "7O2O<8E>\u000f25S+\u0004-zM8\u0014>&D";
                    i = 50;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    str = "7O2O:8E<\u0015-=C,\t:1Pq\u0000,=";
                    i = 51;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    str = "7O2O:'T-\u000e13Sq\u000010R0\b;zP0\u0011";
                    i = 52;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "7O2O:'T-\u000e13Sq\u000010R0\b;zP0\u0011q7U/\u0002>?E";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "7O2O21T>\u00060zA,\u0015-;";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "7O2O,9A-\u0015(<Oq225R+'68E\u0012\u000015G:\u0013";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "7O2O,9A-\u0015(<Oq225R+'68E\u0012\u000015G:\u0013\u000f&O";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = ":E'\u0015>$Pq\u0012&'T:\f/5N:\r";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ":E'\u0015>$Pq\u0012&'T:\f/5N:\rq&\u0011";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    c = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "'E<\u000e10A-\u0018r A,\nr?I3\r:&";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public Object get() {
        return a();
    }

    public boolean isCancelled() {
        return false;
    }

    public b5(Context context) {
        this.a = new CountDownLatch(1);
        this.b = new AtomicReference(new av(null, null));
        this.e = context;
    }
}
