/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

public interface vq
extends pi {
    public static final Predicate<pk> d = new Predicate<pk>(){

        public boolean a(pk pk2) {
            return pk2 instanceof vq;
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((pk)object);
        }
    };
    public static final Predicate<pk> e = new Predicate<pk>(){

        public boolean a(pk pk2) {
            return pk2 instanceof vq && !pk2.ax();
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((pk)object);
        }
    };
}
