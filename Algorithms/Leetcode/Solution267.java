package Leetcode;

public class Solution267 {
    public List<Double> averageOfLevels(TreeNode root) {
        
        //평균값을 담을 List변수
        List<Double> avg = new ArrayList<>();
        
        if(root==null) return avg;
        
        
        //Queue를 생성하여 root 추가
        Queue<TreeNode> que  = new LinkedList<>();
        que.add(root);
        
        TreeNode curr;
        while(!que.isEmpty()){
            int size = que.size();
            double sum = 0;
            
            //각 레벨에 존재하는 노드의 개수만큼 for문을 타면서 노드를 poll()
            for(int i=0;i<size;i++){
                curr = que.poll();
                sum += curr.val;
                
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
            }
            
            //avg에 평균값 저장 
            avg.add(sum/size);
        }
        
        
        return avg;
    }
}
