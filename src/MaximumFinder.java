public class MaximumFinder {
    /**
     * This method finds and returns the maximum value of an integer array
     * @param array Input array
     * @return Maximum value
     */
    public int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }
}
