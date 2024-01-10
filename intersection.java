import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class intersection {
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> answer = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums1) {
            answer.add(num);
        }

        for (int num : nums2) {
            if (answer.contains(num)) {
                result.add(num);
            }
        }
        int ans[] = new int[result.size()];

        java.util.Iterator<Integer> itr = result.iterator();
        int i = 0;
        while (itr.hasNext()) {
            int ele = itr.next();
            ans[i++] = ele; 

        }

      
        return ans;

    }
}
