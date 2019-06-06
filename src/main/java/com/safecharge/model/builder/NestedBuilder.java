package com.safecharge.model.builder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class NestedBuilder<T, V> {

    public T done() {
        Class<?> parentClass = parent.getClass();
        try {
            V build = this.build();
            String methodName = "add" + build.getClass().getSimpleName();
            Method method = parentClass.getDeclaredMethod(methodName, build.getClass());
            method.invoke(parent, build);
        } catch (NoSuchMethodException
                | IllegalAccessException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
        return parent;
    }

    public abstract V build();

    protected T parent;

    /**
     * @param <P>
     * @param parent
     * @return
     */
    public <P extends NestedBuilder<T, V>> P withParentBuilder(T parent) {
        this.parent = parent;
        return (P) this;
    }
}
