package com.whatsapp.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
import com.whatsapp.qi;
import com.whatsapp.ve;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.State;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class bb {
    private static final Bitmap g;
    private static final String[] z;
    private as[] a;
    private final Drawable b;
    private final Object c;
    private final LruCache d;
    private b6 e;
    private final File f;
    private final int h;
    private final Drawable i;
    private final int j;
    private final bs k;
    private final long l;

    private bb(a3 a3Var) {
        int i = Log.h;
        this.c = new Object();
        this.k = new bs(null);
        this.i = a3.b(a3Var);
        this.b = a3.e(a3Var);
        this.j = a3.f(a3Var);
        this.h = a3.a(a3Var);
        this.f = a3.c(a3Var);
        this.l = a3.d(a3Var);
        this.a = new as[this.h];
        int i2 = 0;
        while (i2 < this.h) {
            this.a[i2] = new as(this, null);
            this.a[i2].setPriority(4);
            i2++;
            if (i != 0) {
                break;
            }
        }
        this.d = new by(this, (int) (Runtime.getRuntime().maxMemory() / 8192));
    }

    static Drawable b(bb bbVar) {
        return bbVar.i;
    }

    private void a(String str, ImageView imageView) {
        synchronized (bs.a(this.k)) {
            this.k.a(imageView);
        }
        v vVar = new v(this, str, imageView);
        synchronized (bs.a(this.k)) {
            bs.a(this.k).add(0, vVar);
            bs.a(this.k).notifyAll();
        }
        Thread thread = this.a[Math.abs(str.hashCode()) % this.a.length];
        if (thread.getState() == State.NEW) {
            thread.start();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r6 = this;
        r1 = r6.c;
        monitor-enter(r1);
        r0 = r6.e;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r0 = r6.e;	 Catch:{ IOException -> 0x003b }
        r0 = r0.b();	 Catch:{ IOException -> 0x003b }
        if (r0 == 0) goto L_0x0034;
    L_0x000f:
        r0 = r6.f;	 Catch:{ IOException -> 0x003b }
        r0 = r0.exists();	 Catch:{ IOException -> 0x003b }
        if (r0 != 0) goto L_0x001c;
    L_0x0017:
        r0 = r6.f;	 Catch:{ IOException -> 0x003d }
        r0.mkdirs();	 Catch:{ IOException -> 0x003d }
    L_0x001c:
        r0 = r6.f;	 Catch:{ all -> 0x003f }
        r2 = a(r0);	 Catch:{ all -> 0x003f }
        r4 = r6.l;	 Catch:{ all -> 0x003f }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0034;
    L_0x0028:
        r0 = r6.f;	 Catch:{ IOException -> 0x0042 }
        r2 = 1;
        r3 = 1;
        r4 = r6.l;	 Catch:{ IOException -> 0x0042 }
        r0 = com.whatsapp.util.b6.a(r0, r2, r3, r4);	 Catch:{ IOException -> 0x0042 }
        r6.e = r0;	 Catch:{ IOException -> 0x0042 }
    L_0x0034:
        r0 = r6.c;	 Catch:{ all -> 0x003f }
        r0.notifyAll();	 Catch:{ all -> 0x003f }
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        return;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;
    L_0x0042:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
        r2.<init>();	 Catch:{ all -> 0x003f }
        r3 = z;	 Catch:{ all -> 0x003f }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ all -> 0x003f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x003f }
        r0 = r2.append(r0);	 Catch:{ all -> 0x003f }
        r0 = r0.toString();	 Catch:{ all -> 0x003f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x003f }
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bb.c():void");
    }

    @TargetApi(9)
    public static long a(File file) {
        if (VERSION.SDK_INT >= 9) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    private Bitmap a(v vVar) {
        Throwable th;
        OutputStream outputStream;
        Throwable th2;
        int i = Log.h;
        String b = b(vVar.c);
        c();
        Bitmap a = a(b);
        if (a != null) {
            return a;
        }
        try {
            Log.i(z[3] + vVar.c);
            HttpUriRequest httpGet = new HttpGet(vVar.c);
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            HttpEntity entity = new DefaultHttpClient(basicHttpParams).execute(httpGet).getEntity();
            if (entity != null) {
                InputStream content = entity.getContent();
                synchronized (this.c) {
                    if (!(this.e == null || content == null)) {
                        try {
                            OutputStream a2;
                            b1 b2 = this.e.b(b);
                            if (b2 == null) {
                                x e = this.e.e(b);
                                if (e != null) {
                                    a2 = e.a(0);
                                    try {
                                        byte[] bArr = new byte[1024];
                                        do {
                                            int read = content.read(bArr, 0, 1024);
                                            if (read == -1 && i == 0) {
                                                break;
                                            }
                                            a2.write(bArr, 0, read);
                                        } while (i == 0);
                                        break;
                                        e.a();
                                    } catch (IOException e2) {
                                        throw e2;
                                    } catch (Throwable e3) {
                                        th = e3;
                                        outputStream = a2;
                                        th2 = th;
                                    } catch (Throwable e32) {
                                        th = e32;
                                        outputStream = a2;
                                        th2 = th;
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (IOException e22) {
                                                throw e22;
                                            } catch (IOException e222) {
                                                throw e222;
                                            } catch (IOException e4) {
                                            }
                                        }
                                        if (content != null) {
                                            content.close();
                                        }
                                        throw th2;
                                        while (true) {
                                            break;
                                        }
                                    }
                                }
                                a2 = null;
                            } else {
                                b2.a(0).close();
                                a2 = null;
                            }
                            if (a2 != null) {
                                try {
                                    a2.close();
                                } catch (IOException e5) {
                                    throw e5;
                                } catch (IOException e52) {
                                    throw e52;
                                } catch (IOException e6) {
                                }
                            }
                            if (content != null) {
                                content.close();
                            }
                        } catch (Exception e7) {
                            th2 = e7;
                            outputStream = null;
                            try {
                                Log.b(z[4], th2);
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e522) {
                                        throw e522;
                                    } catch (IOException e8) {
                                    }
                                }
                                if (content != null) {
                                    content.close();
                                }
                                a = a(b);
                                if (a == null) {
                                    Log.e(z[1] + vVar.c);
                                }
                                return a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (content != null) {
                                    content.close();
                                }
                                throw th2;
                                while (true) {
                                    break;
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            outputStream = null;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (content != null) {
                                content.close();
                            }
                            throw th2;
                            while (true) {
                                break;
                            }
                        }
                    }
                }
            }
            a = a(b);
            if (a == null) {
                Log.e(z[1] + vVar.c);
            }
            return a;
        } catch (IOException e5222) {
            throw e5222;
        } catch (Throwable th22) {
            Log.b(z[2] + vVar.c, th22);
            return null;
        }
    }

    public void a(boolean z) {
        int i = 0;
        int i2 = Log.h;
        as[] asVarArr = this.a;
        int length = asVarArr.length;
        while (i < length) {
            asVarArr[i].interrupt();
            i++;
            if (i2 != 0) {
                break;
            }
        }
        synchronized (this.d) {
            this.d.trimToSize(0);
        }
        synchronized (this.c) {
            if (this.e != null) {
                if (z) {
                    try {
                        this.e.d();
                    } catch (IOException e) {
                        throw e;
                    } catch (IOException e2) {
                        throw e2;
                    } catch (IOException e22) {
                        Log.e(z[7] + e22);
                    }
                }
                if (!this.e.b()) {
                    this.e.close();
                }
                this.e = null;
            }
        }
    }

    public void b() {
        a(false);
    }

    static bs c(bb bbVar) {
        return bbVar.k;
    }

    bb(a3 a3Var, by byVar) {
        this(a3Var);
    }

    static LruCache a(bb bbVar) {
        return bbVar.d;
    }

    static {
        String[] strArr = new String[9];
        String str = "p+\u001dH\u0002k?\u0014O\u001c+:\u0015I\u0001`;PH\u000f`~\u0019G\u000fc;";
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
                        i4 = 4;
                        break;
                    case at.g /*1*/:
                        i4 = 94;
                        break;
                    case at.i /*2*/:
                        i4 = 112;
                        break;
                    case at.o /*3*/:
                        i4 = 42;
                        break;
                    default:
                        i4 = 110;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+~\u0015X\u001ck,PN\u0001s0\u001cE\u000f`7\u001eMN";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+:\u001f]\u0000h1\u0011NN";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+:\u001f]\u0000h1\u0011NN";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+9\u0015^,m*\u001dK\u001eB,\u001fG*m-\u001bi\u000fg6\u0015\nC$";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+:\u0015I\u0001`;PL\u000fm2\u0015N";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+=\u001cE\u001da~";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+7\u001eC\u001a@7\u0003A-e=\u0018ON";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    g = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
                    return;
                default:
                    strArr2[i2] = str;
                    str = "p+\u001dH\u0002k?\u0014O\u001c+~\u0014O\rk:\u0015\n\be7\u001cO\n$";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public void b(String str, ImageView imageView) {
        int i = Log.h;
        imageView.setTag(str);
        Bitmap bitmap = (Bitmap) this.d.get(str);
        if (bitmap != null) {
            if (bitmap != g) {
                imageView.setImageBitmap(bitmap);
                if (i == 0) {
                    return;
                }
            }
            imageView.setImageDrawable(this.i);
            if (i == 0) {
                return;
            }
        }
        imageView.setImageDrawable(this.b);
        a(str, imageView);
    }

    public Bitmap a(InputStream inputStream) {
        int i = Log.h;
        byte[] a = qi.a(inputStream);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(a, 0, a.length, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
            Log.e(z[0]);
            return null;
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        options.inSampleSize = 1;
        do {
            if (i2 / 2 < this.j && i3 / 2 < this.j && i == 0) {
                break;
            }
            i2 /= 2;
            i3 /= 2;
            options.inSampleSize++;
        } while (i == 0);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeByteArray(a, 0, a.length, options);
    }

    static Bitmap a() {
        return g;
    }

    public static String b(String str) {
        return ve.f(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = 0;
        r3 = r8.c;
        monitor-enter(r3);
        r1 = r8.e;	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0032;
    L_0x0008:
        r1 = r8.e;	 Catch:{ IOException -> 0x0037, all -> 0x005f }
        r1 = r1.b(r9);	 Catch:{ IOException -> 0x0037, all -> 0x005f }
        if (r1 == 0) goto L_0x007f;
    L_0x0010:
        r2 = 0;
        r2 = r1.a(r2);	 Catch:{ IOException -> 0x0037, all -> 0x005f }
        if (r2 == 0) goto L_0x002d;
    L_0x0017:
        r1 = r8.a(r2);	 Catch:{ IOException -> 0x0074, all -> 0x006f }
        if (r1 != 0) goto L_0x002c;
    L_0x001d:
        r4 = z;	 Catch:{ IOException -> 0x007a, all -> 0x006f }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ IOException -> 0x007a, all -> 0x006f }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IOException -> 0x007a, all -> 0x006f }
        if (r2 == 0) goto L_0x002a;
    L_0x0027:
        r2.close();	 Catch:{ IOException -> 0x0069 }
    L_0x002a:
        monitor-exit(r3);	 Catch:{ all -> 0x0034 }
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = r1;
    L_0x002d:
        if (r2 == 0) goto L_0x0032;
    L_0x002f:
        r2.close();	 Catch:{ IOException -> 0x006b }
    L_0x0032:
        monitor-exit(r3);	 Catch:{ all -> 0x0034 }
        goto L_0x002b;
    L_0x0034:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0034 }
        throw r0;
    L_0x0037:
        r1 = move-exception;
        r2 = r0;
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x003c:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0072 }
        r4.<init>();	 Catch:{ all -> 0x0072 }
        r5 = z;	 Catch:{ all -> 0x0072 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ all -> 0x0072 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0072 }
        r0 = r4.append(r0);	 Catch:{ all -> 0x0072 }
        r0 = r0.toString();	 Catch:{ all -> 0x0072 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0072 }
        if (r1 == 0) goto L_0x005a;
    L_0x0057:
        r1.close();	 Catch:{ IOException -> 0x005c }
    L_0x005a:
        r0 = r2;
        goto L_0x0032;
    L_0x005c:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0032;
    L_0x005f:
        r1 = move-exception;
        r7 = r1;
        r1 = r0;
        r0 = r7;
    L_0x0063:
        if (r1 == 0) goto L_0x0068;
    L_0x0065:
        r1.close();	 Catch:{ IOException -> 0x006d }
    L_0x0068:
        throw r0;	 Catch:{ all -> 0x0034 }
    L_0x0069:
        r1 = move-exception;
        goto L_0x002a;
    L_0x006b:
        r1 = move-exception;
        goto L_0x0032;
    L_0x006d:
        r1 = move-exception;
        goto L_0x0068;
    L_0x006f:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0063;
    L_0x0072:
        r0 = move-exception;
        goto L_0x0063;
    L_0x0074:
        r1 = move-exception;
        r7 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r7;
        goto L_0x003c;
    L_0x007a:
        r0 = move-exception;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x003c;
    L_0x007f:
        r2 = r0;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bb.a(java.lang.String):android.graphics.Bitmap");
    }

    static Bitmap a(bb bbVar, v vVar) {
        return bbVar.a(vVar);
    }
}
