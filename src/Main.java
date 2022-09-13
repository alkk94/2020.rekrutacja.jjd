public class Main {
    public static void main(String[] args) {
        Block block1 = new Block("czerwony", "cegła");
        Block block2 = new Block("zielony", "cegła");
        Block block3 = new Block("niebieski", "cegła");
        Block block4 = new Block("niebieski", "marmur");
        CompositeBlock block5 = new CompositeBlock("niebieski", "gips");
        block5.addBlock(block1);
        block5.addBlock(block2);
        CompositeBlock block6 = new CompositeBlock("niebieski", "żelbeton");
        block6.addBlock(block5);
        block6.addBlock(block3);
        Wall wall = new Wall(block6, block4);
        System.out.println(wall.findBlocksByMaterial("cegła"));
        System.out.println(wall.findBlockByColor("niebieski"));
        System.out.println(wall.count());
    }
}