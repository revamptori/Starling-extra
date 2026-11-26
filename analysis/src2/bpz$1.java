/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.Map
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

static final class bpz.1
implements ParameterizedType {
    bpz.1() {
    }

    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, bph.class};
    }

    public Type getRawType() {
        return Map.class;
    }

    public Type getOwnerType() {
        return null;
    }
}
