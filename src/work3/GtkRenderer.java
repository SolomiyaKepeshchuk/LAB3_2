package work3;
/**
 * Малює елементи у стилі GTK.
 * @author Kepeshchuk Solomiya
 */
public class GtkRenderer implements GUIRenderer {
    public void drawButton(String name) {
        System.out.println("Кнопка '" + name + "' (GTK)");
    }

    public void drawWindow(String title) {
        System.out.println("Вікно '" + title + "' (GTK)");
    }
}
