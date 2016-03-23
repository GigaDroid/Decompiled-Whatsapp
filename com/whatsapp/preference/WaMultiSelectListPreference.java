package com.whatsapp.preference;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.whatsapp.WAAppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class WaMultiSelectListPreference extends WaListPreference {
    private static final String[] z;
    private String b;
    private String c;
    private boolean[] d;
    private String e;

    static {
        String[] strArr = new String[3];
        String str = ">a";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 65;
                        break;
                    case at.i /*2*/:
                        i3 = 121;
                        break;
                    case at.o /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 26;
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
                    str = "]\u0017DL'J2\u001cu{` \rjhJ|08L]";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "_4\u0015qsA$\u0015`yf\r\u0010vnB3\u001cc\u007f`$\u0017f\u007f23\u001cto{3\u001cv:s/Y`tf3\u0010`i2 \u000bw{ka\u0018k~2 \u0017%\u007f|5\u000b|Ls-\f`i2 \u000bw{ka\u000emsq)Ydhwa\u001bjnza\rm\u007f22\u0018h\u007f2-\u001ck}f)";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(CharSequence[] charSequenceArr) {
        onSetInitialValue(false, charSequenceArr);
    }

    protected static String a(Iterable iterable, String str) {
        int i = WaListPreference.a;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            try {
                if (it.hasNext()) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(it.next()));
                    while (it.hasNext()) {
                        stringBuilder.append(str).append(it.next());
                        if (i != 0) {
                            break;
                        }
                    }
                    return stringBuilder.toString();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return "";
    }

    private CharSequence a(List list) {
        int i = WaListPreference.a;
        try {
            if (list.isEmpty()) {
                if (!TextUtils.isEmpty(this.c)) {
                    return this.c;
                }
            }
            Iterable arrayList = new ArrayList();
            CharSequence[] entries = getEntries();
            CharSequence[] entryValues = getEntryValues();
            try {
                if (list.size() == entryValues.length) {
                    if (!TextUtils.isEmpty(this.b)) {
                        return this.b;
                    }
                }
                int length = entryValues.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    try {
                        if (list.contains(entryValues[i2])) {
                            arrayList.add((String) entries[i3]);
                        }
                        i3++;
                        int i4 = i2 + 1;
                        if (i != 0) {
                            break;
                        }
                        i2 = i4;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return a(arrayList, z[0]);
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    private void b(String str) {
        try {
            if (callChangeListener(a((CharSequence) str))) {
                setValue(str);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private CharSequence[] a(CharSequence charSequence) {
        if (charSequence != null) {
            try {
                if (!"".equals(charSequence)) {
                    return ((String) charSequence).split(this.e);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return new CharSequence[0];
    }

    protected void onDialogClosed(boolean z) {
        int i = WaListPreference.a;
        List arrayList = new ArrayList();
        CharSequence[] entryValues = getEntryValues();
        if (z && entryValues != null) {
            int i2 = 0;
            while (i2 < entryValues.length) {
                if (this.d[i2]) {
                    arrayList.add((String) entryValues[i2]);
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            String a = a(arrayList, this.e);
            setSummary(a(arrayList));
            b(a);
        }
    }

    static boolean[] a(WaMultiSelectListPreference waMultiSelectListPreference) {
        return waMultiSelectListPreference.d;
    }

    public WaMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new boolean[getEntries().length];
        this.e = z[2];
    }

    public void c(String str) {
        this.b = str;
    }

    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getTextArray(i);
    }

    public void a(String str) {
        this.c = str;
    }

    protected void onSetInitialValue(boolean z, Object obj) {
        CharSequence a;
        if (obj == null) {
            Object obj2 = new CharSequence[0];
            if (WaListPreference.a == 0) {
                obj = obj2;
                a = a(Arrays.asList(obj), this.e);
                if (z) {
                    a = getPersistedString(a);
                }
                setSummary(a(Arrays.asList(a(a))));
                b(a);
            }
        }
        obj = (CharSequence[]) obj;
        a = a(Arrays.asList(obj), this.e);
        if (z) {
            a = getPersistedString(a);
        }
        setSummary(a(Arrays.asList(a(a))));
        b(a);
    }

    protected void onPrepareDialogBuilder(Builder builder) {
        CharSequence[] entries = getEntries();
        CharSequence[] entryValues = getEntryValues();
        if (!(entries == null || entryValues == null)) {
            try {
                if (entries.length == entryValues.length) {
                    a();
                    builder.setMultiChoiceItems(entries, this.d, new a(this));
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        throw new IllegalStateException(z[1]);
    }

    public void b() {
        int i = WaListPreference.a;
        Object entryValues = getEntryValues();
        Object obj = new CharSequence[(entryValues.length - 1)];
        System.arraycopy(entryValues, 0, obj, 0, obj.length);
        setEntryValues(obj);
        entryValues = getEntries();
        obj = new CharSequence[(entryValues.length - 1)];
        System.arraycopy(entryValues, 0, obj, 0, obj.length);
        setEntries(obj);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    private void a() {
        int i = WaListPreference.a;
        CharSequence[] entryValues = getEntryValues();
        CharSequence[] a = a(getValue());
        if (a != null) {
            List asList = Arrays.asList(a);
            int i2 = 0;
            while (i2 < entryValues.length) {
                this.d[i2] = asList.contains(entryValues[i2]);
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    public WaMultiSelectListPreference(Context context) {
        this(context, null);
    }
}
