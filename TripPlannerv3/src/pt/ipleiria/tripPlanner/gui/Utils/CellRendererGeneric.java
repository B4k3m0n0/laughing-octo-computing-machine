/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Representa um Cell Renderer gene'rico que pode ser usado para criar Cell
 * Renderers que apenas exibem texto
 *
 * @author norberto
 */
public abstract class CellRendererGeneric extends JLabel implements ListCellRenderer {

    public CellRendererGeneric() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    /**
     * Este me'todo e' invocado sempre que for necessario desenhar uma linha da
     * lista
     *
     * @param list a JList propriamente dita
     * @param value o valor que vai ser desenhado na JList
     * @param index o indice (n. ordem) do valor a desenhar
     * @param isSelected true se o elemento a desenhar estiver selecionado
     * @param cellHasFocus se a linha esta' com o foco ativo
     * @return o componente a colocar na linha a desenhar (neste caso em
     * concreto corresponde 'a propria classe CellRenererGeneric, que e' um
     * JLabel).
     */
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        // se o elemento a desenhar na lista estiver selecionado
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        if (index >= 0) {
            setText(getTextToDisplay(value) + " " + index);
        }
        return this;
    }

    /**
     * Me'todo que deve ser redefinido nas sub-classes e que devolve o texto
     * exato a exibir em cada linha da JList a que o cell renderer estiver
     * associado
     *
     * @param value dados do valor a exibir
     * @return texto com o texto a exibir na linha
     */
    protected abstract String getTextToDisplay(Object value);
}
