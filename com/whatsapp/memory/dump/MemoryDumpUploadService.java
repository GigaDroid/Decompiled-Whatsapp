package com.whatsapp.memory.dump;

import android.app.ActivityManager;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.vn;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class MemoryDumpUploadService extends IntentService {
    private static final String[] z;
    private k a;
    private ActivityManager b;

    static {
        String[] strArr = new String[9];
        String str = "\u0015\u0006K?\u00045\u0013s\u000b\u001d7\u0002B(\u0014*\u0015O\u0018\u0014";
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
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "}\u0010\t\u001f\u00045\u0013\b\u0018\u001d=\u0002H";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "}\u0010\t\u001f\u00045\u0013\b\u001c\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0015\u0006K\u0014\u0003!'S\u0016\u0001\r\u0013J\u0014\u0010<Lc\t\u00037\u0011\u0006.\u00014\fG\u001f\u00186\u0004\u0006\u001d\u00184\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "2\u0002P\u001a_4\u0002H\u001c_\u0017\u0016R4\u0017\u0015\u0006K\u0014\u0003!&T\t\u001e*";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015\u0002O\u0015Q\b\u0011I\u0018\u0014+\u0010";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000f\u000bG\u000f\u00029\u0013V";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "jM\u0017I_mV\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "9\u0000R\u0012\u00071\u0017_";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private q a(Context context, File file, String str) {
        return new q(file, 451048, this.b.getMemoryClass(), vn.a(context, Log.f()), z[8], z[7], z[6], "1", str);
    }

    private void a(File[] fileArr) {
        boolean z = n.a;
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            fileArr[i].delete();
            File file = new File(b());
            if (file.exists()) {
                file.delete();
            }
            file = new File(a());
            if (file.exists()) {
                file.delete();
            }
            i++;
            if (z) {
                return;
            }
        }
    }

    private String a() {
        return String.format(z[2], new Object[]{this.a.b()});
    }

    public static void a(Context context) {
        context.startService(new Intent(context, MemoryDumpUploadService.class));
    }

    protected void onHandleIntent(Intent intent) {
        Throwable e;
        boolean z = n.a;
        File[] a = this.a.a(this.a.b());
        if (a != null) {
            try {
                if (a.length != 0) {
                    try {
                        if (App.az() != 1) {
                            a(a);
                            n.g();
                            return;
                        }
                        int i = 1;
                        while (i < a.length) {
                            a[i].delete();
                            n.a();
                            i++;
                            if (z) {
                                break;
                            }
                        }
                        File file = a[0];
                        File file2 = new File(a());
                        if (a(file, file2)) {
                            try {
                                if (App.az() != 1) {
                                    file.delete();
                                    file2.delete();
                                    n.e();
                                    return;
                                }
                                File file3 = new File(b());
                                try {
                                    this.a.a(file2, file3);
                                    new b(a(getApplicationContext(), file3, z[5])).a(new m(this, file, file3, file2));
                                    return;
                                } catch (Exception e2) {
                                    e = e2;
                                    Log.c(z[4], e);
                                    file.delete();
                                    file2.delete();
                                    file3.delete();
                                    n.d();
                                    return;
                                } catch (OutOfMemoryError e3) {
                                    e = e3;
                                    Log.c(z[4], e);
                                    file.delete();
                                    file2.delete();
                                    file3.delete();
                                    n.d();
                                    return;
                                }
                            } catch (Exception e4) {
                                throw e4;
                            }
                        }
                        try {
                            file.delete();
                            file2.delete();
                            n.f();
                        } catch (Exception e42) {
                            throw e42;
                        }
                    } catch (Exception e422) {
                        throw e422;
                    }
                }
            } catch (Exception e4222) {
                throw e4222;
            } catch (Exception e42222) {
                throw e42222;
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        this.a = new k(applicationContext);
        this.b = (ActivityManager) applicationContext.getSystemService(z[1]);
    }

    private String b() {
        return String.format(z[3], new Object[]{this.a.b()});
    }

    public MemoryDumpUploadService() {
        super(z[0]);
    }

    private boolean a(File file, File file2) {
        return new f(file, file2).b();
    }
}
