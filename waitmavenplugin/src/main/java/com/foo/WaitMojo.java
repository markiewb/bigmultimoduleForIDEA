package com.foo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.IOException;

/**
 * Configures a wait.
 */
@Mojo(name = "wait")
public class WaitMojo extends AbstractMojo {

    /**
     * Wait time in ms.
     */
    @Parameter(required = true, defaultValue = "1")
    private Integer wait;

    @Parameter(required = true)
    private String path;

    public void execute() throws MojoExecutionException {
        getLog().info("Waiting for " + wait);
        try {
            Thread.sleep(wait*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            String fileName = path + "/Foo.java";
            getLog().info("Creating "+fileName);
            new File(path).mkdirs();
            new File(fileName).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}