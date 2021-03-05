package Leetcode;

public class Solution267 {
    public List<Double> averageOfLevels(TreeNode root) {
        
        //��հ��� ���� List����
        List<Double> avg = new ArrayList<>();
        
        if(root==null) return avg;
        
        
        //Queue�� �����Ͽ� root �߰�
        Queue<TreeNode> que  = new LinkedList<>();
        que.add(root);
        
        TreeNode curr;
        while(!que.isEmpty()){
            int size = que.size();
            double sum = 0;
            
            //�� ������ �����ϴ� ����� ������ŭ for���� Ÿ�鼭 ��带 poll()
            for(int i=0;i<size;i++){
                curr = que.poll();
                sum += curr.val;
                
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
            }
            
            //avg�� ��հ� ���� 
            avg.add(sum/size);
        }
        
        
        return avg;
    }
}
