/**
 * @author : wangwenhan
 * @since : 2020/12/12
 */
public class GrayWeakTemplate {
    private GrayWeakTemplate() {
    }

    public static <T, R> R doWeakFunction(
        GrayWeakFunction<T, R> weakFunction, T request, String tip) {
        try {
            return weakFunction.isBusinessOpen() ? weakFunction.executeNew(request) :
                weakFunction.executeOld(request);
        } catch (Exception e) {
            System.out.println(tip + e.getMessage());
            return null;
        }
    }
}
