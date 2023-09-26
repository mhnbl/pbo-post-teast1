# Post Test 1 - PBO

**Nama** :  Muhammad Nabil

**NIM** :  2209116056

**Kelas** :  A2

## Kelas Film
Kelas Film ini bertanggung jawab untuk merepresentasikan informasi tentang film dengan menyimpan judul dan sutradara dalam atributnya, dan konstruktornya digunakan untuk menginisialisasi objek Film dengan nilai-nilai tersebut saat objeknya dibuat. Kelas ini adalah bagian penting dari program, karena digunakan dalam membuat objek-objek Film yang kemudian ditambahkan ke dalam ArrayList dan ditampilkan dalam program utama.

Berikut adalah penjelasan tentang progam kelas Film:

- ### Property
  ![Screenshot 2023-09-26 153203](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/da2727bb-fba1-488f-9970-c3aede337764)

  **'public class Film { ... }'**: Ini adalah deklarasi kelas **'Film'**. Kelas ini digunakan untuk merepresentasikan objek-objek Film dalam program.

  **'public String title;'** dan **'public String director;'**: Ini adalah dua atribut (property) yang dimiliki oleh kelas Film. Masing-masing atribut ini adalah variabel yang akan digunakan untuk menyimpan informasi tentang judul film (**'title'**) dan sutradara film (**'director'**). Karena atribut ini dideklarasikan sebagai **'public'**, mereka dapat diakses dari luar kelas.

- ### Constructor
  
  ![Screenshot 2023-09-26 153218](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/91dec59c-242a-48e7-b264-6ba7d44dfe98)

  **'public Film(String judul, String sutradara) { ... }'**: Ini adalah konstruktor kelas Film. Konstruktor ini memiliki dua parameter, yaitu **'judul'** (tipe String) dan **'sutradara'** (tipe String).

  Konstruktor ini digunakan untuk membuat objek Film. Membuat objek Film dengan memasukan nama judul dan sutradara, dan konstruktor ini akan menginisialisasi atribut **'title'** dan **'director'** dengan nilai-nilai yang diberikan.

## File Utama
Seluruh program ini digunakan untuk membuat, mengisi, dan menampilkan informasi tentang beberapa objek Film menggunakan kelas Film dan ArrayList.

Berikut adalah penjelasan tentang program utama:

- ### Import ArrayList
  
  ![Screenshot 2023-09-26 154527](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/1186046e-5d1f-42a2-aeb9-c99249211794)

  Ini adalah bagian impor. Di sini, pustaka **'ArrayList'** diimpor dari paket **''java.util'**. Pustaka ini digunakan untuk membuat dan mengelola daftar objek dalam program.

- ### Inisialisasi ArrayList

  ![Screenshot 2023-09-26 154829](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/88843fad-58cb-4175-a774-3d7369f7078c)

  Ini adalah deklarasi dan inisialisasi variabel **'films'** sebagai sebuah ArrayList yang akan digunakan untuk menyimpan objek-objek Film. **<'Film'>** adalah jenis objek yang akan disimpan dalam ArrayList.

- ### Mengisi ArrayList

  ![Screenshot 2023-09-26 155212](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/75875746-6e3b-478e-b732-cdc0b8fbdec4)

  Ini adalah bagian di mana objek Film dibuat dan ditambahkan ke dalam ArrayList **'films'** menggunakan metode **'add'**. Setiap objek Film dibuat dengan menggunakan konstruktor kelas **'Film'** dan kemudian ditambahkan ke dalam ArrayList.

- ### Perulangan

  ![Screenshot 2023-09-26 155436](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/7e4a072d-9bc8-434d-935b-9e21b28947ff)

  Ini adalah perulangan **'for-each'** yang digunakan untuk mengakses setiap objek Film dalam ArrayList **'films'** dan mencetak informasi tentang setiap film ke layar. Format informasi yang dicetak adalah judul film dan sutradara film yang diambil dari atribut **'title'** dan **'director'** masing-masing objek Film.

## Output

![Screenshot 2023-09-26 160430](https://github.com/mhnbl/pbo-post-teast1/assets/125839542/ac341e1a-3490-4730-b3ea-8ff69b2515f8)

Setiap baris dalam output ini berisi informasi tentang satu film. Format informasi ini adalah:

"Film berjudul" dan "disutradarai oleh" adalah teks konstan yang menunjukkan judul dan sutradara sebuah film. Nama judul dan sutradara setiap film diambil dari masing-masing atribut **'title'** dan **'director'** objek Film. Output ini bergantung pada data yang telah dimasukkan ke dalam ArrayList **'films'** saat program berjalan.
