package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class pi {
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern g;
    private static final Pattern h;
    private static final Pattern o;
    private static final Pattern r;
    private static final String[] z;
    int a;
    String b;
    String c;
    byte[] f;
    long i;
    String j;
    long k;
    long l;
    int m;
    String n;
    String p;
    long q;

    private static HttpURLConnection a(URL url) {
        boolean z = DialogToastActivity.f;
        HttpURLConnection b = b(url);
        if (b == null) {
            return null;
        }
        int responseCode;
        b.setInstanceFollowRedirects(true);
        try {
            b.connect();
            responseCode = b.getResponseCode();
        } catch (ProtocolException e) {
            if (!e.toString().contains(z[44]) || z) {
                throw e;
            } else {
                responseCode = 303;
            }
        } catch (ProtocolException e2) {
            throw e2;
        }
        try {
            if (responseCode / 100 == 2) {
                return b;
            }
            try {
                if (responseCode / 100 != 3) {
                    b.disconnect();
                    return null;
                }
                b.disconnect();
                HttpURLConnection b2 = b(url);
                if (b2 == null) {
                    return null;
                }
                b2.setInstanceFollowRedirects(false);
                b2.connect();
                String str = "";
                HttpURLConnection httpURLConnection = b2;
                int responseCode2 = b2.getResponseCode();
                responseCode = 0;
                while (responseCode2 / 100 == 3 && responseCode < 20) {
                    Object headerField = httpURLConnection.getHeaderField(z[43]);
                    try {
                        if (TextUtils.isEmpty(headerField) && !z) {
                            break;
                        }
                        String headerField2 = httpURLConnection.getHeaderField(z[42]);
                        if (headerField2 != null) {
                            String[] split = headerField2.split(";");
                            if (split != null) {
                                try {
                                    if (split.length > 0) {
                                        headerField2 = split[0];
                                    }
                                } catch (ProtocolException e22) {
                                    throw e22;
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            str = str + z[41];
                        }
                        str = str + headerField2;
                        httpURLConnection.disconnect();
                        httpURLConnection = b(new URL(headerField));
                        if (httpURLConnection == null && !z) {
                            break;
                        }
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setRequestProperty(z[45], str);
                        httpURLConnection.connect();
                        responseCode2 = httpURLConnection.getResponseCode();
                        responseCode++;
                        if (z) {
                            break;
                        }
                    } catch (ProtocolException e222) {
                        throw e222;
                    }
                }
                b = httpURLConnection;
                try {
                    if (responseCode2 / 100 == 2) {
                        return b;
                    }
                    b.disconnect();
                    return null;
                } catch (ProtocolException e2222) {
                    throw e2222;
                }
            } catch (ProtocolException e22222) {
                throw e22222;
            }
        } catch (ProtocolException e222222) {
            throw e222222;
        }
    }

    public pi(String str) {
        this.b = str;
    }

    private static HashMap a(String str) {
        boolean z = DialogToastActivity.f;
        HashMap hashMap = new HashMap();
        Matcher matcher = d.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            Object group2 = matcher.group(2);
            if (group2 == null) {
                group2 = matcher.group(3);
            }
            hashMap.put(group, group2);
            if (z) {
                break;
            }
        }
        return hashMap;
    }

    private static HttpURLConnection b(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestProperty(z[52], z[49] + z[50].replace(' ', '_') + z[51]);
        return httpURLConnection;
    }

    public void c() {
        this.j = null;
        this.c = null;
        this.n = null;
        this.p = null;
    }

    public void a() {
        boolean z = DialogToastActivity.f;
        this.q = 0;
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.p)) {
            URL url = new URL(this.p);
            URLConnection openConnection = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL().openConnection();
            openConnection.setConnectTimeout(10000);
            openConnection.setReadTimeout(20000);
            InputStream inputStream = openConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            int i = 0;
            do {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1 && !z) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
                if (i > 307200) {
                    this.l = Long.MAX_VALUE;
                    this.q = System.currentTimeMillis() - currentTimeMillis;
                    throw new IOException(z[40] + this.p);
                }
            } while (!z);
            byteArrayOutputStream.close();
            inputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            Options options = new Options();
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inDither = true;
            options.inScaled = false;
            if (VERSION.SDK_INT >= 10) {
                options.inPreferQualityOverSpeed = true;
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length, options);
            this.a = options.outWidth;
            this.m = options.outHeight;
            if (this.a >= 100 && this.m >= 100) {
                options.inJustDecodeBounds = false;
                options.inSampleSize = Math.min(options.outWidth, options.outHeight) / 140;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length, options);
                if (decodeByteArray != null) {
                    int min = Math.min(140, Math.min(decodeByteArray.getWidth(), decodeByteArray.getHeight()));
                    int min2 = Math.min(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                    Config config = decodeByteArray.getConfig();
                    if (config == null) {
                        config = Config.ARGB_8888;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    canvas.drawColor(-1);
                    canvas.drawBitmap(decodeByteArray, new Rect((decodeByteArray.getWidth() - min2) / 2, (decodeByteArray.getHeight() - min2) / 2, (decodeByteArray.getWidth() + min2) / 2, (min2 + decodeByteArray.getHeight()) / 2), new Rect(0, 0, min, min), paint);
                    decodeByteArray.recycle();
                    OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    createBitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream2);
                    this.f = byteArrayOutputStream2.toByteArray();
                    this.l = (long) this.f.length;
                }
            }
            this.q = System.currentTimeMillis() - currentTimeMillis;
        }
    }

    static {
        String[] strArr = new String[54];
        String str = "M0hS_{.{W";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            int i3;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                char c = cArr[i4];
                switch (i4 % 5) {
                    case v.m /*0*/:
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 9;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i4] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    str = "J<dQ";
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "@8zWHM-}]UJ";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "K:3]WE:l";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "P4}X_";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "K:3AHH";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "P*`@NA/3P_W>{]JP4fZ";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "G5hFIA)";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    str = "P*`@NA/3AHH";
                    i = 8;
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    strArr2 = strArr3;
                    str = "K:3@SP1l";
                    i = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "P*`@NA/3@SP1l";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "M)lYJV2y";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "g2g@_J)$`CT8";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "P*`@NA/3@SP1l";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "V8e";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "L)}D\u0017A,|]L";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "K:3]WE:l";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "K:3@SP1l";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "P*`@NA/3P_W>{]JP4fZ";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "T/fD_V)p";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "M>fZ";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "M0hS_";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "K:3P_W>{]JP4fZ";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "@8zWHM-}]UJ";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "E-yX_\t)fAYLp`WUJpyF_G2dDUW8m";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "L/lR";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "M0hS_";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "P*`@NA/3]WE:l";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "G2g@_J)";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "P5|YXJ<`X";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "K:3P_W>{]JP4fZ";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "P5|YXJ<`X";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "P4}X_";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    str = "P*`@NA/3AHH";
                    i = 33;
                    i2 = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    strArr2 = strArr3;
                    str = "K:3AHH";
                    i = 34;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    str = "L)}D";
                    i = 35;
                    i2 = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    strArr2 = strArr3;
                    str = "E-yX_\t)fAYLp`WUJ";
                    i = 36;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "P*`@NA/3]WE:l";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "G2g@_J)";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "M0hS_\u0004)f[\u001aH<{S_\u0004";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u001f}";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "w8}\u0019yK2b]_";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "h2jUNM2g";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "p2f\u0014WE3p\u0014HA9`F_G)z";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "g2f_SA";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "q\tO\u0019\u0002";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "q\tO\u0019\u0002";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "g2g@_J)$`CT8";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "s5h@Ie-y\u001b";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u0016s8\u0006\u0014\u0011h9";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u0004\u001c";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    str = "q.lF\u0017e:lZN";
                    i = 51;
                    i2 = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    strArr2 = strArr3;
                    str = "q\tO\u0019\u0002";
                    i = 52;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    str = "\u00185lU^\u007f\u00037i\u0010\u001au'\u001e\u0013\u0018raQ[@c";
                    Object obj = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i3 = 36;
                                    break;
                                case at.g /*1*/:
                                    i3 = 93;
                                    break;
                                case at.i /*2*/:
                                    i3 = 9;
                                    break;
                                case at.o /*3*/:
                                    i3 = 52;
                                    break;
                                default:
                                    i3 = 58;
                                    break;
                            }
                            cArr2[i5] = (char) (i3 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                r = Pattern.compile(str, 34);
                                str = "\u00180l@[\f\u0006W\ng\u000fb \u001b\u0005\u001a";
                                obj = 1;
                                break;
                            case at.g /*1*/:
                                g = Pattern.compile(str, 34);
                                str = "\u00181`ZQ\f\u0006W\ng\u000fb \u001b\u0005\u001a";
                                obj = 2;
                                break;
                            case at.i /*2*/:
                                o = Pattern.compile(str, 34);
                                str = "x.#\u001caz`T\u001f\u0013x.#\tfWw!\u000b\u0000\u0006uRj\u0018yv \u0016Fxz!odxzT\u001f\u0013xz ";
                                obj = 3;
                                break;
                            case at.o /*3*/:
                                d = Pattern.compile(str, 34);
                                str = "\fb`\u001dfF>aUHW8}\tfWw+\u000b\u0012\u007f\u0003UG\u0001\u0006\u0000#\u001d";
                                obj = 4;
                                break;
                            case at.p /*4*/:
                                h = Pattern.compile(str, 34);
                                return;
                            default:
                                e = Pattern.compile(str, 34);
                                str = "\u0018)`@VA\u0006W\ng\u000ec!\u001a\u0010\ra&@SP1l\n";
                                obj = null;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = "\u000br";
                    i = 0;
                    break;
            }
        }
    }

    private static byte[] b(URLConnection uRLConnection) {
        boolean z = DialogToastActivity.f;
        InputStream inputStream = uRLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i = 0;
        do {
            int read = inputStream.read(bArr, 0, 1024);
            if (read == -1 && !z) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            i += read;
            if (i > 65536 && !z) {
                break;
            }
            if (e.matcher(new String(byteArrayOutputStream.toByteArray(), z[46])).find() && !z) {
                break;
            }
        } while (!z);
        inputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.net.URL r11, java.lang.String r12, java.lang.String r13) {
        /*
        r10 = this;
        r9 = com.whatsapp.DialogToastActivity.f;
        r0 = e;
        r0 = r0.matcher(r12);
        r1 = r0.find();
        if (r1 == 0) goto L_0x0015;
    L_0x000e:
        r1 = 1;
        r0 = r0.group(r1);
        if (r9 == 0) goto L_0x036d;
    L_0x0015:
        r1 = 0;
        r3 = new java.util.HashMap;
        r3.<init>();
        r0 = g;
        r4 = r0.matcher(r12);
    L_0x0021:
        r0 = r4.find();
        if (r0 == 0) goto L_0x0183;
    L_0x0027:
        r0 = 1;
        r0 = r4.group(r0);
        r5 = a(r0);
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0056;
    L_0x0042:
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ URISyntaxException -> 0x0052 }
        if (r1 != 0) goto L_0x00ad;
    L_0x0048:
        r1 = r0.equalsIgnoreCase(r13);	 Catch:{ URISyntaxException -> 0x0052 }
        if (r1 != 0) goto L_0x00ad;
    L_0x004e:
        r10.c();	 Catch:{ URISyntaxException -> 0x0054 }
    L_0x0051:
        return r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = z;
        r2 = 13;
        r2 = r0[r2];
        r0 = z;
        r6 = 16;
        r0 = r0[r6];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r2.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x006e:
        r0 = z;
        r2 = 29;
        r0 = r0[r2];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x00ae;
    L_0x0080:
        r2 = h;
        r0 = r2.matcher(r0);
        r2 = r0.find();
        if (r2 == 0) goto L_0x00ae;
    L_0x008c:
        r1 = 1;
        r0 = r0.group(r1);
        r0 = r0.trim();
        r0 = r0.toUpperCase();
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ URISyntaxException -> 0x00ab }
        if (r1 != 0) goto L_0x00ad;
    L_0x009f:
        r1 = r0.equalsIgnoreCase(r13);	 Catch:{ URISyntaxException -> 0x00ab }
        if (r1 != 0) goto L_0x00ad;
    L_0x00a5:
        r10.c();	 Catch:{ URISyntaxException -> 0x00a9 }
        goto L_0x0051;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x00a9 }
    L_0x00ad:
        r1 = r0;
    L_0x00ae:
        r0 = z;
        r2 = 20;
        r0 = r0[r2];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x036a;
    L_0x00c0:
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x036a;
    L_0x00d1:
        r0 = z;
        r2 = 12;
        r0 = r0[r2];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r2 = r0;
    L_0x00de:
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ URISyntaxException -> 0x0335 }
        if (r0 != 0) goto L_0x0181;
    L_0x00e4:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0335 }
        r6 = 4;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0335 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0335 }
        if (r0 != 0) goto L_0x0170;
    L_0x00ef:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0337 }
        r6 = 27;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0337 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0337 }
        if (r0 != 0) goto L_0x0170;
    L_0x00fb:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0339 }
        r6 = 30;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0339 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0339 }
        if (r0 != 0) goto L_0x0170;
    L_0x0107:
        r0 = z;	 Catch:{ URISyntaxException -> 0x033b }
        r6 = 28;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x033b }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x033b }
        if (r0 != 0) goto L_0x0170;
    L_0x0113:
        r0 = z;	 Catch:{ URISyntaxException -> 0x033d }
        r6 = 10;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x033d }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x033d }
        if (r0 != 0) goto L_0x0170;
    L_0x011f:
        r0 = z;	 Catch:{ URISyntaxException -> 0x033f }
        r6 = 5;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x033f }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x033f }
        if (r0 != 0) goto L_0x0170;
    L_0x012a:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0341 }
        r6 = 11;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0341 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0341 }
        if (r0 != 0) goto L_0x0170;
    L_0x0136:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0343 }
        r6 = 31;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0343 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0343 }
        if (r0 != 0) goto L_0x0170;
    L_0x0142:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0345 }
        r6 = 3;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0345 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0345 }
        if (r0 != 0) goto L_0x0170;
    L_0x014d:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0347 }
        r6 = 7;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0347 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0347 }
        if (r0 != 0) goto L_0x0170;
    L_0x0158:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0349 }
        r6 = 35;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x0349 }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x0349 }
        if (r0 != 0) goto L_0x0170;
    L_0x0164:
        r0 = z;	 Catch:{ URISyntaxException -> 0x034b }
        r6 = 34;
        r0 = r0[r6];	 Catch:{ URISyntaxException -> 0x034b }
        r0 = r0.equals(r2);	 Catch:{ URISyntaxException -> 0x034b }
        if (r0 == 0) goto L_0x0181;
    L_0x0170:
        r0 = z;
        r6 = 39;
        r0 = r0[r6];
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0181;
    L_0x017e:
        r3.put(r2, r0);	 Catch:{ URISyntaxException -> 0x034d }
    L_0x0181:
        if (r9 == 0) goto L_0x0021;
    L_0x0183:
        r8 = r1;
        r0 = 4;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r2 = z;
        r4 = 17;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 1;
        r2 = z;
        r4 = 38;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 2;
        r2 = z;
        r4 = 22;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 3;
        r2 = z;
        r4 = 32;
        r2 = r2[r4];
        r0[r1] = r2;
        r0 = a(r3, r0);
        r10.p = r0;
        r0 = 3;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r2 = z;
        r4 = 18;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 1;
        r2 = z;
        r4 = 14;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 2;
        r2 = z;
        r4 = 33;
        r2 = r2[r4];
        r0[r1] = r2;
        r0 = a(r3, r0);
        r10.j = r0;
        r0 = 3;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r2 = z;
        r4 = 23;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 1;
        r2 = z;
        r4 = 19;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 2;
        r2 = z;
        r4 = 24;
        r2 = r2[r4];
        r0[r1] = r2;
        r0 = a(r3, r0);
        r10.c = r0;
        r0 = 2;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r2 = z;
        r4 = 6;
        r2 = r2[r4];
        r0[r1] = r2;
        r1 = 1;
        r2 = z;
        r4 = 9;
        r2 = r2[r4];
        r0[r1] = r2;
        r0 = a(r3, r0);
        r10.n = r0;
        r0 = r10.p;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0281;
    L_0x021b:
        r0 = o;
        r1 = r0.matcher(r12);
    L_0x0221:
        r0 = r1.find();
        if (r0 == 0) goto L_0x0281;
    L_0x0227:
        r0 = 1;
        r0 = r1.group(r0);
        r2 = a(r0);
        r0 = z;
        r3 = 15;
        r0 = r0[r3];
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ URISyntaxException -> 0x034f }
        if (r3 != 0) goto L_0x027f;
    L_0x0242:
        r3 = z;	 Catch:{ URISyntaxException -> 0x034f }
        r4 = 21;
        r3 = r3[r4];	 Catch:{ URISyntaxException -> 0x034f }
        r3 = r3.equals(r0);	 Catch:{ URISyntaxException -> 0x034f }
        if (r3 != 0) goto L_0x0271;
    L_0x024e:
        r3 = z;	 Catch:{ URISyntaxException -> 0x0351 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ URISyntaxException -> 0x0351 }
        r3 = r3.equals(r0);	 Catch:{ URISyntaxException -> 0x0351 }
        if (r3 != 0) goto L_0x0271;
    L_0x0259:
        r3 = z;	 Catch:{ URISyntaxException -> 0x0353 }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ URISyntaxException -> 0x0353 }
        r3 = r3.equals(r0);	 Catch:{ URISyntaxException -> 0x0353 }
        if (r3 != 0) goto L_0x0271;
    L_0x0265:
        r3 = z;	 Catch:{ URISyntaxException -> 0x0355 }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ URISyntaxException -> 0x0355 }
        r0 = r3.equals(r0);	 Catch:{ URISyntaxException -> 0x0355 }
        if (r0 == 0) goto L_0x027f;
    L_0x0271:
        r0 = z;	 Catch:{ URISyntaxException -> 0x0357 }
        r3 = 26;
        r0 = r0[r3];	 Catch:{ URISyntaxException -> 0x0357 }
        r0 = r2.get(r0);	 Catch:{ URISyntaxException -> 0x0357 }
        r0 = (java.lang.String) r0;	 Catch:{ URISyntaxException -> 0x0357 }
        r10.p = r0;	 Catch:{ URISyntaxException -> 0x0357 }
    L_0x027f:
        if (r9 == 0) goto L_0x0221;
    L_0x0281:
        r0 = r10.p;	 Catch:{ URISyntaxException -> 0x0359 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ URISyntaxException -> 0x0359 }
        if (r0 != 0) goto L_0x02e9;
    L_0x0289:
        r0 = r10.p;	 Catch:{ URISyntaxException -> 0x0359 }
        r1 = z;	 Catch:{ URISyntaxException -> 0x0359 }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ URISyntaxException -> 0x0359 }
        r0 = r0.startsWith(r1);	 Catch:{ URISyntaxException -> 0x0359 }
        if (r0 != 0) goto L_0x02e9;
    L_0x0297:
        r0 = r10.p;	 Catch:{ URISyntaxException -> 0x035b }
        r1 = z;	 Catch:{ URISyntaxException -> 0x035b }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ URISyntaxException -> 0x035b }
        r0 = r0.startsWith(r1);	 Catch:{ URISyntaxException -> 0x035b }
        if (r0 == 0) goto L_0x02c6;
    L_0x02a4:
        r0 = new java.lang.StringBuilder;	 Catch:{ URISyntaxException -> 0x035d }
        r0.<init>();	 Catch:{ URISyntaxException -> 0x035d }
        r1 = r11.getProtocol();	 Catch:{ URISyntaxException -> 0x035d }
        r0 = r0.append(r1);	 Catch:{ URISyntaxException -> 0x035d }
        r1 = ":";
        r0 = r0.append(r1);	 Catch:{ URISyntaxException -> 0x035d }
        r1 = r10.p;	 Catch:{ URISyntaxException -> 0x035d }
        r0 = r0.append(r1);	 Catch:{ URISyntaxException -> 0x035d }
        r0 = r0.toString();	 Catch:{ URISyntaxException -> 0x035d }
        r10.p = r0;	 Catch:{ URISyntaxException -> 0x035d }
        if (r9 == 0) goto L_0x02e9;
    L_0x02c6:
        r0 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r1 = r11.getProtocol();	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r2 = r11.getUserInfo();	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r3 = r11.getHost();	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r4 = r11.getPort();	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r5 = r10.p;	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r6 = 0;
        r7 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r0 = r0.toURL();	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r0 = r0.toString();	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
        r10.p = r0;	 Catch:{ URISyntaxException -> 0x0368, MalformedURLException -> 0x035f }
    L_0x02e9:
        r0 = r10.j;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x030a;
    L_0x02f1:
        r0 = r;
        r0 = r0.matcher(r12);
    L_0x02f7:
        r1 = r0.find();
        if (r1 == 0) goto L_0x030a;
    L_0x02fd:
        r1 = 1;
        r1 = r0.group(r1);
        r1 = r1.trim();
        r10.j = r1;
        if (r9 == 0) goto L_0x02f7;
    L_0x030a:
        r0 = r10.j;	 Catch:{ URISyntaxException -> 0x0364 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ URISyntaxException -> 0x0364 }
        if (r0 != 0) goto L_0x031e;
    L_0x0312:
        r0 = r10.j;	 Catch:{ URISyntaxException -> 0x0364 }
        r0 = android.text.Html.fromHtml(r0);	 Catch:{ URISyntaxException -> 0x0364 }
        r0 = r0.toString();	 Catch:{ URISyntaxException -> 0x0364 }
        r10.j = r0;	 Catch:{ URISyntaxException -> 0x0364 }
    L_0x031e:
        r0 = r10.c;	 Catch:{ URISyntaxException -> 0x0366 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ URISyntaxException -> 0x0366 }
        if (r0 != 0) goto L_0x0332;
    L_0x0326:
        r0 = r10.c;	 Catch:{ URISyntaxException -> 0x0366 }
        r0 = android.text.Html.fromHtml(r0);	 Catch:{ URISyntaxException -> 0x0366 }
        r0 = r0.toString();	 Catch:{ URISyntaxException -> 0x0366 }
        r10.c = r0;	 Catch:{ URISyntaxException -> 0x0366 }
    L_0x0332:
        r0 = r8;
        goto L_0x0051;
    L_0x0335:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0337 }
    L_0x0337:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0339 }
    L_0x0339:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x033b }
    L_0x033b:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x033d }
    L_0x033d:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x033f }
    L_0x033f:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0341 }
    L_0x0341:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0343 }
    L_0x0343:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0345 }
    L_0x0345:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0347 }
    L_0x0347:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0349 }
    L_0x0349:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x034b }
    L_0x034b:
        r0 = move-exception;
        throw r0;
    L_0x034d:
        r0 = move-exception;
        throw r0;
    L_0x034f:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0351 }
    L_0x0351:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0353 }
    L_0x0353:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0355 }
    L_0x0355:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x0357 }
    L_0x0357:
        r0 = move-exception;
        throw r0;
    L_0x0359:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x035b }
    L_0x035b:
        r0 = move-exception;
        throw r0;	 Catch:{ URISyntaxException -> 0x035d }
    L_0x035d:
        r0 = move-exception;
        throw r0;
    L_0x035f:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x02e9;
    L_0x0364:
        r0 = move-exception;
        throw r0;
    L_0x0366:
        r0 = move-exception;
        throw r0;
    L_0x0368:
        r0 = move-exception;
        goto L_0x02e9;
    L_0x036a:
        r2 = r0;
        goto L_0x00de;
    L_0x036d:
        r12 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pi.a(java.net.URL, java.lang.String, java.lang.String):java.lang.String");
    }

    public void b() {
        boolean z = DialogToastActivity.f;
        this.k = 0;
        long uptimeMillis = SystemClock.uptimeMillis();
        URL url = new URL(this.b);
        URL toURL = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
        URLConnection a = a(toURL);
        if (a != null) {
            String str;
            if (App.am == 3) {
                for (Entry entry : a.getHeaderFields().entrySet()) {
                    if (z) {
                        break;
                    }
                }
            }
            String a2 = a(a);
            byte[] b = b(a);
            try {
                str = new String(b, a2);
            } catch (UnsupportedEncodingException e) {
                throw e;
            } catch (UnsupportedEncodingException e2) {
                str = new String(b, z[53]);
            } catch (Throwable th) {
                a.disconnect();
            }
            str = a(toURL, str, a2);
            if (!(TextUtils.isEmpty(str) || a2.equalsIgnoreCase(str))) {
                try {
                    a2 = new String(b, str);
                    c();
                    a(toURL, a2, str);
                } catch (UnsupportedEncodingException e3) {
                }
            }
            this.i = (long) b.length;
            a.disconnect();
            try {
                if (!TextUtils.isEmpty(this.j)) {
                    this.j = Html.fromHtml(this.j).toString();
                }
                try {
                    if (!TextUtils.isEmpty(this.c)) {
                        this.c = Html.fromHtml(this.c).toString();
                    }
                    this.k = SystemClock.uptimeMillis() - uptimeMillis;
                } catch (UnsupportedEncodingException e4) {
                    throw e4;
                }
            } catch (UnsupportedEncodingException e42) {
                throw e42;
            }
        }
    }

    public boolean d() {
        return (TextUtils.isEmpty(this.j) && TextUtils.isEmpty(this.c)) ? false : true;
    }

    private static String a(HashMap hashMap, String[] strArr) {
        boolean z = DialogToastActivity.f;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = (String) hashMap.get(strArr[i]);
            if (str != null) {
                return str.trim();
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return null;
    }

    private static String a(URLConnection uRLConnection) {
        String str = z[47];
        CharSequence headerField = uRLConnection.getHeaderField(z[48]);
        if (headerField == null) {
            return str;
        }
        Matcher matcher = h.matcher(headerField);
        return matcher.find() ? matcher.group(1).trim().toUpperCase() : str;
    }
}
