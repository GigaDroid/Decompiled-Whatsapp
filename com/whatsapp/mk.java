package com.whatsapp;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Pair;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.bm;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.EntityTemplate;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class mk {
    private static final String[] z;
    private int a;
    private final List b;
    private final AtomicReference c;
    private final String d;
    private final List e;
    private final ui f;
    private final List g;
    private final List h;

    static {
        String[] strArr = new String[41];
        String str = "\u001a@Nh\u0003";
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
                        i3 = 114;
                        break;
                    case at.g /*1*/:
                        i3 = 52;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 112;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "3WY}\u0000\u0006\u0019\u007fv\u0013\u001dPSv\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001bP_v\u0004\u001b@C";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001bP_v\u0004\u001b@C";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001fAVl\u0019\u0002UHl_\u0014[Hu]\u0016UNyKRVUm\u001e\u0016UHaM";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "1[Tl\u0015\u001c@\u0017L\t\u0002Q";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "3WY}\u0000\u0006\u0019\u007fv\u0013\u001dPSv\u0017";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "'G_j]3S_v\u0004";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "'`|5H";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "_\u0019";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u007f>";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "P\u000f\u001a~\u0019\u001eQTy\u001d\u0017\t\u0018";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "1[Tl\u0015\u001c@\u0017\\\u0019\u0001DUk\u0019\u0006]UvJRRUj\u001d_P[l\u0011I\u0014Ty\u001d\u0017\t\u0018";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ".h";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "P90\u0015z";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ".\u0016";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u007f>";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "1[Tl\u0015\u001c@\u0017\\\u0019\u0001DUk\u0019\u0006]UvJRRUj\u001d_P[l\u0011I\u0014Ty\u001d\u0017\t\u0018";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0014USt\u0005\u0000Q\u001a|\u0005\u0000]T\u007fP\u001eUN} \u001dGNH\u0011\u0000UW8\u0013\u0013XV#P\u001cUW}M";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "1[Tl\u0015\u001c@\u0017\\\u0019\u0001DUk\u0019\u0006]UvJRRUj\u001d_P[l\u0011I\u0014Ty\u001d\u0017\t\u0018";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "P90";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "_\u0019";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "_\u001e\u00152}x";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    str = "P90\u0015z";
                    obj = 23;
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = ".\u0016";
                    obj = 24;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u007f>";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ".\u0016";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "_\u00197\u0012";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ".\u0016";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ".h";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "P90";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0014USt\u0005\u0000Q\u001a|\u0005\u0000]T\u007fP\u001eUN} \u001dGNH\u0011\u0000UW8\u0013\u0013XV#P\u001cUW}M";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "1[Tl\u0015\u001c@\u0017\\\u0019\u0001DUk\u0019\u0006]UvJRRUj\u001d_P[l\u0011I\u0014Ty\u001d\u0017\t\u0018";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "1[Tl\u0015\u001c@\u0017J\u0011\u001cS_\"P\u0010MN}\u0003R";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "_\u0019";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ".h";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "_\u0019";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "I\u0014_%";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "1[Tl\u0015\u001c@\u0017L\t\u0002Q\u00008\u0011\u0002DVq\u0013\u0013@Sw\u001e][Yl\u0015\u0006\u0019Il\u0002\u0017UW\u0015z";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = ".h";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001fAVl\u0019\u0002UHl_\u0014[Hu]\u0016UNyKRVUm\u001e\u0016UHaM";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b(@NonNull String str, @NonNull String str2) {
        this.h.add(new Pair(str, str2));
    }

    public void a(@NonNull String str, @NonNull String str2) {
        this.e.add(new Pair(str, str2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r17, java.io.OutputStream r18) {
        /*
        r16 = this;
        r9 = com.whatsapp.amb.a;
        r0 = r16;
        r2 = r0.c;
        r2 = r2.get();
        r2 = (java.net.Socket) r2;
        r4 = 0;
        r3 = 0;
        if (r2 == 0) goto L_0x0390;
    L_0x0010:
        r3 = com.whatsapp.util.NativeUtils.getFileDescriptorForSocket(r2);	 Catch:{ UnsupportedOperationException -> 0x01a0 }
        r2 = 1;
    L_0x0015:
        r4 = r3;
        r3 = r2;
    L_0x0017:
        r2 = 0;
        r5 = 2;
        r10 = new byte[r5];
        r10 = {13, 10};
        r0 = r16;
        r5 = r0.b;
        r11 = r5.iterator();
        r5 = r2;
    L_0x0027:
        r2 = r11.hasNext();
        if (r2 == 0) goto L_0x01b7;
    L_0x002d:
        r2 = r11.next();
        r2 = (com.whatsapp.wv) r2;
        if (r5 == 0) goto L_0x003a;
    L_0x0035:
        r0 = r18;
        r0.write(r10);	 Catch:{ UnsupportedOperationException -> 0x01aa }
    L_0x003a:
        r5 = 1;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 37;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r17;
        r6 = r6.append(r0);
        r7 = z;
        r8 = 11;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r6 = r6.toString();
        r6 = r6.getBytes();
        r0 = r18;
        r0.write(r6);
        r6 = r2.d;
        r7 = "\\";
        r8 = z;
        r12 = 30;
        r8 = r8[r12];
        r6 = r6.replace(r7, r8);
        r7 = "\"";
        r8 = z;
        r12 = 27;
        r8 = r8[r12];
        r6 = r6.replace(r7, r8);
        r7 = r2.c;
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 != 0) goto L_0x00e1;
    L_0x008b:
        r7 = r2.c;
        r8 = "\\";
        r12 = z;
        r13 = 40;
        r12 = r12[r13];
        r7 = r7.replace(r8, r12);
        r8 = "\"";
        r12 = z;
        r13 = 16;
        r12 = r12[r13];
        r7 = r7.replace(r8, r12);
        r8 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8.<init>();	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r12 = z;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r13 = 20;
        r12 = r12[r13];	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8 = r8.append(r12);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8 = r8.append(r6);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r12 = z;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r13 = 12;
        r12 = r12[r13];	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8 = r8.append(r12);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7 = r8.append(r7);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8 = z;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r12 = 21;
        r8 = r8[r12];	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7 = r7.append(r8);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7 = r7.toString();	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7 = r7.getBytes();	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r0 = r18;
        r0.write(r7);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        if (r9 == 0) goto L_0x010b;
    L_0x00e1:
        r7 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7.<init>();	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8 = z;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r12 = 13;
        r8 = r8[r12];	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7 = r7.append(r8);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r6 = r7.append(r6);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r7 = z;	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r8 = 31;
        r7 = r7[r8];	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r6 = r6.append(r7);	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r6 = r6.toString();	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r6 = r6.getBytes();	 Catch:{ UnsupportedOperationException -> 0x01ac }
        r0 = r18;
        r0.write(r6);	 Catch:{ UnsupportedOperationException -> 0x01ac }
    L_0x010b:
        r6 = z;	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r7 = 39;
        r6 = r6[r7];	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r6.getBytes();	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r0 = r18;
        r0.write(r6);	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r2.a;	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r12 = 0;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 <= 0) goto L_0x014e;
    L_0x0122:
        r6 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6.<init>();	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r7 = z;	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r8 = 34;
        r7 = r7[r8];	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r6.append(r7);	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r12 = r2.a;	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r6.append(r12);	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r7 = z;	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r8 = 23;
        r7 = r7[r8];	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r6.append(r7);	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r6.toString();	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r6 = r6.getBytes();	 Catch:{ UnsupportedOperationException -> 0x01ae }
        r0 = r18;
        r0.write(r6);	 Catch:{ UnsupportedOperationException -> 0x01ae }
    L_0x014e:
        r0 = r18;
        r0.write(r10);
        r6 = r2.a;
    L_0x0155:
        r12 = 0;
        r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r8 <= 0) goto L_0x0164;
    L_0x015b:
        r8 = r2.b;
        r12 = r8.skip(r6);
        r6 = r6 - r12;
        if (r9 == 0) goto L_0x0155;
    L_0x0164:
        r6 = r2.a;
        r8 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r12 = new byte[r8];
    L_0x016a:
        r8 = r2.b;
        r8 = r8.read(r12);
        r13 = -1;
        if (r8 == r13) goto L_0x01b5;
    L_0x0173:
        r13 = 0;
        r0 = r18;
        r0.write(r12, r13, r8);
        r14 = (long) r8;
        r6 = r6 + r14;
        r0 = r16;
        r8 = r0.f;	 Catch:{ UnsupportedOperationException -> 0x01b0 }
        if (r8 == 0) goto L_0x0194;
    L_0x0181:
        if (r3 == 0) goto L_0x0189;
    L_0x0183:
        r8 = com.whatsapp.util.NativeUtils.getBytesInSocketOutputQueue(r4);	 Catch:{ UnsupportedOperationException -> 0x01b2 }
    L_0x0187:
        if (r9 == 0) goto L_0x018a;
    L_0x0189:
        r8 = 0;
    L_0x018a:
        r0 = r16;
        r13 = r0.f;
        r14 = (long) r8;
        r14 = r6 - r14;
        r13.a(r14);
    L_0x0194:
        r8 = java.lang.Thread.currentThread();
        r8 = r8.isInterrupted();
        if (r8 == 0) goto L_0x016a;
    L_0x019e:
        r2 = 0;
    L_0x019f:
        return r2;
    L_0x01a0:
        r4 = move-exception;
        r3 = 0;
        r2 = 0;
        com.whatsapp.util.Log.c(r4);
        r4 = r3;
        r3 = r2;
        goto L_0x0017;
    L_0x01aa:
        r2 = move-exception;
        throw r2;
    L_0x01ac:
        r2 = move-exception;
        throw r2;
    L_0x01ae:
        r2 = move-exception;
        throw r2;
    L_0x01b0:
        r2 = move-exception;
        throw r2;
    L_0x01b2:
        r8 = move-exception;
        r8 = 0;
        goto L_0x0187;
    L_0x01b5:
        if (r9 == 0) goto L_0x0027;
    L_0x01b7:
        r0 = r16;
        r2 = r0.h;
        r4 = r2.iterator();
    L_0x01bf:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0256;
    L_0x01c5:
        r2 = r4.next();
        r2 = (android.util.Pair) r2;
        r3 = r2.first;
        r3 = (java.lang.String) r3;
        r6 = "\\";
        r7 = z;
        r8 = 14;
        r7 = r7[r8];
        r3 = r3.replace(r6, r7);
        r6 = "\"";
        r7 = z;
        r8 = 29;
        r7 = r7[r8];
        r3 = r3.replace(r6, r7);
        if (r5 == 0) goto L_0x01f0;
    L_0x01eb:
        r0 = r18;
        r0.write(r10);	 Catch:{ UnsupportedOperationException -> 0x0331 }
    L_0x01f0:
        r5 = 1;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 35;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r17;
        r6 = r6.append(r0);
        r7 = z;
        r8 = 17;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r6 = r6.toString();
        r6 = r6.getBytes();
        r0 = r18;
        r0.write(r6);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 33;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r3 = r6.append(r3);
        r6 = z;
        r7 = 24;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r3 = r3.toString();
        r3 = r3.getBytes();
        r0 = r18;
        r0.write(r3);
        r2 = r2.second;
        r2 = (java.lang.String) r2;
        r2 = r2.getBytes();
        r0 = r18;
        r0.write(r2);
        if (r9 == 0) goto L_0x01bf;
    L_0x0256:
        r0 = r16;
        r2 = r0.g;
        r4 = r2.iterator();
    L_0x025e:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x02fb;
    L_0x0264:
        r2 = r4.next();
        r2 = (android.util.Pair) r2;
        r3 = r2.first;
        r3 = (java.lang.String) r3;
        r6 = "\\";
        r7 = z;
        r8 = 36;
        r7 = r7[r8];
        r3 = r3.replace(r6, r7);
        r6 = "\"";
        r7 = z;
        r8 = 25;
        r7 = r7[r8];
        r3 = r3.replace(r6, r7);
        if (r5 == 0) goto L_0x028f;
    L_0x028a:
        r0 = r18;
        r0.write(r10);	 Catch:{ UnsupportedOperationException -> 0x0333 }
    L_0x028f:
        r5 = 1;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 10;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r17;
        r6 = r6.append(r0);
        r7 = z;
        r8 = 26;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r6 = r6.toString();
        r6 = r6.getBytes();
        r0 = r18;
        r0.write(r6);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 18;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r3 = r6.append(r3);
        r6 = z;
        r7 = 15;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r3 = r3.toString();
        r3 = r3.getBytes();
        r0 = r18;
        r0.write(r3);
        r3 = r2.second;	 Catch:{ Exception -> 0x0335 }
        r3 = (java.util.concurrent.Callable) r3;	 Catch:{ Exception -> 0x0335 }
        r3 = r3.call();	 Catch:{ Exception -> 0x0335 }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x0335 }
        r3 = r3.getBytes();	 Catch:{ Exception -> 0x0335 }
        r0 = r18;
        r0.write(r3);	 Catch:{ Exception -> 0x0335 }
        if (r9 == 0) goto L_0x025e;
    L_0x02fb:
        if (r5 == 0) goto L_0x0302;
    L_0x02fd:
        r0 = r18;
        r0.write(r10);	 Catch:{ UnsupportedOperationException -> 0x038e }
    L_0x0302:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 28;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = r2.getBytes();
        r0 = r18;
        r0.write(r2);
        r2 = 1;
        goto L_0x019f;
    L_0x0331:
        r2 = move-exception;
        throw r2;
    L_0x0333:
        r2 = move-exception;
        throw r2;
    L_0x0335:
        r3 = move-exception;
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ UnsupportedOperationException -> 0x035d }
        r5 = 9;
        if (r4 < r5) goto L_0x035f;
    L_0x033c:
        r4 = new java.io.IOException;	 Catch:{ UnsupportedOperationException -> 0x035d }
        r5 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x035d }
        r5.<init>();	 Catch:{ UnsupportedOperationException -> 0x035d }
        r6 = z;	 Catch:{ UnsupportedOperationException -> 0x035d }
        r7 = 32;
        r6 = r6[r7];	 Catch:{ UnsupportedOperationException -> 0x035d }
        r5 = r5.append(r6);	 Catch:{ UnsupportedOperationException -> 0x035d }
        r2 = r2.first;	 Catch:{ UnsupportedOperationException -> 0x035d }
        r2 = (java.lang.String) r2;	 Catch:{ UnsupportedOperationException -> 0x035d }
        r2 = r5.append(r2);	 Catch:{ UnsupportedOperationException -> 0x035d }
        r2 = r2.toString();	 Catch:{ UnsupportedOperationException -> 0x035d }
        r4.<init>(r2, r3);	 Catch:{ UnsupportedOperationException -> 0x035d }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x035d }
    L_0x035d:
        r2 = move-exception;
        throw r2;
    L_0x035f:
        r4 = new java.io.IOException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 19;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r2 = r2.first;
        r2 = (java.lang.String) r2;
        r2 = r5.append(r2);
        r5 = z;
        r6 = 38;
        r5 = r5[r6];
        r2 = r2.append(r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r4.<init>(r2);
        throw r4;
    L_0x038e:
        r2 = move-exception;
        throw r2;
    L_0x0390:
        r2 = r3;
        r3 = r4;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mk.a(java.lang.String, java.io.OutputStream):boolean");
    }

    public void a(InputStream inputStream, String str, String str2, long j) {
        this.b.add(new wv(inputStream, str, str2, j, null));
    }

    private HttpClient a() {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
        HttpProtocolParams.setContentCharset(basicHttpParams, z[9]);
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        return new DefaultHttpClient(new SingleClientConnManager(basicHttpParams, a(true)), basicHttpParams);
    }

    public void a(@NonNull String str, @NonNull Callable callable) {
        this.g.add(new Pair(str, callable));
    }

    private boolean b(String str) {
        int i = amb.a;
        HttpClient a = a();
        HttpEntity entityTemplate = new EntityTemplate(new awl(this, str));
        entityTemplate.setChunked(true);
        entityTemplate.setContentType(z[1] + str);
        HttpUriRequest httpPost = new HttpPost(c().toString());
        httpPost.setHeader(z[2], z[3]);
        httpPost.setEntity(entityTemplate);
        HttpResponse execute = a.execute(httpPost);
        try {
            if (Thread.currentThread().isInterrupted()) {
                return false;
            }
            this.a = execute.getStatusLine().getStatusCode();
            Map hashMap = new HashMap();
            Header[] allHeaders = execute.getAllHeaders();
            int length = allHeaders.length;
            int i2 = 0;
            while (i2 < length) {
                Header header = allHeaders[i2];
                List list = (List) hashMap.get(header.getName());
                if (list == null) {
                    list = new LinkedList();
                    hashMap.put(header.getName(), list);
                }
                list.add(header.getValue());
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(execute.getEntity().getContent()));
            try {
                if (!a(hashMap, inputStreamReader)) {
                    return false;
                }
                inputStreamReader.close();
                return true;
            } finally {
                inputStreamReader.close();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public static SchemeRegistry a(boolean z) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(z[0], new a40(z), 443));
        return schemeRegistry;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r8) {
        /*
        r7 = this;
        r2 = 1;
        r1 = 0;
        r0 = r7.c();
        r0 = r0.openConnection();
        r0 = (javax.net.ssl.HttpsURLConnection) r0;
        r3 = com.whatsapp.App.am;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r4 = 2;
        if (r3 < r4) goto L_0x001f;
    L_0x0011:
        r3 = new com.whatsapp.messaging.at;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r4 = r7.c;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r3.<init>(r4);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r0.setSSLSocketFactory(r3);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r3 = com.whatsapp.amb.a;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        if (r3 == 0) goto L_0x0026;
    L_0x001f:
        r3 = com.whatsapp.messaging.at.b();	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r0.setSSLSocketFactory(r3);	 Catch:{ UnsupportedOperationException -> 0x0089 }
    L_0x0026:
        r3 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0.setConnectTimeout(r3);	 Catch:{ all -> 0x008b }
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.setReadTimeout(r3);	 Catch:{ all -> 0x008b }
        r3 = z;	 Catch:{ all -> 0x008b }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ all -> 0x008b }
        r4 = com.whatsapp.vn.a();	 Catch:{ all -> 0x008b }
        r0.setRequestProperty(r3, r4);	 Catch:{ all -> 0x008b }
        r3 = z;	 Catch:{ all -> 0x008b }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ all -> 0x008b }
        r4 = z;	 Catch:{ all -> 0x008b }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ all -> 0x008b }
        r0.setRequestProperty(r3, r4);	 Catch:{ all -> 0x008b }
        r3 = z;	 Catch:{ all -> 0x008b }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ all -> 0x008b }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>();	 Catch:{ all -> 0x008b }
        r5 = z;	 Catch:{ all -> 0x008b }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ all -> 0x008b }
        r4 = r4.append(r5);	 Catch:{ all -> 0x008b }
        r4 = r4.append(r8);	 Catch:{ all -> 0x008b }
        r4 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.setRequestProperty(r3, r4);	 Catch:{ all -> 0x008b }
        r3 = 1;
        r0.setDoOutput(r3);	 Catch:{ all -> 0x008b }
        r3 = 0;
        r0.setChunkedStreamingMode(r3);	 Catch:{ all -> 0x008b }
        r3 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x008b }
        r4 = r0.getOutputStream();	 Catch:{ all -> 0x008b }
        r3.<init>(r4);	 Catch:{ all -> 0x008b }
        r4 = r7.a(r8, r3);	 Catch:{ all -> 0x00b9 }
        if (r4 != 0) goto L_0x0090;
    L_0x007f:
        r3.close();	 Catch:{ all -> 0x008b }
        r0.disconnect();
        r0 = r1;
    L_0x0086:
        return r0;
    L_0x0087:
        r1 = move-exception;
        throw r1;	 Catch:{ UnsupportedOperationException -> 0x0089 }
    L_0x0089:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x008b }
    L_0x008b:
        r1 = move-exception;
        r0.disconnect();
        throw r1;
    L_0x0090:
        r3.close();	 Catch:{ all -> 0x008b }
        r3 = r0.getResponseCode();	 Catch:{ all -> 0x008b }
        r7.a = r3;	 Catch:{ all -> 0x008b }
        r3 = r0.getHeaderFields();	 Catch:{ all -> 0x008b }
        r4 = new java.io.InputStreamReader;	 Catch:{ all -> 0x008b }
        r5 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x008b }
        r6 = r0.getInputStream();	 Catch:{ all -> 0x008b }
        r5.<init>(r6);	 Catch:{ all -> 0x008b }
        r4.<init>(r5);	 Catch:{ all -> 0x008b }
        r3 = r7.a(r3, r4);	 Catch:{ all -> 0x00c6 }
        if (r3 != 0) goto L_0x00be;
    L_0x00b1:
        r4.close();	 Catch:{ all -> 0x008b }
        r0.disconnect();
        r0 = r1;
        goto L_0x0086;
    L_0x00b9:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x008b }
        throw r1;	 Catch:{ all -> 0x008b }
    L_0x00be:
        r4.close();	 Catch:{ all -> 0x008b }
        r0.disconnect();
        r0 = r2;
        goto L_0x0086;
    L_0x00c6:
        r1 = move-exception;
        r4.close();	 Catch:{ all -> 0x008b }
        throw r1;	 Catch:{ all -> 0x008b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mk.a(java.lang.String):boolean");
    }

    static boolean a(mk mkVar, String str, OutputStream outputStream) {
        return mkVar.a(str, outputStream);
    }

    public mk(@NonNull String str, @Nullable ui uiVar) {
        int i = amb.a;
        this.e = new LinkedList();
        this.h = new LinkedList();
        this.g = new LinkedList();
        this.b = new LinkedList();
        this.c = new AtomicReference();
        this.d = str;
        this.f = uiVar;
        if (WAAppCompatActivity.c != 0) {
            amb.a = i + 1;
        }
    }

    public boolean b() {
        int i = amb.a;
        try {
            String uuid = UUID.randomUUID().toString();
            boolean b;
            if (bm.b()) {
                b = b(uuid);
                for (wv wvVar : this.b) {
                    try {
                        if (wvVar.b != null) {
                            wvVar.b.close();
                            continue;
                        }
                        if (i != 0) {
                            break;
                        }
                    } catch (UnsupportedOperationException e) {
                        throw e;
                    }
                }
                return b;
            }
            b = a(uuid);
            for (wv wvVar2 : this.b) {
                try {
                    if (wvVar2.b != null) {
                        wvVar2.b.close();
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                } catch (UnsupportedOperationException e2) {
                    throw e2;
                }
            }
            return b;
        } catch (Throwable th) {
            Throwable th2 = th;
            for (wv wvVar22 : this.b) {
                try {
                    if (wvVar22.b != null) {
                        wvVar22.b.close();
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                } catch (UnsupportedOperationException e22) {
                    throw e22;
                }
            }
        }
    }

    private boolean a(Map map, InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArr = new char[8192];
        do {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                stringBuilder.append(cArr, 0, read);
            } else {
                try {
                    if (this.f != null) {
                        this.f.a(map, stringBuilder.toString());
                    }
                    return true;
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
        } while (!Thread.currentThread().isInterrupted());
        return false;
    }

    public int d() {
        return this.a;
    }

    private URL c() {
        int i = amb.a;
        Builder buildUpon = Uri.parse(this.d).buildUpon();
        for (Pair pair : this.e) {
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
            if (i != 0) {
                break;
            }
        }
        return new URL(buildUpon.toString());
    }
}
