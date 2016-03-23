package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class FileProvider extends ContentProvider {
    private static final String[] COLUMNS;
    private static final File DEVICE_ROOT;
    private static HashMap sCache;
    private static final String[] z;
    private PathStrategy mStrategy;

    interface PathStrategy {
        File getFileForUri(Uri uri);

        Uri getUriForFile(File file);
    }

    class SimplePathStrategy implements PathStrategy {
        private static final String[] z;
        private final String mAuthority;
        private final HashMap mRoots;

        static {
            String[] strArr = new String[8];
            String str = "'mo\nm\u0004yq\u001bm\u0007cvO/\f,g\u0002=\u001du";
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
                            i3 = 12;
                            break;
                        case at.i /*2*/:
                            i3 = 2;
                            break;
                        case at.o /*3*/:
                            i3 = 111;
                            break;
                        default:
                            i3 = 77;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = ";iq\u0000!\u001fifO=\bxjO'\u001car\n)Ing\u0016\"\u0007h\"\f\"\u0007jk\b8\u001bifO?\u0006cv";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "/mk\u0003(\r,v\u0000m\u001biq\u0000!\u001fi\"\f,\u0007cl\u0006.\b`\"\u001f,\u001dd\"\t\"\u001b,";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "<bc\r!\f,v\u0000m\u000fel\u000bm\ncl\t$\u000eyp\n)I~m\u00009Ijm\u001dm";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\ncl\u001b(\u0007x";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "/mk\u0003(\r,v\u0000m\u000fel\u000bm\ncl\t$\u000eyp\n)I~m\u00009Ixj\u000e9Iom\u00019\bel\u001cm";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "/mk\u0003(\r,v\u0000m\u001biq\u0000!\u001fi\"\f,\u0007cl\u0006.\b`\"\u001f,\u001dd\"\t\"\u001b,";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "/mk\u0003(\r,v\u0000m\u001biq\u0000!\u001fi\"\f,\u0007cl\u0006.\b`\"\u001f,\u001dd\"\t\"\u001b,";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void addRoot(String str, File file) {
            try {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(z[0]);
                }
                try {
                    this.mRoots.put(str, file.getCanonicalFile());
                } catch (Throwable e) {
                    throw new IllegalArgumentException(z[1] + file, e);
                }
            } catch (IOException e2) {
                throw e2;
            }
        }

        public File getFileForUri(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.mRoots.get(decode);
            if (file == null) {
                try {
                    throw new IllegalArgumentException(z[4] + uri);
                } catch (IOException e) {
                    throw e;
                }
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                try {
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException(z[2]);
                } catch (IOException e2) {
                    throw e2;
                }
            } catch (IOException e3) {
                throw new IllegalArgumentException(z[3] + file2);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.net.Uri getUriForFile(java.io.File r8) {
            /*
            r7 = this;
            r4 = android.support.v4.content.ContextCompat.a;
            r3 = r8.getCanonicalPath();	 Catch:{ IOException -> 0x006d }
            r0 = 0;
            r1 = r7.mRoots;
            r1 = r1.entrySet();
            r5 = r1.iterator();
            r2 = r0;
        L_0x0012:
            r0 = r5.hasNext();
            if (r0 == 0) goto L_0x004d;
        L_0x0018:
            r0 = r5.next();
            r0 = (java.util.Map.Entry) r0;
            r1 = r0.getValue();
            r1 = (java.io.File) r1;
            r1 = r1.getPath();
            r6 = r3.startsWith(r1);	 Catch:{ IOException -> 0x008a }
            if (r6 == 0) goto L_0x00ff;
        L_0x002e:
            if (r2 == 0) goto L_0x0044;
        L_0x0030:
            r6 = r1.length();	 Catch:{ IOException -> 0x008c }
            r1 = r2.getValue();	 Catch:{ IOException -> 0x008c }
            r1 = (java.io.File) r1;	 Catch:{ IOException -> 0x008c }
            r1 = r1.getPath();	 Catch:{ IOException -> 0x008c }
            r1 = r1.length();	 Catch:{ IOException -> 0x008c }
            if (r6 <= r1) goto L_0x00ff;
        L_0x0044:
            if (r4 == 0) goto L_0x0102;
        L_0x0046:
            r1 = android.support.v4.app.FragmentActivity.a;
            r1 = r1 + 1;
            android.support.v4.app.FragmentActivity.a = r1;
            r2 = r0;
        L_0x004d:
            if (r2 != 0) goto L_0x008e;
        L_0x004f:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x006b }
            r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x006b }
            r1.<init>();	 Catch:{ IOException -> 0x006b }
            r2 = z;	 Catch:{ IOException -> 0x006b }
            r4 = 6;
            r2 = r2[r4];	 Catch:{ IOException -> 0x006b }
            r1 = r1.append(r2);	 Catch:{ IOException -> 0x006b }
            r1 = r1.append(r3);	 Catch:{ IOException -> 0x006b }
            r1 = r1.toString();	 Catch:{ IOException -> 0x006b }
            r0.<init>(r1);	 Catch:{ IOException -> 0x006b }
            throw r0;	 Catch:{ IOException -> 0x006b }
        L_0x006b:
            r0 = move-exception;
            throw r0;
        L_0x006d:
            r0 = move-exception;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = z;
            r3 = 7;
            r2 = r2[r3];
            r1 = r1.append(r2);
            r1 = r1.append(r8);
            r1 = r1.toString();
            r0.<init>(r1);
            throw r0;
        L_0x008a:
            r0 = move-exception;
            throw r0;	 Catch:{ IOException -> 0x008c }
        L_0x008c:
            r0 = move-exception;
            throw r0;
        L_0x008e:
            r0 = r2.getValue();
            r0 = (java.io.File) r0;
            r1 = r0.getPath();
            r0 = "/";
            r0 = r1.endsWith(r0);
            if (r0 == 0) goto L_0x00fd;
        L_0x00a1:
            r0 = r1.length();
            r0 = r3.substring(r0);
            if (r4 == 0) goto L_0x00fb;
        L_0x00ab:
            r1 = r1.length();
            r1 = r1 + 1;
            r0 = r0.substring(r1);
            r1 = r0;
        L_0x00b6:
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r0 = r2.getKey();
            r0 = (java.lang.String) r0;
            r0 = android.net.Uri.encode(r0);
            r0 = r3.append(r0);
            r2 = 47;
            r0 = r0.append(r2);
            r2 = "/";
            r1 = android.net.Uri.encode(r1, r2);
            r0 = r0.append(r1);
            r0 = r0.toString();
            r1 = new android.net.Uri$Builder;
            r1.<init>();
            r2 = z;
            r3 = 5;
            r2 = r2[r3];
            r1 = r1.scheme(r2);
            r2 = r7.mAuthority;
            r1 = r1.authority(r2);
            r0 = r1.encodedPath(r0);
            r0 = r0.build();
            return r0;
        L_0x00fb:
            r1 = r0;
            goto L_0x00b6;
        L_0x00fd:
            r0 = r3;
            goto L_0x00ab;
        L_0x00ff:
            r0 = r2;
            goto L_0x0044;
        L_0x0102:
            r2 = r0;
            goto L_0x0012;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.SimplePathStrategy.getUriForFile(java.io.File):android.net.Uri");
        }

        public SimplePathStrategy(String str) {
            this.mRoots = new HashMap();
            this.mAuthority = str;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(z[18]);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        try {
            return this.mStrategy.getFileForUri(uri).delete() ? 1 : 0;
        } catch (SecurityException e) {
            throw e;
        }
    }

    public boolean onCreate() {
        return true;
    }

    static {
        String[] strArr = new String[24];
        String str = "z)svBXhnu\u0007L)hiB\u001c)t~US!~4TI8juUHf\\Sky\u0017JHhj\u0001^_uc\u0018[Noohw\u007fS]e~{S]";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 60;
                        break;
                    case at.g /*1*/:
                        i4 = 72;
                        break;
                    case at.i /*2*/:
                        i4 = 26;
                        break;
                    case at.o /*3*/:
                        i4 = 26;
                        break;
                    default:
                        i4 = 39;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "r':\u007f_H-htFPhstTY:ni";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "l:ulNX-h:JI;n:@N)tn\u0007I:s:WY:wsTO!utT";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "l:ulNX-h:JI;n:IS<:xB\u001c-bjHN<\u007f~";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "]&~hHU,4iRL8uhS\u0012\u000eSVbc\u0018HUqu\f_Hxl\tNRt";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "L)nr";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "q!iiNR/:{IX:usC\u0012;ojWS:n4au\u0004_Ewn\u0007LScy\u001aEJfh\u0000I:JY<{7C]<{";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "R)w\u007f";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "N'un\nL)nr";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "_)yrB\u00118{nO";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "Z!v\u007fT\u00118{nO";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "Y0n\u007fUR)v7W]<r";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "]8jvN_)nsHRguySY<7iSN-{w";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "c;s`B";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "c,siWP)cEI]%\u007f";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "c;s`B";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "c,siWP)cEI]%\u007f";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "r':\u007f_H-htFPhojC]<\u007fi";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "K)";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "N?n";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "u&l{KU,:wHX- :";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "K<";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "N?";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[2];
                    str = "c,siWP)cEI]%\u007f";
                    i = 23;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    str = "c;s`B";
                    i = 24;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    COLUMNS = strArr3;
                    DEVICE_ROOT = new File("/");
                    sCache = new HashMap();
                    return;
                default:
                    strArr2[i2] = str;
                    str = "z)svBXhnu\u0007L)hiB\u001c)t~US!~4TI8juUHf\\Sky\u0017JHhj\u0001^_uc\u0018[Noohw\u007fS]e~{S]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object obj = new Object[i];
        System.arraycopy(objArr, 0, obj, 0, i);
        return obj;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).getUriForFile(file);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        try {
            super.attachInfo(context, providerInfo);
            if (providerInfo.exported) {
                throw new SecurityException(z[4]);
            }
            try {
                if (providerInfo.grantUriPermissions) {
                    this.mStrategy = getPathStrategy(context, providerInfo.authority);
                    return;
                }
                throw new SecurityException(z[3]);
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    private static String[] copyOf(String[] strArr, int i) {
        Object obj = new String[i];
        System.arraycopy(strArr, 0, obj, 0, i);
        return obj;
    }

    private static PathStrategy parsePathStrategy(Context context, String str) {
        boolean z = ContextCompat.a;
        PathStrategy simplePathStrategy = new SimplePathStrategy(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), z[5]);
        if (loadXmlMetaData == null) {
            try {
                throw new IllegalArgumentException(z[7]);
            } catch (SecurityException e) {
                throw e;
            }
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                break;
            } else if (next == 2) {
                File buildPath;
                String name = loadXmlMetaData.getName();
                String attributeValue = loadXmlMetaData.getAttributeValue(null, z[8]);
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, z[6]);
                if (z[9].equals(name)) {
                    buildPath = buildPath(DEVICE_ROOT, new String[]{attributeValue2});
                } else if (z[11].equals(name)) {
                    buildPath = buildPath(context.getFilesDir(), new String[]{attributeValue2});
                } else if (z[10].equals(name)) {
                    buildPath = buildPath(context.getCacheDir(), new String[]{attributeValue2});
                } else if (z[12].equals(name)) {
                    buildPath = buildPath(Environment.getExternalStorageDirectory(), new String[]{attributeValue2});
                } else {
                    buildPath = null;
                }
                if (buildPath != null) {
                    try {
                        simplePathStrategy.addRoot(attributeValue, buildPath);
                    } catch (SecurityException e2) {
                        throw e2;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return simplePathStrategy;
    }

    private static PathStrategy getPathStrategy(Context context, String str) {
        PathStrategy pathStrategy;
        synchronized (sCache) {
            pathStrategy = (PathStrategy) sCache.get(str);
            if (pathStrategy == null) {
                try {
                    pathStrategy = parsePathStrategy(context, str);
                    sCache.put(str, pathStrategy);
                } catch (Throwable e) {
                    throw new IllegalArgumentException(z[1], e);
                } catch (Throwable e2) {
                    throw new IllegalArgumentException(z[0], e2);
                }
            }
        }
        return pathStrategy;
    }

    public String getType(Uri uri) {
        File fileForUri = this.mStrategy.getFileForUri(uri);
        int lastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return z[13];
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.mStrategy.getFileForUri(uri), modeToMode(str));
    }

    private static File buildPath(File file, String[] strArr) {
        boolean z = ContextCompat.a;
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            if (str != null) {
                file2 = new File(file2, str);
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return file2;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(z[2]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int modeToMode(java.lang.String r4) {
        /*
        r1 = android.support.v4.content.ContextCompat.a;
        r0 = "r";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        if (r1 == 0) goto L_0x007f;
    L_0x000f:
        r0 = "w";
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0077 }
        if (r0 != 0) goto L_0x0024;
    L_0x0018:
        r0 = z;	 Catch:{ SecurityException -> 0x0077 }
        r2 = 22;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x0077 }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0077 }
        if (r0 == 0) goto L_0x0028;
    L_0x0024:
        r0 = 738197504; // 0x2c000000 float:1.8189894E-12 double:3.647180266E-315;
        if (r1 == 0) goto L_0x007f;
    L_0x0028:
        r0 = z;	 Catch:{ SecurityException -> 0x0079 }
        r2 = 19;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x0079 }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0079 }
        if (r0 == 0) goto L_0x0038;
    L_0x0034:
        r0 = 704643072; // 0x2a000000 float:1.1368684E-13 double:3.481399345E-315;
        if (r1 == 0) goto L_0x007f;
    L_0x0038:
        r0 = z;	 Catch:{ SecurityException -> 0x007b }
        r2 = 23;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x007b }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x007b }
        if (r0 == 0) goto L_0x0048;
    L_0x0044:
        r0 = 939524096; // 0x38000000 float:3.0517578E-5 double:4.641865793E-315;
        if (r1 == 0) goto L_0x007f;
    L_0x0048:
        r0 = z;	 Catch:{ SecurityException -> 0x007d }
        r2 = 20;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x007d }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x007d }
        if (r0 == 0) goto L_0x0058;
    L_0x0054:
        r0 = 1006632960; // 0x3c000000 float:0.0078125 double:4.973427635E-315;
        if (r1 == 0) goto L_0x007f;
    L_0x0058:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ SecurityException -> 0x0075 }
        r1 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0075 }
        r1.<init>();	 Catch:{ SecurityException -> 0x0075 }
        r2 = z;	 Catch:{ SecurityException -> 0x0075 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x0075 }
        r1 = r1.append(r2);	 Catch:{ SecurityException -> 0x0075 }
        r1 = r1.append(r4);	 Catch:{ SecurityException -> 0x0075 }
        r1 = r1.toString();	 Catch:{ SecurityException -> 0x0075 }
        r0.<init>(r1);	 Catch:{ SecurityException -> 0x0075 }
        throw r0;	 Catch:{ SecurityException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.modeToMode(java.lang.String):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15) {
        /*
        r10 = this;
        r3 = android.support.v4.content.ContextCompat.a;
        r0 = r10.mStrategy;
        r4 = r0.getFileForUri(r11);
        if (r12 != 0) goto L_0x000c;
    L_0x000a:
        r12 = COLUMNS;
    L_0x000c:
        r0 = r12.length;
        r5 = new java.lang.String[r0];
        r0 = r12.length;
        r6 = new java.lang.Object[r0];
        r1 = 0;
        r7 = r12.length;
        r0 = 0;
        r2 = r0;
        r0 = r1;
    L_0x0017:
        if (r2 >= r7) goto L_0x005d;
    L_0x0019:
        r8 = r12[r2];
        r1 = z;	 Catch:{ SecurityException -> 0x0078 }
        r9 = 17;
        r1 = r1[r9];	 Catch:{ SecurityException -> 0x0078 }
        r1 = r1.equals(r8);	 Catch:{ SecurityException -> 0x0078 }
        if (r1 == 0) goto L_0x0088;
    L_0x0027:
        r1 = z;	 Catch:{ SecurityException -> 0x007a }
        r9 = 15;
        r1 = r1[r9];	 Catch:{ SecurityException -> 0x007a }
        r5[r0] = r1;	 Catch:{ SecurityException -> 0x007a }
        r1 = r0 + 1;
        r9 = r4.getName();	 Catch:{ SecurityException -> 0x007a }
        r6[r0] = r9;	 Catch:{ SecurityException -> 0x007a }
        if (r3 == 0) goto L_0x0086;
    L_0x0039:
        r0 = z;	 Catch:{ SecurityException -> 0x007c }
        r9 = 16;
        r0 = r0[r9];	 Catch:{ SecurityException -> 0x007c }
        r0 = r0.equals(r8);	 Catch:{ SecurityException -> 0x007c }
        if (r0 == 0) goto L_0x0086;
    L_0x0045:
        r0 = z;	 Catch:{ SecurityException -> 0x007c }
        r8 = 14;
        r0 = r0[r8];	 Catch:{ SecurityException -> 0x007c }
        r5[r1] = r0;	 Catch:{ SecurityException -> 0x007c }
        r0 = r1 + 1;
        r8 = r4.length();	 Catch:{ SecurityException -> 0x007c }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ SecurityException -> 0x007c }
        r6[r1] = r8;	 Catch:{ SecurityException -> 0x007c }
    L_0x0059:
        r1 = r2 + 1;
        if (r3 == 0) goto L_0x0084;
    L_0x005d:
        r1 = copyOf(r5, r0);
        r0 = copyOf(r6, r0);
        r2 = new android.database.MatrixCursor;
        r4 = 1;
        r2.<init>(r1, r4);
        r2.addRow(r0);	 Catch:{ SecurityException -> 0x007e }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ SecurityException -> 0x007e }
        if (r0 == 0) goto L_0x0077;
    L_0x0072:
        if (r3 == 0) goto L_0x0082;
    L_0x0074:
        r0 = 0;
    L_0x0075:
        android.support.v4.content.ContextCompat.a = r0;
    L_0x0077:
        return r2;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = 1;
        goto L_0x0075;
    L_0x0084:
        r2 = r1;
        goto L_0x0017;
    L_0x0086:
        r0 = r1;
        goto L_0x0059;
    L_0x0088:
        r1 = r0;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
