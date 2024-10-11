# Game-Pokemon-OOP-Java

Budi merupakan seorang programmer di perusahaan Niantik. Dia ditugaskan untuk membuat sebuah Game Pokemon dengan menggunakan Java Console dengan ketentuan sebagai berikut :
1.	(7 Point) Pada saat user menjalankan program, user harus menginput Nama [minimal 5 huruf], Gender (pria/wanita), Umur [minimal 13 tahun], dan lakukan validasi.
2.	(5 Point) Setelah mengisi keterangan pada no 1, user dihadapkan dengan 3 pilihan pada menu utama (Profile, Battle, Exit).
3.	(2 Point) Saat user memilih Profile, maka akan menampilkan detail profil user berdasarkan keterangan yang diisi pada no 1.
4.	(10 Point) Saat user memilih Battle, user dihadapkan dengan 4 pilihan Pokemon yang harus dipilih salah satu yaitu :
    a.	Charmander (Elemen Api)
    b.	Squirtle (Elemen Air)
    c.	Bulbasaur (Elemen Rumput)
    d.	Pikachu (Elemen Listrik)
    Masing – masing pokemon memiliki elemen skill dan kelemahannya, detailnya adalah sebagai berikut :
    -	Charmander
      1.	Health : 100
      2.	Skills Attack : (Takle = 20 SP, Burst =  30 SP, Flamethrower = 40 SP)
      3.	Weekness : Pokemon elemen Air
    
    -	Squirtle
      1.	Health : 100
      2.	Skills Attack : (Takle = 20 SP, Waterball =  30 SP, Watercanon = 40 SP)
      3.	Weekness : Pokemon elemen Listrik
    
    -	Bulbasaur
      1.	Health : 100
      2.	Skills Attack : (Takle = 20 SP, Vinewhip =  30 SP, Razorleaf = 40 SP)
      3.	Weekness : Pokemon elemen Api
    
    -	Pikachu
      1.	Health : 100
      2.	Skills Attack : (Takle = 20 SP, Vinewhip =  30 SP, Razorleaf = 40 SP)
      3.	Weekness : Pokemon elemen Rumput
    *Note : SP = Skill Point

5.	(30 Point) Ketika user sudah memilih Pokemon yang diinginkan, maka program akan memilihkan pokemon secara random sebagai enemy. Pada layar tampilkan informasi sebagai berikut :
    •	Nama Pokemon yang dipilih
    •	Seluruh Skills dan Skills Point dari pokemon yang dipilih
    •	Health Pokemon yang dipilih
    •	Pokemon enemy
    •	Health Pokemon enemy

6.	(45 Point) User diminta untuk memilih skill yang ada untuk menyerang pokemon enemy. Dimana setiap skill serangan akan mengurangi health dari pokemon enemy. Setelah itu pokemon enemy akan menyerang kembali dengan skill yang dimiliki dan dipilih secara random oleh program kepada pokemon user dan mengurangi health dari pokemon user. Dengan perhitungan health adalah sebagai berikut :
    -	Jika Pokemon User menyerang Pokemon Enemy, yang dimana Pokemon Enemy kelemahannya adalah Pokemon User, maka Health Enemy = Health Enemy – (skills point Pokemon User x 2). Lakukan perhitungan sebaliknya jika serangan dilakukan oleh Pokemon Enemy.
    
    -	Jika Pokemon User menyerang Pokemon Enemy yang dimana Pokemon yang sama, maka Health Enemy = Health Enemy – skills point Pokemon User. Lakukan perhitungan sebaliknya jika serangan dilakukan oleh Pokemon Enemy.
    Lakukan proses penyerangan pada Pokemon Enemy secara berulang dengan memilih skills yang ada sampai nilai Health dari antara Pokemon = 0. Apabila antara 2 Pokemon Healthnya bernilai 0 terlebih dahulu maka akan kembali kemenu utama dan tampilkan Pokemon pemenangnya.

7.	(1 Point) Jika User memilih menu Exit, maka user akan keluar dari program.

