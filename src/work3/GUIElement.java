package work3;
/**
 * Абстрактний клас елемента графічного інтерфейсу.
 * @author Kepeshchuk Solomiya
 */
public abstract class GUIElement {
    /** Об’єкт, який малює елемент. */
    protected GUIRenderer renderer;
    /**
     * Створює елемент з вибраним способом малювання.
     */
    public GUIElement(GUIRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
