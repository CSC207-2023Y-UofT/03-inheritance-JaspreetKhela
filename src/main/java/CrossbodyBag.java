/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag{

    private int numberOfStraps;

    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumberOfStraps() {
        return this.numberOfStraps;
    }

    /**
     * Return the details of this Bag.
     *
     * @return
     */
    @Override
    public String toString() {
        return super.getColor() + " Crossbody Bag with " + this.numberOfStraps + " straps (" + super.getNumberOfContents() + " / " +
                super.getCapacity() + ")";
    }

    /**
     * Increase the capacity of this bag by 2.
     */
    @Override
    public void enhance() {
        /* TODO: Implement this method.
         *       You may want to use the increaseCapacity() method that was
         *       implemented in Bag.
         *
         * To call a method defined in a parent, you use super.method_name(...)
         */
        super.increaseCapacity(2);
    }
}