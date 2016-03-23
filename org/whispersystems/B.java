package org.whispersystems;

import com.google.fN;
import com.google.hx;
import java.security.MessageDigest;

public class B {
    private final J a;

    public B(int i, String str, bp bpVar, String str2, bp bpVar2) {
        this.a = J.n().a(i).a(K.d().b(hx.a(str.getBytes())).a(hx.a(bpVar.b()))).b(K.d().b(hx.a(str2.getBytes())).a(hx.a(bpVar2.b()))).c();
    }

    public byte[] a() {
        return this.a.b();
    }

    public boolean a(byte[] bArr) {
        try {
            J a = J.a(bArr);
            try {
                if (a.g() && a.c()) {
                    if (a.m()) {
                        try {
                            if (a.j() == this.a.j()) {
                                if (this.a.h().j().equals(a.f().j()) && this.a.f().j().equals(a.h().j())) {
                                    try {
                                        return MessageDigest.isEqual(this.a.h().b(), a.f().b()) && MessageDigest.isEqual(this.a.f().b(), a.h().b());
                                    } catch (fN e) {
                                        throw e;
                                    } catch (fN e2) {
                                        throw e2;
                                    }
                                } else {
                                    throw new ax(new String(this.a.h().j().h()), new String(this.a.f().j().h()), new String(a.h().j().h()), new String(a.f().j().h()));
                                }
                            }
                        } catch (fN e22) {
                            throw e22;
                        }
                    }
                }
                throw new aP();
            } catch (fN e222) {
                throw e222;
            } catch (fN e2222) {
                throw e2222;
            }
        } catch (fN e22222) {
            throw e22222;
        } catch (fN e222222) {
            throw e222222;
        } catch (fN e2222222) {
            throw e2222222;
        } catch (Exception e3) {
            throw new a7(e3);
        }
    }
}
