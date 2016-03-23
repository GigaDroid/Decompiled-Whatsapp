package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.v4.content.IntentCompat;
import android.util.Log;
import org.v;
import org.whispersystems.at;

public class NavUtils {
    private static final NavUtilsImpl IMPL;

    interface NavUtilsImpl {
        Intent getParentActivityIntent(Activity activity);

        String getParentActivityName(Context context, ActivityInfo activityInfo);

        void navigateUpTo(Activity activity, Intent intent);

        boolean shouldUpRecreateTask(Activity activity, Intent intent);
    }

    class NavUtilsImplBase implements NavUtilsImpl {
        private static final String[] z;

        static {
            String[] strArr = new String[5];
            String str = "U,\u001bp:]&Qq D2\u0010p!\u001a\u0012>P\u0010z\u0016 C\u0016`\u000b)K\u0001m";
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
                            i3 = 52;
                            break;
                        case at.g /*1*/:
                            i3 = 66;
                            break;
                        case at.i /*2*/:
                            i3 = 127;
                            break;
                        case at.o /*3*/:
                            i3 = 2;
                            break;
                        default:
                            i3 = 85;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "z#\tW!].\f";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u0013b\u0016luY#\u0011k3Q1\u000b";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "U,\u001bp:]&Qk;@'\u0011v{U!\u000bk:Zl2C\u001cz";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "S'\u000bR4F'\u0011v\u0014W6\u0016t<@;6l!Q,\u000b8uV#\u001b\"%U0\u001al!u!\u000bk#]6\u0006L4Y'_%";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        NavUtilsImplBase() {
        }

        public String getParentActivityName(Context context, ActivityInfo activityInfo) {
            if (activityInfo.metaData == null) {
                return null;
            }
            String string = activityInfo.metaData.getString(z[0]);
            if (string == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }

        public void navigateUpTo(Activity activity, Intent intent) {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }

        public boolean shouldUpRecreateTask(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return (action == null || action.equals(z[4])) ? false : true;
        }

        public Intent getParentActivityIntent(Activity activity) {
            Intent intent = null;
            String parentActivityName = NavUtils.getParentActivityName(activity);
            if (parentActivityName != null) {
                ComponentName componentName = new ComponentName(activity, parentActivityName);
                try {
                    intent = NavUtils.getParentActivityName(activity, componentName) == null ? IntentCompat.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                } catch (NameNotFoundException e) {
                    throw e;
                } catch (NameNotFoundException e2) {
                    Log.e(z[2], z[1] + parentActivityName + z[3]);
                }
            }
            return intent;
        }
    }

    class NavUtilsImplJB extends NavUtilsImplBase {
        NavUtilsImplJB() {
        }

        public boolean shouldUpRecreateTask(Activity activity, Intent intent) {
            return NavUtilsJB.shouldUpRecreateTask(activity, intent);
        }

        public Intent getParentActivityIntent(Activity activity) {
            Intent parentActivityIntent = NavUtilsJB.getParentActivityIntent(activity);
            if (parentActivityIntent == null) {
                return superGetParentActivityIntent(activity);
            }
            return parentActivityIntent;
        }

        public void navigateUpTo(Activity activity, Intent intent) {
            NavUtilsJB.navigateUpTo(activity, intent);
        }

        Intent superGetParentActivityIntent(Activity activity) {
            return super.getParentActivityIntent(activity);
        }

        public String getParentActivityName(Context context, ActivityInfo activityInfo) {
            String parentActivityName = NavUtilsJB.getParentActivityName(activityInfo);
            if (parentActivityName == null) {
                return super.getParentActivityName(context, activityInfo);
            }
            return parentActivityName;
        }
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentName) {
        String parentActivityName = getParentActivityName(context, componentName);
        if (parentActivityName == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), parentActivityName);
        if (getParentActivityName(context, componentName2) != null) {
            return new Intent().setComponent(componentName2);
        }
        try {
            return IntentCompat.makeMainActivity(componentName2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean shouldUpRecreateTask(Activity activity, Intent intent) {
        return IMPL.shouldUpRecreateTask(activity, intent);
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            try {
                IMPL = new NavUtilsImplJB();
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        IMPL = new NavUtilsImplBase();
    }

    public static void navigateUpTo(Activity activity, Intent intent) {
        IMPL.navigateUpTo(activity, intent);
    }

    public static Intent getParentActivityIntent(Activity activity) {
        return IMPL.getParentActivityIntent(activity);
    }

    @Nullable
    public static String getParentActivityName(Activity activity) {
        try {
            return getParentActivityName(activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Nullable
    public static String getParentActivityName(Context context, ComponentName componentName) {
        return IMPL.getParentActivityName(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }
}
