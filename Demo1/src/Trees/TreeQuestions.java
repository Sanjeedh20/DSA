//package Trees;
//
//
//	//BFS(https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/):
//
//	class Solution {
//	    public List<List<Integer>> levelOrder(TreeNode root) {
//	        List<List<Integer>> result=new ArrayList<>();
//	        if(root==null){
//	            return result;
//	        }
//	        Queue<TreeNode>queue=new LinkedList<>();
//	        queue.offer(root);
//	        while(!queue.isEmpty()){
//	            int level=queue.size();
//	            List<Integer>currentlevel=new ArrayList<>();
//	            for(int i=0;i<level;i++){
//	                  TreeNode currentNode=queue.poll();
//	                  currentlevel.add(currentNode.val);
//	                  if(currentNode.left!=null){
//	                  queue.offer(currentNode.left);
//	                  }
//	                  if(currentNode.right!=null){
//	                  queue.offer(currentNode.right);
//	                  }    
//	            }
//	            result.add(currentlevel);
//	        }
//	        return result;
//	    }
//	}
//
//	//Average of levels in Binary Tree:(https://leetcode.com/problems/average-of-levels-in-binary-tree/description/)
//
//	class Solution {
//	    public List<Double> averageOfLevels(TreeNode root) {
//	       List<Double> result=new ArrayList<>();
//	       if(root==null){
//	           return result;
//	       } 
//	       Queue<TreeNode> queue=new LinkedList<>();
//	       queue.offer(root);
//	       while(!queue.isEmpty()){
//	           int level=queue.size();
//	           double average=0;
//	           for(int i=0;i<level;i++){
//	            TreeNode currentNode=queue.poll();
//	             average+=currentNode.val;
//	             if(currentNode.left!=null){
//	                 queue.offer(currentNode.left);
//	             }
//	             if(currentNode.right!=null){
//	                 queue.offer(currentNode.right);
//	             }
//	           }
//	           average=average/level;
//	           result.add(average);
//	       }
//	       return result;
//	    }
//	}
