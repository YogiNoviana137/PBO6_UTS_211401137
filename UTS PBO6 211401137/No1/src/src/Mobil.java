/*
 * Program java simulasi mobil remote control
 * Yogi Noviana 211401137
 */
package src;

/**
 *
 * @author ASUS
 */


class Mobil {
    private boolean hidup;
    private int kecepatan;
    private int arah;

    public Mobil() {
        this.hidup = false;
        this.kecepatan = 0;
        this.arah = 0;
    }

    public void nyalakan() {
        this.hidup = true;
        System.out.println("Mobil menyala.");
    }

    public void matikan() {
        this.hidup = false;
        this.kecepatan = 0;
        this.arah = 0;
        System.out.println("Mobil dimatikan.");
    }

    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0 || kecepatan > 100) {
            throw new IllegalArgumentException("Kecepatan harus di antara 0 dan 100.");
        }
        this.kecepatan = kecepatan;
        System.out.println("Mobil bergerak dengan kecepatan " + kecepatan + " km/jam");
    }

    public void setArah(int arah) {
        if (arah < -180 || arah > 180) {
            throw new IllegalArgumentException("Arah harus di antara -180 dan 180.");
        }
        this.arah = arah;
        System.out.println("Mobil menghadap ke arah " + arah + " derajat.");
    }

    public void maju() {
        if (!hidup) {
            throw new IllegalStateException("Mobil dimatikan.");
        }
        setArah(90);
        setKecepatan(80);
        System.out.println("Mobil bergerak maju.");
    }

    public void mundur() {
        if (!hidup) {
            throw new IllegalStateException("Mobil dimatikan.");
        }
        setArah(180);
        setKecepatan(30);
        System.out.println("Mobil bergerak mundur.");
    }

    public void belokKiri() {
        if (!hidup) {
            throw new IllegalStateException("Mobil dimatikan.");
        }
        setArah(arah - 45);
        System.out.println("Mobil belok kiri.");
    }

    public void belokKanan() {
        if (!hidup) {
            throw new IllegalStateException("Mobil dimatikan.");
        }
        setArah(arah + 45);
        System.out.println("Mobil belok kanan.");
    }

    
    /**
     * @param args the command line arguments
     */
    public class No1 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.nyalakan();
        mobil1.maju();
        mobil1.belokKanan();
        mobil1.mundur();
        mobil1.matikan();
        }
    }
} 

