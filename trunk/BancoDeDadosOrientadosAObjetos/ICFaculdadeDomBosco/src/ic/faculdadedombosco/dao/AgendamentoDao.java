package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Agendamento;
import ic.faculdadedombosco.model.GradeDisciplina;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
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
        query.descend("oGradeDisciplinaAgendamento").constrain(agendamento.getoGradeDisciplinaAgendamento());

        Agendamento agend = (Agendamento) query.execute().get(0);

        agend.setCodigoAgendamento(agendamento.getCodigoAgendamento());
        agend.setStatusAgendamento(agendamento.getStatusAgendamento());
        agend.setoGradeDisciplinaAgendamento(agendamento.getoGradeDisciplinaAgendamento());
        agend.setoRequisitanteAgendamento(agendamento.getoRequisitanteAgendamento());
        agend.setoRecursoAgendamento(agendamento.getoRecursoAgendamento());
        agend.setdDataInicialAgendamento(agendamento.getdDataInicialAgendamento());
        agend.setdDataFinalAgendamento(agendamento.getdDataFinalAgendamento());
        agend.sethHoraInicialAgendamento(agendamento.gethHoraInicialAgendamento());
        agend.sethHoraFinalAgendamento(agendamento.gethHoraFinalAgendamento());
        agend.setsObservacaoAgendamento(agendamento.getsObservacaoAgendamento());
        agend.setListEquipamentoAgendamento(agendamento.getListEquipamentoAgendamento());

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

    public Agendamento buscar(SimpleDateFormat dataInicial, SimpleDateFormat dataFinal)
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
    
     public Agendamento buscarObjetoDisciplina(GradeDisciplina gradeDisciplina)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Agendamento.class);
        query.descend("oGradeDisciplinaAgendamento").constrain(gradeDisciplina);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Agendamento) lista.get(0);
        }else{
            return null;
        }
    }
     
     
    public List<Agendamento> listarAgendamentoRelatorio()
    {
        oConexao = new Conexao();
        List<Agendamento> lista=new ArrayList();
        Query consulta= oConexao.getDb().query();
        consulta.constrain(Agendamento.class);
        consulta.descend("dDataInicialAgendamento").orderAscending();

        ObjectSet resultado=consulta.execute();

        while(resultado.hasNext())
        {
              lista.add((Agendamento)resultado.next());
        }

        return lista;
    }

    public ObjectSet<Agendamento> montarTabelaAgendamento()
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Agendamento.class);
        query.descend("dDataInicialAgendamento").orderAscending();
        ObjectSet<Agendamento> lista = query.execute();

        return lista;
    }

    public List<Agendamento> listarAgendamento(SimpleDateFormat dataInicial, SimpleDateFormat dataFinal)
    {
        oConexao = new Conexao();
        List<Agendamento> lista=new ArrayList();
        Query consulta= oConexao.getDb().query();
        consulta.constrain(Agendamento.class);
        Constraint oFirstConstraint = consulta.descend("dDataInicialAgendamento").constrain(dataInicial).greater();
        Constraint oSecondConstraint = consulta.descend("dDataFinalAgendamento").constrain(dataFinal).smaller();
        oFirstConstraint.and(oSecondConstraint);
        
        ObjectSet<Agendamento> resultado = consulta.execute();

        System.out.println("Objetos encontrados: " + resultado.size());

        while(resultado.hasNext())
        {
              lista.add((Agendamento)resultado.next());
        }

        return lista;
    }
}
