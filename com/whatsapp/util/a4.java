package com.whatsapp.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.whatsapp.arj;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a4 {
    private static final String[] z;
    private long a;
    private int b;
    private int c;
    private int d;
    private File e;
    private int f;

    static {
        String[] strArr = new String[10];
        String str = "\u0004B-\u000eV\u001fN=\n\u0016\u0010J-KN\u001bO=\u0003\u0019Z";
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
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 73;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "[\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0004B-\u000eV\u001fN=\n\u0016\u0011J'\u0005V\u0006\u000b9\u0019V\u0011N:\u0018\u0019\u0014B%\u000e\u0003";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0004B-\u000eV\u001fN=\n\u0016\u0011J'\u0005V\u0006\u000b9\nK\u0001Ni\u000fL\u0000J=\u0002V\u001c\u0011";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[\u000b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0004B-\u000eV\u001fN=\n\u0016\u0011J'\u0005V\u0006\u000b.\u000eMRM;\nT\u0017";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004B-\u000eV\u001fN=\n\u0016\u001cDi\u000fL\u0000J=\u0002V\u001c\u0011";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "[\u000b&\u0019\u0019\u001aN \fQ\u0006\u000ba";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0004B-\u000eV\u001fN=\n\u0016\u0011J'\u0005V\u0006\u000b9\nK\u0001Ni\u001cP\u0016_!K\u0011";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "[\u000b&\u0019\u0019\u001aN \fQ\u0006\u000ba";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int a() {
        return this.f;
    }

    public boolean b() {
        int i;
        int i2 = 640;
        int i3 = Log.h;
        if (this.f <= 640 && this.b <= 640) {
            int i4 = this.f;
            i = this.b;
            if (i3 == 0) {
                i2 = i4;
                return ((double) (((((long) ((i * i2) * 3)) * (this.a / 1000)) / 8) + ((96000 * (this.a / 1000)) / 8))) < ((double) this.e.length()) * 1.5d;
            }
        }
        if (this.f < this.b) {
            i = (this.f * 640) / this.b;
            if (i3 == 0) {
                i2 = i;
                i = 640;
                if (((double) (((((long) ((i * i2) * 3)) * (this.a / 1000)) / 8) + ((96000 * (this.a / 1000)) / 8))) < ((double) this.e.length()) * 1.5d) {
                }
            }
        }
        i = (this.b * 640) / this.f;
        if (((double) (((((long) ((i * i2) * 3)) * (this.a / 1000)) / 8) + ((96000 * (this.a / 1000)) / 8))) < ((double) this.e.length()) * 1.5d) {
        }
    }

    public int f() {
        return this.d;
    }

    public a4(File file) {
        this.e = file;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            try {
                this.a = Long.parseLong(extractMetadata);
                if (this.a == 0) {
                    Log.e(z[7] + extractMetadata + " " + this.e.getAbsolutePath() + " " + this.e.length());
                    mediaMetadataRetriever.release();
                    throw new cq();
                }
                try {
                    this.f = Integer.parseInt(extractMetadata2);
                    this.b = Integer.parseInt(extractMetadata3);
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    Log.w(z[9] + extractMetadata2 + z[8] + extractMetadata3 + z[2] + this.e.getAbsolutePath() + " " + this.e.length());
                    Bitmap bitmap = null;
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(0);
                    } catch (Exception e3) {
                    } catch (NoSuchMethodError e4) {
                    }
                    if (bitmap != null) {
                        this.f = bitmap.getWidth();
                        this.b = bitmap.getHeight();
                        if (Log.h == 0) {
                            try {
                                if (this.f == 0 || this.b == 0) {
                                    Log.e(z[0] + extractMetadata2 + z[1] + extractMetadata3 + z[5] + this.e.getAbsolutePath() + " " + this.e.length());
                                    mediaMetadataRetriever.release();
                                    throw new cq();
                                }
                            } catch (Exception e5) {
                                throw e5;
                            }
                        }
                    }
                    Log.e(z[6] + this.e.getAbsolutePath() + " " + this.e.length());
                    throw new cq();
                } catch (Exception e52) {
                    throw e52;
                }
                try {
                    this.c = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
                } catch (Exception e6) {
                }
                try {
                    this.d = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                } catch (Exception e7) {
                }
                mediaMetadataRetriever.release();
            } catch (Exception e8) {
                Log.e(z[4] + extractMetadata + " " + this.e.getAbsolutePath() + " " + this.e.length());
                mediaMetadataRetriever.release();
                throw new cq();
            }
        } catch (Exception e9) {
            Log.e(z[3] + this.e.getAbsolutePath() + " " + this.e.length() + " " + this.e.exists());
            mediaMetadataRetriever.release();
            throw new cq();
        }
    }

    public int e() {
        return this.c;
    }

    public long c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}
