package guava.ordering;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Thinkpad on 2017/4/20.
 */

public class OrderingTest {
    List<Integer> numbers;

    Comparator<String> byLength = new Comparator<String>() {
        public int compare(String left, String right) {
            return Integer.compare(left.length(), right.length());
        }
    };

    @Before
    public void setUp() {
        numbers = Lists.newArrayList(6, 4, 8, 6, 2, 3);
    }

    /**
     * Natural Order
     */
    @Test
    public void order_natural() {
        Collections.sort(numbers, Ordering.natural());
        System.out.println(numbers);
    }

    /**
     * Reverse elements
     */
    @Test
    public void reverse() {
        Collections.sort(numbers, Ordering.natural().reverse());
        System.out.println(numbers);
    }

    @Test
    public void min_max() {
        Integer min = Ordering.natural().min(numbers);
        Integer max = Ordering.natural().max(numbers);

        System.out.println(min);
        System.out.println(max);
    }

    /**
     * Create Ordering from Comparator
     */
    @Test
    public void from_exist_comparator() {
        List<String> random = Lists.newArrayList("welcome", "to", "leveluplunch");
        Comparator<String> by = Ordering.from(byLength).reverse();
        Collections.sort(random, by);
        System.out.println(random);
    }

    /**
     * Check if a collection is ordered
     */
    @Test
    public void is_ordered() {
        List<String> random = Lists.newArrayList("welcome", "to", "leveluplunch");
        Comparator<String> by = Ordering.from(byLength).reverse();
        Assert.assertTrue(Ordering.from(by).isOrdered(random));
    }

    /**
     * NullsFirst/NullsLast
     */
    @Test
    public void nuls_test() {
        List<String> random = Lists.newArrayList(null, "welcome", "to", "leveluplunch", null, null);
        System.out.println(Ordering.from(byLength).nullsLast().sortedCopy(random));
    }

    /**
     * leastOf/greatestOf
     */
    @Test
    public void least_of() {
        List<String> random = Lists.newArrayList(null, "welcome", "to", "leveluplunch", null, null);

        List<String> firstTwo = Ordering.from(byLength).nullsLast().leastOf(random, 1);

        System.out.println(firstTwo);
    }
}
