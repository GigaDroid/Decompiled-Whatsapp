package com.whatsapp.util.dns;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class e {
    private static final InetSocketAddress a;
    private static final InetSocketAddress b;
    private static final String[] z;

    static {
        String[] strArr = new String[27];
        String str = "IZ\tc,";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "IK\u000fedI";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0018I\u0003cu\u0000R\u00011";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001dU\u000bthIS\u0013e,\u001eT\u000f}iIM\u0013t~\u0010U\bv,";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001cR\u0003i|\f_\u0012thIH\u001faiIN\u0003ey\u001bR\u0003u,\u001eT\u000f}iIH\u0014he\u0007[FecIN\u0003bc\u0005J\u00031";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\fN\u0014~~I_\tuiIK\u0007b,\u001aY\u00121e\u0007\u001c\u0014t\u007f\u0019S\bbiIK\u000ex`\f\u001c\u0012cu\u0000R\u00011x\u0006\u001c\u0014t\u007f\u0006P\u0010t,";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "IK\u000ex`\f\u001c\u0012cu\u0000R\u00011x\u0006\u001c\u0014t\u007f\u0006P\u0010t,";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001cR\u0003i|\f_\u0012thI_\np\u007f\u001a\u001c\u0014tx\u001cN\bthIK\u000ex`\f\u001c\u0012cu\u0000R\u00011x\u0006\u001c\u0014t\u007f\u0006P\u0010t,";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\fN\u0014~~IL\u0007c\u007f\u0000R\u00011~\fO\u0016~b\u001aYFfd\u0000P\u00031x\u001bE\u000f\u007fkIH\t1~\fO\t}z\f\u001c";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001bY\u0005te\u001fY\u00021~\fO\u0016~b\u001aYFfe\u001dTFdb\fD\u0016to\u001dY\u00021e\r\u001c\u0011ye\u0005YFe~\u0010U\bv,\u001dSFci\u001aS\ngiI";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0000S\u0003io\fL\u0012xc\u0007\u001c\u0011ye\u0005YFe~\u0010U\bv,\u001dSFci\u001aS\ngiI";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "IZ\tc,";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "IZ\tc,";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0007SFpb\u001aK\u0003c\u007fIN\u0003ri\u0000J\u0003u,\u001eT\u000f}iIH\u0014he\u0007[FecIN\u0003bc\u0005J\u00031";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\rU\u00021b\u0006HFci\nY\u000fgiIN\u0003b|\u0006R\u0015t,\u000fN\t|,\u001aY\u0014gi\u001b\u001c\u0011ye\u0005YFe~\u0010U\bv,\u001dSFci\u001aS\ngiI";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001bY\u0015~`\u001fY\u00021";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    str = "I]\u0002u~\fO\u0015t\u007fII\u0015xb\u000e\u001c\u0004po\u0002I\u00161H'oFwc\u001b\u001c";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "IZ\tc,";
                    obj = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0018I\u0003cu\u0000R\u00011";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "IK\u000fedI";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001bY\u0005te\u001fY\u00021x\u001bI\brm\u001dY\u00021~\fO\u0016~b\u001aYFfd\u0000P\u00031x\u001bE\u000f\u007fkIH\t1~\fO\t}z\f\u001c";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "IQ\u00151x\u0000Q\u0003~y\u001d";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u001cR\u0003i|\f_\u0012thIu)Tt\nY\u0016ee\u0006RF";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "IQ\u00151x\u0000Q\u0003~y\u001d";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u001dU\u000bthIS\u0013e,\u001eT\u000f}iIM\u0013t~\u0010U\bv,";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001dU\u000btc\u001cHFfd\u0000P\u00031x\u001bE\u000f\u007fkIH\t1~\fO\t}z\f\u001c";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        a = new InetSocketAddress(InetAddress.getByAddress(new byte[]{(byte) 8, (byte) 8, (byte) 8, (byte) 8}), 53);
                        b = new InetSocketAddress(InetAddress.getByAddress(new byte[]{(byte) 8, (byte) 8, (byte) 4, (byte) 4}), 53);
                        return;
                    } catch (Throwable e) {
                        throw new Error(e);
                    }
                default:
                    strArr2[i] = str;
                    str = "\u001cR\u0003i|\f_\u0012thIN\u0003rc\u001bXF}i\u0007[\u0012y,\u001bY\u0012d~\u0007Y\u00021{\u0001U\nt,\u001dN\u001fxb\u000e\u001c\u0012~,\u001bY\u0015~`\u001fYF";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static d[] a(String str, int i) {
        int i2 = i.a;
        b a = b.a(str);
        byte[] c = a.c();
        byte[] bArr = new byte[512];
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                Log.i(z[19] + a + z[13] + str + z[2] + i + z[24]);
                datagramSocket.connect(a);
                datagramSocket.setSoTimeout(i / 2);
                datagramSocket.send(new DatagramPacket(c, c.length));
                datagramSocket.receive(datagramPacket);
            } catch (InterruptedIOException e) {
                Log.i(z[4] + a + z[18] + str);
                datagramSocket.disconnect();
                Log.i(z[3] + b + z[12] + str + z[20] + i + z[22]);
                datagramSocket.connect(b);
                datagramSocket.setSoTimeout(i / 2);
                datagramSocket.send(new DatagramPacket(c, c.length));
                datagramSocket.receive(datagramPacket);
            }
            b a2 = b.a(bArr);
            if (a2 == null) {
                try {
                    throw new UnknownHostException(z[9] + str);
                } catch (InterruptedIOException e2) {
                    throw e2;
                }
            }
            try {
                if (a2.a().f() != a.a().f()) {
                    throw new UnknownHostException(z[10] + str);
                }
                try {
                    if (a2.a().b()) {
                        try {
                            if (a2.a().c()) {
                                throw new UnknownHostException(z[21] + str);
                            }
                            try {
                                if (a2.a().d() != (short) 0) {
                                    throw new UnknownHostException(z[6] + str);
                                }
                                try {
                                    if (a2.b().length == 0) {
                                        throw new UnknownHostException(z[14] + str);
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    d[] dVarArr = new d[a2.b().length];
                                    int i3 = 0;
                                    while (i3 < a2.b().length) {
                                        g gVar = a2.b()[i3];
                                        try {
                                            if (gVar.f() != (short) 1) {
                                                throw new UnknownHostException(z[8] + str);
                                            }
                                            try {
                                                if (gVar.c() != (short) 1) {
                                                    throw new UnknownHostException(z[5] + str);
                                                }
                                                try {
                                                    if (gVar.b() == (short) 4) {
                                                        dVarArr[i3] = new d(InetAddress.getByAddress(a2.a(gVar.g()), gVar.a()), (((long) gVar.e()) * 1000) + currentTimeMillis);
                                                        i3++;
                                                        if (i2 != 0) {
                                                            break;
                                                        }
                                                    }
                                                    throw new UnknownHostException(z[1] + str);
                                                } catch (InterruptedIOException e22) {
                                                    throw e22;
                                                }
                                            } catch (InterruptedIOException e222) {
                                                throw e222;
                                            }
                                        } catch (InterruptedIOException e2222) {
                                            throw e2222;
                                        }
                                    }
                                    Log.i(z[16] + dVarArr.length + z[17] + str);
                                    return dVarArr;
                                } catch (InterruptedIOException e22222) {
                                    throw e22222;
                                }
                            } catch (InterruptedIOException e222222) {
                                throw e222222;
                            }
                        } catch (InterruptedIOException e2222222) {
                            throw e2222222;
                        }
                    }
                    throw new UnknownHostException(z[15] + str);
                } catch (InterruptedIOException e22222222) {
                    throw e22222222;
                }
            } catch (InterruptedIOException e222222222) {
                throw e222222222;
            }
        } catch (InterruptedIOException e3) {
            Log.i(z[25] + b + z[0] + str);
            throw new UnknownHostException(z[26] + str);
        } catch (IOException e4) {
            Log.w(z[23] + e4 + z[7] + str);
            throw new UnknownHostException(z[11] + str);
        }
    }
}
