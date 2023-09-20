package depo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Depo {

        private List<UrunTanimlama> urunListesi;
        private Map<Integer, String> degisiklikler;

        public Depo() {

            urunListesi=new ArrayList<>();
            degisiklikler=new HashMap<>();

        }

        public void urunTanimlama(String urunIsmi, String uretici, String birim) {
            UrunTanimlama urun = new UrunTanimlama(urunIsmi, uretici, birim);
            urunListesi.add(urun);
            degisiklikler.put(urun.getId(), "Yeni ürün tanımlandı: " + urun.getUrunIsmi());
        }

        public void urunListele() {
            for (UrunTanimlama urun : urunListesi) {
                System.out.println(urun);
            }
        }

        public void urunGirisi(int urunId, int miktar) {
            for (UrunTanimlama urun : urunListesi) {
                if (urun.getId() == urunId) {
                    urun.urunuGir(miktar);
                    degisiklikler.put(urun.getId(), "Ürün girişi yapıldı: " + urun.getUrunIsmi() +
                            ", Miktar: " + miktar);
                    return;
                }
            }
            System.out.println("Hata: Belirtilen ID'ye sahip ürün bulunamadı.");
        }

        public void urunuRafaKoy(int urunId, int raf) {
            for (UrunTanimlama urun : urunListesi) {
                if (urun.getId() == urunId) {
                    urun.setRaf(raf);
                    degisiklikler.put(urun.getId(), "Ürün rafa konuldu: " + urun.getUrunIsmi() +
                            ", Raf: " + raf);
                    return;
                }
            }
            System.out.println("Hata: Belirtilen ID'ye sahip ürün bulunamadı.");
        }

        public void urunCikisi(int urunId, int miktar) {
            for (UrunTanimlama urun : urunListesi) {
                if (urun.getId() == urunId) {
                    urun.urunuCikar(miktar);
                    degisiklikler.put(urun.getId(), "Ürün çıkışı yapıldı: " + urun.getUrunIsmi() +
                            ", Çıkış Miktarı: " + miktar);
                    return;
                }
            }
            System.out.println("Hata: Belirtilen ID'ye sahip ürün bulunamadı.");
        }

        public void degisiklikleriGoruntule() {
            for (Integer urunId : degisiklikler.keySet()) {
                System.out.println("Ürün ID: " + urunId + ", Değişiklik: " + degisiklikler.get(urunId));
            }
        }


}
