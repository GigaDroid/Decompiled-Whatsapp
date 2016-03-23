package com.whatsapp.qrcode;

import android.content.Intent;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.ee;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.nh;
import com.whatsapp.util.Log;
import com.whatsapp.wn;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class QrCodeActivity extends DialogToastActivity {
    private static final String[] A;
    private static int p;
    private HandlerThread n;
    private String o;
    private Handler q;
    private String r;
    private boolean s;
    private QrCodeView t;
    private TextView u;
    private boolean v;
    private nh w;
    private Runnable x;
    private PreviewCallback y;
    private ee z;

    protected void onDestroy() {
        Log.i(A[0]);
        super.onDestroy();
        this.n.quit();
        wn.b(this.w);
    }

    static void f(QrCodeActivity qrCodeActivity) {
        qrCodeActivity.b();
    }

    static QrCodeView g(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.t;
    }

    static Handler d(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.q;
    }

    static String h(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.r;
    }

    static boolean e(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.s;
    }

    static void b(QrCodeActivity qrCodeActivity) {
        qrCodeActivity.a();
    }

    static PreviewCallback c(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.y;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = QrCodeView.g;
        if (i == p) {
            if (i2 == 0) {
                finish();
                if (!z) {
                    return;
                }
            }
            this.t.setVisibility(0);
            if (!z) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    private void b() {
        runOnUiThread(new c(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte[] r12) {
        /*
        r11 = this;
        r2 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r8 = 0;
        r10 = com.whatsapp.qrcode.QrCodeView.g;
        r9 = 0;
        r0 = r11.t;
        r1 = r0.c();
        r0 = r1.width;
        r0 = r0 * 3;
        r6 = r0 / 4;
        if (r6 >= r2) goto L_0x0016;
    L_0x0014:
        r6 = r1.width;
    L_0x0016:
        r0 = r1.height;
        r0 = r0 * 3;
        r7 = r0 / 4;
        if (r7 >= r2) goto L_0x0020;
    L_0x001e:
        r7 = r1.height;
    L_0x0020:
        r0 = r1.width;
        r0 = r0 - r6;
        r4 = r0 / 2;
        r0 = r1.height;
        r0 = r0 - r7;
        r5 = r0 / 2;
        r0 = new com.google.e;
        r2 = r1.width;
        r3 = r1.height;
        r1 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x00db;
    L_0x0036:
        r1 = new com.google.b1;
        r2 = new com.google.dj;
        r2.<init>(r0);
        r1.<init>(r2);
        r0 = r11.z;	 Catch:{ aK -> 0x00c4, all -> 0x00cc }
        r0 = r0.a(r1);	 Catch:{ aK -> 0x00c4, all -> 0x00cc }
        r1 = r11.z;
        r1.a();
    L_0x004b:
        if (r0 == 0) goto L_0x00c0;
    L_0x004d:
        r1 = r0.c();
        r2 = new java.lang.StringBuilder;	 Catch:{ aK -> 0x00d3 }
        r2.<init>();	 Catch:{ aK -> 0x00d3 }
        r3 = A;	 Catch:{ aK -> 0x00d3 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ aK -> 0x00d3 }
        r2 = r2.append(r3);	 Catch:{ aK -> 0x00d3 }
        r2 = r2.append(r1);	 Catch:{ aK -> 0x00d3 }
        r2 = r2.toString();	 Catch:{ aK -> 0x00d3 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ aK -> 0x00d3 }
        if (r1 == 0) goto L_0x00bb;
    L_0x006c:
        r2 = r11.o;	 Catch:{ aK -> 0x00d3 }
        r2 = r1.equals(r2);	 Catch:{ aK -> 0x00d3 }
        if (r2 != 0) goto L_0x00bb;
    L_0x0074:
        r11.o = r1;
        r0 = r0.c();
        r0 = com.whatsapp.App.r(r0);
        if (r0 != 0) goto L_0x00a4;
    L_0x0080:
        r1 = 2131231381; // 0x7f080295 float:1.8078841E38 double:1.0529682087E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ aK -> 0x00d5 }
        r3 = 0;
        r4 = A;	 Catch:{ aK -> 0x00d5 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ aK -> 0x00d5 }
        r2[r3] = r4;	 Catch:{ aK -> 0x00d5 }
        r1 = r11.getString(r1, r2);	 Catch:{ aK -> 0x00d5 }
        r2 = 0;
        com.whatsapp.App.b(r11, r1, r2);	 Catch:{ aK -> 0x00d5 }
        r1 = r11.t;	 Catch:{ aK -> 0x00d5 }
        r2 = new com.whatsapp.qrcode.j;	 Catch:{ aK -> 0x00d5 }
        r2.<init>(r11);	 Catch:{ aK -> 0x00d5 }
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r1.postDelayed(r2, r4);	 Catch:{ aK -> 0x00d5 }
        if (r10 == 0) goto L_0x00b9;
    L_0x00a4:
        r1 = new com.whatsapp.qrcode.q;	 Catch:{ aK -> 0x00d5 }
        r1.<init>(r11);	 Catch:{ aK -> 0x00d5 }
        r11.runOnUiThread(r1);	 Catch:{ aK -> 0x00d5 }
        r0 = r0.c;	 Catch:{ aK -> 0x00d5 }
        r11.r = r0;	 Catch:{ aK -> 0x00d5 }
        r0 = r11.t;	 Catch:{ aK -> 0x00d5 }
        r1 = r11.x;	 Catch:{ aK -> 0x00d5 }
        r2 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0.postDelayed(r1, r2);	 Catch:{ aK -> 0x00d5 }
    L_0x00b9:
        if (r10 == 0) goto L_0x00be;
    L_0x00bb:
        r11.b();	 Catch:{ aK -> 0x00d7 }
    L_0x00be:
        if (r10 == 0) goto L_0x00c3;
    L_0x00c0:
        r11.b();	 Catch:{ aK -> 0x00d9 }
    L_0x00c3:
        return;
    L_0x00c4:
        r0 = move-exception;
        r0 = r11.z;
        r0.a();
        r0 = r9;
        goto L_0x004b;
    L_0x00cc:
        r0 = move-exception;
        r1 = r11.z;
        r1.a();
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = r9;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeActivity.a(byte[]):void");
    }

    static {
        String[] strArr = new String[15];
        String str = "^\u000ezKoF\nr\\b\u0000\u0018~[o]\u0013b";
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
                        i4 = 47;
                        break;
                    case at.g /*1*/:
                        i4 = 124;
                        break;
                    case at.i /*2*/:
                        i4 = 27;
                        break;
                    case at.o /*3*/:
                        i4 = 40;
                        break;
                    default:
                        i4 = 27;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "~\u000e_Mx@\u0018~";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "^\u000ezKoF\nr\\b\u0000\u001fiMz[\u0019";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "L\u0013v\u0006lG\u001do[z_\fDXiJ\u001a~Z~A\u001f~[";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "^\u000eDM\u007fZ\u001fz\\r@\u0012";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "X\u0019y\u0006lG\u001do[z_\f5KtB";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "^\u000ezKoF\nr\\b\u0000\u000e~[nC\b;";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "K\u000ez_zM\u0010~wrK";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "N\u0012\u007fZtF\u00185X~]\u0011r[hF\u0013u\u0006Xn1^zZ";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "_\u0019iEr\\\u000frGu\\";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "I\u0013iK~p\tr";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "_\u0019iEDK\u0019uAzC#vMh\\\u001d|MDF\u0018";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "B\u0019h[zH\u0019DA\u007f";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "N\u0012\u007fZtF\u00185X~]\u0011r[hF\u0013u\u0006Xn1^zZ";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    A = strArr3;
                    p = 1;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0013\u001atFo\u000f\u001ftDt]A<\u000b+\u001fL+\u0018+\bBlMy\u0001\u000bsIo\\\u001dkX5L\u0013v\u00144I\u0013u\\%";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j != 3 || i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        wn.a(getBaseContext());
        finish();
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r9) {
        /*
        r8 = this;
        r7 = 2131755703; // 0x7f1002b7 float:1.9142293E38 double:1.053227258E-314;
        r3 = 5;
        r6 = 8;
        r5 = 1;
        r4 = 0;
        r0 = A;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r8.supportRequestWindowFeature(r3);
        super.onCreate(r9);
        r0 = r8.getWindow();
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0.addFlags(r1);
        r0 = r8.getLayoutInflater();
        r1 = 2130903255; // 0x7f0300d7 float:1.7413323E38 double:1.052806093E-314;
        r2 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r2, r4);
        r0 = (android.view.ViewGroup) r0;
        r8.setContentView(r0);
        r0 = r8.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r5);
        r8.setSupportProgressBarIndeterminateVisibility(r4);
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = com.google.gg.QR_CODE;
        r1.add(r2);
        r2 = com.google.b3.POSSIBLE_FORMATS;
        r0.put(r2, r1);
        r1 = r8.z;
        r1.a(r0);
        r0 = new android.os.HandlerThread;
        r1 = A;
        r2 = 2;
        r1 = r1[r2];
        r0.<init>(r1);
        r8.n = r0;
        r0 = r8.n;
        r0.start();
        r0 = new android.os.Handler;
        r1 = r8.n;
        r1 = r1.getLooper();
        r0.<init>(r1);
        r8.q = r0;
        r0 = A;
        r1 = 4;
        r0 = r0[r1];
        r0 = r8.getSharedPreferences(r0, r4);
        r1 = A;
        r1 = r1[r3];
        r0 = r0.getBoolean(r1, r5);
        r8.v = r0;
        r0 = 2131755389; // 0x7f10017d float:1.9141656E38 double:1.053227103E-314;
        r0 = r8.findViewById(r0);
        r0 = (com.whatsapp.qrcode.QrCodeView) r0;
        r8.t = r0;
        r0 = r8.t;
        r1 = new com.whatsapp.qrcode.b;
        r1.<init>(r8);
        r0.setCameraCallback(r1);
        r0 = 2131755866; // 0x7f10035a float:1.9142623E38 double:1.0532273387E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.u = r0;
        r0 = r8.u;
        r1 = 2131231715; // 0x7f0803e3 float:1.8079519E38 double:1.0529683737E-314;
        r2 = new java.lang.Object[r5];
        r3 = A;
        r3 = r3[r5];
        r2[r4] = r3;
        r1 = r8.getString(r1, r2);
        r1 = android.text.Html.fromHtml(r1);
        r0.setText(r1);
        r0 = 2131755404; // 0x7f10018c float:1.9141686E38 double:1.0532271105E-314;
        r0 = r8.findViewById(r0);
        r1 = new com.whatsapp.qrcode.p;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = r8.v;
        if (r0 == 0) goto L_0x00f3;
    L_0x00cf:
        r0 = 2131755868; // 0x7f10035c float:1.9142627E38 double:1.0532273397E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r4);
        r0 = 2131755867; // 0x7f10035b float:1.9142625E38 double:1.053227339E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r4);
        r0 = r8.findViewById(r7);
        r0.setVisibility(r6);
        r0 = r8.t;
        r0.setVisibility(r6);
        r0 = com.whatsapp.qrcode.QrCodeView.g;
        if (r0 == 0) goto L_0x0111;
    L_0x00f3:
        r0 = 2131755868; // 0x7f10035c float:1.9142627E38 double:1.0532273397E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r6);
        r0 = 2131755867; // 0x7f10035b float:1.9142625E38 double:1.053227339E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r6);
        r0 = r8.findViewById(r7);
        r0.setVisibility(r4);
        r8.a();
    L_0x0111:
        r0 = r8.w;
        com.whatsapp.wn.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeActivity.onCreate(android.os.Bundle):void");
    }

    static boolean a(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.v;
    }

    static void a(QrCodeActivity qrCodeActivity, byte[] bArr) {
        qrCodeActivity.a(bArr);
    }

    static boolean a(QrCodeActivity qrCodeActivity, boolean z) {
        qrCodeActivity.s = z;
        return z;
    }

    private void a() {
        if (App.h(this, A[9]) != 0) {
            this.t.setVisibility(8);
            startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra(A[8], 2130839697).putExtra(A[13], 2131231605).putExtra(A[12], 2131231604).putExtra(A[10], new String[]{A[14]}).putExtra(A[11], true), p);
            if (!QrCodeView.g) {
                return;
            }
        }
        this.t.setVisibility(0);
    }

    static String a(QrCodeActivity qrCodeActivity, String str) {
        qrCodeActivity.o = str;
        return str;
    }

    public QrCodeActivity() {
        this.z = new ee();
        this.v = true;
        this.x = new o(this);
        this.w = new f(this);
        this.y = new l(this);
    }

    static boolean b(QrCodeActivity qrCodeActivity, boolean z) {
        qrCodeActivity.v = z;
        return z;
    }
}
