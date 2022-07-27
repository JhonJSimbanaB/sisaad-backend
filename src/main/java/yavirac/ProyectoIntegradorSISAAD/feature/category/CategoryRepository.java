package yavirac.ProyectoIntegradorSISAAD.feature.category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    
    List<Category> findAll();

    List<Category> findByNameLikeIgnoreCase(String term);

}
