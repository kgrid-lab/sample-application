package org.kgrid.sandboxapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.kgrid.sandboxapplication", "org.kgrid.sandboxdependency"})
public class SandboxApplication {

  public static void main(String[] args) {
    SpringApplication.run(SandboxApplication.class, args);
  }
}
