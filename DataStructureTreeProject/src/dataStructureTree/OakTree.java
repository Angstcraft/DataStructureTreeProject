package dataStructureTree;


public class OakTree extends Tree
{
   public OakTree(int pNumBranches, int pNumTwigs, int pNumLeaves)
   {
	  super(TreeType.OAK, pNumBranches, pNumTwigs, pNumLeaves);
   }

   @Override
   public void displayInfo()
   {
	  System.out.println("This is an " + treeType + " tree.");
   }
}