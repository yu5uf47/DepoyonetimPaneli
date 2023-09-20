package depo;

public class UrunTanimlama {
;

        private static int idCounter = 1;

        private int id;
        private String urunIsmi;
        private String uretici;
        private String birim;
        private int miktar;
        private int raf;

        public UrunTanimlama(String urunIsmi, String uretici, String birim) {
            this.id = idCounter++;
            this.urunIsmi = urunIsmi;
            this.uretici = uretici;
            this.birim = birim;
            this.miktar = 0;  // Başlangıçta miktar sıfır olarak atanır
            this.raf = -1;  // Raf numarası atanmadıysa -1 olarak atanır
        }

        public void setRaf(int raf) {
            this.raf = raf;
        }

        public int getId() {
            return id;
        }

        public String getUrunIsmi() {
            return urunIsmi;
        }

        public String getUretici() {
            return uretici;
        }

        public String getBirim() {
            return birim;
        }

        public int getMiktar() {
            return miktar;
        }

        public int getRaf() {
            return raf;
        }

        public void urunuGir(int miktar) {
            this.miktar += miktar;
        }

        public void urunuCikar(int miktar) {
            if (this.miktar >= miktar) {
                this.miktar -= miktar;
            } else {
                System.out.println("Hata: Stokta yeterli miktar bulunmamaktadır.");
            }
        }

        @Override
        public String toString() {
            return "Ürün ID: " + id +
                    ", Ürün İsmi: " + urunIsmi +
                    ", Üretici: " + uretici +
                    ", Birim: " + birim +
                    ", Miktar: " + miktar +
                    ", Raf: " + (raf == -1 ? "Belirtilmemiş" : raf);
        }
    }

