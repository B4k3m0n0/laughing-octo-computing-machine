package pt.ipleiria.tripPlanner.gui.Utils;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import pt.ipleiria.tripPlanner.gui.Models.Alojamento;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;

public class CenariosTableModel extends AbstractTableModel {

    public static final String columnNames[] = {
        "Designação", "Número de etapas com alojamento", "Ativo", "Preço"};
    private static final long serialVersionUID = 0xa8564b34b6035c6fL;
    private final List<CenarioAlojamento> data;

    public CenariosTableModel(List<CenarioAlojamento> data) {
        this.data = data;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CenarioAlojamento cenario = (CenarioAlojamento) data.get(rowIndex);
        if (cenario == null) {
            return null;
        }
        switch (columnIndex) {
            case 0:
                return cenario.getDesignacao();
            case 1:
                return cenario.getMapaReservas().size();
            default:
                int aux = 0;
                for (CenarioAlojamento cen : data) {
                    for (Map.Entry<Etapa, Alojamento> entry : cen.getMapaReservas().entrySet()) {
                        if (entry.getKey() != null) {
                            aux++;
                        }
                    }
                }
                return aux;
        }
    }

    public CenarioAlojamento getSelectedRow(int rowIndex) {
        return (CenarioAlojamento) data.get(rowIndex);
    }

    public List getSelectedRows(int rowsIndex[]) {
        List parts = new ArrayList();
        int arr$[] = rowsIndex;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; i$++) {
            int i = arr$[i$];
            parts.add(data.get(i));
        }

        data.removeAll(parts);
        return parts;
    }

    public void addAll(List lista) {
        data.addAll(lista);
    }

    public void removeAll(List lista) {
        data.removeAll(lista);
    }
    
    public void removeElement(CenarioAlojamento cenario){
        data.remove(cenario);
    }

    public List getData() {
        return data;
    }
}