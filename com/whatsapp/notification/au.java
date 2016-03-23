package com.whatsapp.notification;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class au extends an {
    private static Pattern f;
    private static final String[] z;
    private float e;

    static {
        String[] strArr = new String[22];
        String str = "9_}J#.S>\b*/^s\f.(\u001eq\u0007?3_~J\u001e\ntQ0\u000e\u0005cX+\u0019\u000esE0";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 48;
                        break;
                    case at.i /*2*/:
                        i3 = 16;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 75;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "9_e\n?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "9_}J#.S>\b*/^s\f.(\u001eq\u0007?3_~J\u001e\ntQ0\u000e\u0005cX+\u0019\u000esE0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "*Qs\u000f*=U~\u0005&?";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "*Qs\u000f*=U~\u0005&?";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "9_}J#.S>\b*/^s\f.(\u001eu\u001c?(Q>'\u0004\u000f~D";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "9_}J#.S>\b*/^s\f.(\u001eu\u001c?(Q>'\u0004\u0017`_*\u000e\u0014d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ")U|\u0001(.qb\u00038";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "9_}J#.S>\b*/^s\f.(\u001eq\u0007?3_~J\u0018\u001fdO*\u0004\u000eyV-\b\u001bdY+\u0005";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "9_e\n?";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "9_}J#.S>\b*/^s\f.(";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "9_e\b/z^\u007f\u0010k<Y~\u0000k,Ub\u0017\"5^";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "9_}8e2Ds8e)_v\u0010<;Bu8e\tU~\u0017.rltOce\nLJ\u0017>\u001b9[bt\u001a";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "9_}J#.S>\u0017$<Dg\u00059?\u001eC\u0001%)U";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0005Yt";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    str = "3^d\u0001%.";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "3^d\u0001%.\u0010\\-\u0000\u001f\u0010/";
                    obj = 16;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "9_~\u0010.4D*Kd9_}J#.S>\b*/^s\f.(\u001ec\u0001?.Y~\u00038uVq\u0012$(Yd\u00018";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0005Yt";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "3^d\u0001%.";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "8Qt\u0003.(\u001fx\u0010(uCu\n8?\u0010";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "<Qf\u000b93Du;\".U};\">";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private final float b() {
        boolean z = an.a;
        try {
            if (this.e >= 0.0f) {
                return this.e;
            }
            this.e = 0.0f;
            FeatureInfo[] systemAvailableFeatures = d().getPackageManager().getSystemAvailableFeatures();
            int length = systemAvailableFeatures.length;
            int i = 0;
            while (i < length) {
                try {
                    Float a = a(systemAvailableFeatures[i].name);
                    if (a != null) {
                        try {
                            this.e = a.floatValue();
                            if (!z) {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                } catch (NumberFormatException e2) {
                }
                i++;
                if (z) {
                    break;
                }
            }
            Log.i(z[21] + this.e);
            return this.e;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    private static final Float a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (!str.startsWith(z[14])) {
                return null;
            }
            if (f == null) {
                f = Pattern.compile(z[13]);
            }
            Matcher matcher = f.matcher(str);
            if (matcher.matches()) {
                return Float.valueOf(Float.parseFloat(matcher.group(1)));
            }
            try {
                throw new NumberFormatException(z[12]);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    au() {
        this.e = -1.0f;
    }

    private final Set a() {
        Throwable th;
        boolean z = an.a;
        ContentResolver contentResolver = d().getContentResolver();
        Set hashSet = new HashSet();
        Cursor query;
        try {
            query = contentResolver.query(Uri.parse(z[18]), new String[]{z[19], z[16]}, z[17], new String[]{"%" + c() + "%"}, null);
            int columnIndex = query.getColumnIndex(z[15]);
            int columnIndex2 = query.getColumnIndex(z[20]);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                try {
                    ComponentName component = Intent.parseUri(query.getString(columnIndex2), 0).getComponent();
                    if (component != null) {
                        try {
                            if (c().equals(component.getPackageName())) {
                                if (b().equals(component.getClassName())) {
                                    try {
                                        hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                                    } catch (URISyntaxException e) {
                                        throw e;
                                    }
                                }
                            }
                        } catch (URISyntaxException e2) {
                            throw e2;
                        } catch (URISyntaxException e22) {
                            throw e22;
                        }
                    }
                } catch (URISyntaxException e3) {
                }
                try {
                    query.moveToNext();
                    if (z) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
            return hashSet;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public List m1030a() {
        if (b() < 4.0f) {
            return new ArrayList();
        }
        try {
            return Arrays.asList(new String[]{z[11]});
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void a(int i) {
        Intent intent;
        boolean z = an.a;
        float b = b();
        if (b >= 5.0f) {
            intent = new Intent(z[9]);
            try {
                if (VERSION.SDK_INT >= 12) {
                    intent.setFlags(16);
                }
                try {
                    intent.putExtra(z[7], new ComponentName(c(), b()).flattenToShortString());
                    intent.putExtra(z[6], i);
                    d().sendBroadcast(intent);
                    if (!z) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        if (b >= 4.0f) {
            intent = new Intent(z[3]);
            try {
                if (VERSION.SDK_INT >= 12) {
                    intent.setFlags(16);
                }
                intent.putExtra(z[4], c());
                intent.putExtra(z[10], i);
                d().sendBroadcast(intent);
                for (Integer num : a()) {
                    Intent intent2 = new Intent(z[0]);
                    try {
                        if (VERSION.SDK_INT >= 12) {
                            intent.setFlags(16);
                        }
                        intent2.putExtra(z[5], c());
                        intent2.putExtra(z[1], num.longValue());
                        ComponentName componentName = new ComponentName(c(), b());
                        intent2.putExtra(z[8], new String[]{"%" + componentName.flattenToShortString() + "%"});
                        intent2.putExtra(z[2], i);
                        d().sendBroadcast(intent2);
                        if (z) {
                            return;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }
}
