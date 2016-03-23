package com.whatsapp.observablelistview;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseIntArray;
import android.view.View.BaseSavedState;
import com.whatsapp.WAAppCompatActivity;

class f extends BaseSavedState {
    public static final Creator CREATOR;
    int a;
    int b;
    SparseIntArray c;
    int d;
    int e;
    int f;

    f(Parcelable parcelable, l lVar) {
        this(parcelable);
    }

    static {
        CREATOR = new i();
    }

    private f(Parcel parcel) {
        int i = ObservableListView.j;
        super(parcel);
        this.d = -1;
        this.e = parcel.readInt();
        this.d = parcel.readInt();
        this.b = parcel.readInt();
        this.f = parcel.readInt();
        this.a = parcel.readInt();
        this.c = new SparseIntArray();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int i2 = 0;
            while (i2 < readInt) {
                this.c.put(parcel.readInt(), parcel.readInt());
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        int i3 = ObservableListView.j;
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.d);
        parcel.writeInt(this.b);
        parcel.writeInt(this.f);
        parcel.writeInt(this.a);
        int size = this.c == null ? 0 : this.c.size();
        parcel.writeInt(size);
        if (size > 0) {
            while (i2 < size) {
                parcel.writeInt(this.c.keyAt(i2));
                parcel.writeInt(this.c.valueAt(i2));
                i2++;
                if (i3 != 0) {
                    WAAppCompatActivity.c++;
                    return;
                }
            }
        }
    }

    private f(Parcelable parcelable) {
        super(parcelable);
        this.d = -1;
    }

    f(Parcel parcel, l lVar) {
        this(parcel);
    }
}
