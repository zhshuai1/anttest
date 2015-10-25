package com.zebrait;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.Jar.FilesetManifestConfig;
import org.apache.tools.ant.types.FileSet;

public class TestTask extends Task{
	
	private File path;
	
	private String value;
	
	private FileSet fileset;

	@Override
	public void init() throws BuildException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void execute() throws BuildException {
		// TODO Auto-generated method stub
		super.execute();
		System.out.println("This is test task, path is "+path.getAbsolutePath()+", and the value is "+value+", fileset is "+fileset.getDir().getAbsolutePath());
	}
	
	public void addFileset(FileSet fileset){
		this.fileset=fileset;
	}
	
	public void setPath(File path){
		this.path=path;
	}
	
	public void setValue(String value){
		this.value=value;
	}
	
}