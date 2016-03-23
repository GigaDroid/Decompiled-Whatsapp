package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class xo extends AsyncTask {
    public static int m;
    private static final String[] z;
    LocationListener a;
    private Location b;
    private final MediaData c;
    LocationListener d;
    public int e;
    boolean f;
    private byte[] g;
    private final LocationManager h;
    Location i;
    int j;
    protected final co k;
    Location l;

    static {
        String[] strArr = new String[23];
        String str = "V\u001b3\u0013nL\u0014/\u0018`_U \u0018`I\t&;nX\u001b7\u001enUZ";
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
                        i4 = 59;
                        break;
                    case at.g /*1*/:
                        i4 = 122;
                        break;
                    case at.i /*2*/:
                        i4 = 67;
                        break;
                    case at.o /*3*/:
                        i4 = 119;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\\\n0";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "V\u001b3\u0013nL\u0014/\u0018`_U%\u001eo^U&\u0005sT\bc";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "V\u001b3\u0013nL\u0014/\u0018`_U \u0018`I\t&XdI\b,\u0005!";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "U\u001f7\u0000nI\u0011";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\\\n0";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Z\u0014'\u0005nR\u001em\u0007dI\u0017*\u0004rR\u0015-Y@x9\u0006$Rd<\n9Dd6\f4@o3\f9";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "Z\u0014'\u0005nR\u001em\u0007dI\u0017*\u0004rR\u0015-Y@x9\u0006$Rd9\f6Sh?\u001c;Nx;\u0017>Nu";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "W\u0015 \u0016uR\u0015-";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "V\u001b3\u0013nL\u0014/\u0018`_U*\u0018dI\b,\u0005!";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "S\u000e7\u0007r\u0001Ul\u001a`K\tm\u0010nT\u001d/\u0012`K\u00130YbT\u0017l\u001a`K\tl\u0016qRU0\u0003`O\u0013 \u001a`KE \u0012oO\u001f1J";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001d\u0000,\u0018l\u0006";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u001d\t*\rd\u0006KtGy\nMsQr^\u00140\u0018s\u0006\u000e1\u0002d\u001d\u001c,\u0005lZ\u000e~\u0007o\\Be\u001anY\u0013/\u0012<O\b6\u0012'V\u001b1\u001cdI\t~\u0014nW\u00151Ms^\u001ef@BH\u00139\u0012;V\u0013'R6x";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "V\u001b3\u0013nL\u0014/\u0018`_U*\u0018dI\b,\u0005!";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    str = "Y\u001b'WcR\u000e.\u0016q\u001b\b&\u0014dR\f&\u0013";
                    i = 14;
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    strArr2 = strArr3;
                    str = "S\u000e7\u0007r\u0001Ul\u0013dMT5\u001esO\u000f\"\u001bdZ\b7\u001f/U\u001f7XS~)\u0017Xw\nU\n\u001a`\\\u001f1\u000e.v\u001b3XST\u001b'X";
                    i = 15;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0000OwL";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "Y\u001b'WcR\u000e.\u0016q\u001b\b&\u0014dR\f&\u0013";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u001d\u0011&\u000e<";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u0004\u0017\"\u0007RR\u0000&J0\u000bJoF1\u000b\\3\u0007<";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "Z\u0014'\u0005nR\u001em\u0007dI\u0017*\u0004rR\u0015-Y@x9\u0006$Rd9\f6Sh?\u001c;Nx;\u0017>Nu";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "Z\u0014'\u0005nR\u001em\u0007dI\u0017*\u0004rR\u0015-Y@x9\u0006$Rd<\n9Dd6\f4@o3\f9";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    m = 15;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "V\u001b3\u0013nL\u0014/\u0018`_U%\u0016hW\u001f'Xs^\u000e1\u000e";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    void b() {
        try {
            if (this.a == null) {
                this.a = new adf(this);
            }
            try {
                if (this.d == null) {
                    this.d = new arm(this);
                }
                try {
                    if (App.p.o(z[7]) == 0) {
                        this.h.requestLocationUpdates(z[6], 1000, 1.0f, this.a);
                    }
                } catch (IllegalArgumentException e) {
                    Log.w(z[3] + e.toString());
                    this.a = null;
                }
                try {
                    if (App.p.o(z[8]) == 0) {
                        this.h.requestLocationUpdates(z[5], 1000, 1.0f, this.d);
                    }
                } catch (IllegalArgumentException e2) {
                    Log.w(z[4] + e2.toString());
                    this.d = null;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap b(double r10, double r12, int r14) {
        /*
        r2 = 1;
        r9 = 100;
        r4 = 0;
        r1 = 0;
        r0 = new org.apache.http.params.BasicHttpParams;
        r0.<init>();
        r3 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r0, r3);
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r0, r3);
        r6 = new org.apache.http.impl.client.DefaultHttpClient;
        r6.<init>(r0);
        r0 = new org.apache.http.client.methods.HttpGet;	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3.<init>();	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = z;	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r7 = 11;
        r5 = r5[r7];	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = ",";
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = z;	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r7 = 12;
        r5 = r5[r7];	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = 21;
        r7 = 1;
        r7 = java.lang.Math.max(r7, r14);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = java.lang.Math.min(r5, r7);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = z;	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r7 = 13;
        r5 = r5[r7];	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = ",";
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r0 = r6.execute(r0);	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r0 = r0.getEntity();	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r5 = r0.getContent();	 Catch:{ IOException -> 0x020b, all -> 0x01d2 }
        r0 = 0;
        r3 = com.whatsapp.util.ag.e;	 Catch:{ IOException -> 0x0210, all -> 0x0202 }
        r3 = android.graphics.BitmapFactory.decodeStream(r5, r0, r3);	 Catch:{ IOException -> 0x0210, all -> 0x0202 }
        if (r3 == 0) goto L_0x0097;
    L_0x0087:
        r0 = r3.getWidth();	 Catch:{ IOException -> 0x019b, all -> 0x0204 }
        r7 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        if (r0 != r7) goto L_0x0097;
    L_0x008f:
        r0 = r3.getHeight();	 Catch:{ IOException -> 0x019d, all -> 0x0204 }
        r7 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        if (r0 == r7) goto L_0x01a4;
    L_0x0097:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x00a3, all -> 0x0204 }
        r1 = z;	 Catch:{ IOException -> 0x00a3, all -> 0x0204 }
        r7 = 18;
        r1 = r1[r7];	 Catch:{ IOException -> 0x00a3, all -> 0x0204 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00a3, all -> 0x0204 }
        throw r0;	 Catch:{ IOException -> 0x00a3, all -> 0x0204 }
    L_0x00a3:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        r3 = r5;
    L_0x00a7:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0207 }
        r5.<init>();	 Catch:{ all -> 0x0207 }
        r7 = z;	 Catch:{ all -> 0x0207 }
        r8 = 14;
        r7 = r7[r8];	 Catch:{ all -> 0x0207 }
        r5 = r5.append(r7);	 Catch:{ all -> 0x0207 }
        r0 = r0.toString();	 Catch:{ all -> 0x0207 }
        r0 = r5.append(r0);	 Catch:{ all -> 0x0207 }
        r0 = r0.toString();	 Catch:{ all -> 0x0207 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x0207 }
        if (r2 == 0) goto L_0x00cc;
    L_0x00c7:
        if (r2 == 0) goto L_0x00cc;
    L_0x00c9:
        r2.recycle();	 Catch:{ IOException -> 0x01c9 }
    L_0x00cc:
        if (r3 == 0) goto L_0x00d1;
    L_0x00ce:
        r3.close();	 Catch:{ IllegalArgumentException -> 0x01cb }
    L_0x00d1:
        r0 = r4;
        r2 = r3;
    L_0x00d3:
        if (r0 != 0) goto L_0x019a;
    L_0x00d5:
        if (r1 == 0) goto L_0x019a;
    L_0x00d7:
        r1 = new org.apache.http.client.methods.HttpGet;	 Catch:{ IOException -> 0x0176 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0176 }
        r3.<init>();	 Catch:{ IOException -> 0x0176 }
        r4 = z;	 Catch:{ IOException -> 0x0176 }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x0176 }
        r4 = ",";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x0176 }
        r4 = "/";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r4 = 21;
        r5 = 1;
        r5 = java.lang.Math.max(r5, r14);	 Catch:{ IOException -> 0x0176 }
        r4 = java.lang.Math.min(r4, r5);	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r4 = z;	 Catch:{ IOException -> 0x0176 }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x0176 }
        r4 = ",";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x0176 }
        r4 = z;	 Catch:{ IOException -> 0x0176 }
        r5 = 17;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r4 = z;	 Catch:{ IOException -> 0x0176 }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r4 = com.whatsapp.azx.j;	 Catch:{ IOException -> 0x0176 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0176 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0176 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0176 }
        r1 = r6.execute(r1);	 Catch:{ IOException -> 0x0176 }
        r1 = r1.getEntity();	 Catch:{ IOException -> 0x0176 }
        r2 = r1.getContent();	 Catch:{ IOException -> 0x0176 }
        r1 = 0;
        r3 = com.whatsapp.util.ag.e;	 Catch:{ IOException -> 0x0176 }
        r0 = android.graphics.BitmapFactory.decodeStream(r2, r1, r3);	 Catch:{ IOException -> 0x0176 }
        if (r0 == 0) goto L_0x0168;
    L_0x015c:
        r1 = r0.getWidth();	 Catch:{ IOException -> 0x01e7 }
        if (r1 != r9) goto L_0x0168;
    L_0x0162:
        r1 = r0.getHeight();	 Catch:{ IOException -> 0x01e9 }
        if (r1 == r9) goto L_0x01f2;
    L_0x0168:
        r1 = new java.io.IOException;	 Catch:{ IOException -> 0x0174 }
        r3 = z;	 Catch:{ IOException -> 0x0174 }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0174 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0174 }
        throw r1;	 Catch:{ IOException -> 0x0174 }
    L_0x0174:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0176 }
    L_0x0176:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01eb }
        r3.<init>();	 Catch:{ all -> 0x01eb }
        r4 = z;	 Catch:{ all -> 0x01eb }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ all -> 0x01eb }
        r3 = r3.append(r4);	 Catch:{ all -> 0x01eb }
        r1 = r1.toString();	 Catch:{ all -> 0x01eb }
        r1 = r3.append(r1);	 Catch:{ all -> 0x01eb }
        r1 = r1.toString();	 Catch:{ all -> 0x01eb }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x01eb }
        if (r2 == 0) goto L_0x019a;
    L_0x0197:
        r2.close();	 Catch:{ IOException -> 0x0200 }
    L_0x019a:
        return r0;
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x019d, all -> 0x0204 }
    L_0x019d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x019f, all -> 0x0204 }
    L_0x019f:
        r0 = move-exception;
        r2 = r3;
        r3 = r5;
        goto L_0x00a7;
    L_0x01a4:
        r0 = 35;
        r2 = 35;
        r7 = 100;
        r8 = 100;
        r4 = android.graphics.Bitmap.createBitmap(r3, r0, r2, r7, r8);	 Catch:{ IOException -> 0x019f, all -> 0x0204 }
        if (r3 == 0) goto L_0x01b7;
    L_0x01b2:
        if (r3 == r4) goto L_0x01b7;
    L_0x01b4:
        r3.recycle();	 Catch:{ IOException -> 0x01c0 }
    L_0x01b7:
        if (r5 == 0) goto L_0x01bc;
    L_0x01b9:
        r5.close();	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01bc:
        r0 = r4;
        r2 = r5;
        goto L_0x00d3;
    L_0x01c0:
        r0 = move-exception;
        throw r0;
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        r0 = r4;
        r2 = r5;
        goto L_0x00d3;
    L_0x01c9:
        r0 = move-exception;
        throw r0;
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        r0 = r4;
        r2 = r3;
        goto L_0x00d3;
    L_0x01d2:
        r0 = move-exception;
        r5 = r4;
    L_0x01d4:
        if (r4 == 0) goto L_0x01db;
    L_0x01d6:
        if (r4 == 0) goto L_0x01db;
    L_0x01d8:
        r4.recycle();	 Catch:{ IOException -> 0x01e1 }
    L_0x01db:
        if (r5 == 0) goto L_0x01e0;
    L_0x01dd:
        r5.close();	 Catch:{ IllegalArgumentException -> 0x01e3 }
    L_0x01e0:
        throw r0;
    L_0x01e1:
        r0 = move-exception;
        throw r0;
    L_0x01e3:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01e5 }
    L_0x01e5:
        r1 = move-exception;
        goto L_0x01e0;
    L_0x01e7:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01e9 }
    L_0x01e9:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0174 }
    L_0x01eb:
        r0 = move-exception;
        if (r2 == 0) goto L_0x01f1;
    L_0x01ee:
        r2.close();	 Catch:{ IllegalArgumentException -> 0x01fc }
    L_0x01f1:
        throw r0;
    L_0x01f2:
        if (r2 == 0) goto L_0x019a;
    L_0x01f4:
        r2.close();	 Catch:{ IllegalArgumentException -> 0x01f8 }
        goto L_0x019a;
    L_0x01f8:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01fa }
    L_0x01fa:
        r1 = move-exception;
        goto L_0x019a;
    L_0x01fc:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01fe }
    L_0x01fe:
        r1 = move-exception;
        goto L_0x01f1;
    L_0x0200:
        r1 = move-exception;
        goto L_0x019a;
    L_0x0202:
        r0 = move-exception;
        goto L_0x01d4;
    L_0x0204:
        r0 = move-exception;
        r4 = r3;
        goto L_0x01d4;
    L_0x0207:
        r0 = move-exception;
        r4 = r2;
        r5 = r3;
        goto L_0x01d4;
    L_0x020b:
        r0 = move-exception;
        r2 = r4;
        r3 = r4;
        goto L_0x00a7;
    L_0x0210:
        r0 = move-exception;
        r2 = r4;
        r3 = r5;
        goto L_0x00a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xo.b(double, double, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean a(java.lang.Void[] r7) {
        /*
        r6 = this;
        r5 = 1;
        r0 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r6.b;	 Catch:{ InterruptedException -> 0x005a }
        if (r2 != 0) goto L_0x0066;
    L_0x0008:
        r2 = r6.f;	 Catch:{ InterruptedException -> 0x005a }
        if (r2 != 0) goto L_0x0019;
    L_0x000c:
        r2 = 40;
        if (r0 >= r2) goto L_0x0019;
    L_0x0010:
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x007f, IllegalArgumentException -> 0x005c }
    L_0x0015:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0008;
    L_0x0019:
        r0 = r6.f;	 Catch:{ InterruptedException -> 0x005e }
        if (r0 == 0) goto L_0x0023;
    L_0x001d:
        r0 = r6.i;	 Catch:{ InterruptedException -> 0x0060 }
        r6.b = r0;	 Catch:{ InterruptedException -> 0x0060 }
        if (r1 == 0) goto L_0x0066;
    L_0x0023:
        r0 = r6.l;	 Catch:{ InterruptedException -> 0x0062 }
        if (r0 == 0) goto L_0x004c;
    L_0x0027:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0064 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0064 }
        r2 = z;	 Catch:{ InterruptedException -> 0x0064 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0064 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x0064 }
        r2 = r6.l;	 Catch:{ InterruptedException -> 0x0064 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x0064 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x0064 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x0064 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0064 }
        r0 = r6.l;	 Catch:{ InterruptedException -> 0x0064 }
        r6.b = r0;	 Catch:{ InterruptedException -> 0x0064 }
        if (r1 == 0) goto L_0x0066;
    L_0x004c:
        r0 = z;	 Catch:{ InterruptedException -> 0x0064 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0064 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0064 }
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ InterruptedException -> 0x0064 }
    L_0x0059:
        return r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = r6.b;
        r0 = r0.getLatitude();
        r2 = r6.b;
        r2 = r2.getLongitude();
        r4 = r6.e;
        r0 = a(r0, r2, r4);
        r6.g = r0;
        r0 = java.lang.Boolean.valueOf(r5);
        goto L_0x0059;
    L_0x007f:
        r2 = move-exception;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xo.a(java.lang.Void[]):java.lang.Boolean");
    }

    public void onPreExecute() {
        b();
        this.c.transferring = true;
        App.aK.a(this.k, false, -1);
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public static byte[] a(double d, double d2) {
        return a(d, d2, m);
    }

    public void a() {
        try {
            if (this.h != null) {
                if (this.a != null) {
                    try {
                        if (App.p.o(z[22]) == 0) {
                            this.h.removeUpdates(this.a);
                        }
                        this.a = null;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                try {
                    if (this.d != null) {
                        if (App.p.o(z[21]) == 0) {
                            this.h.removeUpdates(this.d);
                        }
                        this.d = null;
                    }
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

    public xo(Context context, co coVar) {
        this.e = m;
        this.g = null;
        this.j = 0;
        this.i = null;
        this.l = null;
        this.k = coVar;
        this.c = (MediaData) coVar.Q;
        this.h = (LocationManager) context.getSystemService(z[9]);
        if (coVar.m != 0.0d) {
            try {
                if (coVar.l != 0.0d) {
                    this.b = new Location("");
                    this.b.setLatitude(coVar.m);
                    this.b.setLongitude(coVar.l);
                    this.f = true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static byte[] a(double d, double d2, int i) {
        byte[] bArr = null;
        Bitmap b = b(d, d2, i);
        if (b != null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            b.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
            }
            b.recycle();
        }
        return bArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Boolean r6) {
        /*
        r5 = this;
        r3 = 1;
        r2 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.c;
        r0.transferring = r2;
        r0 = r6.booleanValue();
        if (r0 == 0) goto L_0x0047;
    L_0x000e:
        r0 = r5.c;
        r0.transferred = r3;
        r0 = r5.k;
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r2 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r3 = 1;
        r2.u = r3;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r3 = r5.g;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2.a(r3);	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2.Q = r0;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r0 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0092 }
        if (r0 == 0) goto L_0x0040;
    L_0x002c:
        r0 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r2.getLatitude();	 Catch:{ IllegalArgumentException -> 0x0092 }
        r0.m = r2;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r0 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r2.getLongitude();	 Catch:{ IllegalArgumentException -> 0x0092 }
        r0.l = r2;	 Catch:{ IllegalArgumentException -> 0x0092 }
    L_0x0040:
        r0 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0094 }
        com.whatsapp.App.c(r0);	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r1 == 0) goto L_0x008e;
    L_0x0047:
        r0 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r2 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r3 = 0;
        r4 = -1;
        r0.a(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0094 }
        r0 = r5.h;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0094 }
        r0 = r0.isProviderEnabled(r2);	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r0 != 0) goto L_0x008e;
    L_0x005d:
        r0 = com.whatsapp.Conversation.F();
        r2 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0096 }
        if (r2 == 0) goto L_0x0083;
    L_0x0067:
        r2 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.ae;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = r5.k;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0098 }
        if (r2 == 0) goto L_0x0083;
    L_0x0079:
        r0 = r0.b();	 Catch:{ IllegalArgumentException -> 0x009a }
        r2 = 2;
        r0.showDialog(r2);	 Catch:{ IllegalArgumentException -> 0x009a }
        if (r1 == 0) goto L_0x008e;
    L_0x0083:
        r0 = com.whatsapp.Conversation.aC;	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r5.k;	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r1.k;	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x009a }
        r0.add(r1);	 Catch:{ IllegalArgumentException -> 0x009a }
    L_0x008e:
        r5.a();
        return;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xo.a(java.lang.Boolean):void");
    }

    public void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
