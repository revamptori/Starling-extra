/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.List
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

static final class lt.2
implements ParameterizedType {
    lt.2() {
    }

    public Type[] getActualTypeArguments() {
        return new Type[]{lt.a.class};
    }

    public Type getRawType() {
        return List.class;
    }

    public Type getOwnerType() {
        return null;
    }
}
