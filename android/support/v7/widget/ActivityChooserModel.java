package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.v4.os.AsyncTaskCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.whatsapp.arj;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel extends DataSetObservable {
    private static final String LOG_TAG;
    private static final Map sDataModelRegistry;
    private static final Object sRegistryLock;
    private static final String[] z;
    private final List mActivities;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    public interface ActivityChooserModelClient {
    }

    public final class ActivityResolveInfo implements Comparable {
        private static final String[] z;
        public final ResolveInfo resolveInfo;
        final ActivityChooserModel this$0;
        public float weight;

        static {
            String[] strArr = new String[2];
            String str = " F*\u00154|\u000e)J";
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
                            i3 = 27;
                            break;
                        case at.g /*1*/:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                        case at.i /*2*/:
                            i3 = 93;
                            break;
                        case at.o /*3*/:
                            i3 = 112;
                            break;
                        default:
                            i3 = 93;
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
                        str = "i\u0003.\u001f1m\u0003\u0014\u001e;t\\";
                        obj = null;
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(z[1]).append(this.resolveInfo.toString());
            stringBuilder.append(z[0]).append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public int compareTo(Object obj) {
            return compareTo((ActivityResolveInfo) obj);
        }

        public ActivityResolveInfo(ActivityChooserModel activityChooserModel, ResolveInfo resolveInfo) {
            this.this$0 = activityChooserModel;
            this.resolveInfo = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(((ActivityResolveInfo) obj).weight)) {
                return false;
            }
            return true;
        }

        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List list, List list2);
    }

    public final class HistoricalRecord {
        private static final String[] z;
        public final ComponentName activity;
        public final long time;
        public final float weight;

        static {
            String[] strArr = new String[3];
            String str = "I\u0004H,\u0002\u0015LKs";
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
                            i3 = 114;
                            break;
                        case at.g /*1*/:
                            i3 = 36;
                            break;
                        case at.i /*2*/:
                            i3 = 63;
                            break;
                        case at.o /*3*/:
                            i3 = 73;
                            break;
                        default:
                            i3 = arj.Theme_seekBarStyle;
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
                        str = "I\u0004K \u0006\u0017\u001e";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "I\u0004^*\u001f\u001bRV=\u0012H";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            if (this.activity == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!this.activity.equals(historicalRecord.activity)) {
                return false;
            }
            if (this.time != historicalRecord.time) {
                return false;
            }
            if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(historicalRecord.weight)) {
                return false;
            }
            return true;
        }

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public HistoricalRecord(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(z[1]).append(this.activity);
            stringBuilder.append(z[2]).append(this.time);
            stringBuilder.append(z[0]).append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public int hashCode() {
            int i;
            if (this.activity == null) {
                i = 0;
            } else {
                i = this.activity.hashCode();
            }
            return ((((i + 31) * 31) + ((int) (this.time ^ (this.time >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    final class PersistHistoryAsyncTask extends AsyncTask {
        private static final String[] z;
        final ActivityChooserModel this$0;

        static {
            String[] strArr = new String[12];
            String str = "/\u0005.z\\'\u0012#";
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
                            i3 = 78;
                            break;
                        case at.g /*1*/:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                        case at.i /*2*/:
                            i3 = 90;
                            break;
                        case at.o /*3*/:
                            i3 = 19;
                            break;
                        default:
                            i3 = 42;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u000b\u0014(|Xn\u0011(z^'\b=3B'\u0015.|X'\u0005;\u007f\n<\u00039aE*F<zF+\\z";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "&\u000f)gE<\u000f9rFc\u0014?pE<\u0002";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "&\u000f)gE<\u000f9rFc\u0014?pE<\u0002)";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "9\u00033tB:";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u000b\u0014(|Xn\u0011(z^'\b=3B'\u0015.|X'\u0005;\u007f\n<\u00039aE*F<zF+\\z";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\u001b2\u001c>\u0012";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = ":\u000f7v";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u000b\u0014(|Xn\u0011(z^'\b=3B'\u0015.|X'\u0005;\u007f\n<\u00039aE*F<zF+\\z";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u000b\u0014(|Xn\u0011(z^'\b=3B'\u0015.|X'\u0005;\u007f\n<\u00039aE*F<zF+\\z";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "&\u000f)gE<\u000f9rFc\u0014?pE<\u0002";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "&\u000f)gE<\u000f9rFc\u0014?pE<\u0002)";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public Void m76doInBackground(Object[] objArr) {
            int i = 0;
            boolean z = LinearLayoutCompat.a;
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                OutputStream openFileOutput = ActivityChooserModel.access$200(this.this$0).openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(z[7], Boolean.valueOf(true));
                    newSerializer.startTag(null, z[4]);
                    int size = list.size();
                    while (i < size) {
                        HistoricalRecord historicalRecord = (HistoricalRecord) list.remove(0);
                        newSerializer.startTag(null, z[11]);
                        newSerializer.attribute(null, z[0], historicalRecord.activity.flattenToString());
                        newSerializer.attribute(null, z[8], String.valueOf(historicalRecord.time));
                        newSerializer.attribute(null, z[5], String.valueOf(historicalRecord.weight));
                        newSerializer.endTag(null, z[3]);
                        int i2 = i + 1;
                        if (z) {
                            break;
                        }
                        i = i2;
                    }
                    newSerializer.endTag(null, z[1]);
                    newSerializer.endDocument();
                    ActivityChooserModel.access$502(this.this$0, true);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable e2) {
                    Log.e(ActivityChooserModel.access$300(), z[6] + ActivityChooserModel.access$400(this.this$0), e2);
                    ActivityChooserModel.access$502(this.this$0, true);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable e22) {
                    Log.e(ActivityChooserModel.access$300(), z[9] + ActivityChooserModel.access$400(this.this$0), e22);
                    ActivityChooserModel.access$502(this.this$0, true);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (Throwable e222) {
                    Log.e(ActivityChooserModel.access$300(), z[2] + ActivityChooserModel.access$400(this.this$0), e222);
                    ActivityChooserModel.access$502(this.this$0, true);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        ActivityChooserModel.access$502(this.this$0, true);
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException e6) {
                            }
                        }
                    } catch (IllegalArgumentException e7) {
                        throw e7;
                    }
                }
            } catch (Throwable e2222) {
                Log.e(ActivityChooserModel.access$300(), z[10] + str, e2222);
            }
            return null;
        }

        public Object doInBackground(Object[] objArr) {
            return doInBackground(objArr);
        }

        PersistHistoryAsyncTask(ActivityChooserModel activityChooserModel, 1 1) {
            this(activityChooserModel);
        }

        private PersistHistoryAsyncTask(ActivityChooserModel activityChooserModel) {
            this.this$0 = activityChooserModel;
        }
    }

    private boolean loadActivitiesIfNeeded() {
        boolean z = LinearLayoutCompat.a;
        try {
            if (!this.mReloadActivities || this.mIntent == null) {
                return false;
            }
            this.mReloadActivities = false;
            this.mActivities.clear();
            List queryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
            int size = queryIntentActivities.size();
            int i = 0;
            while (i < size) {
                this.mActivities.add(new ActivityResolveInfo(this, (ResolveInfo) queryIntentActivities.get(i)));
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean readHistoricalDataIfNeeded() {
        try {
            if (this.mCanReadHistoricalData) {
                if (this.mHistoricalRecordsChanged) {
                    try {
                        if (!TextUtils.isEmpty(this.mHistoryFileName)) {
                            this.mCanReadHistoricalData = false;
                            this.mReadShareHistoryCalled = true;
                            readHistoricalDataImpl();
                            return true;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            if (this.mActivities.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((ActivityResolveInfo) this.mActivities.get(0)).resolveInfo;
            return resolveInfo;
        }
    }

    static {
        String[] strArr = new String[11];
        String str = "\u0001fC^";
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
                        i3 = 117;
                        break;
                    case at.g /*1*/:
                        i3 = 15;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
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
                    str = "\u001df]O\u0017\u0007fMZ\u0014X}KX\u0017\u0007k]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "&gOI\u001dU}KX\u0017\u0007k]\u001b\u001e\u001ccK\u001b\u001c\u001aj]\u001b\u0016\u001a{\u000eH\f\u0014}Z\u001b\u000f\u001c{F\u001b\u0010\u001c|ZT\n\u001clOWU\u0007jMT\n\u0011|\u000eO\u0019\u0012!";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001df]O\u0017\u0007fMZ\u0014X}KX\u0017\u0007k";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0014lZR\u000e\u001c{W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " [h\u0016@";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "0}\\T\nU}KZ\u001c\u001caI\u001b\u0010\u001c|ZT\n\u001clOWX\u0007jMI\u0017\u0011/HR\u0014\u00105\u000e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "0}\\T\nU}KZ\u001c\u001caI\u001b\u0010\u001c|ZT\n\u001clOWX\u0007jMI\u0017\u0011/HR\u0014\u00105\u000e";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "&gOI\u001dU}KX\u0017\u0007k]\u001b\u001e\u001ccK\u001b\u0016\u001a{\u000eL\u001d\u0019c\u0003]\u0017\u0007bK_V";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ";`\u000eK\n\u0010lK_\u0011\u001bh\u000eX\u0019\u0019c\u000eO\u0017U,\\^\u0019\u0011GGH\f\u001a}GX\u0019\u0019KOO\u0019";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    LOG_TAG = ActivityChooserModel.class.getSimpleName();
                    sRegistryLock = new Object();
                    sDataModelRegistry = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002jG\\\u0010\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ResolveInfo getActivity(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            resolveInfo = ((ActivityResolveInfo) this.mActivities.get(i)).resolveInfo;
        }
        return resolveInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readHistoricalDataImpl() {
        /*
        r12 = this;
        r11 = 3;
        r6 = 2;
        r0 = 0;
        r10 = 1;
        r1 = android.support.v7.widget.LinearLayoutCompat.a;
        r2 = r12.mContext;	 Catch:{ FileNotFoundException -> 0x0106 }
        r3 = r12.mHistoryFileName;	 Catch:{ FileNotFoundException -> 0x0106 }
        r2 = r2.openFileInput(r3);	 Catch:{ FileNotFoundException -> 0x0106 }
        r3 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r4 = z;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r3.setInput(r2, r4);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
    L_0x001a:
        if (r0 == r10) goto L_0x0024;
    L_0x001c:
        if (r0 == r6) goto L_0x0024;
    L_0x001e:
        r0 = r3.next();	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        if (r1 == 0) goto L_0x001a;
    L_0x0024:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x003e }
        r4 = 2;
        r0 = r0[r4];	 Catch:{ FileNotFoundException -> 0x003e }
        r4 = r3.getName();	 Catch:{ FileNotFoundException -> 0x003e }
        r0 = r0.equals(r4);	 Catch:{ FileNotFoundException -> 0x003e }
        if (r0 != 0) goto L_0x0065;
    L_0x0033:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ FileNotFoundException -> 0x003e }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x003e }
        r3 = 3;
        r1 = r1[r3];	 Catch:{ FileNotFoundException -> 0x003e }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x003e }
        throw r0;	 Catch:{ FileNotFoundException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
    L_0x0040:
        r0 = move-exception;
        r1 = LOG_TAG;	 Catch:{ all -> 0x00f8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f8 }
        r3.<init>();	 Catch:{ all -> 0x00f8 }
        r4 = z;	 Catch:{ all -> 0x00f8 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ all -> 0x00f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00f8 }
        r4 = r12.mHistoryFileName;	 Catch:{ all -> 0x00f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00f8 }
        r3 = r3.toString();	 Catch:{ all -> 0x00f8 }
        android.util.Log.e(r1, r3, r0);	 Catch:{ all -> 0x00f8 }
        if (r2 == 0) goto L_0x0064;
    L_0x0061:
        r2.close();	 Catch:{ IOException -> 0x0101 }
    L_0x0064:
        return;
    L_0x0065:
        r0 = r12.mHistoricalRecords;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r0.clear();	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
    L_0x006a:
        r4 = r3.next();	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        if (r4 != r10) goto L_0x0072;
    L_0x0070:
        if (r1 == 0) goto L_0x00ec;
    L_0x0072:
        if (r4 == r11) goto L_0x006a;
    L_0x0074:
        r5 = 4;
        if (r4 != r5) goto L_0x0079;
    L_0x0077:
        if (r1 == 0) goto L_0x006a;
    L_0x0079:
        r4 = r3.getName();	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = z;	 Catch:{ FileNotFoundException -> 0x0094 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ FileNotFoundException -> 0x0094 }
        r4 = r5.equals(r4);	 Catch:{ FileNotFoundException -> 0x0094 }
        if (r4 != 0) goto L_0x00bc;
    L_0x0088:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ FileNotFoundException -> 0x0094 }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x0094 }
        r3 = 9;
        r1 = r1[r3];	 Catch:{ FileNotFoundException -> 0x0094 }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0094 }
        throw r0;	 Catch:{ FileNotFoundException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        r1 = LOG_TAG;	 Catch:{ all -> 0x00f8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f8 }
        r3.<init>();	 Catch:{ all -> 0x00f8 }
        r4 = z;	 Catch:{ all -> 0x00f8 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ all -> 0x00f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00f8 }
        r4 = r12.mHistoryFileName;	 Catch:{ all -> 0x00f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00f8 }
        r3 = r3.toString();	 Catch:{ all -> 0x00f8 }
        android.util.Log.e(r1, r3, r0);	 Catch:{ all -> 0x00f8 }
        if (r2 == 0) goto L_0x0064;
    L_0x00b6:
        r2.close();	 Catch:{ IOException -> 0x00ba }
        goto L_0x0064;
    L_0x00ba:
        r0 = move-exception;
        goto L_0x0064;
    L_0x00bc:
        r4 = 0;
        r5 = z;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r4 = r3.getAttributeValue(r4, r5);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = 0;
        r6 = z;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r7 = 0;
        r6 = r6[r7];	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = r3.getAttributeValue(r5, r6);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r6 = java.lang.Long.parseLong(r5);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = 0;
        r8 = z;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r9 = 1;
        r8 = r8[r9];	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = r3.getAttributeValue(r5, r8);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r8 = new android.support.v7.widget.ActivityChooserModel$HistoricalRecord;	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r8.<init>(r4, r6, r5);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        r0.add(r8);	 Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0096 }
        if (r1 == 0) goto L_0x006a;
    L_0x00ec:
        if (r2 == 0) goto L_0x0064;
    L_0x00ee:
        r2.close();	 Catch:{ IOException -> 0x00f3, XmlPullParserException -> 0x00f6 }
        goto L_0x0064;
    L_0x00f3:
        r0 = move-exception;
        goto L_0x0064;
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r0 = move-exception;
        if (r2 == 0) goto L_0x00fe;
    L_0x00fb:
        r2.close();	 Catch:{ IOException -> 0x0104, XmlPullParserException -> 0x00ff }
    L_0x00fe:
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = move-exception;
        goto L_0x0064;
    L_0x0104:
        r1 = move-exception;
        goto L_0x00fe;
    L_0x0106:
        r0 = move-exception;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel.readHistoricalDataImpl():void");
    }

    public Intent chooseActivity(int i) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == null) {
                return null;
            }
            ensureConsistentState();
            ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.mActivities.get(i);
            ComponentName componentName = new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
            Intent intent = new Intent(this.mIntent);
            intent.setComponent(componentName);
            if (this.mActivityChoserModelPolicy != null) {
                if (this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                    return null;
                }
            }
            addHisoricalRecord(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDefaultActivity(int r7) {
        /*
        r6 = this;
        r2 = r6.mInstanceLock;
        monitor-enter(r2);
        r6.ensureConsistentState();	 Catch:{ all -> 0x0046 }
        r0 = r6.mActivities;	 Catch:{ all -> 0x0046 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0046 }
        r0 = (android.support.v7.widget.ActivityChooserModel.ActivityResolveInfo) r0;	 Catch:{ all -> 0x0046 }
        r1 = r6.mActivities;	 Catch:{ all -> 0x0046 }
        r3 = 0;
        r1 = r1.get(r3);	 Catch:{ all -> 0x0046 }
        r1 = (android.support.v7.widget.ActivityChooserModel.ActivityResolveInfo) r1;	 Catch:{ all -> 0x0046 }
        if (r1 == 0) goto L_0x0025;
    L_0x0019:
        r1 = r1.weight;	 Catch:{ all -> 0x0046 }
        r3 = r0.weight;	 Catch:{ all -> 0x0046 }
        r1 = r1 - r3;
        r3 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
        r1 = r1 + r3;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ all -> 0x0046 }
        if (r3 == 0) goto L_0x0027;
    L_0x0025:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0027:
        r3 = new android.content.ComponentName;	 Catch:{ all -> 0x0046 }
        r4 = r0.resolveInfo;	 Catch:{ all -> 0x0046 }
        r4 = r4.activityInfo;	 Catch:{ all -> 0x0046 }
        r4 = r4.packageName;	 Catch:{ all -> 0x0046 }
        r0 = r0.resolveInfo;	 Catch:{ all -> 0x0046 }
        r0 = r0.activityInfo;	 Catch:{ all -> 0x0046 }
        r0 = r0.name;	 Catch:{ all -> 0x0046 }
        r3.<init>(r4, r0);	 Catch:{ all -> 0x0046 }
        r0 = new android.support.v7.widget.ActivityChooserModel$HistoricalRecord;	 Catch:{ all -> 0x0046 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0046 }
        r0.<init>(r3, r4, r1);	 Catch:{ all -> 0x0046 }
        r6.addHisoricalRecord(r0);	 Catch:{ all -> 0x0046 }
        monitor-exit(r2);	 Catch:{ all -> 0x0046 }
        return;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0046 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel.setDefaultActivity(int):void");
    }

    private boolean sortActivitiesIfNeeded() {
        try {
            if (this.mActivitySorter != null) {
                if (this.mIntent != null) {
                    try {
                        if (!this.mActivities.isEmpty()) {
                            try {
                                if (!this.mHistoricalRecords.isEmpty()) {
                                    this.mActivitySorter.sort(this.mIntent, this.mActivities, Collections.unmodifiableList(this.mHistoricalRecords));
                                    return true;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            }
            return false;
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    private void persistHistoricalDataIfNeeded() {
        try {
            if (this.mReadShareHistoryCalled) {
                try {
                    if (this.mHistoricalRecordsChanged) {
                        try {
                            this.mHistoricalRecordsChanged = false;
                            if (!TextUtils.isEmpty(this.mHistoryFileName)) {
                                AsyncTaskCompat.executeParallel(new PersistHistoryAsyncTask(this, null), new Object[]{new ArrayList(this.mHistoricalRecords), this.mHistoryFileName});
                                return;
                            }
                            return;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            throw new IllegalStateException(z[10]);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static boolean access$502(ActivityChooserModel activityChooserModel, boolean z) {
        activityChooserModel.mCanReadHistoricalData = z;
        return z;
    }

    private void ensureConsistentState() {
        int loadActivitiesIfNeeded = loadActivitiesIfNeeded() | readHistoricalDataIfNeeded();
        try {
            pruneExcessiveHistoricalRecordsIfNeeded();
            if (loadActivitiesIfNeeded != 0) {
                sortActivitiesIfNeeded();
                notifyChanged();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int getHistorySize() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    static Context access$200(ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mContext;
    }

    static String access$400(ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mHistoryFileName;
    }

    static String access$300() {
        return LOG_TAG;
    }

    private boolean addHisoricalRecord(HistoricalRecord historicalRecord) {
        boolean add = this.mHistoricalRecords.add(historicalRecord);
        if (add) {
            try {
                this.mHistoricalRecordsChanged = true;
                pruneExcessiveHistoricalRecordsIfNeeded();
                persistHistoricalDataIfNeeded();
                sortActivitiesIfNeeded();
                notifyChanged();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return add;
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
        boolean z = LinearLayoutCompat.a;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            List list = this.mActivities;
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (((ActivityResolveInfo) list.get(i)).resolveInfo != resolveInfo) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return i;
            }
            return -1;
        }
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        boolean z = LinearLayoutCompat.a;
        int size = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (size > 0) {
            this.mHistoricalRecordsChanged = true;
            int i = 0;
            while (i < size) {
                HistoricalRecord historicalRecord = (HistoricalRecord) this.mHistoricalRecords.remove(0);
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public int getActivityCount() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mActivities.size();
        }
        return size;
    }
}
