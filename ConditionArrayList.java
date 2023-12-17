import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * A custom ArrayList implementation that only allows odd integers to be added.
 */
public class ConditionArrayList extends ArrayList<Integer> {

    private Predicate<Integer> condition;

    public ConditionArrayList(Predicate<Integer> predicate, Integer... nums) {
        super(
            Arrays.stream(nums)
            .filter(predicate)
            .collect(Collectors.toList())
        );

        this.condition = predicate;
        
    }

    /**
     * Checks if the given element is odd.
     *
     * @param element the element to check
     * @return true if the element is odd, false otherwise
     */
    public boolean isEligible(Integer element) {
        return condition.test(element);
    }
    
    /**
     * Inserts the specified element at the specified position in this list,
     * only if the element is odd.
     *
     * @param index the index at which to insert the element
     * @param element the element to be inserted
     */
    @Override
    public void add(int index, Integer element) {
        if (isEligible(element)) {
            super.add(index, element);
        }
    }

    /**
     * Appends the specified element to the end of this list,
     * only if the element is odd.
     *
     * @param element the element to be appended
     * @return true if the element was added, false otherwise
     */
    @Override
    public boolean add(Integer element) {
        if (isEligible(element)) {
            return super.add(element);
        }
        return false;
    }   

    /**
     * Appends all of the elements in the specified collection to the end of this list,
     * only if the elements are odd.
     *
     * @param c the collection containing elements to be added to this list
     * @return true if this list changed as a result of the call, false otherwise
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(
            c.stream().filter(this::isEligible)
            .collect(Collectors.toList()));
    }

    /**
     * Replaces the element at the specified position in this list with the specified element,
     * if the element is odd. Otherwise, prints an error message and returns Integer.MIN_VALUE.
     *
     * @param index the index of the element to replace
     * @param element the element to be stored at the specified position
     * @return the element previously at the specified position, or Integer.MIN_VALUE if the element is not odd
     */
    @Override
    public Integer set(int index, Integer element) {
        if (isEligible(element)) {
            return super.set(index, element);
        } else {
            System.out.println("OddArrayList: " + element + " is not odd.");
            return Integer.MIN_VALUE;
        }
    }

    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        super.replaceAll(operator);
        super.removeIf(n -> !isEligible(n));
    }

}
