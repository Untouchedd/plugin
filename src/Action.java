import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class Action extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        BrowserUtil.browse("https://stackoverflow.com/questions/ask");
    }

    @Override
    public void update(@NotNull AnActionEvent event) {

    }

}
