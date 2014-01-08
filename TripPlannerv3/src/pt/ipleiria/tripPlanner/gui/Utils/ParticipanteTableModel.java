package pt.ipleiria.tripPlanner.gui.Utils;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import pt.ipleiria.tripPlanner.gui.Models.Alojamento;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;

public class ParticipanteTableModel extends AbstractTableModel {

    public static final String columnNames[] = {
        "BI", "Nome", "Localidade", "Número de viagens"};
    private static final long serialVersionUID = 0xa8564b34b6035c6fL;
    private final List<Participante> data;

    public ParticipanteTableModel(List<Participante> data) {
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
        Participante participante = (Participante) data.get(rowIndex);
        if (participante == null) {
            return null;
        }
        switch (columnIndex) {
            case 0:
                return participante.getBI();
            case 1:
                return participante.getNome();
            case 2:
                return participante.getLocalidade();
            default:
                int aux = 0;
                for (Viagem viagem : DadosAplicacao.getInstance().getViagens()) {
                    for (Participante participante1 : viagem.getParticipantes()) {
                        if(participante1.getBI() == participante.getBI()){
                            aux++;
                        }
                    }
                }
                return aux;
        }
    }

    public Participante getSelectedRow(int rowIndex) {
        return (Participante) data.get(rowIndex);
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

    public List<Participante> getData() {
        return data;
    }
}