package core15_nestedclasses;

public class Collection {

	private Object[] arr;
	
	public Collection(Object[] arr) {
		this.arr = arr;
	}
	
	public Object[] getArr() {
		return arr;
	}
	
	/**
	 * 
	 * @author alexm
	 * Вкладений (Nested) static клас
	 * 
	 */
	public static class Nested {
// кожний елемент перевіряється на парність, якщо він парний -> робимо непарним
		public void showArr(Collection col) {
			for (int i = 0; i < col.getArr().length; i++) {
				if (((Integer) col.getArr()[i] % 2) == 0)
					System.out.println((Integer) col.getArr()[i] + 1);
			}
		}
	}
	
	public Nested getNested() {
		return new Nested();
	}
	
	/**
	 * 
	 * @author alexm
	 * Внутрішній (member inner) non-static клас
	 */
	public class Iter implements Iterator {
		
		private int position = 0;
		
		private Iter() {
			
		}
		
		@Override
		public boolean hasNext() {
			if (position < arr.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			Object ob = arr[position];
			position++;
			return ob;
		}
		
	}
	
	public Iter getIter() {
		return new Iter(); 
	}
	
	/**
	 * @author alexm
	 * Внутрішній (local) non-static клас; Всередині методу
	 */
	public void localClass() {
		
		class LocalClass {
			
			LocalClass() {
				
			}
// кожен 5-й елемент перевіряється на парність, 
// якщо він парний, то від нього віднімаєм 100
			void check() {
				for (int i = 0; i < arr.length; i += 5) {
					if (((Integer) arr[i] % 2) == 0)
						System.out.println((Integer) arr[i] - 100);
				}
			}
		}
		
		LocalClass local = new LocalClass();
		local.check();
	}
	
	/**
	 * 
	 * @author alexm
	 * Внутрішній (anonymous) non-static клас
	 */
	interface Check {
		public void check();
	}
	
	public void anonymous() {
		
		Check ch = new Check() {
			
			@Override
// перевіряєм кожний 3й елемент, якщо він не парний, то виводим на консоль
			public void check() {
				for (int i = arr.length -1; i >= 0; i -= 3) {
					if (((Integer)arr[i] % 2) != 0)
						System.out.println(((Integer) arr[i]));
				}
			}
			
		};
		
		ch.check();
	}
}
