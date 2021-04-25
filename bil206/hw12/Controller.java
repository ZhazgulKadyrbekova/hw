import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final Model model;

    public Controller(MainView view) {
        this.model = new Model(view);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();
        model.doAction(command);
    }
}
