# Profiling Exercise📊📉

### Screenshots:

```/all-student```
- jmeter gui
![all_student_gui](images/all-student%20jmeter.png)


- cmd
![all_student_cli](images/all-student%20cmd.png)

```/all-student-name```
- jmeter gui
![all_student_name_gui](images/all-student-name%20jmeter.png)



- cmd
![all_student_name_cli](images/all-student-name%20cmd.png)

```/highest-gpa```
- jmeter gui
![highest_gpa_gui](images/highest_gpa%20jmeter.png)



- cmd
![highest_gpa_cli](images/highest-gpa%20cmd.png)

### Optimization :

```/all-student```
![all_student](images/all-student%20after%20optimize%20cmd.png)


```/all-student-name```
![all_student_name](images/all-student-name%20after%20optimize%20cmd.png)


```highest-gpa```
![highest_gpa](images/highest-jpa%20after%20optimize%20cmd.png)

### Refleksi :
> 1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

Pengujian kinerja dengan JMeter berfokus pada simulasi beban pengguna dan pengukuran waktu respons sistem, throughput, dan penggunaan sumber daya di berbagai kondisi. Profiling dengan IntelliJ Profiler, di sisi lain, melibatkan analisis perilaku runtime aplikasi untuk mengidentifikasi bottleneck kinerja, seperti penggunaan CPU, konsumsi memori, dan waktu eksekusi metode.

> 2. How does the profiling process help you in identifying and understanding the weak points in your application?

Profiling membantu mengidentifikasi dan memahami titik lemah dengan memberikan wawasan mendetail tentang eksekusi aplikasi. Ini menyoroti metode yang intensif sumber daya, kebocoran memori, dan jalur kode yang tidak efisien, memungkinkan pengembang untuk menemukan dan mengatasi masalah kinerja tertentu.

> 3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

Ya, IntelliJ Profiler efektif dalam menganalisis dan mengidentifikasi bottleneck. Ini menawarkan alat dan visualisasi yang komprehensif yang memudahkan untuk mendeteksi masalah kinerja dan memahami akar penyebabnya.

> 4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?

Tantangan utama termasuk pengaturan skenario pengujian yang realistis, interpretasi data profiling, dan memastikan bahwa optimasi tidak memperkenalkan masalah baru. Tantangan ini dapat diatasi dengan menggunakan kombinasi alat pengujian otomatis, analisis mendalam hasil profiling, dan pengujian serta optimasi iteratif.

> 5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?

Manfaat utama termasuk wawasan mendetail tentang kinerja aplikasi, kemampuan untuk mengidentifikasi dan memperbaiki bottleneck, serta peningkatan efisiensi dan responsivitas aplikasi secara keseluruhan.

> 6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?

Dalam situasi seperti itu, penting untuk memverifikasi silang hasilnya, menganalisis perbedaannya, dan mempertimbangkan kedua perspektif. Menggabungkan wawasan dari kedua alat dapat memberikan pemahaman yang lebih komprehensif tentang masalah kinerja.

> 7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?

Strategi termasuk refactoring kode yang tidak efisien, mengoptimalkan penggunaan sumber daya, dan meningkatkan efisiensi algoritma. Untuk memastikan perubahan tidak mempengaruhi fungsionalitas, pengujian menyeluruh, termasuk unit test, integration test, dan regression test, harus dilakukan.
