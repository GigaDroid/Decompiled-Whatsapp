package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.v;
import org.whispersystems.at;

public abstract class FragmentPagerAdapter extends PagerAdapter {
    private static final String z;
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;

    static {
        char[] toCharArray = "mw<R8e}bS em;H2~#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 12;
                    break;
                case at.g /*1*/:
                    i2 = 25;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract Fragment getItem(int i);

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.mCurTransaction != null) {
            this.mCurTransaction.commitAllowingStateLoss();
            this.mCurTransaction = null;
            this.mFragmentManager.executePendingTransactions();
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object instantiateItem(android.view.ViewGroup r8, int r9) {
        /*
        r7 = this;
        r6 = 0;
        r0 = r7.mCurTransaction;
        if (r0 != 0) goto L_0x000d;
    L_0x0005:
        r0 = r7.mFragmentManager;
        r0 = r0.beginTransaction();
        r7.mCurTransaction = r0;
    L_0x000d:
        r2 = r7.getItemId(r9);
        r0 = r8.getId();
        r0 = makeFragmentName(r0, r2);
        r1 = r7.mFragmentManager;
        r0 = r1.findFragmentByTag(r0);
        if (r0 == 0) goto L_0x002a;
    L_0x0021:
        r1 = r7.mCurTransaction;
        r1.attach(r0);
        r1 = android.support.v4.app.Fragment.a;
        if (r1 == 0) goto L_0x003f;
    L_0x002a:
        r0 = r7.getItem(r9);
        r1 = r7.mCurTransaction;
        r4 = r8.getId();
        r5 = r8.getId();
        r2 = makeFragmentName(r5, r2);
        r1.add(r4, r0, r2);
    L_0x003f:
        r1 = r7.mCurrentPrimaryItem;
        if (r0 == r1) goto L_0x0049;
    L_0x0043:
        r0.setMenuVisibility(r6);
        r0.setUserVisibleHint(r6);
    L_0x0049:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentPagerAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
    }

    private static String makeFragmentName(int i, long j) {
        return z + i + ":" + j;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        this.mCurTransaction.detach((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.mCurrentPrimaryItem) {
            if (this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }
}
