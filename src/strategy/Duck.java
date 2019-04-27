package strategy;

/**
 * 鸭子超类
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午2:32
 */
public abstract class Duck {
    /**
     * 每只鸭子都会引用实现quackBehavior接口的对象
     */
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    /**
     * 每个鸭子的外观都不同,所以display的方法是抽象的
     */
    public abstract void display();

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * 鸭子对象不亲自处理呱呱叫的行为，而是委托给quackBehavior引用的对象
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
