package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.ContextThemeWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class AppCompatViewInflater {
    private static final Map sConstructorMap;
    private static final Class[] sConstructorSignature;
    private static final int[] sOnClickAttrs;
    private static final String[] z;
    private final Object[] mConstructorArgs;

    class DeclaredOnClickListener implements OnClickListener {
        private static final String[] z;
        private final View mHostView;
        private final String mMethodName;
        private Context mResolvedContext;
        private Method mResolvedMethod;

        static {
            String[] strArr = new String[6];
            String str = "lkb\u0002/\u000fjx\u001akJ|r\r>[a7\u0000$A)g\u001b)CmtN&Jp\u007f\u0001/\u000fbx\u001ckNjs\u001c$F`-\u0001%lh~\r ";
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
                            i3 = 47;
                            break;
                        case at.g /*1*/:
                            i3 = 4;
                            break;
                        case at.i /*2*/:
                            i3 = 23;
                            break;
                        case at.o /*3*/:
                            i3 = 110;
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
                        str = "\u000fs~\u001a#\u000fmsNl";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "Npc\u001c\"Mqc\u000bkKaq\u0007%J`7\u0001%\u000fr~\u000b<\u000f";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "lkb\u0002/\u000fjx\u001akImy\nkBac\u0006$K$";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0007R~\u000b<\u0006$~\u0000kN$g\u000f9JjcN$]$v\u0000(Jwc\u00019\u000fGx\u0000?J|cN-@v7\u000f%Kvx\u0007/\u0015ky-'Fg|N";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "lkb\u0002/\u000fjx\u001akJ|r\r>[a7\u0003.[lx\nkIkeN*A`e\u0001\"K>x\u0000\bCmt\u0005";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void onClick(@NonNull View view) {
            try {
                if (this.mResolvedMethod == null) {
                    resolveMethod(this.mHostView.getContext(), this.mMethodName);
                }
                try {
                    this.mResolvedMethod.invoke(this.mResolvedContext, new Object[]{view});
                } catch (Throwable e) {
                    throw new IllegalStateException(z[0], e);
                } catch (Throwable e2) {
                    throw new IllegalStateException(z[1], e2);
                }
            } catch (IllegalAccessException e3) {
                throw e3;
            }
        }

        @NonNull
        private void resolveMethod(@Nullable Context context, @NonNull String str) {
            String str2;
            boolean z = ActionBar.a;
            Context context2 = context;
            while (context2 != null) {
                try {
                    if (!context2.isRestricted()) {
                        Method method = context2.getClass().getMethod(this.mMethodName, new Class[]{View.class});
                        if (method != null) {
                            this.mResolvedMethod = method;
                            this.mResolvedContext = context2;
                            return;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                    if (!z) {
                    }
                }
                context2 = null;
            }
            int id = this.mHostView.getId();
            if (id == -1) {
                try {
                    str2 = "";
                } catch (NoSuchMethodException e2) {
                    throw e2;
                }
            }
            str2 = z[2] + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'";
            throw new IllegalStateException(z[4] + this.mMethodName + z[5] + z[3] + this.mHostView.getClass() + str2);
        }

        public DeclaredOnClickListener(@NonNull View view, @NonNull String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(z[17])) {
            str = attributeSet.getAttributeValue(null, z[16]);
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            View createView;
            if (-1 == str.indexOf(46)) {
                createView = createView(context, str, z[15]);
                return createView;
            }
            createView = createView(context, str, null);
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
            return createView;
        } catch (Exception e) {
            return null;
        } finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.View, 0, 0);
        if (z) {
            resourceId = obtainStyledAttributes.getResourceId(R.styleable.View_android_theme, 0);
        } else {
            resourceId = 0;
        }
        if (z2 && r0 == 0) {
            resourceId = obtainStyledAttributes.getResourceId(R.styleable.View_theme, 0);
            if (resourceId != 0) {
                Log.i(z[0], z[1]);
            }
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        if (i != 0) {
            return ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == i) ? context : new ContextThemeWrapper(context, i);
        } else {
            return context;
        }
    }

    static {
        String[] strArr = new String[18];
        String str = "Z<\"\"qv<3\u0015Hr)%(p} 3\u0015{i";
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
                        i4 = 27;
                        break;
                    case at.g /*1*/:
                        i4 = 76;
                        break;
                    case at.i /*2*/:
                        i4 = 82;
                        break;
                    case at.o /*3*/:
                        i4 = 97;
                        break;
                    default:
                        i4 = 30;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "V9>\u0015wZ9&\u000e]t!\"\r{o)\u0006\u0004fo\u001a;\u0004i";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "R!3\u0006{Y9&\u0015qu";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "O)*\u0015Hr)%";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "R!3\u0006{M%7\u0016";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "X$7\u0002u~(\u0006\u0004fo\u001a;\u0004i";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "H<;\u000fp~>";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "H)7\n\\z>";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "^(;\u0015J~4&";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Y9&\u0015qu";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "X$7\u0002uY#*";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "I-&\bp|\u000e3\u0013";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "Z9&\u000e]t!\"\r{o)\u0006\u0004fo\u001a;\u0004i";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "I-6\bqY9&\u0015qu";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "z\"6\u0013qr(|\u0016w\u007f+7\u00150";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "x 3\u0012m";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "m%7\u0016";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    sConstructorSignature = new Class[]{Context.class, AttributeSet.class};
                    sOnClickAttrs = new int[]{16843375};
                    sConstructorMap = new ArrayMap();
                    return;
                default:
                    strArr2[i2] = str;
                    str = "z<\"[js)?\u0004>r?r\u000fqll6\u0004ni)1\u0000j~(|ANw)3\u0012{;!=\u0017{;8=Akh%<\u0006>z\"6\u0013qr(h\u0015v~!7Awu?&\u0004\u007f\u007fb";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    AppCompatViewInflater() {
        this.mConstructorArgs = new Object[2];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(android.view.View r7, java.lang.String r8, @android.support.annotation.NonNull android.content.Context r9, @android.support.annotation.NonNull android.util.AttributeSet r10, boolean r11, boolean r12, boolean r13) {
        /*
        r6 = this;
        r3 = android.support.v7.app.ActionBar.a;
        if (r11 == 0) goto L_0x014d;
    L_0x0004:
        if (r7 == 0) goto L_0x014d;
    L_0x0006:
        r0 = r7.getContext();
    L_0x000a:
        if (r12 != 0) goto L_0x000e;
    L_0x000c:
        if (r13 == 0) goto L_0x0012;
    L_0x000e:
        r0 = themifyContext(r0, r10, r12, r13);
    L_0x0012:
        r2 = 0;
        r1 = -1;
        r4 = r8.hashCode();
        switch(r4) {
            case -1946472170: goto L_0x00cf;
            case -1455429095: goto L_0x00a1;
            case -1346021293: goto L_0x00c0;
            case -938935918: goto L_0x002d;
            case -937446323: goto L_0x0075;
            case -658531749: goto L_0x00df;
            case -339785223: goto L_0x0067;
            case 776382189: goto L_0x0092;
            case 1125864064: goto L_0x003b;
            case 1413872058: goto L_0x00b0;
            case 1601505219: goto L_0x0083;
            case 1666676343: goto L_0x0058;
            case 2001146706: goto L_0x0049;
            default: goto L_0x001b;
        };
    L_0x001b:
        switch(r1) {
            case 0: goto L_0x00ef;
            case 1: goto L_0x00f6;
            case 2: goto L_0x00fd;
            case 3: goto L_0x0104;
            case 4: goto L_0x010b;
            case 5: goto L_0x0112;
            case 6: goto L_0x0119;
            case 7: goto L_0x0120;
            case 8: goto L_0x0127;
            case 9: goto L_0x012e;
            case 10: goto L_0x0135;
            case 11: goto L_0x013c;
            case 12: goto L_0x0143;
            default: goto L_0x001e;
        };
    L_0x001e:
        r1 = r2;
    L_0x001f:
        if (r1 != 0) goto L_0x014a;
    L_0x0021:
        if (r9 == r0) goto L_0x014a;
    L_0x0023:
        r0 = r6.createViewFromTag(r0, r8, r10);
    L_0x0027:
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r6.checkOnClickListener(r0, r10);
    L_0x002c:
        return r0;
    L_0x002d:
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0038:
        r1 = 0;
        if (r3 == 0) goto L_0x001b;
    L_0x003b:
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0046:
        r1 = 1;
        if (r3 == 0) goto L_0x001b;
    L_0x0049:
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0055:
        r1 = 2;
        if (r3 == 0) goto L_0x001b;
    L_0x0058:
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0064:
        r1 = 3;
        if (r3 == 0) goto L_0x001b;
    L_0x0067:
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0072:
        r1 = 4;
        if (r3 == 0) goto L_0x001b;
    L_0x0075:
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0080:
        r1 = 5;
        if (r3 == 0) goto L_0x001b;
    L_0x0083:
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x008f:
        r1 = 6;
        if (r3 == 0) goto L_0x001b;
    L_0x0092:
        r4 = z;
        r5 = 14;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x009e:
        r1 = 7;
        if (r3 == 0) goto L_0x001b;
    L_0x00a1:
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x00ac:
        r1 = 8;
        if (r3 == 0) goto L_0x001b;
    L_0x00b0:
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x00bc:
        r1 = 9;
        if (r3 == 0) goto L_0x001b;
    L_0x00c0:
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x00cb:
        r1 = 10;
        if (r3 == 0) goto L_0x001b;
    L_0x00cf:
        r4 = z;
        r5 = 12;
        r4 = r4[r5];
        r4 = r8.equals(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x00db:
        r1 = 11;
        if (r3 == 0) goto L_0x001b;
    L_0x00df:
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x001b;
    L_0x00eb:
        r1 = 12;
        goto L_0x001b;
    L_0x00ef:
        r1 = new android.support.v7.widget.AppCompatTextView;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x00f6:
        r1 = new android.support.v7.widget.AppCompatImageView;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x00fd:
        r1 = new android.support.v7.widget.AppCompatButton;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0104:
        r1 = new android.support.v7.widget.AppCompatEditText;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x010b:
        r1 = new android.support.v7.widget.AppCompatSpinner;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0112:
        r1 = new android.support.v7.widget.AppCompatImageButton;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0119:
        r1 = new android.support.v7.widget.AppCompatCheckBox;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0120:
        r1 = new android.support.v7.widget.AppCompatRadioButton;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0127:
        r1 = new android.support.v7.widget.AppCompatCheckedTextView;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x012e:
        r1 = new android.support.v7.widget.AppCompatAutoCompleteTextView;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0135:
        r1 = new android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x013c:
        r1 = new android.support.v7.widget.AppCompatRatingBar;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x0143:
        r1 = new android.support.v7.widget.AppCompatSeekBar;
        r1.<init>(r0, r10);
        goto L_0x001f;
    L_0x014a:
        r0 = r1;
        goto L_0x0027;
    L_0x014d:
        r0 = r9;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatViewInflater.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean):android.view.View");
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (ViewCompat.hasOnClickListeners(view) && (context instanceof ContextWrapper)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new DeclaredOnClickListener(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createView(Context context, String str, String str2) {
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            try {
                String str3;
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                try {
                    constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                    sConstructorMap.put(str, constructor);
                } catch (Exception e) {
                    return null;
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }
}
