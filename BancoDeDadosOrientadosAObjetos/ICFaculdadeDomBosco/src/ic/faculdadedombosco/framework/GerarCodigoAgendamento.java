/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.framework;

import ic.faculdadedombosco.model.Agendamento;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Anderson
 */
public class GerarCodigoAgendamento {

    public static List<Agendamento> lista = new ArrayList<Agendamento>();

    public static Agendamento consultarCodigo(int codigo) {
        int posicao = lista.indexOf(new Agendamento(codigo));
        return lista.get(posicao);
    }

    public static int codigoProximoInserido() {

        int posicaoUltimo = lista.size() - 1;
        if (posicaoUltimo == -1) {
            return 1;
        } else {
            int codigoUltimo = lista.get(posicaoUltimo).getCodigoGeraAgendamento();
            return codigoUltimo + 1;
        }
    }

    public static Agendamento primeiro() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(0);
    }

    public static Agendamento anterior(int codigo) {
        int posicao = lista.indexOf(new Agendamento(codigo));
        if (posicao == -1) {
            return lista.get(posicao);
        }
        return lista.get(posicao - 1);
    }

    public static Agendamento proximo(int codigo) {
        int posicao = lista.indexOf(new Agendamento(codigo));
        if (posicao < lista.size() - 1) {
            return lista.get(posicao + 1);
        } else {
            return lista.get(posicao);
        }
    }

    public static Agendamento ultimo() {
        if (lista.isEmpty()) {
            return null;
        } else {
            return lista.get(lista.size() - 1);
        }
    }

}
