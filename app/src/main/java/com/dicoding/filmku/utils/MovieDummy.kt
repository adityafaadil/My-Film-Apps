package com.dicoding.filmku.utils

import com.dicoding.filmku.data.Movie
import java.util.ArrayList

object MovieDummy {

    fun generateDummyMovie():List<Movie>{

        val movies = ArrayList<Movie>()

        //movie 1
        movies.add(
            Movie(
                "m1",
                "https://variety.com/wp-content/uploads/2020/10/raya.jpg?w=1000",
                "Raya and The Last Dragon",
                "Dahulu kala, di dunia fantasi Kumandra, manusia dan naga hidup bersama secara harmonis. Namun, ketika monster jahat yang dikenal sebagai Druun mengancam daratan, para naga mengorbankan diri mereka untuk menyelamatkan umat manusia. Sekarang, 500 tahun kemudian, monster yang sama telah kembali, dan seorang prajurit hadir untuk mencari naga terakhir dan menghentikan Druun untuk selamanya.",
                "Tanggal rilis: 18/07/2008"
            ))

        //movie 2
        movies.add(
            Movie(
                "m2",
                "https://www.99.co/blog/indonesia/wp-content/uploads/2020/10/film-action-lotr-return-of-king.jpeg",
                "The Lord of the Rings: The Return of the King (2003)",
                "Cerita dalam film 'The Lord of the Rings: The Return of the King' melanjutkan kisah dari film sebelumya. Frodo Baggins masih berjuang untuk menghancurkan cincin berkekuatan magis demi menyelamatkan dunia dari sang raja kegelapan Sauron. Frodo terpisah dari rombongan menuju Gunung Mordor bersama Sam.",
                "Tanggal rilis: 14/01/2003"
            ))
        //
        //movie 3
        movies.add(
            Movie(
                "m3",
                "https://variety.com/wp-content/uploads/2020/03/9-2.jpg?w=1000",
                "Morbius",
                "Morbius bercerita tentang Dr. Michael Morbius, seorang antihero Spider-Man klasik yang menjadi vampir saat berusaha menyembuhkan dirinya dari penyakit darah langka. Dibintangi oleh Jared Leto, film tersebut bakal menunjukkan beberapa koneksi dengan penjahat Spider-Man lainnya, yang mungkin mengisyaratkan persilangan besar.",
                "Tanggal rilis: 19/03/2021"
            ))

        //movie 4
        movies.add(
            Movie(
                "m4",
                "https://variety.com/wp-content/uploads/2020/03/no-time-james.jpg?w=1024",
                "No Time to Die",
                "Film yang dibintangi oleh Daniel Craig ini menceritakan kegagalan pengunduran diri James Bond di Jamaika ketika seorang teman lamanya, Felix Leiter (Jeffrey Wright), datang mencari bantuan.\n" +
                        "\n" +
                        "Nantinya Bond harus menyelesaikan misi menyelamatkan seorang ilmuwan yang diculik. Dalam proses penyelamatan itu, diketahui Bond akan bertemu dengan Safin (Rami Malek), penjahat bertopeng misterius yang dipersenjatai dengan teknologi berbahaya.",
                "Tanggal rilis: 02/04/2021"
            ))

        //movie 5
        movies.add(
            Movie(
                "m5",
                "https://variety.com/wp-content/uploads/2020/04/a-quiet-place-2.jpg?w=751",
                "A Quiet Place Part II",
                "A Quiet Place Part II akan kembali memperlihatkan sebuah keluarga yang terdiri dari Emily Blunt, Millicent Simmonds dan Noah Jupe. Dalam serial ini mereka akan tetap diam dan menghindari monster mematikan di dunia distopia. Klik halaman selanjutnya untuk melihat berbagai film lainnya.",
                "Tanggal rilis: 12/12/12"
            ))

        //movie 6
        movies.add(
            Movie(
                "m6",
                "https://variety.com/wp-content/uploads/2019/12/black-widow-trailer-2.jpg?w=1000",
                "Black Widow",
                "Dibintangi oleh Scarlett Johansson, film Marvel ini akan menceritakan kisah setelah Captain America: Civil War tahun 2016. Film ini akan memperlihatkan sosok Natasha Romanoff dalam pelarian dan dipaksa untuk menghadapi masa lalunya sebagai mata-mata, jauh sebelum dia menjadi seorang Avenger. Film ini juga dibintangi oleh David Harbour, Florence Pugh dan O-T Fagbenle.",
                "Tanggal rilis: 07/05/2021"
            ))

        //movie 7
        movies.add(
            Movie(
                "m7",
                "https://variety.com/wp-content/uploads/2019/08/cruella.jpg?w=1024",
                "Cruella",
                "Berlatar belakang punk dan mode London tahun 1970-an, film live-action Disney ini akan memperkenalkan Emma Stone sebagai Cruella de Vil yang lebih muda, penjahat ikonik dari film 101 Dalmatians tahun 1961. Film ini juga akan dibintangi oleh Emma Thompson, Joel Fry Paul, Walter Hauser dan Mark Strong.",
                "Tanggal rilis: 28/05/2021"
            ))

        //movie 8
        movies.add(
            Movie(
                "m8",
                "https://variety.com/wp-content/uploads/2020/01/fast-3.jpg?w=1024",
                "Fast & Furious 9",
                "Film aksi ini akan kembali menyoroti Dominic Toretto, yang diperankan oleh Vin Diesel. Bersama dengan kru dan anggota keluarganya, mereka bergabung untuk melawan salah satu pembunuh paling berbakat di dunia dan pembalap berperforma tinggi yang juga saudara laki-lakinya yang terasing, Jakob (John Cena).\n" +
                        "\n" +
                        "Film baru ini juga menampilkan kembalinya Han Lue, karakter favorit penggemar yang dianggap sudah lama meninggal.",
                "Tanggal rilis: 28/05/2021"
            ))

        //movie 9
        movies.add(
            Movie(
                "m9",
                "https://variety.com/wp-content/uploads/2018/08/venom-sony-pictures.jpg?w=1000",
                "Venom: Let There Be Carnage",
                "enom: Let There Be Carnage adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari tokoh Marvel Comics berjudul sama. Film ini adalah sekuel dari Venom. Pada 18 Maret, jadwal tayang film ini diundur lagi hingga 24 September 2021.",
                "Tanggal rilis: 25/06/2021"
            ))

        //movie 10
        movies.add(
            Movie(
                "m10",
                "https://variety.com/wp-content/uploads/2020/03/minions.jpg?w=1024",
                "Minion: The Rise of Gru",
                "Minions: The Rise of Gru adalah sebuah film komedi animasi komputer 3D mendatang Amerika Serikat tahun 2022 yang diproduksi oleh Illumination.",
                "Tanggal rilis: 02/07/2021"
            ))
        return  movies
    }
}