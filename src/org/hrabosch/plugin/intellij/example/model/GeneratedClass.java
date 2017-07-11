package org.hrabosch.plugin.intellij.example.model;

/**
 * Helper class to keep given information
 * from user via {@link org.hrabosch.plugin.intellij.example.ui.ClassGeneratorForm}.
 *
 * @author hrabosch
 */
public class GeneratedClass {

  public static final GeneratedClass INSTANCE = new GeneratedClass();

  private String className;
  private boolean hasPsvm;

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public boolean isHasPsvm() {
    return hasPsvm;
  }

  public void setHasPsvm(boolean hasPsvm) {
    this.hasPsvm = hasPsvm;
  }
}
