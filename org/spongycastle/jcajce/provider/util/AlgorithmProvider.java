package org.spongycastle.jcajce.provider.util;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

public abstract class AlgorithmProvider {
    public static int a;

    public abstract void configure(ConfigurableProvider configurableProvider);
}
