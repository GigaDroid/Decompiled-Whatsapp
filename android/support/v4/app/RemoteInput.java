package android.support.v4.app;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory;
import android.util.Log;
import org.v;
import org.whispersystems.at;

public class RemoteInput extends android.support.v4.app.RemoteInputCompatBase.RemoteInput {
    public static final Factory FACTORY;
    private static final Impl IMPL;
    private final boolean mAllowFreeFormInput;
    private final CharSequence[] mChoices;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    final class 1 implements Factory {
        1() {
        }
    }

    public final class Builder {
        private static final String z;
        private boolean mAllowFreeFormInput;
        private CharSequence[] mChoices;
        private Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;

        static {
            char[] toCharArray = "Po[\n\\v*C\u001aI\"iI\u0011\u0017v*J\u001a\u0010l\u007fD\u0013".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 2;
                        break;
                    case at.g /*1*/:
                        i2 = 10;
                        break;
                    case at.i /*2*/:
                        i2 = 40;
                        break;
                    case at.o /*3*/:
                        i2 = 127;
                        break;
                    default:
                        i2 = 48;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Builder setLabel(CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }

        public Builder setChoices(CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        public RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormInput, this.mExtras);
        }

        public Builder(String str) {
            this.mAllowFreeFormInput = true;
            this.mExtras = new Bundle();
            if (str == null) {
                throw new IllegalArgumentException(z);
            }
            this.mResultKey = str;
        }
    }

    interface Impl {
        Bundle getResultsFromIntent(Intent intent);
    }

    class ImplApi20 implements Impl {
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }

        ImplApi20() {
        }
    }

    class ImplBase implements Impl {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "vP\u0014\u001a\u0010A|\u0017\u0005\u0011P\u0015\u0010\u0006DK[\u0015\fDW@\t\u0005\u000bVA\u001c\u0011DBG\u0016\u0018Dee0U(AC\u001c\u0019D\u0015\u0003";
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
                            i3 = 36;
                            break;
                        case at.g /*1*/:
                            i3 = 53;
                            break;
                        case at.i /*2*/:
                            i3 = 121;
                            break;
                        case at.o /*3*/:
                            i3 = 117;
                            break;
                        default:
                            i3 = 100;
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
                        str = "vP\u0014\u001a\u0010A|\u0017\u0005\u0011P";
                        obj = null;
                }
            }
        }

        public Bundle getResultsFromIntent(Intent intent) {
            Log.w(z[1], z[0]);
            return null;
        }

        ImplBase() {
        }
    }

    class ImplJellybean implements Impl {
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }

        ImplJellybean() {
        }
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return IMPL.getResultsFromIntent(intent);
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            IMPL = new ImplApi20();
        } else if (VERSION.SDK_INT >= 16) {
            IMPL = new ImplJellybean();
        } else {
            IMPL = new ImplBase();
        }
        FACTORY = new 1();
    }

    public CharSequence[] getChoices() {
        return this.mChoices;
    }

    public boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormInput;
    }

    RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormInput = z;
        this.mExtras = bundle;
    }

    public String getResultKey() {
        return this.mResultKey;
    }

    public CharSequence getLabel() {
        return this.mLabel;
    }
}
