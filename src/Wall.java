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
        if (color == null) {
            throw new IllegalArgumentException("Color equals null");
        }
        return blocks.stream()
                .flatMap(IBlock::toStream)
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        if (material == null) {
            throw new IllegalArgumentException("Material equals null");
        }
        return blocks.stream()
                .flatMap(IBlock::toStream)
                .filter(b -> b.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return ((int) blocks.stream().flatMap(IBlock::toStream).count());
    }

    private void addBlock(IBlock block) {
        blocks.add(block);
    }
}