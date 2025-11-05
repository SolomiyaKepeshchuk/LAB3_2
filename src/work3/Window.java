package work3;
/**
 * Клас вікна.
 * @author Kepeshchuk Solomiya
 */
public class Window extends GUIElement {
    private String title;
    /**
     * Створює вікно з вказаною назвою і способом малювання.
     */
    public Window(String title, GUIRenderer renderer) {
        super(renderer);
        this.title = title;
    }

    public void draw() {
        renderer.drawWindow(title);
    }
}
