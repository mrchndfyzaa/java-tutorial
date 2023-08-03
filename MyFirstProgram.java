/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstprogram;

/**
 *
 * @author march
 */
public class MyFirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1. OUTPUT//
        
        /* 
            Shortcut -> sout + tab
            Menampilkan output di java:
            System.out.print("_string_, diisi dengan kata yang mau dioutputkan");
        */ 
        
//        System.out.print("I love Pizza");
//        System.out.print("It's really good!");
        
        /* 
            Namun, print hanya akan membuat satu baris output saja, tanpa spasi atau baris baru. 
            Jika baris diatas dijalankan, maka akan menghasilkan:
            I love PizzaIt's really good!
        
            Oleh karena itu, untuk membuat baris baru kita bisa mengganti perintah print dengan tambahan
            println -> System.out.println("...");

            atau

            dengan menggunakan escape sequence (\n)
            System.out.print("...\n")

            ada juga penggunaan escape sequence (\t) yang digunakan seperti tab pada microsoft word
            yang akan menggeser kalimat seperti pembuatan paragraf
            System.out.println("\t...")
        */
        
//        System.out.println("I love Pizza");
//        System.out.println("It's really good!");
//        System.out.print("I love Pizza\n");
//        System.out.print("It's really good!");

//        System.out.println("\tI love Pizza");
//        System.out.println("It's really good!");
          
        /*
            Jika kita ingin menampilkan quotes yang memiliki tampilan seperti "Quotes"
            maka kita bisa menggunakan backslash -> "..." = \" ... \" 
            System.out.println("\"...\"");

            dan jika kita ingin menampilkan backslash, maka kita harus menggunakan double backslash
            karena satu backslash membuat compiler mengira jika kita akan menggunakan escape sequence.
            System.out.println("\\...")

        */
        
//        System.out.println("\"I love Pizza\"");
//        System.out.println("It's really good!");
        
        System.out.println("\\I love Pizza");
        System.out.println("It's really good!");
        
        //2. COMMENT//
        
        /* 
            Comment berfungsi untuk memberikan keterangan/penjelasan singkat akan kode yang kita buat
            Comment tidak akan dieksekusi dan akan diignore oleh compiler
            Untuk satu line comment, maka kita bisa menuliskan dengan:
            //...
        
            Untuk >1 line comment maka:
            /.*
            *...
            *./
        */ 
        
        //This is a comment
        
        /*
        *This
        *is
        *comment
        */
    }
}
