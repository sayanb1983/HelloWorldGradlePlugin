package org.sayan.home;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloWorldPlugin implements Plugin<Project>{

	@Override
	public void apply(Project project) {
		project.task("helloWorld");
	}

}
