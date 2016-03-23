package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.v;
import org.whispersystems.at;

public class amd {
    private static boolean a;
    private static final Handler b;
    private static File c;
    public static Statistics$Data d;
    private static final String[] z;

    static boolean a(boolean z) {
        a = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.co r6) {
        /*
        r4 = 1;
        r0 = r6.c;
        r1 = 8;
        if (r0 != r1) goto L_0x0020;
    L_0x0008:
        r0 = r6.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0019;
    L_0x000e:
        r0 = d;
        r2 = r0.tx_voip_calls;
        r2 = r2 + r4;
        r0.tx_voip_calls = r2;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0020;
    L_0x0019:
        r0 = d;
        r2 = r0.rx_voip_calls;
        r2 = r2 + r4;
        r0.rx_voip_calls = r2;
    L_0x0020:
        c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amd.a(com.whatsapp.protocol.co):void");
    }

    static {
        String[] strArr = new String[6];
        String str = "y&L\u0011l<'_\bwr3\u001e\rj} W\rju7M^xu8[";
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
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 30;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "o _\nwo W\u001dm";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "o _\nwo W\u001dm<&[\r{htZ\u000b{< Q^w3;\u001e\u001bf\u007f1N\nws:\u0004^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "o _\nwo W\u001dm<&[\r{htZ\u000b{< Q^my&W\u001fru._\nws:\u001e\u001dv}:Y\u001b$<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "o _\nwo W\u001dm<&[\r{htZ\u000b{< Q^su'M\u0017p{t]\u0012\u007fo'\u0004^";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new Handler(Looper.getMainLooper(), new nc());
                    return;
                default:
                    strArr2[i] = str;
                    str = "o _\nwo W\u001dm<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void c() {
        b.removeMessages(0);
        b.sendEmptyMessageDelayed(0, 1000);
    }

    private static void d() {
        ak_ com_whatsapp_ak_ = new ak_();
    }

    public static boolean e() {
        Object e;
        Throwable th;
        if (!c.exists()) {
            return false;
        }
        ObjectInputStream objectInputStream = null;
        ObjectInputStream objectInputStream2;
        try {
            objectInputStream2 = new ObjectInputStream(new FileInputStream(c));
            try {
                d = (Statistics$Data) objectInputStream2.readObject();
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e2) {
                    }
                }
                return true;
            } catch (ClassNotFoundException e3) {
                e = e3;
                try {
                    Log.w(z[5] + e);
                    d = new Statistics$Data(true);
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e4) {
                        } catch (ClassNotFoundException e5) {
                            throw e5;
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e6) {
                        } catch (ClassNotFoundException e52) {
                            throw e52;
                        }
                    }
                    throw th;
                }
            } catch (InvalidClassException e7) {
                e = e7;
                objectInputStream = objectInputStream2;
                try {
                    Log.w(z[4] + e);
                    d = new Statistics$Data(true);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e8) {
                        } catch (ClassNotFoundException e522) {
                            throw e522;
                        }
                    }
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                objectInputStream = objectInputStream2;
                Log.w(z[3] + e);
                d = new Statistics$Data(true);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e10) {
                    } catch (ClassNotFoundException e5222) {
                        throw e5222;
                    }
                }
                return true;
            }
        } catch (ClassNotFoundException e11) {
            e = e11;
            objectInputStream2 = null;
            Log.w(z[5] + e);
            d = new Statistics$Data(true);
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            return true;
        } catch (InvalidClassException e12) {
            e = e12;
            Log.w(z[4] + e);
            d = new Statistics$Data(true);
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return true;
        } catch (IOException e13) {
            e = e13;
            Log.w(z[3] + e);
            d = new Statistics$Data(true);
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.whatsapp.protocol.co r10) {
        /*
        r8 = 1;
        r0 = java.lang.System.currentTimeMillis();
        r2 = r10.b;
        r0 = r0 - r2;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0025;
    L_0x000f:
        r2 = d;
        r3 = d;
        r4 = r3.rx_offline_delay;
        r3 = d;
        r6 = r3.rx_offline_msgs;
        r4 = r4 * r6;
        r0 = r0 + r4;
        r3 = d;
        r4 = r3.rx_offline_msgs;
        r4 = r4 + r8;
        r3.rx_offline_msgs = r4;
        r0 = r0 / r4;
        r2.rx_offline_delay = r0;
    L_0x0025:
        r0 = r10.c;
        if (r0 != 0) goto L_0x0034;
    L_0x0029:
        r0 = d;
        r2 = r0.rx_text_msgs;
        r2 = r2 + r8;
        r0.rx_text_msgs = r2;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = d;
        r2 = r0.rx_media_msgs;
        r2 = r2 + r8;
        r0.rx_media_msgs = r2;
    L_0x003b:
        c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amd.b(com.whatsapp.protocol.co):void");
    }

    public static void a(File file) {
        c = new File(file, z[2]);
        if (!e()) {
            d = new Statistics$Data(false);
        }
        d();
        Log.i(z[1] + d.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(byte r6) {
        /*
        r4 = 1;
        if (r6 != 0) goto L_0x000f;
    L_0x0004:
        r0 = d;
        r2 = r0.tx_text_msgs;
        r2 = r2 + r4;
        r0.tx_text_msgs = r2;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0016;
    L_0x000f:
        r0 = d;
        r2 = r0.tx_media_msgs;
        r2 = r2 + r4;
        r0.tx_media_msgs = r2;
    L_0x0016:
        c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amd.a(byte):void");
    }

    public static void b() {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        try {
            objectOutputStream = new ObjectOutputStream(new q(App.J, c));
            try {
                objectOutputStream.writeObject(d);
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw th;
        }
    }

    public static void a() {
        d = new Statistics$Data(true);
        try {
            b();
        } catch (Throwable e) {
            Log.b(z[0], e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(long r4, @com.whatsapp.ak2 int r6) {
        /*
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = a;
        if (r1 == 0) goto L_0x000d;
    L_0x0006:
        r1 = d;
        r2 = r1.tx_roaming_bytes;
        r2 = r2 + r4;
        r1.tx_roaming_bytes = r2;
    L_0x000d:
        switch(r6) {
            case 0: goto L_0x0014;
            case 1: goto L_0x001d;
            case 2: goto L_0x0026;
            case 3: goto L_0x002f;
            default: goto L_0x0010;
        };
    L_0x0010:
        c();
        return;
    L_0x0014:
        r1 = d;
        r2 = r1.tx_media_bytes;
        r2 = r2 + r4;
        r1.tx_media_bytes = r2;
        if (r0 == 0) goto L_0x0010;
    L_0x001d:
        r1 = d;
        r2 = r1.tx_message_service_bytes;
        r2 = r2 + r4;
        r1.tx_message_service_bytes = r2;
        if (r0 == 0) goto L_0x0010;
    L_0x0026:
        r1 = d;
        r2 = r1.tx_voip_bytes;
        r2 = r2 + r4;
        r1.tx_voip_bytes = r2;
        if (r0 == 0) goto L_0x0010;
    L_0x002f:
        r0 = d;
        r2 = r0.tx_google_drive_bytes;
        r2 = r2 + r4;
        r0.tx_google_drive_bytes = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amd.b(long, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(long r4, @com.whatsapp.ak2 int r6) {
        /*
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = a;
        if (r1 == 0) goto L_0x000d;
    L_0x0006:
        r1 = d;
        r2 = r1.rx_roaming_bytes;
        r2 = r2 + r4;
        r1.rx_roaming_bytes = r2;
    L_0x000d:
        switch(r6) {
            case 0: goto L_0x0014;
            case 1: goto L_0x001d;
            case 2: goto L_0x0026;
            case 3: goto L_0x002f;
            default: goto L_0x0010;
        };
    L_0x0010:
        c();
        return;
    L_0x0014:
        r1 = d;
        r2 = r1.rx_media_bytes;
        r2 = r2 + r4;
        r1.rx_media_bytes = r2;
        if (r0 == 0) goto L_0x0010;
    L_0x001d:
        r1 = d;
        r2 = r1.rx_message_service_bytes;
        r2 = r2 + r4;
        r1.rx_message_service_bytes = r2;
        if (r0 == 0) goto L_0x0010;
    L_0x0026:
        r1 = d;
        r2 = r1.rx_voip_bytes;
        r2 = r2 + r4;
        r1.rx_voip_bytes = r2;
        if (r0 == 0) goto L_0x0010;
    L_0x002f:
        r0 = d;
        r2 = r0.rx_google_drive_bytes;
        r2 = r2 + r4;
        r0.rx_google_drive_bytes = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amd.a(long, int):void");
    }
}
