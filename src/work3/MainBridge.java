package work3;
/**
 * Головний клас. Демонстрація роботи шаблону "Міст" (Bridge).
 * @author Kepeshchuk Solomiya
 */
public class MainBridge {
    /**
     * Точка входу у програму.
     * Створює графічні елементи та відображає їх за допомогою різних рендерерів.
     */
   public static void main(String[] args) {
        GUIRenderer qt = new QtRenderer();
        GUIRenderer gtk = new GtkRenderer();

        GUIElement button1 = new Button("Підтвердити", qt);
        GUIElement button2 = new Button("Застосувати", gtk);
        GUIElement window = new Window("Головне вікно", qt);

        button1.draw();
        button2.draw();
        window.draw();
    }
}
