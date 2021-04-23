package Latihan3;

 class PembayaranGaji {
	 public int hitungGaji(Pegawai peg) {
		int uang = peg.gaji();
		if(peg instanceof Direktur)
			uang+=((Direktur)peg).tunjangan();
		if(peg instanceof Staf) 
			uang+=((Staf)peg).Bonus();
		
		return uang;
		 
	 }
	 public static void main(String[] args) {
		 
		 PembayaranGaji pg=new PembayaranGaji();
		 Staf ali = new Staf();
		 Direktur Tsabit = new Direktur();
		 System.out.println("Gaji yang dibayarkan untuk staf = " + pg.hitungGaji(ali));
		 System.out.println("Gaji yang dibayarkan untuk Direktur = " + pg.hitungGaji(Tsabit));
		 
	 }

}
