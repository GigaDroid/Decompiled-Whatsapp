package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.xmlpull.v1.XmlPullParserException;

public class SupportMenuInflater extends MenuInflater {
    private static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    private static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    private static final String[] z;
    private final Object[] mActionProviderConstructorArguments;
    private final Object[] mActionViewConstructorArguments;
    private Context mContext;
    private Object mRealOwner;

    class InflatedOnMenuItemClickListener implements OnMenuItemClickListener {
        private static final Class[] PARAM_TYPES;
        private static final String[] z;
        private Method mMethod;
        private Object mRealOwner;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException(z[1] + str + z[0] + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem})).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        static {
            String[] strArr = new String[2];
            String str = "he\u001fNQ$m\u0002\u001d\u0012";
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
                            i4 = 72;
                            break;
                        case at.g /*1*/:
                            i4 = 12;
                            break;
                        case at.i /*2*/:
                            i4 = 113;
                            break;
                        case at.o /*3*/:
                            i4 = 110;
                            break;
                        default:
                            i4 = 50;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case v.m /*0*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        PARAM_TYPES = new Class[]{MenuItem.class};
                        return;
                    default:
                        strArr2[i2] = str;
                        str = "\u000bc\u0004\u0002V&+\u0005N@-\u007f\u001e\u0002D-,\u001c\u000b\\=,\u0018\u001aW%,\u001e\u0000q$e\u0012\u0005\u0012 m\u001f\n^-~Q";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                }
            }
        }
    }

    class MenuState {
        private static final String[] z;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        private ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private boolean itemEnabled;
        private int itemIconResId;
        private int itemId;
        private String itemListenerMethodName;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private boolean itemVisible;
        private Menu menu;
        final SupportMenuInflater this$0;

        static {
            String[] strArr = new String[7];
            String str = "#\n*-\u0019\u0019\u0006=b\u0011\u0013X c;\u001b\u000b,fX\u0016\u0016;\u007f\u0011\u0015\u0017;hX\u0014\u0003!c\u0017\u0003B-hX\u0002\u0011*iX\u0000\u000b;e\u0011\u0019B.-\n\u0012\u0011;\u007f\u0011\u0014\u0016*iX\u0014\r!y\u001d\u000f\u0016";
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
                            i3 = 119;
                            break;
                        case at.g /*1*/:
                            i3 = 98;
                            break;
                        case at.i /*2*/:
                            i3 = 79;
                            break;
                        case at.o /*3*/:
                            i3 = 13;
                            break;
                        default:
                            i3 = 120;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = ">\u0005!b\n\u001e\f(-\u0019\u0003\u0016=d\u001a\u0002\u0016*-_\u001e\u0016*`9\u0014\u0016&b\u0016!\u000b*z4\u0016\u001b x\fPLoL\u001b\u0003\u000b cX\u0001\u000b*zX\u0016\u000e=h\u0019\u0013\u001bo~\b\u0012\u0001&k\u0011\u0012\u0006a";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "$\u0017?}\u0017\u0005\u0016\u0002h\u0016\u0002+!k\u0014\u0016\u0016*\u007f";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = ">\u0005!b\n\u001e\f(-\u0019\u0003\u0016=d\u001a\u0002\u0016*-_\u0016\u0001;d\u0017\u00192=b\u000e\u001e\u0006*\u007f;\u001b\u0003<~_YB\u000en\f\u001e\r!-\u000e\u001e\u00078-\u0019\u001b\u0010*l\u001c\u000eB<}\u001d\u0014\u000b)d\u001d\u0013L";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "4\u0003!c\u0017\u0003B&c\u000b\u0003\u0003!y\u0011\u0016\u0016*-\u001b\u001b\u0003<~BW";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "$\u0017?}\u0017\u0005\u0016\u0002h\u0016\u0002+!k\u0014\u0016\u0016*\u007f";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "$\u0017?}\u0017\u0005\u0016\u0002h\u0016\u0002+!k\u0014\u0016\u0016*\u007f";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private Object newInstance(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = SupportMenuInflater.access$100(this.this$0).getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Throwable e) {
                Log.w(z[6], z[5] + str, e);
                return null;
            }
        }

        public void readGroup(AttributeSet attributeSet) {
            int i = ActionMode.a;
            TypedArray obtainStyledAttributes = SupportMenuInflater.access$100(this.this$0).obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            try {
                this.groupId = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
                this.groupCategory = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
                this.groupOrder = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
                this.groupCheckable = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
                this.groupVisible = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
                this.groupEnabled = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
                obtainStyledAttributes.recycle();
                if (AppCompatActivity.b != 0) {
                    ActionMode.a = i + 1;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        static ActionProvider access$000(MenuState menuState) {
            return menuState.itemActionProvider;
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void setItem(android.view.MenuItem r9) {
            /*
            r8 = this;
            r7 = 2;
            r3 = 0;
            r2 = 1;
            r4 = android.support.v7.view.ActionMode.a;
            r1 = r8.itemChecked;	 Catch:{ IllegalStateException -> 0x005d }
            r1 = r9.setChecked(r1);	 Catch:{ IllegalStateException -> 0x005d }
            r5 = r8.itemVisible;	 Catch:{ IllegalStateException -> 0x005d }
            r1 = r1.setVisible(r5);	 Catch:{ IllegalStateException -> 0x005d }
            r5 = r8.itemEnabled;	 Catch:{ IllegalStateException -> 0x005d }
            r5 = r1.setEnabled(r5);	 Catch:{ IllegalStateException -> 0x005d }
            r1 = r8.itemCheckable;	 Catch:{ IllegalStateException -> 0x005d }
            if (r1 < r2) goto L_0x005f;
        L_0x001b:
            r1 = r2;
        L_0x001c:
            r1 = r5.setCheckable(r1);	 Catch:{ IllegalStateException -> 0x0061 }
            r5 = r8.itemTitleCondensed;	 Catch:{ IllegalStateException -> 0x0061 }
            r1 = r1.setTitleCondensed(r5);	 Catch:{ IllegalStateException -> 0x0061 }
            r5 = r8.itemIconResId;	 Catch:{ IllegalStateException -> 0x0061 }
            r1 = r1.setIcon(r5);	 Catch:{ IllegalStateException -> 0x0061 }
            r5 = r8.itemAlphabeticShortcut;	 Catch:{ IllegalStateException -> 0x0061 }
            r1 = r1.setAlphabeticShortcut(r5);	 Catch:{ IllegalStateException -> 0x0061 }
            r5 = r8.itemNumericShortcut;	 Catch:{ IllegalStateException -> 0x0061 }
            r1.setNumericShortcut(r5);	 Catch:{ IllegalStateException -> 0x0061 }
            r1 = r8.itemShowAsAction;	 Catch:{ IllegalStateException -> 0x0061 }
            if (r1 < 0) goto L_0x0040;
        L_0x003b:
            r1 = r8.itemShowAsAction;	 Catch:{ IllegalStateException -> 0x0061 }
            android.support.v4.view.MenuItemCompat.setShowAsAction(r9, r1);	 Catch:{ IllegalStateException -> 0x0061 }
        L_0x0040:
            r1 = r8.itemListenerMethodName;	 Catch:{ IllegalStateException -> 0x0063 }
            if (r1 == 0) goto L_0x0075;
        L_0x0044:
            r1 = r8.this$0;	 Catch:{ IllegalStateException -> 0x005b }
            r1 = android.support.v7.view.SupportMenuInflater.access$100(r1);	 Catch:{ IllegalStateException -> 0x005b }
            r1 = r1.isRestricted();	 Catch:{ IllegalStateException -> 0x005b }
            if (r1 == 0) goto L_0x0065;
        L_0x0050:
            r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x005b }
            r2 = z;	 Catch:{ IllegalStateException -> 0x005b }
            r3 = 0;
            r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x005b }
            r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x005b }
            throw r1;	 Catch:{ IllegalStateException -> 0x005b }
        L_0x005b:
            r1 = move-exception;
            throw r1;
        L_0x005d:
            r1 = move-exception;
            throw r1;
        L_0x005f:
            r1 = r3;
            goto L_0x001c;
        L_0x0061:
            r1 = move-exception;
            throw r1;
        L_0x0063:
            r1 = move-exception;
            throw r1;	 Catch:{ IllegalStateException -> 0x005b }
        L_0x0065:
            r1 = new android.support.v7.view.SupportMenuInflater$InflatedOnMenuItemClickListener;
            r5 = r8.this$0;
            r5 = android.support.v7.view.SupportMenuInflater.access$400(r5);
            r6 = r8.itemListenerMethodName;
            r1.<init>(r5, r6);
            r9.setOnMenuItemClickListener(r1);
        L_0x0075:
            r1 = r9 instanceof android.support.v7.view.menu.MenuItemImpl;	 Catch:{ IllegalStateException -> 0x00d9 }
            if (r1 == 0) goto L_0x007d;
        L_0x0079:
            r0 = r9;
            r0 = (android.support.v7.view.menu.MenuItemImpl) r0;	 Catch:{ IllegalStateException -> 0x00d9 }
            r1 = r0;
        L_0x007d:
            r1 = r8.itemCheckable;	 Catch:{ IllegalStateException -> 0x00db }
            if (r1 < r7) goto L_0x009b;
        L_0x0081:
            r1 = r9 instanceof android.support.v7.view.menu.MenuItemImpl;	 Catch:{ IllegalStateException -> 0x00dd }
            if (r1 == 0) goto L_0x008f;
        L_0x0085:
            r0 = r9;
            r0 = (android.support.v7.view.menu.MenuItemImpl) r0;	 Catch:{ IllegalStateException -> 0x00df }
            r1 = r0;
            r5 = 1;
            r1.setExclusiveCheckable(r5);	 Catch:{ IllegalStateException -> 0x00df }
            if (r4 == 0) goto L_0x009b;
        L_0x008f:
            r1 = r9 instanceof android.support.v7.view.menu.MenuItemWrapperICS;	 Catch:{ IllegalStateException -> 0x00e1 }
            if (r1 == 0) goto L_0x009b;
        L_0x0093:
            r0 = r9;
            r0 = (android.support.v7.view.menu.MenuItemWrapperICS) r0;	 Catch:{ IllegalStateException -> 0x00e1 }
            r1 = r0;
            r5 = 1;
            r1.setExclusiveCheckable(r5);	 Catch:{ IllegalStateException -> 0x00e1 }
        L_0x009b:
            r1 = r8.itemActionViewClassName;
            if (r1 == 0) goto L_0x00e9;
        L_0x009f:
            r1 = r8.itemActionViewClassName;
            r3 = android.support.v7.view.SupportMenuInflater.access$500();
            r5 = r8.this$0;
            r5 = android.support.v7.view.SupportMenuInflater.access$600(r5);
            r1 = r8.newInstance(r1, r3, r5);
            r1 = (android.view.View) r1;
            android.support.v4.view.MenuItemCompat.setActionView(r9, r1);
            r1 = r2;
        L_0x00b5:
            r2 = r8.itemActionViewLayout;	 Catch:{ IllegalStateException -> 0x00e3 }
            if (r2 <= 0) goto L_0x00cf;
        L_0x00b9:
            if (r1 != 0) goto L_0x00c2;
        L_0x00bb:
            r1 = r8.itemActionViewLayout;
            android.support.v4.view.MenuItemCompat.setActionView(r9, r1);
            if (r4 == 0) goto L_0x00cf;
        L_0x00c2:
            r1 = z;	 Catch:{ IllegalStateException -> 0x00e5 }
            r2 = 1;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00e5 }
            r2 = z;	 Catch:{ IllegalStateException -> 0x00e5 }
            r3 = 2;
            r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00e5 }
            android.util.Log.w(r1, r2);	 Catch:{ IllegalStateException -> 0x00e5 }
        L_0x00cf:
            r1 = r8.itemActionProvider;	 Catch:{ IllegalStateException -> 0x00e7 }
            if (r1 == 0) goto L_0x00d8;
        L_0x00d3:
            r1 = r8.itemActionProvider;	 Catch:{ IllegalStateException -> 0x00e7 }
            android.support.v4.view.MenuItemCompat.setActionProvider(r9, r1);	 Catch:{ IllegalStateException -> 0x00e7 }
        L_0x00d8:
            return;
        L_0x00d9:
            r1 = move-exception;
            throw r1;
        L_0x00db:
            r1 = move-exception;
            throw r1;	 Catch:{ IllegalStateException -> 0x00dd }
        L_0x00dd:
            r1 = move-exception;
            throw r1;	 Catch:{ IllegalStateException -> 0x00df }
        L_0x00df:
            r1 = move-exception;
            throw r1;	 Catch:{ IllegalStateException -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception;
            throw r1;
        L_0x00e3:
            r1 = move-exception;
            throw r1;
        L_0x00e5:
            r1 = move-exception;
            throw r1;
        L_0x00e7:
            r1 = move-exception;
            throw r1;
        L_0x00e9:
            r1 = r3;
            goto L_0x00b5;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.SupportMenuInflater.MenuState.setItem(android.view.MenuItem):void");
        }

        public void addItem() {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void readItem(android.util.AttributeSet r8) {
            /*
            r7 = this;
            r1 = 1;
            r2 = 0;
            r3 = android.support.v7.view.ActionMode.a;
            r0 = r7.this$0;
            r0 = android.support.v7.view.SupportMenuInflater.access$100(r0);
            r4 = android.support.v7.appcompat.R.styleable.MenuItem;
            r4 = r0.obtainStyledAttributes(r8, r4);
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_id;
            r0 = r4.getResourceId(r0, r2);
            r7.itemId = r0;
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_menuCategory;
            r5 = r7.groupCategory;
            r0 = r4.getInt(r0, r5);
            r5 = android.support.v7.appcompat.R.styleable.MenuItem_android_orderInCategory;
            r6 = r7.groupOrder;
            r5 = r4.getInt(r5, r6);
            r6 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
            r0 = r0 & r6;
            r6 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            r5 = r5 & r6;
            r0 = r0 | r5;
            r7.itemCategoryOrder = r0;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_title;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r4.getText(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            r7.itemTitle = r0;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_titleCondensed;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r4.getText(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            r7.itemTitleCondensed = r0;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_icon;	 Catch:{ IllegalStateException -> 0x0106 }
            r5 = 0;
            r0 = r4.getResourceId(r0, r5);	 Catch:{ IllegalStateException -> 0x0106 }
            r7.itemIconResId = r0;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_alphabeticShortcut;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r4.getString(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r7.getShortcut(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            r7.itemAlphabeticShortcut = r0;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_numericShortcut;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r4.getString(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r7.getShortcut(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            r7.itemNumericShortcut = r0;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_checkable;	 Catch:{ IllegalStateException -> 0x0106 }
            r0 = r4.hasValue(r0);	 Catch:{ IllegalStateException -> 0x0106 }
            if (r0 == 0) goto L_0x007f;
        L_0x006b:
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_checkable;	 Catch:{ IllegalStateException -> 0x0108 }
            r5 = 0;
            r0 = r4.getBoolean(r0, r5);	 Catch:{ IllegalStateException -> 0x0108 }
            if (r0 == 0) goto L_0x010a;
        L_0x0074:
            r0 = r1;
        L_0x0075:
            r7.itemCheckable = r0;
            if (r3 == 0) goto L_0x0083;
        L_0x0079:
            r0 = android.support.v7.app.AppCompatActivity.b;
            r0 = r0 + 1;
            android.support.v7.app.AppCompatActivity.b = r0;
        L_0x007f:
            r0 = r7.groupCheckable;
            r7.itemCheckable = r0;
        L_0x0083:
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_checked;	 Catch:{ IllegalStateException -> 0x010d }
            r5 = 0;
            r0 = r4.getBoolean(r0, r5);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemChecked = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_visible;	 Catch:{ IllegalStateException -> 0x010d }
            r5 = r7.groupVisible;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = r4.getBoolean(r0, r5);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemVisible = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_enabled;	 Catch:{ IllegalStateException -> 0x010d }
            r5 = r7.groupEnabled;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = r4.getBoolean(r0, r5);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemEnabled = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_showAsAction;	 Catch:{ IllegalStateException -> 0x010d }
            r5 = -1;
            r0 = r4.getInt(r0, r5);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemShowAsAction = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_android_onClick;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = r4.getString(r0);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemListenerMethodName = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_actionLayout;	 Catch:{ IllegalStateException -> 0x010d }
            r5 = 0;
            r0 = r4.getResourceId(r0, r5);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemActionViewLayout = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_actionViewClass;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = r4.getString(r0);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemActionViewClassName = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = android.support.v7.appcompat.R.styleable.MenuItem_actionProviderClass;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = r4.getString(r0);	 Catch:{ IllegalStateException -> 0x010d }
            r7.itemActionProviderClassName = r0;	 Catch:{ IllegalStateException -> 0x010d }
            r0 = r7.itemActionProviderClassName;	 Catch:{ IllegalStateException -> 0x010d }
            if (r0 == 0) goto L_0x010f;
        L_0x00ce:
            if (r1 == 0) goto L_0x00ee;
        L_0x00d0:
            r0 = r7.itemActionViewLayout;	 Catch:{ IllegalStateException -> 0x0111 }
            if (r0 != 0) goto L_0x00ee;
        L_0x00d4:
            r0 = r7.itemActionViewClassName;	 Catch:{ IllegalStateException -> 0x0113 }
            if (r0 != 0) goto L_0x00ee;
        L_0x00d8:
            r0 = r7.itemActionProviderClassName;	 Catch:{ IllegalStateException -> 0x0115 }
            r5 = android.support.v7.view.SupportMenuInflater.access$200();	 Catch:{ IllegalStateException -> 0x0115 }
            r6 = r7.this$0;	 Catch:{ IllegalStateException -> 0x0115 }
            r6 = android.support.v7.view.SupportMenuInflater.access$300(r6);	 Catch:{ IllegalStateException -> 0x0115 }
            r0 = r7.newInstance(r0, r5, r6);	 Catch:{ IllegalStateException -> 0x0115 }
            r0 = (android.support.v4.view.ActionProvider) r0;	 Catch:{ IllegalStateException -> 0x0115 }
            r7.itemActionProvider = r0;	 Catch:{ IllegalStateException -> 0x0115 }
            if (r3 == 0) goto L_0x0100;
        L_0x00ee:
            if (r1 == 0) goto L_0x00fd;
        L_0x00f0:
            r0 = z;	 Catch:{ IllegalStateException -> 0x0117 }
            r1 = 3;
            r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0117 }
            r1 = z;	 Catch:{ IllegalStateException -> 0x0117 }
            r3 = 4;
            r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x0117 }
            android.util.Log.w(r0, r1);	 Catch:{ IllegalStateException -> 0x0117 }
        L_0x00fd:
            r0 = 0;
            r7.itemActionProvider = r0;
        L_0x0100:
            r4.recycle();
            r7.itemAdded = r2;
            return;
        L_0x0106:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0108 }
        L_0x0108:
            r0 = move-exception;
            throw r0;
        L_0x010a:
            r0 = r2;
            goto L_0x0075;
        L_0x010d:
            r0 = move-exception;
            throw r0;
        L_0x010f:
            r1 = r2;
            goto L_0x00ce;
        L_0x0111:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0113 }
        L_0x0113:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0115 }
        L_0x0115:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0117 }
        L_0x0117:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.SupportMenuInflater.MenuState.readItem(android.util.AttributeSet):void");
        }

        private char getShortcut(String str) {
            if (str == null) {
                return '\u0000';
            }
            return str.charAt(0);
        }

        public SubMenu addSubMenuItem() {
            this.itemAdded = true;
            SubMenu addSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(addSubMenu.getItem());
            return addSubMenu;
        }

        public MenuState(SupportMenuInflater supportMenuInflater, Menu menu) {
            this.this$0 = supportMenuInflater;
            this.menu = menu;
            resetGroup();
        }
    }

    private Object getRealOwner() {
        try {
            if (this.mRealOwner == null) {
                this.mRealOwner = findRealOwner(this.mContext);
            }
            return this.mRealOwner;
        } catch (InflateException e) {
            throw e;
        }
    }

    static Object[] access$300(SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.mActionProviderConstructorArguments;
    }

    static Class[] access$200() {
        return ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    }

    static Class[] access$500() {
        return ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    }

    static {
        String[] strArr = new String[11];
        String str = "#j#M";
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
                        i4 = 74;
                        break;
                    case at.g /*1*/:
                        i4 = 30;
                        break;
                    case at.i /*2*/:
                        i4 = 70;
                        break;
                    case at.o /*3*/:
                        i4 = 32;
                        break;
                    default:
                        i4 = 41;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u000ff6EJ>w(G\t'{(U\u0005jy)T\t";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u001fp#XY/}2EMj{(D\t%xfDF)k+EG>";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "'{(U";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "-l)UY";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "#j#M";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "-l)UY";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "'{(U";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u000fl4O[jw(FE+j/NNjs#N\\jF\u000bl";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u000fl4O[jw(FE+j/NNjs#N\\jF\u000bl";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ACTION_VIEW_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class};
                    ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "'{(U";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseMenu(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
        r12 = this;
        r5 = 0;
        r1 = 2;
        r2 = 1;
        r6 = 0;
        r7 = android.support.v7.view.ActionMode.a;
        r8 = new android.support.v7.view.SupportMenuInflater$MenuState;
        r8.<init>(r12, r15);
        r0 = r13.getEventType();
    L_0x000f:
        if (r0 != r1) goto L_0x0045;
    L_0x0011:
        r1 = r13.getName();
        r0 = z;
        r3 = 8;
        r0 = r0[r3];
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r0 = r13.next();
        if (r7 == 0) goto L_0x004b;
    L_0x0027:
        r0 = new java.lang.RuntimeException;	 Catch:{ InflateException -> 0x0043 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InflateException -> 0x0043 }
        r2.<init>();	 Catch:{ InflateException -> 0x0043 }
        r3 = z;	 Catch:{ InflateException -> 0x0043 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ InflateException -> 0x0043 }
        r2 = r2.append(r3);	 Catch:{ InflateException -> 0x0043 }
        r1 = r2.append(r1);	 Catch:{ InflateException -> 0x0043 }
        r1 = r1.toString();	 Catch:{ InflateException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ InflateException -> 0x0043 }
        throw r0;	 Catch:{ InflateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = r13.next();
        if (r0 != r2) goto L_0x000f;
    L_0x004b:
        r4 = r6;
        r1 = r5;
        r3 = r6;
    L_0x004e:
        if (r4 != 0) goto L_0x005a;
    L_0x0050:
        switch(r0) {
            case 1: goto L_0x00fc;
            case 2: goto L_0x005b;
            case 3: goto L_0x011e;
            default: goto L_0x0053;
        };
    L_0x0053:
        r0 = r4;
    L_0x0054:
        r4 = r13.next();
        if (r7 == 0) goto L_0x0122;
    L_0x005a:
        return;
    L_0x005b:
        if (r3 == 0) goto L_0x005f;
    L_0x005d:
        if (r7 == 0) goto L_0x0053;
    L_0x005f:
        r0 = r13.getName();
        r9 = z;	 Catch:{ InflateException -> 0x00aa }
        r10 = 7;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x00aa }
        r9 = r0.equals(r9);	 Catch:{ InflateException -> 0x00aa }
        if (r9 == 0) goto L_0x0073;
    L_0x006e:
        r8.readGroup(r14);	 Catch:{ InflateException -> 0x00ac }
        if (r7 == 0) goto L_0x0053;
    L_0x0073:
        r9 = z;	 Catch:{ InflateException -> 0x00ae }
        r10 = 0;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x00ae }
        r9 = r0.equals(r9);	 Catch:{ InflateException -> 0x00ae }
        if (r9 == 0) goto L_0x0083;
    L_0x007e:
        r8.readItem(r14);	 Catch:{ InflateException -> 0x00b0 }
        if (r7 == 0) goto L_0x0053;
    L_0x0083:
        r9 = z;	 Catch:{ InflateException -> 0x00b0 }
        r10 = 4;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x00b0 }
        r9 = r0.equals(r9);	 Catch:{ InflateException -> 0x00b0 }
        if (r9 == 0) goto L_0x0097;
    L_0x008e:
        r9 = r8.addSubMenuItem();
        r12.parseMenu(r13, r14, r9);
        if (r7 == 0) goto L_0x0053;
    L_0x0097:
        if (r7 == 0) goto L_0x0119;
    L_0x0099:
        r1 = r2;
    L_0x009a:
        r3 = r13.getName();
        if (r1 == 0) goto L_0x00b4;
    L_0x00a0:
        r9 = r3.equals(r0);	 Catch:{ InflateException -> 0x00b2 }
        if (r9 == 0) goto L_0x00b4;
    L_0x00a6:
        r0 = r4;
        r1 = r5;
        r3 = r6;
        goto L_0x0054;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r9 = z;	 Catch:{ InflateException -> 0x0109 }
        r10 = 5;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x0109 }
        r9 = r3.equals(r9);	 Catch:{ InflateException -> 0x0109 }
        if (r9 == 0) goto L_0x00c4;
    L_0x00bf:
        r8.resetGroup();	 Catch:{ InflateException -> 0x010b }
        if (r7 == 0) goto L_0x012c;
    L_0x00c4:
        r9 = z;	 Catch:{ InflateException -> 0x010d }
        r10 = 6;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x010d }
        r9 = r3.equals(r9);	 Catch:{ InflateException -> 0x010d }
        if (r9 == 0) goto L_0x00ef;
    L_0x00cf:
        r9 = r8.hasAddedItem();	 Catch:{ InflateException -> 0x010f }
        if (r9 != 0) goto L_0x012c;
    L_0x00d5:
        r9 = android.support.v7.view.SupportMenuInflater.MenuState.access$000(r8);	 Catch:{ InflateException -> 0x0111 }
        if (r9 == 0) goto L_0x00ea;
    L_0x00db:
        r9 = android.support.v7.view.SupportMenuInflater.MenuState.access$000(r8);	 Catch:{ InflateException -> 0x0113 }
        r9 = r9.hasSubMenu();	 Catch:{ InflateException -> 0x0113 }
        if (r9 == 0) goto L_0x00ea;
    L_0x00e5:
        r8.addSubMenuItem();	 Catch:{ InflateException -> 0x0115 }
        if (r7 == 0) goto L_0x012c;
    L_0x00ea:
        r8.addItem();	 Catch:{ InflateException -> 0x0117 }
        if (r7 == 0) goto L_0x012c;
    L_0x00ef:
        r9 = z;	 Catch:{ InflateException -> 0x0117 }
        r10 = 1;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x0117 }
        r3 = r3.equals(r9);	 Catch:{ InflateException -> 0x0117 }
        if (r3 == 0) goto L_0x012c;
    L_0x00fa:
        if (r7 == 0) goto L_0x0127;
    L_0x00fc:
        r0 = new java.lang.RuntimeException;	 Catch:{ InflateException -> 0x0107 }
        r1 = z;	 Catch:{ InflateException -> 0x0107 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0107 }
        r0.<init>(r1);	 Catch:{ InflateException -> 0x0107 }
        throw r0;	 Catch:{ InflateException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0117 }
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r1 = r0;
        r3 = r2;
        r0 = r4;
        goto L_0x0054;
    L_0x011e:
        r0 = r1;
        r1 = r3;
        goto L_0x009a;
    L_0x0122:
        r11 = r0;
        r0 = r4;
        r4 = r11;
        goto L_0x004e;
    L_0x0127:
        r3 = r1;
        r1 = r0;
        r0 = r2;
        goto L_0x0054;
    L_0x012c:
        r3 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.SupportMenuInflater.parseMenu(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        this.mActionViewConstructorArguments = new Object[]{context};
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }

    private Object findRealOwner(Object obj) {
        try {
            if (!(obj instanceof Activity)) {
                try {
                    if (obj instanceof ContextWrapper) {
                        obj = findRealOwner(((ContextWrapper) obj).getBaseContext());
                    }
                } catch (InflateException e) {
                    throw e;
                }
            }
            return obj;
        } catch (InflateException e2) {
            throw e2;
        }
    }

    static Object access$400(SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.getRealOwner();
    }

    static Object[] access$600(SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.mActionViewConstructorArguments;
    }

    static Context access$100(SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.mContext;
    }

    public void inflate(int i, Menu menu) {
        try {
            if (menu instanceof SupportMenu) {
                XmlResourceParser xmlResourceParser = null;
                try {
                    xmlResourceParser = this.mContext.getResources().getLayout(i);
                    parseMenu(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                        return;
                    }
                    return;
                } catch (Throwable e) {
                    throw new InflateException(z[9], e);
                } catch (Throwable e2) {
                    throw new InflateException(z[10], e2);
                } catch (Throwable th) {
                    if (xmlResourceParser != null) {
                        try {
                            xmlResourceParser.close();
                        } catch (XmlPullParserException e3) {
                            throw e3;
                        }
                    }
                }
            }
            super.inflate(i, menu);
        } catch (XmlPullParserException e32) {
            throw e32;
        }
    }
}
