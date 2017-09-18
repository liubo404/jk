package ocp.ch4;

/**
 * User: liubo
 * Datetime: 2017/9/1820:09
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t , U u, V v);
}
