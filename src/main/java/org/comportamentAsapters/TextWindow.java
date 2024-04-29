package org.comportamentAsapters;

class TextWindow {
    private StringBuilder currentText = new StringBuilder();

    // Agrega texto al contenido actual
    public void addText(String text) {
        currentText.append(text);
    }

    // Obtiene el texto actual
    public String getCurrentText() {
        return currentText.toString();
    }

    // Método para crear un Memento con el estado actual
    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    // Método para restaurar el estado desde un Memento
    public void restore(TextWindowState memento) {
        currentText = new StringBuilder(memento.getState());
    }
}