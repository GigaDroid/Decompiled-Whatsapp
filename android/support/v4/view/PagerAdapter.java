package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import org.v;
import org.whispersystems.at;

public abstract class PagerAdapter {
    private static final String[] z;
    private DataSetObservable mObservable;

    static {
        String[] strArr = new String[2];
        String str = "+\u001dsFD\u000b\u001df\u0013@\u001c\fj\\IY\u001cg@Y\u000b\u0017{zY\u001c\u0015\"DL\nXl\\YY\u0017tV_\u000b\u0011fWH\u0017";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 45;
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
                    str = "+\u001dsFD\u000b\u001df\u0013@\u001c\fj\\IY\u0011l@Y\u0018\u0016vZL\r\u001dKGH\u0014XuR^Y\u0016mG\r\u0016\u000egA_\u0010\u001cfVC";
                    obj = null;
            }
        }
    }

    public abstract int getCount();

    public abstract boolean isViewFromObject(View view, Object obj);

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        setPrimaryItem((View) viewGroup, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        destroyItem((View) viewGroup, i, obj);
    }

    public void notifyDataSetChanged() {
        this.mObservable.notifyChanged();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return instantiateItem((View) viewGroup, i);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
    }

    public void finishUpdate(ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void destroyItem(View view, int i, Object obj) {
        throw new UnsupportedOperationException(z[0]);
    }

    public void startUpdate(ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void startUpdate(View view) {
    }

    public int getItemPosition(Object obj) {
        return -1;
    }

    public PagerAdapter() {
        this.mObservable = new DataSetObservable();
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    public Object instantiateItem(View view, int i) {
        throw new UnsupportedOperationException(z[1]);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }

    public void finishUpdate(View view) {
    }

    public CharSequence getPageTitle(int i) {
        return null;
    }
}
