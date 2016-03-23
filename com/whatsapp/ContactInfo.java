package com.whatsapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.ContactsContract.Contacts;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UnknownFormatConversionException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ContactInfo extends ChatInfoActivity implements tm, a_ {
    private static final String[] M;
    private View A;
    private LinearLayout B;
    Handler C;
    private ImageView D;
    private CharSequence E;
    private LinearLayout F;
    private final akc G;
    private ce H;
    private l5 I;
    Runnable J;
    private OnCheckedChangeListener K;
    private es L;
    private ChatInfoLayout v;
    private awb w;
    private ListView x;
    private a2_ y;
    private View z;

    static {
        String[] strArr = new String[28];
        String str = "L(\u0010";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 65;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 98;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "J \r\u001e\u0017R\u001e\u001d\u001f\u0004J \u0000\u0014\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u0006\u0014\u0011S-\u0000^\u0011M(\u0004^\u0001I/\u0000\u0010\u0001Ra\u001a\u001e\u0016\u0006 \u0010\u0015\u0007Ba";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u0006\u0014\u0011S-\u0000^\u0001I/\u0000\u0010\u0001Ra\u001a\u001e\u0016\u0006 \u0010\u0015\u0007Ba";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "L(\u0010";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "L(\u0010";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "G/\u0010\u0003\rO%Z\u0018\fR$\u001a\u0005LG\"\u0000\u0018\rHo=?1c\u0013 .-t\u001e15+r";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "V)\u001b\u001f\u0007";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u001b\u0001\u0016\u00062\r\u0002\u0016C,T\u0012\rH5\u0015\u0012\u0016\u0006-\u001d\u0002\u0016\u0006\"\u001b\u0004\u000eBa\u001a\u001e\u0016\u0006'\u001b\u0004\fB";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "G/\u0010\u0003\rO%Z\u0018\fR$\u001a\u0005LG\"\u0000\u0018\rHo15+r";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "V)\u001b\u001f\u0007y5\r\u0001\u0007";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "G/\u0010\u0003\rO%Z\u0018\fR$\u001a\u0005LG\"\u0000\u0018\rHo\"8'q";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "G/\u0010\u0003\rO%Z\u0018\fR$\u001a\u0005LG\"\u0000\u0018\rHo=?1c\u0013 ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "V)\u001b\u001f\u0007";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "R$\f\u0005M^l\u0002\u0012\u0003T%";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "P/\u0010_\u0003H%\u0006\u001e\u000bBo\u0017\u0004\u0010U.\u0006_\u000bR$\u0019^\u0001I/\u0000\u0010\u0001R";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "G/\u0010\u0003\rO%Z\u0018\fR$\u001a\u0005LC9\u0000\u0003\u0003\b\u0012 #'g\f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u001b\u0001\u0016\u00062\r\u0002\u0016C,T\u0012\rH5\u0015\u0012\u0016\u0006-\u001d\u0002\u0016\u0006\"\u001b\u0004\u000eBa\u001a\u001e\u0016\u0006'\u001b\u0004\fB";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u0010\u0014\u0011R3\u001b\b";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "L(\u0010";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "L(\u0010";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "L(\u0010";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "e.\u001a\u0005\u0003E5=\u001f\u0004I\b\u001a\u0018\u0016";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "E(\u0006\u0012\u0017J \u0006.\u0016T \u001a\u0002\u000bR(\u001b\u001f";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u0017\u0003\u0007G5\u0011";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "E.\u001a\u0005\u0003E5\u001d\u001f\u0004In\u0001\u0001\u0006G5\u0011";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "L(\u0010";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    M = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "E(\u0006\u0012\u0017J \u0006.\u0016T \u001a\u0002\u000bR(\u001b\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str) {
        try {
            if (str.equals(getIntent().getStringExtra(M[22]))) {
                k();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void m461a() {
        k();
        supportInvalidateOptionsMenu();
    }

    static void a(ContactInfo contactInfo, View view) {
        contactInfo.a(view);
    }

    public void c(String str) {
        try {
            if (str.equals(getIntent().getStringExtra(M[5]))) {
                k();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void b(String str) {
        if (str.equals(getIntent().getStringExtra(M[21]))) {
            TextView textView = (TextView) findViewById(2131755429);
            CharSequence d = this.I.d();
            try {
                int i;
                textView.setText(d);
                if (TextUtils.isEmpty(d)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case Y.t /*10*/:
                if (i2 == -1) {
                    try {
                        if (this.I != null) {
                            if (intent != null) {
                                try {
                                    if (intent.getData() != null) {
                                        try {
                                            App.as.a(intent.getData(), this.I);
                                            if (!z) {
                                                return;
                                            }
                                        } catch (ActivityNotFoundException e) {
                                            throw e;
                                        }
                                    }
                                } catch (ActivityNotFoundException e2) {
                                    throw e2;
                                }
                            }
                            try {
                                App.as.n(this.I);
                                if (!z) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e22) {
                                throw e22;
                            }
                        }
                    } catch (ActivityNotFoundException e222) {
                        throw e222;
                    } catch (ActivityNotFoundException e2222) {
                        throw e2222;
                    }
                }
                try {
                    Log.i(M[4] + this.I);
                    if (!z) {
                        return;
                    }
                } catch (ActivityNotFoundException e22222) {
                    try {
                        throw e22222;
                    } catch (ActivityNotFoundException e222222) {
                        throw e222222;
                    }
                }
            case Y.j /*11*/:
                if (i2 == -1) {
                    try {
                        if (this.I != null) {
                            try {
                                App.as.n(this.I);
                                if (!z) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e2222222) {
                                throw e2222222;
                            }
                        }
                    } catch (ActivityNotFoundException e22222222) {
                        throw e22222222;
                    }
                }
                try {
                    Log.i(M[3] + this.I);
                    if (!z) {
                        return;
                    }
                } catch (ActivityNotFoundException e222222222) {
                    throw e222222222;
                }
                break;
            case arj.Toolbar_titleMarginTop /*15*/:
                break;
            default:
                return;
        }
        l();
    }

    public void e(String str) {
        try {
            if (this.I == null) {
                return;
            }
            if (TextUtils.equals(this.I.p, str)) {
                runOnUiThread(new ao6(this));
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void b() {
    }

    private void a(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new i0(this, view));
    }

    public ContactInfo() {
        this.y = new a2_();
        this.K = new ke(this);
        this.C = new Handler(Looper.getMainLooper());
        this.J = new ru(this);
        this.G = new akf(this);
    }

    private void a(List list) {
        try {
            this.w.a(list);
            if (this.w.getCount() == 0) {
                findViewById(2131755451).setVisibility(8);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            findViewById(2131755451).setVisibility(0);
            ((TextView) findViewById(2131755453)).setText(NumberFormat.getInstance().format((long) this.w.getCount()));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k() {
        /*
        r10 = this;
        r1 = 8;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = M;
        r4 = 26;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.getIntent();
        r4 = M;
        r5 = 27;
        r4 = r4[r5];
        r0 = r0.getStringExtra(r4);
        r0 = com.whatsapp.qa.d(r0);
        r10.I = r0;
        r0 = r10.v;
        r4 = r10.I;
        r4 = r4.a(r10);
        r0.setTitleText(r4);
        r0 = 2131755429; // 0x7f1001a5 float:1.9141737E38 double:1.053227123E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = r10.I;
        r4 = r4.d();
        r0.setText(r4);	 Catch:{ ActivityNotFoundException -> 0x01a4 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ ActivityNotFoundException -> 0x01a4 }
        if (r4 == 0) goto L_0x01a6;
    L_0x0045:
        r0.setVisibility(r1);
        r0 = 2131755448; // 0x7f1001b8 float:1.9141776E38 double:1.053227132E-314;
        r4 = r10.findViewById(r0);
        r0 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r4.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1 = 2131755450; // 0x7f1001ba float:1.914178E38 double:1.053227133E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r5 = 2131755449; // 0x7f1001b9 float:1.9141778E38 double:1.0532271327E-314;
        r5 = r4.findViewById(r5);
        r6 = r10.I;	 Catch:{ ActivityNotFoundException -> 0x01a9 }
        r6 = r6.w;	 Catch:{ ActivityNotFoundException -> 0x01a9 }
        if (r6 == 0) goto L_0x00a2;
    L_0x006e:
        r6 = 0;
        r0.setVisibility(r6);	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6 = 0;
        r1.setVisibility(r6);	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6 = 0;
        r5.setVisibility(r6);	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r10.j();	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6 = r10.C;	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r7 = r10.J;	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6.removeCallbacks(r7);	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6 = r10.I;	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6 = r6.r;	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r8 = 0;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 == 0) goto L_0x0099;
    L_0x008e:
        r6 = r10.C;	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r7 = r10.J;	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r8 = r10.m();	 Catch:{ ActivityNotFoundException -> 0x01ab }
        r6.postDelayed(r7, r8);	 Catch:{ ActivityNotFoundException -> 0x01ab }
    L_0x0099:
        r6 = r10.I;	 Catch:{ ActivityNotFoundException -> 0x01ad }
        r6 = r6.w;	 Catch:{ ActivityNotFoundException -> 0x01ad }
        r0.a(r6);	 Catch:{ ActivityNotFoundException -> 0x01ad }
        if (r3 == 0) goto L_0x00b1;
    L_0x00a2:
        r6 = 8;
        r0.setVisibility(r6);	 Catch:{ ActivityNotFoundException -> 0x01ad }
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x01ad }
        r0 = 8;
        r5.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x01ad }
    L_0x00b1:
        r0 = 2131755442; // 0x7f1001b2 float:1.9141763E38 double:1.053227129E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755443; // 0x7f1001b3 float:1.9141765E38 double:1.0532271297E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r5 = 2131755440; // 0x7f1001b0 float:1.914176E38 double:1.053227128E-314;
        r5 = r4.findViewById(r5);
        r6 = 2131755445; // 0x7f1001b5 float:1.914177E38 double:1.0532271307E-314;
        r4 = r4.findViewById(r6);
        r6 = r10.I;
        r6 = r6.s();
        r0.setText(r6);
        r0 = r10.I;
        r6 = r10.getResources();
        r0 = r0.a(r6);
        r1.setText(r0);
        r0 = new com.whatsapp.cp;
        r0.<init>(r10);
        r5.setOnClickListener(r0);
        r0 = new com.whatsapp.asq;
        r0.<init>(r10);
        r4.setOnClickListener(r0);
        r0 = com.whatsapp.App.aZ();
        if (r0 == 0) goto L_0x0170;
    L_0x00fd:
        r0 = 2131755199; // 0x7f1000bf float:1.914127E38 double:1.053227009E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755200; // 0x7f1000c0 float:1.9141273E38 double:1.0532270097E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r4 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x01af }
        r5 = r10.I;	 Catch:{ ActivityNotFoundException -> 0x01af }
        r5 = r5.p;	 Catch:{ ActivityNotFoundException -> 0x01af }
        r6 = com.whatsapp.it.ALLOW;	 Catch:{ ActivityNotFoundException -> 0x01af }
        r4 = r4.a(r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01af }
        if (r4 == 0) goto L_0x0134;
    L_0x011d:
        r4 = 2131230949; // 0x7f0800e5 float:1.8077965E38 double:1.0529679953E-314;
        r0.setText(r4);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r4 = new com.whatsapp.util.bz;	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r5 = 2130839485; // 0x7f0207bd float:1.7283982E38 double:1.0527745863E-314;
        r5 = android.support.v4.content.ContextCompat.getDrawable(r10, r5);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r4.<init>(r5);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r1.setImageDrawable(r4);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        if (r3 == 0) goto L_0x0149;
    L_0x0134:
        r4 = 2131230951; // 0x7f0800e7 float:1.807797E38 double:1.052967996E-314;
        r0.setText(r4);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r0 = new com.whatsapp.util.bz;	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r4 = 2130839484; // 0x7f0207bc float:1.728398E38 double:1.052774586E-314;
        r4 = android.support.v4.content.ContextCompat.getDrawable(r10, r4);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r0.<init>(r4);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r1.setImageDrawable(r0);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
    L_0x0149:
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = new com.whatsapp.y5;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = 2131755197; // 0x7f1000bd float:1.9141266E38 double:1.053227008E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        if (r3 == 0) goto L_0x0188;
    L_0x0170:
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = 2131755197; // 0x7f1000bd float:1.9141266E38 double:1.053227008E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
    L_0x0188:
        r0 = r10.L;	 Catch:{ ActivityNotFoundException -> 0x01b5 }
        if (r0 == 0) goto L_0x0192;
    L_0x018c:
        r0 = r10.L;	 Catch:{ ActivityNotFoundException -> 0x01b5 }
        r1 = 1;
        r0.cancel(r1);	 Catch:{ ActivityNotFoundException -> 0x01b5 }
    L_0x0192:
        r10.f();
        r0 = new com.whatsapp.es;
        r0.<init>(r10);
        r10.L = r0;
        r0 = r10.L;
        r1 = new java.lang.Void[r2];
        com.whatsapp.util.bq.a(r0, r1);
        return;
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r1 = r2;
        goto L_0x0045;
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;
    L_0x01ad:
        r0 = move-exception;
        throw r0;
    L_0x01af:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = move-exception;
        throw r0;
    L_0x01b5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.k():void");
    }

    public void onResume() {
        this.H.b(t4.ON_RESUME);
        super.onResume();
        App.a(this.I);
        this.H.a(t4.ON_RESUME);
    }

    public void a(Collection collection) {
    }

    static ChatInfoLayout g(ContactInfo contactInfo) {
        return contactInfo.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.ArrayList r15) {
        /*
        r14 = this;
        r13 = 2130839618; // 0x7f020842 float:1.7284252E38 double:1.052774652E-314;
        r12 = -2;
        r11 = -1;
        r10 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r5 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = r14.getBaseContext();
        r1 = M;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = r14.B;
        r1.removeAllViews();
        r1 = r14.w;
        r1 = r1.getCount();
        if (r1 <= 0) goto L_0x003f;
    L_0x0027:
        r1 = new android.view.View;
        r1.<init>(r14);
        r1.setBackgroundResource(r13);
        r2 = r14.B;
        r3 = r14.getResources();
        r4 = 2131427502; // 0x7f0b00ae float:1.8476622E38 double:1.0530651053E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r2.addView(r1, r11, r3);
    L_0x003f:
        r1 = r15.isEmpty();
        if (r1 != 0) goto L_0x010d;
    L_0x0045:
        r1 = 2130903099; // 0x7f03003b float:1.7413006E38 double:1.052806016E-314;
        r2 = 0;
        r1 = com.whatsapp.aam.a(r0, r1, r2, r5);
        r1 = (android.view.ViewGroup) r1;
        r2 = r14.B;
        r2.addView(r1, r11, r12);
        r7 = r15.iterator();
        r4 = r5;
    L_0x0059:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x00f5;
    L_0x005f:
        r2 = r7.next();
        r2 = (com.whatsapp.at4) r2;
        r3 = 2130903101; // 0x7f03003d float:1.741301E38 double:1.052806017E-314;
        r8 = 0;
        r8 = com.whatsapp.aam.a(r0, r3, r8, r5);
        r3 = 2131624087; // 0x7f0e0097 float:1.8875344E38 double:1.053162231E-314;
        r3 = android.support.v4.content.ContextCompat.getColor(r14, r3);
        r8.setBackgroundColor(r3);
        r1.addView(r8, r11, r12);
        r3 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r3 = r8.findViewById(r3);
        r9 = r15.size();	 Catch:{ ActivityNotFoundException -> 0x011b }
        r9 = r9 + -1;
        if (r4 != r9) goto L_0x0090;
    L_0x0089:
        r9 = 8;
        r3.setVisibility(r9);	 Catch:{ ActivityNotFoundException -> 0x011d }
        if (r6 == 0) goto L_0x0094;
    L_0x0090:
        r9 = 0;
        r3.setVisibility(r9);	 Catch:{ ActivityNotFoundException -> 0x011d }
    L_0x0094:
        r3 = 2131755440; // 0x7f1001b0 float:1.914176E38 double:1.053227128E-314;
        r3 = r8.findViewById(r3);
        r9 = com.whatsapp.at4.b(r2);	 Catch:{ ActivityNotFoundException -> 0x011f }
        if (r9 != 0) goto L_0x00a7;
    L_0x00a1:
        r9 = 4;
        r3.setVisibility(r9);	 Catch:{ ActivityNotFoundException -> 0x0121 }
        if (r6 == 0) goto L_0x00b3;
    L_0x00a7:
        r9 = 0;
        r3.setVisibility(r9);	 Catch:{ ActivityNotFoundException -> 0x0121 }
        r9 = new com.whatsapp.a2w;	 Catch:{ ActivityNotFoundException -> 0x0121 }
        r9.<init>(r14, r2);	 Catch:{ ActivityNotFoundException -> 0x0121 }
        r3.setOnClickListener(r9);	 Catch:{ ActivityNotFoundException -> 0x0121 }
    L_0x00b3:
        r3 = 2131755442; // 0x7f1001b2 float:1.9141763E38 double:1.053227129E-314;
        r3 = r8.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r9 = com.whatsapp.at4.d(r2);
        r3.setText(r9);
        r3 = 2131755443; // 0x7f1001b3 float:1.9141765E38 double:1.0532271297E-314;
        r3 = r8.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r9 = com.whatsapp.at4.c(r2);
        r3.setText(r9);
        r3 = 2131755445; // 0x7f1001b5 float:1.914177E38 double:1.0532271307E-314;
        r3 = r8.findViewById(r3);
        r9 = new com.whatsapp.gt;
        r9.<init>(r10, r10, r10, r10);
        r3.setOnTouchListener(r9);
        r3 = 2131755445; // 0x7f1001b5 float:1.914177E38 double:1.0532271307E-314;
        r3 = r8.findViewById(r3);
        r8 = new com.whatsapp.aud;
        r8.<init>(r14, r2);
        r3.setOnClickListener(r8);
        r2 = r4 + 1;
        if (r6 == 0) goto L_0x0123;
    L_0x00f5:
        r0 = new android.view.View;
        r0.<init>(r14);
        r0.setBackgroundResource(r13);
        r1 = r14.B;
        r2 = r14.getResources();
        r3 = 2131427424; // 0x7f0b0060 float:1.8476464E38 double:1.053065067E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r1.addView(r0, r11, r2);
    L_0x010d:
        r0 = r14.v;
        r1 = r14.z;
        r2 = r14.B;
        r3 = r14.F;
        r4 = r14.w;
        r0.a(r1, r2, r3, r4);
        return;
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0121 }
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r4 = r2;
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.b(java.util.ArrayList):void");
    }

    public void d(String str) {
        try {
            if (str.equals(getIntent().getStringExtra(M[20]))) {
                k();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            dk com_whatsapp_aas = new aas(App.as.b(str));
            try {
                if (this.w == null) {
                    return;
                }
                if (l5.a(this.w.b, com_whatsapp_aas)) {
                    this.w.notifyDataSetChanged();
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public static void a(l5 l5Var, Activity activity, ActivityOptionsCompat activityOptionsCompat) {
        Intent intent = new Intent(activity, ContactInfo.class);
        try {
            Bundle bundle;
            intent.putExtra(M[0], l5Var.p);
            intent.putExtra(M[1], true);
            if (activityOptionsCompat == null) {
                bundle = null;
            } else {
                bundle = activityOptionsCompat.toBundle();
            }
            ActivityCompat.startActivity(activity, intent, bundle);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = DialogToastActivity.f;
        try {
            Uri a;
            Intent intent;
            Intent intent2;
            switch (menuItem.getItemId()) {
                case at.g /*1*/:
                    if (this.I.l == null) {
                        return true;
                    }
                    a = this.I.a(getContentResolver());
                    if (a == null) {
                        return true;
                    }
                    intent = new Intent(M[12], a);
                    try {
                        intent.setComponent(intent.resolveActivity(getPackageManager()));
                        if (intent.getComponent() != null) {
                            startActivity(intent);
                            if (!z) {
                                return true;
                            }
                        }
                        Log.w(M[9]);
                        App.aa();
                        return true;
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                case at.o /*3*/:
                    intent2 = new Intent(M[13], Contacts.CONTENT_URI);
                    intent2.putExtra(M[14], this.I.s());
                    try {
                        startActivityForResult(intent2, 10);
                        return true;
                    } catch (ActivityNotFoundException e3) {
                        App.aa();
                        return true;
                    }
                case at.p /*4*/:
                    intent2 = new Intent(M[7]);
                    intent2.setType(M[16]);
                    intent2.putExtra(M[8], this.I.a((Context) this));
                    intent2.putExtra(M[11], 2);
                    intent2.setFlags(524288);
                    try {
                        startActivityForResult(intent2, 11);
                        return true;
                    } catch (ActivityNotFoundException e4) {
                        App.aa();
                        return true;
                    }
                case at.m /*5*/:
                    intent2 = new Intent(this, IdentityVerificationActivity.class);
                    intent2.putExtra(M[6], this.I.p);
                    startActivity(intent2);
                    return true;
                case Y.f /*6*/:
                    if (this.I.l == null) {
                        return true;
                    }
                    a = this.I.a(getContentResolver());
                    if (a == null) {
                        return true;
                    }
                    intent = new Intent(M[10], a);
                    try {
                        intent.setComponent(intent.resolveActivity(getPackageManager()));
                        if (intent.getComponent() != null) {
                            startActivity(intent);
                            if (!z) {
                                return true;
                            }
                        }
                        Log.w(M[18]);
                        App.aa();
                        return true;
                    } catch (ActivityNotFoundException e22) {
                        throw e22;
                    } catch (ActivityNotFoundException e222) {
                        throw e222;
                    }
                case aF.v /*7*/:
                    if (this.I.l == null) {
                        return true;
                    }
                    Parcelable b = this.I.b(getContentResolver());
                    if (b == null) {
                        return true;
                    }
                    try {
                        startActivity(new Intent(this, ContactPicker.class).setType(M[15]).putExtra(M[17], b));
                        return true;
                    } catch (ActivityNotFoundException e2222) {
                        throw e2222;
                    }
                case 16908332:
                    ActivityCompat.finishAfterTransition(this);
                    return true;
                default:
                    return false;
            }
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        }
    }

    static ImageView i(ContactInfo contactInfo) {
        return contactInfo.D;
    }

    public void a(String str, boolean z) {
    }

    public void finishAfterTransition() {
        if (VERSION.SDK_INT >= 21) {
            this.A.setTransitionName(null);
            Transition transitionSet = new TransitionSet();
            Transition slide = new Slide(48);
            slide.addTarget(this.A);
            transitionSet.addTransition(slide);
            slide = new Slide(80);
            slide.addTarget(this.x);
            transitionSet.addTransition(slide);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    static void a(ContactInfo contactInfo, ArrayList arrayList) {
        contactInfo.b(arrayList);
    }

    static awb b(ContactInfo contactInfo) {
        return contactInfo.w;
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            this.H.b();
            Log.i(M[19]);
            if (this.L != null) {
                this.L.cancel(true);
            }
            App.a((tm) this);
            App.a((a_) this);
            App.aK.a(this.G);
            this.y.a();
            this.C.removeCallbacks(this.J);
            this.D.setImageDrawable(null);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void l() {
        try {
            if (this.I != null) {
                try {
                    ((TextView) findViewById(2131755187)).setVisibility(a3b.a((Context) this).b(this.I.p).k() ? 0 : 8);
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public static void a(l5 l5Var, Activity activity) {
        a(l5Var, activity, null);
    }

    static void a(ContactInfo contactInfo) {
        contactInfo.k();
    }

    static long j(ContactInfo contactInfo) {
        return contactInfo.m();
    }

    static void a(ContactInfo contactInfo, List list) {
        contactInfo.a(list);
    }

    static void f(ContactInfo contactInfo) {
        contactInfo.j();
    }

    public void onPause() {
        super.onPause();
        this.H.b();
    }

    static l5 h(ContactInfo contactInfo) {
        return contactInfo.I;
    }

    static void d(ContactInfo contactInfo) {
        contactInfo.i();
    }

    static a2_ c(ContactInfo contactInfo) {
        return contactInfo.y;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
        r7 = this;
        r6 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r5 = 1;
        r4 = 0;
        r3 = 0;
        r0 = M;
        r1 = 25;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = M;
        r1 = 23;
        r0 = r0[r1];
        r0 = com.whatsapp.tp.a(r0);
        r7.H = r0;
        r0 = r7.H;
        r0.e();
        r0 = r7.H;
        r1 = com.whatsapp.t4.ON_CREATE;
        r0.b(r1);
        super.onCreate(r8);
        r7.supportPostponeEnterTransition();
        r0 = r7.getLayoutInflater();
        r1 = 2130903097; // 0x7f030039 float:1.7413002E38 double:1.052806015E-314;
        r0 = com.whatsapp.aam.a(r0, r1, r4, r3);
        r0 = (com.whatsapp.ChatInfoLayout) r0;
        r7.v = r0;
        r0 = r7.v;
        r7.setContentView(r0);
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r1 = "";
        r0.setTitle(r1);
        r0.setContentInsetsAbsolute(r3, r3);
        r7.setSupportActionBar(r0);
        r1 = r7.getSupportActionBar();
        r1.setDisplayHomeAsUpEnabled(r5);
        r1 = new com.whatsapp.util.bz;
        r2 = 2130839456; // 0x7f0207a0 float:1.7283923E38 double:1.052774572E-314;
        r2 = android.support.v4.content.ContextCompat.getDrawable(r7, r2);
        r1.<init>(r2);
        r0.setNavigationIcon(r1);
        r0 = r7.a();
        r7.x = r0;
        r0 = r7.getLayoutInflater();
        r1 = 2130903100; // 0x7f03003c float:1.7413008E38 double:1.0528060163E-314;
        r2 = r7.x;
        r0 = com.whatsapp.aam.a(r0, r1, r2, r3);
        r7.z = r0;
        r0 = r7.x;
        r1 = r7.z;
        r0.addHeaderView(r1, r4, r3);
        r0 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r7.findViewById(r0);
        r7.A = r0;
        r0 = r7.v;
        r0.c();
        r0 = r7.v;
        r1 = r7.getResources();
        r2 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r0.setCollapsedPadding(r1, r3);
        r0 = new android.widget.LinearLayout;
        r0.<init>(r7);
        r7.B = r0;
        r0 = r7.B;
        r0.setOrientation(r5);
        r0 = r7.x;
        r1 = r7.B;
        r0.addFooterView(r1, r4, r3);
        r0 = new android.widget.LinearLayout;
        r0.<init>(r7);
        r7.F = r0;
        r0 = r7.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getHeight();
        r1 = r7.F;
        r1.setPadding(r3, r3, r3, r0);
        r0 = r7.x;
        r1 = r7.F;
        r0.addFooterView(r1, r4, r3);
        r0 = r7.findViewById(r6);
        r0 = (android.widget.ImageView) r0;
        r7.D = r0;
        r0 = r7.v;
        r1 = new com.whatsapp.azd;
        r1.<init>(r7);
        r0.setOnPhotoClickListener(r1);
        r0 = new com.whatsapp.u4;
        r0.<init>(r7);
        r1 = 2131755757; // 0x7f1002ed float:1.9142402E38 double:1.053227285E-314;
        r1 = r7.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1.setOnClickListener(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = 2131755758; // 0x7f1002ee float:1.9142404E38 double:1.0532272854E-314;
        r1 = r7.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1.setOnClickListener(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = r7.x;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = new com.whatsapp.aa1;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1.<init>(r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.setOnItemClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = new com.whatsapp.awb;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.<init>(r7, r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r7.w = r0;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = r7.x;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = r7.w;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.setAdapter(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 0;
        r7.a(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 0;
        r7.a(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r0 = r7.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = new com.whatsapp.adv;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1.<init>(r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 1;
        r7.setSupportProgressBarIndeterminateVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r7.k();	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r7.l();	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 2131755186; // 0x7f1000b2 float:1.9141244E38 double:1.0532270027E-314;
        r0 = r7.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = new com.whatsapp.il;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1.<init>(r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r7.i();	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 2131755182; // 0x7f1000ae float:1.9141236E38 double:1.053227001E-314;
        r0 = r7.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = new com.whatsapp.nq;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1.<init>(r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = 2131755184; // 0x7f1000b0 float:1.914124E38 double:1.053227002E-314;
        r0 = r7.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = (android.support.v7.widget.SwitchCompat) r0;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = r7.K;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.setOnCheckedChangeListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = r7.G;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0.b(r1);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        com.whatsapp.App.b(r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        com.whatsapp.App.b(r7);	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        r1 = 21;
        if (r0 < r1) goto L_0x01b1;
    L_0x017f:
        r0 = r7.getIntent();	 Catch:{ ActivityNotFoundException -> 0x01c4 }
        r1 = M;	 Catch:{ ActivityNotFoundException -> 0x01c4 }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01c4 }
        r2 = 0;
        r0 = r0.getBooleanExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01c4 }
        if (r0 == 0) goto L_0x01a0;
    L_0x0190:
        r0 = r7.A;	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        r1 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r1 = r7.getString(r1);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        r0.setTransitionName(r1);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        if (r0 == 0) goto L_0x01b1;
    L_0x01a0:
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r7.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        r1 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r1 = r7.getString(r1);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        r0.setTransitionName(r1);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
    L_0x01b1:
        r0 = r7.a();
        r1 = r7.H;
        com.whatsapp.a2c.b(r0, r1);
        r0 = r7.H;
        r1 = com.whatsapp.t4.ON_CREATE;
        r0.a(r1);
        return;
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.onCreate(android.os.Bundle):void");
    }

    private void j() {
        TextView textView = (TextView) findViewById(2131755450);
        if (this.I.r != 0) {
            try {
                CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(App.b(this.I.r), System.currentTimeMillis(), 0, 0);
                if (!TextUtils.equals(this.E, relativeTimeSpanString)) {
                    this.E = relativeTimeSpanString;
                    textView.setText(this.E);
                    return;
                }
                return;
            } catch (UnknownFormatConversionException e) {
                throw e;
            } catch (Throwable e2) {
                try {
                    Log.a(e2);
                    textView.setText("");
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (UnknownFormatConversionException e3) {
                    throw e3;
                }
            }
        }
        textView.setText("");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
        r4 = this;
        r0 = r4.I;	 Catch:{ ActivityNotFoundException -> 0x0062 }
        if (r0 == 0) goto L_0x005d;
    L_0x0004:
        r0 = r4.I;	 Catch:{ ActivityNotFoundException -> 0x0064 }
        r0 = r0.l;	 Catch:{ ActivityNotFoundException -> 0x0064 }
        if (r0 == 0) goto L_0x0030;
    L_0x000a:
        r0 = 0;
        r1 = 7;
        r2 = 0;
        r3 = 2131232016; // 0x7f080510 float:1.808013E38 double:1.0529685224E-314;
        r5.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r0 = 0;
        r1 = 6;
        r2 = 0;
        r3 = 2131231078; // 0x7f080166 float:1.8078227E38 double:1.052968059E-314;
        r5.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r0 = 0;
        r1 = 1;
        r2 = 0;
        r3 = 2131232227; // 0x7f0805e3 float:1.8080557E38 double:1.0529686267E-314;
        r0 = r5.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r1 = 2130839509; // 0x7f0207d5 float:1.728403E38 double:1.052774598E-314;
        r0.setIcon(r1);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x0066 }
        if (r0 == 0) goto L_0x004a;
    L_0x0030:
        r0 = 0;
        r1 = 3;
        r2 = 0;
        r3 = 2131230786; // 0x7f080042 float:1.8077635E38 double:1.0529679147E-314;
        r3 = r4.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r5.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r0 = 0;
        r1 = 4;
        r2 = 0;
        r3 = 2131230789; // 0x7f080045 float:1.807764E38 double:1.052967916E-314;
        r3 = r4.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r5.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
    L_0x004a:
        r0 = com.whatsapp.App.aZ();	 Catch:{ ActivityNotFoundException -> 0x0068 }
        if (r0 == 0) goto L_0x005d;
    L_0x0050:
        r0 = 0;
        r1 = 5;
        r2 = 0;
        r3 = 2131232200; // 0x7f0805c8 float:1.8080503E38 double:1.0529686133E-314;
        r3 = r4.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x0068 }
        r5.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0068 }
    L_0x005d:
        r0 = super.onCreateOptionsMenu(r5);
        return r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r4 = this;
        r0 = r4.I;	 Catch:{ ActivityNotFoundException -> 0x0005 }
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        throw r0;
    L_0x0007:
        r0 = com.whatsapp.a3b.a(r4);
        r1 = r4.I;
        r1 = r1.p;
        r2 = r0.b(r1);
        r0 = 2131755183; // 0x7f1000af float:1.9141238E38 double:1.0532270013E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755184; // 0x7f1000b0 float:1.914124E38 double:1.053227002E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.support.v7.widget.SwitchCompat) r1;
        r3 = 0;
        r1.setOnCheckedChangeListener(r3);	 Catch:{ ActivityNotFoundException -> 0x0055 }
        r3 = r2.f();	 Catch:{ ActivityNotFoundException -> 0x0055 }
        if (r3 == 0) goto L_0x0046;
    L_0x002f:
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r2 = r2.h();	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r2 = com.whatsapp.util.cs.d(r4, r2);	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r2 = 1;
        r1.setChecked(r2);	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x0057 }
        if (r2 == 0) goto L_0x004f;
    L_0x0046:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r0 = 0;
        r1.setChecked(r0);	 Catch:{ ActivityNotFoundException -> 0x0057 }
    L_0x004f:
        r0 = r4.K;
        r1.setOnCheckedChangeListener(r0);
        goto L_0x0004;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.i():void");
    }

    public String a() {
        try {
            return this.I == null ? null : this.I.p;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private long m() {
        try {
            if (this.I.r == 0) {
                return 60000;
            }
            long currentTimeMillis = System.currentTimeMillis() - App.b(this.I.r);
            if (currentTimeMillis < 60000) {
                return 500;
            }
            if (currentTimeMillis < 3600000) {
                return 5000;
            }
            return 20000;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static ce e(ContactInfo contactInfo) {
        return contactInfo.H;
    }
}
