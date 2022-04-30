public class MyTree 
{
	
	//main
	public static void main(String[] args)
	{
		//declare binary search tree of t object 
		BinarySearchTree t = new BinarySearchTree();


		//insert letters into the tree
		t.insert(new KeyedItem("M"));
		t.insert(new KeyedItem("J"));
		t.insert(new KeyedItem("F"));
		t.insert(new KeyedItem("L"));
		t.insert(new KeyedItem("W"));
		t.insert(new KeyedItem("S"));
		t.insert(new KeyedItem("T"));
		t.insert(new KeyedItem("Z"));
		t.inorder();
		System.out.println("");
		t.preorder();
		t.delete("M");
		System.out.println("");
		t.preorder();
		
		
	}
 

}
