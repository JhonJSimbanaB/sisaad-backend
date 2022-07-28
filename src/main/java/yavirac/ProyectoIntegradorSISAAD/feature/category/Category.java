package yavirac.ProyectoIntegradorSISAAD.feature.category;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("categories")

public class Category {

    @Id
    private long categoryId;
    private String name;
    private String descripcion;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archived;

    @MappedCollection(idColumn = "category_id")
    private Set<CategoryAuthority> authorities = new HashSet<>();

}