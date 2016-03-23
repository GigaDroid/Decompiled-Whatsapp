package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.v;
import org.whispersystems.at;

public final class MediaBrowserCompat {

    public class MediaItem implements Parcelable {
        public static final Creator CREATOR;
        private static final String[] z;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        final class 1 implements Creator {
            1() {
            }

            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel, null);
            }

            public Object m51createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }

            public Object[] m52newArray(int i) {
                return newArray(i);
            }
        }

        private MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        MediaItem(Parcel parcel, 1 1) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(z[0]);
            stringBuilder.append(z[2]).append(this.mFlags);
            stringBuilder.append(z[1]).append(this.mDescription);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public int describeContents() {
            return 0;
        }

        static {
            String[] strArr = new String[3];
            String str = "7PKe\u00103AJa\n";
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
                            i3 = 122;
                            break;
                        case at.g /*1*/:
                            i3 = 53;
                            break;
                        case at.i /*2*/:
                            i3 = 47;
                            break;
                        case at.o /*3*/:
                            i3 = 12;
                            break;
                        default:
                            i3 = 113;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        strArr2 = strArr3;
                        str = "\u0017sCm\u0016\t\b";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        CREATOR = new 1();
                        return;
                    default:
                        strArr2[i] = str;
                        str = "V\u0015BH\u0014\tV]e\u0001\u000e\\@bL";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }
    }
}
