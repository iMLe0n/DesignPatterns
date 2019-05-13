package templatemethod.sort;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-13 下午2:31
 */
public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }


    @Override
    public int compareTo(Duck object) {
        Duck otherDuck = object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }

    }

}
