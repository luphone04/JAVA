package PrepareForExam.CodingBat.String;

class Arraycoding {


//    Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the
//    number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found
//    in the given array. (Efficiency is not a priority.)
//
//
//    maxSpan([1, 2, 1, 1, 3]) → 4
//    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    public int maxSpan(int[] nums) {
        int largestSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = nums.length - 1;

            while (right > left && nums[right] != nums[i]) {
                right--;
            }

            int span = right - left + 1;

            if (span > largestSpan) {
                largestSpan = span;
            }
        }

        return largestSpan;
    }



//    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
//    immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same
//    number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
//
//
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public int[] fix34(int[] nums) {
        int index4 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (int j = index4; j < nums.length; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        index4 = j + 1;
                        break;
                    }
                }
            }
        }
        return nums;
    }



//    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on
//    one side is equal to the sum of the numbers on the other side.
//
//
//    canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }






//    Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in
//    inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage
//    of the fact that both arrays are already in sorted order.
//
//
//    linearIn([1, 2, 4, 6], [2, 4]) → true
//    linearIn([1, 2, 4, 6], [2, 3, 4]) → false
//    linearIn([1, 2, 4, 4, 6], [2, 4]) → true

    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++;
            }
            i++;
        }

        return j == inner.length;
    }


//    Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,
//            3, 2, 1} (spaces added to show the 3 groups).
//
//
//    squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
//    squareUp(2) → [0, 1, 2, 1]
//    squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    public int[] squareUp(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    result[(i - 1) * n + (n - j)] = j;
                }
            }
        }

        return result;
    }


//    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show
//    the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly
//    n*(n + 1)/2.
//
//
//    seriesUp(3) → [1, 1, 2, 1, 2, 3]
//    seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
//    seriesUp(2) → [1, 1, 2]

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }

        return result;
    }

//    We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the
//    array, the same group appears in reverse order. For example, the largest mirror section in
//        {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror
//    section found in the given array.
//
//
//    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
//    maxMirror([1, 2, 1, 4]) → 3
//    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

    public int maxMirror(int[] nums) {
        int maxMirror = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int k = i;
                int l = j;

                while (k < nums.length && l >= 0 && nums[k] == nums[l]) {
                    count++;
                    k++;
                    l--;
                }

                if (count > maxMirror) {
                    maxMirror = count;
                }
            }
        }

        return maxMirror;
    }



//    Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number
//    of clumps in the given array.
//
//
//            countClumps([1, 2, 2, 3, 4, 4]) → 2
//    countClumps([1, 1, 2, 1, 1]) → 2
//    countClumps([1, 1, 1, 1, 1]) → 1

    public static int countClumps(int[] nums) {
        int count = 0;
        boolean inClump = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (!inClump) {
                    inClump = true;
                    count++;
                }
            } else {
                inClump = false;
            }
        }

        return count;
    }




}
