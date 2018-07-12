package dao;

import javax.transaction.Transaction;
import model.Aluno;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Diego Munhoz
 */
public class AlunoDAO {

    public void salvar(Object objeto) throws Exception {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.saveOrUpdate(objeto);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            transacao.rollback();
            throw new Exception("Erro ao salvar Aluno");
        } finally {
            sessao.close();
        }
    }

    public void excluir(Object objeto) throws Exception {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.delete(objeto);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            transacao.rollback();
            throw new Exception("Erro ao excluir Aluno");
        } finally {
            sessao.close();
        }
    }

    public Aluno buscarPorCodigo(long codigo) {
        Session sessao = null;
        Aluno aluno = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            aluno = (Aluno) sessao.get(Aluno.class, codigo);
        } catch (Exception e) {
            aluno = null;
        } finally {
            sessao.close();
        }
        return aluno;
    }
/*
    @SuppressWarnings("unchecked")
    public ArrayList<Competidor> buscarTodos() {
        ArrayList<Competidor> listaRetorno = new ArrayList<Competidor>();

        Session sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = sessao.createCriteria(Competidor.class);

        criteria.addOrder(Order.asc("codigo"));

        listaRetorno = (ArrayList<Competidor>) criteria.list();

        return listaRetorno;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Competidor> buscarComRestrição(String nome, String absoluto, int modalidades, int peso, double peso1, double peso2, int idade, int idade1, int idade2, int marca, String sexo) {
        ArrayList<Competidor> listaRetorno = new ArrayList<Competidor>();

        Session sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = sessao.createCriteria(Competidor.class);
        criteria.createAlias("modalidades", "modalidades");
        criteria.createAlias("tentativas", "tentativas");
        //Restrição
        if (absoluto == "Supino") {
            criteria.add(Restrictions.ilike("modalidades.supinoAbsoluto", "Sim"));
        }
        if (absoluto == "Agachamento" && modalidades == 2) {
            criteria.add(Restrictions.ilike("modalidades.agachamentoAbsoluto", "Sim"));
        }
        if (absoluto == "Terra" && modalidades == 3) {
            criteria.add(Restrictions.ilike("modalidades.terraAbsoluto", "Sim"));
        }
        if (!nome.isEmpty()) {
            criteria.add(Restrictions.ilike("nome", "%" + nome + "%"));
        }
        if (idade1 > 1 && idade2 > 1) {
            criteria.add(Restrictions.between("idade", idade1, idade2));
        }
        if (peso1 > 1 && peso2 > 1) {
            criteria.add(Restrictions.between("peso", peso1, peso2));
        }
        if (!sexo.isEmpty()) {
            criteria.add(Restrictions.eq("sexo", sexo));
        }
        //Ordem
        if (peso == 1) {
            criteria.addOrder(Order.asc("peso"));
        }
        if (idade == 1) {
            criteria.addOrder(Order.asc("idade"));
        }
        if (marca == 1) {
            criteria.addOrder(Order.asc("modalidades.supinoMelhorMarca"));
        }
        if (marca == 2) {
            criteria.addOrder(Order.asc("modalidades.agachamentoMelhorMarca"));
        }
        if (marca == 3) {
            criteria.addOrder(Order.asc("modalidades.terraMelhorMarca"));
        }
        if (modalidades == 1) {
            criteria.add(Restrictions.ilike("modalidades.supino", "Sim"));
            criteria.addOrder(Order.asc("tentativas.supinoTentativa1"));
            criteria.addOrder(Order.asc("peso"));
        }
        if (modalidades == 2) {
            criteria.add(Restrictions.ilike("modalidades.agachamento", "Sim"));
            criteria.addOrder(Order.asc("tentativas.agachamentoTentativa1"));
            criteria.addOrder(Order.asc("peso"));
        }
        if (modalidades == 3) {
            criteria.add(Restrictions.ilike("modalidades.terra", "Sim"));
            criteria.addOrder(Order.asc("tentativas.terraTentativa1"));
            criteria.addOrder(Order.asc("peso"));
        }

        listaRetorno = (ArrayList<Competidor>) criteria.list();

        return listaRetorno;
    }*/
}
