package package1;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Solution1 {
    public int arrayPairSum1(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

    public int arrayPairSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int mixsum = 0;
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                mixsum += list.get(i);
        }
        return mixsum;
    }

    public List<Double> averageOfLevels1(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode tempNode = queue.poll();
            long sum = 0;
            // for ()
        }
        return result;
    }

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<TreeNode> parrents = new ArrayList<>();
        ArrayList<TreeNode> childs = new ArrayList<>();
        TreeNode temp = null;
        parrents.add(root);
        List<Double> list = new ArrayList();
        while (parrents.size() > 0) {
            long sum = 0;
            int count = 0;
            childs.clear();
            for (int i = 0; i < parrents.size(); i++) {
                temp = parrents.get(i);
                sum += temp.val;
                count++;
                if (temp.left != null)
                    childs.add(temp.left);
                if (temp.right != null)
                    childs.add(temp.right);
            }
            list.add(sum * 1.0 / count);
            parrents.clear();
            parrents = (ArrayList) childs.clone();
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        Queue list = new LinkedList();
        Stack stack = new Stack<>();
        list.add(1);
        list1.add(1);
        stack.push(1);
        list.offer(2);
        list1.add(2);
        stack.push(2);
        list.offer(3);
        list1.add(3);
        stack.push(3);
        System.out.println("--------------------Queue------------------------");
        System.out.println("peek:" + list.peek());
        System.out.println("poll:" + list.poll());
        System.out.println("--------------------Stack------------------------");
        System.out.println("peek:" + stack.peek());
        System.out.println("poll:" + stack.pop());
        System.out.println("--------------------List------------------------");
        System.out.println("peek:" + list1.peek());
        System.out.println("poll:" + list1.pop());
    }
}