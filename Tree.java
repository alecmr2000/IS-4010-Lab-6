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
    /*
     * System.out.println( "This is a " + treeName + " tree. It is a " + treeType +
     * " and its leaves are currently " + leafColor + ". It" );
     * 
     * if (leavesFall == true){ System.out.print(" does"); }
     * 
     * else if (leavesFall != true){ System.out.print(" does not"); }
     * 
     * System.out.print( " lose its leaves for the winter." );
     */

    /*
     * README: The above commented out code was an attempt to make the code flow
     * smoother. However, when the two if statements ran they would always print on
     * a new line with both "println" and "print". I ended up writting the code
     * below so that everything would print on the same line. ~!~Do you know if
     * there was a way to get around this and make everything print on the same line
     * like the below code does?~!~
     */

    if (leavesFall == true) {
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently "
          + leafColor + ". It does lose its leaves for the winter.");
    }

    else if (leavesFall != true) {
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently "
          + leafColor + ". It does not lose its leaves for the winter.");
    }
  }
}