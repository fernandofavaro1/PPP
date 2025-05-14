class LinuxFactory implements GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
    public Scrollbar createScrollbar() {
        return new LinuxScrollbar();
    }
}
