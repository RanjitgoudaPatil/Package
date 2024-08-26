package com.xworkz.taskrunner;

import com.xworkz.task.River;

public class RiverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		River river=new River();
		river.store("Ganga");
		river.store("Yamuna");
		river.store("Narmada");
		river.store("Krishna");
		river.store("Mahanadi");
		river.store("Indus");
		river.store("Godvari");
		river.display();


	}

}
