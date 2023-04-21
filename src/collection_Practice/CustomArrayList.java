package collection_Practice;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public  class CustomArrayList<E> extends AbstractList<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements ;
	
	public CustomArrayList() {
		super();
		elements = new Array[DEFAULT_CAPACITY];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {

		return (elements.length==0) ? true :false ;
	}

	@Override
	public boolean contains(Object o) {
		for(Object obj : elements ) {
			if(obj.equals(0)) {
				return true;
			}
		}
		
		return false;
		
	}


	@Override
	public boolean add(Object e) {
		if(size==DEFAULT_CAPACITY) {
			throw new IndexOutOfBoundsException("Capacity: " + DEFAULT_CAPACITY+ ", Size " + size);
		}
		elements[size]= e;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		if (contains(o)== true) {
			for(int i = indexOf(o); i<size-1;i++ ) {
				elements[i]= elements[i+1];
			}
			elements[size-1] = null;
			return true;
		}
		
		return false;
	}


	@Override
	public void clear() {
		for(int i= 0 ; i<size;i++) {
			elements[i]=null;
		}
	}

	@Override
	public E get(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("Index is out of bound");
		}
		for(Object obj: elements) {
			if (indexOf(obj)== index) {
				return (E) obj;
			}
		}
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		if (index > size || index < 0 || index== DEFAULT_CAPACITY) {
            throw new IndexOutOfBoundsException("Index: " + index );
		}
		for(int i= 0;i<size;i++) {
			if (i == index) {
				elements[i] = element;
				return element;
			}
		}
		return null;
	}

	@Override
	public void add(int index, Object element) {
		if (index > size || index < 0 || index== DEFAULT_CAPACITY) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
		elements[index] = element;
		size++;
	}

	@Override
	public E remove(int index) {
		if (index > size || index < 0 || index== DEFAULT_CAPACITY) {
            throw new IndexOutOfBoundsException("Index: " + index );
		}
		for(int i= 0;i<size;i++) {
			if (i == index) {
				Object o = elements[index];
				remove(o);
				return (E) o;
			}			
		}	
		return null;
	}

	@Override
	public int indexOf(Object o) {
	    for(int i=0;i<size;i++) {
	    	if(elements[i].equals(o)) {
	    		return i;
	    	}
	    }
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		 for(int i=0;i<size;i++) {
			 
		    	if(elements[i].equals(o)) {
		    		index = i;
		    	}
		 }
		
		return index;
	}



	@Override
	public List subList(int fromIndex, int toIndex) {
		CustomArrayList<E> subListElements = new CustomArrayList<>();
		for(int i = fromIndex; i<=toIndex;i++) {
			subListElements.add(elements[i]);
		}
		return subListElements;
	}

//	@Override
//	public Object[] toArray() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Object[] toArray(Object[] a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//  @Override
//	public boolean containsAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean addAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean addAll(int index, Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean removeAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean retainAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public ListIterator listIterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ListIterator listIterator(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Iterator iterator() {
//
//		return null;
//	}

	

}
