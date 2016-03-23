package org.spongycastle.jcajce.provider.config;

public interface ConfigurableProvider {
    void addAlgorithm(String str, String str2);

    boolean hasAlgorithm(String str, String str2);
}
