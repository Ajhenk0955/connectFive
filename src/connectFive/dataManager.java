package connectFive;

import java.awt.Point;

import net.sf.javaml.core.kdtree.KDTree;

public class dataManager {
	//nearest neighbor search
	//closest point search
	//K-D tree
	//perfect! ill learn and create a k-d tree
	//kdTree involves created nodes
	
	//might make array a list
	private KDTree tree;

	public dataManager(int[] maxKey, int[] key){
		tree = new KDTree(questions);
	}
	/*below does show an incomplete object
	//we should create a questionnaire object for 
	//keeping it simple
	//object could contain:
	//UserID, number of questions, questionResponses(on a scale)
	//maybe an array: length would be number of questions
	//value at array[i] would be the answer on a scale of (10?)
	 * 
	 * in case the import kdtree isn't helpful
	 * user imputs will be leafs (leafs don't have children)
	 * questions will be branches
	*/
	public void addUserLeaf(int[] maxKey, int[] key){
		//place Leaf
		
		tree.insert(key, userAnswers);
	}
	public void generateKey(object userAnswers, double[] key){
		//find key somehow
	}
	public void deleteNode(object userAnswers){
		//removes data point and rebuilds structure
		double[] key;
		generateKey(userAnswers, key);
		tree.delete(key);
		rebuild();
	}
	public void rebuild(){
		//rebuilds the structure?!
	}
	public object[] getNearest(object userAnswers){
		double[] key;
		generateKey(userAnswers, key);
		
		//set to 4 closest nodes
		return tree.nearest(key, 4);
	}
}
