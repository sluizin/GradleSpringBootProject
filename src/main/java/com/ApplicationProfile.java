/**
 * 
 */
package com;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
@PropertySource("classpath:config/application-{profile}.properties")
@ConfigurationProperties(prefix="dev")
public class ApplicationProfile {
	String project="";
	String path="";
	public final String getProject() {
		return project;
	}
	public final void setProject(String project) {
		this.project = project;
	}
	public final String getPath() {
		return path;
	}
	public final void setPath(String path) {
		this.path = path;
	}
}
