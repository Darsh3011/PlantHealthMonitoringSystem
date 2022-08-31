package paneles;

import javax.swing.JPanel;

public class ComboPanel {
    private JPanel container;
    private JPanel content;

    public ComboPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

}
