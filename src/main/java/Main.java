import java.util.HashMap;

public class Main {
    /***
     * 回文
     * @param x int
     * @return boolean
     */
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reverseStr = new StringBuilder(str).reverse().toString();
        try {
            return Integer.parseInt(str) == Integer.parseInt(reverseStr);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int tmp = map.get(array[i]);
            if (i < array.length - 1) {
                int next = map.get(array[i + 1]);
                if (next > tmp) {
                    tmp = next - tmp;
                    i++;
                }
            }
            result += tmp;
        }
        return result;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return ""; //空数组
        if (strs[0].length() == 0) return ""; //空字符串
        char[] array = strs[0].toCharArray();
        int index = 0;
        boolean common = false;
        for (int i = 0; i < strs.length && index < strs[i].length() && index < array.length; i++) { //index 要小于每个字符串的长度
            if (array[index] == strs[i].charAt(index)) {
                common = true;
            } else {
                break;
            }
            if (i == strs.length - 1 && common) {
                common = false;
                index++;
                i = 0;
            }
        }
        return strs[0].substring(0, index);
    }

    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].equals(""))
                sb.append(array[i] + " ");
        }
        return sb.toString().trim();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) return null;
        ListNode nodeN = head;
        for (int i = 0; i < n; i++) {
            nodeN = nodeN.next;
        }
        if (nodeN == null) return head = head.next;  //头节点问题
        ListNode temp = head;
        ListNode nodeNPre = head;
        while (nodeN != null) {
            nodeN = nodeN.next;
            nodeNPre = temp;
            temp = temp.next;
        }
        nodeNPre.next = nodeNPre.next.next;
        return head;
    }

    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode node =head;
        while(node!=null){
            if(node.val == val){
                pre.next =pre.next.next;
            }else{
                pre = node;
            }
            node=node.next;
        }
        return fakeHead.next;
    }
}
