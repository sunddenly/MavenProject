package com.hebut.mavn.plugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * goal   指定插件执行的目标任务名称
 * phase  指定插件执行的生命周期阶段
 * @goal show
 * @phase test
 */
public class StatusFileMojo extends AbstractMojo {
	
	/**
     * 文件夹路径变量
     * parameter   表示该插件的该属性可以通过configuration配置
     * expression  表示默认值为表达式变量
     * @parameter expression="${project.build.directory}"
     * @required
     */
	private File dir;

    /**
     * 显示的文件类型：目录/文件
     * alias 用来设置属性的别名
     * @parameter alias=d
     */
    private boolean isDir;
    /**
     * 可显示的文件后缀名
     * @parameter
     */
	private String[] files;



    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(isDir);
        File [] fs = dir.listFiles();
		for(File f:fs) {
			if(f.isDirectory()) {
				if(isDir) {
					System.out.println(f.getName()+"--d");
				} else {
					continue;
				}
			} else {
				if(files!=null&&files.length>0) {
					for(String fn:files) {
						if(f.getName().endsWith("."+fn)) {
							System.out.println(f.getName()+"--"+(f.length()/1024)+"k");
						}
					}
				} else {
					System.out.println(f.getName()+"--"+(f.length()/1024)+"k");
				}
			}
		}
	}
}
