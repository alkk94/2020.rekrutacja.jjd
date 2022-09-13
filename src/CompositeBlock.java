import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class CompositeBlock extends Block implements ICompositeBlock {
    private final List<IBlock> blocks = new LinkedList<>();

    public CompositeBlock(String color, String material) {
        super(color, material);
    }

    @Override
    public List<IBlock> getBlocks() {
        return Collections.unmodifiableList(blocks);
    }

    @Override
    public Stream<IBlock> toStream() {
        return Stream.concat(
                super.toStream(),
                blocks.stream().flatMap(IBlock::toStream)
        );
    }

    public void addBlock(IBlock block) {
        blocks.add(block);
    }
}
