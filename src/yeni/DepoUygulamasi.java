package yeni;

import java.util.*;

public  class DepoUygulamasi {

        private static List<Urun> urunler = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);
        //Urun yeni=new Urun();

        public static void main(String[] args) {
            while (true) {
                System.out.println("=========================================\n"+"             DEPO UYGULAMASI"+"\n=========================================");
                System.out.println("1. Depoya Ürün Tanımlama"+"\n-----------------------------------");
                System.out.println("2. Depodaki Urunler"+"\n-----------------------------------");
                System.out.println("3. Depoya  Extra Ürün Girisi"+"\n-----------------------------------");
                System.out.println("4. Ürünü Raf Koy"+"\n-----------------------------------");
                System.out.println("5. Ürün Çıkışı"+"\n-----------------------------------");
                System.out.println("6. Çıkış"+"\n-----------------------------------");
                System.out.print("Seçiminizi yapın: ");

                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        urunTanimlama();
                    break;
                    case 2:
                        urunListele();
                        break;
                    case 3:
                        urunGirisi();
                        break;
                    case 4:
                       // System.out.println("");
                        //urunuRafaKoy();
                        urunuRafi();
                        break;
                    case 5:
                        urunCikisi();
                        break;
                    case 6:
                        System.out.println("Depo uygulaması kapatılıyor...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
                }
            }
        }


        public static Map<Integer,Urun>urunListesiMap=new HashMap<Integer,Urun>();
        private static void urunTanimlama() {

            System.out.println("lutfen urun adini, ureticisini ve birmini giriniz..");
            scanner.nextLine(); // Buffer temizleme
            System.out.print("Ürün Adı: ");
            String urunIsmi = scanner.nextLine();
            System.out.print("Üretici: ");
            String uretici = scanner.nextLine();
            System.out.print("birim: ");
           String birim = scanner.nextLine();
           System.out.println("miktar: ");
          int miktar=scanner.nextInt();



            Urun yenir=new Urun(urunIsmi,uretici,birim,miktar);
            urunler.add(yenir);


            System.out.println("Ürün tanımlandı. ID: " + yenir.getId());


            for (Urun urun : urunler) {
                if (urun.getId() == yenir.getId()) {
                    urun.setMiktar(urun.getMiktar()+miktar);



                }
            }



        }

        private static void urunListele() {

            System.out.println("=========================================\n"+"             DEPO UYGULAMASI"+"\n=========================================");
            System.out.println("urun adi          ureticisi          mikatari          birimi          id          raf"+"\n ---------------------------------------------------------------------------------------");
            for (Urun urun:urunler) {


                if (urun.getRaf() >= 0) {

                }
                System.out.printf("%5s  %20s%15s%17s%13s%14s %n", urun.getUrunIsmi(),urun.getUretici(),urun.getMiktar(),urun.getBirim(),urun.getId(),urun.getRaf());
            }
/*
            System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s          \n",
                    "Id No", "Ürün Adi", "Üretici Firma", "Birim", "Miktar", "RafAlani");


            System.out.println("-------------------------------------------------------------------------------------------");
            //urun.getId();


            for (Urun urun : urunler) {
                System.out.println(urun.toString());

            }

 *
            //public static void urunListele(Urun[] urunler) {

          //   "Urun Listesi:");


            Set<Map.Entry<Integer,Urun> >urunEntry=urunListesiMap.entrySet();

            for (Urun urun : urunler) {
               // System.out.printf("%8d %12s %15s %12s %12d %9d\n",urunListesiMap.get(urunEntry).getUrunIsmi(),urunListesiMap.get(urunEntry).getUretici(),urunListesiMap.get(urunEntry).getMiktar(),urunListesiMap.get(urunEntry).getBirim(),urunListesiMap.get(urunEntry).getId());
                    System.out.printf("%5s  %20s%15s%17s%13s%14s %n", urun.getUrunIsmi(),urun.getUretici(),urun.getMiktar(),urun.getBirim(),urun.getId(),urun.getRaf());
                 //   System.out.printf("Urun Adeti: %d%n", urun.getMiktar());
                  //  System.out.print("Raf Numarasi: ");
                //
                    if (urun.getRaf() == 0) {
                        System.out.println("Default Raf Numarasi");
                    } else {
                       // System.out.printf("%d%n", urun.getRaf());
                    }
                    System.out.println();
                }
         //   }  %5s %15s %20s %15d

 */










        }

        private static void urunGirisi() {
            System.out.print("Ürün ID'sini girin: ");
            int urunId = scanner.nextInt();//5

            for (Urun urun : urunler) {
                if (urun.getId() == urunId) {
                    System.out.print("Giriş miktarını girin: ");
                    int girisMiktari = scanner.nextInt();//100
                    urun.setMiktar(urun.getMiktar() + girisMiktari);
                    System.out.println("Ürün girişi yapıldı. Yeni miktar: " + urun.getMiktar());
                    return;
                }
            }

            System.out.println("Ürün bulunamadı.");
        }

        private static void urunuRafaKoy() {
            System.out.print("Ürün ID'sini girin: ");
            int urunId =scanner.nextInt();


            for (Urun urun : urunler) {
                if (urun.getId() == urunId) {
                    System.out.print("Raf numarasını girin: ");
                    int rafNumarasi = scanner.nextInt();
                    urun.setRaf(rafNumarasi);
                    System.out.println("Ürün rafa koyuldu. Raf Numarası: " + urun.getRaf());
                    return;
                }

            }
            System.out.println("Ürün bulunamadı.");




            }
    private static void urunuRafiGuncelle(){
        System.out.print("Ürün ID'sini girin: ");
        int urunId =scanner.nextInt();

        for (Urun urun : urunler) {
            if (urun.getId() == urunId) {
                System.out.println("Lutfen yeni raf numarsi giriniz");
                int YenirafNumarasi = scanner.nextInt();
                urun.setRaf(YenirafNumarasi);
                System.out.println("Ürün rafa koyuldu. Raf Numarası: " + urun.getRaf());
                return;

            }
        }
    }

    private static void urunuRafi(){
        System.out.println("Urunleri raf koymak istiyorsaniz 1'e basiniz\nRaf numarasini guncellemek istiyorsaniz 2'ye basiniz\nLutfen yapmak istediginiz islemi seciniz");
        int raf1= scanner.nextInt();

        if (raf1==1){
            urunuRafaKoy();
        } else if (raf1==2) {
            urunuRafiGuncelle();
        }else {
            System.out.println("Girdiginiz rakam yanlis! lutfen yapmak istediginiz isleme gore bir rakam seciniz");
        }
    }




        private static void urunCikisi() {
            System.out.print("Ürün ID'sini girin: ");
            int urunId = scanner.nextInt();

            for (Urun urun : urunler) {
                if (urun.getId() == urunId) {
                    System.out.print("Çıkış miktarını girin: ");
                    int cikisMiktari = scanner.nextInt();
                    int yeniMiktar = urun.getMiktar() - cikisMiktari;

                    if (yeniMiktar < 0) {
                        System.out.println("Çıkış miktarı mevcut miktarı aşamaz.");
                    } else {
                        urun.setMiktar(yeniMiktar);
                        System.out.println("Ürün çıkışı yapıldı. Yeni miktar: " + urun.getMiktar());
                    }
                    return;
                }
            }

            System.out.println("Ürün bulunamadı.");



        }


























    }



