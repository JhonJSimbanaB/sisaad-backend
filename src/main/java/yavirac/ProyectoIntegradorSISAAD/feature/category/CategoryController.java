package yavirac.ProyectoIntegradorSISAAD.feature.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/category")
@CrossOrigin({"*"})

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    //CRUD

    //Crear 
    @PostMapping("/save")
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    //Leer
    @GetMapping("/findById/{id}")
    public Category findById(@PathVariable long id) {
        return categoryService.findById(id);
    }
    
    //Actualizar
    @PutMapping("/update")

    public Category update(@RequestBody Category category) {
        return categoryService.save(category);
    }

    //Eliminar
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        categoryService.deleteById(id);  
    }

    @GetMapping("/findAll")
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/findByName/{term}")
    public List<Category> findByName(@PathVariable String term){
        return categoryService.findByName(term);
    }

}
