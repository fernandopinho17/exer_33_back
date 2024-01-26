import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nomeDaSuaUnidadeDePersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Criar instâncias das entidades
        Marca marca = new Marca();
        marca.setNome("Toyota");

        Carro carro = new Carro();
        carro.setModelo("Corolla");
        carro.setMarca(marca);

        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("Ar Condicionado");
        acessorio1.setCarro(carro);

        Acessorio acessorio2 = new Acessorio();
        acessorio2.setNome("Teto Solar");
        acessorio2.setCarro(carro);

        // Persistir as instâncias
        em.persist(marca);
        em.persist(carro);
        em.persist(acessorio1);
        em.persist(acessorio2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}