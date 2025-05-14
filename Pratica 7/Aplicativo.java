class Aplicativo {
    private Button button;
    private Checkbox checkbox;
    private Scrollbar scrollbar;

    public Aplicativo(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        scrollbar = factory.createScrollbar();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
        scrollbar.paint();
    }
}