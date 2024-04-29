package org.comportamentAsapters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextWindow textWindow = new TextWindow();
        TextEditor textEditor = new TextEditor(textWindow);

        // Agregar texto
        textEditor.addText("buenas este mensaje se guardo!");

        // Guardar el estado actual
        TextWindowState savedState = textEditor.save();

        // Agregar más texto
        textEditor.addText(" ¡Este es un ejemplo de Memento!");

        // Deshacer: restaurar al estado guardado
        textEditor.undo(savedState);

        // Obtener el texto actual
        System.out.println("Texto actual: " + textWindow.getCurrentText());
    }
}