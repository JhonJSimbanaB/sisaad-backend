package yavirac.ProyectoIntegradorSISAAD.feature.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category save(Category category){

        return categoryRepository.save(category);
        
    }

    public Category findById(long id) {

        return categoryRepository.findById(id).orElse(new Category());
        
    }

    public Category update(Category category) {

        return categoryRepository.save(category);
        
    }

    public void deleteById(long id) {

        categoryRepository.deleteById(id);
        
    }

    public List<Category>findAll() {

        return categoryRepository.findAll();
        
    }

    public List<Category> findByName(String term){
        return categoryRepository.findByNameLikeIgnoreCase(term+"%");
    }
    
}
