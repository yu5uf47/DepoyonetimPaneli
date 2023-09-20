package depo;

public class Runner {
    public static void main(String[] args) {
        Depo depo = new Depo();

        // Ürün tanımlamaları
        depo.urunTanimlama("Ürün 1", "Üretici 1", "Adet");
        depo.urunTanimlama("Ürün 2", "Üretici 2", "Kilogram");
        depo.urunTanimlama("Ürün 3", "Üretici 3", "Litre");

        // Ürün listeleme
        System.out.println("Ürünler:");
        depo.urunListele();
        System.out.println();

        // Ürün girişleri
        depo.urunGirisi(1, 100);
        depo.urunGirisi(2, 50);

        // Ürün listeleme
        System.out.println("Ürünler (girişler yapıldıktan sonra):");
        depo.urunListele();
        System.out.println();

        // Ürünü rafa koyma
        depo.urunuRafaKoy(1, 10);
        depo.urunuRafaKoy(2, 5);

        // Ürün listeleme
        System.out.println("Ürünler (raf bilgileri güncellendikten sonra):");
        depo.urunListele();
        System.out.println();

        // Ürün çıkışları
        depo.urunCikisi(1, 20);
        depo.urunCikisi(2, 10);

        // Ürün listeleme
        System.out.println("Ürünler (çıkışlar yapıldıktan sonra):");
        depo.urunListele();
        System.out.println();

        // Yapılan değişiklikleri görüntüleme
        System.out.println("Yapılan Değişiklikler:");
        depo.degisiklikleriGoruntule();
    }
}

