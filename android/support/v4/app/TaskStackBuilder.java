package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public class TaskStackBuilder implements Iterable {
    private static final TaskStackBuilderImpl IMPL;
    private static final String[] z;
    private final ArrayList mIntents;
    private final Context mSourceContext;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    interface TaskStackBuilderImpl {
    }

    class TaskStackBuilderImplBase implements TaskStackBuilderImpl {
        TaskStackBuilderImplBase() {
        }
    }

    class TaskStackBuilderImplHoneycomb implements TaskStackBuilderImpl {
        TaskStackBuilderImplHoneycomb() {
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "BH-5\u0012bH=5\u0003c@2:$d";
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
                        i3 = 22;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 94;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 65;
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
                    str = "XF~7/bL0*26H::$r\t*1aBH-5\u0012bH=5\u0003c@2:$d\u0012~= xG1*ae]?,5WJ*77\u007f]7;2";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (VERSION.SDK_INT >= 11) {
                            IMPL = new TaskStackBuilderImplHoneycomb();
                            return;
                        } else {
                            IMPL = new TaskStackBuilderImplBase();
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "TH:~\u0002yD.1/sG*\u0010 {L~))\u007fE;~5dH(;3e@09awJ*77\u007f]'~1w[;056D;* rH*?";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Iterator iterator() {
        return this.mIntents.iterator();
    }

    public TaskStackBuilder addParentStack(ComponentName componentName) {
        boolean z = Fragment.a;
        int size = this.mIntents.size();
        try {
            Intent parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, componentName);
            while (parentActivityIntent != null) {
                this.mIntents.add(size, parentActivityIntent);
                parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, parentActivityIntent.getComponent());
                if (z) {
                    break;
                }
            }
            return this;
        } catch (Throwable e) {
            Log.e(z[0], z[1]);
            throw new IllegalArgumentException(e);
        }
    }

    public TaskStackBuilder addParentStack(Activity activity) {
        Intent parentActivityIntent;
        Intent intent = null;
        if (activity instanceof SupportParentable) {
            intent = ((SupportParentable) activity).getSupportParentActivityIntent();
        }
        if (intent == null) {
            parentActivityIntent = NavUtils.getParentActivityIntent(activity);
        } else {
            parentActivityIntent = intent;
        }
        if (parentActivityIntent != null) {
            ComponentName component = parentActivityIntent.getComponent();
            if (component == null) {
                component = parentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(parentActivityIntent);
        }
        return this;
    }

    private TaskStackBuilder(Context context) {
        this.mIntents = new ArrayList();
        this.mSourceContext = context;
    }

    public TaskStackBuilder addNextIntent(Intent intent) {
        this.mIntents.add(intent);
        return this;
    }

    public static TaskStackBuilder create(Context context) {
        return new TaskStackBuilder(context);
    }

    public void startActivities() {
        startActivities(null);
    }

    public void startActivities(Bundle bundle) {
        try {
            if (this.mIntents.isEmpty()) {
                throw new IllegalStateException(z[2]);
            }
            Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[this.mIntents.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!ContextCompat.startActivities(this.mSourceContext, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.mSourceContext.startActivity(intent);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
