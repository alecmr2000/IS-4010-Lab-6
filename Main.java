class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "red");
    // Above is creating two new trees using two different constructors.

    tree1.print();
    tree2.print();
    // Above is clling the print method in the Tree class.

    tree1.setName("spruce");
    tree1.setType("conifer");
    // Above is using the mutator methods to change variables in tree1.

    tree1.print();
    // Above is re-printing tree1 after changes have been made.
  }
}