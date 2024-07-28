

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Driks");
        TreeNode cold = new TreeNode("cold");
        TreeNode hot = new TreeNode("hot");
        TreeNode Tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(Tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));
    }
}
