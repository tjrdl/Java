package Java.chapter07;

public class Product<T,M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	//alt+a => select getter/setter
	//alt+r => generate
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
