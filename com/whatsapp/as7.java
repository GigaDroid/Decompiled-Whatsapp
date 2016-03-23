package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class as7 {
    public static final Date a;
    public static final Map b;

    static {
        int i = 0;
        a = new Date(1469051233000L);
        b = new HashMap();
        String[] strArr = new String[2];
        String str = ">m\u001dIo:(@_w+r][s";
        int i2 = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i3 = 0;
        while (true) {
            int i4;
            int i5;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i4 = 0; length > i4; i4++) {
                char c = cArr[i4];
                switch (i4 % 5) {
                    case v.m /*0*/:
                        i5 = 91;
                        break;
                    case at.g /*1*/:
                        i5 = 92;
                        break;
                    case at.i /*2*/:
                        i5 = 51;
                        break;
                    case at.o /*3*/:
                        i5 = 62;
                        break;
                    default:
                        i5 = 7;
                        break;
                }
                cArr[i4] = (char) (i5 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    List arrayList;
                    strArr2[i3] = str;
                    for (String str2 : strArr3) {
                        try {
                            arrayList = new ArrayList();
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 100}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 115}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 25}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -83, (byte) -64, (byte) -34, (byte) -87}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -83, (byte) -63, (byte) -51, (byte) 24}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -83, (byte) -63, (byte) -26, (byte) 113}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -82, (byte) 36, (byte) -46, (byte) 46}));
                            arrayList.add(InetAddress.getByAddress(str2, new byte[]{(byte) -82, (byte) 37, (byte) -57, (byte) -46}));
                            b.put(str2, arrayList);
                        } catch (UnknownHostException e) {
                        }
                    }
                    strArr = new String[2];
                    str = ">m\u0003\u0010p3=GMf+,\u001dPb/";
                    i2 = -1;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i3 = 0;
                    while (true) {
                        toCharArray = str.toCharArray();
                        length = toCharArray.length;
                        cArr = toCharArray;
                        for (i4 = 0; length > i4; i4++) {
                            c = cArr[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 91;
                                    break;
                                case at.g /*1*/:
                                    i5 = 92;
                                    break;
                                case at.i /*2*/:
                                    i5 = 51;
                                    break;
                                case at.o /*3*/:
                                    i5 = 62;
                                    break;
                                default:
                                    i5 = 7;
                                    break;
                            }
                            cArr[i4] = (char) (i5 ^ c);
                        }
                        str = new String(cArr).intern();
                        String[] strArr4;
                        switch (i2) {
                            case v.m /*0*/:
                                strArr2[i3] = str;
                                for (String str22 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) 108, (byte) -88, (byte) -80, (byte) -9}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 13}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 39}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 54}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -13}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -40}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -83, (byte) -63, (byte) -51, (byte) 13}));
                                        arrayList.add(InetAddress.getByAddress(str22, new byte[]{(byte) -82, (byte) 36, (byte) -46, (byte) 41}));
                                        b.put(str22, arrayList);
                                    } catch (UnknownHostException e2) {
                                    }
                                }
                                strArr4 = new String[2];
                                i3 = 0;
                                strArr2 = strArr4;
                                strArr3 = strArr4;
                                str = ">m\u0002\u0010p3=GMf+,\u001dPb/";
                                i2 = 1;
                                break;
                            case at.g /*1*/:
                                strArr2[i3] = str;
                                str = ">m\u0002\u0010p3=GMf+,\u001dPb/r";
                                i3 = 1;
                                strArr2 = strArr3;
                                i2 = 2;
                                break;
                            case at.i /*2*/:
                                strArr2[i3] = str;
                                for (String str222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) 108, (byte) -88, (byte) -80, (byte) -61}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) 108, (byte) -88, (byte) -80, (byte) -60}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 121}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 38}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 53}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -15}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -17}));
                                        arrayList.add(InetAddress.getByAddress(str222, new byte[]{(byte) -82, (byte) 37, (byte) -57, (byte) -58}));
                                        b.put(str222, arrayList);
                                    } catch (UnknownHostException e3) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">m\u0001\u0010p3=GMf+,\u001dPb/";
                                i2 = 3;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case at.o /*3*/:
                                strArr2[i3] = str;
                                str = ">m\u0001\u0010p3=GMf+,\u001dPb/r";
                                i3 = 1;
                                strArr2 = strArr3;
                                i2 = 4;
                                break;
                            case at.p /*4*/:
                                strArr2[i3] = str;
                                for (String str2222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) 108, (byte) -88, (byte) -82, (byte) 15}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) 108, (byte) -88, (byte) -80, (byte) -58}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) 108, (byte) -88, (byte) -79, (byte) 14}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -52}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) -83, (byte) -63, (byte) -51, (byte) 15}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) -82, (byte) 37, (byte) -57, (byte) -57}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) -72, (byte) -83, (byte) -77, (byte) 48}));
                                        arrayList.add(InetAddress.getByAddress(str2222, new byte[]{(byte) -48, (byte) 43, (byte) 122, (byte) -114}));
                                        b.put(str2222, arrayList);
                                    } catch (UnknownHostException e4) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">m\u0000\u0010p3=GMf+,\u001dPb/";
                                i2 = 5;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case at.m /*5*/:
                                strArr2[i3] = str;
                                str = ">m\u0000\u0010p3=GMf+,\u001dPb/r";
                                i2 = 6;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case Y.f /*6*/:
                                strArr2[i3] = str;
                                for (String str22222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 105}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -98, (byte) 85, (byte) 5, (byte) -56}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 107}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 29}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 51}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -5}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -87, (byte) 54, (byte) 51, (byte) 61}));
                                        arrayList.add(InetAddress.getByAddress(str22222, new byte[]{(byte) -82, (byte) 37, (byte) -57, (byte) -47}));
                                        b.put(str22222, arrayList);
                                    } catch (UnknownHostException e5) {
                                    }
                                }
                                strArr4 = new String[2];
                                i3 = 0;
                                strArr2 = strArr4;
                                strArr3 = strArr4;
                                str = ">m\u0007\u0010p3=GMf+,\u001dPb/";
                                i2 = 7;
                                break;
                            case aF.v /*7*/:
                                strArr2[i3] = str;
                                str = ">m\u0007\u0010p3=GMf+,\u001dPb/r";
                                i2 = 8;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case aF.u /*8*/:
                                strArr2[i3] = str;
                                for (String str222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 110}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 111}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 114}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 50}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -16}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -48}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) -82, (byte) 36, (byte) -46, (byte) 48}));
                                        arrayList.add(InetAddress.getByAddress(str222222, new byte[]{(byte) -82, (byte) 37, (byte) -25, (byte) 90}));
                                        b.put(str222222, arrayList);
                                    } catch (UnknownHostException e6) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">m\u0006\u0010p3=GMf+,\u001dPb/";
                                i2 = 9;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case Y.l /*9*/:
                                strArr2[i3] = str;
                                str = ">m\u0006\u0010p3=GMf+,\u001dPb/r";
                                i2 = 10;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case Y.t /*10*/:
                                strArr2[i3] = str;
                                for (String str2222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) 108, (byte) -88, (byte) -82, (byte) 9}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 123}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 124}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 75}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) -87, (byte) 54, (byte) 51, (byte) 42}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -49}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) -83, (byte) -63, (byte) -51, (byte) 12}));
                                        arrayList.add(InetAddress.getByAddress(str2222222, new byte[]{(byte) 50, (byte) 97, (byte) 57, (byte) -98}));
                                        b.put(str2222222, arrayList);
                                    } catch (UnknownHostException e7) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">m\u0005\u0010p3=GMf+,\u001dPb/";
                                i2 = 11;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case Y.j /*11*/:
                                strArr2[i3] = str;
                                str = ">m\u0005\u0010p3=GMf+,\u001dPb/r";
                                i2 = 12;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case Y.p /*12*/:
                                strArr2[i3] = str;
                                for (String str22222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) 108, (byte) -88, (byte) -82, (byte) 5}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) 108, (byte) -88, (byte) -76, (byte) 126}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 116}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 80}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -11}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -50}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) -82, (byte) 36, (byte) -46, (byte) 49}));
                                        arrayList.add(InetAddress.getByAddress(str22222222, new byte[]{(byte) 50, (byte) 22, (byte) -16, (byte) -92}));
                                        b.put(str22222222, arrayList);
                                    } catch (UnknownHostException e8) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">n\u001dIo:(@_w+r][s";
                                i2 = 13;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case Y.q /*13*/:
                                strArr2[i3] = str;
                                str = ">n\u001dIo:(@_w+r][su";
                                i2 = 14;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Toolbar_titleMarginEnd /*14*/:
                                strArr2[i3] = str;
                                for (String str222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -24}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -9}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -36}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -83, (byte) -64, (byte) -25, (byte) 61}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -83, (byte) -63, (byte) -26, (byte) 98}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -82, (byte) 37, (byte) -25, (byte) 92}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -72, (byte) -83, (byte) -120, (byte) 73}));
                                        arrayList.add(InetAddress.getByAddress(str222222222, new byte[]{(byte) -72, (byte) -83, (byte) -120, (byte) 74}));
                                        b.put(str222222222, arrayList);
                                    } catch (UnknownHostException e9) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">o\u001dIo:(@_w+r][s";
                                i2 = 15;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Toolbar_titleMarginTop /*15*/:
                                strArr2[i3] = str;
                                str = ">o\u001dIo:(@_w+r][su";
                                i2 = 16;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                                strArr2[i3] = str;
                                for (String str2222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 23}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 7}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -83, (byte) -63, (byte) -26, (byte) 109}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -83, (byte) -63, (byte) -26, (byte) 114}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -82, (byte) 37, (byte) -25, (byte) 81}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -82, (byte) 37, (byte) -25, (byte) 94}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) -72, (byte) -83, (byte) -120, (byte) 67}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222, new byte[]{(byte) 50, (byte) 22, (byte) -31, (byte) 67}));
                                        b.put(str2222222222, arrayList);
                                    } catch (UnknownHostException e10) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">h\u001dIo:(@_w+r][s";
                                i2 = 17;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Toolbar_maxButtonHeight /*17*/:
                                strArr2[i3] = str;
                                str = ">h\u001dIo:(@_w+r][su";
                                i2 = 18;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Toolbar_collapseIcon /*18*/:
                                strArr2[i3] = str;
                                for (String str22222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) 108, (byte) -88, (byte) -82, (byte) 17}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 22}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -25}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -7}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) -83, (byte) -63, (byte) -26, (byte) 111}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) 50, (byte) 22, (byte) -31, (byte) 76}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) 50, (byte) 22, (byte) -31, (byte) 82}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222, new byte[]{(byte) 50, (byte) 22, (byte) -31, (byte) 83}));
                                        b.put(str22222222222, arrayList);
                                    } catch (UnknownHostException e11) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">i\u001dIo:(@_w+r][s";
                                i2 = 19;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Toolbar_collapseContentDescription /*19*/:
                                strArr2[i3] = str;
                                str = ">i\u001dIo:(@_w+r][su";
                                i2 = 20;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Toolbar_navigationIcon /*20*/:
                                strArr2[i3] = str;
                                for (String str222222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 21}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 44}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 81}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -16}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -82, (byte) 36, (byte) -46, (byte) 37}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -82, (byte) 36, (byte) -46, (byte) 55}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) -48, (byte) 43, (byte) 122, (byte) -109}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222, new byte[]{(byte) 50, (byte) 22, (byte) -31, (byte) 81}));
                                        b.put(str222222222222, arrayList);
                                    } catch (UnknownHostException e12) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">j\u001dIo:(@_w+r][s";
                                i2 = 21;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Toolbar_navigationContentDescription /*21*/:
                                strArr2[i3] = str;
                                str = ">j\u001dIo:(@_w+r][su";
                                i2 = 22;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Toolbar_logoDescription /*22*/:
                                strArr2[i3] = str;
                                for (String str2222222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 58}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -3}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -14}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -83, (byte) -63, (byte) -26, (byte) 118}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -109, (byte) 35}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -109, (byte) 53}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -109, (byte) 55}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222, new byte[]{(byte) -48, (byte) 43, (byte) 122, (byte) -107}));
                                        b.put(str2222222222222, arrayList);
                                    } catch (UnknownHostException e13) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">k\u001dIo:(@_w+r][s";
                                i2 = 23;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Toolbar_titleTextColor /*23*/:
                                strArr2[i3] = str;
                                str = ">k\u001dIo:(@_w+r][su";
                                i2 = 24;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Toolbar_subtitleTextColor /*24*/:
                                strArr2[i3] = str;
                                for (String str22222222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 42}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 57}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -87, (byte) 54, (byte) 55, (byte) -56}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -83, (byte) -63, (byte) -51, (byte) 27}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -109, (byte) 57}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -109, (byte) 60}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -95, (byte) -94}));
                                        arrayList.add(InetAddress.getByAddress(str22222222222222, new byte[]{(byte) -48, (byte) 43, (byte) 122, (byte) -112}));
                                        b.put(str22222222222222, arrayList);
                                    } catch (UnknownHostException e14) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">d\u001dIo:(@_w+r][s";
                                i2 = 25;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Theme_actionMenuTextAppearance /*25*/:
                                strArr2[i3] = str;
                                str = ">d\u001dIo:(@_w+r][su";
                                i2 = 26;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Theme_actionMenuTextColor /*26*/:
                                strArr2[i3] = str;
                                for (String str222222222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 109}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 18}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -87, (byte) 45, (byte) -42, (byte) -19}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -18}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -83, (byte) -63, (byte) -51, (byte) 20}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -95, (byte) -88}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -95, (byte) -87}));
                                        arrayList.add(InetAddress.getByAddress(str222222222222222, new byte[]{(byte) -72, (byte) -83, (byte) -95, (byte) -83}));
                                        b.put(str222222222222222, arrayList);
                                    } catch (UnknownHostException e15) {
                                    }
                                }
                                strArr = new String[2];
                                str = ">e\u001dIo:(@_w+r][s";
                                i2 = 27;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Theme_actionModeStyle /*27*/:
                                strArr2[i3] = str;
                                str = ">e\u001dIo:(@_w+r][su";
                                i2 = 28;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Theme_actionModeCloseButtonStyle /*28*/:
                                strArr2[i3] = str;
                                for (String str2222222222222222 : strArr3) {
                                    try {
                                        arrayList = new ArrayList();
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) 108, (byte) -88, (byte) -80, (byte) -28}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) 108, (byte) -88, (byte) -80, (byte) -24}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 5, (byte) -58}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 12}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 55}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) -98, (byte) 85, (byte) 58, (byte) 68}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) -87, (byte) 45, (byte) -37, (byte) -5}));
                                        arrayList.add(InetAddress.getByAddress(str2222222222222222, new byte[]{(byte) -82, (byte) 37, (byte) -39, (byte) 93}));
                                        b.put(str2222222222222222, arrayList);
                                    } catch (UnknownHostException e16) {
                                    }
                                }
                                strArr = new String[2];
                                str = "-rDVf//RNwu2VJ";
                                i2 = 29;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i3 = 0;
                                break;
                            case arj.Theme_actionModeBackground /*29*/:
                                strArr2[i3] = str;
                                str = "-rDVf//RNwu2VJ)";
                                i2 = 30;
                                i3 = 1;
                                strArr2 = strArr3;
                                break;
                            case arj.Theme_actionModeSplitBackground /*30*/:
                                strArr2[i3] = str;
                                i2 = strArr3.length;
                                while (i < i2) {
                                    str = strArr3[i];
                                    try {
                                        List arrayList2 = new ArrayList();
                                        arrayList2.add(InetAddress.getByAddress(str, new byte[]{(byte) -82, (byte) 37, (byte) -13, (byte) 85}));
                                        arrayList2.add(InetAddress.getByAddress(str, new byte[]{(byte) -72, (byte) -83, (byte) -120, (byte) 86}));
                                        b.put(str, arrayList2);
                                    } catch (UnknownHostException e17) {
                                    }
                                    i++;
                                }
                                return;
                            default:
                                strArr2[i3] = str;
                                str = ">m\u0003\u0010p3=GMf+,\u001dPb/r";
                                i3 = 1;
                                strArr2 = strArr3;
                                i2 = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i3] = str;
                    str = ">m\u001dIo:(@_w+r][su";
                    i3 = 1;
                    strArr2 = strArr3;
                    i2 = 0;
            }
        }
    }
}
