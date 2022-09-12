public class Main {
    public static void main(String[] args) {
        IBlock block1 = new Block("czerwony", "cegła");
        IBlock block2 = new Block("zielony", "cegła");
        IBlock block3 = new Block("niebieski", "cegła");
        IBlock block4 = new Block("niebieski", "marmur");
        IBlock block5 = new Block("niebieski", "gips");
        IBlock block6 = new Block("niebieski", "żelbeton");
        Wall wall = new Wall(block1, block2, block3, block4, block5, block6);
        System.out.println(wall.findBlocksByMaterial("cegła"));
        System.out.println(wall.findBlockByColor("niebieski"));
        System.out.println(wall.count());
    }
}