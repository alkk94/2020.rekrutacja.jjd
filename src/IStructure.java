import java.util.List;
import java.util.Optional;

public interface IStructure {
    Optional findBlockByColor(String color);

    List findBlocksByMaterial(String material);

    int count();
}