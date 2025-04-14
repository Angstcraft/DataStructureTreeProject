package dataStructureTree;


public class BirchTree extends Tree
{
   public BirchTree(int pNumBranches, int pNumTwigs, int pNumLeaves)
   {
	  super(TreeType.BIRCH, pNumBranches, pNumTwigs, pNumLeaves);
   }

   @Override
   public void displayInfo()
   {
	  System.out.println("This is a " + treeType + " tree.");
   }
}