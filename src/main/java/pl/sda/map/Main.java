package pl.sda.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String... args) {
        //baza produktow po eanie
        Map<String, String> eansWithProducts = new HashMap<>();

        //dodawania elementów do mapy
        eansWithProducts.put("12345", "Apple Watch");
        eansWithProducts.put("56789", "Samsung Buds");
        eansWithProducts.put("19283", "Xiaomi Redmi 4A");

        eansWithProducts.remove("19283");
        //pobieranie elementu z mapy o danym kluczu
        System.out.println(eansWithProducts.get("12345"));

        //pobieranie elementu z mapy o danym kluczu z wartoscia default, jesli nie ma
        System.out.println(eansWithProducts.getOrDefault("11111", "Brak produktu"));
        for (String key : eansWithProducts.keySet()) {
            System.out.println("Ean z bazy: " + key);
        }
        for (String value : eansWithProducts.values()) {
            System.out.println("Nazwa produktu: "+ value);
        }
        for (Map.Entry<String, String> pair : eansWithProducts.entrySet()) {
            System.out.println("Para ean produkt " + pair);
        }
    }
}
