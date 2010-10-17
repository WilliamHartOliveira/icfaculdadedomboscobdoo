package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Agendamento;
import javax.swing.JOptionPane;

public class AgendamentoDao {

    private Conexao conexao;

    public Agendamento incluir(Agendamento agendamento)
    {
        conexao = new Conexao();

        try{
            conexao.getDb().store(agendamento);
            conexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso...", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar agendamento!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }
        return agendamento;
    }

    public Agendamento atualizar(Agendamento agendamento)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Agendamento.class);
        query.descend("disciplina_Agendamento").constrain(agendamento.getDisciplina_Agendamento());

        Agendamento agend = (Agendamento) query.execute().get(0);

        agend.setDisciplina_Agendamento(agendamento.getDisciplina_Agendamento());
        agend.setUsuario_Agendamento(agendamento.getUsuario_Agendamento());
        agend.setRecurso_Agendamento(agendamento.getRecurso_Agendamento());
        agend.setDataInicial_Agendamento(agendamento.getDataInicial_Agendamento());
        agend.setDataFinal_Agendamento(agendamento.getDataFinal_Agendamento());
        agend.setHoraInicial_Agendamento(agendamento.getHoraInicial_Agendamento());
        agend.setHoraFinal_Agendamento(agendamento.getHoraFinal_Agendamento());
        agend.setObservacao_Agendamento(agendamento.getObservacao_Agendamento());

        conexao.getDb().store(agend);
        conexao.getDb().commit();

        return agendamento;
    }

    public Agendamento excluir(Agendamento agendamento)
    {
        conexao = new Conexao();

        ObjectSet<Agendamento> lista = conexao.getDb().get(agendamento);
        Agendamento agend = lista.next();
        conexao.getDb().delete(agend);
        conexao.getDb().commit();

        return agendamento;
    }

    public Agendamento buscar(String dataInicial, String dataFinal)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
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
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Agendamento.class);
        query.descend("dataInicial_Agendamento").orderAscending();
        ObjectSet<Agendamento> lista = query.execute();

        return lista;
    }
}
