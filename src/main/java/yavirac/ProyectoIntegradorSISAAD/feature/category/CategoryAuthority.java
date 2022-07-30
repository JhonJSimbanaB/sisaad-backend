package yavirac.ProyectoIntegradorSISAAD.feature.category;

import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class CategoryAuthority {
    @Id private long id;
    private Long categoryId;
    private Long authorityId;
}
