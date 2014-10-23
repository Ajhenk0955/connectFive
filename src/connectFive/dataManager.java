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

	public dataManager(int questions){
		tree = new KDTree(questions);
	}
	/*below does show an incomplete object
	//we should create a questionnaire object for 
	//keeping it simple
	//object could contain:
	//UserID, number of questions, questionResponses(on a scale)
	//maybe an array: length would be number of questions
	//value at array[i] would be the answer on a scale of (10?)
	*/
	public void addUserNode(object userAnswers){
		//find the nodeKey and place node in KD-Tree
		double[] key;
		generateKey(userAnswers, key);
		
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
