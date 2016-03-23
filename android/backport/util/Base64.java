package android.backport.util;

import com.whatsapp.WAAppCompatActivity;
import java.io.UnsupportedEncodingException;
import org.v;
import org.whispersystems.at;

public class Base64 {
    static final boolean $assertionsDisabled;
    public static int a;
    private static final String[] z;

    abstract class Coder {
        public int op;
        public byte[] output;

        Coder() {
        }
    }

    class Decoder extends Coder {
        private static final int[] DECODE;
        private static final int[] DECODE_WEBSAFE;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
            DECODE = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            DECODE_WEBSAFE = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        }

        public Decoder(int i, byte[] bArr) {
            int[] iArr;
            this.output = bArr;
            if ((i & 8) == 0) {
                iArr = DECODE;
            } else {
                iArr = DECODE_WEBSAFE;
            }
            this.alphabet = iArr;
            this.state = 0;
            this.value = 0;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(byte[] r11, int r12, int r13, boolean r14) {
            /*
            r10 = this;
            r0 = r10.state;
            r1 = 6;
            if (r0 != r1) goto L_0x0007;
        L_0x0005:
            r0 = 0;
        L_0x0006:
            return r0;
        L_0x0007:
            r4 = r13 + r12;
            r3 = r10.state;
            r1 = r10.value;
            r0 = 0;
            r5 = r10.output;
            r6 = r10.alphabet;
            r2 = r12;
        L_0x0013:
            if (r2 >= r4) goto L_0x0133;
        L_0x0015:
            if (r3 != 0) goto L_0x0067;
        L_0x0017:
            r7 = r2 + 4;
            if (r7 > r4) goto L_0x005a;
        L_0x001b:
            r1 = r11[r2];
            r1 = r1 & 255;
            r1 = r6[r1];
            r1 = r1 << 18;
            r7 = r2 + 1;
            r7 = r11[r7];
            r7 = r7 & 255;
            r7 = r6[r7];
            r7 = r7 << 12;
            r1 = r1 | r7;
            r7 = r2 + 2;
            r7 = r11[r7];
            r7 = r7 & 255;
            r7 = r6[r7];
            r7 = r7 << 6;
            r1 = r1 | r7;
            r7 = r2 + 3;
            r7 = r11[r7];
            r7 = r7 & 255;
            r7 = r6[r7];
            r1 = r1 | r7;
            if (r1 < 0) goto L_0x005a;
        L_0x0044:
            r7 = r0 + 2;
            r8 = (byte) r1;
            r5[r7] = r8;
            r7 = r0 + 1;
            r8 = r1 >> 8;
            r8 = (byte) r8;
            r5[r7] = r8;
            r7 = r1 >> 16;
            r7 = (byte) r7;
            r5[r0] = r7;
            r0 = r0 + 3;
            r2 = r2 + 4;
            goto L_0x0017;
        L_0x005a:
            if (r2 < r4) goto L_0x0067;
        L_0x005c:
            r2 = r1;
        L_0x005d:
            if (r14 != 0) goto L_0x0105;
        L_0x005f:
            r10.state = r3;
            r10.value = r2;
            r10.op = r0;
            r0 = 1;
            goto L_0x0006;
        L_0x0067:
            r12 = r2 + 1;
            r2 = r11[r2];
            r2 = r2 & 255;
            r2 = r6[r2];
            switch(r3) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0086;
                case 2: goto L_0x0097;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00fc;
                default: goto L_0x0072;
            };
        L_0x0072:
            r2 = r3;
        L_0x0073:
            r3 = r2;
            r2 = r12;
            goto L_0x0013;
        L_0x0076:
            if (r2 < 0) goto L_0x007e;
        L_0x0078:
            r1 = r3 + 1;
            r9 = r2;
            r2 = r1;
            r1 = r9;
            goto L_0x0073;
        L_0x007e:
            r7 = -1;
            if (r2 == r7) goto L_0x0072;
        L_0x0081:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x0086:
            if (r2 < 0) goto L_0x008e;
        L_0x0088:
            r1 = r1 << 6;
            r1 = r1 | r2;
            r2 = r3 + 1;
            goto L_0x0073;
        L_0x008e:
            r7 = -1;
            if (r2 == r7) goto L_0x0072;
        L_0x0091:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x0097:
            if (r2 < 0) goto L_0x009f;
        L_0x0099:
            r1 = r1 << 6;
            r1 = r1 | r2;
            r2 = r3 + 1;
            goto L_0x0073;
        L_0x009f:
            r7 = -2;
            if (r2 != r7) goto L_0x00ae;
        L_0x00a2:
            r2 = r0 + 1;
            r3 = r1 >> 4;
            r3 = (byte) r3;
            r5[r0] = r3;
            r0 = 4;
            r9 = r2;
            r2 = r0;
            r0 = r9;
            goto L_0x0073;
        L_0x00ae:
            r7 = -1;
            if (r2 == r7) goto L_0x0072;
        L_0x00b1:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x00b7:
            if (r2 < 0) goto L_0x00d1;
        L_0x00b9:
            r1 = r1 << 6;
            r1 = r1 | r2;
            r2 = r0 + 2;
            r3 = (byte) r1;
            r5[r2] = r3;
            r2 = r0 + 1;
            r3 = r1 >> 8;
            r3 = (byte) r3;
            r5[r2] = r3;
            r2 = r1 >> 16;
            r2 = (byte) r2;
            r5[r0] = r2;
            r0 = r0 + 3;
            r2 = 0;
            goto L_0x0073;
        L_0x00d1:
            r7 = -2;
            if (r2 != r7) goto L_0x00e4;
        L_0x00d4:
            r2 = r0 + 1;
            r3 = r1 >> 2;
            r3 = (byte) r3;
            r5[r2] = r3;
            r2 = r1 >> 10;
            r2 = (byte) r2;
            r5[r0] = r2;
            r0 = r0 + 2;
            r2 = 5;
            goto L_0x0073;
        L_0x00e4:
            r7 = -1;
            if (r2 == r7) goto L_0x0072;
        L_0x00e7:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x00ed:
            r7 = -2;
            if (r2 != r7) goto L_0x00f3;
        L_0x00f0:
            r2 = r3 + 1;
            goto L_0x0073;
        L_0x00f3:
            r7 = -1;
            if (r2 == r7) goto L_0x0072;
        L_0x00f6:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x00fc:
            r7 = -1;
            if (r2 == r7) goto L_0x0072;
        L_0x00ff:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x0105:
            switch(r3) {
                case 0: goto L_0x0108;
                case 1: goto L_0x010f;
                case 2: goto L_0x0115;
                case 3: goto L_0x011e;
                case 4: goto L_0x012d;
                default: goto L_0x0108;
            };
        L_0x0108:
            r10.state = r3;
            r10.op = r0;
            r0 = 1;
            goto L_0x0006;
        L_0x010f:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x0115:
            r1 = r0 + 1;
            r2 = r2 >> 4;
            r2 = (byte) r2;
            r5[r0] = r2;
            r0 = r1;
            goto L_0x0108;
        L_0x011e:
            r1 = r0 + 1;
            r4 = r2 >> 10;
            r4 = (byte) r4;
            r5[r0] = r4;
            r0 = r1 + 1;
            r2 = r2 >> 2;
            r2 = (byte) r2;
            r5[r1] = r2;
            goto L_0x0108;
        L_0x012d:
            r0 = 6;
            r10.state = r0;
            r0 = 0;
            goto L_0x0006;
        L_0x0133:
            r2 = r1;
            goto L_0x005d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.backport.util.Base64.Decoder.process(byte[], int, int, boolean):boolean");
        }
    }

    class Encoder extends Coder {
        static final boolean $assertionsDisabled;
        private static final byte[] ENCODE;
        private static final byte[] ENCODE_WEBSAFE;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i, byte[] bArr) {
            boolean z;
            byte[] bArr2;
            int i2;
            boolean z2 = true;
            int i3 = Base64.a;
            this.output = bArr;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.do_padding = z;
            this.do_newline = (i & 2) == 0;
            if ((i & 4) == 0) {
                z2 = false;
            }
            this.do_cr = z2;
            if ((i & 8) == 0) {
                bArr2 = ENCODE;
            } else {
                bArr2 = ENCODE_WEBSAFE;
            }
            this.alphabet = bArr2;
            this.tail = new byte[2];
            this.tailLen = 0;
            if (this.do_newline) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.count = i2;
            if (i3 != 0) {
                WAAppCompatActivity.c++;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(byte[] r13, int r14, int r15, boolean r16) {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
            /*
            r12 = this;
            r6 = android.backport.util.Base64.a;
            r7 = r12.alphabet;
            r8 = r12.output;
            r4 = 0;
            r0 = r12.count;
            r9 = r15 + r14;
            r1 = -1;
            r2 = r12.tailLen;
            switch(r2) {
                case 0: goto L_0x0198;
                case 1: goto L_0x019a;
                case 2: goto L_0x01bc;
                default: goto L_0x0011;
            };
        L_0x0011:
            r2 = r1;
            r3 = r14;
        L_0x0013:
            r1 = -1;
            if (r2 == r1) goto L_0x004d;
        L_0x0016:
            r1 = 1;
            r5 = r2 >> 18;
            r5 = r5 & 63;
            r5 = r7[r5];
            r8[r4] = r5;
            r4 = 2;
            r5 = r2 >> 12;
            r5 = r5 & 63;
            r5 = r7[r5];
            r8[r1] = r5;
            r5 = 3;
            r1 = r2 >> 6;
            r1 = r1 & 63;
            r1 = r7[r1];
            r8[r4] = r1;
            r1 = 4;
            r2 = r2 & 63;
            r2 = r7[r2];
            r8[r5] = r2;
            r0 = r0 + -1;
            if (r0 != 0) goto L_0x0253;
        L_0x003c:
            r0 = r12.do_cr;
            if (r0 == 0) goto L_0x0256;
        L_0x0040:
            r0 = 5;
            r2 = 13;
            r8[r1] = r2;
        L_0x0045:
            r4 = r0 + 1;
            r1 = 10;
            r8[r0] = r1;
            r0 = 19;
        L_0x004d:
            r1 = r3 + 3;
            if (r1 > r9) goto L_0x00a7;
        L_0x0051:
            r1 = r13[r3];
            r1 = r1 & 255;
            r1 = r1 << 16;
            r2 = r3 + 1;
            r2 = r13[r2];
            r2 = r2 & 255;
            r2 = r2 << 8;
            r1 = r1 | r2;
            r2 = r3 + 2;
            r2 = r13[r2];
            r2 = r2 & 255;
            r1 = r1 | r2;
            r2 = r1 >> 18;
            r2 = r2 & 63;
            r2 = r7[r2];
            r8[r4] = r2;
            r2 = r4 + 1;
            r5 = r1 >> 12;
            r5 = r5 & 63;
            r5 = r7[r5];
            r8[r2] = r5;
            r2 = r4 + 2;
            r5 = r1 >> 6;
            r5 = r5 & 63;
            r5 = r7[r5];
            r8[r2] = r5;
            r2 = r4 + 3;
            r1 = r1 & 63;
            r1 = r7[r1];
            r8[r2] = r1;
            r3 = r3 + 3;
            r1 = r4 + 4;
            r0 = r0 + -1;
            if (r0 != 0) goto L_0x0253;
        L_0x0093:
            r0 = r12.do_cr;
            if (r0 == 0) goto L_0x0250;
        L_0x0097:
            r0 = r1 + 1;
            r2 = 13;
            r8[r1] = r2;
        L_0x009d:
            r4 = r0 + 1;
            r1 = 10;
            r8[r0] = r1;
            r0 = 19;
            if (r6 == 0) goto L_0x004d;
        L_0x00a7:
            r5 = r0;
            if (r16 == 0) goto L_0x0203;
        L_0x00aa:
            r0 = r12.tailLen;
            r0 = r3 - r0;
            r1 = r9 + -1;
            if (r0 != r1) goto L_0x024c;
        L_0x00b2:
            r2 = 0;
            r0 = r12.tailLen;
            if (r0 <= 0) goto L_0x01e0;
        L_0x00b7:
            r0 = r12.tail;
            r1 = 1;
            r0 = r0[r2];
            r2 = r3;
        L_0x00bd:
            r0 = r0 & 255;
            r3 = r0 << 4;
            r0 = r12.tailLen;
            r0 = r0 - r1;
            r12.tailLen = r0;
            r1 = r4 + 1;
            r0 = r3 >> 6;
            r0 = r0 & 63;
            r0 = r7[r0];
            r8[r4] = r0;
            r0 = r1 + 1;
            r3 = r3 & 63;
            r3 = r7[r3];
            r8[r1] = r3;
            r1 = r12.do_padding;
            if (r1 == 0) goto L_0x00e8;
        L_0x00dc:
            r1 = r0 + 1;
            r3 = 61;
            r8[r0] = r3;
            r0 = r1 + 1;
            r3 = 61;
            r8[r1] = r3;
        L_0x00e8:
            r1 = r12.do_newline;
            if (r1 == 0) goto L_0x00fe;
        L_0x00ec:
            r1 = r12.do_cr;
            if (r1 == 0) goto L_0x00f7;
        L_0x00f0:
            r1 = r0 + 1;
            r3 = 13;
            r8[r0] = r3;
            r0 = r1;
        L_0x00f7:
            r1 = r0 + 1;
            r3 = 10;
            r8[r0] = r3;
            r0 = r1;
        L_0x00fe:
            if (r6 == 0) goto L_0x0249;
        L_0x0100:
            r1 = r12.tailLen;
            r1 = r2 - r1;
            r3 = r9 + -2;
            if (r1 != r3) goto L_0x0246;
        L_0x0108:
            r4 = 0;
            r1 = r12.tailLen;
            r3 = 1;
            if (r1 <= r3) goto L_0x01e9;
        L_0x010e:
            r1 = r12.tail;
            r3 = 1;
            r1 = r1[r4];
            r11 = r3;
            r3 = r2;
            r2 = r11;
        L_0x0116:
            r1 = r1 & 255;
            r10 = r1 << 10;
            r1 = r12.tailLen;
            if (r1 <= 0) goto L_0x01f0;
        L_0x011e:
            r1 = r12.tail;
            r4 = r2 + 1;
            r1 = r1[r2];
            r2 = r4;
        L_0x0125:
            r1 = r1 & 255;
            r1 = r1 << 2;
            r4 = r10 | r1;
            r1 = r12.tailLen;
            r1 = r1 - r2;
            r12.tailLen = r1;
            r1 = r0 + 1;
            r2 = r4 >> 12;
            r2 = r2 & 63;
            r2 = r7[r2];
            r8[r0] = r2;
            r0 = r1 + 1;
            r2 = r4 >> 6;
            r2 = r2 & 63;
            r2 = r7[r2];
            r8[r1] = r2;
            r1 = r0 + 1;
            r2 = r4 & 63;
            r2 = r7[r2];
            r8[r0] = r2;
            r0 = r12.do_padding;
            if (r0 == 0) goto L_0x0243;
        L_0x0150:
            r0 = r1 + 1;
            r2 = 61;
            r8[r1] = r2;
        L_0x0156:
            r1 = r12.do_newline;
            if (r1 == 0) goto L_0x016c;
        L_0x015a:
            r1 = r12.do_cr;
            if (r1 == 0) goto L_0x0165;
        L_0x015e:
            r1 = r0 + 1;
            r2 = 13;
            r8[r0] = r2;
            r0 = r1;
        L_0x0165:
            r1 = r0 + 1;
            r2 = 10;
            r8[r0] = r2;
            r0 = r1;
        L_0x016c:
            if (r6 == 0) goto L_0x018a;
        L_0x016e:
            r1 = r12.do_newline;
            if (r1 == 0) goto L_0x018a;
        L_0x0172:
            if (r0 <= 0) goto L_0x018a;
        L_0x0174:
            r1 = 19;
            if (r5 == r1) goto L_0x018a;
        L_0x0178:
            r1 = r12.do_cr;
            if (r1 == 0) goto L_0x0183;
        L_0x017c:
            r1 = r0 + 1;
            r2 = 13;
            r8[r0] = r2;
            r0 = r1;
        L_0x0183:
            r1 = r0 + 1;
            r2 = 10;
            r8[r0] = r2;
            r0 = r1;
        L_0x018a:
            r1 = $assertionsDisabled;
            if (r1 != 0) goto L_0x01f7;
        L_0x018e:
            r1 = r12.tailLen;
            if (r1 == 0) goto L_0x01f7;
        L_0x0192:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0198:
            if (r6 == 0) goto L_0x0011;
        L_0x019a:
            r2 = r14 + 2;
            if (r2 > r9) goto L_0x0011;
        L_0x019e:
            r1 = r12.tail;
            r2 = 0;
            r1 = r1[r2];
            r1 = r1 & 255;
            r1 = r1 << 16;
            r2 = r14 + 1;
            r3 = r13[r14];
            r3 = r3 & 255;
            r3 = r3 << 8;
            r1 = r1 | r3;
            r14 = r2 + 1;
            r2 = r13[r2];
            r2 = r2 & 255;
            r1 = r1 | r2;
            r2 = 0;
            r12.tailLen = r2;
            if (r6 == 0) goto L_0x0011;
        L_0x01bc:
            r3 = r14;
            r2 = r3 + 1;
            if (r2 > r9) goto L_0x0259;
        L_0x01c1:
            r1 = r12.tail;
            r2 = 0;
            r1 = r1[r2];
            r1 = r1 & 255;
            r1 = r1 << 16;
            r2 = r12.tail;
            r5 = 1;
            r2 = r2[r5];
            r2 = r2 & 255;
            r2 = r2 << 8;
            r1 = r1 | r2;
            r14 = r3 + 1;
            r2 = r13[r3];
            r2 = r2 & 255;
            r1 = r1 | r2;
            r2 = 0;
            r12.tailLen = r2;
            goto L_0x0011;
        L_0x01e0:
            r1 = r3 + 1;
            r0 = r13[r3];
            r11 = r2;
            r2 = r1;
            r1 = r11;
            goto L_0x00bd;
        L_0x01e9:
            r3 = r2 + 1;
            r1 = r13[r2];
            r2 = r4;
            goto L_0x0116;
        L_0x01f0:
            r4 = r3 + 1;
            r1 = r13[r3];
            r3 = r4;
            goto L_0x0125;
        L_0x01f7:
            r1 = $assertionsDisabled;
            if (r1 != 0) goto L_0x0241;
        L_0x01fb:
            if (r3 == r9) goto L_0x0241;
        L_0x01fd:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0203:
            r0 = r9 + -1;
            if (r3 != r0) goto L_0x0215;
        L_0x0207:
            r0 = r12.tail;
            r1 = r12.tailLen;
            r2 = r1 + 1;
            r12.tailLen = r2;
            r2 = r13[r3];
            r0[r1] = r2;
            if (r6 == 0) goto L_0x0233;
        L_0x0215:
            r0 = r9 + -2;
            if (r3 != r0) goto L_0x0233;
        L_0x0219:
            r0 = r12.tail;
            r1 = r12.tailLen;
            r2 = r1 + 1;
            r12.tailLen = r2;
            r2 = r13[r3];
            r0[r1] = r2;
            r0 = r12.tail;
            r1 = r12.tailLen;
            r2 = r1 + 1;
            r12.tailLen = r2;
            r2 = r3 + 1;
            r2 = r13[r2];
            r0[r1] = r2;
        L_0x0233:
            r12.op = r4;
            r12.count = r5;
            r0 = 1;
            r1 = com.whatsapp.WAAppCompatActivity.c;
            if (r1 == 0) goto L_0x0240;
        L_0x023c:
            r1 = r6 + 1;
            android.backport.util.Base64.a = r1;
        L_0x0240:
            return r0;
        L_0x0241:
            r4 = r0;
            goto L_0x0233;
        L_0x0243:
            r0 = r1;
            goto L_0x0156;
        L_0x0246:
            r3 = r2;
            goto L_0x016e;
        L_0x0249:
            r3 = r2;
            goto L_0x018a;
        L_0x024c:
            r2 = r3;
            r0 = r4;
            goto L_0x0100;
        L_0x0250:
            r0 = r1;
            goto L_0x009d;
        L_0x0253:
            r4 = r1;
            goto L_0x004d;
        L_0x0256:
            r0 = r1;
            goto L_0x0045;
        L_0x0259:
            r2 = r1;
            goto L_0x0013;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.backport.util.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }

        static {
            boolean z;
            if (Base64.class.desiredAssertionStatus()) {
                z = false;
            } else {
                z = true;
            }
            $assertionsDisabled = z;
            ENCODE = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
            ENCODE_WEBSAFE = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        }
    }

    public static String encodeToString(byte[] bArr, int i, int i2, int i3) {
        try {
            return new String(encode(bArr, i, i2, i3), z[0]);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        Decoder decoder = new Decoder(i3, new byte[((i2 * 3) / 4)]);
        try {
            if (decoder.process(bArr, i, i2, true)) {
                try {
                    if (decoder.op == decoder.output.length) {
                        return decoder.output;
                    }
                    byte[] bArr2 = new byte[decoder.op];
                    System.arraycopy(decoder.output, 0, bArr2, 0, decoder.op);
                    return bArr2;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[2]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encode(byte[] r5, int r6, int r7, int r8) {
        /*
        r1 = 1;
        r2 = a;
        r3 = new android.backport.util.Base64$Encoder;
        r0 = 0;
        r3.<init>(r8, r0);
        r0 = r7 / 3;
        r0 = r0 * 4;
        r4 = r3.do_padding;	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r4 == 0) goto L_0x0019;
    L_0x0011:
        r4 = r7 % 3;
        if (r4 <= 0) goto L_0x001e;
    L_0x0015:
        r0 = r0 + 4;
        if (r2 == 0) goto L_0x001e;
    L_0x0019:
        r4 = r7 % 3;
        switch(r4) {
            case 0: goto L_0x0056;
            case 1: goto L_0x0058;
            case 2: goto L_0x005c;
            default: goto L_0x001e;
        };
    L_0x001e:
        r2 = r0;
    L_0x001f:
        r0 = r3.do_newline;	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r0 == 0) goto L_0x006d;
    L_0x0023:
        if (r7 <= 0) goto L_0x006d;
    L_0x0025:
        r0 = r7 + -1;
        r0 = r0 / 57;
        r4 = r0 + 1;
        r0 = r3.do_cr;	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r0 == 0) goto L_0x0066;
    L_0x002f:
        r0 = 2;
    L_0x0030:
        r0 = r0 * r4;
        r0 = r0 + r2;
    L_0x0032:
        r1 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3.output = r1;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1 = 1;
        r3.process(r5, r6, r7, r1);	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1 = $assertionsDisabled;	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r1 != 0) goto L_0x006a;
    L_0x003e:
        r1 = r3.op;	 Catch:{ IllegalArgumentException -> 0x0048 }
        if (r1 == r0) goto L_0x006a;
    L_0x0042:
        r0 = new java.lang.AssertionError;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0048 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        if (r2 == 0) goto L_0x001e;
    L_0x0058:
        r0 = r0 + 2;
        if (r2 == 0) goto L_0x001e;
    L_0x005c:
        r0 = r0 + 3;
        r2 = r0;
        goto L_0x001f;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = r1;
        goto L_0x0030;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x006a:
        r0 = r3.output;
        return r0;
    L_0x006d:
        r0 = r2;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.backport.util.Base64.encode(byte[], int, int, int):byte[]");
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), z[1]);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    private Base64() {
    }

    static {
        boolean z = true;
        String[] strArr = new String[3];
        String str = "l}5@\u0005zgQ";
        boolean z2 = true;
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 24;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "[O|!4X]},`\r";
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (Base64.class.desiredAssertionStatus()) {
                            z = false;
                        }
                        $assertionsDisabled = z;
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "l}5@\u0005zgQ";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }
}
