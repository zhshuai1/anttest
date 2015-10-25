package com.zebrait;

import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildListener;

public class TestListener implements BuildListener {

	@Override
	public void buildStarted(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
		print("##########################build started##########################");
	}

	@Override
	public void buildFinished(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
		print("##########################build finished##########################");
	}

	@Override
	public void targetStarted(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
		print("---------------------"+paramBuildEvent.getTarget().getName()+" started -------------------------");
	}

	@Override
	public void targetFinished(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
		print("---------------------"+paramBuildEvent.getTarget().getName()+" finished -------------------------");
	}

	@Override
	public void taskStarted(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
		print("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}

	@Override
	public void taskFinished(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void messageLogged(BuildEvent paramBuildEvent) {
		// TODO Auto-generated method stub
		print("abcdefghij67-=n");
		print("abcdefghij6789n");
	}
	
	private void print(Object object){
		System.out.println(object);
	}

}
