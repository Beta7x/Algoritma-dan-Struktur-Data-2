package Slinkedlist;

public class SinglyLinkedList {
	protected Node first;
	protected Node last;
	public int size;
	
	/* Constructor */
	public SinglyLinkedList() {
		first = null;
		last = null;
		size = 0;
	}
	
	// Method untuk mengecek apakah linked list kosong atau tidak 
	public boolean isEmpty() {
		return first == null;
	}
	
	// Method untuk mengembalikan ukuran linked list sekarang
	public int getSize() {
		return size;
	}
	
	// Method untuk memasukan node di awal linked list
	public void insertAwal(int val) {
		// Membuat satu node baru 
		Node pntr = new Node(val, null);
		if(first == null) { // Jika linked list masih kosong
			first = pntr;
			last = first;
		} else {
			pntr.setLink(first);
			first = pntr;
		}
		// Menambah ukuran linked list
		size++;
	}
	
	// Method untuk memasukan node di akhir linked list
	public void insertAkhir(int val) {
		// Membuat satu node baru
		Node pntr = new Node(val, null);
		if(first == null) { // Jika linked list masih kosong
			first = pntr;
			last = first;
		} else {
			last.setLink(pntr);
			last = pntr;
		}
		// Menambah ukuran
		size++;
	}
	
	// Method untuk memasukan node di posisi tertentu
	public void insertAtPos(int val, int pos) {
		// Membuat satu node baru
		Node pntr = new Node(val, null);
		if(pos > size) {
			System.out.println("Posisi melebihi batas linked list");
		} else if(pos == 1) {
			insertAwal(val);
		} else if(pos == size) {
			insertAkhir(val);
		} else {
			Node ptr = first;
			pos = pos -1;
			for(int i = 1; i < size; i++) {
				Node tmp = ptr.getLink();
				ptr.setLink(pntr);
				pntr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		// Menambah ukuran
		size++;
	}
	
	// Method untuk menghapus node di awal linked list
	public void deleteAwal() {
		first = first.getLink();
		size--; // Mengurangi ukuran linked list
	}
	
	// Method untuk menghapus node di akhir linked list
	public void deleteAkhir() {
		Node temp = first;
		for(int i = 1; i < size-1; i++) {
			temp = temp.getLink();
			last = temp;
			last.setLink(null);
			size--; // Mengurangi ukuran linked list
		}
	}
	
	// Method untuk menghapus node pada posisi tertentu
	public void deleteAtPos(int pos) {
		if(pos > size) {
			System.out.println("Posisi node melebihi ukuran");
		} else if(pos == 1) {
			this.deleteAwal();
		} else if(pos == size) {
			this.deleteAkhir();
		} else {
			Node ptr = first;
			pos--; // Mengurangi posisi pada node linked list
			for(int i = 1; i <= pos; i++) {
				if(i == pos) {
					Node temp = ptr.getLink();
					temp = temp.getLink();
					ptr.setLink(temp);
					break;
				}
				ptr = ptr.getLink();
			}
			size--; // Mengurangi ukuran linked list
		}
	}
	
	// Method untuk menampilkan semua unsur yang terdapat pada linked list
	public void display() {
		Node ptr = first;
		while(true) {
			if(ptr == null)
				break;
				System.out.print(ptr.getData() + "-->");
				ptr = ptr.getLink();
			}
			System.out.println();
	}
	
	public void address() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126");
		System.out.println("===========================" + "\n");
	}
}

