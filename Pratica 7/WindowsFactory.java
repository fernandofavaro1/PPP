class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    public Scrollbar createScrollbar() {
        return new WindowsScrollbar();
    }
}