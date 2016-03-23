package org.spongycastle.jce.provider;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.v;
import org.whispersystems.at;

public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static final String[] DIGESTS;
    private static final String DIGEST_PACKAGE;
    private static final String[] KEYSTORES;
    private static final String KEYSTORE_PACKAGE;
    public static final String PROVIDER_NAME;
    private static final String[] SYMMETRIC_CIPHERS;
    private static final String SYMMETRIC_PACKAGE;
    public static int a;
    private static String info;
    private static final String[] z;

    class 1 implements PrivilegedAction {
        final BouncyCastleProvider this$0;

        public Object run() {
            BouncyCastleProvider.access$000(this.this$0);
            return null;
        }

        1(BouncyCastleProvider bouncyCastleProvider) {
            this.this$0 = bouncyCastleProvider;
        }
    }

    private void loadAlgorithms(String str, String[] strArr) {
        int i = a;
        int i2 = 0;
        while (i2 != strArr.length) {
            Class cls = null;
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                if (classLoader != null) {
                    cls = classLoader.loadClass(str + strArr[i2] + z[3]);
                } else {
                    cls = Class.forName(str + strArr[i2] + z[1]);
                }
            } catch (ClassNotFoundException e) {
            }
            if (cls != null) {
                try {
                    ((AlgorithmProvider) cls.newInstance()).configure(this);
                } catch (Exception e2) {
                    throw new InternalError(z[2] + str + strArr[i2] + z[0] + e2);
                }
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public BouncyCastleProvider() {
        super(z[4], 1.54d, info);
        AccessController.doPrivileged(new 1(this));
    }

    private void setup() {
        loadAlgorithms(z[8], DIGESTS);
        loadAlgorithms(z[7], SYMMETRIC_CIPHERS);
        loadAlgorithms(z[9], KEYSTORES);
    }

    public void addAlgorithm(String str, String str2) {
        int i = a;
        try {
            if (containsKey(str)) {
                throw new IllegalStateException(z[6] + str + z[5]);
            }
            try {
                put(str, str2);
                if (BCMessageDigest.a) {
                    a = i + 1;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean hasAlgorithm(String str, String str2) {
        boolean z = false;
        int i = a;
        try {
            boolean z2;
            if (!containsKey(str + "." + str2)) {
                if (!containsKey(z[10] + str + "." + str2)) {
                    z2 = false;
                    if (i != 0) {
                        try {
                            if (!BCMessageDigest.a) {
                                z = true;
                            }
                            BCMessageDigest.a = z;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return z2;
                }
            }
            z2 = true;
            if (i != 0) {
                if (BCMessageDigest.a) {
                    z = true;
                }
                BCMessageDigest.a = z;
            }
            return z2;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static void access$000(BouncyCastleProvider bouncyCastleProvider) {
        bouncyCastleProvider.setup();
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[11];
        char[] toCharArray = "\u001c3\u001aV\\\u0003.\u0013\u001fV\u0010 \u000e\fC\u0016o\u0017\u001bN\u0019\"\u0018V_\u0001.\u000b\u0011K\u00163S\u0013J\n2\t\u0017]\u0016o".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        KEYSTORE_PACKAGE = new String(cArr).intern();
        toCharArray = "\u001c3\u001aV\\\u0003.\u0013\u001fV\u0010 \u000e\fC\u0016o\u0017\u001bN\u0019\"\u0018V_\u0001.\u000b\u0011K\u00163S\u001cF\u0014$\u000e\f\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        DIGEST_PACKAGE = new String(cArr).intern();
        toCharArray = " \u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        PROVIDER_NAME = new String(cArr).intern();
        toCharArray = "\u001c3\u001aV\\\u0003.\u0013\u001fV\u0010 \u000e\fC\u0016o\u0017\u001bN\u0019\"\u0018V_\u0001.\u000b\u0011K\u00163S\u000bV\u001e,\u0018\f]\u001a\"S".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        SYMMETRIC_PACKAGE = new String(cArr).intern();
        toCharArray = "W\f\u001c\b_\u001a/\u001a\u000b\u000fIa".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "W\f\u001c\b_\u001a/\u001a\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0010 \u0013\u0016@\u0007a\u001e\nJ\u00125\u0018XF\u001d2\t\u0019A\u0010$]\u0017IS".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "W\f\u001c\b_\u001a/\u001a\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = " \u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "Za\u001b\u0017Z\u001d%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u00174\r\u0014F\u0010 \t\u001d\u000f\u00033\u0012\u000eF\u0017$\u000fXD\u00168]P".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u001c3\u001aV\\\u0003.\u0013\u001fV\u0010 \u000e\fC\u0016o\u0017\u001bN\u0019\"\u0018V_\u0001.\u000b\u0011K\u00163S\u000bV\u001e,\u0018\f]\u001a\"S".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\u001c3\u001aV\\\u0003.\u0013\u001fV\u0010 \u000e\fC\u0016o\u0017\u001bN\u0019\"\u0018V_\u0001.\u000b\u0011K\u00163S\u001cF\u0014$\u000e\f\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u001c3\u001aV\\\u0003.\u0013\u001fV\u0010 \u000e\fC\u0016o\u0017\u001bN\u0019\"\u0018V_\u0001.\u000b\u0011K\u00163S\u0013J\n2\t\u0017]\u0016o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "2-\u001aVn\u001f(\u001c\u000b\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        z = strArr;
        toCharArray = "1.\b\u0016L\n\u0002\u001c\u000b[\u001f$]+J\u00104\u000f\u0011[\na-\n@\u0005(\u0019\u001d]S7LV\u001aG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c3 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c3);
        }
        info = new String(cArr).intern();
        strArr = new String[2];
        toCharArray = "2\u0004.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "2\u0013>L".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        SYMMETRIC_CIPHERS = strArr;
        strArr = new String[7];
        toCharArray = ">\u0005H".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = " \t<I".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = " \t<J\u001dG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = " \t<J\u001aE".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = " \t<K\u0017G".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = " \t<M\u001eA".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = " \t<K".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        DIGESTS = strArr;
        strArr = new String[2];
        toCharArray = "1\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "#\n>+\u001eA".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        KEYSTORES = strArr;
    }
}
