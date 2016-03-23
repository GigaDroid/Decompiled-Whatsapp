package com.whatsapp;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ConversationRowLocation extends ConversationRow {
    private static int S;
    private static boolean V;
    private static BitmapDescriptor aa;
    private static final String[] bb;
    private final ImageView Q;
    private final TextEmojiLabel R;
    private final View T;
    private MapView U;
    private final View W;
    private yq X;
    private final View Y;
    private final TextView Z;
    private final View ab;
    private final TextView ac;

    private static int e() {
        if (S < 0) {
            try {
                S = App.z().getPackageManager().getPackageInfo(bb[9], 128).versionCode;
            } catch (NameNotFoundException e) {
                S = 0;
            }
        }
        return S;
    }

    static MapView a(ConversationRowLocation conversationRowLocation) {
        return conversationRowLocation.U;
    }

    protected int g() {
        if (App.A()) {
            return 2130903131;
        }
        return 2130903130;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, double r6, double r8, java.lang.String r10) {
        /*
        r0 = android.text.TextUtils.isEmpty(r10);
        if (r0 != 0) goto L_0x001a;
    L_0x0006:
        r0 = "(";
        r1 = "[";
        r0 = r10.replace(r0, r1);
        r1 = ")";
        r2 = "]";
        r10 = r0.replace(r1, r2);
    L_0x001a:
        r0 = com.whatsapp.App.a2();
        if (r0 == 0) goto L_0x0049;
    L_0x0020:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = ",";
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        r0 = android.net.Uri.parse(r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x00a4;
    L_0x0049:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = ",";
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        r1 = android.text.TextUtils.isEmpty(r10);
        if (r1 != 0) goto L_0x00a0;
    L_0x0070:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 10;
        if (r1 > r2) goto L_0x007f;
    L_0x0076:
        r1 = e();
        r2 = 614050000; // 0x2499a8d0 float:6.663915E-17 double:3.0338101E-315;
        if (r1 >= r2) goto L_0x00a0;
    L_0x007f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = bb;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r10);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x00a0:
        r0 = android.net.Uri.parse(r0);
    L_0x00a4:
        r1 = java.text.NumberFormat.getInstance();
        r2 = 4607632778762754458; // 0x3ff199999999999a float:-1.5881868E-23 double:1.1;
        r1 = r1.format(r2);
        r2 = ",";
        r1 = r1.indexOf(r2);
        if (r1 <= 0) goto L_0x0100;
    L_0x00ba:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 14;
        if (r1 < r2) goto L_0x0100;
    L_0x00c0:
        r1 = e();
        r2 = 700000000; // 0x29b92700 float:8.222416E-14 double:3.45845952E-315;
        if (r1 < r2) goto L_0x0100;
    L_0x00c9:
        r1 = e();
        r2 = 702000000; // 0x29d7ab80 float:9.5776685E-14 double:3.468340834E-315;
        if (r1 >= r2) goto L_0x0100;
    L_0x00d2:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = ",";
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = bb;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        r0 = android.net.Uri.parse(r0);
    L_0x0100:
        r1 = new android.content.Intent;
        r2 = bb;
        r3 = 1;
        r2 = r2[r3];
        r1.<init>(r2, r0);
        r5.startActivity(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowLocation.a(android.content.Context, double, double, java.lang.String):void");
    }

    public void a(co coVar, boolean z) {
        if (coVar != this.e || z) {
            a(coVar);
        }
        super.a(coVar, z);
    }

    static boolean a(boolean z) {
        V = z;
        return z;
    }

    static {
        String[] strArr = new String[10];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u000e-_sb\\v\u0004np\u0016*\u0005d~\t>Gf?\u00056F,|\u0007)X<`[";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 89;
                        break;
                    case at.i /*2*/:
                        i4 = 43;
                        break;
                    case at.o /*3*/:
                        i4 = 3;
                        break;
                    default:
                        i4 = 17;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "@#\u00162'";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Fq";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u000e-_sb\\v\u0004np\u0016*\u0005d~\t>Gf?\u00056F,|\u0007)X<`[5D`+N";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u000e-_sb\\v\u0004np\u0016*\u0005d~\t>Gf?\u00056F,|\u0007)X<`[5D`+";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ":*\u0000";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "@*Go,";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000e-_sb\\v\u0004np\u0016*\u0005d~\t>Gf?\u00056F,|\u0007)X<`[";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u00056F-v\t6LotH8Egc\t0O-p\u0016)X-|\u0007)X";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    bb = strArr3;
                    S = -1;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u00077Oq~\u000f=\u0005j\u007f\u0012<Ew?\u0007:_j~\bw}JT1";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public void i() {
        a(this.e);
        super.i();
    }

    static BitmapDescriptor a() {
        return aa;
    }

    protected int h() {
        if (App.A()) {
            return 2130903134;
        }
        return 2130903133;
    }

    static BitmapDescriptor a(BitmapDescriptor bitmapDescriptor) {
        aa = bitmapDescriptor;
        return bitmapDescriptor;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r14) {
        /*
        r13 = this;
        r2 = 0;
        r4 = 0;
        r12 = 1;
        r11 = 8;
        r10 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r14.l;	 Catch:{ IncompatibleClassChangeError -> 0x02b3 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0023;
    L_0x000f:
        r0 = r14.m;	 Catch:{ IncompatibleClassChangeError -> 0x02b3 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0023;
    L_0x0015:
        r0 = r13.T;	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
        r1 = r13.X;	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
        r0.setOnClickListener(r1);	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
        r0 = r13.T;	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
        r1 = r13.K;	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
        r0.setOnLongClickListener(r1);	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
    L_0x0023:
        r0 = com.whatsapp.App.A();	 Catch:{ IncompatibleClassChangeError -> 0x02b7 }
        if (r0 == 0) goto L_0x02c5;
    L_0x0029:
        r0 = r14.m;	 Catch:{ IncompatibleClassChangeError -> 0x02b7 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0035;
    L_0x002f:
        r0 = r14.l;	 Catch:{ IncompatibleClassChangeError -> 0x02b9 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x02c5;
    L_0x0035:
        r0 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        if (r0 != 0) goto L_0x00cb;
    L_0x0039:
        r0 = 2131755560; // 0x7f100228 float:1.9142003E38 double:1.0532271875E-314;
        r0 = r13.findViewById(r0);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r0 = (android.view.ViewGroup) r0;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r1 = new com.google.android.gms.maps.GoogleMapOptions;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r1.<init>();	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r2 = new com.google.android.gms.maps.model.LatLng;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r6 = r14.m;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r8 = r14.l;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r2.<init>(r6, r8);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r3 = new com.google.android.gms.maps.model.CameraPosition$Builder;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r3.<init>();	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r2 = r3.target(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r3 = 1097859072; // 0x41700000 float:15.0 double:5.424144515E-315;
        r2 = r2.zoom(r3);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r2 = r2.build();	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r3 = 1;
        r3 = r1.mapType(r3);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.mapToolbarEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.zoomControlsEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.zoomGesturesEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.compassEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.rotateGesturesEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.tiltGesturesEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r6 = 0;
        r3 = r3.scrollGesturesEnabled(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r2 = r3.camera(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r3 = 1;
        r2.liteMode(r3);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r2 = r13.getContext();	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        com.google.android.gms.maps.MapsInitializer.initialize(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r2 = new com.google.android.gms.maps.MapView;	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r3 = r13.getContext();	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r2.<init>(r3, r1);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r13.U = r2;	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r1 = V;	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        if (r1 != 0) goto L_0x00b9;
    L_0x00a9:
        r1 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r1 = r1.getViewTreeObserver();	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r2 = new com.whatsapp.ao3;	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r2.<init>(r13);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        r1.addOnPreDrawListener(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02bb }
        if (r5 == 0) goto L_0x00c4;
    L_0x00b9:
        r1 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bd }
        r2 = 0;
        r1.onCreate(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02bd }
        r1 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bd }
        r1.onResume();	 Catch:{ IncompatibleClassChangeError -> 0x02bd }
    L_0x00c4:
        r1 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r2 = -1;
        r3 = -1;
        r0.addView(r1, r2, r3);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
    L_0x00cb:
        r0 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r0 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r1 = new com.whatsapp.pk;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r1.<init>(r13, r14);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
        r0.getMapAsync(r1);	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
    L_0x00db:
        r0 = r14.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r13.ab;	 Catch:{ IncompatibleClassChangeError -> 0x02d6 }
        if (r1 == 0) goto L_0x00ea;
    L_0x00e3:
        r1 = r13.ab;	 Catch:{ IncompatibleClassChangeError -> 0x02d6 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02d6 }
    L_0x00ea:
        r1 = r14.A;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x030b;
    L_0x00f2:
        r1 = r14.A;
        r2 = "\n";
        r1 = r1.split(r2);
        r3 = r1;
    L_0x00fc:
        if (r3 == 0) goto L_0x0101;
    L_0x00fe:
        r1 = r3.length;	 Catch:{ IncompatibleClassChangeError -> 0x02d8 }
        if (r1 != 0) goto L_0x0111;
    L_0x0101:
        r1 = r13.R;	 Catch:{ IncompatibleClassChangeError -> 0x02da }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02da }
        r1 = r13.Z;	 Catch:{ IncompatibleClassChangeError -> 0x02da }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02da }
        if (r5 == 0) goto L_0x01eb;
    L_0x0111:
        r1 = r13.R;	 Catch:{ IncompatibleClassChangeError -> 0x02dc }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02dc }
        r1 = r14.q;	 Catch:{ IncompatibleClassChangeError -> 0x02dc }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IncompatibleClassChangeError -> 0x02dc }
        if (r1 == 0) goto L_0x0177;
    L_0x011f:
        r1 = r3.length;	 Catch:{ IncompatibleClassChangeError -> 0x02de }
        if (r1 <= r12) goto L_0x0132;
    L_0x0122:
        r1 = 1;
        r1 = r3[r1];	 Catch:{ IncompatibleClassChangeError -> 0x02de }
        r2 = 0;
        r2 = r3[r2];	 Catch:{ IncompatibleClassChangeError -> 0x02de }
        r1 = r1.startsWith(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02de }
        if (r1 == 0) goto L_0x0132;
    L_0x012e:
        r1 = r3[r12];
        if (r5 == 0) goto L_0x0134;
    L_0x0132:
        r1 = r14.A;
    L_0x0134:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = bb;
        r6 = r6[r11];
        r2 = r2.append(r6);
        r6 = bb;
        r7 = 6;
        r6 = r6[r7];
        r7 = "+";
        r1 = r1.replaceAll(r6, r7);
        r1 = android.net.Uri.encode(r1);
        r1 = r2.append(r1);
        r2 = bb;
        r6 = 7;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r6 = r14.m;
        r1 = r1.append(r6);
        r2 = ",";
        r1 = r1.append(r2);
        r6 = r14.l;
        r1 = r1.append(r6);
        r1 = r1.toString();
        if (r5 == 0) goto L_0x0179;
    L_0x0177:
        r1 = r14.q;
    L_0x0179:
        r6 = new android.text.SpannableStringBuilder;
        r2 = r3[r10];
        r6.<init>(r2);
        r2 = r13.getContext();	 Catch:{ IncompatibleClassChangeError -> 0x02e0 }
        r7 = r2.getResources();	 Catch:{ IncompatibleClassChangeError -> 0x02e0 }
        r2 = r14.k;	 Catch:{ IncompatibleClassChangeError -> 0x02e0 }
        r2 = r2.a;	 Catch:{ IncompatibleClassChangeError -> 0x02e0 }
        if (r2 == 0) goto L_0x02e2;
    L_0x018e:
        r2 = 2131624030; // 0x7f0e005e float:1.8875228E38 double:1.053162203E-314;
    L_0x0191:
        r2 = r7.getColor(r2);
        r7 = new com.whatsapp.g3;	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r7.<init>(r1, r2);	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r2 = 0;
        r8 = 0;
        r8 = r3[r8];	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r8 = r8.length();	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r9 = 18;
        r6.setSpan(r7, r2, r8, r9);	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r2 = r13.R;	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r7 = 0;
        r7 = r3[r7];	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r6 = r13.a(r7, r6);	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r7 = android.widget.TextView.BufferType.SPANNABLE;	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r2.setText(r6, r7);	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r2 = r13.Z;	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r6 = 0;
        r2.setVisibility(r6);	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r2 = r3.length;	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        if (r2 <= r12) goto L_0x01d9;
    L_0x01be:
        r2 = 1;
        r2 = r3[r2];	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02e7 }
        if (r2 != 0) goto L_0x01d9;
    L_0x01c7:
        r2 = r3[r12];
        r2 = r13.a(r2, r4);
        r6 = r13.Z;	 Catch:{ IncompatibleClassChangeError -> 0x02e9 }
        if (r2 != 0) goto L_0x01d4;
    L_0x01d1:
        r2 = 1;
        r2 = r3[r2];	 Catch:{ IncompatibleClassChangeError -> 0x02e9 }
    L_0x01d4:
        r6.setText(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02eb }
        if (r5 == 0) goto L_0x01e1;
    L_0x01d9:
        r2 = r13.Z;	 Catch:{ IncompatibleClassChangeError -> 0x02eb }
        r3 = "";
        r2.setText(r3);	 Catch:{ IncompatibleClassChangeError -> 0x02eb }
    L_0x01e1:
        r2 = new com.whatsapp.y4;
        r2.<init>(r13, r1);
        r1 = r13.Z;
        r1.setOnClickListener(r2);
    L_0x01eb:
        r1 = r13.W;	 Catch:{ IncompatibleClassChangeError -> 0x02ed }
        if (r1 == 0) goto L_0x01f5;
    L_0x01ef:
        r1 = r13.W;	 Catch:{ IncompatibleClassChangeError -> 0x02ed }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02ed }
    L_0x01f5:
        r1 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x02ef }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02ef }
        if (r0 == 0) goto L_0x023d;
    L_0x01fe:
        r1 = r0.transferring;	 Catch:{ IncompatibleClassChangeError -> 0x02f1 }
        if (r1 == 0) goto L_0x023d;
    L_0x0202:
        r1 = r14.k;	 Catch:{ IncompatibleClassChangeError -> 0x02f3 }
        r1 = r1.a;	 Catch:{ IncompatibleClassChangeError -> 0x02f3 }
        if (r1 == 0) goto L_0x0235;
    L_0x0208:
        r1 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r1 = r13.R;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r1 = r13.Z;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r1 = r13.Y;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r1 = r13.ab;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        if (r1 == 0) goto L_0x022d;
    L_0x0227:
        r1 = r13.ab;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
    L_0x022d:
        r1 = r13.T;	 Catch:{ IncompatibleClassChangeError -> 0x02f7 }
        r2 = 0;
        r1.setOnClickListener(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f7 }
        if (r5 == 0) goto L_0x029d;
    L_0x0235:
        r1 = r13.Y;	 Catch:{ IncompatibleClassChangeError -> 0x02f9 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IncompatibleClassChangeError -> 0x02f9 }
        if (r5 == 0) goto L_0x029d;
    L_0x023d:
        r1 = r14.k;	 Catch:{ IncompatibleClassChangeError -> 0x02fb }
        r1 = r1.a;	 Catch:{ IncompatibleClassChangeError -> 0x02fb }
        if (r1 == 0) goto L_0x0249;
    L_0x0243:
        if (r0 == 0) goto L_0x0249;
    L_0x0245:
        r0 = r0.transferred;	 Catch:{ IncompatibleClassChangeError -> 0x02ff }
        if (r0 == 0) goto L_0x0265;
    L_0x0249:
        r0 = r13.Y;	 Catch:{ IncompatibleClassChangeError -> 0x0301 }
        if (r0 == 0) goto L_0x0254;
    L_0x024d:
        r0 = r13.Y;	 Catch:{ IncompatibleClassChangeError -> 0x0301 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0301 }
    L_0x0254:
        r0 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x0303 }
        r1 = r13.X;	 Catch:{ IncompatibleClassChangeError -> 0x0303 }
        r0.setOnClickListener(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0303 }
        r0 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x0303 }
        r1 = 2131232225; // 0x7f0805e1 float:1.8080553E38 double:1.0529686257E-314;
        r0.setText(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0303 }
        if (r5 == 0) goto L_0x029d;
    L_0x0265:
        r0 = r13.Y;	 Catch:{ IncompatibleClassChangeError -> 0x0305 }
        if (r0 == 0) goto L_0x0270;
    L_0x0269:
        r0 = r13.Y;	 Catch:{ IncompatibleClassChangeError -> 0x0305 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0305 }
    L_0x0270:
        r0 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r0 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r1 = 2131231838; // 0x7f08045e float:1.8079768E38 double:1.0529684345E-314;
        r0.setText(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r0 = r13.ac;	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r1 = new com.whatsapp.yr;	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r2 = 0;
        r1.<init>(r13, r2);	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r0.setOnClickListener(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r0 = r13.ab;	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        if (r0 == 0) goto L_0x0293;
    L_0x028d:
        r0 = r13.ab;	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0307 }
    L_0x0293:
        r0 = r13.T;
        r1 = new com.whatsapp.yr;
        r1.<init>(r13, r4);
        r0.setOnClickListener(r1);
    L_0x029d:
        r0 = com.whatsapp.util.bd.a(r14);
        if (r0 == 0) goto L_0x02aa;
    L_0x02a3:
        r1 = r13.Q;	 Catch:{ IncompatibleClassChangeError -> 0x0309 }
        r1.setImageBitmap(r0);	 Catch:{ IncompatibleClassChangeError -> 0x0309 }
        if (r5 == 0) goto L_0x02b2;
    L_0x02aa:
        r0 = r13.Q;	 Catch:{ IncompatibleClassChangeError -> 0x0309 }
        r1 = 2130839630; // 0x7f02084e float:1.7284276E38 double:1.052774658E-314;
        r0.setImageResource(r1);	 Catch:{ IncompatibleClassChangeError -> 0x0309 }
    L_0x02b2:
        return;
    L_0x02b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02b5 }
    L_0x02b5:
        r0 = move-exception;
        throw r0;
    L_0x02b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02b9 }
    L_0x02b9:
        r0 = move-exception;
        throw r0;
    L_0x02bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02bd }
    L_0x02bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02bf }
    L_0x02bf:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);	 Catch:{ IncompatibleClassChangeError -> 0x02d4 }
        if (r5 == 0) goto L_0x00db;
    L_0x02c5:
        r0 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02d2 }
        if (r0 == 0) goto L_0x00db;
    L_0x02c9:
        r0 = r13.U;	 Catch:{ IncompatibleClassChangeError -> 0x02d2 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IncompatibleClassChangeError -> 0x02d2 }
        goto L_0x00db;
    L_0x02d2:
        r0 = move-exception;
        throw r0;
    L_0x02d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02d2 }
    L_0x02d6:
        r0 = move-exception;
        throw r0;
    L_0x02d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02da }
    L_0x02da:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02dc }
    L_0x02dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02de }
    L_0x02de:
        r0 = move-exception;
        throw r0;
    L_0x02e0:
        r0 = move-exception;
        throw r0;
    L_0x02e2:
        r2 = 2131624029; // 0x7f0e005d float:1.8875226E38 double:1.0531622026E-314;
        goto L_0x0191;
    L_0x02e7:
        r0 = move-exception;
        throw r0;
    L_0x02e9:
        r0 = move-exception;
        throw r0;
    L_0x02eb:
        r0 = move-exception;
        throw r0;
    L_0x02ed:
        r0 = move-exception;
        throw r0;
    L_0x02ef:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02f1 }
    L_0x02f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02f3 }
    L_0x02f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02f5 }
    L_0x02f5:
        r0 = move-exception;
        throw r0;
    L_0x02f7:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02f9 }
    L_0x02f9:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02fb }
    L_0x02fb:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02fd }
    L_0x02fd:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x02ff }
    L_0x02ff:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x0301 }
    L_0x0301:
        r0 = move-exception;
        throw r0;
    L_0x0303:
        r0 = move-exception;
        throw r0;	 Catch:{ IncompatibleClassChangeError -> 0x0305 }
    L_0x0305:
        r0 = move-exception;
        throw r0;
    L_0x0307:
        r0 = move-exception;
        throw r0;
    L_0x0309:
        r0 = move-exception;
        throw r0;
    L_0x030b:
        r3 = r4;
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowLocation.a(com.whatsapp.protocol.co):void");
    }

    ConversationRowLocation(Context context, co coVar) {
        super(context, coVar);
        this.X = new yq(this, null);
        this.Q = (ImageView) findViewById(2131755454);
        this.T = findViewById(2131755558);
        this.ac = (TextView) findViewById(2131755525);
        this.ab = findViewById(2131755553);
        this.Y = findViewById(2131755559);
        this.R = (TextEmojiLabel) findViewById(2131755555);
        this.Z = (TextView) findViewById(2131755556);
        this.W = findViewById(2131755561);
        this.R.setLinkHandler(new vi());
        this.R.setAutoLinkMask(0);
        this.R.setLinksClickable(false);
        this.R.setFocusable(false);
        this.R.setClickable(false);
        this.R.setLongClickable(false);
        a(coVar);
    }
}
