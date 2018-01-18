package core15_nestedclasses;

public class Main {

	public static void main(String[] args) {
		
		Object[] arr = {4, 1, 0, 7, 5, 10, 111, 12};
		
		Collection collection = new Collection(arr);
		
		Collection.Nested nested = collection.getNested();
		nested.showArr(collection);
		
		System.out.println();
		
		Iterator iter = collection.getIter();
		while (iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println();
		
		collection.localClass();
		
		System.out.println();
		
		collection.anonymous();
		
	}
}
