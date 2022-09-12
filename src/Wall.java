import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements IStructure {
    private final List<IBlock> blocks = new LinkedList<>();

    public Wall(IBlock... blocks) {
        Arrays.stream(blocks).forEach(this::addBlock);
    }

    @Override
    public Optional findBlockByColor(String color) {
        return blocks
                .stream()
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return blocks
                .stream()
                .filter(b -> b.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

    private void addBlock(IBlock block) {
        blocks.add(block);
    }
}