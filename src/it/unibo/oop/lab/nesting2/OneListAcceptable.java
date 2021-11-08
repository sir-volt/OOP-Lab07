package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> sequence;
	
	
	/**
	 * 
	 * @param sequence
	 * 			a set that indicates the sequence of elements
	 */
	public OneListAcceptable(final List<T> sequence) {
		this.sequence = sequence;
	}



	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {

			
			
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
