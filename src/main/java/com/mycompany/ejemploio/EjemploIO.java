/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploio;

/**
 *
 * @author yisus
 */

public class EjemploIO {

    public static void main(String[] args) {
        ArchivoIO aio = new ArchivoIO();
        aio.escribir("67676 - TungTungSahur");
        aio.leer();
        aio.escribir("27838 - Mike");
        aio.eliminar("16329");
        aio.actualizar("27838","Mike Tyson");
        aio.leer();
    }
}
