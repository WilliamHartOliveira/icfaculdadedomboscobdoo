package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Agendamento;
import javax.swing.JOptionPane;

public class AgendamentoDao {

    private Conexao oConexao;

    public Agendamento incluir(Agendamento agendamento)
    {
        oConexao = new Conexao();

        try{
            oConexao.getDb().store(agendamento);
            oConexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto.\n"+ex, "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
        return agendamento;
    }

    public Agendamento atualizar(Agendamento agendamento)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Agendamento.class);
        query.descend("oGradeDisciplina").constrain(agendamento.getDisciplina());

        Agendamento agend = (Agendamento) query.execute().get(0);

        agend.setDisciplina(agendamento.getDisciplina());
        agend.setUsuario(agendamento.getUsuario());
        agend.setRecurso(agendamento.getRecurso());
        agend.setDataInicial(agendamento.getDataInicial());
        agend.setDataFinal(agendamento.getDataFinal());
        agend.setHoraInicial(agendamento.getHoraInicial());
        agend.setHoraFinal(agendamento.getHoraFinal());
        agend.setObservacao(agendamento.getObservacao());
        //agend.setEquipamento(agendamento.getListaEquipamento());

        oConexao.getDb().store(agend);
        oConexao.getDb().commit();

        return agendamento;
    }

    public Agendamento excluir(Agendamento agendamento)
    {
        oConexao = new Conexao();

        ObjectSet<Agendamento> lista = oConexao.getDb().get(agendamento);
        Agendamento agend = lista.next();
        oConexao.getDb().delete(agend);
        oConexao.getDb().commit();

        return agendamento;
    }

    public Agendamento buscar(String dataInicial, String dataFinal)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Agendamento.class);

        //query.descend("dataInicial_Agendamento").constrain(dataInicial);
        //query.descend("dataFinal_Agendamento").constrain(dataFinal);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Agendamento) lista.get(0);
        }else{
            return null;
        }
    }

    public ObjectSet<Agendamento> montarTabelaEquip()
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Agendamento.class);
        query.descend("dDataInicial").orderAscending();
        ObjectSet<Agendamento> lista = query.execute();

        return lista;
    }
}
