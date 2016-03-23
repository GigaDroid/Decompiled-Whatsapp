package org;

import com.google.fN;
import com.whatsapp.amm;
import com.whatsapp.proto.Wa20.NoiseCertificate;
import com.whatsapp.proto.Wa20.NoiseCertificate.Details;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.whispersystems.Y;
import org.whispersystems.at;

public class a5 {
    public static final Map a;
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "\foIvg8[\u001dk.U^x5'\u0018,C|d&EcU";
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
                        i3 = 117;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 15;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001byY|/UuU}>\u001cpYl+\u0001s\u0010f9\u0006cUkj\u0017o\u0010z$\u001ex_x$Ue_z8\u0016s\u000b/#\u0006eEj8H";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001byY|/UuU}>\u001cpYl+\u0001s\u0010\u007f+\u0007eYa-UpQf&\u0010r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001byY|/UuU}>\u001cpYl+\u0001s\u0010j2\u0005\u007fBj.N6Y|9\u0000sB2";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001byY|/UuU}>\u001cpYl+\u0001s\u0010k/\u0001wYc9UfQ}9\u001cxW/,\u0014\u007f\\j.";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "N6Uw:\u001cdU|w";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001cxFn&\u001cr\u0010|#\u0012xQ{?\u0007s\u0010`$Ux_f9\u00106Sj8\u0001\u007fVf)\u0014bU4j\u001ceCz/\u0007+";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    Map hashMap = new HashMap();
                    char[] toCharArray2 = "\"~Q{94f@C%\u001bqdj8\u0018'".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 117;
                                break;
                            case at.g /*1*/:
                                i5 = 22;
                                break;
                            case at.i /*2*/:
                                i5 = 48;
                                break;
                            case at.o /*3*/:
                                i5 = 15;
                                break;
                            default:
                                i5 = 74;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    hashMap.put(new String(cArr2).intern(), new a9(new byte[]{(byte) -9, (byte) 66, (byte) 72, (byte) -46, (byte) -24, (byte) -60, (byte) 114, (byte) 6, (byte) 15, (byte) 91, (byte) 57, (byte) -23, (byte) -32, (byte) -52, (byte) 118, (byte) -61, (byte) 56, (byte) 63, (byte) -85, (byte) -108, (byte) -10, (byte) -111, (byte) 15, (byte) -52, (byte) -48, (byte) -37, (byte) 96, (byte) -77, (byte) 87, (byte) 92, (byte) 105, (byte) 8}));
                    a = Collections.unmodifiableMap(hashMap);
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001byY|/UuU}>\u001cpYl+\u0001s\u0010d/\f6T`/\u00066^`>U{Q{)\u001d6@}%\u0005yCj.UeU}<\u0010d\u0010|>\u0014bYlj\u001esI4j\u001ceCz/\u0007+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean a(a9 a9Var, byte[] bArr) {
        try {
            NoiseCertificate parseFrom = NoiseCertificate.parseFrom(bArr);
            byte[] h = parseFrom.getDetails().h();
            try {
                Details parseFrom2 = Details.parseFrom(h);
                a9 a9Var2 = (a9) a.get(parseFrom2.getIssuer());
                if (a9Var2 == null) {
                    try {
                        Log.e(z[2] + parseFrom2.getIssuer());
                        return false;
                    } catch (fN e) {
                        throw e;
                    }
                } else if (!a9Var2.a(h, parseFrom.getSignature().h())) {
                    try {
                        Log.e(z[7] + parseFrom2.getIssuer());
                        return false;
                    } catch (fN e2) {
                        throw e2;
                    }
                } else if (Arrays.equals(parseFrom2.getKey().h(), a9Var.a())) {
                    if (parseFrom2.hasExpires()) {
                        if (parseFrom2.getExpires() < ((amm) h.b().b(amm.class)).a() / 1000) {
                            Log.e(z[4] + parseFrom2.getIssuer() + z[6] + new SimpleDateFormat(z[0], Locale.US).format(new Date(parseFrom2.getExpires() * 1000)));
                            return false;
                        }
                    }
                    return true;
                } else {
                    try {
                        Log.e(z[1] + parseFrom2.getIssuer());
                        return false;
                    } catch (fN e22) {
                        throw e22;
                    }
                }
            } catch (Throwable e3) {
                Log.b(z[5], e3);
                return false;
            }
        } catch (Throwable e32) {
            Log.b(z[3], e32);
            return false;
        }
    }
}
