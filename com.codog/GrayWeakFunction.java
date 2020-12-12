/**
 * @author : wangwenhan
 * @since : 2020/12/12
 */
public interface GrayWeakFunction<T, R> {

    default boolean isBusinessOpen() {
        return false;
    }

    R executeNew(T request);

    R executeOld(T request);
}
