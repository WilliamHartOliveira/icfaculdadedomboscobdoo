/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.dao;

import com.db4o.*;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.model.Equipamento;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class PersistenciaDao {

    static ObjectContainer db;

    public void AbrirConexao()
    {
        db = Db4o.openFile("facdombosco.dbo");
        System.out.println("Conexão aberta...");
    }//Método responsável para abrir conexão com o banco - OK

    public  void FecharConexao()
    {
        try{
            db.close();
            System.out.println("Conexão fechada...");
        }
        catch(Exception ex){
            System.out.println("Erro em fechar conexão: "+ex);
        }
    }//Método responsável para fechar a conexão com o banco - OK

    public void Salvar(Equipamento equipamento)
    {
        try{
            db.store(equipamento);
            db.commit();
            JOptionPane.showMessageDialog(null, "Equipamento cadastrado...", "Cadastro Equipamento", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar o objeto!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//Método responsável para Salvar Equipamento - OK

    public boolean alterar(Equipamento equipamento)
    {
        Query query = db.query();
        query.constrain(Equipamento.class);
        query.descend("cd_equipamento").constrain(equipamento.getCd_equipamento());

        ObjectSet lista = query.execute();

        if (lista.hasNext()) {
            Equipamento e = (Equipamento) lista.get(0);
            e = equipamento;
            db.delete(e);
            db.store(e);
            db.commit();
        } else {
            return false;
        }
        return true;

    }// Método responsável para alterar equipamento - NÃO ESTÁ FUNCIONANDO

    public void Excluir(Equipamento equipamento)
    {

          Query query = db.query();
          query.constrain(Equipamento.class);
          query.descend("cd_equipamento").constrain(equipamento.getCd_equipamento());
          ObjectSet lista = query.execute();

          while(lista.hasNext()){
              Equipamento e = (Equipamento) lista.get(0);
              db.delete(e);
              db.commit();
          }

    }// Método responsável para excluir equipamento - NÃO ESTÁ FUNCIONANDO

    public static Equipamento Pesquisar(String codEquip)
    {

        Query query = db.query();
        query.constrain(Equipamento.class);
        query.descend("cd_equipamento").constrain(codEquip);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Equipamento) lista.get(0);
        }else{
            return null;
        }
    }//Método responsável para pesquisar equipamentos por código - OK

    public static ObjectSet<Equipamento> montarTabelaEquip()
    {
        Query query = db.query();
        query.constrain(Equipamento.class);
        query.descend("cd_equipamento").orderAscending();
        ObjectSet<Equipamento> lista = query.execute();
        return lista;
    }//Método responsável para Montar tabela - OK

}
