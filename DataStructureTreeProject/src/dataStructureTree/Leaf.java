package dataStructureTree;


public class Leaf implements Comparable<Leaf>
{
   private String type;
   private double height;
   private double width;

   public Leaf(String pType)
   {
	  this.type = pType;
	  this.height = 10; // Default height
	  this.width = 5; // Default width
   }

 

   @Override
   public boolean equals(Object pObj)
   {
	  if (this == pObj)
		 return true;
	  if (pObj == null || getClass() != pObj.getClass())
		 return false;
	  Leaf leaf = (Leaf) pObj;
	  return Double.compare(leaf.height, height) == 0 && Double.compare(leaf.width, width) == 0
			   && type.equals(leaf.type);
   }

   /**
    *
    */
   @Override
   public int compareTo(Leaf pOther)
   {
	  // Additional comparison logic here
	  return this.type.compareTo(pOther.type);
   }
   
   public String getType()
   {
	  return type;
   }

   public double getHeight()
   {
	  return height;
   }

   public double getWidth()
   {
	  return width;
   }
}