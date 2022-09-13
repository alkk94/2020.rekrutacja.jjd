import java.util.stream.Stream;

public interface IBlock {
    String getColor();
    String getMaterial();
    Stream<IBlock> toStream();
}