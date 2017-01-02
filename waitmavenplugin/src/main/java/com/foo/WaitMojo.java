package com.foo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Says "Hi" to the user.
 */
@Mojo(name = "sayhi")
public class WaitMojo extends AbstractMojo {

    /**
     * Wait time in ms.
     */
    @Parameter(required = true, defaultValue = "1")
    private Integer wait;

    public void execute() throws MojoExecutionException {
        getLog().info("Waiting for " + wait);
    }
}