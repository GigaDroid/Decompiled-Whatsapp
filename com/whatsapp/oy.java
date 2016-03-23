package com.whatsapp;

import android.media.MediaRecorder;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class oy extends oh {
    private static boolean d;
    private static final String[] z;
    private aka e;
    private String f;
    private _m g;
    private MediaRecorder h;
    private String i;

    static {
        String[] strArr = new String[17];
        String str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0006\n7vq\u0003L-vt@\u000e?rwMWove\u0004\n 7\u007f\u0002\t*td@\u00176guZ";
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
                        i3 = 99;
                        break;
                    case at.g /*1*/:
                        i3 = 79;
                        break;
                    case at.i /*2*/:
                        i3 = 23;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 96;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0013\u0017.ed\u0006\u0002&{u\u0004L<cq\u0012\u0017)vy\f\u0006+";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0013\u0017.ed\u0006\u0002&{u\u0004L=r|\u0005\u0002<r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0013\u0017.ed\u0006\u0002&{u\u0004";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "M.zb";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0013\u0017.ed\u0006\u0002&{u\u0004L?eu\u0010\u0002=r";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0010\u0011*gq\u0012\u0006)vy\f\u0006+8b\u0005\u000f*vc\u0005";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "M.vs";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "M.zb";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0002:sy\u000fL|p`\u0010";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "M.vs";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "M|p`";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "M~";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "M.zb";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0010\u0011*gq\u0012\u0006";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "M.zb";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015 ~s\u0005\u0011*t\u007f\u0012\u0007*e?\u0006\n7vq\u0003L*z`\u0014\u001au7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        try {
            if (this.h != null) {
                this.h.release();
                this.h = null;
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static _m c(oy oyVar) {
        return oyVar.g;
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        boolean z = oh.b;
        byte[] bArr = new byte[7];
        byte[] bArr2 = new byte[8192];
        int i = 0;
        int i2 = 0;
        while (inputStream.read(bArr) == bArr.length) {
            int i3 = (((bArr[3] & 3) << 11) | ((bArr[4] & 255) << 3)) | ((bArr[5] & 224) >> 5);
            try {
                if ((bArr[2] & 192) != 64) {
                    if (i2 == 0) {
                        Log.w(z[0] + ((bArr[2] & 192) >> 6));
                        i2 = 1;
                    }
                    bArr[2] = (byte) ((bArr[2] & 60) | 64);
                }
                i3 -= bArr.length;
                if (i3 > 0) {
                    try {
                        outputStream.write(bArr);
                        inputStream.read(bArr2, 0, i3);
                        outputStream.write(bArr2, 0, i3);
                        if (!z) {
                            continue;
                            if (z) {
                                break;
                            }
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
                i++;
                continue;
                if (z) {
                    break;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        if (i > 0) {
            try {
                Log.w(z[1] + i);
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
    }

    public void e() {
        try {
            if (this.h != null) {
                this.h.stop();
            }
            try {
                if (this.e != null) {
                    this.e.removeMessages(0);
                }
                try {
                    if (this.g != null) {
                        this.g.a();
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public void c() {
        try {
            this.h.start();
        } catch (Throwable e) {
            try {
                Log.b(z[4], e);
                if (VERSION.SDK_INT >= 10) {
                    try {
                        if (!d) {
                            try {
                                this.h.release();
                            } catch (Throwable e2) {
                                Log.b(z[3], e2);
                            }
                            this.h = new MediaRecorder();
                            this.h.setAudioSource(1);
                            this.h.setOutputFormat(3);
                            this.h.setAudioEncoder(1);
                            this.c = new File(this.f + z[5]);
                            this.a = 12200;
                            this.h.setOutputFile(this.c.getAbsolutePath());
                            this.h.setMaxFileSize(((long) a59.e) * 1048576);
                            try {
                                this.h.prepare();
                                this.h.start();
                                d = true;
                                return;
                            } catch (Throwable e22) {
                                Log.b(z[2], e22);
                                throw e22;
                            } catch (Throwable e222) {
                                Log.b(z[6], e222);
                                throw e222;
                            }
                        }
                    } catch (IOException e3) {
                        throw e3;
                    }
                }
                throw e222;
            } catch (RuntimeException e4) {
                throw e4;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        r9 = this;
        r8 = 10;
        r1 = 1;
        r2 = com.whatsapp.oh.b;
        r0 = new android.media.MediaRecorder;
        r0.<init>();
        r9.h = r0;
        r0 = r9.h;
        r0.setAudioSource(r1);
        r1 = 0;
        r0 = z;	 Catch:{ Exception -> 0x0146 }
        r3 = 10;
        r0 = r0[r3];	 Catch:{ Exception -> 0x0146 }
        r3 = r9.i;	 Catch:{ Exception -> 0x0146 }
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x0146 }
        if (r0 == 0) goto L_0x0058;
    L_0x0020:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x0146 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0146 }
        r3.<init>();	 Catch:{ Exception -> 0x0146 }
        r4 = r9.f;	 Catch:{ Exception -> 0x0146 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x0146 }
        r4 = z;	 Catch:{ Exception -> 0x0146 }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0146 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x0146 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0146 }
        r0.<init>(r3);	 Catch:{ Exception -> 0x0146 }
        r9.c = r0;	 Catch:{ Exception -> 0x0146 }
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r9.a = r0;	 Catch:{ Exception -> 0x0146 }
        r0 = r9.h;	 Catch:{ Exception -> 0x0146 }
        r3 = 1;
        r0.setOutputFormat(r3);	 Catch:{ Exception -> 0x0146 }
        r0 = r9.h;	 Catch:{ Exception -> 0x0146 }
        r3 = 1;
        r0.setAudioEncoder(r3);	 Catch:{ Exception -> 0x0146 }
        if (r2 == 0) goto L_0x011c;
    L_0x0052:
        r0 = com.whatsapp.WAAppCompatActivity.c;
        r0 = r0 + 1;
        com.whatsapp.WAAppCompatActivity.c = r0;
    L_0x0058:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0148 }
        if (r0 < r8) goto L_0x0060;
    L_0x005c:
        r0 = d;	 Catch:{ Exception -> 0x0148 }
        if (r0 == 0) goto L_0x0092;
    L_0x0060:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x014a }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014a }
        r3.<init>();	 Catch:{ Exception -> 0x014a }
        r4 = r9.f;	 Catch:{ Exception -> 0x014a }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014a }
        r4 = z;	 Catch:{ Exception -> 0x014a }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ Exception -> 0x014a }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014a }
        r3 = r3.toString();	 Catch:{ Exception -> 0x014a }
        r0.<init>(r3);	 Catch:{ Exception -> 0x014a }
        r9.c = r0;	 Catch:{ Exception -> 0x014a }
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r9.a = r0;	 Catch:{ Exception -> 0x014a }
        r0 = r9.h;	 Catch:{ Exception -> 0x014a }
        r3 = 3;
        r0.setOutputFormat(r3);	 Catch:{ Exception -> 0x014a }
        r0 = r9.h;	 Catch:{ Exception -> 0x014a }
        r3 = 1;
        r0.setAudioEncoder(r3);	 Catch:{ Exception -> 0x014a }
        if (r2 == 0) goto L_0x011c;
    L_0x0092:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x014c }
        r3 = 14;
        if (r0 < r3) goto L_0x0150;
    L_0x0098:
        r0 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r3 = 1;
        r4 = 2;
        r0 = android.media.AudioRecord.getMinBufferSize(r0, r3, r4);	 Catch:{ Exception -> 0x014c }
        if (r0 <= 0) goto L_0x0150;
    L_0x00a2:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x014e }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014e }
        r3.<init>();	 Catch:{ Exception -> 0x014e }
        r4 = r9.f;	 Catch:{ Exception -> 0x014e }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014e }
        r4 = z;	 Catch:{ Exception -> 0x014e }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ Exception -> 0x014e }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014e }
        r3 = r3.toString();	 Catch:{ Exception -> 0x014e }
        r0.<init>(r3);	 Catch:{ Exception -> 0x014e }
        r9.c = r0;	 Catch:{ Exception -> 0x014e }
        r0 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r9.a = r0;	 Catch:{ Exception -> 0x014e }
        r0 = r9.h;	 Catch:{ Exception -> 0x014e }
        r3 = 6;
        r0.setOutputFormat(r3);	 Catch:{ Exception -> 0x014e }
        r0 = r9.h;	 Catch:{ Exception -> 0x014e }
        r3 = 3;
        r0.setAudioEncoder(r3);	 Catch:{ Exception -> 0x014e }
        r0 = r9.h;	 Catch:{ Exception -> 0x014e }
        r3 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r0.setAudioSamplingRate(r3);	 Catch:{ Exception -> 0x014e }
        r0 = r9.h;	 Catch:{ Exception -> 0x014e }
        r3 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0.setAudioEncodingBitRate(r3);	 Catch:{ Exception -> 0x014e }
        r0 = new java.io.File;	 Catch:{ Exception -> 0x014e }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014e }
        r3.<init>();	 Catch:{ Exception -> 0x014e }
        r4 = r9.f;	 Catch:{ Exception -> 0x014e }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014e }
        r4 = z;	 Catch:{ Exception -> 0x014e }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ Exception -> 0x014e }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014e }
        r4 = z;	 Catch:{ Exception -> 0x014e }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ Exception -> 0x014e }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x014e }
        r3 = r3.toString();	 Catch:{ Exception -> 0x014e }
        r0.<init>(r3);	 Catch:{ Exception -> 0x014e }
        r1 = new com.whatsapp.aka;	 Catch:{ Exception -> 0x023b }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ Exception -> 0x023b }
        r1.<init>(r9, r3);	 Catch:{ Exception -> 0x023b }
        r9.e = r1;	 Catch:{ Exception -> 0x023b }
        r1 = r9.e;	 Catch:{ Exception -> 0x023b }
        r3 = 0;
        r4 = 50;
        r1.sendEmptyMessageDelayed(r3, r4);	 Catch:{ Exception -> 0x023b }
    L_0x011b:
        r1 = r0;
    L_0x011c:
        if (r1 == 0) goto L_0x0129;
    L_0x011e:
        r0 = r9.h;	 Catch:{ Exception -> 0x01aa }
        r1 = r1.getAbsolutePath();	 Catch:{ Exception -> 0x01aa }
        r0.setOutputFile(r1);	 Catch:{ Exception -> 0x01aa }
        if (r2 == 0) goto L_0x0134;
    L_0x0129:
        r0 = r9.h;	 Catch:{ Exception -> 0x01ac }
        r1 = r9.c;	 Catch:{ Exception -> 0x01ac }
        r1 = r1.getAbsolutePath();	 Catch:{ Exception -> 0x01ac }
        r0.setOutputFile(r1);	 Catch:{ Exception -> 0x01ac }
    L_0x0134:
        r0 = r9.h;
        r1 = com.whatsapp.a59.e;
        r4 = (long) r1;
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 * r6;
        r0.setMaxFileSize(r4);
        r0 = r9.h;	 Catch:{ Exception -> 0x01ae }
        r0.prepare();	 Catch:{ Exception -> 0x01ae }
    L_0x0145:
        return;
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014a }
    L_0x014a:
        r0 = move-exception;
        throw r0;
    L_0x014c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014e }
    L_0x014e:
        r0 = move-exception;
        goto L_0x011c;
    L_0x0150:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x01a6 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a6 }
        r3.<init>();	 Catch:{ Exception -> 0x01a6 }
        r4 = r9.f;	 Catch:{ Exception -> 0x01a6 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x01a6 }
        r4 = z;	 Catch:{ Exception -> 0x01a6 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ Exception -> 0x01a6 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x01a6 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x01a6 }
        r0.<init>(r3);	 Catch:{ Exception -> 0x01a6 }
        r9.c = r0;	 Catch:{ Exception -> 0x01a6 }
        r0 = 16000; // 0x3e80 float:2.2421E-41 double:7.905E-320;
        r3 = 1;
        r4 = 2;
        r0 = android.media.AudioRecord.getMinBufferSize(r0, r3, r4);	 Catch:{ Exception -> 0x01a6 }
        if (r0 <= 0) goto L_0x0193;
    L_0x017a:
        r0 = 12650; // 0x316a float:1.7726E-41 double:6.25E-320;
        r9.a = r0;	 Catch:{ Exception -> 0x01a6 }
        r0 = r9.h;	 Catch:{ Exception -> 0x01a6 }
        r3 = 4;
        r0.setOutputFormat(r3);	 Catch:{ Exception -> 0x01a6 }
        r0 = r9.h;	 Catch:{ Exception -> 0x01a6 }
        r3 = 2;
        r0.setAudioEncoder(r3);	 Catch:{ Exception -> 0x01a6 }
        r0 = r9.h;	 Catch:{ Exception -> 0x01a6 }
        r3 = 16000; // 0x3e80 float:2.2421E-41 double:7.905E-320;
        r0.setAudioSamplingRate(r3);	 Catch:{ Exception -> 0x01a6 }
        if (r2 == 0) goto L_0x023f;
    L_0x0193:
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r9.a = r0;	 Catch:{ Exception -> 0x01a8 }
        r0 = r9.h;	 Catch:{ Exception -> 0x01a8 }
        r3 = 3;
        r0.setOutputFormat(r3);	 Catch:{ Exception -> 0x01a8 }
        r0 = r9.h;	 Catch:{ Exception -> 0x01a8 }
        r3 = 1;
        r0.setAudioEncoder(r3);	 Catch:{ Exception -> 0x01a8 }
        r0 = r1;
        goto L_0x011b;
    L_0x01a6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a8 }
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014e }
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01ac }
    L_0x01ac:
        r0 = move-exception;
        throw r0;
    L_0x01ae:
        r0 = move-exception;
        r1 = z;	 Catch:{ Exception -> 0x022f }
        r3 = 15;
        r1 = r1[r3];	 Catch:{ Exception -> 0x022f }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ Exception -> 0x022f }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x022f }
        if (r1 < r8) goto L_0x0223;
    L_0x01bc:
        r1 = d;	 Catch:{ Exception -> 0x022f }
        if (r1 != 0) goto L_0x0223;
    L_0x01c0:
        r1 = r9.h;	 Catch:{ RuntimeException -> 0x0231 }
        r1.release();	 Catch:{ RuntimeException -> 0x0231 }
    L_0x01c5:
        r1 = 1;
        d = r1;	 Catch:{ Exception -> 0x022d }
        r1 = new android.media.MediaRecorder;	 Catch:{ Exception -> 0x022d }
        r1.<init>();	 Catch:{ Exception -> 0x022d }
        r9.h = r1;	 Catch:{ Exception -> 0x022d }
        r1 = r9.h;	 Catch:{ Exception -> 0x022d }
        r3 = 1;
        r1.setAudioSource(r3);	 Catch:{ Exception -> 0x022d }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x022d }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x022d }
        r3.<init>();	 Catch:{ Exception -> 0x022d }
        r4 = r9.f;	 Catch:{ Exception -> 0x022d }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x022d }
        r4 = z;	 Catch:{ Exception -> 0x022d }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ Exception -> 0x022d }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x022d }
        r3 = r3.toString();	 Catch:{ Exception -> 0x022d }
        r1.<init>(r3);	 Catch:{ Exception -> 0x022d }
        r9.c = r1;	 Catch:{ Exception -> 0x022d }
        r1 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r9.a = r1;	 Catch:{ Exception -> 0x022d }
        r1 = r9.h;	 Catch:{ Exception -> 0x022d }
        r3 = 3;
        r1.setOutputFormat(r3);	 Catch:{ Exception -> 0x022d }
        r1 = r9.h;	 Catch:{ Exception -> 0x022d }
        r3 = 1;
        r1.setAudioEncoder(r3);	 Catch:{ Exception -> 0x022d }
        r1 = r9.h;	 Catch:{ Exception -> 0x022d }
        r3 = r9.c;	 Catch:{ Exception -> 0x022d }
        r3 = r3.getAbsolutePath();	 Catch:{ Exception -> 0x022d }
        r1.setOutputFile(r3);	 Catch:{ Exception -> 0x022d }
        r1 = r9.h;	 Catch:{ Exception -> 0x022d }
        r3 = com.whatsapp.a59.e;	 Catch:{ Exception -> 0x022d }
        r4 = (long) r3;	 Catch:{ Exception -> 0x022d }
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 * r6;
        r1.setMaxFileSize(r4);	 Catch:{ Exception -> 0x022d }
        r1 = r9.h;	 Catch:{ Exception -> 0x022d }
        r1.prepare();	 Catch:{ Exception -> 0x022d }
        if (r2 == 0) goto L_0x0145;
    L_0x0223:
        r1 = new java.io.IOException;	 Catch:{ Exception -> 0x022d }
        r0 = r0.toString();	 Catch:{ Exception -> 0x022d }
        r1.<init>(r0);	 Catch:{ Exception -> 0x022d }
        throw r1;	 Catch:{ Exception -> 0x022d }
    L_0x022d:
        r0 = move-exception;
        throw r0;
    L_0x022f:
        r0 = move-exception;
        throw r0;
    L_0x0231:
        r1 = move-exception;
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r1);
        goto L_0x01c5;
    L_0x023b:
        r1 = move-exception;
        r1 = r0;
        goto L_0x011c;
    L_0x023f:
        r0 = r1;
        goto L_0x011b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.oy.d():void");
    }

    public oy(String str, String str2) {
        this.f = str;
        this.i = str2;
    }

    static _m a(oy oyVar, _m _mVar) {
        oyVar.g = _mVar;
        return _mVar;
    }

    static MediaRecorder b(oy oyVar) {
        return oyVar.h;
    }

    static String a(oy oyVar) {
        return oyVar.f;
    }
}
