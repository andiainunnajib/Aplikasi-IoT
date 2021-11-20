# Aplikasi-IoT
# [(SECURITY SYSTEM WITH RFID CONTROL USING E-KTP AND INTERNET OF THINGS (IoT)](https://github.com/andiainunnajib/Aplikasi-IoT)

Perkembangan zaman diikuti dengan perkembangan teknologi yang pesat. Dengan adanya perkembangan teknologi, dapat memberikan manfaat bagi kehidupan.
Salah satu manfaat yang dapat diberikan dengan perkembangan teknologi adalah
keamanan. Keamanan adalah hal yang perlu diperhatikan untuk menciptakan rasa
kenyamanan ketika berada di rumah atau ketika pemilik rumah meninggalkan rumah untuk bekerja atau berpergian. Penggunaan kunci konvensional masih rentan
terhadap pembobolan. Maka dibutuhkan sistem keamanan yang lebih efisien dan
praktis. Untuk mengatasi hal tersebut, maka dibutuhkan Internet of Things (IoT).
Internet of Things (IoT) adalah teknologi yang menggunakan internet sebagai media
penghubung tanpa perlu mengontrol benda secara langsung.

Pada Tugas Akhir ini, akan diusulkan penggunaan Internet of Things (IoT) dengan menggunakan sensor Radio Frequency Identification (RFID), dan buzzer sebagai penanda, solenoid sebagai pengunci pintu, E-KTP sebagai RFID tag dan juga
aplikasi yang dibuat dengan Android Studio yang terhubung dengan NodeMCU V3
ESP8266 dan firebase sebagai pengganti kunci konvesional. Apabila tedapat gerakan disekitar rumah maka sistem akan memberikan notifikasi melalui aplikasi yang
terhubung dengan sensor PIR.

# Diagram Blok

![image](https://user-images.githubusercontent.com/85381045/142727639-c661cb5b-e208-4bc2-8aec-43be8e6cf477.png)

# Gambaran hardware
![image](https://user-images.githubusercontent.com/85381045/142727793-0a1a4d30-7fbf-4b82-9b41-b844d867a815.png)

![image](https://user-images.githubusercontent.com/85381045/142727760-454ddbad-fad3-424e-9964-35621b432d2b.png)

# Tampilan aplikasi
![image](https://user-images.githubusercontent.com/85381045/142727773-32def674-a312-4ee6-86a3-bceeba2387e9.png)
![image](https://user-images.githubusercontent.com/85381045/142727781-706f3dcf-fa59-40ad-a2f3-7671ea0c6af0.png)

# Conclution
Dari hasil pengujian dan analisis menunjukan bahwa sensor PIR dapat mendeteksi gerakan di sekitar alat dan RFID dapat mendeteksi E-KTP dengan jarak
maksimum 4 cm. Penggunaan penghalang menunjukkan bahwa E-KTP sangat
dipengaruhi oleh induksi elektromagnetika, semakin tebal bahan penghalang semakin berkurang jarak pendeteksian. Pendetekasian E-KTP berpengaruh terhadap
sudut yang digunakan, semakin besar sudut pendeteksian semakin dekat jarak deteksi E-KTP. Pada aplikasi, untuk fitur lock dan open mendapatkan nilai Throughput 20700 b/s dengan indeks sangat bagus, Packet loss bernilai 0% dengan
indeks sangat bagus, Delay bernilai 63,6306 ms dengan indeks sangat bagus, dan
Jitter bernilai 63,412 ms dengan indeks bagus. Untuk fitur alert pengirim notifikasi
menghasilkan nilai rata-rata Throughput 16700 b/s, Packet loss dengan indeks sangat bagus, bernilai 0,24%, Delay dengan indeks sangat bagus, bernilai 79,074 ms,
dan jitter dengan indeks bagus, bernilai 70,664 ms.

