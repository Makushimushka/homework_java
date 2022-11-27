public class homeWork1 {
    //88. Merge Sorted Array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }

    //1920. Build Array from Permutation
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //27. Remove Element
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
            }
        }
        return copyInd;
    }

    //151. Reverse Words in a String
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;

            if (sb.length() != 0) sb.append(' ');
            StringBuilder word = new StringBuilder();

            while (i >= 0 && s.charAt(i) != ' ') word.append(s.charAt(i--));
            sb.append(word.reverse());
        }

        return sb.toString();
    }

    //125. Valid Palindrome
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                if (left == right) return true;
            }
            while (!Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
