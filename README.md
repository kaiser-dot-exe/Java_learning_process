### Java'ya Giriş ve Temel Yapılar

-----

### 1\. Değişkenler (Variables) ❌

**Değişkenler**, programınızda verileri depolamak için kullanılan bellek konumlarına verilen adlardır. Her değişkenin bir tipi (örneğin, tam sayı, ondalıklı sayı, metin) ve bir adı vardır.

**Püf Noktaları ve Best Practices:**

  * **Anlamlı İsimlendirme:** Değişken adları, ne işe yaradıklarını açıkça belirtmeli (`kullaniciYasi`, `toplamFiyat` gibi).
  * **Küçük Harfle Başlama (CamelCase):** Değişken isimleri küçük harfle başlar ve her yeni kelimenin ilk harfi büyük yazılır (örneğin `ilkDeger`, `urunAdi`).
  * **Sabitler (Constants):** Değeri değişmeyecekse `final` anahtar kelimesiyle sabit olarak tanımlayın. Sabit isimleri genellikle tamamen büyük harfle yazılır (`MAX_HIZ`).

<!-- end list -->

```java
int yas = 30; // Tam sayı
double fiyat = 99.99; // Ondalıklı sayı
String ad = "Ahmet"; // Metin
boolean aktifMi = true; // Mantıksal değer
```

-----

### 2\. İki Değişkeni Takas Etme (Swap Two Variables) 💱

İki değişkenin değerlerini birbiriyle değiştirmek için geçici bir üçüncü değişkene ihtiyaç duyarsınız.

**Püf Noktaları ve Best Practices:**

  * **Geçici Değişken:** Bu, değerleri kaybetmeden takas yapmanın en yaygın ve okunabilir yoludur.

<!-- end list -->

```java
int a = 5;
int b = 10;
int temp; // Geçici değişken

temp = a; // temp şimdi 5
a = b;    // a şimdi 10
b = temp; // b şimdi 5

System.out.println("a: " + a + ", b: " + b); // Çıktı: a: 10, b: 5
```

-----

### 3\. Kullanıcıdan Girdi Alma (User Input) ⌨️

Java'da kullanıcıdan klavye aracılığıyla girdi almak için genellikle `java.util.Scanner` sınıfı kullanılır.

**Püf Noktaları ve Best Practices:**

  * **`Scanner` Kapatma:** İşiniz bittiğinde `Scanner` nesnesini `close()` metodu ile kapatmayı unutmayın. Bu, kaynak sızıntılarını önler.
  * **`nextLine()` Sorunu:** `nextInt()`, `nextDouble()` gibi metotlardan sonra `nextLine()` kullanırken dikkatli olun. Sayısal metotlar satır sonu karakterini (`\n`) bırakır, bu da `nextLine()`'ın boş bir satır okumasına neden olabilir. Bunu aşmak için fazladan bir `input.nextLine()` çağrısı yapabilirsiniz.
  * **Hata Yakalama:** Kullanıcının yanlış türde girdi vermesi durumunda (`InputMismatchException`) programınızın çökmemesi için `try-catch` blokları kullanın.

<!-- end list -->

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Adınızı girin: ");
String ad = input.nextLine(); // Satırın tamamını okur
System.out.print("Yaşınızı girin: ");
int yas = input.nextInt(); // Tam sayı okur
input.nextLine(); // Tampondaki satır sonu karakterini temizler
System.out.println("Merhaba " + ad + ", yaşınız " + yas);
input.close();
```

-----

### 4\. İfadeler (Expressions) 🧮

İfadeler, değer üreten bir dizi değişken, operatör ve metot çağrısıdır. Matematiksel işlemler, mantıksal karşılaştırmalar gibi birçok yerde kullanılırlar.

**Püf Noktaları ve Best Practices:**

  * **Anlaşılırlık:** Karmaşık ifadeleri parantezler kullanarak veya ara değişkenler tanımlayarak daha anlaşılır hale getirin.
  * **Veri Tipi Dönüşümü (Type Casting):** Farklı veri tipleri arasındaki işlemlerde dikkatli olun ve gerektiğinde açık tip dönüşümü (`(int)`) kullanın.

<!-- end list -->

```java
int x = 10;
int y = 5;
int toplam = x + y; // x + y bir ifadedir
boolean esitMi = (x == y); // (x == y) bir ifadedir
double ortalama = (double)toplam / 2; // (double)toplam / 2 bir ifadedir
```

-----

### 5\. GUI'ye Giriş (GUI Intro) 🚩

**GUI (Graphical User Interface - Grafik Kullanıcı Arayüzü)**, kullanıcıların bir programla görsel öğeler (düğmeler, metin kutuları, pencereler vb.) aracılığıyla etkileşim kurmasını sağlayan bir arayüzdür. Java'da GUI geliştirmek için genellikle **Swing** veya **JavaFX** kütüphaneleri kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Ayırma (Separation of Concerns):** GUI kodunu iş mantığından ayrı tutmaya çalışın. Bu, kodunuzu daha modüler ve test edilebilir hale getirir.
  * **Olay Yönelimli Programlama:** GUI uygulamaları olay yönelimlidir. Kullanıcı bir düğmeye tıkladığında veya bir metin kutusuna yazdığında, belirli olaylar tetiklenir ve bu olayları dinleyen kod çalışır.

<!-- end list -->

```java
import javax.swing.JFrame; // Pencere oluşturmak için
import javax.swing.JLabel; // Metin etiketi için

public class BasitGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Yeni bir pencere (çerçeve) oluştur
        frame.setTitle("Merhaba GUI"); // Pencerenin başlığını ayarla
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kapatma düğmesine basıldığında uygulamayı sonlandır
        frame.setSize(400, 300); // Pencerenin boyutunu ayarla
        frame.setVisible(true); // Pencereyi görünür yap

        JLabel label = new JLabel("Merhaba Dünya!"); // Bir etiket oluştur
        frame.add(label); // Etiketi pencereye ekle
    }
}
```

-----

### 6\. Math Sınıfı (Math Class) 📐

Java'daki `java.lang.Math` sınıfı, matematiksel işlemler için statik metotlar ve sabitler sağlar. `Math.PI`, `Math.E` gibi sabitler ve `Math.sqrt()`, `Math.pow()`, `Math.max()` gibi metotlar içerir.

**Püf Noktaları ve Best Practices:**

  * **Statik Metotlar:** `Math` sınıfındaki tüm metotlar statiktir, yani bir `Math` nesnesi oluşturmanıza gerek kalmadan doğrudan sınıf adıyla çağırabilirsiniz (`Math.sqrt(25)` gibi).
  * **Double Döndürür:** Çoğu `Math` metodu `double` tipi döndürür, bu yüzden tam sayı sonuç bekliyorsanız tip dönüşümü yapmanız gerekebilir.

<!-- end list -->

```java
double x = 3.14;
double y = 10;

double karekok = Math.sqrt(y); // 10'un karekökü
double usAlma = Math.pow(x, 2); // x'in karesi
double enBuyuk = Math.max(x, y); // x ve y'den büyük olanı
double enKucuk = Math.min(x, y); // x ve y'den küçük olanı
double mutlakDeger = Math.abs(-5); // -5'in mutlak değeri
double yuvarla = Math.round(4.7); // En yakın tam sayıya yuvarlar (5)
double taban = Math.floor(4.7); // Aşağı yuvarlar (4.0)
double tavan = Math.ceil(4.3); // Yukarı yuvarlar (5.0)

System.out.println("Karekök: " + karekok);
System.out.println("Üs Alma: " + usAlma);
System.out.println("En Büyük: " + enBuyuk);
```

-----

### 7\. Rastgele Sayılar (Random Numbers) 🎲

Java'da rastgele sayılar üretmek için `java.util.Random` sınıfı kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Tekrarlanabilirlik (Seed):** `Random` nesnesini bir "seed" değeriyle başlatırsanız (örneğin `new Random(123)`), her çalıştırdığınızda aynı rastgele sayı dizisini elde edersiniz. Testler için faydalıdır. Varsayılan olarak zamanı seed olarak kullanır.
  * **Sınırlandırma:** Rastgele sayıları belirli bir aralıkta üretmek için modulo (`%`) operatörünü veya `nextInt(üstSınır)` metodunu kullanabilirsiniz. `nextInt(10)` 0 ile 9 (dahil) arasında sayı üretir.

<!-- end list -->

```java
import java.util.Random;

Random random = new Random();

int rastgeleTamSayi = random.nextInt(); // Tüm int aralığında
int rastgele100eKadar = random.nextInt(100); // 0-99 arası
int rastgele1den10aKadar = random.nextInt(10) + 1; // 1-10 arası
double rastgeleDouble = random.nextDouble(); // 0.0 (dahil) ile 1.0 (hariç) arası

System.out.println("Rastgele tam sayı: " + rastgeleTamSayi);
System.out.println("0-99 arası rastgele: " + rastgele100eKadar);
System.out.println("1-10 arası rastgele: " + rastgele1den10aKadar);
```

-----

### 8\. If İfadeleri (If Statements) 🚧

`if` ifadeleri, belirli bir koşulun doğru olup olmadığına bağlı olarak kod bloklarını çalıştırmak için kullanılır. `else if` ve `else` ile bir dizi koşulu kontrol edebilirsiniz.

**Püf Noktaları ve Best Practices:**

  * **Blok Kullanımı:** Tek bir ifade bile olsa, `if`, `else if`, `else` bloklarında süslü parantez `{}` kullanmak her zaman iyi bir pratiktir. Bu, kodun okunabilirliğini artırır ve gelecekte kod eklendiğinde hataları önler.
  * **Ternary Operatör:** Basit `if-else` durumları için ternary operatör (`koşul ? değer1 : değer2`) kullanılabilir.

<!-- end list -->

```java
int yas = 18;
if (yas >= 18) {
    System.out.println("Oy kullanabilir.");
} else if (yas >= 16) {
    System.out.println("Ehliyet alabilir ama oy kullanamaz.");
} else {
    System.out.println("Henüz reşit değil.");
}
```

-----

### 9\. Switch İfadeleri (Switches) ⬇

`switch` ifadesi, bir değişkenin birden fazla olası değerine karşı tek bir ifadeyi kontrol etmek için kullanılır. `if-else if` zincirine alternatif olabilir ve özellikle çok sayıda eşitlik kontrolü yaparken daha okunabilir bir yapı sunar.

**Püf Noktaları ve Best Practices:**

  * **`break` Kullanımı:** Her `case` bloğunun sonunda `break` anahtar kelimesini kullanmayı unutmayın. Aksi takdirde, eşleşen `case`'den sonraki tüm `case` blokları da çalıştırılır (`fall-through`).
  * **`default` Bloğu:** Hiçbir `case` ile eşleşmediğinde çalışacak bir `default` bloğu eklemek iyi bir pratiktir.
  * **Sınırlamalar:** `switch` ifadeleri `String`, `int`, `char`, `byte`, `short`, `enum` ve `Character`, `Byte`, `Short`, `Integer` gibi wrapper sınıfları ile kullanılabilir. `long`, `float`, `double` veya `boolean` ile kullanılamaz.

<!-- end list -->

```java
char not = 'B';
switch (not) {
    case 'A':
        System.out.println("Çok İyi!");
        break;
    case 'B':
        System.out.println("İyi!");
        break;
    case 'C':
        System.out.println("Orta.");
        break;
    default:
        System.out.println("Geçersiz Not.");
}
```

-----

### 10\. Mantıksal Operatörler (Logical Operators) ❗

Mantıksal operatörler, birden fazla koşulu birleştirmek veya tersine çevirmek için kullanılır.

  * `&&` (AND): Her iki koşul da doğruysa `true` döner.
  * `||` (OR): Koşullardan herhangi biri doğruysa `true` döner.
  * `!` (NOT): Bir koşulun mantıksal tersini alır.

**Püf Noktaları ve Best Practices:**

  * **Kısa Devre Değerlendirme (Short-Circuit Evaluation):** `&&` ve `||` operatörleri kısa devre değerlendirme yapar. `&&` için ilk koşul yanlışsa, ikinci koşul değerlendirilmez. `||` için ilk koşul doğruysa, ikinci koşul değerlendirilmez. Bu, performans artışı sağlayabilir ve null pointer istisnalarını önlemeye yardımcı olabilir.

<!-- end list -->

```java
int sicaklik = 25;
boolean gunesliMi = true;

if (sicaklik > 20 && gunesliMi) {
    System.out.println("Hava güzel.");
}

if (sicaklik < 0 || sicaklik > 30) {
    System.out.println("Aşırı sıcak veya soğuk.");
}

boolean yagmurluDegil = !false; // true döner
```

-----

### Döngüler ve Koleksiyonlar

-----

### 11\. While Döngüsü (While Loop) 🔄

`while` döngüsü, belirli bir koşul doğru olduğu sürece bir kod bloğunu tekrarlamak için kullanılır. Döngüye girmeden önce koşul kontrol edilir.

**Püf Noktaları ve Best Practices:**

  * **Sonsuz Döngüden Kaçınma:** Döngü koşulunun bir noktada yanlış olacağından emin olun, aksi takdirde sonsuz döngüye girersiniz. Döngü içinde koşulu etkileyecek bir ifade bulunmalıdır.
  * **`break` ve `continue`:** `break` anahtar kelimesi ile döngüyü anında sonlandırabilir, `continue` anahtar kelimesi ile döngünün o anki iterasyonunu atlayıp bir sonrakine geçebilirsiniz. Ancak bu anahtar kelimeleri dikkatli kullanın, kodu karmaşıklaştırabilirler.

<!-- end list -->

```java
int sayac = 0;
while (sayac < 5) {
    System.out.println("Sayac: " + sayac);
    sayac++; // Koşulu güncelliyoruz
}
```

-----

### 12\. For Döngüsü (For Loop) ➰

`for` döngüsü, belirli bir sayıda tekrar edeceğiniz durumlarda veya diziler üzerinde gezinirken tercih edilir. Başlatma, koşul ve artırma/azaltma ifadelerini tek bir satırda toplar.

**Püf Noktaları ve Best Practices:**

  * **Net İfade:** `for` döngüsü, döngünün kaç kez çalışacağını baştan belirtmek için idealdir.
  * **Başlatma ve Artırma:** Döngü değişkeninin doğru şekilde başlatıldığından ve her iterasyonda doğru şekilde güncellendiğinden emin olun.

<!-- end list -->

```java
for (int i = 0; i < 5; i++) {
    System.out.println("İterasyon: " + i);
}

// Tersten sayma
for (int i = 5; i > 0; i--) {
    System.out.println("Geri sayım: " + i);
}
```

-----

### 13\. İç İçe Döngüler (Nested Loops) ➿

Bir döngünün içine başka bir döngü yerleştirildiğinde iç içe döngüler oluşur. Genellikle iki boyutlu yapılarla (örneğin matrisler) çalışırken veya her bir dış döngü iterasyonu için bir iç döngünün tamamının çalışması gerektiğinde kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Performans:** İç içe döngüler performans açısından maliyetli olabilir, özellikle büyük veri kümeleriyle çalışırken. İç döngüdeki işlem sayısını minimumda tutmaya çalışın.
  * **Okunabilirlik:** Çok fazla iç içe döngü, kodu karmaşık ve okunması zor hale getirebilir. Mümkünse metotlara ayırın.

<!-- end list -->

```java
for (int i = 1; i <= 3; i++) { // Dış döngü
    for (int j = 1; j <= 3; j++) { // İç döngü
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println(); // Her dış döngü sonrası yeni satır
}
/* Çıktı:
(1,1) (1,2) (1,3)
(2,1) (2,2) (2,3)
(3,1) (3,2) (3,3)
*/
```

-----

### 14\. Diziler (Arrays) 🚗

Diziler, aynı türden birden fazla değeri tek bir değişken altında depolamak için kullanılan sabit boyutlu veri yapılarıdır. Dizilerin boyutu oluşturulduktan sonra değiştirilemez.

**Püf Noktaları ve Best Practices:**

  * **Sıfır Tabanlı İndeksleme:** Dizilerin elemanlarına 0'dan başlayarak indeks numaralarıyla erişilir. İlk eleman `[0]`, son eleman `[uzunluk - 1]`'dir.
  * **Sınırların Dışına Çıkma (ArrayIndexOutOfBoundsException):** Var olmayan bir indekse erişmeye çalışırsanız bu hatayı alırsınız. Döngülerde `array.length`'i doğru kullanın.
  * **Başlatma:** Dizi oluşturulurken varsayılan değerler atanır (sayılar için `0`, boolean için `false`, nesneler için `null`).

<!-- end list -->

```java
String[] arabalar = {"Volvo", "BMW", "Ford"}; // Dizi tanımlama ve başlatma
System.out.println(arabalar[0]); // İlk elemana erişim

int[] sayilar = new int[5]; // 5 elemanlı bir int dizisi oluşturma (hepsi 0 ile başlatılır)
sayilar[0] = 10;
sayilar[1] = 20;

System.out.println("Dizinin uzunluğu: " + arabalar.length);
```

-----

### 15\. 2 Boyutlu Diziler (2D Arrays) 🚚

2 boyutlu diziler, satırlar ve sütunlardan oluşan bir tablo veya matris gibi verileri depolamak için kullanılır. Aslında, dizilerin dizisidir.

**Püf Noktaları ve Best Practices:**

  * **İç İçe Döngüler:** 2D dizilerde gezinmek için genellikle iç içe döngüler kullanılır.
  * **Anlaşılırlık:** Karmaşık 2D dizilerle çalışırken görselleştirme veya küçük örneklerle test etme yardımcı olabilir.

<!-- end list -->

```java
String[][] sehirler = {
    {"İstanbul", "Ankara"},
    {"İzmir", "Bursa"}
};

System.out.println(sehirler[0][1]); // Çıktı: Ankara

// Tüm elemanları yazdırma
for (int i = 0; i < sehirler.length; i++) { // Satırlar için
    for (int j = 0; j < sehirler[i].length; j++) { // Sütunlar için
        System.out.print(sehirler[i][j] + " ");
    }
    System.out.println();
}
```

-----

### 16\. String Metotları (String Methods) 💬

`String` sınıfı, metin dizileriyle çalışmak için birçok kullanışlı metot sunar (örneğin, birleştirme, alt dize alma, karşılaştırma, arama, değiştirme).

**Püf Noktaları ve Best Practices:**

  * **Immutable (Değişmez):** String nesneleri Java'da değiştirilemezdir. Bir `String` metodu çağırdığınızda, mevcut `String` nesnesini değiştirmez, bunun yerine yeni bir `String` nesnesi döndürür.
  * **`equals()` vs. `==`:** String içeriklerini karşılaştırırken her zaman `equals()` metodunu kullanın. `==` operatörü bellek adreslerini (referansları) karşılaştırır.
  * **`null` Kontrolü:** String metotlarını çağırmadan önce String'in `null` olup olmadığını kontrol edin, aksi takdirde `NullPointerException` alırsınız.

<!-- end list -->

```java
String mesaj = "Merhaba Java!";
System.out.println("Uzunluk: " + mesaj.length()); // 13
System.out.println("Büyük harf: " + mesaj.toUpperCase()); // MERHABA JAVA!
System.out.println("Küçük harf: " + mesaj.toLowerCase()); // merhaba java!
System.out.println("Karakter var mı: " + mesaj.contains("Java")); // true
System.out.println("İlk 'a' indeksi: " + mesaj.indexOf('a')); // 3
System.out.println("Alt dize: " + mesaj.substring(8)); // Java!
System.out.println("Değiştir: " + mesaj.replace('a', 'e')); // Merhebe Jeve!
```

-----

### 17\. Wrapper Sınıfları (Wrapper Classes) 🎁

Wrapper sınıfları, ilkel veri tiplerini (örneğin `int`, `char`, `boolean`) nesne olarak sarmalamak (wrap) için kullanılır. Bu, ilkel tipleri koleksiyonlarda (ArrayList gibi) veya jenerik tiplerle kullanmak gerektiğinde faydalıdır.

  * `int` -\> `Integer`
  * `char` -\> `Character`
  * `boolean` -\> `Boolean`
  * `double` -\> `Double`
  * vb.

**Püf Noktaları ve Best Practices:**

  * **Otomatik Kutulama (Autoboxing/Unboxing):** Java 5'ten beri otomatik kutulama ve kutudan çıkarma özelliği vardır. Bu, ilkel bir tipi bir wrapper nesnesine veya tam tersine otomatik olarak dönüştürebileceği anlamına gelir. Bu, kodu daha temiz yapar ancak arka planda ne olduğunu anlamak önemlidir.
  * **Null Değer:** Wrapper sınıfları `null` değerini tutabilirken, ilkel tipler tutamaz. Bu, dikkatli olunmazsa `NullPointerException`'a yol açabilir.

<!-- end list -->

```java
Integer sayiObj = 10; // Autoboxing: int'ten Integer'a otomatik dönüşüm
int sayiPrimitif = sayiObj; // Unboxing: Integer'dan int'e otomatik dönüşüm

System.out.println(sayiObj);
System.out.println(sayiPrimitif);

// Wrapper sınıfları, ilkel tiplere ek metotlar da sağlar
String s = "123";
int parseEdilenSayi = Integer.parseInt(s); // String'i int'e dönüştürme
System.out.println(parseEdilenSayi + 1); // 124
```

-----

### 18\. ArrayList (Dinamik Dizi) 🧾

`ArrayList`, dizilere benzer şekilde elemanları depolayan, ancak boyutu dinamik olarak değişebilen bir koleksiyon sınıfıdır. `java.util` paketinde bulunur.

**Püf Noktaları ve Best Practices:**

  * **Dinamik Boyut:** Eleman ekledikçe veya çıkardıkça boyutu otomatik olarak ayarlanır.
  * **Sadece Nesneler:** `ArrayList` yalnızca nesneleri depolayabilir. İlkel tipleri depolamak istiyorsanız, ilgili wrapper sınıflarını kullanmanız gerekir (örneğin, `ArrayList<Integer>`).
  * **Erişim Hızı:** Elemanlara indeks ile erişim (get) hızlıdır, ancak araya eleman ekleme veya çıkarma daha yavaş olabilir çünkü diğer elemanların kaydırılması gerekebilir.

<!-- end list -->

```java
import java.util.ArrayList;

ArrayList<String> yemekler = new ArrayList<>(); // String türünde ArrayList

yemekler.add("Pizza"); // Eleman ekleme
yemekler.add("Hamburger");
yemekler.add("Salata");

System.out.println(yemekler.get(0)); // İlk elemana erişim: Pizza
yemekler.set(1, "Sushi"); // İkinci elemanı değiştirme

yemekler.remove(2); // Üçüncü elemanı silme (Salata)

System.out.println("ArrayList boyutu: " + yemekler.size()); // 2

for (String yemek : yemekler) { // For-each döngüsü ile gezinme
    System.out.println(yemek);
}
```

-----

### 19\. 2 Boyutlu ArrayList (2D ArrayList) 📜

2 boyutlu dizilere benzer şekilde, 2 boyutlu `ArrayList`ler de satırlar ve sütunlar halinde verileri tutar. Temel olarak, `ArrayList`'lerin `ArrayList`'idir.

**Püf Noktaları ve Best Practices:**

  * **Esneklik:** Normal 2D dizilere göre daha esnektir çünkü hem ana `ArrayList`'in hem de iç `ArrayList`'lerin boyutu dinamik olarak değişebilir.
  * **Kullanım Senaryoları:** Satır ve sütun sayısının önceden bilinmediği veya çalışma zamanında değişebileceği durumlarda idealdir.

<!-- end list -->

```java
import java.util.ArrayList;

ArrayList<ArrayList<String>> marketListesi = new ArrayList<>();

ArrayList<String> meyveler = new ArrayList<>();
meyveler.add("Elma");
meyveler.add("Muz");

ArrayList<String> sebzeler = new ArrayList<>();
sebzeler.add("Domates");
sebzeler.add("Salatalık");

marketListesi.add(meyveler); // Ana ArrayList'e iç ArrayList'leri ekleme
marketListesi.add(sebzeler);

System.out.println(marketListesi.get(0).get(1)); // Meyvelerin 2. elemanı: Muz

for (ArrayList<String> kategori : marketListesi) {
    for (String urun : kategori) {
        System.out.print(urun + " ");
    }
    System.out.println();
}
```

-----

### 20\. For-Each Döngüsü (Enhanced For Loop) 🔃

For-each döngüsü (veya geliştirilmiş for döngüsü), diziler ve koleksiyonlar (ArrayList gibi) üzerinde gezinmenin daha basit ve okunabilir bir yoludur. İndekslere ihtiyacınız olmadığında kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Basitlik:** İndeksleri yönetme ihtiyacını ortadan kaldırır, bu da kodu daha temiz yapar.
  * **Değişim Yok:** For-each döngüsü ile koleksiyonun elemanlarını doğrudan değiştiremezsiniz (sadece değerlerini okuyabilirsiniz). Elemanları değiştirmek veya kaldırmak için geleneksel `for` döngüsünü kullanmanız gerekir.

<!-- end list -->

```java
String[] isimler = {"Ali", "Ayşe", "Mehmet"};

for (String isim : isimler) { // Her isim için
    System.out.println(isim);
}

ArrayList<Integer> sayilar = new ArrayList<>();
sayilar.add(10);
sayilar.add(20);

for (int sayi : sayilar) { // Her sayi için (autoboxing/unboxing)
    System.out.println(sayi);
}
```

-----

### Metotlar ve OOP Temelleri

-----

### 21\. Metotlar (Methods) 📞

Metotlar (diğer dillerde fonksiyon olarak da bilinir), belirli bir görevi yerine getiren adlandırılmış kod bloklarıdır. Kod tekrarını azaltır, kodun modülerliğini ve okunabilirliğini artırır.

**Püf Noktaları ve Best Practices:**

  * **Tek Sorumluluk Prensibi (SRP):** Her metot tek bir iyi tanımlanmış görevi yerine getirmelidir.
  * **Anlamlı İsimler:** Metot isimleri, metodun ne yaptığını açıkça belirtmelidir (örneğin `hesaplaOrtalama`, `veriKaydet`).
  * **Parametre Sayısı:** Çok fazla parametresi olan metotlardan kaçının. Bu, metodu karmaşık hale getirebilir.
  * **Dönüş Tipi:** Metodun döndüreceği değerin tipini belirtir (`void` ise değer döndürmez).

<!-- end list -->

```java
public class MyMethods {

    // Parametre almayan ve değer döndürmeyen metot
    public static void selamVer() {
        System.out.println("Merhaba!");
    }

    // Parametre alan ve int değer döndüren metot
    public static int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        selamVer(); // Metodu çağır
        int sonuc = topla(5, 3);
        System.out.println("Toplam: " + sonuc);
    }
}
```

-----

### 22\. Aşırı Yüklenmiş Metotlar (Overloaded Methods) ☎️

Aşırı yüklenmiş metotlar, aynı sınıf içinde **aynı isme sahip** ancak **farklı parametre listelerine** (parametre sayısı, parametre tipleri veya parametrelerin sırası) sahip metotlardır. Bu, aynı işlevi farklı veri tipleri veya argümanlarla gerçekleştirmek için esneklik sağlar.

**Püf Noktaları ve Best Practices:**

  * **Mantıksal Tutarlılık:** Aşırı yüklenmiş metotların benzer bir işlevi yerine getirdiğinden emin olun.
  * **Dönüş Tipi Tek Başına Yeterli Değil:** Yalnızca dönüş tipi farklı olan metotlar aşırı yüklenmiş sayılmaz ve derleyici hatası verir.

<!-- end list -->

```java
public class Hesaplayici {
    public int topla(int a, int b) {
        return a + b;
    }

    public double topla(double a, double b) { // Parametre tipleri farklı
        return a + b;
    }

    public int topla(int a, int b, int c) { // Parametre sayısı farklı
        return a + b + c;
    }

    public static void main(String[] args) {
        Hesaplayici h = new Hesaplayici();
        System.out.println(h.topla(5, 10)); // int topla(int, int)
        System.out.println(h.topla(5.5, 10.2)); // double topla(double, double)
        System.out.println(h.topla(1, 2, 3)); // int topla(int, int, int)
    }
}
```

-----

### 23\. Printf Metodu (Printf) 🖨️

`System.out.printf()` metodu, C dilindeki `printf`'e benzer şekilde, formatlanmış çıktı üretmek için kullanılır. Metinleri, sayıları ve diğer veri tiplerini belirli bir formatta yazdırmak için format belirleyiciler (%s, %d, %f vb.) kullanır.

**Püf Noktaları ve Best Practices:**

  * **Format Belirleyiciler:**
      * `%s`: String
      * `%d`: Ondalıklı tam sayı (decimal integer)
      * `%f`: Ondalıklı sayı (floating-point)
      * `%c`: Karakter (character)
      * `%b`: Boolean
  * **Genişlik ve Hassasiyet:** Sayıları belirli bir genişliğe hizalamak veya ondalıklı sayıların hassasiyetini belirlemek için kullanılabilir (örneğin, `%.2f` iki ondalık basamak).

<!-- end list -->

```java
String ad = "Ayşe";
int yas = 25;
double boy = 1.68;

System.out.printf("Ad: %s, Yaş: %d, Boy: %.2f metre.%n", ad, yas, boy);
// %n yeni satır karakteri ekler

// Sayıyı belirli bir genişliğe hizalama
System.out.printf("Sayı: %-10d %n", 123); // Sola hizalı, 10 karakter genişliğinde
System.out.printf("Sayı: %10d %n", 123);  // Sağa hizalı, 10 karakter genişliğinde
```

-----

### 24\. Final Anahtar Kelimesi (Final Keyword) ⛔

`final` anahtar kelimesi, bir şeyin sabit olduğunu veya değiştirilemeyeceğini belirtmek için kullanılır.

  * **Değişkenler:** Bir `final` değişkenin değeri bir kez atandıktan sonra değiştirilemez (sabit).
  * **Metotlar:** Bir `final` metot, alt sınıflar tarafından geçersiz kılınamaz (override edilemez).
  * **Sınıflar:** Bir `final` sınıf, miras alınamaz.

**Püf Noktaları ve Best Practices:**

  * **Sabitler için Kullanım:** Programınızdaki sabit değerleri (`Math.PI` gibi) tanımlamak için idealdir.
  * **Güvenlik ve Performans:** Metotları veya sınıfları `final` yapmak, kodun davranışını garanti eder ve bazen derleyici optimizasyonlarına olanak tanır.

<!-- end list -->

```java
final double PI = 3.14159;
// PI = 3.14; // Hata: final değişken değiştirilemez

class UstSinif {
    public final void sabitMetot() {
        System.out.println("Bu metot override edilemez.");
    }
}

class AltSinif extends UstSinif {
    // @Override
    // public void sabitMetot() { // Hata: final metot override edilemez
    //     System.out.println("Deneme");
    // }
}

// final class SabitSinif { /* ... */ }
// class Deneme extends SabitSinif { /* Hata: final sınıf miras alınamaz */ }
```

-----

### Nesne Yönelimli Programlama (OOP) Detayları

-----

### 25\. Nesneler (Objects - OOP) ☕

Nesne Yönelimli Programlama'nın (OOP) temel yapı taşıdır. Bir **nesne**, bir **sınıfın** somutlaştırılmış halidir. Sınıf bir "plan" veya "taslak" iken, nesne bu plandan oluşturulan gerçek bir "örnek"tir. Her nesne, sınıfının tanımladığı özelliklere (alanlara) ve davranışlara (metotlara) sahiptir.

**Püf Noktaları ve Best Practices:**

  * **Gerçek Dünya Modelini Yansıtma:** Nesneler, genellikle gerçek dünyadaki varlıkları veya kavramları modellemek için kullanılır (örneğin, bir `Araba` nesnesi, bir `Müşteri` nesnesi).
  * **`new` Anahtar Kelimesi:** Nesneler `new` anahtar kelimesi kullanılarak oluşturulur.

<!-- end list -->

```java
// Sınıf tanımı (plan)
class Kedi {
    String ad;
    String renk;

    void miyavla() {
        System.out.println(ad + " miyavlıyor!");
    }
}

public class NesneOrnegi {
    public static void main(String[] args) {
        // Nesne oluşturma (sınıfın somutlaştırılması)
        Kedi kedi1 = new Kedi(); // Yeni bir Kedi nesnesi oluşturuldu

        // Nesnenin özelliklerine erişim ve değer atama
        kedi1.ad = "Mırnav";
        kedi1.renk = "Siyah";

        // Nesnenin davranışlarını çağırma
        kedi1.miyavla(); // Mırnav miyavlıyor!

        Kedi kedi2 = new Kedi();
        kedi2.ad = "Tekir";
        kedi2.renk = "Gri";
        kedi2.miyavla(); // Tekir miyavlıyor!
    }
}
```

-----

### 26\. Kurucular (Constructors) 👷

**Kurucular**, bir sınıftan yeni bir nesne oluşturulduğunda otomatik olarak çağrılan özel metotlardır. Amaçları, yeni oluşturulan nesnenin alanlarını başlatmak ve nesneyi kullanılabilir hale getirmektir.

**Püf Noktaları ve Best Practices:**

  * **İsim Sınıfla Aynı:** Kurucunun adı sınıfın adıyla aynı olmalıdır.
  * **Dönüş Tipi Yok:** Kurucuların dönüş tipi yoktur ( `void` bile).
  * **Varsayılan Kurucu:** Bir kurucu tanımlamazsanız, Java sizin için parametresiz bir varsayılan kurucu ekler. Bir kurucu tanımlarsanız, varsayılan kurucu otomatik olarak eklenmez.
  * **`this` ve `super`:**
      * `this()`: Aynı sınıftaki başka bir kurucuyu çağırmak için kullanılır (kod tekrarını azaltır).
      * `super()`: Alt sınıf kurucusundan üst sınıfın kurucusunu çağırmak için kullanılır. Her ikisi de kurucunun ilk ifadesi olmalıdır.

<!-- end list -->

```java
class Film {
    String baslik;
    int yapimYili;

    // Parametreli Kurucu
    public Film(String baslik, int yapimYili) {
        this.baslik = baslik;
        this.yapimYili = yapimYili;
        System.out.println(baslik + " filmi oluşturuldu.");
    }

    // Parametresiz Kurucu (Aşırı yükleme)
    public Film() {
        // Püf Noktası: Başka bir kurucuyu çağırarak kod tekrarını önleriz
        this("Belirtilmemiş Film", 0);
        System.out.println("Parametresiz film oluşturuldu.");
    }

    public void bilgileriGoster() {
        System.out.println("Başlık: " + baslik + ", Yapım Yılı: " + yapimYili);
    }
}

public class KurucuKullanimi {
    public static void main(String[] args) {
        Film film1 = new Film("Yüzüklerin Efendisi", 2001);
        film1.bilgileriGoster();

        Film film2 = new Film(); // Parametresiz kurucu çağrılır
        film2.bilgileriGoster();
    }
}
```

-----

### 27\. Değişken Kapsamı (Variable Scope) 🌍

Değişkenin kapsamı, programın bir değişkenin erişilebilir olduğu bölgesini ifade eder. Java'da başlıca kapsamlar:

  * **Sınıf Kapsamı (Class/Instance Scope):** Sınıfın içinde, metotların dışında tanımlanır. Tüm metotlar tarafından erişilebilir. Nesneye aittir.
  * **Metot Kapsamı (Method Scope):** Bir metodun içinde tanımlanır. Sadece o metodun içinde erişilebilir.
  * **Blok Kapsamı (Block Scope):** Bir kod bloğunun (`if`, `for`, `while` gibi) içinde tanımlanır. Sadece o blok içinde erişilebilir.

**Püf Noktaları ve Best Practices:**

  * **Minimum Kapsam:** Değişkenleri ihtiyaç duyulduğu en dar kapsamda tanımlayın. Bu, kodun karmaşıklığını azaltır ve hataları önler.
  * **İsim Çakışmaları:** Farklı kapsamlardaki aynı isimli değişkenler kafa karışıklığına yol açabilir. Mümkün olduğunca benzersiz isimler kullanın.

<!-- end list -->

```java
public class KapsamOrnegi {
    String sinifDegiskeni = "Ben bir sınıf değişkeniyim."; // Sınıf kapsamı

    public void metotA() {
        String metotDegiskeni = "Ben bir metot değişkeniyim."; // Metot kapsamı
        System.out.println(sinifDegiskeni);
        System.out.println(metotDegiskeni);

        if (true) {
            String blokDegiskeni = "Ben bir blok değişkeniyim."; // Blok kapsamı
            System.out.println(blokDegiskeni);
        }
        // System.out.println(blokDegiskeni); // Hata: blok dışında erişilemez
    }

    public void metotB() {
        System.out.println(sinifDegiskeni);
        // System.out.println(metotDegiskeni); // Hata: metotA'ya ait
    }

    public static void main(String[] args) {
        KapsamOrnegi ornek = new KapsamOrnegi();
        ornek.metotA();
    }
}
```

-----

### 28\. Aşırı Yüklenmiş Kurucular (Overloaded Constructors) 🍕

Bir sınıfın birden fazla kurucusu olabilir, her biri farklı parametre listelerine sahiptir. Bu, nesneleri farklı başlangıç koşullarıyla veya farklı bilgilerle başlatma esnekliği sağlar.

**Püf Noktaları ve Best Practices:**

  * **`this()` ile Zincirleme:** Kurucu aşırı yüklemesi yaparken, genellikle en fazla parametre alan kurucuyu temel alarak diğer kurucuları `this()` anahtar kelimesiyle zincirlemek iyi bir pratiktir. Bu, kod tekrarını azaltır ve bakımı kolaylaştırır.

<!-- end list -->

```java
class Pizza {
    String sos;
    String peynir;
    String et;
    String sebze;

    // Tam parametreli kurucu
    public Pizza(String sos, String peynir, String et, String sebze) {
        this.sos = sos;
        this.peynir = peynir;
        this.et = et;
        this.sebze = sebze;
        System.out.println("Özel pizza hazırlandı!");
    }

    // Sadece sos ve peynir ile kurucu
    public Pizza(String sos, String peynir) {
        this(sos, peynir, "Yok", "Yok"); // Diğer kurucuyu çağırarak et ve sebzeyi varsayılan yapar
        System.out.println("Standart pizza hazırlandı!");
    }

    // Sadece sos ile kurucu
    public Pizza(String sos) {
        this(sos, "Mozzarella"); // Diğer kurucuyu çağırarak peyniri varsayılan yapar
        System.out.println("Soslu pizza hazırlandı!");
    }

    public void bilgileriGoster() {
        System.out.println("Pizza içeriği: " + sos + " sos, " + peynir + " peynir, " + et + " et, " + sebze + " sebze.");
    }
}

public class OverloadedConstructorsOrnegi {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Domates", "Mozzarella", "Sucuk", "Mantar");
        pizza1.bilgileriGoster();

        Pizza pizza2 = new Pizza("Pesto", "Parmesan");
        pizza2.bilgileriGoster();

        Pizza pizza3 = new Pizza("Barbekü");
        pizza3.bilgileriGoster();
    }
}
```

-----

### 29\. toString Metodu (toString method) 🎉

`toString()` metodu, bir nesnenin metinsel (String) temsilini döndüren özel bir metottur. Her Java sınıfı `Object` sınıfından miras aldığı için bu metoda sahiptir. Varsayılan implementasyon anlamsızdır, bu yüzden genellikle kendi sınıflarımızda bu metodu geçersiz kılarız.

**Püf Noktaları ve Best Practices:**

  * **Hata Ayıklama ve Loglama:** En sık kullanım alanı, nesnenin durumunu hızlıca görüntülemek ve hata ayıklama sırasında veya log kayıtlarında nesne verilerini görmek için kullanılır.
  * **`@Override`:** Metodu geçersiz kılarken `@Override` anotasyonunu kullanın.
  * **Tüm İlgili Alanlar:** Nesnenin durumunu en iyi yansıtacak şekilde tüm önemli alanları çıktısına dahil edin.
  * **Otomatik Çağrı:** Bir nesneyi `System.out.println()` içine koyduğunuzda, Java otomatik olarak o nesnenin `toString()` metodunu çağırır.

<!-- end list -->

```java
class Ogrenci {
    String ad;
    int numara;
    String bolum;

    public Ogrenci(String ad, int numara, String bolum) {
        this.ad = ad;
        this.numara = numara;
        this.bolum = bolum;
    }

    @Override // Metodu geçersiz kılıyoruz
    public String toString() {
        return "Ogrenci [Ad=" + ad + ", Numara=" + numara + ", Bölüm=" + bolum + "]";
    }
}

public class ToStringKullanimi {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Deniz", 123, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Emre", 456, "Makine Mühendisliği");

        // toString() metodu otomatik olarak çağrılır
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
    }
}
```

-----

### 30\. Nesne Dizileri (Array of Objects) 🍱

Diziler sadece ilkel tipleri değil, aynı zamanda nesneleri de depolayabilir. Nesnelerden oluşan bir dizi, her bir elemanı belirli bir sınıfın nesnesi olan bir koleksiyondur.

**Püf Noktaları ve Best Practices:**

  * **Referanslar Depolanır:** Bir nesne dizisi aslında nesnelerin kendisini değil, o nesnelere olan referansları depolayan bir dizidir.
  * **Her Elemanı Başlatma:** Diziyi oluşturduktan sonra, her bir elemanı `new` anahtar kelimesiyle ayrı ayrı başlatmayı unutmayın, aksi takdirde başlangıçta tüm elemanlar `null` olacaktır.

<!-- end list -->

```java
class Film {
    String baslik;
    int yapimYili;

    public Film(String baslik, int yapimYili) {
        this.baslik = baslik;
        this.yapimYili = yapimYili;
    }

    @Override
    public String toString() {
        return baslik + " (" + yapimYili + ")";
    }
}

public class NesneDizisiOrnegi {
    public static void main(String[] args) {
        // 3 Film nesnesi depolayacak bir dizi oluştur
        Film[] filmler = new Film[3];

        // Her dizi elemanı için Film nesnesi oluştur ve ata
        filmler[0] = new Film("Inception", 2010);
        filmler[1] = new Film("Interstellar", 2014);
        filmler[2] = new Film("Dune", 2021);

        // Dizideki filmleri yazdır
        for (Film film : filmler) {
            System.out.println(film); // toString() metodu çağrılır
        }
    }
}
```

-----

### 31\. Nesne Geçirme (Object Passing) 🏬

Metotlara parametre olarak nesneler geçirebilirsiniz. Java'da tüm parametreler **değerle geçirilir (pass-by-value)**. Ancak nesneler için bu, nesnenin referansının değerinin kopyalanması anlamına gelir. Yani, metodun içinde nesne üzerinde yapılan değişiklikler, orijinal nesneyi de etkiler.

**Püf Noktaları ve Best Practices:**

  * **Referans Kopyalanır:** Metot içindeki nesne referansı, orijinal nesnenin kopyasıdır. Bu, metot içinde referansı başka bir nesneye atarsanız orijinal nesnenin değişmeyeceği anlamına gelir, ancak referansın işaret ettiği nesnenin içeriğini değiştirirseniz orijinal nesne de değişir.
  * **`final` Parametreler:** Bir nesne parametresini `final` olarak işaretlemek, metot içinde bu parametrenin başka bir nesneye atanmasını engeller, ancak nesnenin iç durumunun değiştirilmesine engel olmaz.

<!-- end list -->

```java
class Kalem {
    String renk;

    public Kalem(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Kalem Rengi: " + renk;
    }
}

public class NesneGecirmeOrnegi {

    public static void rengiDegistir(Kalem kalemNesnesi, String yeniRenk) {
        System.out.println("Metot içinde - Önce: " + kalemNesnesi);
        kalemNesnesi.renk = yeniRenk; // Nesnenin içeriğini değiştiriyoruz
        System.out.println("Metot içinde - Sonra: " + kalemNesnesi);
    }

    public static void main(String[] args) {
        Kalem kirmiziKalem = new Kalem("Kırmızı");
        System.out.println("Ana metot - Önce: " + kirmiziKalem);

        rengiDegistir(kirmiziKalem, "Mavi"); // Nesneyi metoda geçirme

        System.out.println("Ana metot - Sonra: " + kirmiziKalem); // Kırmızı kalem şimdi Mavi
    }
}
```

-----

### 32\. Static Anahtar Kelimesi (Static Keyword) ⚡

`static` anahtar kelimesi, bir sınıfın üyelerinin (alanlar, metotlar, iç sınıflar) bir nesneye değil, **sınıfın kendisine ait** olduğunu belirtir. Statik üyeler, sınıf adıyla doğrudan erişilebilir ve bir nesne oluşturulmasını gerektirmez.

**Püf Noktaları ve Best Practices:**

  * **Sınıf Düzeyi:** Statik üyeler tüm nesneler arasında paylaşılır. Bir statik alanın değeri değişirse, bu değişiklik tüm nesneler için geçerli olur.
  * **Nesne Erişimi:** Statik metotlar, doğrudan bir nesnenin alanlarına (statik olmayan alanlara) erişemezler, çünkü bir nesneye bağlı değildirler.
  * **Faydaları:** Yardımcı metotlar (örneğin `Math.sqrt()`), sabitler (`Math.PI`), ve tüm örnekler arasında paylaşılması gereken veriler için idealdir.

<!-- end list -->

```java
class HesapMakinesi {
    static int islemSayisi = 0; // Statik alan: tüm HesapMakinesi nesneleri arasında paylaşılır

    public static int topla(int a, int b) { // Statik metot
        islemSayisi++; // Statik alanı değiştirebilir
        return a + b;
    }

    public void ornekMetot() {
        // System.out.println(islemSayisi); // Statik alana erişebilir
        // System.out.println(topla(1, 2)); // Statik metodu çağırabilir
    }
}

public class StaticKullanimi {
    public static void main(String[] args) {
        // Statik metot ve alana doğrudan sınıf adıyla erişim
        System.out.println("Toplam: " + HesapMakinesi.topla(10, 20));
        System.out.println("İşlem Sayısı: " + HesapMakinesi.islemSayisi);

        HesapMakinesi.topla(5, 5);
        System.out.println("Yeni İşlem Sayısı: " + HesapMakinesi.islemSayisi);

        // Bir nesne üzerinden de erişilebilir (ancak tavsiye edilmez)
        HesapMakinesi h1 = new HesapMakinesi();
        HesapMakinesi h2 = new HesapMakinesi();
        System.out.println("H1 İşlem Sayısı: " + h1.islemSayisi); // Uyarı verebilir, ama çalışır
    }
}
```

-----

### 33\. Miras (Inheritance) 👪

Miras, bir sınıfın (alt sınıf/türetilmiş sınıf) başka bir sınıfın (üst sınıf/temel sınıf) özelliklerini ve davranışlarını **yeniden kullanma** yeteneğidir. `extends` anahtar kelimesiyle kullanılır. Kod tekrarını azaltır ve "bir türdür" (`is-a`) ilişkisini kurar.

**Püf Noktaları ve Best Practices:**

  * **"Is-A" İlişkisi:** Sadece mantıksal olarak "bir türdür" ilişkisi olduğunda miras kullanın (örn: "Araba bir Taşıt'tır").
  * **Tekli Miras:** Java'da bir sınıf sadece tek bir sınıftan miras alabilir (çoklu miras desteklenmez).
  * **`final` Sınıflar:** `final` olarak tanımlanan sınıflardan miras alınamaz.

<!-- end list -->

```java
// Üst Sınıf
class Tasit {
    double hiz;

    public Tasit(double hiz) {
        this.hiz = hiz;
    }

    public void hareketEt() {
        System.out.println("Taşıt " + hiz + " km/s hızla hareket ediyor.");
    }
}

// Alt Sınıf
class Araba extends Tasit { // Tasit sınıfından miras alır
    int kapiSayisi;

    public Araba(double hiz, int kapiSayisi) {
        super(hiz); // Üst sınıfın kurucusunu çağırır
        this.kapiSayisi = kapiSayisi;
    }

    public void kornaCal() {
        System.out.println("Düt düt!");
    }
}

public class MirasOrnegi {
    public static void main(String[] args) {
        Araba araba1 = new Araba(100, 4);
        araba1.hareketEt(); // Miras alınan metot
        araba1.kornaCal();   // Alt sınıfın kendi metodu
    }
}
```

-----

### 34\. Metot Geçersiz Kılma (Method Overriding) 🙅‍♂️

Metot geçersiz kılma (override), bir alt sınıfın, üst sınıftaki bir metodu kendi ihtiyacına göre **yeniden tanımlamasıdır**. Alt sınıf nesnesi üzerinden metot çağrıldığında, alt sınıftaki geçersiz kılınmış metot çalışır. Bu, çok biçimliliğin (polymorphism) bir parçasıdır.

**Püf Noktaları ve Best Practices:**

  * **`@Override` Notasyonu:** Metodu geçersiz kılarken mutlaka `@Override` anotasyonunu kullanın. Bu, olası yazım hatalarını veya imza uyuşmazlıklarını yakalar ve kodun niyetini açıkça belirtir.
  * **Aynı İmza:** Geçersiz kılınan metot, üst sınıftaki metotla aynı imzaya (isim, parametre sayısı ve tipleri) sahip olmalıdır.
  * **Erişim Belirleyici:** Geçersiz kılan metodun erişim belirleyicisi, geçersiz kılınan metodunkinden daha kısıtlayıcı olamaz (örneğin, `public` metodu `private` yapamazsınız).
  * **`super.metotAdı()`:** Alt sınıfta, üst sınıfın geçersiz kılınan metodunu çağırmak için `super.metotAdı()` kullanabilirsiniz.

<!-- end list -->

```java
class Hayvan {
    public void sesCikar() {
        System.out.println("Hayvan ses çıkarır.");
    }
}

class Kopek extends Hayvan {
    @Override // Metot geçersiz kılma
    public void sesCikar() {
        System.out.println("Hav hav!");
    }
}

class Kedi extends Hayvan {
    @Override
    public void sesCikar() {
        System.out.println("Miyav miyav!");
    }
}

public class MetotGecersizKilmaOrnegi {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Hayvan kopek = new Kopek(); // Polymorphism örneği
        Hayvan kedi = new Kedi();   // Polymorphism örneği

        hayvan.sesCikar(); // Hayvan ses çıkarır.
        kopek.sesCikar();  // Hav hav! (Köpek sınıfının metodu çalışır)
        kedi.sesCikar();   // Miyav miyav! (Kedi sınıfının metodu çalışır)
    }
}
```

-----

### 35\. Super Anahtar Kelimesi (Super Keyword) 🦸‍♂️

`super` anahtar kelimesi, bir alt sınıfta üst sınıfın üyelerine (metotlar, alanlar, kurucular) erişmek için kullanılır.

  * `super()`: Alt sınıf kurucusundan üst sınıfın kurucusunu çağırmak için kullanılır. Bu çağrı, alt sınıf kurucusunun ilk ifadesi olmalıdır.
  * `super.alanAdı`: Üst sınıftaki bir alana erişmek için kullanılır (eğer alt sınıfta aynı isimde bir alan varsa).
  * `super.metotAdı()`: Üst sınıftaki bir metodu çağırmak için kullanılır (özellikle metot geçersiz kılındığında üst sınıf implementasyonuna erişmek için).

**Püf Noktaları ve Best Practices:**

  * **Alanları Başlatma:** `super()` ile üst sınıf kurucusunu çağırmak, miras alınan alanların doğru şekilde başlatılmasını sağlar.
  * **Üst Sınıf Davranışı:** `super.metotAdı()` kullanarak, alt sınıfın kendi ek davranışını sunarken üst sınıfın orijinal davranışını da dahil edebilirsiniz.

<!-- end list -->

```java
class UstSinifA {
    int x;
    public UstSinifA(int x) {
        this.x = x;
        System.out.println("UstSinifA kurucusu çağrıldı.");
    }
    public void yazdir() {
        System.out.println("UstSinifA: x = " + x);
    }
}

class AltSinifA extends UstSinifA {
    int y;
    public AltSinifA(int x, int y) {
        super(x); // UstSinifA'nın kurucusunu çağırır
        this.y = y;
        System.out.println("AltSinifA kurucusu çağrıldı.");
    }

    @Override
    public void yazdir() {
        super.yazdir(); // UstSinifA'nın yazdir metodunu çağırır
        System.out.println("AltSinifA: y = " + y);
    }
}

public class SuperKullanimi {
    public static void main(String[] args) {
        AltSinifA obj = new AltSinifA(10, 20);
        obj.yazdir();
    }
}
```

-----

### 36\. Soyutlama (Abstraction) 👻

Soyutlama, bir nesnenin temel özelliklerini ve davranışlarını gösterirken, gereksiz uygulama detaylarını gizleme prensibidir. Karmaşıklığı azaltır ve bir sözleşme sağlar. Java'da `abstract` sınıflar ve `interface`'ler (arayüzler) aracılığıyla sağlanır.

  * **Soyut Sınıflar (`abstract class`):**

      * Nesnesi doğrudan oluşturulamazlar.
      * Hem soyut (gövdesiz) hem de somut (gövdeli) metotlar içerebilirler.
      * Soyut metotlar, alt sınıflar tarafından mutlaka implemente edilmelidir.
      * Genellikle ortak davranışları paylaşmak ve "is-a" ilişkisini kurmak için kullanılır.

  * **Arayüzler (`interface`):**

      * Tamamen soyuttur (Java 8 öncesi tüm metotlar `public abstract` idi).
      * Bir sınıf birden fazla arayüzü `implements` anahtar kelimesiyle uygulayabilir.
      * Genellikle bir sınıfın belirli bir "davranışsal sözleşmeye" uymasını sağlamak için kullanılır ("yapabilir" - "can do" ilişkisi).

**Püf Noktaları ve Best Practices:**

  * **Gereksiz Detayları Gizleme:** Kullanıcıların veya diğer geliştiricilerin bir bileşenin iç işleyişini bilmeden onu kullanmasını sağlar.
  * **`abstract` vs. `interface` Seçimi:**
      * Ortak kod veya durum paylaşımı gerekiyorsa `abstract` sınıf.
      * Çoklu davranış sözleşmeleri tanımlamak gerekiyorsa `interface`.

<!-- end list -->

```java
// Soyut Sınıf
abstract class Sekil {
    // Soyut metot (gövdesiz)
    public abstract double alanHesapla();
    // Somut metot (gövdeli)
    public void bilgiVer() {
        System.out.println("Bu bir şekildir.");
    }
}

// Somut Sınıf
class Daire extends Sekil {
    double yaricap;
    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }
    @Override
    public double alanHesapla() { // Soyut metodu implemente etme
        return Math.PI * yaricap * yaricap;
    }
}

// Arayüz
interface Calisabilen {
    void calis();
}

class Robot implements Calisabilen {
    @Override
    public void calis() {
        System.out.println("Robot çalışıyor.");
    }
}

public class SoyutlamaOrnegi {
    public static void main(String[] args) {
        // Sekil sekil = new Sekil(); // Hata: Soyut sınıfın nesnesi oluşturulamaz
        Daire daire = new Daire(5);
        System.out.println("Daire Alanı: " + daire.alanHesapla());
        daire.bilgiVer();

        Calisabilen robot = new Robot();
        robot.calis();
    }
}
```

-----

### 37\. Erişim Belirleyiciler (Access Modifiers) 🔒

Erişim belirleyiciler, sınıfların, metotların, alanların ve kurucuların başka sınıflardan ne kadar erişilebilir olduğunu kontrol eder. Java'da dört tür erişim belirleyici vardır:

  * **`public`:** Her yerden erişilebilir.
  * **`protected`:** Aynı paketten ve farklı paketlerdeki alt sınıflardan erişilebilir.
  * **`default` (belirtilmezse):** Sadece aynı paketten erişilebilir.
  * **`private`:** Sadece tanımlandığı sınıf içinden erişilebilir.

**Püf Noktaları ve Best Practices:**

  * **Kapsülleme:** `private` belirleyici, kapsülleme prensibinin temelini oluşturur. Verileri gizler ve kontrollü erişim sağlar.
  * **Minimum Erişilebilirlik:** Varsayılan olarak üyeleri mümkün olan en kısıtlı erişim belirleyicisiyle başlatın ve yalnızca ihtiyaç duyulduğunda erişimi artırın.
  * **Sınıflar için:** Üst seviye sınıflar sadece `public` veya `default` olabilir. `private` veya `protected` olamazlar.

<!-- end list -->

```java
package com.ornekpaket; // Paket tanımı

public class BenimSinifim { // Public: Her yerden erişilebilir
    public int publicAlan;
    protected int protectedAlan;
    int defaultAlan; // Default: Sadece aynı paketten
    private int privateAlan; // Private: Sadece bu sınıf içinde

    public BenimSinifim() {
        this.privateAlan = 10; // Kendi sınıfı içinde erişebilir
    }

    public void publicMetot() {
        System.out.println("Public Metot.");
    }

    protected void protectedMetot() {
        System.out.println("Protected Metot.");
    }

    void defaultMetot() {
        System.out.println("Default Metot.");
    }

    private void privateMetot() {
        System.out.println("Private Metot.");
    }

    public void icerdenErisim() {
        System.out.println(privateAlan);
        privateMetot();
    }
}

// Başka bir dosyada veya paketteki kullanım
// import com.ornekpaket.BenimSinifim;
// BenimSinifim obj = new BenimSinifim();
// obj.publicAlan = 5;
// obj.publicMetot();
// obj.privateAlan; // Hata
```

-----

### 38\. Kapsülleme (Encapsulation) 💊

Kapsülleme, verileri (alanları) ve bu veriler üzerinde işlem yapan metotları tek bir birimde (sınıf içinde) bir araya getirme ve dışarıdan doğrudan erişimi kısıtlayarak verileri koruma prensibidir. Genellikle alanları `private` yapıp, onlara erişim ve değişiklik için `public` getter ve setter metotları sağlayarak uygulanır.

**Püf Noktaları ve Best Practices:**

  * **Veri Gizleme (Information Hiding):** Nesnenin iç uygulama detaylarını dış dünyadan gizler. Dışarıdan sadece gerekli arayüz (public metotlar) görülür.
  * **Veri Bütünlüğü:** Setter metotları içinde veri doğrulaması yaparak nesnenin her zaman geçerli bir durumda kalmasını sağlayabilirsiniz.
  * **Kontrollü Erişim:** Nesnenin alanlarına nasıl erişileceğini ve değiştirileceğini kontrol edersiniz.

<!-- end list -->

```java
class OgrenciKapsulleme {
    private String ad; // Private alanlar
    private int yas;

    public OgrenciKapsulleme(String ad, int yas) {
        this.ad = ad;
        setYas(yas); // Kurucuda da setter kullanmak iyi bir pratik olabilir
    }

    // Getter Metotları
    public String getAd() {
        return ad;
    }

    public int getYas() {
        return yas;
    }

    // Setter Metotları (Doğrulama ile)
    public void setYas(int yas) {
        if (yas > 0 && yas < 120) { // Yaş doğrulaması
            this.yas = yas;
        } else {
            System.out.println("Geçersiz yaş!");
        }
    }
}

public class KapsullemeDetayliOrnek {
    public static void main(String[] args) {
        OgrenciKapsulleme ogrenci = new OgrenciKapsulleme("Gizem", 20);
        System.out.println("Öğrenci: " + ogrenci.getAd() + ", Yaş: " + ogrenci.getYas());

        ogrenci.setYas(22); // Setter ile geçerli değişiklik
        System.out.println("Yeni Yaş: " + ogrenci.getYas());

        ogrenci.setYas(-5); // Setter ile geçersiz değişiklik (hata mesajı)
        System.out.println("Yaş hala: " + ogrenci.getYas()); // Yaş değişmedi
    }
}
```

-----

### 39\. Nesneleri Kopyalama (Copy Objects) 🖨️

Java'da nesneler doğrudan atanarak kopyalanmaz, referansları kopyalanır. Yani `nesneA = nesneB;` dediğinizde, her iki referans da aynı bellek konumundaki nesneyi gösterir. Gerçek bir nesne kopyası oluşturmak için farklı yöntemler kullanılır:

  * **Kurucu Yoluyla Kopyalama (Copy Constructor):** Yeni bir nesne oluştururken, mevcut bir nesnenin alanlarını parametre olarak alır ve yeni nesneyi bu değerlerle başlatır.
  * **`clone()` Metodu:** `Cloneable` arayüzünü implemente ederek ve `clone()` metodunu geçersiz kılarak derin veya yüzeysel kopyalama yapabilirsiniz. (Genellikle karmaşıklığı nedeniyle daha az tercih edilir).

**Püf Noktaları ve Best Practices:**

  * **Yüzeysel Kopyalama (Shallow Copy):** Sadece ilkel tiplerin değerleri kopyalanır. Nesne referansları kopyalandığında, her iki nesne de aynı referans nesnesine işaret eder. Birindeki değişiklik diğerini de etkiler.
  * **Derin Kopyalama (Deep Copy):** Hem ilkel tiplerin değerleri hem de referans tiplerinin işaret ettiği nesnelerin kendileri kopyalanır. Her iki nesne tamamen bağımsızdır.

<!-- end list -->

```java
class KitapKopya {
    String baslik;
    Yazar yazar; // Yazar da bir nesne

    public KitapKopya(String baslik, Yazar yazar) {
        this.baslik = baslik;
        this.yazar = yazar;
    }

    // Püf Noktası: Kopyalama Kurucusu (Copy Constructor)
    // Bu YÜZEYSEL bir kopyalamadır. Yazar nesnesini derin kopyalamaz!
    public KitapKopya(KitapKopya digerKitap) {
        this.baslik = digerKitap.baslik;
        this.yazar = digerKitap.yazar; // Aynı yazar nesnesine referans
    }

    // Püf Noktası: DERİN KOPYALAMA için
    public KitapKopya(KitapKopya digerKitap, boolean deepCopy) {
        this.baslik = digerKitap.baslik;
        if (deepCopy) {
            this.yazar = new Yazar(digerKitap.yazar.ad); // Yazar nesnesinin de kopyası oluşturulur
        } else {
            this.yazar = digerKitap.yazar;
        }
    }

    @Override
    public String toString() {
        return "Kitap: " + baslik + " (Yazar: " + yazar.ad + ")";
    }
}

class Yazar {
    String ad;
    public Yazar(String ad) {
        this.ad = ad;
    }
}

public class NesneKopyalamaOrnegi {
    public static void main(String[] args) {
        Yazar yazar1 = new Yazar("Stephen King");
        KitapKopya kitap1 = new KitapKopya("It", yazar1);

        // Yüzeysel Kopyalama
        KitapKopya kitap2 = new KitapKopya(kitap1); // kitap1'in kopyası
        System.out.println("Kitap 1: " + kitap1);
        System.out.println("Kitap 2: " + kitap2);

        // Yazar adını değiştiriyoruz. Kitap2 de etkilenecek mi? EVET, çünkü yüzeysel kopya.
        yazar1.ad = "Stephen King (Değişti)";
        System.out.println("Yazar değişince Kitap 1: " + kitap1);
        System.out.println("Yazar değişince Kitap 2: " + kitap2); // Kitap2 de etkilendi!

        System.out.println("--- Derin Kopyalama ---");
        Yazar yazar2 = new Yazar("J.K. Rowling");
        KitapKopya kitap3 = new KitapKopya("Harry Potter", yazar2);
        KitapKopya kitap4 = new KitapKopya(kitap3, true); // Derin kopya

        System.out.println("Kitap 3: " + kitap3);
        System.out.println("Kitap 4: " + kitap4);

        yazar2.ad = "J.K. Rowling (Değişti)";
        System.out.println("Yazar değişince Kitap 3: " + kitap3);
        System.out.println("Yazar değişince Kitap 4: " + kitap4); // Kitap4 etkilenmedi!
    }
}
```

-----

### 40\. Arayüz (Interface) 🦅

Arayüzler, Java'da tam soyutlamayı sağlayan yapılardır. Bir arayüz, bir sınıfın uygulaması gereken bir metotlar kümesi (sözleşme) tanımlar. Java 8'den önce sadece soyut metotlar içerebilirken, Java 8 ile `default` ve `static` metotlar da eklenebilir hale geldi.

**Püf Noktaları ve Best Practices:**

  * **Çoklu Uygulama:** Bir sınıf birden fazla arayüzü uygulayabilir (`implements`), bu da Java'da çoklu mirasın bir benzerini sağlar.
  * **Davranış Tanımlama:** Arayüzler genellikle bir "yapabilir" (`can-do`) veya "davranışsal sözleşme" (`has-a-behavior`) tanımlamak için kullanılır.
  * **Zorunlu İmplementasyon:** Bir arayüzü uygulayan tüm somut sınıflar, arayüzdeki soyut metotları implemente etmek zorundadır.

<!-- end list -->

```java
// Arayüz Tanımı
interface Arac {
    void sur(); // Varsayılan olarak public abstract
    void dur(); // Varsayılan olarak public abstract

    // Java 8 sonrası: Default metotlar
    default void kornaCal() {
        System.out.println("TÜÜT!");
    }
}

// Arayüzü uygulayan sınıf
class Otomobil implements Arac {
    @Override
    public void sur() {
        System.out.println("Otomobil yolda ilerliyor.");
    }

    @Override
    public void dur() {
        System.out.println("Otomobil durdu.");
    }
}

class Bisiklet implements Arac {
    @Override
    public void sur() {
        System.out.println("Bisiklet pedallanıyor.");
    }

    @Override
    public void dur() {
        System.out.println("Bisiklet frenledi.");
    }
}

public class ArayuzOrnegi {
    public static void main(String[] args) {
        Otomobil araba = new Otomobil();
        araba.sur();
        araba.dur();
        araba.kornaCal(); // Default metot çağrısı

        Bisiklet bisiklet = new Bisiklet();
        bisiklet.sur();
        bisiklet.dur();
        bisiklet.kornaCal();
    }
}
```

-----

### 41\. Çok Biçimlilik (Polymorphism) 🏁

Çok biçimlilik, "bir şeyin birden fazla biçimde görünmesi" anlamına gelir. Farklı nesnelerin aynı metoda farklı şekillerde yanıt vermesidir.

  * **Metot Yüklemesi (Method Overloading - Derleme Zamanı Polymorphism):** Aynı isimde, farklı parametre listelerine sahip metotların aynı sınıfta olması.
  * **Metot Geçersiz Kılma (Method Overriding - Çalışma Zamanı Polymorphism):** Alt sınıfın, üst sınıftaki bir metodu yeniden tanımlaması. Üst sınıf referansına sahip bir alt sınıf nesnesi üzerinden metot çağrıldığında, alt sınıfın geçersiz kılınmış metodu çalışır.

**Püf Noktaları ve Best Practices:**

  * **Esneklik:** Kodunuzu daha esnek ve genişletilebilir hale getirir. Yeni alt sınıflar ekleseniz bile mevcut kodunuzu değiştirmeden çalışabilir.
  * **Daha Az `if-else`:** Karmaşık `if-else` veya `switch` yapıları yerine polimorfizm kullanarak daha temiz kod yazabilirsiniz.

<!-- end list -->

```java
class HayvanPolimorfizm {
    public void sesCikar() {
        System.out.println("Hayvan ses çıkarır.");
    }
}

class KopekPolimorfizm extends HayvanPolimorfizm {
    @Override
    public void sesCikar() {
        System.out.println("Hav hav!");
    }
}

class KediPolimorfizm extends HayvanPolimorfizm {
    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }
}

public class PolymorphismKullanimi {
    public static void main(String[] args) {
        HayvanPolimorfizm[] hayvanlar = new HayvanPolimorfizm[3];
        hayvanlar[0] = new HayvanPolimorfizm();
        hayvanlar[1] = new KopekPolimorfizm();
        hayvanlar[2] = new KediPolimorfizm();

        for (HayvanPolimorfizm h : hayvanlar) {
            h.sesCikar(); // Her nesne kendi sesCikar() metodunu çağırır
        }
    }
}
```

-----

### 42\. Dinamik Çok Biçimlilik (Dynamic Polymorphism) ✨

Dinamik çok biçimlilik (veya çalışma zamanı çok biçimliliği), metot geçersiz kılma (method overriding) ile ilişkilidir. Hangi metodun çağrılacağına derleme zamanında değil, **çalışma zamanında (runtime)** nesnenin gerçek tipine göre karar verilir. Bu, `instanceof` operatörü ile bir nesnenin tipini kontrol etmenize ve gerekirse downcasting yapmanıza olanak tanır.

**Püf Noktaları ve Best Practices:**

  * **Upcasting:** Alt sınıf nesnesini üst sınıf referansına atamak (güvenli ve otomatik).
  * **Downcasting:** Üst sınıf referansını alt sınıf tipine dönüştürmek (tehlikeli, `ClassCastException` riski var). Genellikle `instanceof` ile tip kontrolü yaparak güvenli hale getirilir.

<!-- end list -->

```java
class ArabaDinamik {
    public void baslat() {
        System.out.println("Araba motoru çalıştırıldı.");
    }
}

class ElektrikliAraba extends ArabaDinamik {
    @Override
    public void baslat() {
        System.out.println("Elektrikli araba sessizce başlatıldı.");
    }
    public void sarjEt() {
        System.out.println("Elektrikli araba şarj oluyor.");
    }
}

class BenzinliAraba extends ArabaDinamik {
    @Override
    public void baslat() {
        System.out.println("Benzinli araba gürültüyle çalıştı.");
    }
    public void yakitDoldur() {
        System.out.println("Benzinli araba yakıt alıyor.");
    }
}

public class DinamikPolymorphismOrnegi {
    public static void main(String[] args) {
        ArabaDinamik[] arabalar = new ArabaDinamik[3];
        arabalar[0] = new ArabaDinamik();
        arabalar[1] = new ElektrikliAraba(); // Upcasting
        arabalar[2] = new BenzinliAraba();   // Upcasting

        for (ArabaDinamik araba : arabalar) {
            araba.baslat(); // Çalışma zamanında doğru metot çağrılır

            // Püf Noktası: Downcasting ve instanceof
            if (araba instanceof ElektrikliAraba) {
                ((ElektrikliAraba) araba).sarjEt();
            } else if (araba instanceof BenzinliAraba) {
                ((BenzinliAraba) araba).yakitDoldur();
            }
        }
    }
}
```

-----

### Hata Yönetimi ve Dosya İşlemleri

-----

### 43\. İstisna Yönetimi (Exception Handling) ⚠️

İstisna yönetimi, programın normal akışını bozan çalışma zamanı hatalarını (exceptions) ele almak için kullanılır. `try-catch-finally` blokları ve `throws` anahtar kelimesi ile yapılır.

  * **`try` bloğu:** İstisna çıkarabilecek kodu içerir.
  * **`catch` bloğu:** `try` bloğunda bir istisna oluştuğunda çalışır ve istisnayı ele alır.
  * **`finally` bloğu:** İstisna oluşsa da oluşmasa da her zaman çalışır. Genellikle kaynakları (dosya, veritabanı bağlantısı) kapatmak için kullanılır.
  * **`throws`:** Bir metodun belirli bir istisnayı fırlatabileceğini belirtir.

**Püf Noktaları ve Best Practices:**

  * **Belirli İstisnaları Yakalama:** Genel `Exception` yerine daha spesifik istisnaları yakalamak (örneğin `IOException`, `NumberFormatException`) daha iyidir.
  * **Gerekli Durumda Fırlatma:** Bir istisnayı sadece ele alamayacağınız durumlarda fırlatın.
  * **Kaynakları Kapatma:** `finally` bloğunu veya Java 7 ile gelen `try-with-resources` yapısını (otomatik kaynak kapatma) kullanarak kaynakların doğru şekilde kapatıldığından emin olun.

<!-- end list -->

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingOrnegi {
    public static void main(String[] args) {
        // Bölme işlemi hatası
        try {
            int sonuc = 10 / 0; // ArithmeticException
            System.out.println(sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme hatası: " + e.getMessage());
        }

        // Dosya okuma hatası (Dosya bulunamazsa)
        Scanner fileScanner = null;
        try {
            File dosya = new File("olmayan_dosya.txt");
            fileScanner = new Scanner(dosya);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        } finally {
            if (fileScanner != null) {
                fileScanner.close(); // Kaynakları kapatmak önemlidir
                System.out.println("Dosya okuyucu kapatıldı.");
            }
        }

        // Try-with-resources (Java 7+) - Kaynakları otomatik kapatır
        try (Scanner fileScanner2 = new Scanner(new File("mevcut_dosya.txt"))) {
            // "mevcut_dosya.txt" dosyasını oluşturup içine bir şeyler yazın
            while (fileScanner2.hasNextLine()) {
                System.out.println(fileScanner2.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı (try-with-resources): " + e.getMessage());
        }
    }
}
```

-----

### 44\. File Sınıfı (File Class) 📁

`java.io.File` sınıfı, dosya ve dizinlerin (klasörlerin) temsili için kullanılır. Dosya oluşturma, silme, yeniden adlandırma, var olup olmadığını kontrol etme gibi işlemleri yapmanızı sağlar. **Dosya içeriğini okuma veya yazma işlemlerini yapmaz**, sadece dosya veya dizin yoluyla ilgili işlemleri yapar.

**Püf Noktaları ve Best Practices:**

  * **Platform Bağımsızlığı:** Dosya yollarını belirtirken `File.separator` kullanmak, farklı işletim sistemleri arasında taşınabilirliği sağlar.
  * **Varoluş Kontrolü:** Bir dosya işlemi yapmadan önce dosyanın var olup olmadığını (`exists()`) veya yazılabilir olup olmadığını (`canWrite()`) kontrol etmek iyi bir pratiktir.

<!-- end list -->

```java
import java.io.File;
import java.io.IOException;

public class FileClassOrnegi {
    public static void main(String[] args) {
        File dosya = new File("ornek.txt"); // Mevcut olmayan bir dosya

        try {
            if (dosya.createNewFile()) { // Dosya yoksa oluştur
                System.out.println("Dosya oluşturuldu: " + dosya.getName());
            } else {
                System.out.println("Dosya zaten var.");
            }
        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hata oluştu: " + e.getMessage());
        }

        System.out.println("Dosya adı: " + dosya.getName());
        System.out.println("Mutlak yol: " + dosya.getAbsolutePath());
        System.out.println("Yazılabilir mi: " + dosya.canWrite());
        System.out.println("Okunabilir mi: " + dosya.canRead());
        System.out.println("Boyut (byte): " + dosya.length());

        // Dosyayı silme
        // if (dosya.delete()) {
        //     System.out.println("Dosya silindi: " + dosya.getName());
        // } else {
        //     System.out.println("Dosya silinemedi.");
        // }
    }
}
```

-----

### 45\. FileWriter (Dosyaya Yazma) 📝

`java.io.FileWriter` sınıfı, karakter tabanlı verileri (metin) bir dosyaya yazmak için kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Kaynak Kapatma:** `FileWriter` bir kaynaktır ve işiniz bittiğinde `close()` metodunu çağırarak veya `try-with-resources` kullanarak kapatmanız zorunludur. Aksi takdirde, veriler diske yazılmayabilir veya kaynak sızıntıları oluşabilir.
  * **Üzerine Yazma/Ekleme:** Varsayılan olarak `FileWriter`, var olan dosyanın üzerine yazar. Eğer dosyanın sonuna ekleme yapmak isterseniz, kurucusuna `true` parametresini geçin (`new FileWriter("dosya.txt", true)`).
  * **Buffer Kullanımı:** Büyük miktarda veri yazarken `BufferedWriter` ile birlikte kullanmak performansı artırabilir.

<!-- end list -->

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOrnegi {
    public static void main(String[] args) {
        // try-with-resources ile otomatik kapatma
        try (FileWriter writer = new FileWriter("mesaj.txt")) {
            writer.write("Bu, dosyaya yazılan ilk satır.");
            writer.write("\nBu da ikinci satır."); // Yeni satır karakteri
            System.out.println("Dosyaya başarıyla yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazarken hata oluştu: " + e.getMessage());
        }

        // Dosyaya ekleme yapma
        try (FileWriter writerAppend = new FileWriter("mesaj.txt", true)) { // true ile ekleme modunda aç
            writerAppend.write("\nBu eklenen bir satır.");
            System.out.println("Dosyaya ekleme yapıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya eklerken hata oluştu: " + e.getMessage());
        }
    }
}
```

-----

### 46\. FileReader (Dosyayı Okuma) 📖

`java.io.FileReader` sınıfı, karakter tabanlı verileri (metin) bir dosyadan okumak için kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Kaynak Kapatma:** `FileReader` da bir kaynaktır ve işiniz bittiğinde kapatılması zorunludur. `try-with-resources` kullanmak en iyi yoldur.
  * **Karakter Karakter Okuma:** `read()` metodu her çağrıldığında bir sonraki karakterin ASCII/Unicode değerini döndürür. Okumayı durdurmak için `-1` değerini döndürdüğünde döngüyü sonlandırın.
  * **Satır Satır Okuma:** Dosyayı satır satır okumak için `BufferedReader` sınıfıyla birlikte kullanmak daha yaygın ve etkilidir.

<!-- end list -->

```java
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader; // Satır satır okuma için

public class FileReaderOrnegi {
    public static void main(String[] args) {
        // Önceki örnekten "mesaj.txt" dosyasının var olduğunu varsayıyoruz.

        // Karakter karakter okuma
        try (FileReader reader = new FileReader("mesaj.txt")) {
            int data;
            System.out.println("Karakter karakter okuma:");
            while ((data = reader.read()) != -1) { // -1 dosya sonu anlamına gelir
                System.out.print((char) data); // int'i char'a dönüştürerek yazdır
            }
            System.out.println("\n--- Okuma Bitti ---");
        } catch (FileNotFoundException e) {
            System.out.println("Okunacak dosya bulunamadı: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Dosyayı okurken hata oluştu: " + e.getMessage());
        }

        System.out.println("\n--- Satır satır okuma (BufferedReader ile) ---");
        try (BufferedReader bReader = new BufferedReader(new FileReader("mesaj.txt"))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Okunacak dosya bulunamadı: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Dosyayı okurken hata oluştu: " + e.getMessage());
        }
    }
}
```

-----

### Java GUI (Swing) Temelleri

-----

### 47\. Ses Çalma (Audio) 🔊

Java'da ses çalmak için `javax.sound.sampled` paketi kullanılır. Bu API, WAV, AU, AIFF gibi ses formatlarını destekler.

**Püf Noktaları ve Best Practices:**

  * **Sadece Temel Ses:** Java'nın yerleşik ses API'si basit ses çalma ihtiyaçları için uygundur. Daha karmaşık ses işlemleri veya formatlar için harici kütüphaneler (örneğin JavaFX Media API) daha iyi olabilir.
  * **Kaynak Kapatma:** Ses dosyalarını açtıktan sonra kapatmayı unutmayın (`Clip.close()`).

<!-- end list -->

```java
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioOrnegi {
    public static void main(String[] args) {
        // "ses.wav" adlı bir WAV dosyası olduğunuzu varsayın
        // Örnek bir WAV dosyası indirip projenizin kök dizinine koyun
        File file = new File("ses.wav"); // ses.wav dosyasının yolunu belirtin

        try (Scanner scanner = new Scanner(System.in)) {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Seçiminizi girin: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case ("P"):
                        clip.start();
                        System.out.println("Çalıyor...");
                        break;
                    case ("S"):
                        clip.stop();
                        System.out.println("Durduruldu.");
                        break;
                    case ("R"):
                        clip.setFramePosition(0); // Başa sar
                        System.out.println("Başa sarıldı.");
                        break;
                    case ("Q"):
                        clip.close(); // Kaynağı serbest bırak
                        System.out.println("Çıkış yapıldı.");
                        break;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
```

-----

### 48\. GUI (Grafik Kullanıcı Arayüzü) 🖼️

Java'da GUI geliştirmek için **Swing** (daha eski ama hala yaygın) ve **JavaFX** (daha modern) kütüphaneleri kullanılır. Bu bölümde Swing temellerine odaklanacağız.

**Püf Noktaları ve Best Practices:**

  * **Ana Kapsayıcı:** `JFrame` GUI uygulamalarının ana penceresini oluşturur.
  * **Bileşenler:** `JLabel`, `JButton`, `JTextField` gibi görsel bileşenler kullanıcı arayüzünü oluşturur.
  * **Olay Dinleyicileri:** Kullanıcı etkileşimlerini (düğme tıklamaları, fare hareketleri) yakalamak için olay dinleyicileri (event listeners) kullanılır.
  * **Event Dispatch Thread (EDT):** Swing bileşenlerinin GUI ile ilgili işlemlerinin hepsi EDT üzerinde yapılmalıdır. Aksi takdirde kararlılık sorunları yaşanabilir.

<!-- end list -->

```java
import javax.swing.JFrame; // Pencere için
import javax.swing.JButton; // Düğme için
import javax.swing.JLabel; // Metin etiketi için
import java.awt.FlowLayout; // Layout yöneticisi için
import java.awt.event.ActionEvent; // Olay dinleyicisi için
import java.awt.event.ActionListener; // Olay dinleyicisi için

public class BasicGUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basit GUI Uygulaması");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout()); // Bileşenleri düzenlemek için Layout Yöneticisi

        JLabel label = new JLabel("Merhaba Dünya!");
        frame.add(label);

        JButton button = new JButton("Tıkla Bana");
        button.addActionListener(new ActionListener() { // Düğmeye tıklama olayı ekleme
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Düğmeye tıklandı!"); // Etiketin metnini değiştir
            }
        });
        frame.add(button);

        frame.setVisible(true); // Pencereyi görünür yap
    }
}
```

-----

### 49\. Etiketler (Labels) 👨‍💻

`JLabel` bileşeni, GUI'de metin veya resim görüntülemek için kullanılır. Kullanıcı tarafından düzenlenemezler.

**Püf Noktaları ve Best Practices:**

  * **Bilgi Gösterimi:** Kullanıcıya bilgi mesajları, talimatlar veya sabit metinler göstermek için kullanılır.
  * **Resim Gösterme:** `ImageIcon` kullanarak JLabel üzerine resimler de ekleyebilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon; // Resim için
import java.awt.FlowLayout;
import java.awt.Color; // Renk için
import java.awt.Font; // Yazı tipi için

public class LabelOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("smiley.png"); // Resim dosyası projenizin kök dizininde olmalı

        JLabel label = new JLabel("Bu bir etikettir.");
        label.setIcon(icon); // Etikete resim ekle
        label.setHorizontalTextPosition(JLabel.CENTER); // Metni resmin ortasına hizala
        label.setVerticalTextPosition(JLabel.BOTTOM); // Metni resmin altına hizala
        label.setForeground(new Color(0x00FF00)); // Metin rengi (yeşil)
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Yazı tipi ve boyutu
        label.setIconTextGap(10); // Resim ve metin arası boşluk
        label.setBackground(Color.LIGHT_GRAY); // Arka plan rengi
        label.setOpaque(true); // Arka plan rengini göstermek için gerekli
        label.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLUE, 3)); // Kenarlık

        frame.add(label);
        frame.setVisible(true);
    }
}
```

-----

### 50\. Paneller (Panels) 🟥

`JPanel` bileşenleri, diğer GUI bileşenlerini gruplamak ve düzenlemek için kullanılan hafif kapsayıcılardır. Bir pencereye doğrudan birçok bileşen eklemek yerine, panelleri kullanarak arayüzü daha düzenli hale getirebilirsiniz.

**Püf Noktaları ve Best Practices:**

  * **Düzen Yönetimi:** Her panelin kendi düzen yöneticisi (`LayoutManager`) olabilir, bu da karmaşık arayüzlerin tasarımını kolaylaştırır.
  * **İç İçe Paneller:** Panelleri iç içe kullanarak hiyerarşik ve karmaşık düzenler oluşturabilirsiniz.
  * **Arka Plan:** Panellerin arka plan renklerini ayarlayarak görsel ayrım sağlayabilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;

public class PanelOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null); // Varsayılan layout yöneticisini devre dışı bırakıyoruz

        // Kırmızı Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250); // Konum ve boyut (x, y, genişlik, yükseklik)
        redPanel.setLayout(new FlowLayout()); // Red panelin kendi layout'u var

        // Mavi Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new FlowLayout());

        // Yeşil Panel (iç içe)
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 150);
        greenPanel.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Kırmızı Panel!");
        JButton button1 = new JButton("Düğme 1");
        redPanel.add(label1);
        redPanel.add(button1);

        JLabel label2 = new JLabel("Mavi Panel!");
        bluePanel.add(label2);

        JLabel label3 = new JLabel("Yeşil Panel!");
        greenPanel.add(label3);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}
```

-----

### 51\. Düğmeler (Buttons) 🛎️

`JButton` bileşeni, tıklanabilir düğmeler oluşturmak için kullanılır. Bir düğmeye tıklandığında belirli bir eylem gerçekleştirmek için bir `ActionListener` eklenir.

**Püf Noktaları ve Best Practices:**

  * **Olay Dinleyici:** Düğme işlevselliği için `ActionListener` arayüzünü uygulayan bir sınıf (genellikle anonim iç sınıf veya lambda ifadesi) kullanılır.
  * **Görsel Ayarlar:** Düğmelere metin, ikon ekleyebilir, renklerini ve yazı tiplerini ayarlayabilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.swing.ImageIcon; // İkon için

public class ButtonOrnegi implements ActionListener { // ActionListener uyguladık

    JButton button;
    JLabel label;

    public ButtonOrnegi() {
        JFrame frame = new JFrame("Düğme Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null); // Layout yöneticisini iptal ettik

        button = new JButton("Tıkla Bana!");
        button.setBounds(100, 50, 150, 40); // Konum ve boyut
        button.addActionListener(this); // Olay dinleyicisi olarak bu sınıfı ata

        // İsteğe bağlı: Düğmeye ikon ekleme
        // ImageIcon icon = new ImageIcon("click_icon.png"); // Bir ikon dosyası olmalı
        // button.setIcon(icon);
        // button.setHorizontalTextPosition(JButton.LEFT); // Metni ikonun soluna al

        label = new JLabel("Henüz tıklanmadı.");
        label.setBounds(100, 100, 200, 30);

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) { // Hangi düğmenin tıklandığını kontrol et
            label.setText("Düğmeye tıklandı!");
            // button.setEnabled(false); // Düğmeyi devre dışı bırak
        }
    }

    public static void main(String[] args) {
        new ButtonOrnegi();
    }
}
```

-----

### Düzen Yöneticileri (Layout Managers)

-----

### 52\. BorderLayout 🧭

`BorderLayout`, bir kapsayıcıyı (örneğin `JFrame` veya `JPanel`) beş bölgeye (Kuzey, Güney, Doğu, Batı ve Merkez) böler. Her bölgeye en fazla bir bileşen yerleştirilebilir.

**Püf Noktaları ve Best Practices:**

  * **Varsayılan Layout:** `JFrame` için varsayılan düzen yöneticisidir.
  * **Bölgeler:** Bileşenleri eklerken bölgeyi belirtmelisiniz (`frame.add(component, BorderLayout.NORTH)`).
  * **`CENTER` Bölgesi:** `CENTER` bölgesi, mevcut alanı doldurmak için genişler. Diğer bölgeler sadece içeriklerine yetecek kadar yer kaplar.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class BorderLayoutOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10)); // Yatay ve dikey boşluklar

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.setPreferredSize(new Dimension(100, 50)); // Tercih edilen boyut

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.setPreferredSize(new Dimension(100, 50));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.blue);
        panel3.setPreferredSize(new Dimension(50, 100));

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.yellow);
        panel4.setPreferredSize(new Dimension(50, 100));

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.magenta);
        // panel5.setPreferredSize(new Dimension(100, 100)); // CENTER alanı boşluğu doldurur

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
```

-----

### 53\. FlowLayout 🌊

`FlowLayout`, bileşenleri soldan sağa, yukarıdan aşağıya doğru bir akış içinde yerleştirir. Bileşenler mevcut satıra sığmadığında otomatik olarak yeni bir satıra geçer.

**Püf Noktaları ve Best Practices:**

  * **Varsayılan Layout:** `JPanel` için varsayılan düzen yöneticisidir.
  * **Basit Düzenler:** Çok basit ve akışkan arayüzler için idealdir.
  * **Hizalama:** Kurucusunda hizalama (`FlowLayout.LEFT`, `FlowLayout.RIGHT`, `FlowLayout.CENTER`) ve bileşenler arası boşlukları ayarlayabilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

public class FlowLayoutOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Merkez hizalı, 10px boşluk

        // Birçok düğme ekleyelim
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton("Düğme " + i);
            frame.add(button);
        }

        frame.setVisible(true);
    }
}
```

-----

### 54\. GridLayout 🔳

`GridLayout`, bileşenleri eşit büyüklükte hücrelerden oluşan bir ızgaraya yerleştirir. Her hücre bir bileşen alabilir.

**Püf Noktaları ve Best Practices:**

  * **Tablo Benzeri Düzenler:** Tablo veya matris benzeri arayüzler için mükemmeldir (örneğin hesap makinesi tuş takımı).
  * **Eşit Boyut:** Tüm hücreler ve içindeki bileşenler eşit boyuttadır.
  * **Sütun/Satır Sayısı:** Kurucuda satır ve sütun sayısını belirtirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 10)); // 3 satır, 3 sütun, 10px boşluk

        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Düğme " + i));
        }

        frame.setVisible(true);
    }
}
```

-----

### 55\. LayeredPane 📚

`JLayeredPane`, bileşenleri farklı "katmanlara" yerleştirmenize olanak tanır. Bileşenler birbirlerinin üzerine binebilir ve katman numarasına göre sıralanır (daha yüksek katman numaraları önde görüntülenir).

**Püf Noktaları ve Best Practices:**

  * **Çakışan Bileşenler:** Bileşenlerin üst üste binmesi gerektiği durumlarda kullanılır (örneğin, bir arka plan resmi ve üzerinde düğmeler).
  * **Katman Numaraları:** `JLayeredPane.DEFAULT_LAYER`, `JLayeredPane.PALETTE_LAYER`, `JLayeredPane.MODAL_LAYER`, `JLayeredPane.POPUP_LAYER`, `JLayeredPane.DRAG_LAYER` gibi önceden tanımlanmış katmanlar vardır veya kendi tam sayı değerlerinizi kullanabilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

public class LayeredPaneOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LayeredPane Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // LayeredPane'in boyutunu elle ayarlamak için

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500); // Frame'in tamamını kaplasın

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150, 150, 200, 200);

        // Bileşenleri katmanlara ekle
        layeredPane.add(label1, Integer.valueOf(0)); // En altta
        layeredPane.add(label2, Integer.valueOf(1)); // Ortada
        layeredPane.add(label3, Integer.valueOf(2)); // En üstte

        frame.add(layeredPane);
        frame.setVisible(true);
    }
}
```

-----

### Gelişmiş GUI Bileşenleri ve Etkinlik Yönetimi

-----

### 56\. Yeni Bir GUI Penceresi Açma (Open a New GUI Window) 🗔

Bir GUI uygulamasında birden fazla pencereye ihtiyacınız olabilir. Yeni bir `JFrame` nesnesi oluşturarak ve onu görünür yaparak başka bir pencere açabilirsiniz.

**Püf Noktaları ve Best Practices:**

  * **Modülerlik:** Her pencereyi kendi sınıfında tasarlamak, kodunuzu daha modüler hale getirir.
  * **Olay Dinleme:** Bir düğmeye tıklanma gibi bir olaya yanıt olarak yeni bir pencere açılabilir.
  * **Kapanma Davranışı:** Yeni pencerenin kapanma davranışını dikkatlice ayarlayın (`JFrame.DISPOSE_ON_CLOSE` sadece o pencereyi kapatır, `JFrame.EXIT_ON_CLOSE` tüm uygulamayı kapatır).

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class YeniPencere extends JFrame {
    public YeniPencere() {
        this.setTitle("Yeni Pencere");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Sadece bu pencereyi kapat
        this.setSize(300, 200);
        this.setLocationRelativeTo(null); // Ekranın ortasında göster
        this.setVisible(true);
    }
}

public class YeniPencereAcmaOrnegi {
    public static void main(String[] args) {
        JFrame anaFrame = new JFrame("Ana Pencere");
        anaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anaFrame.setSize(400, 300);
        anaFrame.setLayout(null);

        JButton acButton = new JButton("Yeni Pencereyi Aç");
        acButton.setBounds(100, 100, 200, 50);
        acButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new YeniPencere(); // Yeni pencereyi oluştur ve göster
            }
        });

        anaFrame.add(acButton);
        anaFrame.setVisible(true);
    }
}
```

-----

### 57\. JOptionPane 🛑

`JOptionPane` sınıfı, kullanıcılara basit mesaj kutuları, onay kutuları, girdi kutuları veya seçenek kutuları göstermek için kullanılır. GUI uygulamalarında hızlı ve kolay etkileşim sağlamak için idealdir.

**Püf Noktaları ve Best Practices:**

  * **Basit Etkileşimler:** Karmaşık diyaloglar yerine, kısa ve basit kullanıcı etkileşimleri için kullanın.
  * **Statik Metotlar:** `JOptionPane` metotları statiktir, bu yüzden bir nesne oluşturmanıza gerek kalmadan doğrudan çağrılırlar.
  * **Dönüş Değerleri:** `showConfirmDialog` ve `showOptionDialog` gibi metotlar, kullanıcının hangi seçeneği seçtiğini belirten bir tam sayı değeri döndürür.

<!-- end list -->

```java
import javax.swing.JOptionPane;
import javax.swing.ImageIcon; // İsteğe bağlı: İkon için

public class JOptionPaneOrnegi {
    public static void main(String[] args) {
        // 1. Bilgi Mesajı (Information Message)
        JOptionPane.showMessageDialog(null, "Bu bir bilgi mesajıdır.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

        // 2. Hata Mesajı (Error Message)
        JOptionPane.showMessageDialog(null, "Bir hata oluştu!", "Hata", JOptionPane.ERROR_MESSAGE);

        // 3. Uyarı Mesajı (Warning Message)
        JOptionPane.showMessageDialog(null, "Bu bir uyarıdır.", "Uyarı", JOptionPane.WARNING_MESSAGE);

        // 4. Onay Kutusu (Confirmation Dialog)
        int cevap = JOptionPane.showConfirmDialog(null, "Devam etmek istiyor musunuz?", "Onay", JOptionPane.YES_NO_CANCEL_OPTION);
        if (cevap == JOptionPane.YES_OPTION) {
            System.out.println("Evet seçildi.");
        } else if (cevap == JOptionPane.NO_OPTION) {
            System.out.println("Hayır seçildi.");
        } else {
            System.out.println("İptal veya Kapat seçildi.");
        }

        // 5. Giriş Kutusu (Input Dialog)
        String isim = JOptionPane.showInputDialog("Adınızı giriniz:");
        if (isim != null && !isim.isEmpty()) {
            System.out.println("Merhaba, " + isim + "!");
        } else {
            System.out.println("İsim girilmedi.");
        }

        // 6. Seçenek Kutusu (Option Dialog)
        String[] secenekler = {"Elma", "Muz", "Portakal"};
        ImageIcon icon = new ImageIcon("smiley.png"); // İsteğe bağlı ikon
        int secim = JOptionPane.showOptionDialog(null, "Favori meyvenizi seçin:", "Meyve Seçimi", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, secenekler, secenekler[0]);
        if (secim != JOptionPane.CLOSED_OPTION) {
            System.out.println("Seçilen meyve: " + secenekler[secim]);
        }
    }
}
```

-----

### 58\. Metin Alanı (Textfield) 📛

`JTextField`, kullanıcının tek satırlık metin girmesine veya görüntülemesine olanak tanıyan bir GUI bileşenidir.

**Püf Noktaları ve Best Practices:**

  * **`getText()` ve `setText()`:** Metin almak için `getText()`, metin ayarlamak için `setText()` metotları kullanılır.
  * **`ActionListener`:** Kullanıcı Enter tuşuna bastığında veya düğmeye tıkladığında metin alanındaki metni işlemek için `ActionListener` eklenebilir.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextfieldOrnegi implements ActionListener {

    JTextField textField;
    JButton submitButton;
    JLabel outputLabel;

    public TextfieldOrnegi() {
        JFrame frame = new JFrame("Textfield Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new java.awt.Dimension(250, 40)); // Boyut ayarı
        textField.setText("Metin girin..."); // Başlangıç metni
        textField.addActionListener(this); // Enter tuşuna basıldığında tetiklenir

        submitButton = new JButton("Gönder");
        submitButton.addActionListener(this);

        outputLabel = new JLabel("Çıktı burada görünecek.");

        frame.add(textField);
        frame.add(submitButton);
        frame.add(outputLabel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton || e.getSource() == textField) {
            String metin = textField.getText();
            outputLabel.setText("Girdiğiniz metin: " + metin);
            textField.setEditable(false); // Metin alanını düzenlenemez yap
            submitButton.setEnabled(false); // Düğmeyi devre dışı bırak
        }
    }

    public static void main(String[] args) {
        new TextfieldOrnegi();
    }
}
```

-----

### 59\. Onay Kutuları (Checkbox) ✔️

`JCheckBox`, kullanıcının bir veya daha fazla seçenek arasından seçim yapmasına olanak tanıyan bir GUI bileşenidir. Birden fazla onay kutusu aynı anda seçilebilir.

**Püf Noktaları ve Best Practices:**

  * **`isSelected()`:** Onay kutusunun seçili olup olmadığını kontrol etmek için kullanılır.
  * **`ItemListener`:** Onay kutusunun durumu her değiştiğinde (seçildiğinde veya seçim kaldırıldığında) bir eylem gerçekleştirmek için `ItemListener` kullanılır.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent; // ItemListener için
import java.awt.event.ItemListener; // ItemListener için

public class CheckboxOrnegi implements ActionListener, ItemListener {

    JCheckBox pizzaBox;
    JCheckBox hamburgerBox;
    JButton siparisButton;
    JLabel durumLabel;

    public CheckboxOrnegi() {
        JFrame frame = new JFrame("Checkbox Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        pizzaBox = new JCheckBox("Pizza");
        pizzaBox.addItemListener(this); // ItemListener ekle

        hamburgerBox = new JCheckBox("Hamburger");
        hamburgerBox.addItemListener(this);

        siparisButton = new JButton("Sipariş Ver");
        siparisButton.addActionListener(this);

        durumLabel = new JLabel("Seçim yapın.");

        frame.add(pizzaBox);
        frame.add(hamburgerBox);
        frame.add(siparisButton);
        frame.add(durumLabel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == siparisButton) {
            String siparis = "Siparişiniz: ";
            if (pizzaBox.isSelected()) {
                siparis += "Pizza ";
            }
            if (hamburgerBox.isSelected()) {
                siparis += "Hamburger ";
            }
            if (!pizzaBox.isSelected() && !hamburgerBox.isSelected()) {
                siparis += "Hiçbir şey seçmediniz.";
            }
            durumLabel.setText(siparis);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (pizzaBox.isSelected() || hamburgerBox.isSelected()) {
            durumLabel.setText("Seçim yapıldı.");
        } else {
            durumLabel.setText("Seçim yapın.");
        }
    }

    public static void main(String[] args) {
        new CheckboxOrnegi();
    }
}
```

-----

### 60\. Radyo Düğmeleri (Radio Buttons) 🔘

`JRadioButton`, kullanıcının bir grup seçenek arasından **yalnızca birini** seçmesine olanak tanıyan GUI bileşenleridir. Bir `ButtonGroup` içine eklenerek birbiriyle ilişkili hale getirilirler.

**Püf Noktaları ve Best Practices:**

  * **`ButtonGroup`:** Radyo düğmelerini bir `ButtonGroup`'a eklemek zorunludur. Aksi takdirde, her biri bağımsız olarak seçilebilir ve radyo düğmesi işlevini kaybeder.
  * **`isSelected()`:** Seçili olan radyo düğmesini kontrol etmek için kullanılır.
  * **`ActionListener`:** Seçim değiştiğinde eylem gerçekleştirmek için `ActionListener` eklenir.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup; // Radyo düğmelerini gruplamak için
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonOrnegi implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton salataButton;
    ButtonGroup group; // Radyo düğmeleri için grup
    JLabel secimLabel;
    JButton onaylaButton;

    public RadioButtonOrnegi() {
        JFrame frame = new JFrame("Radio Button Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        salataButton = new JRadioButton("Salata");

        group = new ButtonGroup(); // Grup oluştur
        group.add(pizzaButton); // Düğmeleri gruba ekle
        group.add(hamburgerButton);
        group.add(salataButton);

        pizzaButton.addActionListener(this); // Her bir düğmeye dinleyici ekle
        hamburgerButton.addActionListener(this);
        salataButton.addActionListener(this);

        secimLabel = new JLabel("Favori yemeğinizi seçin.");
        onaylaButton = new JButton("Onayla");
        onaylaButton.addActionListener(this);

        frame.add(pizzaButton);
        frame.add(hamburgerButton);
        frame.add(salataButton);
        frame.add(secimLabel);
        frame.add(onaylaButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            secimLabel.setText("Pizza seçildi!");
        } else if (e.getSource() == hamburgerButton) {
            secimLabel.setText("Hamburger seçildi!");
        } else if (e.getSource() == salataButton) {
            secimLabel.setText("Salata seçildi!");
        } else if (e.getSource() == onaylaButton) {
            if (pizzaButton.isSelected()) {
                System.out.println("Onaylandı: Pizza");
            } else if (hamburgerButton.isSelected()) {
                System.out.println("Onaylandı: Hamburger");
            } else if (salataButton.isSelected()) {
                System.out.println("Onaylandı: Salata");
            } else {
                System.out.println("Hiçbir şey seçilmedi.");
            }
        }
    }

    public static void main(String[] args) {
        new RadioButtonOrnegi();
    }
}
```

-----

### 61\. Açılır Liste (Combobox) 📑

`JComboBox`, kullanıcının önceden tanımlanmış bir seçenek listesinden bir öğe seçmesine olanak tanıyan bir açılır listedir.

**Püf Noktaları ve Best Practices:**

  * **Jenerik Tip:** `JComboBox` oluştururken jenerik tipini belirtin (örneğin `JComboBox<String>`).
  * **Öğe Ekleme:** Öğeleri `addItem()` metoduyla ekleyin veya bir `Array` ya da `Vector` ile kurucuyu kullanın.
  * **Seçili Öğeye Erişme:** `getSelectedItem()` ile seçili öğeyi, `getSelectedIndex()` ile indeksini alabilirsiniz.
  * **`ActionListener` veya `ItemListener`:** Seçim değiştiğinde eylem gerçekleştirmek için `ActionListener` veya `ItemListener` kullanılır. `ItemListener` daha detaylı durum bilgisi sunar.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboboxOrnegi implements ActionListener {

    JComboBox<String> comboBox;
    JLabel secilenLabel;
    JButton gosterButton;

    public ComboboxOrnegi() {
        JFrame frame = new JFrame("Combobox Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        String[] hayvanlar = {"Köpek", "Kedi", "Kuş", "Balık"};
        comboBox = new JComboBox<>(hayvanlar); // Dizi ile başlangıç öğeleri

        comboBox.addActionListener(this); // Seçim değiştiğinde tetiklenir

        secilenLabel = new JLabel("Seçilen: ");
        gosterButton = new JButton("Seçimi Göster");
        gosterButton.addActionListener(this);

        frame.add(comboBox);
        frame.add(secilenLabel);
        frame.add(gosterButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            secilenLabel.setText("Seçilen: " + comboBox.getSelectedItem());
        } else if (e.getSource() == gosterButton) {
            System.out.println("Onaylandı: " + comboBox.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new ComboboxOrnegi();
    }
}
```

-----

### 62\. Kaydırma Çubuğu (Slider) 🌡️

`JSlider`, kullanıcının belirli bir aralıktaki bir değeri seçmek için kaydırabileceği bir GUI bileşenidir. Genellikle ses seviyesi, parlaklık gibi ayarları kontrol etmek için kullanılır.

**Püf Noktaları ve Best Practices:**

  * **`ChangeListener`:** Kaydırıcının değeri her değiştiğinde bir eylem gerçekleştirmek için `ChangeListener` kullanılır.
  * **Min/Max Değerler:** Kaydırıcının minimum ve maksimum değerlerini, başlangıç değerini ve ana/ara işaretleme aralıklarını ayarlayabilirsiniz.
  * **Görsel Ayarlar:** Tik işaretleri, etiketler ve yön (yatay/dikey) gibi görsel ayarları yapabilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.event.ChangeEvent; // ChangeListener için
import javax.swing.event.ChangeListener; // ChangeListener için

public class SliderOrnegi implements ChangeListener {

    JFrame frame;
    JSlider slider;
    JLabel label;

    public SliderOrnegi() {
        frame = new JFrame("Slider Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLayout(new FlowLayout());

        slider = new JSlider(0, 100, 50); // Min:0, Max:100, Başlangıç:50

        slider.setPreferredSize(new java.awt.Dimension(400, 100)); // Boyut
        slider.setPaintTicks(true); // Tik işaretlerini göster
        slider.setMinorTickSpacing(10); // Küçük tik aralığı
        slider.setPaintTrack(true); // Kaydırıcının izini göster
        slider.setMajorTickSpacing(25); // Büyük tik aralığı
        slider.setPaintLabels(true); // Etiketleri göster (sayılar)

        // İsteğe bağlı: Tik etiketlerini özelleştirme
        // slider.setOrientation(JSlider.VERTICAL); // Dikey kaydırıcı

        slider.addChangeListener(this); // Değer değiştiğinde tetiklenir

        label = new JLabel("Değer: " + slider.getValue()); // Başlangıç değeri

        frame.add(slider);
        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Değer: " + slider.getValue()); // Etiketi güncelle
    }

    public static void main(String[] args) {
        new SliderOrnegi();
    }
}
```

-----

### 63\. İlerleme Çubuğu (Progress Bar) 📊

`JProgressBar`, bir görevin ilerlemesini görsel olarak göstermek için kullanılır. Kullanıcıya bir işlemin ne kadarının tamamlandığı hakkında geri bildirim sağlar.

**Püf Noktaları ve Best Practices:**

  * **Minimum/Maksimum Değerler:** İlerleme çubuğunun aralığını belirleyin.
  * **Değeri Güncelleme:** `setValue()` metodu ile ilerleme çubuğunun değerini güncelleyin. Bu genellikle bir arka plan iş parçacığında yapılır.
  * **`setStringPainted(true)`:** İlerleme çubuğunun üzerinde yüzde değerini veya özel bir metni göstermek için kullanılır.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class ProgressBarOrnegi implements ActionListener {

    JFrame frame;
    JProgressBar progressBar;
    JButton startButton;

    public ProgressBarOrnegi() {
        frame = new JFrame("Progress Bar Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        progressBar = new JProgressBar(0, 100); // Min:0, Max:100
        progressBar.setValue(0); // Başlangıç değeri
        progressBar.setStringPainted(true); // Yüzde değerini gösterir

        startButton = new JButton("Başlat");
        startButton.addActionListener(this);

        frame.add(progressBar);
        frame.add(startButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startButton.setEnabled(false); // Düğmeyi devre dışı bırak
            fill(); // İlerleme çubuğunu dolduran metodu çağır
        }
    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50); // 50 milisaniye bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
        System.out.println("İşlem tamamlandı!");
        startButton.setEnabled(true); // Düğmeyi tekrar etkinleştir
    }

    public static void main(String[] args) {
        new ProgressBarOrnegi();
    }
}
```

-----

### 64\. Menü Çubuğu (Menubar) 🗄️

`JMenuBar`, bir uygulamanın üst kısmında bulunan ana menü çubuğunu oluşturmak için kullanılır. Menü çubuğu `JMenu` (menüler) ve `JMenuItem` (menü öğeleri) içerir.

**Püf Noktaları ve Best Practices:**

  * **Hiyerarşi:** `JMenuBar` \> `JMenu` \> `JMenuItem` hiyerarşisini takip edin.
  * **Kısayollar ve İkonlar:** Menü öğelerine klavye kısayolları (accelerators) ve ikonlar ekleyebilirsiniz.
  * **Olay Yönetimi:** Menü öğelerine tıklama olaylarını yakalamak için `ActionListener` kullanılır.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent; // Kısayollar için

public class MenubarOrnegi implements ActionListener {

    JMenuBar menuBar;
    JMenu dosyaMenu;
    JMenu duzenMenu;
    JMenu yardimMenu;
    JMenuItem acItem;
    JMenuItem kaydetItem;
    JMenuItem cikisItem;

    public MenubarOrnegi() {
        JFrame frame = new JFrame("Menubar Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null);

        menuBar = new JMenuBar(); // Menü çubuğunu oluştur

        // Menüleri oluştur
        dosyaMenu = new JMenu("Dosya");
        duzenMenu = new JMenu("Düzenle");
        yardimMenu = new JMenu("Yardım");

        // Menü öğelerini oluştur
        acItem = new JMenuItem("Aç");
        kaydetItem = new JMenuItem("Kaydet");
        cikisItem = new JMenuItem("Çıkış");

        // Menü öğelerine kısayollar ekle (isteğe bağlı)
        acItem.setMnemonic(KeyEvent.VK_A); // Alt+A
        kaydetItem.setMnemonic(KeyEvent.VK_K); // Alt+K
        cikisItem.setMnemonic(KeyEvent.VK_C); // Alt+C

        // Menü öğelerine olay dinleyici ekle
        acItem.addActionListener(this);
        kaydetItem.addActionListener(this);
        cikisItem.addActionListener(this);

        // Menü öğelerini menülere ekle
        dosyaMenu.add(acItem);
        dosyaMenu.add(kaydetItem);
        dosyaMenu.addSeparator(); // Ayırıcı
        dosyaMenu.add(cikisItem);

        // Menüleri menü çubuğuna ekle
        menuBar.add(dosyaMenu);
        menuBar.add(duzenMenu);
        menuBar.add(yardimMenu);

        frame.setJMenuBar(menuBar); // Menü çubuğunu Frame'e ata
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == acItem) {
            System.out.println("Dosya açıldı.");
        } else if (e.getSource() == kaydetItem) {
            System.out.println("Dosya kaydedildi.");
        } else if (e.getSource() == cikisItem) {
            System.out.println("Uygulamadan çıkılıyor.");
            System.exit(0); // Uygulamayı kapat
        }
    }

    public static void main(String[] args) {
        new MenubarOrnegi();
    }
}
```

-----

### 65\. Dosya Seçici (Select a File - JFileChooser) 🔎

`JFileChooser`, kullanıcının dosya sisteminde gezinmesine ve bir dosya veya dizin seçmesine olanak tanıyan bir diyalog penceresidir.

**Püf Noktaları ve Best Practices:**

  * **Diyalog Tipleri:** Dosya açma (`OPEN_DIALOG`), dosya kaydetme (`SAVE_DIALOG`) veya sadece dizin seçme (`DIRECTORIES_ONLY`) gibi farklı diyalog tipleri vardır.
  * **Geri Dönüş Değeri:** `showOpenDialog()` veya `showSaveDialog()` metotları, kullanıcının seçimi onaylayıp onaylamadığını (veya iptal edip etmediğini) belirten bir tam sayı değeri döndürür (`JFileChooser.APPROVE_OPTION`, `JFileChooser.CANCEL_OPTION`).
  * **Filtreleme:** Belirli dosya türlerini (örneğin sadece `.txt` dosyaları) göstermek için filtreler ekleyebilirsiniz.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser; // Dosya seçici için
import javax.swing.filechooser.FileNameExtensionFilter; // Filtre için
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File; // File nesnesi için

public class FileChooserOrnegi implements ActionListener {

    JFrame frame;
    JButton selectFileButton;

    public FileChooserOrnegi() {
        frame = new JFrame("File Chooser Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        selectFileButton = new JButton("Dosya Seç");
        selectFileButton.setBounds(100, 50, 200, 50);
        selectFileButton.addActionListener(this);

        frame.add(selectFileButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectFileButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(".")); // Uygulamanın çalıştığı dizini varsayılan yap

            // İsteğe bağlı: Dosya türü filtresi ekleme
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Metin Dosyaları (*.txt)", "txt");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileFilter(filter); // Sadece bu filtreyi göster

            int response = fileChooser.showOpenDialog(null); // Açma diyaloğu göster

            if (response == JFileChooser.APPROVE_OPTION) { // Kullanıcı "Aç" düğmesine tıkladıysa
                File file = fileChooser.getSelectedFile();
                System.out.println("Seçilen dosya: " + file.getAbsolutePath());
                // Burada dosyayı okuma veya işleme kodunu ekleyebilirsiniz
            } else {
                System.out.println("Dosya seçimi iptal edildi.");
            }
        }
    }

    public static void main(String[] args) {
        new FileChooserOrnegi();
    }
}
```

-----

### 66\. Renk Seçici (Color Chooser) 🎨

`JColorChooser`, kullanıcının bir renk seçmesine olanak tanıyan bir diyalog penceresidir.

**Püf Noktaları ve Best Practices:**

  * **Statik Metot:** Renk seçiciyi görüntülemek için `JColorChooser.showDialog()` statik metodu kullanılır.
  * **Dönüş Değeri:** Seçilen rengi `Color` nesnesi olarak döndürür. Eğer kullanıcı iptal ederse `null` döner.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser; // Renk seçici için
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color; // Color nesnesi için

public class ColorChooserOrnegi implements ActionListener {

    JFrame frame;
    JButton colorButton;

    public ColorChooserOrnegi() {
        frame = new JFrame("Color Chooser Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        colorButton = new JButton("Renk Seç");
        colorButton.setBounds(100, 50, 200, 50);
        colorButton.addActionListener(this);

        frame.add(colorButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorButton) {
            Color color = JColorChooser.showDialog(null, "Bir renk seçin", Color.BLACK);

            if (color != null) {
                System.out.println("Seçilen Renk: " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue());
                frame.getContentPane().setBackground(color); // Frame'in arka plan rengini değiştir
            } else {
                System.out.println("Renk seçimi iptal edildi.");
            }
        }
    }

    public static void main(String[] args) {
        new ColorChooserOrnegi();
    }
}
```

-----

### Klavye ve Fare Etkinlikleri

-----

### 67\. KeyListener (Klavye Dinleyicisi) 🚀

`KeyListener` arayüzü, klavye olaylarını (tuşa basma, tuşu bırakma, tuş yazma) dinlemek için kullanılır. Bir bileşenin klavye olaylarını alması için odağa sahip olması gerekir.

**Püf Noktaları ve Best Practices:**

  * **`requestFocusInWindow()`:** Bir bileşenin klavye olaylarını alabilmesi için odağa sahip olması gerekir. Programatik olarak `requestFocusInWindow()` veya `requestFocus()` çağırabilirsiniz.
  * **`KeyEvent`:** `KeyEvent` nesnesi, basılan tuş hakkında bilgi (tuş kodu, karakter) sağlar.
  * **Üç Metot:** `keyPressed()` (tuş basıldığında), `keyReleased()` (tuş bırakıldığında), `keyTyped()` (bir karakter basıldığında) olmak üzere üç metodu vardır.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.KeyListener; // KeyListener için
import java.awt.event.KeyEvent; // KeyEvent için
import java.awt.Color;
import java.awt.Font;

public class KeyListenerOrnegi extends JFrame implements KeyListener {

    JLabel label;

    public KeyListenerOrnegi() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null); // Manuel konumlandırma için
        this.addKeyListener(this); // Frame'e KeyListener ekle
        this.setFocusable(true); // Frame'in klavye odağını alabilmesini sağlar

        label = new JLabel("Bir tuşa basın!");
        label.setBounds(0, 0, 100, 50); // Konum ve boyut
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.setFont(new Font("Consolas", Font.PLAIN, 25));

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Tuş basılıp bırakıldığında ve karakter ürettiğinde
        System.out.println("keyTyped: " + e.getKeyChar());
        // Label'ın konumunu değiştir
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10, label.getY()); break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10); break;
            case 'd': label.setLocation(label.getX() + 10, label.getY()); break;
            case 's': label.setLocation(label.getX(), label.getY() + 10); break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Tuşa basıldığı anda
        System.out.println("keyPressed: " + e.getKeyCode()); // Tuşun ASCII kodu
        // Farenin konumunu değiştir
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT: label.setLocation(label.getX() - 10, label.getY()); break;
            case KeyEvent.VK_UP: label.setLocation(label.getX(), label.getY() - 10); break;
            case KeyEvent.VK_RIGHT: label.setLocation(label.getX() + 10, label.getY()); break;
            case KeyEvent.VK_DOWN: label.setLocation(label.getX(), label.getY() + 10); break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Tuş bırakıldığında
        System.out.println("keyReleased: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerOrnegi();
    }
}
```

-----

### 68\. MouseListener (Fare Dinleyicisi) 🖱️

`MouseListener` arayüzü, fare olaylarını (tıklama, basma, bırakma, üzerine gelme, üzerinden ayrılma) dinlemek için kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Beş Metot:** `MouseListener`'ın beş metodu vardır: `mouseClicked()`, `mousePressed()`, `mouseReleased()`, `mouseEntered()`, `mouseExited()`.
  * **`MouseEvent`:** `MouseEvent` nesnesi, farenin konumu, tıklanan düğme gibi bilgiler sağlar.
  * **`MouseAdapter`:** Eğer sadece belirli fare olaylarını dinlemek istiyorsanız, `MouseAdapter` sınıfını extend etmek daha kolaydır. Bu, tüm metotları boş olarak implemente etmenizi gerektirmeyerek kodunuzu temiz tutar.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseListener; // MouseListener için
import java.awt.event.MouseEvent; // MouseEvent için
import java.awt.Color;
import java.awt.FlowLayout;

public class MouseListenerOrnegi extends JFrame implements MouseListener {

    JLabel label;

    public MouseListenerOrnegi() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.setBounds(0, 0, 200, 200); // Boyut ve konum
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this); // Label'a MouseListener ekle

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Fare tıklanıp bırakıldığında
        System.out.println("Fare tıklandı. Konum: (" + e.getX() + "," + e.getY() + ")");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Fare düğmesi basıldığında
        System.out.println("Fare düğmesi basıldı.");
        label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Fare düğmesi bırakıldığında
        System.out.println("Fare düğmesi bırakıldı.");
        label.setBackground(Color.RED);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Fare imleci bileşenin üzerine geldiğinde
        System.out.println("Fare bileşenin üzerine geldi.");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Fare imleci bileşenin üzerinden ayrıldığında
        System.out.println("Fare bileşenden ayrıldı.");
        label.setBackground(Color.ORANGE);
    }

    public static void main(String[] args) {
        new MouseListenerOrnegi();
    }
}
```

-----

### 69\. Sürükle ve Bırak (Drag and Drop) 👈

Sürükle ve bırak, GUI'de bir bileşeni fare ile alıp başka bir konuma taşımayı veya başka bir bileşenin üzerine bırakmayı ifade eder. Swing'de bu, genellikle `MouseListener`, `MouseMotionListener` ve bazen `TransferHandler` kullanılarak implemente edilir.

**Püf Noktaları ve Best Practices:**

  * **`MouseMotionListener`:** Farenin sürüklenmesini (`mouseDragged()`) ve hareket etmesini (`mouseMoved()`) takip etmek için kullanılır.
  * **Koordinatlar:** `MouseEvent.getX()` ve `MouseEvent.getY()` ile fare imlecinin anlık konumunu alarak bileşenin konumunu güncelleyebilirsiniz.
  * **Karmaşıklık:** Tam teşekküllü sürükle ve bırak işlevselliği, özellikle verileri bir yerden başka bir yere aktarırken biraz karmaşık olabilir ve `TransferHandler` gibi daha gelişmiş API'leri gerektirebilir.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter; // MouseListener'ın adaptör sınıfı
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener; // Fare hareketi için
import java.awt.Color;
import java.awt.Point; // X, Y koordinatlarını tutmak için

public class DragAndDropOrnegi extends JFrame {

    JPanel dragPanel;
    Point initialClick; // Farenin ilk tıklandığı nokta

    public DragAndDropOrnegi() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null); // Bileşenleri elle konumlandıracağız

        dragPanel = new JPanel();
        dragPanel.setBackground(Color.BLUE);
        dragPanel.setBounds(50, 50, 100, 100); // Başlangıç konumu ve boyutu

        // MouseAdapter kullanarak hem MouseListener hem de MouseMotionListener'ı kolayca implemente ederiz
        dragPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint(); // Farenin panel üzerindeki başlangıç tıklandığı noktayı kaydet
                // Panel'i diğer bileşenlerin üzerine çıkarmak için
                dragPanel.getParent().setComponentZOrder(dragPanel, 0);
            }
        });

        dragPanel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Panelin yeni konumunu hesapla
                int thisX = dragPanel.getLocation().x;
                int thisY = dragPanel.getLocation().y;

                int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
                int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

                int X = thisX + xMoved;
                int Y = thisY + yMoved;

                // Panelin yeni konumunu ayarla
                dragPanel.setLocation(X, Y);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // Fare sadece hareket ettiğinde (sürüklenmediğinde)
            }
        });

        this.add(dragPanel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DragAndDropOrnegi();
    }
}
```

-----

### 70\. Tuş Bağlantıları (Key Bindings) ⌨️

`Key Bindings`, belirli bir bileşende bir klavye tuşuna basıldığında veya bırakıldığında özel bir eylem gerçekleştirmek için `KeyListener`'a daha esnek ve güçlü bir alternatiftir. Özellikle farklı tuş durumlarını (basılı, bırakıldı, yazıldı) ayrı ayrı kontrol etmek ve tek bir bileşen için birden fazla tuş olayını yönetmek için kullanışlıdır.

**Püf Noktaları ve Best Practices:**

  * **Giriş Haritaları (Input Maps) ve Eylem Haritaları (Action Maps):** Key Bindings, tuş girişlerini eylemlerle eşleştirmek için bu iki haritayı kullanır.
  * **`JComponent.WHEN_IN_FOCUSED_WINDOW`:** Pencerenin odağı olduğu sürece tuş olayını dinlemek için yaygın bir koşul.
  * **Daha Esnek:** `KeyListener`'dan daha esnektir ve uygulama genelinde tuş olaylarını işlemek için daha uygundur.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.AbstractAction; // Eylem oluşturmak için
import javax.swing.ActionMap; // Eylem haritası için
import javax.swing.InputMap; // Giriş haritası için
import javax.swing.KeyStroke; // Tuş vuruşunu temsil etmek için
import java.awt.event.ActionEvent; // ActionEvent için
import java.awt.event.KeyEvent; // KeyEvent için
import java.awt.Color;
import java.awt.Font;

public class KeyBindingsOrnegi extends JFrame {

    JPanel panel;
    JLabel label;

    public KeyBindingsOrnegi() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 0, 500, 500);
        panel.setLayout(null);

        label = new JLabel("Basın: A (Sol), D (Sağ), W (Yukarı), S (Aşağı)");
        label.setBounds(100, 100, 300, 50);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD, 15));
        label.setHorizontalAlignment(JLabel.CENTER);

        // InputMap ve ActionMap'i al
        InputMap inputMap = panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW); // Pencere odağı olduğunda dinle
        ActionMap actionMap = panel.getActionMap();

        // Tuş ve Eylem eşleştirmeleri
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "moveLeft"); // Sol ok tuşu
        actionMap.put("moveLeft", new SolHareketEylemi());

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "moveRight"); // Sağ ok tuşu
        actionMap.put("moveRight", new SagHareketEylemi());

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "moveUp"); // Yukarı ok tuşu
        actionMap.put("moveUp", new YukariHareketEylemi());

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "moveDown"); // Aşağı ok tuşu
        actionMap.put("moveDown", new AsagiHareketEylemi());

        // Alternatif olarak 'W','A','S','D' tuşları
        inputMap.put(KeyStroke.getKeyStroke('A'), "moveLeft");
        inputMap.put(KeyStroke.getKeyStroke('D'), "moveRight");
        inputMap.put(KeyStroke.getKeyStroke('W'), "moveUp");
        inputMap.put(KeyStroke.getKeyStroke('S'), "moveDown");


        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    // Hareket eylemleri (iç sınıflar)
    public class SolHareketEylemi extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class SagHareketEylemi extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

    public class YukariHareketEylemi extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class AsagiHareketEylemi extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }


    public static void main(String[] args) {
        new KeyBindingsOrnegi();
    }
}
```

-----

### 71\. 2D Grafikler (2D Graphics) 🖍️

Java'da 2D grafikler çizmek için `java.awt.Graphics` veya `java.awt.Graphics2D` (daha gelişmiş) sınıfı kullanılır. Genellikle bir `JPanel`'in `paintComponent()` metodunu geçersiz kılarak ve bu metot içinde çizim komutlarını kullanarak yapılır.

**Püf Noktaları ve Best Practices:**

  * **`paintComponent()`:** Swing'de çizim yapmanın doğru yolu, bir `JComponent` (genellikle `JPanel`) alt sınıfının `paintComponent(Graphics g)` metodunu geçersiz kılmaktır. `super.paintComponent(g)`'yi ilk satırda çağırmayı unutmayın.
  * **`Graphics2D`:** Daha gelişmiş çizim özellikleri (dönüşüm, anti-aliasing, karmaşık şekiller) için `Graphics` nesnesini `Graphics2D`'ye dönüştürün (`Graphics2D g2d = (Graphics2D) g;`).
  * **Yeniden Boyama:** Bir çizimi güncellemek veya değiştirmek için `repaint()` metodunu çağırın. Bu, `paintComponent()` metodunu yeniden tetikler.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics; // Temel grafikler
import java.awt.Graphics2D; // Gelişmiş grafikler
import java.awt.Color;
import java.awt.BasicStroke; // Kalın çizgi için

class CizimPaneli extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Üst sınıfın paintComponent'ini çağır
        Graphics2D g2d = (Graphics2D) g; // Graphics'i Graphics2D'ye dönüştür

        // Arka plan rengini ayarla
        g2d.setBackground(Color.LIGHT_GRAY);
        g2d.clearRect(0, 0, getWidth(), getHeight()); // Tüm paneli temizle

        // Renk ayarla
        g2d.setColor(Color.BLUE);
        // Oval çiz
        g2d.drawOval(50, 50, 100, 100); // x, y, genişlik, yükseklik
        // Doldurulmuş oval çiz
        g2d.fillOval(200, 50, 100, 100);

        g2d.setColor(Color.RED);
        // Dikdörtgen çiz
        g2d.drawRect(50, 200, 150, 100);
        // Doldurulmuş dikdörtgen çiz
        g2d.fillRect(250, 200, 150, 100);

        g2d.setColor(Color.GREEN);
        // Çizgi çiz
        g2d.drawLine(50, 350, 450, 350);

        // Kalın çizgi
        g2d.setStroke(new BasicStroke(5)); // 5 piksel kalınlık
        g2d.setColor(Color.BLACK);
        g2d.drawLine(50, 400, 450, 400);

        // Metin çiz
        g2d.setColor(Color.MAGENTA);
        g2d.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
        g2d.drawString("Merhaba 2D Grafikler!", 50, 450);
    }
}

public class Graphics2DOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Graphics Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);
        frame.add(new CizimPaneli()); // Çizim panelini ekle
        frame.setVisible(true);
    }
}
```

-----

### 72\. 2D Animasyon (2D Animation) 👾

2D animasyon, bir dizi 2D grafik görüntüsünün hızlı bir şekilde art arda görüntülenmesiyle hareket yanılsaması oluşturmaktır. Java'da bu, genellikle bir `Timer` kullanarak `paintComponent()` metodunu düzenli aralıklarla yeniden boyayarak yapılır.

**Püf Noktaları ve Best Practices:**

  * **`javax.swing.Timer`:** Animasyon döngüsünü kontrol etmek için en uygun araçtır. Belirli aralıklarla bir `ActionListener`'ı tetikler.
  * **Arka Plan İş Parçacığı (Threading):** Karmaşık animasyonları GUI'yi dondurmadan çalıştırmak için ayrı bir iş parçacığı kullanmak veya `SwingWorker`'ı tercih etmek önemlidir.
  * **Çift Tamponlama (Double Buffering):** Animasyonlarda titremeyi (flickering) önlemek için genellikle çift tamponlama kullanılır. `JComponent` zaten bunu sağlar, bu yüzden sadece `paintComponent` içinde çizim yapmaya odaklanın.

<!-- end list -->

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer; // Animasyon için Timer
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AnimasyonPaneli extends JPanel implements ActionListener {
    private int x = 0; // Topun X konumu
    private int y = 0; // Topun Y konumu
    private int xYon = 1; // X yönü (1:sağ, -1:sol)
    private int yYon = 1; // Y yönü (1:aşağı, -1:yukarı)
    private final int TOP_BOYUT = 50; // Topun boyutu
    private final int HIZ = 2; // Hareket hızı

    private Timer timer;

    public AnimasyonPaneli() {
        setBackground(Color.BLACK);
        timer = new Timer(10, this); // Her 10 milisaniyede bir actionPerformed'ı çağır
        timer.start(); // Zamanlayıcıyı başlat
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, TOP_BOYUT, TOP_BOYUT); // Topu çiz
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Topun hareketini güncelle
        x += xYon * HIZ;
        y += yYon * HIZ;

        // Kenarlara çarptığında yön değiştir
        if (x + TOP_BOYUT > getWidth() || x < 0) {
            xYon *= -1;
        }
        if (y + TOP_BOYUT > getHeight() || y < 0) {
            yYon *= -1;
        }

        repaint(); // Paneli yeniden boya
    }
}

public class Animation2DOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Animasyon Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new AnimasyonPaneli());
        frame.setVisible(true);
    }
}
```

-----

### Gelişmiş Java Konuları

-----

### 73\. Generics (Jenerikler) ❓

Jenerikler, veri tiplerini (sınıfları, arayüzleri ve metotları) belirsiz bırakarak, onlarla çalışırken tip güvenliği sağlamanıza ve kod tekrarını azaltmanıza olanak tanır. Genellikle koleksiyonlarla (ArrayList, HashMap vb.) kullanılır.

**Püf Noktaları ve Best Practices:**

  * **Tip Güvenliği:** Derleme zamanında tip hatalarını yakalamaya yardımcı olur, böylece çalışma zamanı `ClassCastException` hatalarını önler.
  * **Kod Tekrarı Yok:** Farklı tipler için aynı kodu tekrar tekrar yazmak yerine, jenerik sınıflar ve metotlar kullanabilirsiniz.
  * **Tip Silme (Type Erasure):** Jenerik bilgiler çalışma zamanında silinir. Yani `ArrayList<String>` ve `ArrayList<Integer>` aslında çalışma zamanında aynı `ArrayList` sınıfıdır. Bu, ilkel tipleri doğrudan jenerik parametre olarak kullanamayacağınız anlamına gelir (`ArrayList<int>` değil, `ArrayList<Integer>`).

<!-- end list -->

```java
// Jenerik sınıf örneği
class Kutu<T> { // T: Tip parametresi
    private T icerik;

    public Kutu(T icerik) {
        this.icerik = icerik;
    }

    public T getIcerik() {
        return icerik;
    }

    public void setIcerik(T icerik) {
        this.icerik = icerik;
    }
}

public class GenericsOrnegi {
    public static void main(String[] args) {
        // String türünde bir kutu
        Kutu<String> stringKutu = new Kutu<>("Merhaba Dünya");
        String mesaj = stringKutu.getIcerik();
        System.out.println("String Kutu: " + mesaj);

        // Integer türünde bir kutu
        Kutu<Integer> integerKutu = new Kutu<>(123);
        int sayi = integerKutu.getIcerik();
        System.out.println("Integer Kutu: " + sayi);

        // Hata: stringKutu.setIcerik(456); // Derleme zamanı hatası

        // Jenerik metot örneği
        yazdir(stringKutu);
        yazdir(integerKutu);

        // Sınırlı Jenerik Metot (Bounded Type Parameter)
        double toplamaSonuc = toplaSayilar(new Double(10.5), new Integer(20));
        System.out.println("Sayıların toplamı: " + toplamaSonuc);
    }

    // Jenerik metot
    public static <T> void yazdir(Kutu<T> kutu) {
        System.out.println("Kutunun içeriği: " + kutu.getIcerik());
    }

    // Sınırlı Jenerik Metot (Sadece Number alt sınıfları kabul eder)
    public static <T extends Number> double toplaSayilar(T sayi1, T sayi2) {
        return sayi1.doubleValue() + sayi2.doubleValue();
    }
}
```

-----

### 74\. Serileştirme (Serialization) 🥣

Serileştirme, bir Java nesnesinin durumunu bir bayt akışına dönüştürme işlemidir. Bu bayt akışı daha sonra bir dosyaya kaydedilebilir, ağ üzerinden gönderilebilir veya veritabanında saklanabilir. Serileştirilmiş bir nesne, daha sonra aynı veya başka bir Java sanal makinesinde orijinal durumuna geri yüklenebilir (deserileştirme).

**Püf Noktaları ve Best Practices:**

  * **`Serializable` Arayüzü:** Serileştirilebilir olmasını istediğiniz sınıfın `java.io.Serializable` arayüzünü implemente etmesi gerekir (içinde metot yoktur, sadece bir "işaretleyici" arayüzdür).
  * **`serialVersionUID`:** Serileştirilebilir sınıflar için bir `serialVersionUID` tanımlamak iyi bir pratiktir. Bu, sınıfın farklı sürümleri arasında uyumluluğu kontrol etmeye yardımcı olur.
  * **`transient` Anahtar Kelimesi:** Bir alanın serileştirilmesini istemiyorsanız (örneğin, hassas veriler veya geçici veriler), `transient` anahtar kelimesiyle işaretleyebilirsiniz.
  * **Performans ve Güvenlik:** Serileştirme, performans veya güvenlik açısından her zaman en iyi seçenek olmayabilir. Özellikle ağ üzerinden veri aktarırken JSON, XML gibi formatlar veya daha gelişmiş serileştirme kütüphaneleri (örneğin Google Protocol Buffers) tercih edilebilir.

<!-- end list -->

```java
import java.io.*;

// Serileştirilebilir bir sınıf
class Oyuncu implements Serializable {
    private static final long serialVersionUID = 1L; // Versiyon kontrolü için
    private String ad;
    private int seviye;
    private transient String sifre; // Transient: Bu alan serileştirilmeyecek

    public Oyuncu(String ad, int seviye, String sifre) {
        this.ad = ad;
        this.seviye = seviye;
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "Oyuncu [Ad=" + ad + ", Seviye=" + seviye + ", Şifre=" + sifre + "]";
    }
}

public class SerilestirmeOrnegi {
    public static void main(String[] args) {
        Oyuncu oyuncu1 = new Oyuncu("Alice", 10, "gizliSifre123");
        String dosyaAdi = "oyuncu.ser";

        // Nesneyi serileştirme (diske yazma)
        try (FileOutputStream fileOut = new FileOutputStream(dosyaAdi);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(oyuncu1);
            System.out.println("Oyuncu nesnesi serileştirildi ve " + dosyaAdi + " dosyasına kaydedildi.");
            System.out.println("Serileştirilen: " + oyuncu1);
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Nesneyi deserileştirme (diskten okuma)
        Oyuncu oyuncu2 = null;
        try (FileInputStream fileIn = new FileInputStream(dosyaAdi);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            oyuncu2 = (Oyuncu) in.readObject(); // Nesneyi oku ve türe dönüştür
            System.out.println("\nOyuncu nesnesi deserileştirildi.");
            System.out.println("Deserileştirilen: " + oyuncu2); // Şifre null olacak çünkü transient
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Oyuncu sınıfı bulunamadı.");
            c.printStackTrace();
            return;
        }

        System.out.println("Orjinal oyuncu ile deserileştirilen oyuncu aynı mı? " + (oyuncu1 == oyuncu2)); // False, çünkü farklı nesneler
        System.out.println("Orjinal oyuncu seviyesi: " + oyuncu1.seviye);
        System.out.println("Deserileştirilen oyuncu seviyesi: " + oyuncu2.seviye);
    }
}
```

-----

### 75\. TimerTask ⌚

`TimerTask` sınıfı, `java.util.Timer` ile birlikte kullanılarak belirli bir gecikmeden sonra veya düzenli aralıklarla bir görevi (task) yürütmek için kullanılır. Arka plan görevlerini veya zamanlanmış olayları yönetmek için idealdir.

**Püf Noktaları ve Best Practices:**

  * **Basit Zamanlama:** Basit zamanlanmış görevler için `Timer` ve `TimerTask` yeterlidir.
  * **Tek İş Parçacığı:** `Timer`, görevleri tek bir iş parçacığında çalıştırır. Eğer bir görev uzun sürerse veya başka bir görevi bekletirse, diğer zamanlanmış görevlerin gecikmesine neden olabilir. Daha karmaşık senaryolar için `ScheduledExecutorService` daha uygundur.
  * **İptal Etme:** Bir `TimerTask`'ı `cancel()` metoduyla iptal edebilirsiniz. Bir `Timer`'ı ise `cancel()` metoduyla tüm zamanlanmış görevlerini durdurabilirsiniz.

<!-- end list -->

```java
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskOrnegi {
    public static void main(String[] args) {
        Timer timer = new Timer(); // Zamanlayıcı nesnesi

        TimerTask gorev1 = new TimerTask() {
            int sayac = 0;
            @Override
            public void run() {
                if (sayac < 5) {
                    System.out.println("Görev 1 çalıştı: " + (sayac + 1) + ". kez");
                    sayac++;
                } else {
                    System.out.println("Görev 1 tamamlandı, iptal ediliyor.");
                    timer.cancel(); // Tüm zamanlayıcıyı iptal et
                }
            }
        };

        TimerTask gorev2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Görev 2 çalıştı (Her 3 saniyede bir)");
            }
        };

        // Görevleri zamanla
        // timer.schedule(gorev1, 2000); // 2 saniye sonra bir kez çalıştır
        timer.scheduleAtFixedRate(gorev1, 1000, 1000); // 1 saniye sonra başla, her 1 saniyede bir tekrarla
        timer.scheduleAtFixedRate(gorev2, 3000, 3000); // 3 saniye sonra başla, her 3 saniyede bir tekrarla

        System.out.println("Timer başladı. Bekliyor...");
    }
}
```

-----

### 76\. İş Parçacıkları (Threads) 🧵

İş parçacıkları (threads), bir program içindeki bağımsız yürütme yollarıdır. Tek bir programın aynı anda birden fazla görevi eşzamanlı olarak yapmasına olanak tanır. Java'da iş parçacıkları `java.lang.Thread` sınıfı veya `java.lang.Runnable` arayüzü ile oluşturulur.

**Püf Noktaları ve Best Practices:**

  * **`Thread` Sınıfı ile:** `Thread` sınıfını extend ederek `run()` metodunu geçersiz kılın.
  * **`Runnable` Arayüzü ile:** `Runnable` arayüzünü implemente ederek `run()` metodunu geçersiz kılın. Bu, sınıfınızın başka bir sınıftan miras alması gerektiğinde daha esnek bir yaklaşımdır.
  * **`start()` vs. `run()`:** Bir iş parçacığını başlatmak için her zaman `start()` metodunu çağırın. `run()` metodunu doğrudan çağırmak, kodu aynı iş parçacığında normal bir metot çağrısı gibi yürütür ve yeni bir iş parçacığı oluşturmaz.
  * **Eşzamanlılık Sorunları:** Birden fazla iş parçacığı aynı veriye eriştiğinde veya üzerinde işlem yaptığında senkronizasyon sorunları ortaya çıkabilir. `synchronized` anahtar kelimesi, kilitler (locks) veya atomik sınıflar kullanarak bu sorunları çözebilirsiniz.

<!-- end list -->

```java
// 1. Yol: Thread sınıfını extend etme
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500); // Yarım saniye bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 bitti.");
    }
}

// 2. Yol: Runnable arayüzünü implemente etme (daha çok tercih edilir)
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Runnable Thread bitti.");
    }
}

public class ThreadOrnegi {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start(); // Yeni iş parçacığını başlat

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start(); // Runnable implemente eden bir iş parçacığını başlat

        System.out.println("Ana iş parçacığı devam ediyor.");

        // main thread'in diğer thread'lerin bitmesini beklemesi
        try {
            thread1.join(); // thread1 bitene kadar bekle
            thread2.join(); // thread2 bitene kadar bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tüm iş parçacıkları bitti.");
    }
}
```

-----

### 77\. Çoklu İş Parçacığı (Multithreading) 🧶

Çoklu iş parçacığı (multithreading), bir uygulamanın birden fazla iş parçacığını aynı anda (eşzamanlı olarak) çalıştırması yeteneğidir. Bu, programın daha duyarlı, etkileşimli ve daha hızlı olmasına yardımcı olabilir, özellikle yoğun kaynak kullanan işlemlerde.

**Püf Noktaları ve Best Practices:**

  * **Senkronizasyon:** Birden fazla iş parçacığı aynı paylaşılan kaynağa (veri, dosya vb.) eriştiğinde veya onu değiştirdiğinde ortaya çıkan **yarış koşulları (race conditions)** ve **kilitlenmeler (deadlocks)** gibi sorunları önlemek için senkronizasyon mekanizmalarını ( `synchronized` bloklar/metotlar, `Lock` arayüzü, `Semaphore` vb.) doğru kullanın.
  * **İş Parçacığı Havuzları (Thread Pools):** Çok sayıda kısa ömürlü iş parçacığı oluşturmak ve yönetmek yerine, `ExecutorService` gibi iş parçacığı havuzlarını kullanmak daha verimli ve kaynak dostudur.
  * **GUI ile Multithreading:** Swing gibi GUI kütüphanelerinde, uzun süreli veya yoğun işlemlerin GUI'yi dondurmasını önlemek için ayrı iş parçacıklarında çalıştırılması ve GUI güncellemelerinin **Event Dispatch Thread (EDT)** üzerinde yapılması çok önemlidir ( `SwingWorker` bunun için idealdir).

<!-- end list -->

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Gorev implements Runnable {
    private String isim;

    public Gorev(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " görevi başladı. Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(new java.util.Random().nextInt(2000) + 500); // Rastgele süre bekle
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Kesintiyi tekrar belirt
            System.out.println(isim + " görevi kesildi.");
        }
        System.out.println(isim + " görevi bitti.");
    }
}

public class MultithreadingOrnegi {
    public static void main(String[] args) {
        // Bir ExecutorService ile iş parçacığı havuzu oluştur
        ExecutorService executor = Executors.newFixedThreadPool(3); // Sabit 3 iş parçacıklı havuz

        // Farklı görevleri havuza gönder
        for (int i = 1; i <= 5; i++) {
            executor.submit(new Gorev("Görev " + i));
        }

        executor.shutdown(); // Yeni görevleri kabul etmeyi durdur
        System.out.println("Tüm görevler havuza gönderildi.");

        try {
            // Tüm görevlerin tamamlanmasını bekle (veya bir zaman aşımı belirle)
            if (executor.awaitTermination(60, TimeUnit.SECONDS)) {
                System.out.println("Tüm görevler başarıyla tamamlandı.");
            } else {
                System.out.println("Bazı görevler zaman aşımına uğradı.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

-----

### Geliştirme Ortamı ve Dağıtım

-----

### 78\. Paketler (Packages) 📦

Paketler, Java sınıflarını mantıksal olarak gruplamak ve isim çakışmalarını önlemek için kullanılan dizin benzeri yapılardır. Kodun düzenini, modülerliğini ve yeniden kullanılabilirliğini artırır.

**Püf Noktaları ve Best Practices:**

  * **Ters Alan Adı Kuralı:** Paket isimleri genellikle ters alan adı kuralına göre verilir (örneğin `com.sirketadi.projeadi.moduladi`).
  * **Tek Sınıf/İşlevsellik:** Bir paketi, belirli bir işlevsellikle ilgili sınıfları içerecek şekilde tasarlayın.
  * **`import` Deyimi:** Başka bir paketteki bir sınıfı kullanmak için `import` deyimini kullanmanız gerekir. Aynı paketteki sınıflar için `import`'a gerek yoktur.
  * **`default` Paket:** Bir paket belirtmezseniz, sınıflar "default" pakete yerleştirilir. Büyük projelerde bu önerilmez.

<!-- end list -->

```java
// package com.benimprojem.modul; // Dosyanın en üstünde yer alır

import java.util.Scanner; // Başka bir paketten sınıfı içeri aktarma
// import java.util.*; // java.util paketindeki tüm sınıfları aktar

public class PaketOrnegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merhaba, paketler dünyası!");
        // Bu sınıfın içinde, eğer başka bir sınıf olsaydı,
        // o sınıfı import etmeden doğrudan kullanabilirdik
        scanner.close();
    }
}
```

-----

### 79\. Komut İstemiyle Derleme/Çalıştırma (Compile/Run Command Prompt) 💽

Java kodunu bir Entegre Geliştirme Ortamı (IDE) kullanmadan komut isteminden derlemek ve çalıştırmak, temel süreci anlamak için önemlidir.

**Püf Noktaları ve Best Practices:**

  * **`javac` (Derleme):** `.java` kaynak kod dosyasını `.class` bytecode dosyasına derler.
      * `javac DosyaAdi.java`
  * **`java` (Çalıştırma):** `.class` bytecode dosyasını (ana metodu içeren) Java Sanal Makinesi (JVM) üzerinde çalıştırır.
      * `java DosyaAdi` (uzantısız)
  * **Sınıf Yolu (Classpath):** Java'nın sınıf dosyalarını nerede arayacağını belirtmek için `-cp` veya `-classpath` argümanını kullanmanız gerekebilir, özellikle birden fazla paketteki veya harici JAR dosyalarındaki sınıfları kullanıyorsanız.

<!-- end list -->

```bash
# Terminal (Komut İstemi) Örneği

# 1. Kaynak kodu oluştur (örneğin: Merhaba.java)
# Merhaba.java içeriği:
# public class Merhaba {
#     public static void main(String[] args) {
#         System.out.println("Merhaba Komut İstemi!");
#     }
# }

# 2. Dosyayı kaydettiğiniz dizine gidin (cd komutu ile)
# cd C:\Users\KullaniciAdi\JavaProjeleri

# 3. Kodu derle
javac Merhaba.java

# Eğer hata yoksa, Merhaba.class dosyası oluşur.

# 4. Kodu çalıştır
java Merhaba

# Çıktı: Merhaba Komut İstemi!
```

-----

### 80\. Çalıştırılabilir (.jar) Dosya (Executable .jar) ☕

Bir `.jar` (Java Archive) dosyası, derlenmiş Java sınıf dosyalarını (bytecode), ilgili kaynakları (resimler, sesler vb.) ve metadata'yı içeren sıkıştırılmış bir arşiv dosyasıdır. Java uygulamalarını dağıtmak için standart bir formattır. Çalıştırılabilir JAR dosyaları, `java -jar` komutuyla doğrudan çalıştırılabilir.

**Püf Noktaları ve Best Practices:**

  * **Manifest Dosyası:** Çalıştırılabilir bir JAR dosyası oluşturmak için, ana metodu (`main` metodu) içeren sınıfı belirten bir `Manifest.mf` dosyası gereklidir.
  * **Bağımlılıklar:** Uygulamanızın kullandığı tüm harici kütüphaneleri (JAR dosyaları) JAR dosyasının içine dahil etmeli veya sınıf yoluna eklemelisiniz.
  * **IDE Desteği:** Çoğu modern IDE (IntelliJ IDEA, Eclipse) çalıştırılabilir JAR dosyalarını kolayca dışa aktarma (export) özelliği sunar.

<!-- end list -->

```bash
# Terminal (Komut İstemi) Örneği

# Önceki örnekteki Merhaba.java'yı derlediğinizi varsayalım.

# 1. Bir manifest dosyası oluşturun (örneğin: MANIFEST.MF)
# MANIFEST.MF içeriği:
# Main-Class: Merhaba
# (Son satırda boş bir satır bırakmayı unutmayın!)

# 2. Manifest dosyasını ve .class dosyasını içeren bir JAR oluşturun
jar cfe MerhabaUygulamam.jar Merhaba Merhaba.class

# Alternatif olarak, eğer bir manifest dosyanız varsa:
# jar cfm MerhabaUygulamam.jar MANIFEST.MF Merhaba.class

# 3. JAR dosyasını çalıştırın
java -jar MerhabaUygulamam.jar

# Çıktı: Merhaba Komut İstemi!
```
