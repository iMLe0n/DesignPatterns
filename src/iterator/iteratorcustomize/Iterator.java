package iterator.iteratorcustomize;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:04
 * 迭代器的接口，一旦有了这个接口，就可以为给种对象集合实现迭代器：数组、列表、散列表等等
 */
public interface Iterator {
    /**
     * 聚集中，是否还有元素
     */
    boolean hasNext();

    /**
     * 返回聚集中的下一个元素
     */
    Object next();
}
