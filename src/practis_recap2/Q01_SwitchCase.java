package practis_recap2;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/


    public static void main(String[] args) {

        String gun = "cuma";

        switch (gun) {
            case "pazartesi":
            case "salı":
                System.out.println("Java dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("selenyum dersi gunleri");
                break;

            default:
                System.out.println("izin günü");


        }
    }
}


