/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstvariable;

/**
 *
 * @author march
 */
public class MyFirstVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Melakukan pembuatan variable, ada tiga tahap, diantaranya:
            1. Declaration, tipe_data nama;
               Contoh : int x;
            2. Assignment, nama = nilai;
               Contoh : x = 123;
            3. Initialization, tipe_data nama = nilai;
               Contoh : int x = 123;
        */
        
        int x = 123; // tipe data integer [primitive], lebih sering digunakan pada bilangan ril
        
        // akan menampilkan nilai variabel x yang bertipe integer
        System.out.println(x);
        
        // akan menampilkan x yang bertipe string
        System.out.println("x");
        
        /* 
            kita juga bisa untuk menggabungkan antara string dan integer pada satu perintah print
            System.out.println("tipe_data_string" + tipe_data_lain);
        */
        
        System.out.println("My number is: " + x);
        
        /*
            1. TIPE DATA LONG
            tipe data long digunakan pada angka yang jumlahnya sangat besar, seperti kecepatan cahaya
            jangan lupa dalam menulis tipe data long, diakhirannya dikasih L, contoh long x = ........L;
        */
        
        long y = 123245798799809835L; // tipe data long [primitive]
        System.out.println(y);
        
        /*
            2. TIPE DATA BYTE
            tipe data byte digunakan pada angka yang jumlahnya sangat kecil, dengan minmax = -127 to 127
        */
        
        byte z = 127; // tipe data byte [primitive]
        System.out.println(z);
        
        /*
            3. TIPE DATA FLOAT
            tipe data float digunakan pada angka yang decimal
            jangan lupa dalam menulis tipe data float, diakhirannya dikasih f, contoh float x = ...f;
        */
        
        float a = 3.14f; // tipe data float [primitive]
        System.out.println(a);
        
        /*
            4. TIPE DATA DOUBLE
            tipe data double juga digunakan pada angka yang decimal
        */
        
        double b = 3.14; // tipe data double [primitive], lebih sering digunakan pada bilangan decimal
        System.out.println(b);
        
        /*
            5. TIPE DATA BOOLEAN
            tipe data boolean hanya mengandung dua nilai, yaitu true atau false
        */
        
        boolean c = true; // tipe data boolean [primitive]
        System.out.println(c);
        
        /*
            6. TIPE DATA CHAR
            tipe data char hanya mengandung satu nilai character yang diapit oleh satu kutip
            contoh : char d = '.';
        */
        
        char symbol = '@'; // tipe data char [primitive]
        System.out.println(symbol);
        
        /*
            7. TIPE DATA STRING
            tipe data string mengandung lebih dari satu karakter, bisa berupa kata atau kalimat
            yang diapit oleh dua kutip
            contoh : String d = "..."; dan karena dia adalah reference data type jadi penulisan string, S nya harus kapital
        */
        
        String name = "Bro"; // tipe data string [reference]
        System.out.println(name);
        //atau jika ingin menggabungkan dua string bisa:
        System.out.println("Hello " +  name);
        
        //Practice time...
        /*
            How to switch variable? the solution is to create another variable that is null to store a variable value
            before it got swapped.
        */
        
        String w = "Water";
        String k = "Kool-Aid";
        
        System.out.println("Sebelum di tukar = ");
        System.out.println("w: " + w);
        System.out.println("k: " + k);
        
        // sekarang bagaimana cara kita menukar nilai di variable w ke variable k dan sebaliknya?
        // maka diperlukan pembuatan variabel temporary
        // variable ini bisa diassign seperti dibawah ini atau String temp = null;
        String temp;
        
        // kemudian kita taruh nilai variable w ke dalam variable temp:
        temp = w;
        // next step adalah dengan menaruh variable k kedalam variable w:
        w = k;
        // lalu, karena kita sudah menyimpan nilai variable w ke dalam variable temp, maka kita bisa menjadikan nilai k saat ini menjadi nilai w:
        k = temp;
        
        // maka hasilnya:
        System.out.println("Setelah di tukar = ");
        System.out.println("w: " + w);
        System.out.println("k: " + k);
        
    }
}
