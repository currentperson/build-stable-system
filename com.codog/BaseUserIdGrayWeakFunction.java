import javax.naming.event.EventContext;

/**
 * @author : wangwenhan
 * @since : 2020/12/12
 */
public abstract class BaseUserIdGrayWeakFunction<T, R> implements GrayWeakFunction<T, R> {
    @Override
    public boolean isBusinessOpen() {
        return Constant.REQUEST_USER_ID.get() < queryFromConfigCenter();
    }

    protected abstract Integer queryFromConfigCenter();
}
