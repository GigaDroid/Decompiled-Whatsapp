package org.whispersystems;

import java.util.List;

public class bH extends Exception {
    public bH(String str, Throwable th) {
        super(str, th);
    }

    public bH(String str) {
        super(str);
    }

    public bH(Throwable th) {
        super(th);
    }

    public bH(String str, List list) {
        super(str, (Throwable) list.get(0));
    }
}
