package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray implements Parcelable {
    public static final Creator CREATOR;

    final class 1 implements ParcelableCompatCreatorCallbacks {
        public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        public Object m4createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return createFromParcel(parcel, classLoader);
        }

        public ParcelableSparseArray[] newArray(int i) {
            return new ParcelableSparseArray[i];
        }

        public Object[] m5newArray(int i) {
            return newArray(i);
        }

        1() {
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = NavigationMenuPresenter.a;
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        int i3 = 0;
        while (i3 < size) {
            iArr[i3] = keyAt(i3);
            parcelableArr[i3] = (Parcelable) valueAt(i3);
            int i4 = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i4;
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public ParcelableSparseArray(Parcel parcel, ClassLoader classLoader) {
        int i = NavigationMenuPresenter.a;
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        int i2 = 0;
        while (i2 < readInt) {
            put(iArr[i2], readParcelableArray[i2]);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    static {
        CREATOR = ParcelableCompat.newCreator(new 1());
    }

    public int describeContents() {
        return 0;
    }
}
