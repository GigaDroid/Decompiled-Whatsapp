package com.google.android.gms.common.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzk {
    private static final ExecutorService zzaay;

    static {
        zzaay = Executors.newFixedThreadPool(2);
    }

    public static ExecutorService zznF() {
        return zzaay;
    }
}
