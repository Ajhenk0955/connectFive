package connectFive;

import java.awt.Point;

public class dataManager {
	//nearest neighbor search
	//closest point search
	//K-D tree
	//perfect! ill learn and create a k-d tree
	//might make array a list
	private Point[] locations;

	public dataManager(){
		getPoints();
	}
	public void calculatePoint(String name, int lowLimit, int highLimit, int value, boolean checker){
		//given data create the point
	}
	public void getPoints(){
		//for retrieving data stored on dataBase
	}
	public void addPoints(){
		//for adding a user or a functionality point
	}
	public void removePoints(){
		//removing user or a functionality point
	}
	public void findNearestPoints(Point user, int radius, Point[] results){
		//returns all the points within a selected radius
	}
	
}
