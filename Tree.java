class Tree {

  String treeName;
  String treeType;
  Boolean leavesFall;
  String leafColor;
  // Above is decalring our variables.

  public Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  public Tree(String aName, String aType, Boolean aFall, String aColor) {
    treeName = aName;
    treeType = aType;
    leavesFall = aFall;
    leafColor = aColor;
  }
  // Above are contructor methods.

  void setName(String theName) {
    treeName = theName;
  }

  void setType(String theType) {
    treeType = theType;
  }

  void setFall(Boolean theFall) {
    leavesFall = theFall;
  }

  void setColor(String theColor) {
    leafColor = theColor;
  }
  // Above four methods are mutator methods.

  String getName() {
    return treeName;
  }

  String getType() {
    return treeType;
  }

  Boolean getFall() {
    return leavesFall;
  }

  String getColor() {
    return leafColor;
  }
  // Above four methods are accessor methods.

  public void print() {
    System.out.println(
        "This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It");

    if (leavesFall == true) {
      System.out.println("does");
    }

    else if (leavesFall != true) {
      System.out.println("does not");
    }

    System.out.println("lose its leaves for the winter");
  }
}