package work3;
/**
 * Клас кнопки.
 * @author Kepeshchuk Solomiya
 */
public class Button extends GUIElement {
    private String name;
    /**
     * Створює кнопку з вказаною назвою і способом малювання.
     */
    public Button(String name, GUIRenderer renderer) {
        super(renderer);
        this.name = name;
    }

    public void draw() {
        renderer.drawButton(name);
    }
}
