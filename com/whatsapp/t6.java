package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ct;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class t6 implements Runnable {
    private static final String[] z;
    final int a;
    final long b;
    final ct c;
    final int d;
    final c3 e;
    final adn f;

    static {
        String[] strArr = new String[22];
        String str = "\u0016<\u001byqYu\bqsLr\u001f%";
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
                        i3 = 45;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0016<\u0002k@Xn\u0019}mYp\u0012Qmjn\u0004ms\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Ld\u0004tlYpKojApKjfNs\u0019|#Yt\u000e8aLo\u000e8hHeKmpHxKll\ro\u000evg\r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Ld\u0004tlYpK{lXp\u000f8mBhK~jJi\u0019}#Bi\u001f8kDo\u001fwqD\u007fK\u007fqBi\u001b7a_s\n|`Lo\u001f8nHq\t}q^t\u0002h8\rq\u000ekpL{\u000e6hHeV";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0016<\u001cypdr,jlXl*lWDq\u000eWe`y\u0018kbJyV";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "moEokLh\u0018ys]2\u0005}w";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Ld\u0004tlYpKojApKobDhKll\ro\u000evg\r";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\rx\u001e}#YsKjfYn\u00128qH\u007f\u000eqsY<\rwq\r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Ld\u0004tlYpK{kH\u007f\u0000qmJ<\fjlXlDzqB}\u000f{b^hKtj^hKuf@~\u000ejpEu\u001b8gXyKll\rn\u000elqT<\u0019}`Hu\u001bl8\rw\u000ea>";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Bn\u0002\u007fjC}\u00078nHo\u0018ydH<\ntqH}\u000fa#@}\u0019sfI<\u000f}oDj\u000ejfI'Kuf^o\n\u007ff\u0003w\u000ea>";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Ld\u0004tlYpK{kH\u007f\u0000qmJ<\u0018}p^u\u0004vp\rz\u0004j#";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Bn\u0002\u007fjC}\u00078nHo\u0018ydH<\u0003yp\r~\u000e}m\rx\u000etfYy\u000f##@y\u0018kbJyEsfT!";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "Ld\u0004tlYpKjf^y\u0005|jC{K\u007fqBi\u001b7a_s\n|`Lo\u001f8oDo\u001f8nHo\u0018ydH'Kuf^o\n\u007ff\u0003w\u000ea>";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Ld\u0004tlYpK~lXr\u000f8mB<\u001byqYu\bqsLr\u001f8kLo\u0003##@y\u0018kbJyEsfT!";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\ri\u0005ljA<\n8mHkKhqHw\u000ea#E}\u00188aHy\u00058eHh\bpfI";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Ld\u0004tlYpK|fAy\u001fqmJ<\u0018}p^u\u0004v#Ii\u000e8wB<\u0019}dDo\u001fjbYu\u0004v#DxK{kLr\f}#Ks\u00198";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0016<\u0002vgDj\u0002|vLp!qg\u0010";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0016<\u0002vgDj\u0002|vLp!qg\u0010";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Ld\u0004tlYpK{kH\u007f\u0000qmJ<\bwmIu\u001fqlCoK~l_<\fjlXlKjfYn\u00128wB<\u0002vgDj\u0002|vLpP8nHo\u0018ydH2\u0000}z\u0010";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Ld\u0004tlYpKjf\\i\u0002jjC{KvfZ<\u0018}p^u\u0004v#Oy\rwqH<\u0019}pHr\u000fqmJ'Kuf^o\n\u007ff\u0003w\u000ea>";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0016<\n\u007fd_y\fywHV\u0002|>";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016<\u0002vgDj\u0002|vLp!qg\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    t6(adn com_whatsapp_adn, c3 c3Var, ct ctVar, int i, int i2, long j) {
        this.f = com_whatsapp_adn;
        this.e = c3Var;
        this.c = ctVar;
        this.a = i;
        this.d = i2;
        this.b = j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r20 = this;
        r17 = com.whatsapp.DialogToastActivity.f;
        r0 = r20;
        r2 = r0.e;
        r2 = r2.c;
        r3 = com.whatsapp.qm.i(r2);
        r0 = r20;
        r2 = r0.e;
        r2 = r2.c;
        r4 = com.whatsapp.protocol.co.a(r2);
        r2 = com.whatsapp.App.aK;
        r0 = r20;
        r5 = r0.e;
        r18 = r2.a(r5);
        r2 = com.whatsapp.App.aK;
        r0 = r20;
        r5 = r0.e;
        r2 = r2.e(r5);
        r5 = r2.a;
        if (r3 != 0) goto L_0x0030;
    L_0x002e:
        if (r4 == 0) goto L_0x03a8;
    L_0x0030:
        r0 = r20;
        r2 = r0.c;
        r2 = r2.d;
    L_0x0036:
        r2 = r5.get(r2);
        r2 = (com.whatsapp.x4) r2;
        if (r2 == 0) goto L_0x03b0;
    L_0x003e:
        r6 = r2.d;
        r8 = 0;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 <= 0) goto L_0x03b0;
    L_0x0046:
        r2 = 1;
        r16 = r2;
    L_0x0049:
        if (r3 != 0) goto L_0x004d;
    L_0x004b:
        if (r4 == 0) goto L_0x02df;
    L_0x004d:
        r0 = r20;
        r2 = r0.c;
        r5 = r2.e;
        r0 = r20;
        r2 = r0.c;
        r6 = r2.d;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r20;
        r3 = r0.e;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 21;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r5);
        r3 = z;
        r4 = 17;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r4 = com.whatsapp.qm.c(r5);
        r2 = r4.a(r6);
        if (r2 == 0) goto L_0x03b5;
    L_0x009d:
        r3 = 1;
    L_0x009e:
        if (r18 != 0) goto L_0x00c1;
    L_0x00a0:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 12;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r0 = r20;
        r7 = r0.e;
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = 0;
        if (r17 == 0) goto L_0x015f;
    L_0x00c1:
        if (r16 == 0) goto L_0x00f4;
    L_0x00c3:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 10;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r0 = r20;
        r7 = r0.e;
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = 0;
        r0 = r20;
        r7 = r0.f;
        r7 = com.whatsapp.adn.a(r7);
        r8 = new com.whatsapp.fieldstats.ab;
        r8.<init>();
        com.whatsapp.fieldstats.i.a(r7, r8);
        if (r17 == 0) goto L_0x015f;
    L_0x00f4:
        r0 = r18;
        r2 = r0.g;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x011f;
    L_0x00fe:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 14;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r0 = r20;
        r7 = r0.e;
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = 0;
        if (r17 == 0) goto L_0x015f;
    L_0x011f:
        r2 = r4.a();
        r0 = r18;
        r4 = r0.g;
        r2 = android.text.TextUtils.equals(r2, r4);
        if (r2 == 0) goto L_0x012f;
    L_0x012d:
        if (r17 == 0) goto L_0x046e;
    L_0x012f:
        r2 = com.whatsapp.App.aK;
        r0 = r18;
        r4 = r0.g;
        r4 = r2.b(r5, r4);
        if (r4 != 0) goto L_0x015b;
    L_0x013b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 4;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r0 = r20;
        r7 = r0.e;
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = 0;
        if (r17 == 0) goto L_0x015f;
    L_0x015b:
        r2 = r4.contains(r6);
    L_0x015f:
        if (r3 != 0) goto L_0x0163;
    L_0x0161:
        if (r2 == 0) goto L_0x02d6;
    L_0x0163:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r7 = z;
        r8 = 13;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r0 = r20;
        r7 = r0.e;
        r4 = r4.append(r7);
        r7 = z;
        r8 = 0;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r4 = r4.append(r6);
        r7 = z;
        r8 = 2;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r4 = r4.append(r3);
        r7 = z;
        r8 = 5;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = com.whatsapp.proto.E2E.Message.newBuilder();
        if (r3 == 0) goto L_0x01fc;
    L_0x01ae:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r7 = com.whatsapp.App.ay;
        r7 = r7.jabber_id;
        r3 = r3.append(r7);
        r7 = z;
        r8 = 6;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r3 = r3.toString();
        r3 = com.whatsapp.awc.e(r3);
        r7 = new org.whispersystems.bI;
        r7.<init>(r5, r3);
        r3 = new org.whispersystems.aR;
        r0 = r20;
        r8 = r0.f;
        r8 = com.whatsapp.adn.b(r8);
        r8 = r8.c();
        r3.<init>(r8);
        r3 = r3.a(r7);
        r3 = r3.b();
        r7 = r4.getSenderKeyDistributionMessageBuilder();
        r7.setGroupId(r5);
        r7 = r4.getSenderKeyDistributionMessageBuilder();
        r3 = com.google.hx.a(r3);
        r7.setAxolotlSenderKeyDistributionMessage(r3);
    L_0x01fc:
        if (r2 == 0) goto L_0x0204;
    L_0x01fe:
        r2 = 0;
        r0 = r18;
        com.whatsapp.util.ai.a(r0, r4, r2);
    L_0x0204:
        r3 = r4.build();
        r10 = 0;
        r2 = com.whatsapp.awc.e(r6);
        r0 = r20;
        r4 = r0.f;
        r4 = com.whatsapp.adn.b(r4);
        r4 = r4.b(r2);
        if (r4 == 0) goto L_0x029b;
    L_0x021b:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r7 = z;
        r8 = 19;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r0 = r20;
        r7 = r0.e;
        r4 = r4.append(r7);
        r7 = z;
        r8 = 1;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r4 = r4.append(r6);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r0 = r20;
        r4 = r0.f;
        r4 = com.whatsapp.adn.b(r4);
        r2 = r4.a(r2);
        r0 = r20;
        r4 = r0.a;
        r7 = 2;
        if (r4 >= r7) goto L_0x0267;
    L_0x0259:
        r4 = r2.a();
        r4 = r4.k();
        r0 = r20;
        r7 = r0.d;
        if (r4 == r7) goto L_0x029b;
    L_0x0267:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r7 = z;
        r8 = 20;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r0 = r20;
        r7 = r0.e;
        r4 = r4.append(r7);
        r7 = z;
        r8 = 18;
        r7 = r7[r8];
        r4 = r4.append(r7);
        r4 = r4.append(r6);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r2 = r2.a();
        r10 = r2.j();
    L_0x029b:
        r2 = de.greenrobot.event.h.b();
        r4 = com.whatsapp.amm.class;
        r2 = r2.b(r4);
        r2 = (com.whatsapp.amm) r2;
        r12 = r2.a();
        r0 = r20;
        r2 = r0.f;
        r2 = com.whatsapp.adn.c(r2);
        r0 = r2.ai;
        r19 = r0;
        r2 = new com.whatsapp.jobqueue.job.SendE2EMessageJob;
        r0 = r20;
        r4 = r0.e;
        r4 = r4.b;
        r0 = r20;
        r7 = r0.a;
        r8 = 0;
        r9 = 0;
        r11 = 0;
        r14 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r12 = r12 + r14;
        r0 = r20;
        r14 = r0.b;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14);
        r0 = r19;
        r0.a(r2);
    L_0x02d6:
        r0 = r20;
        r2 = r0.c;
        com.whatsapp.App.b(r2);
        if (r17 == 0) goto L_0x03a7;
    L_0x02df:
        r0 = r20;
        r2 = r0.e;
        r2 = r2.c;
        r2 = com.whatsapp.awc.e(r2);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r2);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r20;
        r4 = r0.e;
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r0 = r20;
        r3 = r0.f;
        r3 = com.whatsapp.adn.b(r3);
        r3 = r3.b(r2);
        if (r3 == 0) goto L_0x044b;
    L_0x0323:
        r0 = r20;
        r3 = r0.f;
        r3 = com.whatsapp.adn.b(r3);
        r3 = r3.a(r2);
        r4 = r3.a();
        r8 = r4.j();
        r4 = com.whatsapp.App.as;
        r0 = r20;
        r5 = r0.e;
        r5 = r5.c;
        r6 = 0;
        r7 = com.whatsapp.ms.ALLOW;
        r9 = r4.a(r5, r6, r7);
        r3 = r3.a();
        r3 = r3.k();
        r0 = r20;
        r4 = r0.d;
        if (r3 == r4) goto L_0x03b8;
    L_0x0354:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 16;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r20;
        r4 = r0.e;
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r0 = r20;
        r3 = r0.f;
        r3 = com.whatsapp.adn.b(r3);
        r3.a(r2);
        r0 = r20;
        r3 = r0.f;
        r3 = com.whatsapp.adn.b(r3);
        r3.b(r2);
        r0 = r20;
        r2 = r0.f;
        r2 = com.whatsapp.adn.c(r2);
        r2 = r2.M();
        r3 = new com.whatsapp.cl;
        r5 = 1;
        r0 = r20;
        r6 = r0.b;
        r4 = r20;
        r10 = r16;
        r11 = r18;
        r3.<init>(r4, r5, r6, r8, r9, r10, r11);
        r2.post(r3);
    L_0x03a7:
        return;
    L_0x03a8:
        r0 = r20;
        r2 = r0.c;
        r2 = r2.e;
        goto L_0x0036;
    L_0x03b0:
        r2 = 0;
        r16 = r2;
        goto L_0x0049;
    L_0x03b5:
        r3 = 0;
        goto L_0x009e;
    L_0x03b8:
        r0 = r20;
        r3 = r0.a;
        r4 = 2;
        if (r3 <= r4) goto L_0x0418;
    L_0x03bf:
        r0 = r20;
        r3 = r0.f;
        r3 = com.whatsapp.adn.b(r3);
        r0 = r20;
        r4 = r0.e;
        r2 = r3.a(r2, r4);
        if (r2 == 0) goto L_0x0418;
    L_0x03d1:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r20;
        r3 = r0.e;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r20;
        r2 = r0.f;
        r2 = com.whatsapp.adn.c(r2);
        r2 = r2.M();
        r3 = new com.whatsapp.cl;
        r5 = 1;
        r0 = r20;
        r6 = r0.b;
        r4 = r20;
        r10 = r16;
        r11 = r18;
        r3.<init>(r4, r5, r6, r8, r9, r10, r11);
        r2.post(r3);
        goto L_0x03a7;
    L_0x0418:
        r0 = r20;
        r2 = r0.a;
        r3 = 2;
        if (r2 != r3) goto L_0x044b;
    L_0x041f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r20;
        r3 = r0.e;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r20;
        r2 = r0.f;
        r2 = com.whatsapp.adn.b(r2);
        r0 = r20;
        r3 = r0.e;
        r2.a(r3, r8);
    L_0x044b:
        r0 = r20;
        r2 = r0.f;
        r2 = com.whatsapp.adn.c(r2);
        r2 = r2.M();
        r3 = new com.whatsapp.cl;
        r5 = 0;
        r0 = r20;
        r6 = r0.b;
        r8 = 0;
        r9 = 0;
        r4 = r20;
        r10 = r16;
        r11 = r18;
        r3.<init>(r4, r5, r6, r8, r9, r10, r11);
        r2.post(r3);
        goto L_0x03a7;
    L_0x046e:
        r2 = r3;
        goto L_0x015f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t6.run():void");
    }
}
