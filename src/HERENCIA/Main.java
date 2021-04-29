/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA;

/**
 *
 * @author familia
 */
public class Main {
    public static void main(String args[]) {
        Perro perro = new Perro(); 
        System.out.println("             PERRO");
        perro.setTamano("Pequeño");
        System.out.println(perro.getTamano());
        perro.setTipoDeReproducción("Anda en celo");
        System.out.println(perro.getTipoDeReproducción());
        perro.setDefecar("Hizo popo");
        System.out.println(perro.getDefecar());
        perro.setSonido("Ladrar");
        System.out.println(perro.getSonido()); 
        perro.setDormir("Sueño profundo");
        System.out.println(perro.getDormir());
        System.out.println("----------------------------------------");
        Lobo lobo = new Lobo();
        System.out.println("             LOBO");
        lobo.setTamano("Grande");
        System.out.println(lobo.getTamano());
        lobo.setTipoDeReproducción("Mod: Apareando");
        System.out.println(lobo.getTipoDeReproducción());
        lobo.setDefecar("Hizo popo");
        System.out.println(lobo.getDefecar());
        lobo.setSonido("Ahullar");
        System.out.println(lobo.getSonido()); 
        lobo.setDormir("Sueño ligero");
        System.out.println(lobo.getDormir());
        System.out.println("----------------------------------------");
        Gato gato = new Gato();
        System.out.println("             GATO");
        gato.setTamano("Sumo");
        System.out.println(gato.getTamano());
        gato.setTipoDeReproducción("Anda en celo");
        System.out.println(gato.getTipoDeReproducción());
        gato.setDefecar("Hizo popo en su arena");
        System.out.println(gato.getDefecar());
        gato.setSonido("Miau");
        System.out.println(gato.getSonido()); 
        gato.setDormir("Zzzzzzz y doble Zzzzz");
        System.out.println(gato.getDormir());
        System.out.println("----------------------------------------");
        Tigre tigre = new Tigre();
        System.out.println("             TIGRE");
        tigre.setTamano("Grande");
        System.out.println(tigre.getTamano());
        tigre.setTipoDeReproducción("Es poligamo");
        System.out.println(tigre.getTipoDeReproducción());
        tigre.setDefecar("Un gran regalo");
        System.out.println(tigre.getDefecar());
        tigre.setSonido("Rugido");
        System.out.println(tigre.getSonido()); 
        tigre.setDormir("Sueño relajado");
        System.out.println(tigre.getDormir());
        System.out.println("----------------------------------------");
        Aguila a = new Aguila();
        System.out.println("             AGUILA");
        a.setTamano("Grande");
        System.out.println(a.getTamano());
        a.setTipoDeReproducción("Deja unos cuantos huevos");
        System.out.println(a.getTipoDeReproducción());
        a.setDefecar("Hizo popo");
        System.out.println(a.getDefecar());
        a.setSonido("Chillido");
        System.out.println(a.getSonido()); 
        a.setDormir("Silencio absoluto al dormir");
        System.out.println(a.getDormir());
        System.out.println("----------------------------------------");
        Paloma paloma = new Paloma();
        System.out.println("             PALOMA");
        paloma.setTamano("Mediana");
        System.out.println(paloma.getTamano());
        paloma.setTipoDeReproducción("Huevos en el nido");
        System.out.println(paloma.getTipoDeReproducción());
        paloma.setDefecar("Popo liquida");
        System.out.println(paloma.getDefecar());
        paloma.setSonido("Arrullo");
        System.out.println(paloma.getSonido()); 
        paloma.setDormir("Dentro del nido");
        System.out.println(paloma.getDormir());
        System.out.println("----------------------------------------");
        Trucha t = new Trucha();
        System.out.println("             TRUCHA");
        t.setTamano("Grande, mediana o chica");
        System.out.println(t.getTamano());
        t.setTipoDeReproducción("Salmonido");
        System.out.println(t.getTipoDeReproducción());
        t.setDefecar("Defeca muy poco");
        System.out.println(t.getDefecar());
        t.setSonido("Gruñidos y golpes");
        System.out.println(t.getSonido()); 
        t.setDormir("Al dormir no cierran los ojos");
        System.out.println(t.getDormir());
        System.out.println("----------------------------------------");
        Salmon s = new Salmon();
        System.out.println("             SALMON");
        s.setTamano("Grande o chico");
        System.out.println(s.getTamano());
        s.setTipoDeReproducción("Fertilizan ovas en un nido");
        System.out.println(s.getTipoDeReproducción());
        s.setDefecar("Heces");
        System.out.println(paloma.getDefecar());
        paloma.setSonido("Gruñidos");
        System.out.println(paloma.getSonido()); 
        paloma.setDormir("Al dormir no cierran los ojos");
        System.out.println(paloma.getDormir());
        System.out.println("----------------------------------------");
    }
}
