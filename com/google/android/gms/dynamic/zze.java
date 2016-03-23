package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.zzd.zza;
import java.lang.reflect.Field;

public final class zze extends zza {
    private final Object mWrappedObject;

    private zze(Object obj) {
        this.mWrappedObject = obj;
    }

    public static Object zzp(zzd com_google_android_gms_dynamic_zzd) {
        try {
            if (com_google_android_gms_dynamic_zzd instanceof zze) {
                return ((zze) com_google_android_gms_dynamic_zzd).mWrappedObject;
            }
            IBinder asBinder = com_google_android_gms_dynamic_zzd.asBinder();
            Field[] declaredFields = asBinder.getClass().getDeclaredFields();
            if (declaredFields.length == 1) {
                Field field = declaredFields[0];
                if (field.isAccessible()) {
                    throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
                }
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (Throwable e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (Throwable e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (Throwable e22) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } catch (NullPointerException e3) {
            throw e3;
        }
    }

    public static zzd zzx(Object obj) {
        return new zze(obj);
    }
}
