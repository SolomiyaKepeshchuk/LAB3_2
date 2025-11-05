package work3;
/**
 * Малює елементи у стилі Qt.
 * @author Kepeshchuk Solomiya
 */
public class QtRenderer implements GUIRenderer {
    public void drawButton(String name) {
        System.out.println("Кнопка '" + name + "' (Qt)");
    }

    public void drawWindow(String title) {
        System.out.println("Вікно '" + title + "' (Qt)");
    }
}
