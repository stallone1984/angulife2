package escola.musica.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

public class PopulaCurso {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Curso violino = geraCurso("Violino", "Descrição do curso de violino", "01/01/2014", 4, TipoCurso.CORDAS);
		Curso viola = geraCurso("Viola", "Descrição do curso de viola", "01/01/2014", 4, TipoCurso.CORDAS);
		Curso violoncello = geraCurso("Violoncello", "Descrição do curso de violoncello", "01/01/2014", 4, TipoCurso.CORDAS);
		Curso contrabaixo = geraCurso("Contrabaixo", "Descrição do curso de contrabaixo", "01/01/2014", 4, TipoCurso.CORDAS);
		Curso violao = geraCurso("Violão", "Descrição do curso de violão", "01/01/2014", 4, TipoCurso.CORDAS);
		Curso guitarra = geraCurso("Guitarra", "Descrição do curso de guitarra", "01/01/2014", 4, TipoCurso.CORDAS);
		Curso flauta = geraCurso("Flauta", "Descrição do curso de flauta", "01/02/2014", 4, TipoCurso.MADEIRAS);
		Curso clarinete = geraCurso("Clarinete", "Descrição do curso de clarinete", "01/02/2014", 4, TipoCurso.MADEIRAS);
		Curso oboe = geraCurso("Oboé", "Descrição do curso de oboé", "01/02/2014", 5, TipoCurso.MADEIRAS);
		Curso fagote = geraCurso("Fagote", "Descrição do curso de fagote", "01/02/2014", 5, TipoCurso.MADEIRAS);
		Curso saxofone = geraCurso("Saxofone", "Descrição do curso de saxofone", "01/02/2014", 5, TipoCurso.MADEIRAS);
		Curso clarone = geraCurso("Clarone", "Descrição do curso de clarone", "01/02/2014", 5, TipoCurso.MADEIRAS);
		Curso trompete = geraCurso("Trompete", "Descrição do curso de trompete", "04/02/2014", 6, TipoCurso.METAIS);
		Curso trompa = geraCurso("Trompa", "Descrição do curso de trompa", "04/01/2014", 6, TipoCurso.METAIS);
		Curso trombone = geraCurso("Trobone", "Descrição do curso de trombone", "04/01/2014", 6, TipoCurso.METAIS);
		Curso tuba = geraCurso("Tuba", "Descrição do curso de tuba", "04/01/2014", 6, TipoCurso.METAIS);
		Curso bateria = geraCurso("Bateria", "Descrição do curso de bateria", "22/01/2014", 3, TipoCurso.PERCUSSAO);
		Curso xilofone = geraCurso("Xilofone", "Descrição do curso de xilofone", "22/01/2014", 3, TipoCurso.PERCUSSAO);
		Curso caixa = geraCurso("Caixa", "Descrição do curso de caixa", "22/01/2014", 3, TipoCurso.PERCUSSAO);
		Curso bumbo = geraCurso("Bumbo", "Descrição do curso de bumbo", "22/01/2014", 3, TipoCurso.PERCUSSAO);
		
		em.persist(violino);
		em.persist(viola);
		em.persist(violoncello);
		em.persist(contrabaixo);
		em.persist(violao);
		em.persist(guitarra);
		em.persist(flauta);
		em.persist(clarinete);
		em.persist(oboe);
		em.persist(fagote);
		em.persist(clarone);
		em.persist(saxofone);
		em.persist(trompete);
		em.persist(trompa);
		em.persist(trombone);
		em.persist(tuba);
		em.persist(bateria);
		em.persist(xilofone);
		em.persist(caixa);
		em.persist(bumbo);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public static Curso geraCurso(String nome, String descricao, String data, double duracao, TipoCurso tipo){
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setDescricao(descricao);
		curso.setDuracao(duracao);
		curso.setDataCriacao(parseData(data));
		curso.setTipo(tipo);
		return curso;
	}
	
	private static Date parseData(String data){
		try{
			Date date = new SimpleDateFormat("dd/MM/yyy").parse(data);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar.getTime();
		}catch(ParseException e){
			throw new IllegalArgumentException(e);
		}
	}
}
