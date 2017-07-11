package org.hrabosch.plugin.intellij.example.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import javax.swing.JComponent;
import org.hrabosch.plugin.intellij.example.model.GeneratedClass;
import org.jetbrains.annotations.Nullable;

/**
 * Wrapper class for our {@link ClassGeneratorForm}.
 *
 * @author hrabosch
 */
public class GenDialogWrapper extends DialogWrapper {

  private ClassGeneratorForm classGenForm;

  public GenDialogWrapper(@Nullable Project project) {
    super(project);
    classGenForm = new ClassGeneratorForm(GeneratedClass.INSTANCE);
    init();
    setTitle("Class generator");
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    return classGenForm.getContent();
  }

}
