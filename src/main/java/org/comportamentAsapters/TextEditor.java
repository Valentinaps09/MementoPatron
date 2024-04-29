package org.comportamentAsapters;

class TextEditor {
    private TextWindow textWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    // Agrega texto al contenido actual
    public void addText(String text) {
        textWindow.addText(text);
    }

    // Guarda el estado actual
    public TextWindowState save() {
        return textWindow.save();
    }

    // Restaura el estado desde un Memento
    public void undo(TextWindowState memento) {
        textWindow.restore(memento);
    }
}