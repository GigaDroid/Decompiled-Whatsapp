package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import com.whatsapp.arj;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private static final String[] z;
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private TabInfo mLastTab;
    private OnTabChangeListener mOnTabChangeListener;
    private final ArrayList mTabs;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        private static final String[] z;
        String curTab;

        final class 1 implements Creator {
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public Object m45createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            1() {
            }

            public Object[] m46newArray(int i) {
                return newArray(i);
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
        }

        SavedState(Parcel parcel, 1 1) {
            this(parcel);
        }

        static {
            String[] strArr = new String[2];
            String str = "J2\u001e;{i.\u000b\bwn\b\u0010/b\"\u0013\u001e*sh\u0013\u000b=bi;";
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
                            i3 = 12;
                            break;
                        case at.g /*1*/:
                            i3 = 64;
                            break;
                        case at.i /*2*/:
                            i3 = 127;
                            break;
                        case at.o /*3*/:
                            i3 = 92;
                            break;
                        default:
                            i3 = 22;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        CREATOR = new 1();
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = ",#\n.Bm\"B";
                        obj = null;
                }
            }
        }

        public String toString() {
            return z[0] + Integer.toHexString(System.identityHashCode(this)) + z[1] + this.curTab + "}";
        }
    }

    final class TabInfo {
        private final Bundle args;
        private final Class clss;
        private Fragment fragment;
        private final String tag;

        static Class access$300(TabInfo tabInfo) {
            return tabInfo.clss;
        }

        static Fragment access$100(TabInfo tabInfo) {
            return tabInfo.fragment;
        }

        static Fragment access$102(TabInfo tabInfo, Fragment fragment) {
            tabInfo.fragment = fragment;
            return fragment;
        }

        static String access$200(TabInfo tabInfo) {
            return tabInfo.tag;
        }

        static Bundle access$400(TabInfo tabInfo) {
            return tabInfo.args;
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "\u000b\u0010]e\u0003%\u0004B}\u00035\u0000ZdSnL\u000eeK'\u0011\u000eeB-\u0000]1Bf&A\u007fW#\u001dZ1B(\u0001\u000eWQ'\u0002CtM2(O\u007fB!\u0000\\";
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
                        i3 = 70;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\b\n\u000eeB$EE\u007fL1\u000b\u000ewL4EZpDf";
                    obj = null;
            }
        }
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.mOnTabChangeListener = onTabChangeListener;
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        this.mTabs = new ArrayList();
        initFragmentTabHost(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.app.FragmentTransaction doTabChanged(java.lang.String r6, android.support.v4.app.FragmentTransaction r7) {
        /*
        r5 = this;
        r3 = android.support.v4.app.Fragment.a;
        r1 = 0;
        r0 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0006:
        r0 = r5.mTabs;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0025;
    L_0x000e:
        r0 = r5.mTabs;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.FragmentTabHost.TabInfo) r0;
        r4 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r0);
        r4 = r4.equals(r6);
        if (r4 == 0) goto L_0x0021;
    L_0x0020:
        r2 = r0;
    L_0x0021:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x00a6;
    L_0x0025:
        if (r2 != 0) goto L_0x0045;
    L_0x0027:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0043 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0043 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0043 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0043 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 == r2) goto L_0x009b;
    L_0x0049:
        if (r7 != 0) goto L_0x0051;
    L_0x004b:
        r0 = r5.mFragmentManager;
        r7 = r0.beginTransaction();
    L_0x0051:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x009e }
        if (r0 == 0) goto L_0x0066;
    L_0x0055:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x00a0 }
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x0066;
    L_0x005d:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x00a0 }
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
        r7.detach(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x0066:
        if (r2 == 0) goto L_0x0099;
    L_0x0068:
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r2);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r0 != 0) goto L_0x0092;
    L_0x006e:
        r0 = r5.mContext;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = android.support.v4.app.FragmentTabHost.TabInfo.access$300(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1.getName();	 Catch:{ IllegalStateException -> 0x00a4 }
        r4 = android.support.v4.app.FragmentTabHost.TabInfo.access$400(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r0 = android.support.v4.app.Fragment.instantiate(r0, r1, r4);	 Catch:{ IllegalStateException -> 0x00a4 }
        android.support.v4.app.FragmentTabHost.TabInfo.access$102(r2, r0);	 Catch:{ IllegalStateException -> 0x00a4 }
        r0 = r5.mContainerId;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r4 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r7.add(r0, r1, r4);	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r3 == 0) goto L_0x0099;
    L_0x0092:
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r7.attach(r0);	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x0099:
        r5.mLastTab = r2;
    L_0x009b:
        return r7;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r1 = r0;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTabHost.doTabChanged(java.lang.String, android.support.v4.app.FragmentTransaction):android.support.v4.app.FragmentTransaction");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        return savedState;
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.curTab);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onAttachedToWindow() {
        /*
        r7 = this;
        r3 = android.support.v4.app.Fragment.a;
        super.onAttachedToWindow();
        r4 = r7.getCurrentTabTag();
        r1 = 0;
        r0 = 0;
        r2 = r0;
    L_0x000c:
        r0 = r7.mTabs;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x005a;
    L_0x0014:
        r0 = r7.mTabs;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.FragmentTabHost.TabInfo) r0;
        r5 = r7.mFragmentManager;	 Catch:{ IllegalStateException -> 0x006c }
        r6 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r0);	 Catch:{ IllegalStateException -> 0x006c }
        r5 = r5.findFragmentByTag(r6);	 Catch:{ IllegalStateException -> 0x006c }
        android.support.v4.app.FragmentTabHost.TabInfo.access$102(r0, r5);	 Catch:{ IllegalStateException -> 0x006c }
        r5 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x006c }
        if (r5 == 0) goto L_0x0056;
    L_0x002f:
        r5 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x006e }
        r5 = r5.isDetached();	 Catch:{ IllegalStateException -> 0x006e }
        if (r5 != 0) goto L_0x0056;
    L_0x0039:
        r5 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r0);	 Catch:{ IllegalStateException -> 0x0070 }
        r5 = r5.equals(r4);	 Catch:{ IllegalStateException -> 0x0070 }
        if (r5 == 0) goto L_0x0047;
    L_0x0043:
        r7.mLastTab = r0;	 Catch:{ IllegalStateException -> 0x0072 }
        if (r3 == 0) goto L_0x0056;
    L_0x0047:
        if (r1 != 0) goto L_0x004f;
    L_0x0049:
        r1 = r7.mFragmentManager;
        r1 = r1.beginTransaction();
    L_0x004f:
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);
        r1.detach(r0);
    L_0x0056:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x0076;
    L_0x005a:
        r0 = 1;
        r7.mAttached = r0;
        r0 = r7.doTabChanged(r4, r1);
        if (r0 == 0) goto L_0x006b;
    L_0x0063:
        r0.commit();	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r7.mFragmentManager;	 Catch:{ IllegalStateException -> 0x0074 }
        r0.executePendingTransactions();	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r2 = r0;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTabHost.onAttachedToWindow():void");
    }

    public void onTabChanged(String str) {
        if (this.mAttached) {
            FragmentTransaction doTabChanged = doTabChanged(str, null);
            if (doTabChanged != null) {
                try {
                    doTabChanged.commit();
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        try {
            if (this.mOnTabChangeListener != null) {
                this.mOnTabChangeListener.onTabChanged(str);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabs = new ArrayList();
        initFragmentTabHost(context, attributeSet);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException(z[0]);
    }
}
