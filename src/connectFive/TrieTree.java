package connectFive;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

//Author@Henk
//trie trees are what I want to use
//this isn't a trie tree
//but nodes with the same values are grouped together
//it's a hashMap in a hashmap
//the outer layer contains generic information
//the inner layer contains userID and object
//now that I think of it, we may be able to rid the Object
//we can put whatever we want associated to a user in the object

//TODO implement database: getHashMap & setHashMap & updateHashMap
public class TrieTree{
	int N = 1; //total keys
	HashMap<String, HashMap<String, Object>> keys;
	
	public TrieTree(int[] maxKey, int questions){
		for(int i = 0; i < questions; i++){
			N *= (maxKey[i]+1);
		}
		keys = new HashMap<String, HashMap<String, Object>>(N);
	}
	
	public void newNode(int[] key, Object newb){
		HashMap<String, Object> keySet;
		String UserID = getUserID();
		String keyPath = Arrays.toString(key);
		
		//if the set doesn't exist create it!
		if(!(keys.containsKey(keyPath))){
			keys.put(keyPath, new HashMap<String, Object>());
		}
		//now add the node
		keySet = keys.get(keyPath);
		keySet.put(UserID, newb);
	}
	
	public void changeNode(int[] key, Object newb){
		//finding the old one could require a search or have the old key
		//if we have the old location:
		removeNode(key);
		newNode(key, newb);
		
	}
	
	public void removeNode(int[] key){
		//remove only works with a userID
		HashMap<String, Object> keySet = null;
		String UserID = getUserID();
		String keyPath = Arrays.toString(key);
		
		if(keys.containsKey(keyPath)){
			keySet = keys.get(keyPath);
			keySet.remove(UserID);
		}
		
		if(keySet.isEmpty()){
			keys.remove(keyPath);
		}
	}
	
	public String[] getNeighboors(int[] key){
		//returns an array of userIDs
		//String[] must be large enough -> could be null pointer
		HashMap<String, Object> keySet = null;
		String keyPath = Arrays.toString(key);
		String[] UserIDS = null;
		
		if(keys.containsKey(keyPath)){
			keySet = keys.get(keyPath);
			Set<String> temp;
			temp = keySet.keySet();
			UserIDS = (String[]) temp.toArray();
		}
		return UserIDS;
	}
	
	private String getUserID() {
		// TODO Auto-generated method stub
		//need to make profile protected/private/public -> something
		//String temp = profile.name;
		return null;//temp;
	}
	
}

