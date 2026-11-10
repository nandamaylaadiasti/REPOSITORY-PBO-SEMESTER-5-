package Unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        // Menyimpan data ke dalam List menggunakan generics
        List<EksperimenModel> listEksperimen = new ArrayList<>();
        listEksperimen.add(new EksperimenModel("Logistic Regression", 0.82, 12));
        listEksperimen.add(new EksperimenModel("Random Forest", 0.91, 45));
        listEksperimen.add(new EksperimenModel("SVM", 0.87, 60));
        listEksperimen.add(new EksperimenModel("KNN", 0.79, 5));
        listEksperimen.add(new EksperimenModel("Decision Tree", 0.84, 8));

        // 1. Menampilkan jumlah eksperimen menggunakan static method
        System.out.println("Jumlah eksperimen: " + EksperimenModel.getJumlahEksperimen());

        // 2. Menampilkan daftar model yang diurutkan berdasarkan akurasi tertinggi (Comparable)
        Collections.sort(listEksperimen);
        System.out.println("Sorted by akurasi");
        listEksperimen.forEach(System.out::println);

        // 3. Menampilkan daftar model yang diurutkan berdasarkan waktu training tercepat (Comparator)
        listEksperimen.sort(new WaktuTrainingComparator());
        System.out.println("Sorted by waktu training");
        listEksperimen.forEach(System.out::println);

        // 4. Menampilkan daftar model dengan akurasi minimal 0.85 (filtering menggunakan lambda)
        System.out.println("Model dengan akurasi minimal 0.85");
        List<EksperimenModel> filteredAkurasi = listEksperimen.stream()
                .filter(e -> e.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        filteredAkurasi.forEach(System.out::println);

        // 5. Pencarian model dengan nama "KNN" menggunakan lambda (tampilkan null jika tidak ditemukan)
        System.out.println("Pencarian model KNN");
        EksperimenModel hasilCari = listEksperimen.stream()
                .filter(e -> e.getNamaModel().equalsIgnoreCase("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasilCari);
    }
}
